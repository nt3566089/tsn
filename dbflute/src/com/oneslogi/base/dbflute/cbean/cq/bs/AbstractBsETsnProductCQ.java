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
 * The abstract condition-query of E_TSN_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETsnProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETsnProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TSN_PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_Equal(Long tsnProductId) {
        doSetTsnProductId_Equal(tsnProductId);
    }

    protected void doSetTsnProductId_Equal(Long tsnProductId) {
        regTsnProductId(CK_EQ, tsnProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_NotEqual(Long tsnProductId) {
        doSetTsnProductId_NotEqual(tsnProductId);
    }

    protected void doSetTsnProductId_NotEqual(Long tsnProductId) {
        regTsnProductId(CK_NES, tsnProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_GreaterThan(Long tsnProductId) {
        regTsnProductId(CK_GT, tsnProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_LessThan(Long tsnProductId) {
        regTsnProductId(CK_LT, tsnProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_GreaterEqual(Long tsnProductId) {
        regTsnProductId(CK_GE, tsnProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductId The value of tsnProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnProductId_LessEqual(Long tsnProductId) {
        regTsnProductId(CK_LE, tsnProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tsnProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsnProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsnProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsnProductId(), "TSN_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductIdList The collection of tsnProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnProductId_InScope(Collection<Long> tsnProductIdList) {
        doSetTsnProductId_InScope(tsnProductIdList);
    }

    protected void doSetTsnProductId_InScope(Collection<Long> tsnProductIdList) {
        regINS(CK_INS, cTL(tsnProductIdList), xgetCValueTsnProductId(), "TSN_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnProductIdList The collection of tsnProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnProductId_NotInScope(Collection<Long> tsnProductIdList) {
        doSetTsnProductId_NotInScope(tsnProductIdList);
    }

    protected void doSetTsnProductId_NotInScope(Collection<Long> tsnProductIdList) {
        regINS(CK_NINS, cTL(tsnProductIdList), xgetCValueTsnProductId(), "TSN_PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnProductId_IsNull() { regTsnProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnProductId_IsNotNull() { regTsnProductId(CK_ISNN, DOBJ); }

    protected void regTsnProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsnProductId(), "TSN_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueTsnProductId();

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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
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
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
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
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
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
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
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
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
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
     * ERROR_FLG: {NotNull, char(1), default=[(0)]} <br>
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
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
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
     * ZZMATNR: {varchar(255)}
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
     * ZZMATNR: {varchar(255)}
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
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(255)}
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
     * ZZMATNR: {varchar(255)}
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
     * ZZMATNR: {varchar(255)} <br>
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
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(255)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     */
    public void setZzmatnr_IsNull() { regZzmatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     */
    public void setZzmatnr_IsNullOrEmpty() { regZzmatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(255)}
     */
    public void setZzmatnr_IsNotNull() { regZzmatnr(CK_ISNN, DOBJ); }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_Equal(String brfnfl) {
        doSetBrfnfl_Equal(fRES(brfnfl));
    }

    protected void doSetBrfnfl_Equal(String brfnfl) {
        regBrfnfl(CK_EQ, brfnfl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_NotEqual(String brfnfl) {
        doSetBrfnfl_NotEqual(fRES(brfnfl));
    }

    protected void doSetBrfnfl_NotEqual(String brfnfl) {
        regBrfnfl(CK_NES, brfnfl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_GreaterThan(String brfnfl) {
        regBrfnfl(CK_GT, fRES(brfnfl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_LessThan(String brfnfl) {
        regBrfnfl(CK_LT, fRES(brfnfl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_GreaterEqual(String brfnfl) {
        regBrfnfl(CK_GE, fRES(brfnfl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_LessEqual(String brfnfl) {
        regBrfnfl(CK_LE, fRES(brfnfl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnflList The collection of brfnfl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_InScope(Collection<String> brfnflList) {
        doSetBrfnfl_InScope(brfnflList);
    }

    protected void doSetBrfnfl_InScope(Collection<String> brfnflList) {
        regINS(CK_INS, cTL(brfnflList), xgetCValueBrfnfl(), "BRFNFL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnflList The collection of brfnfl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_NotInScope(Collection<String> brfnflList) {
        doSetBrfnfl_NotInScope(brfnflList);
    }

    protected void doSetBrfnfl_NotInScope(Collection<String> brfnflList) {
        regINS(CK_NINS, cTL(brfnflList), xgetCValueBrfnfl(), "BRFNFL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)} <br>
     * <pre>e.g. setBrfnfl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brfnfl The value of brfnfl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrfnfl_LikeSearch(String brfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brfnfl), xgetCValueBrfnfl(), "BRFNFL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrfnfl_NotLikeSearch(String brfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brfnfl), xgetCValueBrfnfl(), "BRFNFL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_PrefixSearch(String brfnfl) {
        setBrfnfl_LikeSearch(brfnfl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNull() { regBrfnfl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNullOrEmpty() { regBrfnfl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNotNull() { regBrfnfl(CK_ISNN, DOBJ); }

    protected void regBrfnfl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrfnfl(), "BRFNFL"); }
    protected abstract ConditionValue xgetCValueBrfnfl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_Equal(String brfnhf) {
        doSetBrfnhf_Equal(fRES(brfnhf));
    }

    protected void doSetBrfnhf_Equal(String brfnhf) {
        regBrfnhf(CK_EQ, brfnhf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_NotEqual(String brfnhf) {
        doSetBrfnhf_NotEqual(fRES(brfnhf));
    }

    protected void doSetBrfnhf_NotEqual(String brfnhf) {
        regBrfnhf(CK_NES, brfnhf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_GreaterThan(String brfnhf) {
        regBrfnhf(CK_GT, fRES(brfnhf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_LessThan(String brfnhf) {
        regBrfnhf(CK_LT, fRES(brfnhf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_GreaterEqual(String brfnhf) {
        regBrfnhf(CK_GE, fRES(brfnhf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_LessEqual(String brfnhf) {
        regBrfnhf(CK_LE, fRES(brfnhf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhfList The collection of brfnhf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_InScope(Collection<String> brfnhfList) {
        doSetBrfnhf_InScope(brfnhfList);
    }

    protected void doSetBrfnhf_InScope(Collection<String> brfnhfList) {
        regINS(CK_INS, cTL(brfnhfList), xgetCValueBrfnhf(), "BRFNHF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhfList The collection of brfnhf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_NotInScope(Collection<String> brfnhfList) {
        doSetBrfnhf_NotInScope(brfnhfList);
    }

    protected void doSetBrfnhf_NotInScope(Collection<String> brfnhfList) {
        regINS(CK_NINS, cTL(brfnhfList), xgetCValueBrfnhf(), "BRFNHF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)} <br>
     * <pre>e.g. setBrfnhf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brfnhf The value of brfnhf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrfnhf_LikeSearch(String brfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brfnhf), xgetCValueBrfnhf(), "BRFNHF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrfnhf_NotLikeSearch(String brfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brfnhf), xgetCValueBrfnhf(), "BRFNHF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_PrefixSearch(String brfnhf) {
        setBrfnhf_LikeSearch(brfnhf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNull() { regBrfnhf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNullOrEmpty() { regBrfnhf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNotNull() { regBrfnhf(CK_ISNN, DOBJ); }

    protected void regBrfnhf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrfnhf(), "BRFNHF"); }
    protected abstract ConditionValue xgetCValueBrfnhf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_Equal(String branfl) {
        doSetBranfl_Equal(fRES(branfl));
    }

    protected void doSetBranfl_Equal(String branfl) {
        regBranfl(CK_EQ, branfl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_NotEqual(String branfl) {
        doSetBranfl_NotEqual(fRES(branfl));
    }

    protected void doSetBranfl_NotEqual(String branfl) {
        regBranfl(CK_NES, branfl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_GreaterThan(String branfl) {
        regBranfl(CK_GT, fRES(branfl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_LessThan(String branfl) {
        regBranfl(CK_LT, fRES(branfl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_GreaterEqual(String branfl) {
        regBranfl(CK_GE, fRES(branfl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_LessEqual(String branfl) {
        regBranfl(CK_LE, fRES(branfl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branflList The collection of branfl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_InScope(Collection<String> branflList) {
        doSetBranfl_InScope(branflList);
    }

    protected void doSetBranfl_InScope(Collection<String> branflList) {
        regINS(CK_INS, cTL(branflList), xgetCValueBranfl(), "BRANFL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branflList The collection of branfl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_NotInScope(Collection<String> branflList) {
        doSetBranfl_NotInScope(branflList);
    }

    protected void doSetBranfl_NotInScope(Collection<String> branflList) {
        regINS(CK_NINS, cTL(branflList), xgetCValueBranfl(), "BRANFL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)} <br>
     * <pre>e.g. setBranfl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param branfl The value of branfl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranfl_LikeSearch(String branfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(branfl), xgetCValueBranfl(), "BRANFL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBranfl_NotLikeSearch(String branfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(branfl), xgetCValueBranfl(), "BRANFL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_PrefixSearch(String branfl) {
        setBranfl_LikeSearch(branfl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNull() { regBranfl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNullOrEmpty() { regBranfl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNotNull() { regBranfl(CK_ISNN, DOBJ); }

    protected void regBranfl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBranfl(), "BRANFL"); }
    protected abstract ConditionValue xgetCValueBranfl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_Equal(String branhf) {
        doSetBranhf_Equal(fRES(branhf));
    }

    protected void doSetBranhf_Equal(String branhf) {
        regBranhf(CK_EQ, branhf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_NotEqual(String branhf) {
        doSetBranhf_NotEqual(fRES(branhf));
    }

    protected void doSetBranhf_NotEqual(String branhf) {
        regBranhf(CK_NES, branhf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_GreaterThan(String branhf) {
        regBranhf(CK_GT, fRES(branhf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_LessThan(String branhf) {
        regBranhf(CK_LT, fRES(branhf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_GreaterEqual(String branhf) {
        regBranhf(CK_GE, fRES(branhf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_LessEqual(String branhf) {
        regBranhf(CK_LE, fRES(branhf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhfList The collection of branhf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_InScope(Collection<String> branhfList) {
        doSetBranhf_InScope(branhfList);
    }

    protected void doSetBranhf_InScope(Collection<String> branhfList) {
        regINS(CK_INS, cTL(branhfList), xgetCValueBranhf(), "BRANHF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhfList The collection of branhf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_NotInScope(Collection<String> branhfList) {
        doSetBranhf_NotInScope(branhfList);
    }

    protected void doSetBranhf_NotInScope(Collection<String> branhfList) {
        regINS(CK_NINS, cTL(branhfList), xgetCValueBranhf(), "BRANHF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)} <br>
     * <pre>e.g. setBranhf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param branhf The value of branhf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranhf_LikeSearch(String branhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(branhf), xgetCValueBranhf(), "BRANHF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBranhf_NotLikeSearch(String branhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(branhf), xgetCValueBranhf(), "BRANHF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_PrefixSearch(String branhf) {
        setBranhf_LikeSearch(branhf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNull() { regBranhf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNullOrEmpty() { regBranhf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNotNull() { regBranhf(CK_ISNN, DOBJ); }

    protected void regBranhf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBranhf(), "BRANHF"); }
    protected abstract ConditionValue xgetCValueBranhf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_Equal(String sobrfnfl) {
        doSetSobrfnfl_Equal(fRES(sobrfnfl));
    }

    protected void doSetSobrfnfl_Equal(String sobrfnfl) {
        regSobrfnfl(CK_EQ, sobrfnfl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_NotEqual(String sobrfnfl) {
        doSetSobrfnfl_NotEqual(fRES(sobrfnfl));
    }

    protected void doSetSobrfnfl_NotEqual(String sobrfnfl) {
        regSobrfnfl(CK_NES, sobrfnfl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_GreaterThan(String sobrfnfl) {
        regSobrfnfl(CK_GT, fRES(sobrfnfl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_LessThan(String sobrfnfl) {
        regSobrfnfl(CK_LT, fRES(sobrfnfl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_GreaterEqual(String sobrfnfl) {
        regSobrfnfl(CK_GE, fRES(sobrfnfl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_LessEqual(String sobrfnfl) {
        regSobrfnfl(CK_LE, fRES(sobrfnfl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnflList The collection of sobrfnfl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_InScope(Collection<String> sobrfnflList) {
        doSetSobrfnfl_InScope(sobrfnflList);
    }

    protected void doSetSobrfnfl_InScope(Collection<String> sobrfnflList) {
        regINS(CK_INS, cTL(sobrfnflList), xgetCValueSobrfnfl(), "SOBRFNFL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnflList The collection of sobrfnfl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_NotInScope(Collection<String> sobrfnflList) {
        doSetSobrfnfl_NotInScope(sobrfnflList);
    }

    protected void doSetSobrfnfl_NotInScope(Collection<String> sobrfnflList) {
        regINS(CK_NINS, cTL(sobrfnflList), xgetCValueSobrfnfl(), "SOBRFNFL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNFL: {varchar(255)} <br>
     * <pre>e.g. setSobrfnfl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sobrfnfl The value of sobrfnfl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSobrfnfl_LikeSearch(String sobrfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sobrfnfl), xgetCValueSobrfnfl(), "SOBRFNFL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSobrfnfl_NotLikeSearch(String sobrfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sobrfnfl), xgetCValueSobrfnfl(), "SOBRFNFL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     * @param sobrfnfl The value of sobrfnfl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnfl_PrefixSearch(String sobrfnfl) {
        setSobrfnfl_LikeSearch(sobrfnfl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     */
    public void setSobrfnfl_IsNull() { regSobrfnfl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     */
    public void setSobrfnfl_IsNullOrEmpty() { regSobrfnfl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOBRFNFL: {varchar(255)}
     */
    public void setSobrfnfl_IsNotNull() { regSobrfnfl(CK_ISNN, DOBJ); }

    protected void regSobrfnfl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSobrfnfl(), "SOBRFNFL"); }
    protected abstract ConditionValue xgetCValueSobrfnfl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_Equal(String sobrfnhf) {
        doSetSobrfnhf_Equal(fRES(sobrfnhf));
    }

    protected void doSetSobrfnhf_Equal(String sobrfnhf) {
        regSobrfnhf(CK_EQ, sobrfnhf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_NotEqual(String sobrfnhf) {
        doSetSobrfnhf_NotEqual(fRES(sobrfnhf));
    }

    protected void doSetSobrfnhf_NotEqual(String sobrfnhf) {
        regSobrfnhf(CK_NES, sobrfnhf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_GreaterThan(String sobrfnhf) {
        regSobrfnhf(CK_GT, fRES(sobrfnhf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_LessThan(String sobrfnhf) {
        regSobrfnhf(CK_LT, fRES(sobrfnhf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_GreaterEqual(String sobrfnhf) {
        regSobrfnhf(CK_GE, fRES(sobrfnhf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_LessEqual(String sobrfnhf) {
        regSobrfnhf(CK_LE, fRES(sobrfnhf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhfList The collection of sobrfnhf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_InScope(Collection<String> sobrfnhfList) {
        doSetSobrfnhf_InScope(sobrfnhfList);
    }

    protected void doSetSobrfnhf_InScope(Collection<String> sobrfnhfList) {
        regINS(CK_INS, cTL(sobrfnhfList), xgetCValueSobrfnhf(), "SOBRFNHF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhfList The collection of sobrfnhf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_NotInScope(Collection<String> sobrfnhfList) {
        doSetSobrfnhf_NotInScope(sobrfnhfList);
    }

    protected void doSetSobrfnhf_NotInScope(Collection<String> sobrfnhfList) {
        regINS(CK_NINS, cTL(sobrfnhfList), xgetCValueSobrfnhf(), "SOBRFNHF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNHF: {varchar(255)} <br>
     * <pre>e.g. setSobrfnhf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sobrfnhf The value of sobrfnhf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSobrfnhf_LikeSearch(String sobrfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sobrfnhf), xgetCValueSobrfnhf(), "SOBRFNHF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSobrfnhf_NotLikeSearch(String sobrfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sobrfnhf), xgetCValueSobrfnhf(), "SOBRFNHF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     * @param sobrfnhf The value of sobrfnhf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobrfnhf_PrefixSearch(String sobrfnhf) {
        setSobrfnhf_LikeSearch(sobrfnhf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     */
    public void setSobrfnhf_IsNull() { regSobrfnhf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     */
    public void setSobrfnhf_IsNullOrEmpty() { regSobrfnhf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOBRFNHF: {varchar(255)}
     */
    public void setSobrfnhf_IsNotNull() { regSobrfnhf(CK_ISNN, DOBJ); }

    protected void regSobrfnhf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSobrfnhf(), "SOBRFNHF"); }
    protected abstract ConditionValue xgetCValueSobrfnhf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_Equal(String brkname) {
        doSetBrkname_Equal(fRES(brkname));
    }

    protected void doSetBrkname_Equal(String brkname) {
        regBrkname(CK_EQ, brkname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_NotEqual(String brkname) {
        doSetBrkname_NotEqual(fRES(brkname));
    }

    protected void doSetBrkname_NotEqual(String brkname) {
        regBrkname(CK_NES, brkname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_GreaterThan(String brkname) {
        regBrkname(CK_GT, fRES(brkname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_LessThan(String brkname) {
        regBrkname(CK_LT, fRES(brkname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_GreaterEqual(String brkname) {
        regBrkname(CK_GE, fRES(brkname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_LessEqual(String brkname) {
        regBrkname(CK_LE, fRES(brkname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brknameList The collection of brkname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_InScope(Collection<String> brknameList) {
        doSetBrkname_InScope(brknameList);
    }

    protected void doSetBrkname_InScope(Collection<String> brknameList) {
        regINS(CK_INS, cTL(brknameList), xgetCValueBrkname(), "BRKNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brknameList The collection of brkname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_NotInScope(Collection<String> brknameList) {
        doSetBrkname_NotInScope(brknameList);
    }

    protected void doSetBrkname_NotInScope(Collection<String> brknameList) {
        regINS(CK_NINS, cTL(brknameList), xgetCValueBrkname(), "BRKNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKNAME: {varchar(255)} <br>
     * <pre>e.g. setBrkname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brkname The value of brkname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrkname_LikeSearch(String brkname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brkname), xgetCValueBrkname(), "BRKNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrkname_NotLikeSearch(String brkname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brkname), xgetCValueBrkname(), "BRKNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKNAME: {varchar(255)}
     * @param brkname The value of brkname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkname_PrefixSearch(String brkname) {
        setBrkname_LikeSearch(brkname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     */
    public void setBrkname_IsNull() { regBrkname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     */
    public void setBrkname_IsNullOrEmpty() { regBrkname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRKNAME: {varchar(255)}
     */
    public void setBrkname_IsNotNull() { regBrkname(CK_ISNN, DOBJ); }

    protected void regBrkname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrkname(), "BRKNAME"); }
    protected abstract ConditionValue xgetCValueBrkname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_Equal(String cggdid) {
        doSetCggdid_Equal(fRES(cggdid));
    }

    protected void doSetCggdid_Equal(String cggdid) {
        regCggdid(CK_EQ, cggdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotEqual(String cggdid) {
        doSetCggdid_NotEqual(fRES(cggdid));
    }

    protected void doSetCggdid_NotEqual(String cggdid) {
        regCggdid(CK_NES, cggdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterThan(String cggdid) {
        regCggdid(CK_GT, fRES(cggdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessThan(String cggdid) {
        regCggdid(CK_LT, fRES(cggdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterEqual(String cggdid) {
        regCggdid(CK_GE, fRES(cggdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessEqual(String cggdid) {
        regCggdid(CK_LE, fRES(cggdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdidList The collection of cggdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_InScope(Collection<String> cggdidList) {
        doSetCggdid_InScope(cggdidList);
    }

    protected void doSetCggdid_InScope(Collection<String> cggdidList) {
        regINS(CK_INS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdidList The collection of cggdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotInScope(Collection<String> cggdidList) {
        doSetCggdid_NotInScope(cggdidList);
    }

    protected void doSetCggdid_NotInScope(Collection<String> cggdidList) {
        regINS(CK_NINS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(255)} <br>
     * <pre>e.g. setCggdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cggdid The value of cggdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCggdid_LikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCggdid_NotLikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(255)}
     * @param cggdid The value of cggdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_PrefixSearch(String cggdid) {
        setCggdid_LikeSearch(cggdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     */
    public void setCggdid_IsNull() { regCggdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     */
    public void setCggdid_IsNullOrEmpty() { regCggdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(255)}
     */
    public void setCggdid_IsNotNull() { regCggdid(CK_ISNN, DOBJ); }

    protected void regCggdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCggdid(), "CGGDID"); }
    protected abstract ConditionValue xgetCValueCggdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_Equal(String zzdevcid) {
        doSetZzdevcid_Equal(fRES(zzdevcid));
    }

    protected void doSetZzdevcid_Equal(String zzdevcid) {
        regZzdevcid(CK_EQ, zzdevcid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_NotEqual(String zzdevcid) {
        doSetZzdevcid_NotEqual(fRES(zzdevcid));
    }

    protected void doSetZzdevcid_NotEqual(String zzdevcid) {
        regZzdevcid(CK_NES, zzdevcid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_GreaterThan(String zzdevcid) {
        regZzdevcid(CK_GT, fRES(zzdevcid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_LessThan(String zzdevcid) {
        regZzdevcid(CK_LT, fRES(zzdevcid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_GreaterEqual(String zzdevcid) {
        regZzdevcid(CK_GE, fRES(zzdevcid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_LessEqual(String zzdevcid) {
        regZzdevcid(CK_LE, fRES(zzdevcid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcidList The collection of zzdevcid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_InScope(Collection<String> zzdevcidList) {
        doSetZzdevcid_InScope(zzdevcidList);
    }

    protected void doSetZzdevcid_InScope(Collection<String> zzdevcidList) {
        regINS(CK_INS, cTL(zzdevcidList), xgetCValueZzdevcid(), "ZZDEVCID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcidList The collection of zzdevcid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_NotInScope(Collection<String> zzdevcidList) {
        doSetZzdevcid_NotInScope(zzdevcidList);
    }

    protected void doSetZzdevcid_NotInScope(Collection<String> zzdevcidList) {
        regINS(CK_NINS, cTL(zzdevcidList), xgetCValueZzdevcid(), "ZZDEVCID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZDEVCID: {varchar(255)} <br>
     * <pre>e.g. setZzdevcid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzdevcid The value of zzdevcid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzdevcid_LikeSearch(String zzdevcid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzdevcid), xgetCValueZzdevcid(), "ZZDEVCID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzdevcid_NotLikeSearch(String zzdevcid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzdevcid), xgetCValueZzdevcid(), "ZZDEVCID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     * @param zzdevcid The value of zzdevcid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzdevcid_PrefixSearch(String zzdevcid) {
        setZzdevcid_LikeSearch(zzdevcid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     */
    public void setZzdevcid_IsNull() { regZzdevcid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     */
    public void setZzdevcid_IsNullOrEmpty() { regZzdevcid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZDEVCID: {varchar(255)}
     */
    public void setZzdevcid_IsNotNull() { regZzdevcid(CK_ISNN, DOBJ); }

    protected void regZzdevcid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzdevcid(), "ZZDEVCID"); }
    protected abstract ConditionValue xgetCValueZzdevcid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_Equal(String usid) {
        doSetUsid_Equal(fRES(usid));
    }

    protected void doSetUsid_Equal(String usid) {
        regUsid(CK_EQ, usid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_NotEqual(String usid) {
        doSetUsid_NotEqual(fRES(usid));
    }

    protected void doSetUsid_NotEqual(String usid) {
        regUsid(CK_NES, usid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_GreaterThan(String usid) {
        regUsid(CK_GT, fRES(usid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_LessThan(String usid) {
        regUsid(CK_LT, fRES(usid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_GreaterEqual(String usid) {
        regUsid(CK_GE, fRES(usid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_LessEqual(String usid) {
        regUsid(CK_LE, fRES(usid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USID: {varchar(255)}
     * @param usidList The collection of usid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_InScope(Collection<String> usidList) {
        doSetUsid_InScope(usidList);
    }

    protected void doSetUsid_InScope(Collection<String> usidList) {
        regINS(CK_INS, cTL(usidList), xgetCValueUsid(), "USID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USID: {varchar(255)}
     * @param usidList The collection of usid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_NotInScope(Collection<String> usidList) {
        doSetUsid_NotInScope(usidList);
    }

    protected void doSetUsid_NotInScope(Collection<String> usidList) {
        regINS(CK_NINS, cTL(usidList), xgetCValueUsid(), "USID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USID: {varchar(255)} <br>
     * <pre>e.g. setUsid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usid The value of usid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsid_LikeSearch(String usid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usid), xgetCValueUsid(), "USID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsid_NotLikeSearch(String usid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usid), xgetCValueUsid(), "USID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USID: {varchar(255)}
     * @param usid The value of usid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsid_PrefixSearch(String usid) {
        setUsid_LikeSearch(usid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     */
    public void setUsid_IsNull() { regUsid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     */
    public void setUsid_IsNullOrEmpty() { regUsid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USID: {varchar(255)}
     */
    public void setUsid_IsNotNull() { regUsid(CK_ISNN, DOBJ); }

    protected void regUsid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsid(), "USID"); }
    protected abstract ConditionValue xgetCValueUsid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_Equal(String cgrid) {
        doSetCgrid_Equal(fRES(cgrid));
    }

    protected void doSetCgrid_Equal(String cgrid) {
        regCgrid(CK_EQ, cgrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_NotEqual(String cgrid) {
        doSetCgrid_NotEqual(fRES(cgrid));
    }

    protected void doSetCgrid_NotEqual(String cgrid) {
        regCgrid(CK_NES, cgrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_GreaterThan(String cgrid) {
        regCgrid(CK_GT, fRES(cgrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_LessThan(String cgrid) {
        regCgrid(CK_LT, fRES(cgrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_GreaterEqual(String cgrid) {
        regCgrid(CK_GE, fRES(cgrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_LessEqual(String cgrid) {
        regCgrid(CK_LE, fRES(cgrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgridList The collection of cgrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_InScope(Collection<String> cgridList) {
        doSetCgrid_InScope(cgridList);
    }

    protected void doSetCgrid_InScope(Collection<String> cgridList) {
        regINS(CK_INS, cTL(cgridList), xgetCValueCgrid(), "CGRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgridList The collection of cgrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_NotInScope(Collection<String> cgridList) {
        doSetCgrid_NotInScope(cgridList);
    }

    protected void doSetCgrid_NotInScope(Collection<String> cgridList) {
        regINS(CK_NINS, cTL(cgridList), xgetCValueCgrid(), "CGRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGRID: {varchar(255)} <br>
     * <pre>e.g. setCgrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cgrid The value of cgrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCgrid_LikeSearch(String cgrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cgrid), xgetCValueCgrid(), "CGRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCgrid_NotLikeSearch(String cgrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cgrid), xgetCValueCgrid(), "CGRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGRID: {varchar(255)}
     * @param cgrid The value of cgrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgrid_PrefixSearch(String cgrid) {
        setCgrid_LikeSearch(cgrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     */
    public void setCgrid_IsNull() { regCgrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     */
    public void setCgrid_IsNullOrEmpty() { regCgrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGRID: {varchar(255)}
     */
    public void setCgrid_IsNotNull() { regCgrid(CK_ISNN, DOBJ); }

    protected void regCgrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCgrid(), "CGRID"); }
    protected abstract ConditionValue xgetCValueCgrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_Equal(String cbcccvce) {
        doSetCbcccvce_Equal(fRES(cbcccvce));
    }

    protected void doSetCbcccvce_Equal(String cbcccvce) {
        regCbcccvce(CK_EQ, cbcccvce);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_NotEqual(String cbcccvce) {
        doSetCbcccvce_NotEqual(fRES(cbcccvce));
    }

    protected void doSetCbcccvce_NotEqual(String cbcccvce) {
        regCbcccvce(CK_NES, cbcccvce);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_GreaterThan(String cbcccvce) {
        regCbcccvce(CK_GT, fRES(cbcccvce));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_LessThan(String cbcccvce) {
        regCbcccvce(CK_LT, fRES(cbcccvce));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_GreaterEqual(String cbcccvce) {
        regCbcccvce(CK_GE, fRES(cbcccvce));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_LessEqual(String cbcccvce) {
        regCbcccvce(CK_LE, fRES(cbcccvce));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvceList The collection of cbcccvce as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_InScope(Collection<String> cbcccvceList) {
        doSetCbcccvce_InScope(cbcccvceList);
    }

    protected void doSetCbcccvce_InScope(Collection<String> cbcccvceList) {
        regINS(CK_INS, cTL(cbcccvceList), xgetCValueCbcccvce(), "CBCCCVCE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvceList The collection of cbcccvce as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_NotInScope(Collection<String> cbcccvceList) {
        doSetCbcccvce_NotInScope(cbcccvceList);
    }

    protected void doSetCbcccvce_NotInScope(Collection<String> cbcccvceList) {
        regINS(CK_NINS, cTL(cbcccvceList), xgetCValueCbcccvce(), "CBCCCVCE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCCCVCE: {varchar(255)} <br>
     * <pre>e.g. setCbcccvce_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbcccvce The value of cbcccvce as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbcccvce_LikeSearch(String cbcccvce, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbcccvce), xgetCValueCbcccvce(), "CBCCCVCE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbcccvce_NotLikeSearch(String cbcccvce, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbcccvce), xgetCValueCbcccvce(), "CBCCCVCE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     * @param cbcccvce The value of cbcccvce as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcccvce_PrefixSearch(String cbcccvce) {
        setCbcccvce_LikeSearch(cbcccvce, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     */
    public void setCbcccvce_IsNull() { regCbcccvce(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     */
    public void setCbcccvce_IsNullOrEmpty() { regCbcccvce(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBCCCVCE: {varchar(255)}
     */
    public void setCbcccvce_IsNotNull() { regCbcccvce(CK_ISNN, DOBJ); }

    protected void regCbcccvce(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbcccvce(), "CBCCCVCE"); }
    protected abstract ConditionValue xgetCValueCbcccvce();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_Equal(String sfcbqa) {
        doSetSfcbqa_Equal(fRES(sfcbqa));
    }

    protected void doSetSfcbqa_Equal(String sfcbqa) {
        regSfcbqa(CK_EQ, sfcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_NotEqual(String sfcbqa) {
        doSetSfcbqa_NotEqual(fRES(sfcbqa));
    }

    protected void doSetSfcbqa_NotEqual(String sfcbqa) {
        regSfcbqa(CK_NES, sfcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_GreaterThan(String sfcbqa) {
        regSfcbqa(CK_GT, fRES(sfcbqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_LessThan(String sfcbqa) {
        regSfcbqa(CK_LT, fRES(sfcbqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_GreaterEqual(String sfcbqa) {
        regSfcbqa(CK_GE, fRES(sfcbqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_LessEqual(String sfcbqa) {
        regSfcbqa(CK_LE, fRES(sfcbqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqaList The collection of sfcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_InScope(Collection<String> sfcbqaList) {
        doSetSfcbqa_InScope(sfcbqaList);
    }

    protected void doSetSfcbqa_InScope(Collection<String> sfcbqaList) {
        regINS(CK_INS, cTL(sfcbqaList), xgetCValueSfcbqa(), "SFCBQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqaList The collection of sfcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_NotInScope(Collection<String> sfcbqaList) {
        doSetSfcbqa_NotInScope(sfcbqaList);
    }

    protected void doSetSfcbqa_NotInScope(Collection<String> sfcbqaList) {
        regINS(CK_NINS, cTL(sfcbqaList), xgetCValueSfcbqa(), "SFCBQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCBQA: {varchar(255)} <br>
     * <pre>e.g. setSfcbqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sfcbqa The value of sfcbqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSfcbqa_LikeSearch(String sfcbqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sfcbqa), xgetCValueSfcbqa(), "SFCBQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSfcbqa_NotLikeSearch(String sfcbqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sfcbqa), xgetCValueSfcbqa(), "SFCBQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFCBQA: {varchar(255)}
     * @param sfcbqa The value of sfcbqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSfcbqa_PrefixSearch(String sfcbqa) {
        setSfcbqa_LikeSearch(sfcbqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     */
    public void setSfcbqa_IsNull() { regSfcbqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     */
    public void setSfcbqa_IsNullOrEmpty() { regSfcbqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFCBQA: {varchar(255)}
     */
    public void setSfcbqa_IsNotNull() { regSfcbqa(CK_ISNN, DOBJ); }

    protected void regSfcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSfcbqa(), "SFCBQA"); }
    protected abstract ConditionValue xgetCValueSfcbqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_Equal(String ctnum) {
        doSetCtnum_Equal(fRES(ctnum));
    }

    protected void doSetCtnum_Equal(String ctnum) {
        regCtnum(CK_EQ, ctnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_NotEqual(String ctnum) {
        doSetCtnum_NotEqual(fRES(ctnum));
    }

    protected void doSetCtnum_NotEqual(String ctnum) {
        regCtnum(CK_NES, ctnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_GreaterThan(String ctnum) {
        regCtnum(CK_GT, fRES(ctnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_LessThan(String ctnum) {
        regCtnum(CK_LT, fRES(ctnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_GreaterEqual(String ctnum) {
        regCtnum(CK_GE, fRES(ctnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_LessEqual(String ctnum) {
        regCtnum(CK_LE, fRES(ctnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnumList The collection of ctnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_InScope(Collection<String> ctnumList) {
        doSetCtnum_InScope(ctnumList);
    }

    protected void doSetCtnum_InScope(Collection<String> ctnumList) {
        regINS(CK_INS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnumList The collection of ctnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_NotInScope(Collection<String> ctnumList) {
        doSetCtnum_NotInScope(ctnumList);
    }

    protected void doSetCtnum_NotInScope(Collection<String> ctnumList) {
        regINS(CK_NINS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTNUM: {varchar(255)} <br>
     * <pre>e.g. setCtnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctnum The value of ctnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtnum_LikeSearch(String ctnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctnum), xgetCValueCtnum(), "CTNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtnum_NotLikeSearch(String ctnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctnum), xgetCValueCtnum(), "CTNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTNUM: {varchar(255)}
     * @param ctnum The value of ctnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_PrefixSearch(String ctnum) {
        setCtnum_LikeSearch(ctnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     */
    public void setCtnum_IsNull() { regCtnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     */
    public void setCtnum_IsNullOrEmpty() { regCtnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTNUM: {varchar(255)}
     */
    public void setCtnum_IsNotNull() { regCtnum(CK_ISNN, DOBJ); }

    protected void regCtnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtnum(), "CTNUM"); }
    protected abstract ConditionValue xgetCValueCtnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_Equal(String cbnum) {
        doSetCbnum_Equal(fRES(cbnum));
    }

    protected void doSetCbnum_Equal(String cbnum) {
        regCbnum(CK_EQ, cbnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_NotEqual(String cbnum) {
        doSetCbnum_NotEqual(fRES(cbnum));
    }

    protected void doSetCbnum_NotEqual(String cbnum) {
        regCbnum(CK_NES, cbnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_GreaterThan(String cbnum) {
        regCbnum(CK_GT, fRES(cbnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_LessThan(String cbnum) {
        regCbnum(CK_LT, fRES(cbnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_GreaterEqual(String cbnum) {
        regCbnum(CK_GE, fRES(cbnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_LessEqual(String cbnum) {
        regCbnum(CK_LE, fRES(cbnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnumList The collection of cbnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_InScope(Collection<String> cbnumList) {
        doSetCbnum_InScope(cbnumList);
    }

    protected void doSetCbnum_InScope(Collection<String> cbnumList) {
        regINS(CK_INS, cTL(cbnumList), xgetCValueCbnum(), "CBNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnumList The collection of cbnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_NotInScope(Collection<String> cbnumList) {
        doSetCbnum_NotInScope(cbnumList);
    }

    protected void doSetCbnum_NotInScope(Collection<String> cbnumList) {
        regINS(CK_NINS, cTL(cbnumList), xgetCValueCbnum(), "CBNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBNUM: {varchar(255)} <br>
     * <pre>e.g. setCbnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbnum The value of cbnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbnum_LikeSearch(String cbnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbnum), xgetCValueCbnum(), "CBNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbnum_NotLikeSearch(String cbnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbnum), xgetCValueCbnum(), "CBNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBNUM: {varchar(255)}
     * @param cbnum The value of cbnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbnum_PrefixSearch(String cbnum) {
        setCbnum_LikeSearch(cbnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     */
    public void setCbnum_IsNull() { regCbnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     */
    public void setCbnum_IsNullOrEmpty() { regCbnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBNUM: {varchar(255)}
     */
    public void setCbnum_IsNotNull() { regCbnum(CK_ISNN, DOBJ); }

    protected void regCbnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbnum(), "CBNUM"); }
    protected abstract ConditionValue xgetCValueCbnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_Equal(String patcbqa) {
        doSetPatcbqa_Equal(fRES(patcbqa));
    }

    protected void doSetPatcbqa_Equal(String patcbqa) {
        regPatcbqa(CK_EQ, patcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_NotEqual(String patcbqa) {
        doSetPatcbqa_NotEqual(fRES(patcbqa));
    }

    protected void doSetPatcbqa_NotEqual(String patcbqa) {
        regPatcbqa(CK_NES, patcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_GreaterThan(String patcbqa) {
        regPatcbqa(CK_GT, fRES(patcbqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_LessThan(String patcbqa) {
        regPatcbqa(CK_LT, fRES(patcbqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_GreaterEqual(String patcbqa) {
        regPatcbqa(CK_GE, fRES(patcbqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_LessEqual(String patcbqa) {
        regPatcbqa(CK_LE, fRES(patcbqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqaList The collection of patcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_InScope(Collection<String> patcbqaList) {
        doSetPatcbqa_InScope(patcbqaList);
    }

    protected void doSetPatcbqa_InScope(Collection<String> patcbqaList) {
        regINS(CK_INS, cTL(patcbqaList), xgetCValuePatcbqa(), "PATCBQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqaList The collection of patcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_NotInScope(Collection<String> patcbqaList) {
        doSetPatcbqa_NotInScope(patcbqaList);
    }

    protected void doSetPatcbqa_NotInScope(Collection<String> patcbqaList) {
        regINS(CK_NINS, cTL(patcbqaList), xgetCValuePatcbqa(), "PATCBQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATCBQA: {varchar(255)} <br>
     * <pre>e.g. setPatcbqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param patcbqa The value of patcbqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatcbqa_LikeSearch(String patcbqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(patcbqa), xgetCValuePatcbqa(), "PATCBQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPatcbqa_NotLikeSearch(String patcbqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(patcbqa), xgetCValuePatcbqa(), "PATCBQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATCBQA: {varchar(255)}
     * @param patcbqa The value of patcbqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_PrefixSearch(String patcbqa) {
        setPatcbqa_LikeSearch(patcbqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     */
    public void setPatcbqa_IsNull() { regPatcbqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     */
    public void setPatcbqa_IsNullOrEmpty() { regPatcbqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PATCBQA: {varchar(255)}
     */
    public void setPatcbqa_IsNotNull() { regPatcbqa(CK_ISNN, DOBJ); }

    protected void regPatcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePatcbqa(), "PATCBQA"); }
    protected abstract ConditionValue xgetCValuePatcbqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_Equal(String zzseffid) {
        doSetZzseffid_Equal(fRES(zzseffid));
    }

    protected void doSetZzseffid_Equal(String zzseffid) {
        regZzseffid(CK_EQ, zzseffid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_NotEqual(String zzseffid) {
        doSetZzseffid_NotEqual(fRES(zzseffid));
    }

    protected void doSetZzseffid_NotEqual(String zzseffid) {
        regZzseffid(CK_NES, zzseffid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_GreaterThan(String zzseffid) {
        regZzseffid(CK_GT, fRES(zzseffid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_LessThan(String zzseffid) {
        regZzseffid(CK_LT, fRES(zzseffid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_GreaterEqual(String zzseffid) {
        regZzseffid(CK_GE, fRES(zzseffid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_LessEqual(String zzseffid) {
        regZzseffid(CK_LE, fRES(zzseffid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffidList The collection of zzseffid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_InScope(Collection<String> zzseffidList) {
        doSetZzseffid_InScope(zzseffidList);
    }

    protected void doSetZzseffid_InScope(Collection<String> zzseffidList) {
        regINS(CK_INS, cTL(zzseffidList), xgetCValueZzseffid(), "ZZSEFFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffidList The collection of zzseffid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_NotInScope(Collection<String> zzseffidList) {
        doSetZzseffid_NotInScope(zzseffidList);
    }

    protected void doSetZzseffid_NotInScope(Collection<String> zzseffidList) {
        regINS(CK_NINS, cTL(zzseffidList), xgetCValueZzseffid(), "ZZSEFFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSEFFID: {varchar(255)} <br>
     * <pre>e.g. setZzseffid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzseffid The value of zzseffid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzseffid_LikeSearch(String zzseffid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzseffid), xgetCValueZzseffid(), "ZZSEFFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzseffid_NotLikeSearch(String zzseffid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzseffid), xgetCValueZzseffid(), "ZZSEFFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     * @param zzseffid The value of zzseffid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzseffid_PrefixSearch(String zzseffid) {
        setZzseffid_LikeSearch(zzseffid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     */
    public void setZzseffid_IsNull() { regZzseffid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     */
    public void setZzseffid_IsNullOrEmpty() { regZzseffid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSEFFID: {varchar(255)}
     */
    public void setZzseffid_IsNotNull() { regZzseffid(CK_ISNN, DOBJ); }

    protected void regZzseffid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzseffid(), "ZZSEFFID"); }
    protected abstract ConditionValue xgetCValueZzseffid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_Equal(String zzablymd) {
        doSetZzablymd_Equal(fRES(zzablymd));
    }

    protected void doSetZzablymd_Equal(String zzablymd) {
        regZzablymd(CK_EQ, zzablymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotEqual(String zzablymd) {
        doSetZzablymd_NotEqual(fRES(zzablymd));
    }

    protected void doSetZzablymd_NotEqual(String zzablymd) {
        regZzablymd(CK_NES, zzablymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterThan(String zzablymd) {
        regZzablymd(CK_GT, fRES(zzablymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessThan(String zzablymd) {
        regZzablymd(CK_LT, fRES(zzablymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_GreaterEqual(String zzablymd) {
        regZzablymd(CK_GE, fRES(zzablymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_LessEqual(String zzablymd) {
        regZzablymd(CK_LE, fRES(zzablymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymdList The collection of zzablymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_InScope(Collection<String> zzablymdList) {
        doSetZzablymd_InScope(zzablymdList);
    }

    protected void doSetZzablymd_InScope(Collection<String> zzablymdList) {
        regINS(CK_INS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymdList The collection of zzablymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_NotInScope(Collection<String> zzablymdList) {
        doSetZzablymd_NotInScope(zzablymdList);
    }

    protected void doSetZzablymd_NotInScope(Collection<String> zzablymdList) {
        regINS(CK_NINS, cTL(zzablymdList), xgetCValueZzablymd(), "ZZABLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(255)} <br>
     * <pre>e.g. setZzablymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzablymd The value of zzablymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzablymd_LikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzablymd_NotLikeSearch(String zzablymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzablymd), xgetCValueZzablymd(), "ZZABLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     * @param zzablymd The value of zzablymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzablymd_PrefixSearch(String zzablymd) {
        setZzablymd_LikeSearch(zzablymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     */
    public void setZzablymd_IsNull() { regZzablymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     */
    public void setZzablymd_IsNullOrEmpty() { regZzablymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZABLYMD: {varchar(255)}
     */
    public void setZzablymd_IsNotNull() { regZzablymd(CK_ISNN, DOBJ); }

    protected void regZzablymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzablymd(), "ZZABLYMD"); }
    protected abstract ConditionValue xgetCValueZzablymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_Equal(String crspymd) {
        doSetCrspymd_Equal(fRES(crspymd));
    }

    protected void doSetCrspymd_Equal(String crspymd) {
        regCrspymd(CK_EQ, crspymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_NotEqual(String crspymd) {
        doSetCrspymd_NotEqual(fRES(crspymd));
    }

    protected void doSetCrspymd_NotEqual(String crspymd) {
        regCrspymd(CK_NES, crspymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_GreaterThan(String crspymd) {
        regCrspymd(CK_GT, fRES(crspymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_LessThan(String crspymd) {
        regCrspymd(CK_LT, fRES(crspymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_GreaterEqual(String crspymd) {
        regCrspymd(CK_GE, fRES(crspymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_LessEqual(String crspymd) {
        regCrspymd(CK_LE, fRES(crspymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymdList The collection of crspymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_InScope(Collection<String> crspymdList) {
        doSetCrspymd_InScope(crspymdList);
    }

    protected void doSetCrspymd_InScope(Collection<String> crspymdList) {
        regINS(CK_INS, cTL(crspymdList), xgetCValueCrspymd(), "CRSPYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymdList The collection of crspymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_NotInScope(Collection<String> crspymdList) {
        doSetCrspymd_NotInScope(crspymdList);
    }

    protected void doSetCrspymd_NotInScope(Collection<String> crspymdList) {
        regINS(CK_NINS, cTL(crspymdList), xgetCValueCrspymd(), "CRSPYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRSPYMD: {varchar(255)} <br>
     * <pre>e.g. setCrspymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param crspymd The value of crspymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCrspymd_LikeSearch(String crspymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(crspymd), xgetCValueCrspymd(), "CRSPYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCrspymd_NotLikeSearch(String crspymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(crspymd), xgetCValueCrspymd(), "CRSPYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRSPYMD: {varchar(255)}
     * @param crspymd The value of crspymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCrspymd_PrefixSearch(String crspymd) {
        setCrspymd_LikeSearch(crspymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     */
    public void setCrspymd_IsNull() { regCrspymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     */
    public void setCrspymd_IsNullOrEmpty() { regCrspymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CRSPYMD: {varchar(255)}
     */
    public void setCrspymd_IsNotNull() { regCrspymd(CK_ISNN, DOBJ); }

    protected void regCrspymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCrspymd(), "CRSPYMD"); }
    protected abstract ConditionValue xgetCValueCrspymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_Equal(String seymd) {
        doSetSeymd_Equal(fRES(seymd));
    }

    protected void doSetSeymd_Equal(String seymd) {
        regSeymd(CK_EQ, seymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_NotEqual(String seymd) {
        doSetSeymd_NotEqual(fRES(seymd));
    }

    protected void doSetSeymd_NotEqual(String seymd) {
        regSeymd(CK_NES, seymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_GreaterThan(String seymd) {
        regSeymd(CK_GT, fRES(seymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_LessThan(String seymd) {
        regSeymd(CK_LT, fRES(seymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_GreaterEqual(String seymd) {
        regSeymd(CK_GE, fRES(seymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_LessEqual(String seymd) {
        regSeymd(CK_LE, fRES(seymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymdList The collection of seymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_InScope(Collection<String> seymdList) {
        doSetSeymd_InScope(seymdList);
    }

    protected void doSetSeymd_InScope(Collection<String> seymdList) {
        regINS(CK_INS, cTL(seymdList), xgetCValueSeymd(), "SEYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymdList The collection of seymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_NotInScope(Collection<String> seymdList) {
        doSetSeymd_NotInScope(seymdList);
    }

    protected void doSetSeymd_NotInScope(Collection<String> seymdList) {
        regINS(CK_NINS, cTL(seymdList), xgetCValueSeymd(), "SEYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEYMD: {varchar(255)} <br>
     * <pre>e.g. setSeymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param seymd The value of seymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeymd_LikeSearch(String seymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seymd), xgetCValueSeymd(), "SEYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeymd_NotLikeSearch(String seymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seymd), xgetCValueSeymd(), "SEYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEYMD: {varchar(255)}
     * @param seymd The value of seymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeymd_PrefixSearch(String seymd) {
        setSeymd_LikeSearch(seymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     */
    public void setSeymd_IsNull() { regSeymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     */
    public void setSeymd_IsNullOrEmpty() { regSeymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEYMD: {varchar(255)}
     */
    public void setSeymd_IsNotNull() { regSeymd(CK_ISNN, DOBJ); }

    protected void regSeymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeymd(), "SEYMD"); }
    protected abstract ConditionValue xgetCValueSeymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_Equal(String dpbnyd) {
        doSetDpbnyd_Equal(fRES(dpbnyd));
    }

    protected void doSetDpbnyd_Equal(String dpbnyd) {
        regDpbnyd(CK_EQ, dpbnyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_NotEqual(String dpbnyd) {
        doSetDpbnyd_NotEqual(fRES(dpbnyd));
    }

    protected void doSetDpbnyd_NotEqual(String dpbnyd) {
        regDpbnyd(CK_NES, dpbnyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_GreaterThan(String dpbnyd) {
        regDpbnyd(CK_GT, fRES(dpbnyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_LessThan(String dpbnyd) {
        regDpbnyd(CK_LT, fRES(dpbnyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_GreaterEqual(String dpbnyd) {
        regDpbnyd(CK_GE, fRES(dpbnyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_LessEqual(String dpbnyd) {
        regDpbnyd(CK_LE, fRES(dpbnyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnydList The collection of dpbnyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_InScope(Collection<String> dpbnydList) {
        doSetDpbnyd_InScope(dpbnydList);
    }

    protected void doSetDpbnyd_InScope(Collection<String> dpbnydList) {
        regINS(CK_INS, cTL(dpbnydList), xgetCValueDpbnyd(), "DPBNYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnydList The collection of dpbnyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_NotInScope(Collection<String> dpbnydList) {
        doSetDpbnyd_NotInScope(dpbnydList);
    }

    protected void doSetDpbnyd_NotInScope(Collection<String> dpbnydList) {
        regINS(CK_NINS, cTL(dpbnydList), xgetCValueDpbnyd(), "DPBNYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPBNYD: {varchar(255)} <br>
     * <pre>e.g. setDpbnyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpbnyd The value of dpbnyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpbnyd_LikeSearch(String dpbnyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpbnyd), xgetCValueDpbnyd(), "DPBNYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpbnyd_NotLikeSearch(String dpbnyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpbnyd), xgetCValueDpbnyd(), "DPBNYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPBNYD: {varchar(255)}
     * @param dpbnyd The value of dpbnyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpbnyd_PrefixSearch(String dpbnyd) {
        setDpbnyd_LikeSearch(dpbnyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     */
    public void setDpbnyd_IsNull() { regDpbnyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     */
    public void setDpbnyd_IsNullOrEmpty() { regDpbnyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPBNYD: {varchar(255)}
     */
    public void setDpbnyd_IsNotNull() { regDpbnyd(CK_ISNN, DOBJ); }

    protected void regDpbnyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpbnyd(), "DPBNYD"); }
    protected abstract ConditionValue xgetCValueDpbnyd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_Equal(String sobgnymd) {
        doSetSobgnymd_Equal(fRES(sobgnymd));
    }

    protected void doSetSobgnymd_Equal(String sobgnymd) {
        regSobgnymd(CK_EQ, sobgnymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_NotEqual(String sobgnymd) {
        doSetSobgnymd_NotEqual(fRES(sobgnymd));
    }

    protected void doSetSobgnymd_NotEqual(String sobgnymd) {
        regSobgnymd(CK_NES, sobgnymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_GreaterThan(String sobgnymd) {
        regSobgnymd(CK_GT, fRES(sobgnymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_LessThan(String sobgnymd) {
        regSobgnymd(CK_LT, fRES(sobgnymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_GreaterEqual(String sobgnymd) {
        regSobgnymd(CK_GE, fRES(sobgnymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_LessEqual(String sobgnymd) {
        regSobgnymd(CK_LE, fRES(sobgnymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymdList The collection of sobgnymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_InScope(Collection<String> sobgnymdList) {
        doSetSobgnymd_InScope(sobgnymdList);
    }

    protected void doSetSobgnymd_InScope(Collection<String> sobgnymdList) {
        regINS(CK_INS, cTL(sobgnymdList), xgetCValueSobgnymd(), "SOBGNYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymdList The collection of sobgnymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_NotInScope(Collection<String> sobgnymdList) {
        doSetSobgnymd_NotInScope(sobgnymdList);
    }

    protected void doSetSobgnymd_NotInScope(Collection<String> sobgnymdList) {
        regINS(CK_NINS, cTL(sobgnymdList), xgetCValueSobgnymd(), "SOBGNYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBGNYMD: {varchar(255)} <br>
     * <pre>e.g. setSobgnymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sobgnymd The value of sobgnymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSobgnymd_LikeSearch(String sobgnymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sobgnymd), xgetCValueSobgnymd(), "SOBGNYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSobgnymd_NotLikeSearch(String sobgnymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sobgnymd), xgetCValueSobgnymd(), "SOBGNYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     * @param sobgnymd The value of sobgnymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSobgnymd_PrefixSearch(String sobgnymd) {
        setSobgnymd_LikeSearch(sobgnymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     */
    public void setSobgnymd_IsNull() { regSobgnymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     */
    public void setSobgnymd_IsNullOrEmpty() { regSobgnymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOBGNYMD: {varchar(255)}
     */
    public void setSobgnymd_IsNotNull() { regSobgnymd(CK_ISNN, DOBJ); }

    protected void regSobgnymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSobgnymd(), "SOBGNYMD"); }
    protected abstract ConditionValue xgetCValueSobgnymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_Equal(String exslymd) {
        doSetExslymd_Equal(fRES(exslymd));
    }

    protected void doSetExslymd_Equal(String exslymd) {
        regExslymd(CK_EQ, exslymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_NotEqual(String exslymd) {
        doSetExslymd_NotEqual(fRES(exslymd));
    }

    protected void doSetExslymd_NotEqual(String exslymd) {
        regExslymd(CK_NES, exslymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_GreaterThan(String exslymd) {
        regExslymd(CK_GT, fRES(exslymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_LessThan(String exslymd) {
        regExslymd(CK_LT, fRES(exslymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_GreaterEqual(String exslymd) {
        regExslymd(CK_GE, fRES(exslymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_LessEqual(String exslymd) {
        regExslymd(CK_LE, fRES(exslymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymdList The collection of exslymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_InScope(Collection<String> exslymdList) {
        doSetExslymd_InScope(exslymdList);
    }

    protected void doSetExslymd_InScope(Collection<String> exslymdList) {
        regINS(CK_INS, cTL(exslymdList), xgetCValueExslymd(), "EXSLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymdList The collection of exslymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_NotInScope(Collection<String> exslymdList) {
        doSetExslymd_NotInScope(exslymdList);
    }

    protected void doSetExslymd_NotInScope(Collection<String> exslymdList) {
        regINS(CK_NINS, cTL(exslymdList), xgetCValueExslymd(), "EXSLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXSLYMD: {varchar(255)} <br>
     * <pre>e.g. setExslymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param exslymd The value of exslymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExslymd_LikeSearch(String exslymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(exslymd), xgetCValueExslymd(), "EXSLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExslymd_NotLikeSearch(String exslymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exslymd), xgetCValueExslymd(), "EXSLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXSLYMD: {varchar(255)}
     * @param exslymd The value of exslymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExslymd_PrefixSearch(String exslymd) {
        setExslymd_LikeSearch(exslymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     */
    public void setExslymd_IsNull() { regExslymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     */
    public void setExslymd_IsNullOrEmpty() { regExslymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXSLYMD: {varchar(255)}
     */
    public void setExslymd_IsNotNull() { regExslymd(CK_ISNN, DOBJ); }

    protected void regExslymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExslymd(), "EXSLYMD"); }
    protected abstract ConditionValue xgetCValueExslymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_Equal(String aubrid) {
        doSetAubrid_Equal(fRES(aubrid));
    }

    protected void doSetAubrid_Equal(String aubrid) {
        regAubrid(CK_EQ, aubrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_NotEqual(String aubrid) {
        doSetAubrid_NotEqual(fRES(aubrid));
    }

    protected void doSetAubrid_NotEqual(String aubrid) {
        regAubrid(CK_NES, aubrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_GreaterThan(String aubrid) {
        regAubrid(CK_GT, fRES(aubrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_LessThan(String aubrid) {
        regAubrid(CK_LT, fRES(aubrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_GreaterEqual(String aubrid) {
        regAubrid(CK_GE, fRES(aubrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_LessEqual(String aubrid) {
        regAubrid(CK_LE, fRES(aubrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubridList The collection of aubrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_InScope(Collection<String> aubridList) {
        doSetAubrid_InScope(aubridList);
    }

    protected void doSetAubrid_InScope(Collection<String> aubridList) {
        regINS(CK_INS, cTL(aubridList), xgetCValueAubrid(), "AUBRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubridList The collection of aubrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_NotInScope(Collection<String> aubridList) {
        doSetAubrid_NotInScope(aubridList);
    }

    protected void doSetAubrid_NotInScope(Collection<String> aubridList) {
        regINS(CK_NINS, cTL(aubridList), xgetCValueAubrid(), "AUBRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRID: {varchar(255)} <br>
     * <pre>e.g. setAubrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aubrid The value of aubrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAubrid_LikeSearch(String aubrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aubrid), xgetCValueAubrid(), "AUBRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAubrid_NotLikeSearch(String aubrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aubrid), xgetCValueAubrid(), "AUBRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRID: {varchar(255)}
     * @param aubrid The value of aubrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrid_PrefixSearch(String aubrid) {
        setAubrid_LikeSearch(aubrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     */
    public void setAubrid_IsNull() { regAubrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     */
    public void setAubrid_IsNullOrEmpty() { regAubrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUBRID: {varchar(255)}
     */
    public void setAubrid_IsNotNull() { regAubrid(CK_ISNN, DOBJ); }

    protected void regAubrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAubrid(), "AUBRID"); }
    protected abstract ConditionValue xgetCValueAubrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_Equal(String fwbrid) {
        doSetFwbrid_Equal(fRES(fwbrid));
    }

    protected void doSetFwbrid_Equal(String fwbrid) {
        regFwbrid(CK_EQ, fwbrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_NotEqual(String fwbrid) {
        doSetFwbrid_NotEqual(fRES(fwbrid));
    }

    protected void doSetFwbrid_NotEqual(String fwbrid) {
        regFwbrid(CK_NES, fwbrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_GreaterThan(String fwbrid) {
        regFwbrid(CK_GT, fRES(fwbrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_LessThan(String fwbrid) {
        regFwbrid(CK_LT, fRES(fwbrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_GreaterEqual(String fwbrid) {
        regFwbrid(CK_GE, fRES(fwbrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_LessEqual(String fwbrid) {
        regFwbrid(CK_LE, fRES(fwbrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbridList The collection of fwbrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_InScope(Collection<String> fwbridList) {
        doSetFwbrid_InScope(fwbridList);
    }

    protected void doSetFwbrid_InScope(Collection<String> fwbridList) {
        regINS(CK_INS, cTL(fwbridList), xgetCValueFwbrid(), "FWBRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbridList The collection of fwbrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_NotInScope(Collection<String> fwbridList) {
        doSetFwbrid_NotInScope(fwbridList);
    }

    protected void doSetFwbrid_NotInScope(Collection<String> fwbridList) {
        regINS(CK_NINS, cTL(fwbridList), xgetCValueFwbrid(), "FWBRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(255)} <br>
     * <pre>e.g. setFwbrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fwbrid The value of fwbrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFwbrid_LikeSearch(String fwbrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fwbrid), xgetCValueFwbrid(), "FWBRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFwbrid_NotLikeSearch(String fwbrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fwbrid), xgetCValueFwbrid(), "FWBRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(255)}
     * @param fwbrid The value of fwbrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_PrefixSearch(String fwbrid) {
        setFwbrid_LikeSearch(fwbrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     */
    public void setFwbrid_IsNull() { regFwbrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     */
    public void setFwbrid_IsNullOrEmpty() { regFwbrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(255)}
     */
    public void setFwbrid_IsNotNull() { regFwbrid(CK_ISNN, DOBJ); }

    protected void regFwbrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwbrid(), "FWBRID"); }
    protected abstract ConditionValue xgetCValueFwbrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_Equal(String brcrid) {
        doSetBrcrid_Equal(fRES(brcrid));
    }

    protected void doSetBrcrid_Equal(String brcrid) {
        regBrcrid(CK_EQ, brcrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_NotEqual(String brcrid) {
        doSetBrcrid_NotEqual(fRES(brcrid));
    }

    protected void doSetBrcrid_NotEqual(String brcrid) {
        regBrcrid(CK_NES, brcrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_GreaterThan(String brcrid) {
        regBrcrid(CK_GT, fRES(brcrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_LessThan(String brcrid) {
        regBrcrid(CK_LT, fRES(brcrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_GreaterEqual(String brcrid) {
        regBrcrid(CK_GE, fRES(brcrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_LessEqual(String brcrid) {
        regBrcrid(CK_LE, fRES(brcrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcridList The collection of brcrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_InScope(Collection<String> brcridList) {
        doSetBrcrid_InScope(brcridList);
    }

    protected void doSetBrcrid_InScope(Collection<String> brcridList) {
        regINS(CK_INS, cTL(brcridList), xgetCValueBrcrid(), "BRCRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcridList The collection of brcrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_NotInScope(Collection<String> brcridList) {
        doSetBrcrid_NotInScope(brcridList);
    }

    protected void doSetBrcrid_NotInScope(Collection<String> brcridList) {
        regINS(CK_NINS, cTL(brcridList), xgetCValueBrcrid(), "BRCRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRCRID: {varchar(255)} <br>
     * <pre>e.g. setBrcrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brcrid The value of brcrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrcrid_LikeSearch(String brcrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brcrid), xgetCValueBrcrid(), "BRCRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrcrid_NotLikeSearch(String brcrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brcrid), xgetCValueBrcrid(), "BRCRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRCRID: {varchar(255)}
     * @param brcrid The value of brcrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrcrid_PrefixSearch(String brcrid) {
        setBrcrid_LikeSearch(brcrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     */
    public void setBrcrid_IsNull() { regBrcrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     */
    public void setBrcrid_IsNullOrEmpty() { regBrcrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRCRID: {varchar(255)}
     */
    public void setBrcrid_IsNotNull() { regBrcrid(CK_ISNN, DOBJ); }

    protected void regBrcrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrcrid(), "BRCRID"); }
    protected abstract ConditionValue xgetCValueBrcrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_Equal(String pabrcd) {
        doSetPabrcd_Equal(fRES(pabrcd));
    }

    protected void doSetPabrcd_Equal(String pabrcd) {
        regPabrcd(CK_EQ, pabrcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_NotEqual(String pabrcd) {
        doSetPabrcd_NotEqual(fRES(pabrcd));
    }

    protected void doSetPabrcd_NotEqual(String pabrcd) {
        regPabrcd(CK_NES, pabrcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_GreaterThan(String pabrcd) {
        regPabrcd(CK_GT, fRES(pabrcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_LessThan(String pabrcd) {
        regPabrcd(CK_LT, fRES(pabrcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_GreaterEqual(String pabrcd) {
        regPabrcd(CK_GE, fRES(pabrcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_LessEqual(String pabrcd) {
        regPabrcd(CK_LE, fRES(pabrcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcdList The collection of pabrcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_InScope(Collection<String> pabrcdList) {
        doSetPabrcd_InScope(pabrcdList);
    }

    protected void doSetPabrcd_InScope(Collection<String> pabrcdList) {
        regINS(CK_INS, cTL(pabrcdList), xgetCValuePabrcd(), "PABRCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcdList The collection of pabrcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_NotInScope(Collection<String> pabrcdList) {
        doSetPabrcd_NotInScope(pabrcdList);
    }

    protected void doSetPabrcd_NotInScope(Collection<String> pabrcdList) {
        regINS(CK_NINS, cTL(pabrcdList), xgetCValuePabrcd(), "PABRCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PABRCD: {varchar(255)} <br>
     * <pre>e.g. setPabrcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pabrcd The value of pabrcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPabrcd_LikeSearch(String pabrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pabrcd), xgetCValuePabrcd(), "PABRCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPabrcd_NotLikeSearch(String pabrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pabrcd), xgetCValuePabrcd(), "PABRCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PABRCD: {varchar(255)}
     * @param pabrcd The value of pabrcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPabrcd_PrefixSearch(String pabrcd) {
        setPabrcd_LikeSearch(pabrcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     */
    public void setPabrcd_IsNull() { regPabrcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     */
    public void setPabrcd_IsNullOrEmpty() { regPabrcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PABRCD: {varchar(255)}
     */
    public void setPabrcd_IsNotNull() { regPabrcd(CK_ISNN, DOBJ); }

    protected void regPabrcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePabrcd(), "PABRCD"); }
    protected abstract ConditionValue xgetCValuePabrcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_Equal(String aubrcd) {
        doSetAubrcd_Equal(fRES(aubrcd));
    }

    protected void doSetAubrcd_Equal(String aubrcd) {
        regAubrcd(CK_EQ, aubrcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_NotEqual(String aubrcd) {
        doSetAubrcd_NotEqual(fRES(aubrcd));
    }

    protected void doSetAubrcd_NotEqual(String aubrcd) {
        regAubrcd(CK_NES, aubrcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_GreaterThan(String aubrcd) {
        regAubrcd(CK_GT, fRES(aubrcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_LessThan(String aubrcd) {
        regAubrcd(CK_LT, fRES(aubrcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_GreaterEqual(String aubrcd) {
        regAubrcd(CK_GE, fRES(aubrcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_LessEqual(String aubrcd) {
        regAubrcd(CK_LE, fRES(aubrcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcdList The collection of aubrcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_InScope(Collection<String> aubrcdList) {
        doSetAubrcd_InScope(aubrcdList);
    }

    protected void doSetAubrcd_InScope(Collection<String> aubrcdList) {
        regINS(CK_INS, cTL(aubrcdList), xgetCValueAubrcd(), "AUBRCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcdList The collection of aubrcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_NotInScope(Collection<String> aubrcdList) {
        doSetAubrcd_NotInScope(aubrcdList);
    }

    protected void doSetAubrcd_NotInScope(Collection<String> aubrcdList) {
        regINS(CK_NINS, cTL(aubrcdList), xgetCValueAubrcd(), "AUBRCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCD: {varchar(255)} <br>
     * <pre>e.g. setAubrcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aubrcd The value of aubrcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAubrcd_LikeSearch(String aubrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aubrcd), xgetCValueAubrcd(), "AUBRCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAubrcd_NotLikeSearch(String aubrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aubrcd), xgetCValueAubrcd(), "AUBRCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCD: {varchar(255)}
     * @param aubrcd The value of aubrcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrcd_PrefixSearch(String aubrcd) {
        setAubrcd_LikeSearch(aubrcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     */
    public void setAubrcd_IsNull() { regAubrcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     */
    public void setAubrcd_IsNullOrEmpty() { regAubrcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUBRCD: {varchar(255)}
     */
    public void setAubrcd_IsNotNull() { regAubrcd(CK_ISNN, DOBJ); }

    protected void regAubrcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAubrcd(), "AUBRCD"); }
    protected abstract ConditionValue xgetCValueAubrcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_Equal(String zzmatnra) {
        doSetZzmatnra_Equal(fRES(zzmatnra));
    }

    protected void doSetZzmatnra_Equal(String zzmatnra) {
        regZzmatnra(CK_EQ, zzmatnra);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_NotEqual(String zzmatnra) {
        doSetZzmatnra_NotEqual(fRES(zzmatnra));
    }

    protected void doSetZzmatnra_NotEqual(String zzmatnra) {
        regZzmatnra(CK_NES, zzmatnra);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_GreaterThan(String zzmatnra) {
        regZzmatnra(CK_GT, fRES(zzmatnra));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_LessThan(String zzmatnra) {
        regZzmatnra(CK_LT, fRES(zzmatnra));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_GreaterEqual(String zzmatnra) {
        regZzmatnra(CK_GE, fRES(zzmatnra));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_LessEqual(String zzmatnra) {
        regZzmatnra(CK_LE, fRES(zzmatnra));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnraList The collection of zzmatnra as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_InScope(Collection<String> zzmatnraList) {
        doSetZzmatnra_InScope(zzmatnraList);
    }

    protected void doSetZzmatnra_InScope(Collection<String> zzmatnraList) {
        regINS(CK_INS, cTL(zzmatnraList), xgetCValueZzmatnra(), "ZZMATNRA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnraList The collection of zzmatnra as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_NotInScope(Collection<String> zzmatnraList) {
        doSetZzmatnra_NotInScope(zzmatnraList);
    }

    protected void doSetZzmatnra_NotInScope(Collection<String> zzmatnraList) {
        regINS(CK_NINS, cTL(zzmatnraList), xgetCValueZzmatnra(), "ZZMATNRA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNRA: {varchar(255)} <br>
     * <pre>e.g. setZzmatnra_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzmatnra The value of zzmatnra as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzmatnra_LikeSearch(String zzmatnra, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzmatnra), xgetCValueZzmatnra(), "ZZMATNRA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnra_NotLikeSearch(String zzmatnra, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnra), xgetCValueZzmatnra(), "ZZMATNRA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     * @param zzmatnra The value of zzmatnra as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnra_PrefixSearch(String zzmatnra) {
        setZzmatnra_LikeSearch(zzmatnra, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     */
    public void setZzmatnra_IsNull() { regZzmatnra(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     */
    public void setZzmatnra_IsNullOrEmpty() { regZzmatnra(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNRA: {varchar(255)}
     */
    public void setZzmatnra_IsNotNull() { regZzmatnra(CK_ISNN, DOBJ); }

    protected void regZzmatnra(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnra(), "ZZMATNRA"); }
    protected abstract ConditionValue xgetCValueZzmatnra();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_Equal(String mraucd) {
        doSetMraucd_Equal(fRES(mraucd));
    }

    protected void doSetMraucd_Equal(String mraucd) {
        regMraucd(CK_EQ, mraucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_NotEqual(String mraucd) {
        doSetMraucd_NotEqual(fRES(mraucd));
    }

    protected void doSetMraucd_NotEqual(String mraucd) {
        regMraucd(CK_NES, mraucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_GreaterThan(String mraucd) {
        regMraucd(CK_GT, fRES(mraucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_LessThan(String mraucd) {
        regMraucd(CK_LT, fRES(mraucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_GreaterEqual(String mraucd) {
        regMraucd(CK_GE, fRES(mraucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_LessEqual(String mraucd) {
        regMraucd(CK_LE, fRES(mraucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucdList The collection of mraucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_InScope(Collection<String> mraucdList) {
        doSetMraucd_InScope(mraucdList);
    }

    protected void doSetMraucd_InScope(Collection<String> mraucdList) {
        regINS(CK_INS, cTL(mraucdList), xgetCValueMraucd(), "MRAUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucdList The collection of mraucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_NotInScope(Collection<String> mraucdList) {
        doSetMraucd_NotInScope(mraucdList);
    }

    protected void doSetMraucd_NotInScope(Collection<String> mraucdList) {
        regINS(CK_NINS, cTL(mraucdList), xgetCValueMraucd(), "MRAUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MRAUCD: {varchar(255)} <br>
     * <pre>e.g. setMraucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mraucd The value of mraucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMraucd_LikeSearch(String mraucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mraucd), xgetCValueMraucd(), "MRAUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMraucd_NotLikeSearch(String mraucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mraucd), xgetCValueMraucd(), "MRAUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MRAUCD: {varchar(255)}
     * @param mraucd The value of mraucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMraucd_PrefixSearch(String mraucd) {
        setMraucd_LikeSearch(mraucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     */
    public void setMraucd_IsNull() { regMraucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     */
    public void setMraucd_IsNullOrEmpty() { regMraucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MRAUCD: {varchar(255)}
     */
    public void setMraucd_IsNotNull() { regMraucd(CK_ISNN, DOBJ); }

    protected void regMraucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMraucd(), "MRAUCD"); }
    protected abstract ConditionValue xgetCValueMraucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_Equal(String zzsomium) {
        doSetZzsomium_Equal(fRES(zzsomium));
    }

    protected void doSetZzsomium_Equal(String zzsomium) {
        regZzsomium(CK_EQ, zzsomium);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_NotEqual(String zzsomium) {
        doSetZzsomium_NotEqual(fRES(zzsomium));
    }

    protected void doSetZzsomium_NotEqual(String zzsomium) {
        regZzsomium(CK_NES, zzsomium);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_GreaterThan(String zzsomium) {
        regZzsomium(CK_GT, fRES(zzsomium));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_LessThan(String zzsomium) {
        regZzsomium(CK_LT, fRES(zzsomium));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_GreaterEqual(String zzsomium) {
        regZzsomium(CK_GE, fRES(zzsomium));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_LessEqual(String zzsomium) {
        regZzsomium(CK_LE, fRES(zzsomium));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomiumList The collection of zzsomium as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_InScope(Collection<String> zzsomiumList) {
        doSetZzsomium_InScope(zzsomiumList);
    }

    protected void doSetZzsomium_InScope(Collection<String> zzsomiumList) {
        regINS(CK_INS, cTL(zzsomiumList), xgetCValueZzsomium(), "ZZSOMIUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomiumList The collection of zzsomium as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_NotInScope(Collection<String> zzsomiumList) {
        doSetZzsomium_NotInScope(zzsomiumList);
    }

    protected void doSetZzsomium_NotInScope(Collection<String> zzsomiumList) {
        regINS(CK_NINS, cTL(zzsomiumList), xgetCValueZzsomium(), "ZZSOMIUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSOMIUM: {varchar(255)} <br>
     * <pre>e.g. setZzsomium_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzsomium The value of zzsomium as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzsomium_LikeSearch(String zzsomium, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzsomium), xgetCValueZzsomium(), "ZZSOMIUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzsomium_NotLikeSearch(String zzsomium, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzsomium), xgetCValueZzsomium(), "ZZSOMIUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     * @param zzsomium The value of zzsomium as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsomium_PrefixSearch(String zzsomium) {
        setZzsomium_LikeSearch(zzsomium, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     */
    public void setZzsomium_IsNull() { regZzsomium(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     */
    public void setZzsomium_IsNullOrEmpty() { regZzsomium(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSOMIUM: {varchar(255)}
     */
    public void setZzsomium_IsNotNull() { regZzsomium(CK_ISNN, DOBJ); }

    protected void regZzsomium(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzsomium(), "ZZSOMIUM"); }
    protected abstract ConditionValue xgetCValueZzsomium();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_Equal(String zzregprca) {
        doSetZzregprca_Equal(fRES(zzregprca));
    }

    protected void doSetZzregprca_Equal(String zzregprca) {
        regZzregprca(CK_EQ, zzregprca);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_NotEqual(String zzregprca) {
        doSetZzregprca_NotEqual(fRES(zzregprca));
    }

    protected void doSetZzregprca_NotEqual(String zzregprca) {
        regZzregprca(CK_NES, zzregprca);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_GreaterThan(String zzregprca) {
        regZzregprca(CK_GT, fRES(zzregprca));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_LessThan(String zzregprca) {
        regZzregprca(CK_LT, fRES(zzregprca));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_GreaterEqual(String zzregprca) {
        regZzregprca(CK_GE, fRES(zzregprca));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_LessEqual(String zzregprca) {
        regZzregprca(CK_LE, fRES(zzregprca));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprcaList The collection of zzregprca as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_InScope(Collection<String> zzregprcaList) {
        doSetZzregprca_InScope(zzregprcaList);
    }

    protected void doSetZzregprca_InScope(Collection<String> zzregprcaList) {
        regINS(CK_INS, cTL(zzregprcaList), xgetCValueZzregprca(), "ZZREGPRCA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprcaList The collection of zzregprca as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_NotInScope(Collection<String> zzregprcaList) {
        doSetZzregprca_NotInScope(zzregprcaList);
    }

    protected void doSetZzregprca_NotInScope(Collection<String> zzregprcaList) {
        regINS(CK_NINS, cTL(zzregprcaList), xgetCValueZzregprca(), "ZZREGPRCA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREGPRCA: {varchar(255)} <br>
     * <pre>e.g. setZzregprca_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzregprca The value of zzregprca as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzregprca_LikeSearch(String zzregprca, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzregprca), xgetCValueZzregprca(), "ZZREGPRCA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzregprca_NotLikeSearch(String zzregprca, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzregprca), xgetCValueZzregprca(), "ZZREGPRCA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     * @param zzregprca The value of zzregprca as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzregprca_PrefixSearch(String zzregprca) {
        setZzregprca_LikeSearch(zzregprca, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     */
    public void setZzregprca_IsNull() { regZzregprca(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     */
    public void setZzregprca_IsNullOrEmpty() { regZzregprca(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZREGPRCA: {varchar(255)}
     */
    public void setZzregprca_IsNotNull() { regZzregprca(CK_ISNN, DOBJ); }

    protected void regZzregprca(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzregprca(), "ZZREGPRCA"); }
    protected abstract ConditionValue xgetCValueZzregprca();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_Equal(String tfpr) {
        doSetTfpr_Equal(fRES(tfpr));
    }

    protected void doSetTfpr_Equal(String tfpr) {
        regTfpr(CK_EQ, tfpr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_NotEqual(String tfpr) {
        doSetTfpr_NotEqual(fRES(tfpr));
    }

    protected void doSetTfpr_NotEqual(String tfpr) {
        regTfpr(CK_NES, tfpr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_GreaterThan(String tfpr) {
        regTfpr(CK_GT, fRES(tfpr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_LessThan(String tfpr) {
        regTfpr(CK_LT, fRES(tfpr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_GreaterEqual(String tfpr) {
        regTfpr(CK_GE, fRES(tfpr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_LessEqual(String tfpr) {
        regTfpr(CK_LE, fRES(tfpr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfprList The collection of tfpr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_InScope(Collection<String> tfprList) {
        doSetTfpr_InScope(tfprList);
    }

    protected void doSetTfpr_InScope(Collection<String> tfprList) {
        regINS(CK_INS, cTL(tfprList), xgetCValueTfpr(), "TFPR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfprList The collection of tfpr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_NotInScope(Collection<String> tfprList) {
        doSetTfpr_NotInScope(tfprList);
    }

    protected void doSetTfpr_NotInScope(Collection<String> tfprList) {
        regINS(CK_NINS, cTL(tfprList), xgetCValueTfpr(), "TFPR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TFPR: {varchar(255)} <br>
     * <pre>e.g. setTfpr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tfpr The value of tfpr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTfpr_LikeSearch(String tfpr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tfpr), xgetCValueTfpr(), "TFPR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTfpr_NotLikeSearch(String tfpr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tfpr), xgetCValueTfpr(), "TFPR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TFPR: {varchar(255)}
     * @param tfpr The value of tfpr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTfpr_PrefixSearch(String tfpr) {
        setTfpr_LikeSearch(tfpr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     */
    public void setTfpr_IsNull() { regTfpr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     */
    public void setTfpr_IsNullOrEmpty() { regTfpr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TFPR: {varchar(255)}
     */
    public void setTfpr_IsNotNull() { regTfpr(CK_ISNN, DOBJ); }

    protected void regTfpr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTfpr(), "TFPR"); }
    protected abstract ConditionValue xgetCValueTfpr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_Equal(String mgrta) {
        doSetMgrta_Equal(fRES(mgrta));
    }

    protected void doSetMgrta_Equal(String mgrta) {
        regMgrta(CK_EQ, mgrta);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_NotEqual(String mgrta) {
        doSetMgrta_NotEqual(fRES(mgrta));
    }

    protected void doSetMgrta_NotEqual(String mgrta) {
        regMgrta(CK_NES, mgrta);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_GreaterThan(String mgrta) {
        regMgrta(CK_GT, fRES(mgrta));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_LessThan(String mgrta) {
        regMgrta(CK_LT, fRES(mgrta));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_GreaterEqual(String mgrta) {
        regMgrta(CK_GE, fRES(mgrta));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_LessEqual(String mgrta) {
        regMgrta(CK_LE, fRES(mgrta));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrtaList The collection of mgrta as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_InScope(Collection<String> mgrtaList) {
        doSetMgrta_InScope(mgrtaList);
    }

    protected void doSetMgrta_InScope(Collection<String> mgrtaList) {
        regINS(CK_INS, cTL(mgrtaList), xgetCValueMgrta(), "MGRTA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrtaList The collection of mgrta as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_NotInScope(Collection<String> mgrtaList) {
        doSetMgrta_NotInScope(mgrtaList);
    }

    protected void doSetMgrta_NotInScope(Collection<String> mgrtaList) {
        regINS(CK_NINS, cTL(mgrtaList), xgetCValueMgrta(), "MGRTA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTA: {varchar(255)} <br>
     * <pre>e.g. setMgrta_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mgrta The value of mgrta as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMgrta_LikeSearch(String mgrta, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mgrta), xgetCValueMgrta(), "MGRTA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMgrta_NotLikeSearch(String mgrta, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mgrta), xgetCValueMgrta(), "MGRTA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTA: {varchar(255)}
     * @param mgrta The value of mgrta as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrta_PrefixSearch(String mgrta) {
        setMgrta_LikeSearch(mgrta, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     */
    public void setMgrta_IsNull() { regMgrta(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     */
    public void setMgrta_IsNullOrEmpty() { regMgrta(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MGRTA: {varchar(255)}
     */
    public void setMgrta_IsNotNull() { regMgrta(CK_ISNN, DOBJ); }

    protected void regMgrta(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMgrta(), "MGRTA"); }
    protected abstract ConditionValue xgetCValueMgrta();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_Equal(String mgrtok) {
        doSetMgrtok_Equal(fRES(mgrtok));
    }

    protected void doSetMgrtok_Equal(String mgrtok) {
        regMgrtok(CK_EQ, mgrtok);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_NotEqual(String mgrtok) {
        doSetMgrtok_NotEqual(fRES(mgrtok));
    }

    protected void doSetMgrtok_NotEqual(String mgrtok) {
        regMgrtok(CK_NES, mgrtok);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_GreaterThan(String mgrtok) {
        regMgrtok(CK_GT, fRES(mgrtok));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_LessThan(String mgrtok) {
        regMgrtok(CK_LT, fRES(mgrtok));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_GreaterEqual(String mgrtok) {
        regMgrtok(CK_GE, fRES(mgrtok));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_LessEqual(String mgrtok) {
        regMgrtok(CK_LE, fRES(mgrtok));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtokList The collection of mgrtok as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_InScope(Collection<String> mgrtokList) {
        doSetMgrtok_InScope(mgrtokList);
    }

    protected void doSetMgrtok_InScope(Collection<String> mgrtokList) {
        regINS(CK_INS, cTL(mgrtokList), xgetCValueMgrtok(), "MGRTOK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtokList The collection of mgrtok as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_NotInScope(Collection<String> mgrtokList) {
        doSetMgrtok_NotInScope(mgrtokList);
    }

    protected void doSetMgrtok_NotInScope(Collection<String> mgrtokList) {
        regINS(CK_NINS, cTL(mgrtokList), xgetCValueMgrtok(), "MGRTOK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTOK: {varchar(255)} <br>
     * <pre>e.g. setMgrtok_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mgrtok The value of mgrtok as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMgrtok_LikeSearch(String mgrtok, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mgrtok), xgetCValueMgrtok(), "MGRTOK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMgrtok_NotLikeSearch(String mgrtok, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mgrtok), xgetCValueMgrtok(), "MGRTOK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGRTOK: {varchar(255)}
     * @param mgrtok The value of mgrtok as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgrtok_PrefixSearch(String mgrtok) {
        setMgrtok_LikeSearch(mgrtok, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     */
    public void setMgrtok_IsNull() { regMgrtok(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     */
    public void setMgrtok_IsNullOrEmpty() { regMgrtok(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MGRTOK: {varchar(255)}
     */
    public void setMgrtok_IsNotNull() { regMgrtok(CK_ISNN, DOBJ); }

    protected void regMgrtok(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMgrtok(), "MGRTOK"); }
    protected abstract ConditionValue xgetCValueMgrtok();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_Equal(String tlnpru) {
        doSetTlnpru_Equal(fRES(tlnpru));
    }

    protected void doSetTlnpru_Equal(String tlnpru) {
        regTlnpru(CK_EQ, tlnpru);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_NotEqual(String tlnpru) {
        doSetTlnpru_NotEqual(fRES(tlnpru));
    }

    protected void doSetTlnpru_NotEqual(String tlnpru) {
        regTlnpru(CK_NES, tlnpru);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_GreaterThan(String tlnpru) {
        regTlnpru(CK_GT, fRES(tlnpru));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_LessThan(String tlnpru) {
        regTlnpru(CK_LT, fRES(tlnpru));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_GreaterEqual(String tlnpru) {
        regTlnpru(CK_GE, fRES(tlnpru));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_LessEqual(String tlnpru) {
        regTlnpru(CK_LE, fRES(tlnpru));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpruList The collection of tlnpru as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_InScope(Collection<String> tlnpruList) {
        doSetTlnpru_InScope(tlnpruList);
    }

    protected void doSetTlnpru_InScope(Collection<String> tlnpruList) {
        regINS(CK_INS, cTL(tlnpruList), xgetCValueTlnpru(), "TLNPRU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpruList The collection of tlnpru as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_NotInScope(Collection<String> tlnpruList) {
        doSetTlnpru_NotInScope(tlnpruList);
    }

    protected void doSetTlnpru_NotInScope(Collection<String> tlnpruList) {
        regINS(CK_NINS, cTL(tlnpruList), xgetCValueTlnpru(), "TLNPRU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TLNPRU: {varchar(255)} <br>
     * <pre>e.g. setTlnpru_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tlnpru The value of tlnpru as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTlnpru_LikeSearch(String tlnpru, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tlnpru), xgetCValueTlnpru(), "TLNPRU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTlnpru_NotLikeSearch(String tlnpru, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tlnpru), xgetCValueTlnpru(), "TLNPRU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TLNPRU: {varchar(255)}
     * @param tlnpru The value of tlnpru as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTlnpru_PrefixSearch(String tlnpru) {
        setTlnpru_LikeSearch(tlnpru, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     */
    public void setTlnpru_IsNull() { regTlnpru(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     */
    public void setTlnpru_IsNullOrEmpty() { regTlnpru(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TLNPRU: {varchar(255)}
     */
    public void setTlnpru_IsNotNull() { regTlnpru(CK_ISNN, DOBJ); }

    protected void regTlnpru(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTlnpru(), "TLNPRU"); }
    protected abstract ConditionValue xgetCValueTlnpru();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_Equal(String hanumwt) {
        doSetHanumwt_Equal(fRES(hanumwt));
    }

    protected void doSetHanumwt_Equal(String hanumwt) {
        regHanumwt(CK_EQ, hanumwt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_NotEqual(String hanumwt) {
        doSetHanumwt_NotEqual(fRES(hanumwt));
    }

    protected void doSetHanumwt_NotEqual(String hanumwt) {
        regHanumwt(CK_NES, hanumwt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_GreaterThan(String hanumwt) {
        regHanumwt(CK_GT, fRES(hanumwt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_LessThan(String hanumwt) {
        regHanumwt(CK_LT, fRES(hanumwt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_GreaterEqual(String hanumwt) {
        regHanumwt(CK_GE, fRES(hanumwt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_LessEqual(String hanumwt) {
        regHanumwt(CK_LE, fRES(hanumwt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwtList The collection of hanumwt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_InScope(Collection<String> hanumwtList) {
        doSetHanumwt_InScope(hanumwtList);
    }

    protected void doSetHanumwt_InScope(Collection<String> hanumwtList) {
        regINS(CK_INS, cTL(hanumwtList), xgetCValueHanumwt(), "HANUMWT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwtList The collection of hanumwt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_NotInScope(Collection<String> hanumwtList) {
        doSetHanumwt_NotInScope(hanumwtList);
    }

    protected void doSetHanumwt_NotInScope(Collection<String> hanumwtList) {
        regINS(CK_NINS, cTL(hanumwtList), xgetCValueHanumwt(), "HANUMWT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANUMWT: {varchar(255)} <br>
     * <pre>e.g. setHanumwt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hanumwt The value of hanumwt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHanumwt_LikeSearch(String hanumwt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hanumwt), xgetCValueHanumwt(), "HANUMWT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHanumwt_NotLikeSearch(String hanumwt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hanumwt), xgetCValueHanumwt(), "HANUMWT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANUMWT: {varchar(255)}
     * @param hanumwt The value of hanumwt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHanumwt_PrefixSearch(String hanumwt) {
        setHanumwt_LikeSearch(hanumwt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     */
    public void setHanumwt_IsNull() { regHanumwt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     */
    public void setHanumwt_IsNullOrEmpty() { regHanumwt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HANUMWT: {varchar(255)}
     */
    public void setHanumwt_IsNotNull() { regHanumwt(CK_ISNN, DOBJ); }

    protected void regHanumwt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHanumwt(), "HANUMWT"); }
    protected abstract ConditionValue xgetCValueHanumwt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_Equal(String cnscvct) {
        doSetCnscvct_Equal(fRES(cnscvct));
    }

    protected void doSetCnscvct_Equal(String cnscvct) {
        regCnscvct(CK_EQ, cnscvct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_NotEqual(String cnscvct) {
        doSetCnscvct_NotEqual(fRES(cnscvct));
    }

    protected void doSetCnscvct_NotEqual(String cnscvct) {
        regCnscvct(CK_NES, cnscvct);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_GreaterThan(String cnscvct) {
        regCnscvct(CK_GT, fRES(cnscvct));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_LessThan(String cnscvct) {
        regCnscvct(CK_LT, fRES(cnscvct));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_GreaterEqual(String cnscvct) {
        regCnscvct(CK_GE, fRES(cnscvct));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_LessEqual(String cnscvct) {
        regCnscvct(CK_LE, fRES(cnscvct));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvctList The collection of cnscvct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_InScope(Collection<String> cnscvctList) {
        doSetCnscvct_InScope(cnscvctList);
    }

    protected void doSetCnscvct_InScope(Collection<String> cnscvctList) {
        regINS(CK_INS, cTL(cnscvctList), xgetCValueCnscvct(), "CNSCVCT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvctList The collection of cnscvct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_NotInScope(Collection<String> cnscvctList) {
        doSetCnscvct_NotInScope(cnscvctList);
    }

    protected void doSetCnscvct_NotInScope(Collection<String> cnscvctList) {
        regINS(CK_NINS, cTL(cnscvctList), xgetCValueCnscvct(), "CNSCVCT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNSCVCT: {varchar(255)} <br>
     * <pre>e.g. setCnscvct_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cnscvct The value of cnscvct as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCnscvct_LikeSearch(String cnscvct, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cnscvct), xgetCValueCnscvct(), "CNSCVCT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCnscvct_NotLikeSearch(String cnscvct, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cnscvct), xgetCValueCnscvct(), "CNSCVCT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNSCVCT: {varchar(255)}
     * @param cnscvct The value of cnscvct as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCnscvct_PrefixSearch(String cnscvct) {
        setCnscvct_LikeSearch(cnscvct, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     */
    public void setCnscvct_IsNull() { regCnscvct(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     */
    public void setCnscvct_IsNullOrEmpty() { regCnscvct(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNSCVCT: {varchar(255)}
     */
    public void setCnscvct_IsNotNull() { regCnscvct(CK_ISNN, DOBJ); }

    protected void regCnscvct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCnscvct(), "CNSCVCT"); }
    protected abstract ConditionValue xgetCValueCnscvct();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_Equal(String cgtaxcct) {
        doSetCgtaxcct_Equal(fRES(cgtaxcct));
    }

    protected void doSetCgtaxcct_Equal(String cgtaxcct) {
        regCgtaxcct(CK_EQ, cgtaxcct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_NotEqual(String cgtaxcct) {
        doSetCgtaxcct_NotEqual(fRES(cgtaxcct));
    }

    protected void doSetCgtaxcct_NotEqual(String cgtaxcct) {
        regCgtaxcct(CK_NES, cgtaxcct);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_GreaterThan(String cgtaxcct) {
        regCgtaxcct(CK_GT, fRES(cgtaxcct));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_LessThan(String cgtaxcct) {
        regCgtaxcct(CK_LT, fRES(cgtaxcct));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_GreaterEqual(String cgtaxcct) {
        regCgtaxcct(CK_GE, fRES(cgtaxcct));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_LessEqual(String cgtaxcct) {
        regCgtaxcct(CK_LE, fRES(cgtaxcct));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcctList The collection of cgtaxcct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_InScope(Collection<String> cgtaxcctList) {
        doSetCgtaxcct_InScope(cgtaxcctList);
    }

    protected void doSetCgtaxcct_InScope(Collection<String> cgtaxcctList) {
        regINS(CK_INS, cTL(cgtaxcctList), xgetCValueCgtaxcct(), "CGTAXCCT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcctList The collection of cgtaxcct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_NotInScope(Collection<String> cgtaxcctList) {
        doSetCgtaxcct_NotInScope(cgtaxcctList);
    }

    protected void doSetCgtaxcct_NotInScope(Collection<String> cgtaxcctList) {
        regINS(CK_NINS, cTL(cgtaxcctList), xgetCValueCgtaxcct(), "CGTAXCCT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGTAXCCT: {varchar(255)} <br>
     * <pre>e.g. setCgtaxcct_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cgtaxcct The value of cgtaxcct as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCgtaxcct_LikeSearch(String cgtaxcct, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cgtaxcct), xgetCValueCgtaxcct(), "CGTAXCCT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCgtaxcct_NotLikeSearch(String cgtaxcct, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cgtaxcct), xgetCValueCgtaxcct(), "CGTAXCCT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     * @param cgtaxcct The value of cgtaxcct as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgtaxcct_PrefixSearch(String cgtaxcct) {
        setCgtaxcct_LikeSearch(cgtaxcct, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     */
    public void setCgtaxcct_IsNull() { regCgtaxcct(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     */
    public void setCgtaxcct_IsNullOrEmpty() { regCgtaxcct(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGTAXCCT: {varchar(255)}
     */
    public void setCgtaxcct_IsNotNull() { regCgtaxcct(CK_ISNN, DOBJ); }

    protected void regCgtaxcct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCgtaxcct(), "CGTAXCCT"); }
    protected abstract ConditionValue xgetCValueCgtaxcct();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_Equal(String ntxqart) {
        doSetNtxqart_Equal(fRES(ntxqart));
    }

    protected void doSetNtxqart_Equal(String ntxqart) {
        regNtxqart(CK_EQ, ntxqart);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_NotEqual(String ntxqart) {
        doSetNtxqart_NotEqual(fRES(ntxqart));
    }

    protected void doSetNtxqart_NotEqual(String ntxqart) {
        regNtxqart(CK_NES, ntxqart);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_GreaterThan(String ntxqart) {
        regNtxqart(CK_GT, fRES(ntxqart));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_LessThan(String ntxqart) {
        regNtxqart(CK_LT, fRES(ntxqart));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_GreaterEqual(String ntxqart) {
        regNtxqart(CK_GE, fRES(ntxqart));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_LessEqual(String ntxqart) {
        regNtxqart(CK_LE, fRES(ntxqart));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqartList The collection of ntxqart as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_InScope(Collection<String> ntxqartList) {
        doSetNtxqart_InScope(ntxqartList);
    }

    protected void doSetNtxqart_InScope(Collection<String> ntxqartList) {
        regINS(CK_INS, cTL(ntxqartList), xgetCValueNtxqart(), "NTXQART");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqartList The collection of ntxqart as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_NotInScope(Collection<String> ntxqartList) {
        doSetNtxqart_NotInScope(ntxqartList);
    }

    protected void doSetNtxqart_NotInScope(Collection<String> ntxqartList) {
        regINS(CK_NINS, cTL(ntxqartList), xgetCValueNtxqart(), "NTXQART");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NTXQART: {varchar(255)} <br>
     * <pre>e.g. setNtxqart_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ntxqart The value of ntxqart as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNtxqart_LikeSearch(String ntxqart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ntxqart), xgetCValueNtxqart(), "NTXQART", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNtxqart_NotLikeSearch(String ntxqart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ntxqart), xgetCValueNtxqart(), "NTXQART", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NTXQART: {varchar(255)}
     * @param ntxqart The value of ntxqart as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNtxqart_PrefixSearch(String ntxqart) {
        setNtxqart_LikeSearch(ntxqart, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     */
    public void setNtxqart_IsNull() { regNtxqart(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     */
    public void setNtxqart_IsNullOrEmpty() { regNtxqart(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NTXQART: {varchar(255)}
     */
    public void setNtxqart_IsNotNull() { regNtxqart(CK_ISNN, DOBJ); }

    protected void regNtxqart(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNtxqart(), "NTXQART"); }
    protected abstract ConditionValue xgetCValueNtxqart();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_Equal(String ltxqart) {
        doSetLtxqart_Equal(fRES(ltxqart));
    }

    protected void doSetLtxqart_Equal(String ltxqart) {
        regLtxqart(CK_EQ, ltxqart);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_NotEqual(String ltxqart) {
        doSetLtxqart_NotEqual(fRES(ltxqart));
    }

    protected void doSetLtxqart_NotEqual(String ltxqart) {
        regLtxqart(CK_NES, ltxqart);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_GreaterThan(String ltxqart) {
        regLtxqart(CK_GT, fRES(ltxqart));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_LessThan(String ltxqart) {
        regLtxqart(CK_LT, fRES(ltxqart));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_GreaterEqual(String ltxqart) {
        regLtxqart(CK_GE, fRES(ltxqart));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_LessEqual(String ltxqart) {
        regLtxqart(CK_LE, fRES(ltxqart));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqartList The collection of ltxqart as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_InScope(Collection<String> ltxqartList) {
        doSetLtxqart_InScope(ltxqartList);
    }

    protected void doSetLtxqart_InScope(Collection<String> ltxqartList) {
        regINS(CK_INS, cTL(ltxqartList), xgetCValueLtxqart(), "LTXQART");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqartList The collection of ltxqart as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_NotInScope(Collection<String> ltxqartList) {
        doSetLtxqart_NotInScope(ltxqartList);
    }

    protected void doSetLtxqart_NotInScope(Collection<String> ltxqartList) {
        regINS(CK_NINS, cTL(ltxqartList), xgetCValueLtxqart(), "LTXQART");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LTXQART: {varchar(255)} <br>
     * <pre>e.g. setLtxqart_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ltxqart The value of ltxqart as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLtxqart_LikeSearch(String ltxqart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ltxqart), xgetCValueLtxqart(), "LTXQART", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLtxqart_NotLikeSearch(String ltxqart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ltxqart), xgetCValueLtxqart(), "LTXQART", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LTXQART: {varchar(255)}
     * @param ltxqart The value of ltxqart as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLtxqart_PrefixSearch(String ltxqart) {
        setLtxqart_LikeSearch(ltxqart, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     */
    public void setLtxqart_IsNull() { regLtxqart(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     */
    public void setLtxqart_IsNullOrEmpty() { regLtxqart(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LTXQART: {varchar(255)}
     */
    public void setLtxqart_IsNotNull() { regLtxqart(CK_ISNN, DOBJ); }

    protected void regLtxqart(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLtxqart(), "LTXQART"); }
    protected abstract ConditionValue xgetCValueLtxqart();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_Equal(String advtaxrt) {
        doSetAdvtaxrt_Equal(fRES(advtaxrt));
    }

    protected void doSetAdvtaxrt_Equal(String advtaxrt) {
        regAdvtaxrt(CK_EQ, advtaxrt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_NotEqual(String advtaxrt) {
        doSetAdvtaxrt_NotEqual(fRES(advtaxrt));
    }

    protected void doSetAdvtaxrt_NotEqual(String advtaxrt) {
        regAdvtaxrt(CK_NES, advtaxrt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_GreaterThan(String advtaxrt) {
        regAdvtaxrt(CK_GT, fRES(advtaxrt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_LessThan(String advtaxrt) {
        regAdvtaxrt(CK_LT, fRES(advtaxrt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_GreaterEqual(String advtaxrt) {
        regAdvtaxrt(CK_GE, fRES(advtaxrt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_LessEqual(String advtaxrt) {
        regAdvtaxrt(CK_LE, fRES(advtaxrt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrtList The collection of advtaxrt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_InScope(Collection<String> advtaxrtList) {
        doSetAdvtaxrt_InScope(advtaxrtList);
    }

    protected void doSetAdvtaxrt_InScope(Collection<String> advtaxrtList) {
        regINS(CK_INS, cTL(advtaxrtList), xgetCValueAdvtaxrt(), "ADVTAXRT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrtList The collection of advtaxrt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_NotInScope(Collection<String> advtaxrtList) {
        doSetAdvtaxrt_NotInScope(advtaxrtList);
    }

    protected void doSetAdvtaxrt_NotInScope(Collection<String> advtaxrtList) {
        regINS(CK_NINS, cTL(advtaxrtList), xgetCValueAdvtaxrt(), "ADVTAXRT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVTAXRT: {varchar(255)} <br>
     * <pre>e.g. setAdvtaxrt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param advtaxrt The value of advtaxrt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdvtaxrt_LikeSearch(String advtaxrt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(advtaxrt), xgetCValueAdvtaxrt(), "ADVTAXRT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdvtaxrt_NotLikeSearch(String advtaxrt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(advtaxrt), xgetCValueAdvtaxrt(), "ADVTAXRT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     * @param advtaxrt The value of advtaxrt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdvtaxrt_PrefixSearch(String advtaxrt) {
        setAdvtaxrt_LikeSearch(advtaxrt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     */
    public void setAdvtaxrt_IsNull() { regAdvtaxrt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     */
    public void setAdvtaxrt_IsNullOrEmpty() { regAdvtaxrt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADVTAXRT: {varchar(255)}
     */
    public void setAdvtaxrt_IsNotNull() { regAdvtaxrt(CK_ISNN, DOBJ); }

    protected void regAdvtaxrt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdvtaxrt(), "ADVTAXRT"); }
    protected abstract ConditionValue xgetCValueAdvtaxrt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_Equal(String ctytaxrt) {
        doSetCtytaxrt_Equal(fRES(ctytaxrt));
    }

    protected void doSetCtytaxrt_Equal(String ctytaxrt) {
        regCtytaxrt(CK_EQ, ctytaxrt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_NotEqual(String ctytaxrt) {
        doSetCtytaxrt_NotEqual(fRES(ctytaxrt));
    }

    protected void doSetCtytaxrt_NotEqual(String ctytaxrt) {
        regCtytaxrt(CK_NES, ctytaxrt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_GreaterThan(String ctytaxrt) {
        regCtytaxrt(CK_GT, fRES(ctytaxrt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_LessThan(String ctytaxrt) {
        regCtytaxrt(CK_LT, fRES(ctytaxrt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_GreaterEqual(String ctytaxrt) {
        regCtytaxrt(CK_GE, fRES(ctytaxrt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_LessEqual(String ctytaxrt) {
        regCtytaxrt(CK_LE, fRES(ctytaxrt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrtList The collection of ctytaxrt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_InScope(Collection<String> ctytaxrtList) {
        doSetCtytaxrt_InScope(ctytaxrtList);
    }

    protected void doSetCtytaxrt_InScope(Collection<String> ctytaxrtList) {
        regINS(CK_INS, cTL(ctytaxrtList), xgetCValueCtytaxrt(), "CTYTAXRT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrtList The collection of ctytaxrt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_NotInScope(Collection<String> ctytaxrtList) {
        doSetCtytaxrt_NotInScope(ctytaxrtList);
    }

    protected void doSetCtytaxrt_NotInScope(Collection<String> ctytaxrtList) {
        regINS(CK_NINS, cTL(ctytaxrtList), xgetCValueCtytaxrt(), "CTYTAXRT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTYTAXRT: {varchar(255)} <br>
     * <pre>e.g. setCtytaxrt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctytaxrt The value of ctytaxrt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtytaxrt_LikeSearch(String ctytaxrt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctytaxrt), xgetCValueCtytaxrt(), "CTYTAXRT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtytaxrt_NotLikeSearch(String ctytaxrt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctytaxrt), xgetCValueCtytaxrt(), "CTYTAXRT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     * @param ctytaxrt The value of ctytaxrt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtytaxrt_PrefixSearch(String ctytaxrt) {
        setCtytaxrt_LikeSearch(ctytaxrt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     */
    public void setCtytaxrt_IsNull() { regCtytaxrt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     */
    public void setCtytaxrt_IsNullOrEmpty() { regCtytaxrt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTYTAXRT: {varchar(255)}
     */
    public void setCtytaxrt_IsNotNull() { regCtytaxrt(CK_ISNN, DOBJ); }

    protected void regCtytaxrt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtytaxrt(), "CTYTAXRT"); }
    protected abstract ConditionValue xgetCValueCtytaxrt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_Equal(String prfprt) {
        doSetPrfprt_Equal(fRES(prfprt));
    }

    protected void doSetPrfprt_Equal(String prfprt) {
        regPrfprt(CK_EQ, prfprt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_NotEqual(String prfprt) {
        doSetPrfprt_NotEqual(fRES(prfprt));
    }

    protected void doSetPrfprt_NotEqual(String prfprt) {
        regPrfprt(CK_NES, prfprt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_GreaterThan(String prfprt) {
        regPrfprt(CK_GT, fRES(prfprt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_LessThan(String prfprt) {
        regPrfprt(CK_LT, fRES(prfprt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_GreaterEqual(String prfprt) {
        regPrfprt(CK_GE, fRES(prfprt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_LessEqual(String prfprt) {
        regPrfprt(CK_LE, fRES(prfprt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprtList The collection of prfprt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_InScope(Collection<String> prfprtList) {
        doSetPrfprt_InScope(prfprtList);
    }

    protected void doSetPrfprt_InScope(Collection<String> prfprtList) {
        regINS(CK_INS, cTL(prfprtList), xgetCValuePrfprt(), "PRFPRT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprtList The collection of prfprt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_NotInScope(Collection<String> prfprtList) {
        doSetPrfprt_NotInScope(prfprtList);
    }

    protected void doSetPrfprt_NotInScope(Collection<String> prfprtList) {
        regINS(CK_NINS, cTL(prfprtList), xgetCValuePrfprt(), "PRFPRT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRFPRT: {varchar(255)} <br>
     * <pre>e.g. setPrfprt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prfprt The value of prfprt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrfprt_LikeSearch(String prfprt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prfprt), xgetCValuePrfprt(), "PRFPRT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrfprt_NotLikeSearch(String prfprt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prfprt), xgetCValuePrfprt(), "PRFPRT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRFPRT: {varchar(255)}
     * @param prfprt The value of prfprt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrfprt_PrefixSearch(String prfprt) {
        setPrfprt_LikeSearch(prfprt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     */
    public void setPrfprt_IsNull() { regPrfprt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     */
    public void setPrfprt_IsNullOrEmpty() { regPrfprt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRFPRT: {varchar(255)}
     */
    public void setPrfprt_IsNotNull() { regPrfprt(CK_ISNN, DOBJ); }

    protected void regPrfprt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrfprt(), "PRFPRT"); }
    protected abstract ConditionValue xgetCValuePrfprt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_Equal(String notax) {
        doSetNotax_Equal(fRES(notax));
    }

    protected void doSetNotax_Equal(String notax) {
        regNotax(CK_EQ, notax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_NotEqual(String notax) {
        doSetNotax_NotEqual(fRES(notax));
    }

    protected void doSetNotax_NotEqual(String notax) {
        regNotax(CK_NES, notax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_GreaterThan(String notax) {
        regNotax(CK_GT, fRES(notax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_LessThan(String notax) {
        regNotax(CK_LT, fRES(notax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_GreaterEqual(String notax) {
        regNotax(CK_GE, fRES(notax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_LessEqual(String notax) {
        regNotax(CK_LE, fRES(notax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notaxList The collection of notax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_InScope(Collection<String> notaxList) {
        doSetNotax_InScope(notaxList);
    }

    protected void doSetNotax_InScope(Collection<String> notaxList) {
        regINS(CK_INS, cTL(notaxList), xgetCValueNotax(), "NOTAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notaxList The collection of notax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_NotInScope(Collection<String> notaxList) {
        doSetNotax_NotInScope(notaxList);
    }

    protected void doSetNotax_NotInScope(Collection<String> notaxList) {
        regINS(CK_NINS, cTL(notaxList), xgetCValueNotax(), "NOTAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTAX: {varchar(255)} <br>
     * <pre>e.g. setNotax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notax The value of notax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotax_LikeSearch(String notax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notax), xgetCValueNotax(), "NOTAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotax_NotLikeSearch(String notax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notax), xgetCValueNotax(), "NOTAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTAX: {varchar(255)}
     * @param notax The value of notax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotax_PrefixSearch(String notax) {
        setNotax_LikeSearch(notax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     */
    public void setNotax_IsNull() { regNotax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     */
    public void setNotax_IsNullOrEmpty() { regNotax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTAX: {varchar(255)}
     */
    public void setNotax_IsNotNull() { regNotax(CK_ISNN, DOBJ); }

    protected void regNotax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotax(), "NOTAX"); }
    protected abstract ConditionValue xgetCValueNotax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_Equal(String brkd) {
        doSetBrkd_Equal(fRES(brkd));
    }

    protected void doSetBrkd_Equal(String brkd) {
        regBrkd(CK_EQ, brkd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_NotEqual(String brkd) {
        doSetBrkd_NotEqual(fRES(brkd));
    }

    protected void doSetBrkd_NotEqual(String brkd) {
        regBrkd(CK_NES, brkd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_GreaterThan(String brkd) {
        regBrkd(CK_GT, fRES(brkd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_LessThan(String brkd) {
        regBrkd(CK_LT, fRES(brkd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_GreaterEqual(String brkd) {
        regBrkd(CK_GE, fRES(brkd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_LessEqual(String brkd) {
        regBrkd(CK_LE, fRES(brkd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkdList The collection of brkd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_InScope(Collection<String> brkdList) {
        doSetBrkd_InScope(brkdList);
    }

    protected void doSetBrkd_InScope(Collection<String> brkdList) {
        regINS(CK_INS, cTL(brkdList), xgetCValueBrkd(), "BRKD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkdList The collection of brkd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_NotInScope(Collection<String> brkdList) {
        doSetBrkd_NotInScope(brkdList);
    }

    protected void doSetBrkd_NotInScope(Collection<String> brkdList) {
        regINS(CK_NINS, cTL(brkdList), xgetCValueBrkd(), "BRKD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKD: {varchar(255)} <br>
     * <pre>e.g. setBrkd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brkd The value of brkd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrkd_LikeSearch(String brkd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brkd), xgetCValueBrkd(), "BRKD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrkd_NotLikeSearch(String brkd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brkd), xgetCValueBrkd(), "BRKD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRKD: {varchar(255)}
     * @param brkd The value of brkd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrkd_PrefixSearch(String brkd) {
        setBrkd_LikeSearch(brkd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     */
    public void setBrkd_IsNull() { regBrkd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     */
    public void setBrkd_IsNullOrEmpty() { regBrkd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRKD: {varchar(255)}
     */
    public void setBrkd_IsNotNull() { regBrkd(CK_ISNN, DOBJ); }

    protected void regBrkd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrkd(), "BRKD"); }
    protected abstract ConditionValue xgetCValueBrkd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_Equal(String fmlycd) {
        doSetFmlycd_Equal(fRES(fmlycd));
    }

    protected void doSetFmlycd_Equal(String fmlycd) {
        regFmlycd(CK_EQ, fmlycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_NotEqual(String fmlycd) {
        doSetFmlycd_NotEqual(fRES(fmlycd));
    }

    protected void doSetFmlycd_NotEqual(String fmlycd) {
        regFmlycd(CK_NES, fmlycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_GreaterThan(String fmlycd) {
        regFmlycd(CK_GT, fRES(fmlycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_LessThan(String fmlycd) {
        regFmlycd(CK_LT, fRES(fmlycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_GreaterEqual(String fmlycd) {
        regFmlycd(CK_GE, fRES(fmlycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_LessEqual(String fmlycd) {
        regFmlycd(CK_LE, fRES(fmlycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycdList The collection of fmlycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_InScope(Collection<String> fmlycdList) {
        doSetFmlycd_InScope(fmlycdList);
    }

    protected void doSetFmlycd_InScope(Collection<String> fmlycdList) {
        regINS(CK_INS, cTL(fmlycdList), xgetCValueFmlycd(), "FMLYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycdList The collection of fmlycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_NotInScope(Collection<String> fmlycdList) {
        doSetFmlycd_NotInScope(fmlycdList);
    }

    protected void doSetFmlycd_NotInScope(Collection<String> fmlycdList) {
        regINS(CK_NINS, cTL(fmlycdList), xgetCValueFmlycd(), "FMLYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FMLYCD: {varchar(255)} <br>
     * <pre>e.g. setFmlycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fmlycd The value of fmlycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFmlycd_LikeSearch(String fmlycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fmlycd), xgetCValueFmlycd(), "FMLYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFmlycd_NotLikeSearch(String fmlycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fmlycd), xgetCValueFmlycd(), "FMLYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FMLYCD: {varchar(255)}
     * @param fmlycd The value of fmlycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFmlycd_PrefixSearch(String fmlycd) {
        setFmlycd_LikeSearch(fmlycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     */
    public void setFmlycd_IsNull() { regFmlycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     */
    public void setFmlycd_IsNullOrEmpty() { regFmlycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FMLYCD: {varchar(255)}
     */
    public void setFmlycd_IsNotNull() { regFmlycd(CK_ISNN, DOBJ); }

    protected void regFmlycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFmlycd(), "FMLYCD"); }
    protected abstract ConditionValue xgetCValueFmlycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_Equal(String prgrcd) {
        doSetPrgrcd_Equal(fRES(prgrcd));
    }

    protected void doSetPrgrcd_Equal(String prgrcd) {
        regPrgrcd(CK_EQ, prgrcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_NotEqual(String prgrcd) {
        doSetPrgrcd_NotEqual(fRES(prgrcd));
    }

    protected void doSetPrgrcd_NotEqual(String prgrcd) {
        regPrgrcd(CK_NES, prgrcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_GreaterThan(String prgrcd) {
        regPrgrcd(CK_GT, fRES(prgrcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_LessThan(String prgrcd) {
        regPrgrcd(CK_LT, fRES(prgrcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_GreaterEqual(String prgrcd) {
        regPrgrcd(CK_GE, fRES(prgrcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_LessEqual(String prgrcd) {
        regPrgrcd(CK_LE, fRES(prgrcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcdList The collection of prgrcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_InScope(Collection<String> prgrcdList) {
        doSetPrgrcd_InScope(prgrcdList);
    }

    protected void doSetPrgrcd_InScope(Collection<String> prgrcdList) {
        regINS(CK_INS, cTL(prgrcdList), xgetCValuePrgrcd(), "PRGRCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcdList The collection of prgrcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_NotInScope(Collection<String> prgrcdList) {
        doSetPrgrcd_NotInScope(prgrcdList);
    }

    protected void doSetPrgrcd_NotInScope(Collection<String> prgrcdList) {
        regINS(CK_NINS, cTL(prgrcdList), xgetCValuePrgrcd(), "PRGRCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRGRCD: {varchar(255)} <br>
     * <pre>e.g. setPrgrcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prgrcd The value of prgrcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrgrcd_LikeSearch(String prgrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prgrcd), xgetCValuePrgrcd(), "PRGRCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrgrcd_NotLikeSearch(String prgrcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prgrcd), xgetCValuePrgrcd(), "PRGRCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRGRCD: {varchar(255)}
     * @param prgrcd The value of prgrcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrgrcd_PrefixSearch(String prgrcd) {
        setPrgrcd_LikeSearch(prgrcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     */
    public void setPrgrcd_IsNull() { regPrgrcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     */
    public void setPrgrcd_IsNullOrEmpty() { regPrgrcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRGRCD: {varchar(255)}
     */
    public void setPrgrcd_IsNotNull() { regPrgrcd(CK_ISNN, DOBJ); }

    protected void regPrgrcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrgrcd(), "PRGRCD"); }
    protected abstract ConditionValue xgetCValuePrgrcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_Equal(String nctncls) {
        doSetNctncls_Equal(fRES(nctncls));
    }

    protected void doSetNctncls_Equal(String nctncls) {
        regNctncls(CK_EQ, nctncls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_NotEqual(String nctncls) {
        doSetNctncls_NotEqual(fRES(nctncls));
    }

    protected void doSetNctncls_NotEqual(String nctncls) {
        regNctncls(CK_NES, nctncls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_GreaterThan(String nctncls) {
        regNctncls(CK_GT, fRES(nctncls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_LessThan(String nctncls) {
        regNctncls(CK_LT, fRES(nctncls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_GreaterEqual(String nctncls) {
        regNctncls(CK_GE, fRES(nctncls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_LessEqual(String nctncls) {
        regNctncls(CK_LE, fRES(nctncls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctnclsList The collection of nctncls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_InScope(Collection<String> nctnclsList) {
        doSetNctncls_InScope(nctnclsList);
    }

    protected void doSetNctncls_InScope(Collection<String> nctnclsList) {
        regINS(CK_INS, cTL(nctnclsList), xgetCValueNctncls(), "NCTNCLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctnclsList The collection of nctncls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_NotInScope(Collection<String> nctnclsList) {
        doSetNctncls_NotInScope(nctnclsList);
    }

    protected void doSetNctncls_NotInScope(Collection<String> nctnclsList) {
        regINS(CK_NINS, cTL(nctnclsList), xgetCValueNctncls(), "NCTNCLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NCTNCLS: {varchar(255)} <br>
     * <pre>e.g. setNctncls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nctncls The value of nctncls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNctncls_LikeSearch(String nctncls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nctncls), xgetCValueNctncls(), "NCTNCLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNctncls_NotLikeSearch(String nctncls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nctncls), xgetCValueNctncls(), "NCTNCLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NCTNCLS: {varchar(255)}
     * @param nctncls The value of nctncls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNctncls_PrefixSearch(String nctncls) {
        setNctncls_LikeSearch(nctncls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     */
    public void setNctncls_IsNull() { regNctncls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     */
    public void setNctncls_IsNullOrEmpty() { regNctncls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NCTNCLS: {varchar(255)}
     */
    public void setNctncls_IsNotNull() { regNctncls(CK_ISNN, DOBJ); }

    protected void regNctncls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNctncls(), "NCTNCLS"); }
    protected abstract ConditionValue xgetCValueNctncls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_Equal(String tarcls) {
        doSetTarcls_Equal(fRES(tarcls));
    }

    protected void doSetTarcls_Equal(String tarcls) {
        regTarcls(CK_EQ, tarcls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_NotEqual(String tarcls) {
        doSetTarcls_NotEqual(fRES(tarcls));
    }

    protected void doSetTarcls_NotEqual(String tarcls) {
        regTarcls(CK_NES, tarcls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_GreaterThan(String tarcls) {
        regTarcls(CK_GT, fRES(tarcls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_LessThan(String tarcls) {
        regTarcls(CK_LT, fRES(tarcls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_GreaterEqual(String tarcls) {
        regTarcls(CK_GE, fRES(tarcls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_LessEqual(String tarcls) {
        regTarcls(CK_LE, fRES(tarcls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarclsList The collection of tarcls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_InScope(Collection<String> tarclsList) {
        doSetTarcls_InScope(tarclsList);
    }

    protected void doSetTarcls_InScope(Collection<String> tarclsList) {
        regINS(CK_INS, cTL(tarclsList), xgetCValueTarcls(), "TARCLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarclsList The collection of tarcls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_NotInScope(Collection<String> tarclsList) {
        doSetTarcls_NotInScope(tarclsList);
    }

    protected void doSetTarcls_NotInScope(Collection<String> tarclsList) {
        regINS(CK_NINS, cTL(tarclsList), xgetCValueTarcls(), "TARCLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARCLS: {varchar(255)} <br>
     * <pre>e.g. setTarcls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tarcls The value of tarcls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTarcls_LikeSearch(String tarcls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tarcls), xgetCValueTarcls(), "TARCLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTarcls_NotLikeSearch(String tarcls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tarcls), xgetCValueTarcls(), "TARCLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARCLS: {varchar(255)}
     * @param tarcls The value of tarcls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTarcls_PrefixSearch(String tarcls) {
        setTarcls_LikeSearch(tarcls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     */
    public void setTarcls_IsNull() { regTarcls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     */
    public void setTarcls_IsNullOrEmpty() { regTarcls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TARCLS: {varchar(255)}
     */
    public void setTarcls_IsNotNull() { regTarcls(CK_ISNN, DOBJ); }

    protected void regTarcls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTarcls(), "TARCLS"); }
    protected abstract ConditionValue xgetCValueTarcls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_Equal(String pdpkspcd) {
        doSetPdpkspcd_Equal(fRES(pdpkspcd));
    }

    protected void doSetPdpkspcd_Equal(String pdpkspcd) {
        regPdpkspcd(CK_EQ, pdpkspcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_NotEqual(String pdpkspcd) {
        doSetPdpkspcd_NotEqual(fRES(pdpkspcd));
    }

    protected void doSetPdpkspcd_NotEqual(String pdpkspcd) {
        regPdpkspcd(CK_NES, pdpkspcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_GreaterThan(String pdpkspcd) {
        regPdpkspcd(CK_GT, fRES(pdpkspcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_LessThan(String pdpkspcd) {
        regPdpkspcd(CK_LT, fRES(pdpkspcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_GreaterEqual(String pdpkspcd) {
        regPdpkspcd(CK_GE, fRES(pdpkspcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_LessEqual(String pdpkspcd) {
        regPdpkspcd(CK_LE, fRES(pdpkspcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcdList The collection of pdpkspcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_InScope(Collection<String> pdpkspcdList) {
        doSetPdpkspcd_InScope(pdpkspcdList);
    }

    protected void doSetPdpkspcd_InScope(Collection<String> pdpkspcdList) {
        regINS(CK_INS, cTL(pdpkspcdList), xgetCValuePdpkspcd(), "PDPKSPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcdList The collection of pdpkspcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_NotInScope(Collection<String> pdpkspcdList) {
        doSetPdpkspcd_NotInScope(pdpkspcdList);
    }

    protected void doSetPdpkspcd_NotInScope(Collection<String> pdpkspcdList) {
        regINS(CK_NINS, cTL(pdpkspcdList), xgetCValuePdpkspcd(), "PDPKSPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDPKSPCD: {varchar(255)} <br>
     * <pre>e.g. setPdpkspcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pdpkspcd The value of pdpkspcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdpkspcd_LikeSearch(String pdpkspcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdpkspcd), xgetCValuePdpkspcd(), "PDPKSPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdpkspcd_NotLikeSearch(String pdpkspcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdpkspcd), xgetCValuePdpkspcd(), "PDPKSPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     * @param pdpkspcd The value of pdpkspcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPdpkspcd_PrefixSearch(String pdpkspcd) {
        setPdpkspcd_LikeSearch(pdpkspcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     */
    public void setPdpkspcd_IsNull() { regPdpkspcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     */
    public void setPdpkspcd_IsNullOrEmpty() { regPdpkspcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PDPKSPCD: {varchar(255)}
     */
    public void setPdpkspcd_IsNotNull() { regPdpkspcd(CK_ISNN, DOBJ); }

    protected void regPdpkspcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePdpkspcd(), "PDPKSPCD"); }
    protected abstract ConditionValue xgetCValuePdpkspcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_Equal(String fltid) {
        doSetFltid_Equal(fRES(fltid));
    }

    protected void doSetFltid_Equal(String fltid) {
        regFltid(CK_EQ, fltid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_NotEqual(String fltid) {
        doSetFltid_NotEqual(fRES(fltid));
    }

    protected void doSetFltid_NotEqual(String fltid) {
        regFltid(CK_NES, fltid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_GreaterThan(String fltid) {
        regFltid(CK_GT, fRES(fltid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_LessThan(String fltid) {
        regFltid(CK_LT, fRES(fltid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_GreaterEqual(String fltid) {
        regFltid(CK_GE, fRES(fltid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_LessEqual(String fltid) {
        regFltid(CK_LE, fRES(fltid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltidList The collection of fltid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_InScope(Collection<String> fltidList) {
        doSetFltid_InScope(fltidList);
    }

    protected void doSetFltid_InScope(Collection<String> fltidList) {
        regINS(CK_INS, cTL(fltidList), xgetCValueFltid(), "FLTID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltidList The collection of fltid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_NotInScope(Collection<String> fltidList) {
        doSetFltid_NotInScope(fltidList);
    }

    protected void doSetFltid_NotInScope(Collection<String> fltidList) {
        regINS(CK_NINS, cTL(fltidList), xgetCValueFltid(), "FLTID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLTID: {varchar(255)} <br>
     * <pre>e.g. setFltid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fltid The value of fltid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFltid_LikeSearch(String fltid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fltid), xgetCValueFltid(), "FLTID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFltid_NotLikeSearch(String fltid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fltid), xgetCValueFltid(), "FLTID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLTID: {varchar(255)}
     * @param fltid The value of fltid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFltid_PrefixSearch(String fltid) {
        setFltid_LikeSearch(fltid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     */
    public void setFltid_IsNull() { regFltid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     */
    public void setFltid_IsNullOrEmpty() { regFltid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLTID: {varchar(255)}
     */
    public void setFltid_IsNotNull() { regFltid(CK_ISNN, DOBJ); }

    protected void regFltid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFltid(), "FLTID"); }
    protected abstract ConditionValue xgetCValueFltid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_Equal(String ksubcdid) {
        doSetKsubcdid_Equal(fRES(ksubcdid));
    }

    protected void doSetKsubcdid_Equal(String ksubcdid) {
        regKsubcdid(CK_EQ, ksubcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_NotEqual(String ksubcdid) {
        doSetKsubcdid_NotEqual(fRES(ksubcdid));
    }

    protected void doSetKsubcdid_NotEqual(String ksubcdid) {
        regKsubcdid(CK_NES, ksubcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_GreaterThan(String ksubcdid) {
        regKsubcdid(CK_GT, fRES(ksubcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_LessThan(String ksubcdid) {
        regKsubcdid(CK_LT, fRES(ksubcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_GreaterEqual(String ksubcdid) {
        regKsubcdid(CK_GE, fRES(ksubcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_LessEqual(String ksubcdid) {
        regKsubcdid(CK_LE, fRES(ksubcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdidList The collection of ksubcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_InScope(Collection<String> ksubcdidList) {
        doSetKsubcdid_InScope(ksubcdidList);
    }

    protected void doSetKsubcdid_InScope(Collection<String> ksubcdidList) {
        regINS(CK_INS, cTL(ksubcdidList), xgetCValueKsubcdid(), "KSUBCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdidList The collection of ksubcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_NotInScope(Collection<String> ksubcdidList) {
        doSetKsubcdid_NotInScope(ksubcdidList);
    }

    protected void doSetKsubcdid_NotInScope(Collection<String> ksubcdidList) {
        regINS(CK_NINS, cTL(ksubcdidList), xgetCValueKsubcdid(), "KSUBCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCDID: {varchar(255)} <br>
     * <pre>e.g. setKsubcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ksubcdid The value of ksubcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKsubcdid_LikeSearch(String ksubcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ksubcdid), xgetCValueKsubcdid(), "KSUBCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKsubcdid_NotLikeSearch(String ksubcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ksubcdid), xgetCValueKsubcdid(), "KSUBCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCDID: {varchar(255)}
     * @param ksubcdid The value of ksubcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcdid_PrefixSearch(String ksubcdid) {
        setKsubcdid_LikeSearch(ksubcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     */
    public void setKsubcdid_IsNull() { regKsubcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     */
    public void setKsubcdid_IsNullOrEmpty() { regKsubcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KSUBCDID: {varchar(255)}
     */
    public void setKsubcdid_IsNotNull() { regKsubcdid(CK_ISNN, DOBJ); }

    protected void regKsubcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKsubcdid(), "KSUBCDID"); }
    protected abstract ConditionValue xgetCValueKsubcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_Equal(String ksubcd) {
        doSetKsubcd_Equal(fRES(ksubcd));
    }

    protected void doSetKsubcd_Equal(String ksubcd) {
        regKsubcd(CK_EQ, ksubcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_NotEqual(String ksubcd) {
        doSetKsubcd_NotEqual(fRES(ksubcd));
    }

    protected void doSetKsubcd_NotEqual(String ksubcd) {
        regKsubcd(CK_NES, ksubcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_GreaterThan(String ksubcd) {
        regKsubcd(CK_GT, fRES(ksubcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_LessThan(String ksubcd) {
        regKsubcd(CK_LT, fRES(ksubcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_GreaterEqual(String ksubcd) {
        regKsubcd(CK_GE, fRES(ksubcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_LessEqual(String ksubcd) {
        regKsubcd(CK_LE, fRES(ksubcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcdList The collection of ksubcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_InScope(Collection<String> ksubcdList) {
        doSetKsubcd_InScope(ksubcdList);
    }

    protected void doSetKsubcd_InScope(Collection<String> ksubcdList) {
        regINS(CK_INS, cTL(ksubcdList), xgetCValueKsubcd(), "KSUBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcdList The collection of ksubcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_NotInScope(Collection<String> ksubcdList) {
        doSetKsubcd_NotInScope(ksubcdList);
    }

    protected void doSetKsubcd_NotInScope(Collection<String> ksubcdList) {
        regINS(CK_NINS, cTL(ksubcdList), xgetCValueKsubcd(), "KSUBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCD: {varchar(255)} <br>
     * <pre>e.g. setKsubcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ksubcd The value of ksubcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKsubcd_LikeSearch(String ksubcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ksubcd), xgetCValueKsubcd(), "KSUBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKsubcd_NotLikeSearch(String ksubcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ksubcd), xgetCValueKsubcd(), "KSUBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KSUBCD: {varchar(255)}
     * @param ksubcd The value of ksubcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKsubcd_PrefixSearch(String ksubcd) {
        setKsubcd_LikeSearch(ksubcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     */
    public void setKsubcd_IsNull() { regKsubcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     */
    public void setKsubcd_IsNullOrEmpty() { regKsubcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KSUBCD: {varchar(255)}
     */
    public void setKsubcd_IsNotNull() { regKsubcd(CK_ISNN, DOBJ); }

    protected void regKsubcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKsubcd(), "KSUBCD"); }
    protected abstract ConditionValue xgetCValueKsubcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_Equal(String ctbcdid) {
        doSetCtbcdid_Equal(fRES(ctbcdid));
    }

    protected void doSetCtbcdid_Equal(String ctbcdid) {
        regCtbcdid(CK_EQ, ctbcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_NotEqual(String ctbcdid) {
        doSetCtbcdid_NotEqual(fRES(ctbcdid));
    }

    protected void doSetCtbcdid_NotEqual(String ctbcdid) {
        regCtbcdid(CK_NES, ctbcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_GreaterThan(String ctbcdid) {
        regCtbcdid(CK_GT, fRES(ctbcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_LessThan(String ctbcdid) {
        regCtbcdid(CK_LT, fRES(ctbcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_GreaterEqual(String ctbcdid) {
        regCtbcdid(CK_GE, fRES(ctbcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_LessEqual(String ctbcdid) {
        regCtbcdid(CK_LE, fRES(ctbcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdidList The collection of ctbcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_InScope(Collection<String> ctbcdidList) {
        doSetCtbcdid_InScope(ctbcdidList);
    }

    protected void doSetCtbcdid_InScope(Collection<String> ctbcdidList) {
        regINS(CK_INS, cTL(ctbcdidList), xgetCValueCtbcdid(), "CTBCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdidList The collection of ctbcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_NotInScope(Collection<String> ctbcdidList) {
        doSetCtbcdid_NotInScope(ctbcdidList);
    }

    protected void doSetCtbcdid_NotInScope(Collection<String> ctbcdidList) {
        regINS(CK_NINS, cTL(ctbcdidList), xgetCValueCtbcdid(), "CTBCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(255)} <br>
     * <pre>e.g. setCtbcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctbcdid The value of ctbcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtbcdid_LikeSearch(String ctbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctbcdid), xgetCValueCtbcdid(), "CTBCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtbcdid_NotLikeSearch(String ctbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctbcdid), xgetCValueCtbcdid(), "CTBCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(255)}
     * @param ctbcdid The value of ctbcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_PrefixSearch(String ctbcdid) {
        setCtbcdid_LikeSearch(ctbcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     */
    public void setCtbcdid_IsNull() { regCtbcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     */
    public void setCtbcdid_IsNullOrEmpty() { regCtbcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(255)}
     */
    public void setCtbcdid_IsNotNull() { regCtbcdid(CK_ISNN, DOBJ); }

    protected void regCtbcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtbcdid(), "CTBCDID"); }
    protected abstract ConditionValue xgetCValueCtbcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_Equal(String ctbcd) {
        doSetCtbcd_Equal(fRES(ctbcd));
    }

    protected void doSetCtbcd_Equal(String ctbcd) {
        regCtbcd(CK_EQ, ctbcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_NotEqual(String ctbcd) {
        doSetCtbcd_NotEqual(fRES(ctbcd));
    }

    protected void doSetCtbcd_NotEqual(String ctbcd) {
        regCtbcd(CK_NES, ctbcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_GreaterThan(String ctbcd) {
        regCtbcd(CK_GT, fRES(ctbcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_LessThan(String ctbcd) {
        regCtbcd(CK_LT, fRES(ctbcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_GreaterEqual(String ctbcd) {
        regCtbcd(CK_GE, fRES(ctbcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_LessEqual(String ctbcd) {
        regCtbcd(CK_LE, fRES(ctbcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcdList The collection of ctbcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_InScope(Collection<String> ctbcdList) {
        doSetCtbcd_InScope(ctbcdList);
    }

    protected void doSetCtbcd_InScope(Collection<String> ctbcdList) {
        regINS(CK_INS, cTL(ctbcdList), xgetCValueCtbcd(), "CTBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcdList The collection of ctbcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_NotInScope(Collection<String> ctbcdList) {
        doSetCtbcd_NotInScope(ctbcdList);
    }

    protected void doSetCtbcd_NotInScope(Collection<String> ctbcdList) {
        regINS(CK_NINS, cTL(ctbcdList), xgetCValueCtbcd(), "CTBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(255)} <br>
     * <pre>e.g. setCtbcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctbcd The value of ctbcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtbcd_LikeSearch(String ctbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctbcd), xgetCValueCtbcd(), "CTBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtbcd_NotLikeSearch(String ctbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctbcd), xgetCValueCtbcd(), "CTBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(255)}
     * @param ctbcd The value of ctbcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_PrefixSearch(String ctbcd) {
        setCtbcd_LikeSearch(ctbcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     */
    public void setCtbcd_IsNull() { regCtbcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     */
    public void setCtbcd_IsNullOrEmpty() { regCtbcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(255)}
     */
    public void setCtbcd_IsNotNull() { regCtbcd(CK_ISNN, DOBJ); }

    protected void regCtbcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtbcd(), "CTBCD"); }
    protected abstract ConditionValue xgetCValueCtbcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_Equal(String cbbcdid) {
        doSetCbbcdid_Equal(fRES(cbbcdid));
    }

    protected void doSetCbbcdid_Equal(String cbbcdid) {
        regCbbcdid(CK_EQ, cbbcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_NotEqual(String cbbcdid) {
        doSetCbbcdid_NotEqual(fRES(cbbcdid));
    }

    protected void doSetCbbcdid_NotEqual(String cbbcdid) {
        regCbbcdid(CK_NES, cbbcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_GreaterThan(String cbbcdid) {
        regCbbcdid(CK_GT, fRES(cbbcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_LessThan(String cbbcdid) {
        regCbbcdid(CK_LT, fRES(cbbcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_GreaterEqual(String cbbcdid) {
        regCbbcdid(CK_GE, fRES(cbbcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_LessEqual(String cbbcdid) {
        regCbbcdid(CK_LE, fRES(cbbcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdidList The collection of cbbcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_InScope(Collection<String> cbbcdidList) {
        doSetCbbcdid_InScope(cbbcdidList);
    }

    protected void doSetCbbcdid_InScope(Collection<String> cbbcdidList) {
        regINS(CK_INS, cTL(cbbcdidList), xgetCValueCbbcdid(), "CBBCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdidList The collection of cbbcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_NotInScope(Collection<String> cbbcdidList) {
        doSetCbbcdid_NotInScope(cbbcdidList);
    }

    protected void doSetCbbcdid_NotInScope(Collection<String> cbbcdidList) {
        regINS(CK_NINS, cTL(cbbcdidList), xgetCValueCbbcdid(), "CBBCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(255)} <br>
     * <pre>e.g. setCbbcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbbcdid The value of cbbcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbbcdid_LikeSearch(String cbbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbbcdid), xgetCValueCbbcdid(), "CBBCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbbcdid_NotLikeSearch(String cbbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbbcdid), xgetCValueCbbcdid(), "CBBCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(255)}
     * @param cbbcdid The value of cbbcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_PrefixSearch(String cbbcdid) {
        setCbbcdid_LikeSearch(cbbcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     */
    public void setCbbcdid_IsNull() { regCbbcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     */
    public void setCbbcdid_IsNullOrEmpty() { regCbbcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(255)}
     */
    public void setCbbcdid_IsNotNull() { regCbbcdid(CK_ISNN, DOBJ); }

    protected void regCbbcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbbcdid(), "CBBCDID"); }
    protected abstract ConditionValue xgetCValueCbbcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_Equal(String cbbcd) {
        doSetCbbcd_Equal(fRES(cbbcd));
    }

    protected void doSetCbbcd_Equal(String cbbcd) {
        regCbbcd(CK_EQ, cbbcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_NotEqual(String cbbcd) {
        doSetCbbcd_NotEqual(fRES(cbbcd));
    }

    protected void doSetCbbcd_NotEqual(String cbbcd) {
        regCbbcd(CK_NES, cbbcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_GreaterThan(String cbbcd) {
        regCbbcd(CK_GT, fRES(cbbcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_LessThan(String cbbcd) {
        regCbbcd(CK_LT, fRES(cbbcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_GreaterEqual(String cbbcd) {
        regCbbcd(CK_GE, fRES(cbbcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_LessEqual(String cbbcd) {
        regCbbcd(CK_LE, fRES(cbbcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcdList The collection of cbbcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_InScope(Collection<String> cbbcdList) {
        doSetCbbcd_InScope(cbbcdList);
    }

    protected void doSetCbbcd_InScope(Collection<String> cbbcdList) {
        regINS(CK_INS, cTL(cbbcdList), xgetCValueCbbcd(), "CBBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcdList The collection of cbbcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_NotInScope(Collection<String> cbbcdList) {
        doSetCbbcd_NotInScope(cbbcdList);
    }

    protected void doSetCbbcd_NotInScope(Collection<String> cbbcdList) {
        regINS(CK_NINS, cTL(cbbcdList), xgetCValueCbbcd(), "CBBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(255)} <br>
     * <pre>e.g. setCbbcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbbcd The value of cbbcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbbcd_LikeSearch(String cbbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbbcd), xgetCValueCbbcd(), "CBBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbbcd_NotLikeSearch(String cbbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbbcd), xgetCValueCbbcd(), "CBBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(255)}
     * @param cbbcd The value of cbbcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_PrefixSearch(String cbbcd) {
        setCbbcd_LikeSearch(cbbcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     */
    public void setCbbcd_IsNull() { regCbbcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     */
    public void setCbbcd_IsNullOrEmpty() { regCbbcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(255)}
     */
    public void setCbbcd_IsNotNull() { regCbbcd(CK_ISNN, DOBJ); }

    protected void regCbbcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbbcd(), "CBBCD"); }
    protected abstract ConditionValue xgetCValueCbbcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_Equal(String ctfm) {
        doSetCtfm_Equal(fRES(ctfm));
    }

    protected void doSetCtfm_Equal(String ctfm) {
        regCtfm(CK_EQ, ctfm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_NotEqual(String ctfm) {
        doSetCtfm_NotEqual(fRES(ctfm));
    }

    protected void doSetCtfm_NotEqual(String ctfm) {
        regCtfm(CK_NES, ctfm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_GreaterThan(String ctfm) {
        regCtfm(CK_GT, fRES(ctfm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_LessThan(String ctfm) {
        regCtfm(CK_LT, fRES(ctfm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_GreaterEqual(String ctfm) {
        regCtfm(CK_GE, fRES(ctfm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_LessEqual(String ctfm) {
        regCtfm(CK_LE, fRES(ctfm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfmList The collection of ctfm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_InScope(Collection<String> ctfmList) {
        doSetCtfm_InScope(ctfmList);
    }

    protected void doSetCtfm_InScope(Collection<String> ctfmList) {
        regINS(CK_INS, cTL(ctfmList), xgetCValueCtfm(), "CTFM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfmList The collection of ctfm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_NotInScope(Collection<String> ctfmList) {
        doSetCtfm_NotInScope(ctfmList);
    }

    protected void doSetCtfm_NotInScope(Collection<String> ctfmList) {
        regINS(CK_NINS, cTL(ctfmList), xgetCValueCtfm(), "CTFM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(255)} <br>
     * <pre>e.g. setCtfm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctfm The value of ctfm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtfm_LikeSearch(String ctfm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctfm), xgetCValueCtfm(), "CTFM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtfm_NotLikeSearch(String ctfm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctfm), xgetCValueCtfm(), "CTFM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(255)}
     * @param ctfm The value of ctfm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_PrefixSearch(String ctfm) {
        setCtfm_LikeSearch(ctfm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     */
    public void setCtfm_IsNull() { regCtfm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     */
    public void setCtfm_IsNullOrEmpty() { regCtfm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(255)}
     */
    public void setCtfm_IsNotNull() { regCtfm(CK_ISNN, DOBJ); }

    protected void regCtfm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtfm(), "CTFM"); }
    protected abstract ConditionValue xgetCValueCtfm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_Equal(String ctszl) {
        doSetCtszl_Equal(fRES(ctszl));
    }

    protected void doSetCtszl_Equal(String ctszl) {
        regCtszl(CK_EQ, ctszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_NotEqual(String ctszl) {
        doSetCtszl_NotEqual(fRES(ctszl));
    }

    protected void doSetCtszl_NotEqual(String ctszl) {
        regCtszl(CK_NES, ctszl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_GreaterThan(String ctszl) {
        regCtszl(CK_GT, fRES(ctszl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_LessThan(String ctszl) {
        regCtszl(CK_LT, fRES(ctszl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_GreaterEqual(String ctszl) {
        regCtszl(CK_GE, fRES(ctszl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_LessEqual(String ctszl) {
        regCtszl(CK_LE, fRES(ctszl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszlList The collection of ctszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_InScope(Collection<String> ctszlList) {
        doSetCtszl_InScope(ctszlList);
    }

    protected void doSetCtszl_InScope(Collection<String> ctszlList) {
        regINS(CK_INS, cTL(ctszlList), xgetCValueCtszl(), "CTSZL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszlList The collection of ctszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_NotInScope(Collection<String> ctszlList) {
        doSetCtszl_NotInScope(ctszlList);
    }

    protected void doSetCtszl_NotInScope(Collection<String> ctszlList) {
        regINS(CK_NINS, cTL(ctszlList), xgetCValueCtszl(), "CTSZL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZL: {varchar(255)} <br>
     * <pre>e.g. setCtszl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctszl The value of ctszl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtszl_LikeSearch(String ctszl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctszl), xgetCValueCtszl(), "CTSZL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtszl_NotLikeSearch(String ctszl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctszl), xgetCValueCtszl(), "CTSZL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZL: {varchar(255)}
     * @param ctszl The value of ctszl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_PrefixSearch(String ctszl) {
        setCtszl_LikeSearch(ctszl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     */
    public void setCtszl_IsNull() { regCtszl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     */
    public void setCtszl_IsNullOrEmpty() { regCtszl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZL: {varchar(255)}
     */
    public void setCtszl_IsNotNull() { regCtszl(CK_ISNN, DOBJ); }

    protected void regCtszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszl(), "CTSZL"); }
    protected abstract ConditionValue xgetCValueCtszl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_Equal(String ctszw) {
        doSetCtszw_Equal(fRES(ctszw));
    }

    protected void doSetCtszw_Equal(String ctszw) {
        regCtszw(CK_EQ, ctszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_NotEqual(String ctszw) {
        doSetCtszw_NotEqual(fRES(ctszw));
    }

    protected void doSetCtszw_NotEqual(String ctszw) {
        regCtszw(CK_NES, ctszw);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_GreaterThan(String ctszw) {
        regCtszw(CK_GT, fRES(ctszw));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_LessThan(String ctszw) {
        regCtszw(CK_LT, fRES(ctszw));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_GreaterEqual(String ctszw) {
        regCtszw(CK_GE, fRES(ctszw));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_LessEqual(String ctszw) {
        regCtszw(CK_LE, fRES(ctszw));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszwList The collection of ctszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_InScope(Collection<String> ctszwList) {
        doSetCtszw_InScope(ctszwList);
    }

    protected void doSetCtszw_InScope(Collection<String> ctszwList) {
        regINS(CK_INS, cTL(ctszwList), xgetCValueCtszw(), "CTSZW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszwList The collection of ctszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_NotInScope(Collection<String> ctszwList) {
        doSetCtszw_NotInScope(ctszwList);
    }

    protected void doSetCtszw_NotInScope(Collection<String> ctszwList) {
        regINS(CK_NINS, cTL(ctszwList), xgetCValueCtszw(), "CTSZW");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZW: {varchar(255)} <br>
     * <pre>e.g. setCtszw_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctszw The value of ctszw as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtszw_LikeSearch(String ctszw, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctszw), xgetCValueCtszw(), "CTSZW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtszw_NotLikeSearch(String ctszw, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctszw), xgetCValueCtszw(), "CTSZW", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZW: {varchar(255)}
     * @param ctszw The value of ctszw as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_PrefixSearch(String ctszw) {
        setCtszw_LikeSearch(ctszw, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     */
    public void setCtszw_IsNull() { regCtszw(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     */
    public void setCtszw_IsNullOrEmpty() { regCtszw(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZW: {varchar(255)}
     */
    public void setCtszw_IsNotNull() { regCtszw(CK_ISNN, DOBJ); }

    protected void regCtszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszw(), "CTSZW"); }
    protected abstract ConditionValue xgetCValueCtszw();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_Equal(String ctszh) {
        doSetCtszh_Equal(fRES(ctszh));
    }

    protected void doSetCtszh_Equal(String ctszh) {
        regCtszh(CK_EQ, ctszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_NotEqual(String ctszh) {
        doSetCtszh_NotEqual(fRES(ctszh));
    }

    protected void doSetCtszh_NotEqual(String ctszh) {
        regCtszh(CK_NES, ctszh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_GreaterThan(String ctszh) {
        regCtszh(CK_GT, fRES(ctszh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_LessThan(String ctszh) {
        regCtszh(CK_LT, fRES(ctszh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_GreaterEqual(String ctszh) {
        regCtszh(CK_GE, fRES(ctszh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_LessEqual(String ctszh) {
        regCtszh(CK_LE, fRES(ctszh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszhList The collection of ctszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_InScope(Collection<String> ctszhList) {
        doSetCtszh_InScope(ctszhList);
    }

    protected void doSetCtszh_InScope(Collection<String> ctszhList) {
        regINS(CK_INS, cTL(ctszhList), xgetCValueCtszh(), "CTSZH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszhList The collection of ctszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_NotInScope(Collection<String> ctszhList) {
        doSetCtszh_NotInScope(ctszhList);
    }

    protected void doSetCtszh_NotInScope(Collection<String> ctszhList) {
        regINS(CK_NINS, cTL(ctszhList), xgetCValueCtszh(), "CTSZH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZH: {varchar(255)} <br>
     * <pre>e.g. setCtszh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctszh The value of ctszh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtszh_LikeSearch(String ctszh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctszh), xgetCValueCtszh(), "CTSZH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtszh_NotLikeSearch(String ctszh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctszh), xgetCValueCtszh(), "CTSZH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTSZH: {varchar(255)}
     * @param ctszh The value of ctszh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_PrefixSearch(String ctszh) {
        setCtszh_LikeSearch(ctszh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     */
    public void setCtszh_IsNull() { regCtszh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     */
    public void setCtszh_IsNullOrEmpty() { regCtszh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZH: {varchar(255)}
     */
    public void setCtszh_IsNotNull() { regCtszh(CK_ISNN, DOBJ); }

    protected void regCtszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszh(), "CTSZH"); }
    protected abstract ConditionValue xgetCValueCtszh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_Equal(String ctcc) {
        doSetCtcc_Equal(fRES(ctcc));
    }

    protected void doSetCtcc_Equal(String ctcc) {
        regCtcc(CK_EQ, ctcc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_NotEqual(String ctcc) {
        doSetCtcc_NotEqual(fRES(ctcc));
    }

    protected void doSetCtcc_NotEqual(String ctcc) {
        regCtcc(CK_NES, ctcc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_GreaterThan(String ctcc) {
        regCtcc(CK_GT, fRES(ctcc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_LessThan(String ctcc) {
        regCtcc(CK_LT, fRES(ctcc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_GreaterEqual(String ctcc) {
        regCtcc(CK_GE, fRES(ctcc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_LessEqual(String ctcc) {
        regCtcc(CK_LE, fRES(ctcc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctccList The collection of ctcc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_InScope(Collection<String> ctccList) {
        doSetCtcc_InScope(ctccList);
    }

    protected void doSetCtcc_InScope(Collection<String> ctccList) {
        regINS(CK_INS, cTL(ctccList), xgetCValueCtcc(), "CTCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctccList The collection of ctcc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_NotInScope(Collection<String> ctccList) {
        doSetCtcc_NotInScope(ctccList);
    }

    protected void doSetCtcc_NotInScope(Collection<String> ctccList) {
        regINS(CK_NINS, cTL(ctccList), xgetCValueCtcc(), "CTCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTCC: {varchar(255)} <br>
     * <pre>e.g. setCtcc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctcc The value of ctcc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtcc_LikeSearch(String ctcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctcc), xgetCValueCtcc(), "CTCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtcc_NotLikeSearch(String ctcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctcc), xgetCValueCtcc(), "CTCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTCC: {varchar(255)}
     * @param ctcc The value of ctcc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_PrefixSearch(String ctcc) {
        setCtcc_LikeSearch(ctcc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     */
    public void setCtcc_IsNull() { regCtcc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     */
    public void setCtcc_IsNullOrEmpty() { regCtcc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTCC: {varchar(255)}
     */
    public void setCtcc_IsNotNull() { regCtcc(CK_ISNN, DOBJ); }

    protected void regCtcc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtcc(), "CTCC"); }
    protected abstract ConditionValue xgetCValueCtcc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_Equal(String ctweight) {
        doSetCtweight_Equal(fRES(ctweight));
    }

    protected void doSetCtweight_Equal(String ctweight) {
        regCtweight(CK_EQ, ctweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_NotEqual(String ctweight) {
        doSetCtweight_NotEqual(fRES(ctweight));
    }

    protected void doSetCtweight_NotEqual(String ctweight) {
        regCtweight(CK_NES, ctweight);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_GreaterThan(String ctweight) {
        regCtweight(CK_GT, fRES(ctweight));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_LessThan(String ctweight) {
        regCtweight(CK_LT, fRES(ctweight));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_GreaterEqual(String ctweight) {
        regCtweight(CK_GE, fRES(ctweight));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_LessEqual(String ctweight) {
        regCtweight(CK_LE, fRES(ctweight));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweightList The collection of ctweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_InScope(Collection<String> ctweightList) {
        doSetCtweight_InScope(ctweightList);
    }

    protected void doSetCtweight_InScope(Collection<String> ctweightList) {
        regINS(CK_INS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweightList The collection of ctweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_NotInScope(Collection<String> ctweightList) {
        doSetCtweight_NotInScope(ctweightList);
    }

    protected void doSetCtweight_NotInScope(Collection<String> ctweightList) {
        regINS(CK_NINS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {varchar(255)} <br>
     * <pre>e.g. setCtweight_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctweight The value of ctweight as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtweight_LikeSearch(String ctweight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctweight), xgetCValueCtweight(), "CTWEIGHT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtweight_NotLikeSearch(String ctweight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctweight), xgetCValueCtweight(), "CTWEIGHT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     * @param ctweight The value of ctweight as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_PrefixSearch(String ctweight) {
        setCtweight_LikeSearch(ctweight, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     */
    public void setCtweight_IsNull() { regCtweight(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     */
    public void setCtweight_IsNullOrEmpty() { regCtweight(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {varchar(255)}
     */
    public void setCtweight_IsNotNull() { regCtweight(CK_ISNN, DOBJ); }

    protected void regCtweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtweight(), "CTWEIGHT"); }
    protected abstract ConditionValue xgetCValueCtweight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_Equal(String cbszl) {
        doSetCbszl_Equal(fRES(cbszl));
    }

    protected void doSetCbszl_Equal(String cbszl) {
        regCbszl(CK_EQ, cbszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_NotEqual(String cbszl) {
        doSetCbszl_NotEqual(fRES(cbszl));
    }

    protected void doSetCbszl_NotEqual(String cbszl) {
        regCbszl(CK_NES, cbszl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_GreaterThan(String cbszl) {
        regCbszl(CK_GT, fRES(cbszl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_LessThan(String cbszl) {
        regCbszl(CK_LT, fRES(cbszl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_GreaterEqual(String cbszl) {
        regCbszl(CK_GE, fRES(cbszl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_LessEqual(String cbszl) {
        regCbszl(CK_LE, fRES(cbszl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszlList The collection of cbszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_InScope(Collection<String> cbszlList) {
        doSetCbszl_InScope(cbszlList);
    }

    protected void doSetCbszl_InScope(Collection<String> cbszlList) {
        regINS(CK_INS, cTL(cbszlList), xgetCValueCbszl(), "CBSZL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszlList The collection of cbszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_NotInScope(Collection<String> cbszlList) {
        doSetCbszl_NotInScope(cbszlList);
    }

    protected void doSetCbszl_NotInScope(Collection<String> cbszlList) {
        regINS(CK_NINS, cTL(cbszlList), xgetCValueCbszl(), "CBSZL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZL: {varchar(255)} <br>
     * <pre>e.g. setCbszl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbszl The value of cbszl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbszl_LikeSearch(String cbszl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbszl), xgetCValueCbszl(), "CBSZL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbszl_NotLikeSearch(String cbszl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbszl), xgetCValueCbszl(), "CBSZL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZL: {varchar(255)}
     * @param cbszl The value of cbszl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszl_PrefixSearch(String cbszl) {
        setCbszl_LikeSearch(cbszl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     */
    public void setCbszl_IsNull() { regCbszl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     */
    public void setCbszl_IsNullOrEmpty() { regCbszl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBSZL: {varchar(255)}
     */
    public void setCbszl_IsNotNull() { regCbszl(CK_ISNN, DOBJ); }

    protected void regCbszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbszl(), "CBSZL"); }
    protected abstract ConditionValue xgetCValueCbszl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_Equal(String cbszw) {
        doSetCbszw_Equal(fRES(cbszw));
    }

    protected void doSetCbszw_Equal(String cbszw) {
        regCbszw(CK_EQ, cbszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_NotEqual(String cbszw) {
        doSetCbszw_NotEqual(fRES(cbszw));
    }

    protected void doSetCbszw_NotEqual(String cbszw) {
        regCbszw(CK_NES, cbszw);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_GreaterThan(String cbszw) {
        regCbszw(CK_GT, fRES(cbszw));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_LessThan(String cbszw) {
        regCbszw(CK_LT, fRES(cbszw));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_GreaterEqual(String cbszw) {
        regCbszw(CK_GE, fRES(cbszw));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_LessEqual(String cbszw) {
        regCbszw(CK_LE, fRES(cbszw));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszwList The collection of cbszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_InScope(Collection<String> cbszwList) {
        doSetCbszw_InScope(cbszwList);
    }

    protected void doSetCbszw_InScope(Collection<String> cbszwList) {
        regINS(CK_INS, cTL(cbszwList), xgetCValueCbszw(), "CBSZW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszwList The collection of cbszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_NotInScope(Collection<String> cbszwList) {
        doSetCbszw_NotInScope(cbszwList);
    }

    protected void doSetCbszw_NotInScope(Collection<String> cbszwList) {
        regINS(CK_NINS, cTL(cbszwList), xgetCValueCbszw(), "CBSZW");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZW: {varchar(255)} <br>
     * <pre>e.g. setCbszw_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbszw The value of cbszw as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbszw_LikeSearch(String cbszw, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbszw), xgetCValueCbszw(), "CBSZW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbszw_NotLikeSearch(String cbszw, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbszw), xgetCValueCbszw(), "CBSZW", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZW: {varchar(255)}
     * @param cbszw The value of cbszw as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszw_PrefixSearch(String cbszw) {
        setCbszw_LikeSearch(cbszw, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     */
    public void setCbszw_IsNull() { regCbszw(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     */
    public void setCbszw_IsNullOrEmpty() { regCbszw(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBSZW: {varchar(255)}
     */
    public void setCbszw_IsNotNull() { regCbszw(CK_ISNN, DOBJ); }

    protected void regCbszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbszw(), "CBSZW"); }
    protected abstract ConditionValue xgetCValueCbszw();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_Equal(String cbszh) {
        doSetCbszh_Equal(fRES(cbszh));
    }

    protected void doSetCbszh_Equal(String cbszh) {
        regCbszh(CK_EQ, cbszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_NotEqual(String cbszh) {
        doSetCbszh_NotEqual(fRES(cbszh));
    }

    protected void doSetCbszh_NotEqual(String cbszh) {
        regCbszh(CK_NES, cbszh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_GreaterThan(String cbszh) {
        regCbszh(CK_GT, fRES(cbszh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_LessThan(String cbszh) {
        regCbszh(CK_LT, fRES(cbszh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_GreaterEqual(String cbszh) {
        regCbszh(CK_GE, fRES(cbszh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_LessEqual(String cbszh) {
        regCbszh(CK_LE, fRES(cbszh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszhList The collection of cbszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_InScope(Collection<String> cbszhList) {
        doSetCbszh_InScope(cbszhList);
    }

    protected void doSetCbszh_InScope(Collection<String> cbszhList) {
        regINS(CK_INS, cTL(cbszhList), xgetCValueCbszh(), "CBSZH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszhList The collection of cbszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_NotInScope(Collection<String> cbszhList) {
        doSetCbszh_NotInScope(cbszhList);
    }

    protected void doSetCbszh_NotInScope(Collection<String> cbszhList) {
        regINS(CK_NINS, cTL(cbszhList), xgetCValueCbszh(), "CBSZH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZH: {varchar(255)} <br>
     * <pre>e.g. setCbszh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbszh The value of cbszh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbszh_LikeSearch(String cbszh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbszh), xgetCValueCbszh(), "CBSZH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbszh_NotLikeSearch(String cbszh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbszh), xgetCValueCbszh(), "CBSZH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBSZH: {varchar(255)}
     * @param cbszh The value of cbszh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbszh_PrefixSearch(String cbszh) {
        setCbszh_LikeSearch(cbszh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     */
    public void setCbszh_IsNull() { regCbszh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     */
    public void setCbszh_IsNullOrEmpty() { regCbszh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBSZH: {varchar(255)}
     */
    public void setCbszh_IsNotNull() { regCbszh(CK_ISNN, DOBJ); }

    protected void regCbszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbszh(), "CBSZH"); }
    protected abstract ConditionValue xgetCValueCbszh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_Equal(String cbcc) {
        doSetCbcc_Equal(fRES(cbcc));
    }

    protected void doSetCbcc_Equal(String cbcc) {
        regCbcc(CK_EQ, cbcc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_NotEqual(String cbcc) {
        doSetCbcc_NotEqual(fRES(cbcc));
    }

    protected void doSetCbcc_NotEqual(String cbcc) {
        regCbcc(CK_NES, cbcc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_GreaterThan(String cbcc) {
        regCbcc(CK_GT, fRES(cbcc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_LessThan(String cbcc) {
        regCbcc(CK_LT, fRES(cbcc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_GreaterEqual(String cbcc) {
        regCbcc(CK_GE, fRES(cbcc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_LessEqual(String cbcc) {
        regCbcc(CK_LE, fRES(cbcc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbccList The collection of cbcc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_InScope(Collection<String> cbccList) {
        doSetCbcc_InScope(cbccList);
    }

    protected void doSetCbcc_InScope(Collection<String> cbccList) {
        regINS(CK_INS, cTL(cbccList), xgetCValueCbcc(), "CBCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbccList The collection of cbcc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_NotInScope(Collection<String> cbccList) {
        doSetCbcc_NotInScope(cbccList);
    }

    protected void doSetCbcc_NotInScope(Collection<String> cbccList) {
        regINS(CK_NINS, cTL(cbccList), xgetCValueCbcc(), "CBCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCC: {varchar(255)} <br>
     * <pre>e.g. setCbcc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbcc The value of cbcc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbcc_LikeSearch(String cbcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbcc), xgetCValueCbcc(), "CBCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbcc_NotLikeSearch(String cbcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbcc), xgetCValueCbcc(), "CBCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBCC: {varchar(255)}
     * @param cbcc The value of cbcc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbcc_PrefixSearch(String cbcc) {
        setCbcc_LikeSearch(cbcc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     */
    public void setCbcc_IsNull() { regCbcc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     */
    public void setCbcc_IsNullOrEmpty() { regCbcc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBCC: {varchar(255)}
     */
    public void setCbcc_IsNotNull() { regCbcc(CK_ISNN, DOBJ); }

    protected void regCbcc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbcc(), "CBCC"); }
    protected abstract ConditionValue xgetCValueCbcc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_Equal(String cbwt) {
        doSetCbwt_Equal(fRES(cbwt));
    }

    protected void doSetCbwt_Equal(String cbwt) {
        regCbwt(CK_EQ, cbwt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_NotEqual(String cbwt) {
        doSetCbwt_NotEqual(fRES(cbwt));
    }

    protected void doSetCbwt_NotEqual(String cbwt) {
        regCbwt(CK_NES, cbwt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_GreaterThan(String cbwt) {
        regCbwt(CK_GT, fRES(cbwt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_LessThan(String cbwt) {
        regCbwt(CK_LT, fRES(cbwt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_GreaterEqual(String cbwt) {
        regCbwt(CK_GE, fRES(cbwt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_LessEqual(String cbwt) {
        regCbwt(CK_LE, fRES(cbwt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwtList The collection of cbwt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_InScope(Collection<String> cbwtList) {
        doSetCbwt_InScope(cbwtList);
    }

    protected void doSetCbwt_InScope(Collection<String> cbwtList) {
        regINS(CK_INS, cTL(cbwtList), xgetCValueCbwt(), "CBWT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwtList The collection of cbwt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_NotInScope(Collection<String> cbwtList) {
        doSetCbwt_NotInScope(cbwtList);
    }

    protected void doSetCbwt_NotInScope(Collection<String> cbwtList) {
        regINS(CK_NINS, cTL(cbwtList), xgetCValueCbwt(), "CBWT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBWT: {varchar(255)} <br>
     * <pre>e.g. setCbwt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbwt The value of cbwt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbwt_LikeSearch(String cbwt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbwt), xgetCValueCbwt(), "CBWT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbwt_NotLikeSearch(String cbwt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbwt), xgetCValueCbwt(), "CBWT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBWT: {varchar(255)}
     * @param cbwt The value of cbwt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbwt_PrefixSearch(String cbwt) {
        setCbwt_LikeSearch(cbwt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     */
    public void setCbwt_IsNull() { regCbwt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     */
    public void setCbwt_IsNullOrEmpty() { regCbwt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBWT: {varchar(255)}
     */
    public void setCbwt_IsNotNull() { regCbwt(CK_ISNN, DOBJ); }

    protected void regCbwt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbwt(), "CBWT"); }
    protected abstract ConditionValue xgetCValueCbwt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_Equal(String bscdt) {
        doSetBscdt_Equal(fRES(bscdt));
    }

    protected void doSetBscdt_Equal(String bscdt) {
        regBscdt(CK_EQ, bscdt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_NotEqual(String bscdt) {
        doSetBscdt_NotEqual(fRES(bscdt));
    }

    protected void doSetBscdt_NotEqual(String bscdt) {
        regBscdt(CK_NES, bscdt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_GreaterThan(String bscdt) {
        regBscdt(CK_GT, fRES(bscdt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_LessThan(String bscdt) {
        regBscdt(CK_LT, fRES(bscdt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_GreaterEqual(String bscdt) {
        regBscdt(CK_GE, fRES(bscdt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_LessEqual(String bscdt) {
        regBscdt(CK_LE, fRES(bscdt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdtList The collection of bscdt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_InScope(Collection<String> bscdtList) {
        doSetBscdt_InScope(bscdtList);
    }

    protected void doSetBscdt_InScope(Collection<String> bscdtList) {
        regINS(CK_INS, cTL(bscdtList), xgetCValueBscdt(), "BSCDT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdtList The collection of bscdt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_NotInScope(Collection<String> bscdtList) {
        doSetBscdt_NotInScope(bscdtList);
    }

    protected void doSetBscdt_NotInScope(Collection<String> bscdtList) {
        regINS(CK_NINS, cTL(bscdtList), xgetCValueBscdt(), "BSCDT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDT: {varchar(255)} <br>
     * <pre>e.g. setBscdt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bscdt The value of bscdt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBscdt_LikeSearch(String bscdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bscdt), xgetCValueBscdt(), "BSCDT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBscdt_NotLikeSearch(String bscdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bscdt), xgetCValueBscdt(), "BSCDT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDT: {varchar(255)}
     * @param bscdt The value of bscdt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdt_PrefixSearch(String bscdt) {
        setBscdt_LikeSearch(bscdt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     */
    public void setBscdt_IsNull() { regBscdt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     */
    public void setBscdt_IsNullOrEmpty() { regBscdt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSCDT: {varchar(255)}
     */
    public void setBscdt_IsNotNull() { regBscdt(CK_ISNN, DOBJ); }

    protected void regBscdt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBscdt(), "BSCDT"); }
    protected abstract ConditionValue xgetCValueBscdt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_Equal(String bscdk) {
        doSetBscdk_Equal(fRES(bscdk));
    }

    protected void doSetBscdk_Equal(String bscdk) {
        regBscdk(CK_EQ, bscdk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_NotEqual(String bscdk) {
        doSetBscdk_NotEqual(fRES(bscdk));
    }

    protected void doSetBscdk_NotEqual(String bscdk) {
        regBscdk(CK_NES, bscdk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_GreaterThan(String bscdk) {
        regBscdk(CK_GT, fRES(bscdk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_LessThan(String bscdk) {
        regBscdk(CK_LT, fRES(bscdk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_GreaterEqual(String bscdk) {
        regBscdk(CK_GE, fRES(bscdk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_LessEqual(String bscdk) {
        regBscdk(CK_LE, fRES(bscdk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdkList The collection of bscdk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_InScope(Collection<String> bscdkList) {
        doSetBscdk_InScope(bscdkList);
    }

    protected void doSetBscdk_InScope(Collection<String> bscdkList) {
        regINS(CK_INS, cTL(bscdkList), xgetCValueBscdk(), "BSCDK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdkList The collection of bscdk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_NotInScope(Collection<String> bscdkList) {
        doSetBscdk_NotInScope(bscdkList);
    }

    protected void doSetBscdk_NotInScope(Collection<String> bscdkList) {
        regINS(CK_NINS, cTL(bscdkList), xgetCValueBscdk(), "BSCDK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDK: {varchar(255)} <br>
     * <pre>e.g. setBscdk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bscdk The value of bscdk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBscdk_LikeSearch(String bscdk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bscdk), xgetCValueBscdk(), "BSCDK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBscdk_NotLikeSearch(String bscdk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bscdk), xgetCValueBscdk(), "BSCDK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDK: {varchar(255)}
     * @param bscdk The value of bscdk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdk_PrefixSearch(String bscdk) {
        setBscdk_LikeSearch(bscdk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     */
    public void setBscdk_IsNull() { regBscdk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     */
    public void setBscdk_IsNullOrEmpty() { regBscdk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSCDK: {varchar(255)}
     */
    public void setBscdk_IsNotNull() { regBscdk(CK_ISNN, DOBJ); }

    protected void regBscdk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBscdk(), "BSCDK"); }
    protected abstract ConditionValue xgetCValueBscdk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_Equal(String bscdc) {
        doSetBscdc_Equal(fRES(bscdc));
    }

    protected void doSetBscdc_Equal(String bscdc) {
        regBscdc(CK_EQ, bscdc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_NotEqual(String bscdc) {
        doSetBscdc_NotEqual(fRES(bscdc));
    }

    protected void doSetBscdc_NotEqual(String bscdc) {
        regBscdc(CK_NES, bscdc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_GreaterThan(String bscdc) {
        regBscdc(CK_GT, fRES(bscdc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_LessThan(String bscdc) {
        regBscdc(CK_LT, fRES(bscdc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_GreaterEqual(String bscdc) {
        regBscdc(CK_GE, fRES(bscdc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_LessEqual(String bscdc) {
        regBscdc(CK_LE, fRES(bscdc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdcList The collection of bscdc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_InScope(Collection<String> bscdcList) {
        doSetBscdc_InScope(bscdcList);
    }

    protected void doSetBscdc_InScope(Collection<String> bscdcList) {
        regINS(CK_INS, cTL(bscdcList), xgetCValueBscdc(), "BSCDC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdcList The collection of bscdc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_NotInScope(Collection<String> bscdcList) {
        doSetBscdc_NotInScope(bscdcList);
    }

    protected void doSetBscdc_NotInScope(Collection<String> bscdcList) {
        regINS(CK_NINS, cTL(bscdcList), xgetCValueBscdc(), "BSCDC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDC: {varchar(255)} <br>
     * <pre>e.g. setBscdc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bscdc The value of bscdc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBscdc_LikeSearch(String bscdc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bscdc), xgetCValueBscdc(), "BSCDC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBscdc_NotLikeSearch(String bscdc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bscdc), xgetCValueBscdc(), "BSCDC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDC: {varchar(255)}
     * @param bscdc The value of bscdc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdc_PrefixSearch(String bscdc) {
        setBscdc_LikeSearch(bscdc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     */
    public void setBscdc_IsNull() { regBscdc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     */
    public void setBscdc_IsNullOrEmpty() { regBscdc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSCDC: {varchar(255)}
     */
    public void setBscdc_IsNotNull() { regBscdc(CK_ISNN, DOBJ); }

    protected void regBscdc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBscdc(), "BSCDC"); }
    protected abstract ConditionValue xgetCValueBscdc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_Equal(String bscdq) {
        doSetBscdq_Equal(fRES(bscdq));
    }

    protected void doSetBscdq_Equal(String bscdq) {
        regBscdq(CK_EQ, bscdq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_NotEqual(String bscdq) {
        doSetBscdq_NotEqual(fRES(bscdq));
    }

    protected void doSetBscdq_NotEqual(String bscdq) {
        regBscdq(CK_NES, bscdq);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_GreaterThan(String bscdq) {
        regBscdq(CK_GT, fRES(bscdq));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_LessThan(String bscdq) {
        regBscdq(CK_LT, fRES(bscdq));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_GreaterEqual(String bscdq) {
        regBscdq(CK_GE, fRES(bscdq));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_LessEqual(String bscdq) {
        regBscdq(CK_LE, fRES(bscdq));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdqList The collection of bscdq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_InScope(Collection<String> bscdqList) {
        doSetBscdq_InScope(bscdqList);
    }

    protected void doSetBscdq_InScope(Collection<String> bscdqList) {
        regINS(CK_INS, cTL(bscdqList), xgetCValueBscdq(), "BSCDQ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdqList The collection of bscdq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_NotInScope(Collection<String> bscdqList) {
        doSetBscdq_NotInScope(bscdqList);
    }

    protected void doSetBscdq_NotInScope(Collection<String> bscdqList) {
        regINS(CK_NINS, cTL(bscdqList), xgetCValueBscdq(), "BSCDQ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDQ: {varchar(255)} <br>
     * <pre>e.g. setBscdq_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bscdq The value of bscdq as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBscdq_LikeSearch(String bscdq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bscdq), xgetCValueBscdq(), "BSCDQ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBscdq_NotLikeSearch(String bscdq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bscdq), xgetCValueBscdq(), "BSCDQ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDQ: {varchar(255)}
     * @param bscdq The value of bscdq as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdq_PrefixSearch(String bscdq) {
        setBscdq_LikeSearch(bscdq, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     */
    public void setBscdq_IsNull() { regBscdq(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     */
    public void setBscdq_IsNullOrEmpty() { regBscdq(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSCDQ: {varchar(255)}
     */
    public void setBscdq_IsNotNull() { regBscdq(CK_ISNN, DOBJ); }

    protected void regBscdq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBscdq(), "BSCDQ"); }
    protected abstract ConditionValue xgetCValueBscdq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_Equal(String bscdh) {
        doSetBscdh_Equal(fRES(bscdh));
    }

    protected void doSetBscdh_Equal(String bscdh) {
        regBscdh(CK_EQ, bscdh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_NotEqual(String bscdh) {
        doSetBscdh_NotEqual(fRES(bscdh));
    }

    protected void doSetBscdh_NotEqual(String bscdh) {
        regBscdh(CK_NES, bscdh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_GreaterThan(String bscdh) {
        regBscdh(CK_GT, fRES(bscdh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_LessThan(String bscdh) {
        regBscdh(CK_LT, fRES(bscdh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_GreaterEqual(String bscdh) {
        regBscdh(CK_GE, fRES(bscdh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_LessEqual(String bscdh) {
        regBscdh(CK_LE, fRES(bscdh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdhList The collection of bscdh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_InScope(Collection<String> bscdhList) {
        doSetBscdh_InScope(bscdhList);
    }

    protected void doSetBscdh_InScope(Collection<String> bscdhList) {
        regINS(CK_INS, cTL(bscdhList), xgetCValueBscdh(), "BSCDH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdhList The collection of bscdh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_NotInScope(Collection<String> bscdhList) {
        doSetBscdh_NotInScope(bscdhList);
    }

    protected void doSetBscdh_NotInScope(Collection<String> bscdhList) {
        regINS(CK_NINS, cTL(bscdhList), xgetCValueBscdh(), "BSCDH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDH: {varchar(255)} <br>
     * <pre>e.g. setBscdh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bscdh The value of bscdh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBscdh_LikeSearch(String bscdh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bscdh), xgetCValueBscdh(), "BSCDH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBscdh_NotLikeSearch(String bscdh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bscdh), xgetCValueBscdh(), "BSCDH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BSCDH: {varchar(255)}
     * @param bscdh The value of bscdh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBscdh_PrefixSearch(String bscdh) {
        setBscdh_LikeSearch(bscdh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     */
    public void setBscdh_IsNull() { regBscdh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     */
    public void setBscdh_IsNullOrEmpty() { regBscdh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BSCDH: {varchar(255)}
     */
    public void setBscdh_IsNotNull() { regBscdh(CK_ISNN, DOBJ); }

    protected void regBscdh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBscdh(), "BSCDH"); }
    protected abstract ConditionValue xgetCValueBscdh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_Equal(String spagcdt) {
        doSetSpagcdt_Equal(fRES(spagcdt));
    }

    protected void doSetSpagcdt_Equal(String spagcdt) {
        regSpagcdt(CK_EQ, spagcdt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_NotEqual(String spagcdt) {
        doSetSpagcdt_NotEqual(fRES(spagcdt));
    }

    protected void doSetSpagcdt_NotEqual(String spagcdt) {
        regSpagcdt(CK_NES, spagcdt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_GreaterThan(String spagcdt) {
        regSpagcdt(CK_GT, fRES(spagcdt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_LessThan(String spagcdt) {
        regSpagcdt(CK_LT, fRES(spagcdt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_GreaterEqual(String spagcdt) {
        regSpagcdt(CK_GE, fRES(spagcdt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_LessEqual(String spagcdt) {
        regSpagcdt(CK_LE, fRES(spagcdt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdtList The collection of spagcdt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_InScope(Collection<String> spagcdtList) {
        doSetSpagcdt_InScope(spagcdtList);
    }

    protected void doSetSpagcdt_InScope(Collection<String> spagcdtList) {
        regINS(CK_INS, cTL(spagcdtList), xgetCValueSpagcdt(), "SPAGCDT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdtList The collection of spagcdt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_NotInScope(Collection<String> spagcdtList) {
        doSetSpagcdt_NotInScope(spagcdtList);
    }

    protected void doSetSpagcdt_NotInScope(Collection<String> spagcdtList) {
        regINS(CK_NINS, cTL(spagcdtList), xgetCValueSpagcdt(), "SPAGCDT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDT: {varchar(255)} <br>
     * <pre>e.g. setSpagcdt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spagcdt The value of spagcdt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpagcdt_LikeSearch(String spagcdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spagcdt), xgetCValueSpagcdt(), "SPAGCDT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpagcdt_NotLikeSearch(String spagcdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spagcdt), xgetCValueSpagcdt(), "SPAGCDT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDT: {varchar(255)}
     * @param spagcdt The value of spagcdt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdt_PrefixSearch(String spagcdt) {
        setSpagcdt_LikeSearch(spagcdt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     */
    public void setSpagcdt_IsNull() { regSpagcdt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     */
    public void setSpagcdt_IsNullOrEmpty() { regSpagcdt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPAGCDT: {varchar(255)}
     */
    public void setSpagcdt_IsNotNull() { regSpagcdt(CK_ISNN, DOBJ); }

    protected void regSpagcdt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpagcdt(), "SPAGCDT"); }
    protected abstract ConditionValue xgetCValueSpagcdt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_Equal(String spagcdk) {
        doSetSpagcdk_Equal(fRES(spagcdk));
    }

    protected void doSetSpagcdk_Equal(String spagcdk) {
        regSpagcdk(CK_EQ, spagcdk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_NotEqual(String spagcdk) {
        doSetSpagcdk_NotEqual(fRES(spagcdk));
    }

    protected void doSetSpagcdk_NotEqual(String spagcdk) {
        regSpagcdk(CK_NES, spagcdk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_GreaterThan(String spagcdk) {
        regSpagcdk(CK_GT, fRES(spagcdk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_LessThan(String spagcdk) {
        regSpagcdk(CK_LT, fRES(spagcdk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_GreaterEqual(String spagcdk) {
        regSpagcdk(CK_GE, fRES(spagcdk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_LessEqual(String spagcdk) {
        regSpagcdk(CK_LE, fRES(spagcdk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdkList The collection of spagcdk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_InScope(Collection<String> spagcdkList) {
        doSetSpagcdk_InScope(spagcdkList);
    }

    protected void doSetSpagcdk_InScope(Collection<String> spagcdkList) {
        regINS(CK_INS, cTL(spagcdkList), xgetCValueSpagcdk(), "SPAGCDK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdkList The collection of spagcdk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_NotInScope(Collection<String> spagcdkList) {
        doSetSpagcdk_NotInScope(spagcdkList);
    }

    protected void doSetSpagcdk_NotInScope(Collection<String> spagcdkList) {
        regINS(CK_NINS, cTL(spagcdkList), xgetCValueSpagcdk(), "SPAGCDK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDK: {varchar(255)} <br>
     * <pre>e.g. setSpagcdk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spagcdk The value of spagcdk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpagcdk_LikeSearch(String spagcdk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spagcdk), xgetCValueSpagcdk(), "SPAGCDK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpagcdk_NotLikeSearch(String spagcdk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spagcdk), xgetCValueSpagcdk(), "SPAGCDK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDK: {varchar(255)}
     * @param spagcdk The value of spagcdk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdk_PrefixSearch(String spagcdk) {
        setSpagcdk_LikeSearch(spagcdk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     */
    public void setSpagcdk_IsNull() { regSpagcdk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     */
    public void setSpagcdk_IsNullOrEmpty() { regSpagcdk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPAGCDK: {varchar(255)}
     */
    public void setSpagcdk_IsNotNull() { regSpagcdk(CK_ISNN, DOBJ); }

    protected void regSpagcdk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpagcdk(), "SPAGCDK"); }
    protected abstract ConditionValue xgetCValueSpagcdk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_Equal(String spagcdc) {
        doSetSpagcdc_Equal(fRES(spagcdc));
    }

    protected void doSetSpagcdc_Equal(String spagcdc) {
        regSpagcdc(CK_EQ, spagcdc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_NotEqual(String spagcdc) {
        doSetSpagcdc_NotEqual(fRES(spagcdc));
    }

    protected void doSetSpagcdc_NotEqual(String spagcdc) {
        regSpagcdc(CK_NES, spagcdc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_GreaterThan(String spagcdc) {
        regSpagcdc(CK_GT, fRES(spagcdc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_LessThan(String spagcdc) {
        regSpagcdc(CK_LT, fRES(spagcdc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_GreaterEqual(String spagcdc) {
        regSpagcdc(CK_GE, fRES(spagcdc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_LessEqual(String spagcdc) {
        regSpagcdc(CK_LE, fRES(spagcdc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdcList The collection of spagcdc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_InScope(Collection<String> spagcdcList) {
        doSetSpagcdc_InScope(spagcdcList);
    }

    protected void doSetSpagcdc_InScope(Collection<String> spagcdcList) {
        regINS(CK_INS, cTL(spagcdcList), xgetCValueSpagcdc(), "SPAGCDC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdcList The collection of spagcdc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_NotInScope(Collection<String> spagcdcList) {
        doSetSpagcdc_NotInScope(spagcdcList);
    }

    protected void doSetSpagcdc_NotInScope(Collection<String> spagcdcList) {
        regINS(CK_NINS, cTL(spagcdcList), xgetCValueSpagcdc(), "SPAGCDC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDC: {varchar(255)} <br>
     * <pre>e.g. setSpagcdc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spagcdc The value of spagcdc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpagcdc_LikeSearch(String spagcdc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spagcdc), xgetCValueSpagcdc(), "SPAGCDC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpagcdc_NotLikeSearch(String spagcdc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spagcdc), xgetCValueSpagcdc(), "SPAGCDC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDC: {varchar(255)}
     * @param spagcdc The value of spagcdc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdc_PrefixSearch(String spagcdc) {
        setSpagcdc_LikeSearch(spagcdc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     */
    public void setSpagcdc_IsNull() { regSpagcdc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     */
    public void setSpagcdc_IsNullOrEmpty() { regSpagcdc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPAGCDC: {varchar(255)}
     */
    public void setSpagcdc_IsNotNull() { regSpagcdc(CK_ISNN, DOBJ); }

    protected void regSpagcdc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpagcdc(), "SPAGCDC"); }
    protected abstract ConditionValue xgetCValueSpagcdc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_Equal(String spagcdq) {
        doSetSpagcdq_Equal(fRES(spagcdq));
    }

    protected void doSetSpagcdq_Equal(String spagcdq) {
        regSpagcdq(CK_EQ, spagcdq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_NotEqual(String spagcdq) {
        doSetSpagcdq_NotEqual(fRES(spagcdq));
    }

    protected void doSetSpagcdq_NotEqual(String spagcdq) {
        regSpagcdq(CK_NES, spagcdq);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_GreaterThan(String spagcdq) {
        regSpagcdq(CK_GT, fRES(spagcdq));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_LessThan(String spagcdq) {
        regSpagcdq(CK_LT, fRES(spagcdq));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_GreaterEqual(String spagcdq) {
        regSpagcdq(CK_GE, fRES(spagcdq));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_LessEqual(String spagcdq) {
        regSpagcdq(CK_LE, fRES(spagcdq));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdqList The collection of spagcdq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_InScope(Collection<String> spagcdqList) {
        doSetSpagcdq_InScope(spagcdqList);
    }

    protected void doSetSpagcdq_InScope(Collection<String> spagcdqList) {
        regINS(CK_INS, cTL(spagcdqList), xgetCValueSpagcdq(), "SPAGCDQ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdqList The collection of spagcdq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_NotInScope(Collection<String> spagcdqList) {
        doSetSpagcdq_NotInScope(spagcdqList);
    }

    protected void doSetSpagcdq_NotInScope(Collection<String> spagcdqList) {
        regINS(CK_NINS, cTL(spagcdqList), xgetCValueSpagcdq(), "SPAGCDQ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDQ: {varchar(255)} <br>
     * <pre>e.g. setSpagcdq_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spagcdq The value of spagcdq as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpagcdq_LikeSearch(String spagcdq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spagcdq), xgetCValueSpagcdq(), "SPAGCDQ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpagcdq_NotLikeSearch(String spagcdq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spagcdq), xgetCValueSpagcdq(), "SPAGCDQ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     * @param spagcdq The value of spagcdq as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdq_PrefixSearch(String spagcdq) {
        setSpagcdq_LikeSearch(spagcdq, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     */
    public void setSpagcdq_IsNull() { regSpagcdq(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     */
    public void setSpagcdq_IsNullOrEmpty() { regSpagcdq(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPAGCDQ: {varchar(255)}
     */
    public void setSpagcdq_IsNotNull() { regSpagcdq(CK_ISNN, DOBJ); }

    protected void regSpagcdq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpagcdq(), "SPAGCDQ"); }
    protected abstract ConditionValue xgetCValueSpagcdq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_Equal(String spagcdh) {
        doSetSpagcdh_Equal(fRES(spagcdh));
    }

    protected void doSetSpagcdh_Equal(String spagcdh) {
        regSpagcdh(CK_EQ, spagcdh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_NotEqual(String spagcdh) {
        doSetSpagcdh_NotEqual(fRES(spagcdh));
    }

    protected void doSetSpagcdh_NotEqual(String spagcdh) {
        regSpagcdh(CK_NES, spagcdh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_GreaterThan(String spagcdh) {
        regSpagcdh(CK_GT, fRES(spagcdh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_LessThan(String spagcdh) {
        regSpagcdh(CK_LT, fRES(spagcdh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_GreaterEqual(String spagcdh) {
        regSpagcdh(CK_GE, fRES(spagcdh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_LessEqual(String spagcdh) {
        regSpagcdh(CK_LE, fRES(spagcdh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdhList The collection of spagcdh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_InScope(Collection<String> spagcdhList) {
        doSetSpagcdh_InScope(spagcdhList);
    }

    protected void doSetSpagcdh_InScope(Collection<String> spagcdhList) {
        regINS(CK_INS, cTL(spagcdhList), xgetCValueSpagcdh(), "SPAGCDH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdhList The collection of spagcdh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_NotInScope(Collection<String> spagcdhList) {
        doSetSpagcdh_NotInScope(spagcdhList);
    }

    protected void doSetSpagcdh_NotInScope(Collection<String> spagcdhList) {
        regINS(CK_NINS, cTL(spagcdhList), xgetCValueSpagcdh(), "SPAGCDH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDH: {varchar(255)} <br>
     * <pre>e.g. setSpagcdh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spagcdh The value of spagcdh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpagcdh_LikeSearch(String spagcdh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spagcdh), xgetCValueSpagcdh(), "SPAGCDH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpagcdh_NotLikeSearch(String spagcdh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spagcdh), xgetCValueSpagcdh(), "SPAGCDH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPAGCDH: {varchar(255)}
     * @param spagcdh The value of spagcdh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpagcdh_PrefixSearch(String spagcdh) {
        setSpagcdh_LikeSearch(spagcdh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     */
    public void setSpagcdh_IsNull() { regSpagcdh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     */
    public void setSpagcdh_IsNullOrEmpty() { regSpagcdh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPAGCDH: {varchar(255)}
     */
    public void setSpagcdh_IsNotNull() { regSpagcdh(CK_ISNN, DOBJ); }

    protected void regSpagcdh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpagcdh(), "SPAGCDH"); }
    protected abstract ConditionValue xgetCValueSpagcdh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_Equal(String rbscd1) {
        doSetRbscd1_Equal(fRES(rbscd1));
    }

    protected void doSetRbscd1_Equal(String rbscd1) {
        regRbscd1(CK_EQ, rbscd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_NotEqual(String rbscd1) {
        doSetRbscd1_NotEqual(fRES(rbscd1));
    }

    protected void doSetRbscd1_NotEqual(String rbscd1) {
        regRbscd1(CK_NES, rbscd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_GreaterThan(String rbscd1) {
        regRbscd1(CK_GT, fRES(rbscd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_LessThan(String rbscd1) {
        regRbscd1(CK_LT, fRES(rbscd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_GreaterEqual(String rbscd1) {
        regRbscd1(CK_GE, fRES(rbscd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_LessEqual(String rbscd1) {
        regRbscd1(CK_LE, fRES(rbscd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1List The collection of rbscd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_InScope(Collection<String> rbscd1List) {
        doSetRbscd1_InScope(rbscd1List);
    }

    protected void doSetRbscd1_InScope(Collection<String> rbscd1List) {
        regINS(CK_INS, cTL(rbscd1List), xgetCValueRbscd1(), "RBSCD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1List The collection of rbscd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_NotInScope(Collection<String> rbscd1List) {
        doSetRbscd1_NotInScope(rbscd1List);
    }

    protected void doSetRbscd1_NotInScope(Collection<String> rbscd1List) {
        regINS(CK_NINS, cTL(rbscd1List), xgetCValueRbscd1(), "RBSCD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD1: {varchar(255)} <br>
     * <pre>e.g. setRbscd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rbscd1 The value of rbscd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRbscd1_LikeSearch(String rbscd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rbscd1), xgetCValueRbscd1(), "RBSCD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRbscd1_NotLikeSearch(String rbscd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rbscd1), xgetCValueRbscd1(), "RBSCD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD1: {varchar(255)}
     * @param rbscd1 The value of rbscd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd1_PrefixSearch(String rbscd1) {
        setRbscd1_LikeSearch(rbscd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     */
    public void setRbscd1_IsNull() { regRbscd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     */
    public void setRbscd1_IsNullOrEmpty() { regRbscd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RBSCD1: {varchar(255)}
     */
    public void setRbscd1_IsNotNull() { regRbscd1(CK_ISNN, DOBJ); }

    protected void regRbscd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRbscd1(), "RBSCD1"); }
    protected abstract ConditionValue xgetCValueRbscd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_Equal(String rbscd2) {
        doSetRbscd2_Equal(fRES(rbscd2));
    }

    protected void doSetRbscd2_Equal(String rbscd2) {
        regRbscd2(CK_EQ, rbscd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_NotEqual(String rbscd2) {
        doSetRbscd2_NotEqual(fRES(rbscd2));
    }

    protected void doSetRbscd2_NotEqual(String rbscd2) {
        regRbscd2(CK_NES, rbscd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_GreaterThan(String rbscd2) {
        regRbscd2(CK_GT, fRES(rbscd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_LessThan(String rbscd2) {
        regRbscd2(CK_LT, fRES(rbscd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_GreaterEqual(String rbscd2) {
        regRbscd2(CK_GE, fRES(rbscd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_LessEqual(String rbscd2) {
        regRbscd2(CK_LE, fRES(rbscd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2List The collection of rbscd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_InScope(Collection<String> rbscd2List) {
        doSetRbscd2_InScope(rbscd2List);
    }

    protected void doSetRbscd2_InScope(Collection<String> rbscd2List) {
        regINS(CK_INS, cTL(rbscd2List), xgetCValueRbscd2(), "RBSCD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2List The collection of rbscd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_NotInScope(Collection<String> rbscd2List) {
        doSetRbscd2_NotInScope(rbscd2List);
    }

    protected void doSetRbscd2_NotInScope(Collection<String> rbscd2List) {
        regINS(CK_NINS, cTL(rbscd2List), xgetCValueRbscd2(), "RBSCD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD2: {varchar(255)} <br>
     * <pre>e.g. setRbscd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rbscd2 The value of rbscd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRbscd2_LikeSearch(String rbscd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rbscd2), xgetCValueRbscd2(), "RBSCD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRbscd2_NotLikeSearch(String rbscd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rbscd2), xgetCValueRbscd2(), "RBSCD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD2: {varchar(255)}
     * @param rbscd2 The value of rbscd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd2_PrefixSearch(String rbscd2) {
        setRbscd2_LikeSearch(rbscd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     */
    public void setRbscd2_IsNull() { regRbscd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     */
    public void setRbscd2_IsNullOrEmpty() { regRbscd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RBSCD2: {varchar(255)}
     */
    public void setRbscd2_IsNotNull() { regRbscd2(CK_ISNN, DOBJ); }

    protected void regRbscd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRbscd2(), "RBSCD2"); }
    protected abstract ConditionValue xgetCValueRbscd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_Equal(String rbscd3) {
        doSetRbscd3_Equal(fRES(rbscd3));
    }

    protected void doSetRbscd3_Equal(String rbscd3) {
        regRbscd3(CK_EQ, rbscd3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_NotEqual(String rbscd3) {
        doSetRbscd3_NotEqual(fRES(rbscd3));
    }

    protected void doSetRbscd3_NotEqual(String rbscd3) {
        regRbscd3(CK_NES, rbscd3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_GreaterThan(String rbscd3) {
        regRbscd3(CK_GT, fRES(rbscd3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_LessThan(String rbscd3) {
        regRbscd3(CK_LT, fRES(rbscd3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_GreaterEqual(String rbscd3) {
        regRbscd3(CK_GE, fRES(rbscd3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_LessEqual(String rbscd3) {
        regRbscd3(CK_LE, fRES(rbscd3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3List The collection of rbscd3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_InScope(Collection<String> rbscd3List) {
        doSetRbscd3_InScope(rbscd3List);
    }

    protected void doSetRbscd3_InScope(Collection<String> rbscd3List) {
        regINS(CK_INS, cTL(rbscd3List), xgetCValueRbscd3(), "RBSCD3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3List The collection of rbscd3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_NotInScope(Collection<String> rbscd3List) {
        doSetRbscd3_NotInScope(rbscd3List);
    }

    protected void doSetRbscd3_NotInScope(Collection<String> rbscd3List) {
        regINS(CK_NINS, cTL(rbscd3List), xgetCValueRbscd3(), "RBSCD3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD3: {varchar(255)} <br>
     * <pre>e.g. setRbscd3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rbscd3 The value of rbscd3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRbscd3_LikeSearch(String rbscd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rbscd3), xgetCValueRbscd3(), "RBSCD3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRbscd3_NotLikeSearch(String rbscd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rbscd3), xgetCValueRbscd3(), "RBSCD3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD3: {varchar(255)}
     * @param rbscd3 The value of rbscd3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd3_PrefixSearch(String rbscd3) {
        setRbscd3_LikeSearch(rbscd3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     */
    public void setRbscd3_IsNull() { regRbscd3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     */
    public void setRbscd3_IsNullOrEmpty() { regRbscd3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RBSCD3: {varchar(255)}
     */
    public void setRbscd3_IsNotNull() { regRbscd3(CK_ISNN, DOBJ); }

    protected void regRbscd3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRbscd3(), "RBSCD3"); }
    protected abstract ConditionValue xgetCValueRbscd3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_Equal(String rbscd4) {
        doSetRbscd4_Equal(fRES(rbscd4));
    }

    protected void doSetRbscd4_Equal(String rbscd4) {
        regRbscd4(CK_EQ, rbscd4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_NotEqual(String rbscd4) {
        doSetRbscd4_NotEqual(fRES(rbscd4));
    }

    protected void doSetRbscd4_NotEqual(String rbscd4) {
        regRbscd4(CK_NES, rbscd4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_GreaterThan(String rbscd4) {
        regRbscd4(CK_GT, fRES(rbscd4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_LessThan(String rbscd4) {
        regRbscd4(CK_LT, fRES(rbscd4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_GreaterEqual(String rbscd4) {
        regRbscd4(CK_GE, fRES(rbscd4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_LessEqual(String rbscd4) {
        regRbscd4(CK_LE, fRES(rbscd4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4List The collection of rbscd4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_InScope(Collection<String> rbscd4List) {
        doSetRbscd4_InScope(rbscd4List);
    }

    protected void doSetRbscd4_InScope(Collection<String> rbscd4List) {
        regINS(CK_INS, cTL(rbscd4List), xgetCValueRbscd4(), "RBSCD4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4List The collection of rbscd4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_NotInScope(Collection<String> rbscd4List) {
        doSetRbscd4_NotInScope(rbscd4List);
    }

    protected void doSetRbscd4_NotInScope(Collection<String> rbscd4List) {
        regINS(CK_NINS, cTL(rbscd4List), xgetCValueRbscd4(), "RBSCD4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD4: {varchar(255)} <br>
     * <pre>e.g. setRbscd4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rbscd4 The value of rbscd4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRbscd4_LikeSearch(String rbscd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rbscd4), xgetCValueRbscd4(), "RBSCD4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRbscd4_NotLikeSearch(String rbscd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rbscd4), xgetCValueRbscd4(), "RBSCD4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD4: {varchar(255)}
     * @param rbscd4 The value of rbscd4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd4_PrefixSearch(String rbscd4) {
        setRbscd4_LikeSearch(rbscd4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     */
    public void setRbscd4_IsNull() { regRbscd4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     */
    public void setRbscd4_IsNullOrEmpty() { regRbscd4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RBSCD4: {varchar(255)}
     */
    public void setRbscd4_IsNotNull() { regRbscd4(CK_ISNN, DOBJ); }

    protected void regRbscd4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRbscd4(), "RBSCD4"); }
    protected abstract ConditionValue xgetCValueRbscd4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_Equal(String rbscd5) {
        doSetRbscd5_Equal(fRES(rbscd5));
    }

    protected void doSetRbscd5_Equal(String rbscd5) {
        regRbscd5(CK_EQ, rbscd5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_NotEqual(String rbscd5) {
        doSetRbscd5_NotEqual(fRES(rbscd5));
    }

    protected void doSetRbscd5_NotEqual(String rbscd5) {
        regRbscd5(CK_NES, rbscd5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_GreaterThan(String rbscd5) {
        regRbscd5(CK_GT, fRES(rbscd5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_LessThan(String rbscd5) {
        regRbscd5(CK_LT, fRES(rbscd5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_GreaterEqual(String rbscd5) {
        regRbscd5(CK_GE, fRES(rbscd5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_LessEqual(String rbscd5) {
        regRbscd5(CK_LE, fRES(rbscd5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5List The collection of rbscd5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_InScope(Collection<String> rbscd5List) {
        doSetRbscd5_InScope(rbscd5List);
    }

    protected void doSetRbscd5_InScope(Collection<String> rbscd5List) {
        regINS(CK_INS, cTL(rbscd5List), xgetCValueRbscd5(), "RBSCD5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5List The collection of rbscd5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_NotInScope(Collection<String> rbscd5List) {
        doSetRbscd5_NotInScope(rbscd5List);
    }

    protected void doSetRbscd5_NotInScope(Collection<String> rbscd5List) {
        regINS(CK_NINS, cTL(rbscd5List), xgetCValueRbscd5(), "RBSCD5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD5: {varchar(255)} <br>
     * <pre>e.g. setRbscd5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rbscd5 The value of rbscd5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRbscd5_LikeSearch(String rbscd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rbscd5), xgetCValueRbscd5(), "RBSCD5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRbscd5_NotLikeSearch(String rbscd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rbscd5), xgetCValueRbscd5(), "RBSCD5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RBSCD5: {varchar(255)}
     * @param rbscd5 The value of rbscd5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRbscd5_PrefixSearch(String rbscd5) {
        setRbscd5_LikeSearch(rbscd5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     */
    public void setRbscd5_IsNull() { regRbscd5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     */
    public void setRbscd5_IsNullOrEmpty() { regRbscd5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RBSCD5: {varchar(255)}
     */
    public void setRbscd5_IsNotNull() { regRbscd5(CK_ISNN, DOBJ); }

    protected void regRbscd5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRbscd5(), "RBSCD5"); }
    protected abstract ConditionValue xgetCValueRbscd5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_Equal(String ussbcd1) {
        doSetUssbcd1_Equal(fRES(ussbcd1));
    }

    protected void doSetUssbcd1_Equal(String ussbcd1) {
        regUssbcd1(CK_EQ, ussbcd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_NotEqual(String ussbcd1) {
        doSetUssbcd1_NotEqual(fRES(ussbcd1));
    }

    protected void doSetUssbcd1_NotEqual(String ussbcd1) {
        regUssbcd1(CK_NES, ussbcd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_GreaterThan(String ussbcd1) {
        regUssbcd1(CK_GT, fRES(ussbcd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_LessThan(String ussbcd1) {
        regUssbcd1(CK_LT, fRES(ussbcd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_GreaterEqual(String ussbcd1) {
        regUssbcd1(CK_GE, fRES(ussbcd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_LessEqual(String ussbcd1) {
        regUssbcd1(CK_LE, fRES(ussbcd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1List The collection of ussbcd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_InScope(Collection<String> ussbcd1List) {
        doSetUssbcd1_InScope(ussbcd1List);
    }

    protected void doSetUssbcd1_InScope(Collection<String> ussbcd1List) {
        regINS(CK_INS, cTL(ussbcd1List), xgetCValueUssbcd1(), "USSBCD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1List The collection of ussbcd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_NotInScope(Collection<String> ussbcd1List) {
        doSetUssbcd1_NotInScope(ussbcd1List);
    }

    protected void doSetUssbcd1_NotInScope(Collection<String> ussbcd1List) {
        regINS(CK_NINS, cTL(ussbcd1List), xgetCValueUssbcd1(), "USSBCD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD1: {varchar(255)} <br>
     * <pre>e.g. setUssbcd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ussbcd1 The value of ussbcd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUssbcd1_LikeSearch(String ussbcd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ussbcd1), xgetCValueUssbcd1(), "USSBCD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUssbcd1_NotLikeSearch(String ussbcd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ussbcd1), xgetCValueUssbcd1(), "USSBCD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD1: {varchar(255)}
     * @param ussbcd1 The value of ussbcd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd1_PrefixSearch(String ussbcd1) {
        setUssbcd1_LikeSearch(ussbcd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     */
    public void setUssbcd1_IsNull() { regUssbcd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     */
    public void setUssbcd1_IsNullOrEmpty() { regUssbcd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USSBCD1: {varchar(255)}
     */
    public void setUssbcd1_IsNotNull() { regUssbcd1(CK_ISNN, DOBJ); }

    protected void regUssbcd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUssbcd1(), "USSBCD1"); }
    protected abstract ConditionValue xgetCValueUssbcd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_Equal(String ussbcd2) {
        doSetUssbcd2_Equal(fRES(ussbcd2));
    }

    protected void doSetUssbcd2_Equal(String ussbcd2) {
        regUssbcd2(CK_EQ, ussbcd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_NotEqual(String ussbcd2) {
        doSetUssbcd2_NotEqual(fRES(ussbcd2));
    }

    protected void doSetUssbcd2_NotEqual(String ussbcd2) {
        regUssbcd2(CK_NES, ussbcd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_GreaterThan(String ussbcd2) {
        regUssbcd2(CK_GT, fRES(ussbcd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_LessThan(String ussbcd2) {
        regUssbcd2(CK_LT, fRES(ussbcd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_GreaterEqual(String ussbcd2) {
        regUssbcd2(CK_GE, fRES(ussbcd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_LessEqual(String ussbcd2) {
        regUssbcd2(CK_LE, fRES(ussbcd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2List The collection of ussbcd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_InScope(Collection<String> ussbcd2List) {
        doSetUssbcd2_InScope(ussbcd2List);
    }

    protected void doSetUssbcd2_InScope(Collection<String> ussbcd2List) {
        regINS(CK_INS, cTL(ussbcd2List), xgetCValueUssbcd2(), "USSBCD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2List The collection of ussbcd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_NotInScope(Collection<String> ussbcd2List) {
        doSetUssbcd2_NotInScope(ussbcd2List);
    }

    protected void doSetUssbcd2_NotInScope(Collection<String> ussbcd2List) {
        regINS(CK_NINS, cTL(ussbcd2List), xgetCValueUssbcd2(), "USSBCD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD2: {varchar(255)} <br>
     * <pre>e.g. setUssbcd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ussbcd2 The value of ussbcd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUssbcd2_LikeSearch(String ussbcd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ussbcd2), xgetCValueUssbcd2(), "USSBCD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUssbcd2_NotLikeSearch(String ussbcd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ussbcd2), xgetCValueUssbcd2(), "USSBCD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD2: {varchar(255)}
     * @param ussbcd2 The value of ussbcd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd2_PrefixSearch(String ussbcd2) {
        setUssbcd2_LikeSearch(ussbcd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     */
    public void setUssbcd2_IsNull() { regUssbcd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     */
    public void setUssbcd2_IsNullOrEmpty() { regUssbcd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USSBCD2: {varchar(255)}
     */
    public void setUssbcd2_IsNotNull() { regUssbcd2(CK_ISNN, DOBJ); }

    protected void regUssbcd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUssbcd2(), "USSBCD2"); }
    protected abstract ConditionValue xgetCValueUssbcd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_Equal(String ussbcd3) {
        doSetUssbcd3_Equal(fRES(ussbcd3));
    }

    protected void doSetUssbcd3_Equal(String ussbcd3) {
        regUssbcd3(CK_EQ, ussbcd3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_NotEqual(String ussbcd3) {
        doSetUssbcd3_NotEqual(fRES(ussbcd3));
    }

    protected void doSetUssbcd3_NotEqual(String ussbcd3) {
        regUssbcd3(CK_NES, ussbcd3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_GreaterThan(String ussbcd3) {
        regUssbcd3(CK_GT, fRES(ussbcd3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_LessThan(String ussbcd3) {
        regUssbcd3(CK_LT, fRES(ussbcd3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_GreaterEqual(String ussbcd3) {
        regUssbcd3(CK_GE, fRES(ussbcd3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_LessEqual(String ussbcd3) {
        regUssbcd3(CK_LE, fRES(ussbcd3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3List The collection of ussbcd3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_InScope(Collection<String> ussbcd3List) {
        doSetUssbcd3_InScope(ussbcd3List);
    }

    protected void doSetUssbcd3_InScope(Collection<String> ussbcd3List) {
        regINS(CK_INS, cTL(ussbcd3List), xgetCValueUssbcd3(), "USSBCD3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3List The collection of ussbcd3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_NotInScope(Collection<String> ussbcd3List) {
        doSetUssbcd3_NotInScope(ussbcd3List);
    }

    protected void doSetUssbcd3_NotInScope(Collection<String> ussbcd3List) {
        regINS(CK_NINS, cTL(ussbcd3List), xgetCValueUssbcd3(), "USSBCD3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD3: {varchar(255)} <br>
     * <pre>e.g. setUssbcd3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ussbcd3 The value of ussbcd3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUssbcd3_LikeSearch(String ussbcd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ussbcd3), xgetCValueUssbcd3(), "USSBCD3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUssbcd3_NotLikeSearch(String ussbcd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ussbcd3), xgetCValueUssbcd3(), "USSBCD3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD3: {varchar(255)}
     * @param ussbcd3 The value of ussbcd3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd3_PrefixSearch(String ussbcd3) {
        setUssbcd3_LikeSearch(ussbcd3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     */
    public void setUssbcd3_IsNull() { regUssbcd3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     */
    public void setUssbcd3_IsNullOrEmpty() { regUssbcd3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USSBCD3: {varchar(255)}
     */
    public void setUssbcd3_IsNotNull() { regUssbcd3(CK_ISNN, DOBJ); }

    protected void regUssbcd3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUssbcd3(), "USSBCD3"); }
    protected abstract ConditionValue xgetCValueUssbcd3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_Equal(String ussbcd4) {
        doSetUssbcd4_Equal(fRES(ussbcd4));
    }

    protected void doSetUssbcd4_Equal(String ussbcd4) {
        regUssbcd4(CK_EQ, ussbcd4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_NotEqual(String ussbcd4) {
        doSetUssbcd4_NotEqual(fRES(ussbcd4));
    }

    protected void doSetUssbcd4_NotEqual(String ussbcd4) {
        regUssbcd4(CK_NES, ussbcd4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_GreaterThan(String ussbcd4) {
        regUssbcd4(CK_GT, fRES(ussbcd4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_LessThan(String ussbcd4) {
        regUssbcd4(CK_LT, fRES(ussbcd4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_GreaterEqual(String ussbcd4) {
        regUssbcd4(CK_GE, fRES(ussbcd4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_LessEqual(String ussbcd4) {
        regUssbcd4(CK_LE, fRES(ussbcd4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4List The collection of ussbcd4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_InScope(Collection<String> ussbcd4List) {
        doSetUssbcd4_InScope(ussbcd4List);
    }

    protected void doSetUssbcd4_InScope(Collection<String> ussbcd4List) {
        regINS(CK_INS, cTL(ussbcd4List), xgetCValueUssbcd4(), "USSBCD4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4List The collection of ussbcd4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_NotInScope(Collection<String> ussbcd4List) {
        doSetUssbcd4_NotInScope(ussbcd4List);
    }

    protected void doSetUssbcd4_NotInScope(Collection<String> ussbcd4List) {
        regINS(CK_NINS, cTL(ussbcd4List), xgetCValueUssbcd4(), "USSBCD4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD4: {varchar(255)} <br>
     * <pre>e.g. setUssbcd4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ussbcd4 The value of ussbcd4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUssbcd4_LikeSearch(String ussbcd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ussbcd4), xgetCValueUssbcd4(), "USSBCD4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUssbcd4_NotLikeSearch(String ussbcd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ussbcd4), xgetCValueUssbcd4(), "USSBCD4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD4: {varchar(255)}
     * @param ussbcd4 The value of ussbcd4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd4_PrefixSearch(String ussbcd4) {
        setUssbcd4_LikeSearch(ussbcd4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     */
    public void setUssbcd4_IsNull() { regUssbcd4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     */
    public void setUssbcd4_IsNullOrEmpty() { regUssbcd4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USSBCD4: {varchar(255)}
     */
    public void setUssbcd4_IsNotNull() { regUssbcd4(CK_ISNN, DOBJ); }

    protected void regUssbcd4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUssbcd4(), "USSBCD4"); }
    protected abstract ConditionValue xgetCValueUssbcd4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_Equal(String ussbcd5) {
        doSetUssbcd5_Equal(fRES(ussbcd5));
    }

    protected void doSetUssbcd5_Equal(String ussbcd5) {
        regUssbcd5(CK_EQ, ussbcd5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_NotEqual(String ussbcd5) {
        doSetUssbcd5_NotEqual(fRES(ussbcd5));
    }

    protected void doSetUssbcd5_NotEqual(String ussbcd5) {
        regUssbcd5(CK_NES, ussbcd5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_GreaterThan(String ussbcd5) {
        regUssbcd5(CK_GT, fRES(ussbcd5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_LessThan(String ussbcd5) {
        regUssbcd5(CK_LT, fRES(ussbcd5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_GreaterEqual(String ussbcd5) {
        regUssbcd5(CK_GE, fRES(ussbcd5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_LessEqual(String ussbcd5) {
        regUssbcd5(CK_LE, fRES(ussbcd5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5List The collection of ussbcd5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_InScope(Collection<String> ussbcd5List) {
        doSetUssbcd5_InScope(ussbcd5List);
    }

    protected void doSetUssbcd5_InScope(Collection<String> ussbcd5List) {
        regINS(CK_INS, cTL(ussbcd5List), xgetCValueUssbcd5(), "USSBCD5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5List The collection of ussbcd5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_NotInScope(Collection<String> ussbcd5List) {
        doSetUssbcd5_NotInScope(ussbcd5List);
    }

    protected void doSetUssbcd5_NotInScope(Collection<String> ussbcd5List) {
        regINS(CK_NINS, cTL(ussbcd5List), xgetCValueUssbcd5(), "USSBCD5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD5: {varchar(255)} <br>
     * <pre>e.g. setUssbcd5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ussbcd5 The value of ussbcd5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUssbcd5_LikeSearch(String ussbcd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ussbcd5), xgetCValueUssbcd5(), "USSBCD5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUssbcd5_NotLikeSearch(String ussbcd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ussbcd5), xgetCValueUssbcd5(), "USSBCD5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USSBCD5: {varchar(255)}
     * @param ussbcd5 The value of ussbcd5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUssbcd5_PrefixSearch(String ussbcd5) {
        setUssbcd5_LikeSearch(ussbcd5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     */
    public void setUssbcd5_IsNull() { regUssbcd5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     */
    public void setUssbcd5_IsNullOrEmpty() { regUssbcd5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USSBCD5: {varchar(255)}
     */
    public void setUssbcd5_IsNotNull() { regUssbcd5(CK_ISNN, DOBJ); }

    protected void regUssbcd5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUssbcd5(), "USSBCD5"); }
    protected abstract ConditionValue xgetCValueUssbcd5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_Equal(String splcpcd) {
        doSetSplcpcd_Equal(fRES(splcpcd));
    }

    protected void doSetSplcpcd_Equal(String splcpcd) {
        regSplcpcd(CK_EQ, splcpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_NotEqual(String splcpcd) {
        doSetSplcpcd_NotEqual(fRES(splcpcd));
    }

    protected void doSetSplcpcd_NotEqual(String splcpcd) {
        regSplcpcd(CK_NES, splcpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_GreaterThan(String splcpcd) {
        regSplcpcd(CK_GT, fRES(splcpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_LessThan(String splcpcd) {
        regSplcpcd(CK_LT, fRES(splcpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_GreaterEqual(String splcpcd) {
        regSplcpcd(CK_GE, fRES(splcpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_LessEqual(String splcpcd) {
        regSplcpcd(CK_LE, fRES(splcpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcdList The collection of splcpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_InScope(Collection<String> splcpcdList) {
        doSetSplcpcd_InScope(splcpcdList);
    }

    protected void doSetSplcpcd_InScope(Collection<String> splcpcdList) {
        regINS(CK_INS, cTL(splcpcdList), xgetCValueSplcpcd(), "SPLCPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcdList The collection of splcpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_NotInScope(Collection<String> splcpcdList) {
        doSetSplcpcd_NotInScope(splcpcdList);
    }

    protected void doSetSplcpcd_NotInScope(Collection<String> splcpcdList) {
        regINS(CK_NINS, cTL(splcpcdList), xgetCValueSplcpcd(), "SPLCPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCPCD: {varchar(255)} <br>
     * <pre>e.g. setSplcpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splcpcd The value of splcpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplcpcd_LikeSearch(String splcpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splcpcd), xgetCValueSplcpcd(), "SPLCPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplcpcd_NotLikeSearch(String splcpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splcpcd), xgetCValueSplcpcd(), "SPLCPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCPCD: {varchar(255)}
     * @param splcpcd The value of splcpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplcpcd_PrefixSearch(String splcpcd) {
        setSplcpcd_LikeSearch(splcpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     */
    public void setSplcpcd_IsNull() { regSplcpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     */
    public void setSplcpcd_IsNullOrEmpty() { regSplcpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPLCPCD: {varchar(255)}
     */
    public void setSplcpcd_IsNotNull() { regSplcpcd(CK_ISNN, DOBJ); }

    protected void regSplcpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplcpcd(), "SPLCPCD"); }
    protected abstract ConditionValue xgetCValueSplcpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_Equal(String makercd) {
        doSetMakercd_Equal(fRES(makercd));
    }

    protected void doSetMakercd_Equal(String makercd) {
        regMakercd(CK_EQ, makercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_NotEqual(String makercd) {
        doSetMakercd_NotEqual(fRES(makercd));
    }

    protected void doSetMakercd_NotEqual(String makercd) {
        regMakercd(CK_NES, makercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_GreaterThan(String makercd) {
        regMakercd(CK_GT, fRES(makercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_LessThan(String makercd) {
        regMakercd(CK_LT, fRES(makercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_GreaterEqual(String makercd) {
        regMakercd(CK_GE, fRES(makercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_LessEqual(String makercd) {
        regMakercd(CK_LE, fRES(makercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercdList The collection of makercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_InScope(Collection<String> makercdList) {
        doSetMakercd_InScope(makercdList);
    }

    protected void doSetMakercd_InScope(Collection<String> makercdList) {
        regINS(CK_INS, cTL(makercdList), xgetCValueMakercd(), "MAKERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercdList The collection of makercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_NotInScope(Collection<String> makercdList) {
        doSetMakercd_NotInScope(makercdList);
    }

    protected void doSetMakercd_NotInScope(Collection<String> makercdList) {
        regINS(CK_NINS, cTL(makercdList), xgetCValueMakercd(), "MAKERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCD: {varchar(255)} <br>
     * <pre>e.g. setMakercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makercd The value of makercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakercd_LikeSearch(String makercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makercd), xgetCValueMakercd(), "MAKERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakercd_NotLikeSearch(String makercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makercd), xgetCValueMakercd(), "MAKERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCD: {varchar(255)}
     * @param makercd The value of makercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercd_PrefixSearch(String makercd) {
        setMakercd_LikeSearch(makercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     */
    public void setMakercd_IsNull() { regMakercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     */
    public void setMakercd_IsNullOrEmpty() { regMakercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKERCD: {varchar(255)}
     */
    public void setMakercd_IsNotNull() { regMakercd(CK_ISNN, DOBJ); }

    protected void regMakercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakercd(), "MAKERCD"); }
    protected abstract ConditionValue xgetCValueMakercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_Equal(String land1) {
        doSetLand1_Equal(fRES(land1));
    }

    protected void doSetLand1_Equal(String land1) {
        regLand1(CK_EQ, land1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_NotEqual(String land1) {
        doSetLand1_NotEqual(fRES(land1));
    }

    protected void doSetLand1_NotEqual(String land1) {
        regLand1(CK_NES, land1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_GreaterThan(String land1) {
        regLand1(CK_GT, fRES(land1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_LessThan(String land1) {
        regLand1(CK_LT, fRES(land1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_GreaterEqual(String land1) {
        regLand1(CK_GE, fRES(land1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_LessEqual(String land1) {
        regLand1(CK_LE, fRES(land1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1List The collection of land1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_InScope(Collection<String> land1List) {
        doSetLand1_InScope(land1List);
    }

    protected void doSetLand1_InScope(Collection<String> land1List) {
        regINS(CK_INS, cTL(land1List), xgetCValueLand1(), "LAND1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1List The collection of land1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_NotInScope(Collection<String> land1List) {
        doSetLand1_NotInScope(land1List);
    }

    protected void doSetLand1_NotInScope(Collection<String> land1List) {
        regINS(CK_NINS, cTL(land1List), xgetCValueLand1(), "LAND1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND1: {varchar(255)} <br>
     * <pre>e.g. setLand1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param land1 The value of land1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLand1_LikeSearch(String land1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(land1), xgetCValueLand1(), "LAND1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLand1_NotLikeSearch(String land1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(land1), xgetCValueLand1(), "LAND1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND1: {varchar(255)}
     * @param land1 The value of land1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLand1_PrefixSearch(String land1) {
        setLand1_LikeSearch(land1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     */
    public void setLand1_IsNull() { regLand1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     */
    public void setLand1_IsNullOrEmpty() { regLand1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAND1: {varchar(255)}
     */
    public void setLand1_IsNotNull() { regLand1(CK_ISNN, DOBJ); }

    protected void regLand1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLand1(), "LAND1"); }
    protected abstract ConditionValue xgetCValueLand1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_Equal(String cgclsdid) {
        doSetCgclsdid_Equal(fRES(cgclsdid));
    }

    protected void doSetCgclsdid_Equal(String cgclsdid) {
        regCgclsdid(CK_EQ, cgclsdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_NotEqual(String cgclsdid) {
        doSetCgclsdid_NotEqual(fRES(cgclsdid));
    }

    protected void doSetCgclsdid_NotEqual(String cgclsdid) {
        regCgclsdid(CK_NES, cgclsdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_GreaterThan(String cgclsdid) {
        regCgclsdid(CK_GT, fRES(cgclsdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_LessThan(String cgclsdid) {
        regCgclsdid(CK_LT, fRES(cgclsdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_GreaterEqual(String cgclsdid) {
        regCgclsdid(CK_GE, fRES(cgclsdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_LessEqual(String cgclsdid) {
        regCgclsdid(CK_LE, fRES(cgclsdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdidList The collection of cgclsdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_InScope(Collection<String> cgclsdidList) {
        doSetCgclsdid_InScope(cgclsdidList);
    }

    protected void doSetCgclsdid_InScope(Collection<String> cgclsdidList) {
        regINS(CK_INS, cTL(cgclsdidList), xgetCValueCgclsdid(), "CGCLSDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdidList The collection of cgclsdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_NotInScope(Collection<String> cgclsdidList) {
        doSetCgclsdid_NotInScope(cgclsdidList);
    }

    protected void doSetCgclsdid_NotInScope(Collection<String> cgclsdidList) {
        regINS(CK_NINS, cTL(cgclsdidList), xgetCValueCgclsdid(), "CGCLSDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGCLSDID: {varchar(255)} <br>
     * <pre>e.g. setCgclsdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cgclsdid The value of cgclsdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCgclsdid_LikeSearch(String cgclsdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cgclsdid), xgetCValueCgclsdid(), "CGCLSDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCgclsdid_NotLikeSearch(String cgclsdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cgclsdid), xgetCValueCgclsdid(), "CGCLSDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGCLSDID: {varchar(255)}
     * @param cgclsdid The value of cgclsdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCgclsdid_PrefixSearch(String cgclsdid) {
        setCgclsdid_LikeSearch(cgclsdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     */
    public void setCgclsdid_IsNull() { regCgclsdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     */
    public void setCgclsdid_IsNullOrEmpty() { regCgclsdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGCLSDID: {varchar(255)}
     */
    public void setCgclsdid_IsNotNull() { regCgclsdid(CK_ISNN, DOBJ); }

    protected void regCgclsdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCgclsdid(), "CGCLSDID"); }
    protected abstract ConditionValue xgetCValueCgclsdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_Equal(String gnlotrnk) {
        doSetGnlotrnk_Equal(fRES(gnlotrnk));
    }

    protected void doSetGnlotrnk_Equal(String gnlotrnk) {
        regGnlotrnk(CK_EQ, gnlotrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_NotEqual(String gnlotrnk) {
        doSetGnlotrnk_NotEqual(fRES(gnlotrnk));
    }

    protected void doSetGnlotrnk_NotEqual(String gnlotrnk) {
        regGnlotrnk(CK_NES, gnlotrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_GreaterThan(String gnlotrnk) {
        regGnlotrnk(CK_GT, fRES(gnlotrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_LessThan(String gnlotrnk) {
        regGnlotrnk(CK_LT, fRES(gnlotrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_GreaterEqual(String gnlotrnk) {
        regGnlotrnk(CK_GE, fRES(gnlotrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_LessEqual(String gnlotrnk) {
        regGnlotrnk(CK_LE, fRES(gnlotrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnkList The collection of gnlotrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_InScope(Collection<String> gnlotrnkList) {
        doSetGnlotrnk_InScope(gnlotrnkList);
    }

    protected void doSetGnlotrnk_InScope(Collection<String> gnlotrnkList) {
        regINS(CK_INS, cTL(gnlotrnkList), xgetCValueGnlotrnk(), "GNLOTRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnkList The collection of gnlotrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_NotInScope(Collection<String> gnlotrnkList) {
        doSetGnlotrnk_NotInScope(gnlotrnkList);
    }

    protected void doSetGnlotrnk_NotInScope(Collection<String> gnlotrnkList) {
        regINS(CK_NINS, cTL(gnlotrnkList), xgetCValueGnlotrnk(), "GNLOTRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GNLOTRNK: {varchar(255)} <br>
     * <pre>e.g. setGnlotrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gnlotrnk The value of gnlotrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGnlotrnk_LikeSearch(String gnlotrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gnlotrnk), xgetCValueGnlotrnk(), "GNLOTRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGnlotrnk_NotLikeSearch(String gnlotrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gnlotrnk), xgetCValueGnlotrnk(), "GNLOTRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     * @param gnlotrnk The value of gnlotrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGnlotrnk_PrefixSearch(String gnlotrnk) {
        setGnlotrnk_LikeSearch(gnlotrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     */
    public void setGnlotrnk_IsNull() { regGnlotrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     */
    public void setGnlotrnk_IsNullOrEmpty() { regGnlotrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GNLOTRNK: {varchar(255)}
     */
    public void setGnlotrnk_IsNotNull() { regGnlotrnk(CK_ISNN, DOBJ); }

    protected void regGnlotrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGnlotrnk(), "GNLOTRNK"); }
    protected abstract ConditionValue xgetCValueGnlotrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_Equal(String mrotrnk) {
        doSetMrotrnk_Equal(fRES(mrotrnk));
    }

    protected void doSetMrotrnk_Equal(String mrotrnk) {
        regMrotrnk(CK_EQ, mrotrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_NotEqual(String mrotrnk) {
        doSetMrotrnk_NotEqual(fRES(mrotrnk));
    }

    protected void doSetMrotrnk_NotEqual(String mrotrnk) {
        regMrotrnk(CK_NES, mrotrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_GreaterThan(String mrotrnk) {
        regMrotrnk(CK_GT, fRES(mrotrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_LessThan(String mrotrnk) {
        regMrotrnk(CK_LT, fRES(mrotrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_GreaterEqual(String mrotrnk) {
        regMrotrnk(CK_GE, fRES(mrotrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_LessEqual(String mrotrnk) {
        regMrotrnk(CK_LE, fRES(mrotrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnkList The collection of mrotrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_InScope(Collection<String> mrotrnkList) {
        doSetMrotrnk_InScope(mrotrnkList);
    }

    protected void doSetMrotrnk_InScope(Collection<String> mrotrnkList) {
        regINS(CK_INS, cTL(mrotrnkList), xgetCValueMrotrnk(), "MROTRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnkList The collection of mrotrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_NotInScope(Collection<String> mrotrnkList) {
        doSetMrotrnk_NotInScope(mrotrnkList);
    }

    protected void doSetMrotrnk_NotInScope(Collection<String> mrotrnkList) {
        regINS(CK_NINS, cTL(mrotrnkList), xgetCValueMrotrnk(), "MROTRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MROTRNK: {varchar(255)} <br>
     * <pre>e.g. setMrotrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mrotrnk The value of mrotrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMrotrnk_LikeSearch(String mrotrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mrotrnk), xgetCValueMrotrnk(), "MROTRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMrotrnk_NotLikeSearch(String mrotrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mrotrnk), xgetCValueMrotrnk(), "MROTRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MROTRNK: {varchar(255)}
     * @param mrotrnk The value of mrotrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMrotrnk_PrefixSearch(String mrotrnk) {
        setMrotrnk_LikeSearch(mrotrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     */
    public void setMrotrnk_IsNull() { regMrotrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     */
    public void setMrotrnk_IsNullOrEmpty() { regMrotrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MROTRNK: {varchar(255)}
     */
    public void setMrotrnk_IsNotNull() { regMrotrnk(CK_ISNN, DOBJ); }

    protected void regMrotrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMrotrnk(), "MROTRNK"); }
    protected abstract ConditionValue xgetCValueMrotrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_Equal(String coid) {
        doSetCoid_Equal(fRES(coid));
    }

    protected void doSetCoid_Equal(String coid) {
        regCoid(CK_EQ, coid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_NotEqual(String coid) {
        doSetCoid_NotEqual(fRES(coid));
    }

    protected void doSetCoid_NotEqual(String coid) {
        regCoid(CK_NES, coid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_GreaterThan(String coid) {
        regCoid(CK_GT, fRES(coid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_LessThan(String coid) {
        regCoid(CK_LT, fRES(coid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_GreaterEqual(String coid) {
        regCoid(CK_GE, fRES(coid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_LessEqual(String coid) {
        regCoid(CK_LE, fRES(coid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COID: {varchar(255)}
     * @param coidList The collection of coid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_InScope(Collection<String> coidList) {
        doSetCoid_InScope(coidList);
    }

    protected void doSetCoid_InScope(Collection<String> coidList) {
        regINS(CK_INS, cTL(coidList), xgetCValueCoid(), "COID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COID: {varchar(255)}
     * @param coidList The collection of coid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_NotInScope(Collection<String> coidList) {
        doSetCoid_NotInScope(coidList);
    }

    protected void doSetCoid_NotInScope(Collection<String> coidList) {
        regINS(CK_NINS, cTL(coidList), xgetCValueCoid(), "COID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COID: {varchar(255)} <br>
     * <pre>e.g. setCoid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param coid The value of coid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCoid_LikeSearch(String coid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(coid), xgetCValueCoid(), "COID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCoid_NotLikeSearch(String coid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(coid), xgetCValueCoid(), "COID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COID: {varchar(255)}
     * @param coid The value of coid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoid_PrefixSearch(String coid) {
        setCoid_LikeSearch(coid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     */
    public void setCoid_IsNull() { regCoid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     */
    public void setCoid_IsNullOrEmpty() { regCoid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COID: {varchar(255)}
     */
    public void setCoid_IsNotNull() { regCoid(CK_ISNN, DOBJ); }

    protected void regCoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCoid(), "COID"); }
    protected abstract ConditionValue xgetCValueCoid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_Equal(String brwkid) {
        doSetBrwkid_Equal(fRES(brwkid));
    }

    protected void doSetBrwkid_Equal(String brwkid) {
        regBrwkid(CK_EQ, brwkid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_NotEqual(String brwkid) {
        doSetBrwkid_NotEqual(fRES(brwkid));
    }

    protected void doSetBrwkid_NotEqual(String brwkid) {
        regBrwkid(CK_NES, brwkid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_GreaterThan(String brwkid) {
        regBrwkid(CK_GT, fRES(brwkid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_LessThan(String brwkid) {
        regBrwkid(CK_LT, fRES(brwkid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_GreaterEqual(String brwkid) {
        regBrwkid(CK_GE, fRES(brwkid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_LessEqual(String brwkid) {
        regBrwkid(CK_LE, fRES(brwkid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkidList The collection of brwkid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_InScope(Collection<String> brwkidList) {
        doSetBrwkid_InScope(brwkidList);
    }

    protected void doSetBrwkid_InScope(Collection<String> brwkidList) {
        regINS(CK_INS, cTL(brwkidList), xgetCValueBrwkid(), "BRWKID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkidList The collection of brwkid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_NotInScope(Collection<String> brwkidList) {
        doSetBrwkid_NotInScope(brwkidList);
    }

    protected void doSetBrwkid_NotInScope(Collection<String> brwkidList) {
        regINS(CK_NINS, cTL(brwkidList), xgetCValueBrwkid(), "BRWKID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRWKID: {varchar(255)} <br>
     * <pre>e.g. setBrwkid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brwkid The value of brwkid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrwkid_LikeSearch(String brwkid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brwkid), xgetCValueBrwkid(), "BRWKID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrwkid_NotLikeSearch(String brwkid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brwkid), xgetCValueBrwkid(), "BRWKID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRWKID: {varchar(255)}
     * @param brwkid The value of brwkid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrwkid_PrefixSearch(String brwkid) {
        setBrwkid_LikeSearch(brwkid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     */
    public void setBrwkid_IsNull() { regBrwkid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     */
    public void setBrwkid_IsNullOrEmpty() { regBrwkid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRWKID: {varchar(255)}
     */
    public void setBrwkid_IsNotNull() { regBrwkid(CK_ISNN, DOBJ); }

    protected void regBrwkid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrwkid(), "BRWKID"); }
    protected abstract ConditionValue xgetCValueBrwkid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_Equal(String shunid) {
        doSetShunid_Equal(fRES(shunid));
    }

    protected void doSetShunid_Equal(String shunid) {
        regShunid(CK_EQ, shunid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_NotEqual(String shunid) {
        doSetShunid_NotEqual(fRES(shunid));
    }

    protected void doSetShunid_NotEqual(String shunid) {
        regShunid(CK_NES, shunid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_GreaterThan(String shunid) {
        regShunid(CK_GT, fRES(shunid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_LessThan(String shunid) {
        regShunid(CK_LT, fRES(shunid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_GreaterEqual(String shunid) {
        regShunid(CK_GE, fRES(shunid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_LessEqual(String shunid) {
        regShunid(CK_LE, fRES(shunid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunidList The collection of shunid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_InScope(Collection<String> shunidList) {
        doSetShunid_InScope(shunidList);
    }

    protected void doSetShunid_InScope(Collection<String> shunidList) {
        regINS(CK_INS, cTL(shunidList), xgetCValueShunid(), "SHUNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunidList The collection of shunid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_NotInScope(Collection<String> shunidList) {
        doSetShunid_NotInScope(shunidList);
    }

    protected void doSetShunid_NotInScope(Collection<String> shunidList) {
        regINS(CK_NINS, cTL(shunidList), xgetCValueShunid(), "SHUNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHUNID: {varchar(255)} <br>
     * <pre>e.g. setShunid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shunid The value of shunid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShunid_LikeSearch(String shunid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shunid), xgetCValueShunid(), "SHUNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShunid_NotLikeSearch(String shunid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shunid), xgetCValueShunid(), "SHUNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHUNID: {varchar(255)}
     * @param shunid The value of shunid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShunid_PrefixSearch(String shunid) {
        setShunid_LikeSearch(shunid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     */
    public void setShunid_IsNull() { regShunid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     */
    public void setShunid_IsNullOrEmpty() { regShunid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHUNID: {varchar(255)}
     */
    public void setShunid_IsNotNull() { regShunid(CK_ISNN, DOBJ); }

    protected void regShunid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShunid(), "SHUNID"); }
    protected abstract ConditionValue xgetCValueShunid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_Equal(String dstkbn) {
        doSetDstkbn_Equal(fRES(dstkbn));
    }

    protected void doSetDstkbn_Equal(String dstkbn) {
        regDstkbn(CK_EQ, dstkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_NotEqual(String dstkbn) {
        doSetDstkbn_NotEqual(fRES(dstkbn));
    }

    protected void doSetDstkbn_NotEqual(String dstkbn) {
        regDstkbn(CK_NES, dstkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_GreaterThan(String dstkbn) {
        regDstkbn(CK_GT, fRES(dstkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_LessThan(String dstkbn) {
        regDstkbn(CK_LT, fRES(dstkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_GreaterEqual(String dstkbn) {
        regDstkbn(CK_GE, fRES(dstkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_LessEqual(String dstkbn) {
        regDstkbn(CK_LE, fRES(dstkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbnList The collection of dstkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_InScope(Collection<String> dstkbnList) {
        doSetDstkbn_InScope(dstkbnList);
    }

    protected void doSetDstkbn_InScope(Collection<String> dstkbnList) {
        regINS(CK_INS, cTL(dstkbnList), xgetCValueDstkbn(), "DSTKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbnList The collection of dstkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_NotInScope(Collection<String> dstkbnList) {
        doSetDstkbn_NotInScope(dstkbnList);
    }

    protected void doSetDstkbn_NotInScope(Collection<String> dstkbnList) {
        regINS(CK_NINS, cTL(dstkbnList), xgetCValueDstkbn(), "DSTKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSTKBN: {varchar(255)} <br>
     * <pre>e.g. setDstkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dstkbn The value of dstkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDstkbn_LikeSearch(String dstkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dstkbn), xgetCValueDstkbn(), "DSTKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDstkbn_NotLikeSearch(String dstkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dstkbn), xgetCValueDstkbn(), "DSTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSTKBN: {varchar(255)}
     * @param dstkbn The value of dstkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstkbn_PrefixSearch(String dstkbn) {
        setDstkbn_LikeSearch(dstkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     */
    public void setDstkbn_IsNull() { regDstkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     */
    public void setDstkbn_IsNullOrEmpty() { regDstkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSTKBN: {varchar(255)}
     */
    public void setDstkbn_IsNotNull() { regDstkbn(CK_ISNN, DOBJ); }

    protected void regDstkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDstkbn(), "DSTKBN"); }
    protected abstract ConditionValue xgetCValueDstkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_Equal(String reomatnr) {
        doSetReomatnr_Equal(fRES(reomatnr));
    }

    protected void doSetReomatnr_Equal(String reomatnr) {
        regReomatnr(CK_EQ, reomatnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_NotEqual(String reomatnr) {
        doSetReomatnr_NotEqual(fRES(reomatnr));
    }

    protected void doSetReomatnr_NotEqual(String reomatnr) {
        regReomatnr(CK_NES, reomatnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_GreaterThan(String reomatnr) {
        regReomatnr(CK_GT, fRES(reomatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_LessThan(String reomatnr) {
        regReomatnr(CK_LT, fRES(reomatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_GreaterEqual(String reomatnr) {
        regReomatnr(CK_GE, fRES(reomatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_LessEqual(String reomatnr) {
        regReomatnr(CK_LE, fRES(reomatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnrList The collection of reomatnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_InScope(Collection<String> reomatnrList) {
        doSetReomatnr_InScope(reomatnrList);
    }

    protected void doSetReomatnr_InScope(Collection<String> reomatnrList) {
        regINS(CK_INS, cTL(reomatnrList), xgetCValueReomatnr(), "REOMATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnrList The collection of reomatnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_NotInScope(Collection<String> reomatnrList) {
        doSetReomatnr_NotInScope(reomatnrList);
    }

    protected void doSetReomatnr_NotInScope(Collection<String> reomatnrList) {
        regINS(CK_NINS, cTL(reomatnrList), xgetCValueReomatnr(), "REOMATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REOMATNR: {varchar(255)} <br>
     * <pre>e.g. setReomatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reomatnr The value of reomatnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReomatnr_LikeSearch(String reomatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reomatnr), xgetCValueReomatnr(), "REOMATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReomatnr_NotLikeSearch(String reomatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reomatnr), xgetCValueReomatnr(), "REOMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REOMATNR: {varchar(255)}
     * @param reomatnr The value of reomatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReomatnr_PrefixSearch(String reomatnr) {
        setReomatnr_LikeSearch(reomatnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     */
    public void setReomatnr_IsNull() { regReomatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     */
    public void setReomatnr_IsNullOrEmpty() { regReomatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REOMATNR: {varchar(255)}
     */
    public void setReomatnr_IsNotNull() { regReomatnr(CK_ISNN, DOBJ); }

    protected void regReomatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReomatnr(), "REOMATNR"); }
    protected abstract ConditionValue xgetCValueReomatnr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_Equal(String dspeckb) {
        doSetDspeckb_Equal(fRES(dspeckb));
    }

    protected void doSetDspeckb_Equal(String dspeckb) {
        regDspeckb(CK_EQ, dspeckb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_NotEqual(String dspeckb) {
        doSetDspeckb_NotEqual(fRES(dspeckb));
    }

    protected void doSetDspeckb_NotEqual(String dspeckb) {
        regDspeckb(CK_NES, dspeckb);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_GreaterThan(String dspeckb) {
        regDspeckb(CK_GT, fRES(dspeckb));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_LessThan(String dspeckb) {
        regDspeckb(CK_LT, fRES(dspeckb));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_GreaterEqual(String dspeckb) {
        regDspeckb(CK_GE, fRES(dspeckb));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_LessEqual(String dspeckb) {
        regDspeckb(CK_LE, fRES(dspeckb));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckbList The collection of dspeckb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_InScope(Collection<String> dspeckbList) {
        doSetDspeckb_InScope(dspeckbList);
    }

    protected void doSetDspeckb_InScope(Collection<String> dspeckbList) {
        regINS(CK_INS, cTL(dspeckbList), xgetCValueDspeckb(), "DSPECKB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckbList The collection of dspeckb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_NotInScope(Collection<String> dspeckbList) {
        doSetDspeckb_NotInScope(dspeckbList);
    }

    protected void doSetDspeckb_NotInScope(Collection<String> dspeckbList) {
        regINS(CK_NINS, cTL(dspeckbList), xgetCValueDspeckb(), "DSPECKB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSPECKB: {varchar(255)} <br>
     * <pre>e.g. setDspeckb_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dspeckb The value of dspeckb as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDspeckb_LikeSearch(String dspeckb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dspeckb), xgetCValueDspeckb(), "DSPECKB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDspeckb_NotLikeSearch(String dspeckb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dspeckb), xgetCValueDspeckb(), "DSPECKB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DSPECKB: {varchar(255)}
     * @param dspeckb The value of dspeckb as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDspeckb_PrefixSearch(String dspeckb) {
        setDspeckb_LikeSearch(dspeckb, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     */
    public void setDspeckb_IsNull() { regDspeckb(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     */
    public void setDspeckb_IsNullOrEmpty() { regDspeckb(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSPECKB: {varchar(255)}
     */
    public void setDspeckb_IsNotNull() { regDspeckb(CK_ISNN, DOBJ); }

    protected void regDspeckb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDspeckb(), "DSPECKB"); }
    protected abstract ConditionValue xgetCValueDspeckb();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_Equal(String sgmid) {
        doSetSgmid_Equal(fRES(sgmid));
    }

    protected void doSetSgmid_Equal(String sgmid) {
        regSgmid(CK_EQ, sgmid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_NotEqual(String sgmid) {
        doSetSgmid_NotEqual(fRES(sgmid));
    }

    protected void doSetSgmid_NotEqual(String sgmid) {
        regSgmid(CK_NES, sgmid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_GreaterThan(String sgmid) {
        regSgmid(CK_GT, fRES(sgmid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_LessThan(String sgmid) {
        regSgmid(CK_LT, fRES(sgmid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_GreaterEqual(String sgmid) {
        regSgmid(CK_GE, fRES(sgmid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_LessEqual(String sgmid) {
        regSgmid(CK_LE, fRES(sgmid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmidList The collection of sgmid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_InScope(Collection<String> sgmidList) {
        doSetSgmid_InScope(sgmidList);
    }

    protected void doSetSgmid_InScope(Collection<String> sgmidList) {
        regINS(CK_INS, cTL(sgmidList), xgetCValueSgmid(), "SGMID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmidList The collection of sgmid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_NotInScope(Collection<String> sgmidList) {
        doSetSgmid_NotInScope(sgmidList);
    }

    protected void doSetSgmid_NotInScope(Collection<String> sgmidList) {
        regINS(CK_NINS, cTL(sgmidList), xgetCValueSgmid(), "SGMID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SGMID: {varchar(255)} <br>
     * <pre>e.g. setSgmid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sgmid The value of sgmid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSgmid_LikeSearch(String sgmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sgmid), xgetCValueSgmid(), "SGMID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSgmid_NotLikeSearch(String sgmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sgmid), xgetCValueSgmid(), "SGMID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SGMID: {varchar(255)}
     * @param sgmid The value of sgmid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSgmid_PrefixSearch(String sgmid) {
        setSgmid_LikeSearch(sgmid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     */
    public void setSgmid_IsNull() { regSgmid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     */
    public void setSgmid_IsNullOrEmpty() { regSgmid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGMID: {varchar(255)}
     */
    public void setSgmid_IsNotNull() { regSgmid(CK_ISNN, DOBJ); }

    protected void regSgmid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSgmid(), "SGMID"); }
    protected abstract ConditionValue xgetCValueSgmid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_Equal(String makileng) {
        doSetMakileng_Equal(fRES(makileng));
    }

    protected void doSetMakileng_Equal(String makileng) {
        regMakileng(CK_EQ, makileng);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_NotEqual(String makileng) {
        doSetMakileng_NotEqual(fRES(makileng));
    }

    protected void doSetMakileng_NotEqual(String makileng) {
        regMakileng(CK_NES, makileng);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_GreaterThan(String makileng) {
        regMakileng(CK_GT, fRES(makileng));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_LessThan(String makileng) {
        regMakileng(CK_LT, fRES(makileng));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_GreaterEqual(String makileng) {
        regMakileng(CK_GE, fRES(makileng));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_LessEqual(String makileng) {
        regMakileng(CK_LE, fRES(makileng));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makilengList The collection of makileng as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_InScope(Collection<String> makilengList) {
        doSetMakileng_InScope(makilengList);
    }

    protected void doSetMakileng_InScope(Collection<String> makilengList) {
        regINS(CK_INS, cTL(makilengList), xgetCValueMakileng(), "MAKILENG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makilengList The collection of makileng as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_NotInScope(Collection<String> makilengList) {
        doSetMakileng_NotInScope(makilengList);
    }

    protected void doSetMakileng_NotInScope(Collection<String> makilengList) {
        regINS(CK_NINS, cTL(makilengList), xgetCValueMakileng(), "MAKILENG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKILENG: {varchar(255)} <br>
     * <pre>e.g. setMakileng_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makileng The value of makileng as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakileng_LikeSearch(String makileng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makileng), xgetCValueMakileng(), "MAKILENG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakileng_NotLikeSearch(String makileng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makileng), xgetCValueMakileng(), "MAKILENG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKILENG: {varchar(255)}
     * @param makileng The value of makileng as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakileng_PrefixSearch(String makileng) {
        setMakileng_LikeSearch(makileng, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     */
    public void setMakileng_IsNull() { regMakileng(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     */
    public void setMakileng_IsNullOrEmpty() { regMakileng(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKILENG: {varchar(255)}
     */
    public void setMakileng_IsNotNull() { regMakileng(CK_ISNN, DOBJ); }

    protected void regMakileng(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakileng(), "MAKILENG"); }
    protected abstract ConditionValue xgetCValueMakileng();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_Equal(String makidia) {
        doSetMakidia_Equal(fRES(makidia));
    }

    protected void doSetMakidia_Equal(String makidia) {
        regMakidia(CK_EQ, makidia);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_NotEqual(String makidia) {
        doSetMakidia_NotEqual(fRES(makidia));
    }

    protected void doSetMakidia_NotEqual(String makidia) {
        regMakidia(CK_NES, makidia);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_GreaterThan(String makidia) {
        regMakidia(CK_GT, fRES(makidia));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_LessThan(String makidia) {
        regMakidia(CK_LT, fRES(makidia));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_GreaterEqual(String makidia) {
        regMakidia(CK_GE, fRES(makidia));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_LessEqual(String makidia) {
        regMakidia(CK_LE, fRES(makidia));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidiaList The collection of makidia as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_InScope(Collection<String> makidiaList) {
        doSetMakidia_InScope(makidiaList);
    }

    protected void doSetMakidia_InScope(Collection<String> makidiaList) {
        regINS(CK_INS, cTL(makidiaList), xgetCValueMakidia(), "MAKIDIA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidiaList The collection of makidia as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_NotInScope(Collection<String> makidiaList) {
        doSetMakidia_NotInScope(makidiaList);
    }

    protected void doSetMakidia_NotInScope(Collection<String> makidiaList) {
        regINS(CK_NINS, cTL(makidiaList), xgetCValueMakidia(), "MAKIDIA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKIDIA: {varchar(255)} <br>
     * <pre>e.g. setMakidia_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makidia The value of makidia as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakidia_LikeSearch(String makidia, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makidia), xgetCValueMakidia(), "MAKIDIA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakidia_NotLikeSearch(String makidia, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makidia), xgetCValueMakidia(), "MAKIDIA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKIDIA: {varchar(255)}
     * @param makidia The value of makidia as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakidia_PrefixSearch(String makidia) {
        setMakidia_LikeSearch(makidia, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     */
    public void setMakidia_IsNull() { regMakidia(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     */
    public void setMakidia_IsNullOrEmpty() { regMakidia(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKIDIA: {varchar(255)}
     */
    public void setMakidia_IsNotNull() { regMakidia(CK_ISNN, DOBJ); }

    protected void regMakidia(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakidia(), "MAKIDIA"); }
    protected abstract ConditionValue xgetCValueMakidia();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_Equal(String gdmsrp) {
        doSetGdmsrp_Equal(fRES(gdmsrp));
    }

    protected void doSetGdmsrp_Equal(String gdmsrp) {
        regGdmsrp(CK_EQ, gdmsrp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_NotEqual(String gdmsrp) {
        doSetGdmsrp_NotEqual(fRES(gdmsrp));
    }

    protected void doSetGdmsrp_NotEqual(String gdmsrp) {
        regGdmsrp(CK_NES, gdmsrp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_GreaterThan(String gdmsrp) {
        regGdmsrp(CK_GT, fRES(gdmsrp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_LessThan(String gdmsrp) {
        regGdmsrp(CK_LT, fRES(gdmsrp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_GreaterEqual(String gdmsrp) {
        regGdmsrp(CK_GE, fRES(gdmsrp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_LessEqual(String gdmsrp) {
        regGdmsrp(CK_LE, fRES(gdmsrp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrpList The collection of gdmsrp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_InScope(Collection<String> gdmsrpList) {
        doSetGdmsrp_InScope(gdmsrpList);
    }

    protected void doSetGdmsrp_InScope(Collection<String> gdmsrpList) {
        regINS(CK_INS, cTL(gdmsrpList), xgetCValueGdmsrp(), "GDMSRP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrpList The collection of gdmsrp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_NotInScope(Collection<String> gdmsrpList) {
        doSetGdmsrp_NotInScope(gdmsrpList);
    }

    protected void doSetGdmsrp_NotInScope(Collection<String> gdmsrpList) {
        regINS(CK_NINS, cTL(gdmsrpList), xgetCValueGdmsrp(), "GDMSRP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDMSRP: {varchar(255)} <br>
     * <pre>e.g. setGdmsrp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gdmsrp The value of gdmsrp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGdmsrp_LikeSearch(String gdmsrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gdmsrp), xgetCValueGdmsrp(), "GDMSRP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGdmsrp_NotLikeSearch(String gdmsrp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gdmsrp), xgetCValueGdmsrp(), "GDMSRP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDMSRP: {varchar(255)}
     * @param gdmsrp The value of gdmsrp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdmsrp_PrefixSearch(String gdmsrp) {
        setGdmsrp_LikeSearch(gdmsrp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     */
    public void setGdmsrp_IsNull() { regGdmsrp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     */
    public void setGdmsrp_IsNullOrEmpty() { regGdmsrp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GDMSRP: {varchar(255)}
     */
    public void setGdmsrp_IsNotNull() { regGdmsrp(CK_ISNN, DOBJ); }

    protected void regGdmsrp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGdmsrp(), "GDMSRP"); }
    protected abstract ConditionValue xgetCValueGdmsrp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_Equal(String gdslu) {
        doSetGdslu_Equal(fRES(gdslu));
    }

    protected void doSetGdslu_Equal(String gdslu) {
        regGdslu(CK_EQ, gdslu);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_NotEqual(String gdslu) {
        doSetGdslu_NotEqual(fRES(gdslu));
    }

    protected void doSetGdslu_NotEqual(String gdslu) {
        regGdslu(CK_NES, gdslu);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_GreaterThan(String gdslu) {
        regGdslu(CK_GT, fRES(gdslu));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_LessThan(String gdslu) {
        regGdslu(CK_LT, fRES(gdslu));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_GreaterEqual(String gdslu) {
        regGdslu(CK_GE, fRES(gdslu));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_LessEqual(String gdslu) {
        regGdslu(CK_LE, fRES(gdslu));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdsluList The collection of gdslu as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_InScope(Collection<String> gdsluList) {
        doSetGdslu_InScope(gdsluList);
    }

    protected void doSetGdslu_InScope(Collection<String> gdsluList) {
        regINS(CK_INS, cTL(gdsluList), xgetCValueGdslu(), "GDSLU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdsluList The collection of gdslu as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_NotInScope(Collection<String> gdsluList) {
        doSetGdslu_NotInScope(gdsluList);
    }

    protected void doSetGdslu_NotInScope(Collection<String> gdsluList) {
        regINS(CK_NINS, cTL(gdsluList), xgetCValueGdslu(), "GDSLU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDSLU: {varchar(255)} <br>
     * <pre>e.g. setGdslu_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gdslu The value of gdslu as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGdslu_LikeSearch(String gdslu, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gdslu), xgetCValueGdslu(), "GDSLU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGdslu_NotLikeSearch(String gdslu, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gdslu), xgetCValueGdslu(), "GDSLU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDSLU: {varchar(255)}
     * @param gdslu The value of gdslu as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdslu_PrefixSearch(String gdslu) {
        setGdslu_LikeSearch(gdslu, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     */
    public void setGdslu_IsNull() { regGdslu(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     */
    public void setGdslu_IsNullOrEmpty() { regGdslu(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GDSLU: {varchar(255)}
     */
    public void setGdslu_IsNotNull() { regGdslu(CK_ISNN, DOBJ); }

    protected void regGdslu(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGdslu(), "GDSLU"); }
    protected abstract ConditionValue xgetCValueGdslu();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_Equal(String gdpru) {
        doSetGdpru_Equal(fRES(gdpru));
    }

    protected void doSetGdpru_Equal(String gdpru) {
        regGdpru(CK_EQ, gdpru);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_NotEqual(String gdpru) {
        doSetGdpru_NotEqual(fRES(gdpru));
    }

    protected void doSetGdpru_NotEqual(String gdpru) {
        regGdpru(CK_NES, gdpru);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_GreaterThan(String gdpru) {
        regGdpru(CK_GT, fRES(gdpru));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_LessThan(String gdpru) {
        regGdpru(CK_LT, fRES(gdpru));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_GreaterEqual(String gdpru) {
        regGdpru(CK_GE, fRES(gdpru));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_LessEqual(String gdpru) {
        regGdpru(CK_LE, fRES(gdpru));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpruList The collection of gdpru as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_InScope(Collection<String> gdpruList) {
        doSetGdpru_InScope(gdpruList);
    }

    protected void doSetGdpru_InScope(Collection<String> gdpruList) {
        regINS(CK_INS, cTL(gdpruList), xgetCValueGdpru(), "GDPRU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpruList The collection of gdpru as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_NotInScope(Collection<String> gdpruList) {
        doSetGdpru_NotInScope(gdpruList);
    }

    protected void doSetGdpru_NotInScope(Collection<String> gdpruList) {
        regINS(CK_NINS, cTL(gdpruList), xgetCValueGdpru(), "GDPRU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDPRU: {varchar(255)} <br>
     * <pre>e.g. setGdpru_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gdpru The value of gdpru as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGdpru_LikeSearch(String gdpru, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gdpru), xgetCValueGdpru(), "GDPRU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGdpru_NotLikeSearch(String gdpru, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gdpru), xgetCValueGdpru(), "GDPRU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GDPRU: {varchar(255)}
     * @param gdpru The value of gdpru as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGdpru_PrefixSearch(String gdpru) {
        setGdpru_LikeSearch(gdpru, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     */
    public void setGdpru_IsNull() { regGdpru(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     */
    public void setGdpru_IsNullOrEmpty() { regGdpru(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GDPRU: {varchar(255)}
     */
    public void setGdpru_IsNotNull() { regGdpru(CK_ISNN, DOBJ); }

    protected void regGdpru(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGdpru(), "GDPRU"); }
    protected abstract ConditionValue xgetCValueGdpru();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_Equal(String exima) {
        doSetExima_Equal(fRES(exima));
    }

    protected void doSetExima_Equal(String exima) {
        regExima(CK_EQ, exima);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_NotEqual(String exima) {
        doSetExima_NotEqual(fRES(exima));
    }

    protected void doSetExima_NotEqual(String exima) {
        regExima(CK_NES, exima);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_GreaterThan(String exima) {
        regExima(CK_GT, fRES(exima));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_LessThan(String exima) {
        regExima(CK_LT, fRES(exima));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_GreaterEqual(String exima) {
        regExima(CK_GE, fRES(exima));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_LessEqual(String exima) {
        regExima(CK_LE, fRES(exima));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param eximaList The collection of exima as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_InScope(Collection<String> eximaList) {
        doSetExima_InScope(eximaList);
    }

    protected void doSetExima_InScope(Collection<String> eximaList) {
        regINS(CK_INS, cTL(eximaList), xgetCValueExima(), "EXIMA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param eximaList The collection of exima as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_NotInScope(Collection<String> eximaList) {
        doSetExima_NotInScope(eximaList);
    }

    protected void doSetExima_NotInScope(Collection<String> eximaList) {
        regINS(CK_NINS, cTL(eximaList), xgetCValueExima(), "EXIMA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMA: {varchar(255)} <br>
     * <pre>e.g. setExima_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param exima The value of exima as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExima_LikeSearch(String exima, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(exima), xgetCValueExima(), "EXIMA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExima_NotLikeSearch(String exima, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exima), xgetCValueExima(), "EXIMA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMA: {varchar(255)}
     * @param exima The value of exima as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExima_PrefixSearch(String exima) {
        setExima_LikeSearch(exima, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     */
    public void setExima_IsNull() { regExima(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     */
    public void setExima_IsNullOrEmpty() { regExima(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMA: {varchar(255)}
     */
    public void setExima_IsNotNull() { regExima(CK_ISNN, DOBJ); }

    protected void regExima(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExima(), "EXIMA"); }
    protected abstract ConditionValue xgetCValueExima();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_Equal(String eximb) {
        doSetEximb_Equal(fRES(eximb));
    }

    protected void doSetEximb_Equal(String eximb) {
        regEximb(CK_EQ, eximb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_NotEqual(String eximb) {
        doSetEximb_NotEqual(fRES(eximb));
    }

    protected void doSetEximb_NotEqual(String eximb) {
        regEximb(CK_NES, eximb);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_GreaterThan(String eximb) {
        regEximb(CK_GT, fRES(eximb));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_LessThan(String eximb) {
        regEximb(CK_LT, fRES(eximb));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_GreaterEqual(String eximb) {
        regEximb(CK_GE, fRES(eximb));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_LessEqual(String eximb) {
        regEximb(CK_LE, fRES(eximb));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximbList The collection of eximb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_InScope(Collection<String> eximbList) {
        doSetEximb_InScope(eximbList);
    }

    protected void doSetEximb_InScope(Collection<String> eximbList) {
        regINS(CK_INS, cTL(eximbList), xgetCValueEximb(), "EXIMB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximbList The collection of eximb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_NotInScope(Collection<String> eximbList) {
        doSetEximb_NotInScope(eximbList);
    }

    protected void doSetEximb_NotInScope(Collection<String> eximbList) {
        regINS(CK_NINS, cTL(eximbList), xgetCValueEximb(), "EXIMB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMB: {varchar(255)} <br>
     * <pre>e.g. setEximb_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximb The value of eximb as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximb_LikeSearch(String eximb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximb), xgetCValueEximb(), "EXIMB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximb_NotLikeSearch(String eximb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximb), xgetCValueEximb(), "EXIMB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMB: {varchar(255)}
     * @param eximb The value of eximb as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximb_PrefixSearch(String eximb) {
        setEximb_LikeSearch(eximb, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     */
    public void setEximb_IsNull() { regEximb(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     */
    public void setEximb_IsNullOrEmpty() { regEximb(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMB: {varchar(255)}
     */
    public void setEximb_IsNotNull() { regEximb(CK_ISNN, DOBJ); }

    protected void regEximb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximb(), "EXIMB"); }
    protected abstract ConditionValue xgetCValueEximb();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_Equal(String eximc) {
        doSetEximc_Equal(fRES(eximc));
    }

    protected void doSetEximc_Equal(String eximc) {
        regEximc(CK_EQ, eximc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_NotEqual(String eximc) {
        doSetEximc_NotEqual(fRES(eximc));
    }

    protected void doSetEximc_NotEqual(String eximc) {
        regEximc(CK_NES, eximc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_GreaterThan(String eximc) {
        regEximc(CK_GT, fRES(eximc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_LessThan(String eximc) {
        regEximc(CK_LT, fRES(eximc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_GreaterEqual(String eximc) {
        regEximc(CK_GE, fRES(eximc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_LessEqual(String eximc) {
        regEximc(CK_LE, fRES(eximc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximcList The collection of eximc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_InScope(Collection<String> eximcList) {
        doSetEximc_InScope(eximcList);
    }

    protected void doSetEximc_InScope(Collection<String> eximcList) {
        regINS(CK_INS, cTL(eximcList), xgetCValueEximc(), "EXIMC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximcList The collection of eximc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_NotInScope(Collection<String> eximcList) {
        doSetEximc_NotInScope(eximcList);
    }

    protected void doSetEximc_NotInScope(Collection<String> eximcList) {
        regINS(CK_NINS, cTL(eximcList), xgetCValueEximc(), "EXIMC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMC: {varchar(255)} <br>
     * <pre>e.g. setEximc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximc The value of eximc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximc_LikeSearch(String eximc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximc), xgetCValueEximc(), "EXIMC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximc_NotLikeSearch(String eximc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximc), xgetCValueEximc(), "EXIMC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMC: {varchar(255)}
     * @param eximc The value of eximc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximc_PrefixSearch(String eximc) {
        setEximc_LikeSearch(eximc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     */
    public void setEximc_IsNull() { regEximc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     */
    public void setEximc_IsNullOrEmpty() { regEximc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMC: {varchar(255)}
     */
    public void setEximc_IsNotNull() { regEximc(CK_ISNN, DOBJ); }

    protected void regEximc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximc(), "EXIMC"); }
    protected abstract ConditionValue xgetCValueEximc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_Equal(String eximd) {
        doSetEximd_Equal(fRES(eximd));
    }

    protected void doSetEximd_Equal(String eximd) {
        regEximd(CK_EQ, eximd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_NotEqual(String eximd) {
        doSetEximd_NotEqual(fRES(eximd));
    }

    protected void doSetEximd_NotEqual(String eximd) {
        regEximd(CK_NES, eximd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_GreaterThan(String eximd) {
        regEximd(CK_GT, fRES(eximd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_LessThan(String eximd) {
        regEximd(CK_LT, fRES(eximd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_GreaterEqual(String eximd) {
        regEximd(CK_GE, fRES(eximd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_LessEqual(String eximd) {
        regEximd(CK_LE, fRES(eximd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximdList The collection of eximd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_InScope(Collection<String> eximdList) {
        doSetEximd_InScope(eximdList);
    }

    protected void doSetEximd_InScope(Collection<String> eximdList) {
        regINS(CK_INS, cTL(eximdList), xgetCValueEximd(), "EXIMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximdList The collection of eximd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_NotInScope(Collection<String> eximdList) {
        doSetEximd_NotInScope(eximdList);
    }

    protected void doSetEximd_NotInScope(Collection<String> eximdList) {
        regINS(CK_NINS, cTL(eximdList), xgetCValueEximd(), "EXIMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMD: {varchar(255)} <br>
     * <pre>e.g. setEximd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximd The value of eximd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximd_LikeSearch(String eximd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximd), xgetCValueEximd(), "EXIMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximd_NotLikeSearch(String eximd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximd), xgetCValueEximd(), "EXIMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMD: {varchar(255)}
     * @param eximd The value of eximd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximd_PrefixSearch(String eximd) {
        setEximd_LikeSearch(eximd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     */
    public void setEximd_IsNull() { regEximd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     */
    public void setEximd_IsNullOrEmpty() { regEximd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMD: {varchar(255)}
     */
    public void setEximd_IsNotNull() { regEximd(CK_ISNN, DOBJ); }

    protected void regEximd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximd(), "EXIMD"); }
    protected abstract ConditionValue xgetCValueEximd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_Equal(String exime) {
        doSetExime_Equal(fRES(exime));
    }

    protected void doSetExime_Equal(String exime) {
        regExime(CK_EQ, exime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_NotEqual(String exime) {
        doSetExime_NotEqual(fRES(exime));
    }

    protected void doSetExime_NotEqual(String exime) {
        regExime(CK_NES, exime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_GreaterThan(String exime) {
        regExime(CK_GT, fRES(exime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_LessThan(String exime) {
        regExime(CK_LT, fRES(exime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_GreaterEqual(String exime) {
        regExime(CK_GE, fRES(exime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_LessEqual(String exime) {
        regExime(CK_LE, fRES(exime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIME: {varchar(255)}
     * @param eximeList The collection of exime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_InScope(Collection<String> eximeList) {
        doSetExime_InScope(eximeList);
    }

    protected void doSetExime_InScope(Collection<String> eximeList) {
        regINS(CK_INS, cTL(eximeList), xgetCValueExime(), "EXIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIME: {varchar(255)}
     * @param eximeList The collection of exime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_NotInScope(Collection<String> eximeList) {
        doSetExime_NotInScope(eximeList);
    }

    protected void doSetExime_NotInScope(Collection<String> eximeList) {
        regINS(CK_NINS, cTL(eximeList), xgetCValueExime(), "EXIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIME: {varchar(255)} <br>
     * <pre>e.g. setExime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param exime The value of exime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExime_LikeSearch(String exime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(exime), xgetCValueExime(), "EXIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExime_NotLikeSearch(String exime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exime), xgetCValueExime(), "EXIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIME: {varchar(255)}
     * @param exime The value of exime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExime_PrefixSearch(String exime) {
        setExime_LikeSearch(exime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     */
    public void setExime_IsNull() { regExime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     */
    public void setExime_IsNullOrEmpty() { regExime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIME: {varchar(255)}
     */
    public void setExime_IsNotNull() { regExime(CK_ISNN, DOBJ); }

    protected void regExime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExime(), "EXIME"); }
    protected abstract ConditionValue xgetCValueExime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_Equal(String eximf) {
        doSetEximf_Equal(fRES(eximf));
    }

    protected void doSetEximf_Equal(String eximf) {
        regEximf(CK_EQ, eximf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_NotEqual(String eximf) {
        doSetEximf_NotEqual(fRES(eximf));
    }

    protected void doSetEximf_NotEqual(String eximf) {
        regEximf(CK_NES, eximf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_GreaterThan(String eximf) {
        regEximf(CK_GT, fRES(eximf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_LessThan(String eximf) {
        regEximf(CK_LT, fRES(eximf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_GreaterEqual(String eximf) {
        regEximf(CK_GE, fRES(eximf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_LessEqual(String eximf) {
        regEximf(CK_LE, fRES(eximf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximfList The collection of eximf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_InScope(Collection<String> eximfList) {
        doSetEximf_InScope(eximfList);
    }

    protected void doSetEximf_InScope(Collection<String> eximfList) {
        regINS(CK_INS, cTL(eximfList), xgetCValueEximf(), "EXIMF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximfList The collection of eximf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_NotInScope(Collection<String> eximfList) {
        doSetEximf_NotInScope(eximfList);
    }

    protected void doSetEximf_NotInScope(Collection<String> eximfList) {
        regINS(CK_NINS, cTL(eximfList), xgetCValueEximf(), "EXIMF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMF: {varchar(255)} <br>
     * <pre>e.g. setEximf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximf The value of eximf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximf_LikeSearch(String eximf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximf), xgetCValueEximf(), "EXIMF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximf_NotLikeSearch(String eximf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximf), xgetCValueEximf(), "EXIMF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMF: {varchar(255)}
     * @param eximf The value of eximf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximf_PrefixSearch(String eximf) {
        setEximf_LikeSearch(eximf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     */
    public void setEximf_IsNull() { regEximf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     */
    public void setEximf_IsNullOrEmpty() { regEximf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMF: {varchar(255)}
     */
    public void setEximf_IsNotNull() { regEximf(CK_ISNN, DOBJ); }

    protected void regEximf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximf(), "EXIMF"); }
    protected abstract ConditionValue xgetCValueEximf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_Equal(String eximg) {
        doSetEximg_Equal(fRES(eximg));
    }

    protected void doSetEximg_Equal(String eximg) {
        regEximg(CK_EQ, eximg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_NotEqual(String eximg) {
        doSetEximg_NotEqual(fRES(eximg));
    }

    protected void doSetEximg_NotEqual(String eximg) {
        regEximg(CK_NES, eximg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_GreaterThan(String eximg) {
        regEximg(CK_GT, fRES(eximg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_LessThan(String eximg) {
        regEximg(CK_LT, fRES(eximg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_GreaterEqual(String eximg) {
        regEximg(CK_GE, fRES(eximg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_LessEqual(String eximg) {
        regEximg(CK_LE, fRES(eximg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximgList The collection of eximg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_InScope(Collection<String> eximgList) {
        doSetEximg_InScope(eximgList);
    }

    protected void doSetEximg_InScope(Collection<String> eximgList) {
        regINS(CK_INS, cTL(eximgList), xgetCValueEximg(), "EXIMG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximgList The collection of eximg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_NotInScope(Collection<String> eximgList) {
        doSetEximg_NotInScope(eximgList);
    }

    protected void doSetEximg_NotInScope(Collection<String> eximgList) {
        regINS(CK_NINS, cTL(eximgList), xgetCValueEximg(), "EXIMG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMG: {varchar(255)} <br>
     * <pre>e.g. setEximg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximg The value of eximg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximg_LikeSearch(String eximg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximg), xgetCValueEximg(), "EXIMG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximg_NotLikeSearch(String eximg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximg), xgetCValueEximg(), "EXIMG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMG: {varchar(255)}
     * @param eximg The value of eximg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximg_PrefixSearch(String eximg) {
        setEximg_LikeSearch(eximg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     */
    public void setEximg_IsNull() { regEximg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     */
    public void setEximg_IsNullOrEmpty() { regEximg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMG: {varchar(255)}
     */
    public void setEximg_IsNotNull() { regEximg(CK_ISNN, DOBJ); }

    protected void regEximg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximg(), "EXIMG"); }
    protected abstract ConditionValue xgetCValueEximg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_Equal(String eximh) {
        doSetEximh_Equal(fRES(eximh));
    }

    protected void doSetEximh_Equal(String eximh) {
        regEximh(CK_EQ, eximh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_NotEqual(String eximh) {
        doSetEximh_NotEqual(fRES(eximh));
    }

    protected void doSetEximh_NotEqual(String eximh) {
        regEximh(CK_NES, eximh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_GreaterThan(String eximh) {
        regEximh(CK_GT, fRES(eximh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_LessThan(String eximh) {
        regEximh(CK_LT, fRES(eximh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_GreaterEqual(String eximh) {
        regEximh(CK_GE, fRES(eximh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_LessEqual(String eximh) {
        regEximh(CK_LE, fRES(eximh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximhList The collection of eximh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_InScope(Collection<String> eximhList) {
        doSetEximh_InScope(eximhList);
    }

    protected void doSetEximh_InScope(Collection<String> eximhList) {
        regINS(CK_INS, cTL(eximhList), xgetCValueEximh(), "EXIMH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximhList The collection of eximh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_NotInScope(Collection<String> eximhList) {
        doSetEximh_NotInScope(eximhList);
    }

    protected void doSetEximh_NotInScope(Collection<String> eximhList) {
        regINS(CK_NINS, cTL(eximhList), xgetCValueEximh(), "EXIMH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMH: {varchar(255)} <br>
     * <pre>e.g. setEximh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximh The value of eximh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximh_LikeSearch(String eximh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximh), xgetCValueEximh(), "EXIMH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximh_NotLikeSearch(String eximh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximh), xgetCValueEximh(), "EXIMH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMH: {varchar(255)}
     * @param eximh The value of eximh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximh_PrefixSearch(String eximh) {
        setEximh_LikeSearch(eximh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     */
    public void setEximh_IsNull() { regEximh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     */
    public void setEximh_IsNullOrEmpty() { regEximh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMH: {varchar(255)}
     */
    public void setEximh_IsNotNull() { regEximh(CK_ISNN, DOBJ); }

    protected void regEximh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximh(), "EXIMH"); }
    protected abstract ConditionValue xgetCValueEximh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_Equal(String eximi) {
        doSetEximi_Equal(fRES(eximi));
    }

    protected void doSetEximi_Equal(String eximi) {
        regEximi(CK_EQ, eximi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_NotEqual(String eximi) {
        doSetEximi_NotEqual(fRES(eximi));
    }

    protected void doSetEximi_NotEqual(String eximi) {
        regEximi(CK_NES, eximi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_GreaterThan(String eximi) {
        regEximi(CK_GT, fRES(eximi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_LessThan(String eximi) {
        regEximi(CK_LT, fRES(eximi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_GreaterEqual(String eximi) {
        regEximi(CK_GE, fRES(eximi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_LessEqual(String eximi) {
        regEximi(CK_LE, fRES(eximi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximiList The collection of eximi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_InScope(Collection<String> eximiList) {
        doSetEximi_InScope(eximiList);
    }

    protected void doSetEximi_InScope(Collection<String> eximiList) {
        regINS(CK_INS, cTL(eximiList), xgetCValueEximi(), "EXIMI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximiList The collection of eximi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_NotInScope(Collection<String> eximiList) {
        doSetEximi_NotInScope(eximiList);
    }

    protected void doSetEximi_NotInScope(Collection<String> eximiList) {
        regINS(CK_NINS, cTL(eximiList), xgetCValueEximi(), "EXIMI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMI: {varchar(255)} <br>
     * <pre>e.g. setEximi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximi The value of eximi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximi_LikeSearch(String eximi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximi), xgetCValueEximi(), "EXIMI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximi_NotLikeSearch(String eximi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximi), xgetCValueEximi(), "EXIMI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMI: {varchar(255)}
     * @param eximi The value of eximi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximi_PrefixSearch(String eximi) {
        setEximi_LikeSearch(eximi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     */
    public void setEximi_IsNull() { regEximi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     */
    public void setEximi_IsNullOrEmpty() { regEximi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMI: {varchar(255)}
     */
    public void setEximi_IsNotNull() { regEximi(CK_ISNN, DOBJ); }

    protected void regEximi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximi(), "EXIMI"); }
    protected abstract ConditionValue xgetCValueEximi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_Equal(String eximj) {
        doSetEximj_Equal(fRES(eximj));
    }

    protected void doSetEximj_Equal(String eximj) {
        regEximj(CK_EQ, eximj);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_NotEqual(String eximj) {
        doSetEximj_NotEqual(fRES(eximj));
    }

    protected void doSetEximj_NotEqual(String eximj) {
        regEximj(CK_NES, eximj);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_GreaterThan(String eximj) {
        regEximj(CK_GT, fRES(eximj));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_LessThan(String eximj) {
        regEximj(CK_LT, fRES(eximj));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_GreaterEqual(String eximj) {
        regEximj(CK_GE, fRES(eximj));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_LessEqual(String eximj) {
        regEximj(CK_LE, fRES(eximj));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximjList The collection of eximj as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_InScope(Collection<String> eximjList) {
        doSetEximj_InScope(eximjList);
    }

    protected void doSetEximj_InScope(Collection<String> eximjList) {
        regINS(CK_INS, cTL(eximjList), xgetCValueEximj(), "EXIMJ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximjList The collection of eximj as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_NotInScope(Collection<String> eximjList) {
        doSetEximj_NotInScope(eximjList);
    }

    protected void doSetEximj_NotInScope(Collection<String> eximjList) {
        regINS(CK_NINS, cTL(eximjList), xgetCValueEximj(), "EXIMJ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMJ: {varchar(255)} <br>
     * <pre>e.g. setEximj_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximj The value of eximj as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximj_LikeSearch(String eximj, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximj), xgetCValueEximj(), "EXIMJ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximj_NotLikeSearch(String eximj, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximj), xgetCValueEximj(), "EXIMJ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMJ: {varchar(255)}
     * @param eximj The value of eximj as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximj_PrefixSearch(String eximj) {
        setEximj_LikeSearch(eximj, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     */
    public void setEximj_IsNull() { regEximj(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     */
    public void setEximj_IsNullOrEmpty() { regEximj(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMJ: {varchar(255)}
     */
    public void setEximj_IsNotNull() { regEximj(CK_ISNN, DOBJ); }

    protected void regEximj(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximj(), "EXIMJ"); }
    protected abstract ConditionValue xgetCValueEximj();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_Equal(String eximk) {
        doSetEximk_Equal(fRES(eximk));
    }

    protected void doSetEximk_Equal(String eximk) {
        regEximk(CK_EQ, eximk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_NotEqual(String eximk) {
        doSetEximk_NotEqual(fRES(eximk));
    }

    protected void doSetEximk_NotEqual(String eximk) {
        regEximk(CK_NES, eximk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_GreaterThan(String eximk) {
        regEximk(CK_GT, fRES(eximk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_LessThan(String eximk) {
        regEximk(CK_LT, fRES(eximk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_GreaterEqual(String eximk) {
        regEximk(CK_GE, fRES(eximk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_LessEqual(String eximk) {
        regEximk(CK_LE, fRES(eximk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximkList The collection of eximk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_InScope(Collection<String> eximkList) {
        doSetEximk_InScope(eximkList);
    }

    protected void doSetEximk_InScope(Collection<String> eximkList) {
        regINS(CK_INS, cTL(eximkList), xgetCValueEximk(), "EXIMK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximkList The collection of eximk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_NotInScope(Collection<String> eximkList) {
        doSetEximk_NotInScope(eximkList);
    }

    protected void doSetEximk_NotInScope(Collection<String> eximkList) {
        regINS(CK_NINS, cTL(eximkList), xgetCValueEximk(), "EXIMK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMK: {varchar(255)} <br>
     * <pre>e.g. setEximk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximk The value of eximk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximk_LikeSearch(String eximk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximk), xgetCValueEximk(), "EXIMK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximk_NotLikeSearch(String eximk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximk), xgetCValueEximk(), "EXIMK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMK: {varchar(255)}
     * @param eximk The value of eximk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximk_PrefixSearch(String eximk) {
        setEximk_LikeSearch(eximk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     */
    public void setEximk_IsNull() { regEximk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     */
    public void setEximk_IsNullOrEmpty() { regEximk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMK: {varchar(255)}
     */
    public void setEximk_IsNotNull() { regEximk(CK_ISNN, DOBJ); }

    protected void regEximk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximk(), "EXIMK"); }
    protected abstract ConditionValue xgetCValueEximk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_Equal(String eximl) {
        doSetEximl_Equal(fRES(eximl));
    }

    protected void doSetEximl_Equal(String eximl) {
        regEximl(CK_EQ, eximl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_NotEqual(String eximl) {
        doSetEximl_NotEqual(fRES(eximl));
    }

    protected void doSetEximl_NotEqual(String eximl) {
        regEximl(CK_NES, eximl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_GreaterThan(String eximl) {
        regEximl(CK_GT, fRES(eximl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_LessThan(String eximl) {
        regEximl(CK_LT, fRES(eximl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_GreaterEqual(String eximl) {
        regEximl(CK_GE, fRES(eximl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_LessEqual(String eximl) {
        regEximl(CK_LE, fRES(eximl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximlList The collection of eximl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_InScope(Collection<String> eximlList) {
        doSetEximl_InScope(eximlList);
    }

    protected void doSetEximl_InScope(Collection<String> eximlList) {
        regINS(CK_INS, cTL(eximlList), xgetCValueEximl(), "EXIML");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximlList The collection of eximl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_NotInScope(Collection<String> eximlList) {
        doSetEximl_NotInScope(eximlList);
    }

    protected void doSetEximl_NotInScope(Collection<String> eximlList) {
        regINS(CK_NINS, cTL(eximlList), xgetCValueEximl(), "EXIML");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIML: {varchar(255)} <br>
     * <pre>e.g. setEximl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximl The value of eximl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximl_LikeSearch(String eximl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximl), xgetCValueEximl(), "EXIML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximl_NotLikeSearch(String eximl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximl), xgetCValueEximl(), "EXIML", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIML: {varchar(255)}
     * @param eximl The value of eximl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximl_PrefixSearch(String eximl) {
        setEximl_LikeSearch(eximl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     */
    public void setEximl_IsNull() { regEximl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     */
    public void setEximl_IsNullOrEmpty() { regEximl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIML: {varchar(255)}
     */
    public void setEximl_IsNotNull() { regEximl(CK_ISNN, DOBJ); }

    protected void regEximl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximl(), "EXIML"); }
    protected abstract ConditionValue xgetCValueEximl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_Equal(String eximm) {
        doSetEximm_Equal(fRES(eximm));
    }

    protected void doSetEximm_Equal(String eximm) {
        regEximm(CK_EQ, eximm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_NotEqual(String eximm) {
        doSetEximm_NotEqual(fRES(eximm));
    }

    protected void doSetEximm_NotEqual(String eximm) {
        regEximm(CK_NES, eximm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_GreaterThan(String eximm) {
        regEximm(CK_GT, fRES(eximm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_LessThan(String eximm) {
        regEximm(CK_LT, fRES(eximm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_GreaterEqual(String eximm) {
        regEximm(CK_GE, fRES(eximm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_LessEqual(String eximm) {
        regEximm(CK_LE, fRES(eximm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximmList The collection of eximm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_InScope(Collection<String> eximmList) {
        doSetEximm_InScope(eximmList);
    }

    protected void doSetEximm_InScope(Collection<String> eximmList) {
        regINS(CK_INS, cTL(eximmList), xgetCValueEximm(), "EXIMM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximmList The collection of eximm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_NotInScope(Collection<String> eximmList) {
        doSetEximm_NotInScope(eximmList);
    }

    protected void doSetEximm_NotInScope(Collection<String> eximmList) {
        regINS(CK_NINS, cTL(eximmList), xgetCValueEximm(), "EXIMM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMM: {varchar(255)} <br>
     * <pre>e.g. setEximm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximm The value of eximm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximm_LikeSearch(String eximm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximm), xgetCValueEximm(), "EXIMM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximm_NotLikeSearch(String eximm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximm), xgetCValueEximm(), "EXIMM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMM: {varchar(255)}
     * @param eximm The value of eximm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximm_PrefixSearch(String eximm) {
        setEximm_LikeSearch(eximm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     */
    public void setEximm_IsNull() { regEximm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     */
    public void setEximm_IsNullOrEmpty() { regEximm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMM: {varchar(255)}
     */
    public void setEximm_IsNotNull() { regEximm(CK_ISNN, DOBJ); }

    protected void regEximm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximm(), "EXIMM"); }
    protected abstract ConditionValue xgetCValueEximm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_Equal(String eximn) {
        doSetEximn_Equal(fRES(eximn));
    }

    protected void doSetEximn_Equal(String eximn) {
        regEximn(CK_EQ, eximn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_NotEqual(String eximn) {
        doSetEximn_NotEqual(fRES(eximn));
    }

    protected void doSetEximn_NotEqual(String eximn) {
        regEximn(CK_NES, eximn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_GreaterThan(String eximn) {
        regEximn(CK_GT, fRES(eximn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_LessThan(String eximn) {
        regEximn(CK_LT, fRES(eximn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_GreaterEqual(String eximn) {
        regEximn(CK_GE, fRES(eximn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_LessEqual(String eximn) {
        regEximn(CK_LE, fRES(eximn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximnList The collection of eximn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_InScope(Collection<String> eximnList) {
        doSetEximn_InScope(eximnList);
    }

    protected void doSetEximn_InScope(Collection<String> eximnList) {
        regINS(CK_INS, cTL(eximnList), xgetCValueEximn(), "EXIMN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximnList The collection of eximn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_NotInScope(Collection<String> eximnList) {
        doSetEximn_NotInScope(eximnList);
    }

    protected void doSetEximn_NotInScope(Collection<String> eximnList) {
        regINS(CK_NINS, cTL(eximnList), xgetCValueEximn(), "EXIMN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMN: {varchar(255)} <br>
     * <pre>e.g. setEximn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximn The value of eximn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximn_LikeSearch(String eximn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximn), xgetCValueEximn(), "EXIMN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximn_NotLikeSearch(String eximn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximn), xgetCValueEximn(), "EXIMN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMN: {varchar(255)}
     * @param eximn The value of eximn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximn_PrefixSearch(String eximn) {
        setEximn_LikeSearch(eximn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     */
    public void setEximn_IsNull() { regEximn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     */
    public void setEximn_IsNullOrEmpty() { regEximn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMN: {varchar(255)}
     */
    public void setEximn_IsNotNull() { regEximn(CK_ISNN, DOBJ); }

    protected void regEximn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximn(), "EXIMN"); }
    protected abstract ConditionValue xgetCValueEximn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_Equal(String eximo) {
        doSetEximo_Equal(fRES(eximo));
    }

    protected void doSetEximo_Equal(String eximo) {
        regEximo(CK_EQ, eximo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_NotEqual(String eximo) {
        doSetEximo_NotEqual(fRES(eximo));
    }

    protected void doSetEximo_NotEqual(String eximo) {
        regEximo(CK_NES, eximo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_GreaterThan(String eximo) {
        regEximo(CK_GT, fRES(eximo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_LessThan(String eximo) {
        regEximo(CK_LT, fRES(eximo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_GreaterEqual(String eximo) {
        regEximo(CK_GE, fRES(eximo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_LessEqual(String eximo) {
        regEximo(CK_LE, fRES(eximo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximoList The collection of eximo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_InScope(Collection<String> eximoList) {
        doSetEximo_InScope(eximoList);
    }

    protected void doSetEximo_InScope(Collection<String> eximoList) {
        regINS(CK_INS, cTL(eximoList), xgetCValueEximo(), "EXIMO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximoList The collection of eximo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_NotInScope(Collection<String> eximoList) {
        doSetEximo_NotInScope(eximoList);
    }

    protected void doSetEximo_NotInScope(Collection<String> eximoList) {
        regINS(CK_NINS, cTL(eximoList), xgetCValueEximo(), "EXIMO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMO: {varchar(255)} <br>
     * <pre>e.g. setEximo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximo The value of eximo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximo_LikeSearch(String eximo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximo), xgetCValueEximo(), "EXIMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximo_NotLikeSearch(String eximo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximo), xgetCValueEximo(), "EXIMO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMO: {varchar(255)}
     * @param eximo The value of eximo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximo_PrefixSearch(String eximo) {
        setEximo_LikeSearch(eximo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     */
    public void setEximo_IsNull() { regEximo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     */
    public void setEximo_IsNullOrEmpty() { regEximo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMO: {varchar(255)}
     */
    public void setEximo_IsNotNull() { regEximo(CK_ISNN, DOBJ); }

    protected void regEximo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximo(), "EXIMO"); }
    protected abstract ConditionValue xgetCValueEximo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_Equal(String eximp) {
        doSetEximp_Equal(fRES(eximp));
    }

    protected void doSetEximp_Equal(String eximp) {
        regEximp(CK_EQ, eximp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_NotEqual(String eximp) {
        doSetEximp_NotEqual(fRES(eximp));
    }

    protected void doSetEximp_NotEqual(String eximp) {
        regEximp(CK_NES, eximp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_GreaterThan(String eximp) {
        regEximp(CK_GT, fRES(eximp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_LessThan(String eximp) {
        regEximp(CK_LT, fRES(eximp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_GreaterEqual(String eximp) {
        regEximp(CK_GE, fRES(eximp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_LessEqual(String eximp) {
        regEximp(CK_LE, fRES(eximp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximpList The collection of eximp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_InScope(Collection<String> eximpList) {
        doSetEximp_InScope(eximpList);
    }

    protected void doSetEximp_InScope(Collection<String> eximpList) {
        regINS(CK_INS, cTL(eximpList), xgetCValueEximp(), "EXIMP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximpList The collection of eximp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_NotInScope(Collection<String> eximpList) {
        doSetEximp_NotInScope(eximpList);
    }

    protected void doSetEximp_NotInScope(Collection<String> eximpList) {
        regINS(CK_NINS, cTL(eximpList), xgetCValueEximp(), "EXIMP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMP: {varchar(255)} <br>
     * <pre>e.g. setEximp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eximp The value of eximp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEximp_LikeSearch(String eximp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eximp), xgetCValueEximp(), "EXIMP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEximp_NotLikeSearch(String eximp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eximp), xgetCValueEximp(), "EXIMP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXIMP: {varchar(255)}
     * @param eximp The value of eximp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEximp_PrefixSearch(String eximp) {
        setEximp_LikeSearch(eximp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     */
    public void setEximp_IsNull() { regEximp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     */
    public void setEximp_IsNullOrEmpty() { regEximp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXIMP: {varchar(255)}
     */
    public void setEximp_IsNotNull() { regEximp(CK_ISNN, DOBJ); }

    protected void regEximp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEximp(), "EXIMP"); }
    protected abstract ConditionValue xgetCValueEximp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_Equal(String upmn) {
        doSetUpmn_Equal(fRES(upmn));
    }

    protected void doSetUpmn_Equal(String upmn) {
        regUpmn(CK_EQ, upmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_NotEqual(String upmn) {
        doSetUpmn_NotEqual(fRES(upmn));
    }

    protected void doSetUpmn_NotEqual(String upmn) {
        regUpmn(CK_NES, upmn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_GreaterThan(String upmn) {
        regUpmn(CK_GT, fRES(upmn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_LessThan(String upmn) {
        regUpmn(CK_LT, fRES(upmn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_GreaterEqual(String upmn) {
        regUpmn(CK_GE, fRES(upmn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_LessEqual(String upmn) {
        regUpmn(CK_LE, fRES(upmn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmnList The collection of upmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_InScope(Collection<String> upmnList) {
        doSetUpmn_InScope(upmnList);
    }

    protected void doSetUpmn_InScope(Collection<String> upmnList) {
        regINS(CK_INS, cTL(upmnList), xgetCValueUpmn(), "UPMN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmnList The collection of upmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_NotInScope(Collection<String> upmnList) {
        doSetUpmn_NotInScope(upmnList);
    }

    protected void doSetUpmn_NotInScope(Collection<String> upmnList) {
        regINS(CK_NINS, cTL(upmnList), xgetCValueUpmn(), "UPMN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPMN: {varchar(255)} <br>
     * <pre>e.g. setUpmn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param upmn The value of upmn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpmn_LikeSearch(String upmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(upmn), xgetCValueUpmn(), "UPMN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpmn_NotLikeSearch(String upmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(upmn), xgetCValueUpmn(), "UPMN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPMN: {varchar(255)}
     * @param upmn The value of upmn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpmn_PrefixSearch(String upmn) {
        setUpmn_LikeSearch(upmn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     */
    public void setUpmn_IsNull() { regUpmn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     */
    public void setUpmn_IsNullOrEmpty() { regUpmn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPMN: {varchar(255)}
     */
    public void setUpmn_IsNotNull() { regUpmn(CK_ISNN, DOBJ); }

    protected void regUpmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpmn(), "UPMN"); }
    protected abstract ConditionValue xgetCValueUpmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_Equal(String chngyd) {
        doSetChngyd_Equal(fRES(chngyd));
    }

    protected void doSetChngyd_Equal(String chngyd) {
        regChngyd(CK_EQ, chngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_NotEqual(String chngyd) {
        doSetChngyd_NotEqual(fRES(chngyd));
    }

    protected void doSetChngyd_NotEqual(String chngyd) {
        regChngyd(CK_NES, chngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterThan(String chngyd) {
        regChngyd(CK_GT, fRES(chngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessThan(String chngyd) {
        regChngyd(CK_LT, fRES(chngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_GreaterEqual(String chngyd) {
        regChngyd(CK_GE, fRES(chngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_LessEqual(String chngyd) {
        regChngyd(CK_LE, fRES(chngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngydList The collection of chngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_InScope(Collection<String> chngydList) {
        doSetChngyd_InScope(chngydList);
    }

    protected void doSetChngyd_InScope(Collection<String> chngydList) {
        regINS(CK_INS, cTL(chngydList), xgetCValueChngyd(), "CHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngydList The collection of chngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_NotInScope(Collection<String> chngydList) {
        doSetChngyd_NotInScope(chngydList);
    }

    protected void doSetChngyd_NotInScope(Collection<String> chngydList) {
        regINS(CK_NINS, cTL(chngydList), xgetCValueChngyd(), "CHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(255)} <br>
     * <pre>e.g. setChngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param chngyd The value of chngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setChngyd_LikeSearch(String chngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(chngyd), xgetCValueChngyd(), "CHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChngyd_NotLikeSearch(String chngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chngyd), xgetCValueChngyd(), "CHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHNGYD: {varchar(255)}
     * @param chngyd The value of chngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChngyd_PrefixSearch(String chngyd) {
        setChngyd_LikeSearch(chngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     */
    public void setChngyd_IsNull() { regChngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     */
    public void setChngyd_IsNullOrEmpty() { regChngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHNGYD: {varchar(255)}
     */
    public void setChngyd_IsNotNull() { regChngyd(CK_ISNN, DOBJ); }

    protected void regChngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChngyd(), "CHNGYD"); }
    protected abstract ConditionValue xgetCValueChngyd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_Equal(String updtm) {
        doSetUpdtm_Equal(fRES(updtm));
    }

    protected void doSetUpdtm_Equal(String updtm) {
        regUpdtm(CK_EQ, updtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_NotEqual(String updtm) {
        doSetUpdtm_NotEqual(fRES(updtm));
    }

    protected void doSetUpdtm_NotEqual(String updtm) {
        regUpdtm(CK_NES, updtm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_GreaterThan(String updtm) {
        regUpdtm(CK_GT, fRES(updtm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_LessThan(String updtm) {
        regUpdtm(CK_LT, fRES(updtm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_GreaterEqual(String updtm) {
        regUpdtm(CK_GE, fRES(updtm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_LessEqual(String updtm) {
        regUpdtm(CK_LE, fRES(updtm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtmList The collection of updtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_InScope(Collection<String> updtmList) {
        doSetUpdtm_InScope(updtmList);
    }

    protected void doSetUpdtm_InScope(Collection<String> updtmList) {
        regINS(CK_INS, cTL(updtmList), xgetCValueUpdtm(), "UPDTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtmList The collection of updtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_NotInScope(Collection<String> updtmList) {
        doSetUpdtm_NotInScope(updtmList);
    }

    protected void doSetUpdtm_NotInScope(Collection<String> updtmList) {
        regINS(CK_NINS, cTL(updtmList), xgetCValueUpdtm(), "UPDTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(255)} <br>
     * <pre>e.g. setUpdtm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updtm The value of updtm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdtm_LikeSearch(String updtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updtm), xgetCValueUpdtm(), "UPDTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdtm_NotLikeSearch(String updtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updtm), xgetCValueUpdtm(), "UPDTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDTM: {varchar(255)}
     * @param updtm The value of updtm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdtm_PrefixSearch(String updtm) {
        setUpdtm_LikeSearch(updtm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     */
    public void setUpdtm_IsNull() { regUpdtm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     */
    public void setUpdtm_IsNullOrEmpty() { regUpdtm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDTM: {varchar(255)}
     */
    public void setUpdtm_IsNotNull() { regUpdtm(CK_ISNN, DOBJ); }

    protected void regUpdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdtm(), "UPDTM"); }
    protected abstract ConditionValue xgetCValueUpdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_Equal(String updis) {
        doSetUpdis_Equal(fRES(updis));
    }

    protected void doSetUpdis_Equal(String updis) {
        regUpdis(CK_EQ, updis);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_NotEqual(String updis) {
        doSetUpdis_NotEqual(fRES(updis));
    }

    protected void doSetUpdis_NotEqual(String updis) {
        regUpdis(CK_NES, updis);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_GreaterThan(String updis) {
        regUpdis(CK_GT, fRES(updis));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_LessThan(String updis) {
        regUpdis(CK_LT, fRES(updis));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_GreaterEqual(String updis) {
        regUpdis(CK_GE, fRES(updis));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_LessEqual(String updis) {
        regUpdis(CK_LE, fRES(updis));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updisList The collection of updis as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_InScope(Collection<String> updisList) {
        doSetUpdis_InScope(updisList);
    }

    protected void doSetUpdis_InScope(Collection<String> updisList) {
        regINS(CK_INS, cTL(updisList), xgetCValueUpdis(), "UPDIS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updisList The collection of updis as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_NotInScope(Collection<String> updisList) {
        doSetUpdis_NotInScope(updisList);
    }

    protected void doSetUpdis_NotInScope(Collection<String> updisList) {
        regINS(CK_NINS, cTL(updisList), xgetCValueUpdis(), "UPDIS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDIS: {varchar(255)} <br>
     * <pre>e.g. setUpdis_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updis The value of updis as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdis_LikeSearch(String updis, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updis), xgetCValueUpdis(), "UPDIS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdis_NotLikeSearch(String updis, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updis), xgetCValueUpdis(), "UPDIS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDIS: {varchar(255)}
     * @param updis The value of updis as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdis_PrefixSearch(String updis) {
        setUpdis_LikeSearch(updis, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     */
    public void setUpdis_IsNull() { regUpdis(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     */
    public void setUpdis_IsNullOrEmpty() { regUpdis(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDIS: {varchar(255)}
     */
    public void setUpdis_IsNotNull() { regUpdis(CK_ISNN, DOBJ); }

    protected void regUpdis(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdis(), "UPDIS"); }
    protected abstract ConditionValue xgetCValueUpdis();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_Equal(String upbmn) {
        doSetUpbmn_Equal(fRES(upbmn));
    }

    protected void doSetUpbmn_Equal(String upbmn) {
        regUpbmn(CK_EQ, upbmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_NotEqual(String upbmn) {
        doSetUpbmn_NotEqual(fRES(upbmn));
    }

    protected void doSetUpbmn_NotEqual(String upbmn) {
        regUpbmn(CK_NES, upbmn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_GreaterThan(String upbmn) {
        regUpbmn(CK_GT, fRES(upbmn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_LessThan(String upbmn) {
        regUpbmn(CK_LT, fRES(upbmn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_GreaterEqual(String upbmn) {
        regUpbmn(CK_GE, fRES(upbmn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_LessEqual(String upbmn) {
        regUpbmn(CK_LE, fRES(upbmn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmnList The collection of upbmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_InScope(Collection<String> upbmnList) {
        doSetUpbmn_InScope(upbmnList);
    }

    protected void doSetUpbmn_InScope(Collection<String> upbmnList) {
        regINS(CK_INS, cTL(upbmnList), xgetCValueUpbmn(), "UPBMN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmnList The collection of upbmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_NotInScope(Collection<String> upbmnList) {
        doSetUpbmn_NotInScope(upbmnList);
    }

    protected void doSetUpbmn_NotInScope(Collection<String> upbmnList) {
        regINS(CK_NINS, cTL(upbmnList), xgetCValueUpbmn(), "UPBMN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPBMN: {varchar(255)} <br>
     * <pre>e.g. setUpbmn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param upbmn The value of upbmn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpbmn_LikeSearch(String upbmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(upbmn), xgetCValueUpbmn(), "UPBMN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpbmn_NotLikeSearch(String upbmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(upbmn), xgetCValueUpbmn(), "UPBMN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPBMN: {varchar(255)}
     * @param upbmn The value of upbmn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpbmn_PrefixSearch(String upbmn) {
        setUpbmn_LikeSearch(upbmn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     */
    public void setUpbmn_IsNull() { regUpbmn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     */
    public void setUpbmn_IsNullOrEmpty() { regUpbmn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPBMN: {varchar(255)}
     */
    public void setUpbmn_IsNotNull() { regUpbmn(CK_ISNN, DOBJ); }

    protected void regUpbmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpbmn(), "UPBMN"); }
    protected abstract ConditionValue xgetCValueUpbmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_Equal(String bchngyd) {
        doSetBchngyd_Equal(fRES(bchngyd));
    }

    protected void doSetBchngyd_Equal(String bchngyd) {
        regBchngyd(CK_EQ, bchngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_NotEqual(String bchngyd) {
        doSetBchngyd_NotEqual(fRES(bchngyd));
    }

    protected void doSetBchngyd_NotEqual(String bchngyd) {
        regBchngyd(CK_NES, bchngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_GreaterThan(String bchngyd) {
        regBchngyd(CK_GT, fRES(bchngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_LessThan(String bchngyd) {
        regBchngyd(CK_LT, fRES(bchngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_GreaterEqual(String bchngyd) {
        regBchngyd(CK_GE, fRES(bchngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_LessEqual(String bchngyd) {
        regBchngyd(CK_LE, fRES(bchngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngydList The collection of bchngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_InScope(Collection<String> bchngydList) {
        doSetBchngyd_InScope(bchngydList);
    }

    protected void doSetBchngyd_InScope(Collection<String> bchngydList) {
        regINS(CK_INS, cTL(bchngydList), xgetCValueBchngyd(), "BCHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngydList The collection of bchngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_NotInScope(Collection<String> bchngydList) {
        doSetBchngyd_NotInScope(bchngydList);
    }

    protected void doSetBchngyd_NotInScope(Collection<String> bchngydList) {
        regINS(CK_NINS, cTL(bchngydList), xgetCValueBchngyd(), "BCHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(255)} <br>
     * <pre>e.g. setBchngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bchngyd The value of bchngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBchngyd_LikeSearch(String bchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bchngyd), xgetCValueBchngyd(), "BCHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBchngyd_NotLikeSearch(String bchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bchngyd), xgetCValueBchngyd(), "BCHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BCHNGYD: {varchar(255)}
     * @param bchngyd The value of bchngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBchngyd_PrefixSearch(String bchngyd) {
        setBchngyd_LikeSearch(bchngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     */
    public void setBchngyd_IsNull() { regBchngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     */
    public void setBchngyd_IsNullOrEmpty() { regBchngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BCHNGYD: {varchar(255)}
     */
    public void setBchngyd_IsNotNull() { regBchngyd(CK_ISNN, DOBJ); }

    protected void regBchngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBchngyd(), "BCHNGYD"); }
    protected abstract ConditionValue xgetCValueBchngyd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_Equal(String bupdtm) {
        doSetBupdtm_Equal(fRES(bupdtm));
    }

    protected void doSetBupdtm_Equal(String bupdtm) {
        regBupdtm(CK_EQ, bupdtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_NotEqual(String bupdtm) {
        doSetBupdtm_NotEqual(fRES(bupdtm));
    }

    protected void doSetBupdtm_NotEqual(String bupdtm) {
        regBupdtm(CK_NES, bupdtm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_GreaterThan(String bupdtm) {
        regBupdtm(CK_GT, fRES(bupdtm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_LessThan(String bupdtm) {
        regBupdtm(CK_LT, fRES(bupdtm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_GreaterEqual(String bupdtm) {
        regBupdtm(CK_GE, fRES(bupdtm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_LessEqual(String bupdtm) {
        regBupdtm(CK_LE, fRES(bupdtm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtmList The collection of bupdtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_InScope(Collection<String> bupdtmList) {
        doSetBupdtm_InScope(bupdtmList);
    }

    protected void doSetBupdtm_InScope(Collection<String> bupdtmList) {
        regINS(CK_INS, cTL(bupdtmList), xgetCValueBupdtm(), "BUPDTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtmList The collection of bupdtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_NotInScope(Collection<String> bupdtmList) {
        doSetBupdtm_NotInScope(bupdtmList);
    }

    protected void doSetBupdtm_NotInScope(Collection<String> bupdtmList) {
        regINS(CK_NINS, cTL(bupdtmList), xgetCValueBupdtm(), "BUPDTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUPDTM: {varchar(255)} <br>
     * <pre>e.g. setBupdtm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bupdtm The value of bupdtm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBupdtm_LikeSearch(String bupdtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bupdtm), xgetCValueBupdtm(), "BUPDTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBupdtm_NotLikeSearch(String bupdtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bupdtm), xgetCValueBupdtm(), "BUPDTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUPDTM: {varchar(255)}
     * @param bupdtm The value of bupdtm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBupdtm_PrefixSearch(String bupdtm) {
        setBupdtm_LikeSearch(bupdtm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     */
    public void setBupdtm_IsNull() { regBupdtm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     */
    public void setBupdtm_IsNullOrEmpty() { regBupdtm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUPDTM: {varchar(255)}
     */
    public void setBupdtm_IsNotNull() { regBupdtm(CK_ISNN, DOBJ); }

    protected void regBupdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBupdtm(), "BUPDTM"); }
    protected abstract ConditionValue xgetCValueBupdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_Equal(String upobmn) {
        doSetUpobmn_Equal(fRES(upobmn));
    }

    protected void doSetUpobmn_Equal(String upobmn) {
        regUpobmn(CK_EQ, upobmn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_NotEqual(String upobmn) {
        doSetUpobmn_NotEqual(fRES(upobmn));
    }

    protected void doSetUpobmn_NotEqual(String upobmn) {
        regUpobmn(CK_NES, upobmn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_GreaterThan(String upobmn) {
        regUpobmn(CK_GT, fRES(upobmn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_LessThan(String upobmn) {
        regUpobmn(CK_LT, fRES(upobmn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_GreaterEqual(String upobmn) {
        regUpobmn(CK_GE, fRES(upobmn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_LessEqual(String upobmn) {
        regUpobmn(CK_LE, fRES(upobmn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmnList The collection of upobmn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_InScope(Collection<String> upobmnList) {
        doSetUpobmn_InScope(upobmnList);
    }

    protected void doSetUpobmn_InScope(Collection<String> upobmnList) {
        regINS(CK_INS, cTL(upobmnList), xgetCValueUpobmn(), "UPOBMN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmnList The collection of upobmn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_NotInScope(Collection<String> upobmnList) {
        doSetUpobmn_NotInScope(upobmnList);
    }

    protected void doSetUpobmn_NotInScope(Collection<String> upobmnList) {
        regINS(CK_NINS, cTL(upobmnList), xgetCValueUpobmn(), "UPOBMN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPOBMN: {varchar(255)} <br>
     * <pre>e.g. setUpobmn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param upobmn The value of upobmn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpobmn_LikeSearch(String upobmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(upobmn), xgetCValueUpobmn(), "UPOBMN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpobmn_NotLikeSearch(String upobmn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(upobmn), xgetCValueUpobmn(), "UPOBMN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPOBMN: {varchar(255)}
     * @param upobmn The value of upobmn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpobmn_PrefixSearch(String upobmn) {
        setUpobmn_LikeSearch(upobmn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     */
    public void setUpobmn_IsNull() { regUpobmn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     */
    public void setUpobmn_IsNullOrEmpty() { regUpobmn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPOBMN: {varchar(255)}
     */
    public void setUpobmn_IsNotNull() { regUpobmn(CK_ISNN, DOBJ); }

    protected void regUpobmn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpobmn(), "UPOBMN"); }
    protected abstract ConditionValue xgetCValueUpobmn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_Equal(String obchngyd) {
        doSetObchngyd_Equal(fRES(obchngyd));
    }

    protected void doSetObchngyd_Equal(String obchngyd) {
        regObchngyd(CK_EQ, obchngyd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_NotEqual(String obchngyd) {
        doSetObchngyd_NotEqual(fRES(obchngyd));
    }

    protected void doSetObchngyd_NotEqual(String obchngyd) {
        regObchngyd(CK_NES, obchngyd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_GreaterThan(String obchngyd) {
        regObchngyd(CK_GT, fRES(obchngyd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_LessThan(String obchngyd) {
        regObchngyd(CK_LT, fRES(obchngyd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_GreaterEqual(String obchngyd) {
        regObchngyd(CK_GE, fRES(obchngyd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_LessEqual(String obchngyd) {
        regObchngyd(CK_LE, fRES(obchngyd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngydList The collection of obchngyd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_InScope(Collection<String> obchngydList) {
        doSetObchngyd_InScope(obchngydList);
    }

    protected void doSetObchngyd_InScope(Collection<String> obchngydList) {
        regINS(CK_INS, cTL(obchngydList), xgetCValueObchngyd(), "OBCHNGYD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngydList The collection of obchngyd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_NotInScope(Collection<String> obchngydList) {
        doSetObchngyd_NotInScope(obchngydList);
    }

    protected void doSetObchngyd_NotInScope(Collection<String> obchngydList) {
        regINS(CK_NINS, cTL(obchngydList), xgetCValueObchngyd(), "OBCHNGYD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(255)} <br>
     * <pre>e.g. setObchngyd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param obchngyd The value of obchngyd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObchngyd_LikeSearch(String obchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(obchngyd), xgetCValueObchngyd(), "OBCHNGYD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObchngyd_NotLikeSearch(String obchngyd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(obchngyd), xgetCValueObchngyd(), "OBCHNGYD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     * @param obchngyd The value of obchngyd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObchngyd_PrefixSearch(String obchngyd) {
        setObchngyd_LikeSearch(obchngyd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     */
    public void setObchngyd_IsNull() { regObchngyd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     */
    public void setObchngyd_IsNullOrEmpty() { regObchngyd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OBCHNGYD: {varchar(255)}
     */
    public void setObchngyd_IsNotNull() { regObchngyd(CK_ISNN, DOBJ); }

    protected void regObchngyd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueObchngyd(), "OBCHNGYD"); }
    protected abstract ConditionValue xgetCValueObchngyd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_Equal(String obupdtm) {
        doSetObupdtm_Equal(fRES(obupdtm));
    }

    protected void doSetObupdtm_Equal(String obupdtm) {
        regObupdtm(CK_EQ, obupdtm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_NotEqual(String obupdtm) {
        doSetObupdtm_NotEqual(fRES(obupdtm));
    }

    protected void doSetObupdtm_NotEqual(String obupdtm) {
        regObupdtm(CK_NES, obupdtm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_GreaterThan(String obupdtm) {
        regObupdtm(CK_GT, fRES(obupdtm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_LessThan(String obupdtm) {
        regObupdtm(CK_LT, fRES(obupdtm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_GreaterEqual(String obupdtm) {
        regObupdtm(CK_GE, fRES(obupdtm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_LessEqual(String obupdtm) {
        regObupdtm(CK_LE, fRES(obupdtm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtmList The collection of obupdtm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_InScope(Collection<String> obupdtmList) {
        doSetObupdtm_InScope(obupdtmList);
    }

    protected void doSetObupdtm_InScope(Collection<String> obupdtmList) {
        regINS(CK_INS, cTL(obupdtmList), xgetCValueObupdtm(), "OBUPDTM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtmList The collection of obupdtm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_NotInScope(Collection<String> obupdtmList) {
        doSetObupdtm_NotInScope(obupdtmList);
    }

    protected void doSetObupdtm_NotInScope(Collection<String> obupdtmList) {
        regINS(CK_NINS, cTL(obupdtmList), xgetCValueObupdtm(), "OBUPDTM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBUPDTM: {varchar(255)} <br>
     * <pre>e.g. setObupdtm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param obupdtm The value of obupdtm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObupdtm_LikeSearch(String obupdtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(obupdtm), xgetCValueObupdtm(), "OBUPDTM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObupdtm_NotLikeSearch(String obupdtm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(obupdtm), xgetCValueObupdtm(), "OBUPDTM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OBUPDTM: {varchar(255)}
     * @param obupdtm The value of obupdtm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setObupdtm_PrefixSearch(String obupdtm) {
        setObupdtm_LikeSearch(obupdtm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     */
    public void setObupdtm_IsNull() { regObupdtm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     */
    public void setObupdtm_IsNullOrEmpty() { regObupdtm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OBUPDTM: {varchar(255)}
     */
    public void setObupdtm_IsNotNull() { regObupdtm(CK_ISNN, DOBJ); }

    protected void regObupdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueObupdtm(), "OBUPDTM"); }
    protected abstract ConditionValue xgetCValueObupdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_Equal(String aubrchfg) {
        doSetAubrchfg_Equal(fRES(aubrchfg));
    }

    protected void doSetAubrchfg_Equal(String aubrchfg) {
        regAubrchfg(CK_EQ, aubrchfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_NotEqual(String aubrchfg) {
        doSetAubrchfg_NotEqual(fRES(aubrchfg));
    }

    protected void doSetAubrchfg_NotEqual(String aubrchfg) {
        regAubrchfg(CK_NES, aubrchfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_GreaterThan(String aubrchfg) {
        regAubrchfg(CK_GT, fRES(aubrchfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_LessThan(String aubrchfg) {
        regAubrchfg(CK_LT, fRES(aubrchfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_GreaterEqual(String aubrchfg) {
        regAubrchfg(CK_GE, fRES(aubrchfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_LessEqual(String aubrchfg) {
        regAubrchfg(CK_LE, fRES(aubrchfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfgList The collection of aubrchfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_InScope(Collection<String> aubrchfgList) {
        doSetAubrchfg_InScope(aubrchfgList);
    }

    protected void doSetAubrchfg_InScope(Collection<String> aubrchfgList) {
        regINS(CK_INS, cTL(aubrchfgList), xgetCValueAubrchfg(), "AUBRCHFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfgList The collection of aubrchfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_NotInScope(Collection<String> aubrchfgList) {
        doSetAubrchfg_NotInScope(aubrchfgList);
    }

    protected void doSetAubrchfg_NotInScope(Collection<String> aubrchfgList) {
        regINS(CK_NINS, cTL(aubrchfgList), xgetCValueAubrchfg(), "AUBRCHFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCHFG: {varchar(255)} <br>
     * <pre>e.g. setAubrchfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aubrchfg The value of aubrchfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAubrchfg_LikeSearch(String aubrchfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aubrchfg), xgetCValueAubrchfg(), "AUBRCHFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAubrchfg_NotLikeSearch(String aubrchfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aubrchfg), xgetCValueAubrchfg(), "AUBRCHFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     * @param aubrchfg The value of aubrchfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAubrchfg_PrefixSearch(String aubrchfg) {
        setAubrchfg_LikeSearch(aubrchfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     */
    public void setAubrchfg_IsNull() { regAubrchfg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     */
    public void setAubrchfg_IsNullOrEmpty() { regAubrchfg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AUBRCHFG: {varchar(255)}
     */
    public void setAubrchfg_IsNotNull() { regAubrchfg(CK_ISNN, DOBJ); }

    protected void regAubrchfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAubrchfg(), "AUBRCHFG"); }
    protected abstract ConditionValue xgetCValueAubrchfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_Equal(String zzfrdateh) {
        doSetZzfrdateh_Equal(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_Equal(String zzfrdateh) {
        regZzfrdateh(CK_EQ, zzfrdateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotEqual(String zzfrdateh) {
        doSetZzfrdateh_NotEqual(fRES(zzfrdateh));
    }

    protected void doSetZzfrdateh_NotEqual(String zzfrdateh) {
        regZzfrdateh(CK_NES, zzfrdateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterThan(String zzfrdateh) {
        regZzfrdateh(CK_GT, fRES(zzfrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessThan(String zzfrdateh) {
        regZzfrdateh(CK_LT, fRES(zzfrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_GreaterEqual(String zzfrdateh) {
        regZzfrdateh(CK_GE, fRES(zzfrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_LessEqual(String zzfrdateh) {
        regZzfrdateh(CK_LE, fRES(zzfrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdatehList The collection of zzfrdateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_InScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_InScope(Collection<String> zzfrdatehList) {
        regINS(CK_INS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdatehList The collection of zzfrdateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        doSetZzfrdateh_NotInScope(zzfrdatehList);
    }

    protected void doSetZzfrdateh_NotInScope(Collection<String> zzfrdatehList) {
        regINS(CK_NINS, cTL(zzfrdatehList), xgetCValueZzfrdateh(), "ZZFRDATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(255)} <br>
     * <pre>e.g. setZzfrdateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzfrdateh The value of zzfrdateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzfrdateh_LikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzfrdateh_NotLikeSearch(String zzfrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzfrdateh), xgetCValueZzfrdateh(), "ZZFRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     * @param zzfrdateh The value of zzfrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzfrdateh_PrefixSearch(String zzfrdateh) {
        setZzfrdateh_LikeSearch(zzfrdateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     */
    public void setZzfrdateh_IsNull() { regZzfrdateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     */
    public void setZzfrdateh_IsNullOrEmpty() { regZzfrdateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZFRDATEH: {varchar(255)}
     */
    public void setZzfrdateh_IsNotNull() { regZzfrdateh(CK_ISNN, DOBJ); }

    protected void regZzfrdateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzfrdateh(), "ZZFRDATEH"); }
    protected abstract ConditionValue xgetCValueZzfrdateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_Equal(String zztodateh) {
        doSetZztodateh_Equal(fRES(zztodateh));
    }

    protected void doSetZztodateh_Equal(String zztodateh) {
        regZztodateh(CK_EQ, zztodateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotEqual(String zztodateh) {
        doSetZztodateh_NotEqual(fRES(zztodateh));
    }

    protected void doSetZztodateh_NotEqual(String zztodateh) {
        regZztodateh(CK_NES, zztodateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterThan(String zztodateh) {
        regZztodateh(CK_GT, fRES(zztodateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessThan(String zztodateh) {
        regZztodateh(CK_LT, fRES(zztodateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_GreaterEqual(String zztodateh) {
        regZztodateh(CK_GE, fRES(zztodateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_LessEqual(String zztodateh) {
        regZztodateh(CK_LE, fRES(zztodateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodatehList The collection of zztodateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_InScope(Collection<String> zztodatehList) {
        doSetZztodateh_InScope(zztodatehList);
    }

    protected void doSetZztodateh_InScope(Collection<String> zztodatehList) {
        regINS(CK_INS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodatehList The collection of zztodateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_NotInScope(Collection<String> zztodatehList) {
        doSetZztodateh_NotInScope(zztodatehList);
    }

    protected void doSetZztodateh_NotInScope(Collection<String> zztodatehList) {
        regINS(CK_NINS, cTL(zztodatehList), xgetCValueZztodateh(), "ZZTODATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(255)} <br>
     * <pre>e.g. setZztodateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zztodateh The value of zztodateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZztodateh_LikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZztodateh_NotLikeSearch(String zztodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zztodateh), xgetCValueZztodateh(), "ZZTODATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     * @param zztodateh The value of zztodateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZztodateh_PrefixSearch(String zztodateh) {
        setZztodateh_LikeSearch(zztodateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     */
    public void setZztodateh_IsNull() { regZztodateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     */
    public void setZztodateh_IsNullOrEmpty() { regZztodateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZTODATEH: {varchar(255)}
     */
    public void setZztodateh_IsNotNull() { regZztodateh(CK_ISNN, DOBJ); }

    protected void regZztodateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZztodateh(), "ZZTODATEH"); }
    protected abstract ConditionValue xgetCValueZztodateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_Equal(String rcdupdps) {
        doSetRcdupdps_Equal(fRES(rcdupdps));
    }

    protected void doSetRcdupdps_Equal(String rcdupdps) {
        regRcdupdps(CK_EQ, rcdupdps);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_NotEqual(String rcdupdps) {
        doSetRcdupdps_NotEqual(fRES(rcdupdps));
    }

    protected void doSetRcdupdps_NotEqual(String rcdupdps) {
        regRcdupdps(CK_NES, rcdupdps);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterThan(String rcdupdps) {
        regRcdupdps(CK_GT, fRES(rcdupdps));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessThan(String rcdupdps) {
        regRcdupdps(CK_LT, fRES(rcdupdps));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_GreaterEqual(String rcdupdps) {
        regRcdupdps(CK_GE, fRES(rcdupdps));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_LessEqual(String rcdupdps) {
        regRcdupdps(CK_LE, fRES(rcdupdps));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdpsList The collection of rcdupdps as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_InScope(Collection<String> rcdupdpsList) {
        doSetRcdupdps_InScope(rcdupdpsList);
    }

    protected void doSetRcdupdps_InScope(Collection<String> rcdupdpsList) {
        regINS(CK_INS, cTL(rcdupdpsList), xgetCValueRcdupdps(), "RCDUPDPS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdpsList The collection of rcdupdps as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_NotInScope(Collection<String> rcdupdpsList) {
        doSetRcdupdps_NotInScope(rcdupdpsList);
    }

    protected void doSetRcdupdps_NotInScope(Collection<String> rcdupdpsList) {
        regINS(CK_NINS, cTL(rcdupdpsList), xgetCValueRcdupdps(), "RCDUPDPS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(255)} <br>
     * <pre>e.g. setRcdupdps_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcdupdps The value of rcdupdps as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcdupdps_LikeSearch(String rcdupdps, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcdupdps), xgetCValueRcdupdps(), "RCDUPDPS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcdupdps_NotLikeSearch(String rcdupdps, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcdupdps), xgetCValueRcdupdps(), "RCDUPDPS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     * @param rcdupdps The value of rcdupdps as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcdupdps_PrefixSearch(String rcdupdps) {
        setRcdupdps_LikeSearch(rcdupdps, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     */
    public void setRcdupdps_IsNull() { regRcdupdps(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     */
    public void setRcdupdps_IsNullOrEmpty() { regRcdupdps(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCDUPDPS: {varchar(255)}
     */
    public void setRcdupdps_IsNotNull() { regRcdupdps(CK_ISNN, DOBJ); }

    protected void regRcdupdps(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcdupdps(), "RCDUPDPS"); }
    protected abstract ConditionValue xgetCValueRcdupdps();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_Equal(String updusrid) {
        doSetUpdusrid_Equal(fRES(updusrid));
    }

    protected void doSetUpdusrid_Equal(String updusrid) {
        regUpdusrid(CK_EQ, updusrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_NotEqual(String updusrid) {
        doSetUpdusrid_NotEqual(fRES(updusrid));
    }

    protected void doSetUpdusrid_NotEqual(String updusrid) {
        regUpdusrid(CK_NES, updusrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_GreaterThan(String updusrid) {
        regUpdusrid(CK_GT, fRES(updusrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_LessThan(String updusrid) {
        regUpdusrid(CK_LT, fRES(updusrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_GreaterEqual(String updusrid) {
        regUpdusrid(CK_GE, fRES(updusrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_LessEqual(String updusrid) {
        regUpdusrid(CK_LE, fRES(updusrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusridList The collection of updusrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_InScope(Collection<String> updusridList) {
        doSetUpdusrid_InScope(updusridList);
    }

    protected void doSetUpdusrid_InScope(Collection<String> updusridList) {
        regINS(CK_INS, cTL(updusridList), xgetCValueUpdusrid(), "UPDUSRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusridList The collection of updusrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_NotInScope(Collection<String> updusridList) {
        doSetUpdusrid_NotInScope(updusridList);
    }

    protected void doSetUpdusrid_NotInScope(Collection<String> updusridList) {
        regINS(CK_NINS, cTL(updusridList), xgetCValueUpdusrid(), "UPDUSRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDUSRID: {varchar(255)} <br>
     * <pre>e.g. setUpdusrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updusrid The value of updusrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdusrid_LikeSearch(String updusrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updusrid), xgetCValueUpdusrid(), "UPDUSRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdusrid_NotLikeSearch(String updusrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updusrid), xgetCValueUpdusrid(), "UPDUSRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDUSRID: {varchar(255)}
     * @param updusrid The value of updusrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdusrid_PrefixSearch(String updusrid) {
        setUpdusrid_LikeSearch(updusrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     */
    public void setUpdusrid_IsNull() { regUpdusrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     */
    public void setUpdusrid_IsNullOrEmpty() { regUpdusrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDUSRID: {varchar(255)}
     */
    public void setUpdusrid_IsNotNull() { regUpdusrid(CK_ISNN, DOBJ); }

    protected void regUpdusrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdusrid(), "UPDUSRID"); }
    protected abstract ConditionValue xgetCValueUpdusrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_Equal(String updpocd) {
        doSetUpdpocd_Equal(fRES(updpocd));
    }

    protected void doSetUpdpocd_Equal(String updpocd) {
        regUpdpocd(CK_EQ, updpocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_NotEqual(String updpocd) {
        doSetUpdpocd_NotEqual(fRES(updpocd));
    }

    protected void doSetUpdpocd_NotEqual(String updpocd) {
        regUpdpocd(CK_NES, updpocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_GreaterThan(String updpocd) {
        regUpdpocd(CK_GT, fRES(updpocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_LessThan(String updpocd) {
        regUpdpocd(CK_LT, fRES(updpocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_GreaterEqual(String updpocd) {
        regUpdpocd(CK_GE, fRES(updpocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_LessEqual(String updpocd) {
        regUpdpocd(CK_LE, fRES(updpocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocdList The collection of updpocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_InScope(Collection<String> updpocdList) {
        doSetUpdpocd_InScope(updpocdList);
    }

    protected void doSetUpdpocd_InScope(Collection<String> updpocdList) {
        regINS(CK_INS, cTL(updpocdList), xgetCValueUpdpocd(), "UPDPOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocdList The collection of updpocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_NotInScope(Collection<String> updpocdList) {
        doSetUpdpocd_NotInScope(updpocdList);
    }

    protected void doSetUpdpocd_NotInScope(Collection<String> updpocdList) {
        regINS(CK_NINS, cTL(updpocdList), xgetCValueUpdpocd(), "UPDPOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(255)} <br>
     * <pre>e.g. setUpdpocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updpocd The value of updpocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdpocd_LikeSearch(String updpocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updpocd), xgetCValueUpdpocd(), "UPDPOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdpocd_NotLikeSearch(String updpocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updpocd), xgetCValueUpdpocd(), "UPDPOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDPOCD: {varchar(255)}
     * @param updpocd The value of updpocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdpocd_PrefixSearch(String updpocd) {
        setUpdpocd_LikeSearch(updpocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     */
    public void setUpdpocd_IsNull() { regUpdpocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     */
    public void setUpdpocd_IsNullOrEmpty() { regUpdpocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDPOCD: {varchar(255)}
     */
    public void setUpdpocd_IsNotNull() { regUpdpocd(CK_ISNN, DOBJ); }

    protected void regUpdpocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdpocd(), "UPDPOCD"); }
    protected abstract ConditionValue xgetCValueUpdpocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_Equal(String otcmpfg) {
        doSetOtcmpfg_Equal(fRES(otcmpfg));
    }

    protected void doSetOtcmpfg_Equal(String otcmpfg) {
        regOtcmpfg(CK_EQ, otcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotEqual(String otcmpfg) {
        doSetOtcmpfg_NotEqual(fRES(otcmpfg));
    }

    protected void doSetOtcmpfg_NotEqual(String otcmpfg) {
        regOtcmpfg(CK_NES, otcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterThan(String otcmpfg) {
        regOtcmpfg(CK_GT, fRES(otcmpfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessThan(String otcmpfg) {
        regOtcmpfg(CK_LT, fRES(otcmpfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_GreaterEqual(String otcmpfg) {
        regOtcmpfg(CK_GE, fRES(otcmpfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_LessEqual(String otcmpfg) {
        regOtcmpfg(CK_LE, fRES(otcmpfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfgList The collection of otcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_InScope(Collection<String> otcmpfgList) {
        doSetOtcmpfg_InScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_InScope(Collection<String> otcmpfgList) {
        regINS(CK_INS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfgList The collection of otcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_NotInScope(Collection<String> otcmpfgList) {
        doSetOtcmpfg_NotInScope(otcmpfgList);
    }

    protected void doSetOtcmpfg_NotInScope(Collection<String> otcmpfgList) {
        regINS(CK_NINS, cTL(otcmpfgList), xgetCValueOtcmpfg(), "OTCMPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {varchar(255)} <br>
     * <pre>e.g. setOtcmpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otcmpfg The value of otcmpfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtcmpfg_LikeSearch(String otcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otcmpfg), xgetCValueOtcmpfg(), "OTCMPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtcmpfg_NotLikeSearch(String otcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otcmpfg), xgetCValueOtcmpfg(), "OTCMPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTCMPFG: {varchar(255)}
     * @param otcmpfg The value of otcmpfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtcmpfg_PrefixSearch(String otcmpfg) {
        setOtcmpfg_LikeSearch(otcmpfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     */
    public void setOtcmpfg_IsNull() { regOtcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     */
    public void setOtcmpfg_IsNullOrEmpty() { regOtcmpfg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTCMPFG: {varchar(255)}
     */
    public void setOtcmpfg_IsNotNull() { regOtcmpfg(CK_ISNN, DOBJ); }

    protected void regOtcmpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtcmpfg(), "OTCMPFG"); }
    protected abstract ConditionValue xgetCValueOtcmpfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_Equal(String tmcmpfg) {
        doSetTmcmpfg_Equal(fRES(tmcmpfg));
    }

    protected void doSetTmcmpfg_Equal(String tmcmpfg) {
        regTmcmpfg(CK_EQ, tmcmpfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotEqual(String tmcmpfg) {
        doSetTmcmpfg_NotEqual(fRES(tmcmpfg));
    }

    protected void doSetTmcmpfg_NotEqual(String tmcmpfg) {
        regTmcmpfg(CK_NES, tmcmpfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterThan(String tmcmpfg) {
        regTmcmpfg(CK_GT, fRES(tmcmpfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessThan(String tmcmpfg) {
        regTmcmpfg(CK_LT, fRES(tmcmpfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_GreaterEqual(String tmcmpfg) {
        regTmcmpfg(CK_GE, fRES(tmcmpfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_LessEqual(String tmcmpfg) {
        regTmcmpfg(CK_LE, fRES(tmcmpfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfgList The collection of tmcmpfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_InScope(Collection<String> tmcmpfgList) {
        doSetTmcmpfg_InScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_InScope(Collection<String> tmcmpfgList) {
        regINS(CK_INS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfgList The collection of tmcmpfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_NotInScope(Collection<String> tmcmpfgList) {
        doSetTmcmpfg_NotInScope(tmcmpfgList);
    }

    protected void doSetTmcmpfg_NotInScope(Collection<String> tmcmpfgList) {
        regINS(CK_NINS, cTL(tmcmpfgList), xgetCValueTmcmpfg(), "TMCMPFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {varchar(255)} <br>
     * <pre>e.g. setTmcmpfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tmcmpfg The value of tmcmpfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTmcmpfg_LikeSearch(String tmcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tmcmpfg), xgetCValueTmcmpfg(), "TMCMPFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTmcmpfg_NotLikeSearch(String tmcmpfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tmcmpfg), xgetCValueTmcmpfg(), "TMCMPFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TMCMPFG: {varchar(255)}
     * @param tmcmpfg The value of tmcmpfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTmcmpfg_PrefixSearch(String tmcmpfg) {
        setTmcmpfg_LikeSearch(tmcmpfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     */
    public void setTmcmpfg_IsNull() { regTmcmpfg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     */
    public void setTmcmpfg_IsNullOrEmpty() { regTmcmpfg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TMCMPFG: {varchar(255)}
     */
    public void setTmcmpfg_IsNotNull() { regTmcmpfg(CK_ISNN, DOBJ); }

    protected void regTmcmpfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTmcmpfg(), "TMCMPFG"); }
    protected abstract ConditionValue xgetCValueTmcmpfg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_Equal(String stmid) {
        doSetStmid_Equal(fRES(stmid));
    }

    protected void doSetStmid_Equal(String stmid) {
        regStmid(CK_EQ, stmid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_NotEqual(String stmid) {
        doSetStmid_NotEqual(fRES(stmid));
    }

    protected void doSetStmid_NotEqual(String stmid) {
        regStmid(CK_NES, stmid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_GreaterThan(String stmid) {
        regStmid(CK_GT, fRES(stmid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_LessThan(String stmid) {
        regStmid(CK_LT, fRES(stmid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_GreaterEqual(String stmid) {
        regStmid(CK_GE, fRES(stmid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_LessEqual(String stmid) {
        regStmid(CK_LE, fRES(stmid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmidList The collection of stmid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_InScope(Collection<String> stmidList) {
        doSetStmid_InScope(stmidList);
    }

    protected void doSetStmid_InScope(Collection<String> stmidList) {
        regINS(CK_INS, cTL(stmidList), xgetCValueStmid(), "STMID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmidList The collection of stmid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_NotInScope(Collection<String> stmidList) {
        doSetStmid_NotInScope(stmidList);
    }

    protected void doSetStmid_NotInScope(Collection<String> stmidList) {
        regINS(CK_NINS, cTL(stmidList), xgetCValueStmid(), "STMID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(255)} <br>
     * <pre>e.g. setStmid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stmid The value of stmid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStmid_LikeSearch(String stmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stmid), xgetCValueStmid(), "STMID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStmid_NotLikeSearch(String stmid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stmid), xgetCValueStmid(), "STMID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STMID: {varchar(255)}
     * @param stmid The value of stmid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStmid_PrefixSearch(String stmid) {
        setStmid_LikeSearch(stmid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     */
    public void setStmid_IsNull() { regStmid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     */
    public void setStmid_IsNullOrEmpty() { regStmid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STMID: {varchar(255)}
     */
    public void setStmid_IsNotNull() { regStmid(CK_ISNN, DOBJ); }

    protected void regStmid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStmid(), "STMID"); }
    protected abstract ConditionValue xgetCValueStmid();

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
    public HpSLCFunction<ETsnProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETsnProductCB.class);
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
    public HpSLCFunction<ETsnProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETsnProductCB.class);
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
    public HpSLCFunction<ETsnProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETsnProductCB.class);
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
    public HpSLCFunction<ETsnProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETsnProductCB.class);
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
    public HpSLCFunction<ETsnProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETsnProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETsnProductCB&gt;() {
     *     public void query(ETsnProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETsnProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETsnProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETsnProductCQ sq);

    protected ETsnProductCB xcreateScalarConditionCB() {
        ETsnProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETsnProductCB xcreateScalarConditionPartitionByCB() {
        ETsnProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETsnProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnProductCB cb = new ETsnProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TSN_PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETsnProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETsnProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETsnProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnProductCB cb = new ETsnProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TSN_PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETsnProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETsnProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETsnProductCB cb = new ETsnProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETsnProductCQ sq);

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
    protected ETsnProductCB newMyCB() {
        return new ETsnProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETsnProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of E_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEZipCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEZipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_ZIP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_Equal(Long zipId) {
        doSetZipId_Equal(zipId);
    }

    protected void doSetZipId_Equal(Long zipId) {
        regZipId(CK_EQ, zipId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_NotEqual(Long zipId) {
        doSetZipId_NotEqual(zipId);
    }

    protected void doSetZipId_NotEqual(Long zipId) {
        regZipId(CK_NES, zipId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_GreaterThan(Long zipId) {
        regZipId(CK_GT, zipId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_LessThan(Long zipId) {
        regZipId(CK_LT, zipId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_GreaterEqual(Long zipId) {
        regZipId(CK_GE, zipId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipId The value of zipId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZipId_LessEqual(Long zipId) {
        regZipId(CK_LE, zipId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of zipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zipId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZipId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZipId(), "ZIP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipIdList The collection of zipId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipId_InScope(Collection<Long> zipIdList) {
        doSetZipId_InScope(zipIdList);
    }

    protected void doSetZipId_InScope(Collection<Long> zipIdList) {
        regINS(CK_INS, cTL(zipIdList), xgetCValueZipId(), "ZIP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param zipIdList The collection of zipId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipId_NotInScope(Collection<Long> zipIdList) {
        doSetZipId_NotInScope(zipIdList);
    }

    protected void doSetZipId_NotInScope(Collection<Long> zipIdList) {
        regINS(CK_NINS, cTL(zipIdList), xgetCValueZipId(), "ZIP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setZipId_IsNull() { regZipId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setZipId_IsNotNull() { regZipId(CK_ISNN, DOBJ); }

    protected void regZipId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipId(), "ZIP_ID"); }
    protected abstract ConditionValue xgetCValueZipId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
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
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
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
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
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
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
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
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
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
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_Equal(String zipCd) {
        doSetZipCd_Equal(fRES(zipCd));
    }

    protected void doSetZipCd_Equal(String zipCd) {
        regZipCd(CK_EQ, zipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotEqual(String zipCd) {
        doSetZipCd_NotEqual(fRES(zipCd));
    }

    protected void doSetZipCd_NotEqual(String zipCd) {
        regZipCd(CK_NES, zipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterThan(String zipCd) {
        regZipCd(CK_GT, fRES(zipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessThan(String zipCd) {
        regZipCd(CK_LT, fRES(zipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterEqual(String zipCd) {
        regZipCd(CK_GE, fRES(zipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessEqual(String zipCd) {
        regZipCd(CK_LE, fRES(zipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCdList The collection of zipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_InScope(Collection<String> zipCdList) {
        doSetZipCd_InScope(zipCdList);
    }

    protected void doSetZipCd_InScope(Collection<String> zipCdList) {
        regINS(CK_INS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCdList The collection of zipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotInScope(Collection<String> zipCdList) {
        doSetZipCd_NotInScope(zipCdList);
    }

    protected void doSetZipCd_NotInScope(Collection<String> zipCdList) {
        regINS(CK_NINS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(255)} <br>
     * <pre>e.g. setZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd The value of zipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd_LikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd_NotLikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {varchar(255)}
     * @param zipCd The value of zipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_PrefixSearch(String zipCd) {
        setZipCd_LikeSearch(zipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     */
    public void setZipCd_IsNull() { regZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     */
    public void setZipCd_IsNullOrEmpty() { regZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {varchar(255)}
     */
    public void setZipCd_IsNotNull() { regZipCd(CK_ISNN, DOBJ); }

    protected void regZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd(), "ZIP_CD"); }
    protected abstract ConditionValue xgetCValueZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_Equal(String publicCd) {
        doSetPublicCd_Equal(fRES(publicCd));
    }

    protected void doSetPublicCd_Equal(String publicCd) {
        regPublicCd(CK_EQ, publicCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_NotEqual(String publicCd) {
        doSetPublicCd_NotEqual(fRES(publicCd));
    }

    protected void doSetPublicCd_NotEqual(String publicCd) {
        regPublicCd(CK_NES, publicCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_GreaterThan(String publicCd) {
        regPublicCd(CK_GT, fRES(publicCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_LessThan(String publicCd) {
        regPublicCd(CK_LT, fRES(publicCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_GreaterEqual(String publicCd) {
        regPublicCd(CK_GE, fRES(publicCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_LessEqual(String publicCd) {
        regPublicCd(CK_LE, fRES(publicCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCdList The collection of publicCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_InScope(Collection<String> publicCdList) {
        doSetPublicCd_InScope(publicCdList);
    }

    protected void doSetPublicCd_InScope(Collection<String> publicCdList) {
        regINS(CK_INS, cTL(publicCdList), xgetCValuePublicCd(), "PUBLIC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCdList The collection of publicCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_NotInScope(Collection<String> publicCdList) {
        doSetPublicCd_NotInScope(publicCdList);
    }

    protected void doSetPublicCd_NotInScope(Collection<String> publicCdList) {
        regINS(CK_NINS, cTL(publicCdList), xgetCValuePublicCd(), "PUBLIC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLIC_CD: {varchar(255)} <br>
     * <pre>e.g. setPublicCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param publicCd The value of publicCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPublicCd_LikeSearch(String publicCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(publicCd), xgetCValuePublicCd(), "PUBLIC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPublicCd_NotLikeSearch(String publicCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(publicCd), xgetCValuePublicCd(), "PUBLIC_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     * @param publicCd The value of publicCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicCd_PrefixSearch(String publicCd) {
        setPublicCd_LikeSearch(publicCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     */
    public void setPublicCd_IsNull() { regPublicCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     */
    public void setPublicCd_IsNullOrEmpty() { regPublicCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PUBLIC_CD: {varchar(255)}
     */
    public void setPublicCd_IsNotNull() { regPublicCd(CK_ISNN, DOBJ); }

    protected void regPublicCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePublicCd(), "PUBLIC_CD"); }
    protected abstract ConditionValue xgetCValuePublicCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_Equal(String zipCd5) {
        doSetZipCd5_Equal(fRES(zipCd5));
    }

    protected void doSetZipCd5_Equal(String zipCd5) {
        regZipCd5(CK_EQ, zipCd5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_NotEqual(String zipCd5) {
        doSetZipCd5_NotEqual(fRES(zipCd5));
    }

    protected void doSetZipCd5_NotEqual(String zipCd5) {
        regZipCd5(CK_NES, zipCd5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_GreaterThan(String zipCd5) {
        regZipCd5(CK_GT, fRES(zipCd5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_LessThan(String zipCd5) {
        regZipCd5(CK_LT, fRES(zipCd5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_GreaterEqual(String zipCd5) {
        regZipCd5(CK_GE, fRES(zipCd5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_LessEqual(String zipCd5) {
        regZipCd5(CK_LE, fRES(zipCd5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5List The collection of zipCd5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_InScope(Collection<String> zipCd5List) {
        doSetZipCd5_InScope(zipCd5List);
    }

    protected void doSetZipCd5_InScope(Collection<String> zipCd5List) {
        regINS(CK_INS, cTL(zipCd5List), xgetCValueZipCd5(), "ZIP_CD5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5List The collection of zipCd5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_NotInScope(Collection<String> zipCd5List) {
        doSetZipCd5_NotInScope(zipCd5List);
    }

    protected void doSetZipCd5_NotInScope(Collection<String> zipCd5List) {
        regINS(CK_NINS, cTL(zipCd5List), xgetCValueZipCd5(), "ZIP_CD5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD5: {varchar(255)} <br>
     * <pre>e.g. setZipCd5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd5 The value of zipCd5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd5_LikeSearch(String zipCd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd5), xgetCValueZipCd5(), "ZIP_CD5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd5_NotLikeSearch(String zipCd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd5), xgetCValueZipCd5(), "ZIP_CD5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     * @param zipCd5 The value of zipCd5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd5_PrefixSearch(String zipCd5) {
        setZipCd5_LikeSearch(zipCd5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     */
    public void setZipCd5_IsNull() { regZipCd5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     */
    public void setZipCd5_IsNullOrEmpty() { regZipCd5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD5: {varchar(255)}
     */
    public void setZipCd5_IsNotNull() { regZipCd5(CK_ISNN, DOBJ); }

    protected void regZipCd5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd5(), "ZIP_CD5"); }
    protected abstract ConditionValue xgetCValueZipCd5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_Equal(String addressKn1) {
        doSetAddressKn1_Equal(fRES(addressKn1));
    }

    protected void doSetAddressKn1_Equal(String addressKn1) {
        regAddressKn1(CK_EQ, addressKn1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_NotEqual(String addressKn1) {
        doSetAddressKn1_NotEqual(fRES(addressKn1));
    }

    protected void doSetAddressKn1_NotEqual(String addressKn1) {
        regAddressKn1(CK_NES, addressKn1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_GreaterThan(String addressKn1) {
        regAddressKn1(CK_GT, fRES(addressKn1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_LessThan(String addressKn1) {
        regAddressKn1(CK_LT, fRES(addressKn1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_GreaterEqual(String addressKn1) {
        regAddressKn1(CK_GE, fRES(addressKn1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_LessEqual(String addressKn1) {
        regAddressKn1(CK_LE, fRES(addressKn1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1List The collection of addressKn1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_InScope(Collection<String> addressKn1List) {
        doSetAddressKn1_InScope(addressKn1List);
    }

    protected void doSetAddressKn1_InScope(Collection<String> addressKn1List) {
        regINS(CK_INS, cTL(addressKn1List), xgetCValueAddressKn1(), "ADDRESS_KN1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1List The collection of addressKn1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_NotInScope(Collection<String> addressKn1List) {
        doSetAddressKn1_NotInScope(addressKn1List);
    }

    protected void doSetAddressKn1_NotInScope(Collection<String> addressKn1List) {
        regINS(CK_NINS, cTL(addressKn1List), xgetCValueAddressKn1(), "ADDRESS_KN1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN1: {varchar(255)} <br>
     * <pre>e.g. setAddressKn1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param addressKn1 The value of addressKn1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddressKn1_LikeSearch(String addressKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(addressKn1), xgetCValueAddressKn1(), "ADDRESS_KN1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddressKn1_NotLikeSearch(String addressKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(addressKn1), xgetCValueAddressKn1(), "ADDRESS_KN1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @param addressKn1 The value of addressKn1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn1_PrefixSearch(String addressKn1) {
        setAddressKn1_LikeSearch(addressKn1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     */
    public void setAddressKn1_IsNull() { regAddressKn1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     */
    public void setAddressKn1_IsNullOrEmpty() { regAddressKn1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN1: {varchar(255)}
     */
    public void setAddressKn1_IsNotNull() { regAddressKn1(CK_ISNN, DOBJ); }

    protected void regAddressKn1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddressKn1(), "ADDRESS_KN1"); }
    protected abstract ConditionValue xgetCValueAddressKn1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_Equal(String addressKn2) {
        doSetAddressKn2_Equal(fRES(addressKn2));
    }

    protected void doSetAddressKn2_Equal(String addressKn2) {
        regAddressKn2(CK_EQ, addressKn2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_NotEqual(String addressKn2) {
        doSetAddressKn2_NotEqual(fRES(addressKn2));
    }

    protected void doSetAddressKn2_NotEqual(String addressKn2) {
        regAddressKn2(CK_NES, addressKn2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_GreaterThan(String addressKn2) {
        regAddressKn2(CK_GT, fRES(addressKn2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_LessThan(String addressKn2) {
        regAddressKn2(CK_LT, fRES(addressKn2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_GreaterEqual(String addressKn2) {
        regAddressKn2(CK_GE, fRES(addressKn2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_LessEqual(String addressKn2) {
        regAddressKn2(CK_LE, fRES(addressKn2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2List The collection of addressKn2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_InScope(Collection<String> addressKn2List) {
        doSetAddressKn2_InScope(addressKn2List);
    }

    protected void doSetAddressKn2_InScope(Collection<String> addressKn2List) {
        regINS(CK_INS, cTL(addressKn2List), xgetCValueAddressKn2(), "ADDRESS_KN2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2List The collection of addressKn2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_NotInScope(Collection<String> addressKn2List) {
        doSetAddressKn2_NotInScope(addressKn2List);
    }

    protected void doSetAddressKn2_NotInScope(Collection<String> addressKn2List) {
        regINS(CK_NINS, cTL(addressKn2List), xgetCValueAddressKn2(), "ADDRESS_KN2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN2: {varchar(255)} <br>
     * <pre>e.g. setAddressKn2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param addressKn2 The value of addressKn2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddressKn2_LikeSearch(String addressKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(addressKn2), xgetCValueAddressKn2(), "ADDRESS_KN2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddressKn2_NotLikeSearch(String addressKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(addressKn2), xgetCValueAddressKn2(), "ADDRESS_KN2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @param addressKn2 The value of addressKn2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn2_PrefixSearch(String addressKn2) {
        setAddressKn2_LikeSearch(addressKn2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     */
    public void setAddressKn2_IsNull() { regAddressKn2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     */
    public void setAddressKn2_IsNullOrEmpty() { regAddressKn2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN2: {varchar(255)}
     */
    public void setAddressKn2_IsNotNull() { regAddressKn2(CK_ISNN, DOBJ); }

    protected void regAddressKn2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddressKn2(), "ADDRESS_KN2"); }
    protected abstract ConditionValue xgetCValueAddressKn2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_Equal(String addressKn3) {
        doSetAddressKn3_Equal(fRES(addressKn3));
    }

    protected void doSetAddressKn3_Equal(String addressKn3) {
        regAddressKn3(CK_EQ, addressKn3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_NotEqual(String addressKn3) {
        doSetAddressKn3_NotEqual(fRES(addressKn3));
    }

    protected void doSetAddressKn3_NotEqual(String addressKn3) {
        regAddressKn3(CK_NES, addressKn3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_GreaterThan(String addressKn3) {
        regAddressKn3(CK_GT, fRES(addressKn3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_LessThan(String addressKn3) {
        regAddressKn3(CK_LT, fRES(addressKn3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_GreaterEqual(String addressKn3) {
        regAddressKn3(CK_GE, fRES(addressKn3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_LessEqual(String addressKn3) {
        regAddressKn3(CK_LE, fRES(addressKn3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3List The collection of addressKn3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_InScope(Collection<String> addressKn3List) {
        doSetAddressKn3_InScope(addressKn3List);
    }

    protected void doSetAddressKn3_InScope(Collection<String> addressKn3List) {
        regINS(CK_INS, cTL(addressKn3List), xgetCValueAddressKn3(), "ADDRESS_KN3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3List The collection of addressKn3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_NotInScope(Collection<String> addressKn3List) {
        doSetAddressKn3_NotInScope(addressKn3List);
    }

    protected void doSetAddressKn3_NotInScope(Collection<String> addressKn3List) {
        regINS(CK_NINS, cTL(addressKn3List), xgetCValueAddressKn3(), "ADDRESS_KN3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN3: {varchar(255)} <br>
     * <pre>e.g. setAddressKn3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param addressKn3 The value of addressKn3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddressKn3_LikeSearch(String addressKn3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(addressKn3), xgetCValueAddressKn3(), "ADDRESS_KN3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddressKn3_NotLikeSearch(String addressKn3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(addressKn3), xgetCValueAddressKn3(), "ADDRESS_KN3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @param addressKn3 The value of addressKn3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddressKn3_PrefixSearch(String addressKn3) {
        setAddressKn3_LikeSearch(addressKn3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     */
    public void setAddressKn3_IsNull() { regAddressKn3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     */
    public void setAddressKn3_IsNullOrEmpty() { regAddressKn3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS_KN3: {varchar(255)}
     */
    public void setAddressKn3_IsNotNull() { regAddressKn3(CK_ISNN, DOBJ); }

    protected void regAddressKn3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddressKn3(), "ADDRESS_KN3"); }
    protected abstract ConditionValue xgetCValueAddressKn3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_Equal(String companyKn) {
        doSetCompanyKn_Equal(fRES(companyKn));
    }

    protected void doSetCompanyKn_Equal(String companyKn) {
        regCompanyKn(CK_EQ, companyKn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_NotEqual(String companyKn) {
        doSetCompanyKn_NotEqual(fRES(companyKn));
    }

    protected void doSetCompanyKn_NotEqual(String companyKn) {
        regCompanyKn(CK_NES, companyKn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_GreaterThan(String companyKn) {
        regCompanyKn(CK_GT, fRES(companyKn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_LessThan(String companyKn) {
        regCompanyKn(CK_LT, fRES(companyKn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_GreaterEqual(String companyKn) {
        regCompanyKn(CK_GE, fRES(companyKn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_LessEqual(String companyKn) {
        regCompanyKn(CK_LE, fRES(companyKn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKnList The collection of companyKn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_InScope(Collection<String> companyKnList) {
        doSetCompanyKn_InScope(companyKnList);
    }

    protected void doSetCompanyKn_InScope(Collection<String> companyKnList) {
        regINS(CK_INS, cTL(companyKnList), xgetCValueCompanyKn(), "COMPANY_KN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKnList The collection of companyKn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_NotInScope(Collection<String> companyKnList) {
        doSetCompanyKn_NotInScope(companyKnList);
    }

    protected void doSetCompanyKn_NotInScope(Collection<String> companyKnList) {
        regINS(CK_NINS, cTL(companyKnList), xgetCValueCompanyKn(), "COMPANY_KN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_KN: {varchar(255)} <br>
     * <pre>e.g. setCompanyKn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyKn The value of companyKn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyKn_LikeSearch(String companyKn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyKn), xgetCValueCompanyKn(), "COMPANY_KN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyKn_NotLikeSearch(String companyKn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyKn), xgetCValueCompanyKn(), "COMPANY_KN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     * @param companyKn The value of companyKn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyKn_PrefixSearch(String companyKn) {
        setCompanyKn_LikeSearch(companyKn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     */
    public void setCompanyKn_IsNull() { regCompanyKn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     */
    public void setCompanyKn_IsNullOrEmpty() { regCompanyKn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_KN: {varchar(255)}
     */
    public void setCompanyKn_IsNotNull() { regCompanyKn(CK_ISNN, DOBJ); }

    protected void regCompanyKn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyKn(), "COMPANY_KN"); }
    protected abstract ConditionValue xgetCValueCompanyKn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_Equal(String address4) {
        doSetAddress4_Equal(fRES(address4));
    }

    protected void doSetAddress4_Equal(String address4) {
        regAddress4(CK_EQ, address4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_NotEqual(String address4) {
        doSetAddress4_NotEqual(fRES(address4));
    }

    protected void doSetAddress4_NotEqual(String address4) {
        regAddress4(CK_NES, address4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_GreaterThan(String address4) {
        regAddress4(CK_GT, fRES(address4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_LessThan(String address4) {
        regAddress4(CK_LT, fRES(address4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_GreaterEqual(String address4) {
        regAddress4(CK_GE, fRES(address4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_LessEqual(String address4) {
        regAddress4(CK_LE, fRES(address4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4List The collection of address4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_InScope(Collection<String> address4List) {
        doSetAddress4_InScope(address4List);
    }

    protected void doSetAddress4_InScope(Collection<String> address4List) {
        regINS(CK_INS, cTL(address4List), xgetCValueAddress4(), "ADDRESS4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4List The collection of address4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_NotInScope(Collection<String> address4List) {
        doSetAddress4_NotInScope(address4List);
    }

    protected void doSetAddress4_NotInScope(Collection<String> address4List) {
        regINS(CK_NINS, cTL(address4List), xgetCValueAddress4(), "ADDRESS4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS4: {varchar(255)} <br>
     * <pre>e.g. setAddress4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address4 The value of address4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress4_LikeSearch(String address4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address4), xgetCValueAddress4(), "ADDRESS4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress4_NotLikeSearch(String address4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address4), xgetCValueAddress4(), "ADDRESS4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS4: {varchar(255)}
     * @param address4 The value of address4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress4_PrefixSearch(String address4) {
        setAddress4_LikeSearch(address4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     */
    public void setAddress4_IsNull() { regAddress4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     */
    public void setAddress4_IsNullOrEmpty() { regAddress4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS4: {varchar(255)}
     */
    public void setAddress4_IsNotNull() { regAddress4(CK_ISNN, DOBJ); }

    protected void regAddress4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress4(), "ADDRESS4"); }
    protected abstract ConditionValue xgetCValueAddress4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_Equal(String companyNm) {
        doSetCompanyNm_Equal(fRES(companyNm));
    }

    protected void doSetCompanyNm_Equal(String companyNm) {
        regCompanyNm(CK_EQ, companyNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_NotEqual(String companyNm) {
        doSetCompanyNm_NotEqual(fRES(companyNm));
    }

    protected void doSetCompanyNm_NotEqual(String companyNm) {
        regCompanyNm(CK_NES, companyNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_GreaterThan(String companyNm) {
        regCompanyNm(CK_GT, fRES(companyNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_LessThan(String companyNm) {
        regCompanyNm(CK_LT, fRES(companyNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_GreaterEqual(String companyNm) {
        regCompanyNm(CK_GE, fRES(companyNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_LessEqual(String companyNm) {
        regCompanyNm(CK_LE, fRES(companyNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNmList The collection of companyNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_InScope(Collection<String> companyNmList) {
        doSetCompanyNm_InScope(companyNmList);
    }

    protected void doSetCompanyNm_InScope(Collection<String> companyNmList) {
        regINS(CK_INS, cTL(companyNmList), xgetCValueCompanyNm(), "COMPANY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNmList The collection of companyNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_NotInScope(Collection<String> companyNmList) {
        doSetCompanyNm_NotInScope(companyNmList);
    }

    protected void doSetCompanyNm_NotInScope(Collection<String> companyNmList) {
        regINS(CK_NINS, cTL(companyNmList), xgetCValueCompanyNm(), "COMPANY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {varchar(255)} <br>
     * <pre>e.g. setCompanyNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyNm The value of companyNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyNm_LikeSearch(String companyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyNm), xgetCValueCompanyNm(), "COMPANY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyNm_NotLikeSearch(String companyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyNm), xgetCValueCompanyNm(), "COMPANY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     * @param companyNm The value of companyNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyNm_PrefixSearch(String companyNm) {
        setCompanyNm_LikeSearch(companyNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     */
    public void setCompanyNm_IsNull() { regCompanyNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     */
    public void setCompanyNm_IsNullOrEmpty() { regCompanyNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_NM: {varchar(255)}
     */
    public void setCompanyNm_IsNotNull() { regCompanyNm(CK_ISNN, DOBJ); }

    protected void regCompanyNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyNm(), "COMPANY_NM"); }
    protected abstract ConditionValue xgetCValueCompanyNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_Equal(String flg1) {
        doSetFlg1_Equal(fRES(flg1));
    }

    protected void doSetFlg1_Equal(String flg1) {
        regFlg1(CK_EQ, flg1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_NotEqual(String flg1) {
        doSetFlg1_NotEqual(fRES(flg1));
    }

    protected void doSetFlg1_NotEqual(String flg1) {
        regFlg1(CK_NES, flg1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_GreaterThan(String flg1) {
        regFlg1(CK_GT, fRES(flg1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_LessThan(String flg1) {
        regFlg1(CK_LT, fRES(flg1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_GreaterEqual(String flg1) {
        regFlg1(CK_GE, fRES(flg1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_LessEqual(String flg1) {
        regFlg1(CK_LE, fRES(flg1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1List The collection of flg1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_InScope(Collection<String> flg1List) {
        doSetFlg1_InScope(flg1List);
    }

    protected void doSetFlg1_InScope(Collection<String> flg1List) {
        regINS(CK_INS, cTL(flg1List), xgetCValueFlg1(), "FLG1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1List The collection of flg1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_NotInScope(Collection<String> flg1List) {
        doSetFlg1_NotInScope(flg1List);
    }

    protected void doSetFlg1_NotInScope(Collection<String> flg1List) {
        regINS(CK_NINS, cTL(flg1List), xgetCValueFlg1(), "FLG1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG1: {varchar(255)} <br>
     * <pre>e.g. setFlg1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg1 The value of flg1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg1_LikeSearch(String flg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg1), xgetCValueFlg1(), "FLG1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg1_NotLikeSearch(String flg1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg1), xgetCValueFlg1(), "FLG1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG1: {varchar(255)}
     * @param flg1 The value of flg1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg1_PrefixSearch(String flg1) {
        setFlg1_LikeSearch(flg1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     */
    public void setFlg1_IsNull() { regFlg1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     */
    public void setFlg1_IsNullOrEmpty() { regFlg1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG1: {varchar(255)}
     */
    public void setFlg1_IsNotNull() { regFlg1(CK_ISNN, DOBJ); }

    protected void regFlg1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg1(), "FLG1"); }
    protected abstract ConditionValue xgetCValueFlg1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_Equal(String flg2) {
        doSetFlg2_Equal(fRES(flg2));
    }

    protected void doSetFlg2_Equal(String flg2) {
        regFlg2(CK_EQ, flg2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_NotEqual(String flg2) {
        doSetFlg2_NotEqual(fRES(flg2));
    }

    protected void doSetFlg2_NotEqual(String flg2) {
        regFlg2(CK_NES, flg2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_GreaterThan(String flg2) {
        regFlg2(CK_GT, fRES(flg2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_LessThan(String flg2) {
        regFlg2(CK_LT, fRES(flg2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_GreaterEqual(String flg2) {
        regFlg2(CK_GE, fRES(flg2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_LessEqual(String flg2) {
        regFlg2(CK_LE, fRES(flg2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2List The collection of flg2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_InScope(Collection<String> flg2List) {
        doSetFlg2_InScope(flg2List);
    }

    protected void doSetFlg2_InScope(Collection<String> flg2List) {
        regINS(CK_INS, cTL(flg2List), xgetCValueFlg2(), "FLG2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2List The collection of flg2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_NotInScope(Collection<String> flg2List) {
        doSetFlg2_NotInScope(flg2List);
    }

    protected void doSetFlg2_NotInScope(Collection<String> flg2List) {
        regINS(CK_NINS, cTL(flg2List), xgetCValueFlg2(), "FLG2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG2: {varchar(255)} <br>
     * <pre>e.g. setFlg2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg2 The value of flg2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg2_LikeSearch(String flg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg2), xgetCValueFlg2(), "FLG2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg2_NotLikeSearch(String flg2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg2), xgetCValueFlg2(), "FLG2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG2: {varchar(255)}
     * @param flg2 The value of flg2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg2_PrefixSearch(String flg2) {
        setFlg2_LikeSearch(flg2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     */
    public void setFlg2_IsNull() { regFlg2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     */
    public void setFlg2_IsNullOrEmpty() { regFlg2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG2: {varchar(255)}
     */
    public void setFlg2_IsNotNull() { regFlg2(CK_ISNN, DOBJ); }

    protected void regFlg2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg2(), "FLG2"); }
    protected abstract ConditionValue xgetCValueFlg2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_Equal(String flg3) {
        doSetFlg3_Equal(fRES(flg3));
    }

    protected void doSetFlg3_Equal(String flg3) {
        regFlg3(CK_EQ, flg3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_NotEqual(String flg3) {
        doSetFlg3_NotEqual(fRES(flg3));
    }

    protected void doSetFlg3_NotEqual(String flg3) {
        regFlg3(CK_NES, flg3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_GreaterThan(String flg3) {
        regFlg3(CK_GT, fRES(flg3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_LessThan(String flg3) {
        regFlg3(CK_LT, fRES(flg3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_GreaterEqual(String flg3) {
        regFlg3(CK_GE, fRES(flg3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_LessEqual(String flg3) {
        regFlg3(CK_LE, fRES(flg3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3List The collection of flg3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_InScope(Collection<String> flg3List) {
        doSetFlg3_InScope(flg3List);
    }

    protected void doSetFlg3_InScope(Collection<String> flg3List) {
        regINS(CK_INS, cTL(flg3List), xgetCValueFlg3(), "FLG3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3List The collection of flg3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_NotInScope(Collection<String> flg3List) {
        doSetFlg3_NotInScope(flg3List);
    }

    protected void doSetFlg3_NotInScope(Collection<String> flg3List) {
        regINS(CK_NINS, cTL(flg3List), xgetCValueFlg3(), "FLG3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG3: {varchar(255)} <br>
     * <pre>e.g. setFlg3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg3 The value of flg3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg3_LikeSearch(String flg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg3), xgetCValueFlg3(), "FLG3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg3_NotLikeSearch(String flg3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg3), xgetCValueFlg3(), "FLG3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG3: {varchar(255)}
     * @param flg3 The value of flg3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg3_PrefixSearch(String flg3) {
        setFlg3_LikeSearch(flg3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     */
    public void setFlg3_IsNull() { regFlg3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     */
    public void setFlg3_IsNullOrEmpty() { regFlg3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG3: {varchar(255)}
     */
    public void setFlg3_IsNotNull() { regFlg3(CK_ISNN, DOBJ); }

    protected void regFlg3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg3(), "FLG3"); }
    protected abstract ConditionValue xgetCValueFlg3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_Equal(String flg4) {
        doSetFlg4_Equal(fRES(flg4));
    }

    protected void doSetFlg4_Equal(String flg4) {
        regFlg4(CK_EQ, flg4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_NotEqual(String flg4) {
        doSetFlg4_NotEqual(fRES(flg4));
    }

    protected void doSetFlg4_NotEqual(String flg4) {
        regFlg4(CK_NES, flg4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_GreaterThan(String flg4) {
        regFlg4(CK_GT, fRES(flg4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_LessThan(String flg4) {
        regFlg4(CK_LT, fRES(flg4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_GreaterEqual(String flg4) {
        regFlg4(CK_GE, fRES(flg4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_LessEqual(String flg4) {
        regFlg4(CK_LE, fRES(flg4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4List The collection of flg4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_InScope(Collection<String> flg4List) {
        doSetFlg4_InScope(flg4List);
    }

    protected void doSetFlg4_InScope(Collection<String> flg4List) {
        regINS(CK_INS, cTL(flg4List), xgetCValueFlg4(), "FLG4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4List The collection of flg4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_NotInScope(Collection<String> flg4List) {
        doSetFlg4_NotInScope(flg4List);
    }

    protected void doSetFlg4_NotInScope(Collection<String> flg4List) {
        regINS(CK_NINS, cTL(flg4List), xgetCValueFlg4(), "FLG4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG4: {varchar(255)} <br>
     * <pre>e.g. setFlg4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg4 The value of flg4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg4_LikeSearch(String flg4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg4), xgetCValueFlg4(), "FLG4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg4_NotLikeSearch(String flg4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg4), xgetCValueFlg4(), "FLG4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG4: {varchar(255)}
     * @param flg4 The value of flg4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg4_PrefixSearch(String flg4) {
        setFlg4_LikeSearch(flg4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     */
    public void setFlg4_IsNull() { regFlg4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     */
    public void setFlg4_IsNullOrEmpty() { regFlg4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG4: {varchar(255)}
     */
    public void setFlg4_IsNotNull() { regFlg4(CK_ISNN, DOBJ); }

    protected void regFlg4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg4(), "FLG4"); }
    protected abstract ConditionValue xgetCValueFlg4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_Equal(String updType) {
        doSetUpdType_Equal(fRES(updType));
    }

    protected void doSetUpdType_Equal(String updType) {
        regUpdType(CK_EQ, updType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_NotEqual(String updType) {
        doSetUpdType_NotEqual(fRES(updType));
    }

    protected void doSetUpdType_NotEqual(String updType) {
        regUpdType(CK_NES, updType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_GreaterThan(String updType) {
        regUpdType(CK_GT, fRES(updType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_LessThan(String updType) {
        regUpdType(CK_LT, fRES(updType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_GreaterEqual(String updType) {
        regUpdType(CK_GE, fRES(updType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_LessEqual(String updType) {
        regUpdType(CK_LE, fRES(updType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updTypeList The collection of updType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_InScope(Collection<String> updTypeList) {
        doSetUpdType_InScope(updTypeList);
    }

    protected void doSetUpdType_InScope(Collection<String> updTypeList) {
        regINS(CK_INS, cTL(updTypeList), xgetCValueUpdType(), "UPD_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updTypeList The collection of updType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_NotInScope(Collection<String> updTypeList) {
        doSetUpdType_NotInScope(updTypeList);
    }

    protected void doSetUpdType_NotInScope(Collection<String> updTypeList) {
        regINS(CK_NINS, cTL(updTypeList), xgetCValueUpdType(), "UPD_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TYPE: {varchar(255)} <br>
     * <pre>e.g. setUpdType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updType The value of updType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdType_LikeSearch(String updType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updType), xgetCValueUpdType(), "UPD_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdType_NotLikeSearch(String updType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updType), xgetCValueUpdType(), "UPD_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     * @param updType The value of updType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdType_PrefixSearch(String updType) {
        setUpdType_LikeSearch(updType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     */
    public void setUpdType_IsNull() { regUpdType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     */
    public void setUpdType_IsNullOrEmpty() { regUpdType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_TYPE: {varchar(255)}
     */
    public void setUpdType_IsNotNull() { regUpdType(CK_ISNN, DOBJ); }

    protected void regUpdType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdType(), "UPD_TYPE"); }
    protected abstract ConditionValue xgetCValueUpdType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_Equal(String reasonType) {
        doSetReasonType_Equal(fRES(reasonType));
    }

    protected void doSetReasonType_Equal(String reasonType) {
        regReasonType(CK_EQ, reasonType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_NotEqual(String reasonType) {
        doSetReasonType_NotEqual(fRES(reasonType));
    }

    protected void doSetReasonType_NotEqual(String reasonType) {
        regReasonType(CK_NES, reasonType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_GreaterThan(String reasonType) {
        regReasonType(CK_GT, fRES(reasonType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_LessThan(String reasonType) {
        regReasonType(CK_LT, fRES(reasonType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_GreaterEqual(String reasonType) {
        regReasonType(CK_GE, fRES(reasonType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_LessEqual(String reasonType) {
        regReasonType(CK_LE, fRES(reasonType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonTypeList The collection of reasonType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_InScope(Collection<String> reasonTypeList) {
        doSetReasonType_InScope(reasonTypeList);
    }

    protected void doSetReasonType_InScope(Collection<String> reasonTypeList) {
        regINS(CK_INS, cTL(reasonTypeList), xgetCValueReasonType(), "REASON_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonTypeList The collection of reasonType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_NotInScope(Collection<String> reasonTypeList) {
        doSetReasonType_NotInScope(reasonTypeList);
    }

    protected void doSetReasonType_NotInScope(Collection<String> reasonTypeList) {
        regINS(CK_NINS, cTL(reasonTypeList), xgetCValueReasonType(), "REASON_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REASON_TYPE: {varchar(255)} <br>
     * <pre>e.g. setReasonType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reasonType The value of reasonType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReasonType_LikeSearch(String reasonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reasonType), xgetCValueReasonType(), "REASON_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReasonType_NotLikeSearch(String reasonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reasonType), xgetCValueReasonType(), "REASON_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     * @param reasonType The value of reasonType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReasonType_PrefixSearch(String reasonType) {
        setReasonType_LikeSearch(reasonType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     */
    public void setReasonType_IsNull() { regReasonType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     */
    public void setReasonType_IsNullOrEmpty() { regReasonType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REASON_TYPE: {varchar(255)}
     */
    public void setReasonType_IsNotNull() { regReasonType(CK_ISNN, DOBJ); }

    protected void regReasonType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReasonType(), "REASON_TYPE"); }
    protected abstract ConditionValue xgetCValueReasonType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_Equal(String handlingAddress) {
        doSetHandlingAddress_Equal(fRES(handlingAddress));
    }

    protected void doSetHandlingAddress_Equal(String handlingAddress) {
        regHandlingAddress(CK_EQ, handlingAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_NotEqual(String handlingAddress) {
        doSetHandlingAddress_NotEqual(fRES(handlingAddress));
    }

    protected void doSetHandlingAddress_NotEqual(String handlingAddress) {
        regHandlingAddress(CK_NES, handlingAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_GreaterThan(String handlingAddress) {
        regHandlingAddress(CK_GT, fRES(handlingAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_LessThan(String handlingAddress) {
        regHandlingAddress(CK_LT, fRES(handlingAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_GreaterEqual(String handlingAddress) {
        regHandlingAddress(CK_GE, fRES(handlingAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_LessEqual(String handlingAddress) {
        regHandlingAddress(CK_LE, fRES(handlingAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddressList The collection of handlingAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_InScope(Collection<String> handlingAddressList) {
        doSetHandlingAddress_InScope(handlingAddressList);
    }

    protected void doSetHandlingAddress_InScope(Collection<String> handlingAddressList) {
        regINS(CK_INS, cTL(handlingAddressList), xgetCValueHandlingAddress(), "HANDLING_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddressList The collection of handlingAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_NotInScope(Collection<String> handlingAddressList) {
        doSetHandlingAddress_NotInScope(handlingAddressList);
    }

    protected void doSetHandlingAddress_NotInScope(Collection<String> handlingAddressList) {
        regINS(CK_NINS, cTL(handlingAddressList), xgetCValueHandlingAddress(), "HANDLING_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)} <br>
     * <pre>e.g. setHandlingAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param handlingAddress The value of handlingAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHandlingAddress_LikeSearch(String handlingAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(handlingAddress), xgetCValueHandlingAddress(), "HANDLING_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHandlingAddress_NotLikeSearch(String handlingAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(handlingAddress), xgetCValueHandlingAddress(), "HANDLING_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @param handlingAddress The value of handlingAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandlingAddress_PrefixSearch(String handlingAddress) {
        setHandlingAddress_LikeSearch(handlingAddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     */
    public void setHandlingAddress_IsNull() { regHandlingAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     */
    public void setHandlingAddress_IsNullOrEmpty() { regHandlingAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     */
    public void setHandlingAddress_IsNotNull() { regHandlingAddress(CK_ISNN, DOBJ); }

    protected void regHandlingAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHandlingAddress(), "HANDLING_ADDRESS"); }
    protected abstract ConditionValue xgetCValueHandlingAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_Equal(String flg5) {
        doSetFlg5_Equal(fRES(flg5));
    }

    protected void doSetFlg5_Equal(String flg5) {
        regFlg5(CK_EQ, flg5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_NotEqual(String flg5) {
        doSetFlg5_NotEqual(fRES(flg5));
    }

    protected void doSetFlg5_NotEqual(String flg5) {
        regFlg5(CK_NES, flg5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_GreaterThan(String flg5) {
        regFlg5(CK_GT, fRES(flg5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_LessThan(String flg5) {
        regFlg5(CK_LT, fRES(flg5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_GreaterEqual(String flg5) {
        regFlg5(CK_GE, fRES(flg5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_LessEqual(String flg5) {
        regFlg5(CK_LE, fRES(flg5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5List The collection of flg5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_InScope(Collection<String> flg5List) {
        doSetFlg5_InScope(flg5List);
    }

    protected void doSetFlg5_InScope(Collection<String> flg5List) {
        regINS(CK_INS, cTL(flg5List), xgetCValueFlg5(), "FLG5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5List The collection of flg5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_NotInScope(Collection<String> flg5List) {
        doSetFlg5_NotInScope(flg5List);
    }

    protected void doSetFlg5_NotInScope(Collection<String> flg5List) {
        regINS(CK_NINS, cTL(flg5List), xgetCValueFlg5(), "FLG5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG5: {varchar(255)} <br>
     * <pre>e.g. setFlg5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg5 The value of flg5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg5_LikeSearch(String flg5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg5), xgetCValueFlg5(), "FLG5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg5_NotLikeSearch(String flg5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg5), xgetCValueFlg5(), "FLG5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG5: {varchar(255)}
     * @param flg5 The value of flg5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg5_PrefixSearch(String flg5) {
        setFlg5_LikeSearch(flg5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     */
    public void setFlg5_IsNull() { regFlg5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     */
    public void setFlg5_IsNullOrEmpty() { regFlg5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG5: {varchar(255)}
     */
    public void setFlg5_IsNotNull() { regFlg5(CK_ISNN, DOBJ); }

    protected void regFlg5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg5(), "FLG5"); }
    protected abstract ConditionValue xgetCValueFlg5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_Equal(String flg6) {
        doSetFlg6_Equal(fRES(flg6));
    }

    protected void doSetFlg6_Equal(String flg6) {
        regFlg6(CK_EQ, flg6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_NotEqual(String flg6) {
        doSetFlg6_NotEqual(fRES(flg6));
    }

    protected void doSetFlg6_NotEqual(String flg6) {
        regFlg6(CK_NES, flg6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_GreaterThan(String flg6) {
        regFlg6(CK_GT, fRES(flg6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_LessThan(String flg6) {
        regFlg6(CK_LT, fRES(flg6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_GreaterEqual(String flg6) {
        regFlg6(CK_GE, fRES(flg6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_LessEqual(String flg6) {
        regFlg6(CK_LE, fRES(flg6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6List The collection of flg6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_InScope(Collection<String> flg6List) {
        doSetFlg6_InScope(flg6List);
    }

    protected void doSetFlg6_InScope(Collection<String> flg6List) {
        regINS(CK_INS, cTL(flg6List), xgetCValueFlg6(), "FLG6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6List The collection of flg6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_NotInScope(Collection<String> flg6List) {
        doSetFlg6_NotInScope(flg6List);
    }

    protected void doSetFlg6_NotInScope(Collection<String> flg6List) {
        regINS(CK_NINS, cTL(flg6List), xgetCValueFlg6(), "FLG6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG6: {varchar(255)} <br>
     * <pre>e.g. setFlg6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg6 The value of flg6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg6_LikeSearch(String flg6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg6), xgetCValueFlg6(), "FLG6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg6_NotLikeSearch(String flg6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg6), xgetCValueFlg6(), "FLG6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG6: {varchar(255)}
     * @param flg6 The value of flg6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg6_PrefixSearch(String flg6) {
        setFlg6_LikeSearch(flg6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     */
    public void setFlg6_IsNull() { regFlg6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     */
    public void setFlg6_IsNullOrEmpty() { regFlg6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG6: {varchar(255)}
     */
    public void setFlg6_IsNotNull() { regFlg6(CK_ISNN, DOBJ); }

    protected void regFlg6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg6(), "FLG6"); }
    protected abstract ConditionValue xgetCValueFlg6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_Equal(String updCd) {
        doSetUpdCd_Equal(fRES(updCd));
    }

    protected void doSetUpdCd_Equal(String updCd) {
        regUpdCd(CK_EQ, updCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_NotEqual(String updCd) {
        doSetUpdCd_NotEqual(fRES(updCd));
    }

    protected void doSetUpdCd_NotEqual(String updCd) {
        regUpdCd(CK_NES, updCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_GreaterThan(String updCd) {
        regUpdCd(CK_GT, fRES(updCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_LessThan(String updCd) {
        regUpdCd(CK_LT, fRES(updCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_GreaterEqual(String updCd) {
        regUpdCd(CK_GE, fRES(updCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_LessEqual(String updCd) {
        regUpdCd(CK_LE, fRES(updCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCdList The collection of updCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_InScope(Collection<String> updCdList) {
        doSetUpdCd_InScope(updCdList);
    }

    protected void doSetUpdCd_InScope(Collection<String> updCdList) {
        regINS(CK_INS, cTL(updCdList), xgetCValueUpdCd(), "UPD_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCdList The collection of updCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_NotInScope(Collection<String> updCdList) {
        doSetUpdCd_NotInScope(updCdList);
    }

    protected void doSetUpdCd_NotInScope(Collection<String> updCdList) {
        regINS(CK_NINS, cTL(updCdList), xgetCValueUpdCd(), "UPD_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_CD: {varchar(255)} <br>
     * <pre>e.g. setUpdCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updCd The value of updCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdCd_LikeSearch(String updCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updCd), xgetCValueUpdCd(), "UPD_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdCd_NotLikeSearch(String updCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updCd), xgetCValueUpdCd(), "UPD_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_CD: {varchar(255)}
     * @param updCd The value of updCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdCd_PrefixSearch(String updCd) {
        setUpdCd_LikeSearch(updCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     */
    public void setUpdCd_IsNull() { regUpdCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     */
    public void setUpdCd_IsNullOrEmpty() { regUpdCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_CD: {varchar(255)}
     */
    public void setUpdCd_IsNotNull() { regUpdCd(CK_ISNN, DOBJ); }

    protected void regUpdCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdCd(), "UPD_CD"); }
    protected abstract ConditionValue xgetCValueUpdCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_Equal(String companyFlg) {
        doSetCompanyFlg_Equal(fRES(companyFlg));
    }

    protected void doSetCompanyFlg_Equal(String companyFlg) {
        regCompanyFlg(CK_EQ, companyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_NotEqual(String companyFlg) {
        doSetCompanyFlg_NotEqual(fRES(companyFlg));
    }

    protected void doSetCompanyFlg_NotEqual(String companyFlg) {
        regCompanyFlg(CK_NES, companyFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_GreaterThan(String companyFlg) {
        regCompanyFlg(CK_GT, fRES(companyFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_LessThan(String companyFlg) {
        regCompanyFlg(CK_LT, fRES(companyFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_GreaterEqual(String companyFlg) {
        regCompanyFlg(CK_GE, fRES(companyFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_LessEqual(String companyFlg) {
        regCompanyFlg(CK_LE, fRES(companyFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlgList The collection of companyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_InScope(Collection<String> companyFlgList) {
        doSetCompanyFlg_InScope(companyFlgList);
    }

    protected void doSetCompanyFlg_InScope(Collection<String> companyFlgList) {
        regINS(CK_INS, cTL(companyFlgList), xgetCValueCompanyFlg(), "COMPANY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlgList The collection of companyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_NotInScope(Collection<String> companyFlgList) {
        doSetCompanyFlg_NotInScope(companyFlgList);
    }

    protected void doSetCompanyFlg_NotInScope(Collection<String> companyFlgList) {
        regINS(CK_NINS, cTL(companyFlgList), xgetCValueCompanyFlg(), "COMPANY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]} <br>
     * <pre>e.g. setCompanyFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyFlg The value of companyFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyFlg_LikeSearch(String companyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyFlg), xgetCValueCompanyFlg(), "COMPANY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyFlg_NotLikeSearch(String companyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyFlg), xgetCValueCompanyFlg(), "COMPANY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @param companyFlg The value of companyFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyFlg_PrefixSearch(String companyFlg) {
        setCompanyFlg_LikeSearch(companyFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     */
    public void setCompanyFlg_IsNull() { regCompanyFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     */
    public void setCompanyFlg_IsNullOrEmpty() { regCompanyFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     */
    public void setCompanyFlg_IsNotNull() { regCompanyFlg(CK_ISNN, DOBJ); }

    protected void regCompanyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyFlg(), "COMPANY_FLG"); }
    protected abstract ConditionValue xgetCValueCompanyFlg();

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
    public HpSLCFunction<EZipCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EZipCB.class);
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
    public HpSLCFunction<EZipCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EZipCB.class);
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
    public HpSLCFunction<EZipCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EZipCB.class);
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
    public HpSLCFunction<EZipCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EZipCB.class);
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
    public HpSLCFunction<EZipCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EZipCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EZipCB&gt;() {
     *     public void query(EZipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EZipCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EZipCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EZipCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EZipCQ sq);

    protected EZipCB xcreateScalarConditionCB() {
        EZipCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EZipCB xcreateScalarConditionPartitionByCB() {
        EZipCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EZipCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EZipCB cb = new EZipCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ZIP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EZipCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EZipCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EZipCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EZipCB cb = new EZipCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ZIP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EZipCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EZipCB cb = new EZipCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EZipCQ sq);

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
    protected EZipCB newMyCB() {
        return new EZipCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EZipCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

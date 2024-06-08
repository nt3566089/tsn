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
 * The abstract condition-query of E_LOCATION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsELocationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsELocationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_LOCATION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

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
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_Equal(String locationNm) {
        doSetLocationNm_Equal(fRES(locationNm));
    }

    protected void doSetLocationNm_Equal(String locationNm) {
        regLocationNm(CK_EQ, locationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotEqual(String locationNm) {
        doSetLocationNm_NotEqual(fRES(locationNm));
    }

    protected void doSetLocationNm_NotEqual(String locationNm) {
        regLocationNm(CK_NES, locationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterThan(String locationNm) {
        regLocationNm(CK_GT, fRES(locationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessThan(String locationNm) {
        regLocationNm(CK_LT, fRES(locationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterEqual(String locationNm) {
        regLocationNm(CK_GE, fRES(locationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessEqual(String locationNm) {
        regLocationNm(CK_LE, fRES(locationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNmList The collection of locationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_InScope(Collection<String> locationNmList) {
        doSetLocationNm_InScope(locationNmList);
    }

    protected void doSetLocationNm_InScope(Collection<String> locationNmList) {
        regINS(CK_INS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNmList The collection of locationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotInScope(Collection<String> locationNmList) {
        doSetLocationNm_NotInScope(locationNmList);
    }

    protected void doSetLocationNm_NotInScope(Collection<String> locationNmList) {
        regINS(CK_NINS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)} <br>
     * <pre>e.g. setLocationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationNm The value of locationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationNm_LikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationNm_NotLikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_PrefixSearch(String locationNm) {
        setLocationNm_LikeSearch(locationNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNull() { regLocationNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNullOrEmpty() { regLocationNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNotNull() { regLocationNm(CK_ISNN, DOBJ); }

    protected void regLocationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationNm(), "LOCATION_NM"); }
    protected abstract ConditionValue xgetCValueLocationNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_Equal(String zoneCd) {
        doSetZoneCd_Equal(fRES(zoneCd));
    }

    protected void doSetZoneCd_Equal(String zoneCd) {
        regZoneCd(CK_EQ, zoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotEqual(String zoneCd) {
        doSetZoneCd_NotEqual(fRES(zoneCd));
    }

    protected void doSetZoneCd_NotEqual(String zoneCd) {
        regZoneCd(CK_NES, zoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterThan(String zoneCd) {
        regZoneCd(CK_GT, fRES(zoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessThan(String zoneCd) {
        regZoneCd(CK_LT, fRES(zoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterEqual(String zoneCd) {
        regZoneCd(CK_GE, fRES(zoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessEqual(String zoneCd) {
        regZoneCd(CK_LE, fRES(zoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCdList The collection of zoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_InScope(Collection<String> zoneCdList) {
        doSetZoneCd_InScope(zoneCdList);
    }

    protected void doSetZoneCd_InScope(Collection<String> zoneCdList) {
        regINS(CK_INS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCdList The collection of zoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotInScope(Collection<String> zoneCdList) {
        doSetZoneCd_NotInScope(zoneCdList);
    }

    protected void doSetZoneCd_NotInScope(Collection<String> zoneCdList) {
        regINS(CK_NINS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)} <br>
     * <pre>e.g. setZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zoneCd The value of zoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZoneCd_LikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZoneCd_NotLikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_PrefixSearch(String zoneCd) {
        setZoneCd_LikeSearch(zoneCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNull() { regZoneCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNullOrEmpty() { regZoneCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNotNull() { regZoneCd(CK_ISNN, DOBJ); }

    protected void regZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneCd(), "ZONE_CD"); }
    protected abstract ConditionValue xgetCValueZoneCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_Equal(String locationType) {
        doSetLocationType_Equal(fRES(locationType));
    }

    protected void doSetLocationType_Equal(String locationType) {
        regLocationType(CK_EQ, locationType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotEqual(String locationType) {
        doSetLocationType_NotEqual(fRES(locationType));
    }

    protected void doSetLocationType_NotEqual(String locationType) {
        regLocationType(CK_NES, locationType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterThan(String locationType) {
        regLocationType(CK_GT, fRES(locationType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessThan(String locationType) {
        regLocationType(CK_LT, fRES(locationType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterEqual(String locationType) {
        regLocationType(CK_GE, fRES(locationType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessEqual(String locationType) {
        regLocationType(CK_LE, fRES(locationType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_InScope(Collection<String> locationTypeList) {
        doSetLocationType_InScope(locationTypeList);
    }

    protected void doSetLocationType_InScope(Collection<String> locationTypeList) {
        regINS(CK_INS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotInScope(Collection<String> locationTypeList) {
        doSetLocationType_NotInScope(locationTypeList);
    }

    protected void doSetLocationType_NotInScope(Collection<String> locationTypeList) {
        regINS(CK_NINS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)} <br>
     * <pre>e.g. setLocationType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationType The value of locationType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationType_LikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationType_NotLikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_PrefixSearch(String locationType) {
        setLocationType_LikeSearch(locationType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNull() { regLocationType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNullOrEmpty() { regLocationType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNotNull() { regLocationType(CK_ISNN, DOBJ); }

    protected void regLocationType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationType(), "LOCATION_TYPE"); }
    protected abstract ConditionValue xgetCValueLocationType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_Equal(String pickingLocationFlg) {
        doSetPickingLocationFlg_Equal(fRES(pickingLocationFlg));
    }

    protected void doSetPickingLocationFlg_Equal(String pickingLocationFlg) {
        regPickingLocationFlg(CK_EQ, pickingLocationFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        doSetPickingLocationFlg_NotEqual(fRES(pickingLocationFlg));
    }

    protected void doSetPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_NES, pickingLocationFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_GreaterThan(String pickingLocationFlg) {
        regPickingLocationFlg(CK_GT, fRES(pickingLocationFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_LessThan(String pickingLocationFlg) {
        regPickingLocationFlg(CK_LT, fRES(pickingLocationFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_GreaterEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_GE, fRES(pickingLocationFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_LessEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_LE, fRES(pickingLocationFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_InScope(pickingLocationFlgList);
    }

    protected void doSetPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_INS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_NotInScope(pickingLocationFlgList);
    }

    protected void doSetPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_NINS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]} <br>
     * <pre>e.g. setPickingLocationFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingLocationFlg The value of pickingLocationFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingLocationFlg_LikeSearch(String pickingLocationFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingLocationFlg), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingLocationFlg_NotLikeSearch(String pickingLocationFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingLocationFlg), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @param pickingLocationFlg The value of pickingLocationFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_PrefixSearch(String pickingLocationFlg) {
        setPickingLocationFlg_LikeSearch(pickingLocationFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     */
    public void setPickingLocationFlg_IsNull() { regPickingLocationFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     */
    public void setPickingLocationFlg_IsNullOrEmpty() { regPickingLocationFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     */
    public void setPickingLocationFlg_IsNotNull() { regPickingLocationFlg(CK_ISNN, DOBJ); }

    protected void regPickingLocationFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG"); }
    protected abstract ConditionValue xgetCValuePickingLocationFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_Equal(String allocNgFlg) {
        doSetAllocNgFlg_Equal(fRES(allocNgFlg));
    }

    protected void doSetAllocNgFlg_Equal(String allocNgFlg) {
        regAllocNgFlg(CK_EQ, allocNgFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotEqual(String allocNgFlg) {
        doSetAllocNgFlg_NotEqual(fRES(allocNgFlg));
    }

    protected void doSetAllocNgFlg_NotEqual(String allocNgFlg) {
        regAllocNgFlg(CK_NES, allocNgFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_GreaterThan(String allocNgFlg) {
        regAllocNgFlg(CK_GT, fRES(allocNgFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_LessThan(String allocNgFlg) {
        regAllocNgFlg(CK_LT, fRES(allocNgFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_GreaterEqual(String allocNgFlg) {
        regAllocNgFlg(CK_GE, fRES(allocNgFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_LessEqual(String allocNgFlg) {
        regAllocNgFlg(CK_LE, fRES(allocNgFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlgList The collection of allocNgFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_InScope(allocNgFlgList);
    }

    protected void doSetAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        regINS(CK_INS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlgList The collection of allocNgFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_NotInScope(allocNgFlgList);
    }

    protected void doSetAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        regINS(CK_NINS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]} <br>
     * <pre>e.g. setAllocNgFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocNgFlg The value of allocNgFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocNgFlg_LikeSearch(String allocNgFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocNgFlg), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocNgFlg_NotLikeSearch(String allocNgFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocNgFlg), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @param allocNgFlg The value of allocNgFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_PrefixSearch(String allocNgFlg) {
        setAllocNgFlg_LikeSearch(allocNgFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     */
    public void setAllocNgFlg_IsNull() { regAllocNgFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     */
    public void setAllocNgFlg_IsNullOrEmpty() { regAllocNgFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     */
    public void setAllocNgFlg_IsNotNull() { regAllocNgFlg(CK_ISNN, DOBJ); }

    protected void regAllocNgFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNgFlg(), "ALLOC_NG_FLG"); }
    protected abstract ConditionValue xgetCValueAllocNgFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_Equal(String pickingOrder) {
        doSetPickingOrder_Equal(fRES(pickingOrder));
    }

    protected void doSetPickingOrder_Equal(String pickingOrder) {
        regPickingOrder(CK_EQ, pickingOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_NotEqual(String pickingOrder) {
        doSetPickingOrder_NotEqual(fRES(pickingOrder));
    }

    protected void doSetPickingOrder_NotEqual(String pickingOrder) {
        regPickingOrder(CK_NES, pickingOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterThan(String pickingOrder) {
        regPickingOrder(CK_GT, fRES(pickingOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_LessThan(String pickingOrder) {
        regPickingOrder(CK_LT, fRES(pickingOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterEqual(String pickingOrder) {
        regPickingOrder(CK_GE, fRES(pickingOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_LessEqual(String pickingOrder) {
        regPickingOrder(CK_LE, fRES(pickingOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrderList The collection of pickingOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_InScope(Collection<String> pickingOrderList) {
        doSetPickingOrder_InScope(pickingOrderList);
    }

    protected void doSetPickingOrder_InScope(Collection<String> pickingOrderList) {
        regINS(CK_INS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrderList The collection of pickingOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_NotInScope(Collection<String> pickingOrderList) {
        doSetPickingOrder_NotInScope(pickingOrderList);
    }

    protected void doSetPickingOrder_NotInScope(Collection<String> pickingOrderList) {
        regINS(CK_NINS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)} <br>
     * <pre>e.g. setPickingOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingOrder The value of pickingOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingOrder_LikeSearch(String pickingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingOrder), xgetCValuePickingOrder(), "PICKING_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingOrder_NotLikeSearch(String pickingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingOrder), xgetCValuePickingOrder(), "PICKING_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_PrefixSearch(String pickingOrder) {
        setPickingOrder_LikeSearch(pickingOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNull() { regPickingOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNullOrEmpty() { regPickingOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNotNull() { regPickingOrder(CK_ISNN, DOBJ); }

    protected void regPickingOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingOrder(), "PICKING_ORDER"); }
    protected abstract ConditionValue xgetCValuePickingOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_Equal(String allocOrder) {
        doSetAllocOrder_Equal(fRES(allocOrder));
    }

    protected void doSetAllocOrder_Equal(String allocOrder) {
        regAllocOrder(CK_EQ, allocOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotEqual(String allocOrder) {
        doSetAllocOrder_NotEqual(fRES(allocOrder));
    }

    protected void doSetAllocOrder_NotEqual(String allocOrder) {
        regAllocOrder(CK_NES, allocOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterThan(String allocOrder) {
        regAllocOrder(CK_GT, fRES(allocOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_LessThan(String allocOrder) {
        regAllocOrder(CK_LT, fRES(allocOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterEqual(String allocOrder) {
        regAllocOrder(CK_GE, fRES(allocOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_LessEqual(String allocOrder) {
        regAllocOrder(CK_LE, fRES(allocOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrderList The collection of allocOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_InScope(Collection<String> allocOrderList) {
        doSetAllocOrder_InScope(allocOrderList);
    }

    protected void doSetAllocOrder_InScope(Collection<String> allocOrderList) {
        regINS(CK_INS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrderList The collection of allocOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotInScope(Collection<String> allocOrderList) {
        doSetAllocOrder_NotInScope(allocOrderList);
    }

    protected void doSetAllocOrder_NotInScope(Collection<String> allocOrderList) {
        regINS(CK_NINS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)} <br>
     * <pre>e.g. setAllocOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocOrder The value of allocOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocOrder_LikeSearch(String allocOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocOrder), xgetCValueAllocOrder(), "ALLOC_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocOrder_NotLikeSearch(String allocOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocOrder), xgetCValueAllocOrder(), "ALLOC_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_PrefixSearch(String allocOrder) {
        setAllocOrder_LikeSearch(allocOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNull() { regAllocOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNullOrEmpty() { regAllocOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNotNull() { regAllocOrder(CK_ISNN, DOBJ); }

    protected void regAllocOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocOrder(), "ALLOC_ORDER"); }
    protected abstract ConditionValue xgetCValueAllocOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_Equal(String clientCd) {
        doSetClientCd_Equal(fRES(clientCd));
    }

    protected void doSetClientCd_Equal(String clientCd) {
        regClientCd(CK_EQ, clientCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotEqual(String clientCd) {
        doSetClientCd_NotEqual(fRES(clientCd));
    }

    protected void doSetClientCd_NotEqual(String clientCd) {
        regClientCd(CK_NES, clientCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterThan(String clientCd) {
        regClientCd(CK_GT, fRES(clientCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessThan(String clientCd) {
        regClientCd(CK_LT, fRES(clientCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterEqual(String clientCd) {
        regClientCd(CK_GE, fRES(clientCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessEqual(String clientCd) {
        regClientCd(CK_LE, fRES(clientCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCdList The collection of clientCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_InScope(Collection<String> clientCdList) {
        doSetClientCd_InScope(clientCdList);
    }

    protected void doSetClientCd_InScope(Collection<String> clientCdList) {
        regINS(CK_INS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCdList The collection of clientCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotInScope(Collection<String> clientCdList) {
        doSetClientCd_NotInScope(clientCdList);
    }

    protected void doSetClientCd_NotInScope(Collection<String> clientCdList) {
        regINS(CK_NINS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)} <br>
     * <pre>e.g. setClientCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientCd The value of clientCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientCd_LikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientCd_NotLikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_PrefixSearch(String clientCd) {
        setClientCd_LikeSearch(clientCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNull() { regClientCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNullOrEmpty() { regClientCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNotNull() { regClientCd(CK_ISNN, DOBJ); }

    protected void regClientCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCd(), "CLIENT_CD"); }
    protected abstract ConditionValue xgetCValueClientCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_Equal(String replenishProductCd) {
        doSetReplenishProductCd_Equal(fRES(replenishProductCd));
    }

    protected void doSetReplenishProductCd_Equal(String replenishProductCd) {
        regReplenishProductCd(CK_EQ, replenishProductCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_NotEqual(String replenishProductCd) {
        doSetReplenishProductCd_NotEqual(fRES(replenishProductCd));
    }

    protected void doSetReplenishProductCd_NotEqual(String replenishProductCd) {
        regReplenishProductCd(CK_NES, replenishProductCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_GreaterThan(String replenishProductCd) {
        regReplenishProductCd(CK_GT, fRES(replenishProductCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_LessThan(String replenishProductCd) {
        regReplenishProductCd(CK_LT, fRES(replenishProductCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_GreaterEqual(String replenishProductCd) {
        regReplenishProductCd(CK_GE, fRES(replenishProductCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_LessEqual(String replenishProductCd) {
        regReplenishProductCd(CK_LE, fRES(replenishProductCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCdList The collection of replenishProductCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_InScope(Collection<String> replenishProductCdList) {
        doSetReplenishProductCd_InScope(replenishProductCdList);
    }

    protected void doSetReplenishProductCd_InScope(Collection<String> replenishProductCdList) {
        regINS(CK_INS, cTL(replenishProductCdList), xgetCValueReplenishProductCd(), "REPLENISH_PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCdList The collection of replenishProductCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_NotInScope(Collection<String> replenishProductCdList) {
        doSetReplenishProductCd_NotInScope(replenishProductCdList);
    }

    protected void doSetReplenishProductCd_NotInScope(Collection<String> replenishProductCdList) {
        regINS(CK_NINS, cTL(replenishProductCdList), xgetCValueReplenishProductCd(), "REPLENISH_PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)} <br>
     * <pre>e.g. setReplenishProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishProductCd The value of replenishProductCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishProductCd_LikeSearch(String replenishProductCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishProductCd), xgetCValueReplenishProductCd(), "REPLENISH_PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishProductCd_NotLikeSearch(String replenishProductCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishProductCd), xgetCValueReplenishProductCd(), "REPLENISH_PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @param replenishProductCd The value of replenishProductCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductCd_PrefixSearch(String replenishProductCd) {
        setReplenishProductCd_LikeSearch(replenishProductCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     */
    public void setReplenishProductCd_IsNull() { regReplenishProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     */
    public void setReplenishProductCd_IsNullOrEmpty() { regReplenishProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     */
    public void setReplenishProductCd_IsNotNull() { regReplenishProductCd(CK_ISNN, DOBJ); }

    protected void regReplenishProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishProductCd(), "REPLENISH_PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueReplenishProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_Equal(String replenishStockTypeCd) {
        doSetReplenishStockTypeCd_Equal(fRES(replenishStockTypeCd));
    }

    protected void doSetReplenishStockTypeCd_Equal(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_EQ, replenishStockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_NotEqual(String replenishStockTypeCd) {
        doSetReplenishStockTypeCd_NotEqual(fRES(replenishStockTypeCd));
    }

    protected void doSetReplenishStockTypeCd_NotEqual(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_NES, replenishStockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_GreaterThan(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_GT, fRES(replenishStockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_LessThan(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_LT, fRES(replenishStockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_GreaterEqual(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_GE, fRES(replenishStockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_LessEqual(String replenishStockTypeCd) {
        regReplenishStockTypeCd(CK_LE, fRES(replenishStockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCdList The collection of replenishStockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_InScope(Collection<String> replenishStockTypeCdList) {
        doSetReplenishStockTypeCd_InScope(replenishStockTypeCdList);
    }

    protected void doSetReplenishStockTypeCd_InScope(Collection<String> replenishStockTypeCdList) {
        regINS(CK_INS, cTL(replenishStockTypeCdList), xgetCValueReplenishStockTypeCd(), "REPLENISH_STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCdList The collection of replenishStockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_NotInScope(Collection<String> replenishStockTypeCdList) {
        doSetReplenishStockTypeCd_NotInScope(replenishStockTypeCdList);
    }

    protected void doSetReplenishStockTypeCd_NotInScope(Collection<String> replenishStockTypeCdList) {
        regINS(CK_NINS, cTL(replenishStockTypeCdList), xgetCValueReplenishStockTypeCd(), "REPLENISH_STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)} <br>
     * <pre>e.g. setReplenishStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishStockTypeCd The value of replenishStockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishStockTypeCd_LikeSearch(String replenishStockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishStockTypeCd), xgetCValueReplenishStockTypeCd(), "REPLENISH_STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishStockTypeCd_NotLikeSearch(String replenishStockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishStockTypeCd), xgetCValueReplenishStockTypeCd(), "REPLENISH_STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @param replenishStockTypeCd The value of replenishStockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeCd_PrefixSearch(String replenishStockTypeCd) {
        setReplenishStockTypeCd_LikeSearch(replenishStockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setReplenishStockTypeCd_IsNull() { regReplenishStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setReplenishStockTypeCd_IsNullOrEmpty() { regReplenishStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setReplenishStockTypeCd_IsNotNull() { regReplenishStockTypeCd(CK_ISNN, DOBJ); }

    protected void regReplenishStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishStockTypeCd(), "REPLENISH_STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueReplenishStockTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_Equal(String replenishDepositCd) {
        doSetReplenishDepositCd_Equal(fRES(replenishDepositCd));
    }

    protected void doSetReplenishDepositCd_Equal(String replenishDepositCd) {
        regReplenishDepositCd(CK_EQ, replenishDepositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_NotEqual(String replenishDepositCd) {
        doSetReplenishDepositCd_NotEqual(fRES(replenishDepositCd));
    }

    protected void doSetReplenishDepositCd_NotEqual(String replenishDepositCd) {
        regReplenishDepositCd(CK_NES, replenishDepositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_GreaterThan(String replenishDepositCd) {
        regReplenishDepositCd(CK_GT, fRES(replenishDepositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_LessThan(String replenishDepositCd) {
        regReplenishDepositCd(CK_LT, fRES(replenishDepositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_GreaterEqual(String replenishDepositCd) {
        regReplenishDepositCd(CK_GE, fRES(replenishDepositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_LessEqual(String replenishDepositCd) {
        regReplenishDepositCd(CK_LE, fRES(replenishDepositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCdList The collection of replenishDepositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_InScope(Collection<String> replenishDepositCdList) {
        doSetReplenishDepositCd_InScope(replenishDepositCdList);
    }

    protected void doSetReplenishDepositCd_InScope(Collection<String> replenishDepositCdList) {
        regINS(CK_INS, cTL(replenishDepositCdList), xgetCValueReplenishDepositCd(), "REPLENISH_DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCdList The collection of replenishDepositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_NotInScope(Collection<String> replenishDepositCdList) {
        doSetReplenishDepositCd_NotInScope(replenishDepositCdList);
    }

    protected void doSetReplenishDepositCd_NotInScope(Collection<String> replenishDepositCdList) {
        regINS(CK_NINS, cTL(replenishDepositCdList), xgetCValueReplenishDepositCd(), "REPLENISH_DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)} <br>
     * <pre>e.g. setReplenishDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishDepositCd The value of replenishDepositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishDepositCd_LikeSearch(String replenishDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishDepositCd), xgetCValueReplenishDepositCd(), "REPLENISH_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishDepositCd_NotLikeSearch(String replenishDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishDepositCd), xgetCValueReplenishDepositCd(), "REPLENISH_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @param replenishDepositCd The value of replenishDepositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositCd_PrefixSearch(String replenishDepositCd) {
        setReplenishDepositCd_LikeSearch(replenishDepositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     */
    public void setReplenishDepositCd_IsNull() { regReplenishDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     */
    public void setReplenishDepositCd_IsNullOrEmpty() { regReplenishDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     */
    public void setReplenishDepositCd_IsNotNull() { regReplenishDepositCd(CK_ISNN, DOBJ); }

    protected void regReplenishDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishDepositCd(), "REPLENISH_DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValueReplenishDepositCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_Equal(String replenishPNum) {
        doSetReplenishPNum_Equal(fRES(replenishPNum));
    }

    protected void doSetReplenishPNum_Equal(String replenishPNum) {
        regReplenishPNum(CK_EQ, replenishPNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotEqual(String replenishPNum) {
        doSetReplenishPNum_NotEqual(fRES(replenishPNum));
    }

    protected void doSetReplenishPNum_NotEqual(String replenishPNum) {
        regReplenishPNum(CK_NES, replenishPNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterThan(String replenishPNum) {
        regReplenishPNum(CK_GT, fRES(replenishPNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessThan(String replenishPNum) {
        regReplenishPNum(CK_LT, fRES(replenishPNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterEqual(String replenishPNum) {
        regReplenishPNum(CK_GE, fRES(replenishPNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessEqual(String replenishPNum) {
        regReplenishPNum(CK_LE, fRES(replenishPNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNumList The collection of replenishPNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_InScope(Collection<String> replenishPNumList) {
        doSetReplenishPNum_InScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_InScope(Collection<String> replenishPNumList) {
        regINS(CK_INS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNumList The collection of replenishPNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotInScope(Collection<String> replenishPNumList) {
        doSetReplenishPNum_NotInScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_NotInScope(Collection<String> replenishPNumList) {
        regINS(CK_NINS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)} <br>
     * <pre>e.g. setReplenishPNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishPNum The value of replenishPNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishPNum_LikeSearch(String replenishPNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishPNum), xgetCValueReplenishPNum(), "REPLENISH_P_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishPNum_NotLikeSearch(String replenishPNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishPNum), xgetCValueReplenishPNum(), "REPLENISH_P_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @param replenishPNum The value of replenishPNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_PrefixSearch(String replenishPNum) {
        setReplenishPNum_LikeSearch(replenishPNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     */
    public void setReplenishPNum_IsNull() { regReplenishPNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     */
    public void setReplenishPNum_IsNullOrEmpty() { regReplenishPNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     */
    public void setReplenishPNum_IsNotNull() { regReplenishPNum(CK_ISNN, DOBJ); }

    protected void regReplenishPNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPNum(), "REPLENISH_P_NUM"); }
    protected abstract ConditionValue xgetCValueReplenishPNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_Equal(String replenishPProductShapeCd) {
        doSetReplenishPProductShapeCd_Equal(fRES(replenishPProductShapeCd));
    }

    protected void doSetReplenishPProductShapeCd_Equal(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_EQ, replenishPProductShapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_NotEqual(String replenishPProductShapeCd) {
        doSetReplenishPProductShapeCd_NotEqual(fRES(replenishPProductShapeCd));
    }

    protected void doSetReplenishPProductShapeCd_NotEqual(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_NES, replenishPProductShapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_GreaterThan(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_GT, fRES(replenishPProductShapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_LessThan(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_LT, fRES(replenishPProductShapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_GreaterEqual(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_GE, fRES(replenishPProductShapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_LessEqual(String replenishPProductShapeCd) {
        regReplenishPProductShapeCd(CK_LE, fRES(replenishPProductShapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCdList The collection of replenishPProductShapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_InScope(Collection<String> replenishPProductShapeCdList) {
        doSetReplenishPProductShapeCd_InScope(replenishPProductShapeCdList);
    }

    protected void doSetReplenishPProductShapeCd_InScope(Collection<String> replenishPProductShapeCdList) {
        regINS(CK_INS, cTL(replenishPProductShapeCdList), xgetCValueReplenishPProductShapeCd(), "REPLENISH_P_PRODUCT_SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCdList The collection of replenishPProductShapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_NotInScope(Collection<String> replenishPProductShapeCdList) {
        doSetReplenishPProductShapeCd_NotInScope(replenishPProductShapeCdList);
    }

    protected void doSetReplenishPProductShapeCd_NotInScope(Collection<String> replenishPProductShapeCdList) {
        regINS(CK_NINS, cTL(replenishPProductShapeCdList), xgetCValueReplenishPProductShapeCd(), "REPLENISH_P_PRODUCT_SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * <pre>e.g. setReplenishPProductShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishPProductShapeCd_LikeSearch(String replenishPProductShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishPProductShapeCd), xgetCValueReplenishPProductShapeCd(), "REPLENISH_P_PRODUCT_SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishPProductShapeCd_NotLikeSearch(String replenishPProductShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishPProductShapeCd), xgetCValueReplenishPProductShapeCd(), "REPLENISH_P_PRODUCT_SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param replenishPProductShapeCd The value of replenishPProductShapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeCd_PrefixSearch(String replenishPProductShapeCd) {
        setReplenishPProductShapeCd_LikeSearch(replenishPProductShapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setReplenishPProductShapeCd_IsNull() { regReplenishPProductShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setReplenishPProductShapeCd_IsNullOrEmpty() { regReplenishPProductShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setReplenishPProductShapeCd_IsNotNull() { regReplenishPProductShapeCd(CK_ISNN, DOBJ); }

    protected void regReplenishPProductShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPProductShapeCd(), "REPLENISH_P_PRODUCT_SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueReplenishPProductShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_Equal(String maxStoreNum) {
        doSetMaxStoreNum_Equal(fRES(maxStoreNum));
    }

    protected void doSetMaxStoreNum_Equal(String maxStoreNum) {
        regMaxStoreNum(CK_EQ, maxStoreNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotEqual(String maxStoreNum) {
        doSetMaxStoreNum_NotEqual(fRES(maxStoreNum));
    }

    protected void doSetMaxStoreNum_NotEqual(String maxStoreNum) {
        regMaxStoreNum(CK_NES, maxStoreNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterThan(String maxStoreNum) {
        regMaxStoreNum(CK_GT, fRES(maxStoreNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessThan(String maxStoreNum) {
        regMaxStoreNum(CK_LT, fRES(maxStoreNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterEqual(String maxStoreNum) {
        regMaxStoreNum(CK_GE, fRES(maxStoreNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessEqual(String maxStoreNum) {
        regMaxStoreNum(CK_LE, fRES(maxStoreNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNumList The collection of maxStoreNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_InScope(Collection<String> maxStoreNumList) {
        doSetMaxStoreNum_InScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_InScope(Collection<String> maxStoreNumList) {
        regINS(CK_INS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNumList The collection of maxStoreNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotInScope(Collection<String> maxStoreNumList) {
        doSetMaxStoreNum_NotInScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_NotInScope(Collection<String> maxStoreNumList) {
        regINS(CK_NINS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)} <br>
     * <pre>e.g. setMaxStoreNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param maxStoreNum The value of maxStoreNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMaxStoreNum_LikeSearch(String maxStoreNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(maxStoreNum), xgetCValueMaxStoreNum(), "MAX_STORE_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMaxStoreNum_NotLikeSearch(String maxStoreNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(maxStoreNum), xgetCValueMaxStoreNum(), "MAX_STORE_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_PrefixSearch(String maxStoreNum) {
        setMaxStoreNum_LikeSearch(maxStoreNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNull() { regMaxStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNullOrEmpty() { regMaxStoreNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNotNull() { regMaxStoreNum(CK_ISNN, DOBJ); }

    protected void regMaxStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreNum(), "MAX_STORE_NUM"); }
    protected abstract ConditionValue xgetCValueMaxStoreNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_Equal(String maxStoreProductShapeCd) {
        doSetMaxStoreProductShapeCd_Equal(fRES(maxStoreProductShapeCd));
    }

    protected void doSetMaxStoreProductShapeCd_Equal(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_EQ, maxStoreProductShapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_NotEqual(String maxStoreProductShapeCd) {
        doSetMaxStoreProductShapeCd_NotEqual(fRES(maxStoreProductShapeCd));
    }

    protected void doSetMaxStoreProductShapeCd_NotEqual(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_NES, maxStoreProductShapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_GreaterThan(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_GT, fRES(maxStoreProductShapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_LessThan(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_LT, fRES(maxStoreProductShapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_GreaterEqual(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_GE, fRES(maxStoreProductShapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_LessEqual(String maxStoreProductShapeCd) {
        regMaxStoreProductShapeCd(CK_LE, fRES(maxStoreProductShapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCdList The collection of maxStoreProductShapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_InScope(Collection<String> maxStoreProductShapeCdList) {
        doSetMaxStoreProductShapeCd_InScope(maxStoreProductShapeCdList);
    }

    protected void doSetMaxStoreProductShapeCd_InScope(Collection<String> maxStoreProductShapeCdList) {
        regINS(CK_INS, cTL(maxStoreProductShapeCdList), xgetCValueMaxStoreProductShapeCd(), "MAX_STORE_PRODUCT_SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCdList The collection of maxStoreProductShapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_NotInScope(Collection<String> maxStoreProductShapeCdList) {
        doSetMaxStoreProductShapeCd_NotInScope(maxStoreProductShapeCdList);
    }

    protected void doSetMaxStoreProductShapeCd_NotInScope(Collection<String> maxStoreProductShapeCdList) {
        regINS(CK_NINS, cTL(maxStoreProductShapeCdList), xgetCValueMaxStoreProductShapeCd(), "MAX_STORE_PRODUCT_SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)} <br>
     * <pre>e.g. setMaxStoreProductShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMaxStoreProductShapeCd_LikeSearch(String maxStoreProductShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(maxStoreProductShapeCd), xgetCValueMaxStoreProductShapeCd(), "MAX_STORE_PRODUCT_SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMaxStoreProductShapeCd_NotLikeSearch(String maxStoreProductShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(maxStoreProductShapeCd), xgetCValueMaxStoreProductShapeCd(), "MAX_STORE_PRODUCT_SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @param maxStoreProductShapeCd The value of maxStoreProductShapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeCd_PrefixSearch(String maxStoreProductShapeCd) {
        setMaxStoreProductShapeCd_LikeSearch(maxStoreProductShapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreProductShapeCd_IsNull() { regMaxStoreProductShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreProductShapeCd_IsNullOrEmpty() { regMaxStoreProductShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreProductShapeCd_IsNotNull() { regMaxStoreProductShapeCd(CK_ISNN, DOBJ); }

    protected void regMaxStoreProductShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreProductShapeCd(), "MAX_STORE_PRODUCT_SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueMaxStoreProductShapeCd();

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
    public HpSLCFunction<ELocationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ELocationCB.class);
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
    public HpSLCFunction<ELocationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ELocationCB.class);
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
    public HpSLCFunction<ELocationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ELocationCB.class);
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
    public HpSLCFunction<ELocationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ELocationCB.class);
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
    public HpSLCFunction<ELocationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ELocationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ELocationCB&gt;() {
     *     public void query(ELocationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ELocationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ELocationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ELocationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ELocationCQ sq);

    protected ELocationCB xcreateScalarConditionCB() {
        ELocationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ELocationCB xcreateScalarConditionPartitionByCB() {
        ELocationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ELocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ELocationCB cb = new ELocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOCATION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ELocationCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ELocationCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ELocationCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ELocationCB cb = new ELocationCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOCATION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ELocationCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ELocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ELocationCB cb = new ELocationCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ELocationCQ sq);

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
    protected ELocationCB newMyCB() {
        return new ELocationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ELocationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of E_BONDED_WMS_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEBondedWmsReceivePlanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEBondedWmsReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_BONDED_WMS_RECEIVE_PLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_Equal(Long bondedWmsReceivePlanId) {
        doSetBondedWmsReceivePlanId_Equal(bondedWmsReceivePlanId);
    }

    protected void doSetBondedWmsReceivePlanId_Equal(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_EQ, bondedWmsReceivePlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_NotEqual(Long bondedWmsReceivePlanId) {
        doSetBondedWmsReceivePlanId_NotEqual(bondedWmsReceivePlanId);
    }

    protected void doSetBondedWmsReceivePlanId_NotEqual(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_NES, bondedWmsReceivePlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_GreaterThan(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_GT, bondedWmsReceivePlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_LessThan(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_LT, bondedWmsReceivePlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_GreaterEqual(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_GE, bondedWmsReceivePlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanId The value of bondedWmsReceivePlanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_LessEqual(Long bondedWmsReceivePlanId) {
        regBondedWmsReceivePlanId(CK_LE, bondedWmsReceivePlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of bondedWmsReceivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bondedWmsReceivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBondedWmsReceivePlanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBondedWmsReceivePlanId(), "BONDED_WMS_RECEIVE_PLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanIdList The collection of bondedWmsReceivePlanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_InScope(Collection<Long> bondedWmsReceivePlanIdList) {
        doSetBondedWmsReceivePlanId_InScope(bondedWmsReceivePlanIdList);
    }

    protected void doSetBondedWmsReceivePlanId_InScope(Collection<Long> bondedWmsReceivePlanIdList) {
        regINS(CK_INS, cTL(bondedWmsReceivePlanIdList), xgetCValueBondedWmsReceivePlanId(), "BONDED_WMS_RECEIVE_PLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedWmsReceivePlanIdList The collection of bondedWmsReceivePlanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBondedWmsReceivePlanId_NotInScope(Collection<Long> bondedWmsReceivePlanIdList) {
        doSetBondedWmsReceivePlanId_NotInScope(bondedWmsReceivePlanIdList);
    }

    protected void doSetBondedWmsReceivePlanId_NotInScope(Collection<Long> bondedWmsReceivePlanIdList) {
        regINS(CK_NINS, cTL(bondedWmsReceivePlanIdList), xgetCValueBondedWmsReceivePlanId(), "BONDED_WMS_RECEIVE_PLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBondedWmsReceivePlanId_IsNull() { regBondedWmsReceivePlanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBondedWmsReceivePlanId_IsNotNull() { regBondedWmsReceivePlanId(CK_ISNN, DOBJ); }

    protected void regBondedWmsReceivePlanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBondedWmsReceivePlanId(), "BONDED_WMS_RECEIVE_PLAN_ID"); }
    protected abstract ConditionValue xgetCValueBondedWmsReceivePlanId();

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
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_Equal(String sbwarehousecd) {
        doSetSbwarehousecd_Equal(fRES(sbwarehousecd));
    }

    protected void doSetSbwarehousecd_Equal(String sbwarehousecd) {
        regSbwarehousecd(CK_EQ, sbwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_NotEqual(String sbwarehousecd) {
        doSetSbwarehousecd_NotEqual(fRES(sbwarehousecd));
    }

    protected void doSetSbwarehousecd_NotEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_NES, sbwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_GreaterThan(String sbwarehousecd) {
        regSbwarehousecd(CK_GT, fRES(sbwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_LessThan(String sbwarehousecd) {
        regSbwarehousecd(CK_LT, fRES(sbwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_GreaterEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_GE, fRES(sbwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_LessEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_LE, fRES(sbwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecdList The collection of sbwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_InScope(Collection<String> sbwarehousecdList) {
        doSetSbwarehousecd_InScope(sbwarehousecdList);
    }

    protected void doSetSbwarehousecd_InScope(Collection<String> sbwarehousecdList) {
        regINS(CK_INS, cTL(sbwarehousecdList), xgetCValueSbwarehousecd(), "SBWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecdList The collection of sbwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_NotInScope(Collection<String> sbwarehousecdList) {
        doSetSbwarehousecd_NotInScope(sbwarehousecdList);
    }

    protected void doSetSbwarehousecd_NotInScope(Collection<String> sbwarehousecdList) {
        regINS(CK_NINS, cTL(sbwarehousecdList), xgetCValueSbwarehousecd(), "SBWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setSbwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sbwarehousecd The value of sbwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSbwarehousecd_LikeSearch(String sbwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sbwarehousecd), xgetCValueSbwarehousecd(), "SBWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSbwarehousecd_NotLikeSearch(String sbwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sbwarehousecd), xgetCValueSbwarehousecd(), "SBWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_PrefixSearch(String sbwarehousecd) {
        setSbwarehousecd_LikeSearch(sbwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNull() { regSbwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNullOrEmpty() { regSbwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNotNull() { regSbwarehousecd(CK_ISNN, DOBJ); }

    protected void regSbwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSbwarehousecd(), "SBWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueSbwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_Equal(String rcvschdate) {
        doSetRcvschdate_Equal(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_Equal(String rcvschdate) {
        regRcvschdate(CK_EQ, rcvschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotEqual(String rcvschdate) {
        doSetRcvschdate_NotEqual(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_NotEqual(String rcvschdate) {
        regRcvschdate(CK_NES, rcvschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterThan(String rcvschdate) {
        regRcvschdate(CK_GT, fRES(rcvschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessThan(String rcvschdate) {
        regRcvschdate(CK_LT, fRES(rcvschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterEqual(String rcvschdate) {
        regRcvschdate(CK_GE, fRES(rcvschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessEqual(String rcvschdate) {
        regRcvschdate(CK_LE, fRES(rcvschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdateList The collection of rcvschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_InScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_InScope(rcvschdateList);
    }

    protected void doSetRcvschdate_InScope(Collection<String> rcvschdateList) {
        regINS(CK_INS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdateList The collection of rcvschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_NotInScope(rcvschdateList);
    }

    protected void doSetRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        regINS(CK_NINS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(255)} <br>
     * <pre>e.g. setRcvschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvschdate The value of rcvschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvschdate_LikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvschdate_NotLikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     * @param rcvschdate The value of rcvschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_PrefixSearch(String rcvschdate) {
        setRcvschdate_LikeSearch(rcvschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     */
    public void setRcvschdate_IsNull() { regRcvschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     */
    public void setRcvschdate_IsNullOrEmpty() { regRcvschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(255)}
     */
    public void setRcvschdate_IsNotNull() { regRcvschdate(CK_ISNN, DOBJ); }

    protected void regRcvschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvschdate(), "RCVSCHDATE"); }
    protected abstract ConditionValue xgetCValueRcvschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

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
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_Equal(String otherrefno1) {
        doSetOtherrefno1_Equal(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_Equal(String otherrefno1) {
        regOtherrefno1(CK_EQ, otherrefno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotEqual(String otherrefno1) {
        doSetOtherrefno1_NotEqual(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_NotEqual(String otherrefno1) {
        regOtherrefno1(CK_NES, otherrefno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterThan(String otherrefno1) {
        regOtherrefno1(CK_GT, fRES(otherrefno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessThan(String otherrefno1) {
        regOtherrefno1(CK_LT, fRES(otherrefno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterEqual(String otherrefno1) {
        regOtherrefno1(CK_GE, fRES(otherrefno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessEqual(String otherrefno1) {
        regOtherrefno1(CK_LE, fRES(otherrefno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1List The collection of otherrefno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_InScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_InScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_InScope(Collection<String> otherrefno1List) {
        regINS(CK_INS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1List The collection of otherrefno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_NotInScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        regINS(CK_NINS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)} <br>
     * <pre>e.g. setOtherrefno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno1 The value of otherrefno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno1_LikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno1_NotLikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_PrefixSearch(String otherrefno1) {
        setOtherrefno1_LikeSearch(otherrefno1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNull() { regOtherrefno1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNullOrEmpty() { regOtherrefno1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNotNull() { regOtherrefno1(CK_ISNN, DOBJ); }

    protected void regOtherrefno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno1(), "OTHERREFNO1"); }
    protected abstract ConditionValue xgetCValueOtherrefno1();

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
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(String expectqty1) {
        doSetExpectqty1_Equal(fRES(expectqty1));
    }

    protected void doSetExpectqty1_Equal(String expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(String expectqty1) {
        doSetExpectqty1_NotEqual(fRES(expectqty1));
    }

    protected void doSetExpectqty1_NotEqual(String expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(String expectqty1) {
        regExpectqty1(CK_GT, fRES(expectqty1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(String expectqty1) {
        regExpectqty1(CK_LT, fRES(expectqty1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(String expectqty1) {
        regExpectqty1(CK_GE, fRES(expectqty1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(String expectqty1) {
        regExpectqty1(CK_LE, fRES(expectqty1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<String> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<String> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<String> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<String> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)} <br>
     * <pre>e.g. setExpectqty1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param expectqty1 The value of expectqty1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpectqty1_LikeSearch(String expectqty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expectqty1), xgetCValueExpectqty1(), "EXPECTQTY1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpectqty1_NotLikeSearch(String expectqty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expectqty1), xgetCValueExpectqty1(), "EXPECTQTY1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_PrefixSearch(String expectqty1) {
        setExpectqty1_LikeSearch(expectqty1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNull() { regExpectqty1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNullOrEmpty() { regExpectqty1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNotNull() { regExpectqty1(CK_ISNN, DOBJ); }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_Equal(String fromfax) {
        doSetFromfax_Equal(fRES(fromfax));
    }

    protected void doSetFromfax_Equal(String fromfax) {
        regFromfax(CK_EQ, fromfax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotEqual(String fromfax) {
        doSetFromfax_NotEqual(fRES(fromfax));
    }

    protected void doSetFromfax_NotEqual(String fromfax) {
        regFromfax(CK_NES, fromfax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterThan(String fromfax) {
        regFromfax(CK_GT, fRES(fromfax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessThan(String fromfax) {
        regFromfax(CK_LT, fRES(fromfax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterEqual(String fromfax) {
        regFromfax(CK_GE, fRES(fromfax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessEqual(String fromfax) {
        regFromfax(CK_LE, fRES(fromfax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfaxList The collection of fromfax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_InScope(Collection<String> fromfaxList) {
        doSetFromfax_InScope(fromfaxList);
    }

    protected void doSetFromfax_InScope(Collection<String> fromfaxList) {
        regINS(CK_INS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfaxList The collection of fromfax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotInScope(Collection<String> fromfaxList) {
        doSetFromfax_NotInScope(fromfaxList);
    }

    protected void doSetFromfax_NotInScope(Collection<String> fromfaxList) {
        regINS(CK_NINS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)} <br>
     * <pre>e.g. setFromfax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromfax The value of fromfax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromfax_LikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromfax_NotLikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_PrefixSearch(String fromfax) {
        setFromfax_LikeSearch(fromfax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNull() { regFromfax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNullOrEmpty() { regFromfax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNotNull() { regFromfax(CK_ISNN, DOBJ); }

    protected void regFromfax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromfax(), "FROMFAX"); }
    protected abstract ConditionValue xgetCValueFromfax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
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
     * BATJMFYM: {varchar(255)}
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
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterThan(String batjmfym) {
        regBatjmfym(CK_GT, fRES(batjmfym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessThan(String batjmfym) {
        regBatjmfym(CK_LT, fRES(batjmfym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterEqual(String batjmfym) {
        regBatjmfym(CK_GE, fRES(batjmfym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessEqual(String batjmfym) {
        regBatjmfym(CK_LE, fRES(batjmfym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(255)}
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
     * BATJMFYM: {varchar(255)}
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
     * BATJMFYM: {varchar(255)} <br>
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
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatjmfym_NotLikeSearch(String batjmfym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batjmfym), xgetCValueBatjmfym(), "BATJMFYM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMFYM: {varchar(255)}
     * @param batjmfym The value of batjmfym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_PrefixSearch(String batjmfym) {
        setBatjmfym_LikeSearch(batjmfym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     */
    public void setBatjmfym_IsNull() { regBatjmfym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     */
    public void setBatjmfym_IsNullOrEmpty() { regBatjmfym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATJMFYM: {varchar(255)}
     */
    public void setBatjmfym_IsNotNull() { regBatjmfym(CK_ISNN, DOBJ); }

    protected void regBatjmfym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatjmfym(), "BATJMFYM"); }
    protected abstract ConditionValue xgetCValueBatjmfym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_Equal(String carriersname) {
        doSetCarriersname_Equal(fRES(carriersname));
    }

    protected void doSetCarriersname_Equal(String carriersname) {
        regCarriersname(CK_EQ, carriersname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotEqual(String carriersname) {
        doSetCarriersname_NotEqual(fRES(carriersname));
    }

    protected void doSetCarriersname_NotEqual(String carriersname) {
        regCarriersname(CK_NES, carriersname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterThan(String carriersname) {
        regCarriersname(CK_GT, fRES(carriersname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessThan(String carriersname) {
        regCarriersname(CK_LT, fRES(carriersname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterEqual(String carriersname) {
        regCarriersname(CK_GE, fRES(carriersname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessEqual(String carriersname) {
        regCarriersname(CK_LE, fRES(carriersname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersnameList The collection of carriersname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_InScope(Collection<String> carriersnameList) {
        doSetCarriersname_InScope(carriersnameList);
    }

    protected void doSetCarriersname_InScope(Collection<String> carriersnameList) {
        regINS(CK_INS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersnameList The collection of carriersname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotInScope(Collection<String> carriersnameList) {
        doSetCarriersname_NotInScope(carriersnameList);
    }

    protected void doSetCarriersname_NotInScope(Collection<String> carriersnameList) {
        regINS(CK_NINS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)} <br>
     * <pre>e.g. setCarriersname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriersname The value of carriersname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriersname_LikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriersname_NotLikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_PrefixSearch(String carriersname) {
        setCarriersname_LikeSearch(carriersname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNull() { regCarriersname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNullOrEmpty() { regCarriersname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNotNull() { regCarriersname(CK_ISNN, DOBJ); }

    protected void regCarriersname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriersname(), "CARRIERSNAME"); }
    protected abstract ConditionValue xgetCValueCarriersname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_Equal(String carrierwbno) {
        doSetCarrierwbno_Equal(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_Equal(String carrierwbno) {
        regCarrierwbno(CK_EQ, carrierwbno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotEqual(String carrierwbno) {
        doSetCarrierwbno_NotEqual(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_NotEqual(String carrierwbno) {
        regCarrierwbno(CK_NES, carrierwbno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterThan(String carrierwbno) {
        regCarrierwbno(CK_GT, fRES(carrierwbno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessThan(String carrierwbno) {
        regCarrierwbno(CK_LT, fRES(carrierwbno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterEqual(String carrierwbno) {
        regCarrierwbno(CK_GE, fRES(carrierwbno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessEqual(String carrierwbno) {
        regCarrierwbno(CK_LE, fRES(carrierwbno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbnoList The collection of carrierwbno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_InScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        regINS(CK_INS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbnoList The collection of carrierwbno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_NotInScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        regINS(CK_NINS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)} <br>
     * <pre>e.g. setCarrierwbno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierwbno The value of carrierwbno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierwbno_LikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierwbno_NotLikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_PrefixSearch(String carrierwbno) {
        setCarrierwbno_LikeSearch(carrierwbno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNull() { regCarrierwbno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNullOrEmpty() { regCarrierwbno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNotNull() { regCarrierwbno(CK_ISNN, DOBJ); }

    protected void regCarrierwbno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierwbno(), "CARRIERWBNO"); }
    protected abstract ConditionValue xgetCValueCarrierwbno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(String foreigncargoflg) {
        doSetForeigncargoflg_Equal(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_Equal(String foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(String foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_NotEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(String foreigncargoflg) {
        regForeigncargoflg(CK_GT, fRES(foreigncargoflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(String foreigncargoflg) {
        regForeigncargoflg(CK_LT, fRES(foreigncargoflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_GE, fRES(foreigncargoflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_LE, fRES(foreigncargoflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)} <br>
     * <pre>e.g. setForeigncargoflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foreigncargoflg The value of foreigncargoflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForeigncargoflg_LikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForeigncargoflg_NotLikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_PrefixSearch(String foreigncargoflg) {
        setForeigncargoflg_LikeSearch(foreigncargoflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNull() { regForeigncargoflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNullOrEmpty() { regForeigncargoflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNotNull() { regForeigncargoflg(CK_ISNN, DOBJ); }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_Equal(String blNo) {
        doSetBlNo_Equal(fRES(blNo));
    }

    protected void doSetBlNo_Equal(String blNo) {
        regBlNo(CK_EQ, blNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_NotEqual(String blNo) {
        doSetBlNo_NotEqual(fRES(blNo));
    }

    protected void doSetBlNo_NotEqual(String blNo) {
        regBlNo(CK_NES, blNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_GreaterThan(String blNo) {
        regBlNo(CK_GT, fRES(blNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_LessThan(String blNo) {
        regBlNo(CK_LT, fRES(blNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_GreaterEqual(String blNo) {
        regBlNo(CK_GE, fRES(blNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_LessEqual(String blNo) {
        regBlNo(CK_LE, fRES(blNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNoList The collection of blNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_InScope(Collection<String> blNoList) {
        doSetBlNo_InScope(blNoList);
    }

    protected void doSetBlNo_InScope(Collection<String> blNoList) {
        regINS(CK_INS, cTL(blNoList), xgetCValueBlNo(), "BL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNoList The collection of blNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_NotInScope(Collection<String> blNoList) {
        doSetBlNo_NotInScope(blNoList);
    }

    protected void doSetBlNo_NotInScope(Collection<String> blNoList) {
        regINS(CK_NINS, cTL(blNoList), xgetCValueBlNo(), "BL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)} <br>
     * <pre>e.g. setBlNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blNo The value of blNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlNo_LikeSearch(String blNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blNo), xgetCValueBlNo(), "BL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlNo_NotLikeSearch(String blNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blNo), xgetCValueBlNo(), "BL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_PrefixSearch(String blNo) {
        setBlNo_LikeSearch(blNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNull() { regBlNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNullOrEmpty() { regBlNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNotNull() { regBlNo(CK_ISNN, DOBJ); }

    protected void regBlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlNo(), "BL_NO"); }
    protected abstract ConditionValue xgetCValueBlNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_Equal(String carriername) {
        doSetCarriername_Equal(fRES(carriername));
    }

    protected void doSetCarriername_Equal(String carriername) {
        regCarriername(CK_EQ, carriername);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotEqual(String carriername) {
        doSetCarriername_NotEqual(fRES(carriername));
    }

    protected void doSetCarriername_NotEqual(String carriername) {
        regCarriername(CK_NES, carriername);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterThan(String carriername) {
        regCarriername(CK_GT, fRES(carriername));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessThan(String carriername) {
        regCarriername(CK_LT, fRES(carriername));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterEqual(String carriername) {
        regCarriername(CK_GE, fRES(carriername));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessEqual(String carriername) {
        regCarriername(CK_LE, fRES(carriername));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_InScope(Collection<String> carriernameList) {
        doSetCarriername_InScope(carriernameList);
    }

    protected void doSetCarriername_InScope(Collection<String> carriernameList) {
        regINS(CK_INS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotInScope(Collection<String> carriernameList) {
        doSetCarriername_NotInScope(carriernameList);
    }

    protected void doSetCarriername_NotInScope(Collection<String> carriernameList) {
        regINS(CK_NINS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)} <br>
     * <pre>e.g. setCarriername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriername The value of carriername as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriername_LikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriername_NotLikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_PrefixSearch(String carriername) {
        setCarriername_LikeSearch(carriername, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNull() { regCarriername(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNullOrEmpty() { regCarriername(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNotNull() { regCarriername(CK_ISNN, DOBJ); }

    protected void regCarriername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriername(), "CARRIERNAME"); }
    protected abstract ConditionValue xgetCValueCarriername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_Equal(String fromemail) {
        doSetFromemail_Equal(fRES(fromemail));
    }

    protected void doSetFromemail_Equal(String fromemail) {
        regFromemail(CK_EQ, fromemail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_NotEqual(String fromemail) {
        doSetFromemail_NotEqual(fRES(fromemail));
    }

    protected void doSetFromemail_NotEqual(String fromemail) {
        regFromemail(CK_NES, fromemail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_GreaterThan(String fromemail) {
        regFromemail(CK_GT, fRES(fromemail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_LessThan(String fromemail) {
        regFromemail(CK_LT, fRES(fromemail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_GreaterEqual(String fromemail) {
        regFromemail(CK_GE, fRES(fromemail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_LessEqual(String fromemail) {
        regFromemail(CK_LE, fRES(fromemail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemailList The collection of fromemail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_InScope(Collection<String> fromemailList) {
        doSetFromemail_InScope(fromemailList);
    }

    protected void doSetFromemail_InScope(Collection<String> fromemailList) {
        regINS(CK_INS, cTL(fromemailList), xgetCValueFromemail(), "FROMEMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemailList The collection of fromemail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_NotInScope(Collection<String> fromemailList) {
        doSetFromemail_NotInScope(fromemailList);
    }

    protected void doSetFromemail_NotInScope(Collection<String> fromemailList) {
        regINS(CK_NINS, cTL(fromemailList), xgetCValueFromemail(), "FROMEMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)} <br>
     * <pre>e.g. setFromemail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromemail The value of fromemail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromemail_LikeSearch(String fromemail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromemail), xgetCValueFromemail(), "FROMEMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromemail_NotLikeSearch(String fromemail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromemail), xgetCValueFromemail(), "FROMEMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_PrefixSearch(String fromemail) {
        setFromemail_LikeSearch(fromemail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNull() { regFromemail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNullOrEmpty() { regFromemail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNotNull() { regFromemail(CK_ISNN, DOBJ); }

    protected void regFromemail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromemail(), "FROMEMAIL"); }
    protected abstract ConditionValue xgetCValueFromemail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_Equal(String arrivalportdate) {
        doSetArrivalportdate_Equal(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_Equal(String arrivalportdate) {
        regArrivalportdate(CK_EQ, arrivalportdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotEqual(String arrivalportdate) {
        doSetArrivalportdate_NotEqual(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_NotEqual(String arrivalportdate) {
        regArrivalportdate(CK_NES, arrivalportdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterThan(String arrivalportdate) {
        regArrivalportdate(CK_GT, fRES(arrivalportdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessThan(String arrivalportdate) {
        regArrivalportdate(CK_LT, fRES(arrivalportdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterEqual(String arrivalportdate) {
        regArrivalportdate(CK_GE, fRES(arrivalportdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessEqual(String arrivalportdate) {
        regArrivalportdate(CK_LE, fRES(arrivalportdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdateList The collection of arrivalportdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_InScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        regINS(CK_INS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdateList The collection of arrivalportdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_NotInScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        regINS(CK_NINS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)} <br>
     * <pre>e.g. setArrivalportdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalportdate The value of arrivalportdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalportdate_LikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalportdate_NotLikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     * @param arrivalportdate The value of arrivalportdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_PrefixSearch(String arrivalportdate) {
        setArrivalportdate_LikeSearch(arrivalportdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     */
    public void setArrivalportdate_IsNull() { regArrivalportdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     */
    public void setArrivalportdate_IsNullOrEmpty() { regArrivalportdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(255)}
     */
    public void setArrivalportdate_IsNotNull() { regArrivalportdate(CK_ISNN, DOBJ); }

    protected void regArrivalportdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalportdate(), "ARRIVALPORTDATE"); }
    protected abstract ConditionValue xgetCValueArrivalportdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_Equal(String shipname) {
        doSetShipname_Equal(fRES(shipname));
    }

    protected void doSetShipname_Equal(String shipname) {
        regShipname(CK_EQ, shipname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotEqual(String shipname) {
        doSetShipname_NotEqual(fRES(shipname));
    }

    protected void doSetShipname_NotEqual(String shipname) {
        regShipname(CK_NES, shipname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterThan(String shipname) {
        regShipname(CK_GT, fRES(shipname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessThan(String shipname) {
        regShipname(CK_LT, fRES(shipname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterEqual(String shipname) {
        regShipname(CK_GE, fRES(shipname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessEqual(String shipname) {
        regShipname(CK_LE, fRES(shipname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipnameList The collection of shipname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_InScope(Collection<String> shipnameList) {
        doSetShipname_InScope(shipnameList);
    }

    protected void doSetShipname_InScope(Collection<String> shipnameList) {
        regINS(CK_INS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipnameList The collection of shipname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotInScope(Collection<String> shipnameList) {
        doSetShipname_NotInScope(shipnameList);
    }

    protected void doSetShipname_NotInScope(Collection<String> shipnameList) {
        regINS(CK_NINS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(255)} <br>
     * <pre>e.g. setShipname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipname The value of shipname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipname_LikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipname_NotLikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(255)}
     * @param shipname The value of shipname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_PrefixSearch(String shipname) {
        setShipname_LikeSearch(shipname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     */
    public void setShipname_IsNull() { regShipname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     */
    public void setShipname_IsNullOrEmpty() { regShipname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(255)}
     */
    public void setShipname_IsNotNull() { regShipname(CK_ISNN, DOBJ); }

    protected void regShipname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipname(), "SHIPNAME"); }
    protected abstract ConditionValue xgetCValueShipname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_Equal(String batdelino) {
        doSetBatdelino_Equal(fRES(batdelino));
    }

    protected void doSetBatdelino_Equal(String batdelino) {
        regBatdelino(CK_EQ, batdelino);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_NotEqual(String batdelino) {
        doSetBatdelino_NotEqual(fRES(batdelino));
    }

    protected void doSetBatdelino_NotEqual(String batdelino) {
        regBatdelino(CK_NES, batdelino);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_GreaterThan(String batdelino) {
        regBatdelino(CK_GT, fRES(batdelino));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_LessThan(String batdelino) {
        regBatdelino(CK_LT, fRES(batdelino));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_GreaterEqual(String batdelino) {
        regBatdelino(CK_GE, fRES(batdelino));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_LessEqual(String batdelino) {
        regBatdelino(CK_LE, fRES(batdelino));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelinoList The collection of batdelino as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_InScope(Collection<String> batdelinoList) {
        doSetBatdelino_InScope(batdelinoList);
    }

    protected void doSetBatdelino_InScope(Collection<String> batdelinoList) {
        regINS(CK_INS, cTL(batdelinoList), xgetCValueBatdelino(), "BATDELINO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelinoList The collection of batdelino as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_NotInScope(Collection<String> batdelinoList) {
        doSetBatdelino_NotInScope(batdelinoList);
    }

    protected void doSetBatdelino_NotInScope(Collection<String> batdelinoList) {
        regINS(CK_NINS, cTL(batdelinoList), xgetCValueBatdelino(), "BATDELINO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(255)} <br>
     * <pre>e.g. setBatdelino_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batdelino The value of batdelino as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatdelino_LikeSearch(String batdelino, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batdelino), xgetCValueBatdelino(), "BATDELINO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatdelino_NotLikeSearch(String batdelino, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batdelino), xgetCValueBatdelino(), "BATDELINO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELINO: {varchar(255)}
     * @param batdelino The value of batdelino as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelino_PrefixSearch(String batdelino) {
        setBatdelino_LikeSearch(batdelino, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     */
    public void setBatdelino_IsNull() { regBatdelino(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     */
    public void setBatdelino_IsNullOrEmpty() { regBatdelino(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELINO: {varchar(255)}
     */
    public void setBatdelino_IsNotNull() { regBatdelino(CK_ISNN, DOBJ); }

    protected void regBatdelino(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelino(), "BATDELINO"); }
    protected abstract ConditionValue xgetCValueBatdelino();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_Equal(String batdelidetailno) {
        doSetBatdelidetailno_Equal(fRES(batdelidetailno));
    }

    protected void doSetBatdelidetailno_Equal(String batdelidetailno) {
        regBatdelidetailno(CK_EQ, batdelidetailno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_NotEqual(String batdelidetailno) {
        doSetBatdelidetailno_NotEqual(fRES(batdelidetailno));
    }

    protected void doSetBatdelidetailno_NotEqual(String batdelidetailno) {
        regBatdelidetailno(CK_NES, batdelidetailno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_GreaterThan(String batdelidetailno) {
        regBatdelidetailno(CK_GT, fRES(batdelidetailno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_LessThan(String batdelidetailno) {
        regBatdelidetailno(CK_LT, fRES(batdelidetailno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_GreaterEqual(String batdelidetailno) {
        regBatdelidetailno(CK_GE, fRES(batdelidetailno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_LessEqual(String batdelidetailno) {
        regBatdelidetailno(CK_LE, fRES(batdelidetailno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailnoList The collection of batdelidetailno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_InScope(Collection<String> batdelidetailnoList) {
        doSetBatdelidetailno_InScope(batdelidetailnoList);
    }

    protected void doSetBatdelidetailno_InScope(Collection<String> batdelidetailnoList) {
        regINS(CK_INS, cTL(batdelidetailnoList), xgetCValueBatdelidetailno(), "BATDELIDETAILNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailnoList The collection of batdelidetailno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_NotInScope(Collection<String> batdelidetailnoList) {
        doSetBatdelidetailno_NotInScope(batdelidetailnoList);
    }

    protected void doSetBatdelidetailno_NotInScope(Collection<String> batdelidetailnoList) {
        regINS(CK_NINS, cTL(batdelidetailnoList), xgetCValueBatdelidetailno(), "BATDELIDETAILNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)} <br>
     * <pre>e.g. setBatdelidetailno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batdelidetailno The value of batdelidetailno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatdelidetailno_LikeSearch(String batdelidetailno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batdelidetailno), xgetCValueBatdelidetailno(), "BATDELIDETAILNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatdelidetailno_NotLikeSearch(String batdelidetailno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batdelidetailno), xgetCValueBatdelidetailno(), "BATDELIDETAILNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     * @param batdelidetailno The value of batdelidetailno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailno_PrefixSearch(String batdelidetailno) {
        setBatdelidetailno_LikeSearch(batdelidetailno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     */
    public void setBatdelidetailno_IsNull() { regBatdelidetailno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     */
    public void setBatdelidetailno_IsNullOrEmpty() { regBatdelidetailno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNO: {varchar(255)}
     */
    public void setBatdelidetailno_IsNotNull() { regBatdelidetailno(CK_ISNN, DOBJ); }

    protected void regBatdelidetailno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelidetailno(), "BATDELIDETAILNO"); }
    protected abstract ConditionValue xgetCValueBatdelidetailno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_Equal(String batwarehousecd) {
        doSetBatwarehousecd_Equal(fRES(batwarehousecd));
    }

    protected void doSetBatwarehousecd_Equal(String batwarehousecd) {
        regBatwarehousecd(CK_EQ, batwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_NotEqual(String batwarehousecd) {
        doSetBatwarehousecd_NotEqual(fRES(batwarehousecd));
    }

    protected void doSetBatwarehousecd_NotEqual(String batwarehousecd) {
        regBatwarehousecd(CK_NES, batwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_GreaterThan(String batwarehousecd) {
        regBatwarehousecd(CK_GT, fRES(batwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_LessThan(String batwarehousecd) {
        regBatwarehousecd(CK_LT, fRES(batwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_GreaterEqual(String batwarehousecd) {
        regBatwarehousecd(CK_GE, fRES(batwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_LessEqual(String batwarehousecd) {
        regBatwarehousecd(CK_LE, fRES(batwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecdList The collection of batwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_InScope(Collection<String> batwarehousecdList) {
        doSetBatwarehousecd_InScope(batwarehousecdList);
    }

    protected void doSetBatwarehousecd_InScope(Collection<String> batwarehousecdList) {
        regINS(CK_INS, cTL(batwarehousecdList), xgetCValueBatwarehousecd(), "BATWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecdList The collection of batwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_NotInScope(Collection<String> batwarehousecdList) {
        doSetBatwarehousecd_NotInScope(batwarehousecdList);
    }

    protected void doSetBatwarehousecd_NotInScope(Collection<String> batwarehousecdList) {
        regINS(CK_NINS, cTL(batwarehousecdList), xgetCValueBatwarehousecd(), "BATWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setBatwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batwarehousecd The value of batwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatwarehousecd_LikeSearch(String batwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batwarehousecd), xgetCValueBatwarehousecd(), "BATWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatwarehousecd_NotLikeSearch(String batwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batwarehousecd), xgetCValueBatwarehousecd(), "BATWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     * @param batwarehousecd The value of batwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatwarehousecd_PrefixSearch(String batwarehousecd) {
        setBatwarehousecd_LikeSearch(batwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     */
    public void setBatwarehousecd_IsNull() { regBatwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     */
    public void setBatwarehousecd_IsNullOrEmpty() { regBatwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATWAREHOUSECD: {varchar(255)}
     */
    public void setBatwarehousecd_IsNotNull() { regBatwarehousecd(CK_ISNN, DOBJ); }

    protected void regBatwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatwarehousecd(), "BATWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueBatwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_Equal(String batkeepwarehousecd) {
        doSetBatkeepwarehousecd_Equal(fRES(batkeepwarehousecd));
    }

    protected void doSetBatkeepwarehousecd_Equal(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_EQ, batkeepwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_NotEqual(String batkeepwarehousecd) {
        doSetBatkeepwarehousecd_NotEqual(fRES(batkeepwarehousecd));
    }

    protected void doSetBatkeepwarehousecd_NotEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_NES, batkeepwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_GreaterThan(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_GT, fRES(batkeepwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_LessThan(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_LT, fRES(batkeepwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_GreaterEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_GE, fRES(batkeepwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_LessEqual(String batkeepwarehousecd) {
        regBatkeepwarehousecd(CK_LE, fRES(batkeepwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecdList The collection of batkeepwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_InScope(Collection<String> batkeepwarehousecdList) {
        doSetBatkeepwarehousecd_InScope(batkeepwarehousecdList);
    }

    protected void doSetBatkeepwarehousecd_InScope(Collection<String> batkeepwarehousecdList) {
        regINS(CK_INS, cTL(batkeepwarehousecdList), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecdList The collection of batkeepwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_NotInScope(Collection<String> batkeepwarehousecdList) {
        doSetBatkeepwarehousecd_NotInScope(batkeepwarehousecdList);
    }

    protected void doSetBatkeepwarehousecd_NotInScope(Collection<String> batkeepwarehousecdList) {
        regINS(CK_NINS, cTL(batkeepwarehousecdList), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setBatkeepwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batkeepwarehousecd The value of batkeepwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatkeepwarehousecd_LikeSearch(String batkeepwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batkeepwarehousecd), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatkeepwarehousecd_NotLikeSearch(String batkeepwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batkeepwarehousecd), xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @param batkeepwarehousecd The value of batkeepwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatkeepwarehousecd_PrefixSearch(String batkeepwarehousecd) {
        setBatkeepwarehousecd_LikeSearch(batkeepwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     */
    public void setBatkeepwarehousecd_IsNull() { regBatkeepwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     */
    public void setBatkeepwarehousecd_IsNullOrEmpty() { regBatkeepwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATKEEPWAREHOUSECD: {varchar(255)}
     */
    public void setBatkeepwarehousecd_IsNotNull() { regBatkeepwarehousecd(CK_ISNN, DOBJ); }

    protected void regBatkeepwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatkeepwarehousecd(), "BATKEEPWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueBatkeepwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_Equal(String batpartnernorcv) {
        doSetBatpartnernorcv_Equal(fRES(batpartnernorcv));
    }

    protected void doSetBatpartnernorcv_Equal(String batpartnernorcv) {
        regBatpartnernorcv(CK_EQ, batpartnernorcv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_NotEqual(String batpartnernorcv) {
        doSetBatpartnernorcv_NotEqual(fRES(batpartnernorcv));
    }

    protected void doSetBatpartnernorcv_NotEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_NES, batpartnernorcv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_GreaterThan(String batpartnernorcv) {
        regBatpartnernorcv(CK_GT, fRES(batpartnernorcv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_LessThan(String batpartnernorcv) {
        regBatpartnernorcv(CK_LT, fRES(batpartnernorcv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_GreaterEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_GE, fRES(batpartnernorcv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_LessEqual(String batpartnernorcv) {
        regBatpartnernorcv(CK_LE, fRES(batpartnernorcv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcvList The collection of batpartnernorcv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_InScope(Collection<String> batpartnernorcvList) {
        doSetBatpartnernorcv_InScope(batpartnernorcvList);
    }

    protected void doSetBatpartnernorcv_InScope(Collection<String> batpartnernorcvList) {
        regINS(CK_INS, cTL(batpartnernorcvList), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcvList The collection of batpartnernorcv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_NotInScope(Collection<String> batpartnernorcvList) {
        doSetBatpartnernorcv_NotInScope(batpartnernorcvList);
    }

    protected void doSetBatpartnernorcv_NotInScope(Collection<String> batpartnernorcvList) {
        regINS(CK_NINS, cTL(batpartnernorcvList), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)} <br>
     * <pre>e.g. setBatpartnernorcv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batpartnernorcv The value of batpartnernorcv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatpartnernorcv_LikeSearch(String batpartnernorcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batpartnernorcv), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatpartnernorcv_NotLikeSearch(String batpartnernorcv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batpartnernorcv), xgetCValueBatpartnernorcv(), "BATPARTNERNORCV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     * @param batpartnernorcv The value of batpartnernorcv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernorcv_PrefixSearch(String batpartnernorcv) {
        setBatpartnernorcv_LikeSearch(batpartnernorcv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     */
    public void setBatpartnernorcv_IsNull() { regBatpartnernorcv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     */
    public void setBatpartnernorcv_IsNullOrEmpty() { regBatpartnernorcv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNORCV: {varchar(255)}
     */
    public void setBatpartnernorcv_IsNotNull() { regBatpartnernorcv(CK_ISNN, DOBJ); }

    protected void regBatpartnernorcv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatpartnernorcv(), "BATPARTNERNORCV"); }
    protected abstract ConditionValue xgetCValueBatpartnernorcv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_Equal(String batpartnernosnd) {
        doSetBatpartnernosnd_Equal(fRES(batpartnernosnd));
    }

    protected void doSetBatpartnernosnd_Equal(String batpartnernosnd) {
        regBatpartnernosnd(CK_EQ, batpartnernosnd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_NotEqual(String batpartnernosnd) {
        doSetBatpartnernosnd_NotEqual(fRES(batpartnernosnd));
    }

    protected void doSetBatpartnernosnd_NotEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_NES, batpartnernosnd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_GreaterThan(String batpartnernosnd) {
        regBatpartnernosnd(CK_GT, fRES(batpartnernosnd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_LessThan(String batpartnernosnd) {
        regBatpartnernosnd(CK_LT, fRES(batpartnernosnd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_GreaterEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_GE, fRES(batpartnernosnd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_LessEqual(String batpartnernosnd) {
        regBatpartnernosnd(CK_LE, fRES(batpartnernosnd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosndList The collection of batpartnernosnd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_InScope(Collection<String> batpartnernosndList) {
        doSetBatpartnernosnd_InScope(batpartnernosndList);
    }

    protected void doSetBatpartnernosnd_InScope(Collection<String> batpartnernosndList) {
        regINS(CK_INS, cTL(batpartnernosndList), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosndList The collection of batpartnernosnd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_NotInScope(Collection<String> batpartnernosndList) {
        doSetBatpartnernosnd_NotInScope(batpartnernosndList);
    }

    protected void doSetBatpartnernosnd_NotInScope(Collection<String> batpartnernosndList) {
        regINS(CK_NINS, cTL(batpartnernosndList), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)} <br>
     * <pre>e.g. setBatpartnernosnd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batpartnernosnd The value of batpartnernosnd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatpartnernosnd_LikeSearch(String batpartnernosnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batpartnernosnd), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatpartnernosnd_NotLikeSearch(String batpartnernosnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batpartnernosnd), xgetCValueBatpartnernosnd(), "BATPARTNERNOSND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     * @param batpartnernosnd The value of batpartnernosnd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatpartnernosnd_PrefixSearch(String batpartnernosnd) {
        setBatpartnernosnd_LikeSearch(batpartnernosnd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     */
    public void setBatpartnernosnd_IsNull() { regBatpartnernosnd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     */
    public void setBatpartnernosnd_IsNullOrEmpty() { regBatpartnernosnd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATPARTNERNOSND: {varchar(255)}
     */
    public void setBatpartnernosnd_IsNotNull() { regBatpartnernosnd(CK_ISNN, DOBJ); }

    protected void regBatpartnernosnd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatpartnernosnd(), "BATPARTNERNOSND"); }
    protected abstract ConditionValue xgetCValueBatpartnernosnd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_Equal(String batdelidetailnum) {
        doSetBatdelidetailnum_Equal(fRES(batdelidetailnum));
    }

    protected void doSetBatdelidetailnum_Equal(String batdelidetailnum) {
        regBatdelidetailnum(CK_EQ, batdelidetailnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_NotEqual(String batdelidetailnum) {
        doSetBatdelidetailnum_NotEqual(fRES(batdelidetailnum));
    }

    protected void doSetBatdelidetailnum_NotEqual(String batdelidetailnum) {
        regBatdelidetailnum(CK_NES, batdelidetailnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_GreaterThan(String batdelidetailnum) {
        regBatdelidetailnum(CK_GT, fRES(batdelidetailnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_LessThan(String batdelidetailnum) {
        regBatdelidetailnum(CK_LT, fRES(batdelidetailnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_GreaterEqual(String batdelidetailnum) {
        regBatdelidetailnum(CK_GE, fRES(batdelidetailnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_LessEqual(String batdelidetailnum) {
        regBatdelidetailnum(CK_LE, fRES(batdelidetailnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnumList The collection of batdelidetailnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_InScope(Collection<String> batdelidetailnumList) {
        doSetBatdelidetailnum_InScope(batdelidetailnumList);
    }

    protected void doSetBatdelidetailnum_InScope(Collection<String> batdelidetailnumList) {
        regINS(CK_INS, cTL(batdelidetailnumList), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnumList The collection of batdelidetailnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_NotInScope(Collection<String> batdelidetailnumList) {
        doSetBatdelidetailnum_NotInScope(batdelidetailnumList);
    }

    protected void doSetBatdelidetailnum_NotInScope(Collection<String> batdelidetailnumList) {
        regINS(CK_NINS, cTL(batdelidetailnumList), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)} <br>
     * <pre>e.g. setBatdelidetailnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batdelidetailnum The value of batdelidetailnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatdelidetailnum_LikeSearch(String batdelidetailnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batdelidetailnum), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatdelidetailnum_NotLikeSearch(String batdelidetailnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batdelidetailnum), xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     * @param batdelidetailnum The value of batdelidetailnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatdelidetailnum_PrefixSearch(String batdelidetailnum) {
        setBatdelidetailnum_LikeSearch(batdelidetailnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     */
    public void setBatdelidetailnum_IsNull() { regBatdelidetailnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     */
    public void setBatdelidetailnum_IsNullOrEmpty() { regBatdelidetailnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATDELIDETAILNUM: {varchar(255)}
     */
    public void setBatdelidetailnum_IsNotNull() { regBatdelidetailnum(CK_ISNN, DOBJ); }

    protected void regBatdelidetailnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatdelidetailnum(), "BATDELIDETAILNUM"); }
    protected abstract ConditionValue xgetCValueBatdelidetailnum();

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
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EBondedWmsReceivePlanCB.class);
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
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EBondedWmsReceivePlanCB.class);
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
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EBondedWmsReceivePlanCB.class);
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
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EBondedWmsReceivePlanCB.class);
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
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EBondedWmsReceivePlanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EBondedWmsReceivePlanCB&gt;() {
     *     public void query(EBondedWmsReceivePlanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EBondedWmsReceivePlanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EBondedWmsReceivePlanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedWmsReceivePlanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EBondedWmsReceivePlanCQ sq);

    protected EBondedWmsReceivePlanCB xcreateScalarConditionCB() {
        EBondedWmsReceivePlanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EBondedWmsReceivePlanCB xcreateScalarConditionPartitionByCB() {
        EBondedWmsReceivePlanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EBondedWmsReceivePlanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedWmsReceivePlanCB cb = new EBondedWmsReceivePlanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BONDED_WMS_RECEIVE_PLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EBondedWmsReceivePlanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EBondedWmsReceivePlanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EBondedWmsReceivePlanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedWmsReceivePlanCB cb = new EBondedWmsReceivePlanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BONDED_WMS_RECEIVE_PLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EBondedWmsReceivePlanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EBondedWmsReceivePlanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EBondedWmsReceivePlanCB cb = new EBondedWmsReceivePlanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EBondedWmsReceivePlanCQ sq);

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
    protected EBondedWmsReceivePlanCB newMyCB() {
        return new EBondedWmsReceivePlanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EBondedWmsReceivePlanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

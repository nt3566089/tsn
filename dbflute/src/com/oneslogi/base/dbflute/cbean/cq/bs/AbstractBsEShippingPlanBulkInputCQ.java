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
 * The abstract condition-query of E_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShippingPlanBulkInputCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShippingPlanBulkInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHIPPING_PLAN_BULK_INPUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_Equal(Long bondedShippingPlanBulkInputId) {
        doSetBondedShippingPlanBulkInputId_Equal(bondedShippingPlanBulkInputId);
    }

    protected void doSetBondedShippingPlanBulkInputId_Equal(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_EQ, bondedShippingPlanBulkInputId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_NotEqual(Long bondedShippingPlanBulkInputId) {
        doSetBondedShippingPlanBulkInputId_NotEqual(bondedShippingPlanBulkInputId);
    }

    protected void doSetBondedShippingPlanBulkInputId_NotEqual(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_NES, bondedShippingPlanBulkInputId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_GreaterThan(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_GT, bondedShippingPlanBulkInputId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_LessThan(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_LT, bondedShippingPlanBulkInputId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_GreaterEqual(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_GE, bondedShippingPlanBulkInputId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputId The value of bondedShippingPlanBulkInputId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_LessEqual(Long bondedShippingPlanBulkInputId) {
        regBondedShippingPlanBulkInputId(CK_LE, bondedShippingPlanBulkInputId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of bondedShippingPlanBulkInputId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bondedShippingPlanBulkInputId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBondedShippingPlanBulkInputId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBondedShippingPlanBulkInputId(), "BONDED_SHIPPING_PLAN_BULK_INPUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputIdList The collection of bondedShippingPlanBulkInputId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_InScope(Collection<Long> bondedShippingPlanBulkInputIdList) {
        doSetBondedShippingPlanBulkInputId_InScope(bondedShippingPlanBulkInputIdList);
    }

    protected void doSetBondedShippingPlanBulkInputId_InScope(Collection<Long> bondedShippingPlanBulkInputIdList) {
        regINS(CK_INS, cTL(bondedShippingPlanBulkInputIdList), xgetCValueBondedShippingPlanBulkInputId(), "BONDED_SHIPPING_PLAN_BULK_INPUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param bondedShippingPlanBulkInputIdList The collection of bondedShippingPlanBulkInputId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBondedShippingPlanBulkInputId_NotInScope(Collection<Long> bondedShippingPlanBulkInputIdList) {
        doSetBondedShippingPlanBulkInputId_NotInScope(bondedShippingPlanBulkInputIdList);
    }

    protected void doSetBondedShippingPlanBulkInputId_NotInScope(Collection<Long> bondedShippingPlanBulkInputIdList) {
        regINS(CK_NINS, cTL(bondedShippingPlanBulkInputIdList), xgetCValueBondedShippingPlanBulkInputId(), "BONDED_SHIPPING_PLAN_BULK_INPUT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBondedShippingPlanBulkInputId_IsNull() { regBondedShippingPlanBulkInputId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBondedShippingPlanBulkInputId_IsNotNull() { regBondedShippingPlanBulkInputId(CK_ISNN, DOBJ); }

    protected void regBondedShippingPlanBulkInputId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBondedShippingPlanBulkInputId(), "BONDED_SHIPPING_PLAN_BULK_INPUT_ID"); }
    protected abstract ConditionValue xgetCValueBondedShippingPlanBulkInputId();

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
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_Equal(String hedderFlg) {
        doSetHedderFlg_Equal(fRES(hedderFlg));
    }

    protected void doSetHedderFlg_Equal(String hedderFlg) {
        regHedderFlg(CK_EQ, hedderFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_NotEqual(String hedderFlg) {
        doSetHedderFlg_NotEqual(fRES(hedderFlg));
    }

    protected void doSetHedderFlg_NotEqual(String hedderFlg) {
        regHedderFlg(CK_NES, hedderFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_GreaterThan(String hedderFlg) {
        regHedderFlg(CK_GT, fRES(hedderFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_LessThan(String hedderFlg) {
        regHedderFlg(CK_LT, fRES(hedderFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_GreaterEqual(String hedderFlg) {
        regHedderFlg(CK_GE, fRES(hedderFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_LessEqual(String hedderFlg) {
        regHedderFlg(CK_LE, fRES(hedderFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlgList The collection of hedderFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_InScope(Collection<String> hedderFlgList) {
        doSetHedderFlg_InScope(hedderFlgList);
    }

    protected void doSetHedderFlg_InScope(Collection<String> hedderFlgList) {
        regINS(CK_INS, cTL(hedderFlgList), xgetCValueHedderFlg(), "HEDDER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlgList The collection of hedderFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_NotInScope(Collection<String> hedderFlgList) {
        doSetHedderFlg_NotInScope(hedderFlgList);
    }

    protected void doSetHedderFlg_NotInScope(Collection<String> hedderFlgList) {
        regINS(CK_NINS, cTL(hedderFlgList), xgetCValueHedderFlg(), "HEDDER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)} <br>
     * <pre>e.g. setHedderFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hedderFlg The value of hedderFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHedderFlg_LikeSearch(String hedderFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hedderFlg), xgetCValueHedderFlg(), "HEDDER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHedderFlg_NotLikeSearch(String hedderFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hedderFlg), xgetCValueHedderFlg(), "HEDDER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEDDER_FLG: {NotNull, char(1)}
     * @param hedderFlg The value of hedderFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHedderFlg_PrefixSearch(String hedderFlg) {
        setHedderFlg_LikeSearch(hedderFlg, xcLSOPPre());
    }

    protected void regHedderFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHedderFlg(), "HEDDER_FLG"); }
    protected abstract ConditionValue xgetCValueHedderFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_Equal(String zzorgncd) {
        doSetZzorgncd_Equal(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_Equal(String zzorgncd) {
        regZzorgncd(CK_EQ, zzorgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotEqual(String zzorgncd) {
        doSetZzorgncd_NotEqual(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_NotEqual(String zzorgncd) {
        regZzorgncd(CK_NES, zzorgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncdList The collection of zzorgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_InScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_InScope(zzorgncdList);
    }

    protected void doSetZzorgncd_InScope(Collection<String> zzorgncdList) {
        regINS(CK_INS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncdList The collection of zzorgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_NotInScope(zzorgncdList);
    }

    protected void doSetZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        regINS(CK_NINS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(255)} <br>
     * <pre>e.g. setZzorgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgncd The value of zzorgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgncd_LikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     */
    public void setZzorgncd_IsNull() { regZzorgncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     */
    public void setZzorgncd_IsNullOrEmpty() { regZzorgncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(255)}
     */
    public void setZzorgncd_IsNotNull() { regZzorgncd(CK_ISNN, DOBJ); }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_Equal(String ordgr) {
        doSetOrdgr_Equal(fRES(ordgr));
    }

    protected void doSetOrdgr_Equal(String ordgr) {
        regOrdgr(CK_EQ, ordgr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotEqual(String ordgr) {
        doSetOrdgr_NotEqual(fRES(ordgr));
    }

    protected void doSetOrdgr_NotEqual(String ordgr) {
        regOrdgr(CK_NES, ordgr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterThan(String ordgr) {
        regOrdgr(CK_GT, fRES(ordgr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessThan(String ordgr) {
        regOrdgr(CK_LT, fRES(ordgr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterEqual(String ordgr) {
        regOrdgr(CK_GE, fRES(ordgr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessEqual(String ordgr) {
        regOrdgr(CK_LE, fRES(ordgr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgrList The collection of ordgr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_InScope(Collection<String> ordgrList) {
        doSetOrdgr_InScope(ordgrList);
    }

    protected void doSetOrdgr_InScope(Collection<String> ordgrList) {
        regINS(CK_INS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgrList The collection of ordgr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotInScope(Collection<String> ordgrList) {
        doSetOrdgr_NotInScope(ordgrList);
    }

    protected void doSetOrdgr_NotInScope(Collection<String> ordgrList) {
        regINS(CK_NINS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(255)} <br>
     * <pre>e.g. setOrdgr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordgr The value of ordgr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdgr_LikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdgr_NotLikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(255)}
     * @param ordgr The value of ordgr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_PrefixSearch(String ordgr) {
        setOrdgr_LikeSearch(ordgr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     */
    public void setOrdgr_IsNull() { regOrdgr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     */
    public void setOrdgr_IsNullOrEmpty() { regOrdgr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(255)}
     */
    public void setOrdgr_IsNotNull() { regOrdgr(CK_ISNN, DOBJ); }

    protected void regOrdgr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdgr(), "ORDGR"); }
    protected abstract ConditionValue xgetCValueOrdgr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_Equal(String rmano) {
        doSetRmano_Equal(fRES(rmano));
    }

    protected void doSetRmano_Equal(String rmano) {
        regRmano(CK_EQ, rmano);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotEqual(String rmano) {
        doSetRmano_NotEqual(fRES(rmano));
    }

    protected void doSetRmano_NotEqual(String rmano) {
        regRmano(CK_NES, rmano);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmanoList The collection of rmano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_InScope(Collection<String> rmanoList) {
        doSetRmano_InScope(rmanoList);
    }

    protected void doSetRmano_InScope(Collection<String> rmanoList) {
        regINS(CK_INS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmanoList The collection of rmano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotInScope(Collection<String> rmanoList) {
        doSetRmano_NotInScope(rmanoList);
    }

    protected void doSetRmano_NotInScope(Collection<String> rmanoList) {
        regINS(CK_NINS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(255)} <br>
     * <pre>e.g. setRmano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmano The value of rmano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmano_LikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(255)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     */
    public void setRmano_IsNull() { regRmano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     */
    public void setRmano_IsNullOrEmpty() { regRmano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(255)}
     */
    public void setRmano_IsNotNull() { regRmano(CK_ISNN, DOBJ); }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RMANO"); }
    protected abstract ConditionValue xgetCValueRmano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_Equal(String sscd) {
        doSetSscd_Equal(fRES(sscd));
    }

    protected void doSetSscd_Equal(String sscd) {
        regSscd(CK_EQ, sscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotEqual(String sscd) {
        doSetSscd_NotEqual(fRES(sscd));
    }

    protected void doSetSscd_NotEqual(String sscd) {
        regSscd(CK_NES, sscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterThan(String sscd) {
        regSscd(CK_GT, fRES(sscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessThan(String sscd) {
        regSscd(CK_LT, fRES(sscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterEqual(String sscd) {
        regSscd(CK_GE, fRES(sscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessEqual(String sscd) {
        regSscd(CK_LE, fRES(sscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscdList The collection of sscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_InScope(Collection<String> sscdList) {
        doSetSscd_InScope(sscdList);
    }

    protected void doSetSscd_InScope(Collection<String> sscdList) {
        regINS(CK_INS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscdList The collection of sscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotInScope(Collection<String> sscdList) {
        doSetSscd_NotInScope(sscdList);
    }

    protected void doSetSscd_NotInScope(Collection<String> sscdList) {
        regINS(CK_NINS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(255)} <br>
     * <pre>e.g. setSscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscd The value of sscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscd_LikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscd_NotLikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(255)}
     * @param sscd The value of sscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_PrefixSearch(String sscd) {
        setSscd_LikeSearch(sscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     */
    public void setSscd_IsNull() { regSscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     */
    public void setSscd_IsNullOrEmpty() { regSscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(255)}
     */
    public void setSscd_IsNotNull() { regSscd(CK_ISNN, DOBJ); }

    protected void regSscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscd(), "SSCD"); }
    protected abstract ConditionValue xgetCValueSscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_Equal(String slptyp) {
        doSetSlptyp_Equal(fRES(slptyp));
    }

    protected void doSetSlptyp_Equal(String slptyp) {
        regSlptyp(CK_EQ, slptyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotEqual(String slptyp) {
        doSetSlptyp_NotEqual(fRES(slptyp));
    }

    protected void doSetSlptyp_NotEqual(String slptyp) {
        regSlptyp(CK_NES, slptyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterThan(String slptyp) {
        regSlptyp(CK_GT, fRES(slptyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessThan(String slptyp) {
        regSlptyp(CK_LT, fRES(slptyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterEqual(String slptyp) {
        regSlptyp(CK_GE, fRES(slptyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessEqual(String slptyp) {
        regSlptyp(CK_LE, fRES(slptyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptypList The collection of slptyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_InScope(Collection<String> slptypList) {
        doSetSlptyp_InScope(slptypList);
    }

    protected void doSetSlptyp_InScope(Collection<String> slptypList) {
        regINS(CK_INS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptypList The collection of slptyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotInScope(Collection<String> slptypList) {
        doSetSlptyp_NotInScope(slptypList);
    }

    protected void doSetSlptyp_NotInScope(Collection<String> slptypList) {
        regINS(CK_NINS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(255)} <br>
     * <pre>e.g. setSlptyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slptyp The value of slptyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlptyp_LikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlptyp_NotLikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(255)}
     * @param slptyp The value of slptyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_PrefixSearch(String slptyp) {
        setSlptyp_LikeSearch(slptyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     */
    public void setSlptyp_IsNull() { regSlptyp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     */
    public void setSlptyp_IsNullOrEmpty() { regSlptyp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(255)}
     */
    public void setSlptyp_IsNotNull() { regSlptyp(CK_ISNN, DOBJ); }

    protected void regSlptyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlptyp(), "SLPTYP"); }
    protected abstract ConditionValue xgetCValueSlptyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_Equal(String slpno) {
        doSetSlpno_Equal(fRES(slpno));
    }

    protected void doSetSlpno_Equal(String slpno) {
        regSlpno(CK_EQ, slpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotEqual(String slpno) {
        doSetSlpno_NotEqual(fRES(slpno));
    }

    protected void doSetSlpno_NotEqual(String slpno) {
        regSlpno(CK_NES, slpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterThan(String slpno) {
        regSlpno(CK_GT, fRES(slpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessThan(String slpno) {
        regSlpno(CK_LT, fRES(slpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterEqual(String slpno) {
        regSlpno(CK_GE, fRES(slpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessEqual(String slpno) {
        regSlpno(CK_LE, fRES(slpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpnoList The collection of slpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_InScope(Collection<String> slpnoList) {
        doSetSlpno_InScope(slpnoList);
    }

    protected void doSetSlpno_InScope(Collection<String> slpnoList) {
        regINS(CK_INS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpnoList The collection of slpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotInScope(Collection<String> slpnoList) {
        doSetSlpno_NotInScope(slpnoList);
    }

    protected void doSetSlpno_NotInScope(Collection<String> slpnoList) {
        regINS(CK_NINS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(255)} <br>
     * <pre>e.g. setSlpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpno The value of slpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpno_LikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpno_NotLikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(255)}
     * @param slpno The value of slpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_PrefixSearch(String slpno) {
        setSlpno_LikeSearch(slpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     */
    public void setSlpno_IsNull() { regSlpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     */
    public void setSlpno_IsNullOrEmpty() { regSlpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(255)}
     */
    public void setSlpno_IsNotNull() { regSlpno(CK_ISNN, DOBJ); }

    protected void regSlpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpno(), "SLPNO"); }
    protected abstract ConditionValue xgetCValueSlpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_Equal(String seqno) {
        doSetSeqno_Equal(fRES(seqno));
    }

    protected void doSetSeqno_Equal(String seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(String seqno) {
        doSetSeqno_NotEqual(fRES(seqno));
    }

    protected void doSetSeqno_NotEqual(String seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(String seqno) {
        regSeqno(CK_GT, fRES(seqno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(String seqno) {
        regSeqno(CK_LT, fRES(seqno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(String seqno) {
        regSeqno(CK_GE, fRES(seqno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(String seqno) {
        regSeqno(CK_LE, fRES(seqno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<String> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<String> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<String> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<String> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)} <br>
     * <pre>e.g. setSeqno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param seqno The value of seqno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeqno_LikeSearch(String seqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seqno), xgetCValueSeqno(), "SEQNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeqno_NotLikeSearch(String seqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seqno), xgetCValueSeqno(), "SEQNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_PrefixSearch(String seqno) {
        setSeqno_LikeSearch(seqno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNullOrEmpty() { regSeqno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_Equal(String zzordymd) {
        doSetZzordymd_Equal(fRES(zzordymd));
    }

    protected void doSetZzordymd_Equal(String zzordymd) {
        regZzordymd(CK_EQ, zzordymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotEqual(String zzordymd) {
        doSetZzordymd_NotEqual(fRES(zzordymd));
    }

    protected void doSetZzordymd_NotEqual(String zzordymd) {
        regZzordymd(CK_NES, zzordymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterThan(String zzordymd) {
        regZzordymd(CK_GT, fRES(zzordymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessThan(String zzordymd) {
        regZzordymd(CK_LT, fRES(zzordymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterEqual(String zzordymd) {
        regZzordymd(CK_GE, fRES(zzordymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessEqual(String zzordymd) {
        regZzordymd(CK_LE, fRES(zzordymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymdList The collection of zzordymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_InScope(Collection<String> zzordymdList) {
        doSetZzordymd_InScope(zzordymdList);
    }

    protected void doSetZzordymd_InScope(Collection<String> zzordymdList) {
        regINS(CK_INS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymdList The collection of zzordymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotInScope(Collection<String> zzordymdList) {
        doSetZzordymd_NotInScope(zzordymdList);
    }

    protected void doSetZzordymd_NotInScope(Collection<String> zzordymdList) {
        regINS(CK_NINS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(255)} <br>
     * <pre>e.g. setZzordymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzordymd The value of zzordymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzordymd_LikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzordymd_NotLikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     * @param zzordymd The value of zzordymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_PrefixSearch(String zzordymd) {
        setZzordymd_LikeSearch(zzordymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     */
    public void setZzordymd_IsNull() { regZzordymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     */
    public void setZzordymd_IsNullOrEmpty() { regZzordymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(255)}
     */
    public void setZzordymd_IsNotNull() { regZzordymd(CK_ISNN, DOBJ); }

    protected void regZzordymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzordymd(), "ZZORDYMD"); }
    protected abstract ConditionValue xgetCValueZzordymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_Equal(String zzwaymd1) {
        doSetZzwaymd1_Equal(fRES(zzwaymd1));
    }

    protected void doSetZzwaymd1_Equal(String zzwaymd1) {
        regZzwaymd1(CK_EQ, zzwaymd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_NotEqual(String zzwaymd1) {
        doSetZzwaymd1_NotEqual(fRES(zzwaymd1));
    }

    protected void doSetZzwaymd1_NotEqual(String zzwaymd1) {
        regZzwaymd1(CK_NES, zzwaymd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_GreaterThan(String zzwaymd1) {
        regZzwaymd1(CK_GT, fRES(zzwaymd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_LessThan(String zzwaymd1) {
        regZzwaymd1(CK_LT, fRES(zzwaymd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_GreaterEqual(String zzwaymd1) {
        regZzwaymd1(CK_GE, fRES(zzwaymd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_LessEqual(String zzwaymd1) {
        regZzwaymd1(CK_LE, fRES(zzwaymd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1List The collection of zzwaymd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_InScope(Collection<String> zzwaymd1List) {
        doSetZzwaymd1_InScope(zzwaymd1List);
    }

    protected void doSetZzwaymd1_InScope(Collection<String> zzwaymd1List) {
        regINS(CK_INS, cTL(zzwaymd1List), xgetCValueZzwaymd1(), "ZZWAYMD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1List The collection of zzwaymd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_NotInScope(Collection<String> zzwaymd1List) {
        doSetZzwaymd1_NotInScope(zzwaymd1List);
    }

    protected void doSetZzwaymd1_NotInScope(Collection<String> zzwaymd1List) {
        regINS(CK_NINS, cTL(zzwaymd1List), xgetCValueZzwaymd1(), "ZZWAYMD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWAYMD1: {varchar(255)} <br>
     * <pre>e.g. setZzwaymd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzwaymd1 The value of zzwaymd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzwaymd1_LikeSearch(String zzwaymd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzwaymd1), xgetCValueZzwaymd1(), "ZZWAYMD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzwaymd1_NotLikeSearch(String zzwaymd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzwaymd1), xgetCValueZzwaymd1(), "ZZWAYMD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     * @param zzwaymd1 The value of zzwaymd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzwaymd1_PrefixSearch(String zzwaymd1) {
        setZzwaymd1_LikeSearch(zzwaymd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     */
    public void setZzwaymd1_IsNull() { regZzwaymd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     */
    public void setZzwaymd1_IsNullOrEmpty() { regZzwaymd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZWAYMD1: {varchar(255)}
     */
    public void setZzwaymd1_IsNotNull() { regZzwaymd1(CK_ISNN, DOBJ); }

    protected void regZzwaymd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzwaymd1(), "ZZWAYMD1"); }
    protected abstract ConditionValue xgetCValueZzwaymd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_Equal(String otorgcd) {
        doSetOtorgcd_Equal(fRES(otorgcd));
    }

    protected void doSetOtorgcd_Equal(String otorgcd) {
        regOtorgcd(CK_EQ, otorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotEqual(String otorgcd) {
        doSetOtorgcd_NotEqual(fRES(otorgcd));
    }

    protected void doSetOtorgcd_NotEqual(String otorgcd) {
        regOtorgcd(CK_NES, otorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterThan(String otorgcd) {
        regOtorgcd(CK_GT, fRES(otorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessThan(String otorgcd) {
        regOtorgcd(CK_LT, fRES(otorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterEqual(String otorgcd) {
        regOtorgcd(CK_GE, fRES(otorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessEqual(String otorgcd) {
        regOtorgcd(CK_LE, fRES(otorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcdList The collection of otorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_InScope(Collection<String> otorgcdList) {
        doSetOtorgcd_InScope(otorgcdList);
    }

    protected void doSetOtorgcd_InScope(Collection<String> otorgcdList) {
        regINS(CK_INS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcdList The collection of otorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotInScope(Collection<String> otorgcdList) {
        doSetOtorgcd_NotInScope(otorgcdList);
    }

    protected void doSetOtorgcd_NotInScope(Collection<String> otorgcdList) {
        regINS(CK_NINS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)} <br>
     * <pre>e.g. setOtorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otorgcd The value of otorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtorgcd_LikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtorgcd_NotLikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_PrefixSearch(String otorgcd) {
        setOtorgcd_LikeSearch(otorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNull() { regOtorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNullOrEmpty() { regOtorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNotNull() { regOtorgcd(CK_ISNN, DOBJ); }

    protected void regOtorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtorgcd(), "OTORGCD"); }
    protected abstract ConditionValue xgetCValueOtorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_Equal(String ordorgcd) {
        doSetOrdorgcd_Equal(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_Equal(String ordorgcd) {
        regOrdorgcd(CK_EQ, ordorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotEqual(String ordorgcd) {
        doSetOrdorgcd_NotEqual(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_NotEqual(String ordorgcd) {
        regOrdorgcd(CK_NES, ordorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterThan(String ordorgcd) {
        regOrdorgcd(CK_GT, fRES(ordorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessThan(String ordorgcd) {
        regOrdorgcd(CK_LT, fRES(ordorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterEqual(String ordorgcd) {
        regOrdorgcd(CK_GE, fRES(ordorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessEqual(String ordorgcd) {
        regOrdorgcd(CK_LE, fRES(ordorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcdList The collection of ordorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_InScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_InScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_InScope(Collection<String> ordorgcdList) {
        regINS(CK_INS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcdList The collection of ordorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_NotInScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        regINS(CK_NINS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)} <br>
     * <pre>e.g. setOrdorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordorgcd The value of ordorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdorgcd_LikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdorgcd_NotLikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_PrefixSearch(String ordorgcd) {
        setOrdorgcd_LikeSearch(ordorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNull() { regOrdorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNullOrEmpty() { regOrdorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNotNull() { regOrdorgcd(CK_ISNN, DOBJ); }

    protected void regOrdorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdorgcd(), "ORDORGCD"); }
    protected abstract ConditionValue xgetCValueOrdorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_Equal(String rlybscd) {
        doSetRlybscd_Equal(fRES(rlybscd));
    }

    protected void doSetRlybscd_Equal(String rlybscd) {
        regRlybscd(CK_EQ, rlybscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotEqual(String rlybscd) {
        doSetRlybscd_NotEqual(fRES(rlybscd));
    }

    protected void doSetRlybscd_NotEqual(String rlybscd) {
        regRlybscd(CK_NES, rlybscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterThan(String rlybscd) {
        regRlybscd(CK_GT, fRES(rlybscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessThan(String rlybscd) {
        regRlybscd(CK_LT, fRES(rlybscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterEqual(String rlybscd) {
        regRlybscd(CK_GE, fRES(rlybscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessEqual(String rlybscd) {
        regRlybscd(CK_LE, fRES(rlybscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscdList The collection of rlybscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_InScope(Collection<String> rlybscdList) {
        doSetRlybscd_InScope(rlybscdList);
    }

    protected void doSetRlybscd_InScope(Collection<String> rlybscdList) {
        regINS(CK_INS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscdList The collection of rlybscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotInScope(Collection<String> rlybscdList) {
        doSetRlybscd_NotInScope(rlybscdList);
    }

    protected void doSetRlybscd_NotInScope(Collection<String> rlybscdList) {
        regINS(CK_NINS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)} <br>
     * <pre>e.g. setRlybscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybscd The value of rlybscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybscd_LikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybscd_NotLikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_PrefixSearch(String rlybscd) {
        setRlybscd_LikeSearch(rlybscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNull() { regRlybscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNullOrEmpty() { regRlybscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNotNull() { regRlybscd(CK_ISNN, DOBJ); }

    protected void regRlybscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybscd(), "RLYBSCD"); }
    protected abstract ConditionValue xgetCValueRlybscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNull() { regPstnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNullOrEmpty() { regPstnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNotNull() { regPstnid(CK_ISNN, DOBJ); }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_Equal(String dlvrnk) {
        doSetDlvrnk_Equal(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_Equal(String dlvrnk) {
        regDlvrnk(CK_EQ, dlvrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotEqual(String dlvrnk) {
        doSetDlvrnk_NotEqual(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_NotEqual(String dlvrnk) {
        regDlvrnk(CK_NES, dlvrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterThan(String dlvrnk) {
        regDlvrnk(CK_GT, fRES(dlvrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessThan(String dlvrnk) {
        regDlvrnk(CK_LT, fRES(dlvrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterEqual(String dlvrnk) {
        regDlvrnk(CK_GE, fRES(dlvrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessEqual(String dlvrnk) {
        regDlvrnk(CK_LE, fRES(dlvrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnkList The collection of dlvrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_InScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_InScope(dlvrnkList);
    }

    protected void doSetDlvrnk_InScope(Collection<String> dlvrnkList) {
        regINS(CK_INS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnkList The collection of dlvrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_NotInScope(dlvrnkList);
    }

    protected void doSetDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        regINS(CK_NINS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(255)} <br>
     * <pre>e.g. setDlvrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvrnk The value of dlvrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvrnk_LikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvrnk_NotLikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(255)}
     * @param dlvrnk The value of dlvrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_PrefixSearch(String dlvrnk) {
        setDlvrnk_LikeSearch(dlvrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     */
    public void setDlvrnk_IsNull() { regDlvrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     */
    public void setDlvrnk_IsNullOrEmpty() { regDlvrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(255)}
     */
    public void setDlvrnk_IsNotNull() { regDlvrnk(CK_ISNN, DOBJ); }

    protected void regDlvrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvrnk(), "DLVRNK"); }
    protected abstract ConditionValue xgetCValueDlvrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_Equal(String lmpdlvno) {
        doSetLmpdlvno_Equal(fRES(lmpdlvno));
    }

    protected void doSetLmpdlvno_Equal(String lmpdlvno) {
        regLmpdlvno(CK_EQ, lmpdlvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_NotEqual(String lmpdlvno) {
        doSetLmpdlvno_NotEqual(fRES(lmpdlvno));
    }

    protected void doSetLmpdlvno_NotEqual(String lmpdlvno) {
        regLmpdlvno(CK_NES, lmpdlvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_GreaterThan(String lmpdlvno) {
        regLmpdlvno(CK_GT, fRES(lmpdlvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_LessThan(String lmpdlvno) {
        regLmpdlvno(CK_LT, fRES(lmpdlvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_GreaterEqual(String lmpdlvno) {
        regLmpdlvno(CK_GE, fRES(lmpdlvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_LessEqual(String lmpdlvno) {
        regLmpdlvno(CK_LE, fRES(lmpdlvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvnoList The collection of lmpdlvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_InScope(Collection<String> lmpdlvnoList) {
        doSetLmpdlvno_InScope(lmpdlvnoList);
    }

    protected void doSetLmpdlvno_InScope(Collection<String> lmpdlvnoList) {
        regINS(CK_INS, cTL(lmpdlvnoList), xgetCValueLmpdlvno(), "LMPDLVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvnoList The collection of lmpdlvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_NotInScope(Collection<String> lmpdlvnoList) {
        doSetLmpdlvno_NotInScope(lmpdlvnoList);
    }

    protected void doSetLmpdlvno_NotInScope(Collection<String> lmpdlvnoList) {
        regINS(CK_NINS, cTL(lmpdlvnoList), xgetCValueLmpdlvno(), "LMPDLVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(255)} <br>
     * <pre>e.g. setLmpdlvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lmpdlvno The value of lmpdlvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLmpdlvno_LikeSearch(String lmpdlvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lmpdlvno), xgetCValueLmpdlvno(), "LMPDLVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLmpdlvno_NotLikeSearch(String lmpdlvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lmpdlvno), xgetCValueLmpdlvno(), "LMPDLVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     * @param lmpdlvno The value of lmpdlvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_PrefixSearch(String lmpdlvno) {
        setLmpdlvno_LikeSearch(lmpdlvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     */
    public void setLmpdlvno_IsNull() { regLmpdlvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     */
    public void setLmpdlvno_IsNullOrEmpty() { regLmpdlvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(255)}
     */
    public void setLmpdlvno_IsNotNull() { regLmpdlvno(CK_ISNN, DOBJ); }

    protected void regLmpdlvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLmpdlvno(), "LMPDLVNO"); }
    protected abstract ConditionValue xgetCValueLmpdlvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_Equal(String divmtd) {
        doSetDivmtd_Equal(fRES(divmtd));
    }

    protected void doSetDivmtd_Equal(String divmtd) {
        regDivmtd(CK_EQ, divmtd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotEqual(String divmtd) {
        doSetDivmtd_NotEqual(fRES(divmtd));
    }

    protected void doSetDivmtd_NotEqual(String divmtd) {
        regDivmtd(CK_NES, divmtd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterThan(String divmtd) {
        regDivmtd(CK_GT, fRES(divmtd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessThan(String divmtd) {
        regDivmtd(CK_LT, fRES(divmtd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterEqual(String divmtd) {
        regDivmtd(CK_GE, fRES(divmtd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessEqual(String divmtd) {
        regDivmtd(CK_LE, fRES(divmtd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtdList The collection of divmtd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_InScope(Collection<String> divmtdList) {
        doSetDivmtd_InScope(divmtdList);
    }

    protected void doSetDivmtd_InScope(Collection<String> divmtdList) {
        regINS(CK_INS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtdList The collection of divmtd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotInScope(Collection<String> divmtdList) {
        doSetDivmtd_NotInScope(divmtdList);
    }

    protected void doSetDivmtd_NotInScope(Collection<String> divmtdList) {
        regINS(CK_NINS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)} <br>
     * <pre>e.g. setDivmtd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param divmtd The value of divmtd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDivmtd_LikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDivmtd_NotLikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_PrefixSearch(String divmtd) {
        setDivmtd_LikeSearch(divmtd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNull() { regDivmtd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNullOrEmpty() { regDivmtd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNotNull() { regDivmtd(CK_ISNN, DOBJ); }

    protected void regDivmtd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivmtd(), "DIVMTD"); }
    protected abstract ConditionValue xgetCValueDivmtd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_Equal(String hdvid) {
        doSetHdvid_Equal(fRES(hdvid));
    }

    protected void doSetHdvid_Equal(String hdvid) {
        regHdvid(CK_EQ, hdvid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_NotEqual(String hdvid) {
        doSetHdvid_NotEqual(fRES(hdvid));
    }

    protected void doSetHdvid_NotEqual(String hdvid) {
        regHdvid(CK_NES, hdvid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_GreaterThan(String hdvid) {
        regHdvid(CK_GT, fRES(hdvid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_LessThan(String hdvid) {
        regHdvid(CK_LT, fRES(hdvid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_GreaterEqual(String hdvid) {
        regHdvid(CK_GE, fRES(hdvid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_LessEqual(String hdvid) {
        regHdvid(CK_LE, fRES(hdvid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvidList The collection of hdvid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_InScope(Collection<String> hdvidList) {
        doSetHdvid_InScope(hdvidList);
    }

    protected void doSetHdvid_InScope(Collection<String> hdvidList) {
        regINS(CK_INS, cTL(hdvidList), xgetCValueHdvid(), "HDVID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvidList The collection of hdvid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_NotInScope(Collection<String> hdvidList) {
        doSetHdvid_NotInScope(hdvidList);
    }

    protected void doSetHdvid_NotInScope(Collection<String> hdvidList) {
        regINS(CK_NINS, cTL(hdvidList), xgetCValueHdvid(), "HDVID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {varchar(255)} <br>
     * <pre>e.g. setHdvid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdvid The value of hdvid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdvid_LikeSearch(String hdvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdvid), xgetCValueHdvid(), "HDVID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdvid_NotLikeSearch(String hdvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdvid), xgetCValueHdvid(), "HDVID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {varchar(255)}
     * @param hdvid The value of hdvid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_PrefixSearch(String hdvid) {
        setHdvid_LikeSearch(hdvid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     */
    public void setHdvid_IsNull() { regHdvid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     */
    public void setHdvid_IsNullOrEmpty() { regHdvid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDVID: {varchar(255)}
     */
    public void setHdvid_IsNotNull() { regHdvid(CK_ISNN, DOBJ); }

    protected void regHdvid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdvid(), "HDVID"); }
    protected abstract ConditionValue xgetCValueHdvid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_Equal(String name1) {
        doSetName1_Equal(fRES(name1));
    }

    protected void doSetName1_Equal(String name1) {
        regName1(CK_EQ, name1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_NotEqual(String name1) {
        doSetName1_NotEqual(fRES(name1));
    }

    protected void doSetName1_NotEqual(String name1) {
        regName1(CK_NES, name1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_GreaterThan(String name1) {
        regName1(CK_GT, fRES(name1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_LessThan(String name1) {
        regName1(CK_LT, fRES(name1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_GreaterEqual(String name1) {
        regName1(CK_GE, fRES(name1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_LessEqual(String name1) {
        regName1(CK_LE, fRES(name1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1List The collection of name1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_InScope(Collection<String> name1List) {
        doSetName1_InScope(name1List);
    }

    protected void doSetName1_InScope(Collection<String> name1List) {
        regINS(CK_INS, cTL(name1List), xgetCValueName1(), "NAME1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1List The collection of name1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_NotInScope(Collection<String> name1List) {
        doSetName1_NotInScope(name1List);
    }

    protected void doSetName1_NotInScope(Collection<String> name1List) {
        regINS(CK_NINS, cTL(name1List), xgetCValueName1(), "NAME1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME1: {varchar(255)} <br>
     * <pre>e.g. setName1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name1 The value of name1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName1_LikeSearch(String name1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name1), xgetCValueName1(), "NAME1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName1_NotLikeSearch(String name1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name1), xgetCValueName1(), "NAME1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME1: {varchar(255)}
     * @param name1 The value of name1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName1_PrefixSearch(String name1) {
        setName1_LikeSearch(name1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     */
    public void setName1_IsNull() { regName1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     */
    public void setName1_IsNullOrEmpty() { regName1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NAME1: {varchar(255)}
     */
    public void setName1_IsNotNull() { regName1(CK_ISNN, DOBJ); }

    protected void regName1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName1(), "NAME1"); }
    protected abstract ConditionValue xgetCValueName1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_Equal(String zregprca) {
        doSetZregprca_Equal(fRES(zregprca));
    }

    protected void doSetZregprca_Equal(String zregprca) {
        regZregprca(CK_EQ, zregprca);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_NotEqual(String zregprca) {
        doSetZregprca_NotEqual(fRES(zregprca));
    }

    protected void doSetZregprca_NotEqual(String zregprca) {
        regZregprca(CK_NES, zregprca);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_GreaterThan(String zregprca) {
        regZregprca(CK_GT, fRES(zregprca));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_LessThan(String zregprca) {
        regZregprca(CK_LT, fRES(zregprca));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_GreaterEqual(String zregprca) {
        regZregprca(CK_GE, fRES(zregprca));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_LessEqual(String zregprca) {
        regZregprca(CK_LE, fRES(zregprca));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprcaList The collection of zregprca as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_InScope(Collection<String> zregprcaList) {
        doSetZregprca_InScope(zregprcaList);
    }

    protected void doSetZregprca_InScope(Collection<String> zregprcaList) {
        regINS(CK_INS, cTL(zregprcaList), xgetCValueZregprca(), "ZREGPRCA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprcaList The collection of zregprca as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_NotInScope(Collection<String> zregprcaList) {
        doSetZregprca_NotInScope(zregprcaList);
    }

    protected void doSetZregprca_NotInScope(Collection<String> zregprcaList) {
        regINS(CK_NINS, cTL(zregprcaList), xgetCValueZregprca(), "ZREGPRCA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCA: {varchar(255)} <br>
     * <pre>e.g. setZregprca_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zregprca The value of zregprca as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZregprca_LikeSearch(String zregprca, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zregprca), xgetCValueZregprca(), "ZREGPRCA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZregprca_NotLikeSearch(String zregprca, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zregprca), xgetCValueZregprca(), "ZREGPRCA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     * @param zregprca The value of zregprca as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprca_PrefixSearch(String zregprca) {
        setZregprca_LikeSearch(zregprca, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     */
    public void setZregprca_IsNull() { regZregprca(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     */
    public void setZregprca_IsNullOrEmpty() { regZregprca(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZREGPRCA: {varchar(255)}
     */
    public void setZregprca_IsNotNull() { regZregprca(CK_ISNN, DOBJ); }

    protected void regZregprca(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZregprca(), "ZREGPRCA"); }
    protected abstract ConditionValue xgetCValueZregprca();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_Equal(String zregprcc) {
        doSetZregprcc_Equal(fRES(zregprcc));
    }

    protected void doSetZregprcc_Equal(String zregprcc) {
        regZregprcc(CK_EQ, zregprcc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_NotEqual(String zregprcc) {
        doSetZregprcc_NotEqual(fRES(zregprcc));
    }

    protected void doSetZregprcc_NotEqual(String zregprcc) {
        regZregprcc(CK_NES, zregprcc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_GreaterThan(String zregprcc) {
        regZregprcc(CK_GT, fRES(zregprcc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_LessThan(String zregprcc) {
        regZregprcc(CK_LT, fRES(zregprcc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_GreaterEqual(String zregprcc) {
        regZregprcc(CK_GE, fRES(zregprcc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_LessEqual(String zregprcc) {
        regZregprcc(CK_LE, fRES(zregprcc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprccList The collection of zregprcc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_InScope(Collection<String> zregprccList) {
        doSetZregprcc_InScope(zregprccList);
    }

    protected void doSetZregprcc_InScope(Collection<String> zregprccList) {
        regINS(CK_INS, cTL(zregprccList), xgetCValueZregprcc(), "ZREGPRCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprccList The collection of zregprcc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_NotInScope(Collection<String> zregprccList) {
        doSetZregprcc_NotInScope(zregprccList);
    }

    protected void doSetZregprcc_NotInScope(Collection<String> zregprccList) {
        regINS(CK_NINS, cTL(zregprccList), xgetCValueZregprcc(), "ZREGPRCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)} <br>
     * <pre>e.g. setZregprcc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zregprcc The value of zregprcc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZregprcc_LikeSearch(String zregprcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zregprcc), xgetCValueZregprcc(), "ZREGPRCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZregprcc_NotLikeSearch(String zregprcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zregprcc), xgetCValueZregprcc(), "ZREGPRCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_PrefixSearch(String zregprcc) {
        setZregprcc_LikeSearch(zregprcc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNull() { regZregprcc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNullOrEmpty() { regZregprcc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNotNull() { regZregprcc(CK_ISNN, DOBJ); }

    protected void regZregprcc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZregprcc(), "ZREGPRCC"); }
    protected abstract ConditionValue xgetCValueZregprcc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_Equal(String zzsaltax) {
        doSetZzsaltax_Equal(fRES(zzsaltax));
    }

    protected void doSetZzsaltax_Equal(String zzsaltax) {
        regZzsaltax(CK_EQ, zzsaltax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_NotEqual(String zzsaltax) {
        doSetZzsaltax_NotEqual(fRES(zzsaltax));
    }

    protected void doSetZzsaltax_NotEqual(String zzsaltax) {
        regZzsaltax(CK_NES, zzsaltax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_GreaterThan(String zzsaltax) {
        regZzsaltax(CK_GT, fRES(zzsaltax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_LessThan(String zzsaltax) {
        regZzsaltax(CK_LT, fRES(zzsaltax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_GreaterEqual(String zzsaltax) {
        regZzsaltax(CK_GE, fRES(zzsaltax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_LessEqual(String zzsaltax) {
        regZzsaltax(CK_LE, fRES(zzsaltax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltaxList The collection of zzsaltax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_InScope(Collection<String> zzsaltaxList) {
        doSetZzsaltax_InScope(zzsaltaxList);
    }

    protected void doSetZzsaltax_InScope(Collection<String> zzsaltaxList) {
        regINS(CK_INS, cTL(zzsaltaxList), xgetCValueZzsaltax(), "ZZSALTAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltaxList The collection of zzsaltax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_NotInScope(Collection<String> zzsaltaxList) {
        doSetZzsaltax_NotInScope(zzsaltaxList);
    }

    protected void doSetZzsaltax_NotInScope(Collection<String> zzsaltaxList) {
        regINS(CK_NINS, cTL(zzsaltaxList), xgetCValueZzsaltax(), "ZZSALTAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSALTAX: {varchar(255)} <br>
     * <pre>e.g. setZzsaltax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzsaltax The value of zzsaltax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzsaltax_LikeSearch(String zzsaltax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzsaltax), xgetCValueZzsaltax(), "ZZSALTAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzsaltax_NotLikeSearch(String zzsaltax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzsaltax), xgetCValueZzsaltax(), "ZZSALTAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     * @param zzsaltax The value of zzsaltax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzsaltax_PrefixSearch(String zzsaltax) {
        setZzsaltax_LikeSearch(zzsaltax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     */
    public void setZzsaltax_IsNull() { regZzsaltax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     */
    public void setZzsaltax_IsNullOrEmpty() { regZzsaltax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZSALTAX: {varchar(255)}
     */
    public void setZzsaltax_IsNotNull() { regZzsaltax(CK_ISNN, DOBJ); }

    protected void regZzsaltax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzsaltax(), "ZZSALTAX"); }
    protected abstract ConditionValue xgetCValueZzsaltax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_Equal(String zzgodfpc) {
        doSetZzgodfpc_Equal(fRES(zzgodfpc));
    }

    protected void doSetZzgodfpc_Equal(String zzgodfpc) {
        regZzgodfpc(CK_EQ, zzgodfpc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_NotEqual(String zzgodfpc) {
        doSetZzgodfpc_NotEqual(fRES(zzgodfpc));
    }

    protected void doSetZzgodfpc_NotEqual(String zzgodfpc) {
        regZzgodfpc(CK_NES, zzgodfpc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_GreaterThan(String zzgodfpc) {
        regZzgodfpc(CK_GT, fRES(zzgodfpc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_LessThan(String zzgodfpc) {
        regZzgodfpc(CK_LT, fRES(zzgodfpc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_GreaterEqual(String zzgodfpc) {
        regZzgodfpc(CK_GE, fRES(zzgodfpc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_LessEqual(String zzgodfpc) {
        regZzgodfpc(CK_LE, fRES(zzgodfpc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpcList The collection of zzgodfpc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_InScope(Collection<String> zzgodfpcList) {
        doSetZzgodfpc_InScope(zzgodfpcList);
    }

    protected void doSetZzgodfpc_InScope(Collection<String> zzgodfpcList) {
        regINS(CK_INS, cTL(zzgodfpcList), xgetCValueZzgodfpc(), "ZZGODFPC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpcList The collection of zzgodfpc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_NotInScope(Collection<String> zzgodfpcList) {
        doSetZzgodfpc_NotInScope(zzgodfpcList);
    }

    protected void doSetZzgodfpc_NotInScope(Collection<String> zzgodfpcList) {
        regINS(CK_NINS, cTL(zzgodfpcList), xgetCValueZzgodfpc(), "ZZGODFPC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)} <br>
     * <pre>e.g. setZzgodfpc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodfpc The value of zzgodfpc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodfpc_LikeSearch(String zzgodfpc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodfpc), xgetCValueZzgodfpc(), "ZZGODFPC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodfpc_NotLikeSearch(String zzgodfpc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodfpc), xgetCValueZzgodfpc(), "ZZGODFPC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_PrefixSearch(String zzgodfpc) {
        setZzgodfpc_LikeSearch(zzgodfpc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNull() { regZzgodfpc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNullOrEmpty() { regZzgodfpc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNotNull() { regZzgodfpc(CK_ISNN, DOBJ); }

    protected void regZzgodfpc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodfpc(), "ZZGODFPC"); }
    protected abstract ConditionValue xgetCValueZzgodfpc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_Equal(String zzgodspc) {
        doSetZzgodspc_Equal(fRES(zzgodspc));
    }

    protected void doSetZzgodspc_Equal(String zzgodspc) {
        regZzgodspc(CK_EQ, zzgodspc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_NotEqual(String zzgodspc) {
        doSetZzgodspc_NotEqual(fRES(zzgodspc));
    }

    protected void doSetZzgodspc_NotEqual(String zzgodspc) {
        regZzgodspc(CK_NES, zzgodspc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_GreaterThan(String zzgodspc) {
        regZzgodspc(CK_GT, fRES(zzgodspc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_LessThan(String zzgodspc) {
        regZzgodspc(CK_LT, fRES(zzgodspc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_GreaterEqual(String zzgodspc) {
        regZzgodspc(CK_GE, fRES(zzgodspc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_LessEqual(String zzgodspc) {
        regZzgodspc(CK_LE, fRES(zzgodspc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspcList The collection of zzgodspc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_InScope(Collection<String> zzgodspcList) {
        doSetZzgodspc_InScope(zzgodspcList);
    }

    protected void doSetZzgodspc_InScope(Collection<String> zzgodspcList) {
        regINS(CK_INS, cTL(zzgodspcList), xgetCValueZzgodspc(), "ZZGODSPC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspcList The collection of zzgodspc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_NotInScope(Collection<String> zzgodspcList) {
        doSetZzgodspc_NotInScope(zzgodspcList);
    }

    protected void doSetZzgodspc_NotInScope(Collection<String> zzgodspcList) {
        regINS(CK_NINS, cTL(zzgodspcList), xgetCValueZzgodspc(), "ZZGODSPC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)} <br>
     * <pre>e.g. setZzgodspc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodspc The value of zzgodspc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodspc_LikeSearch(String zzgodspc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodspc), xgetCValueZzgodspc(), "ZZGODSPC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodspc_NotLikeSearch(String zzgodspc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodspc), xgetCValueZzgodspc(), "ZZGODSPC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_PrefixSearch(String zzgodspc) {
        setZzgodspc_LikeSearch(zzgodspc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNull() { regZzgodspc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNullOrEmpty() { regZzgodspc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNotNull() { regZzgodspc(CK_ISNN, DOBJ); }

    protected void regZzgodspc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodspc(), "ZZGODSPC"); }
    protected abstract ConditionValue xgetCValueZzgodspc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_Equal(String zzgodctx) {
        doSetZzgodctx_Equal(fRES(zzgodctx));
    }

    protected void doSetZzgodctx_Equal(String zzgodctx) {
        regZzgodctx(CK_EQ, zzgodctx);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_NotEqual(String zzgodctx) {
        doSetZzgodctx_NotEqual(fRES(zzgodctx));
    }

    protected void doSetZzgodctx_NotEqual(String zzgodctx) {
        regZzgodctx(CK_NES, zzgodctx);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_GreaterThan(String zzgodctx) {
        regZzgodctx(CK_GT, fRES(zzgodctx));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_LessThan(String zzgodctx) {
        regZzgodctx(CK_LT, fRES(zzgodctx));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_GreaterEqual(String zzgodctx) {
        regZzgodctx(CK_GE, fRES(zzgodctx));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_LessEqual(String zzgodctx) {
        regZzgodctx(CK_LE, fRES(zzgodctx));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctxList The collection of zzgodctx as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_InScope(Collection<String> zzgodctxList) {
        doSetZzgodctx_InScope(zzgodctxList);
    }

    protected void doSetZzgodctx_InScope(Collection<String> zzgodctxList) {
        regINS(CK_INS, cTL(zzgodctxList), xgetCValueZzgodctx(), "ZZGODCTX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctxList The collection of zzgodctx as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_NotInScope(Collection<String> zzgodctxList) {
        doSetZzgodctx_NotInScope(zzgodctxList);
    }

    protected void doSetZzgodctx_NotInScope(Collection<String> zzgodctxList) {
        regINS(CK_NINS, cTL(zzgodctxList), xgetCValueZzgodctx(), "ZZGODCTX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)} <br>
     * <pre>e.g. setZzgodctx_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodctx The value of zzgodctx as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodctx_LikeSearch(String zzgodctx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodctx), xgetCValueZzgodctx(), "ZZGODCTX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodctx_NotLikeSearch(String zzgodctx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodctx), xgetCValueZzgodctx(), "ZZGODCTX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_PrefixSearch(String zzgodctx) {
        setZzgodctx_LikeSearch(zzgodctx, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNull() { regZzgodctx(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNullOrEmpty() { regZzgodctx(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNotNull() { regZzgodctx(CK_ISNN, DOBJ); }

    protected void regZzgodctx(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodctx(), "ZZGODCTX"); }
    protected abstract ConditionValue xgetCValueZzgodctx();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_Equal(String logisticscd) {
        doSetLogisticscd_Equal(fRES(logisticscd));
    }

    protected void doSetLogisticscd_Equal(String logisticscd) {
        regLogisticscd(CK_EQ, logisticscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotEqual(String logisticscd) {
        doSetLogisticscd_NotEqual(fRES(logisticscd));
    }

    protected void doSetLogisticscd_NotEqual(String logisticscd) {
        regLogisticscd(CK_NES, logisticscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterThan(String logisticscd) {
        regLogisticscd(CK_GT, fRES(logisticscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessThan(String logisticscd) {
        regLogisticscd(CK_LT, fRES(logisticscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterEqual(String logisticscd) {
        regLogisticscd(CK_GE, fRES(logisticscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessEqual(String logisticscd) {
        regLogisticscd(CK_LE, fRES(logisticscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscdList The collection of logisticscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_InScope(Collection<String> logisticscdList) {
        doSetLogisticscd_InScope(logisticscdList);
    }

    protected void doSetLogisticscd_InScope(Collection<String> logisticscdList) {
        regINS(CK_INS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscdList The collection of logisticscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotInScope(Collection<String> logisticscdList) {
        doSetLogisticscd_NotInScope(logisticscdList);
    }

    protected void doSetLogisticscd_NotInScope(Collection<String> logisticscdList) {
        regINS(CK_NINS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(255)} <br>
     * <pre>e.g. setLogisticscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logisticscd The value of logisticscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogisticscd_LikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogisticscd_NotLikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     * @param logisticscd The value of logisticscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_PrefixSearch(String logisticscd) {
        setLogisticscd_LikeSearch(logisticscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     */
    public void setLogisticscd_IsNull() { regLogisticscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     */
    public void setLogisticscd_IsNullOrEmpty() { regLogisticscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGISTICSCD: {varchar(255)}
     */
    public void setLogisticscd_IsNotNull() { regLogisticscd(CK_ISNN, DOBJ); }

    protected void regLogisticscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogisticscd(), "LOGISTICSCD"); }
    protected abstract ConditionValue xgetCValueLogisticscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_Equal(String slediv) {
        doSetSlediv_Equal(fRES(slediv));
    }

    protected void doSetSlediv_Equal(String slediv) {
        regSlediv(CK_EQ, slediv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotEqual(String slediv) {
        doSetSlediv_NotEqual(fRES(slediv));
    }

    protected void doSetSlediv_NotEqual(String slediv) {
        regSlediv(CK_NES, slediv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterThan(String slediv) {
        regSlediv(CK_GT, fRES(slediv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessThan(String slediv) {
        regSlediv(CK_LT, fRES(slediv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterEqual(String slediv) {
        regSlediv(CK_GE, fRES(slediv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessEqual(String slediv) {
        regSlediv(CK_LE, fRES(slediv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param sledivList The collection of slediv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_InScope(Collection<String> sledivList) {
        doSetSlediv_InScope(sledivList);
    }

    protected void doSetSlediv_InScope(Collection<String> sledivList) {
        regINS(CK_INS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param sledivList The collection of slediv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotInScope(Collection<String> sledivList) {
        doSetSlediv_NotInScope(sledivList);
    }

    protected void doSetSlediv_NotInScope(Collection<String> sledivList) {
        regINS(CK_NINS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(255)} <br>
     * <pre>e.g. setSlediv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slediv The value of slediv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlediv_LikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlediv_NotLikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(255)}
     * @param slediv The value of slediv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_PrefixSearch(String slediv) {
        setSlediv_LikeSearch(slediv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     */
    public void setSlediv_IsNull() { regSlediv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     */
    public void setSlediv_IsNullOrEmpty() { regSlediv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(255)}
     */
    public void setSlediv_IsNotNull() { regSlediv(CK_ISNN, DOBJ); }

    protected void regSlediv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlediv(), "SLEDIV"); }
    protected abstract ConditionValue xgetCValueSlediv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_Equal(String hvrtrsn) {
        doSetHvrtrsn_Equal(fRES(hvrtrsn));
    }

    protected void doSetHvrtrsn_Equal(String hvrtrsn) {
        regHvrtrsn(CK_EQ, hvrtrsn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_NotEqual(String hvrtrsn) {
        doSetHvrtrsn_NotEqual(fRES(hvrtrsn));
    }

    protected void doSetHvrtrsn_NotEqual(String hvrtrsn) {
        regHvrtrsn(CK_NES, hvrtrsn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_GreaterThan(String hvrtrsn) {
        regHvrtrsn(CK_GT, fRES(hvrtrsn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_LessThan(String hvrtrsn) {
        regHvrtrsn(CK_LT, fRES(hvrtrsn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_GreaterEqual(String hvrtrsn) {
        regHvrtrsn(CK_GE, fRES(hvrtrsn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_LessEqual(String hvrtrsn) {
        regHvrtrsn(CK_LE, fRES(hvrtrsn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsnList The collection of hvrtrsn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_InScope(Collection<String> hvrtrsnList) {
        doSetHvrtrsn_InScope(hvrtrsnList);
    }

    protected void doSetHvrtrsn_InScope(Collection<String> hvrtrsnList) {
        regINS(CK_INS, cTL(hvrtrsnList), xgetCValueHvrtrsn(), "HVRTRSN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsnList The collection of hvrtrsn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_NotInScope(Collection<String> hvrtrsnList) {
        doSetHvrtrsn_NotInScope(hvrtrsnList);
    }

    protected void doSetHvrtrsn_NotInScope(Collection<String> hvrtrsnList) {
        regINS(CK_NINS, cTL(hvrtrsnList), xgetCValueHvrtrsn(), "HVRTRSN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(255)} <br>
     * <pre>e.g. setHvrtrsn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hvrtrsn The value of hvrtrsn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHvrtrsn_LikeSearch(String hvrtrsn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hvrtrsn), xgetCValueHvrtrsn(), "HVRTRSN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHvrtrsn_NotLikeSearch(String hvrtrsn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hvrtrsn), xgetCValueHvrtrsn(), "HVRTRSN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(255)}
     * @param hvrtrsn The value of hvrtrsn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_PrefixSearch(String hvrtrsn) {
        setHvrtrsn_LikeSearch(hvrtrsn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     */
    public void setHvrtrsn_IsNull() { regHvrtrsn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     */
    public void setHvrtrsn_IsNullOrEmpty() { regHvrtrsn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(255)}
     */
    public void setHvrtrsn_IsNotNull() { regHvrtrsn(CK_ISNN, DOBJ); }

    protected void regHvrtrsn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHvrtrsn(), "HVRTRSN"); }
    protected abstract ConditionValue xgetCValueHvrtrsn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_Equal(String zzvbelnb) {
        doSetZzvbelnb_Equal(fRES(zzvbelnb));
    }

    protected void doSetZzvbelnb_Equal(String zzvbelnb) {
        regZzvbelnb(CK_EQ, zzvbelnb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_NotEqual(String zzvbelnb) {
        doSetZzvbelnb_NotEqual(fRES(zzvbelnb));
    }

    protected void doSetZzvbelnb_NotEqual(String zzvbelnb) {
        regZzvbelnb(CK_NES, zzvbelnb);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_GreaterThan(String zzvbelnb) {
        regZzvbelnb(CK_GT, fRES(zzvbelnb));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_LessThan(String zzvbelnb) {
        regZzvbelnb(CK_LT, fRES(zzvbelnb));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_GreaterEqual(String zzvbelnb) {
        regZzvbelnb(CK_GE, fRES(zzvbelnb));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_LessEqual(String zzvbelnb) {
        regZzvbelnb(CK_LE, fRES(zzvbelnb));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnbList The collection of zzvbelnb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_InScope(Collection<String> zzvbelnbList) {
        doSetZzvbelnb_InScope(zzvbelnbList);
    }

    protected void doSetZzvbelnb_InScope(Collection<String> zzvbelnbList) {
        regINS(CK_INS, cTL(zzvbelnbList), xgetCValueZzvbelnb(), "ZZVBELNB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnbList The collection of zzvbelnb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_NotInScope(Collection<String> zzvbelnbList) {
        doSetZzvbelnb_NotInScope(zzvbelnbList);
    }

    protected void doSetZzvbelnb_NotInScope(Collection<String> zzvbelnbList) {
        regINS(CK_NINS, cTL(zzvbelnbList), xgetCValueZzvbelnb(), "ZZVBELNB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZVBELNB: {varchar(255)} <br>
     * <pre>e.g. setZzvbelnb_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzvbelnb The value of zzvbelnb as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzvbelnb_LikeSearch(String zzvbelnb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzvbelnb), xgetCValueZzvbelnb(), "ZZVBELNB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzvbelnb_NotLikeSearch(String zzvbelnb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzvbelnb), xgetCValueZzvbelnb(), "ZZVBELNB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     * @param zzvbelnb The value of zzvbelnb as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzvbelnb_PrefixSearch(String zzvbelnb) {
        setZzvbelnb_LikeSearch(zzvbelnb, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     */
    public void setZzvbelnb_IsNull() { regZzvbelnb(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     */
    public void setZzvbelnb_IsNullOrEmpty() { regZzvbelnb(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZVBELNB: {varchar(255)}
     */
    public void setZzvbelnb_IsNotNull() { regZzvbelnb(CK_ISNN, DOBJ); }

    protected void regZzvbelnb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzvbelnb(), "ZZVBELNB"); }
    protected abstract ConditionValue xgetCValueZzvbelnb();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_Equal(String cngprtslpno) {
        doSetCngprtslpno_Equal(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_Equal(String cngprtslpno) {
        regCngprtslpno(CK_EQ, cngprtslpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotEqual(String cngprtslpno) {
        doSetCngprtslpno_NotEqual(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_NotEqual(String cngprtslpno) {
        regCngprtslpno(CK_NES, cngprtslpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterThan(String cngprtslpno) {
        regCngprtslpno(CK_GT, fRES(cngprtslpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessThan(String cngprtslpno) {
        regCngprtslpno(CK_LT, fRES(cngprtslpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterEqual(String cngprtslpno) {
        regCngprtslpno(CK_GE, fRES(cngprtslpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessEqual(String cngprtslpno) {
        regCngprtslpno(CK_LE, fRES(cngprtslpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpnoList The collection of cngprtslpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_InScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        regINS(CK_INS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpnoList The collection of cngprtslpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_NotInScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        regINS(CK_NINS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)} <br>
     * <pre>e.g. setCngprtslpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cngprtslpno The value of cngprtslpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCngprtslpno_LikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCngprtslpno_NotLikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     * @param cngprtslpno The value of cngprtslpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_PrefixSearch(String cngprtslpno) {
        setCngprtslpno_LikeSearch(cngprtslpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     */
    public void setCngprtslpno_IsNull() { regCngprtslpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     */
    public void setCngprtslpno_IsNullOrEmpty() { regCngprtslpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(255)}
     */
    public void setCngprtslpno_IsNotNull() { regCngprtslpno(CK_ISNN, DOBJ); }

    protected void regCngprtslpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCngprtslpno(), "CNGPRTSLPNO"); }
    protected abstract ConditionValue xgetCValueCngprtslpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_Equal(String trnsctndiv) {
        doSetTrnsctndiv_Equal(fRES(trnsctndiv));
    }

    protected void doSetTrnsctndiv_Equal(String trnsctndiv) {
        regTrnsctndiv(CK_EQ, trnsctndiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_NotEqual(String trnsctndiv) {
        doSetTrnsctndiv_NotEqual(fRES(trnsctndiv));
    }

    protected void doSetTrnsctndiv_NotEqual(String trnsctndiv) {
        regTrnsctndiv(CK_NES, trnsctndiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_GreaterThan(String trnsctndiv) {
        regTrnsctndiv(CK_GT, fRES(trnsctndiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_LessThan(String trnsctndiv) {
        regTrnsctndiv(CK_LT, fRES(trnsctndiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_GreaterEqual(String trnsctndiv) {
        regTrnsctndiv(CK_GE, fRES(trnsctndiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_LessEqual(String trnsctndiv) {
        regTrnsctndiv(CK_LE, fRES(trnsctndiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndivList The collection of trnsctndiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_InScope(Collection<String> trnsctndivList) {
        doSetTrnsctndiv_InScope(trnsctndivList);
    }

    protected void doSetTrnsctndiv_InScope(Collection<String> trnsctndivList) {
        regINS(CK_INS, cTL(trnsctndivList), xgetCValueTrnsctndiv(), "TRNSCTNDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndivList The collection of trnsctndiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_NotInScope(Collection<String> trnsctndivList) {
        doSetTrnsctndiv_NotInScope(trnsctndivList);
    }

    protected void doSetTrnsctndiv_NotInScope(Collection<String> trnsctndivList) {
        regINS(CK_NINS, cTL(trnsctndivList), xgetCValueTrnsctndiv(), "TRNSCTNDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {varchar(255)} <br>
     * <pre>e.g. setTrnsctndiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trnsctndiv The value of trnsctndiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrnsctndiv_LikeSearch(String trnsctndiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trnsctndiv), xgetCValueTrnsctndiv(), "TRNSCTNDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrnsctndiv_NotLikeSearch(String trnsctndiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trnsctndiv), xgetCValueTrnsctndiv(), "TRNSCTNDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     * @param trnsctndiv The value of trnsctndiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_PrefixSearch(String trnsctndiv) {
        setTrnsctndiv_LikeSearch(trnsctndiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     */
    public void setTrnsctndiv_IsNull() { regTrnsctndiv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     */
    public void setTrnsctndiv_IsNullOrEmpty() { regTrnsctndiv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {varchar(255)}
     */
    public void setTrnsctndiv_IsNotNull() { regTrnsctndiv(CK_ISNN, DOBJ); }

    protected void regTrnsctndiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrnsctndiv(), "TRNSCTNDIV"); }
    protected abstract ConditionValue xgetCValueTrnsctndiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_Equal(String eosordaftflg) {
        doSetEosordaftflg_Equal(fRES(eosordaftflg));
    }

    protected void doSetEosordaftflg_Equal(String eosordaftflg) {
        regEosordaftflg(CK_EQ, eosordaftflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_NotEqual(String eosordaftflg) {
        doSetEosordaftflg_NotEqual(fRES(eosordaftflg));
    }

    protected void doSetEosordaftflg_NotEqual(String eosordaftflg) {
        regEosordaftflg(CK_NES, eosordaftflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_GreaterThan(String eosordaftflg) {
        regEosordaftflg(CK_GT, fRES(eosordaftflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_LessThan(String eosordaftflg) {
        regEosordaftflg(CK_LT, fRES(eosordaftflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_GreaterEqual(String eosordaftflg) {
        regEosordaftflg(CK_GE, fRES(eosordaftflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_LessEqual(String eosordaftflg) {
        regEosordaftflg(CK_LE, fRES(eosordaftflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflgList The collection of eosordaftflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_InScope(Collection<String> eosordaftflgList) {
        doSetEosordaftflg_InScope(eosordaftflgList);
    }

    protected void doSetEosordaftflg_InScope(Collection<String> eosordaftflgList) {
        regINS(CK_INS, cTL(eosordaftflgList), xgetCValueEosordaftflg(), "EOSORDAFTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflgList The collection of eosordaftflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_NotInScope(Collection<String> eosordaftflgList) {
        doSetEosordaftflg_NotInScope(eosordaftflgList);
    }

    protected void doSetEosordaftflg_NotInScope(Collection<String> eosordaftflgList) {
        regINS(CK_NINS, cTL(eosordaftflgList), xgetCValueEosordaftflg(), "EOSORDAFTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)} <br>
     * <pre>e.g. setEosordaftflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosordaftflg The value of eosordaftflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosordaftflg_LikeSearch(String eosordaftflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosordaftflg), xgetCValueEosordaftflg(), "EOSORDAFTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosordaftflg_NotLikeSearch(String eosordaftflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosordaftflg), xgetCValueEosordaftflg(), "EOSORDAFTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     * @param eosordaftflg The value of eosordaftflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_PrefixSearch(String eosordaftflg) {
        setEosordaftflg_LikeSearch(eosordaftflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     */
    public void setEosordaftflg_IsNull() { regEosordaftflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     */
    public void setEosordaftflg_IsNullOrEmpty() { regEosordaftflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {varchar(255)}
     */
    public void setEosordaftflg_IsNotNull() { regEosordaftflg(CK_ISNN, DOBJ); }

    protected void regEosordaftflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosordaftflg(), "EOSORDAFTFLG"); }
    protected abstract ConditionValue xgetCValueEosordaftflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_Equal(String eosslpno) {
        doSetEosslpno_Equal(fRES(eosslpno));
    }

    protected void doSetEosslpno_Equal(String eosslpno) {
        regEosslpno(CK_EQ, eosslpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_NotEqual(String eosslpno) {
        doSetEosslpno_NotEqual(fRES(eosslpno));
    }

    protected void doSetEosslpno_NotEqual(String eosslpno) {
        regEosslpno(CK_NES, eosslpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_GreaterThan(String eosslpno) {
        regEosslpno(CK_GT, fRES(eosslpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_LessThan(String eosslpno) {
        regEosslpno(CK_LT, fRES(eosslpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_GreaterEqual(String eosslpno) {
        regEosslpno(CK_GE, fRES(eosslpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_LessEqual(String eosslpno) {
        regEosslpno(CK_LE, fRES(eosslpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpnoList The collection of eosslpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_InScope(Collection<String> eosslpnoList) {
        doSetEosslpno_InScope(eosslpnoList);
    }

    protected void doSetEosslpno_InScope(Collection<String> eosslpnoList) {
        regINS(CK_INS, cTL(eosslpnoList), xgetCValueEosslpno(), "EOSSLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpnoList The collection of eosslpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_NotInScope(Collection<String> eosslpnoList) {
        doSetEosslpno_NotInScope(eosslpnoList);
    }

    protected void doSetEosslpno_NotInScope(Collection<String> eosslpnoList) {
        regINS(CK_NINS, cTL(eosslpnoList), xgetCValueEosslpno(), "EOSSLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(255)} <br>
     * <pre>e.g. setEosslpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosslpno The value of eosslpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosslpno_LikeSearch(String eosslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosslpno), xgetCValueEosslpno(), "EOSSLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosslpno_NotLikeSearch(String eosslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosslpno), xgetCValueEosslpno(), "EOSSLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     * @param eosslpno The value of eosslpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_PrefixSearch(String eosslpno) {
        setEosslpno_LikeSearch(eosslpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     */
    public void setEosslpno_IsNull() { regEosslpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     */
    public void setEosslpno_IsNullOrEmpty() { regEosslpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(255)}
     */
    public void setEosslpno_IsNotNull() { regEosslpno(CK_ISNN, DOBJ); }

    protected void regEosslpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosslpno(), "EOSSLPNO"); }
    protected abstract ConditionValue xgetCValueEosslpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_Equal(String hdrdbxdiv) {
        doSetHdrdbxdiv_Equal(fRES(hdrdbxdiv));
    }

    protected void doSetHdrdbxdiv_Equal(String hdrdbxdiv) {
        regHdrdbxdiv(CK_EQ, hdrdbxdiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_NotEqual(String hdrdbxdiv) {
        doSetHdrdbxdiv_NotEqual(fRES(hdrdbxdiv));
    }

    protected void doSetHdrdbxdiv_NotEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_NES, hdrdbxdiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_GreaterThan(String hdrdbxdiv) {
        regHdrdbxdiv(CK_GT, fRES(hdrdbxdiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_LessThan(String hdrdbxdiv) {
        regHdrdbxdiv(CK_LT, fRES(hdrdbxdiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_GreaterEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_GE, fRES(hdrdbxdiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_LessEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_LE, fRES(hdrdbxdiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdivList The collection of hdrdbxdiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_InScope(Collection<String> hdrdbxdivList) {
        doSetHdrdbxdiv_InScope(hdrdbxdivList);
    }

    protected void doSetHdrdbxdiv_InScope(Collection<String> hdrdbxdivList) {
        regINS(CK_INS, cTL(hdrdbxdivList), xgetCValueHdrdbxdiv(), "HDRDBXDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdivList The collection of hdrdbxdiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_NotInScope(Collection<String> hdrdbxdivList) {
        doSetHdrdbxdiv_NotInScope(hdrdbxdivList);
    }

    protected void doSetHdrdbxdiv_NotInScope(Collection<String> hdrdbxdivList) {
        regINS(CK_NINS, cTL(hdrdbxdivList), xgetCValueHdrdbxdiv(), "HDRDBXDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {varchar(255)} <br>
     * <pre>e.g. setHdrdbxdiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdbxdiv The value of hdrdbxdiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdbxdiv_LikeSearch(String hdrdbxdiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdbxdiv), xgetCValueHdrdbxdiv(), "HDRDBXDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdbxdiv_NotLikeSearch(String hdrdbxdiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdbxdiv), xgetCValueHdrdbxdiv(), "HDRDBXDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     * @param hdrdbxdiv The value of hdrdbxdiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_PrefixSearch(String hdrdbxdiv) {
        setHdrdbxdiv_LikeSearch(hdrdbxdiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     */
    public void setHdrdbxdiv_IsNull() { regHdrdbxdiv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     */
    public void setHdrdbxdiv_IsNullOrEmpty() { regHdrdbxdiv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRDBXDIV: {varchar(255)}
     */
    public void setHdrdbxdiv_IsNotNull() { regHdrdbxdiv(CK_ISNN, DOBJ); }

    protected void regHdrdbxdiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdbxdiv(), "HDRDBXDIV"); }
    protected abstract ConditionValue xgetCValueHdrdbxdiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_Equal(String inotrfsldiv) {
        doSetInotrfsldiv_Equal(fRES(inotrfsldiv));
    }

    protected void doSetInotrfsldiv_Equal(String inotrfsldiv) {
        regInotrfsldiv(CK_EQ, inotrfsldiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_NotEqual(String inotrfsldiv) {
        doSetInotrfsldiv_NotEqual(fRES(inotrfsldiv));
    }

    protected void doSetInotrfsldiv_NotEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_NES, inotrfsldiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_GreaterThan(String inotrfsldiv) {
        regInotrfsldiv(CK_GT, fRES(inotrfsldiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_LessThan(String inotrfsldiv) {
        regInotrfsldiv(CK_LT, fRES(inotrfsldiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_GreaterEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_GE, fRES(inotrfsldiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_LessEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_LE, fRES(inotrfsldiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldivList The collection of inotrfsldiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_InScope(Collection<String> inotrfsldivList) {
        doSetInotrfsldiv_InScope(inotrfsldivList);
    }

    protected void doSetInotrfsldiv_InScope(Collection<String> inotrfsldivList) {
        regINS(CK_INS, cTL(inotrfsldivList), xgetCValueInotrfsldiv(), "INOTRFSLDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldivList The collection of inotrfsldiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_NotInScope(Collection<String> inotrfsldivList) {
        doSetInotrfsldiv_NotInScope(inotrfsldivList);
    }

    protected void doSetInotrfsldiv_NotInScope(Collection<String> inotrfsldivList) {
        regINS(CK_NINS, cTL(inotrfsldivList), xgetCValueInotrfsldiv(), "INOTRFSLDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {varchar(255)} <br>
     * <pre>e.g. setInotrfsldiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inotrfsldiv The value of inotrfsldiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInotrfsldiv_LikeSearch(String inotrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inotrfsldiv), xgetCValueInotrfsldiv(), "INOTRFSLDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInotrfsldiv_NotLikeSearch(String inotrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inotrfsldiv), xgetCValueInotrfsldiv(), "INOTRFSLDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     * @param inotrfsldiv The value of inotrfsldiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_PrefixSearch(String inotrfsldiv) {
        setInotrfsldiv_LikeSearch(inotrfsldiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     */
    public void setInotrfsldiv_IsNull() { regInotrfsldiv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     */
    public void setInotrfsldiv_IsNullOrEmpty() { regInotrfsldiv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {varchar(255)}
     */
    public void setInotrfsldiv_IsNotNull() { regInotrfsldiv(CK_ISNN, DOBJ); }

    protected void regInotrfsldiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInotrfsldiv(), "INOTRFSLDIV"); }
    protected abstract ConditionValue xgetCValueInotrfsldiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_Equal(String bxmntrfsldiv) {
        doSetBxmntrfsldiv_Equal(fRES(bxmntrfsldiv));
    }

    protected void doSetBxmntrfsldiv_Equal(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_EQ, bxmntrfsldiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_NotEqual(String bxmntrfsldiv) {
        doSetBxmntrfsldiv_NotEqual(fRES(bxmntrfsldiv));
    }

    protected void doSetBxmntrfsldiv_NotEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_NES, bxmntrfsldiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_GreaterThan(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_GT, fRES(bxmntrfsldiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_LessThan(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_LT, fRES(bxmntrfsldiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_GreaterEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_GE, fRES(bxmntrfsldiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_LessEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_LE, fRES(bxmntrfsldiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldivList The collection of bxmntrfsldiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_InScope(Collection<String> bxmntrfsldivList) {
        doSetBxmntrfsldiv_InScope(bxmntrfsldivList);
    }

    protected void doSetBxmntrfsldiv_InScope(Collection<String> bxmntrfsldivList) {
        regINS(CK_INS, cTL(bxmntrfsldivList), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldivList The collection of bxmntrfsldiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_NotInScope(Collection<String> bxmntrfsldivList) {
        doSetBxmntrfsldiv_NotInScope(bxmntrfsldivList);
    }

    protected void doSetBxmntrfsldiv_NotInScope(Collection<String> bxmntrfsldivList) {
        regINS(CK_NINS, cTL(bxmntrfsldivList), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)} <br>
     * <pre>e.g. setBxmntrfsldiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bxmntrfsldiv The value of bxmntrfsldiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBxmntrfsldiv_LikeSearch(String bxmntrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bxmntrfsldiv), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBxmntrfsldiv_NotLikeSearch(String bxmntrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bxmntrfsldiv), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_PrefixSearch(String bxmntrfsldiv) {
        setBxmntrfsldiv_LikeSearch(bxmntrfsldiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     */
    public void setBxmntrfsldiv_IsNull() { regBxmntrfsldiv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     */
    public void setBxmntrfsldiv_IsNullOrEmpty() { regBxmntrfsldiv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {varchar(255)}
     */
    public void setBxmntrfsldiv_IsNotNull() { regBxmntrfsldiv(CK_ISNN, DOBJ); }

    protected void regBxmntrfsldiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV"); }
    protected abstract ConditionValue xgetCValueBxmntrfsldiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_Equal(String slpmrgtmg) {
        doSetSlpmrgtmg_Equal(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_Equal(String slpmrgtmg) {
        regSlpmrgtmg(CK_EQ, slpmrgtmg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotEqual(String slpmrgtmg) {
        doSetSlpmrgtmg_NotEqual(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_NotEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_NES, slpmrgtmg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_GT, fRES(slpmrgtmg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_LT, fRES(slpmrgtmg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_GE, fRES(slpmrgtmg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_LE, fRES(slpmrgtmg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmgList The collection of slpmrgtmg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_InScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        regINS(CK_INS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmgList The collection of slpmrgtmg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_NotInScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        regINS(CK_NINS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(255)} <br>
     * <pre>e.g. setSlpmrgtmg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpmrgtmg The value of slpmrgtmg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpmrgtmg_LikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpmrgtmg_NotLikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     * @param slpmrgtmg The value of slpmrgtmg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_PrefixSearch(String slpmrgtmg) {
        setSlpmrgtmg_LikeSearch(slpmrgtmg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     */
    public void setSlpmrgtmg_IsNull() { regSlpmrgtmg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     */
    public void setSlpmrgtmg_IsNullOrEmpty() { regSlpmrgtmg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(255)}
     */
    public void setSlpmrgtmg_IsNotNull() { regSlpmrgtmg(CK_ISNN, DOBJ); }

    protected void regSlpmrgtmg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpmrgtmg(), "SLPMRGTMG"); }
    protected abstract ConditionValue xgetCValueSlpmrgtmg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_Equal(String zzblotdt) {
        doSetZzblotdt_Equal(fRES(zzblotdt));
    }

    protected void doSetZzblotdt_Equal(String zzblotdt) {
        regZzblotdt(CK_EQ, zzblotdt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_NotEqual(String zzblotdt) {
        doSetZzblotdt_NotEqual(fRES(zzblotdt));
    }

    protected void doSetZzblotdt_NotEqual(String zzblotdt) {
        regZzblotdt(CK_NES, zzblotdt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_GreaterThan(String zzblotdt) {
        regZzblotdt(CK_GT, fRES(zzblotdt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_LessThan(String zzblotdt) {
        regZzblotdt(CK_LT, fRES(zzblotdt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_GreaterEqual(String zzblotdt) {
        regZzblotdt(CK_GE, fRES(zzblotdt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_LessEqual(String zzblotdt) {
        regZzblotdt(CK_LE, fRES(zzblotdt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdtList The collection of zzblotdt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_InScope(Collection<String> zzblotdtList) {
        doSetZzblotdt_InScope(zzblotdtList);
    }

    protected void doSetZzblotdt_InScope(Collection<String> zzblotdtList) {
        regINS(CK_INS, cTL(zzblotdtList), xgetCValueZzblotdt(), "ZZBLOTDT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdtList The collection of zzblotdt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_NotInScope(Collection<String> zzblotdtList) {
        doSetZzblotdt_NotInScope(zzblotdtList);
    }

    protected void doSetZzblotdt_NotInScope(Collection<String> zzblotdtList) {
        regINS(CK_NINS, cTL(zzblotdtList), xgetCValueZzblotdt(), "ZZBLOTDT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBLOTDT: {varchar(255)} <br>
     * <pre>e.g. setZzblotdt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzblotdt The value of zzblotdt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzblotdt_LikeSearch(String zzblotdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzblotdt), xgetCValueZzblotdt(), "ZZBLOTDT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzblotdt_NotLikeSearch(String zzblotdt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzblotdt), xgetCValueZzblotdt(), "ZZBLOTDT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     * @param zzblotdt The value of zzblotdt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzblotdt_PrefixSearch(String zzblotdt) {
        setZzblotdt_LikeSearch(zzblotdt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     */
    public void setZzblotdt_IsNull() { regZzblotdt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     */
    public void setZzblotdt_IsNullOrEmpty() { regZzblotdt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZBLOTDT: {varchar(255)}
     */
    public void setZzblotdt_IsNotNull() { regZzblotdt(CK_ISNN, DOBJ); }

    protected void regZzblotdt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzblotdt(), "ZZBLOTDT"); }
    protected abstract ConditionValue xgetCValueZzblotdt();

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
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_Equal(String matnr) {
        doSetMatnr_Equal(fRES(matnr));
    }

    protected void doSetMatnr_Equal(String matnr) {
        regMatnr(CK_EQ, matnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_NotEqual(String matnr) {
        doSetMatnr_NotEqual(fRES(matnr));
    }

    protected void doSetMatnr_NotEqual(String matnr) {
        regMatnr(CK_NES, matnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_GreaterThan(String matnr) {
        regMatnr(CK_GT, fRES(matnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_LessThan(String matnr) {
        regMatnr(CK_LT, fRES(matnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_GreaterEqual(String matnr) {
        regMatnr(CK_GE, fRES(matnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_LessEqual(String matnr) {
        regMatnr(CK_LE, fRES(matnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnrList The collection of matnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_InScope(Collection<String> matnrList) {
        doSetMatnr_InScope(matnrList);
    }

    protected void doSetMatnr_InScope(Collection<String> matnrList) {
        regINS(CK_INS, cTL(matnrList), xgetCValueMatnr(), "MATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnrList The collection of matnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_NotInScope(Collection<String> matnrList) {
        doSetMatnr_NotInScope(matnrList);
    }

    protected void doSetMatnr_NotInScope(Collection<String> matnrList) {
        regINS(CK_NINS, cTL(matnrList), xgetCValueMatnr(), "MATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATNR: {varchar(255)} <br>
     * <pre>e.g. setMatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param matnr The value of matnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMatnr_LikeSearch(String matnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(matnr), xgetCValueMatnr(), "MATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMatnr_NotLikeSearch(String matnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(matnr), xgetCValueMatnr(), "MATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATNR: {varchar(255)}
     * @param matnr The value of matnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatnr_PrefixSearch(String matnr) {
        setMatnr_LikeSearch(matnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     */
    public void setMatnr_IsNull() { regMatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     */
    public void setMatnr_IsNullOrEmpty() { regMatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MATNR: {varchar(255)}
     */
    public void setMatnr_IsNotNull() { regMatnr(CK_ISNN, DOBJ); }

    protected void regMatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMatnr(), "MATNR"); }
    protected abstract ConditionValue xgetCValueMatnr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_Equal(String kwmeng) {
        doSetKwmeng_Equal(fRES(kwmeng));
    }

    protected void doSetKwmeng_Equal(String kwmeng) {
        regKwmeng(CK_EQ, kwmeng);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_NotEqual(String kwmeng) {
        doSetKwmeng_NotEqual(fRES(kwmeng));
    }

    protected void doSetKwmeng_NotEqual(String kwmeng) {
        regKwmeng(CK_NES, kwmeng);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_GreaterThan(String kwmeng) {
        regKwmeng(CK_GT, fRES(kwmeng));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_LessThan(String kwmeng) {
        regKwmeng(CK_LT, fRES(kwmeng));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_GreaterEqual(String kwmeng) {
        regKwmeng(CK_GE, fRES(kwmeng));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_LessEqual(String kwmeng) {
        regKwmeng(CK_LE, fRES(kwmeng));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmengList The collection of kwmeng as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_InScope(Collection<String> kwmengList) {
        doSetKwmeng_InScope(kwmengList);
    }

    protected void doSetKwmeng_InScope(Collection<String> kwmengList) {
        regINS(CK_INS, cTL(kwmengList), xgetCValueKwmeng(), "KWMENG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmengList The collection of kwmeng as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_NotInScope(Collection<String> kwmengList) {
        doSetKwmeng_NotInScope(kwmengList);
    }

    protected void doSetKwmeng_NotInScope(Collection<String> kwmengList) {
        regINS(CK_NINS, cTL(kwmengList), xgetCValueKwmeng(), "KWMENG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)} <br>
     * <pre>e.g. setKwmeng_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kwmeng The value of kwmeng as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKwmeng_LikeSearch(String kwmeng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kwmeng), xgetCValueKwmeng(), "KWMENG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKwmeng_NotLikeSearch(String kwmeng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kwmeng), xgetCValueKwmeng(), "KWMENG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_PrefixSearch(String kwmeng) {
        setKwmeng_LikeSearch(kwmeng, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNull() { regKwmeng(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNullOrEmpty() { regKwmeng(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNotNull() { regKwmeng(CK_ISNN, DOBJ); }

    protected void regKwmeng(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKwmeng(), "KWMENG"); }
    protected abstract ConditionValue xgetCValueKwmeng();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_Equal(String mvgr1) {
        doSetMvgr1_Equal(fRES(mvgr1));
    }

    protected void doSetMvgr1_Equal(String mvgr1) {
        regMvgr1(CK_EQ, mvgr1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_NotEqual(String mvgr1) {
        doSetMvgr1_NotEqual(fRES(mvgr1));
    }

    protected void doSetMvgr1_NotEqual(String mvgr1) {
        regMvgr1(CK_NES, mvgr1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_GreaterThan(String mvgr1) {
        regMvgr1(CK_GT, fRES(mvgr1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_LessThan(String mvgr1) {
        regMvgr1(CK_LT, fRES(mvgr1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_GreaterEqual(String mvgr1) {
        regMvgr1(CK_GE, fRES(mvgr1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_LessEqual(String mvgr1) {
        regMvgr1(CK_LE, fRES(mvgr1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1List The collection of mvgr1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_InScope(Collection<String> mvgr1List) {
        doSetMvgr1_InScope(mvgr1List);
    }

    protected void doSetMvgr1_InScope(Collection<String> mvgr1List) {
        regINS(CK_INS, cTL(mvgr1List), xgetCValueMvgr1(), "MVGR1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1List The collection of mvgr1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_NotInScope(Collection<String> mvgr1List) {
        doSetMvgr1_NotInScope(mvgr1List);
    }

    protected void doSetMvgr1_NotInScope(Collection<String> mvgr1List) {
        regINS(CK_NINS, cTL(mvgr1List), xgetCValueMvgr1(), "MVGR1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR1: {varchar(255)} <br>
     * <pre>e.g. setMvgr1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mvgr1 The value of mvgr1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMvgr1_LikeSearch(String mvgr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mvgr1), xgetCValueMvgr1(), "MVGR1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMvgr1_NotLikeSearch(String mvgr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mvgr1), xgetCValueMvgr1(), "MVGR1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR1: {varchar(255)}
     * @param mvgr1 The value of mvgr1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr1_PrefixSearch(String mvgr1) {
        setMvgr1_LikeSearch(mvgr1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     */
    public void setMvgr1_IsNull() { regMvgr1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     */
    public void setMvgr1_IsNullOrEmpty() { regMvgr1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MVGR1: {varchar(255)}
     */
    public void setMvgr1_IsNotNull() { regMvgr1(CK_ISNN, DOBJ); }

    protected void regMvgr1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMvgr1(), "MVGR1"); }
    protected abstract ConditionValue xgetCValueMvgr1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_Equal(String mvgr4) {
        doSetMvgr4_Equal(fRES(mvgr4));
    }

    protected void doSetMvgr4_Equal(String mvgr4) {
        regMvgr4(CK_EQ, mvgr4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_NotEqual(String mvgr4) {
        doSetMvgr4_NotEqual(fRES(mvgr4));
    }

    protected void doSetMvgr4_NotEqual(String mvgr4) {
        regMvgr4(CK_NES, mvgr4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_GreaterThan(String mvgr4) {
        regMvgr4(CK_GT, fRES(mvgr4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_LessThan(String mvgr4) {
        regMvgr4(CK_LT, fRES(mvgr4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_GreaterEqual(String mvgr4) {
        regMvgr4(CK_GE, fRES(mvgr4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_LessEqual(String mvgr4) {
        regMvgr4(CK_LE, fRES(mvgr4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4List The collection of mvgr4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_InScope(Collection<String> mvgr4List) {
        doSetMvgr4_InScope(mvgr4List);
    }

    protected void doSetMvgr4_InScope(Collection<String> mvgr4List) {
        regINS(CK_INS, cTL(mvgr4List), xgetCValueMvgr4(), "MVGR4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4List The collection of mvgr4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_NotInScope(Collection<String> mvgr4List) {
        doSetMvgr4_NotInScope(mvgr4List);
    }

    protected void doSetMvgr4_NotInScope(Collection<String> mvgr4List) {
        regINS(CK_NINS, cTL(mvgr4List), xgetCValueMvgr4(), "MVGR4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR4: {varchar(255)} <br>
     * <pre>e.g. setMvgr4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mvgr4 The value of mvgr4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMvgr4_LikeSearch(String mvgr4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mvgr4), xgetCValueMvgr4(), "MVGR4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMvgr4_NotLikeSearch(String mvgr4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mvgr4), xgetCValueMvgr4(), "MVGR4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MVGR4: {varchar(255)}
     * @param mvgr4 The value of mvgr4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMvgr4_PrefixSearch(String mvgr4) {
        setMvgr4_LikeSearch(mvgr4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     */
    public void setMvgr4_IsNull() { regMvgr4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     */
    public void setMvgr4_IsNullOrEmpty() { regMvgr4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MVGR4: {varchar(255)}
     */
    public void setMvgr4_IsNotNull() { regMvgr4(CK_ISNN, DOBJ); }

    protected void regMvgr4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMvgr4(), "MVGR4"); }
    protected abstract ConditionValue xgetCValueMvgr4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_Equal(String kzwi3) {
        doSetKzwi3_Equal(fRES(kzwi3));
    }

    protected void doSetKzwi3_Equal(String kzwi3) {
        regKzwi3(CK_EQ, kzwi3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_NotEqual(String kzwi3) {
        doSetKzwi3_NotEqual(fRES(kzwi3));
    }

    protected void doSetKzwi3_NotEqual(String kzwi3) {
        regKzwi3(CK_NES, kzwi3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_GreaterThan(String kzwi3) {
        regKzwi3(CK_GT, fRES(kzwi3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_LessThan(String kzwi3) {
        regKzwi3(CK_LT, fRES(kzwi3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_GreaterEqual(String kzwi3) {
        regKzwi3(CK_GE, fRES(kzwi3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_LessEqual(String kzwi3) {
        regKzwi3(CK_LE, fRES(kzwi3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3List The collection of kzwi3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_InScope(Collection<String> kzwi3List) {
        doSetKzwi3_InScope(kzwi3List);
    }

    protected void doSetKzwi3_InScope(Collection<String> kzwi3List) {
        regINS(CK_INS, cTL(kzwi3List), xgetCValueKzwi3(), "KZWI3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3List The collection of kzwi3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_NotInScope(Collection<String> kzwi3List) {
        doSetKzwi3_NotInScope(kzwi3List);
    }

    protected void doSetKzwi3_NotInScope(Collection<String> kzwi3List) {
        regINS(CK_NINS, cTL(kzwi3List), xgetCValueKzwi3(), "KZWI3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KZWI3: {varchar(255)} <br>
     * <pre>e.g. setKzwi3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kzwi3 The value of kzwi3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKzwi3_LikeSearch(String kzwi3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kzwi3), xgetCValueKzwi3(), "KZWI3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKzwi3_NotLikeSearch(String kzwi3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kzwi3), xgetCValueKzwi3(), "KZWI3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KZWI3: {varchar(255)}
     * @param kzwi3 The value of kzwi3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKzwi3_PrefixSearch(String kzwi3) {
        setKzwi3_LikeSearch(kzwi3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     */
    public void setKzwi3_IsNull() { regKzwi3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     */
    public void setKzwi3_IsNullOrEmpty() { regKzwi3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KZWI3: {varchar(255)}
     */
    public void setKzwi3_IsNotNull() { regKzwi3(CK_ISNN, DOBJ); }

    protected void regKzwi3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKzwi3(), "KZWI3"); }
    protected abstract ConditionValue xgetCValueKzwi3();

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
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShippingPlanBulkInputCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShippingPlanBulkInputCB&gt;() {
     *     public void query(EShippingPlanBulkInputCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShippingPlanBulkInputCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShippingPlanBulkInputCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingPlanBulkInputCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShippingPlanBulkInputCQ sq);

    protected EShippingPlanBulkInputCB xcreateScalarConditionCB() {
        EShippingPlanBulkInputCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShippingPlanBulkInputCB xcreateScalarConditionPartitionByCB() {
        EShippingPlanBulkInputCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShippingPlanBulkInputCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingPlanBulkInputCB cb = new EShippingPlanBulkInputCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BONDED_SHIPPING_PLAN_BULK_INPUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShippingPlanBulkInputCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShippingPlanBulkInputCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShippingPlanBulkInputCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingPlanBulkInputCB cb = new EShippingPlanBulkInputCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BONDED_SHIPPING_PLAN_BULK_INPUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShippingPlanBulkInputCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShippingPlanBulkInputCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShippingPlanBulkInputCB cb = new EShippingPlanBulkInputCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShippingPlanBulkInputCQ sq);

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
    protected EShippingPlanBulkInputCB newMyCB() {
        return new EShippingPlanBulkInputCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShippingPlanBulkInputCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

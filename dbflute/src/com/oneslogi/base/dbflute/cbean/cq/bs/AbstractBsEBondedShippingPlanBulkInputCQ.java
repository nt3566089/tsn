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
 * The abstract condition-query of E_BONDED_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEBondedShippingPlanBulkInputCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEBondedShippingPlanBulkInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_BONDED_SHIPPING_PLAN_BULK_INPUT";
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
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_Equal(String custorderno) {
        doSetCustorderno_Equal(fRES(custorderno));
    }

    protected void doSetCustorderno_Equal(String custorderno) {
        regCustorderno(CK_EQ, custorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotEqual(String custorderno) {
        doSetCustorderno_NotEqual(fRES(custorderno));
    }

    protected void doSetCustorderno_NotEqual(String custorderno) {
        regCustorderno(CK_NES, custorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterThan(String custorderno) {
        regCustorderno(CK_GT, fRES(custorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessThan(String custorderno) {
        regCustorderno(CK_LT, fRES(custorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterEqual(String custorderno) {
        regCustorderno(CK_GE, fRES(custorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessEqual(String custorderno) {
        regCustorderno(CK_LE, fRES(custorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custordernoList The collection of custorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_InScope(Collection<String> custordernoList) {
        doSetCustorderno_InScope(custordernoList);
    }

    protected void doSetCustorderno_InScope(Collection<String> custordernoList) {
        regINS(CK_INS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custordernoList The collection of custorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotInScope(Collection<String> custordernoList) {
        doSetCustorderno_NotInScope(custordernoList);
    }

    protected void doSetCustorderno_NotInScope(Collection<String> custordernoList) {
        regINS(CK_NINS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(255)} <br>
     * <pre>e.g. setCustorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param custorderno The value of custorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustorderno_LikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustorderno_NotLikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     * @param custorderno The value of custorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_PrefixSearch(String custorderno) {
        setCustorderno_LikeSearch(custorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     */
    public void setCustorderno_IsNull() { regCustorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     */
    public void setCustorderno_IsNullOrEmpty() { regCustorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(255)}
     */
    public void setCustorderno_IsNotNull() { regCustorderno(CK_ISNN, DOBJ); }

    protected void regCustorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustorderno(), "CUSTORDERNO"); }
    protected abstract ConditionValue xgetCValueCustorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_Equal(String ordertype) {
        doSetOrdertype_Equal(fRES(ordertype));
    }

    protected void doSetOrdertype_Equal(String ordertype) {
        regOrdertype(CK_EQ, ordertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotEqual(String ordertype) {
        doSetOrdertype_NotEqual(fRES(ordertype));
    }

    protected void doSetOrdertype_NotEqual(String ordertype) {
        regOrdertype(CK_NES, ordertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterThan(String ordertype) {
        regOrdertype(CK_GT, fRES(ordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessThan(String ordertype) {
        regOrdertype(CK_LT, fRES(ordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterEqual(String ordertype) {
        regOrdertype(CK_GE, fRES(ordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessEqual(String ordertype) {
        regOrdertype(CK_LE, fRES(ordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertypeList The collection of ordertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_InScope(Collection<String> ordertypeList) {
        doSetOrdertype_InScope(ordertypeList);
    }

    protected void doSetOrdertype_InScope(Collection<String> ordertypeList) {
        regINS(CK_INS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertypeList The collection of ordertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotInScope(Collection<String> ordertypeList) {
        doSetOrdertype_NotInScope(ordertypeList);
    }

    protected void doSetOrdertype_NotInScope(Collection<String> ordertypeList) {
        regINS(CK_NINS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(255)} <br>
     * <pre>e.g. setOrdertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordertype The value of ordertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdertype_LikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdertype_NotLikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     * @param ordertype The value of ordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_PrefixSearch(String ordertype) {
        setOrdertype_LikeSearch(ordertype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     */
    public void setOrdertype_IsNull() { regOrdertype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     */
    public void setOrdertype_IsNullOrEmpty() { regOrdertype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(255)}
     */
    public void setOrdertype_IsNotNull() { regOrdertype(CK_ISNN, DOBJ); }

    protected void regOrdertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdertype(), "ORDERTYPE"); }
    protected abstract ConditionValue xgetCValueOrdertype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_Equal(String shipcd) {
        doSetShipcd_Equal(fRES(shipcd));
    }

    protected void doSetShipcd_Equal(String shipcd) {
        regShipcd(CK_EQ, shipcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotEqual(String shipcd) {
        doSetShipcd_NotEqual(fRES(shipcd));
    }

    protected void doSetShipcd_NotEqual(String shipcd) {
        regShipcd(CK_NES, shipcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterThan(String shipcd) {
        regShipcd(CK_GT, fRES(shipcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessThan(String shipcd) {
        regShipcd(CK_LT, fRES(shipcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterEqual(String shipcd) {
        regShipcd(CK_GE, fRES(shipcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessEqual(String shipcd) {
        regShipcd(CK_LE, fRES(shipcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcdList The collection of shipcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_InScope(Collection<String> shipcdList) {
        doSetShipcd_InScope(shipcdList);
    }

    protected void doSetShipcd_InScope(Collection<String> shipcdList) {
        regINS(CK_INS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcdList The collection of shipcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotInScope(Collection<String> shipcdList) {
        doSetShipcd_NotInScope(shipcdList);
    }

    protected void doSetShipcd_NotInScope(Collection<String> shipcdList) {
        regINS(CK_NINS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(255)} <br>
     * <pre>e.g. setShipcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipcd The value of shipcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipcd_LikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipcd_NotLikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {varchar(255)}
     * @param shipcd The value of shipcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_PrefixSearch(String shipcd) {
        setShipcd_LikeSearch(shipcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     */
    public void setShipcd_IsNull() { regShipcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     */
    public void setShipcd_IsNullOrEmpty() { regShipcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPCD: {varchar(255)}
     */
    public void setShipcd_IsNotNull() { regShipcd(CK_ISNN, DOBJ); }

    protected void regShipcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipcd(), "SHIPCD"); }
    protected abstract ConditionValue xgetCValueShipcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_Equal(String carryoutplancd) {
        doSetCarryoutplancd_Equal(fRES(carryoutplancd));
    }

    protected void doSetCarryoutplancd_Equal(String carryoutplancd) {
        regCarryoutplancd(CK_EQ, carryoutplancd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_NotEqual(String carryoutplancd) {
        doSetCarryoutplancd_NotEqual(fRES(carryoutplancd));
    }

    protected void doSetCarryoutplancd_NotEqual(String carryoutplancd) {
        regCarryoutplancd(CK_NES, carryoutplancd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_GreaterThan(String carryoutplancd) {
        regCarryoutplancd(CK_GT, fRES(carryoutplancd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_LessThan(String carryoutplancd) {
        regCarryoutplancd(CK_LT, fRES(carryoutplancd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_GreaterEqual(String carryoutplancd) {
        regCarryoutplancd(CK_GE, fRES(carryoutplancd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_LessEqual(String carryoutplancd) {
        regCarryoutplancd(CK_LE, fRES(carryoutplancd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancdList The collection of carryoutplancd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_InScope(Collection<String> carryoutplancdList) {
        doSetCarryoutplancd_InScope(carryoutplancdList);
    }

    protected void doSetCarryoutplancd_InScope(Collection<String> carryoutplancdList) {
        regINS(CK_INS, cTL(carryoutplancdList), xgetCValueCarryoutplancd(), "CarryoutPlanCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancdList The collection of carryoutplancd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_NotInScope(Collection<String> carryoutplancdList) {
        doSetCarryoutplancd_NotInScope(carryoutplancdList);
    }

    protected void doSetCarryoutplancd_NotInScope(Collection<String> carryoutplancdList) {
        regINS(CK_NINS, cTL(carryoutplancdList), xgetCValueCarryoutplancd(), "CarryoutPlanCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CarryoutPlanCd: {varchar(255)} <br>
     * <pre>e.g. setCarryoutplancd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carryoutplancd The value of carryoutplancd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarryoutplancd_LikeSearch(String carryoutplancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carryoutplancd), xgetCValueCarryoutplancd(), "CarryoutPlanCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarryoutplancd_NotLikeSearch(String carryoutplancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carryoutplancd), xgetCValueCarryoutplancd(), "CarryoutPlanCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @param carryoutplancd The value of carryoutplancd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutplancd_PrefixSearch(String carryoutplancd) {
        setCarryoutplancd_LikeSearch(carryoutplancd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     */
    public void setCarryoutplancd_IsNull() { regCarryoutplancd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     */
    public void setCarryoutplancd_IsNullOrEmpty() { regCarryoutplancd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CarryoutPlanCd: {varchar(255)}
     */
    public void setCarryoutplancd_IsNotNull() { regCarryoutplancd(CK_ISNN, DOBJ); }

    protected void regCarryoutplancd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarryoutplancd(), "CarryoutPlanCd"); }
    protected abstract ConditionValue xgetCValueCarryoutplancd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
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
     * ShipToCd: {varchar(255)}
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
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "ShipToCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "ShipToCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCd: {varchar(255)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "ShipToCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "ShipToCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCd: {varchar(255)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ShipToCd: {varchar(255)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "ShipToCd"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_Equal(String shiptonm) {
        doSetShiptonm_Equal(fRES(shiptonm));
    }

    protected void doSetShiptonm_Equal(String shiptonm) {
        regShiptonm(CK_EQ, shiptonm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_NotEqual(String shiptonm) {
        doSetShiptonm_NotEqual(fRES(shiptonm));
    }

    protected void doSetShiptonm_NotEqual(String shiptonm) {
        regShiptonm(CK_NES, shiptonm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_GreaterThan(String shiptonm) {
        regShiptonm(CK_GT, fRES(shiptonm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_LessThan(String shiptonm) {
        regShiptonm(CK_LT, fRES(shiptonm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_GreaterEqual(String shiptonm) {
        regShiptonm(CK_GE, fRES(shiptonm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_LessEqual(String shiptonm) {
        regShiptonm(CK_LE, fRES(shiptonm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonmList The collection of shiptonm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_InScope(Collection<String> shiptonmList) {
        doSetShiptonm_InScope(shiptonmList);
    }

    protected void doSetShiptonm_InScope(Collection<String> shiptonmList) {
        regINS(CK_INS, cTL(shiptonmList), xgetCValueShiptonm(), "ShipToNm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonmList The collection of shiptonm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_NotInScope(Collection<String> shiptonmList) {
        doSetShiptonm_NotInScope(shiptonmList);
    }

    protected void doSetShiptonm_NotInScope(Collection<String> shiptonmList) {
        regINS(CK_NINS, cTL(shiptonmList), xgetCValueShiptonm(), "ShipToNm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToNm: {varchar(255)} <br>
     * <pre>e.g. setShiptonm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptonm The value of shiptonm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptonm_LikeSearch(String shiptonm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptonm), xgetCValueShiptonm(), "ShipToNm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptonm_NotLikeSearch(String shiptonm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptonm), xgetCValueShiptonm(), "ShipToNm", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToNm: {varchar(255)}
     * @param shiptonm The value of shiptonm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptonm_PrefixSearch(String shiptonm) {
        setShiptonm_LikeSearch(shiptonm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     */
    public void setShiptonm_IsNull() { regShiptonm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     */
    public void setShiptonm_IsNullOrEmpty() { regShiptonm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ShipToNm: {varchar(255)}
     */
    public void setShiptonm_IsNotNull() { regShiptonm(CK_ISNN, DOBJ); }

    protected void regShiptonm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptonm(), "ShipToNm"); }
    protected abstract ConditionValue xgetCValueShiptonm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_Equal(String receiveplanym) {
        doSetReceiveplanym_Equal(fRES(receiveplanym));
    }

    protected void doSetReceiveplanym_Equal(String receiveplanym) {
        regReceiveplanym(CK_EQ, receiveplanym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_NotEqual(String receiveplanym) {
        doSetReceiveplanym_NotEqual(fRES(receiveplanym));
    }

    protected void doSetReceiveplanym_NotEqual(String receiveplanym) {
        regReceiveplanym(CK_NES, receiveplanym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_GreaterThan(String receiveplanym) {
        regReceiveplanym(CK_GT, fRES(receiveplanym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_LessThan(String receiveplanym) {
        regReceiveplanym(CK_LT, fRES(receiveplanym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_GreaterEqual(String receiveplanym) {
        regReceiveplanym(CK_GE, fRES(receiveplanym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_LessEqual(String receiveplanym) {
        regReceiveplanym(CK_LE, fRES(receiveplanym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanymList The collection of receiveplanym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_InScope(Collection<String> receiveplanymList) {
        doSetReceiveplanym_InScope(receiveplanymList);
    }

    protected void doSetReceiveplanym_InScope(Collection<String> receiveplanymList) {
        regINS(CK_INS, cTL(receiveplanymList), xgetCValueReceiveplanym(), "ReceivePlanYm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanymList The collection of receiveplanym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_NotInScope(Collection<String> receiveplanymList) {
        doSetReceiveplanym_NotInScope(receiveplanymList);
    }

    protected void doSetReceiveplanym_NotInScope(Collection<String> receiveplanymList) {
        regINS(CK_NINS, cTL(receiveplanymList), xgetCValueReceiveplanym(), "ReceivePlanYm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceivePlanYm: {varchar(255)} <br>
     * <pre>e.g. setReceiveplanym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveplanym The value of receiveplanym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveplanym_LikeSearch(String receiveplanym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveplanym), xgetCValueReceiveplanym(), "ReceivePlanYm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveplanym_NotLikeSearch(String receiveplanym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveplanym), xgetCValueReceiveplanym(), "ReceivePlanYm", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     * @param receiveplanym The value of receiveplanym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveplanym_PrefixSearch(String receiveplanym) {
        setReceiveplanym_LikeSearch(receiveplanym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     */
    public void setReceiveplanym_IsNull() { regReceiveplanym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     */
    public void setReceiveplanym_IsNullOrEmpty() { regReceiveplanym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReceivePlanYm: {varchar(255)}
     */
    public void setReceiveplanym_IsNotNull() { regReceiveplanym(CK_ISNN, DOBJ); }

    protected void regReceiveplanym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveplanym(), "ReceivePlanYm"); }
    protected abstract ConditionValue xgetCValueReceiveplanym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_Equal(String shtypecd) {
        doSetShtypecd_Equal(fRES(shtypecd));
    }

    protected void doSetShtypecd_Equal(String shtypecd) {
        regShtypecd(CK_EQ, shtypecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotEqual(String shtypecd) {
        doSetShtypecd_NotEqual(fRES(shtypecd));
    }

    protected void doSetShtypecd_NotEqual(String shtypecd) {
        regShtypecd(CK_NES, shtypecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterThan(String shtypecd) {
        regShtypecd(CK_GT, fRES(shtypecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessThan(String shtypecd) {
        regShtypecd(CK_LT, fRES(shtypecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterEqual(String shtypecd) {
        regShtypecd(CK_GE, fRES(shtypecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessEqual(String shtypecd) {
        regShtypecd(CK_LE, fRES(shtypecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecdList The collection of shtypecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_InScope(Collection<String> shtypecdList) {
        doSetShtypecd_InScope(shtypecdList);
    }

    protected void doSetShtypecd_InScope(Collection<String> shtypecdList) {
        regINS(CK_INS, cTL(shtypecdList), xgetCValueShtypecd(), "ShTypeCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecdList The collection of shtypecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotInScope(Collection<String> shtypecdList) {
        doSetShtypecd_NotInScope(shtypecdList);
    }

    protected void doSetShtypecd_NotInScope(Collection<String> shtypecdList) {
        regINS(CK_NINS, cTL(shtypecdList), xgetCValueShtypecd(), "ShTypeCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(255)} <br>
     * <pre>e.g. setShtypecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shtypecd The value of shtypecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShtypecd_LikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shtypecd), xgetCValueShtypecd(), "ShTypeCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShtypecd_NotLikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shtypecd), xgetCValueShtypecd(), "ShTypeCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeCd: {varchar(255)}
     * @param shtypecd The value of shtypecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_PrefixSearch(String shtypecd) {
        setShtypecd_LikeSearch(shtypecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     */
    public void setShtypecd_IsNull() { regShtypecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     */
    public void setShtypecd_IsNullOrEmpty() { regShtypecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ShTypeCd: {varchar(255)}
     */
    public void setShtypecd_IsNotNull() { regShtypecd(CK_ISNN, DOBJ); }

    protected void regShtypecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShtypecd(), "ShTypeCd"); }
    protected abstract ConditionValue xgetCValueShtypecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_Equal(String shtypenm) {
        doSetShtypenm_Equal(fRES(shtypenm));
    }

    protected void doSetShtypenm_Equal(String shtypenm) {
        regShtypenm(CK_EQ, shtypenm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_NotEqual(String shtypenm) {
        doSetShtypenm_NotEqual(fRES(shtypenm));
    }

    protected void doSetShtypenm_NotEqual(String shtypenm) {
        regShtypenm(CK_NES, shtypenm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_GreaterThan(String shtypenm) {
        regShtypenm(CK_GT, fRES(shtypenm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_LessThan(String shtypenm) {
        regShtypenm(CK_LT, fRES(shtypenm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_GreaterEqual(String shtypenm) {
        regShtypenm(CK_GE, fRES(shtypenm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_LessEqual(String shtypenm) {
        regShtypenm(CK_LE, fRES(shtypenm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenmList The collection of shtypenm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_InScope(Collection<String> shtypenmList) {
        doSetShtypenm_InScope(shtypenmList);
    }

    protected void doSetShtypenm_InScope(Collection<String> shtypenmList) {
        regINS(CK_INS, cTL(shtypenmList), xgetCValueShtypenm(), "ShTypeNm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenmList The collection of shtypenm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_NotInScope(Collection<String> shtypenmList) {
        doSetShtypenm_NotInScope(shtypenmList);
    }

    protected void doSetShtypenm_NotInScope(Collection<String> shtypenmList) {
        regINS(CK_NINS, cTL(shtypenmList), xgetCValueShtypenm(), "ShTypeNm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeNm: {varchar(255)} <br>
     * <pre>e.g. setShtypenm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shtypenm The value of shtypenm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShtypenm_LikeSearch(String shtypenm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shtypenm), xgetCValueShtypenm(), "ShTypeNm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShtypenm_NotLikeSearch(String shtypenm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shtypenm), xgetCValueShtypenm(), "ShTypeNm", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShTypeNm: {varchar(255)}
     * @param shtypenm The value of shtypenm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypenm_PrefixSearch(String shtypenm) {
        setShtypenm_LikeSearch(shtypenm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     */
    public void setShtypenm_IsNull() { regShtypenm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     */
    public void setShtypenm_IsNullOrEmpty() { regShtypenm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ShTypeNm: {varchar(255)}
     */
    public void setShtypenm_IsNotNull() { regShtypenm(CK_ISNN, DOBJ); }

    protected void regShtypenm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShtypenm(), "ShTypeNm"); }
    protected abstract ConditionValue xgetCValueShtypenm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_Equal(String refno) {
        doSetRefno_Equal(fRES(refno));
    }

    protected void doSetRefno_Equal(String refno) {
        regRefno(CK_EQ, refno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotEqual(String refno) {
        doSetRefno_NotEqual(fRES(refno));
    }

    protected void doSetRefno_NotEqual(String refno) {
        regRefno(CK_NES, refno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Refno: {varchar(255)}
     * @param refnoList The collection of refno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_InScope(Collection<String> refnoList) {
        doSetRefno_InScope(refnoList);
    }

    protected void doSetRefno_InScope(Collection<String> refnoList) {
        regINS(CK_INS, cTL(refnoList), xgetCValueRefno(), "Refno");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Refno: {varchar(255)}
     * @param refnoList The collection of refno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotInScope(Collection<String> refnoList) {
        doSetRefno_NotInScope(refnoList);
    }

    protected void doSetRefno_NotInScope(Collection<String> refnoList) {
        regINS(CK_NINS, cTL(refnoList), xgetCValueRefno(), "Refno");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Refno: {varchar(255)} <br>
     * <pre>e.g. setRefno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refno The value of refno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefno_LikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refno), xgetCValueRefno(), "Refno", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "Refno", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Refno: {varchar(255)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     */
    public void setRefno_IsNull() { regRefno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     */
    public void setRefno_IsNullOrEmpty() { regRefno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Refno: {varchar(255)}
     */
    public void setRefno_IsNotNull() { regRefno(CK_ISNN, DOBJ); }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "Refno"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_Equal(String pickingcomment) {
        doSetPickingcomment_Equal(fRES(pickingcomment));
    }

    protected void doSetPickingcomment_Equal(String pickingcomment) {
        regPickingcomment(CK_EQ, pickingcomment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_NotEqual(String pickingcomment) {
        doSetPickingcomment_NotEqual(fRES(pickingcomment));
    }

    protected void doSetPickingcomment_NotEqual(String pickingcomment) {
        regPickingcomment(CK_NES, pickingcomment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_GreaterThan(String pickingcomment) {
        regPickingcomment(CK_GT, fRES(pickingcomment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_LessThan(String pickingcomment) {
        regPickingcomment(CK_LT, fRES(pickingcomment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_GreaterEqual(String pickingcomment) {
        regPickingcomment(CK_GE, fRES(pickingcomment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_LessEqual(String pickingcomment) {
        regPickingcomment(CK_LE, fRES(pickingcomment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcommentList The collection of pickingcomment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_InScope(Collection<String> pickingcommentList) {
        doSetPickingcomment_InScope(pickingcommentList);
    }

    protected void doSetPickingcomment_InScope(Collection<String> pickingcommentList) {
        regINS(CK_INS, cTL(pickingcommentList), xgetCValuePickingcomment(), "PickingComment");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcommentList The collection of pickingcomment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_NotInScope(Collection<String> pickingcommentList) {
        doSetPickingcomment_NotInScope(pickingcommentList);
    }

    protected void doSetPickingcomment_NotInScope(Collection<String> pickingcommentList) {
        regINS(CK_NINS, cTL(pickingcommentList), xgetCValuePickingcomment(), "PickingComment");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PickingComment: {varchar(255)} <br>
     * <pre>e.g. setPickingcomment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingcomment The value of pickingcomment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingcomment_LikeSearch(String pickingcomment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingcomment), xgetCValuePickingcomment(), "PickingComment", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingcomment_NotLikeSearch(String pickingcomment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingcomment), xgetCValuePickingcomment(), "PickingComment", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PickingComment: {varchar(255)}
     * @param pickingcomment The value of pickingcomment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingcomment_PrefixSearch(String pickingcomment) {
        setPickingcomment_LikeSearch(pickingcomment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     */
    public void setPickingcomment_IsNull() { regPickingcomment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     */
    public void setPickingcomment_IsNullOrEmpty() { regPickingcomment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PickingComment: {varchar(255)}
     */
    public void setPickingcomment_IsNotNull() { regPickingcomment(CK_ISNN, DOBJ); }

    protected void regPickingcomment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingcomment(), "PickingComment"); }
    protected abstract ConditionValue xgetCValuePickingcomment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_Equal(String phoneno) {
        doSetPhoneno_Equal(fRES(phoneno));
    }

    protected void doSetPhoneno_Equal(String phoneno) {
        regPhoneno(CK_EQ, phoneno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_NotEqual(String phoneno) {
        doSetPhoneno_NotEqual(fRES(phoneno));
    }

    protected void doSetPhoneno_NotEqual(String phoneno) {
        regPhoneno(CK_NES, phoneno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_GreaterThan(String phoneno) {
        regPhoneno(CK_GT, fRES(phoneno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_LessThan(String phoneno) {
        regPhoneno(CK_LT, fRES(phoneno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_GreaterEqual(String phoneno) {
        regPhoneno(CK_GE, fRES(phoneno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_LessEqual(String phoneno) {
        regPhoneno(CK_LE, fRES(phoneno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phonenoList The collection of phoneno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_InScope(Collection<String> phonenoList) {
        doSetPhoneno_InScope(phonenoList);
    }

    protected void doSetPhoneno_InScope(Collection<String> phonenoList) {
        regINS(CK_INS, cTL(phonenoList), xgetCValuePhoneno(), "PhoneNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phonenoList The collection of phoneno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_NotInScope(Collection<String> phonenoList) {
        doSetPhoneno_NotInScope(phonenoList);
    }

    protected void doSetPhoneno_NotInScope(Collection<String> phonenoList) {
        regINS(CK_NINS, cTL(phonenoList), xgetCValuePhoneno(), "PhoneNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PhoneNo: {varchar(255)} <br>
     * <pre>e.g. setPhoneno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneno The value of phoneno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhoneno_LikeSearch(String phoneno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneno), xgetCValuePhoneno(), "PhoneNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhoneno_NotLikeSearch(String phoneno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneno), xgetCValuePhoneno(), "PhoneNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PhoneNo: {varchar(255)}
     * @param phoneno The value of phoneno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_PrefixSearch(String phoneno) {
        setPhoneno_LikeSearch(phoneno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     */
    public void setPhoneno_IsNull() { regPhoneno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     */
    public void setPhoneno_IsNullOrEmpty() { regPhoneno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PhoneNo: {varchar(255)}
     */
    public void setPhoneno_IsNotNull() { regPhoneno(CK_ISNN, DOBJ); }

    protected void regPhoneno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneno(), "PhoneNo"); }
    protected abstract ConditionValue xgetCValuePhoneno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
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
     * BATJMfYm: {varchar(255)}
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
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterThan(String batjmfym) {
        regBatjmfym(CK_GT, fRES(batjmfym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessThan(String batjmfym) {
        regBatjmfym(CK_LT, fRES(batjmfym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_GreaterEqual(String batjmfym) {
        regBatjmfym(CK_GE, fRES(batjmfym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_LessEqual(String batjmfym) {
        regBatjmfym(CK_LE, fRES(batjmfym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfymList The collection of batjmfym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_InScope(Collection<String> batjmfymList) {
        doSetBatjmfym_InScope(batjmfymList);
    }

    protected void doSetBatjmfym_InScope(Collection<String> batjmfymList) {
        regINS(CK_INS, cTL(batjmfymList), xgetCValueBatjmfym(), "BATJMfYm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfymList The collection of batjmfym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_NotInScope(Collection<String> batjmfymList) {
        doSetBatjmfym_NotInScope(batjmfymList);
    }

    protected void doSetBatjmfym_NotInScope(Collection<String> batjmfymList) {
        regINS(CK_NINS, cTL(batjmfymList), xgetCValueBatjmfym(), "BATJMfYm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMfYm: {varchar(255)} <br>
     * <pre>e.g. setBatjmfym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batjmfym The value of batjmfym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatjmfym_LikeSearch(String batjmfym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batjmfym), xgetCValueBatjmfym(), "BATJMfYm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatjmfym_NotLikeSearch(String batjmfym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batjmfym), xgetCValueBatjmfym(), "BATJMfYm", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJMfYm: {varchar(255)}
     * @param batjmfym The value of batjmfym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjmfym_PrefixSearch(String batjmfym) {
        setBatjmfym_LikeSearch(batjmfym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     */
    public void setBatjmfym_IsNull() { regBatjmfym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     */
    public void setBatjmfym_IsNullOrEmpty() { regBatjmfym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATJMfYm: {varchar(255)}
     */
    public void setBatjmfym_IsNotNull() { regBatjmfym(CK_ISNN, DOBJ); }

    protected void regBatjmfym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatjmfym(), "BATJMfYm"); }
    protected abstract ConditionValue xgetCValueBatjmfym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
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
     * RmaNo: {varchar(255)}
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
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmanoList The collection of rmano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_InScope(Collection<String> rmanoList) {
        doSetRmano_InScope(rmanoList);
    }

    protected void doSetRmano_InScope(Collection<String> rmanoList) {
        regINS(CK_INS, cTL(rmanoList), xgetCValueRmano(), "RmaNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmanoList The collection of rmano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotInScope(Collection<String> rmanoList) {
        doSetRmano_NotInScope(rmanoList);
    }

    protected void doSetRmano_NotInScope(Collection<String> rmanoList) {
        regINS(CK_NINS, cTL(rmanoList), xgetCValueRmano(), "RmaNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RmaNo: {varchar(255)} <br>
     * <pre>e.g. setRmano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmano The value of rmano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmano_LikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmano), xgetCValueRmano(), "RmaNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RmaNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RmaNo: {varchar(255)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     */
    public void setRmano_IsNull() { regRmano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     */
    public void setRmano_IsNullOrEmpty() { regRmano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RmaNo: {varchar(255)}
     */
    public void setRmano_IsNotNull() { regRmano(CK_ISNN, DOBJ); }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RmaNo"); }
    protected abstract ConditionValue xgetCValueRmano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_Equal(String ownerorderno) {
        doSetOwnerorderno_Equal(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_Equal(String ownerorderno) {
        regOwnerorderno(CK_EQ, ownerorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotEqual(String ownerorderno) {
        doSetOwnerorderno_NotEqual(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_NotEqual(String ownerorderno) {
        regOwnerorderno(CK_NES, ownerorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterThan(String ownerorderno) {
        regOwnerorderno(CK_GT, fRES(ownerorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessThan(String ownerorderno) {
        regOwnerorderno(CK_LT, fRES(ownerorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterEqual(String ownerorderno) {
        regOwnerorderno(CK_GE, fRES(ownerorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessEqual(String ownerorderno) {
        regOwnerorderno(CK_LE, fRES(ownerorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerordernoList The collection of ownerorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_InScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_InScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_InScope(Collection<String> ownerordernoList) {
        regINS(CK_INS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OwnerOrderNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerordernoList The collection of ownerorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_NotInScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        regINS(CK_NINS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OwnerOrderNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerOrderNo: {varchar(255)} <br>
     * <pre>e.g. setOwnerorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerorderno The value of ownerorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerorderno_LikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OwnerOrderNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerorderno_NotLikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OwnerOrderNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     * @param ownerorderno The value of ownerorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_PrefixSearch(String ownerorderno) {
        setOwnerorderno_LikeSearch(ownerorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     */
    public void setOwnerorderno_IsNull() { regOwnerorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     */
    public void setOwnerorderno_IsNullOrEmpty() { regOwnerorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OwnerOrderNo: {varchar(255)}
     */
    public void setOwnerorderno_IsNotNull() { regOwnerorderno(CK_ISNN, DOBJ); }

    protected void regOwnerorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerorderno(), "OwnerOrderNo"); }
    protected abstract ConditionValue xgetCValueOwnerorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_Equal(String palletno) {
        doSetPalletno_Equal(fRES(palletno));
    }

    protected void doSetPalletno_Equal(String palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(String palletno) {
        doSetPalletno_NotEqual(fRES(palletno));
    }

    protected void doSetPalletno_NotEqual(String palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(String palletno) {
        regPalletno(CK_GT, fRES(palletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(String palletno) {
        regPalletno(CK_LT, fRES(palletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(String palletno) {
        regPalletno(CK_GE, fRES(palletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(String palletno) {
        regPalletno(CK_LE, fRES(palletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<String> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<String> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PalletNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<String> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<String> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PalletNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletNo: {varchar(255)} <br>
     * <pre>e.g. setPalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletno The value of palletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletno_LikeSearch(String palletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletno), xgetCValuePalletno(), "PalletNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletno_NotLikeSearch(String palletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletno), xgetCValuePalletno(), "PalletNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletNo: {varchar(255)}
     * @param palletno The value of palletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_PrefixSearch(String palletno) {
        setPalletno_LikeSearch(palletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     */
    public void setPalletno_IsNull() { regPalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     */
    public void setPalletno_IsNullOrEmpty() { regPalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PalletNo: {varchar(255)}
     */
    public void setPalletno_IsNotNull() { regPalletno(CK_ISNN, DOBJ); }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PalletNo"); }
    protected abstract ConditionValue xgetCValuePalletno();

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
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DesignCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DesignCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DesignCd: {varchar(255)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DesignCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DesignCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DesignCd: {varchar(255)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DesignCd: {varchar(255)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DesignCd"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_Equal(String manufactureym) {
        doSetManufactureym_Equal(fRES(manufactureym));
    }

    protected void doSetManufactureym_Equal(String manufactureym) {
        regManufactureym(CK_EQ, manufactureym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_NotEqual(String manufactureym) {
        doSetManufactureym_NotEqual(fRES(manufactureym));
    }

    protected void doSetManufactureym_NotEqual(String manufactureym) {
        regManufactureym(CK_NES, manufactureym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_GreaterThan(String manufactureym) {
        regManufactureym(CK_GT, fRES(manufactureym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_LessThan(String manufactureym) {
        regManufactureym(CK_LT, fRES(manufactureym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_GreaterEqual(String manufactureym) {
        regManufactureym(CK_GE, fRES(manufactureym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_LessEqual(String manufactureym) {
        regManufactureym(CK_LE, fRES(manufactureym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureymList The collection of manufactureym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_InScope(Collection<String> manufactureymList) {
        doSetManufactureym_InScope(manufactureymList);
    }

    protected void doSetManufactureym_InScope(Collection<String> manufactureymList) {
        regINS(CK_INS, cTL(manufactureymList), xgetCValueManufactureym(), "ManufactureYm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureymList The collection of manufactureym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_NotInScope(Collection<String> manufactureymList) {
        doSetManufactureym_NotInScope(manufactureymList);
    }

    protected void doSetManufactureym_NotInScope(Collection<String> manufactureymList) {
        regINS(CK_NINS, cTL(manufactureymList), xgetCValueManufactureym(), "ManufactureYm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ManufactureYm: {varchar(255)} <br>
     * <pre>e.g. setManufactureym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureym The value of manufactureym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureym_LikeSearch(String manufactureym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureym), xgetCValueManufactureym(), "ManufactureYm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureym_NotLikeSearch(String manufactureym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureym), xgetCValueManufactureym(), "ManufactureYm", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ManufactureYm: {varchar(255)}
     * @param manufactureym The value of manufactureym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureym_PrefixSearch(String manufactureym) {
        setManufactureym_LikeSearch(manufactureym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     */
    public void setManufactureym_IsNull() { regManufactureym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     */
    public void setManufactureym_IsNullOrEmpty() { regManufactureym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ManufactureYm: {varchar(255)}
     */
    public void setManufactureym_IsNotNull() { regManufactureym(CK_ISNN, DOBJ); }

    protected void regManufactureym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureym(), "ManufactureYm"); }
    protected abstract ConditionValue xgetCValueManufactureym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_Equal(String firmcarryno) {
        doSetFirmcarryno_Equal(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_Equal(String firmcarryno) {
        regFirmcarryno(CK_EQ, firmcarryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotEqual(String firmcarryno) {
        doSetFirmcarryno_NotEqual(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_NotEqual(String firmcarryno) {
        regFirmcarryno(CK_NES, firmcarryno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterThan(String firmcarryno) {
        regFirmcarryno(CK_GT, fRES(firmcarryno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessThan(String firmcarryno) {
        regFirmcarryno(CK_LT, fRES(firmcarryno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterEqual(String firmcarryno) {
        regFirmcarryno(CK_GE, fRES(firmcarryno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessEqual(String firmcarryno) {
        regFirmcarryno(CK_LE, fRES(firmcarryno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarrynoList The collection of firmcarryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_InScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        regINS(CK_INS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FirmcarryNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarrynoList The collection of firmcarryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_NotInScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        regINS(CK_NINS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FirmcarryNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FirmcarryNo: {varchar(255)} <br>
     * <pre>e.g. setFirmcarryno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmcarryno The value of firmcarryno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmcarryno_LikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FirmcarryNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmcarryno_NotLikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FirmcarryNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_PrefixSearch(String firmcarryno) {
        setFirmcarryno_LikeSearch(firmcarryno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     */
    public void setFirmcarryno_IsNull() { regFirmcarryno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     */
    public void setFirmcarryno_IsNullOrEmpty() { regFirmcarryno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FirmcarryNo: {varchar(255)}
     */
    public void setFirmcarryno_IsNotNull() { regFirmcarryno(CK_ISNN, DOBJ); }

    protected void regFirmcarryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmcarryno(), "FirmcarryNo"); }
    protected abstract ConditionValue xgetCValueFirmcarryno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_Equal(String qty) {
        doSetQty_Equal(fRES(qty));
    }

    protected void doSetQty_Equal(String qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotEqual(String qty) {
        doSetQty_NotEqual(fRES(qty));
    }

    protected void doSetQty_NotEqual(String qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(String qty) {
        regQty(CK_GT, fRES(qty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_LessThan(String qty) {
        regQty(CK_LT, fRES(qty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(String qty) {
        regQty(CK_GE, fRES(qty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_LessEqual(String qty) {
        regQty(CK_LE, fRES(qty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Qty: {varchar(255)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<String> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<String> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "Qty");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Qty: {varchar(255)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<String> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<String> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "Qty");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Qty: {varchar(255)} <br>
     * <pre>e.g. setQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty The value of qty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty_LikeSearch(String qty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty), xgetCValueQty(), "Qty", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty_NotLikeSearch(String qty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty), xgetCValueQty(), "Qty", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Qty: {varchar(255)}
     * @param qty The value of qty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_PrefixSearch(String qty) {
        setQty_LikeSearch(qty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     */
    public void setQty_IsNullOrEmpty() { regQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Qty: {varchar(255)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "Qty"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_Equal(String inoutkbn) {
        doSetInoutkbn_Equal(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_Equal(String inoutkbn) {
        regInoutkbn(CK_EQ, inoutkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotEqual(String inoutkbn) {
        doSetInoutkbn_NotEqual(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_NotEqual(String inoutkbn) {
        regInoutkbn(CK_NES, inoutkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterThan(String inoutkbn) {
        regInoutkbn(CK_GT, fRES(inoutkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessThan(String inoutkbn) {
        regInoutkbn(CK_LT, fRES(inoutkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterEqual(String inoutkbn) {
        regInoutkbn(CK_GE, fRES(inoutkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessEqual(String inoutkbn) {
        regInoutkbn(CK_LE, fRES(inoutkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbnList The collection of inoutkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_InScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_InScope(inoutkbnList);
    }

    protected void doSetInoutkbn_InScope(Collection<String> inoutkbnList) {
        regINS(CK_INS, cTL(inoutkbnList), xgetCValueInoutkbn(), "InOutKbn");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbnList The collection of inoutkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_NotInScope(inoutkbnList);
    }

    protected void doSetInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        regINS(CK_NINS, cTL(inoutkbnList), xgetCValueInoutkbn(), "InOutKbn");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InOutKbn: {varchar(255)} <br>
     * <pre>e.g. setInoutkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inoutkbn The value of inoutkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInoutkbn_LikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inoutkbn), xgetCValueInoutkbn(), "InOutKbn", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutkbn_NotLikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutkbn), xgetCValueInoutkbn(), "InOutKbn", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InOutKbn: {varchar(255)}
     * @param inoutkbn The value of inoutkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_PrefixSearch(String inoutkbn) {
        setInoutkbn_LikeSearch(inoutkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     */
    public void setInoutkbn_IsNull() { regInoutkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     */
    public void setInoutkbn_IsNullOrEmpty() { regInoutkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * InOutKbn: {varchar(255)}
     */
    public void setInoutkbn_IsNotNull() { regInoutkbn(CK_ISNN, DOBJ); }

    protected void regInoutkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutkbn(), "InOutKbn"); }
    protected abstract ConditionValue xgetCValueInoutkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_Equal(String stocktype) {
        doSetStocktype_Equal(fRES(stocktype));
    }

    protected void doSetStocktype_Equal(String stocktype) {
        regStocktype(CK_EQ, stocktype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_NotEqual(String stocktype) {
        doSetStocktype_NotEqual(fRES(stocktype));
    }

    protected void doSetStocktype_NotEqual(String stocktype) {
        regStocktype(CK_NES, stocktype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_GreaterThan(String stocktype) {
        regStocktype(CK_GT, fRES(stocktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_LessThan(String stocktype) {
        regStocktype(CK_LT, fRES(stocktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_GreaterEqual(String stocktype) {
        regStocktype(CK_GE, fRES(stocktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_LessEqual(String stocktype) {
        regStocktype(CK_LE, fRES(stocktype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktypeList The collection of stocktype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_InScope(Collection<String> stocktypeList) {
        doSetStocktype_InScope(stocktypeList);
    }

    protected void doSetStocktype_InScope(Collection<String> stocktypeList) {
        regINS(CK_INS, cTL(stocktypeList), xgetCValueStocktype(), "StockType");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktypeList The collection of stocktype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_NotInScope(Collection<String> stocktypeList) {
        doSetStocktype_NotInScope(stocktypeList);
    }

    protected void doSetStocktype_NotInScope(Collection<String> stocktypeList) {
        regINS(CK_NINS, cTL(stocktypeList), xgetCValueStocktype(), "StockType");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * StockType: {varchar(255)} <br>
     * <pre>e.g. setStocktype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stocktype The value of stocktype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStocktype_LikeSearch(String stocktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stocktype), xgetCValueStocktype(), "StockType", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStocktype_NotLikeSearch(String stocktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stocktype), xgetCValueStocktype(), "StockType", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * StockType: {varchar(255)}
     * @param stocktype The value of stocktype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStocktype_PrefixSearch(String stocktype) {
        setStocktype_LikeSearch(stocktype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     */
    public void setStocktype_IsNull() { regStocktype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     */
    public void setStocktype_IsNullOrEmpty() { regStocktype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * StockType: {varchar(255)}
     */
    public void setStocktype_IsNotNull() { regStocktype(CK_ISNN, DOBJ); }

    protected void regStocktype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStocktype(), "StockType"); }
    protected abstract ConditionValue xgetCValueStocktype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_Equal(String customsreleasedate) {
        doSetCustomsreleasedate_Equal(fRES(customsreleasedate));
    }

    protected void doSetCustomsreleasedate_Equal(String customsreleasedate) {
        regCustomsreleasedate(CK_EQ, customsreleasedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_NotEqual(String customsreleasedate) {
        doSetCustomsreleasedate_NotEqual(fRES(customsreleasedate));
    }

    protected void doSetCustomsreleasedate_NotEqual(String customsreleasedate) {
        regCustomsreleasedate(CK_NES, customsreleasedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_GreaterThan(String customsreleasedate) {
        regCustomsreleasedate(CK_GT, fRES(customsreleasedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_LessThan(String customsreleasedate) {
        regCustomsreleasedate(CK_LT, fRES(customsreleasedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_GreaterEqual(String customsreleasedate) {
        regCustomsreleasedate(CK_GE, fRES(customsreleasedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_LessEqual(String customsreleasedate) {
        regCustomsreleasedate(CK_LE, fRES(customsreleasedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedateList The collection of customsreleasedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_InScope(Collection<String> customsreleasedateList) {
        doSetCustomsreleasedate_InScope(customsreleasedateList);
    }

    protected void doSetCustomsreleasedate_InScope(Collection<String> customsreleasedateList) {
        regINS(CK_INS, cTL(customsreleasedateList), xgetCValueCustomsreleasedate(), "CustomsReleaseDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedateList The collection of customsreleasedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_NotInScope(Collection<String> customsreleasedateList) {
        doSetCustomsreleasedate_NotInScope(customsreleasedateList);
    }

    protected void doSetCustomsreleasedate_NotInScope(Collection<String> customsreleasedateList) {
        regINS(CK_NINS, cTL(customsreleasedateList), xgetCValueCustomsreleasedate(), "CustomsReleaseDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CustomsReleaseDate: {varchar(255)} <br>
     * <pre>e.g. setCustomsreleasedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customsreleasedate The value of customsreleasedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomsreleasedate_LikeSearch(String customsreleasedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customsreleasedate), xgetCValueCustomsreleasedate(), "CustomsReleaseDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomsreleasedate_NotLikeSearch(String customsreleasedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customsreleasedate), xgetCValueCustomsreleasedate(), "CustomsReleaseDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @param customsreleasedate The value of customsreleasedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleasedate_PrefixSearch(String customsreleasedate) {
        setCustomsreleasedate_LikeSearch(customsreleasedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     */
    public void setCustomsreleasedate_IsNull() { regCustomsreleasedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     */
    public void setCustomsreleasedate_IsNullOrEmpty() { regCustomsreleasedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CustomsReleaseDate: {varchar(255)}
     */
    public void setCustomsreleasedate_IsNotNull() { regCustomsreleasedate(CK_ISNN, DOBJ); }

    protected void regCustomsreleasedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleasedate(), "CustomsReleaseDate"); }
    protected abstract ConditionValue xgetCValueCustomsreleasedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_Equal(String suppliercvno) {
        doSetSuppliercvno_Equal(fRES(suppliercvno));
    }

    protected void doSetSuppliercvno_Equal(String suppliercvno) {
        regSuppliercvno(CK_EQ, suppliercvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_NotEqual(String suppliercvno) {
        doSetSuppliercvno_NotEqual(fRES(suppliercvno));
    }

    protected void doSetSuppliercvno_NotEqual(String suppliercvno) {
        regSuppliercvno(CK_NES, suppliercvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_GreaterThan(String suppliercvno) {
        regSuppliercvno(CK_GT, fRES(suppliercvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_LessThan(String suppliercvno) {
        regSuppliercvno(CK_LT, fRES(suppliercvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_GreaterEqual(String suppliercvno) {
        regSuppliercvno(CK_GE, fRES(suppliercvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_LessEqual(String suppliercvno) {
        regSuppliercvno(CK_LE, fRES(suppliercvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvnoList The collection of suppliercvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_InScope(Collection<String> suppliercvnoList) {
        doSetSuppliercvno_InScope(suppliercvnoList);
    }

    protected void doSetSuppliercvno_InScope(Collection<String> suppliercvnoList) {
        regINS(CK_INS, cTL(suppliercvnoList), xgetCValueSuppliercvno(), "SupplierCvNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvnoList The collection of suppliercvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_NotInScope(Collection<String> suppliercvnoList) {
        doSetSuppliercvno_NotInScope(suppliercvnoList);
    }

    protected void doSetSuppliercvno_NotInScope(Collection<String> suppliercvnoList) {
        regINS(CK_NINS, cTL(suppliercvnoList), xgetCValueSuppliercvno(), "SupplierCvNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SupplierCvNo: {varchar(255)} <br>
     * <pre>e.g. setSuppliercvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercvno The value of suppliercvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercvno_LikeSearch(String suppliercvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercvno), xgetCValueSuppliercvno(), "SupplierCvNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercvno_NotLikeSearch(String suppliercvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercvno), xgetCValueSuppliercvno(), "SupplierCvNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     * @param suppliercvno The value of suppliercvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercvno_PrefixSearch(String suppliercvno) {
        setSuppliercvno_LikeSearch(suppliercvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     */
    public void setSuppliercvno_IsNull() { regSuppliercvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     */
    public void setSuppliercvno_IsNullOrEmpty() { regSuppliercvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SupplierCvNo: {varchar(255)}
     */
    public void setSuppliercvno_IsNotNull() { regSuppliercvno(CK_ISNN, DOBJ); }

    protected void regSuppliercvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercvno(), "SupplierCvNo"); }
    protected abstract ConditionValue xgetCValueSuppliercvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_Equal(String ifitemcd) {
        doSetIfitemcd_Equal(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_Equal(String ifitemcd) {
        regIfitemcd(CK_EQ, ifitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotEqual(String ifitemcd) {
        doSetIfitemcd_NotEqual(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_NotEqual(String ifitemcd) {
        regIfitemcd(CK_NES, ifitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterThan(String ifitemcd) {
        regIfitemcd(CK_GT, fRES(ifitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessThan(String ifitemcd) {
        regIfitemcd(CK_LT, fRES(ifitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterEqual(String ifitemcd) {
        regIfitemcd(CK_GE, fRES(ifitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessEqual(String ifitemcd) {
        regIfitemcd(CK_LE, fRES(ifitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcdList The collection of ifitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_InScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_InScope(ifitemcdList);
    }

    protected void doSetIfitemcd_InScope(Collection<String> ifitemcdList) {
        regINS(CK_INS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IfItemCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcdList The collection of ifitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_NotInScope(ifitemcdList);
    }

    protected void doSetIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        regINS(CK_NINS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IfItemCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IfItemCd: {varchar(255)} <br>
     * <pre>e.g. setIfitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemcd The value of ifitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemcd_LikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemcd), xgetCValueIfitemcd(), "IfItemCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemcd_NotLikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemcd), xgetCValueIfitemcd(), "IfItemCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IfItemCd: {varchar(255)}
     * @param ifitemcd The value of ifitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_PrefixSearch(String ifitemcd) {
        setIfitemcd_LikeSearch(ifitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     */
    public void setIfitemcd_IsNull() { regIfitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     */
    public void setIfitemcd_IsNullOrEmpty() { regIfitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IfItemCd: {varchar(255)}
     */
    public void setIfitemcd_IsNotNull() { regIfitemcd(CK_ISNN, DOBJ); }

    protected void regIfitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemcd(), "IfItemCd"); }
    protected abstract ConditionValue xgetCValueIfitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_Equal(String sendflg) {
        doSetSendflg_Equal(fRES(sendflg));
    }

    protected void doSetSendflg_Equal(String sendflg) {
        regSendflg(CK_EQ, sendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotEqual(String sendflg) {
        doSetSendflg_NotEqual(fRES(sendflg));
    }

    protected void doSetSendflg_NotEqual(String sendflg) {
        regSendflg(CK_NES, sendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_GreaterThan(String sendflg) {
        regSendflg(CK_GT, fRES(sendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_LessThan(String sendflg) {
        regSendflg(CK_LT, fRES(sendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_GreaterEqual(String sendflg) {
        regSendflg(CK_GE, fRES(sendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_LessEqual(String sendflg) {
        regSendflg(CK_LE, fRES(sendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflgList The collection of sendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_InScope(Collection<String> sendflgList) {
        doSetSendflg_InScope(sendflgList);
    }

    protected void doSetSendflg_InScope(Collection<String> sendflgList) {
        regINS(CK_INS, cTL(sendflgList), xgetCValueSendflg(), "SendFlg");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflgList The collection of sendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotInScope(Collection<String> sendflgList) {
        doSetSendflg_NotInScope(sendflgList);
    }

    protected void doSetSendflg_NotInScope(Collection<String> sendflgList) {
        regINS(CK_NINS, cTL(sendflgList), xgetCValueSendflg(), "SendFlg");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SendFlg: {varchar(255)} <br>
     * <pre>e.g. setSendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendflg The value of sendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendflg_LikeSearch(String sendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendflg), xgetCValueSendflg(), "SendFlg", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendflg_NotLikeSearch(String sendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendflg), xgetCValueSendflg(), "SendFlg", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SendFlg: {varchar(255)}
     * @param sendflg The value of sendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_PrefixSearch(String sendflg) {
        setSendflg_LikeSearch(sendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     */
    public void setSendflg_IsNull() { regSendflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     */
    public void setSendflg_IsNullOrEmpty() { regSendflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SendFlg: {varchar(255)}
     */
    public void setSendflg_IsNotNull() { regSendflg(CK_ISNN, DOBJ); }

    protected void regSendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendflg(), "SendFlg"); }
    protected abstract ConditionValue xgetCValueSendflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_Equal(String palletorder) {
        doSetPalletorder_Equal(fRES(palletorder));
    }

    protected void doSetPalletorder_Equal(String palletorder) {
        regPalletorder(CK_EQ, palletorder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_NotEqual(String palletorder) {
        doSetPalletorder_NotEqual(fRES(palletorder));
    }

    protected void doSetPalletorder_NotEqual(String palletorder) {
        regPalletorder(CK_NES, palletorder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_GreaterThan(String palletorder) {
        regPalletorder(CK_GT, fRES(palletorder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_LessThan(String palletorder) {
        regPalletorder(CK_LT, fRES(palletorder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_GreaterEqual(String palletorder) {
        regPalletorder(CK_GE, fRES(palletorder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_LessEqual(String palletorder) {
        regPalletorder(CK_LE, fRES(palletorder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorderList The collection of palletorder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_InScope(Collection<String> palletorderList) {
        doSetPalletorder_InScope(palletorderList);
    }

    protected void doSetPalletorder_InScope(Collection<String> palletorderList) {
        regINS(CK_INS, cTL(palletorderList), xgetCValuePalletorder(), "PalletOrder");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorderList The collection of palletorder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_NotInScope(Collection<String> palletorderList) {
        doSetPalletorder_NotInScope(palletorderList);
    }

    protected void doSetPalletorder_NotInScope(Collection<String> palletorderList) {
        regINS(CK_NINS, cTL(palletorderList), xgetCValuePalletorder(), "PalletOrder");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletOrder: {varchar(255)} <br>
     * <pre>e.g. setPalletorder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletorder The value of palletorder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletorder_LikeSearch(String palletorder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletorder), xgetCValuePalletorder(), "PalletOrder", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletorder_NotLikeSearch(String palletorder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletorder), xgetCValuePalletorder(), "PalletOrder", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletOrder: {varchar(255)}
     * @param palletorder The value of palletorder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletorder_PrefixSearch(String palletorder) {
        setPalletorder_LikeSearch(palletorder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     */
    public void setPalletorder_IsNull() { regPalletorder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     */
    public void setPalletorder_IsNullOrEmpty() { regPalletorder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PalletOrder: {varchar(255)}
     */
    public void setPalletorder_IsNotNull() { regPalletorder(CK_ISNN, DOBJ); }

    protected void regPalletorder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletorder(), "PalletOrder"); }
    protected abstract ConditionValue xgetCValuePalletorder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_Equal(String pallettype) {
        doSetPallettype_Equal(fRES(pallettype));
    }

    protected void doSetPallettype_Equal(String pallettype) {
        regPallettype(CK_EQ, pallettype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_NotEqual(String pallettype) {
        doSetPallettype_NotEqual(fRES(pallettype));
    }

    protected void doSetPallettype_NotEqual(String pallettype) {
        regPallettype(CK_NES, pallettype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_GreaterThan(String pallettype) {
        regPallettype(CK_GT, fRES(pallettype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_LessThan(String pallettype) {
        regPallettype(CK_LT, fRES(pallettype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_GreaterEqual(String pallettype) {
        regPallettype(CK_GE, fRES(pallettype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_LessEqual(String pallettype) {
        regPallettype(CK_LE, fRES(pallettype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettypeList The collection of pallettype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_InScope(Collection<String> pallettypeList) {
        doSetPallettype_InScope(pallettypeList);
    }

    protected void doSetPallettype_InScope(Collection<String> pallettypeList) {
        regINS(CK_INS, cTL(pallettypeList), xgetCValuePallettype(), "PalletType");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettypeList The collection of pallettype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_NotInScope(Collection<String> pallettypeList) {
        doSetPallettype_NotInScope(pallettypeList);
    }

    protected void doSetPallettype_NotInScope(Collection<String> pallettypeList) {
        regINS(CK_NINS, cTL(pallettypeList), xgetCValuePallettype(), "PalletType");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletType: {varchar(255)} <br>
     * <pre>e.g. setPallettype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pallettype The value of pallettype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPallettype_LikeSearch(String pallettype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pallettype), xgetCValuePallettype(), "PalletType", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPallettype_NotLikeSearch(String pallettype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pallettype), xgetCValuePallettype(), "PalletType", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PalletType: {varchar(255)}
     * @param pallettype The value of pallettype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPallettype_PrefixSearch(String pallettype) {
        setPallettype_LikeSearch(pallettype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     */
    public void setPallettype_IsNull() { regPallettype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     */
    public void setPallettype_IsNullOrEmpty() { regPallettype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PalletType: {varchar(255)}
     */
    public void setPallettype_IsNotNull() { regPallettype(CK_ISNN, DOBJ); }

    protected void regPallettype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePallettype(), "PalletType"); }
    protected abstract ConditionValue xgetCValuePallettype();

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
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EBondedShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EBondedShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EBondedShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EBondedShippingPlanBulkInputCB.class);
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
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EBondedShippingPlanBulkInputCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EBondedShippingPlanBulkInputCB&gt;() {
     *     public void query(EBondedShippingPlanBulkInputCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EBondedShippingPlanBulkInputCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EBondedShippingPlanBulkInputCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedShippingPlanBulkInputCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EBondedShippingPlanBulkInputCQ sq);

    protected EBondedShippingPlanBulkInputCB xcreateScalarConditionCB() {
        EBondedShippingPlanBulkInputCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EBondedShippingPlanBulkInputCB xcreateScalarConditionPartitionByCB() {
        EBondedShippingPlanBulkInputCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EBondedShippingPlanBulkInputCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedShippingPlanBulkInputCB cb = new EBondedShippingPlanBulkInputCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BONDED_SHIPPING_PLAN_BULK_INPUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EBondedShippingPlanBulkInputCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EBondedShippingPlanBulkInputCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EBondedShippingPlanBulkInputCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EBondedShippingPlanBulkInputCB cb = new EBondedShippingPlanBulkInputCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BONDED_SHIPPING_PLAN_BULK_INPUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EBondedShippingPlanBulkInputCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EBondedShippingPlanBulkInputCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EBondedShippingPlanBulkInputCB cb = new EBondedShippingPlanBulkInputCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EBondedShippingPlanBulkInputCQ sq);

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
    protected EBondedShippingPlanBulkInputCB newMyCB() {
        return new EBondedShippingPlanBulkInputCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EBondedShippingPlanBulkInputCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

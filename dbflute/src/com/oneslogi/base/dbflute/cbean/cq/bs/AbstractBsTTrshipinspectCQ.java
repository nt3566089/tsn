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
 * The abstract condition-query of T_TRSHIPINSPECT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrshipinspectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrshipinspectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSHIPINSPECT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_Equal(Long shippingInspectionId) {
        doSetShippingInspectionId_Equal(shippingInspectionId);
    }

    protected void doSetShippingInspectionId_Equal(Long shippingInspectionId) {
        regShippingInspectionId(CK_EQ, shippingInspectionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_NotEqual(Long shippingInspectionId) {
        doSetShippingInspectionId_NotEqual(shippingInspectionId);
    }

    protected void doSetShippingInspectionId_NotEqual(Long shippingInspectionId) {
        regShippingInspectionId(CK_NES, shippingInspectionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_GreaterThan(Long shippingInspectionId) {
        regShippingInspectionId(CK_GT, shippingInspectionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_LessThan(Long shippingInspectionId) {
        regShippingInspectionId(CK_LT, shippingInspectionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_GreaterEqual(Long shippingInspectionId) {
        regShippingInspectionId(CK_GE, shippingInspectionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionId The value of shippingInspectionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionId_LessEqual(Long shippingInspectionId) {
        regShippingInspectionId(CK_LE, shippingInspectionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingInspectionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInspectionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInspectionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInspectionId(), "SHIPPING_INSPECTION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionIdList The collection of shippingInspectionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInspectionId_InScope(Collection<Long> shippingInspectionIdList) {
        doSetShippingInspectionId_InScope(shippingInspectionIdList);
    }

    protected void doSetShippingInspectionId_InScope(Collection<Long> shippingInspectionIdList) {
        regINS(CK_INS, cTL(shippingInspectionIdList), xgetCValueShippingInspectionId(), "SHIPPING_INSPECTION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInspectionIdList The collection of shippingInspectionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInspectionId_NotInScope(Collection<Long> shippingInspectionIdList) {
        doSetShippingInspectionId_NotInScope(shippingInspectionIdList);
    }

    protected void doSetShippingInspectionId_NotInScope(Collection<Long> shippingInspectionIdList) {
        regINS(CK_NINS, cTL(shippingInspectionIdList), xgetCValueShippingInspectionId(), "SHIPPING_INSPECTION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInspectionId_IsNull() { regShippingInspectionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInspectionId_IsNotNull() { regShippingInspectionId(CK_ISNN, DOBJ); }

    protected void regShippingInspectionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInspectionId(), "SHIPPING_INSPECTION_ID"); }
    protected abstract ConditionValue xgetCValueShippingInspectionId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_Equal(Long shipinspectkey) {
        doSetShipinspectkey_Equal(shipinspectkey);
    }

    protected void doSetShipinspectkey_Equal(Long shipinspectkey) {
        regShipinspectkey(CK_EQ, shipinspectkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_NotEqual(Long shipinspectkey) {
        doSetShipinspectkey_NotEqual(shipinspectkey);
    }

    protected void doSetShipinspectkey_NotEqual(Long shipinspectkey) {
        regShipinspectkey(CK_NES, shipinspectkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_GreaterThan(Long shipinspectkey) {
        regShipinspectkey(CK_GT, shipinspectkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_LessThan(Long shipinspectkey) {
        regShipinspectkey(CK_LT, shipinspectkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_GreaterEqual(Long shipinspectkey) {
        regShipinspectkey(CK_GE, shipinspectkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkey The value of shipinspectkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipinspectkey_LessEqual(Long shipinspectkey) {
        regShipinspectkey(CK_LE, shipinspectkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of shipinspectkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shipinspectkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShipinspectkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShipinspectkey(), "SHIPINSPECTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkeyList The collection of shipinspectkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipinspectkey_InScope(Collection<Long> shipinspectkeyList) {
        doSetShipinspectkey_InScope(shipinspectkeyList);
    }

    protected void doSetShipinspectkey_InScope(Collection<Long> shipinspectkeyList) {
        regINS(CK_INS, cTL(shipinspectkeyList), xgetCValueShipinspectkey(), "SHIPINSPECTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPINSPECTKEY: {NotNull, bigint(19)}
     * @param shipinspectkeyList The collection of shipinspectkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipinspectkey_NotInScope(Collection<Long> shipinspectkeyList) {
        doSetShipinspectkey_NotInScope(shipinspectkeyList);
    }

    protected void doSetShipinspectkey_NotInScope(Collection<Long> shipinspectkeyList) {
        regINS(CK_NINS, cTL(shipinspectkeyList), xgetCValueShipinspectkey(), "SHIPINSPECTKEY");
    }

    protected void regShipinspectkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipinspectkey(), "SHIPINSPECTKEY"); }
    protected abstract ConditionValue xgetCValueShipinspectkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_Equal(Long pickingInstDetailId) {
        doSetPickingInstDetailId_Equal(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_Equal(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_EQ, pickingInstDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        doSetPickingInstDetailId_NotEqual(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_NES, pickingInstDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GT, pickingInstDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LT, pickingInstDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GE, pickingInstDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LE, pickingInstDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param minNumber The min number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_InScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_INS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_NotInScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_NINS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     */
    public void setPickingInstDetailId_IsNull() { regPickingInstDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     */
    public void setPickingInstDetailId_IsNotNull() { regPickingInstDetailId(CK_ISNN, DOBJ); }

    protected void regPickingInstDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstDetailId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_Equal(String tagcd) {
        doSetTagcd_Equal(fRES(tagcd));
    }

    protected void doSetTagcd_Equal(String tagcd) {
        regTagcd(CK_EQ, tagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotEqual(String tagcd) {
        doSetTagcd_NotEqual(fRES(tagcd));
    }

    protected void doSetTagcd_NotEqual(String tagcd) {
        regTagcd(CK_NES, tagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_InScope(Collection<String> tagcdList) {
        doSetTagcd_InScope(tagcdList);
    }

    protected void doSetTagcd_InScope(Collection<String> tagcdList) {
        regINS(CK_INS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcdList The collection of tagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotInScope(Collection<String> tagcdList) {
        doSetTagcd_NotInScope(tagcdList);
    }

    protected void doSetTagcd_NotInScope(Collection<String> tagcdList) {
        regINS(CK_NINS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)} <br>
     * <pre>e.g. setTagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagcd The value of tagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagcd_LikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNull() { regTagcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNullOrEmpty() { regTagcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAGCD: {varchar(30)}
     */
    public void setTagcd_IsNotNull() { regTagcd(CK_ISNN, DOBJ); }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_Equal(Long rootpackkey) {
        doSetRootpackkey_Equal(rootpackkey);
    }

    protected void doSetRootpackkey_Equal(Long rootpackkey) {
        regRootpackkey(CK_EQ, rootpackkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_NotEqual(Long rootpackkey) {
        doSetRootpackkey_NotEqual(rootpackkey);
    }

    protected void doSetRootpackkey_NotEqual(Long rootpackkey) {
        regRootpackkey(CK_NES, rootpackkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_GreaterThan(Long rootpackkey) {
        regRootpackkey(CK_GT, rootpackkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_LessThan(Long rootpackkey) {
        regRootpackkey(CK_LT, rootpackkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_GreaterEqual(Long rootpackkey) {
        regRootpackkey(CK_GE, rootpackkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkey The value of rootpackkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootpackkey_LessEqual(Long rootpackkey) {
        regRootpackkey(CK_LE, rootpackkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param minNumber The min number of rootpackkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rootpackkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRootpackkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRootpackkey(), "ROOTPACKKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkeyList The collection of rootpackkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRootpackkey_InScope(Collection<Long> rootpackkeyList) {
        doSetRootpackkey_InScope(rootpackkeyList);
    }

    protected void doSetRootpackkey_InScope(Collection<Long> rootpackkeyList) {
        regINS(CK_INS, cTL(rootpackkeyList), xgetCValueRootpackkey(), "ROOTPACKKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     * @param rootpackkeyList The collection of rootpackkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRootpackkey_NotInScope(Collection<Long> rootpackkeyList) {
        doSetRootpackkey_NotInScope(rootpackkeyList);
    }

    protected void doSetRootpackkey_NotInScope(Collection<Long> rootpackkeyList) {
        regINS(CK_NINS, cTL(rootpackkeyList), xgetCValueRootpackkey(), "ROOTPACKKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     */
    public void setRootpackkey_IsNull() { regRootpackkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROOTPACKKEY: {IX, bigint(19)}
     */
    public void setRootpackkey_IsNotNull() { regRootpackkey(CK_ISNN, DOBJ); }

    protected void regRootpackkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRootpackkey(), "ROOTPACKKEY"); }
    protected abstract ConditionValue xgetCValueRootpackkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_Equal(Long packkey) {
        doSetPackkey_Equal(packkey);
    }

    protected void doSetPackkey_Equal(Long packkey) {
        regPackkey(CK_EQ, packkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_NotEqual(Long packkey) {
        doSetPackkey_NotEqual(packkey);
    }

    protected void doSetPackkey_NotEqual(Long packkey) {
        regPackkey(CK_NES, packkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_GreaterThan(Long packkey) {
        regPackkey(CK_GT, packkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_LessThan(Long packkey) {
        regPackkey(CK_LT, packkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_GreaterEqual(Long packkey) {
        regPackkey(CK_GE, packkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkey The value of packkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackkey_LessEqual(Long packkey) {
        regPackkey(CK_LE, packkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param minNumber The min number of packkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackkey(), "PACKKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkeyList The collection of packkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackkey_InScope(Collection<Long> packkeyList) {
        doSetPackkey_InScope(packkeyList);
    }

    protected void doSetPackkey_InScope(Collection<Long> packkeyList) {
        regINS(CK_INS, cTL(packkeyList), xgetCValuePackkey(), "PACKKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     * @param packkeyList The collection of packkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackkey_NotInScope(Collection<Long> packkeyList) {
        doSetPackkey_NotInScope(packkeyList);
    }

    protected void doSetPackkey_NotInScope(Collection<Long> packkeyList) {
        regINS(CK_NINS, cTL(packkeyList), xgetCValuePackkey(), "PACKKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     */
    public void setPackkey_IsNull() { regPackkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKKEY: {IX, bigint(19)}
     */
    public void setPackkey_IsNotNull() { regPackkey(CK_ISNN, DOBJ); }

    protected void regPackkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackkey(), "PACKKEY"); }
    protected abstract ConditionValue xgetCValuePackkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_Equal(Long shippingInspectionRemainingId) {
        doSetShippingInspectionRemainingId_Equal(shippingInspectionRemainingId);
    }

    protected void doSetShippingInspectionRemainingId_Equal(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_EQ, shippingInspectionRemainingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_NotEqual(Long shippingInspectionRemainingId) {
        doSetShippingInspectionRemainingId_NotEqual(shippingInspectionRemainingId);
    }

    protected void doSetShippingInspectionRemainingId_NotEqual(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_NES, shippingInspectionRemainingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_GreaterThan(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_GT, shippingInspectionRemainingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_LessThan(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_LT, shippingInspectionRemainingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_GreaterEqual(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_GE, shippingInspectionRemainingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingId The value of shippingInspectionRemainingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_LessEqual(Long shippingInspectionRemainingId) {
        regShippingInspectionRemainingId(CK_LE, shippingInspectionRemainingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param minNumber The min number of shippingInspectionRemainingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInspectionRemainingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInspectionRemainingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInspectionRemainingId(), "SHIPPING_INSPECTION_REMAINING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingIdList The collection of shippingInspectionRemainingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_InScope(Collection<Long> shippingInspectionRemainingIdList) {
        doSetShippingInspectionRemainingId_InScope(shippingInspectionRemainingIdList);
    }

    protected void doSetShippingInspectionRemainingId_InScope(Collection<Long> shippingInspectionRemainingIdList) {
        regINS(CK_INS, cTL(shippingInspectionRemainingIdList), xgetCValueShippingInspectionRemainingId(), "SHIPPING_INSPECTION_REMAINING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     * @param shippingInspectionRemainingIdList The collection of shippingInspectionRemainingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInspectionRemainingId_NotInScope(Collection<Long> shippingInspectionRemainingIdList) {
        doSetShippingInspectionRemainingId_NotInScope(shippingInspectionRemainingIdList);
    }

    protected void doSetShippingInspectionRemainingId_NotInScope(Collection<Long> shippingInspectionRemainingIdList) {
        regINS(CK_NINS, cTL(shippingInspectionRemainingIdList), xgetCValueShippingInspectionRemainingId(), "SHIPPING_INSPECTION_REMAINING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     */
    public void setShippingInspectionRemainingId_IsNull() { regShippingInspectionRemainingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INSPECTION_REMAINING_ID: {bigint(19)}
     */
    public void setShippingInspectionRemainingId_IsNotNull() { regShippingInspectionRemainingId(CK_ISNN, DOBJ); }

    protected void regShippingInspectionRemainingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInspectionRemainingId(), "SHIPPING_INSPECTION_REMAINING_ID"); }
    protected abstract ConditionValue xgetCValueShippingInspectionRemainingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {IX+, NotNull, bigint(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_Equal(Long sodetailid) {
        doSetSodetailid_Equal(sodetailid);
    }

    protected void doSetSodetailid_Equal(Long sodetailid) {
        regSodetailid(CK_EQ, sodetailid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_NotEqual(Long sodetailid) {
        doSetSodetailid_NotEqual(sodetailid);
    }

    protected void doSetSodetailid_NotEqual(Long sodetailid) {
        regSodetailid(CK_NES, sodetailid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterThan(Long sodetailid) {
        regSodetailid(CK_GT, sodetailid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessThan(Long sodetailid) {
        regSodetailid(CK_LT, sodetailid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterEqual(Long sodetailid) {
        regSodetailid(CK_GE, sodetailid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailid The value of sodetailid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessEqual(Long sodetailid) {
        regSodetailid(CK_LE, sodetailid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param minNumber The min number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSodetailid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSodetailid(), "SODETAILID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailidList The collection of sodetailid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_InScope(Collection<Long> sodetailidList) {
        doSetSodetailid_InScope(sodetailidList);
    }

    protected void doSetSodetailid_InScope(Collection<Long> sodetailidList) {
        regINS(CK_INS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {NotNull, bigint(19)}
     * @param sodetailidList The collection of sodetailid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_NotInScope(Collection<Long> sodetailidList) {
        doSetSodetailid_NotInScope(sodetailidList);
    }

    protected void doSetSodetailid_NotInScope(Collection<Long> sodetailidList) {
        regINS(CK_NINS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    protected void regSodetailid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSodetailid(), "SODETAILID"); }
    protected abstract ConditionValue xgetCValueSodetailid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_Equal(Long deliverygroupkey) {
        doSetDeliverygroupkey_Equal(deliverygroupkey);
    }

    protected void doSetDeliverygroupkey_Equal(Long deliverygroupkey) {
        regDeliverygroupkey(CK_EQ, deliverygroupkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_NotEqual(Long deliverygroupkey) {
        doSetDeliverygroupkey_NotEqual(deliverygroupkey);
    }

    protected void doSetDeliverygroupkey_NotEqual(Long deliverygroupkey) {
        regDeliverygroupkey(CK_NES, deliverygroupkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_GreaterThan(Long deliverygroupkey) {
        regDeliverygroupkey(CK_GT, deliverygroupkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_LessThan(Long deliverygroupkey) {
        regDeliverygroupkey(CK_LT, deliverygroupkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_GreaterEqual(Long deliverygroupkey) {
        regDeliverygroupkey(CK_GE, deliverygroupkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkey The value of deliverygroupkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_LessEqual(Long deliverygroupkey) {
        regDeliverygroupkey(CK_LE, deliverygroupkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param minNumber The min number of deliverygroupkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliverygroupkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliverygroupkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkeyList The collection of deliverygroupkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_InScope(Collection<Long> deliverygroupkeyList) {
        doSetDeliverygroupkey_InScope(deliverygroupkeyList);
    }

    protected void doSetDeliverygroupkey_InScope(Collection<Long> deliverygroupkeyList) {
        regINS(CK_INS, cTL(deliverygroupkeyList), xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @param deliverygroupkeyList The collection of deliverygroupkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverygroupkey_NotInScope(Collection<Long> deliverygroupkeyList) {
        doSetDeliverygroupkey_NotInScope(deliverygroupkeyList);
    }

    protected void doSetDeliverygroupkey_NotInScope(Collection<Long> deliverygroupkeyList) {
        regINS(CK_NINS, cTL(deliverygroupkeyList), xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     */
    public void setDeliverygroupkey_IsNull() { regDeliverygroupkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     */
    public void setDeliverygroupkey_IsNotNull() { regDeliverygroupkey(CK_ISNN, DOBJ); }

    protected void regDeliverygroupkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverygroupkey(), "DELIVERYGROUPKEY"); }
    protected abstract ConditionValue xgetCValueDeliverygroupkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_Equal(Long wbkey) {
        doSetWbkey_Equal(wbkey);
    }

    protected void doSetWbkey_Equal(Long wbkey) {
        regWbkey(CK_EQ, wbkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_NotEqual(Long wbkey) {
        doSetWbkey_NotEqual(wbkey);
    }

    protected void doSetWbkey_NotEqual(Long wbkey) {
        regWbkey(CK_NES, wbkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_GreaterThan(Long wbkey) {
        regWbkey(CK_GT, wbkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_LessThan(Long wbkey) {
        regWbkey(CK_LT, wbkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_GreaterEqual(Long wbkey) {
        regWbkey(CK_GE, wbkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkey The value of wbkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWbkey_LessEqual(Long wbkey) {
        regWbkey(CK_LE, wbkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param minNumber The min number of wbkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wbkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWbkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWbkey(), "WBKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkeyList The collection of wbkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWbkey_InScope(Collection<Long> wbkeyList) {
        doSetWbkey_InScope(wbkeyList);
    }

    protected void doSetWbkey_InScope(Collection<Long> wbkeyList) {
        regINS(CK_INS, cTL(wbkeyList), xgetCValueWbkey(), "WBKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     * @param wbkeyList The collection of wbkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWbkey_NotInScope(Collection<Long> wbkeyList) {
        doSetWbkey_NotInScope(wbkeyList);
    }

    protected void doSetWbkey_NotInScope(Collection<Long> wbkeyList) {
        regINS(CK_NINS, cTL(wbkeyList), xgetCValueWbkey(), "WBKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     */
    public void setWbkey_IsNull() { regWbkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WBKEY: {IX, bigint(19)}
     */
    public void setWbkey_IsNotNull() { regWbkey(CK_ISNN, DOBJ); }

    protected void regWbkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWbkey(), "WBKEY"); }
    protected abstract ConditionValue xgetCValueWbkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_Equal(String productId) {
        doSetProductId_Equal(fRES(productId));
    }

    protected void doSetProductId_Equal(String productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(String productId) {
        doSetProductId_NotEqual(fRES(productId));
    }

    protected void doSetProductId_NotEqual(String productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(String productId) {
        regProductId(CK_GT, fRES(productId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessThan(String productId) {
        regProductId(CK_LT, fRES(productId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(String productId) {
        regProductId(CK_GE, fRES(productId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(String productId) {
        regProductId(CK_LE, fRES(productId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<String> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<String> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<String> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<String> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setProductId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productId The value of productId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductId_LikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductId_NotLikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, NotNull, varchar(30)}
     * @param productId The value of productId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_PrefixSearch(String productId) {
        setProductId_LikeSearch(productId, xcLSOPPre());
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
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
     * LOT_ID: {IX, NotNull, bigint(19)}
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
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
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
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_Equal(Long inspectedqty1) {
        doSetInspectedqty1_Equal(inspectedqty1);
    }

    protected void doSetInspectedqty1_Equal(Long inspectedqty1) {
        regInspectedqty1(CK_EQ, inspectedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotEqual(Long inspectedqty1) {
        doSetInspectedqty1_NotEqual(inspectedqty1);
    }

    protected void doSetInspectedqty1_NotEqual(Long inspectedqty1) {
        regInspectedqty1(CK_NES, inspectedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterThan(Long inspectedqty1) {
        regInspectedqty1(CK_GT, inspectedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessThan(Long inspectedqty1) {
        regInspectedqty1(CK_LT, inspectedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_GreaterEqual(Long inspectedqty1) {
        regInspectedqty1(CK_GE, inspectedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1 The value of inspectedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedqty1_LessEqual(Long inspectedqty1) {
        regInspectedqty1(CK_LE, inspectedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedqty1(), "INSPECTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_InScope(Collection<Long> inspectedqty1List) {
        doSetInspectedqty1_InScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_InScope(Collection<Long> inspectedqty1List) {
        regINS(CK_INS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedqty1List The collection of inspectedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedqty1_NotInScope(Collection<Long> inspectedqty1List) {
        doSetInspectedqty1_NotInScope(inspectedqty1List);
    }

    protected void doSetInspectedqty1_NotInScope(Collection<Long> inspectedqty1List) {
        regINS(CK_NINS, cTL(inspectedqty1List), xgetCValueInspectedqty1(), "INSPECTEDQTY1");
    }

    protected void regInspectedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedqty1(), "INSPECTEDQTY1"); }
    protected abstract ConditionValue xgetCValueInspectedqty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_Equal(String inspectusercd) {
        doSetInspectusercd_Equal(fRES(inspectusercd));
    }

    protected void doSetInspectusercd_Equal(String inspectusercd) {
        regInspectusercd(CK_EQ, inspectusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_NotEqual(String inspectusercd) {
        doSetInspectusercd_NotEqual(fRES(inspectusercd));
    }

    protected void doSetInspectusercd_NotEqual(String inspectusercd) {
        regInspectusercd(CK_NES, inspectusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_GreaterThan(String inspectusercd) {
        regInspectusercd(CK_GT, fRES(inspectusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_LessThan(String inspectusercd) {
        regInspectusercd(CK_LT, fRES(inspectusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_GreaterEqual(String inspectusercd) {
        regInspectusercd(CK_GE, fRES(inspectusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_LessEqual(String inspectusercd) {
        regInspectusercd(CK_LE, fRES(inspectusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercdList The collection of inspectusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_InScope(Collection<String> inspectusercdList) {
        doSetInspectusercd_InScope(inspectusercdList);
    }

    protected void doSetInspectusercd_InScope(Collection<String> inspectusercdList) {
        regINS(CK_INS, cTL(inspectusercdList), xgetCValueInspectusercd(), "INSPECTUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercdList The collection of inspectusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_NotInScope(Collection<String> inspectusercdList) {
        doSetInspectusercd_NotInScope(inspectusercdList);
    }

    protected void doSetInspectusercd_NotInScope(Collection<String> inspectusercdList) {
        regINS(CK_NINS, cTL(inspectusercdList), xgetCValueInspectusercd(), "INSPECTUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)} <br>
     * <pre>e.g. setInspectusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inspectusercd The value of inspectusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInspectusercd_LikeSearch(String inspectusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inspectusercd), xgetCValueInspectusercd(), "INSPECTUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInspectusercd_NotLikeSearch(String inspectusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inspectusercd), xgetCValueInspectusercd(), "INSPECTUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     * @param inspectusercd The value of inspectusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectusercd_PrefixSearch(String inspectusercd) {
        setInspectusercd_LikeSearch(inspectusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNull() { regInspectusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNullOrEmpty() { regInspectusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTUSERCD: {varchar(30)}
     */
    public void setInspectusercd_IsNotNull() { regInspectusercd(CK_ISNN, DOBJ); }

    protected void regInspectusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectusercd(), "INSPECTUSERCD"); }
    protected abstract ConditionValue xgetCValueInspectusercd();

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
    public HpSLCFunction<TTrshipinspectCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrshipinspectCB.class);
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
    public HpSLCFunction<TTrshipinspectCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrshipinspectCB.class);
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
    public HpSLCFunction<TTrshipinspectCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrshipinspectCB.class);
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
    public HpSLCFunction<TTrshipinspectCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrshipinspectCB.class);
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
    public HpSLCFunction<TTrshipinspectCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrshipinspectCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrshipinspectCB&gt;() {
     *     public void query(TTrshipinspectCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrshipinspectCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrshipinspectCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrshipinspectCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrshipinspectCQ sq);

    protected TTrshipinspectCB xcreateScalarConditionCB() {
        TTrshipinspectCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrshipinspectCB xcreateScalarConditionPartitionByCB() {
        TTrshipinspectCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrshipinspectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrshipinspectCB cb = new TTrshipinspectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INSPECTION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrshipinspectCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrshipinspectCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrshipinspectCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrshipinspectCB cb = new TTrshipinspectCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INSPECTION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrshipinspectCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrshipinspectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrshipinspectCB cb = new TTrshipinspectCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrshipinspectCQ sq);

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
    protected TTrshipinspectCB newMyCB() {
        return new TTrshipinspectCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrshipinspectCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of M_CARRIER_SLIP_YMT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierSlipYmtCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierSlipYmtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_SLIP_YMT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_Equal(Long carrierSlipYmtId) {
        doSetCarrierSlipYmtId_Equal(carrierSlipYmtId);
    }

    protected void doSetCarrierSlipYmtId_Equal(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_EQ, carrierSlipYmtId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_NotEqual(Long carrierSlipYmtId) {
        doSetCarrierSlipYmtId_NotEqual(carrierSlipYmtId);
    }

    protected void doSetCarrierSlipYmtId_NotEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_NES, carrierSlipYmtId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_GreaterThan(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_GT, carrierSlipYmtId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_LessThan(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_LT, carrierSlipYmtId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_GreaterEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_GE, carrierSlipYmtId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_LessEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_LE, carrierSlipYmtId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of carrierSlipYmtId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipYmtId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipYmtId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtIdList The collection of carrierSlipYmtId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_InScope(Collection<Long> carrierSlipYmtIdList) {
        doSetCarrierSlipYmtId_InScope(carrierSlipYmtIdList);
    }

    protected void doSetCarrierSlipYmtId_InScope(Collection<Long> carrierSlipYmtIdList) {
        regINS(CK_INS, cTL(carrierSlipYmtIdList), xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYmtIdList The collection of carrierSlipYmtId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_NotInScope(Collection<Long> carrierSlipYmtIdList) {
        doSetCarrierSlipYmtId_NotInScope(carrierSlipYmtIdList);
    }

    protected void doSetCarrierSlipYmtId_NotInScope(Collection<Long> carrierSlipYmtIdList) {
        regINS(CK_NINS, cTL(carrierSlipYmtIdList), xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_SLIP_YMT_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDeliveryCourseList for 'exists'. (NotNull)
     */
    public void existsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipYmtId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipYmtId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_SLIP_YMT_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCarrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDeliveryCourseList()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     courseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDeliveryCourseCB> derivedMDeliveryCourseList() {
        return xcreateQDRFunctionMDeliveryCourseList();
    }
    protected HpQDRFunction<MDeliveryCourseCB> xcreateQDRFunctionMDeliveryCourseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDeliveryCourseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipYmtId_IsNull() { regCarrierSlipYmtId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipYmtId_IsNotNull() { regCarrierSlipYmtId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipYmtId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipYmtId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_Equal(String tagType) {
        doSetTagType_Equal(fRES(tagType));
    }

    protected void doSetTagType_Equal(String tagType) {
        regTagType(CK_EQ, tagType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotEqual(String tagType) {
        doSetTagType_NotEqual(fRES(tagType));
    }

    protected void doSetTagType_NotEqual(String tagType) {
        regTagType(CK_NES, tagType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_GreaterThan(String tagType) {
        regTagType(CK_GT, fRES(tagType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_LessThan(String tagType) {
        regTagType(CK_LT, fRES(tagType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_GreaterEqual(String tagType) {
        regTagType(CK_GE, fRES(tagType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_LessEqual(String tagType) {
        regTagType(CK_LE, fRES(tagType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagTypeList The collection of tagType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_InScope(Collection<String> tagTypeList) {
        doSetTagType_InScope(tagTypeList);
    }

    protected void doSetTagType_InScope(Collection<String> tagTypeList) {
        regINS(CK_INS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagTypeList The collection of tagType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotInScope(Collection<String> tagTypeList) {
        doSetTagType_NotInScope(tagTypeList);
    }

    protected void doSetTagType_NotInScope(Collection<String> tagTypeList) {
        regINS(CK_NINS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setTagType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagType The value of tagType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagType_LikeSearch(String tagType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagType), xgetCValueTagType(), "TAG_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagType_NotLikeSearch(String tagType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagType), xgetCValueTagType(), "TAG_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @param tagType The value of tagType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_PrefixSearch(String tagType) {
        setTagType_LikeSearch(tagType, xcLSOPPre());
    }

    protected void regTagType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagType(), "TAG_TYPE"); }
    protected abstract ConditionValue xgetCValueTagType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_Equal(String tagNm) {
        doSetTagNm_Equal(fRES(tagNm));
    }

    protected void doSetTagNm_Equal(String tagNm) {
        regTagNm(CK_EQ, tagNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_NotEqual(String tagNm) {
        doSetTagNm_NotEqual(fRES(tagNm));
    }

    protected void doSetTagNm_NotEqual(String tagNm) {
        regTagNm(CK_NES, tagNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_GreaterThan(String tagNm) {
        regTagNm(CK_GT, fRES(tagNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_LessThan(String tagNm) {
        regTagNm(CK_LT, fRES(tagNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_GreaterEqual(String tagNm) {
        regTagNm(CK_GE, fRES(tagNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_LessEqual(String tagNm) {
        regTagNm(CK_LE, fRES(tagNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNmList The collection of tagNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_InScope(Collection<String> tagNmList) {
        doSetTagNm_InScope(tagNmList);
    }

    protected void doSetTagNm_InScope(Collection<String> tagNmList) {
        regINS(CK_INS, cTL(tagNmList), xgetCValueTagNm(), "TAG_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNmList The collection of tagNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_NotInScope(Collection<String> tagNmList) {
        doSetTagNm_NotInScope(tagNmList);
    }

    protected void doSetTagNm_NotInScope(Collection<String> tagNmList) {
        regINS(CK_NINS, cTL(tagNmList), xgetCValueTagNm(), "TAG_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_NM: {varchar(60)} <br>
     * <pre>e.g. setTagNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagNm The value of tagNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagNm_LikeSearch(String tagNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagNm), xgetCValueTagNm(), "TAG_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagNm_NotLikeSearch(String tagNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagNm), xgetCValueTagNm(), "TAG_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_NM: {varchar(60)}
     * @param tagNm The value of tagNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagNm_PrefixSearch(String tagNm) {
        setTagNm_LikeSearch(tagNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     */
    public void setTagNm_IsNull() { regTagNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     */
    public void setTagNm_IsNullOrEmpty() { regTagNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_NM: {varchar(60)}
     */
    public void setTagNm_IsNotNull() { regTagNm(CK_ISNN, DOBJ); }

    protected void regTagNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagNm(), "TAG_NM"); }
    protected abstract ConditionValue xgetCValueTagNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @param characterCd The value of characterCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_Equal(String characterCd) {
        doSetCharacterCd_Equal(fRES(characterCd));
    }

    /**
     * Equal(=). As CharacterCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCharacterCd_Equal_AsCharacterCd(CDef.CharacterCd cdef) {
        doSetCharacterCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $MS932 (MS932). And OnlyOnceRegistered. <br>
     * $MS932: MS932
     */
    public void setCharacterCd_Equal_$MS932() {
        setCharacterCd_Equal_AsCharacterCd(CDef.CharacterCd.$MS932);
    }

    /**
     * Equal(=). As $UTF8 (UTF8). And OnlyOnceRegistered. <br>
     * $UTF8: UTF8
     */
    public void setCharacterCd_Equal_$UTF8() {
        setCharacterCd_Equal_AsCharacterCd(CDef.CharacterCd.$UTF8);
    }

    protected void doSetCharacterCd_Equal(String characterCd) {
        regCharacterCd(CK_EQ, characterCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @param characterCd The value of characterCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotEqual(String characterCd) {
        doSetCharacterCd_NotEqual(fRES(characterCd));
    }

    /**
     * NotEqual(&lt;&gt;). As CharacterCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCharacterCd_NotEqual_AsCharacterCd(CDef.CharacterCd cdef) {
        doSetCharacterCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $MS932 (MS932). And OnlyOnceRegistered. <br>
     * $MS932: MS932
     */
    public void setCharacterCd_NotEqual_$MS932() {
        setCharacterCd_NotEqual_AsCharacterCd(CDef.CharacterCd.$MS932);
    }

    /**
     * NotEqual(&lt;&gt;). As $UTF8 (UTF8). And OnlyOnceRegistered. <br>
     * $UTF8: UTF8
     */
    public void setCharacterCd_NotEqual_$UTF8() {
        setCharacterCd_NotEqual_AsCharacterCd(CDef.CharacterCd.$UTF8);
    }

    protected void doSetCharacterCd_NotEqual(String characterCd) {
        regCharacterCd(CK_NES, characterCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @param characterCdList The collection of characterCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_InScope(Collection<String> characterCdList) {
        doSetCharacterCd_InScope(characterCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As CharacterCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_InScope_AsCharacterCd(Collection<CDef.CharacterCd> cdefList) {
        doSetCharacterCd_InScope(cTStrL(cdefList));
    }

    protected void doSetCharacterCd_InScope(Collection<String> characterCdList) {
        regINS(CK_INS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @param characterCdList The collection of characterCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotInScope(Collection<String> characterCdList) {
        doSetCharacterCd_NotInScope(characterCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CharacterCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotInScope_AsCharacterCd(Collection<CDef.CharacterCd> cdefList) {
        doSetCharacterCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCharacterCd_NotInScope(Collection<String> characterCdList) {
        regINS(CK_NINS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     */
    public void setCharacterCd_IsNull() { regCharacterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     */
    public void setCharacterCd_IsNullOrEmpty() { regCharacterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     */
    public void setCharacterCd_IsNotNull() { regCharacterCd(CK_ISNN, DOBJ); }

    protected void regCharacterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacterCd(), "CHARACTER_CD"); }
    protected abstract ConditionValue xgetCValueCharacterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @param slipType The value of slipType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_Equal(String slipType) {
        doSetSlipType_Equal(fRES(slipType));
    }

    /**
     * Equal(=). As SlipType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipType_Equal_AsSlipType(CDef.SlipType cdef) {
        doSetSlipType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 発払い
     */
    public void setSlipType_Equal_$0() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$0);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: コレクト
     */
    public void setSlipType_Equal_$2() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: メール便
     */
    public void setSlipType_Equal_$3() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: タイム
     */
    public void setSlipType_Equal_$4() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: 着払い
     */
    public void setSlipType_Equal_$5() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: メール便速達サービス
     */
    public void setSlipType_Equal_$6() {
        setSlipType_Equal_AsSlipType(CDef.SlipType.$6);
    }

    protected void doSetSlipType_Equal(String slipType) {
        regSlipType(CK_EQ, slipType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @param slipType The value of slipType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_NotEqual(String slipType) {
        doSetSlipType_NotEqual(fRES(slipType));
    }

    /**
     * NotEqual(&lt;&gt;). As SlipType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipType_NotEqual_AsSlipType(CDef.SlipType cdef) {
        doSetSlipType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 発払い
     */
    public void setSlipType_NotEqual_$0() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: コレクト
     */
    public void setSlipType_NotEqual_$2() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: メール便
     */
    public void setSlipType_NotEqual_$3() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: タイム
     */
    public void setSlipType_NotEqual_$4() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: 着払い
     */
    public void setSlipType_NotEqual_$5() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: メール便速達サービス
     */
    public void setSlipType_NotEqual_$6() {
        setSlipType_NotEqual_AsSlipType(CDef.SlipType.$6);
    }

    protected void doSetSlipType_NotEqual(String slipType) {
        regSlipType(CK_NES, slipType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @param slipTypeList The collection of slipType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_InScope(Collection<String> slipTypeList) {
        doSetSlipType_InScope(slipTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As SlipType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_InScope_AsSlipType(Collection<CDef.SlipType> cdefList) {
        doSetSlipType_InScope(cTStrL(cdefList));
    }

    protected void doSetSlipType_InScope(Collection<String> slipTypeList) {
        regINS(CK_INS, cTL(slipTypeList), xgetCValueSlipType(), "SLIP_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @param slipTypeList The collection of slipType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_NotInScope(Collection<String> slipTypeList) {
        doSetSlipType_NotInScope(slipTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SlipType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_NotInScope_AsSlipType(Collection<CDef.SlipType> cdefList) {
        doSetSlipType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlipType_NotInScope(Collection<String> slipTypeList) {
        regINS(CK_NINS, cTL(slipTypeList), xgetCValueSlipType(), "SLIP_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     */
    public void setSlipType_IsNull() { regSlipType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     */
    public void setSlipType_IsNullOrEmpty() { regSlipType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     */
    public void setSlipType_IsNotNull() { regSlipType(CK_ISNN, DOBJ); }

    protected void regSlipType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipType(), "SLIP_TYPE"); }
    protected abstract ConditionValue xgetCValueSlipType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @param coolCls The value of coolCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_Equal(String coolCls) {
        doSetCoolCls_Equal(fRES(coolCls));
    }

    /**
     * Equal(=). As CoolCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCoolCls_Equal_AsCoolCls(CDef.CoolCls cdef) {
        doSetCoolCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCoolCls_Equal_$0() {
        setCoolCls_Equal_AsCoolCls(CDef.CoolCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: クール冷凍
     */
    public void setCoolCls_Equal_$1() {
        setCoolCls_Equal_AsCoolCls(CDef.CoolCls.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: クール冷蔵
     */
    public void setCoolCls_Equal_$2() {
        setCoolCls_Equal_AsCoolCls(CDef.CoolCls.$2);
    }

    protected void doSetCoolCls_Equal(String coolCls) {
        regCoolCls(CK_EQ, coolCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @param coolCls The value of coolCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_NotEqual(String coolCls) {
        doSetCoolCls_NotEqual(fRES(coolCls));
    }

    /**
     * NotEqual(&lt;&gt;). As CoolCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCoolCls_NotEqual_AsCoolCls(CDef.CoolCls cdef) {
        doSetCoolCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCoolCls_NotEqual_$0() {
        setCoolCls_NotEqual_AsCoolCls(CDef.CoolCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: クール冷凍
     */
    public void setCoolCls_NotEqual_$1() {
        setCoolCls_NotEqual_AsCoolCls(CDef.CoolCls.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: クール冷蔵
     */
    public void setCoolCls_NotEqual_$2() {
        setCoolCls_NotEqual_AsCoolCls(CDef.CoolCls.$2);
    }

    protected void doSetCoolCls_NotEqual(String coolCls) {
        regCoolCls(CK_NES, coolCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @param coolClsList The collection of coolCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_InScope(Collection<String> coolClsList) {
        doSetCoolCls_InScope(coolClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As CoolCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_InScope_AsCoolCls(Collection<CDef.CoolCls> cdefList) {
        doSetCoolCls_InScope(cTStrL(cdefList));
    }

    protected void doSetCoolCls_InScope(Collection<String> coolClsList) {
        regINS(CK_INS, cTL(coolClsList), xgetCValueCoolCls(), "COOL_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @param coolClsList The collection of coolCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_NotInScope(Collection<String> coolClsList) {
        doSetCoolCls_NotInScope(coolClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CoolCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolCls_NotInScope_AsCoolCls(Collection<CDef.CoolCls> cdefList) {
        doSetCoolCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCoolCls_NotInScope(Collection<String> coolClsList) {
        regINS(CK_NINS, cTL(coolClsList), xgetCValueCoolCls(), "COOL_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     */
    public void setCoolCls_IsNull() { regCoolCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     */
    public void setCoolCls_IsNullOrEmpty() { regCoolCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     */
    public void setCoolCls_IsNotNull() { regCoolCls(CK_ISNN, DOBJ); }

    protected void regCoolCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCoolCls(), "COOL_CLS"); }
    protected abstract ConditionValue xgetCValueCoolCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_Equal(String honorific) {
        doSetHonorific_Equal(fRES(honorific));
    }

    protected void doSetHonorific_Equal(String honorific) {
        regHonorific(CK_EQ, honorific);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_NotEqual(String honorific) {
        doSetHonorific_NotEqual(fRES(honorific));
    }

    protected void doSetHonorific_NotEqual(String honorific) {
        regHonorific(CK_NES, honorific);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_GreaterThan(String honorific) {
        regHonorific(CK_GT, fRES(honorific));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_LessThan(String honorific) {
        regHonorific(CK_LT, fRES(honorific));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_GreaterEqual(String honorific) {
        regHonorific(CK_GE, fRES(honorific));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_LessEqual(String honorific) {
        regHonorific(CK_LE, fRES(honorific));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorificList The collection of honorific as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_InScope(Collection<String> honorificList) {
        doSetHonorific_InScope(honorificList);
    }

    protected void doSetHonorific_InScope(Collection<String> honorificList) {
        regINS(CK_INS, cTL(honorificList), xgetCValueHonorific(), "HONORIFIC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorificList The collection of honorific as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_NotInScope(Collection<String> honorificList) {
        doSetHonorific_NotInScope(honorificList);
    }

    protected void doSetHonorific_NotInScope(Collection<String> honorificList) {
        regINS(CK_NINS, cTL(honorificList), xgetCValueHonorific(), "HONORIFIC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HONORIFIC: {varchar(30)} <br>
     * <pre>e.g. setHonorific_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param honorific The value of honorific as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHonorific_LikeSearch(String honorific, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(honorific), xgetCValueHonorific(), "HONORIFIC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHonorific_NotLikeSearch(String honorific, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(honorific), xgetCValueHonorific(), "HONORIFIC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HONORIFIC: {varchar(30)}
     * @param honorific The value of honorific as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHonorific_PrefixSearch(String honorific) {
        setHonorific_LikeSearch(honorific, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     */
    public void setHonorific_IsNull() { regHonorific(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     */
    public void setHonorific_IsNullOrEmpty() { regHonorific(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HONORIFIC: {varchar(30)}
     */
    public void setHonorific_IsNotNull() { regHonorific(CK_ISNN, DOBJ); }

    protected void regHonorific(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHonorific(), "HONORIFIC"); }
    protected abstract ConditionValue xgetCValueHonorific();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @param packingShowFlg The value of packingShowFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_Equal(String packingShowFlg) {
        doSetPackingShowFlg_Equal(fRES(packingShowFlg));
    }

    /**
     * Equal(=). As PackingShowFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingShowFlg_Equal_AsPackingShowFlg(CDef.PackingShowFlg cdef) {
        doSetPackingShowFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 表示する
     */
    public void setPackingShowFlg_Equal_$0() {
        setPackingShowFlg_Equal_AsPackingShowFlg(CDef.PackingShowFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示しない
     */
    public void setPackingShowFlg_Equal_$1() {
        setPackingShowFlg_Equal_AsPackingShowFlg(CDef.PackingShowFlg.$1);
    }

    protected void doSetPackingShowFlg_Equal(String packingShowFlg) {
        regPackingShowFlg(CK_EQ, packingShowFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @param packingShowFlg The value of packingShowFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_NotEqual(String packingShowFlg) {
        doSetPackingShowFlg_NotEqual(fRES(packingShowFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingShowFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingShowFlg_NotEqual_AsPackingShowFlg(CDef.PackingShowFlg cdef) {
        doSetPackingShowFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 表示する
     */
    public void setPackingShowFlg_NotEqual_$0() {
        setPackingShowFlg_NotEqual_AsPackingShowFlg(CDef.PackingShowFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示しない
     */
    public void setPackingShowFlg_NotEqual_$1() {
        setPackingShowFlg_NotEqual_AsPackingShowFlg(CDef.PackingShowFlg.$1);
    }

    protected void doSetPackingShowFlg_NotEqual(String packingShowFlg) {
        regPackingShowFlg(CK_NES, packingShowFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @param packingShowFlgList The collection of packingShowFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_InScope(Collection<String> packingShowFlgList) {
        doSetPackingShowFlg_InScope(packingShowFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingShowFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_InScope_AsPackingShowFlg(Collection<CDef.PackingShowFlg> cdefList) {
        doSetPackingShowFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingShowFlg_InScope(Collection<String> packingShowFlgList) {
        regINS(CK_INS, cTL(packingShowFlgList), xgetCValuePackingShowFlg(), "PACKING_SHOW_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @param packingShowFlgList The collection of packingShowFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_NotInScope(Collection<String> packingShowFlgList) {
        doSetPackingShowFlg_NotInScope(packingShowFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingShowFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingShowFlg_NotInScope_AsPackingShowFlg(Collection<CDef.PackingShowFlg> cdefList) {
        doSetPackingShowFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingShowFlg_NotInScope(Collection<String> packingShowFlgList) {
        regINS(CK_NINS, cTL(packingShowFlgList), xgetCValuePackingShowFlg(), "PACKING_SHOW_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     */
    public void setPackingShowFlg_IsNull() { regPackingShowFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     */
    public void setPackingShowFlg_IsNotNull() { regPackingShowFlg(CK_ISNN, DOBJ); }

    protected void regPackingShowFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingShowFlg(), "PACKING_SHOW_FLG"); }
    protected abstract ConditionValue xgetCValuePackingShowFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_Equal(String slipClientTelNo) {
        doSetSlipClientTelNo_Equal(fRES(slipClientTelNo));
    }

    protected void doSetSlipClientTelNo_Equal(String slipClientTelNo) {
        regSlipClientTelNo(CK_EQ, slipClientTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_NotEqual(String slipClientTelNo) {
        doSetSlipClientTelNo_NotEqual(fRES(slipClientTelNo));
    }

    protected void doSetSlipClientTelNo_NotEqual(String slipClientTelNo) {
        regSlipClientTelNo(CK_NES, slipClientTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_GreaterThan(String slipClientTelNo) {
        regSlipClientTelNo(CK_GT, fRES(slipClientTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_LessThan(String slipClientTelNo) {
        regSlipClientTelNo(CK_LT, fRES(slipClientTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_GreaterEqual(String slipClientTelNo) {
        regSlipClientTelNo(CK_GE, fRES(slipClientTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_LessEqual(String slipClientTelNo) {
        regSlipClientTelNo(CK_LE, fRES(slipClientTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNoList The collection of slipClientTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_InScope(Collection<String> slipClientTelNoList) {
        doSetSlipClientTelNo_InScope(slipClientTelNoList);
    }

    protected void doSetSlipClientTelNo_InScope(Collection<String> slipClientTelNoList) {
        regINS(CK_INS, cTL(slipClientTelNoList), xgetCValueSlipClientTelNo(), "SLIP_CLIENT_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNoList The collection of slipClientTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_NotInScope(Collection<String> slipClientTelNoList) {
        doSetSlipClientTelNo_NotInScope(slipClientTelNoList);
    }

    protected void doSetSlipClientTelNo_NotInScope(Collection<String> slipClientTelNoList) {
        regINS(CK_NINS, cTL(slipClientTelNoList), xgetCValueSlipClientTelNo(), "SLIP_CLIENT_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)} <br>
     * <pre>e.g. setSlipClientTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientTelNo The value of slipClientTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientTelNo_LikeSearch(String slipClientTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientTelNo), xgetCValueSlipClientTelNo(), "SLIP_CLIENT_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientTelNo_NotLikeSearch(String slipClientTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientTelNo), xgetCValueSlipClientTelNo(), "SLIP_CLIENT_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @param slipClientTelNo The value of slipClientTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientTelNo_PrefixSearch(String slipClientTelNo) {
        setSlipClientTelNo_LikeSearch(slipClientTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     */
    public void setSlipClientTelNo_IsNull() { regSlipClientTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     */
    public void setSlipClientTelNo_IsNullOrEmpty() { regSlipClientTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     */
    public void setSlipClientTelNo_IsNotNull() { regSlipClientTelNo(CK_ISNN, DOBJ); }

    protected void regSlipClientTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientTelNo(), "SLIP_CLIENT_TEL_NO"); }
    protected abstract ConditionValue xgetCValueSlipClientTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_Equal(String slipClientZipCd) {
        doSetSlipClientZipCd_Equal(fRES(slipClientZipCd));
    }

    protected void doSetSlipClientZipCd_Equal(String slipClientZipCd) {
        regSlipClientZipCd(CK_EQ, slipClientZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_NotEqual(String slipClientZipCd) {
        doSetSlipClientZipCd_NotEqual(fRES(slipClientZipCd));
    }

    protected void doSetSlipClientZipCd_NotEqual(String slipClientZipCd) {
        regSlipClientZipCd(CK_NES, slipClientZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_GreaterThan(String slipClientZipCd) {
        regSlipClientZipCd(CK_GT, fRES(slipClientZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_LessThan(String slipClientZipCd) {
        regSlipClientZipCd(CK_LT, fRES(slipClientZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_GreaterEqual(String slipClientZipCd) {
        regSlipClientZipCd(CK_GE, fRES(slipClientZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_LessEqual(String slipClientZipCd) {
        regSlipClientZipCd(CK_LE, fRES(slipClientZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCdList The collection of slipClientZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_InScope(Collection<String> slipClientZipCdList) {
        doSetSlipClientZipCd_InScope(slipClientZipCdList);
    }

    protected void doSetSlipClientZipCd_InScope(Collection<String> slipClientZipCdList) {
        regINS(CK_INS, cTL(slipClientZipCdList), xgetCValueSlipClientZipCd(), "SLIP_CLIENT_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCdList The collection of slipClientZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_NotInScope(Collection<String> slipClientZipCdList) {
        doSetSlipClientZipCd_NotInScope(slipClientZipCdList);
    }

    protected void doSetSlipClientZipCd_NotInScope(Collection<String> slipClientZipCdList) {
        regINS(CK_NINS, cTL(slipClientZipCdList), xgetCValueSlipClientZipCd(), "SLIP_CLIENT_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)} <br>
     * <pre>e.g. setSlipClientZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientZipCd The value of slipClientZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientZipCd_LikeSearch(String slipClientZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientZipCd), xgetCValueSlipClientZipCd(), "SLIP_CLIENT_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientZipCd_NotLikeSearch(String slipClientZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientZipCd), xgetCValueSlipClientZipCd(), "SLIP_CLIENT_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @param slipClientZipCd The value of slipClientZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientZipCd_PrefixSearch(String slipClientZipCd) {
        setSlipClientZipCd_LikeSearch(slipClientZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     */
    public void setSlipClientZipCd_IsNull() { regSlipClientZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     */
    public void setSlipClientZipCd_IsNullOrEmpty() { regSlipClientZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     */
    public void setSlipClientZipCd_IsNotNull() { regSlipClientZipCd(CK_ISNN, DOBJ); }

    protected void regSlipClientZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientZipCd(), "SLIP_CLIENT_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueSlipClientZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_Equal(String slipClientAddress1) {
        doSetSlipClientAddress1_Equal(fRES(slipClientAddress1));
    }

    protected void doSetSlipClientAddress1_Equal(String slipClientAddress1) {
        regSlipClientAddress1(CK_EQ, slipClientAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_NotEqual(String slipClientAddress1) {
        doSetSlipClientAddress1_NotEqual(fRES(slipClientAddress1));
    }

    protected void doSetSlipClientAddress1_NotEqual(String slipClientAddress1) {
        regSlipClientAddress1(CK_NES, slipClientAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_GreaterThan(String slipClientAddress1) {
        regSlipClientAddress1(CK_GT, fRES(slipClientAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_LessThan(String slipClientAddress1) {
        regSlipClientAddress1(CK_LT, fRES(slipClientAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_GreaterEqual(String slipClientAddress1) {
        regSlipClientAddress1(CK_GE, fRES(slipClientAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_LessEqual(String slipClientAddress1) {
        regSlipClientAddress1(CK_LE, fRES(slipClientAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1List The collection of slipClientAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_InScope(Collection<String> slipClientAddress1List) {
        doSetSlipClientAddress1_InScope(slipClientAddress1List);
    }

    protected void doSetSlipClientAddress1_InScope(Collection<String> slipClientAddress1List) {
        regINS(CK_INS, cTL(slipClientAddress1List), xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1List The collection of slipClientAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_NotInScope(Collection<String> slipClientAddress1List) {
        doSetSlipClientAddress1_NotInScope(slipClientAddress1List);
    }

    protected void doSetSlipClientAddress1_NotInScope(Collection<String> slipClientAddress1List) {
        regINS(CK_NINS, cTL(slipClientAddress1List), xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)} <br>
     * <pre>e.g. setSlipClientAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientAddress1 The value of slipClientAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientAddress1_LikeSearch(String slipClientAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientAddress1), xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress1_NotLikeSearch(String slipClientAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress1), xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @param slipClientAddress1 The value of slipClientAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_PrefixSearch(String slipClientAddress1) {
        setSlipClientAddress1_LikeSearch(slipClientAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     */
    public void setSlipClientAddress1_IsNull() { regSlipClientAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     */
    public void setSlipClientAddress1_IsNullOrEmpty() { regSlipClientAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     */
    public void setSlipClientAddress1_IsNotNull() { regSlipClientAddress1(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_Equal(String slipClientAddress2) {
        doSetSlipClientAddress2_Equal(fRES(slipClientAddress2));
    }

    protected void doSetSlipClientAddress2_Equal(String slipClientAddress2) {
        regSlipClientAddress2(CK_EQ, slipClientAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_NotEqual(String slipClientAddress2) {
        doSetSlipClientAddress2_NotEqual(fRES(slipClientAddress2));
    }

    protected void doSetSlipClientAddress2_NotEqual(String slipClientAddress2) {
        regSlipClientAddress2(CK_NES, slipClientAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_GreaterThan(String slipClientAddress2) {
        regSlipClientAddress2(CK_GT, fRES(slipClientAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_LessThan(String slipClientAddress2) {
        regSlipClientAddress2(CK_LT, fRES(slipClientAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_GreaterEqual(String slipClientAddress2) {
        regSlipClientAddress2(CK_GE, fRES(slipClientAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_LessEqual(String slipClientAddress2) {
        regSlipClientAddress2(CK_LE, fRES(slipClientAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2List The collection of slipClientAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_InScope(Collection<String> slipClientAddress2List) {
        doSetSlipClientAddress2_InScope(slipClientAddress2List);
    }

    protected void doSetSlipClientAddress2_InScope(Collection<String> slipClientAddress2List) {
        regINS(CK_INS, cTL(slipClientAddress2List), xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2List The collection of slipClientAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_NotInScope(Collection<String> slipClientAddress2List) {
        doSetSlipClientAddress2_NotInScope(slipClientAddress2List);
    }

    protected void doSetSlipClientAddress2_NotInScope(Collection<String> slipClientAddress2List) {
        regINS(CK_NINS, cTL(slipClientAddress2List), xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)} <br>
     * <pre>e.g. setSlipClientAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientAddress2 The value of slipClientAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientAddress2_LikeSearch(String slipClientAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientAddress2), xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress2_NotLikeSearch(String slipClientAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress2), xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @param slipClientAddress2 The value of slipClientAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_PrefixSearch(String slipClientAddress2) {
        setSlipClientAddress2_LikeSearch(slipClientAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     */
    public void setSlipClientAddress2_IsNull() { regSlipClientAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     */
    public void setSlipClientAddress2_IsNullOrEmpty() { regSlipClientAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     */
    public void setSlipClientAddress2_IsNotNull() { regSlipClientAddress2(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_Equal(String slipClientAddress3) {
        doSetSlipClientAddress3_Equal(fRES(slipClientAddress3));
    }

    protected void doSetSlipClientAddress3_Equal(String slipClientAddress3) {
        regSlipClientAddress3(CK_EQ, slipClientAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_NotEqual(String slipClientAddress3) {
        doSetSlipClientAddress3_NotEqual(fRES(slipClientAddress3));
    }

    protected void doSetSlipClientAddress3_NotEqual(String slipClientAddress3) {
        regSlipClientAddress3(CK_NES, slipClientAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_GreaterThan(String slipClientAddress3) {
        regSlipClientAddress3(CK_GT, fRES(slipClientAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_LessThan(String slipClientAddress3) {
        regSlipClientAddress3(CK_LT, fRES(slipClientAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_GreaterEqual(String slipClientAddress3) {
        regSlipClientAddress3(CK_GE, fRES(slipClientAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_LessEqual(String slipClientAddress3) {
        regSlipClientAddress3(CK_LE, fRES(slipClientAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3List The collection of slipClientAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_InScope(Collection<String> slipClientAddress3List) {
        doSetSlipClientAddress3_InScope(slipClientAddress3List);
    }

    protected void doSetSlipClientAddress3_InScope(Collection<String> slipClientAddress3List) {
        regINS(CK_INS, cTL(slipClientAddress3List), xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3List The collection of slipClientAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_NotInScope(Collection<String> slipClientAddress3List) {
        doSetSlipClientAddress3_NotInScope(slipClientAddress3List);
    }

    protected void doSetSlipClientAddress3_NotInScope(Collection<String> slipClientAddress3List) {
        regINS(CK_NINS, cTL(slipClientAddress3List), xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)} <br>
     * <pre>e.g. setSlipClientAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientAddress3 The value of slipClientAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientAddress3_LikeSearch(String slipClientAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientAddress3), xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress3_NotLikeSearch(String slipClientAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress3), xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @param slipClientAddress3 The value of slipClientAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_PrefixSearch(String slipClientAddress3) {
        setSlipClientAddress3_LikeSearch(slipClientAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     */
    public void setSlipClientAddress3_IsNull() { regSlipClientAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     */
    public void setSlipClientAddress3_IsNullOrEmpty() { regSlipClientAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     */
    public void setSlipClientAddress3_IsNotNull() { regSlipClientAddress3(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_Equal(String slipClientAddress4) {
        doSetSlipClientAddress4_Equal(fRES(slipClientAddress4));
    }

    protected void doSetSlipClientAddress4_Equal(String slipClientAddress4) {
        regSlipClientAddress4(CK_EQ, slipClientAddress4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_NotEqual(String slipClientAddress4) {
        doSetSlipClientAddress4_NotEqual(fRES(slipClientAddress4));
    }

    protected void doSetSlipClientAddress4_NotEqual(String slipClientAddress4) {
        regSlipClientAddress4(CK_NES, slipClientAddress4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_GreaterThan(String slipClientAddress4) {
        regSlipClientAddress4(CK_GT, fRES(slipClientAddress4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_LessThan(String slipClientAddress4) {
        regSlipClientAddress4(CK_LT, fRES(slipClientAddress4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_GreaterEqual(String slipClientAddress4) {
        regSlipClientAddress4(CK_GE, fRES(slipClientAddress4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_LessEqual(String slipClientAddress4) {
        regSlipClientAddress4(CK_LE, fRES(slipClientAddress4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4List The collection of slipClientAddress4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_InScope(Collection<String> slipClientAddress4List) {
        doSetSlipClientAddress4_InScope(slipClientAddress4List);
    }

    protected void doSetSlipClientAddress4_InScope(Collection<String> slipClientAddress4List) {
        regINS(CK_INS, cTL(slipClientAddress4List), xgetCValueSlipClientAddress4(), "SLIP_CLIENT_ADDRESS4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4List The collection of slipClientAddress4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_NotInScope(Collection<String> slipClientAddress4List) {
        doSetSlipClientAddress4_NotInScope(slipClientAddress4List);
    }

    protected void doSetSlipClientAddress4_NotInScope(Collection<String> slipClientAddress4List) {
        regINS(CK_NINS, cTL(slipClientAddress4List), xgetCValueSlipClientAddress4(), "SLIP_CLIENT_ADDRESS4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)} <br>
     * <pre>e.g. setSlipClientAddress4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientAddress4 The value of slipClientAddress4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientAddress4_LikeSearch(String slipClientAddress4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientAddress4), xgetCValueSlipClientAddress4(), "SLIP_CLIENT_ADDRESS4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress4_NotLikeSearch(String slipClientAddress4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress4), xgetCValueSlipClientAddress4(), "SLIP_CLIENT_ADDRESS4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @param slipClientAddress4 The value of slipClientAddress4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress4_PrefixSearch(String slipClientAddress4) {
        setSlipClientAddress4_LikeSearch(slipClientAddress4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     */
    public void setSlipClientAddress4_IsNull() { regSlipClientAddress4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     */
    public void setSlipClientAddress4_IsNullOrEmpty() { regSlipClientAddress4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     */
    public void setSlipClientAddress4_IsNotNull() { regSlipClientAddress4(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress4(), "SLIP_CLIENT_ADDRESS4"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_Equal(String slipClientNm) {
        doSetSlipClientNm_Equal(fRES(slipClientNm));
    }

    protected void doSetSlipClientNm_Equal(String slipClientNm) {
        regSlipClientNm(CK_EQ, slipClientNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_NotEqual(String slipClientNm) {
        doSetSlipClientNm_NotEqual(fRES(slipClientNm));
    }

    protected void doSetSlipClientNm_NotEqual(String slipClientNm) {
        regSlipClientNm(CK_NES, slipClientNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_GreaterThan(String slipClientNm) {
        regSlipClientNm(CK_GT, fRES(slipClientNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_LessThan(String slipClientNm) {
        regSlipClientNm(CK_LT, fRES(slipClientNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_GreaterEqual(String slipClientNm) {
        regSlipClientNm(CK_GE, fRES(slipClientNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_LessEqual(String slipClientNm) {
        regSlipClientNm(CK_LE, fRES(slipClientNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNmList The collection of slipClientNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_InScope(Collection<String> slipClientNmList) {
        doSetSlipClientNm_InScope(slipClientNmList);
    }

    protected void doSetSlipClientNm_InScope(Collection<String> slipClientNmList) {
        regINS(CK_INS, cTL(slipClientNmList), xgetCValueSlipClientNm(), "SLIP_CLIENT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNmList The collection of slipClientNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_NotInScope(Collection<String> slipClientNmList) {
        doSetSlipClientNm_NotInScope(slipClientNmList);
    }

    protected void doSetSlipClientNm_NotInScope(Collection<String> slipClientNmList) {
        regINS(CK_NINS, cTL(slipClientNmList), xgetCValueSlipClientNm(), "SLIP_CLIENT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)} <br>
     * <pre>e.g. setSlipClientNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientNm The value of slipClientNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientNm_LikeSearch(String slipClientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientNm), xgetCValueSlipClientNm(), "SLIP_CLIENT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientNm_NotLikeSearch(String slipClientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientNm), xgetCValueSlipClientNm(), "SLIP_CLIENT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @param slipClientNm The value of slipClientNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm_PrefixSearch(String slipClientNm) {
        setSlipClientNm_LikeSearch(slipClientNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     */
    public void setSlipClientNm_IsNull() { regSlipClientNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     */
    public void setSlipClientNm_IsNullOrEmpty() { regSlipClientNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     */
    public void setSlipClientNm_IsNotNull() { regSlipClientNm(CK_ISNN, DOBJ); }

    protected void regSlipClientNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientNm(), "SLIP_CLIENT_NM"); }
    protected abstract ConditionValue xgetCValueSlipClientNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_Equal(String slipItemCd1) {
        doSetSlipItemCd1_Equal(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_Equal(String slipItemCd1) {
        regSlipItemCd1(CK_EQ, slipItemCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotEqual(String slipItemCd1) {
        doSetSlipItemCd1_NotEqual(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_NotEqual(String slipItemCd1) {
        regSlipItemCd1(CK_NES, slipItemCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterThan(String slipItemCd1) {
        regSlipItemCd1(CK_GT, fRES(slipItemCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessThan(String slipItemCd1) {
        regSlipItemCd1(CK_LT, fRES(slipItemCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterEqual(String slipItemCd1) {
        regSlipItemCd1(CK_GE, fRES(slipItemCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessEqual(String slipItemCd1) {
        regSlipItemCd1(CK_LE, fRES(slipItemCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_InScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        regINS(CK_INS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_NotInScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        regINS(CK_NINS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd1 The value of slipItemCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd1_LikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd1_NotLikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_PrefixSearch(String slipItemCd1) {
        setSlipItemCd1_LikeSearch(slipItemCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNull() { regSlipItemCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNullOrEmpty() { regSlipItemCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNotNull() { regSlipItemCd1(CK_ISNN, DOBJ); }

    protected void regSlipItemCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1"); }
    protected abstract ConditionValue xgetCValueSlipItemCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_Equal(String slipItemNm1) {
        doSetSlipItemNm1_Equal(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_Equal(String slipItemNm1) {
        regSlipItemNm1(CK_EQ, slipItemNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotEqual(String slipItemNm1) {
        doSetSlipItemNm1_NotEqual(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_NotEqual(String slipItemNm1) {
        regSlipItemNm1(CK_NES, slipItemNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterThan(String slipItemNm1) {
        regSlipItemNm1(CK_GT, fRES(slipItemNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessThan(String slipItemNm1) {
        regSlipItemNm1(CK_LT, fRES(slipItemNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterEqual(String slipItemNm1) {
        regSlipItemNm1(CK_GE, fRES(slipItemNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessEqual(String slipItemNm1) {
        regSlipItemNm1(CK_LE, fRES(slipItemNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1List The collection of slipItemNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_InScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        regINS(CK_INS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1List The collection of slipItemNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_NotInScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        regINS(CK_NINS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)} <br>
     * <pre>e.g. setSlipItemNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm1 The value of slipItemNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm1_LikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm1_NotLikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @param slipItemNm1 The value of slipItemNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_PrefixSearch(String slipItemNm1) {
        setSlipItemNm1_LikeSearch(slipItemNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     */
    public void setSlipItemNm1_IsNull() { regSlipItemNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     */
    public void setSlipItemNm1_IsNullOrEmpty() { regSlipItemNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     */
    public void setSlipItemNm1_IsNotNull() { regSlipItemNm1(CK_ISNN, DOBJ); }

    protected void regSlipItemNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1"); }
    protected abstract ConditionValue xgetCValueSlipItemNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_Equal(String slipItemCd2) {
        doSetSlipItemCd2_Equal(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_Equal(String slipItemCd2) {
        regSlipItemCd2(CK_EQ, slipItemCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotEqual(String slipItemCd2) {
        doSetSlipItemCd2_NotEqual(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_NotEqual(String slipItemCd2) {
        regSlipItemCd2(CK_NES, slipItemCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterThan(String slipItemCd2) {
        regSlipItemCd2(CK_GT, fRES(slipItemCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessThan(String slipItemCd2) {
        regSlipItemCd2(CK_LT, fRES(slipItemCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterEqual(String slipItemCd2) {
        regSlipItemCd2(CK_GE, fRES(slipItemCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessEqual(String slipItemCd2) {
        regSlipItemCd2(CK_LE, fRES(slipItemCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_InScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        regINS(CK_INS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_NotInScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        regINS(CK_NINS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd2 The value of slipItemCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd2_LikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd2_NotLikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_PrefixSearch(String slipItemCd2) {
        setSlipItemCd2_LikeSearch(slipItemCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNull() { regSlipItemCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNullOrEmpty() { regSlipItemCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNotNull() { regSlipItemCd2(CK_ISNN, DOBJ); }

    protected void regSlipItemCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2"); }
    protected abstract ConditionValue xgetCValueSlipItemCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_Equal(String slipItemNm2) {
        doSetSlipItemNm2_Equal(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_Equal(String slipItemNm2) {
        regSlipItemNm2(CK_EQ, slipItemNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotEqual(String slipItemNm2) {
        doSetSlipItemNm2_NotEqual(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_NotEqual(String slipItemNm2) {
        regSlipItemNm2(CK_NES, slipItemNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterThan(String slipItemNm2) {
        regSlipItemNm2(CK_GT, fRES(slipItemNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessThan(String slipItemNm2) {
        regSlipItemNm2(CK_LT, fRES(slipItemNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterEqual(String slipItemNm2) {
        regSlipItemNm2(CK_GE, fRES(slipItemNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessEqual(String slipItemNm2) {
        regSlipItemNm2(CK_LE, fRES(slipItemNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2List The collection of slipItemNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_InScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        regINS(CK_INS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2List The collection of slipItemNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_NotInScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        regINS(CK_NINS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)} <br>
     * <pre>e.g. setSlipItemNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm2 The value of slipItemNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm2_LikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm2_NotLikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @param slipItemNm2 The value of slipItemNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_PrefixSearch(String slipItemNm2) {
        setSlipItemNm2_LikeSearch(slipItemNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     */
    public void setSlipItemNm2_IsNull() { regSlipItemNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     */
    public void setSlipItemNm2_IsNullOrEmpty() { regSlipItemNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     */
    public void setSlipItemNm2_IsNotNull() { regSlipItemNm2(CK_ISNN, DOBJ); }

    protected void regSlipItemNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2"); }
    protected abstract ConditionValue xgetCValueSlipItemNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_Equal(String freightHandling1) {
        doSetFreightHandling1_Equal(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_Equal(String freightHandling1) {
        regFreightHandling1(CK_EQ, freightHandling1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotEqual(String freightHandling1) {
        doSetFreightHandling1_NotEqual(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_NotEqual(String freightHandling1) {
        regFreightHandling1(CK_NES, freightHandling1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterThan(String freightHandling1) {
        regFreightHandling1(CK_GT, fRES(freightHandling1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessThan(String freightHandling1) {
        regFreightHandling1(CK_LT, fRES(freightHandling1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterEqual(String freightHandling1) {
        regFreightHandling1(CK_GE, fRES(freightHandling1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessEqual(String freightHandling1) {
        regFreightHandling1(CK_LE, fRES(freightHandling1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1List The collection of freightHandling1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_InScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_InScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_InScope(Collection<String> freightHandling1List) {
        regINS(CK_INS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1List The collection of freightHandling1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_NotInScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        regINS(CK_NINS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)} <br>
     * <pre>e.g. setFreightHandling1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling1 The value of freightHandling1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling1_LikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling1_NotLikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @param freightHandling1 The value of freightHandling1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_PrefixSearch(String freightHandling1) {
        setFreightHandling1_LikeSearch(freightHandling1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     */
    public void setFreightHandling1_IsNull() { regFreightHandling1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     */
    public void setFreightHandling1_IsNullOrEmpty() { regFreightHandling1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     */
    public void setFreightHandling1_IsNotNull() { regFreightHandling1(CK_ISNN, DOBJ); }

    protected void regFreightHandling1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling1(), "FREIGHT_HANDLING1"); }
    protected abstract ConditionValue xgetCValueFreightHandling1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_Equal(String freightHandling2) {
        doSetFreightHandling2_Equal(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_Equal(String freightHandling2) {
        regFreightHandling2(CK_EQ, freightHandling2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotEqual(String freightHandling2) {
        doSetFreightHandling2_NotEqual(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_NotEqual(String freightHandling2) {
        regFreightHandling2(CK_NES, freightHandling2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterThan(String freightHandling2) {
        regFreightHandling2(CK_GT, fRES(freightHandling2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessThan(String freightHandling2) {
        regFreightHandling2(CK_LT, fRES(freightHandling2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterEqual(String freightHandling2) {
        regFreightHandling2(CK_GE, fRES(freightHandling2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessEqual(String freightHandling2) {
        regFreightHandling2(CK_LE, fRES(freightHandling2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2List The collection of freightHandling2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_InScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_InScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_InScope(Collection<String> freightHandling2List) {
        regINS(CK_INS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2List The collection of freightHandling2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_NotInScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        regINS(CK_NINS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)} <br>
     * <pre>e.g. setFreightHandling2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling2 The value of freightHandling2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling2_LikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling2_NotLikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @param freightHandling2 The value of freightHandling2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_PrefixSearch(String freightHandling2) {
        setFreightHandling2_LikeSearch(freightHandling2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     */
    public void setFreightHandling2_IsNull() { regFreightHandling2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     */
    public void setFreightHandling2_IsNullOrEmpty() { regFreightHandling2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     */
    public void setFreightHandling2_IsNotNull() { regFreightHandling2(CK_ISNN, DOBJ); }

    protected void regFreightHandling2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling2(), "FREIGHT_HANDLING2"); }
    protected abstract ConditionValue xgetCValueFreightHandling2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_Equal(String article) {
        doSetArticle_Equal(fRES(article));
    }

    protected void doSetArticle_Equal(String article) {
        regArticle(CK_EQ, article);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotEqual(String article) {
        doSetArticle_NotEqual(fRES(article));
    }

    protected void doSetArticle_NotEqual(String article) {
        regArticle(CK_NES, article);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterThan(String article) {
        regArticle(CK_GT, fRES(article));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessThan(String article) {
        regArticle(CK_LT, fRES(article));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterEqual(String article) {
        regArticle(CK_GE, fRES(article));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessEqual(String article) {
        regArticle(CK_LE, fRES(article));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_InScope(Collection<String> articleList) {
        doSetArticle_InScope(articleList);
    }

    protected void doSetArticle_InScope(Collection<String> articleList) {
        regINS(CK_INS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotInScope(Collection<String> articleList) {
        doSetArticle_NotInScope(articleList);
    }

    protected void doSetArticle_NotInScope(Collection<String> articleList) {
        regINS(CK_NINS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)} <br>
     * <pre>e.g. setArticle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param article The value of article as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArticle_LikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArticle_NotLikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_PrefixSearch(String article) {
        setArticle_LikeSearch(article, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNull() { regArticle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNullOrEmpty() { regArticle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNotNull() { regArticle(CK_ISNN, DOBJ); }

    protected void regArticle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticle(), "ARTICLE"); }
    protected abstract ConditionValue xgetCValueArticle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_Equal(String billingCustomerCd) {
        doSetBillingCustomerCd_Equal(fRES(billingCustomerCd));
    }

    protected void doSetBillingCustomerCd_Equal(String billingCustomerCd) {
        regBillingCustomerCd(CK_EQ, billingCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_NotEqual(String billingCustomerCd) {
        doSetBillingCustomerCd_NotEqual(fRES(billingCustomerCd));
    }

    protected void doSetBillingCustomerCd_NotEqual(String billingCustomerCd) {
        regBillingCustomerCd(CK_NES, billingCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_GreaterThan(String billingCustomerCd) {
        regBillingCustomerCd(CK_GT, fRES(billingCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_LessThan(String billingCustomerCd) {
        regBillingCustomerCd(CK_LT, fRES(billingCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_GreaterEqual(String billingCustomerCd) {
        regBillingCustomerCd(CK_GE, fRES(billingCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_LessEqual(String billingCustomerCd) {
        regBillingCustomerCd(CK_LE, fRES(billingCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCdList The collection of billingCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_InScope(Collection<String> billingCustomerCdList) {
        doSetBillingCustomerCd_InScope(billingCustomerCdList);
    }

    protected void doSetBillingCustomerCd_InScope(Collection<String> billingCustomerCdList) {
        regINS(CK_INS, cTL(billingCustomerCdList), xgetCValueBillingCustomerCd(), "BILLING_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCdList The collection of billingCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_NotInScope(Collection<String> billingCustomerCdList) {
        doSetBillingCustomerCd_NotInScope(billingCustomerCdList);
    }

    protected void doSetBillingCustomerCd_NotInScope(Collection<String> billingCustomerCdList) {
        regINS(CK_NINS, cTL(billingCustomerCdList), xgetCValueBillingCustomerCd(), "BILLING_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)} <br>
     * <pre>e.g. setBillingCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billingCustomerCd The value of billingCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillingCustomerCd_LikeSearch(String billingCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billingCustomerCd), xgetCValueBillingCustomerCd(), "BILLING_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillingCustomerCd_NotLikeSearch(String billingCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billingCustomerCd), xgetCValueBillingCustomerCd(), "BILLING_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @param billingCustomerCd The value of billingCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillingCustomerCd_PrefixSearch(String billingCustomerCd) {
        setBillingCustomerCd_LikeSearch(billingCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     */
    public void setBillingCustomerCd_IsNull() { regBillingCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     */
    public void setBillingCustomerCd_IsNullOrEmpty() { regBillingCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     */
    public void setBillingCustomerCd_IsNotNull() { regBillingCustomerCd(CK_ISNN, DOBJ); }

    protected void regBillingCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillingCustomerCd(), "BILLING_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueBillingCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_Equal(String fareNo) {
        doSetFareNo_Equal(fRES(fareNo));
    }

    protected void doSetFareNo_Equal(String fareNo) {
        regFareNo(CK_EQ, fareNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_NotEqual(String fareNo) {
        doSetFareNo_NotEqual(fRES(fareNo));
    }

    protected void doSetFareNo_NotEqual(String fareNo) {
        regFareNo(CK_NES, fareNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_GreaterThan(String fareNo) {
        regFareNo(CK_GT, fRES(fareNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_LessThan(String fareNo) {
        regFareNo(CK_LT, fRES(fareNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_GreaterEqual(String fareNo) {
        regFareNo(CK_GE, fRES(fareNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_LessEqual(String fareNo) {
        regFareNo(CK_LE, fRES(fareNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNoList The collection of fareNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_InScope(Collection<String> fareNoList) {
        doSetFareNo_InScope(fareNoList);
    }

    protected void doSetFareNo_InScope(Collection<String> fareNoList) {
        regINS(CK_INS, cTL(fareNoList), xgetCValueFareNo(), "FARE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNoList The collection of fareNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_NotInScope(Collection<String> fareNoList) {
        doSetFareNo_NotInScope(fareNoList);
    }

    protected void doSetFareNo_NotInScope(Collection<String> fareNoList) {
        regINS(CK_NINS, cTL(fareNoList), xgetCValueFareNo(), "FARE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FARE_NO: {varchar(30)} <br>
     * <pre>e.g. setFareNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fareNo The value of fareNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFareNo_LikeSearch(String fareNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fareNo), xgetCValueFareNo(), "FARE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFareNo_NotLikeSearch(String fareNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fareNo), xgetCValueFareNo(), "FARE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FARE_NO: {varchar(30)}
     * @param fareNo The value of fareNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFareNo_PrefixSearch(String fareNo) {
        setFareNo_LikeSearch(fareNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     */
    public void setFareNo_IsNull() { regFareNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     */
    public void setFareNo_IsNullOrEmpty() { regFareNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FARE_NO: {varchar(30)}
     */
    public void setFareNo_IsNotNull() { regFareNo(CK_ISNN, DOBJ); }

    protected void regFareNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFareNo(), "FARE_NO"); }
    protected abstract ConditionValue xgetCValueFareNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_Equal(String sendCd) {
        doSetSendCd_Equal(fRES(sendCd));
    }

    protected void doSetSendCd_Equal(String sendCd) {
        regSendCd(CK_EQ, sendCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotEqual(String sendCd) {
        doSetSendCd_NotEqual(fRES(sendCd));
    }

    protected void doSetSendCd_NotEqual(String sendCd) {
        regSendCd(CK_NES, sendCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_InScope(Collection<String> sendCdList) {
        doSetSendCd_InScope(sendCdList);
    }

    protected void doSetSendCd_InScope(Collection<String> sendCdList) {
        regINS(CK_INS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotInScope(Collection<String> sendCdList) {
        doSetSendCd_NotInScope(sendCdList);
    }

    protected void doSetSendCd_NotInScope(Collection<String> sendCdList) {
        regINS(CK_NINS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)} <br>
     * <pre>e.g. setSendCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendCd The value of sendCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendCd_LikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNull() { regSendCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNullOrEmpty() { regSendCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNotNull() { regSendCd(CK_ISNN, DOBJ); }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierSlipYmtCB.class);
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
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierSlipYmtCB.class);
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
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierSlipYmtCB.class);
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
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierSlipYmtCB.class);
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
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierSlipYmtCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierSlipYmtCB&gt;() {
     *     public void query(MCarrierSlipYmtCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierSlipYmtCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierSlipYmtCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierSlipYmtCQ sq);

    protected MCarrierSlipYmtCB xcreateScalarConditionCB() {
        MCarrierSlipYmtCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierSlipYmtCB xcreateScalarConditionPartitionByCB() {
        MCarrierSlipYmtCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierSlipYmtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_SLIP_YMT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierSlipYmtCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYmtCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierSlipYmtCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_SLIP_YMT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierSlipYmtCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierSlipYmtCQ sq);

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
    protected MCarrierSlipYmtCB newMyCB() {
        return new MCarrierSlipYmtCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierSlipYmtCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

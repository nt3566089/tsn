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
 * The abstract condition-query of M_CARRIER_SLIP_YUPK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierSlipYupkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierSlipYupkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_SLIP_YUPK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_Equal(Long carrierSlipYupkId) {
        doSetCarrierSlipYupkId_Equal(carrierSlipYupkId);
    }

    protected void doSetCarrierSlipYupkId_Equal(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_EQ, carrierSlipYupkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_NotEqual(Long carrierSlipYupkId) {
        doSetCarrierSlipYupkId_NotEqual(carrierSlipYupkId);
    }

    protected void doSetCarrierSlipYupkId_NotEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_NES, carrierSlipYupkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_GreaterThan(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_GT, carrierSlipYupkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_LessThan(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_LT, carrierSlipYupkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_GreaterEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_GE, carrierSlipYupkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_LessEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_LE, carrierSlipYupkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of carrierSlipYupkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipYupkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipYupkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkIdList The collection of carrierSlipYupkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_InScope(Collection<Long> carrierSlipYupkIdList) {
        doSetCarrierSlipYupkId_InScope(carrierSlipYupkIdList);
    }

    protected void doSetCarrierSlipYupkId_InScope(Collection<Long> carrierSlipYupkIdList) {
        regINS(CK_INS, cTL(carrierSlipYupkIdList), xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipYupkIdList The collection of carrierSlipYupkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_NotInScope(Collection<Long> carrierSlipYupkIdList) {
        doSetCarrierSlipYupkId_NotInScope(carrierSlipYupkIdList);
    }

    protected void doSetCarrierSlipYupkId_NotInScope(Collection<Long> carrierSlipYupkIdList) {
        regINS(CK_NINS, cTL(carrierSlipYupkIdList), xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_SLIP_YUPK_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipYupkId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipYupkId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_SLIP_YUPK_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCarrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipYupkId_IsNull() { regCarrierSlipYupkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipYupkId_IsNotNull() { regCarrierSlipYupkId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipYupkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipYupkId();

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
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @param postType The value of postType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_Equal(String postType) {
        doSetPostType_Equal(fRES(postType));
    }

    /**
     * Equal(=). As PostType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPostType_Equal_AsPostType(CDef.PostType cdef) {
        doSetPostType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ゆうパック
     */
    public void setPostType_Equal_$0() {
        setPostType_Equal_AsPostType(CDef.PostType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ゆうメール
     */
    public void setPostType_Equal_$1() {
        setPostType_Equal_AsPostType(CDef.PostType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 通常(定型)
     */
    public void setPostType_Equal_$2() {
        setPostType_Equal_AsPostType(CDef.PostType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 通常(定型外)
     */
    public void setPostType_Equal_$3() {
        setPostType_Equal_AsPostType(CDef.PostType.$3);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ポスパケット
     */
    public void setPostType_Equal_$5() {
        setPostType_Equal_AsPostType(CDef.PostType.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: 宛名ラベル
     */
    public void setPostType_Equal_$6() {
        setPostType_Equal_AsPostType(CDef.PostType.$6);
    }

    protected void doSetPostType_Equal(String postType) {
        regPostType(CK_EQ, postType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @param postType The value of postType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_NotEqual(String postType) {
        doSetPostType_NotEqual(fRES(postType));
    }

    /**
     * NotEqual(&lt;&gt;). As PostType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPostType_NotEqual_AsPostType(CDef.PostType cdef) {
        doSetPostType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ゆうパック
     */
    public void setPostType_NotEqual_$0() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ゆうメール
     */
    public void setPostType_NotEqual_$1() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 通常(定型)
     */
    public void setPostType_NotEqual_$2() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: 通常(定型外)
     */
    public void setPostType_NotEqual_$3() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ポスパケット
     */
    public void setPostType_NotEqual_$5() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: 宛名ラベル
     */
    public void setPostType_NotEqual_$6() {
        setPostType_NotEqual_AsPostType(CDef.PostType.$6);
    }

    protected void doSetPostType_NotEqual(String postType) {
        regPostType(CK_NES, postType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @param postTypeList The collection of postType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_InScope(Collection<String> postTypeList) {
        doSetPostType_InScope(postTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As PostType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_InScope_AsPostType(Collection<CDef.PostType> cdefList) {
        doSetPostType_InScope(cTStrL(cdefList));
    }

    protected void doSetPostType_InScope(Collection<String> postTypeList) {
        regINS(CK_INS, cTL(postTypeList), xgetCValuePostType(), "POST_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @param postTypeList The collection of postType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_NotInScope(Collection<String> postTypeList) {
        doSetPostType_NotInScope(postTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PostType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostType_NotInScope_AsPostType(Collection<CDef.PostType> cdefList) {
        doSetPostType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPostType_NotInScope(Collection<String> postTypeList) {
        regINS(CK_NINS, cTL(postTypeList), xgetCValuePostType(), "POST_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     */
    public void setPostType_IsNull() { regPostType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     */
    public void setPostType_IsNullOrEmpty() { regPostType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     */
    public void setPostType_IsNotNull() { regPostType(CK_ISNN, DOBJ); }

    protected void regPostType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostType(), "POST_TYPE"); }
    protected abstract ConditionValue xgetCValuePostType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @param coolType The value of coolType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_Equal(String coolType) {
        doSetCoolType_Equal(fRES(coolType));
    }

    /**
     * Equal(=). As CoolType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCoolType_Equal_AsCoolType(CDef.CoolType cdef) {
        doSetCoolType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 保冷なし
     */
    public void setCoolType_Equal_$0() {
        setCoolType_Equal_AsCoolType(CDef.CoolType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: チルド
     */
    public void setCoolType_Equal_$1() {
        setCoolType_Equal_AsCoolType(CDef.CoolType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 冷凍
     */
    public void setCoolType_Equal_$2() {
        setCoolType_Equal_AsCoolType(CDef.CoolType.$2);
    }

    protected void doSetCoolType_Equal(String coolType) {
        regCoolType(CK_EQ, coolType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @param coolType The value of coolType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_NotEqual(String coolType) {
        doSetCoolType_NotEqual(fRES(coolType));
    }

    /**
     * NotEqual(&lt;&gt;). As CoolType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCoolType_NotEqual_AsCoolType(CDef.CoolType cdef) {
        doSetCoolType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 保冷なし
     */
    public void setCoolType_NotEqual_$0() {
        setCoolType_NotEqual_AsCoolType(CDef.CoolType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: チルド
     */
    public void setCoolType_NotEqual_$1() {
        setCoolType_NotEqual_AsCoolType(CDef.CoolType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 冷凍
     */
    public void setCoolType_NotEqual_$2() {
        setCoolType_NotEqual_AsCoolType(CDef.CoolType.$2);
    }

    protected void doSetCoolType_NotEqual(String coolType) {
        regCoolType(CK_NES, coolType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @param coolTypeList The collection of coolType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_InScope(Collection<String> coolTypeList) {
        doSetCoolType_InScope(coolTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CoolType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_InScope_AsCoolType(Collection<CDef.CoolType> cdefList) {
        doSetCoolType_InScope(cTStrL(cdefList));
    }

    protected void doSetCoolType_InScope(Collection<String> coolTypeList) {
        regINS(CK_INS, cTL(coolTypeList), xgetCValueCoolType(), "COOL_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @param coolTypeList The collection of coolType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_NotInScope(Collection<String> coolTypeList) {
        doSetCoolType_NotInScope(coolTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CoolType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCoolType_NotInScope_AsCoolType(Collection<CDef.CoolType> cdefList) {
        doSetCoolType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCoolType_NotInScope(Collection<String> coolTypeList) {
        regINS(CK_NINS, cTL(coolTypeList), xgetCValueCoolType(), "COOL_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     */
    public void setCoolType_IsNull() { regCoolType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     */
    public void setCoolType_IsNullOrEmpty() { regCoolType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     */
    public void setCoolType_IsNotNull() { regCoolType(CK_ISNN, DOBJ); }

    protected void regCoolType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCoolType(), "COOL_TYPE"); }
    protected abstract ConditionValue xgetCValueCoolType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @param codType The value of codType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_Equal(String codType) {
        doSetCodType_Equal(fRES(codType));
    }

    /**
     * Equal(=). As CodType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodType_Equal_AsCodType(CDef.CodType cdef) {
        doSetCodType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 元払
     */
    public void setCodType_Equal_$0() {
        setCodType_Equal_AsCodType(CDef.CodType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 着払
     */
    public void setCodType_Equal_$1() {
        setCodType_Equal_AsCodType(CDef.CodType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 代引
     */
    public void setCodType_Equal_$2() {
        setCodType_Equal_AsCodType(CDef.CodType.$2);
    }

    protected void doSetCodType_Equal(String codType) {
        regCodType(CK_EQ, codType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @param codType The value of codType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_NotEqual(String codType) {
        doSetCodType_NotEqual(fRES(codType));
    }

    /**
     * NotEqual(&lt;&gt;). As CodType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodType_NotEqual_AsCodType(CDef.CodType cdef) {
        doSetCodType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 元払
     */
    public void setCodType_NotEqual_$0() {
        setCodType_NotEqual_AsCodType(CDef.CodType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 着払
     */
    public void setCodType_NotEqual_$1() {
        setCodType_NotEqual_AsCodType(CDef.CodType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 代引
     */
    public void setCodType_NotEqual_$2() {
        setCodType_NotEqual_AsCodType(CDef.CodType.$2);
    }

    protected void doSetCodType_NotEqual(String codType) {
        regCodType(CK_NES, codType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @param codTypeList The collection of codType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_InScope(Collection<String> codTypeList) {
        doSetCodType_InScope(codTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CodType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_InScope_AsCodType(Collection<CDef.CodType> cdefList) {
        doSetCodType_InScope(cTStrL(cdefList));
    }

    protected void doSetCodType_InScope(Collection<String> codTypeList) {
        regINS(CK_INS, cTL(codTypeList), xgetCValueCodType(), "COD_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @param codTypeList The collection of codType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_NotInScope(Collection<String> codTypeList) {
        doSetCodType_NotInScope(codTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CodType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodType_NotInScope_AsCodType(Collection<CDef.CodType> cdefList) {
        doSetCodType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCodType_NotInScope(Collection<String> codTypeList) {
        regINS(CK_NINS, cTL(codTypeList), xgetCValueCodType(), "COD_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     */
    public void setCodType_IsNull() { regCodType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     */
    public void setCodType_IsNullOrEmpty() { regCodType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     */
    public void setCodType_IsNotNull() { regCodType(CK_ISNN, DOBJ); }

    protected void regCodType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodType(), "COD_TYPE"); }
    protected abstract ConditionValue xgetCValueCodType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_Equal(String carrierType) {
        doSetCarrierType_Equal(fRES(carrierType));
    }

    protected void doSetCarrierType_Equal(String carrierType) {
        regCarrierType(CK_EQ, carrierType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_NotEqual(String carrierType) {
        doSetCarrierType_NotEqual(fRES(carrierType));
    }

    protected void doSetCarrierType_NotEqual(String carrierType) {
        regCarrierType(CK_NES, carrierType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_GreaterThan(String carrierType) {
        regCarrierType(CK_GT, fRES(carrierType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_LessThan(String carrierType) {
        regCarrierType(CK_LT, fRES(carrierType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_GreaterEqual(String carrierType) {
        regCarrierType(CK_GE, fRES(carrierType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_LessEqual(String carrierType) {
        regCarrierType(CK_LE, fRES(carrierType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierTypeList The collection of carrierType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_InScope(Collection<String> carrierTypeList) {
        doSetCarrierType_InScope(carrierTypeList);
    }

    protected void doSetCarrierType_InScope(Collection<String> carrierTypeList) {
        regINS(CK_INS, cTL(carrierTypeList), xgetCValueCarrierType(), "CARRIER_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierTypeList The collection of carrierType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_NotInScope(Collection<String> carrierTypeList) {
        doSetCarrierType_NotInScope(carrierTypeList);
    }

    protected void doSetCarrierType_NotInScope(Collection<String> carrierTypeList) {
        regINS(CK_NINS, cTL(carrierTypeList), xgetCValueCarrierType(), "CARRIER_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE: {varchar(30)} <br>
     * <pre>e.g. setCarrierType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierType The value of carrierType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierType_LikeSearch(String carrierType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierType), xgetCValueCarrierType(), "CARRIER_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierType_NotLikeSearch(String carrierType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierType), xgetCValueCarrierType(), "CARRIER_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @param carrierType The value of carrierType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierType_PrefixSearch(String carrierType) {
        setCarrierType_LikeSearch(carrierType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     */
    public void setCarrierType_IsNull() { regCarrierType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     */
    public void setCarrierType_IsNullOrEmpty() { regCarrierType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE: {varchar(30)}
     */
    public void setCarrierType_IsNotNull() { regCarrierType(CK_ISNN, DOBJ); }

    protected void regCarrierType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierType(), "CARRIER_TYPE"); }
    protected abstract ConditionValue xgetCValueCarrierType();

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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_GreaterThan(String slipClientAddress1) {
        regSlipClientAddress1(CK_GT, fRES(slipClientAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_LessThan(String slipClientAddress1) {
        regSlipClientAddress1(CK_LT, fRES(slipClientAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_GreaterEqual(String slipClientAddress1) {
        regSlipClientAddress1(CK_GE, fRES(slipClientAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_LessEqual(String slipClientAddress1) {
        regSlipClientAddress1(CK_LE, fRES(slipClientAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)} <br>
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
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress1_NotLikeSearch(String slipClientAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress1), xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @param slipClientAddress1 The value of slipClientAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress1_PrefixSearch(String slipClientAddress1) {
        setSlipClientAddress1_LikeSearch(slipClientAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     */
    public void setSlipClientAddress1_IsNull() { regSlipClientAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     */
    public void setSlipClientAddress1_IsNullOrEmpty() { regSlipClientAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     */
    public void setSlipClientAddress1_IsNotNull() { regSlipClientAddress1(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress1(), "SLIP_CLIENT_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_GreaterThan(String slipClientAddress2) {
        regSlipClientAddress2(CK_GT, fRES(slipClientAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_LessThan(String slipClientAddress2) {
        regSlipClientAddress2(CK_LT, fRES(slipClientAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_GreaterEqual(String slipClientAddress2) {
        regSlipClientAddress2(CK_GE, fRES(slipClientAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_LessEqual(String slipClientAddress2) {
        regSlipClientAddress2(CK_LE, fRES(slipClientAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS2: {varchar(255)} <br>
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
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress2_NotLikeSearch(String slipClientAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress2), xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @param slipClientAddress2 The value of slipClientAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress2_PrefixSearch(String slipClientAddress2) {
        setSlipClientAddress2_LikeSearch(slipClientAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     */
    public void setSlipClientAddress2_IsNull() { regSlipClientAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     */
    public void setSlipClientAddress2_IsNullOrEmpty() { regSlipClientAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     */
    public void setSlipClientAddress2_IsNotNull() { regSlipClientAddress2(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress2(), "SLIP_CLIENT_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_GreaterThan(String slipClientAddress3) {
        regSlipClientAddress3(CK_GT, fRES(slipClientAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_LessThan(String slipClientAddress3) {
        regSlipClientAddress3(CK_LT, fRES(slipClientAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_GreaterEqual(String slipClientAddress3) {
        regSlipClientAddress3(CK_GE, fRES(slipClientAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_LessEqual(String slipClientAddress3) {
        regSlipClientAddress3(CK_LE, fRES(slipClientAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
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
     * SLIP_CLIENT_ADDRESS3: {varchar(255)} <br>
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
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientAddress3_NotLikeSearch(String slipClientAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientAddress3), xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @param slipClientAddress3 The value of slipClientAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientAddress3_PrefixSearch(String slipClientAddress3) {
        setSlipClientAddress3_LikeSearch(slipClientAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     */
    public void setSlipClientAddress3_IsNull() { regSlipClientAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     */
    public void setSlipClientAddress3_IsNullOrEmpty() { regSlipClientAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     */
    public void setSlipClientAddress3_IsNotNull() { regSlipClientAddress3(CK_ISNN, DOBJ); }

    protected void regSlipClientAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientAddress3(), "SLIP_CLIENT_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueSlipClientAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_Equal(String slipClientNm1) {
        doSetSlipClientNm1_Equal(fRES(slipClientNm1));
    }

    protected void doSetSlipClientNm1_Equal(String slipClientNm1) {
        regSlipClientNm1(CK_EQ, slipClientNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_NotEqual(String slipClientNm1) {
        doSetSlipClientNm1_NotEqual(fRES(slipClientNm1));
    }

    protected void doSetSlipClientNm1_NotEqual(String slipClientNm1) {
        regSlipClientNm1(CK_NES, slipClientNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_GreaterThan(String slipClientNm1) {
        regSlipClientNm1(CK_GT, fRES(slipClientNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_LessThan(String slipClientNm1) {
        regSlipClientNm1(CK_LT, fRES(slipClientNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_GreaterEqual(String slipClientNm1) {
        regSlipClientNm1(CK_GE, fRES(slipClientNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_LessEqual(String slipClientNm1) {
        regSlipClientNm1(CK_LE, fRES(slipClientNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1List The collection of slipClientNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_InScope(Collection<String> slipClientNm1List) {
        doSetSlipClientNm1_InScope(slipClientNm1List);
    }

    protected void doSetSlipClientNm1_InScope(Collection<String> slipClientNm1List) {
        regINS(CK_INS, cTL(slipClientNm1List), xgetCValueSlipClientNm1(), "SLIP_CLIENT_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1List The collection of slipClientNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_NotInScope(Collection<String> slipClientNm1List) {
        doSetSlipClientNm1_NotInScope(slipClientNm1List);
    }

    protected void doSetSlipClientNm1_NotInScope(Collection<String> slipClientNm1List) {
        regINS(CK_NINS, cTL(slipClientNm1List), xgetCValueSlipClientNm1(), "SLIP_CLIENT_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)} <br>
     * <pre>e.g. setSlipClientNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientNm1 The value of slipClientNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientNm1_LikeSearch(String slipClientNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientNm1), xgetCValueSlipClientNm1(), "SLIP_CLIENT_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientNm1_NotLikeSearch(String slipClientNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientNm1), xgetCValueSlipClientNm1(), "SLIP_CLIENT_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @param slipClientNm1 The value of slipClientNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm1_PrefixSearch(String slipClientNm1) {
        setSlipClientNm1_LikeSearch(slipClientNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     */
    public void setSlipClientNm1_IsNull() { regSlipClientNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     */
    public void setSlipClientNm1_IsNullOrEmpty() { regSlipClientNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     */
    public void setSlipClientNm1_IsNotNull() { regSlipClientNm1(CK_ISNN, DOBJ); }

    protected void regSlipClientNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientNm1(), "SLIP_CLIENT_NM1"); }
    protected abstract ConditionValue xgetCValueSlipClientNm1();

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
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_Equal(String slipClientMail) {
        doSetSlipClientMail_Equal(fRES(slipClientMail));
    }

    protected void doSetSlipClientMail_Equal(String slipClientMail) {
        regSlipClientMail(CK_EQ, slipClientMail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_NotEqual(String slipClientMail) {
        doSetSlipClientMail_NotEqual(fRES(slipClientMail));
    }

    protected void doSetSlipClientMail_NotEqual(String slipClientMail) {
        regSlipClientMail(CK_NES, slipClientMail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_GreaterThan(String slipClientMail) {
        regSlipClientMail(CK_GT, fRES(slipClientMail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_LessThan(String slipClientMail) {
        regSlipClientMail(CK_LT, fRES(slipClientMail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_GreaterEqual(String slipClientMail) {
        regSlipClientMail(CK_GE, fRES(slipClientMail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_LessEqual(String slipClientMail) {
        regSlipClientMail(CK_LE, fRES(slipClientMail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMailList The collection of slipClientMail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_InScope(Collection<String> slipClientMailList) {
        doSetSlipClientMail_InScope(slipClientMailList);
    }

    protected void doSetSlipClientMail_InScope(Collection<String> slipClientMailList) {
        regINS(CK_INS, cTL(slipClientMailList), xgetCValueSlipClientMail(), "SLIP_CLIENT_MAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMailList The collection of slipClientMail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_NotInScope(Collection<String> slipClientMailList) {
        doSetSlipClientMail_NotInScope(slipClientMailList);
    }

    protected void doSetSlipClientMail_NotInScope(Collection<String> slipClientMailList) {
        regINS(CK_NINS, cTL(slipClientMailList), xgetCValueSlipClientMail(), "SLIP_CLIENT_MAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)} <br>
     * <pre>e.g. setSlipClientMail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientMail The value of slipClientMail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientMail_LikeSearch(String slipClientMail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientMail), xgetCValueSlipClientMail(), "SLIP_CLIENT_MAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientMail_NotLikeSearch(String slipClientMail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientMail), xgetCValueSlipClientMail(), "SLIP_CLIENT_MAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @param slipClientMail The value of slipClientMail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientMail_PrefixSearch(String slipClientMail) {
        setSlipClientMail_LikeSearch(slipClientMail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     */
    public void setSlipClientMail_IsNull() { regSlipClientMail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     */
    public void setSlipClientMail_IsNullOrEmpty() { regSlipClientMail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     */
    public void setSlipClientMail_IsNotNull() { regSlipClientMail(CK_ISNN, DOBJ); }

    protected void regSlipClientMail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientMail(), "SLIP_CLIENT_MAIL"); }
    protected abstract ConditionValue xgetCValueSlipClientMail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @param noUpsideDownCls The value of noUpsideDownCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_Equal(String noUpsideDownCls) {
        doSetNoUpsideDownCls_Equal(fRES(noUpsideDownCls));
    }

    /**
     * Equal(=). As NoUpsideDownCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_Equal_AsNoUpsideDownCls(CDef.NoUpsideDownCls cdef) {
        doSetNoUpsideDownCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 無
     */
    public void setNoUpsideDownCls_Equal_$0() {
        setNoUpsideDownCls_Equal_AsNoUpsideDownCls(CDef.NoUpsideDownCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 有
     */
    public void setNoUpsideDownCls_Equal_$1() {
        setNoUpsideDownCls_Equal_AsNoUpsideDownCls(CDef.NoUpsideDownCls.$1);
    }

    protected void doSetNoUpsideDownCls_Equal(String noUpsideDownCls) {
        regNoUpsideDownCls(CK_EQ, noUpsideDownCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @param noUpsideDownCls The value of noUpsideDownCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_NotEqual(String noUpsideDownCls) {
        doSetNoUpsideDownCls_NotEqual(fRES(noUpsideDownCls));
    }

    /**
     * NotEqual(&lt;&gt;). As NoUpsideDownCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_NotEqual_AsNoUpsideDownCls(CDef.NoUpsideDownCls cdef) {
        doSetNoUpsideDownCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 無
     */
    public void setNoUpsideDownCls_NotEqual_$0() {
        setNoUpsideDownCls_NotEqual_AsNoUpsideDownCls(CDef.NoUpsideDownCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 有
     */
    public void setNoUpsideDownCls_NotEqual_$1() {
        setNoUpsideDownCls_NotEqual_AsNoUpsideDownCls(CDef.NoUpsideDownCls.$1);
    }

    protected void doSetNoUpsideDownCls_NotEqual(String noUpsideDownCls) {
        regNoUpsideDownCls(CK_NES, noUpsideDownCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @param noUpsideDownClsList The collection of noUpsideDownCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_InScope(Collection<String> noUpsideDownClsList) {
        doSetNoUpsideDownCls_InScope(noUpsideDownClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As NoUpsideDownCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_InScope_AsNoUpsideDownCls(Collection<CDef.NoUpsideDownCls> cdefList) {
        doSetNoUpsideDownCls_InScope(cTStrL(cdefList));
    }

    protected void doSetNoUpsideDownCls_InScope(Collection<String> noUpsideDownClsList) {
        regINS(CK_INS, cTL(noUpsideDownClsList), xgetCValueNoUpsideDownCls(), "NO_UPSIDE_DOWN_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @param noUpsideDownClsList The collection of noUpsideDownCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_NotInScope(Collection<String> noUpsideDownClsList) {
        doSetNoUpsideDownCls_NotInScope(noUpsideDownClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As NoUpsideDownCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoUpsideDownCls_NotInScope_AsNoUpsideDownCls(Collection<CDef.NoUpsideDownCls> cdefList) {
        doSetNoUpsideDownCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetNoUpsideDownCls_NotInScope(Collection<String> noUpsideDownClsList) {
        regINS(CK_NINS, cTL(noUpsideDownClsList), xgetCValueNoUpsideDownCls(), "NO_UPSIDE_DOWN_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     */
    public void setNoUpsideDownCls_IsNull() { regNoUpsideDownCls(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     */
    public void setNoUpsideDownCls_IsNotNull() { regNoUpsideDownCls(CK_ISNN, DOBJ); }

    protected void regNoUpsideDownCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoUpsideDownCls(), "NO_UPSIDE_DOWN_CLS"); }
    protected abstract ConditionValue xgetCValueNoUpsideDownCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @param noStockCls The value of noStockCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_Equal(String noStockCls) {
        doSetNoStockCls_Equal(fRES(noStockCls));
    }

    /**
     * Equal(=). As NoStockCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoStockCls_Equal_AsNoStockCls(CDef.NoStockCls cdef) {
        doSetNoStockCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 無
     */
    public void setNoStockCls_Equal_$0() {
        setNoStockCls_Equal_AsNoStockCls(CDef.NoStockCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 有
     */
    public void setNoStockCls_Equal_$1() {
        setNoStockCls_Equal_AsNoStockCls(CDef.NoStockCls.$1);
    }

    protected void doSetNoStockCls_Equal(String noStockCls) {
        regNoStockCls(CK_EQ, noStockCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @param noStockCls The value of noStockCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_NotEqual(String noStockCls) {
        doSetNoStockCls_NotEqual(fRES(noStockCls));
    }

    /**
     * NotEqual(&lt;&gt;). As NoStockCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoStockCls_NotEqual_AsNoStockCls(CDef.NoStockCls cdef) {
        doSetNoStockCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 無
     */
    public void setNoStockCls_NotEqual_$0() {
        setNoStockCls_NotEqual_AsNoStockCls(CDef.NoStockCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 有
     */
    public void setNoStockCls_NotEqual_$1() {
        setNoStockCls_NotEqual_AsNoStockCls(CDef.NoStockCls.$1);
    }

    protected void doSetNoStockCls_NotEqual(String noStockCls) {
        regNoStockCls(CK_NES, noStockCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @param noStockClsList The collection of noStockCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_InScope(Collection<String> noStockClsList) {
        doSetNoStockCls_InScope(noStockClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As NoStockCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_InScope_AsNoStockCls(Collection<CDef.NoStockCls> cdefList) {
        doSetNoStockCls_InScope(cTStrL(cdefList));
    }

    protected void doSetNoStockCls_InScope(Collection<String> noStockClsList) {
        regINS(CK_INS, cTL(noStockClsList), xgetCValueNoStockCls(), "NO_STOCK_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @param noStockClsList The collection of noStockCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_NotInScope(Collection<String> noStockClsList) {
        doSetNoStockCls_NotInScope(noStockClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As NoStockCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoStockCls_NotInScope_AsNoStockCls(Collection<CDef.NoStockCls> cdefList) {
        doSetNoStockCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetNoStockCls_NotInScope(Collection<String> noStockClsList) {
        regINS(CK_NINS, cTL(noStockClsList), xgetCValueNoStockCls(), "NO_STOCK_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     */
    public void setNoStockCls_IsNull() { regNoStockCls(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     */
    public void setNoStockCls_IsNotNull() { regNoStockCls(CK_ISNN, DOBJ); }

    protected void regNoStockCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoStockCls(), "NO_STOCK_CLS"); }
    protected abstract ConditionValue xgetCValueNoStockCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_Equal(String slipProductSizeCls) {
        doSetSlipProductSizeCls_Equal(fRES(slipProductSizeCls));
    }

    protected void doSetSlipProductSizeCls_Equal(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_EQ, slipProductSizeCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_NotEqual(String slipProductSizeCls) {
        doSetSlipProductSizeCls_NotEqual(fRES(slipProductSizeCls));
    }

    protected void doSetSlipProductSizeCls_NotEqual(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_NES, slipProductSizeCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_GreaterThan(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_GT, fRES(slipProductSizeCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_LessThan(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_LT, fRES(slipProductSizeCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_GreaterEqual(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_GE, fRES(slipProductSizeCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_LessEqual(String slipProductSizeCls) {
        regSlipProductSizeCls(CK_LE, fRES(slipProductSizeCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeClsList The collection of slipProductSizeCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_InScope(Collection<String> slipProductSizeClsList) {
        doSetSlipProductSizeCls_InScope(slipProductSizeClsList);
    }

    protected void doSetSlipProductSizeCls_InScope(Collection<String> slipProductSizeClsList) {
        regINS(CK_INS, cTL(slipProductSizeClsList), xgetCValueSlipProductSizeCls(), "SLIP_PRODUCT_SIZE_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeClsList The collection of slipProductSizeCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_NotInScope(Collection<String> slipProductSizeClsList) {
        doSetSlipProductSizeCls_NotInScope(slipProductSizeClsList);
    }

    protected void doSetSlipProductSizeCls_NotInScope(Collection<String> slipProductSizeClsList) {
        regINS(CK_NINS, cTL(slipProductSizeClsList), xgetCValueSlipProductSizeCls(), "SLIP_PRODUCT_SIZE_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)} <br>
     * <pre>e.g. setSlipProductSizeCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipProductSizeCls The value of slipProductSizeCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipProductSizeCls_LikeSearch(String slipProductSizeCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipProductSizeCls), xgetCValueSlipProductSizeCls(), "SLIP_PRODUCT_SIZE_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipProductSizeCls_NotLikeSearch(String slipProductSizeCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipProductSizeCls), xgetCValueSlipProductSizeCls(), "SLIP_PRODUCT_SIZE_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @param slipProductSizeCls The value of slipProductSizeCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductSizeCls_PrefixSearch(String slipProductSizeCls) {
        setSlipProductSizeCls_LikeSearch(slipProductSizeCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     */
    public void setSlipProductSizeCls_IsNull() { regSlipProductSizeCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     */
    public void setSlipProductSizeCls_IsNullOrEmpty() { regSlipProductSizeCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     */
    public void setSlipProductSizeCls_IsNotNull() { regSlipProductSizeCls(CK_ISNN, DOBJ); }

    protected void regSlipProductSizeCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipProductSizeCls(), "SLIP_PRODUCT_SIZE_CLS"); }
    protected abstract ConditionValue xgetCValueSlipProductSizeCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_Equal(String slipProductNo) {
        doSetSlipProductNo_Equal(fRES(slipProductNo));
    }

    protected void doSetSlipProductNo_Equal(String slipProductNo) {
        regSlipProductNo(CK_EQ, slipProductNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_NotEqual(String slipProductNo) {
        doSetSlipProductNo_NotEqual(fRES(slipProductNo));
    }

    protected void doSetSlipProductNo_NotEqual(String slipProductNo) {
        regSlipProductNo(CK_NES, slipProductNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_GreaterThan(String slipProductNo) {
        regSlipProductNo(CK_GT, fRES(slipProductNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_LessThan(String slipProductNo) {
        regSlipProductNo(CK_LT, fRES(slipProductNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_GreaterEqual(String slipProductNo) {
        regSlipProductNo(CK_GE, fRES(slipProductNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_LessEqual(String slipProductNo) {
        regSlipProductNo(CK_LE, fRES(slipProductNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNoList The collection of slipProductNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_InScope(Collection<String> slipProductNoList) {
        doSetSlipProductNo_InScope(slipProductNoList);
    }

    protected void doSetSlipProductNo_InScope(Collection<String> slipProductNoList) {
        regINS(CK_INS, cTL(slipProductNoList), xgetCValueSlipProductNo(), "SLIP_PRODUCT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNoList The collection of slipProductNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_NotInScope(Collection<String> slipProductNoList) {
        doSetSlipProductNo_NotInScope(slipProductNoList);
    }

    protected void doSetSlipProductNo_NotInScope(Collection<String> slipProductNoList) {
        regINS(CK_NINS, cTL(slipProductNoList), xgetCValueSlipProductNo(), "SLIP_PRODUCT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)} <br>
     * <pre>e.g. setSlipProductNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipProductNo The value of slipProductNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipProductNo_LikeSearch(String slipProductNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipProductNo), xgetCValueSlipProductNo(), "SLIP_PRODUCT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipProductNo_NotLikeSearch(String slipProductNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipProductNo), xgetCValueSlipProductNo(), "SLIP_PRODUCT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @param slipProductNo The value of slipProductNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipProductNo_PrefixSearch(String slipProductNo) {
        setSlipProductNo_LikeSearch(slipProductNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     */
    public void setSlipProductNo_IsNull() { regSlipProductNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     */
    public void setSlipProductNo_IsNullOrEmpty() { regSlipProductNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     */
    public void setSlipProductNo_IsNotNull() { regSlipProductNo(CK_ISNN, DOBJ); }

    protected void regSlipProductNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipProductNo(), "SLIP_PRODUCT_NO"); }
    protected abstract ConditionValue xgetCValueSlipProductNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_Equal(String slipItemNm) {
        doSetSlipItemNm_Equal(fRES(slipItemNm));
    }

    protected void doSetSlipItemNm_Equal(String slipItemNm) {
        regSlipItemNm(CK_EQ, slipItemNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_NotEqual(String slipItemNm) {
        doSetSlipItemNm_NotEqual(fRES(slipItemNm));
    }

    protected void doSetSlipItemNm_NotEqual(String slipItemNm) {
        regSlipItemNm(CK_NES, slipItemNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_GreaterThan(String slipItemNm) {
        regSlipItemNm(CK_GT, fRES(slipItemNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_LessThan(String slipItemNm) {
        regSlipItemNm(CK_LT, fRES(slipItemNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_GreaterEqual(String slipItemNm) {
        regSlipItemNm(CK_GE, fRES(slipItemNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_LessEqual(String slipItemNm) {
        regSlipItemNm(CK_LE, fRES(slipItemNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNmList The collection of slipItemNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_InScope(Collection<String> slipItemNmList) {
        doSetSlipItemNm_InScope(slipItemNmList);
    }

    protected void doSetSlipItemNm_InScope(Collection<String> slipItemNmList) {
        regINS(CK_INS, cTL(slipItemNmList), xgetCValueSlipItemNm(), "SLIP_ITEM_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNmList The collection of slipItemNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_NotInScope(Collection<String> slipItemNmList) {
        doSetSlipItemNm_NotInScope(slipItemNmList);
    }

    protected void doSetSlipItemNm_NotInScope(Collection<String> slipItemNmList) {
        regINS(CK_NINS, cTL(slipItemNmList), xgetCValueSlipItemNm(), "SLIP_ITEM_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm The value of slipItemNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm_LikeSearch(String slipItemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm), xgetCValueSlipItemNm(), "SLIP_ITEM_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm_NotLikeSearch(String slipItemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm), xgetCValueSlipItemNm(), "SLIP_ITEM_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @param slipItemNm The value of slipItemNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm_PrefixSearch(String slipItemNm) {
        setSlipItemNm_LikeSearch(slipItemNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     */
    public void setSlipItemNm_IsNull() { regSlipItemNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     */
    public void setSlipItemNm_IsNullOrEmpty() { regSlipItemNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     */
    public void setSlipItemNm_IsNotNull() { regSlipItemNm(CK_ISNN, DOBJ); }

    protected void regSlipItemNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm(), "SLIP_ITEM_NM"); }
    protected abstract ConditionValue xgetCValueSlipItemNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_Equal(String shipReserveDataMark) {
        doSetShipReserveDataMark_Equal(fRES(shipReserveDataMark));
    }

    protected void doSetShipReserveDataMark_Equal(String shipReserveDataMark) {
        regShipReserveDataMark(CK_EQ, shipReserveDataMark);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_NotEqual(String shipReserveDataMark) {
        doSetShipReserveDataMark_NotEqual(fRES(shipReserveDataMark));
    }

    protected void doSetShipReserveDataMark_NotEqual(String shipReserveDataMark) {
        regShipReserveDataMark(CK_NES, shipReserveDataMark);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_GreaterThan(String shipReserveDataMark) {
        regShipReserveDataMark(CK_GT, fRES(shipReserveDataMark));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_LessThan(String shipReserveDataMark) {
        regShipReserveDataMark(CK_LT, fRES(shipReserveDataMark));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_GreaterEqual(String shipReserveDataMark) {
        regShipReserveDataMark(CK_GE, fRES(shipReserveDataMark));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_LessEqual(String shipReserveDataMark) {
        regShipReserveDataMark(CK_LE, fRES(shipReserveDataMark));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMarkList The collection of shipReserveDataMark as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_InScope(Collection<String> shipReserveDataMarkList) {
        doSetShipReserveDataMark_InScope(shipReserveDataMarkList);
    }

    protected void doSetShipReserveDataMark_InScope(Collection<String> shipReserveDataMarkList) {
        regINS(CK_INS, cTL(shipReserveDataMarkList), xgetCValueShipReserveDataMark(), "SHIP_RESERVE_DATA_MARK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMarkList The collection of shipReserveDataMark as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_NotInScope(Collection<String> shipReserveDataMarkList) {
        doSetShipReserveDataMark_NotInScope(shipReserveDataMarkList);
    }

    protected void doSetShipReserveDataMark_NotInScope(Collection<String> shipReserveDataMarkList) {
        regINS(CK_NINS, cTL(shipReserveDataMarkList), xgetCValueShipReserveDataMark(), "SHIP_RESERVE_DATA_MARK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)} <br>
     * <pre>e.g. setShipReserveDataMark_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipReserveDataMark The value of shipReserveDataMark as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipReserveDataMark_LikeSearch(String shipReserveDataMark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipReserveDataMark), xgetCValueShipReserveDataMark(), "SHIP_RESERVE_DATA_MARK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipReserveDataMark_NotLikeSearch(String shipReserveDataMark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipReserveDataMark), xgetCValueShipReserveDataMark(), "SHIP_RESERVE_DATA_MARK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @param shipReserveDataMark The value of shipReserveDataMark as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipReserveDataMark_PrefixSearch(String shipReserveDataMark) {
        setShipReserveDataMark_LikeSearch(shipReserveDataMark, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     */
    public void setShipReserveDataMark_IsNull() { regShipReserveDataMark(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     */
    public void setShipReserveDataMark_IsNullOrEmpty() { regShipReserveDataMark(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     */
    public void setShipReserveDataMark_IsNotNull() { regShipReserveDataMark(CK_ISNN, DOBJ); }

    protected void regShipReserveDataMark(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipReserveDataMark(), "SHIP_RESERVE_DATA_MARK"); }
    protected abstract ConditionValue xgetCValueShipReserveDataMark();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_Equal(Long deliCertPreYears) {
        doSetDeliCertPreYears_Equal(deliCertPreYears);
    }

    protected void doSetDeliCertPreYears_Equal(Long deliCertPreYears) {
        regDeliCertPreYears(CK_EQ, deliCertPreYears);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_NotEqual(Long deliCertPreYears) {
        doSetDeliCertPreYears_NotEqual(deliCertPreYears);
    }

    protected void doSetDeliCertPreYears_NotEqual(Long deliCertPreYears) {
        regDeliCertPreYears(CK_NES, deliCertPreYears);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_GreaterThan(Long deliCertPreYears) {
        regDeliCertPreYears(CK_GT, deliCertPreYears);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_LessThan(Long deliCertPreYears) {
        regDeliCertPreYears(CK_LT, deliCertPreYears);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_GreaterEqual(Long deliCertPreYears) {
        regDeliCertPreYears(CK_GE, deliCertPreYears);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYears The value of deliCertPreYears as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_LessEqual(Long deliCertPreYears) {
        regDeliCertPreYears(CK_LE, deliCertPreYears);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param minNumber The min number of deliCertPreYears. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliCertPreYears. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliCertPreYears_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliCertPreYears(), "DELI_CERT_PRE_YEARS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYearsList The collection of deliCertPreYears as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_InScope(Collection<Long> deliCertPreYearsList) {
        doSetDeliCertPreYears_InScope(deliCertPreYearsList);
    }

    protected void doSetDeliCertPreYears_InScope(Collection<Long> deliCertPreYearsList) {
        regINS(CK_INS, cTL(deliCertPreYearsList), xgetCValueDeliCertPreYears(), "DELI_CERT_PRE_YEARS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @param deliCertPreYearsList The collection of deliCertPreYears as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliCertPreYears_NotInScope(Collection<Long> deliCertPreYearsList) {
        doSetDeliCertPreYears_NotInScope(deliCertPreYearsList);
    }

    protected void doSetDeliCertPreYears_NotInScope(Collection<Long> deliCertPreYearsList) {
        regINS(CK_NINS, cTL(deliCertPreYearsList), xgetCValueDeliCertPreYears(), "DELI_CERT_PRE_YEARS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     */
    public void setDeliCertPreYears_IsNull() { regDeliCertPreYears(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     */
    public void setDeliCertPreYears_IsNotNull() { regDeliCertPreYears(CK_ISNN, DOBJ); }

    protected void regDeliCertPreYears(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliCertPreYears(), "DELI_CERT_PRE_YEARS"); }
    protected abstract ConditionValue xgetCValueDeliCertPreYears();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_Equal(String sendNm) {
        doSetSendNm_Equal(fRES(sendNm));
    }

    protected void doSetSendNm_Equal(String sendNm) {
        regSendNm(CK_EQ, sendNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_NotEqual(String sendNm) {
        doSetSendNm_NotEqual(fRES(sendNm));
    }

    protected void doSetSendNm_NotEqual(String sendNm) {
        regSendNm(CK_NES, sendNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_GreaterThan(String sendNm) {
        regSendNm(CK_GT, fRES(sendNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_LessThan(String sendNm) {
        regSendNm(CK_LT, fRES(sendNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_GreaterEqual(String sendNm) {
        regSendNm(CK_GE, fRES(sendNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_LessEqual(String sendNm) {
        regSendNm(CK_LE, fRES(sendNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNmList The collection of sendNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_InScope(Collection<String> sendNmList) {
        doSetSendNm_InScope(sendNmList);
    }

    protected void doSetSendNm_InScope(Collection<String> sendNmList) {
        regINS(CK_INS, cTL(sendNmList), xgetCValueSendNm(), "SEND_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNmList The collection of sendNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_NotInScope(Collection<String> sendNmList) {
        doSetSendNm_NotInScope(sendNmList);
    }

    protected void doSetSendNm_NotInScope(Collection<String> sendNmList) {
        regINS(CK_NINS, cTL(sendNmList), xgetCValueSendNm(), "SEND_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_NM: {varchar(60)} <br>
     * <pre>e.g. setSendNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendNm The value of sendNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendNm_LikeSearch(String sendNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendNm), xgetCValueSendNm(), "SEND_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendNm_NotLikeSearch(String sendNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendNm), xgetCValueSendNm(), "SEND_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_NM: {varchar(60)}
     * @param sendNm The value of sendNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendNm_PrefixSearch(String sendNm) {
        setSendNm_LikeSearch(sendNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     */
    public void setSendNm_IsNull() { regSendNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     */
    public void setSendNm_IsNullOrEmpty() { regSendNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_NM: {varchar(60)}
     */
    public void setSendNm_IsNotNull() { regSendNm(CK_ISNN, DOBJ); }

    protected void regSendNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendNm(), "SEND_NM"); }
    protected abstract ConditionValue xgetCValueSendNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_Equal(String productTypeCode) {
        doSetProductTypeCode_Equal(fRES(productTypeCode));
    }

    protected void doSetProductTypeCode_Equal(String productTypeCode) {
        regProductTypeCode(CK_EQ, productTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_NotEqual(String productTypeCode) {
        doSetProductTypeCode_NotEqual(fRES(productTypeCode));
    }

    protected void doSetProductTypeCode_NotEqual(String productTypeCode) {
        regProductTypeCode(CK_NES, productTypeCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_GreaterThan(String productTypeCode) {
        regProductTypeCode(CK_GT, fRES(productTypeCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_LessThan(String productTypeCode) {
        regProductTypeCode(CK_LT, fRES(productTypeCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_GreaterEqual(String productTypeCode) {
        regProductTypeCode(CK_GE, fRES(productTypeCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_LessEqual(String productTypeCode) {
        regProductTypeCode(CK_LE, fRES(productTypeCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCodeList The collection of productTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_InScope(Collection<String> productTypeCodeList) {
        doSetProductTypeCode_InScope(productTypeCodeList);
    }

    protected void doSetProductTypeCode_InScope(Collection<String> productTypeCodeList) {
        regINS(CK_INS, cTL(productTypeCodeList), xgetCValueProductTypeCode(), "PRODUCT_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCodeList The collection of productTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_NotInScope(Collection<String> productTypeCodeList) {
        doSetProductTypeCode_NotInScope(productTypeCodeList);
    }

    protected void doSetProductTypeCode_NotInScope(Collection<String> productTypeCodeList) {
        regINS(CK_NINS, cTL(productTypeCodeList), xgetCValueProductTypeCode(), "PRODUCT_TYPE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)} <br>
     * <pre>e.g. setProductTypeCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productTypeCode The value of productTypeCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductTypeCode_LikeSearch(String productTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productTypeCode), xgetCValueProductTypeCode(), "PRODUCT_TYPE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductTypeCode_NotLikeSearch(String productTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productTypeCode), xgetCValueProductTypeCode(), "PRODUCT_TYPE_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @param productTypeCode The value of productTypeCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTypeCode_PrefixSearch(String productTypeCode) {
        setProductTypeCode_LikeSearch(productTypeCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     */
    public void setProductTypeCode_IsNull() { regProductTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     */
    public void setProductTypeCode_IsNullOrEmpty() { regProductTypeCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     */
    public void setProductTypeCode_IsNotNull() { regProductTypeCode(CK_ISNN, DOBJ); }

    protected void regProductTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductTypeCode(), "PRODUCT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueProductTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_Equal(String postBizCardCustomerNo) {
        doSetPostBizCardCustomerNo_Equal(fRES(postBizCardCustomerNo));
    }

    protected void doSetPostBizCardCustomerNo_Equal(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_EQ, postBizCardCustomerNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_NotEqual(String postBizCardCustomerNo) {
        doSetPostBizCardCustomerNo_NotEqual(fRES(postBizCardCustomerNo));
    }

    protected void doSetPostBizCardCustomerNo_NotEqual(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_NES, postBizCardCustomerNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_GreaterThan(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_GT, fRES(postBizCardCustomerNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_LessThan(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_LT, fRES(postBizCardCustomerNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_GreaterEqual(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_GE, fRES(postBizCardCustomerNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_LessEqual(String postBizCardCustomerNo) {
        regPostBizCardCustomerNo(CK_LE, fRES(postBizCardCustomerNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNoList The collection of postBizCardCustomerNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_InScope(Collection<String> postBizCardCustomerNoList) {
        doSetPostBizCardCustomerNo_InScope(postBizCardCustomerNoList);
    }

    protected void doSetPostBizCardCustomerNo_InScope(Collection<String> postBizCardCustomerNoList) {
        regINS(CK_INS, cTL(postBizCardCustomerNoList), xgetCValuePostBizCardCustomerNo(), "POST_BIZ_CARD_CUSTOMER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNoList The collection of postBizCardCustomerNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_NotInScope(Collection<String> postBizCardCustomerNoList) {
        doSetPostBizCardCustomerNo_NotInScope(postBizCardCustomerNoList);
    }

    protected void doSetPostBizCardCustomerNo_NotInScope(Collection<String> postBizCardCustomerNoList) {
        regINS(CK_NINS, cTL(postBizCardCustomerNoList), xgetCValuePostBizCardCustomerNo(), "POST_BIZ_CARD_CUSTOMER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} <br>
     * <pre>e.g. setPostBizCardCustomerNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPostBizCardCustomerNo_LikeSearch(String postBizCardCustomerNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postBizCardCustomerNo), xgetCValuePostBizCardCustomerNo(), "POST_BIZ_CARD_CUSTOMER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPostBizCardCustomerNo_NotLikeSearch(String postBizCardCustomerNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postBizCardCustomerNo), xgetCValuePostBizCardCustomerNo(), "POST_BIZ_CARD_CUSTOMER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @param postBizCardCustomerNo The value of postBizCardCustomerNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostBizCardCustomerNo_PrefixSearch(String postBizCardCustomerNo) {
        setPostBizCardCustomerNo_LikeSearch(postBizCardCustomerNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     */
    public void setPostBizCardCustomerNo_IsNull() { regPostBizCardCustomerNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     */
    public void setPostBizCardCustomerNo_IsNullOrEmpty() { regPostBizCardCustomerNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     */
    public void setPostBizCardCustomerNo_IsNotNull() { regPostBizCardCustomerNo(CK_ISNN, DOBJ); }

    protected void regPostBizCardCustomerNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostBizCardCustomerNo(), "POST_BIZ_CARD_CUSTOMER_NO"); }
    protected abstract ConditionValue xgetCValuePostBizCardCustomerNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_Equal(String shippingCompanyCode) {
        doSetShippingCompanyCode_Equal(fRES(shippingCompanyCode));
    }

    protected void doSetShippingCompanyCode_Equal(String shippingCompanyCode) {
        regShippingCompanyCode(CK_EQ, shippingCompanyCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_NotEqual(String shippingCompanyCode) {
        doSetShippingCompanyCode_NotEqual(fRES(shippingCompanyCode));
    }

    protected void doSetShippingCompanyCode_NotEqual(String shippingCompanyCode) {
        regShippingCompanyCode(CK_NES, shippingCompanyCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_GreaterThan(String shippingCompanyCode) {
        regShippingCompanyCode(CK_GT, fRES(shippingCompanyCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_LessThan(String shippingCompanyCode) {
        regShippingCompanyCode(CK_LT, fRES(shippingCompanyCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_GreaterEqual(String shippingCompanyCode) {
        regShippingCompanyCode(CK_GE, fRES(shippingCompanyCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_LessEqual(String shippingCompanyCode) {
        regShippingCompanyCode(CK_LE, fRES(shippingCompanyCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCodeList The collection of shippingCompanyCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_InScope(Collection<String> shippingCompanyCodeList) {
        doSetShippingCompanyCode_InScope(shippingCompanyCodeList);
    }

    protected void doSetShippingCompanyCode_InScope(Collection<String> shippingCompanyCodeList) {
        regINS(CK_INS, cTL(shippingCompanyCodeList), xgetCValueShippingCompanyCode(), "SHIPPING_COMPANY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCodeList The collection of shippingCompanyCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_NotInScope(Collection<String> shippingCompanyCodeList) {
        doSetShippingCompanyCode_NotInScope(shippingCompanyCodeList);
    }

    protected void doSetShippingCompanyCode_NotInScope(Collection<String> shippingCompanyCodeList) {
        regINS(CK_NINS, cTL(shippingCompanyCodeList), xgetCValueShippingCompanyCode(), "SHIPPING_COMPANY_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)} <br>
     * <pre>e.g. setShippingCompanyCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingCompanyCode The value of shippingCompanyCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingCompanyCode_LikeSearch(String shippingCompanyCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingCompanyCode), xgetCValueShippingCompanyCode(), "SHIPPING_COMPANY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingCompanyCode_NotLikeSearch(String shippingCompanyCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingCompanyCode), xgetCValueShippingCompanyCode(), "SHIPPING_COMPANY_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @param shippingCompanyCode The value of shippingCompanyCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCompanyCode_PrefixSearch(String shippingCompanyCode) {
        setShippingCompanyCode_LikeSearch(shippingCompanyCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     */
    public void setShippingCompanyCode_IsNull() { regShippingCompanyCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     */
    public void setShippingCompanyCode_IsNullOrEmpty() { regShippingCompanyCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     */
    public void setShippingCompanyCode_IsNotNull() { regShippingCompanyCode(CK_ISNN, DOBJ); }

    protected void regShippingCompanyCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingCompanyCode(), "SHIPPING_COMPANY_CODE"); }
    protected abstract ConditionValue xgetCValueShippingCompanyCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_Equal(String shipmentCode) {
        doSetShipmentCode_Equal(fRES(shipmentCode));
    }

    protected void doSetShipmentCode_Equal(String shipmentCode) {
        regShipmentCode(CK_EQ, shipmentCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_NotEqual(String shipmentCode) {
        doSetShipmentCode_NotEqual(fRES(shipmentCode));
    }

    protected void doSetShipmentCode_NotEqual(String shipmentCode) {
        regShipmentCode(CK_NES, shipmentCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_GreaterThan(String shipmentCode) {
        regShipmentCode(CK_GT, fRES(shipmentCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_LessThan(String shipmentCode) {
        regShipmentCode(CK_LT, fRES(shipmentCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_GreaterEqual(String shipmentCode) {
        regShipmentCode(CK_GE, fRES(shipmentCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_LessEqual(String shipmentCode) {
        regShipmentCode(CK_LE, fRES(shipmentCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCodeList The collection of shipmentCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_InScope(Collection<String> shipmentCodeList) {
        doSetShipmentCode_InScope(shipmentCodeList);
    }

    protected void doSetShipmentCode_InScope(Collection<String> shipmentCodeList) {
        regINS(CK_INS, cTL(shipmentCodeList), xgetCValueShipmentCode(), "SHIPMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCodeList The collection of shipmentCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_NotInScope(Collection<String> shipmentCodeList) {
        doSetShipmentCode_NotInScope(shipmentCodeList);
    }

    protected void doSetShipmentCode_NotInScope(Collection<String> shipmentCodeList) {
        regINS(CK_NINS, cTL(shipmentCodeList), xgetCValueShipmentCode(), "SHIPMENT_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)} <br>
     * <pre>e.g. setShipmentCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentCode The value of shipmentCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentCode_LikeSearch(String shipmentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentCode), xgetCValueShipmentCode(), "SHIPMENT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentCode_NotLikeSearch(String shipmentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentCode), xgetCValueShipmentCode(), "SHIPMENT_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @param shipmentCode The value of shipmentCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentCode_PrefixSearch(String shipmentCode) {
        setShipmentCode_LikeSearch(shipmentCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     */
    public void setShipmentCode_IsNull() { regShipmentCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     */
    public void setShipmentCode_IsNullOrEmpty() { regShipmentCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_CODE: {varchar(30)}
     */
    public void setShipmentCode_IsNotNull() { regShipmentCode(CK_ISNN, DOBJ); }

    protected void regShipmentCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentCode(), "SHIPMENT_CODE"); }
    protected abstract ConditionValue xgetCValueShipmentCode();

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
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierSlipYupkCB.class);
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
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierSlipYupkCB.class);
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
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierSlipYupkCB.class);
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
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierSlipYupkCB.class);
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
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierSlipYupkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierSlipYupkCB&gt;() {
     *     public void query(MCarrierSlipYupkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierSlipYupkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierSlipYupkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierSlipYupkCQ sq);

    protected MCarrierSlipYupkCB xcreateScalarConditionCB() {
        MCarrierSlipYupkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierSlipYupkCB xcreateScalarConditionPartitionByCB() {
        MCarrierSlipYupkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierSlipYupkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_SLIP_YUPK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierSlipYupkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYupkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierSlipYupkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_SLIP_YUPK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierSlipYupkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierSlipYupkCQ sq);

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
    protected MCarrierSlipYupkCB newMyCB() {
        return new MCarrierSlipYupkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierSlipYupkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of M_CARRIER_SLIP_SGW.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierSlipSgwCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierSlipSgwCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_SLIP_SGW";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_Equal(Long carrierSlipSgwId) {
        doSetCarrierSlipSgwId_Equal(carrierSlipSgwId);
    }

    protected void doSetCarrierSlipSgwId_Equal(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_EQ, carrierSlipSgwId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_NotEqual(Long carrierSlipSgwId) {
        doSetCarrierSlipSgwId_NotEqual(carrierSlipSgwId);
    }

    protected void doSetCarrierSlipSgwId_NotEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_NES, carrierSlipSgwId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_GreaterThan(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_GT, carrierSlipSgwId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_LessThan(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_LT, carrierSlipSgwId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_GreaterEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_GE, carrierSlipSgwId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_LessEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_LE, carrierSlipSgwId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of carrierSlipSgwId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipSgwId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipSgwId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwIdList The collection of carrierSlipSgwId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_InScope(Collection<Long> carrierSlipSgwIdList) {
        doSetCarrierSlipSgwId_InScope(carrierSlipSgwIdList);
    }

    protected void doSetCarrierSlipSgwId_InScope(Collection<Long> carrierSlipSgwIdList) {
        regINS(CK_INS, cTL(carrierSlipSgwIdList), xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param carrierSlipSgwIdList The collection of carrierSlipSgwId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_NotInScope(Collection<Long> carrierSlipSgwIdList) {
        doSetCarrierSlipSgwId_NotInScope(carrierSlipSgwIdList);
    }

    protected void doSetCarrierSlipSgwId_NotInScope(Collection<Long> carrierSlipSgwIdList) {
        regINS(CK_NINS, cTL(carrierSlipSgwIdList), xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_SLIP_SGW_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipSgwId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipSgwId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_SLIP_SGW_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCarrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipSgwId_IsNull() { regCarrierSlipSgwId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCarrierSlipSgwId_IsNotNull() { regCarrierSlipSgwId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipSgwId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipSgwId();

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
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_Equal(String slipCustomerCd) {
        doSetSlipCustomerCd_Equal(fRES(slipCustomerCd));
    }

    protected void doSetSlipCustomerCd_Equal(String slipCustomerCd) {
        regSlipCustomerCd(CK_EQ, slipCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_NotEqual(String slipCustomerCd) {
        doSetSlipCustomerCd_NotEqual(fRES(slipCustomerCd));
    }

    protected void doSetSlipCustomerCd_NotEqual(String slipCustomerCd) {
        regSlipCustomerCd(CK_NES, slipCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_GreaterThan(String slipCustomerCd) {
        regSlipCustomerCd(CK_GT, fRES(slipCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_LessThan(String slipCustomerCd) {
        regSlipCustomerCd(CK_LT, fRES(slipCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_GreaterEqual(String slipCustomerCd) {
        regSlipCustomerCd(CK_GE, fRES(slipCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_LessEqual(String slipCustomerCd) {
        regSlipCustomerCd(CK_LE, fRES(slipCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCdList The collection of slipCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_InScope(Collection<String> slipCustomerCdList) {
        doSetSlipCustomerCd_InScope(slipCustomerCdList);
    }

    protected void doSetSlipCustomerCd_InScope(Collection<String> slipCustomerCdList) {
        regINS(CK_INS, cTL(slipCustomerCdList), xgetCValueSlipCustomerCd(), "SLIP_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCdList The collection of slipCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_NotInScope(Collection<String> slipCustomerCdList) {
        doSetSlipCustomerCd_NotInScope(slipCustomerCdList);
    }

    protected void doSetSlipCustomerCd_NotInScope(Collection<String> slipCustomerCdList) {
        regINS(CK_NINS, cTL(slipCustomerCdList), xgetCValueSlipCustomerCd(), "SLIP_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)} <br>
     * <pre>e.g. setSlipCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipCustomerCd The value of slipCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipCustomerCd_LikeSearch(String slipCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipCustomerCd), xgetCValueSlipCustomerCd(), "SLIP_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipCustomerCd_NotLikeSearch(String slipCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipCustomerCd), xgetCValueSlipCustomerCd(), "SLIP_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @param slipCustomerCd The value of slipCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipCustomerCd_PrefixSearch(String slipCustomerCd) {
        setSlipCustomerCd_LikeSearch(slipCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     */
    public void setSlipCustomerCd_IsNull() { regSlipCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     */
    public void setSlipCustomerCd_IsNullOrEmpty() { regSlipCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     */
    public void setSlipCustomerCd_IsNotNull() { regSlipCustomerCd(CK_ISNN, DOBJ); }

    protected void regSlipCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipCustomerCd(), "SLIP_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueSlipCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_Equal(String webApiRequestUrl) {
        doSetWebApiRequestUrl_Equal(fRES(webApiRequestUrl));
    }

    protected void doSetWebApiRequestUrl_Equal(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_EQ, webApiRequestUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_NotEqual(String webApiRequestUrl) {
        doSetWebApiRequestUrl_NotEqual(fRES(webApiRequestUrl));
    }

    protected void doSetWebApiRequestUrl_NotEqual(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_NES, webApiRequestUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_GreaterThan(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_GT, fRES(webApiRequestUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_LessThan(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_LT, fRES(webApiRequestUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_GreaterEqual(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_GE, fRES(webApiRequestUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_LessEqual(String webApiRequestUrl) {
        regWebApiRequestUrl(CK_LE, fRES(webApiRequestUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrlList The collection of webApiRequestUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_InScope(Collection<String> webApiRequestUrlList) {
        doSetWebApiRequestUrl_InScope(webApiRequestUrlList);
    }

    protected void doSetWebApiRequestUrl_InScope(Collection<String> webApiRequestUrlList) {
        regINS(CK_INS, cTL(webApiRequestUrlList), xgetCValueWebApiRequestUrl(), "WEB_API_REQUEST_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrlList The collection of webApiRequestUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_NotInScope(Collection<String> webApiRequestUrlList) {
        doSetWebApiRequestUrl_NotInScope(webApiRequestUrlList);
    }

    protected void doSetWebApiRequestUrl_NotInScope(Collection<String> webApiRequestUrlList) {
        regINS(CK_NINS, cTL(webApiRequestUrlList), xgetCValueWebApiRequestUrl(), "WEB_API_REQUEST_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)} <br>
     * <pre>e.g. setWebApiRequestUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param webApiRequestUrl The value of webApiRequestUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWebApiRequestUrl_LikeSearch(String webApiRequestUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(webApiRequestUrl), xgetCValueWebApiRequestUrl(), "WEB_API_REQUEST_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWebApiRequestUrl_NotLikeSearch(String webApiRequestUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(webApiRequestUrl), xgetCValueWebApiRequestUrl(), "WEB_API_REQUEST_URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @param webApiRequestUrl The value of webApiRequestUrl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWebApiRequestUrl_PrefixSearch(String webApiRequestUrl) {
        setWebApiRequestUrl_LikeSearch(webApiRequestUrl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     */
    public void setWebApiRequestUrl_IsNull() { regWebApiRequestUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     */
    public void setWebApiRequestUrl_IsNullOrEmpty() { regWebApiRequestUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     */
    public void setWebApiRequestUrl_IsNotNull() { regWebApiRequestUrl(CK_ISNN, DOBJ); }

    protected void regWebApiRequestUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWebApiRequestUrl(), "WEB_API_REQUEST_URL"); }
    protected abstract ConditionValue xgetCValueWebApiRequestUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(String customerId) {
        doSetCustomerId_Equal(fRES(customerId));
    }

    protected void doSetCustomerId_Equal(String customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(String customerId) {
        doSetCustomerId_NotEqual(fRES(customerId));
    }

    protected void doSetCustomerId_NotEqual(String customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(String customerId) {
        regCustomerId(CK_GT, fRES(customerId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(String customerId) {
        regCustomerId(CK_LT, fRES(customerId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(String customerId) {
        regCustomerId(CK_GE, fRES(customerId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(String customerId) {
        regCustomerId(CK_LE, fRES(customerId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<String> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<String> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<String> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<String> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {varchar(30)} <br>
     * <pre>e.g. setCustomerId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerId The value of customerId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerId_LikeSearch(String customerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerId), xgetCValueCustomerId(), "CUSTOMER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerId_NotLikeSearch(String customerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerId), xgetCValueCustomerId(), "CUSTOMER_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @param customerId The value of customerId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_PrefixSearch(String customerId) {
        setCustomerId_LikeSearch(customerId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     */
    public void setCustomerId_IsNullOrEmpty() { regCustomerId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {varchar(30)}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_Equal(String loginPassword) {
        doSetLoginPassword_Equal(fRES(loginPassword));
    }

    protected void doSetLoginPassword_Equal(String loginPassword) {
        regLoginPassword(CK_EQ, loginPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_NotEqual(String loginPassword) {
        doSetLoginPassword_NotEqual(fRES(loginPassword));
    }

    protected void doSetLoginPassword_NotEqual(String loginPassword) {
        regLoginPassword(CK_NES, loginPassword);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_GreaterThan(String loginPassword) {
        regLoginPassword(CK_GT, fRES(loginPassword));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_LessThan(String loginPassword) {
        regLoginPassword(CK_LT, fRES(loginPassword));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_GreaterEqual(String loginPassword) {
        regLoginPassword(CK_GE, fRES(loginPassword));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_LessEqual(String loginPassword) {
        regLoginPassword(CK_LE, fRES(loginPassword));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPasswordList The collection of loginPassword as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_InScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_InScope(loginPasswordList);
    }

    protected void doSetLoginPassword_InScope(Collection<String> loginPasswordList) {
        regINS(CK_INS, cTL(loginPasswordList), xgetCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPasswordList The collection of loginPassword as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_NotInScope(loginPasswordList);
    }

    protected void doSetLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        regINS(CK_NINS, cTL(loginPasswordList), xgetCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)} <br>
     * <pre>e.g. setLoginPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginPassword The value of loginPassword as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoginPassword_LikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginPassword), xgetCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoginPassword_NotLikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginPassword), xgetCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @param loginPassword The value of loginPassword as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginPassword_PrefixSearch(String loginPassword) {
        setLoginPassword_LikeSearch(loginPassword, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     */
    public void setLoginPassword_IsNull() { regLoginPassword(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     */
    public void setLoginPassword_IsNullOrEmpty() { regLoginPassword(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     */
    public void setLoginPassword_IsNotNull() { regLoginPassword(CK_ISNN, DOBJ); }

    protected void regLoginPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginPassword(), "LOGIN_PASSWORD"); }
    protected abstract ConditionValue xgetCValueLoginPassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_Equal(String deptConsignorNm) {
        doSetDeptConsignorNm_Equal(fRES(deptConsignorNm));
    }

    protected void doSetDeptConsignorNm_Equal(String deptConsignorNm) {
        regDeptConsignorNm(CK_EQ, deptConsignorNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_NotEqual(String deptConsignorNm) {
        doSetDeptConsignorNm_NotEqual(fRES(deptConsignorNm));
    }

    protected void doSetDeptConsignorNm_NotEqual(String deptConsignorNm) {
        regDeptConsignorNm(CK_NES, deptConsignorNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_GreaterThan(String deptConsignorNm) {
        regDeptConsignorNm(CK_GT, fRES(deptConsignorNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_LessThan(String deptConsignorNm) {
        regDeptConsignorNm(CK_LT, fRES(deptConsignorNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_GreaterEqual(String deptConsignorNm) {
        regDeptConsignorNm(CK_GE, fRES(deptConsignorNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_LessEqual(String deptConsignorNm) {
        regDeptConsignorNm(CK_LE, fRES(deptConsignorNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNmList The collection of deptConsignorNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_InScope(Collection<String> deptConsignorNmList) {
        doSetDeptConsignorNm_InScope(deptConsignorNmList);
    }

    protected void doSetDeptConsignorNm_InScope(Collection<String> deptConsignorNmList) {
        regINS(CK_INS, cTL(deptConsignorNmList), xgetCValueDeptConsignorNm(), "DEPT_CONSIGNOR_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNmList The collection of deptConsignorNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_NotInScope(Collection<String> deptConsignorNmList) {
        doSetDeptConsignorNm_NotInScope(deptConsignorNmList);
    }

    protected void doSetDeptConsignorNm_NotInScope(Collection<String> deptConsignorNmList) {
        regINS(CK_NINS, cTL(deptConsignorNmList), xgetCValueDeptConsignorNm(), "DEPT_CONSIGNOR_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)} <br>
     * <pre>e.g. setDeptConsignorNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deptConsignorNm The value of deptConsignorNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeptConsignorNm_LikeSearch(String deptConsignorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deptConsignorNm), xgetCValueDeptConsignorNm(), "DEPT_CONSIGNOR_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeptConsignorNm_NotLikeSearch(String deptConsignorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deptConsignorNm), xgetCValueDeptConsignorNm(), "DEPT_CONSIGNOR_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @param deptConsignorNm The value of deptConsignorNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeptConsignorNm_PrefixSearch(String deptConsignorNm) {
        setDeptConsignorNm_LikeSearch(deptConsignorNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     */
    public void setDeptConsignorNm_IsNull() { regDeptConsignorNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     */
    public void setDeptConsignorNm_IsNullOrEmpty() { regDeptConsignorNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     */
    public void setDeptConsignorNm_IsNotNull() { regDeptConsignorNm(CK_ISNN, DOBJ); }

    protected void regDeptConsignorNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeptConsignorNm(), "DEPT_CONSIGNOR_NM"); }
    protected abstract ConditionValue xgetCValueDeptConsignorNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_Equal(String consignorTelNo) {
        doSetConsignorTelNo_Equal(fRES(consignorTelNo));
    }

    protected void doSetConsignorTelNo_Equal(String consignorTelNo) {
        regConsignorTelNo(CK_EQ, consignorTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_NotEqual(String consignorTelNo) {
        doSetConsignorTelNo_NotEqual(fRES(consignorTelNo));
    }

    protected void doSetConsignorTelNo_NotEqual(String consignorTelNo) {
        regConsignorTelNo(CK_NES, consignorTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_GreaterThan(String consignorTelNo) {
        regConsignorTelNo(CK_GT, fRES(consignorTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_LessThan(String consignorTelNo) {
        regConsignorTelNo(CK_LT, fRES(consignorTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_GreaterEqual(String consignorTelNo) {
        regConsignorTelNo(CK_GE, fRES(consignorTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_LessEqual(String consignorTelNo) {
        regConsignorTelNo(CK_LE, fRES(consignorTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNoList The collection of consignorTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_InScope(Collection<String> consignorTelNoList) {
        doSetConsignorTelNo_InScope(consignorTelNoList);
    }

    protected void doSetConsignorTelNo_InScope(Collection<String> consignorTelNoList) {
        regINS(CK_INS, cTL(consignorTelNoList), xgetCValueConsignorTelNo(), "CONSIGNOR_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNoList The collection of consignorTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_NotInScope(Collection<String> consignorTelNoList) {
        doSetConsignorTelNo_NotInScope(consignorTelNoList);
    }

    protected void doSetConsignorTelNo_NotInScope(Collection<String> consignorTelNoList) {
        regINS(CK_NINS, cTL(consignorTelNoList), xgetCValueConsignorTelNo(), "CONSIGNOR_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)} <br>
     * <pre>e.g. setConsignorTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param consignorTelNo The value of consignorTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConsignorTelNo_LikeSearch(String consignorTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(consignorTelNo), xgetCValueConsignorTelNo(), "CONSIGNOR_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConsignorTelNo_NotLikeSearch(String consignorTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(consignorTelNo), xgetCValueConsignorTelNo(), "CONSIGNOR_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @param consignorTelNo The value of consignorTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConsignorTelNo_PrefixSearch(String consignorTelNo) {
        setConsignorTelNo_LikeSearch(consignorTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     */
    public void setConsignorTelNo_IsNull() { regConsignorTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     */
    public void setConsignorTelNo_IsNullOrEmpty() { regConsignorTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     */
    public void setConsignorTelNo_IsNotNull() { regConsignorTelNo(CK_ISNN, DOBJ); }

    protected void regConsignorTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConsignorTelNo(), "CONSIGNOR_TEL_NO"); }
    protected abstract ConditionValue xgetCValueConsignorTelNo();

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
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_Equal(String slipClientNm2) {
        doSetSlipClientNm2_Equal(fRES(slipClientNm2));
    }

    protected void doSetSlipClientNm2_Equal(String slipClientNm2) {
        regSlipClientNm2(CK_EQ, slipClientNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_NotEqual(String slipClientNm2) {
        doSetSlipClientNm2_NotEqual(fRES(slipClientNm2));
    }

    protected void doSetSlipClientNm2_NotEqual(String slipClientNm2) {
        regSlipClientNm2(CK_NES, slipClientNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_GreaterThan(String slipClientNm2) {
        regSlipClientNm2(CK_GT, fRES(slipClientNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_LessThan(String slipClientNm2) {
        regSlipClientNm2(CK_LT, fRES(slipClientNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_GreaterEqual(String slipClientNm2) {
        regSlipClientNm2(CK_GE, fRES(slipClientNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_LessEqual(String slipClientNm2) {
        regSlipClientNm2(CK_LE, fRES(slipClientNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2List The collection of slipClientNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_InScope(Collection<String> slipClientNm2List) {
        doSetSlipClientNm2_InScope(slipClientNm2List);
    }

    protected void doSetSlipClientNm2_InScope(Collection<String> slipClientNm2List) {
        regINS(CK_INS, cTL(slipClientNm2List), xgetCValueSlipClientNm2(), "SLIP_CLIENT_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2List The collection of slipClientNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_NotInScope(Collection<String> slipClientNm2List) {
        doSetSlipClientNm2_NotInScope(slipClientNm2List);
    }

    protected void doSetSlipClientNm2_NotInScope(Collection<String> slipClientNm2List) {
        regINS(CK_NINS, cTL(slipClientNm2List), xgetCValueSlipClientNm2(), "SLIP_CLIENT_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)} <br>
     * <pre>e.g. setSlipClientNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipClientNm2 The value of slipClientNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipClientNm2_LikeSearch(String slipClientNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipClientNm2), xgetCValueSlipClientNm2(), "SLIP_CLIENT_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipClientNm2_NotLikeSearch(String slipClientNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipClientNm2), xgetCValueSlipClientNm2(), "SLIP_CLIENT_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @param slipClientNm2 The value of slipClientNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipClientNm2_PrefixSearch(String slipClientNm2) {
        setSlipClientNm2_LikeSearch(slipClientNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     */
    public void setSlipClientNm2_IsNull() { regSlipClientNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     */
    public void setSlipClientNm2_IsNullOrEmpty() { regSlipClientNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     */
    public void setSlipClientNm2_IsNotNull() { regSlipClientNm2(CK_ISNN, DOBJ); }

    protected void regSlipClientNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipClientNm2(), "SLIP_CLIENT_NM2"); }
    protected abstract ConditionValue xgetCValueSlipClientNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @param slipShapeCd The value of slipShapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_Equal(String slipShapeCd) {
        doSetSlipShapeCd_Equal(fRES(slipShapeCd));
    }

    /**
     * Equal(=). As CenterSlipShapeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd cdef) {
        doSetSlipShapeCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 箱類
     */
    public void setSlipShapeCd_Equal_$001() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: バッグ類
     */
    public void setSlipShapeCd_Equal_$002() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: スーツケース
     */
    public void setSlipShapeCd_Equal_$003() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$003);
    }

    /**
     * Equal(=). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 封筒類
     */
    public void setSlipShapeCd_Equal_$004() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$004);
    }

    /**
     * Equal(=). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: ゴルフバッグ
     */
    public void setSlipShapeCd_Equal_$005() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$005);
    }

    /**
     * Equal(=). As $006 (006). And OnlyOnceRegistered. <br>
     * $006: スキー
     */
    public void setSlipShapeCd_Equal_$006() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$006);
    }

    /**
     * Equal(=). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: スノーボード
     */
    public void setSlipShapeCd_Equal_$007() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$007);
    }

    /**
     * Equal(=). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: その他
     */
    public void setSlipShapeCd_Equal_$008() {
        setSlipShapeCd_Equal_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$008);
    }

    protected void doSetSlipShapeCd_Equal(String slipShapeCd) {
        regSlipShapeCd(CK_EQ, slipShapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @param slipShapeCd The value of slipShapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_NotEqual(String slipShapeCd) {
        doSetSlipShapeCd_NotEqual(fRES(slipShapeCd));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterSlipShapeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd cdef) {
        doSetSlipShapeCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 箱類
     */
    public void setSlipShapeCd_NotEqual_$001() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: バッグ類
     */
    public void setSlipShapeCd_NotEqual_$002() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: スーツケース
     */
    public void setSlipShapeCd_NotEqual_$003() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$003);
    }

    /**
     * NotEqual(&lt;&gt;). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 封筒類
     */
    public void setSlipShapeCd_NotEqual_$004() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$004);
    }

    /**
     * NotEqual(&lt;&gt;). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: ゴルフバッグ
     */
    public void setSlipShapeCd_NotEqual_$005() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$005);
    }

    /**
     * NotEqual(&lt;&gt;). As $006 (006). And OnlyOnceRegistered. <br>
     * $006: スキー
     */
    public void setSlipShapeCd_NotEqual_$006() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$006);
    }

    /**
     * NotEqual(&lt;&gt;). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: スノーボード
     */
    public void setSlipShapeCd_NotEqual_$007() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$007);
    }

    /**
     * NotEqual(&lt;&gt;). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: その他
     */
    public void setSlipShapeCd_NotEqual_$008() {
        setSlipShapeCd_NotEqual_AsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$008);
    }

    protected void doSetSlipShapeCd_NotEqual(String slipShapeCd) {
        regSlipShapeCd(CK_NES, slipShapeCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @param slipShapeCdList The collection of slipShapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_InScope(Collection<String> slipShapeCdList) {
        doSetSlipShapeCd_InScope(slipShapeCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterSlipShapeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_InScope_AsCenterSlipShapeCd(Collection<CDef.CenterSlipShapeCd> cdefList) {
        doSetSlipShapeCd_InScope(cTStrL(cdefList));
    }

    protected void doSetSlipShapeCd_InScope(Collection<String> slipShapeCdList) {
        regINS(CK_INS, cTL(slipShapeCdList), xgetCValueSlipShapeCd(), "SLIP_SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @param slipShapeCdList The collection of slipShapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_NotInScope(Collection<String> slipShapeCdList) {
        doSetSlipShapeCd_NotInScope(slipShapeCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterSlipShapeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipShapeCd_NotInScope_AsCenterSlipShapeCd(Collection<CDef.CenterSlipShapeCd> cdefList) {
        doSetSlipShapeCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlipShapeCd_NotInScope(Collection<String> slipShapeCdList) {
        regINS(CK_NINS, cTL(slipShapeCdList), xgetCValueSlipShapeCd(), "SLIP_SHAPE_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     */
    public void setSlipShapeCd_IsNull() { regSlipShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     */
    public void setSlipShapeCd_IsNullOrEmpty() { regSlipShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     */
    public void setSlipShapeCd_IsNotNull() { regSlipShapeCd(CK_ISNN, DOBJ); }

    protected void regSlipShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipShapeCd(), "SLIP_SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueSlipShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
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
     * SLIP_ITEM_NM1: {varchar(255)}
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
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterThan(String slipItemNm1) {
        regSlipItemNm1(CK_GT, fRES(slipItemNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessThan(String slipItemNm1) {
        regSlipItemNm1(CK_LT, fRES(slipItemNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterEqual(String slipItemNm1) {
        regSlipItemNm1(CK_GE, fRES(slipItemNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessEqual(String slipItemNm1) {
        regSlipItemNm1(CK_LE, fRES(slipItemNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
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
     * SLIP_ITEM_NM1: {varchar(255)}
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
     * SLIP_ITEM_NM1: {varchar(255)} <br>
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
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm1_NotLikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @param slipItemNm1 The value of slipItemNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_PrefixSearch(String slipItemNm1) {
        setSlipItemNm1_LikeSearch(slipItemNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     */
    public void setSlipItemNm1_IsNull() { regSlipItemNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     */
    public void setSlipItemNm1_IsNullOrEmpty() { regSlipItemNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     */
    public void setSlipItemNm1_IsNotNull() { regSlipItemNm1(CK_ISNN, DOBJ); }

    protected void regSlipItemNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1"); }
    protected abstract ConditionValue xgetCValueSlipItemNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
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
     * SLIP_ITEM_NM2: {varchar(255)}
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
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterThan(String slipItemNm2) {
        regSlipItemNm2(CK_GT, fRES(slipItemNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessThan(String slipItemNm2) {
        regSlipItemNm2(CK_LT, fRES(slipItemNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterEqual(String slipItemNm2) {
        regSlipItemNm2(CK_GE, fRES(slipItemNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessEqual(String slipItemNm2) {
        regSlipItemNm2(CK_LE, fRES(slipItemNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
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
     * SLIP_ITEM_NM2: {varchar(255)}
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
     * SLIP_ITEM_NM2: {varchar(255)} <br>
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
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm2_NotLikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_PrefixSearch(String slipItemNm2) {
        setSlipItemNm2_LikeSearch(slipItemNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNull() { regSlipItemNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNullOrEmpty() { regSlipItemNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNotNull() { regSlipItemNm2(CK_ISNN, DOBJ); }

    protected void regSlipItemNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2"); }
    protected abstract ConditionValue xgetCValueSlipItemNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_Equal(String slipItemNm3) {
        doSetSlipItemNm3_Equal(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_Equal(String slipItemNm3) {
        regSlipItemNm3(CK_EQ, slipItemNm3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotEqual(String slipItemNm3) {
        doSetSlipItemNm3_NotEqual(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_NotEqual(String slipItemNm3) {
        regSlipItemNm3(CK_NES, slipItemNm3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterThan(String slipItemNm3) {
        regSlipItemNm3(CK_GT, fRES(slipItemNm3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessThan(String slipItemNm3) {
        regSlipItemNm3(CK_LT, fRES(slipItemNm3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterEqual(String slipItemNm3) {
        regSlipItemNm3(CK_GE, fRES(slipItemNm3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessEqual(String slipItemNm3) {
        regSlipItemNm3(CK_LE, fRES(slipItemNm3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_InScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        regINS(CK_INS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_NotInScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        regINS(CK_NINS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm3 The value of slipItemNm3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm3_LikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm3_NotLikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_PrefixSearch(String slipItemNm3) {
        setSlipItemNm3_LikeSearch(slipItemNm3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNull() { regSlipItemNm3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNullOrEmpty() { regSlipItemNm3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNotNull() { regSlipItemNm3(CK_ISNN, DOBJ); }

    protected void regSlipItemNm3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3"); }
    protected abstract ConditionValue xgetCValueSlipItemNm3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_Equal(String slipItemNm4) {
        doSetSlipItemNm4_Equal(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_Equal(String slipItemNm4) {
        regSlipItemNm4(CK_EQ, slipItemNm4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotEqual(String slipItemNm4) {
        doSetSlipItemNm4_NotEqual(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_NotEqual(String slipItemNm4) {
        regSlipItemNm4(CK_NES, slipItemNm4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterThan(String slipItemNm4) {
        regSlipItemNm4(CK_GT, fRES(slipItemNm4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessThan(String slipItemNm4) {
        regSlipItemNm4(CK_LT, fRES(slipItemNm4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterEqual(String slipItemNm4) {
        regSlipItemNm4(CK_GE, fRES(slipItemNm4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessEqual(String slipItemNm4) {
        regSlipItemNm4(CK_LE, fRES(slipItemNm4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_InScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        regINS(CK_INS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_NotInScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        regINS(CK_NINS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm4 The value of slipItemNm4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm4_LikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm4_NotLikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_PrefixSearch(String slipItemNm4) {
        setSlipItemNm4_LikeSearch(slipItemNm4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNull() { regSlipItemNm4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNullOrEmpty() { regSlipItemNm4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNotNull() { regSlipItemNm4(CK_ISNN, DOBJ); }

    protected void regSlipItemNm4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4"); }
    protected abstract ConditionValue xgetCValueSlipItemNm4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_Equal(String slipItemNm5) {
        doSetSlipItemNm5_Equal(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_Equal(String slipItemNm5) {
        regSlipItemNm5(CK_EQ, slipItemNm5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotEqual(String slipItemNm5) {
        doSetSlipItemNm5_NotEqual(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_NotEqual(String slipItemNm5) {
        regSlipItemNm5(CK_NES, slipItemNm5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterThan(String slipItemNm5) {
        regSlipItemNm5(CK_GT, fRES(slipItemNm5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessThan(String slipItemNm5) {
        regSlipItemNm5(CK_LT, fRES(slipItemNm5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterEqual(String slipItemNm5) {
        regSlipItemNm5(CK_GE, fRES(slipItemNm5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessEqual(String slipItemNm5) {
        regSlipItemNm5(CK_LE, fRES(slipItemNm5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_InScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        regINS(CK_INS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_NotInScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        regINS(CK_NINS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm5 The value of slipItemNm5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm5_LikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm5_NotLikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_PrefixSearch(String slipItemNm5) {
        setSlipItemNm5_LikeSearch(slipItemNm5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNull() { regSlipItemNm5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNullOrEmpty() { regSlipItemNm5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNotNull() { regSlipItemNm5(CK_ISNN, DOBJ); }

    protected void regSlipItemNm5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5"); }
    protected abstract ConditionValue xgetCValueSlipItemNm5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @param transportTypeSpeed The value of transportTypeSpeed as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_Equal(String transportTypeSpeed) {
        doSetTransportTypeSpeed_Equal(fRES(transportTypeSpeed));
    }

    /**
     * Equal(=). As CenterTransportTypeSpeed. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed cdef) {
        doSetTransportTypeSpeed_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $000 (000). And OnlyOnceRegistered. <br>
     * $000: 飛脚宅配便
     */
    public void setTransportTypeSpeed_Equal_$000() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$000);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚スーパー便
     */
    public void setTransportTypeSpeed_Equal_$001() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚即配便
     */
    public void setTransportTypeSpeed_Equal_$002() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚航空便(翌日中配達)
     */
    public void setTransportTypeSpeed_Equal_$003() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$003);
    }

    /**
     * Equal(=). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 飛脚航空便(翌日午前中配達)
     */
    public void setTransportTypeSpeed_Equal_$004() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$004);
    }

    /**
     * Equal(=). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 飛脚ジャストタイム便
     */
    public void setTransportTypeSpeed_Equal_$005() {
        setTransportTypeSpeed_Equal_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$005);
    }

    protected void doSetTransportTypeSpeed_Equal(String transportTypeSpeed) {
        regTransportTypeSpeed(CK_EQ, transportTypeSpeed);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @param transportTypeSpeed The value of transportTypeSpeed as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_NotEqual(String transportTypeSpeed) {
        doSetTransportTypeSpeed_NotEqual(fRES(transportTypeSpeed));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTransportTypeSpeed. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed cdef) {
        doSetTransportTypeSpeed_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $000 (000). And OnlyOnceRegistered. <br>
     * $000: 飛脚宅配便
     */
    public void setTransportTypeSpeed_NotEqual_$000() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$000);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚スーパー便
     */
    public void setTransportTypeSpeed_NotEqual_$001() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚即配便
     */
    public void setTransportTypeSpeed_NotEqual_$002() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚航空便(翌日中配達)
     */
    public void setTransportTypeSpeed_NotEqual_$003() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$003);
    }

    /**
     * NotEqual(&lt;&gt;). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 飛脚航空便(翌日午前中配達)
     */
    public void setTransportTypeSpeed_NotEqual_$004() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$004);
    }

    /**
     * NotEqual(&lt;&gt;). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 飛脚ジャストタイム便
     */
    public void setTransportTypeSpeed_NotEqual_$005() {
        setTransportTypeSpeed_NotEqual_AsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$005);
    }

    protected void doSetTransportTypeSpeed_NotEqual(String transportTypeSpeed) {
        regTransportTypeSpeed(CK_NES, transportTypeSpeed);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @param transportTypeSpeedList The collection of transportTypeSpeed as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_InScope(Collection<String> transportTypeSpeedList) {
        doSetTransportTypeSpeed_InScope(transportTypeSpeedList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTransportTypeSpeed. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_InScope_AsCenterTransportTypeSpeed(Collection<CDef.CenterTransportTypeSpeed> cdefList) {
        doSetTransportTypeSpeed_InScope(cTStrL(cdefList));
    }

    protected void doSetTransportTypeSpeed_InScope(Collection<String> transportTypeSpeedList) {
        regINS(CK_INS, cTL(transportTypeSpeedList), xgetCValueTransportTypeSpeed(), "TRANSPORT_TYPE_SPEED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @param transportTypeSpeedList The collection of transportTypeSpeed as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_NotInScope(Collection<String> transportTypeSpeedList) {
        doSetTransportTypeSpeed_NotInScope(transportTypeSpeedList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTransportTypeSpeed. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeSpeed_NotInScope_AsCenterTransportTypeSpeed(Collection<CDef.CenterTransportTypeSpeed> cdefList) {
        doSetTransportTypeSpeed_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTransportTypeSpeed_NotInScope(Collection<String> transportTypeSpeedList) {
        regINS(CK_NINS, cTL(transportTypeSpeedList), xgetCValueTransportTypeSpeed(), "TRANSPORT_TYPE_SPEED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     */
    public void setTransportTypeSpeed_IsNull() { regTransportTypeSpeed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     */
    public void setTransportTypeSpeed_IsNullOrEmpty() { regTransportTypeSpeed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     */
    public void setTransportTypeSpeed_IsNotNull() { regTransportTypeSpeed(CK_ISNN, DOBJ); }

    protected void regTransportTypeSpeed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportTypeSpeed(), "TRANSPORT_TYPE_SPEED"); }
    protected abstract ConditionValue xgetCValueTransportTypeSpeed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @param transportTypeItem The value of transportTypeItem as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_Equal(String transportTypeItem) {
        doSetTransportTypeItem_Equal(fRES(transportTypeItem));
    }

    /**
     * Equal(=). As CenterTransportTypeItem. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportTypeItem_Equal_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem cdef) {
        doSetTransportTypeItem_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 指定なし
     */
    public void setTransportTypeItem_Equal_$001() {
        setTransportTypeItem_Equal_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷蔵)
     */
    public void setTransportTypeItem_Equal_$002() {
        setTransportTypeItem_Equal_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚クール便(冷凍)
     */
    public void setTransportTypeItem_Equal_$003() {
        setTransportTypeItem_Equal_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$003);
    }

    protected void doSetTransportTypeItem_Equal(String transportTypeItem) {
        regTransportTypeItem(CK_EQ, transportTypeItem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @param transportTypeItem The value of transportTypeItem as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_NotEqual(String transportTypeItem) {
        doSetTransportTypeItem_NotEqual(fRES(transportTypeItem));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTransportTypeItem. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportTypeItem_NotEqual_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem cdef) {
        doSetTransportTypeItem_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 指定なし
     */
    public void setTransportTypeItem_NotEqual_$001() {
        setTransportTypeItem_NotEqual_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷蔵)
     */
    public void setTransportTypeItem_NotEqual_$002() {
        setTransportTypeItem_NotEqual_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚クール便(冷凍)
     */
    public void setTransportTypeItem_NotEqual_$003() {
        setTransportTypeItem_NotEqual_AsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$003);
    }

    protected void doSetTransportTypeItem_NotEqual(String transportTypeItem) {
        regTransportTypeItem(CK_NES, transportTypeItem);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @param transportTypeItemList The collection of transportTypeItem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_InScope(Collection<String> transportTypeItemList) {
        doSetTransportTypeItem_InScope(transportTypeItemList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTransportTypeItem. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_InScope_AsCenterTransportTypeItem(Collection<CDef.CenterTransportTypeItem> cdefList) {
        doSetTransportTypeItem_InScope(cTStrL(cdefList));
    }

    protected void doSetTransportTypeItem_InScope(Collection<String> transportTypeItemList) {
        regINS(CK_INS, cTL(transportTypeItemList), xgetCValueTransportTypeItem(), "TRANSPORT_TYPE_ITEM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @param transportTypeItemList The collection of transportTypeItem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_NotInScope(Collection<String> transportTypeItemList) {
        doSetTransportTypeItem_NotInScope(transportTypeItemList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTransportTypeItem. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportTypeItem_NotInScope_AsCenterTransportTypeItem(Collection<CDef.CenterTransportTypeItem> cdefList) {
        doSetTransportTypeItem_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTransportTypeItem_NotInScope(Collection<String> transportTypeItemList) {
        regINS(CK_NINS, cTL(transportTypeItemList), xgetCValueTransportTypeItem(), "TRANSPORT_TYPE_ITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     */
    public void setTransportTypeItem_IsNull() { regTransportTypeItem(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     */
    public void setTransportTypeItem_IsNullOrEmpty() { regTransportTypeItem(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     */
    public void setTransportTypeItem_IsNotNull() { regTransportTypeItem(CK_ISNN, DOBJ); }

    protected void regTransportTypeItem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportTypeItem(), "TRANSPORT_TYPE_ITEM"); }
    protected abstract ConditionValue xgetCValueTransportTypeItem();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @param settlementType The value of settlementType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_Equal(String settlementType) {
        doSetSettlementType_Equal(fRES(settlementType));
    }

    /**
     * Equal(=). As SettlementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementType_Equal_AsSettlementType(CDef.SettlementType cdef) {
        doSetSettlementType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 指定なし
     */
    public void setSettlementType_Equal_$0() {
        setSettlementType_Equal_AsSettlementType(CDef.SettlementType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 全て可
     */
    public void setSettlementType_Equal_$1() {
        setSettlementType_Equal_AsSettlementType(CDef.SettlementType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 現金のみ
     */
    public void setSettlementType_Equal_$2() {
        setSettlementType_Equal_AsSettlementType(CDef.SettlementType.$2);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ﾃﾞﾋﾞｯﾄ･ｸﾚｼﾞｯﾄ
     */
    public void setSettlementType_Equal_$5() {
        setSettlementType_Equal_AsSettlementType(CDef.SettlementType.$5);
    }

    protected void doSetSettlementType_Equal(String settlementType) {
        regSettlementType(CK_EQ, settlementType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @param settlementType The value of settlementType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_NotEqual(String settlementType) {
        doSetSettlementType_NotEqual(fRES(settlementType));
    }

    /**
     * NotEqual(&lt;&gt;). As SettlementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementType_NotEqual_AsSettlementType(CDef.SettlementType cdef) {
        doSetSettlementType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 指定なし
     */
    public void setSettlementType_NotEqual_$0() {
        setSettlementType_NotEqual_AsSettlementType(CDef.SettlementType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 全て可
     */
    public void setSettlementType_NotEqual_$1() {
        setSettlementType_NotEqual_AsSettlementType(CDef.SettlementType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 現金のみ
     */
    public void setSettlementType_NotEqual_$2() {
        setSettlementType_NotEqual_AsSettlementType(CDef.SettlementType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ﾃﾞﾋﾞｯﾄ･ｸﾚｼﾞｯﾄ
     */
    public void setSettlementType_NotEqual_$5() {
        setSettlementType_NotEqual_AsSettlementType(CDef.SettlementType.$5);
    }

    protected void doSetSettlementType_NotEqual(String settlementType) {
        regSettlementType(CK_NES, settlementType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @param settlementTypeList The collection of settlementType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_InScope(Collection<String> settlementTypeList) {
        doSetSettlementType_InScope(settlementTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As SettlementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_InScope_AsSettlementType(Collection<CDef.SettlementType> cdefList) {
        doSetSettlementType_InScope(cTStrL(cdefList));
    }

    protected void doSetSettlementType_InScope(Collection<String> settlementTypeList) {
        regINS(CK_INS, cTL(settlementTypeList), xgetCValueSettlementType(), "SETTLEMENT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @param settlementTypeList The collection of settlementType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_NotInScope(Collection<String> settlementTypeList) {
        doSetSettlementType_NotInScope(settlementTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SettlementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementType_NotInScope_AsSettlementType(Collection<CDef.SettlementType> cdefList) {
        doSetSettlementType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSettlementType_NotInScope(Collection<String> settlementTypeList) {
        regINS(CK_NINS, cTL(settlementTypeList), xgetCValueSettlementType(), "SETTLEMENT_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     */
    public void setSettlementType_IsNull() { regSettlementType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     */
    public void setSettlementType_IsNullOrEmpty() { regSettlementType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     */
    public void setSettlementType_IsNotNull() { regSettlementType(CK_ISNN, DOBJ); }

    protected void regSettlementType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSettlementType(), "SETTLEMENT_TYPE"); }
    protected abstract ConditionValue xgetCValueSettlementType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType1 The value of sealType1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_Equal(String sealType1) {
        doSetSealType1_Equal(fRES(sealType1));
    }

    /**
     * Equal(=). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType1_Equal_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType1_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType1_Equal_$001() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType1_Equal_$002() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType1_Equal_$003() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Equal(=). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType1_Equal_$004() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Equal(=). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType1_Equal_$005() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Equal(=). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType1_Equal_$007() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Equal(=). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType1_Equal_$008() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Equal(=). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType1_Equal_$009() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Equal(=). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType1_Equal_$010() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Equal(=). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType1_Equal_$011() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Equal(=). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType1_Equal_$012() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Equal(=). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType1_Equal_$013() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Equal(=). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType1_Equal_$014() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Equal(=). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType1_Equal_$016() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Equal(=). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType1_Equal_$017() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Equal(=). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType1_Equal_$018() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Equal(=). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType1_Equal_$019() {
        setSealType1_Equal_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType1_Equal(String sealType1) {
        regSealType1(CK_EQ, sealType1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType1 The value of sealType1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_NotEqual(String sealType1) {
        doSetSealType1_NotEqual(fRES(sealType1));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType1_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType1_NotEqual_$001() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType1_NotEqual_$002() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType1_NotEqual_$003() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * NotEqual(&lt;&gt;). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType1_NotEqual_$004() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * NotEqual(&lt;&gt;). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType1_NotEqual_$005() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * NotEqual(&lt;&gt;). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType1_NotEqual_$007() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * NotEqual(&lt;&gt;). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType1_NotEqual_$008() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * NotEqual(&lt;&gt;). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType1_NotEqual_$009() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * NotEqual(&lt;&gt;). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType1_NotEqual_$010() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * NotEqual(&lt;&gt;). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType1_NotEqual_$011() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * NotEqual(&lt;&gt;). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType1_NotEqual_$012() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * NotEqual(&lt;&gt;). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType1_NotEqual_$013() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * NotEqual(&lt;&gt;). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType1_NotEqual_$014() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * NotEqual(&lt;&gt;). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType1_NotEqual_$016() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * NotEqual(&lt;&gt;). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType1_NotEqual_$017() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * NotEqual(&lt;&gt;). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType1_NotEqual_$018() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * NotEqual(&lt;&gt;). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType1_NotEqual_$019() {
        setSealType1_NotEqual_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType1_NotEqual(String sealType1) {
        regSealType1(CK_NES, sealType1);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType1List The collection of sealType1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_InScope(Collection<String> sealType1List) {
        doSetSealType1_InScope(sealType1List);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_InScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType1_InScope(cTStrL(cdefList));
    }

    protected void doSetSealType1_InScope(Collection<String> sealType1List) {
        regINS(CK_INS, cTL(sealType1List), xgetCValueSealType1(), "SEAL_TYPE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType1List The collection of sealType1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_NotInScope(Collection<String> sealType1List) {
        doSetSealType1_NotInScope(sealType1List);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType1_NotInScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType1_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSealType1_NotInScope(Collection<String> sealType1List) {
        regINS(CK_NINS, cTL(sealType1List), xgetCValueSealType1(), "SEAL_TYPE1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType1_IsNull() { regSealType1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType1_IsNullOrEmpty() { regSealType1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType1_IsNotNull() { regSealType1(CK_ISNN, DOBJ); }

    protected void regSealType1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSealType1(), "SEAL_TYPE1"); }
    protected abstract ConditionValue xgetCValueSealType1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType2 The value of sealType2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_Equal(String sealType2) {
        doSetSealType2_Equal(fRES(sealType2));
    }

    /**
     * Equal(=). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType2_Equal_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType2_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType2_Equal_$001() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType2_Equal_$002() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType2_Equal_$003() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Equal(=). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType2_Equal_$004() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Equal(=). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType2_Equal_$005() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Equal(=). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType2_Equal_$007() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Equal(=). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType2_Equal_$008() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Equal(=). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType2_Equal_$009() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Equal(=). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType2_Equal_$010() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Equal(=). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType2_Equal_$011() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Equal(=). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType2_Equal_$012() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Equal(=). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType2_Equal_$013() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Equal(=). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType2_Equal_$014() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Equal(=). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType2_Equal_$016() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Equal(=). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType2_Equal_$017() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Equal(=). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType2_Equal_$018() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Equal(=). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType2_Equal_$019() {
        setSealType2_Equal_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType2_Equal(String sealType2) {
        regSealType2(CK_EQ, sealType2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType2 The value of sealType2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_NotEqual(String sealType2) {
        doSetSealType2_NotEqual(fRES(sealType2));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType2_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType2_NotEqual_$001() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType2_NotEqual_$002() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType2_NotEqual_$003() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * NotEqual(&lt;&gt;). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType2_NotEqual_$004() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * NotEqual(&lt;&gt;). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType2_NotEqual_$005() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * NotEqual(&lt;&gt;). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType2_NotEqual_$007() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * NotEqual(&lt;&gt;). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType2_NotEqual_$008() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * NotEqual(&lt;&gt;). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType2_NotEqual_$009() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * NotEqual(&lt;&gt;). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType2_NotEqual_$010() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * NotEqual(&lt;&gt;). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType2_NotEqual_$011() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * NotEqual(&lt;&gt;). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType2_NotEqual_$012() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * NotEqual(&lt;&gt;). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType2_NotEqual_$013() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * NotEqual(&lt;&gt;). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType2_NotEqual_$014() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * NotEqual(&lt;&gt;). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType2_NotEqual_$016() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * NotEqual(&lt;&gt;). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType2_NotEqual_$017() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * NotEqual(&lt;&gt;). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType2_NotEqual_$018() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * NotEqual(&lt;&gt;). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType2_NotEqual_$019() {
        setSealType2_NotEqual_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType2_NotEqual(String sealType2) {
        regSealType2(CK_NES, sealType2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType2List The collection of sealType2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_InScope(Collection<String> sealType2List) {
        doSetSealType2_InScope(sealType2List);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_InScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType2_InScope(cTStrL(cdefList));
    }

    protected void doSetSealType2_InScope(Collection<String> sealType2List) {
        regINS(CK_INS, cTL(sealType2List), xgetCValueSealType2(), "SEAL_TYPE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType2List The collection of sealType2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_NotInScope(Collection<String> sealType2List) {
        doSetSealType2_NotInScope(sealType2List);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType2_NotInScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType2_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSealType2_NotInScope(Collection<String> sealType2List) {
        regINS(CK_NINS, cTL(sealType2List), xgetCValueSealType2(), "SEAL_TYPE2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType2_IsNull() { regSealType2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType2_IsNullOrEmpty() { regSealType2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType2_IsNotNull() { regSealType2(CK_ISNN, DOBJ); }

    protected void regSealType2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSealType2(), "SEAL_TYPE2"); }
    protected abstract ConditionValue xgetCValueSealType2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType3 The value of sealType3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_Equal(String sealType3) {
        doSetSealType3_Equal(fRES(sealType3));
    }

    /**
     * Equal(=). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType3_Equal_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType3_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType3_Equal_$001() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Equal(=). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType3_Equal_$002() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Equal(=). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType3_Equal_$003() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Equal(=). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType3_Equal_$004() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Equal(=). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType3_Equal_$005() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Equal(=). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType3_Equal_$007() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Equal(=). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType3_Equal_$008() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Equal(=). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType3_Equal_$009() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Equal(=). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType3_Equal_$010() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Equal(=). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType3_Equal_$011() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Equal(=). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType3_Equal_$012() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Equal(=). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType3_Equal_$013() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Equal(=). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType3_Equal_$014() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Equal(=). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType3_Equal_$016() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Equal(=). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType3_Equal_$017() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Equal(=). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType3_Equal_$018() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Equal(=). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType3_Equal_$019() {
        setSealType3_Equal_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType3_Equal(String sealType3) {
        regSealType3(CK_EQ, sealType3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType3 The value of sealType3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_NotEqual(String sealType3) {
        doSetSealType3_NotEqual(fRES(sealType3));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterSealType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType cdef) {
        doSetSealType3_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $001 (001). And OnlyOnceRegistered. <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType3_NotEqual_$001() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * NotEqual(&lt;&gt;). As $002 (002). And OnlyOnceRegistered. <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType3_NotEqual_$002() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * NotEqual(&lt;&gt;). As $003 (003). And OnlyOnceRegistered. <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType3_NotEqual_$003() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * NotEqual(&lt;&gt;). As $004 (004). And OnlyOnceRegistered. <br>
     * $004: 営止めサービス
     */
    public void setSealType3_NotEqual_$004() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * NotEqual(&lt;&gt;). As $005 (005). And OnlyOnceRegistered. <br>
     * $005: 配達指定日
     */
    public void setSealType3_NotEqual_$005() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * NotEqual(&lt;&gt;). As $007 (007). And OnlyOnceRegistered. <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType3_NotEqual_$007() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * NotEqual(&lt;&gt;). As $008 (008). And OnlyOnceRegistered. <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType3_NotEqual_$008() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * NotEqual(&lt;&gt;). As $009 (009). And OnlyOnceRegistered. <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType3_NotEqual_$009() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * NotEqual(&lt;&gt;). As $010 (010). And OnlyOnceRegistered. <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType3_NotEqual_$010() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * NotEqual(&lt;&gt;). As $011 (011). And OnlyOnceRegistered. <br>
     * $011: 取扱注意
     */
    public void setSealType3_NotEqual_$011() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * NotEqual(&lt;&gt;). As $012 (012). And OnlyOnceRegistered. <br>
     * $012: 貴重品
     */
    public void setSealType3_NotEqual_$012() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * NotEqual(&lt;&gt;). As $013 (013). And OnlyOnceRegistered. <br>
     * $013: 天地無用
     */
    public void setSealType3_NotEqual_$013() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * NotEqual(&lt;&gt;). As $014 (014). And OnlyOnceRegistered. <br>
     * $014: 飛脚即配便
     */
    public void setSealType3_NotEqual_$014() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * NotEqual(&lt;&gt;). As $016 (016). And OnlyOnceRegistered. <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType3_NotEqual_$016() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * NotEqual(&lt;&gt;). As $017 (017). And OnlyOnceRegistered. <br>
     * $017: 飛脚航空便
     */
    public void setSealType3_NotEqual_$017() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * NotEqual(&lt;&gt;). As $018 (018). And OnlyOnceRegistered. <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType3_NotEqual_$018() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * NotEqual(&lt;&gt;). As $019 (019). And OnlyOnceRegistered. <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType3_NotEqual_$019() {
        setSealType3_NotEqual_AsCenterSealType(CDef.CenterSealType.$019);
    }

    protected void doSetSealType3_NotEqual(String sealType3) {
        regSealType3(CK_NES, sealType3);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType3List The collection of sealType3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_InScope(Collection<String> sealType3List) {
        doSetSealType3_InScope(sealType3List);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_InScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType3_InScope(cTStrL(cdefList));
    }

    protected void doSetSealType3_InScope(Collection<String> sealType3List) {
        regINS(CK_INS, cTL(sealType3List), xgetCValueSealType3(), "SEAL_TYPE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @param sealType3List The collection of sealType3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_NotInScope(Collection<String> sealType3List) {
        doSetSealType3_NotInScope(sealType3List);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterSealType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSealType3_NotInScope_AsCenterSealType(Collection<CDef.CenterSealType> cdefList) {
        doSetSealType3_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSealType3_NotInScope(Collection<String> sealType3List) {
        regINS(CK_NINS, cTL(sealType3List), xgetCValueSealType3(), "SEAL_TYPE3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType3_IsNull() { regSealType3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType3_IsNullOrEmpty() { regSealType3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     */
    public void setSealType3_IsNotNull() { regSealType3(CK_ISNN, DOBJ); }

    protected void regSealType3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSealType3(), "SEAL_TYPE3"); }
    protected abstract ConditionValue xgetCValueSealType3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @param codCls The value of codCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_Equal(String codCls) {
        doSetCodCls_Equal(fRES(codCls));
    }

    /**
     * Equal(=). As CodCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCls_Equal_AsCodCls(CDef.CodCls cdef) {
        doSetCodCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 元払
     */
    public void setCodCls_Equal_$1() {
        setCodCls_Equal_AsCodCls(CDef.CodCls.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 着払
     */
    public void setCodCls_Equal_$2() {
        setCodCls_Equal_AsCodCls(CDef.CodCls.$2);
    }

    protected void doSetCodCls_Equal(String codCls) {
        regCodCls(CK_EQ, codCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @param codCls The value of codCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_NotEqual(String codCls) {
        doSetCodCls_NotEqual(fRES(codCls));
    }

    /**
     * NotEqual(&lt;&gt;). As CodCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCls_NotEqual_AsCodCls(CDef.CodCls cdef) {
        doSetCodCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 元払
     */
    public void setCodCls_NotEqual_$1() {
        setCodCls_NotEqual_AsCodCls(CDef.CodCls.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 着払
     */
    public void setCodCls_NotEqual_$2() {
        setCodCls_NotEqual_AsCodCls(CDef.CodCls.$2);
    }

    protected void doSetCodCls_NotEqual(String codCls) {
        regCodCls(CK_NES, codCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @param codClsList The collection of codCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_InScope(Collection<String> codClsList) {
        doSetCodCls_InScope(codClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As CodCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_InScope_AsCodCls(Collection<CDef.CodCls> cdefList) {
        doSetCodCls_InScope(cTStrL(cdefList));
    }

    protected void doSetCodCls_InScope(Collection<String> codClsList) {
        regINS(CK_INS, cTL(codClsList), xgetCValueCodCls(), "COD_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @param codClsList The collection of codCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_NotInScope(Collection<String> codClsList) {
        doSetCodCls_NotInScope(codClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CodCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCls_NotInScope_AsCodCls(Collection<CDef.CodCls> cdefList) {
        doSetCodCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCodCls_NotInScope(Collection<String> codClsList) {
        regINS(CK_NINS, cTL(codClsList), xgetCValueCodCls(), "COD_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     */
    public void setCodCls_IsNull() { regCodCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     */
    public void setCodCls_IsNullOrEmpty() { regCodCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     */
    public void setCodCls_IsNotNull() { regCodCls(CK_ISNN, DOBJ); }

    protected void regCodCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodCls(), "COD_CLS"); }
    protected abstract ConditionValue xgetCValueCodCls();

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
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_Equal(String apiOkuriCode) {
        doSetApiOkuriCode_Equal(fRES(apiOkuriCode));
    }

    protected void doSetApiOkuriCode_Equal(String apiOkuriCode) {
        regApiOkuriCode(CK_EQ, apiOkuriCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_NotEqual(String apiOkuriCode) {
        doSetApiOkuriCode_NotEqual(fRES(apiOkuriCode));
    }

    protected void doSetApiOkuriCode_NotEqual(String apiOkuriCode) {
        regApiOkuriCode(CK_NES, apiOkuriCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_GreaterThan(String apiOkuriCode) {
        regApiOkuriCode(CK_GT, fRES(apiOkuriCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_LessThan(String apiOkuriCode) {
        regApiOkuriCode(CK_LT, fRES(apiOkuriCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_GreaterEqual(String apiOkuriCode) {
        regApiOkuriCode(CK_GE, fRES(apiOkuriCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_LessEqual(String apiOkuriCode) {
        regApiOkuriCode(CK_LE, fRES(apiOkuriCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCodeList The collection of apiOkuriCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_InScope(Collection<String> apiOkuriCodeList) {
        doSetApiOkuriCode_InScope(apiOkuriCodeList);
    }

    protected void doSetApiOkuriCode_InScope(Collection<String> apiOkuriCodeList) {
        regINS(CK_INS, cTL(apiOkuriCodeList), xgetCValueApiOkuriCode(), "API_OKURI_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCodeList The collection of apiOkuriCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_NotInScope(Collection<String> apiOkuriCodeList) {
        doSetApiOkuriCode_NotInScope(apiOkuriCodeList);
    }

    protected void doSetApiOkuriCode_NotInScope(Collection<String> apiOkuriCodeList) {
        regINS(CK_NINS, cTL(apiOkuriCodeList), xgetCValueApiOkuriCode(), "API_OKURI_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * API_OKURI_CODE: {varchar(30)} <br>
     * <pre>e.g. setApiOkuriCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param apiOkuriCode The value of apiOkuriCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setApiOkuriCode_LikeSearch(String apiOkuriCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(apiOkuriCode), xgetCValueApiOkuriCode(), "API_OKURI_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setApiOkuriCode_NotLikeSearch(String apiOkuriCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(apiOkuriCode), xgetCValueApiOkuriCode(), "API_OKURI_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @param apiOkuriCode The value of apiOkuriCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiOkuriCode_PrefixSearch(String apiOkuriCode) {
        setApiOkuriCode_LikeSearch(apiOkuriCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     */
    public void setApiOkuriCode_IsNull() { regApiOkuriCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     */
    public void setApiOkuriCode_IsNullOrEmpty() { regApiOkuriCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_OKURI_CODE: {varchar(30)}
     */
    public void setApiOkuriCode_IsNotNull() { regApiOkuriCode(CK_ISNN, DOBJ); }

    protected void regApiOkuriCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiOkuriCode(), "API_OKURI_CODE"); }
    protected abstract ConditionValue xgetCValueApiOkuriCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @param apiBinsyuCode The value of apiBinsyuCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_Equal(String apiBinsyuCode) {
        doSetApiBinsyuCode_Equal(fRES(apiBinsyuCode));
    }

    /**
     * Equal(=). As CenterApiBinsyuCode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode cdef) {
        doSetApiBinsyuCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $000 (000). And OnlyOnceRegistered. <br>
     * $000: 陸便
     */
    public void setApiBinsyuCode_Equal_$000() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$000);
    }

    /**
     * Equal(=). As $030 (030). And OnlyOnceRegistered. <br>
     * $030: 航空便
     */
    public void setApiBinsyuCode_Equal_$030() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$030);
    }

    /**
     * Equal(=). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: クール冷蔵
     */
    public void setApiBinsyuCode_Equal_$140() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$140);
    }

    /**
     * Equal(=). As $141 (141). And OnlyOnceRegistered. <br>
     * $141: クール冷蔵(航空便)
     */
    public void setApiBinsyuCode_Equal_$141() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$141);
    }

    /**
     * Equal(=). As $150 (150). And OnlyOnceRegistered. <br>
     * $150: クール冷凍
     */
    public void setApiBinsyuCode_Equal_$150() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$150);
    }

    /**
     * Equal(=). As $151 (151). And OnlyOnceRegistered. <br>
     * $151: クール冷凍(航空便)
     */
    public void setApiBinsyuCode_Equal_$151() {
        setApiBinsyuCode_Equal_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$151);
    }

    protected void doSetApiBinsyuCode_Equal(String apiBinsyuCode) {
        regApiBinsyuCode(CK_EQ, apiBinsyuCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @param apiBinsyuCode The value of apiBinsyuCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_NotEqual(String apiBinsyuCode) {
        doSetApiBinsyuCode_NotEqual(fRES(apiBinsyuCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiBinsyuCode. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode cdef) {
        doSetApiBinsyuCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $000 (000). And OnlyOnceRegistered. <br>
     * $000: 陸便
     */
    public void setApiBinsyuCode_NotEqual_$000() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$000);
    }

    /**
     * NotEqual(&lt;&gt;). As $030 (030). And OnlyOnceRegistered. <br>
     * $030: 航空便
     */
    public void setApiBinsyuCode_NotEqual_$030() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$030);
    }

    /**
     * NotEqual(&lt;&gt;). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: クール冷蔵
     */
    public void setApiBinsyuCode_NotEqual_$140() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$140);
    }

    /**
     * NotEqual(&lt;&gt;). As $141 (141). And OnlyOnceRegistered. <br>
     * $141: クール冷蔵(航空便)
     */
    public void setApiBinsyuCode_NotEqual_$141() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$141);
    }

    /**
     * NotEqual(&lt;&gt;). As $150 (150). And OnlyOnceRegistered. <br>
     * $150: クール冷凍
     */
    public void setApiBinsyuCode_NotEqual_$150() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$150);
    }

    /**
     * NotEqual(&lt;&gt;). As $151 (151). And OnlyOnceRegistered. <br>
     * $151: クール冷凍(航空便)
     */
    public void setApiBinsyuCode_NotEqual_$151() {
        setApiBinsyuCode_NotEqual_AsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$151);
    }

    protected void doSetApiBinsyuCode_NotEqual(String apiBinsyuCode) {
        regApiBinsyuCode(CK_NES, apiBinsyuCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @param apiBinsyuCodeList The collection of apiBinsyuCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_InScope(Collection<String> apiBinsyuCodeList) {
        doSetApiBinsyuCode_InScope(apiBinsyuCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiBinsyuCode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_InScope_AsCenterApiBinsyuCode(Collection<CDef.CenterApiBinsyuCode> cdefList) {
        doSetApiBinsyuCode_InScope(cTStrL(cdefList));
    }

    protected void doSetApiBinsyuCode_InScope(Collection<String> apiBinsyuCodeList) {
        regINS(CK_INS, cTL(apiBinsyuCodeList), xgetCValueApiBinsyuCode(), "API_BINSYU_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @param apiBinsyuCodeList The collection of apiBinsyuCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_NotInScope(Collection<String> apiBinsyuCodeList) {
        doSetApiBinsyuCode_NotInScope(apiBinsyuCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiBinsyuCode. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiBinsyuCode_NotInScope_AsCenterApiBinsyuCode(Collection<CDef.CenterApiBinsyuCode> cdefList) {
        doSetApiBinsyuCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiBinsyuCode_NotInScope(Collection<String> apiBinsyuCodeList) {
        regINS(CK_NINS, cTL(apiBinsyuCodeList), xgetCValueApiBinsyuCode(), "API_BINSYU_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     */
    public void setApiBinsyuCode_IsNull() { regApiBinsyuCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     */
    public void setApiBinsyuCode_IsNullOrEmpty() { regApiBinsyuCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     */
    public void setApiBinsyuCode_IsNotNull() { regApiBinsyuCode(CK_ISNN, DOBJ); }

    protected void regApiBinsyuCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiBinsyuCode(), "API_BINSYU_CODE"); }
    protected abstract ConditionValue xgetCValueApiBinsyuCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @param apiDaibikiFlg The value of apiDaibikiFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_Equal(String apiDaibikiFlg) {
        doSetApiDaibikiFlg_Equal(fRES(apiDaibikiFlg));
    }

    /**
     * Equal(=). As CenterApiDaibikiFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_Equal_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg cdef) {
        doSetApiDaibikiFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常の送り状を発行
     */
    public void setApiDaibikiFlg_Equal_$0() {
        setApiDaibikiFlg_Equal_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 代金引換の送り状を発行
     */
    public void setApiDaibikiFlg_Equal_$1() {
        setApiDaibikiFlg_Equal_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$1);
    }

    protected void doSetApiDaibikiFlg_Equal(String apiDaibikiFlg) {
        regApiDaibikiFlg(CK_EQ, apiDaibikiFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @param apiDaibikiFlg The value of apiDaibikiFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_NotEqual(String apiDaibikiFlg) {
        doSetApiDaibikiFlg_NotEqual(fRES(apiDaibikiFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiDaibikiFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_NotEqual_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg cdef) {
        doSetApiDaibikiFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常の送り状を発行
     */
    public void setApiDaibikiFlg_NotEqual_$0() {
        setApiDaibikiFlg_NotEqual_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 代金引換の送り状を発行
     */
    public void setApiDaibikiFlg_NotEqual_$1() {
        setApiDaibikiFlg_NotEqual_AsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$1);
    }

    protected void doSetApiDaibikiFlg_NotEqual(String apiDaibikiFlg) {
        regApiDaibikiFlg(CK_NES, apiDaibikiFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @param apiDaibikiFlgList The collection of apiDaibikiFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_InScope(Collection<String> apiDaibikiFlgList) {
        doSetApiDaibikiFlg_InScope(apiDaibikiFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiDaibikiFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_InScope_AsCenterApiDaibikiFlg(Collection<CDef.CenterApiDaibikiFlg> cdefList) {
        doSetApiDaibikiFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetApiDaibikiFlg_InScope(Collection<String> apiDaibikiFlgList) {
        regINS(CK_INS, cTL(apiDaibikiFlgList), xgetCValueApiDaibikiFlg(), "API_DAIBIKI_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @param apiDaibikiFlgList The collection of apiDaibikiFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_NotInScope(Collection<String> apiDaibikiFlgList) {
        doSetApiDaibikiFlg_NotInScope(apiDaibikiFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiDaibikiFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiFlg_NotInScope_AsCenterApiDaibikiFlg(Collection<CDef.CenterApiDaibikiFlg> cdefList) {
        doSetApiDaibikiFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiDaibikiFlg_NotInScope(Collection<String> apiDaibikiFlgList) {
        regINS(CK_NINS, cTL(apiDaibikiFlgList), xgetCValueApiDaibikiFlg(), "API_DAIBIKI_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     */
    public void setApiDaibikiFlg_IsNull() { regApiDaibikiFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     */
    public void setApiDaibikiFlg_IsNotNull() { regApiDaibikiFlg(CK_ISNN, DOBJ); }

    protected void regApiDaibikiFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiDaibikiFlg(), "API_DAIBIKI_FLG"); }
    protected abstract ConditionValue xgetCValueApiDaibikiFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @param apiDaibikiType The value of apiDaibikiType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_Equal(String apiDaibikiType) {
        doSetApiDaibikiType_Equal(fRES(apiDaibikiType));
    }

    /**
     * Equal(=). As CenterApiDaibikiType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiDaibikiType_Equal_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType cdef) {
        doSetApiDaibikiType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: なんでも決済
     */
    public void setApiDaibikiType_Equal_$0() {
        setApiDaibikiType_Equal_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 現金
     */
    public void setApiDaibikiType_Equal_$1() {
        setApiDaibikiType_Equal_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: クレジットカード・デビットカード
     */
    public void setApiDaibikiType_Equal_$2() {
        setApiDaibikiType_Equal_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$2);
    }

    protected void doSetApiDaibikiType_Equal(String apiDaibikiType) {
        regApiDaibikiType(CK_EQ, apiDaibikiType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @param apiDaibikiType The value of apiDaibikiType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_NotEqual(String apiDaibikiType) {
        doSetApiDaibikiType_NotEqual(fRES(apiDaibikiType));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiDaibikiType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiDaibikiType_NotEqual_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType cdef) {
        doSetApiDaibikiType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: なんでも決済
     */
    public void setApiDaibikiType_NotEqual_$0() {
        setApiDaibikiType_NotEqual_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 現金
     */
    public void setApiDaibikiType_NotEqual_$1() {
        setApiDaibikiType_NotEqual_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: クレジットカード・デビットカード
     */
    public void setApiDaibikiType_NotEqual_$2() {
        setApiDaibikiType_NotEqual_AsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$2);
    }

    protected void doSetApiDaibikiType_NotEqual(String apiDaibikiType) {
        regApiDaibikiType(CK_NES, apiDaibikiType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @param apiDaibikiTypeList The collection of apiDaibikiType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_InScope(Collection<String> apiDaibikiTypeList) {
        doSetApiDaibikiType_InScope(apiDaibikiTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiDaibikiType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_InScope_AsCenterApiDaibikiType(Collection<CDef.CenterApiDaibikiType> cdefList) {
        doSetApiDaibikiType_InScope(cTStrL(cdefList));
    }

    protected void doSetApiDaibikiType_InScope(Collection<String> apiDaibikiTypeList) {
        regINS(CK_INS, cTL(apiDaibikiTypeList), xgetCValueApiDaibikiType(), "API_DAIBIKI_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @param apiDaibikiTypeList The collection of apiDaibikiType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_NotInScope(Collection<String> apiDaibikiTypeList) {
        doSetApiDaibikiType_NotInScope(apiDaibikiTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiDaibikiType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiDaibikiType_NotInScope_AsCenterApiDaibikiType(Collection<CDef.CenterApiDaibikiType> cdefList) {
        doSetApiDaibikiType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiDaibikiType_NotInScope(Collection<String> apiDaibikiTypeList) {
        regINS(CK_NINS, cTL(apiDaibikiTypeList), xgetCValueApiDaibikiType(), "API_DAIBIKI_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     */
    public void setApiDaibikiType_IsNull() { regApiDaibikiType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     */
    public void setApiDaibikiType_IsNullOrEmpty() { regApiDaibikiType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     */
    public void setApiDaibikiType_IsNotNull() { regApiDaibikiType(CK_ISNN, DOBJ); }

    protected void regApiDaibikiType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiDaibikiType(), "API_DAIBIKI_TYPE"); }
    protected abstract ConditionValue xgetCValueApiDaibikiType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd1 The value of apiWeightCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_Equal(String apiWeightCd1) {
        doSetApiWeightCd1_Equal(fRES(apiWeightCd1));
    }

    /**
     * Equal(=). As CenterApiWeightCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        doSetApiWeightCd1_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $60 (60). And OnlyOnceRegistered. <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd1_Equal_$60() {
        setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * Equal(=). As $80 (80). And OnlyOnceRegistered. <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd1_Equal_$80() {
        setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * Equal(=). As $100 (100). And OnlyOnceRegistered. <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd1_Equal_$100() {
        setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * Equal(=). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd1_Equal_$140() {
        setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * Equal(=). As $160 (160). And OnlyOnceRegistered. <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd1_Equal_$160() {
        setApiWeightCd1_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    protected void doSetApiWeightCd1_Equal(String apiWeightCd1) {
        regApiWeightCd1(CK_EQ, apiWeightCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd1 The value of apiWeightCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_NotEqual(String apiWeightCd1) {
        doSetApiWeightCd1_NotEqual(fRES(apiWeightCd1));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiWeightCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        doSetApiWeightCd1_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $60 (60). And OnlyOnceRegistered. <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd1_NotEqual_$60() {
        setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * NotEqual(&lt;&gt;). As $80 (80). And OnlyOnceRegistered. <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd1_NotEqual_$80() {
        setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * NotEqual(&lt;&gt;). As $100 (100). And OnlyOnceRegistered. <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd1_NotEqual_$100() {
        setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * NotEqual(&lt;&gt;). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd1_NotEqual_$140() {
        setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * NotEqual(&lt;&gt;). As $160 (160). And OnlyOnceRegistered. <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd1_NotEqual_$160() {
        setApiWeightCd1_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    protected void doSetApiWeightCd1_NotEqual(String apiWeightCd1) {
        regApiWeightCd1(CK_NES, apiWeightCd1);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd1List The collection of apiWeightCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_InScope(Collection<String> apiWeightCd1List) {
        doSetApiWeightCd1_InScope(apiWeightCd1List);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiWeightCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_InScope_AsCenterApiWeightCd(Collection<CDef.CenterApiWeightCd> cdefList) {
        doSetApiWeightCd1_InScope(cTStrL(cdefList));
    }

    protected void doSetApiWeightCd1_InScope(Collection<String> apiWeightCd1List) {
        regINS(CK_INS, cTL(apiWeightCd1List), xgetCValueApiWeightCd1(), "API_WEIGHT_CD_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd1List The collection of apiWeightCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_NotInScope(Collection<String> apiWeightCd1List) {
        doSetApiWeightCd1_NotInScope(apiWeightCd1List);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiWeightCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd1_NotInScope_AsCenterApiWeightCd(Collection<CDef.CenterApiWeightCd> cdefList) {
        doSetApiWeightCd1_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiWeightCd1_NotInScope(Collection<String> apiWeightCd1List) {
        regINS(CK_NINS, cTL(apiWeightCd1List), xgetCValueApiWeightCd1(), "API_WEIGHT_CD_1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd1_IsNull() { regApiWeightCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd1_IsNullOrEmpty() { regApiWeightCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd1_IsNotNull() { regApiWeightCd1(CK_ISNN, DOBJ); }

    protected void regApiWeightCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiWeightCd1(), "API_WEIGHT_CD_1"); }
    protected abstract ConditionValue xgetCValueApiWeightCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd2 The value of apiWeightCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_Equal(String apiWeightCd2) {
        doSetApiWeightCd2_Equal(fRES(apiWeightCd2));
    }

    /**
     * Equal(=). As CenterApiWeightCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        doSetApiWeightCd2_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $60 (60). And OnlyOnceRegistered. <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd2_Equal_$60() {
        setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * Equal(=). As $80 (80). And OnlyOnceRegistered. <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd2_Equal_$80() {
        setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * Equal(=). As $100 (100). And OnlyOnceRegistered. <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd2_Equal_$100() {
        setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * Equal(=). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd2_Equal_$140() {
        setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * Equal(=). As $160 (160). And OnlyOnceRegistered. <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd2_Equal_$160() {
        setApiWeightCd2_Equal_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    protected void doSetApiWeightCd2_Equal(String apiWeightCd2) {
        regApiWeightCd2(CK_EQ, apiWeightCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd2 The value of apiWeightCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_NotEqual(String apiWeightCd2) {
        doSetApiWeightCd2_NotEqual(fRES(apiWeightCd2));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiWeightCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        doSetApiWeightCd2_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $60 (60). And OnlyOnceRegistered. <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd2_NotEqual_$60() {
        setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * NotEqual(&lt;&gt;). As $80 (80). And OnlyOnceRegistered. <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd2_NotEqual_$80() {
        setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * NotEqual(&lt;&gt;). As $100 (100). And OnlyOnceRegistered. <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd2_NotEqual_$100() {
        setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * NotEqual(&lt;&gt;). As $140 (140). And OnlyOnceRegistered. <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd2_NotEqual_$140() {
        setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * NotEqual(&lt;&gt;). As $160 (160). And OnlyOnceRegistered. <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd2_NotEqual_$160() {
        setApiWeightCd2_NotEqual_AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    protected void doSetApiWeightCd2_NotEqual(String apiWeightCd2) {
        regApiWeightCd2(CK_NES, apiWeightCd2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd2List The collection of apiWeightCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_InScope(Collection<String> apiWeightCd2List) {
        doSetApiWeightCd2_InScope(apiWeightCd2List);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiWeightCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_InScope_AsCenterApiWeightCd(Collection<CDef.CenterApiWeightCd> cdefList) {
        doSetApiWeightCd2_InScope(cTStrL(cdefList));
    }

    protected void doSetApiWeightCd2_InScope(Collection<String> apiWeightCd2List) {
        regINS(CK_INS, cTL(apiWeightCd2List), xgetCValueApiWeightCd2(), "API_WEIGHT_CD_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @param apiWeightCd2List The collection of apiWeightCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_NotInScope(Collection<String> apiWeightCd2List) {
        doSetApiWeightCd2_NotInScope(apiWeightCd2List);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiWeightCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiWeightCd2_NotInScope_AsCenterApiWeightCd(Collection<CDef.CenterApiWeightCd> cdefList) {
        doSetApiWeightCd2_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiWeightCd2_NotInScope(Collection<String> apiWeightCd2List) {
        regINS(CK_NINS, cTL(apiWeightCd2List), xgetCValueApiWeightCd2(), "API_WEIGHT_CD_2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd2_IsNull() { regApiWeightCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd2_IsNullOrEmpty() { regApiWeightCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     */
    public void setApiWeightCd2_IsNotNull() { regApiWeightCd2(CK_ISNN, DOBJ); }

    protected void regApiWeightCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiWeightCd2(), "API_WEIGHT_CD_2"); }
    protected abstract ConditionValue xgetCValueApiWeightCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @param apiEidomeFlg The value of apiEidomeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_Equal(String apiEidomeFlg) {
        doSetApiEidomeFlg_Equal(fRES(apiEidomeFlg));
    }

    /**
     * Equal(=). As CenterApiEidomeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_Equal_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg cdef) {
        doSetApiEidomeFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 営業所止めを行いません
     */
    public void setApiEidomeFlg_Equal_$0() {
        setApiEidomeFlg_Equal_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 営業所止めにします
     */
    public void setApiEidomeFlg_Equal_$1() {
        setApiEidomeFlg_Equal_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$1);
    }

    protected void doSetApiEidomeFlg_Equal(String apiEidomeFlg) {
        regApiEidomeFlg(CK_EQ, apiEidomeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @param apiEidomeFlg The value of apiEidomeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_NotEqual(String apiEidomeFlg) {
        doSetApiEidomeFlg_NotEqual(fRES(apiEidomeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterApiEidomeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_NotEqual_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg cdef) {
        doSetApiEidomeFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 営業所止めを行いません
     */
    public void setApiEidomeFlg_NotEqual_$0() {
        setApiEidomeFlg_NotEqual_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 営業所止めにします
     */
    public void setApiEidomeFlg_NotEqual_$1() {
        setApiEidomeFlg_NotEqual_AsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$1);
    }

    protected void doSetApiEidomeFlg_NotEqual(String apiEidomeFlg) {
        regApiEidomeFlg(CK_NES, apiEidomeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @param apiEidomeFlgList The collection of apiEidomeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_InScope(Collection<String> apiEidomeFlgList) {
        doSetApiEidomeFlg_InScope(apiEidomeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterApiEidomeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_InScope_AsCenterApiEidomeFlg(Collection<CDef.CenterApiEidomeFlg> cdefList) {
        doSetApiEidomeFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetApiEidomeFlg_InScope(Collection<String> apiEidomeFlgList) {
        regINS(CK_INS, cTL(apiEidomeFlgList), xgetCValueApiEidomeFlg(), "API_EIDOME_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @param apiEidomeFlgList The collection of apiEidomeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_NotInScope(Collection<String> apiEidomeFlgList) {
        doSetApiEidomeFlg_NotInScope(apiEidomeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterApiEidomeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setApiEidomeFlg_NotInScope_AsCenterApiEidomeFlg(Collection<CDef.CenterApiEidomeFlg> cdefList) {
        doSetApiEidomeFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetApiEidomeFlg_NotInScope(Collection<String> apiEidomeFlgList) {
        regINS(CK_NINS, cTL(apiEidomeFlgList), xgetCValueApiEidomeFlg(), "API_EIDOME_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     */
    public void setApiEidomeFlg_IsNull() { regApiEidomeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     */
    public void setApiEidomeFlg_IsNotNull() { regApiEidomeFlg(CK_ISNN, DOBJ); }

    protected void regApiEidomeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueApiEidomeFlg(), "API_EIDOME_FLG"); }
    protected abstract ConditionValue xgetCValueApiEidomeFlg();

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
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierSlipSgwCB.class);
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
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierSlipSgwCB.class);
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
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierSlipSgwCB.class);
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
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierSlipSgwCB.class);
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
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierSlipSgwCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierSlipSgwCB&gt;() {
     *     public void query(MCarrierSlipSgwCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierSlipSgwCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierSlipSgwCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierSlipSgwCQ sq);

    protected MCarrierSlipSgwCB xcreateScalarConditionCB() {
        MCarrierSlipSgwCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierSlipSgwCB xcreateScalarConditionPartitionByCB() {
        MCarrierSlipSgwCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierSlipSgwCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_SLIP_SGW_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierSlipSgwCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipSgwCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierSlipSgwCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_SLIP_SGW_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierSlipSgwCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierSlipSgwCQ sq);

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
    protected MCarrierSlipSgwCB newMyCB() {
        return new MCarrierSlipSgwCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierSlipSgwCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

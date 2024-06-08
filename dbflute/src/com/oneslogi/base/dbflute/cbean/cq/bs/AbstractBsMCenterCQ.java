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
 * The abstract condition-query of M_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCenterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CENTER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_BOX where ...)} <br>
     * M_BOX by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxList for 'exists'. (NotNull)
     */
    public void existsMBoxList(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MBoxList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList");
    }
    public abstract String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxGrpList for 'exists'. (NotNull)
     */
    public void existsMBoxGrpList(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MBoxGrpList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList");
    }
    public abstract String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CARRIER where ...)} <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierList for 'exists'. (NotNull)
     */
    public void existsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CARRIER_SLIP_SGW where ...)} <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipSgwList</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipSgwList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipSgwList(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipSgwList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CARRIER_SLIP_YMT where ...)} <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipYmtList</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipYmtList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipYmtList(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipYmtList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CARRIER_SLIP_YUPK where ...)} <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipYupkList</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipYupkList for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipYupkList(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCarrierSlipYupkList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CBLK where ...)} <br>
     * M_CBLK by CENTER_ID, named 'MCblkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCblkList</span>(cblkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cblkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCblkList for 'exists'. (NotNull)
     */
    public void existsMCblkList(SubQuery<MCblkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCblkCB cb = new MCblkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCblkList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCblkList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCblkList(MCblkCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCbrctgList</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cbrctgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCbrctgList for 'exists'. (NotNull)
     */
    public void existsMCbrctgList(SubQuery<MCbrctgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCbrctgList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCbrctgList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCdrcattList</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cdrcattCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCdrcattList for 'exists'. (NotNull)
     */
    public void existsMCdrcattList(SubQuery<MCdrcattCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCdrcattList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCdrcattList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CENTER_CLASS where ...)} <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterClassList</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterClassList for 'exists'. (NotNull)
     */
    public void existsMCenterClassList(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterClassList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterColList for 'exists'. (NotNull)
     */
    public void existsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterColList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterCustomerList for 'exists'. (NotNull)
     */
    public void existsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterItemList for 'exists'. (NotNull)
     */
    public void existsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterItemList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterScreenList for 'exists'. (NotNull)
     */
    public void existsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCenterScreenList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientCenterList for 'exists'. (NotNull)
     */
    public void existsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MClientCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CLIN where ...)} <br>
     * M_CLIN by CENTER_ID, named 'MClinAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClinList</span>(clinCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clinCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClinList for 'exists'. (NotNull)
     */
    public void existsMClinList(SubQuery<MClinCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClinCB cb = new MClinCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MClinList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClinList");
    }
    public abstract String keepCenterId_ExistsReferrer_MClinList(MClinCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_CORG where ...)} <br>
     * M_CORG by CENTER_ID, named 'MCorgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCorgList</span>(corgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCorgList for 'exists'. (NotNull)
     */
    public void existsMCorgList(SubQuery<MCorgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCorgCB cb = new MCorgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MCorgList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCorgList");
    }
    public abstract String keepCenterId_ExistsReferrer_MCorgList(MCorgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList");
    }
    public abstract String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfinvoperationList</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfinvoperationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfinvoperationList for 'exists'. (NotNull)
     */
    public void existsMMfinvoperationList(SubQuery<MMfinvoperationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MMfinvoperationList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfinvoperationList");
    }
    public abstract String keepCenterId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfmonthchgList</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfmonthchgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfmonthchgList for 'exists'. (NotNull)
     */
    public void existsMMfmonthchgList(SubQuery<MMfmonthchgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MMfmonthchgList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfmonthchgList");
    }
    public abstract String keepCenterId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_MFSTOCKITEM where ...)} <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfstockitemList</span>(mfstockitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfstockitemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfstockitemList for 'exists'. (NotNull)
     */
    public void existsMMfstockitemList(SubQuery<MMfstockitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfstockitemCB cb = new MMfstockitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MMfstockitemList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfstockitemList");
    }
    public abstract String keepCenterId_ExistsReferrer_MMfstockitemList(MMfstockitemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_MFWHSTRCT where ...)} <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfwhstrctList</span>(mfwhstrctCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfwhstrctCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfwhstrctList for 'exists'. (NotNull)
     */
    public void existsMMfwhstrctList(SubQuery<MMfwhstrctCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhstrctCB cb = new MMfwhstrctCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MMfwhstrctList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhstrctList");
    }
    public abstract String keepCenterId_ExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfwhxitemList</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfwhxitemList for 'exists'. (NotNull)
     */
    public void existsMMfwhxitemList(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MMfwhxitemList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepCenterId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_NUMBERING_CENTER where ...)} <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMNumberingCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MNumberingCenterList for 'exists'. (NotNull)
     */
    public void existsMNumberingCenterList(SubQuery<MNumberingCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MNumberingCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_USER_CENTER where ...)} <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserCenterList for 'exists'. (NotNull)
     */
    public void existsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MUserCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList");
    }
    public abstract String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserLoginList</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserLoginList for 'exists'. (NotNull)
     */
    public void existsMUserLoginList(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MUserLoginList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList");
    }
    public abstract String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_WAREHOUSE where ...)} <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWarehouseList</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWarehouseList for 'exists'. (NotNull)
     */
    public void existsMWarehouseList(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MWarehouseList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList");
    }
    public abstract String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMWebHtInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MWebHtInfoList for 'exists'. (NotNull)
     */
    public void existsMWebHtInfoList(SubQuery<MWebHtInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_MWebHtInfoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TAllocInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCcopamList</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ccopamCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCcopamList for 'exists'. (NotNull)
     */
    public void existsTCcopamList(SubQuery<TCcopamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TCcopamList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCcopamList");
    }
    public abstract String keepCenterId_ExistsReferrer_TCcopamList(TCcopamCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCenterSymbolList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCenterSymbolList for 'exists'. (NotNull)
     */
    public void existsTCenterSymbolList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TCenterSymbolList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepCenterId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCordhdrList</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cordhdrCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCordhdrList for 'exists'. (NotNull)
     */
    public void existsTCordhdrList(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TCordhdrList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCordhdrList");
    }
    public abstract String keepCenterId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_CSRWHADM where ...)} <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCsrwhadmList</span>(csrwhadmCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     csrwhadmCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCsrwhadmList for 'exists'. (NotNull)
     */
    public void existsTCsrwhadmList(SubQuery<TCsrwhadmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TCsrwhadmList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCsrwhadmList");
    }
    public abstract String keepCenterId_ExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderHList for 'exists'. (NotNull)
     */
    public void existsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TEcOrderHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryHList for 'exists'. (NotNull)
     */
    public void existsTInventoryHList(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TInventoryHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMflastshiplotList</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mflastshiplotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMflastshiplotList for 'exists'. (NotNull)
     */
    public void existsTMflastshiplotList(SubQuery<TMflastshiplotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TMflastshiplotList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMflastshiplotList");
    }
    public abstract String keepCenterId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstHList for 'exists'. (NotNull)
     */
    public void existsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TMoveInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHList for 'exists'. (NotNull)
     */
    public void existsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_PALLET where ...)} <br>
     * T_PALLET by CENTER_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPalletList</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPalletList for 'exists'. (NotNull)
     */
    public void existsTPalletList(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPalletList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPalletList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingHList for 'exists'. (NotNull)
     */
    public void existsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPickingHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdList</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdList(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TPicMthdRcmdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TReceivePlanHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TSerialNoList for 'exists'. (NotNull)
     */
    public void existsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TSerialNoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList");
    }
    public abstract String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTSplinfoList</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     splinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TSplinfoList for 'exists'. (NotNull)
     */
    public void existsTSplinfoList(SubQuery<TSplinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TSplinfoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSplinfoList");
    }
    public abstract String keepCenterId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TStoreRecordHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrallinvList</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrallinvList for 'exists'. (NotNull)
     */
    public void existsTTrallinvList(SubQuery<TTrallinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrallinvList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrallinvhistoryList</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrallinvhistoryList for 'exists'. (NotNull)
     */
    public void existsTTrallinvhistoryList(SubQuery<TTrallinvhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrallinvhistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvhistoryList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrcaseinventoryList</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcaseinventoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrcaseinventoryList for 'exists'. (NotNull)
     */
    public void existsTTrcaseinventoryList(SubQuery<TTrcaseinventoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrcaseinventoryList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcaseinventoryList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrcasenumList</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasenumCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrcasenumList for 'exists'. (NotNull)
     */
    public void existsTTrcasenumList(SubQuery<TTrcasenumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrcasenumList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasenumList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrcasestockList</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrcasestockList for 'exists'. (NotNull)
     */
    public void existsTTrcasestockList(SubQuery<TTrcasestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrcasestockList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasestockList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrhanbaiinvList</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trhanbaiinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrhanbaiinvList for 'exists'. (NotNull)
     */
    public void existsTTrhanbaiinvList(SubQuery<TTrhanbaiinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrhanbaiinvList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrhanbaiinvList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrinvcheckinfoList</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrinvcheckinfoList for 'exists'. (NotNull)
     */
    public void existsTTrinvcheckinfoList(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrinvcorrectList</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcorrectCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrinvcorrectList for 'exists'. (NotNull)
     */
    public void existsTTrinvcorrectList(SubQuery<TTrinvcorrectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrinvcorrectList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcorrectList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrinvreanswerList</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvreanswerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrinvreanswerList for 'exists'. (NotNull)
     */
    public void existsTTrinvreanswerList(SubQuery<TTrinvreanswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrinvreanswerList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvreanswerList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrinvrequestList</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvrequestCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrinvrequestList for 'exists'. (NotNull)
     */
    public void existsTTrinvrequestList(SubQuery<TTrinvrequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrinvrequestList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvrequestList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTritemconvresultList</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tritemconvresultCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTritemconvresultList for 'exists'. (NotNull)
     */
    public void existsTTritemconvresultList(SubQuery<TTritemconvresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTritemconvresultList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTritemconvresultList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrjukyuinvList</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trjukyuinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrjukyuinvList for 'exists'. (NotNull)
     */
    public void existsTTrjukyuinvList(SubQuery<TTrjukyuinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrjukyuinvList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrjukyuinvList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrmanufacturedateList</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrmanufacturedateList for 'exists'. (NotNull)
     */
    public void existsTTrmanufacturedateList(SubQuery<TTrmanufacturedateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrmanufacturedateList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedateList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrmanufacturedatedetailList</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatedetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrmanufacturedatedetailList for 'exists'. (NotNull)
     */
    public void existsTTrmanufacturedatedetailList(SubQuery<TTrmanufacturedatedetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrmanufacturedatedetailList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatedetailList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrmanufacturedatehistoryList</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatehistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrmanufacturedatehistoryList for 'exists'. (NotNull)
     */
    public void existsTTrmanufacturedatehistoryList(SubQuery<TTrmanufacturedatehistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatehistoryList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrpallettraceList</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpallettraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrpallettraceList for 'exists'. (NotNull)
     */
    public void existsTTrpallettraceList(SubQuery<TTrpallettraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrpallettraceList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrpallettraceList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrreversestockList</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trreversestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrreversestockList for 'exists'. (NotNull)
     */
    public void existsTTrreversestockList(SubQuery<TTrreversestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrreversestockList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrreversestockList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrstockdiffhistoryList</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trstockdiffhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrstockdiffhistoryList for 'exists'. (NotNull)
     */
    public void existsTTrstockdiffhistoryList(SubQuery<TTrstockdiffhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrstockdiffhistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrstockdiffhistoryList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrsymboltraceList</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrsymboltraceList for 'exists'. (NotNull)
     */
    public void existsTTrsymboltraceList(SubQuery<TTrsymboltraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrsymboltraceList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrsymboltraceextendList</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceextendCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrsymboltraceextendList for 'exists'. (NotNull)
     */
    public void existsTTrsymboltraceextendList(SubQuery<TTrsymboltraceextendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrsymboltraceextendList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceextendList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrtraceList</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trtraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrtraceList for 'exists'. (NotNull)
     */
    public void existsTTrtraceList(SubQuery<TTrtraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TTrtraceList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrtraceList");
    }
    public abstract String keepCenterId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from T_YTRSO where ...)} <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTYtrsoList</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TYtrsoList for 'exists'. (NotNull)
     */
    public void existsTYtrsoList(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_TYtrsoList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tYtrsoList");
    }
    public abstract String keepCenterId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtLoadingList for 'exists'. (NotNull)
     */
    public void existsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtLoadingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveInspectionList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveStoreList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialReceiveInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialShippingInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingPickingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspHList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WShippingInterruptList for 'exists'. (NotNull)
     */
    public void existsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_BOX where ...)} <br>
     * M_BOX by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MBoxList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxList(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MBoxList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MBoxGrpList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxGrpList(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MBoxGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CARRIER where ...)} <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CARRIER_SLIP_SGW where ...)} <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipSgwList</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipSgwList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipSgwList(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CARRIER_SLIP_YMT where ...)} <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipYmtList</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipYmtList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipYmtList(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CARRIER_SLIP_YUPK where ...)} <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipYupkList</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCarrierSlipYupkList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipYupkList(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CBLK where ...)} <br>
     * M_CBLK by CENTER_ID, named 'MCblkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCblkList</span>(cblkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cblkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCblkList for 'not exists'. (NotNull)
     */
    public void notExistsMCblkList(SubQuery<MCblkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCblkCB cb = new MCblkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCblkList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCblkList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCblkList(MCblkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCbrctgList</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cbrctgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCbrctgList for 'not exists'. (NotNull)
     */
    public void notExistsMCbrctgList(SubQuery<MCbrctgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCbrctgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCbrctgList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCdrcattList</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cdrcattCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCdrcattList for 'not exists'. (NotNull)
     */
    public void notExistsMCdrcattList(SubQuery<MCdrcattCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCdrcattList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCdrcattList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CENTER_CLASS where ...)} <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterClassList</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterClassList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterClassList(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterClassList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterColList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterColList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterItemList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCenterScreenList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCenterScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MClientCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MClientCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CLIN where ...)} <br>
     * M_CLIN by CENTER_ID, named 'MClinAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClinList</span>(clinCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clinCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MClinList for 'not exists'. (NotNull)
     */
    public void notExistsMClinList(SubQuery<MClinCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClinCB cb = new MClinCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MClinList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClinList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MClinList(MClinCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_CORG where ...)} <br>
     * M_CORG by CENTER_ID, named 'MCorgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCorgList</span>(corgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MCorgList for 'not exists'. (NotNull)
     */
    public void notExistsMCorgList(SubQuery<MCorgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCorgCB cb = new MCorgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MCorgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCorgList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MCorgList(MCorgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfinvoperationList</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfinvoperationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MMfinvoperationList for 'not exists'. (NotNull)
     */
    public void notExistsMMfinvoperationList(SubQuery<MMfinvoperationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MMfinvoperationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfinvoperationList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfmonthchgList</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfmonthchgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MMfmonthchgList for 'not exists'. (NotNull)
     */
    public void notExistsMMfmonthchgList(SubQuery<MMfmonthchgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MMfmonthchgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfmonthchgList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_MFSTOCKITEM where ...)} <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfstockitemList</span>(mfstockitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfstockitemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MMfstockitemList for 'not exists'. (NotNull)
     */
    public void notExistsMMfstockitemList(SubQuery<MMfstockitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfstockitemCB cb = new MMfstockitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MMfstockitemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfstockitemList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MMfstockitemList(MMfstockitemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_MFWHSTRCT where ...)} <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfwhstrctList</span>(mfwhstrctCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfwhstrctCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MMfwhstrctList for 'not exists'. (NotNull)
     */
    public void notExistsMMfwhstrctList(SubQuery<MMfwhstrctCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhstrctCB cb = new MMfwhstrctCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MMfwhstrctList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhstrctList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfwhxitemList</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MMfwhxitemList for 'not exists'. (NotNull)
     */
    public void notExistsMMfwhxitemList(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MMfwhxitemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_NUMBERING_CENTER where ...)} <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMNumberingCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MNumberingCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMNumberingCenterList(SubQuery<MNumberingCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MNumberingCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_USER_CENTER where ...)} <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MUserCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MUserCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserLoginList</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MUserLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMUserLoginList(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MUserLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_WAREHOUSE where ...)} <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWarehouseList</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MWarehouseList for 'not exists'. (NotNull)
     */
    public void notExistsMWarehouseList(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MWarehouseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWebHtInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_MWebHtInfoList for 'not exists'. (NotNull)
     */
    public void notExistsMWebHtInfoList(SubQuery<MWebHtInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_MWebHtInfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TAllocInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TAllocInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCcopamList</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ccopamCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TCcopamList for 'not exists'. (NotNull)
     */
    public void notExistsTCcopamList(SubQuery<TCcopamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TCcopamList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCcopamList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TCcopamList(TCcopamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCenterSymbolList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TCenterSymbolList for 'not exists'. (NotNull)
     */
    public void notExistsTCenterSymbolList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TCenterSymbolList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCordhdrList</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cordhdrCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TCordhdrList for 'not exists'. (NotNull)
     */
    public void notExistsTCordhdrList(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TCordhdrList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCordhdrList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_CSRWHADM where ...)} <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCsrwhadmList</span>(csrwhadmCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     csrwhadmCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TCsrwhadmList for 'not exists'. (NotNull)
     */
    public void notExistsTCsrwhadmList(SubQuery<TCsrwhadmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TCsrwhadmList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCsrwhadmList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TEcOrderHList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TEcOrderHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TInventoryHList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryHList(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TInventoryHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMflastshiplotList</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mflastshiplotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TMflastshiplotList for 'not exists'. (NotNull)
     */
    public void notExistsTMflastshiplotList(SubQuery<TMflastshiplotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TMflastshiplotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMflastshiplotList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TMoveInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TMoveInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_PALLET where ...)} <br>
     * T_PALLET by CENTER_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPalletList</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPalletList for 'not exists'. (NotNull)
     */
    public void notExistsTPalletList(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPalletList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPalletList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPickingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPickingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdList</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TPicMthdRcmdList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdList(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TPicMthdRcmdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TReceivePlanHList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TReceivePlanHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TSerialNoList for 'not exists'. (NotNull)
     */
    public void notExistsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TSerialNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSplinfoList</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     splinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TSplinfoList for 'not exists'. (NotNull)
     */
    public void notExistsTSplinfoList(SubQuery<TSplinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TSplinfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSplinfoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TStoreRecordHList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TStoreRecordHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrallinvList</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrallinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrallinvList(SubQuery<TTrallinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrallinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrallinvhistoryList</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrallinvhistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrallinvhistoryList(SubQuery<TTrallinvhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrallinvhistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvhistoryList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcaseinventoryList</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcaseinventoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrcaseinventoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcaseinventoryList(SubQuery<TTrcaseinventoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrcaseinventoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcaseinventoryList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcasenumList</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasenumCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrcasenumList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcasenumList(SubQuery<TTrcasenumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrcasenumList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasenumList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcasestockList</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrcasestockList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcasestockList(SubQuery<TTrcasestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrcasestockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasestockList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrhanbaiinvList</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trhanbaiinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrhanbaiinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrhanbaiinvList(SubQuery<TTrhanbaiinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrhanbaiinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrhanbaiinvList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvcheckinfoList</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrinvcheckinfoList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvcheckinfoList(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvcorrectList</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcorrectCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrinvcorrectList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvcorrectList(SubQuery<TTrinvcorrectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrinvcorrectList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcorrectList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvreanswerList</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvreanswerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrinvreanswerList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvreanswerList(SubQuery<TTrinvreanswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrinvreanswerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvreanswerList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvrequestList</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvrequestCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrinvrequestList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvrequestList(SubQuery<TTrinvrequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrinvrequestList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvrequestList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTritemconvresultList</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tritemconvresultCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTritemconvresultList for 'not exists'. (NotNull)
     */
    public void notExistsTTritemconvresultList(SubQuery<TTritemconvresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTritemconvresultList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTritemconvresultList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrjukyuinvList</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trjukyuinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrjukyuinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrjukyuinvList(SubQuery<TTrjukyuinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrjukyuinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrjukyuinvList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedateList</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrmanufacturedateList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedateList(SubQuery<TTrmanufacturedateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrmanufacturedateList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedateList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedatedetailList</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatedetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrmanufacturedatedetailList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedatedetailList(SubQuery<TTrmanufacturedatedetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrmanufacturedatedetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatedetailList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedatehistoryList</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatehistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrmanufacturedatehistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedatehistoryList(SubQuery<TTrmanufacturedatehistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatehistoryList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrpallettraceList</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpallettraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrpallettraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrpallettraceList(SubQuery<TTrpallettraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrpallettraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrpallettraceList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrreversestockList</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trreversestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrreversestockList for 'not exists'. (NotNull)
     */
    public void notExistsTTrreversestockList(SubQuery<TTrreversestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrreversestockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrreversestockList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrstockdiffhistoryList</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trstockdiffhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrstockdiffhistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrstockdiffhistoryList(SubQuery<TTrstockdiffhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrstockdiffhistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrstockdiffhistoryList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrsymboltraceList</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrsymboltraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrsymboltraceList(SubQuery<TTrsymboltraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrsymboltraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrsymboltraceextendList</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceextendCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrsymboltraceextendList for 'not exists'. (NotNull)
     */
    public void notExistsTTrsymboltraceextendList(SubQuery<TTrsymboltraceextendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrsymboltraceextendList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceextendList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrtraceList</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trtraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TTrtraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrtraceList(SubQuery<TTrtraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TTrtraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrtraceList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from T_YTRSO where ...)} <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTYtrsoList</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_TYtrsoList for 'not exists'. (NotNull)
     */
    public void notExistsTYtrsoList(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_TYtrsoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "tYtrsoList");
    }
    public abstract String keepCenterId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtLoadingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtLoadingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtSerialReceiveInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtSerialShippingInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveMBoxList(String fn, SubQuery<MBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MBoxList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq);

    public void xsderiveMBoxGrpList(String fn, SubQuery<MBoxGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mBoxGrpList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);

    public void xsderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq);

    public void xsderiveMCarrierSlipSgwList(String fn, SubQuery<MCarrierSlipSgwCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipSgwList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);

    public void xsderiveMCarrierSlipYmtList(String fn, SubQuery<MCarrierSlipYmtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYmtList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);

    public void xsderiveMCarrierSlipYupkList(String fn, SubQuery<MCarrierSlipYupkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCarrierSlipYupkList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);

    public void xsderiveMCblkList(String fn, SubQuery<MCblkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCblkCB cb = new MCblkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCblkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCblkList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCblkList(MCblkCQ sq);

    public void xsderiveMCbrctgList(String fn, SubQuery<MCbrctgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCbrctgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCbrctgList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq);

    public void xsderiveMCdrcattList(String fn, SubQuery<MCdrcattCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCdrcattList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCdrcattList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq);

    public void xsderiveMCenterClassList(String fn, SubQuery<MCenterClassCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterClassList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterClassList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq);

    public void xsderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterColList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq);

    public void xsderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterCustomerList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    public void xsderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterItemList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq);

    public void xsderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenterScreenList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);

    public void xsderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MClientCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClientCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq);

    public void xsderiveMClinList(String fn, SubQuery<MClinCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClinCB cb = new MClinCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MClinList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mClinList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MClinList(MClinCQ sq);

    public void xsderiveMCorgList(String fn, SubQuery<MCorgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCorgCB cb = new MCorgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MCorgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCorgList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MCorgList(MCorgCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMMfinvoperationList(String fn, SubQuery<MMfinvoperationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MMfinvoperationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfinvoperationList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    public void xsderiveMMfmonthchgList(String fn, SubQuery<MMfmonthchgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MMfmonthchgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfmonthchgList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    public void xsderiveMMfstockitemList(String fn, SubQuery<MMfstockitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfstockitemCB cb = new MMfstockitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MMfstockitemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfstockitemList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq);

    public void xsderiveMMfwhstrctList(String fn, SubQuery<MMfwhstrctCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhstrctCB cb = new MMfwhstrctCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MMfwhstrctList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhstrctList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq);

    public void xsderiveMMfwhxitemList(String fn, SubQuery<MMfwhxitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MMfwhxitemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mMfwhxitemList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    public void xsderiveMNumberingCenterList(String fn, SubQuery<MNumberingCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mNumberingCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq);

    public void xsderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MUserCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserCenterList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq);

    public void xsderiveMUserLoginList(String fn, SubQuery<MUserLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MUserLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mUserLoginList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq);

    public void xsderiveMWarehouseList(String fn, SubQuery<MWarehouseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MWarehouseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWarehouseList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq);

    public void xsderiveMWebHtInfoList(String fn, SubQuery<MWebHtInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "mWebHtInfoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    public void xsderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tAllocInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);

    public void xsderiveTCcopamList(String fn, SubQuery<TCcopamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TCcopamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCcopamList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq);

    public void xsderiveTCenterSymbolList(String fn, SubQuery<TCenterSymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TCenterSymbolList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCenterSymbolList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    public void xsderiveTCordhdrList(String fn, SubQuery<TCordhdrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TCordhdrList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCordhdrList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq);

    public void xsderiveTCsrwhadmList(String fn, SubQuery<TCsrwhadmCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TCsrwhadmList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tCsrwhadmList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq);

    public void xsderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tEcOrderHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);

    public void xsderiveTInventoryHList(String fn, SubQuery<TInventoryHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TInventoryHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tInventoryHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq);

    public void xsderiveTMflastshiplotList(String fn, SubQuery<TMflastshiplotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TMflastshiplotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMflastshiplotList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    public void xsderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tMoveInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPalletList(String fn, SubQuery<TPalletCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPalletCB cb = new TPalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPalletList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPalletList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq);

    public void xsderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPickingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPickingHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq);

    public void xsderiveTPicMthdRcmdList(String fn, SubQuery<TPicMthdRcmdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tPicMthdRcmdList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    public void xsderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tReceivePlanHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    public void xsderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TSerialNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSerialNoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveTSplinfoList(String fn, SubQuery<TSplinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TSplinfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tSplinfoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq);

    public void xsderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tStoreRecordHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    public void xsderiveTTrallinvList(String fn, SubQuery<TTrallinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrallinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq);

    public void xsderiveTTrallinvhistoryList(String fn, SubQuery<TTrallinvhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrallinvhistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrallinvhistoryList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    public void xsderiveTTrcaseinventoryList(String fn, SubQuery<TTrcaseinventoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrcaseinventoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcaseinventoryList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    public void xsderiveTTrcasenumList(String fn, SubQuery<TTrcasenumCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrcasenumList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasenumList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq);

    public void xsderiveTTrcasestockList(String fn, SubQuery<TTrcasestockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrcasestockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrcasestockList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq);

    public void xsderiveTTrhanbaiinvList(String fn, SubQuery<TTrhanbaiinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrhanbaiinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrhanbaiinvList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    public void xsderiveTTrinvcheckinfoList(String fn, SubQuery<TTrinvcheckinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrinvcheckinfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcheckinfoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    public void xsderiveTTrinvcorrectList(String fn, SubQuery<TTrinvcorrectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrinvcorrectList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvcorrectList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    public void xsderiveTTrinvreanswerList(String fn, SubQuery<TTrinvreanswerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrinvreanswerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvreanswerList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    public void xsderiveTTrinvrequestList(String fn, SubQuery<TTrinvrequestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrinvrequestList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrinvrequestList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    public void xsderiveTTritemconvresultList(String fn, SubQuery<TTritemconvresultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTritemconvresultList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTritemconvresultList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    public void xsderiveTTrjukyuinvList(String fn, SubQuery<TTrjukyuinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrjukyuinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrjukyuinvList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    public void xsderiveTTrmanufacturedateList(String fn, SubQuery<TTrmanufacturedateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedateList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedateList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    public void xsderiveTTrmanufacturedatedetailList(String fn, SubQuery<TTrmanufacturedatedetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatedetailList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    public void xsderiveTTrmanufacturedatehistoryList(String fn, SubQuery<TTrmanufacturedatehistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrmanufacturedatehistoryList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    public void xsderiveTTrpallettraceList(String fn, SubQuery<TTrpallettraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrpallettraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrpallettraceList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    public void xsderiveTTrreversestockList(String fn, SubQuery<TTrreversestockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrreversestockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrreversestockList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq);

    public void xsderiveTTrstockdiffhistoryList(String fn, SubQuery<TTrstockdiffhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrstockdiffhistoryList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    public void xsderiveTTrsymboltraceList(String fn, SubQuery<TTrsymboltraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    public void xsderiveTTrsymboltraceextendList(String fn, SubQuery<TTrsymboltraceextendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceextendList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrsymboltraceextendList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    public void xsderiveTTrtraceList(String fn, SubQuery<TTrtraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TTrtraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tTrtraceList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq);

    public void xsderiveTYtrsoList(String fn, SubQuery<TYtrsoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_TYtrsoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "tYtrsoList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtLoadingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialReceiveInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    public void xsderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtSerialShippingInspList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_BOX where ...)} <br>
     * M_BOX by CENTER_ID, named 'MBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxList()</span>.<span style="color: #CC4747">max</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     boxCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxCB> derivedMBoxList() {
        return xcreateQDRFunctionMBoxList();
    }
    protected HpQDRFunction<MBoxCB> xcreateQDRFunctionMBoxList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxList(String fn, SubQuery<MBoxCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MBoxList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MBoxListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mBoxList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxGrpList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxGrpCB> derivedMBoxGrpList() {
        return xcreateQDRFunctionMBoxGrpList();
    }
    protected HpQDRFunction<MBoxGrpCB> xcreateQDRFunctionMBoxGrpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxGrpList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxGrpList(String fn, SubQuery<MBoxGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MBoxGrpList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mBoxGrpList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER where ...)} <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierList()</span>.<span style="color: #CC4747">max</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     carrierCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierCB> derivedMCarrierList() {
        return xcreateQDRFunctionMCarrierList();
    }
    protected HpQDRFunction<MCarrierCB> xcreateQDRFunctionMCarrierList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER_SLIP_SGW where ...)} <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipSgwList()</span>.<span style="color: #CC4747">max</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sgwCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     sgwCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipSgwCB> derivedMCarrierSlipSgwList() {
        return xcreateQDRFunctionMCarrierSlipSgwList();
    }
    protected HpQDRFunction<MCarrierSlipSgwCB> xcreateQDRFunctionMCarrierSlipSgwList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipSgwList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipSgwList(String fn, SubQuery<MCarrierSlipSgwCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipSgwList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER_SLIP_YMT where ...)} <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipYmtList()</span>.<span style="color: #CC4747">max</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ymtCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ymtCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYmtCB> derivedMCarrierSlipYmtList() {
        return xcreateQDRFunctionMCarrierSlipYmtList();
    }
    protected HpQDRFunction<MCarrierSlipYmtCB> xcreateQDRFunctionMCarrierSlipYmtList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipYmtList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipYmtList(String fn, SubQuery<MCarrierSlipYmtCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipYmtList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER_SLIP_YUPK where ...)} <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierSlipYupkList()</span>.<span style="color: #CC4747">max</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     yupkCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     yupkCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipYupkCB> derivedMCarrierSlipYupkList() {
        return xcreateQDRFunctionMCarrierSlipYupkList();
    }
    protected HpQDRFunction<MCarrierSlipYupkCB> xcreateQDRFunctionMCarrierSlipYupkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierSlipYupkList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierSlipYupkList(String fn, SubQuery<MCarrierSlipYupkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCarrierSlipYupkList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CBLK where ...)} <br>
     * M_CBLK by CENTER_ID, named 'MCblkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCblkList()</span>.<span style="color: #CC4747">max</span>(cblkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cblkCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cblkCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCblkCB> derivedMCblkList() {
        return xcreateQDRFunctionMCblkList();
    }
    protected HpQDRFunction<MCblkCB> xcreateQDRFunctionMCblkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCblkList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCblkList(String fn, SubQuery<MCblkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCblkCB cb = new MCblkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCblkList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCblkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCblkList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCblkList(MCblkCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCblkListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCbrctgList()</span>.<span style="color: #CC4747">max</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cbrctgCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cbrctgCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCbrctgCB> derivedMCbrctgList() {
        return xcreateQDRFunctionMCbrctgList();
    }
    protected HpQDRFunction<MCbrctgCB> xcreateQDRFunctionMCbrctgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCbrctgList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCbrctgList(String fn, SubQuery<MCbrctgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCbrctgList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCbrctgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCbrctgList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCbrctgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCdrcattList()</span>.<span style="color: #CC4747">max</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cdrcattCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cdrcattCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCdrcattCB> derivedMCdrcattList() {
        return xcreateQDRFunctionMCdrcattList();
    }
    protected HpQDRFunction<MCdrcattCB> xcreateQDRFunctionMCdrcattList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCdrcattList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCdrcattList(String fn, SubQuery<MCdrcattCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCdrcattList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCdrcattListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCdrcattList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCdrcattListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CLASS where ...)} <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterClassList()</span>.<span style="color: #CC4747">max</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     classCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     classCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterClassCB> derivedMCenterClassList() {
        return xcreateQDRFunctionMCenterClassList();
    }
    protected HpQDRFunction<MCenterClassCB> xcreateQDRFunctionMCenterClassList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterClassList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterClassList(String fn, SubQuery<MCenterClassCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterClassList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterClassList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterColCB> derivedMCenterColList() {
        return xcreateQDRFunctionMCenterColList();
    }
    protected HpQDRFunction<MCenterColCB> xcreateQDRFunctionMCenterColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterColList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterColList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterColList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCustomerCB> derivedMCenterCustomerList() {
        return xcreateQDRFunctionMCenterCustomerList();
    }
    protected HpQDRFunction<MCenterCustomerCB> xcreateQDRFunctionMCenterCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterCustomerList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterItemCB> derivedMCenterItemList() {
        return xcreateQDRFunctionMCenterItemList();
    }
    protected HpQDRFunction<MCenterItemCB> xcreateQDRFunctionMCenterItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterItemList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterItemList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterScreenCB> derivedMCenterScreenList() {
        return xcreateQDRFunctionMCenterScreenList();
    }
    protected HpQDRFunction<MCenterScreenCB> xcreateQDRFunctionMCenterScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCenterScreenList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCenterScreenList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCenterCB> derivedMClientCenterList() {
        return xcreateQDRFunctionMClientCenterList();
    }
    protected HpQDRFunction<MClientCenterCB> xcreateQDRFunctionMClientCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MClientCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mClientCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIN where ...)} <br>
     * M_CLIN by CENTER_ID, named 'MClinAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClinList()</span>.<span style="color: #CC4747">max</span>(clinCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clinCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clinCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClinCB> derivedMClinList() {
        return xcreateQDRFunctionMClinList();
    }
    protected HpQDRFunction<MClinCB> xcreateQDRFunctionMClinList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClinList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClinList(String fn, SubQuery<MClinCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClinCB cb = new MClinCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MClinList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MClinListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mClinList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MClinList(MClinCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MClinListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CORG where ...)} <br>
     * M_CORG by CENTER_ID, named 'MCorgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCorgList()</span>.<span style="color: #CC4747">max</span>(corgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     corgCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     corgCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCorgCB> derivedMCorgList() {
        return xcreateQDRFunctionMCorgList();
    }
    protected HpQDRFunction<MCorgCB> xcreateQDRFunctionMCorgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCorgList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCorgList(String fn, SubQuery<MCorgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCorgCB cb = new MCorgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MCorgList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MCorgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mCorgList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MCorgList(MCorgCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MCorgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_DELIVERY_COURSE where ...)} <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_LOCATION where ...)} <br>
     * M_LOCATION by CENTER_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfinvoperationList()</span>.<span style="color: #CC4747">max</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfinvoperationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfinvoperationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfinvoperationCB> derivedMMfinvoperationList() {
        return xcreateQDRFunctionMMfinvoperationList();
    }
    protected HpQDRFunction<MMfinvoperationCB> xcreateQDRFunctionMMfinvoperationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfinvoperationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfinvoperationList(String fn, SubQuery<MMfinvoperationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MMfinvoperationList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MMfinvoperationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mMfinvoperationList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MMfinvoperationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfmonthchgList()</span>.<span style="color: #CC4747">max</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfmonthchgCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfmonthchgCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfmonthchgCB> derivedMMfmonthchgList() {
        return xcreateQDRFunctionMMfmonthchgList();
    }
    protected HpQDRFunction<MMfmonthchgCB> xcreateQDRFunctionMMfmonthchgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfmonthchgList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfmonthchgList(String fn, SubQuery<MMfmonthchgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MMfmonthchgList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MMfmonthchgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mMfmonthchgList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MMfmonthchgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFSTOCKITEM where ...)} <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfstockitemList()</span>.<span style="color: #CC4747">max</span>(mfstockitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfstockitemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfstockitemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfstockitemCB> derivedMMfstockitemList() {
        return xcreateQDRFunctionMMfstockitemList();
    }
    protected HpQDRFunction<MMfstockitemCB> xcreateQDRFunctionMMfstockitemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfstockitemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfstockitemList(String fn, SubQuery<MMfstockitemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfstockitemCB cb = new MMfstockitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MMfstockitemList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MMfstockitemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mMfstockitemList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MMfstockitemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFWHSTRCT where ...)} <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfwhstrctList()</span>.<span style="color: #CC4747">max</span>(mfwhstrctCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfwhstrctCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfwhstrctCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfwhstrctCB> derivedMMfwhstrctList() {
        return xcreateQDRFunctionMMfwhstrctList();
    }
    protected HpQDRFunction<MMfwhstrctCB> xcreateQDRFunctionMMfwhstrctList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfwhstrctList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfwhstrctList(String fn, SubQuery<MMfwhstrctCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhstrctCB cb = new MMfwhstrctCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MMfwhstrctList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MMfwhstrctListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mMfwhstrctList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MMfwhstrctListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfwhxitemList()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     entityCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfwhxitemCB> derivedMMfwhxitemList() {
        return xcreateQDRFunctionMMfwhxitemList();
    }
    protected HpQDRFunction<MMfwhxitemCB> xcreateQDRFunctionMMfwhxitemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfwhxitemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfwhxitemList(String fn, SubQuery<MMfwhxitemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MMfwhxitemList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MMfwhxitemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mMfwhxitemList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_NUMBERING_CENTER where ...)} <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMNumberingCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MNumberingCenterCB> derivedMNumberingCenterList() {
        return xcreateQDRFunctionMNumberingCenterList();
    }
    protected HpQDRFunction<MNumberingCenterCB> xcreateQDRFunctionMNumberingCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMNumberingCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMNumberingCenterList(String fn, SubQuery<MNumberingCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNumberingCenterCB cb = new MNumberingCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MNumberingCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mNumberingCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_USER_CENTER where ...)} <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserCenterCB> derivedMUserCenterList() {
        return xcreateQDRFunctionMUserCenterList();
    }
    protected HpQDRFunction<MUserCenterCB> xcreateQDRFunctionMUserCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MUserCenterList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mUserCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserLoginList()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserLoginCB> derivedMUserLoginList() {
        return xcreateQDRFunctionMUserLoginList();
    }
    protected HpQDRFunction<MUserLoginCB> xcreateQDRFunctionMUserLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserLoginList(String fn, SubQuery<MUserLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MUserLoginList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mUserLoginList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_WAREHOUSE where ...)} <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWarehouseList()</span>.<span style="color: #CC4747">max</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     warehouseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     warehouseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWarehouseCB> derivedMWarehouseList() {
        return xcreateQDRFunctionMWarehouseList();
    }
    protected HpQDRFunction<MWarehouseCB> xcreateQDRFunctionMWarehouseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWarehouseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWarehouseList(String fn, SubQuery<MWarehouseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MWarehouseList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mWarehouseList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMWebHtInfoList()</span>.<span style="color: #CC4747">max</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     infoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MWebHtInfoCB> derivedMWebHtInfoList() {
        return xcreateQDRFunctionMWebHtInfoList();
    }
    protected HpQDRFunction<MWebHtInfoCB> xcreateQDRFunctionMWebHtInfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMWebHtInfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveMWebHtInfoList(String fn, SubQuery<MWebHtInfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_MWebHtInfoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "mWebHtInfoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHList() {
        return xcreateQDRFunctionTAllocInstHList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TAllocInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tAllocInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCcopamList()</span>.<span style="color: #CC4747">max</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ccopamCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ccopamCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCcopamCB> derivedTCcopamList() {
        return xcreateQDRFunctionTCcopamList();
    }
    protected HpQDRFunction<TCcopamCB> xcreateQDRFunctionTCcopamList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCcopamList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCcopamList(String fn, SubQuery<TCcopamCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TCcopamList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TCcopamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tCcopamList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TCcopamListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCenterSymbolList()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     symbolCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCenterSymbolCB> derivedTCenterSymbolList() {
        return xcreateQDRFunctionTCenterSymbolList();
    }
    protected HpQDRFunction<TCenterSymbolCB> xcreateQDRFunctionTCenterSymbolList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCenterSymbolList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCenterSymbolList(String fn, SubQuery<TCenterSymbolCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TCenterSymbolList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TCenterSymbolListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tCenterSymbolList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCordhdrList()</span>.<span style="color: #CC4747">max</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cordhdrCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cordhdrCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCordhdrCB> derivedTCordhdrList() {
        return xcreateQDRFunctionTCordhdrList();
    }
    protected HpQDRFunction<TCordhdrCB> xcreateQDRFunctionTCordhdrList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCordhdrList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCordhdrList(String fn, SubQuery<TCordhdrCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TCordhdrList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TCordhdrListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tCordhdrList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TCordhdrListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CSRWHADM where ...)} <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCsrwhadmList()</span>.<span style="color: #CC4747">max</span>(csrwhadmCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     csrwhadmCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     csrwhadmCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCsrwhadmCB> derivedTCsrwhadmList() {
        return xcreateQDRFunctionTCsrwhadmList();
    }
    protected HpQDRFunction<TCsrwhadmCB> xcreateQDRFunctionTCsrwhadmList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCsrwhadmList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCsrwhadmList(String fn, SubQuery<TCsrwhadmCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCsrwhadmCB cb = new TCsrwhadmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TCsrwhadmList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TCsrwhadmListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tCsrwhadmList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TCsrwhadmListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderHCB> derivedTEcOrderHList() {
        return xcreateQDRFunctionTEcOrderHList();
    }
    protected HpQDRFunction<TEcOrderHCB> xcreateQDRFunctionTEcOrderHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TEcOrderHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tEcOrderHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryHCB> derivedTInventoryHList() {
        return xcreateQDRFunctionTInventoryHList();
    }
    protected HpQDRFunction<TInventoryHCB> xcreateQDRFunctionTInventoryHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryHList(String fn, SubQuery<TInventoryHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TInventoryHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tInventoryHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMflastshiplotList()</span>.<span style="color: #CC4747">max</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mflastshiplotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mflastshiplotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMflastshiplotCB> derivedTMflastshiplotList() {
        return xcreateQDRFunctionTMflastshiplotList();
    }
    protected HpQDRFunction<TMflastshiplotCB> xcreateQDRFunctionTMflastshiplotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMflastshiplotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMflastshiplotList(String fn, SubQuery<TMflastshiplotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TMflastshiplotList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TMflastshiplotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tMflastshiplotList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TMflastshiplotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstHCB> derivedTMoveInstHList() {
        return xcreateQDRFunctionTMoveInstHList();
    }
    protected HpQDRFunction<TMoveInstHCB> xcreateQDRFunctionTMoveInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TMoveInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tMoveInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHList() {
        return xcreateQDRFunctionTPackingHList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PALLET where ...)} <br>
     * T_PALLET by CENTER_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPalletList()</span>.<span style="color: #CC4747">max</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     palletCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPalletCB> derivedTPalletList() {
        return xcreateQDRFunctionTPalletList();
    }
    protected HpQDRFunction<TPalletCB> xcreateQDRFunctionTPalletList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPalletList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPalletList(String fn, SubQuery<TPalletCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPalletCB cb = new TPalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPalletList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPalletListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPalletList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPalletList(TPalletCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPalletListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingHCB> derivedTPickingHList() {
        return xcreateQDRFunctionTPickingHList();
    }
    protected HpQDRFunction<TPickingHCB> xcreateQDRFunctionTPickingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPickingHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPickingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPickingHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdList()</span>.<span style="color: #CC4747">max</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rcmdCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCB> derivedTPicMthdRcmdList() {
        return xcreateQDRFunctionTPicMthdRcmdList();
    }
    protected HpQDRFunction<TPicMthdRcmdCB> xcreateQDRFunctionTPicMthdRcmdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdList(String fn, SubQuery<TPicMthdRcmdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tPicMthdRcmdList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHList() {
        return xcreateQDRFunctionTReceivePlanHList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TReceivePlanHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tReceivePlanHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTSerialNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TSerialNoCB> derivedTSerialNoList() {
        return xcreateQDRFunctionTSerialNoList();
    }
    protected HpQDRFunction<TSerialNoCB> xcreateQDRFunctionTSerialNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTSerialNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TSerialNoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tSerialNoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHList() {
        return xcreateQDRFunctionTShippingInstHList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTSplinfoList()</span>.<span style="color: #CC4747">max</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     splinfoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     splinfoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TSplinfoCB> derivedTSplinfoList() {
        return xcreateQDRFunctionTSplinfoList();
    }
    protected HpQDRFunction<TSplinfoCB> xcreateQDRFunctionTSplinfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTSplinfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTSplinfoList(String fn, SubQuery<TSplinfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TSplinfoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TSplinfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tSplinfoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TSplinfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHList() {
        return xcreateQDRFunctionTStoreRecordHList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TStoreRecordHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tStoreRecordHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrallinvList()</span>.<span style="color: #CC4747">max</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trallinvCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrallinvCB> derivedTTrallinvList() {
        return xcreateQDRFunctionTTrallinvList();
    }
    protected HpQDRFunction<TTrallinvCB> xcreateQDRFunctionTTrallinvList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrallinvList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrallinvList(String fn, SubQuery<TTrallinvCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrallinvList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrallinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrallinvList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrallinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrallinvhistoryList()</span>.<span style="color: #CC4747">max</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvhistoryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trallinvhistoryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrallinvhistoryCB> derivedTTrallinvhistoryList() {
        return xcreateQDRFunctionTTrallinvhistoryList();
    }
    protected HpQDRFunction<TTrallinvhistoryCB> xcreateQDRFunctionTTrallinvhistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrallinvhistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrallinvhistoryList(String fn, SubQuery<TTrallinvhistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrallinvhistoryList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrallinvhistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrallinvhistoryList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrcaseinventoryList()</span>.<span style="color: #CC4747">max</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcaseinventoryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trcaseinventoryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrcaseinventoryCB> derivedTTrcaseinventoryList() {
        return xcreateQDRFunctionTTrcaseinventoryList();
    }
    protected HpQDRFunction<TTrcaseinventoryCB> xcreateQDRFunctionTTrcaseinventoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrcaseinventoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrcaseinventoryList(String fn, SubQuery<TTrcaseinventoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrcaseinventoryList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrcaseinventoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrcaseinventoryList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrcasenumList()</span>.<span style="color: #CC4747">max</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasenumCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trcasenumCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrcasenumCB> derivedTTrcasenumList() {
        return xcreateQDRFunctionTTrcasenumList();
    }
    protected HpQDRFunction<TTrcasenumCB> xcreateQDRFunctionTTrcasenumList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrcasenumList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrcasenumList(String fn, SubQuery<TTrcasenumCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrcasenumList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrcasenumListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrcasenumList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcasenumListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrcasestockList()</span>.<span style="color: #CC4747">max</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasestockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trcasestockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrcasestockCB> derivedTTrcasestockList() {
        return xcreateQDRFunctionTTrcasestockList();
    }
    protected HpQDRFunction<TTrcasestockCB> xcreateQDRFunctionTTrcasestockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrcasestockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrcasestockList(String fn, SubQuery<TTrcasestockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrcasestockList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrcasestockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrcasestockList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrcasestockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrhanbaiinvList()</span>.<span style="color: #CC4747">max</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trhanbaiinvCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trhanbaiinvCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrhanbaiinvCB> derivedTTrhanbaiinvList() {
        return xcreateQDRFunctionTTrhanbaiinvList();
    }
    protected HpQDRFunction<TTrhanbaiinvCB> xcreateQDRFunctionTTrhanbaiinvList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrhanbaiinvList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrhanbaiinvList(String fn, SubQuery<TTrhanbaiinvCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrhanbaiinvList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrhanbaiinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrhanbaiinvList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrinvcheckinfoList()</span>.<span style="color: #CC4747">max</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trinvcheckinfoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrinvcheckinfoCB> derivedTTrinvcheckinfoList() {
        return xcreateQDRFunctionTTrinvcheckinfoList();
    }
    protected HpQDRFunction<TTrinvcheckinfoCB> xcreateQDRFunctionTTrinvcheckinfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrinvcheckinfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrinvcheckinfoList(String fn, SubQuery<TTrinvcheckinfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrinvcheckinfoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrinvcorrectList()</span>.<span style="color: #CC4747">max</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcorrectCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trinvcorrectCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrinvcorrectCB> derivedTTrinvcorrectList() {
        return xcreateQDRFunctionTTrinvcorrectList();
    }
    protected HpQDRFunction<TTrinvcorrectCB> xcreateQDRFunctionTTrinvcorrectList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrinvcorrectList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrinvcorrectList(String fn, SubQuery<TTrinvcorrectCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrinvcorrectList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrinvcorrectListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrinvcorrectList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrinvreanswerList()</span>.<span style="color: #CC4747">max</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvreanswerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trinvreanswerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrinvreanswerCB> derivedTTrinvreanswerList() {
        return xcreateQDRFunctionTTrinvreanswerList();
    }
    protected HpQDRFunction<TTrinvreanswerCB> xcreateQDRFunctionTTrinvreanswerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrinvreanswerList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrinvreanswerList(String fn, SubQuery<TTrinvreanswerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrinvreanswerList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrinvreanswerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrinvreanswerList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrinvrequestList()</span>.<span style="color: #CC4747">max</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvrequestCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trinvrequestCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrinvrequestCB> derivedTTrinvrequestList() {
        return xcreateQDRFunctionTTrinvrequestList();
    }
    protected HpQDRFunction<TTrinvrequestCB> xcreateQDRFunctionTTrinvrequestList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrinvrequestList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrinvrequestList(String fn, SubQuery<TTrinvrequestCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrinvrequestList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrinvrequestListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrinvrequestList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrinvrequestListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTritemconvresultList()</span>.<span style="color: #CC4747">max</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tritemconvresultCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tritemconvresultCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTritemconvresultCB> derivedTTritemconvresultList() {
        return xcreateQDRFunctionTTritemconvresultList();
    }
    protected HpQDRFunction<TTritemconvresultCB> xcreateQDRFunctionTTritemconvresultList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTritemconvresultList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTritemconvresultList(String fn, SubQuery<TTritemconvresultCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTritemconvresultList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTritemconvresultListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTritemconvresultList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTritemconvresultListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrjukyuinvList()</span>.<span style="color: #CC4747">max</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trjukyuinvCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trjukyuinvCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrjukyuinvCB> derivedTTrjukyuinvList() {
        return xcreateQDRFunctionTTrjukyuinvList();
    }
    protected HpQDRFunction<TTrjukyuinvCB> xcreateQDRFunctionTTrjukyuinvList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrjukyuinvList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrjukyuinvList(String fn, SubQuery<TTrjukyuinvCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrjukyuinvList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrjukyuinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrjukyuinvList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrmanufacturedateList()</span>.<span style="color: #CC4747">max</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedateCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trmanufacturedateCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrmanufacturedateCB> derivedTTrmanufacturedateList() {
        return xcreateQDRFunctionTTrmanufacturedateList();
    }
    protected HpQDRFunction<TTrmanufacturedateCB> xcreateQDRFunctionTTrmanufacturedateList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrmanufacturedateList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrmanufacturedateList(String fn, SubQuery<TTrmanufacturedateCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedateList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedateListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrmanufacturedateList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrmanufacturedatedetailList()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatedetailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trmanufacturedatedetailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrmanufacturedatedetailCB> derivedTTrmanufacturedatedetailList() {
        return xcreateQDRFunctionTTrmanufacturedatedetailList();
    }
    protected HpQDRFunction<TTrmanufacturedatedetailCB> xcreateQDRFunctionTTrmanufacturedatedetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrmanufacturedatedetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrmanufacturedatedetailList(String fn, SubQuery<TTrmanufacturedatedetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrmanufacturedatedetailList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrmanufacturedatehistoryList()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatehistoryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trmanufacturedatehistoryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrmanufacturedatehistoryCB> derivedTTrmanufacturedatehistoryList() {
        return xcreateQDRFunctionTTrmanufacturedatehistoryList();
    }
    protected HpQDRFunction<TTrmanufacturedatehistoryCB> xcreateQDRFunctionTTrmanufacturedatehistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrmanufacturedatehistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrmanufacturedatehistoryList(String fn, SubQuery<TTrmanufacturedatehistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrmanufacturedatehistoryList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrpallettraceList()</span>.<span style="color: #CC4747">max</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpallettraceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trpallettraceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrpallettraceCB> derivedTTrpallettraceList() {
        return xcreateQDRFunctionTTrpallettraceList();
    }
    protected HpQDRFunction<TTrpallettraceCB> xcreateQDRFunctionTTrpallettraceList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrpallettraceList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrpallettraceList(String fn, SubQuery<TTrpallettraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrpallettraceList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrpallettraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrpallettraceList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrpallettraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrreversestockList()</span>.<span style="color: #CC4747">max</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trreversestockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trreversestockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrreversestockCB> derivedTTrreversestockList() {
        return xcreateQDRFunctionTTrreversestockList();
    }
    protected HpQDRFunction<TTrreversestockCB> xcreateQDRFunctionTTrreversestockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrreversestockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrreversestockList(String fn, SubQuery<TTrreversestockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrreversestockList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrreversestockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrreversestockList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrreversestockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrstockdiffhistoryList()</span>.<span style="color: #CC4747">max</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trstockdiffhistoryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trstockdiffhistoryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrstockdiffhistoryCB> derivedTTrstockdiffhistoryList() {
        return xcreateQDRFunctionTTrstockdiffhistoryList();
    }
    protected HpQDRFunction<TTrstockdiffhistoryCB> xcreateQDRFunctionTTrstockdiffhistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrstockdiffhistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrstockdiffhistoryList(String fn, SubQuery<TTrstockdiffhistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrstockdiffhistoryList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrsymboltraceList()</span>.<span style="color: #CC4747">max</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trsymboltraceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrsymboltraceCB> derivedTTrsymboltraceList() {
        return xcreateQDRFunctionTTrsymboltraceList();
    }
    protected HpQDRFunction<TTrsymboltraceCB> xcreateQDRFunctionTTrsymboltraceList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrsymboltraceList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrsymboltraceList(String fn, SubQuery<TTrsymboltraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrsymboltraceList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrsymboltraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrsymboltraceList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrsymboltraceextendList()</span>.<span style="color: #CC4747">max</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceextendCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trsymboltraceextendCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrsymboltraceextendCB> derivedTTrsymboltraceextendList() {
        return xcreateQDRFunctionTTrsymboltraceextendList();
    }
    protected HpQDRFunction<TTrsymboltraceextendCB> xcreateQDRFunctionTTrsymboltraceextendList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrsymboltraceextendList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrsymboltraceextendList(String fn, SubQuery<TTrsymboltraceextendCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrsymboltraceextendList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrtraceList()</span>.<span style="color: #CC4747">max</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trtraceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trtraceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrtraceCB> derivedTTrtraceList() {
        return xcreateQDRFunctionTTrtraceList();
    }
    protected HpQDRFunction<TTrtraceCB> xcreateQDRFunctionTTrtraceList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrtraceList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrtraceList(String fn, SubQuery<TTrtraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TTrtraceList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TTrtraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tTrtraceList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TTrtraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_YTRSO where ...)} <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTYtrsoList()</span>.<span style="color: #CC4747">max</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ytrsoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TYtrsoCB> derivedTYtrsoList() {
        return xcreateQDRFunctionTYtrsoList();
    }
    protected HpQDRFunction<TYtrsoCB> xcreateQDRFunctionTYtrsoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTYtrsoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTYtrsoList(String fn, SubQuery<TYtrsoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_TYtrsoList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_TYtrsoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "tYtrsoList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_TYtrsoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtLoadingList()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loadingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtLoadingCB> derivedWHtLoadingList() {
        return xcreateQDRFunctionWHtLoadingList();
    }
    protected HpQDRFunction<WHtLoadingCB> xcreateQDRFunctionWHtLoadingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtLoadingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtLoadingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtLoadingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveInspectionList()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspectionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveInspectionCB> derivedWHtReceiveInspectionList() {
        return xcreateQDRFunctionWHtReceiveInspectionList();
    }
    protected HpQDRFunction<WHtReceiveInspectionCB> xcreateQDRFunctionWHtReceiveInspectionList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveInspectionList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveStoreList()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     storeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveStoreCB> derivedWHtReceiveStoreList() {
        return xcreateQDRFunctionWHtReceiveStoreList();
    }
    protected HpQDRFunction<WHtReceiveStoreCB> xcreateQDRFunctionWHtReceiveStoreList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveStoreList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialReceiveInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialReceiveInspCB> derivedWHtSerialReceiveInspList() {
        return xcreateQDRFunctionWHtSerialReceiveInspList();
    }
    protected HpQDRFunction<WHtSerialReceiveInspCB> xcreateQDRFunctionWHtSerialReceiveInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialReceiveInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtSerialReceiveInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialShippingInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialShippingInspCB> derivedWHtSerialShippingInspList() {
        return xcreateQDRFunctionWHtSerialShippingInspList();
    }
    protected HpQDRFunction<WHtSerialShippingInspCB> xcreateQDRFunctionWHtSerialShippingInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialShippingInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtSerialShippingInspList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingList()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shippingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingCB> derivedWHtShippingList() {
        return xcreateQDRFunctionWHtShippingList();
    }
    protected HpQDRFunction<WHtShippingCB> xcreateQDRFunctionWHtShippingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingPickingCB> derivedWHtShippingPickingList() {
        return xcreateQDRFunctionWHtShippingPickingList();
    }
    protected HpQDRFunction<WHtShippingPickingCB> xcreateQDRFunctionWHtShippingPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspHCB> derivedWSglRowShipInspHList() {
        return xcreateQDRFunctionWSglRowShipInspHList();
    }
    protected HpQDRFunction<WSglRowShipInspHCB> xcreateQDRFunctionWSglRowShipInspHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspHList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWShippingInterruptList()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     interruptCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> derivedWShippingInterruptList() {
        return xcreateQDRFunctionWShippingInterruptList();
    }
    protected HpQDRFunction<WShippingInterruptCB> xcreateQDRFunctionWShippingInterruptList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWShippingInterruptList(fn, sq, rd, vl, op));
    }
    public void xqderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_ID", "CENTER_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
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
     * CENTER_CD: {UQ, NotNull, varchar(30)}
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
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
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
     * CENTER_CD: {UQ, NotNull, varchar(30)}
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
     * CENTER_CD: {UQ, NotNull, varchar(30)} <br>
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
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_Equal(String centerNm) {
        doSetCenterNm_Equal(fRES(centerNm));
    }

    protected void doSetCenterNm_Equal(String centerNm) {
        regCenterNm(CK_EQ, centerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotEqual(String centerNm) {
        doSetCenterNm_NotEqual(fRES(centerNm));
    }

    protected void doSetCenterNm_NotEqual(String centerNm) {
        regCenterNm(CK_NES, centerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterThan(String centerNm) {
        regCenterNm(CK_GT, fRES(centerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessThan(String centerNm) {
        regCenterNm(CK_LT, fRES(centerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterEqual(String centerNm) {
        regCenterNm(CK_GE, fRES(centerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessEqual(String centerNm) {
        regCenterNm(CK_LE, fRES(centerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNmList The collection of centerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_InScope(Collection<String> centerNmList) {
        doSetCenterNm_InScope(centerNmList);
    }

    protected void doSetCenterNm_InScope(Collection<String> centerNmList) {
        regINS(CK_INS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNmList The collection of centerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotInScope(Collection<String> centerNmList) {
        doSetCenterNm_NotInScope(centerNmList);
    }

    protected void doSetCenterNm_NotInScope(Collection<String> centerNmList) {
        regINS(CK_NINS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setCenterNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerNm The value of centerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterNm_LikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterNm_NotLikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_PrefixSearch(String centerNm) {
        setCenterNm_LikeSearch(centerNm, xcLSOPPre());
    }

    protected void regCenterNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterNm(), "CENTER_NM"); }
    protected abstract ConditionValue xgetCValueCenterNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_Equal(String centerAbbr) {
        doSetCenterAbbr_Equal(fRES(centerAbbr));
    }

    protected void doSetCenterAbbr_Equal(String centerAbbr) {
        regCenterAbbr(CK_EQ, centerAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_NotEqual(String centerAbbr) {
        doSetCenterAbbr_NotEqual(fRES(centerAbbr));
    }

    protected void doSetCenterAbbr_NotEqual(String centerAbbr) {
        regCenterAbbr(CK_NES, centerAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_GreaterThan(String centerAbbr) {
        regCenterAbbr(CK_GT, fRES(centerAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_LessThan(String centerAbbr) {
        regCenterAbbr(CK_LT, fRES(centerAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_GreaterEqual(String centerAbbr) {
        regCenterAbbr(CK_GE, fRES(centerAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_LessEqual(String centerAbbr) {
        regCenterAbbr(CK_LE, fRES(centerAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbrList The collection of centerAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_InScope(Collection<String> centerAbbrList) {
        doSetCenterAbbr_InScope(centerAbbrList);
    }

    protected void doSetCenterAbbr_InScope(Collection<String> centerAbbrList) {
        regINS(CK_INS, cTL(centerAbbrList), xgetCValueCenterAbbr(), "CENTER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbrList The collection of centerAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_NotInScope(Collection<String> centerAbbrList) {
        doSetCenterAbbr_NotInScope(centerAbbrList);
    }

    protected void doSetCenterAbbr_NotInScope(Collection<String> centerAbbrList) {
        regINS(CK_NINS, cTL(centerAbbrList), xgetCValueCenterAbbr(), "CENTER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {varchar(60)} <br>
     * <pre>e.g. setCenterAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerAbbr The value of centerAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterAbbr_LikeSearch(String centerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerAbbr), xgetCValueCenterAbbr(), "CENTER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterAbbr_NotLikeSearch(String centerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerAbbr), xgetCValueCenterAbbr(), "CENTER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     * @param centerAbbr The value of centerAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterAbbr_PrefixSearch(String centerAbbr) {
        setCenterAbbr_LikeSearch(centerAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     */
    public void setCenterAbbr_IsNull() { regCenterAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     */
    public void setCenterAbbr_IsNullOrEmpty() { regCenterAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ABBR: {varchar(60)}
     */
    public void setCenterAbbr_IsNotNull() { regCenterAbbr(CK_ISNN, DOBJ); }

    protected void regCenterAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterAbbr(), "CENTER_ABBR"); }
    protected abstract ConditionValue xgetCValueCenterAbbr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'in-scope'. (NotNull)
     */
    public void inScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_InScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", false);
    }
    public abstract String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_NotInScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", true);
    }
    public abstract String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     */
    public void setCultureId_IsNull() { regCultureId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     */
    public void setCultureId_IsNotNull() { regCultureId(CK_ISNN, DOBJ); }

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_Equal(Long timeZoneId) {
        doSetTimeZoneId_Equal(timeZoneId);
    }

    protected void doSetTimeZoneId_Equal(Long timeZoneId) {
        regTimeZoneId(CK_EQ, timeZoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotEqual(Long timeZoneId) {
        doSetTimeZoneId_NotEqual(timeZoneId);
    }

    protected void doSetTimeZoneId_NotEqual(Long timeZoneId) {
        regTimeZoneId(CK_NES, timeZoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterThan(Long timeZoneId) {
        regTimeZoneId(CK_GT, timeZoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessThan(Long timeZoneId) {
        regTimeZoneId(CK_LT, timeZoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterEqual(Long timeZoneId) {
        regTimeZoneId(CK_GE, timeZoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessEqual(Long timeZoneId) {
        regTimeZoneId(CK_LE, timeZoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param minNumber The min number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTimeZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTimeZoneId(), "TIME_ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneIdList The collection of timeZoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_InScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        regINS(CK_INS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneIdList The collection of timeZoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_NotInScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        regINS(CK_NINS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TIME_ZONE_ID from B_TIME_ZONE where ...)} <br />
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'in-scope'. (NotNull)
     */
    public void inScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_InScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", false);
    }
    public abstract String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TIME_ZONE_ID from B_TIME_ZONE where ...)} <br />
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_NotInScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", true);
    }
    public abstract String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     */
    public void setTimeZoneId_IsNull() { regTimeZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     */
    public void setTimeZoneId_IsNotNull() { regTimeZoneId(CK_ISNN, DOBJ); }

    protected void regTimeZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneId(), "TIME_ZONE_ID"); }
    protected abstract ConditionValue xgetCValueTimeZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_Equal(String warehousegroup) {
        doSetWarehousegroup_Equal(fRES(warehousegroup));
    }

    protected void doSetWarehousegroup_Equal(String warehousegroup) {
        regWarehousegroup(CK_EQ, warehousegroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_NotEqual(String warehousegroup) {
        doSetWarehousegroup_NotEqual(fRES(warehousegroup));
    }

    protected void doSetWarehousegroup_NotEqual(String warehousegroup) {
        regWarehousegroup(CK_NES, warehousegroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_GreaterThan(String warehousegroup) {
        regWarehousegroup(CK_GT, fRES(warehousegroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_LessThan(String warehousegroup) {
        regWarehousegroup(CK_LT, fRES(warehousegroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_GreaterEqual(String warehousegroup) {
        regWarehousegroup(CK_GE, fRES(warehousegroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_LessEqual(String warehousegroup) {
        regWarehousegroup(CK_LE, fRES(warehousegroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroupList The collection of warehousegroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_InScope(Collection<String> warehousegroupList) {
        doSetWarehousegroup_InScope(warehousegroupList);
    }

    protected void doSetWarehousegroup_InScope(Collection<String> warehousegroupList) {
        regINS(CK_INS, cTL(warehousegroupList), xgetCValueWarehousegroup(), "WarehouseGroup");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroupList The collection of warehousegroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_NotInScope(Collection<String> warehousegroupList) {
        doSetWarehousegroup_NotInScope(warehousegroupList);
    }

    protected void doSetWarehousegroup_NotInScope(Collection<String> warehousegroupList) {
        regINS(CK_NINS, cTL(warehousegroupList), xgetCValueWarehousegroup(), "WarehouseGroup");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {varchar(255)} <br>
     * <pre>e.g. setWarehousegroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousegroup The value of warehousegroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousegroup_LikeSearch(String warehousegroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousegroup), xgetCValueWarehousegroup(), "WarehouseGroup", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousegroup_NotLikeSearch(String warehousegroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousegroup), xgetCValueWarehousegroup(), "WarehouseGroup", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     * @param warehousegroup The value of warehousegroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_PrefixSearch(String warehousegroup) {
        setWarehousegroup_LikeSearch(warehousegroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     */
    public void setWarehousegroup_IsNull() { regWarehousegroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     */
    public void setWarehousegroup_IsNullOrEmpty() { regWarehousegroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WarehouseGroup: {varchar(255)}
     */
    public void setWarehousegroup_IsNotNull() { regWarehousegroup(CK_ISNN, DOBJ); }

    protected void regWarehousegroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousegroup(), "WarehouseGroup"); }
    protected abstract ConditionValue xgetCValueWarehousegroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_Equal(String virtualwhouseflg) {
        doSetVirtualwhouseflg_Equal(fRES(virtualwhouseflg));
    }

    protected void doSetVirtualwhouseflg_Equal(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_EQ, virtualwhouseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_NotEqual(String virtualwhouseflg) {
        doSetVirtualwhouseflg_NotEqual(fRES(virtualwhouseflg));
    }

    protected void doSetVirtualwhouseflg_NotEqual(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_NES, virtualwhouseflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_GreaterThan(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_GT, fRES(virtualwhouseflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_LessThan(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_LT, fRES(virtualwhouseflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_GreaterEqual(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_GE, fRES(virtualwhouseflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_LessEqual(String virtualwhouseflg) {
        regVirtualwhouseflg(CK_LE, fRES(virtualwhouseflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflgList The collection of virtualwhouseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_InScope(Collection<String> virtualwhouseflgList) {
        doSetVirtualwhouseflg_InScope(virtualwhouseflgList);
    }

    protected void doSetVirtualwhouseflg_InScope(Collection<String> virtualwhouseflgList) {
        regINS(CK_INS, cTL(virtualwhouseflgList), xgetCValueVirtualwhouseflg(), "VirtualWhouseFlg");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflgList The collection of virtualwhouseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_NotInScope(Collection<String> virtualwhouseflgList) {
        doSetVirtualwhouseflg_NotInScope(virtualwhouseflgList);
    }

    protected void doSetVirtualwhouseflg_NotInScope(Collection<String> virtualwhouseflgList) {
        regINS(CK_NINS, cTL(virtualwhouseflgList), xgetCValueVirtualwhouseflg(), "VirtualWhouseFlg");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VirtualWhouseFlg: {char(1)} <br>
     * <pre>e.g. setVirtualwhouseflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param virtualwhouseflg The value of virtualwhouseflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVirtualwhouseflg_LikeSearch(String virtualwhouseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(virtualwhouseflg), xgetCValueVirtualwhouseflg(), "VirtualWhouseFlg", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVirtualwhouseflg_NotLikeSearch(String virtualwhouseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(virtualwhouseflg), xgetCValueVirtualwhouseflg(), "VirtualWhouseFlg", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     * @param virtualwhouseflg The value of virtualwhouseflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVirtualwhouseflg_PrefixSearch(String virtualwhouseflg) {
        setVirtualwhouseflg_LikeSearch(virtualwhouseflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     */
    public void setVirtualwhouseflg_IsNull() { regVirtualwhouseflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VirtualWhouseFlg: {char(1)}
     */
    public void setVirtualwhouseflg_IsNotNull() { regVirtualwhouseflg(CK_ISNN, DOBJ); }

    protected void regVirtualwhouseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVirtualwhouseflg(), "VirtualWhouseFlg"); }
    protected abstract ConditionValue xgetCValueVirtualwhouseflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_Equal(String aname) {
        doSetAname_Equal(fRES(aname));
    }

    protected void doSetAname_Equal(String aname) {
        regAname(CK_EQ, aname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotEqual(String aname) {
        doSetAname_NotEqual(fRES(aname));
    }

    protected void doSetAname_NotEqual(String aname) {
        regAname(CK_NES, aname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterThan(String aname) {
        regAname(CK_GT, fRES(aname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessThan(String aname) {
        regAname(CK_LT, fRES(aname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterEqual(String aname) {
        regAname(CK_GE, fRES(aname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessEqual(String aname) {
        regAname(CK_LE, fRES(aname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Aname: {varchar(255)}
     * @param anameList The collection of aname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_InScope(Collection<String> anameList) {
        doSetAname_InScope(anameList);
    }

    protected void doSetAname_InScope(Collection<String> anameList) {
        regINS(CK_INS, cTL(anameList), xgetCValueAname(), "Aname");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Aname: {varchar(255)}
     * @param anameList The collection of aname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotInScope(Collection<String> anameList) {
        doSetAname_NotInScope(anameList);
    }

    protected void doSetAname_NotInScope(Collection<String> anameList) {
        regINS(CK_NINS, cTL(anameList), xgetCValueAname(), "Aname");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Aname: {varchar(255)} <br>
     * <pre>e.g. setAname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aname The value of aname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAname_LikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aname), xgetCValueAname(), "Aname", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAname_NotLikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aname), xgetCValueAname(), "Aname", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Aname: {varchar(255)}
     * @param aname The value of aname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_PrefixSearch(String aname) {
        setAname_LikeSearch(aname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     */
    public void setAname_IsNull() { regAname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     */
    public void setAname_IsNullOrEmpty() { regAname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Aname: {varchar(255)}
     */
    public void setAname_IsNotNull() { regAname(CK_ISNN, DOBJ); }

    protected void regAname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAname(), "Aname"); }
    protected abstract ConditionValue xgetCValueAname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
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
     * Address1: {varchar(255)}
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
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "Address1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "Address1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address1: {varchar(255)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "Address1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "Address1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address1: {varchar(255)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Address1: {varchar(255)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "Address1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
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
     * Address2: {varchar(255)}
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
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "Address2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "Address2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address2: {varchar(255)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "Address2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "Address2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address2: {varchar(255)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Address2: {varchar(255)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "Address2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
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
     * Address3: {varchar(255)}
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
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "Address3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "Address3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address3: {varchar(255)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "Address3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "Address3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Address3: {varchar(255)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Address3: {varchar(255)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "Address3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_Equal(String postno) {
        doSetPostno_Equal(fRES(postno));
    }

    protected void doSetPostno_Equal(String postno) {
        regPostno(CK_EQ, postno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotEqual(String postno) {
        doSetPostno_NotEqual(fRES(postno));
    }

    protected void doSetPostno_NotEqual(String postno) {
        regPostno(CK_NES, postno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterThan(String postno) {
        regPostno(CK_GT, fRES(postno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessThan(String postno) {
        regPostno(CK_LT, fRES(postno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterEqual(String postno) {
        regPostno(CK_GE, fRES(postno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessEqual(String postno) {
        regPostno(CK_LE, fRES(postno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postnoList The collection of postno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_InScope(Collection<String> postnoList) {
        doSetPostno_InScope(postnoList);
    }

    protected void doSetPostno_InScope(Collection<String> postnoList) {
        regINS(CK_INS, cTL(postnoList), xgetCValuePostno(), "PostNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postnoList The collection of postno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotInScope(Collection<String> postnoList) {
        doSetPostno_NotInScope(postnoList);
    }

    protected void doSetPostno_NotInScope(Collection<String> postnoList) {
        regINS(CK_NINS, cTL(postnoList), xgetCValuePostno(), "PostNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PostNo: {varchar(255)} <br>
     * <pre>e.g. setPostno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postno The value of postno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPostno_LikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postno), xgetCValuePostno(), "PostNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPostno_NotLikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postno), xgetCValuePostno(), "PostNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PostNo: {varchar(255)}
     * @param postno The value of postno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_PrefixSearch(String postno) {
        setPostno_LikeSearch(postno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     */
    public void setPostno_IsNull() { regPostno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     */
    public void setPostno_IsNullOrEmpty() { regPostno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PostNo: {varchar(255)}
     */
    public void setPostno_IsNotNull() { regPostno(CK_ISNN, DOBJ); }

    protected void regPostno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostno(), "PostNo"); }
    protected abstract ConditionValue xgetCValuePostno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_Equal(String countrycd) {
        doSetCountrycd_Equal(fRES(countrycd));
    }

    protected void doSetCountrycd_Equal(String countrycd) {
        regCountrycd(CK_EQ, countrycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotEqual(String countrycd) {
        doSetCountrycd_NotEqual(fRES(countrycd));
    }

    protected void doSetCountrycd_NotEqual(String countrycd) {
        regCountrycd(CK_NES, countrycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterThan(String countrycd) {
        regCountrycd(CK_GT, fRES(countrycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessThan(String countrycd) {
        regCountrycd(CK_LT, fRES(countrycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterEqual(String countrycd) {
        regCountrycd(CK_GE, fRES(countrycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessEqual(String countrycd) {
        regCountrycd(CK_LE, fRES(countrycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycdList The collection of countrycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_InScope(Collection<String> countrycdList) {
        doSetCountrycd_InScope(countrycdList);
    }

    protected void doSetCountrycd_InScope(Collection<String> countrycdList) {
        regINS(CK_INS, cTL(countrycdList), xgetCValueCountrycd(), "CountryCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycdList The collection of countrycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotInScope(Collection<String> countrycdList) {
        doSetCountrycd_NotInScope(countrycdList);
    }

    protected void doSetCountrycd_NotInScope(Collection<String> countrycdList) {
        regINS(CK_NINS, cTL(countrycdList), xgetCValueCountrycd(), "CountryCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CountryCd: {varchar(255)} <br>
     * <pre>e.g. setCountrycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countrycd The value of countrycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCountrycd_LikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countrycd), xgetCValueCountrycd(), "CountryCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCountrycd_NotLikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countrycd), xgetCValueCountrycd(), "CountryCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CountryCd: {varchar(255)}
     * @param countrycd The value of countrycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_PrefixSearch(String countrycd) {
        setCountrycd_LikeSearch(countrycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     */
    public void setCountrycd_IsNull() { regCountrycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     */
    public void setCountrycd_IsNullOrEmpty() { regCountrycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CountryCd: {varchar(255)}
     */
    public void setCountrycd_IsNotNull() { regCountrycd(CK_ISNN, DOBJ); }

    protected void regCountrycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountrycd(), "CountryCd"); }
    protected abstract ConditionValue xgetCValueCountrycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_Equal(String portcd) {
        doSetPortcd_Equal(fRES(portcd));
    }

    protected void doSetPortcd_Equal(String portcd) {
        regPortcd(CK_EQ, portcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotEqual(String portcd) {
        doSetPortcd_NotEqual(fRES(portcd));
    }

    protected void doSetPortcd_NotEqual(String portcd) {
        regPortcd(CK_NES, portcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterThan(String portcd) {
        regPortcd(CK_GT, fRES(portcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessThan(String portcd) {
        regPortcd(CK_LT, fRES(portcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterEqual(String portcd) {
        regPortcd(CK_GE, fRES(portcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessEqual(String portcd) {
        regPortcd(CK_LE, fRES(portcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcdList The collection of portcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_InScope(Collection<String> portcdList) {
        doSetPortcd_InScope(portcdList);
    }

    protected void doSetPortcd_InScope(Collection<String> portcdList) {
        regINS(CK_INS, cTL(portcdList), xgetCValuePortcd(), "PortCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcdList The collection of portcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotInScope(Collection<String> portcdList) {
        doSetPortcd_NotInScope(portcdList);
    }

    protected void doSetPortcd_NotInScope(Collection<String> portcdList) {
        regINS(CK_NINS, cTL(portcdList), xgetCValuePortcd(), "PortCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PortCd: {varchar(255)} <br>
     * <pre>e.g. setPortcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param portcd The value of portcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPortcd_LikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(portcd), xgetCValuePortcd(), "PortCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPortcd_NotLikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(portcd), xgetCValuePortcd(), "PortCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PortCd: {varchar(255)}
     * @param portcd The value of portcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_PrefixSearch(String portcd) {
        setPortcd_LikeSearch(portcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     */
    public void setPortcd_IsNull() { regPortcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     */
    public void setPortcd_IsNullOrEmpty() { regPortcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PortCd: {varchar(255)}
     */
    public void setPortcd_IsNotNull() { regPortcd(CK_ISNN, DOBJ); }

    protected void regPortcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePortcd(), "PortCd"); }
    protected abstract ConditionValue xgetCValuePortcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_Equal(String districtcd) {
        doSetDistrictcd_Equal(fRES(districtcd));
    }

    protected void doSetDistrictcd_Equal(String districtcd) {
        regDistrictcd(CK_EQ, districtcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotEqual(String districtcd) {
        doSetDistrictcd_NotEqual(fRES(districtcd));
    }

    protected void doSetDistrictcd_NotEqual(String districtcd) {
        regDistrictcd(CK_NES, districtcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterThan(String districtcd) {
        regDistrictcd(CK_GT, fRES(districtcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessThan(String districtcd) {
        regDistrictcd(CK_LT, fRES(districtcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterEqual(String districtcd) {
        regDistrictcd(CK_GE, fRES(districtcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessEqual(String districtcd) {
        regDistrictcd(CK_LE, fRES(districtcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcdList The collection of districtcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_InScope(Collection<String> districtcdList) {
        doSetDistrictcd_InScope(districtcdList);
    }

    protected void doSetDistrictcd_InScope(Collection<String> districtcdList) {
        regINS(CK_INS, cTL(districtcdList), xgetCValueDistrictcd(), "DistrictCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcdList The collection of districtcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotInScope(Collection<String> districtcdList) {
        doSetDistrictcd_NotInScope(districtcdList);
    }

    protected void doSetDistrictcd_NotInScope(Collection<String> districtcdList) {
        regINS(CK_NINS, cTL(districtcdList), xgetCValueDistrictcd(), "DistrictCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DistrictCd: {varchar(255)} <br>
     * <pre>e.g. setDistrictcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param districtcd The value of districtcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistrictcd_LikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(districtcd), xgetCValueDistrictcd(), "DistrictCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistrictcd_NotLikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(districtcd), xgetCValueDistrictcd(), "DistrictCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DistrictCd: {varchar(255)}
     * @param districtcd The value of districtcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_PrefixSearch(String districtcd) {
        setDistrictcd_LikeSearch(districtcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     */
    public void setDistrictcd_IsNull() { regDistrictcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     */
    public void setDistrictcd_IsNullOrEmpty() { regDistrictcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DistrictCd: {varchar(255)}
     */
    public void setDistrictcd_IsNotNull() { regDistrictcd(CK_ISNN, DOBJ); }

    protected void regDistrictcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistrictcd(), "DistrictCd"); }
    protected abstract ConditionValue xgetCValueDistrictcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_Equal(String phone1) {
        doSetPhone1_Equal(fRES(phone1));
    }

    protected void doSetPhone1_Equal(String phone1) {
        regPhone1(CK_EQ, phone1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_NotEqual(String phone1) {
        doSetPhone1_NotEqual(fRES(phone1));
    }

    protected void doSetPhone1_NotEqual(String phone1) {
        regPhone1(CK_NES, phone1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_GreaterThan(String phone1) {
        regPhone1(CK_GT, fRES(phone1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_LessThan(String phone1) {
        regPhone1(CK_LT, fRES(phone1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_GreaterEqual(String phone1) {
        regPhone1(CK_GE, fRES(phone1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_LessEqual(String phone1) {
        regPhone1(CK_LE, fRES(phone1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1List The collection of phone1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_InScope(Collection<String> phone1List) {
        doSetPhone1_InScope(phone1List);
    }

    protected void doSetPhone1_InScope(Collection<String> phone1List) {
        regINS(CK_INS, cTL(phone1List), xgetCValuePhone1(), "Phone1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1List The collection of phone1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_NotInScope(Collection<String> phone1List) {
        doSetPhone1_NotInScope(phone1List);
    }

    protected void doSetPhone1_NotInScope(Collection<String> phone1List) {
        regINS(CK_NINS, cTL(phone1List), xgetCValuePhone1(), "Phone1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone1: {varchar(255)} <br>
     * <pre>e.g. setPhone1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone1 The value of phone1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone1_LikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone1), xgetCValuePhone1(), "Phone1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone1_NotLikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone1), xgetCValuePhone1(), "Phone1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone1: {varchar(255)}
     * @param phone1 The value of phone1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_PrefixSearch(String phone1) {
        setPhone1_LikeSearch(phone1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     */
    public void setPhone1_IsNull() { regPhone1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     */
    public void setPhone1_IsNullOrEmpty() { regPhone1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Phone1: {varchar(255)}
     */
    public void setPhone1_IsNotNull() { regPhone1(CK_ISNN, DOBJ); }

    protected void regPhone1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone1(), "Phone1"); }
    protected abstract ConditionValue xgetCValuePhone1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_Equal(String phone2) {
        doSetPhone2_Equal(fRES(phone2));
    }

    protected void doSetPhone2_Equal(String phone2) {
        regPhone2(CK_EQ, phone2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_NotEqual(String phone2) {
        doSetPhone2_NotEqual(fRES(phone2));
    }

    protected void doSetPhone2_NotEqual(String phone2) {
        regPhone2(CK_NES, phone2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_GreaterThan(String phone2) {
        regPhone2(CK_GT, fRES(phone2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_LessThan(String phone2) {
        regPhone2(CK_LT, fRES(phone2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_GreaterEqual(String phone2) {
        regPhone2(CK_GE, fRES(phone2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_LessEqual(String phone2) {
        regPhone2(CK_LE, fRES(phone2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2List The collection of phone2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_InScope(Collection<String> phone2List) {
        doSetPhone2_InScope(phone2List);
    }

    protected void doSetPhone2_InScope(Collection<String> phone2List) {
        regINS(CK_INS, cTL(phone2List), xgetCValuePhone2(), "Phone2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2List The collection of phone2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_NotInScope(Collection<String> phone2List) {
        doSetPhone2_NotInScope(phone2List);
    }

    protected void doSetPhone2_NotInScope(Collection<String> phone2List) {
        regINS(CK_NINS, cTL(phone2List), xgetCValuePhone2(), "Phone2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone2: {varchar(255)} <br>
     * <pre>e.g. setPhone2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone2 The value of phone2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone2_LikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone2), xgetCValuePhone2(), "Phone2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone2_NotLikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone2), xgetCValuePhone2(), "Phone2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Phone2: {varchar(255)}
     * @param phone2 The value of phone2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_PrefixSearch(String phone2) {
        setPhone2_LikeSearch(phone2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     */
    public void setPhone2_IsNull() { regPhone2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     */
    public void setPhone2_IsNullOrEmpty() { regPhone2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Phone2: {varchar(255)}
     */
    public void setPhone2_IsNotNull() { regPhone2(CK_ISNN, DOBJ); }

    protected void regPhone2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone2(), "Phone2"); }
    protected abstract ConditionValue xgetCValuePhone2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_Equal(String fax1) {
        doSetFax1_Equal(fRES(fax1));
    }

    protected void doSetFax1_Equal(String fax1) {
        regFax1(CK_EQ, fax1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotEqual(String fax1) {
        doSetFax1_NotEqual(fRES(fax1));
    }

    protected void doSetFax1_NotEqual(String fax1) {
        regFax1(CK_NES, fax1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterThan(String fax1) {
        regFax1(CK_GT, fRES(fax1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessThan(String fax1) {
        regFax1(CK_LT, fRES(fax1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterEqual(String fax1) {
        regFax1(CK_GE, fRES(fax1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessEqual(String fax1) {
        regFax1(CK_LE, fRES(fax1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1List The collection of fax1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_InScope(Collection<String> fax1List) {
        doSetFax1_InScope(fax1List);
    }

    protected void doSetFax1_InScope(Collection<String> fax1List) {
        regINS(CK_INS, cTL(fax1List), xgetCValueFax1(), "Fax1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1List The collection of fax1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotInScope(Collection<String> fax1List) {
        doSetFax1_NotInScope(fax1List);
    }

    protected void doSetFax1_NotInScope(Collection<String> fax1List) {
        regINS(CK_NINS, cTL(fax1List), xgetCValueFax1(), "Fax1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax1: {varchar(255)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax1_LikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax1), xgetCValueFax1(), "Fax1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax1_NotLikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax1), xgetCValueFax1(), "Fax1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax1: {varchar(255)}
     * @param fax1 The value of fax1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_PrefixSearch(String fax1) {
        setFax1_LikeSearch(fax1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     */
    public void setFax1_IsNull() { regFax1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     */
    public void setFax1_IsNullOrEmpty() { regFax1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Fax1: {varchar(255)}
     */
    public void setFax1_IsNotNull() { regFax1(CK_ISNN, DOBJ); }

    protected void regFax1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax1(), "Fax1"); }
    protected abstract ConditionValue xgetCValueFax1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_Equal(String fax2) {
        doSetFax2_Equal(fRES(fax2));
    }

    protected void doSetFax2_Equal(String fax2) {
        regFax2(CK_EQ, fax2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotEqual(String fax2) {
        doSetFax2_NotEqual(fRES(fax2));
    }

    protected void doSetFax2_NotEqual(String fax2) {
        regFax2(CK_NES, fax2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterThan(String fax2) {
        regFax2(CK_GT, fRES(fax2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessThan(String fax2) {
        regFax2(CK_LT, fRES(fax2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterEqual(String fax2) {
        regFax2(CK_GE, fRES(fax2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessEqual(String fax2) {
        regFax2(CK_LE, fRES(fax2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2List The collection of fax2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_InScope(Collection<String> fax2List) {
        doSetFax2_InScope(fax2List);
    }

    protected void doSetFax2_InScope(Collection<String> fax2List) {
        regINS(CK_INS, cTL(fax2List), xgetCValueFax2(), "Fax2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2List The collection of fax2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotInScope(Collection<String> fax2List) {
        doSetFax2_NotInScope(fax2List);
    }

    protected void doSetFax2_NotInScope(Collection<String> fax2List) {
        regINS(CK_NINS, cTL(fax2List), xgetCValueFax2(), "Fax2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax2: {varchar(255)} <br>
     * <pre>e.g. setFax2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax2 The value of fax2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax2_LikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax2), xgetCValueFax2(), "Fax2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax2_NotLikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax2), xgetCValueFax2(), "Fax2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Fax2: {varchar(255)}
     * @param fax2 The value of fax2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_PrefixSearch(String fax2) {
        setFax2_LikeSearch(fax2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     */
    public void setFax2_IsNull() { regFax2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     */
    public void setFax2_IsNullOrEmpty() { regFax2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Fax2: {varchar(255)}
     */
    public void setFax2_IsNotNull() { regFax2(CK_ISNN, DOBJ); }

    protected void regFax2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax2(), "Fax2"); }
    protected abstract ConditionValue xgetCValueFax2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_Equal(String warehouseflg) {
        doSetWarehouseflg_Equal(fRES(warehouseflg));
    }

    protected void doSetWarehouseflg_Equal(String warehouseflg) {
        regWarehouseflg(CK_EQ, warehouseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_NotEqual(String warehouseflg) {
        doSetWarehouseflg_NotEqual(fRES(warehouseflg));
    }

    protected void doSetWarehouseflg_NotEqual(String warehouseflg) {
        regWarehouseflg(CK_NES, warehouseflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_GreaterThan(String warehouseflg) {
        regWarehouseflg(CK_GT, fRES(warehouseflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_LessThan(String warehouseflg) {
        regWarehouseflg(CK_LT, fRES(warehouseflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_GreaterEqual(String warehouseflg) {
        regWarehouseflg(CK_GE, fRES(warehouseflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_LessEqual(String warehouseflg) {
        regWarehouseflg(CK_LE, fRES(warehouseflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflgList The collection of warehouseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_InScope(Collection<String> warehouseflgList) {
        doSetWarehouseflg_InScope(warehouseflgList);
    }

    protected void doSetWarehouseflg_InScope(Collection<String> warehouseflgList) {
        regINS(CK_INS, cTL(warehouseflgList), xgetCValueWarehouseflg(), "WarehouseFlg");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflgList The collection of warehouseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_NotInScope(Collection<String> warehouseflgList) {
        doSetWarehouseflg_NotInScope(warehouseflgList);
    }

    protected void doSetWarehouseflg_NotInScope(Collection<String> warehouseflgList) {
        regINS(CK_NINS, cTL(warehouseflgList), xgetCValueWarehouseflg(), "WarehouseFlg");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseFlg: {char(1)} <br>
     * <pre>e.g. setWarehouseflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseflg The value of warehouseflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseflg_LikeSearch(String warehouseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseflg), xgetCValueWarehouseflg(), "WarehouseFlg", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseflg_NotLikeSearch(String warehouseflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseflg), xgetCValueWarehouseflg(), "WarehouseFlg", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseFlg: {char(1)}
     * @param warehouseflg The value of warehouseflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseflg_PrefixSearch(String warehouseflg) {
        setWarehouseflg_LikeSearch(warehouseflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     */
    public void setWarehouseflg_IsNull() { regWarehouseflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WarehouseFlg: {char(1)}
     */
    public void setWarehouseflg_IsNotNull() { regWarehouseflg(CK_ISNN, DOBJ); }

    protected void regWarehouseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseflg(), "WarehouseFlg"); }
    protected abstract ConditionValue xgetCValueWarehouseflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_Equal(String refname) {
        doSetRefname_Equal(fRES(refname));
    }

    protected void doSetRefname_Equal(String refname) {
        regRefname(CK_EQ, refname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotEqual(String refname) {
        doSetRefname_NotEqual(fRES(refname));
    }

    protected void doSetRefname_NotEqual(String refname) {
        regRefname(CK_NES, refname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterThan(String refname) {
        regRefname(CK_GT, fRES(refname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessThan(String refname) {
        regRefname(CK_LT, fRES(refname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterEqual(String refname) {
        regRefname(CK_GE, fRES(refname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessEqual(String refname) {
        regRefname(CK_LE, fRES(refname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RefName: {varchar(255)}
     * @param refnameList The collection of refname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_InScope(Collection<String> refnameList) {
        doSetRefname_InScope(refnameList);
    }

    protected void doSetRefname_InScope(Collection<String> refnameList) {
        regINS(CK_INS, cTL(refnameList), xgetCValueRefname(), "RefName");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RefName: {varchar(255)}
     * @param refnameList The collection of refname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotInScope(Collection<String> refnameList) {
        doSetRefname_NotInScope(refnameList);
    }

    protected void doSetRefname_NotInScope(Collection<String> refnameList) {
        regINS(CK_NINS, cTL(refnameList), xgetCValueRefname(), "RefName");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RefName: {varchar(255)} <br>
     * <pre>e.g. setRefname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refname The value of refname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefname_LikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refname), xgetCValueRefname(), "RefName", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefname_NotLikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refname), xgetCValueRefname(), "RefName", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RefName: {varchar(255)}
     * @param refname The value of refname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_PrefixSearch(String refname) {
        setRefname_LikeSearch(refname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     */
    public void setRefname_IsNull() { regRefname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     */
    public void setRefname_IsNullOrEmpty() { regRefname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RefName: {varchar(255)}
     */
    public void setRefname_IsNotNull() { regRefname(CK_ISNN, DOBJ); }

    protected void regRefname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefname(), "RefName"); }
    protected abstract ConditionValue xgetCValueRefname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_Equal(java.math.BigDecimal subcontractflg) {
        doSetSubcontractflg_Equal(subcontractflg);
    }

    protected void doSetSubcontractflg_Equal(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_EQ, subcontractflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_NotEqual(java.math.BigDecimal subcontractflg) {
        doSetSubcontractflg_NotEqual(subcontractflg);
    }

    protected void doSetSubcontractflg_NotEqual(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_NES, subcontractflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_GreaterThan(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_GT, subcontractflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_LessThan(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_LT, subcontractflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_GreaterEqual(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_GE, subcontractflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflg The value of subcontractflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubcontractflg_LessEqual(java.math.BigDecimal subcontractflg) {
        regSubcontractflg(CK_LE, subcontractflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param minNumber The min number of subcontractflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of subcontractflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSubcontractflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSubcontractflg(), "SubcontractFlg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflgList The collection of subcontractflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubcontractflg_InScope(Collection<java.math.BigDecimal> subcontractflgList) {
        doSetSubcontractflg_InScope(subcontractflgList);
    }

    protected void doSetSubcontractflg_InScope(Collection<java.math.BigDecimal> subcontractflgList) {
        regINS(CK_INS, cTL(subcontractflgList), xgetCValueSubcontractflg(), "SubcontractFlg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @param subcontractflgList The collection of subcontractflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubcontractflg_NotInScope(Collection<java.math.BigDecimal> subcontractflgList) {
        doSetSubcontractflg_NotInScope(subcontractflgList);
    }

    protected void doSetSubcontractflg_NotInScope(Collection<java.math.BigDecimal> subcontractflgList) {
        regINS(CK_NINS, cTL(subcontractflgList), xgetCValueSubcontractflg(), "SubcontractFlg");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     */
    public void setSubcontractflg_IsNull() { regSubcontractflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SubcontractFlg: {decimal(16, 6)}
     */
    public void setSubcontractflg_IsNotNull() { regSubcontractflg(CK_ISNN, DOBJ); }

    protected void regSubcontractflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubcontractflg(), "SubcontractFlg"); }
    protected abstract ConditionValue xgetCValueSubcontractflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_Equal(java.math.BigDecimal weightcapacity) {
        doSetWeightcapacity_Equal(weightcapacity);
    }

    protected void doSetWeightcapacity_Equal(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_EQ, weightcapacity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_NotEqual(java.math.BigDecimal weightcapacity) {
        doSetWeightcapacity_NotEqual(weightcapacity);
    }

    protected void doSetWeightcapacity_NotEqual(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_NES, weightcapacity);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_GreaterThan(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_GT, weightcapacity);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_LessThan(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_LT, weightcapacity);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_GreaterEqual(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_GE, weightcapacity);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacity The value of weightcapacity as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWeightcapacity_LessEqual(java.math.BigDecimal weightcapacity) {
        regWeightcapacity(CK_LE, weightcapacity);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param minNumber The min number of weightcapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of weightcapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWeightcapacity_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWeightcapacity(), "WeightCapacity", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacityList The collection of weightcapacity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightcapacity_InScope(Collection<java.math.BigDecimal> weightcapacityList) {
        doSetWeightcapacity_InScope(weightcapacityList);
    }

    protected void doSetWeightcapacity_InScope(Collection<java.math.BigDecimal> weightcapacityList) {
        regINS(CK_INS, cTL(weightcapacityList), xgetCValueWeightcapacity(), "WeightCapacity");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @param weightcapacityList The collection of weightcapacity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightcapacity_NotInScope(Collection<java.math.BigDecimal> weightcapacityList) {
        doSetWeightcapacity_NotInScope(weightcapacityList);
    }

    protected void doSetWeightcapacity_NotInScope(Collection<java.math.BigDecimal> weightcapacityList) {
        regINS(CK_NINS, cTL(weightcapacityList), xgetCValueWeightcapacity(), "WeightCapacity");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     */
    public void setWeightcapacity_IsNull() { regWeightcapacity(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WeightCapacity: {decimal(16, 6)}
     */
    public void setWeightcapacity_IsNotNull() { regWeightcapacity(CK_ISNN, DOBJ); }

    protected void regWeightcapacity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeightcapacity(), "WeightCapacity"); }
    protected abstract ConditionValue xgetCValueWeightcapacity();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_Equal(java.math.BigDecimal capacity) {
        doSetCapacity_Equal(capacity);
    }

    protected void doSetCapacity_Equal(java.math.BigDecimal capacity) {
        regCapacity(CK_EQ, capacity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_NotEqual(java.math.BigDecimal capacity) {
        doSetCapacity_NotEqual(capacity);
    }

    protected void doSetCapacity_NotEqual(java.math.BigDecimal capacity) {
        regCapacity(CK_NES, capacity);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_GreaterThan(java.math.BigDecimal capacity) {
        regCapacity(CK_GT, capacity);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_LessThan(java.math.BigDecimal capacity) {
        regCapacity(CK_LT, capacity);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_GreaterEqual(java.math.BigDecimal capacity) {
        regCapacity(CK_GE, capacity);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacity The value of capacity as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapacity_LessEqual(java.math.BigDecimal capacity) {
        regCapacity(CK_LE, capacity);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param minNumber The min number of capacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of capacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCapacity_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCapacity(), "Capacity", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacityList The collection of capacity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapacity_InScope(Collection<java.math.BigDecimal> capacityList) {
        doSetCapacity_InScope(capacityList);
    }

    protected void doSetCapacity_InScope(Collection<java.math.BigDecimal> capacityList) {
        regINS(CK_INS, cTL(capacityList), xgetCValueCapacity(), "Capacity");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * Capacity: {decimal(16, 6)}
     * @param capacityList The collection of capacity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapacity_NotInScope(Collection<java.math.BigDecimal> capacityList) {
        doSetCapacity_NotInScope(capacityList);
    }

    protected void doSetCapacity_NotInScope(Collection<java.math.BigDecimal> capacityList) {
        regINS(CK_NINS, cTL(capacityList), xgetCValueCapacity(), "Capacity");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     */
    public void setCapacity_IsNull() { regCapacity(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Capacity: {decimal(16, 6)}
     */
    public void setCapacity_IsNotNull() { regCapacity(CK_ISNN, DOBJ); }

    protected void regCapacity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCapacity(), "Capacity"); }
    protected abstract ConditionValue xgetCValueCapacity();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_Equal(Long hulftId) {
        doSetHulftId_Equal(hulftId);
    }

    protected void doSetHulftId_Equal(Long hulftId) {
        regHulftId(CK_EQ, hulftId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_NotEqual(Long hulftId) {
        doSetHulftId_NotEqual(hulftId);
    }

    protected void doSetHulftId_NotEqual(Long hulftId) {
        regHulftId(CK_NES, hulftId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_GreaterThan(Long hulftId) {
        regHulftId(CK_GT, hulftId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_LessThan(Long hulftId) {
        regHulftId(CK_LT, hulftId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_GreaterEqual(Long hulftId) {
        regHulftId(CK_GE, hulftId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftId The value of hulftId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHulftId_LessEqual(Long hulftId) {
        regHulftId(CK_LE, hulftId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param minNumber The min number of hulftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hulftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHulftId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHulftId(), "HULFT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftIdList The collection of hulftId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHulftId_InScope(Collection<Long> hulftIdList) {
        doSetHulftId_InScope(hulftIdList);
    }

    protected void doSetHulftId_InScope(Collection<Long> hulftIdList) {
        regINS(CK_INS, cTL(hulftIdList), xgetCValueHulftId(), "HULFT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HULFT_ID: {bigint(19)}
     * @param hulftIdList The collection of hulftId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHulftId_NotInScope(Collection<Long> hulftIdList) {
        doSetHulftId_NotInScope(hulftIdList);
    }

    protected void doSetHulftId_NotInScope(Collection<Long> hulftIdList) {
        regINS(CK_NINS, cTL(hulftIdList), xgetCValueHulftId(), "HULFT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     */
    public void setHulftId_IsNull() { regHulftId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HULFT_ID: {bigint(19)}
     */
    public void setHulftId_IsNotNull() { regHulftId(CK_ISNN, DOBJ); }

    protected void regHulftId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHulftId(), "HULFT_ID"); }
    protected abstract ConditionValue xgetCValueHulftId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_Equal(String warehousecls) {
        doSetWarehousecls_Equal(fRES(warehousecls));
    }

    protected void doSetWarehousecls_Equal(String warehousecls) {
        regWarehousecls(CK_EQ, warehousecls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_NotEqual(String warehousecls) {
        doSetWarehousecls_NotEqual(fRES(warehousecls));
    }

    protected void doSetWarehousecls_NotEqual(String warehousecls) {
        regWarehousecls(CK_NES, warehousecls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_GreaterThan(String warehousecls) {
        regWarehousecls(CK_GT, fRES(warehousecls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_LessThan(String warehousecls) {
        regWarehousecls(CK_LT, fRES(warehousecls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_GreaterEqual(String warehousecls) {
        regWarehousecls(CK_GE, fRES(warehousecls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_LessEqual(String warehousecls) {
        regWarehousecls(CK_LE, fRES(warehousecls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehouseclsList The collection of warehousecls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_InScope(Collection<String> warehouseclsList) {
        doSetWarehousecls_InScope(warehouseclsList);
    }

    protected void doSetWarehousecls_InScope(Collection<String> warehouseclsList) {
        regINS(CK_INS, cTL(warehouseclsList), xgetCValueWarehousecls(), "WarehouseCls");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehouseclsList The collection of warehousecls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_NotInScope(Collection<String> warehouseclsList) {
        doSetWarehousecls_NotInScope(warehouseclsList);
    }

    protected void doSetWarehousecls_NotInScope(Collection<String> warehouseclsList) {
        regINS(CK_NINS, cTL(warehouseclsList), xgetCValueWarehousecls(), "WarehouseCls");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseCls: {char(1)} <br>
     * <pre>e.g. setWarehousecls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecls The value of warehousecls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecls_LikeSearch(String warehousecls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecls), xgetCValueWarehousecls(), "WarehouseCls", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecls_NotLikeSearch(String warehousecls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecls), xgetCValueWarehousecls(), "WarehouseCls", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseCls: {char(1)}
     * @param warehousecls The value of warehousecls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecls_PrefixSearch(String warehousecls) {
        setWarehousecls_LikeSearch(warehousecls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     */
    public void setWarehousecls_IsNull() { regWarehousecls(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WarehouseCls: {char(1)}
     */
    public void setWarehousecls_IsNotNull() { regWarehousecls(CK_ISNN, DOBJ); }

    protected void regWarehousecls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecls(), "WarehouseCls"); }
    protected abstract ConditionValue xgetCValueWarehousecls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_Equal(String cmlrasid) {
        doSetCmlrasid_Equal(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_Equal(String cmlrasid) {
        regCmlrasid(CK_EQ, cmlrasid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotEqual(String cmlrasid) {
        doSetCmlrasid_NotEqual(fRES(cmlrasid));
    }

    protected void doSetCmlrasid_NotEqual(String cmlrasid) {
        regCmlrasid(CK_NES, cmlrasid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterThan(String cmlrasid) {
        regCmlrasid(CK_GT, fRES(cmlrasid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessThan(String cmlrasid) {
        regCmlrasid(CK_LT, fRES(cmlrasid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_GreaterEqual(String cmlrasid) {
        regCmlrasid(CK_GE, fRES(cmlrasid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_LessEqual(String cmlrasid) {
        regCmlrasid(CK_LE, fRES(cmlrasid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasidList The collection of cmlrasid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_InScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_InScope(cmlrasidList);
    }

    protected void doSetCmlrasid_InScope(Collection<String> cmlrasidList) {
        regINS(CK_INS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasidList The collection of cmlrasid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        doSetCmlrasid_NotInScope(cmlrasidList);
    }

    protected void doSetCmlrasid_NotInScope(Collection<String> cmlrasidList) {
        regINS(CK_NINS, cTL(cmlrasidList), xgetCValueCmlrasid(), "CMLRASID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(30)} <br>
     * <pre>e.g. setCmlrasid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmlrasid The value of cmlrasid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmlrasid_LikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmlrasid_NotLikeSearch(String cmlrasid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmlrasid), xgetCValueCmlrasid(), "CMLRASID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMLRASID: {varchar(30)}
     * @param cmlrasid The value of cmlrasid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmlrasid_PrefixSearch(String cmlrasid) {
        setCmlrasid_LikeSearch(cmlrasid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     */
    public void setCmlrasid_IsNull() { regCmlrasid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     */
    public void setCmlrasid_IsNullOrEmpty() { regCmlrasid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CMLRASID: {varchar(30)}
     */
    public void setCmlrasid_IsNotNull() { regCmlrasid(CK_ISNN, DOBJ); }

    protected void regCmlrasid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmlrasid(), "CMLRASID"); }
    protected abstract ConditionValue xgetCValueCmlrasid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_Equal(String ownOrAnotherFlg) {
        doSetOwnOrAnotherFlg_Equal(fRES(ownOrAnotherFlg));
    }

    protected void doSetOwnOrAnotherFlg_Equal(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_EQ, ownOrAnotherFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_NotEqual(String ownOrAnotherFlg) {
        doSetOwnOrAnotherFlg_NotEqual(fRES(ownOrAnotherFlg));
    }

    protected void doSetOwnOrAnotherFlg_NotEqual(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_NES, ownOrAnotherFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_GreaterThan(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_GT, fRES(ownOrAnotherFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_LessThan(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_LT, fRES(ownOrAnotherFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_GreaterEqual(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_GE, fRES(ownOrAnotherFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_LessEqual(String ownOrAnotherFlg) {
        regOwnOrAnotherFlg(CK_LE, fRES(ownOrAnotherFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlgList The collection of ownOrAnotherFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_InScope(Collection<String> ownOrAnotherFlgList) {
        doSetOwnOrAnotherFlg_InScope(ownOrAnotherFlgList);
    }

    protected void doSetOwnOrAnotherFlg_InScope(Collection<String> ownOrAnotherFlgList) {
        regINS(CK_INS, cTL(ownOrAnotherFlgList), xgetCValueOwnOrAnotherFlg(), "OWN_OR_ANOTHER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlgList The collection of ownOrAnotherFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_NotInScope(Collection<String> ownOrAnotherFlgList) {
        doSetOwnOrAnotherFlg_NotInScope(ownOrAnotherFlgList);
    }

    protected void doSetOwnOrAnotherFlg_NotInScope(Collection<String> ownOrAnotherFlgList) {
        regINS(CK_NINS, cTL(ownOrAnotherFlgList), xgetCValueOwnOrAnotherFlg(), "OWN_OR_ANOTHER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)} <br>
     * <pre>e.g. setOwnOrAnotherFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnOrAnotherFlg_LikeSearch(String ownOrAnotherFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownOrAnotherFlg), xgetCValueOwnOrAnotherFlg(), "OWN_OR_ANOTHER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnOrAnotherFlg_NotLikeSearch(String ownOrAnotherFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownOrAnotherFlg), xgetCValueOwnOrAnotherFlg(), "OWN_OR_ANOTHER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @param ownOrAnotherFlg The value of ownOrAnotherFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnOrAnotherFlg_PrefixSearch(String ownOrAnotherFlg) {
        setOwnOrAnotherFlg_LikeSearch(ownOrAnotherFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     */
    public void setOwnOrAnotherFlg_IsNull() { regOwnOrAnotherFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     */
    public void setOwnOrAnotherFlg_IsNullOrEmpty() { regOwnOrAnotherFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     */
    public void setOwnOrAnotherFlg_IsNotNull() { regOwnOrAnotherFlg(CK_ISNN, DOBJ); }

    protected void regOwnOrAnotherFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnOrAnotherFlg(), "OWN_OR_ANOTHER_FLG"); }
    protected abstract ConditionValue xgetCValueOwnOrAnotherFlg();

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
    public HpSLCFunction<MCenterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCenterCB.class);
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
    public HpSLCFunction<MCenterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCenterCB.class);
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
    public HpSLCFunction<MCenterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCenterCB.class);
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
    public HpSLCFunction<MCenterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCenterCB.class);
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
    public HpSLCFunction<MCenterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCenterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCenterCB&gt;() {
     *     public void query(MCenterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCenterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCenterCQ sq);

    protected MCenterCB xcreateScalarConditionCB() {
        MCenterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCenterCB xcreateScalarConditionPartitionByCB() {
        MCenterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCenterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCenterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCenterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCenterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCenterCQ sq);

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
    protected MCenterCB newMyCB() {
        return new MCenterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCenterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

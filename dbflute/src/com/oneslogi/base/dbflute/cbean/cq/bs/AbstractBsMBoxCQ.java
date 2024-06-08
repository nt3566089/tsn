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
 * The abstract condition-query of M_BOX.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMBoxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMBoxCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_BOX";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_Equal(Long boxId) {
        doSetBoxId_Equal(boxId);
    }

    protected void doSetBoxId_Equal(Long boxId) {
        regBoxId(CK_EQ, boxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_NotEqual(Long boxId) {
        doSetBoxId_NotEqual(boxId);
    }

    protected void doSetBoxId_NotEqual(Long boxId) {
        regBoxId(CK_NES, boxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxIdList The collection of boxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_InScope(Collection<Long> boxIdList) {
        doSetBoxId_InScope(boxIdList);
    }

    protected void doSetBoxId_InScope(Collection<Long> boxIdList) {
        regINS(CK_INS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STANDARD_BOX_ID from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_MBoxGrpList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "STANDARD_BOX_ID", pp, "mBoxGrpList");
    }
    public abstract String keepBoxId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBoxGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBoxGrpDtlList for 'exists'. (NotNull)
     */
    public void existsMBoxGrpDtlList(SubQuery<MBoxGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_MBoxGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "mBoxGrpDtlList");
    }
    public abstract String keepBoxId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from M_CARRIER_BOX where ...)} <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierBoxList for 'exists'. (NotNull)
     */
    public void existsMCarrierBoxList(SubQuery<MCarrierBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_MCarrierBoxList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "mCarrierBoxList");
    }
    public abstract String keepBoxId_ExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEFAULT_BOX_ID from M_PARAM where ...)} <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MParamList for 'exists'. (NotNull)
     */
    public void existsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_MParamList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "DEFAULT_BOX_ID", pp, "mParamList");
    }
    public abstract String keepBoxId_ExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "tPackingHList");
    }
    public abstract String keepBoxId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wHtShippingList");
    }
    public abstract String keepBoxId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepBoxId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOX_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepBoxId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STANDARD_BOX_ID from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_MBoxGrpList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxGrpList(SubQuery<MBoxGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_MBoxGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "STANDARD_BOX_ID", pp, "mBoxGrpList");
    }
    public abstract String keepBoxId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBoxGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_MBoxGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsMBoxGrpDtlList(SubQuery<MBoxGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_MBoxGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "mBoxGrpDtlList");
    }
    public abstract String keepBoxId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from M_CARRIER_BOX where ...)} <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_MCarrierBoxList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierBoxList(SubQuery<MCarrierBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_MCarrierBoxList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "mCarrierBoxList");
    }
    public abstract String keepBoxId_NotExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEFAULT_BOX_ID from M_PARAM where ...)} <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_MParamList for 'not exists'. (NotNull)
     */
    public void notExistsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_MParamList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "DEFAULT_BOX_ID", pp, "mParamList");
    }
    public abstract String keepBoxId_NotExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "tPackingHList");
    }
    public abstract String keepBoxId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wHtShippingList");
    }
    public abstract String keepBoxId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepBoxId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOX_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BoxId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBoxId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOX_ID", "BOX_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepBoxId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveMBoxGrpList(String fn, SubQuery<MBoxGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpCB cb = new MBoxGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_MBoxGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "STANDARD_BOX_ID", pp, "mBoxGrpList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);

    public void xsderiveMBoxGrpDtlList(String fn, SubQuery<MBoxGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_MBoxGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "mBoxGrpDtlList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);

    public void xsderiveMCarrierBoxList(String fn, SubQuery<MCarrierBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_MCarrierBoxList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "mCarrierBoxList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    public void xsderiveMParamList(String fn, SubQuery<MParamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_MParamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "DEFAULT_BOX_ID", pp, "mParamList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_MParamList(MParamCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBoxId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepBoxId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_BOX_GRP where ...)} <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_MBoxGrpList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_MBoxGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "STANDARD_BOX_ID", sqpp, "mBoxGrpList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_BOX_GRP_DTL where ...)} <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBoxGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBoxGrpDtlCB> derivedMBoxGrpDtlList() {
        return xcreateQDRFunctionMBoxGrpDtlList();
    }
    protected HpQDRFunction<MBoxGrpDtlCB> xcreateQDRFunctionMBoxGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBoxGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBoxGrpDtlList(String fn, SubQuery<MBoxGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxGrpDtlCB cb = new MBoxGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_MBoxGrpDtlList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_MBoxGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "mBoxGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER_BOX where ...)} <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierBoxList()</span>.<span style="color: #CC4747">max</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     boxCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierBoxCB> derivedMCarrierBoxList() {
        return xcreateQDRFunctionMCarrierBoxList();
    }
    protected HpQDRFunction<MCarrierBoxCB> xcreateQDRFunctionMCarrierBoxList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierBoxList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierBoxList(String fn, SubQuery<MCarrierBoxCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_MCarrierBoxList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_MCarrierBoxListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "mCarrierBoxList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_MCarrierBoxListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PARAM where ...)} <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMParamList()</span>.<span style="color: #CC4747">max</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     paramCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MParamCB> derivedMParamList() {
        return xcreateQDRFunctionMParamList();
    }
    protected HpQDRFunction<MParamCB> xcreateQDRFunctionMParamList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMParamList(fn, sq, rd, vl, op));
    }
    public void xqderiveMParamList(String fn, SubQuery<MParamCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_MParamList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_MParamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "DEFAULT_BOX_ID", sqpp, "mParamList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_MParamList(MParamCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_MParamListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_H where ...)} <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBoxId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepBoxId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOX_ID", "BOX_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepBoxId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepBoxId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

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
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_Equal(String boxCd) {
        doSetBoxCd_Equal(fRES(boxCd));
    }

    protected void doSetBoxCd_Equal(String boxCd) {
        regBoxCd(CK_EQ, boxCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_NotEqual(String boxCd) {
        doSetBoxCd_NotEqual(fRES(boxCd));
    }

    protected void doSetBoxCd_NotEqual(String boxCd) {
        regBoxCd(CK_NES, boxCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_GreaterThan(String boxCd) {
        regBoxCd(CK_GT, fRES(boxCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_LessThan(String boxCd) {
        regBoxCd(CK_LT, fRES(boxCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_GreaterEqual(String boxCd) {
        regBoxCd(CK_GE, fRES(boxCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_LessEqual(String boxCd) {
        regBoxCd(CK_LE, fRES(boxCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCdList The collection of boxCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_InScope(Collection<String> boxCdList) {
        doSetBoxCd_InScope(boxCdList);
    }

    protected void doSetBoxCd_InScope(Collection<String> boxCdList) {
        regINS(CK_INS, cTL(boxCdList), xgetCValueBoxCd(), "BOX_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCdList The collection of boxCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_NotInScope(Collection<String> boxCdList) {
        doSetBoxCd_NotInScope(boxCdList);
    }

    protected void doSetBoxCd_NotInScope(Collection<String> boxCdList) {
        regINS(CK_NINS, cTL(boxCdList), xgetCValueBoxCd(), "BOX_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setBoxCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxCd The value of boxCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxCd_LikeSearch(String boxCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxCd), xgetCValueBoxCd(), "BOX_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxCd_NotLikeSearch(String boxCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxCd), xgetCValueBoxCd(), "BOX_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param boxCd The value of boxCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_PrefixSearch(String boxCd) {
        setBoxCd_LikeSearch(boxCd, xcLSOPPre());
    }

    protected void regBoxCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxCd(), "BOX_CD"); }
    protected abstract ConditionValue xgetCValueBoxCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_Equal(String boxNm) {
        doSetBoxNm_Equal(fRES(boxNm));
    }

    protected void doSetBoxNm_Equal(String boxNm) {
        regBoxNm(CK_EQ, boxNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_NotEqual(String boxNm) {
        doSetBoxNm_NotEqual(fRES(boxNm));
    }

    protected void doSetBoxNm_NotEqual(String boxNm) {
        regBoxNm(CK_NES, boxNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_GreaterThan(String boxNm) {
        regBoxNm(CK_GT, fRES(boxNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_LessThan(String boxNm) {
        regBoxNm(CK_LT, fRES(boxNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_GreaterEqual(String boxNm) {
        regBoxNm(CK_GE, fRES(boxNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_LessEqual(String boxNm) {
        regBoxNm(CK_LE, fRES(boxNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNmList The collection of boxNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_InScope(Collection<String> boxNmList) {
        doSetBoxNm_InScope(boxNmList);
    }

    protected void doSetBoxNm_InScope(Collection<String> boxNmList) {
        regINS(CK_INS, cTL(boxNmList), xgetCValueBoxNm(), "BOX_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNmList The collection of boxNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_NotInScope(Collection<String> boxNmList) {
        doSetBoxNm_NotInScope(boxNmList);
    }

    protected void doSetBoxNm_NotInScope(Collection<String> boxNmList) {
        regINS(CK_NINS, cTL(boxNmList), xgetCValueBoxNm(), "BOX_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setBoxNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxNm The value of boxNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxNm_LikeSearch(String boxNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxNm), xgetCValueBoxNm(), "BOX_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxNm_NotLikeSearch(String boxNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxNm), xgetCValueBoxNm(), "BOX_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @param boxNm The value of boxNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_PrefixSearch(String boxNm) {
        setBoxNm_LikeSearch(boxNm, xcLSOPPre());
    }

    protected void regBoxNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxNm(), "BOX_NM"); }
    protected abstract ConditionValue xgetCValueBoxNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_Equal(java.math.BigDecimal length) {
        doSetLength_Equal(length);
    }

    protected void doSetLength_Equal(java.math.BigDecimal length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_NotEqual(java.math.BigDecimal length) {
        doSetLength_NotEqual(length);
    }

    protected void doSetLength_NotEqual(java.math.BigDecimal length) {
        regLength(CK_NES, length);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterThan(java.math.BigDecimal length) {
        regLength(CK_GT, length);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessThan(java.math.BigDecimal length) {
        regLength(CK_LT, length);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterEqual(java.math.BigDecimal length) {
        regLength(CK_GE, length);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessEqual(java.math.BigDecimal length) {
        regLength(CK_LE, length);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param minNumber The min number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength(), "LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param lengthList The collection of length as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_InScope(Collection<java.math.BigDecimal> lengthList) {
        doSetLength_InScope(lengthList);
    }

    protected void doSetLength_InScope(Collection<java.math.BigDecimal> lengthList) {
        regINS(CK_INS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param lengthList The collection of length as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_NotInScope(Collection<java.math.BigDecimal> lengthList) {
        doSetLength_NotInScope(lengthList);
    }

    protected void doSetLength_NotInScope(Collection<java.math.BigDecimal> lengthList) {
        regINS(CK_NINS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     */
    public void setLength_IsNull() { regLength(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     */
    public void setLength_IsNotNull() { regLength(CK_ISNN, DOBJ); }

    protected void regLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength(), "LENGTH"); }
    protected abstract ConditionValue xgetCValueLength();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_Equal(java.math.BigDecimal width) {
        doSetWidth_Equal(width);
    }

    protected void doSetWidth_Equal(java.math.BigDecimal width) {
        regWidth(CK_EQ, width);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_NotEqual(java.math.BigDecimal width) {
        doSetWidth_NotEqual(width);
    }

    protected void doSetWidth_NotEqual(java.math.BigDecimal width) {
        regWidth(CK_NES, width);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_GreaterThan(java.math.BigDecimal width) {
        regWidth(CK_GT, width);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_LessThan(java.math.BigDecimal width) {
        regWidth(CK_LT, width);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_GreaterEqual(java.math.BigDecimal width) {
        regWidth(CK_GE, width);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_LessEqual(java.math.BigDecimal width) {
        regWidth(CK_LE, width);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param minNumber The min number of width. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth(), "WIDTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param widthList The collection of width as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_InScope(Collection<java.math.BigDecimal> widthList) {
        doSetWidth_InScope(widthList);
    }

    protected void doSetWidth_InScope(Collection<java.math.BigDecimal> widthList) {
        regINS(CK_INS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param widthList The collection of width as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_NotInScope(Collection<java.math.BigDecimal> widthList) {
        doSetWidth_NotInScope(widthList);
    }

    protected void doSetWidth_NotInScope(Collection<java.math.BigDecimal> widthList) {
        regINS(CK_NINS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     */
    public void setWidth_IsNull() { regWidth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     */
    public void setWidth_IsNotNull() { regWidth(CK_ISNN, DOBJ); }

    protected void regWidth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth(), "WIDTH"); }
    protected abstract ConditionValue xgetCValueWidth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_Equal(java.math.BigDecimal height) {
        doSetHeight_Equal(height);
    }

    protected void doSetHeight_Equal(java.math.BigDecimal height) {
        regHeight(CK_EQ, height);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_NotEqual(java.math.BigDecimal height) {
        doSetHeight_NotEqual(height);
    }

    protected void doSetHeight_NotEqual(java.math.BigDecimal height) {
        regHeight(CK_NES, height);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_GreaterThan(java.math.BigDecimal height) {
        regHeight(CK_GT, height);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_LessThan(java.math.BigDecimal height) {
        regHeight(CK_LT, height);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_GreaterEqual(java.math.BigDecimal height) {
        regHeight(CK_GE, height);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_LessEqual(java.math.BigDecimal height) {
        regHeight(CK_LE, height);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of height. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight(), "HEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param heightList The collection of height as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_InScope(Collection<java.math.BigDecimal> heightList) {
        doSetHeight_InScope(heightList);
    }

    protected void doSetHeight_InScope(Collection<java.math.BigDecimal> heightList) {
        regINS(CK_INS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param heightList The collection of height as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_NotInScope(Collection<java.math.BigDecimal> heightList) {
        doSetHeight_NotInScope(heightList);
    }

    protected void doSetHeight_NotInScope(Collection<java.math.BigDecimal> heightList) {
        regINS(CK_NINS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     */
    public void setHeight_IsNull() { regHeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     */
    public void setHeight_IsNotNull() { regHeight(CK_ISNN, DOBJ); }

    protected void regHeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight(), "HEIGHT"); }
    protected abstract ConditionValue xgetCValueHeight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_Equal(java.math.BigDecimal volume) {
        doSetVolume_Equal(volume);
    }

    protected void doSetVolume_Equal(java.math.BigDecimal volume) {
        regVolume(CK_EQ, volume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_NotEqual(java.math.BigDecimal volume) {
        doSetVolume_NotEqual(volume);
    }

    protected void doSetVolume_NotEqual(java.math.BigDecimal volume) {
        regVolume(CK_NES, volume);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_GreaterThan(java.math.BigDecimal volume) {
        regVolume(CK_GT, volume);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_LessThan(java.math.BigDecimal volume) {
        regVolume(CK_LT, volume);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_GreaterEqual(java.math.BigDecimal volume) {
        regVolume(CK_GE, volume);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_LessEqual(java.math.BigDecimal volume) {
        regVolume(CK_LE, volume);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param minNumber The min number of volume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of volume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVolume_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVolume(), "VOLUME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volumeList The collection of volume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_InScope(Collection<java.math.BigDecimal> volumeList) {
        doSetVolume_InScope(volumeList);
    }

    protected void doSetVolume_InScope(Collection<java.math.BigDecimal> volumeList) {
        regINS(CK_INS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volumeList The collection of volume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_NotInScope(Collection<java.math.BigDecimal> volumeList) {
        doSetVolume_NotInScope(volumeList);
    }

    protected void doSetVolume_NotInScope(Collection<java.math.BigDecimal> volumeList) {
        regINS(CK_NINS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     */
    public void setVolume_IsNull() { regVolume(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     */
    public void setVolume_IsNotNull() { regVolume(CK_ISNN, DOBJ); }

    protected void regVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVolume(), "VOLUME"); }
    protected abstract ConditionValue xgetCValueVolume();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_Equal(Long volumeRate) {
        doSetVolumeRate_Equal(volumeRate);
    }

    protected void doSetVolumeRate_Equal(Long volumeRate) {
        regVolumeRate(CK_EQ, volumeRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_NotEqual(Long volumeRate) {
        doSetVolumeRate_NotEqual(volumeRate);
    }

    protected void doSetVolumeRate_NotEqual(Long volumeRate) {
        regVolumeRate(CK_NES, volumeRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_GreaterThan(Long volumeRate) {
        regVolumeRate(CK_GT, volumeRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_LessThan(Long volumeRate) {
        regVolumeRate(CK_LT, volumeRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_GreaterEqual(Long volumeRate) {
        regVolumeRate(CK_GE, volumeRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRate The value of volumeRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolumeRate_LessEqual(Long volumeRate) {
        regVolumeRate(CK_LE, volumeRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param minNumber The min number of volumeRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of volumeRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVolumeRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVolumeRate(), "VOLUME_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRateList The collection of volumeRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolumeRate_InScope(Collection<Long> volumeRateList) {
        doSetVolumeRate_InScope(volumeRateList);
    }

    protected void doSetVolumeRate_InScope(Collection<Long> volumeRateList) {
        regINS(CK_INS, cTL(volumeRateList), xgetCValueVolumeRate(), "VOLUME_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     * @param volumeRateList The collection of volumeRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolumeRate_NotInScope(Collection<Long> volumeRateList) {
        doSetVolumeRate_NotInScope(volumeRateList);
    }

    protected void doSetVolumeRate_NotInScope(Collection<Long> volumeRateList) {
        regINS(CK_NINS, cTL(volumeRateList), xgetCValueVolumeRate(), "VOLUME_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     */
    public void setVolumeRate_IsNull() { regVolumeRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VOLUME_RATE: {bigint(19)}
     */
    public void setVolumeRate_IsNotNull() { regVolumeRate(CK_ISNN, DOBJ); }

    protected void regVolumeRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVolumeRate(), "VOLUME_RATE"); }
    protected abstract ConditionValue xgetCValueVolumeRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_Equal(java.math.BigDecimal permitVolume) {
        doSetPermitVolume_Equal(permitVolume);
    }

    protected void doSetPermitVolume_Equal(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_EQ, permitVolume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_NotEqual(java.math.BigDecimal permitVolume) {
        doSetPermitVolume_NotEqual(permitVolume);
    }

    protected void doSetPermitVolume_NotEqual(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_NES, permitVolume);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_GreaterThan(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_GT, permitVolume);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_LessThan(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_LT, permitVolume);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_GreaterEqual(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_GE, permitVolume);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolume The value of permitVolume as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitVolume_LessEqual(java.math.BigDecimal permitVolume) {
        regPermitVolume(CK_LE, permitVolume);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param minNumber The min number of permitVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of permitVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPermitVolume_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePermitVolume(), "PERMIT_VOLUME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolumeList The collection of permitVolume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPermitVolume_InScope(Collection<java.math.BigDecimal> permitVolumeList) {
        doSetPermitVolume_InScope(permitVolumeList);
    }

    protected void doSetPermitVolume_InScope(Collection<java.math.BigDecimal> permitVolumeList) {
        regINS(CK_INS, cTL(permitVolumeList), xgetCValuePermitVolume(), "PERMIT_VOLUME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @param permitVolumeList The collection of permitVolume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPermitVolume_NotInScope(Collection<java.math.BigDecimal> permitVolumeList) {
        doSetPermitVolume_NotInScope(permitVolumeList);
    }

    protected void doSetPermitVolume_NotInScope(Collection<java.math.BigDecimal> permitVolumeList) {
        regINS(CK_NINS, cTL(permitVolumeList), xgetCValuePermitVolume(), "PERMIT_VOLUME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     */
    public void setPermitVolume_IsNull() { regPermitVolume(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     */
    public void setPermitVolume_IsNotNull() { regPermitVolume(CK_ISNN, DOBJ); }

    protected void regPermitVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePermitVolume(), "PERMIT_VOLUME"); }
    protected abstract ConditionValue xgetCValuePermitVolume();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_Equal(java.math.BigDecimal permitWeight) {
        doSetPermitWeight_Equal(permitWeight);
    }

    protected void doSetPermitWeight_Equal(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_EQ, permitWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_NotEqual(java.math.BigDecimal permitWeight) {
        doSetPermitWeight_NotEqual(permitWeight);
    }

    protected void doSetPermitWeight_NotEqual(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_NES, permitWeight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_GreaterThan(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_GT, permitWeight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_LessThan(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_LT, permitWeight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_GreaterEqual(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_GE, permitWeight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeight The value of permitWeight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPermitWeight_LessEqual(java.math.BigDecimal permitWeight) {
        regPermitWeight(CK_LE, permitWeight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of permitWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of permitWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPermitWeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePermitWeight(), "PERMIT_WEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeightList The collection of permitWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPermitWeight_InScope(Collection<java.math.BigDecimal> permitWeightList) {
        doSetPermitWeight_InScope(permitWeightList);
    }

    protected void doSetPermitWeight_InScope(Collection<java.math.BigDecimal> permitWeightList) {
        regINS(CK_INS, cTL(permitWeightList), xgetCValuePermitWeight(), "PERMIT_WEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @param permitWeightList The collection of permitWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPermitWeight_NotInScope(Collection<java.math.BigDecimal> permitWeightList) {
        doSetPermitWeight_NotInScope(permitWeightList);
    }

    protected void doSetPermitWeight_NotInScope(Collection<java.math.BigDecimal> permitWeightList) {
        regINS(CK_NINS, cTL(permitWeightList), xgetCValuePermitWeight(), "PERMIT_WEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     */
    public void setPermitWeight_IsNull() { regPermitWeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     */
    public void setPermitWeight_IsNotNull() { regPermitWeight(CK_ISNN, DOBJ); }

    protected void regPermitWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePermitWeight(), "PERMIT_WEIGHT"); }
    protected abstract ConditionValue xgetCValuePermitWeight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_Equal(String boxType) {
        doSetBoxType_Equal(fRES(boxType));
    }

    protected void doSetBoxType_Equal(String boxType) {
        regBoxType(CK_EQ, boxType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_NotEqual(String boxType) {
        doSetBoxType_NotEqual(fRES(boxType));
    }

    protected void doSetBoxType_NotEqual(String boxType) {
        regBoxType(CK_NES, boxType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_GreaterThan(String boxType) {
        regBoxType(CK_GT, fRES(boxType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_LessThan(String boxType) {
        regBoxType(CK_LT, fRES(boxType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_GreaterEqual(String boxType) {
        regBoxType(CK_GE, fRES(boxType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_LessEqual(String boxType) {
        regBoxType(CK_LE, fRES(boxType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxTypeList The collection of boxType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_InScope(Collection<String> boxTypeList) {
        doSetBoxType_InScope(boxTypeList);
    }

    protected void doSetBoxType_InScope(Collection<String> boxTypeList) {
        regINS(CK_INS, cTL(boxTypeList), xgetCValueBoxType(), "BOX_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxTypeList The collection of boxType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_NotInScope(Collection<String> boxTypeList) {
        doSetBoxType_NotInScope(boxTypeList);
    }

    protected void doSetBoxType_NotInScope(Collection<String> boxTypeList) {
        regINS(CK_NINS, cTL(boxTypeList), xgetCValueBoxType(), "BOX_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(30)} <br>
     * <pre>e.g. setBoxType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxType The value of boxType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxType_LikeSearch(String boxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxType), xgetCValueBoxType(), "BOX_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxType_NotLikeSearch(String boxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxType), xgetCValueBoxType(), "BOX_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     * @param boxType The value of boxType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_PrefixSearch(String boxType) {
        setBoxType_LikeSearch(boxType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     */
    public void setBoxType_IsNull() { regBoxType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     */
    public void setBoxType_IsNullOrEmpty() { regBoxType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(30)}
     */
    public void setBoxType_IsNotNull() { regBoxType(CK_ISNN, DOBJ); }

    protected void regBoxType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxType(), "BOX_TYPE"); }
    protected abstract ConditionValue xgetCValueBoxType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_Equal(Long bxoszl) {
        doSetBxoszl_Equal(bxoszl);
    }

    protected void doSetBxoszl_Equal(Long bxoszl) {
        regBxoszl(CK_EQ, bxoszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_NotEqual(Long bxoszl) {
        doSetBxoszl_NotEqual(bxoszl);
    }

    protected void doSetBxoszl_NotEqual(Long bxoszl) {
        regBxoszl(CK_NES, bxoszl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterThan(Long bxoszl) {
        regBxoszl(CK_GT, bxoszl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessThan(Long bxoszl) {
        regBxoszl(CK_LT, bxoszl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterEqual(Long bxoszl) {
        regBxoszl(CK_GE, bxoszl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessEqual(Long bxoszl) {
        regBxoszl(CK_LE, bxoszl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param minNumber The min number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszl(), "BXOSZL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_InScope(Collection<Long> bxoszlList) {
        doSetBxoszl_InScope(bxoszlList);
    }

    protected void doSetBxoszl_InScope(Collection<Long> bxoszlList) {
        regINS(CK_INS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_NotInScope(Collection<Long> bxoszlList) {
        doSetBxoszl_NotInScope(bxoszlList);
    }

    protected void doSetBxoszl_NotInScope(Collection<Long> bxoszlList) {
        regINS(CK_NINS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNull() { regBxoszl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNotNull() { regBxoszl(CK_ISNN, DOBJ); }

    protected void regBxoszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszl(), "BXOSZL"); }
    protected abstract ConditionValue xgetCValueBxoszl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_Equal(Long bxoszw) {
        doSetBxoszw_Equal(bxoszw);
    }

    protected void doSetBxoszw_Equal(Long bxoszw) {
        regBxoszw(CK_EQ, bxoszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_NotEqual(Long bxoszw) {
        doSetBxoszw_NotEqual(bxoszw);
    }

    protected void doSetBxoszw_NotEqual(Long bxoszw) {
        regBxoszw(CK_NES, bxoszw);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterThan(Long bxoszw) {
        regBxoszw(CK_GT, bxoszw);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessThan(Long bxoszw) {
        regBxoszw(CK_LT, bxoszw);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterEqual(Long bxoszw) {
        regBxoszw(CK_GE, bxoszw);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessEqual(Long bxoszw) {
        regBxoszw(CK_LE, bxoszw);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param minNumber The min number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszw_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszw(), "BXOSZW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_InScope(Collection<Long> bxoszwList) {
        doSetBxoszw_InScope(bxoszwList);
    }

    protected void doSetBxoszw_InScope(Collection<Long> bxoszwList) {
        regINS(CK_INS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_NotInScope(Collection<Long> bxoszwList) {
        doSetBxoszw_NotInScope(bxoszwList);
    }

    protected void doSetBxoszw_NotInScope(Collection<Long> bxoszwList) {
        regINS(CK_NINS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNull() { regBxoszw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNotNull() { regBxoszw(CK_ISNN, DOBJ); }

    protected void regBxoszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszw(), "BXOSZW"); }
    protected abstract ConditionValue xgetCValueBxoszw();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_Equal(Long bxoszh) {
        doSetBxoszh_Equal(bxoszh);
    }

    protected void doSetBxoszh_Equal(Long bxoszh) {
        regBxoszh(CK_EQ, bxoszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_NotEqual(Long bxoszh) {
        doSetBxoszh_NotEqual(bxoszh);
    }

    protected void doSetBxoszh_NotEqual(Long bxoszh) {
        regBxoszh(CK_NES, bxoszh);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterThan(Long bxoszh) {
        regBxoszh(CK_GT, bxoszh);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessThan(Long bxoszh) {
        regBxoszh(CK_LT, bxoszh);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterEqual(Long bxoszh) {
        regBxoszh(CK_GE, bxoszh);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessEqual(Long bxoszh) {
        regBxoszh(CK_LE, bxoszh);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param minNumber The min number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszh_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszh(), "BXOSZH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_InScope(Collection<Long> bxoszhList) {
        doSetBxoszh_InScope(bxoszhList);
    }

    protected void doSetBxoszh_InScope(Collection<Long> bxoszhList) {
        regINS(CK_INS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_NotInScope(Collection<Long> bxoszhList) {
        doSetBxoszh_NotInScope(bxoszhList);
    }

    protected void doSetBxoszh_NotInScope(Collection<Long> bxoszhList) {
        regINS(CK_NINS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNull() { regBxoszh(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNotNull() { regBxoszh(CK_ISNN, DOBJ); }

    protected void regBxoszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszh(), "BXOSZH"); }
    protected abstract ConditionValue xgetCValueBxoszh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_Equal(java.math.BigDecimal bxweight) {
        doSetBxweight_Equal(bxweight);
    }

    protected void doSetBxweight_Equal(java.math.BigDecimal bxweight) {
        regBxweight(CK_EQ, bxweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_NotEqual(java.math.BigDecimal bxweight) {
        doSetBxweight_NotEqual(bxweight);
    }

    protected void doSetBxweight_NotEqual(java.math.BigDecimal bxweight) {
        regBxweight(CK_NES, bxweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_GreaterThan(java.math.BigDecimal bxweight) {
        regBxweight(CK_GT, bxweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_LessThan(java.math.BigDecimal bxweight) {
        regBxweight(CK_LT, bxweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_GreaterEqual(java.math.BigDecimal bxweight) {
        regBxweight(CK_GE, bxweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweight The value of bxweight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxweight_LessEqual(java.math.BigDecimal bxweight) {
        regBxweight(CK_LE, bxweight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of bxweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxweight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxweight(), "BXWEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweightList The collection of bxweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxweight_InScope(Collection<java.math.BigDecimal> bxweightList) {
        doSetBxweight_InScope(bxweightList);
    }

    protected void doSetBxweight_InScope(Collection<java.math.BigDecimal> bxweightList) {
        regINS(CK_INS, cTL(bxweightList), xgetCValueBxweight(), "BXWEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @param bxweightList The collection of bxweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxweight_NotInScope(Collection<java.math.BigDecimal> bxweightList) {
        doSetBxweight_NotInScope(bxweightList);
    }

    protected void doSetBxweight_NotInScope(Collection<java.math.BigDecimal> bxweightList) {
        regINS(CK_NINS, cTL(bxweightList), xgetCValueBxweight(), "BXWEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     */
    public void setBxweight_IsNull() { regBxweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXWEIGHT: {decimal(16, 6)}
     */
    public void setBxweight_IsNotNull() { regBxweight(CK_ISNN, DOBJ); }

    protected void regBxweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxweight(), "BXWEIGHT"); }
    protected abstract ConditionValue xgetCValueBxweight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_Equal(java.math.BigDecimal bxcpy) {
        doSetBxcpy_Equal(bxcpy);
    }

    protected void doSetBxcpy_Equal(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_EQ, bxcpy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_NotEqual(java.math.BigDecimal bxcpy) {
        doSetBxcpy_NotEqual(bxcpy);
    }

    protected void doSetBxcpy_NotEqual(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_NES, bxcpy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_GreaterThan(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_GT, bxcpy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_LessThan(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_LT, bxcpy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_GreaterEqual(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_GE, bxcpy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpy The value of bxcpy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxcpy_LessEqual(java.math.BigDecimal bxcpy) {
        regBxcpy(CK_LE, bxcpy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param minNumber The min number of bxcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxcpy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxcpy_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxcpy(), "bxcpy", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpyList The collection of bxcpy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxcpy_InScope(Collection<java.math.BigDecimal> bxcpyList) {
        doSetBxcpy_InScope(bxcpyList);
    }

    protected void doSetBxcpy_InScope(Collection<java.math.BigDecimal> bxcpyList) {
        regINS(CK_INS, cTL(bxcpyList), xgetCValueBxcpy(), "bxcpy");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     * @param bxcpyList The collection of bxcpy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxcpy_NotInScope(Collection<java.math.BigDecimal> bxcpyList) {
        doSetBxcpy_NotInScope(bxcpyList);
    }

    protected void doSetBxcpy_NotInScope(Collection<java.math.BigDecimal> bxcpyList) {
        regINS(CK_NINS, cTL(bxcpyList), xgetCValueBxcpy(), "bxcpy");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     */
    public void setBxcpy_IsNull() { regBxcpy(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bxcpy: {decimal(16, 6)}
     */
    public void setBxcpy_IsNotNull() { regBxcpy(CK_ISNN, DOBJ); }

    protected void regBxcpy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxcpy(), "bxcpy"); }
    protected abstract ConditionValue xgetCValueBxcpy();

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
    public HpSLCFunction<MBoxCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MBoxCB.class);
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
    public HpSLCFunction<MBoxCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MBoxCB.class);
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
    public HpSLCFunction<MBoxCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MBoxCB.class);
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
    public HpSLCFunction<MBoxCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MBoxCB.class);
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
    public HpSLCFunction<MBoxCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MBoxCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MBoxCB&gt;() {
     *     public void query(MBoxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MBoxCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MBoxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MBoxCQ sq);

    protected MBoxCB xcreateScalarConditionCB() {
        MBoxCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MBoxCB xcreateScalarConditionPartitionByCB() {
        MBoxCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BOX_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MBoxCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MBoxCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MBoxCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBoxCB cb = new MBoxCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BOX_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MBoxCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MBoxCQ sq);

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
    protected MBoxCB newMyCB() {
        return new MBoxCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MBoxCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of M_CLIENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMClientCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMClientCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CLIENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CLIENT_ID, named 'MCbrctgAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MCbrctgList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCbrctgList");
    }
    public abstract String keepClientId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CLIENT_ID, named 'MCdrcattAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MCdrcattList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCdrcattList");
    }
    public abstract String keepClientId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MClientCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientCenterList");
    }
    public abstract String keepClientId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by CLIENT_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientColList for 'exists'. (NotNull)
     */
    public void existsMClientColList(SubQuery<MClientColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientColCB cb = new MClientColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MClientColList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientColList");
    }
    public abstract String keepClientId_ExistsReferrer_MClientColList(MClientColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientItemList for 'exists'. (NotNull)
     */
    public void existsMClientItemList(SubQuery<MClientItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MClientItemList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientItemList");
    }
    public abstract String keepClientId_ExistsReferrer_MClientItemList(MClientItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientScreenList for 'exists'. (NotNull)
     */
    public void existsMClientScreenList(SubQuery<MClientScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MClientScreenList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientScreenList");
    }
    public abstract String keepClientId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by CLIENT_ID, named 'MCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCustomerList for 'exists'. (NotNull)
     */
    public void existsMCustomerList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCustomerList");
    }
    public abstract String keepClientId_ExistsReferrer_MCustomerList(MCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_IMPORT_TYPE where ...)} <br>
     * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMImportTypeList</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MImportTypeList for 'exists'. (NotNull)
     */
    public void existsMImportTypeList(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MImportTypeList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mImportTypeList");
    }
    public abstract String keepClientId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfinvoperationList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfinvoperationList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfmonthchgList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfmonthchgList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFPICKCTL where ...)} <br>
     * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfpickctlList</span>(mfpickctlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfpickctlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfpickctlList for 'exists'. (NotNull)
     */
    public void existsMMfpickctlList(SubQuery<MMfpickctlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfpickctlList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfpickctlList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfpickctlList(MMfpickctlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFRCVDESIGN where ...)} <br>
     * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfrcvdesignList</span>(mfrcvdesignCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvdesignCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfrcvdesignList for 'exists'. (NotNull)
     */
    public void existsMMfrcvdesignList(SubQuery<MMfrcvdesignCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfrcvdesignCB cb = new MMfrcvdesignCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfrcvdesignList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvdesignList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFRCVITEM where ...)} <br>
     * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMMfrcvitemList</span>(mfrcvitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvitemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MMfrcvitemList for 'exists'. (NotNull)
     */
    public void existsMMfrcvitemList(SubQuery<MMfrcvitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfrcvitemList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvitemList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MMfwhxitemList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepClientId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by CLIENT_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductList for 'exists'. (NotNull)
     */
    public void existsMProductList(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MProductList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mProductList");
    }
    public abstract String keepClientId_ExistsReferrer_MProductList(MProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_SHAPE_GRP where ...)} <br>
     * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMShapeGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MShapeGrpList for 'exists'. (NotNull)
     */
    public void existsMShapeGrpList(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MShapeGrpList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mShapeGrpList");
    }
    public abstract String keepClientId_ExistsReferrer_MShapeGrpList(MShapeGrpCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_USER_CLIENT where ...)} <br>
     * M_USER_CLIENT by CLIENT_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserClientList for 'exists'. (NotNull)
     */
    public void existsMUserClientList(SubQuery<MUserClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MUserClientList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserClientList");
    }
    public abstract String keepClientId_ExistsReferrer_MUserClientList(MUserClientCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MUserLoginList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserLoginList");
    }
    public abstract String keepClientId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_MWebHtInfoList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepClientId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TAllocInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tAllocInstHList");
    }
    public abstract String keepClientId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CLIENT_ID, named 'TCcopamAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TCcopamList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCcopamList");
    }
    public abstract String keepClientId_ExistsReferrer_TCcopamList(TCcopamCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TCenterSymbolList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepClientId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CLIENT_ID, named 'TCordhdrAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TCordhdrList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCordhdrList");
    }
    public abstract String keepClientId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TEcOrderHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tEcOrderHList");
    }
    public abstract String keepClientId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TInventoryHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tInventoryHList");
    }
    public abstract String keepClientId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TMflastshiplotList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMflastshiplotList");
    }
    public abstract String keepClientId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TMoveInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMoveInstHList");
    }
    public abstract String keepClientId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CLIENT_ID, named 'TPackingHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPackingHList");
    }
    public abstract String keepClientId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_PALLET where ...)} <br>
     * T_PALLET by CLIENT_ID, named 'TPalletAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TPalletList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPalletList");
    }
    public abstract String keepClientId_ExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CLIENT_ID, named 'TPickingHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TPickingHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPickingHList");
    }
    public abstract String keepClientId_ExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TPicMthdRcmdList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepClientId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TReceivePlanHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepClientId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TSerialNoList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSerialNoList");
    }
    public abstract String keepClientId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tShippingInstHList");
    }
    public abstract String keepClientId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CLIENT_ID, named 'TSplinfoAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TSplinfoList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSplinfoList");
    }
    public abstract String keepClientId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_STOCK where ...)} <br>
     * T_STOCK by CLIENT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockList for 'exists'. (NotNull)
     */
    public void existsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStockList");
    }
    public abstract String keepClientId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TStoreRecordHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepClientId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CLIENT_ID, named 'TTrallinvAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrallinvList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrallinvhistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvhistoryList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrcaseinventoryList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcaseinventoryList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrcasenumList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasenumList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrcasestockList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasestockList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrhanbaiinvList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrhanbaiinvList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrinvcorrectList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcorrectList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrinvreanswerList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvreanswerList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrinvrequestList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvrequestList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTritemconvresultList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTritemconvresultList");
    }
    public abstract String keepClientId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrjukyuinvList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrjukyuinvList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrmanufacturedateList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedateList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrmanufacturedatedetailList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatedetailList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatehistoryList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrpallettraceList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrpallettraceList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrreversestockList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrreversestockList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrstockdiffhistoryList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrstockdiffhistoryList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrsymboltraceList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrsymboltraceextendList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceextendList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CLIENT_ID, named 'TTrtraceAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TTrtraceList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrtraceList");
    }
    public abstract String keepClientId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from T_YTRSO where ...)} <br>
     * T_YTRSO by CLIENT_ID, named 'TYtrsoAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_TYtrsoList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tYtrsoList");
    }
    public abstract String keepClientId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtLoadingList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtLoadingList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepClientId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepClientId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLIENT_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepClientId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CLIENT_ID, named 'MCbrctgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCbrctgList</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cbrctgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MCbrctgList for 'not exists'. (NotNull)
     */
    public void notExistsMCbrctgList(SubQuery<MCbrctgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MCbrctgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCbrctgList");
    }
    public abstract String keepClientId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CLIENT_ID, named 'MCdrcattAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCdrcattList</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cdrcattCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MCdrcattList for 'not exists'. (NotNull)
     */
    public void notExistsMCdrcattList(SubQuery<MCdrcattCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MCdrcattList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCdrcattList");
    }
    public abstract String keepClientId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MClientCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MClientCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientCenterList");
    }
    public abstract String keepClientId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by CLIENT_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MClientColList for 'not exists'. (NotNull)
     */
    public void notExistsMClientColList(SubQuery<MClientColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientColCB cb = new MClientColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MClientColList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientColList");
    }
    public abstract String keepClientId_NotExistsReferrer_MClientColList(MClientColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MClientItemList for 'not exists'. (NotNull)
     */
    public void notExistsMClientItemList(SubQuery<MClientItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MClientItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientItemList");
    }
    public abstract String keepClientId_NotExistsReferrer_MClientItemList(MClientItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MClientScreenList for 'not exists'. (NotNull)
     */
    public void notExistsMClientScreenList(SubQuery<MClientScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MClientScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientScreenList");
    }
    public abstract String keepClientId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by CLIENT_ID, named 'MCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCustomerList");
    }
    public abstract String keepClientId_NotExistsReferrer_MCustomerList(MCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_IMPORT_TYPE where ...)} <br>
     * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMImportTypeList</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MImportTypeList for 'not exists'. (NotNull)
     */
    public void notExistsMImportTypeList(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MImportTypeList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mImportTypeList");
    }
    public abstract String keepClientId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfinvoperationList</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfinvoperationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfinvoperationList for 'not exists'. (NotNull)
     */
    public void notExistsMMfinvoperationList(SubQuery<MMfinvoperationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfinvoperationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfinvoperationList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfmonthchgList</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfmonthchgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfmonthchgList for 'not exists'. (NotNull)
     */
    public void notExistsMMfmonthchgList(SubQuery<MMfmonthchgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfmonthchgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfmonthchgList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFPICKCTL where ...)} <br>
     * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfpickctlList</span>(mfpickctlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfpickctlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfpickctlList for 'not exists'. (NotNull)
     */
    public void notExistsMMfpickctlList(SubQuery<MMfpickctlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfpickctlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfpickctlList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfpickctlList(MMfpickctlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFRCVDESIGN where ...)} <br>
     * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfrcvdesignList</span>(mfrcvdesignCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvdesignCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfrcvdesignList for 'not exists'. (NotNull)
     */
    public void notExistsMMfrcvdesignList(SubQuery<MMfrcvdesignCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfrcvdesignCB cb = new MMfrcvdesignCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfrcvdesignList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvdesignList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFRCVITEM where ...)} <br>
     * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfrcvitemList</span>(mfrcvitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvitemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfrcvitemList for 'not exists'. (NotNull)
     */
    public void notExistsMMfrcvitemList(SubQuery<MMfrcvitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfrcvitemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvitemList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMMfwhxitemList</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MMfwhxitemList for 'not exists'. (NotNull)
     */
    public void notExistsMMfwhxitemList(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MMfwhxitemList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfwhxitemList");
    }
    public abstract String keepClientId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by CLIENT_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MProductList for 'not exists'. (NotNull)
     */
    public void notExistsMProductList(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mProductList");
    }
    public abstract String keepClientId_NotExistsReferrer_MProductList(MProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_SHAPE_GRP where ...)} <br>
     * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMShapeGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MShapeGrpList for 'not exists'. (NotNull)
     */
    public void notExistsMShapeGrpList(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MShapeGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mShapeGrpList");
    }
    public abstract String keepClientId_NotExistsReferrer_MShapeGrpList(MShapeGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_USER_CLIENT where ...)} <br>
     * M_USER_CLIENT by CLIENT_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MUserClientList for 'not exists'. (NotNull)
     */
    public void notExistsMUserClientList(SubQuery<MUserClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MUserClientList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserClientList");
    }
    public abstract String keepClientId_NotExistsReferrer_MUserClientList(MUserClientCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserLoginList</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MUserLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMUserLoginList(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MUserLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserLoginList");
    }
    public abstract String keepClientId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMWebHtInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_MWebHtInfoList for 'not exists'. (NotNull)
     */
    public void notExistsMWebHtInfoList(SubQuery<MWebHtInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_MWebHtInfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mWebHtInfoList");
    }
    public abstract String keepClientId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TAllocInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TAllocInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tAllocInstHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CLIENT_ID, named 'TCcopamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCcopamList</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ccopamCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TCcopamList for 'not exists'. (NotNull)
     */
    public void notExistsTCcopamList(SubQuery<TCcopamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TCcopamList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCcopamList");
    }
    public abstract String keepClientId_NotExistsReferrer_TCcopamList(TCcopamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCenterSymbolList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TCenterSymbolList for 'not exists'. (NotNull)
     */
    public void notExistsTCenterSymbolList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TCenterSymbolList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepClientId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CLIENT_ID, named 'TCordhdrAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCordhdrList</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cordhdrCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TCordhdrList for 'not exists'. (NotNull)
     */
    public void notExistsTCordhdrList(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TCordhdrList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCordhdrList");
    }
    public abstract String keepClientId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TEcOrderHList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TEcOrderHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tEcOrderHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TInventoryHList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryHList(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TInventoryHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tInventoryHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMflastshiplotList</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mflastshiplotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TMflastshiplotList for 'not exists'. (NotNull)
     */
    public void notExistsTMflastshiplotList(SubQuery<TMflastshiplotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TMflastshiplotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMflastshiplotList");
    }
    public abstract String keepClientId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TMoveInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstHList(SubQuery<TMoveInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TMoveInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMoveInstHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CLIENT_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPackingHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_PALLET where ...)} <br>
     * T_PALLET by CLIENT_ID, named 'TPalletAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPalletList</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     palletCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TPalletList for 'not exists'. (NotNull)
     */
    public void notExistsTPalletList(SubQuery<TPalletCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPalletCB cb = new TPalletCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TPalletList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPalletList");
    }
    public abstract String keepClientId_NotExistsReferrer_TPalletList(TPalletCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CLIENT_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TPickingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TPickingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPickingHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdList</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rcmdCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TPicMthdRcmdList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdList(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TPicMthdRcmdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPicMthdRcmdList");
    }
    public abstract String keepClientId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TReceivePlanHList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TReceivePlanHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TSerialNoList for 'not exists'. (NotNull)
     */
    public void notExistsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TSerialNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSerialNoList");
    }
    public abstract String keepClientId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tShippingInstHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CLIENT_ID, named 'TSplinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSplinfoList</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     splinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TSplinfoList for 'not exists'. (NotNull)
     */
    public void notExistsTSplinfoList(SubQuery<TSplinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TSplinfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSplinfoList");
    }
    public abstract String keepClientId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_STOCK where ...)} <br>
     * T_STOCK by CLIENT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStockList");
    }
    public abstract String keepClientId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TStoreRecordHList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TStoreRecordHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepClientId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CLIENT_ID, named 'TTrallinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrallinvList</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrallinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrallinvList(SubQuery<TTrallinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrallinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrallinvhistoryList</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trallinvhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrallinvhistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrallinvhistoryList(SubQuery<TTrallinvhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrallinvhistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvhistoryList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcaseinventoryList</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcaseinventoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrcaseinventoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcaseinventoryList(SubQuery<TTrcaseinventoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrcaseinventoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcaseinventoryList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcasenumList</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasenumCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrcasenumList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcasenumList(SubQuery<TTrcasenumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrcasenumList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasenumList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrcasestockList</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trcasestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrcasestockList for 'not exists'. (NotNull)
     */
    public void notExistsTTrcasestockList(SubQuery<TTrcasestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrcasestockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasestockList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrhanbaiinvList</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trhanbaiinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrhanbaiinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrhanbaiinvList(SubQuery<TTrhanbaiinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrhanbaiinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrhanbaiinvList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvcheckinfoList</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcheckinfoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrinvcheckinfoList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvcheckinfoList(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrinvcheckinfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcheckinfoList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvcorrectList</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvcorrectCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrinvcorrectList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvcorrectList(SubQuery<TTrinvcorrectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrinvcorrectList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcorrectList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvreanswerList</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvreanswerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrinvreanswerList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvreanswerList(SubQuery<TTrinvreanswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrinvreanswerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvreanswerList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrinvrequestList</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trinvrequestCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrinvrequestList for 'not exists'. (NotNull)
     */
    public void notExistsTTrinvrequestList(SubQuery<TTrinvrequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrinvrequestList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvrequestList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTritemconvresultList</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tritemconvresultCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTritemconvresultList for 'not exists'. (NotNull)
     */
    public void notExistsTTritemconvresultList(SubQuery<TTritemconvresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTritemconvresultList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTritemconvresultList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrjukyuinvList</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trjukyuinvCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrjukyuinvList for 'not exists'. (NotNull)
     */
    public void notExistsTTrjukyuinvList(SubQuery<TTrjukyuinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrjukyuinvList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrjukyuinvList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedateList</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedateCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrmanufacturedateList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedateList(SubQuery<TTrmanufacturedateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrmanufacturedateList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedateList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedatedetailList</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatedetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrmanufacturedatedetailList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedatedetailList(SubQuery<TTrmanufacturedatedetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrmanufacturedatedetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatedetailList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrmanufacturedatehistoryList</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trmanufacturedatehistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrmanufacturedatehistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrmanufacturedatehistoryList(SubQuery<TTrmanufacturedatehistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatehistoryList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrpallettraceList</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpallettraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrpallettraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrpallettraceList(SubQuery<TTrpallettraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrpallettraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrpallettraceList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrreversestockList</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trreversestockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrreversestockList for 'not exists'. (NotNull)
     */
    public void notExistsTTrreversestockList(SubQuery<TTrreversestockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrreversestockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrreversestockList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrstockdiffhistoryList</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trstockdiffhistoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrstockdiffhistoryList for 'not exists'. (NotNull)
     */
    public void notExistsTTrstockdiffhistoryList(SubQuery<TTrstockdiffhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrstockdiffhistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrstockdiffhistoryList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrsymboltraceList</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrsymboltraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrsymboltraceList(SubQuery<TTrsymboltraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrsymboltraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrsymboltraceextendList</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trsymboltraceextendCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrsymboltraceextendList for 'not exists'. (NotNull)
     */
    public void notExistsTTrsymboltraceextendList(SubQuery<TTrsymboltraceextendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrsymboltraceextendList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceextendList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CLIENT_ID, named 'TTrtraceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrtraceList</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trtraceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TTrtraceList for 'not exists'. (NotNull)
     */
    public void notExistsTTrtraceList(SubQuery<TTrtraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TTrtraceList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrtraceList");
    }
    public abstract String keepClientId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from T_YTRSO where ...)} <br>
     * T_YTRSO by CLIENT_ID, named 'TYtrsoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTYtrsoList</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ytrsoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_TYtrsoList for 'not exists'. (NotNull)
     */
    public void notExistsTYtrsoList(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_TYtrsoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tYtrsoList");
    }
    public abstract String keepClientId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtLoadingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtLoadingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtLoadingList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtSerialReceiveInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtSerialShippingInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepClientId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepClientId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLIENT_ID from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClientId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClientId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepClientId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveMCbrctgList(String fn, SubQuery<MCbrctgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCbrctgCB cb = new MCbrctgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MCbrctgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCbrctgList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq);

    public void xsderiveMCdrcattList(String fn, SubQuery<MCdrcattCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCdrcattCB cb = new MCdrcattCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MCdrcattList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCdrcattList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq);

    public void xsderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MClientCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientCenterList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq);

    public void xsderiveMClientColList(String fn, SubQuery<MClientColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientColCB cb = new MClientColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MClientColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientColList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq);

    public void xsderiveMClientItemList(String fn, SubQuery<MClientItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MClientItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientItemList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq);

    public void xsderiveMClientScreenList(String fn, SubQuery<MClientScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MClientScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClientScreenList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq);

    public void xsderiveMCustomerList(String fn, SubQuery<MCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mCustomerList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MCustomerList(MCustomerCQ sq);

    public void xsderiveMImportTypeList(String fn, SubQuery<MImportTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MImportTypeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mImportTypeList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq);

    public void xsderiveMMfinvoperationList(String fn, SubQuery<MMfinvoperationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfinvoperationCB cb = new MMfinvoperationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfinvoperationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfinvoperationList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq);

    public void xsderiveMMfmonthchgList(String fn, SubQuery<MMfmonthchgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfmonthchgCB cb = new MMfmonthchgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfmonthchgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfmonthchgList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq);

    public void xsderiveMMfpickctlList(String fn, SubQuery<MMfpickctlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfpickctlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfpickctlList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq);

    public void xsderiveMMfrcvdesignList(String fn, SubQuery<MMfrcvdesignCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvdesignCB cb = new MMfrcvdesignCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfrcvdesignList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvdesignList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq);

    public void xsderiveMMfrcvitemList(String fn, SubQuery<MMfrcvitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfrcvitemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfrcvitemList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq);

    public void xsderiveMMfwhxitemList(String fn, SubQuery<MMfwhxitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MMfwhxitemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mMfwhxitemList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);

    public void xsderiveMProductList(String fn, SubQuery<MProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mProductList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MProductList(MProductCQ sq);

    public void xsderiveMShapeGrpList(String fn, SubQuery<MShapeGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MShapeGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mShapeGrpList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq);

    public void xsderiveMUserClientList(String fn, SubQuery<MUserClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MUserClientList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserClientList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq);

    public void xsderiveMUserLoginList(String fn, SubQuery<MUserLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MUserLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mUserLoginList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq);

    public void xsderiveMWebHtInfoList(String fn, SubQuery<MWebHtInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MWebHtInfoCB cb = new MWebHtInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mWebHtInfoList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);

    public void xsderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TAllocInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tAllocInstHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);

    public void xsderiveTCcopamList(String fn, SubQuery<TCcopamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCcopamCB cb = new TCcopamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TCcopamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCcopamList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq);

    public void xsderiveTCenterSymbolList(String fn, SubQuery<TCenterSymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TCenterSymbolList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCenterSymbolList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    public void xsderiveTCordhdrList(String fn, SubQuery<TCordhdrCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TCordhdrList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tCordhdrList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq);

    public void xsderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TEcOrderHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tEcOrderHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);

    public void xsderiveTInventoryHList(String fn, SubQuery<TInventoryHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TInventoryHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tInventoryHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq);

    public void xsderiveTMflastshiplotList(String fn, SubQuery<TMflastshiplotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMflastshiplotCB cb = new TMflastshiplotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TMflastshiplotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMflastshiplotList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq);

    public void xsderiveTMoveInstHList(String fn, SubQuery<TMoveInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstHCB cb = new TMoveInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TMoveInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tMoveInstHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPalletList(String fn, SubQuery<TPalletCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPalletCB cb = new TPalletCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TPalletList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPalletList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq);

    public void xsderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TPickingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPickingHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq);

    public void xsderiveTPicMthdRcmdList(String fn, SubQuery<TPicMthdRcmdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tPicMthdRcmdList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);

    public void xsderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tReceivePlanHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    public void xsderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TSerialNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSerialNoList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveTSplinfoList(String fn, SubQuery<TSplinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSplinfoCB cb = new TSplinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TSplinfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tSplinfoList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tStoreRecordHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    public void xsderiveTTrallinvList(String fn, SubQuery<TTrallinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvCB cb = new TTrallinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrallinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq);

    public void xsderiveTTrallinvhistoryList(String fn, SubQuery<TTrallinvhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrallinvhistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrallinvhistoryList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);

    public void xsderiveTTrcaseinventoryList(String fn, SubQuery<TTrcaseinventoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcaseinventoryCB cb = new TTrcaseinventoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrcaseinventoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcaseinventoryList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);

    public void xsderiveTTrcasenumList(String fn, SubQuery<TTrcasenumCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasenumCB cb = new TTrcasenumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrcasenumList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasenumList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq);

    public void xsderiveTTrcasestockList(String fn, SubQuery<TTrcasestockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrcasestockCB cb = new TTrcasestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrcasestockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrcasestockList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq);

    public void xsderiveTTrhanbaiinvList(String fn, SubQuery<TTrhanbaiinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrhanbaiinvCB cb = new TTrhanbaiinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrhanbaiinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrhanbaiinvList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);

    public void xsderiveTTrinvcheckinfoList(String fn, SubQuery<TTrinvcheckinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrinvcheckinfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcheckinfoList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);

    public void xsderiveTTrinvcorrectList(String fn, SubQuery<TTrinvcorrectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcorrectCB cb = new TTrinvcorrectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrinvcorrectList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvcorrectList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);

    public void xsderiveTTrinvreanswerList(String fn, SubQuery<TTrinvreanswerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvreanswerCB cb = new TTrinvreanswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrinvreanswerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvreanswerList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);

    public void xsderiveTTrinvrequestList(String fn, SubQuery<TTrinvrequestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrinvrequestList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrinvrequestList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq);

    public void xsderiveTTritemconvresultList(String fn, SubQuery<TTritemconvresultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTritemconvresultCB cb = new TTritemconvresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTritemconvresultList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTritemconvresultList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq);

    public void xsderiveTTrjukyuinvList(String fn, SubQuery<TTrjukyuinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrjukyuinvCB cb = new TTrjukyuinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrjukyuinvList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrjukyuinvList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);

    public void xsderiveTTrmanufacturedateList(String fn, SubQuery<TTrmanufacturedateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedateCB cb = new TTrmanufacturedateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrmanufacturedateList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedateList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);

    public void xsderiveTTrmanufacturedatedetailList(String fn, SubQuery<TTrmanufacturedatedetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatedetailList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);

    public void xsderiveTTrmanufacturedatehistoryList(String fn, SubQuery<TTrmanufacturedatehistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatehistoryCB cb = new TTrmanufacturedatehistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrmanufacturedatehistoryList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);

    public void xsderiveTTrpallettraceList(String fn, SubQuery<TTrpallettraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpallettraceCB cb = new TTrpallettraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrpallettraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrpallettraceList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq);

    public void xsderiveTTrreversestockList(String fn, SubQuery<TTrreversestockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrreversestockCB cb = new TTrreversestockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrreversestockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrreversestockList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq);

    public void xsderiveTTrstockdiffhistoryList(String fn, SubQuery<TTrstockdiffhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrstockdiffhistoryList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);

    public void xsderiveTTrsymboltraceList(String fn, SubQuery<TTrsymboltraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrsymboltraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);

    public void xsderiveTTrsymboltraceextendList(String fn, SubQuery<TTrsymboltraceextendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceextendCB cb = new TTrsymboltraceextendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrsymboltraceextendList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrsymboltraceextendList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);

    public void xsderiveTTrtraceList(String fn, SubQuery<TTrtraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrtraceCB cb = new TTrtraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TTrtraceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tTrtraceList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq);

    public void xsderiveTYtrsoList(String fn, SubQuery<TYtrsoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_TYtrsoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "tYtrsoList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtLoadingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtLoadingList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialReceiveInspList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    public void xsderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtSerialShippingInspList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CBRCTG where ...)} <br>
     * M_CBRCTG by CLIENT_ID, named 'MCbrctgAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MCbrctgList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MCbrctgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mCbrctgList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MCbrctgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CDRCATT where ...)} <br>
     * M_CDRCATT by CLIENT_ID, named 'MCdrcattAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MCdrcattList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MCdrcattListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mCdrcattList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MCdrcattListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_CENTER where ...)} <br>
     * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MClientCenterList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MClientCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mClientCenterList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MClientCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by CLIENT_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientColCB> derivedMClientColList() {
        return xcreateQDRFunctionMClientColList();
    }
    protected HpQDRFunction<MClientColCB> xcreateQDRFunctionMClientColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientColList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientColList(String fn, SubQuery<MClientColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientColCB cb = new MClientColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MClientColList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MClientColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mClientColList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MClientColList(MClientColCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MClientColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientItemCB> derivedMClientItemList() {
        return xcreateQDRFunctionMClientItemList();
    }
    protected HpQDRFunction<MClientItemCB> xcreateQDRFunctionMClientItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientItemList(String fn, SubQuery<MClientItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MClientItemList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MClientItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mClientItemList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MClientItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientScreenCB> derivedMClientScreenList() {
        return xcreateQDRFunctionMClientScreenList();
    }
    protected HpQDRFunction<MClientScreenCB> xcreateQDRFunctionMClientScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientScreenList(String fn, SubQuery<MClientScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MClientScreenList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MClientScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mClientScreenList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MClientScreenListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CUSTOMER where ...)} <br>
     * M_CUSTOMER by CLIENT_ID, named 'MCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCustomerCB> derivedMCustomerList() {
        return xcreateQDRFunctionMCustomerList();
    }
    protected HpQDRFunction<MCustomerCB> xcreateQDRFunctionMCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCustomerList(String fn, SubQuery<MCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MCustomerList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MCustomerList(MCustomerCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_IMPORT_TYPE where ...)} <br>
     * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMImportTypeList()</span>.<span style="color: #CC4747">max</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     typeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MImportTypeCB> derivedMImportTypeList() {
        return xcreateQDRFunctionMImportTypeList();
    }
    protected HpQDRFunction<MImportTypeCB> xcreateQDRFunctionMImportTypeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMImportTypeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMImportTypeList(String fn, SubQuery<MImportTypeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MImportTypeList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MImportTypeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mImportTypeList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MImportTypeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFINVOPERATION where ...)} <br>
     * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfinvoperationList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfinvoperationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfinvoperationList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfinvoperationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFMONTHCHG where ...)} <br>
     * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfmonthchgList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfmonthchgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfmonthchgList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfmonthchgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFPICKCTL where ...)} <br>
     * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfpickctlList()</span>.<span style="color: #CC4747">max</span>(mfpickctlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfpickctlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfpickctlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfpickctlCB> derivedMMfpickctlList() {
        return xcreateQDRFunctionMMfpickctlList();
    }
    protected HpQDRFunction<MMfpickctlCB> xcreateQDRFunctionMMfpickctlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfpickctlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfpickctlList(String fn, SubQuery<MMfpickctlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfpickctlList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfpickctlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfpickctlList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfpickctlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFRCVDESIGN where ...)} <br>
     * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfrcvdesignList()</span>.<span style="color: #CC4747">max</span>(mfrcvdesignCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvdesignCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfrcvdesignCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfrcvdesignCB> derivedMMfrcvdesignList() {
        return xcreateQDRFunctionMMfrcvdesignList();
    }
    protected HpQDRFunction<MMfrcvdesignCB> xcreateQDRFunctionMMfrcvdesignList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfrcvdesignList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfrcvdesignList(String fn, SubQuery<MMfrcvdesignCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvdesignCB cb = new MMfrcvdesignCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfrcvdesignList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfrcvdesignListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfrcvdesignList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfrcvdesignListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFRCVITEM where ...)} <br>
     * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMMfrcvitemList()</span>.<span style="color: #CC4747">max</span>(mfrcvitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mfrcvitemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mfrcvitemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MMfrcvitemCB> derivedMMfrcvitemList() {
        return xcreateQDRFunctionMMfrcvitemList();
    }
    protected HpQDRFunction<MMfrcvitemCB> xcreateQDRFunctionMMfrcvitemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMMfrcvitemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMMfrcvitemList(String fn, SubQuery<MMfrcvitemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfrcvitemList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfrcvitemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfrcvitemList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfrcvitemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_MFWHxITEM where ...)} <br>
     * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MMfwhxitemList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MMfwhxitemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mMfwhxitemList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PRODUCT where ...)} <br>
     * M_PRODUCT by CLIENT_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MProductCB> derivedMProductList() {
        return xcreateQDRFunctionMProductList();
    }
    protected HpQDRFunction<MProductCB> xcreateQDRFunctionMProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMProductList(String fn, SubQuery<MProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MProductList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mProductList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MProductList(MProductCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_SHAPE_GRP where ...)} <br>
     * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMShapeGrpList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MShapeGrpCB> derivedMShapeGrpList() {
        return xcreateQDRFunctionMShapeGrpList();
    }
    protected HpQDRFunction<MShapeGrpCB> xcreateQDRFunctionMShapeGrpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMShapeGrpList(fn, sq, rd, vl, op));
    }
    public void xqderiveMShapeGrpList(String fn, SubQuery<MShapeGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MShapeGrpList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mShapeGrpList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_USER_CLIENT where ...)} <br>
     * M_USER_CLIENT by CLIENT_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserClientList()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clientCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserClientCB> derivedMUserClientList() {
        return xcreateQDRFunctionMUserClientList();
    }
    protected HpQDRFunction<MUserClientCB> xcreateQDRFunctionMUserClientList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserClientList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserClientList(String fn, SubQuery<MUserClientCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MUserClientList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MUserClientListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mUserClientList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MUserClientListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_USER_LOGIN where ...)} <br>
     * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MUserLoginList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MUserLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mUserLoginList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MUserLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_WEB_HT_INFO where ...)} <br>
     * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_MWebHtInfoList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "mWebHtInfoList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TAllocInstHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tAllocInstHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CCOPAM where ...)} <br>
     * T_CCOPAM by CLIENT_ID, named 'TCcopamAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TCcopamList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TCcopamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tCcopamList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TCcopamListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TCenterSymbolList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TCenterSymbolListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tCenterSymbolList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CORDHDR where ...)} <br>
     * T_CORDHDR by CLIENT_ID, named 'TCordhdrAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TCordhdrList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TCordhdrListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tCordhdrList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TCordhdrListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_EC_ORDER_H where ...)} <br>
     * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TEcOrderHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tEcOrderHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_INVENTORY_H where ...)} <br>
     * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TInventoryHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TInventoryHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tInventoryHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TInventoryHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MFLASTSHIPLOT where ...)} <br>
     * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TMflastshiplotList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TMflastshiplotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tMflastshiplotList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TMflastshiplotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_MOVE_INST_H where ...)} <br>
     * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TMoveInstHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tMoveInstHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_H where ...)} <br>
     * T_PACKING_H by CLIENT_ID, named 'TPackingHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PALLET where ...)} <br>
     * T_PALLET by CLIENT_ID, named 'TPalletAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TPalletList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TPalletListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tPalletList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TPalletList(TPalletCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TPalletListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PICKING_H where ...)} <br>
     * T_PICKING_H by CLIENT_ID, named 'TPickingHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TPickingHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TPickingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tPickingHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TPickingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PIC_MTHD_RCMD where ...)} <br>
     * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tPicMthdRcmdList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RECEIVE_PLAN_H where ...)} <br>
     * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TReceivePlanHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tReceivePlanHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SERIAL_NO where ...)} <br>
     * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TSerialNoList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TSerialNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tSerialNoList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TSerialNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SPLINFO where ...)} <br>
     * T_SPLINFO by CLIENT_ID, named 'TSplinfoAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TSplinfoList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TSplinfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tSplinfoList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TSplinfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK where ...)} <br>
     * T_STOCK by CLIENT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockCB> derivedTStockList() {
        return xcreateQDRFunctionTStockList();
    }
    protected HpQDRFunction<TStockCB> xcreateQDRFunctionTStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockList(String fn, SubQuery<TStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STORE_RECORD_H where ...)} <br>
     * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TStoreRecordHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tStoreRecordHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRALLINV where ...)} <br>
     * T_TRALLINV by CLIENT_ID, named 'TTrallinvAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrallinvList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrallinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrallinvList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrallinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRALLINVHISTORY where ...)} <br>
     * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrallinvhistoryList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrallinvhistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrallinvhistoryList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASEINVENTORY where ...)} <br>
     * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrcaseinventoryList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrcaseinventoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrcaseinventoryList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASENUM where ...)} <br>
     * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrcasenumList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrcasenumListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrcasenumList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrcasenumListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRCASESTOCK where ...)} <br>
     * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrcasestockList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrcasestockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrcasestockList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrcasestockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRHANBAIINV where ...)} <br>
     * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrhanbaiinvList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrhanbaiinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrhanbaiinvList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVCHECKINFO where ...)} <br>
     * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrinvcheckinfoList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrinvcheckinfoList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVCORRECT where ...)} <br>
     * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrinvcorrectList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrinvcorrectListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrinvcorrectList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVREANSWER where ...)} <br>
     * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrinvreanswerList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrinvreanswerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrinvreanswerList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRINVREQUEST where ...)} <br>
     * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrinvrequestList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrinvrequestListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrinvrequestList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrinvrequestListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRITEMCONVRESULT where ...)} <br>
     * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTritemconvresultList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTritemconvresultListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTritemconvresultList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTritemconvresultListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRJUKYUINV where ...)} <br>
     * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrjukyuinvList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrjukyuinvListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrjukyuinvList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATE where ...)} <br>
     * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedateList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedateListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrmanufacturedateList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATEDETAIL where ...)} <br>
     * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrmanufacturedatedetailList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRMANUFACTUREDATEHISTORY where ...)} <br>
     * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrmanufacturedatehistoryList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRPALLETTRACE where ...)} <br>
     * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrpallettraceList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrpallettraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrpallettraceList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrpallettraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRREVERSESTOCK where ...)} <br>
     * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrreversestockList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrreversestockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrreversestockList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrreversestockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSTOCKDIFFHISTORY where ...)} <br>
     * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrstockdiffhistoryList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSYMBOLTRACE where ...)} <br>
     * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrsymboltraceList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrsymboltraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrsymboltraceList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRSYMBOLTRACEEXTEND where ...)} <br>
     * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrsymboltraceextendList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrsymboltraceextendList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRTRACE where ...)} <br>
     * T_TRTRACE by CLIENT_ID, named 'TTrtraceAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TTrtraceList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TTrtraceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tTrtraceList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TTrtraceListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_YTRSO where ...)} <br>
     * T_YTRSO by CLIENT_ID, named 'TYtrsoAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_TYtrsoList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_TYtrsoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "tYtrsoList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_TYtrsoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_INVENTORY_INPUT_PROD where ...)} <br>
     * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtLoadingList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtLoadingList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_INSPECTION where ...)} <br>
     * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_NO_PLAN_INSP where ...)} <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_RECEIVE_STORE where ...)} <br>
     * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_RECEIVE_INSP where ...)} <br>
     * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtSerialReceiveInspList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SERIAL_SHIPPING_INSP where ...)} <br>
     * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtSerialShippingInspList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING where ...)} <br>
     * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_SHIPPING_PICKING where ...)} <br>
     * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SGL_ROW_SHIP_INSP_H where ...)} <br>
     * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_SHIPPING_INTERRUPT where ...)} <br>
     * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepClientId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLIENT_ID", "CLIENT_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepClientId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
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
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
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
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterThan(String clientCd) {
        regClientCd(CK_GT, fRES(clientCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessThan(String clientCd) {
        regClientCd(CK_LT, fRES(clientCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterEqual(String clientCd) {
        regClientCd(CK_GE, fRES(clientCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessEqual(String clientCd) {
        regClientCd(CK_LE, fRES(clientCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
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
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
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
     * CLIENT_CD: {UQ, NotNull, varchar(30)} <br>
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
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientCd_NotLikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @param clientCd The value of clientCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_PrefixSearch(String clientCd) {
        setClientCd_LikeSearch(clientCd, xcLSOPPre());
    }

    protected void regClientCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCd(), "CLIENT_CD"); }
    protected abstract ConditionValue xgetCValueClientCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_Equal(String clientNm) {
        doSetClientNm_Equal(fRES(clientNm));
    }

    protected void doSetClientNm_Equal(String clientNm) {
        regClientNm(CK_EQ, clientNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_NotEqual(String clientNm) {
        doSetClientNm_NotEqual(fRES(clientNm));
    }

    protected void doSetClientNm_NotEqual(String clientNm) {
        regClientNm(CK_NES, clientNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_GreaterThan(String clientNm) {
        regClientNm(CK_GT, fRES(clientNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_LessThan(String clientNm) {
        regClientNm(CK_LT, fRES(clientNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_GreaterEqual(String clientNm) {
        regClientNm(CK_GE, fRES(clientNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_LessEqual(String clientNm) {
        regClientNm(CK_LE, fRES(clientNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNmList The collection of clientNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_InScope(Collection<String> clientNmList) {
        doSetClientNm_InScope(clientNmList);
    }

    protected void doSetClientNm_InScope(Collection<String> clientNmList) {
        regINS(CK_INS, cTL(clientNmList), xgetCValueClientNm(), "CLIENT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNmList The collection of clientNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_NotInScope(Collection<String> clientNmList) {
        doSetClientNm_NotInScope(clientNmList);
    }

    protected void doSetClientNm_NotInScope(Collection<String> clientNmList) {
        regINS(CK_NINS, cTL(clientNmList), xgetCValueClientNm(), "CLIENT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setClientNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientNm The value of clientNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientNm_LikeSearch(String clientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientNm), xgetCValueClientNm(), "CLIENT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientNm_NotLikeSearch(String clientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientNm), xgetCValueClientNm(), "CLIENT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @param clientNm The value of clientNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_PrefixSearch(String clientNm) {
        setClientNm_LikeSearch(clientNm, xcLSOPPre());
    }

    protected void regClientNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientNm(), "CLIENT_NM"); }
    protected abstract ConditionValue xgetCValueClientNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_Equal(String clientAbbr) {
        doSetClientAbbr_Equal(fRES(clientAbbr));
    }

    protected void doSetClientAbbr_Equal(String clientAbbr) {
        regClientAbbr(CK_EQ, clientAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_NotEqual(String clientAbbr) {
        doSetClientAbbr_NotEqual(fRES(clientAbbr));
    }

    protected void doSetClientAbbr_NotEqual(String clientAbbr) {
        regClientAbbr(CK_NES, clientAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_GreaterThan(String clientAbbr) {
        regClientAbbr(CK_GT, fRES(clientAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_LessThan(String clientAbbr) {
        regClientAbbr(CK_LT, fRES(clientAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_GreaterEqual(String clientAbbr) {
        regClientAbbr(CK_GE, fRES(clientAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_LessEqual(String clientAbbr) {
        regClientAbbr(CK_LE, fRES(clientAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbrList The collection of clientAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_InScope(Collection<String> clientAbbrList) {
        doSetClientAbbr_InScope(clientAbbrList);
    }

    protected void doSetClientAbbr_InScope(Collection<String> clientAbbrList) {
        regINS(CK_INS, cTL(clientAbbrList), xgetCValueClientAbbr(), "CLIENT_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbrList The collection of clientAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_NotInScope(Collection<String> clientAbbrList) {
        doSetClientAbbr_NotInScope(clientAbbrList);
    }

    protected void doSetClientAbbr_NotInScope(Collection<String> clientAbbrList) {
        regINS(CK_NINS, cTL(clientAbbrList), xgetCValueClientAbbr(), "CLIENT_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ABBR: {varchar(60)} <br>
     * <pre>e.g. setClientAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientAbbr The value of clientAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientAbbr_LikeSearch(String clientAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientAbbr), xgetCValueClientAbbr(), "CLIENT_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientAbbr_NotLikeSearch(String clientAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientAbbr), xgetCValueClientAbbr(), "CLIENT_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @param clientAbbr The value of clientAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientAbbr_PrefixSearch(String clientAbbr) {
        setClientAbbr_LikeSearch(clientAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     */
    public void setClientAbbr_IsNull() { regClientAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     */
    public void setClientAbbr_IsNullOrEmpty() { regClientAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ABBR: {varchar(60)}
     */
    public void setClientAbbr_IsNotNull() { regClientAbbr(CK_ISNN, DOBJ); }

    protected void regClientAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientAbbr(), "CLIENT_ABBR"); }
    protected abstract ConditionValue xgetCValueClientAbbr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_Equal(Long shapeGrpId) {
        doSetShapeGrpId_Equal(shapeGrpId);
    }

    protected void doSetShapeGrpId_Equal(Long shapeGrpId) {
        regShapeGrpId(CK_EQ, shapeGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotEqual(Long shapeGrpId) {
        doSetShapeGrpId_NotEqual(shapeGrpId);
    }

    protected void doSetShapeGrpId_NotEqual(Long shapeGrpId) {
        regShapeGrpId(CK_NES, shapeGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterThan(Long shapeGrpId) {
        regShapeGrpId(CK_GT, shapeGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessThan(Long shapeGrpId) {
        regShapeGrpId(CK_LT, shapeGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterEqual(Long shapeGrpId) {
        regShapeGrpId(CK_GE, shapeGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessEqual(Long shapeGrpId) {
        regShapeGrpId(CK_LE, shapeGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param minNumber The min number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpId(), "SHAPE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpIdList The collection of shapeGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_InScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_INS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpIdList The collection of shapeGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_NotInScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_NINS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'in-scope'. (NotNull)
     */
    public void inScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_InScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", false);
    }
    public abstract String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_NotInScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", true);
    }
    public abstract String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     */
    public void setShapeGrpId_IsNull() { regShapeGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     */
    public void setShapeGrpId_IsNotNull() { regShapeGrpId(CK_ISNN, DOBJ); }

    protected void regShapeGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpId(), "SHAPE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpId();

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
    public HpSLCFunction<MClientCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MClientCB.class);
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
    public HpSLCFunction<MClientCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MClientCB.class);
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
    public HpSLCFunction<MClientCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MClientCB.class);
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
    public HpSLCFunction<MClientCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MClientCB.class);
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
    public HpSLCFunction<MClientCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MClientCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MClientCB&gt;() {
     *     public void query(MClientCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MClientCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MClientCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MClientCQ sq);

    protected MClientCB xcreateScalarConditionCB() {
        MClientCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MClientCB xcreateScalarConditionPartitionByCB() {
        MClientCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLIENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MClientCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MClientCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MClientCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLIENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MClientCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MClientCQ sq);

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
    protected MClientCB newMyCB() {
        return new MClientCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MClientCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

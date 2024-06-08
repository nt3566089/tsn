package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_SHAPE_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_GRP_ID
 *
 * [column]
 *     SHAPE_GRP_ID, CLIENT_ID, SHAPE_GRP_CD, SHAPE_GRP_NAME, DECIMAL_EXIST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, B_CLASS_DTL(ByDecimalExistFlg)
 *
 * [referrer table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP_DTL
 *
 * [foreign property]
 *     mClient, bClassDtlByDecimalExistFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mClientList, mProductList, mShapeGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMShapeGrp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MShapeGrp> _selectedList;
    protected BehaviorSelector _selector;
    protected MShapeGrpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMShapeGrp ready(List<MShapeGrp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MShapeGrpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MShapeGrpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MClient> _referrerMClientList;

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClient> loadMClientList(ConditionBeanSetupper<MClientCB> refCBLambda) {
        myBhv().loadMClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientList = refLs);
        return hd -> hd.handle(new LoaderOfMClient().ready(_referrerMClientList, _selector));
    }

    protected List<MProduct> _referrerMProductList;

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProduct> loadMProductList(ConditionBeanSetupper<MProductCB> refCBLambda) {
        myBhv().loadMProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductList = refLs);
        return hd -> hd.handle(new LoaderOfMProduct().ready(_referrerMProductList, _selector));
    }

    protected List<MShapeGrpDtl> _referrerMShapeGrpDtlList;

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShapeGrpDtl> loadMShapeGrpDtlList(ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        myBhv().loadMShapeGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMShapeGrpDtl().ready(_referrerMShapeGrpDtlList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDecimalExistFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDecimalExistFlg() {
        if (_foreignBClassDtlByDecimalExistFlgLoader == null)
        { _foreignBClassDtlByDecimalExistFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDecimalExistFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDecimalExistFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MShapeGrp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

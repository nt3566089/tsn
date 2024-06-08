package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_BOX_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     BOX_GRP_ID
 *
 * [column]
 *     BOX_GRP_ID, CENTER_ID, BOX_GRP_CD, BOX_GRP_NM, STANDARD_BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_BOX, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP_DTL, M_PARAM
 *
 * [foreign property]
 *     mCenter, mBox, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpDtlList, mParamList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMBoxGrp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MBoxGrp> _selectedList;
    protected BehaviorSelector _selector;
    protected MBoxGrpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMBoxGrp ready(List<MBoxGrp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MBoxGrpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MBoxGrpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MBoxGrpDtl> _referrerMBoxGrpDtlList;

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBoxGrp mBoxGrp : <span style="color: #553000">mBoxGrpList</span>) {
     *     ... = mBoxGrp.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxGrpId_InScope(pkList);
     * cb.query().addOrderBy_BoxGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBoxGrpDtl> loadMBoxGrpDtlList(ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        myBhv().loadMBoxGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMBoxGrpDtl().ready(_referrerMBoxGrpDtlList, _selector));
    }

    protected List<MParam> _referrerMParamList;

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">paramCB</span>.setupSelect...
     *         <span style="color: #553000">paramCB</span>.query().set...
     *         <span style="color: #553000">paramCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">paramLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    paramLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBoxGrp mBoxGrp : <span style="color: #553000">mBoxGrpList</span>) {
     *     ... = mBoxGrp.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingBoxGroupId_InScope(pkList);
     * cb.query().addOrderBy_PackingBoxGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMParam> loadMParamList(ConditionBeanSetupper<MParamCB> refCBLambda) {
        myBhv().loadMParamList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMParamList = refLs);
        return hd -> hd.handle(new LoaderOfMParam().ready(_referrerMParamList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
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
    public List<MBoxGrp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

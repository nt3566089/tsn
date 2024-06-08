package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CENTER_CLASS as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_ID
 *
 * [column]
 *     CENTER_CLASS_ID, CENTER_ID, CLASS_CD, CLASS_COMMENT, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(BySystemType)
 *
 * [referrer table]
 *     M_CENTER_CLASS_DTL, M_CENTER_CLASS_GRP
 *
 * [foreign property]
 *     mCenter, bClassDtlBySystemType
 *
 * [referrer property]
 *     mCenterClassDtlList, mCenterClassGrpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterClass {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterClass> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterClassBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterClass ready(List<MCenterClass> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterClassBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterClassBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCenterClassDtl> _referrerMCenterClassDtlList;

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by CENTER_CLASS_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterClassList</span>, <span style="color: #553000">classLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classLoader</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenterClass mCenterClass : <span style="color: #553000">mCenterClassList</span>) {
     *     ... = mCenterClass.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClassDtl> loadMCenterClassDtlList(ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        myBhv().loadMCenterClassDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClassDtl().ready(_referrerMCenterClassDtlList, _selector));
    }

    protected List<MCenterClassGrp> _referrerMCenterClassGrpList;

    /**
     * Load referrer of MCenterClassGrpList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP by CENTER_CLASS_ID, named 'MCenterClassGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterClassList</span>, <span style="color: #553000">classLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classLoader</span>.<span style="color: #CC4747">loadMCenterClassGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenterClass mCenterClass : <span style="color: #553000">mCenterClassList</span>) {
     *     ... = mCenterClass.<span style="color: #CC4747">getMCenterClassGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClassGrp> loadMCenterClassGrpList(ConditionBeanSetupper<MCenterClassGrpCB> refCBLambda) {
        myBhv().loadMCenterClassGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClassGrp().ready(_referrerMCenterClassGrpList, _selector));
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

    protected LoaderOfBClassDtl _foreignBClassDtlBySystemTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySystemType() {
        if (_foreignBClassDtlBySystemTypeLoader == null)
        { _foreignBClassDtlBySystemTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySystemType(_selectedList), _selector); }
        return _foreignBClassDtlBySystemTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterClass> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

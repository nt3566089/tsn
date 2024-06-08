package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CENTER_CLASS_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, CENTER_CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER_CLASS, B_DICT, V_DICT, M_CENTER_CLASS_DTL_SUB(AsOne)
 *
 * [referrer table]
 *     M_CENTER_CLASS_GRP_DTL, M_CENTER_CLASS_DTL_SUB
 *
 * [foreign property]
 *     mCenterClass, bDict, vDict, mCenterClassDtlSubAsOne
 *
 * [referrer property]
 *     mCenterClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterClassDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterClassDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterClassDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterClassDtl ready(List<MCenterClassDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterClassDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterClassDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCenterClassGrpDtl> _referrerMCenterClassGrpDtlList;

    /**
     * Load referrer of MCenterClassGrpDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_DTL_ID, named 'MCenterClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassDtlBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterClassDtlList</span>, <span style="color: #553000">dtlLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlLoader</span>.<span style="color: #CC4747">loadMCenterClassGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenterClassDtl mCenterClassDtl : <span style="color: #553000">mCenterClassDtlList</span>) {
     *     ... = mCenterClassDtl.<span style="color: #CC4747">getMCenterClassGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassDtlId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassDtlId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClassGrpDtl> loadMCenterClassGrpDtlList(ConditionBeanSetupper<MCenterClassGrpDtlCB> refCBLambda) {
        myBhv().loadMCenterClassGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClassGrpDtl().ready(_referrerMCenterClassGrpDtlList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenterClass _foreignMCenterClassLoader;
    public LoaderOfMCenterClass pulloutMCenterClass() {
        if (_foreignMCenterClassLoader == null)
        { _foreignMCenterClassLoader = new LoaderOfMCenterClass().ready(myBhv().pulloutMCenterClass(_selectedList), _selector); }
        return _foreignMCenterClassLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfMCenterClassDtlSub _foreignMCenterClassDtlSubAsOneLoader;
    public LoaderOfMCenterClassDtlSub pulloutMCenterClassDtlSubAsOne() {
        if (_foreignMCenterClassDtlSubAsOneLoader == null)
        { _foreignMCenterClassDtlSubAsOneLoader = new LoaderOfMCenterClassDtlSub().ready(myBhv().pulloutMCenterClassDtlSubAsOne(_selectedList), _selector); }
        return _foreignMCenterClassDtlSubAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterClassDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

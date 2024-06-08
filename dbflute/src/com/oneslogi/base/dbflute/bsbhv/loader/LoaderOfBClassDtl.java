package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_CLASS_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_DTL_ID
 *
 * [column]
 *     CLASS_DTL_ID, CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS, B_DICT, V_DICT, B_CLASS_DTL_SUB(AsOne)
 *
 * [referrer table]
 *     B_CLASS_GRP_DTL, B_CLASS_DTL_SUB
 *
 * [foreign property]
 *     bClass, bDict, vDict, bClassDtlSubAsOne
 *
 * [referrer property]
 *     bClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBClassDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BClassDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected BClassDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBClassDtl ready(List<BClassDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BClassDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BClassDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BClassGrpDtl> _referrerBClassGrpDtlList;

    /**
     * Load referrer of BClassGrpDtlList by the set-upper of referrer. <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bClassDtlList</span>, <span style="color: #553000">dtlLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlLoader</span>.<span style="color: #CC4747">loadBClassGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BClassDtl bClassDtl : <span style="color: #553000">bClassDtlList</span>) {
     *     ... = bClassDtl.<span style="color: #CC4747">getBClassGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassDtlId_InScope(pkList);
     * cb.query().addOrderBy_ClassDtlId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBClassGrpDtl> loadBClassGrpDtlList(ConditionBeanSetupper<BClassGrpDtlCB> refCBLambda) {
        myBhv().loadBClassGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBClassGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBClassGrpDtl().ready(_referrerBClassGrpDtlList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClass _foreignBClassLoader;
    public LoaderOfBClass pulloutBClass() {
        if (_foreignBClassLoader == null)
        { _foreignBClassLoader = new LoaderOfBClass().ready(myBhv().pulloutBClass(_selectedList), _selector); }
        return _foreignBClassLoader;
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

    protected LoaderOfBClassDtlSub _foreignBClassDtlSubAsOneLoader;
    public LoaderOfBClassDtlSub pulloutBClassDtlSubAsOne() {
        if (_foreignBClassDtlSubAsOneLoader == null)
        { _foreignBClassDtlSubAsOneLoader = new LoaderOfBClassDtlSub().ready(myBhv().pulloutBClassDtlSubAsOne(_selectedList), _selector); }
        return _foreignBClassDtlSubAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BClassDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

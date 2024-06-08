package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_CLASS_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_GRP_ID
 *
 * [column]
 *     CLASS_GRP_ID, CLASS_GRP_CD, CLASS_GRP_COMMENT, CLASS_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS
 *
 * [referrer table]
 *     B_CLASS_GRP_DTL
 *
 * [foreign property]
 *     bClass
 *
 * [referrer property]
 *     bClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBClassGrp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BClassGrp> _selectedList;
    protected BehaviorSelector _selector;
    protected BClassGrpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBClassGrp ready(List<BClassGrp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BClassGrpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BClassGrpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BClassGrpDtl> _referrerBClassGrpDtlList;

    /**
     * Load referrer of BClassGrpDtlList by the set-upper of referrer. <br>
     * B_CLASS_GRP_DTL by CLASS_GRP_ID, named 'BClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bClassGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bClassGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadBClassGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BClassGrp bClassGrp : <span style="color: #553000">bClassGrpList</span>) {
     *     ... = bClassGrp.<span style="color: #CC4747">getBClassGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassGrpId_InScope(pkList);
     * cb.query().addOrderBy_ClassGrpId_Asc();
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BClassGrp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

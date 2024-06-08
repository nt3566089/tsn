package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_CLASS as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_ID
 *
 * [column]
 *     CLASS_ID, CLASS_CD, CLASS_COMMENT, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(BySystemType)
 *
 * [referrer table]
 *     B_CLASS_DTL, B_CLASS_GRP
 *
 * [foreign property]
 *     bClassDtlBySystemType
 *
 * [referrer property]
 *     bClassDtlList, bClassGrpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBClass {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BClass> _selectedList;
    protected BehaviorSelector _selector;
    protected BClassBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBClass ready(List<BClass> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BClassBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BClassBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BClassDtl> _referrerBClassDtlList;

    /**
     * Load referrer of BClassDtlList by the set-upper of referrer. <br>
     * B_CLASS_DTL by CLASS_ID, named 'BClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bClassBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bClassList</span>, <span style="color: #553000">classLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classLoader</span>.<span style="color: #CC4747">loadBClassDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BClass bClass : <span style="color: #553000">bClassList</span>) {
     *     ... = bClass.<span style="color: #CC4747">getBClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassId_InScope(pkList);
     * cb.query().addOrderBy_ClassId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBClassDtl> loadBClassDtlList(ConditionBeanSetupper<BClassDtlCB> refCBLambda) {
        myBhv().loadBClassDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBClassDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBClassDtl().ready(_referrerBClassDtlList, _selector));
    }

    protected List<BClassGrp> _referrerBClassGrpList;

    /**
     * Load referrer of BClassGrpList by the set-upper of referrer. <br>
     * B_CLASS_GRP by CLASS_ID, named 'BClassGrpList'.
     * <pre>
     * <span style="color: #0000C0">bClassBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bClassList</span>, <span style="color: #553000">classLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classLoader</span>.<span style="color: #CC4747">loadBClassGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BClass bClass : <span style="color: #553000">bClassList</span>) {
     *     ... = bClass.<span style="color: #CC4747">getBClassGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassId_InScope(pkList);
     * cb.query().addOrderBy_ClassId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBClassGrp> loadBClassGrpList(ConditionBeanSetupper<BClassGrpCB> refCBLambda) {
        myBhv().loadBClassGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBClassGrpList = refLs);
        return hd -> hd.handle(new LoaderOfBClassGrp().ready(_referrerBClassGrpList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlBySystemTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySystemType() {
        if (_foreignBClassDtlBySystemTypeLoader == null)
        { _foreignBClassDtlBySystemTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySystemType(_selectedList), _selector); }
        return _foreignBClassDtlBySystemTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BClass> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

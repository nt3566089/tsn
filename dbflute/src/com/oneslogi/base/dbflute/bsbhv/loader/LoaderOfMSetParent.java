package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_SET_PARENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SET_PARENT_ID
 *
 * [column]
 *     SET_PARENT_ID, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SET_PARENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_SET_STRUCTURE
 *
 * [foreign property]
 *     mProduct, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mSetStructureList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMSetParent {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MSetParent> _selectedList;
    protected BehaviorSelector _selector;
    protected MSetParentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMSetParent ready(List<MSetParent> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MSetParentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MSetParentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MSetStructure> _referrerMSetStructureList;

    /**
     * Load referrer of MSetStructureList by the set-upper of referrer. <br>
     * M_SET_STRUCTURE by SET_PARENT_ID, named 'MSetStructureList'.
     * <pre>
     * <span style="color: #0000C0">mSetParentBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSetParentList</span>, <span style="color: #553000">parentLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">parentLoader</span>.<span style="color: #CC4747">loadMSetStructureList</span>(<span style="color: #553000">structureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">structureCB</span>.setupSelect...
     *         <span style="color: #553000">structureCB</span>.query().set...
     *         <span style="color: #553000">structureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">structureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    structureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSetParent mSetParent : <span style="color: #553000">mSetParentList</span>) {
     *     ... = mSetParent.<span style="color: #CC4747">getMSetStructureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSetParentId_InScope(pkList);
     * cb.query().addOrderBy_SetParentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMSetStructure> loadMSetStructureList(ConditionBeanSetupper<MSetStructureCB> refCBLambda) {
        myBhv().loadMSetStructureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMSetStructureList = refLs);
        return hd -> hd.handle(new LoaderOfMSetStructure().ready(_referrerMSetStructureList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
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
    public List<MSetParent> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

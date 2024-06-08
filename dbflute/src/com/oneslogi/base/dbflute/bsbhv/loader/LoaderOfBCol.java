package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_COL as TABLE. <br>
 * <pre>
 * [primary key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, ITEM_ID, COL_CD, DICT_ID, COL_ORDER, COL_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, COL_WIDTH, IN_COL_INDEX, IN_COL_DEFAULT_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_ITEM, V_DICT, V_HT_DICT, B_CLASS_DTL(ByColType), B_COL_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL_ROLE, M_CENTER_COL, M_CLIENT_COL, B_COL_VALID
 *
 * [foreign property]
 *     bDict, bItem, vDict, vHtDict, bClassDtlByColType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bColValidAsOne
 *
 * [referrer property]
 *     bColRoleList, mCenterColList, mClientColList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBCol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BCol> _selectedList;
    protected BehaviorSelector _selector;
    protected BColBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBCol ready(List<BCol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BColBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BColBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BColRole> _referrerBColRoleList;

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">colLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colLoader</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getBColRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBColRole> loadBColRoleList(ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        myBhv().loadBColRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBColRole().ready(_referrerBColRoleList, _selector));
    }

    protected List<MCenterCol> _referrerMCenterColList;

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">colLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colLoader</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCol> loadMCenterColList(ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        myBhv().loadMCenterColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterColList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCol().ready(_referrerMCenterColList, _selector));
    }

    protected List<MClientCol> _referrerMClientColList;

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">colLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colLoader</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCol> loadMClientColList(ConditionBeanSetupper<MClientColCB> refCBLambda) {
        myBhv().loadMClientColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientColList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCol().ready(_referrerMClientColList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfBItem _foreignBItemLoader;
    public LoaderOfBItem pulloutBItem() {
        if (_foreignBItemLoader == null)
        { _foreignBItemLoader = new LoaderOfBItem().ready(myBhv().pulloutBItem(_selectedList), _selector); }
        return _foreignBItemLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfVHtDict _foreignVHtDictLoader;
    public LoaderOfVHtDict pulloutVHtDict() {
        if (_foreignVHtDictLoader == null)
        { _foreignVHtDictLoader = new LoaderOfVHtDict().ready(myBhv().pulloutVHtDict(_selectedList), _selector); }
        return _foreignVHtDictLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByColTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByColType() {
        if (_foreignBClassDtlByColTypeLoader == null)
        { _foreignBClassDtlByColTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByColType(_selectedList), _selector); }
        return _foreignBClassDtlByColTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByVisibleLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByVisible() {
        if (_foreignBClassDtlByVisibleLoader == null)
        { _foreignBClassDtlByVisibleLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByVisible(_selectedList), _selector); }
        return _foreignBClassDtlByVisibleLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEditableLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEditable() {
        if (_foreignBClassDtlByEditableLoader == null)
        { _foreignBClassDtlByEditableLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEditable(_selectedList), _selector); }
        return _foreignBClassDtlByEditableLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTextAlignLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTextAlign() {
        if (_foreignBClassDtlByTextAlignLoader == null)
        { _foreignBClassDtlByTextAlignLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTextAlign(_selectedList), _selector); }
        return _foreignBClassDtlByTextAlignLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByNecessaryLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByNecessary() {
        if (_foreignBClassDtlByNecessaryLoader == null)
        { _foreignBClassDtlByNecessaryLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByNecessary(_selectedList), _selector); }
        return _foreignBClassDtlByNecessaryLoader;
    }

    protected LoaderOfBColValid _foreignBColValidAsOneLoader;
    public LoaderOfBColValid pulloutBColValidAsOne() {
        if (_foreignBColValidAsOneLoader == null)
        { _foreignBColValidAsOneLoader = new LoaderOfBColValid().ready(myBhv().pulloutBColValidAsOne(_selectedList), _selector); }
        return _foreignBColValidAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BCol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

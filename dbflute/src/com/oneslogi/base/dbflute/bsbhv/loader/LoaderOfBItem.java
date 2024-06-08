package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, SCREEN_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, DISPLAY_REQUIRED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_SCREEN, B_DICT, V_DICT, V_HT_DICT, B_CLASS_DTL(ByItemType), B_ITEM_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL, B_COL_EXT_BASE, B_COL_EXT_USER, B_ITEM_ROLE, M_CENTER_ITEM, M_CLIENT_ITEM, B_ITEM_VALID
 *
 * [foreign property]
 *     bScreen, bDict, vDict, vHtDict, bClassDtlByItemType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bClassDtlByDisplayRequired, bItemValidAsOne
 *
 * [referrer property]
 *     bColList, bColExtBaseList, bColExtUserList, bItemRoleList, mCenterItemList, mClientItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBItem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BItem> _selectedList;
    protected BehaviorSelector _selector;
    protected BItemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBItem ready(List<BItem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BItemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BItemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BCol> _referrerBColList;

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by ITEM_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBCol> loadBColList(ConditionBeanSetupper<BColCB> refCBLambda) {
        myBhv().loadBColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColList = refLs);
        return hd -> hd.handle(new LoaderOfBCol().ready(_referrerBColList, _selector));
    }

    protected List<BColExtBase> _referrerBColExtBaseList;

    /**
     * Load referrer of BColExtBaseList by the set-upper of referrer. <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadBColExtBaseList</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColExtBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBColExtBase> loadBColExtBaseList(ConditionBeanSetupper<BColExtBaseCB> refCBLambda) {
        myBhv().loadBColExtBaseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColExtBaseList = refLs);
        return hd -> hd.handle(new LoaderOfBColExtBase().ready(_referrerBColExtBaseList, _selector));
    }

    protected List<BColExtUser> _referrerBColExtUserList;

    /**
     * Load referrer of BColExtUserList by the set-upper of referrer. <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadBColExtUserList</span>(<span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">userCB</span>.setupSelect...
     *         <span style="color: #553000">userCB</span>.query().set...
     *         <span style="color: #553000">userCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">userLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    userLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBColExtUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBColExtUser> loadBColExtUserList(ConditionBeanSetupper<BColExtUserCB> refCBLambda) {
        myBhv().loadBColExtUserList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBColExtUserList = refLs);
        return hd -> hd.handle(new LoaderOfBColExtUser().ready(_referrerBColExtUserList, _selector));
    }

    protected List<BItemRole> _referrerBItemRoleList;

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getBItemRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBItemRole> loadBItemRoleList(ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        myBhv().loadBItemRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBItemRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBItemRole().ready(_referrerBItemRoleList, _selector));
    }

    protected List<MCenterItem> _referrerMCenterItemList;

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterItem> loadMCenterItemList(ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        myBhv().loadMCenterItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterItemList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterItem().ready(_referrerMCenterItemList, _selector));
    }

    protected List<MClientItem> _referrerMClientItemList;

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BItem bItem : <span style="color: #553000">bItemList</span>) {
     *     ... = bItem.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setItemId_InScope(pkList);
     * cb.query().addOrderBy_ItemId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientItem> loadMClientItemList(ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        myBhv().loadMClientItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientItemList = refLs);
        return hd -> hd.handle(new LoaderOfMClientItem().ready(_referrerMClientItemList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBScreen _foreignBScreenLoader;
    public LoaderOfBScreen pulloutBScreen() {
        if (_foreignBScreenLoader == null)
        { _foreignBScreenLoader = new LoaderOfBScreen().ready(myBhv().pulloutBScreen(_selectedList), _selector); }
        return _foreignBScreenLoader;
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

    protected LoaderOfVHtDict _foreignVHtDictLoader;
    public LoaderOfVHtDict pulloutVHtDict() {
        if (_foreignVHtDictLoader == null)
        { _foreignVHtDictLoader = new LoaderOfVHtDict().ready(myBhv().pulloutVHtDict(_selectedList), _selector); }
        return _foreignVHtDictLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByItemTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByItemType() {
        if (_foreignBClassDtlByItemTypeLoader == null)
        { _foreignBClassDtlByItemTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByItemType(_selectedList), _selector); }
        return _foreignBClassDtlByItemTypeLoader;
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

    protected LoaderOfBClassDtl _foreignBClassDtlByDisplayRequiredLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDisplayRequired() {
        if (_foreignBClassDtlByDisplayRequiredLoader == null)
        { _foreignBClassDtlByDisplayRequiredLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDisplayRequired(_selectedList), _selector); }
        return _foreignBClassDtlByDisplayRequiredLoader;
    }

    protected LoaderOfBItemValid _foreignBItemValidAsOneLoader;
    public LoaderOfBItemValid pulloutBItemValidAsOne() {
        if (_foreignBItemValidAsOneLoader == null)
        { _foreignBItemValidAsOneLoader = new LoaderOfBItemValid().ready(myBhv().pulloutBItemValidAsOne(_selectedList), _selector); }
        return _foreignBItemValidAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BItem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

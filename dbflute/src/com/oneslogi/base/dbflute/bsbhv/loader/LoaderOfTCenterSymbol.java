package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_CENTER_SYMBOL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_SYMBOL_ID
 *
 * [column]
 *     CENTER_SYMBOL_ID, CENTER_ID, CLIENT_ID, PALLET_ID, TRSYMBOL_ID, CHILD_CENTER_SYMBOL_ID, SORTSTOCK_NUMBER, QR_CODE, LOT_ID, CASE_MOVE_STS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, T_CENTER_SYMBOL, M_CLIENT, T_PALLET, T_TRSYMBOL
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     mCenter, tCenterSymbolSelf, mClient, tPallet, tTrsymbol
 *
 * [referrer property]
 *     tCenterSymbolSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTCenterSymbol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCenterSymbol> _selectedList;
    protected BehaviorSelector _selector;
    protected TCenterSymbolBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCenterSymbol ready(List<TCenterSymbol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCenterSymbolBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCenterSymbolBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TCenterSymbol> _referrerTCenterSymbolSelfList;

    /**
     * Load referrer of TCenterSymbolSelfList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tCenterSymbolList</span>, <span style="color: #553000">symbolLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolLoader</span>.<span style="color: #CC4747">loadTCenterSymbolSelfList</span>(<span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">symbolCB</span>.setupSelect...
     *         <span style="color: #553000">symbolCB</span>.query().set...
     *         <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">symbolLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    symbolLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TCenterSymbol tCenterSymbol : <span style="color: #553000">tCenterSymbolList</span>) {
     *     ... = tCenterSymbol.<span style="color: #CC4747">getTCenterSymbolSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setChildCenterSymbolId_InScope(pkList);
     * cb.query().addOrderBy_ChildCenterSymbolId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCenterSymbol> loadTCenterSymbolSelfList(ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        myBhv().loadTCenterSymbolSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCenterSymbolSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTCenterSymbol().ready(_referrerTCenterSymbolSelfList, _selector));
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

    protected LoaderOfTCenterSymbol _foreignTCenterSymbolSelfLoader;
    public LoaderOfTCenterSymbol pulloutTCenterSymbolSelf() {
        if (_foreignTCenterSymbolSelfLoader == null)
        { _foreignTCenterSymbolSelfLoader = new LoaderOfTCenterSymbol().ready(myBhv().pulloutTCenterSymbolSelf(_selectedList), _selector); }
        return _foreignTCenterSymbolSelfLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfTPallet _foreignTPalletLoader;
    public LoaderOfTPallet pulloutTPallet() {
        if (_foreignTPalletLoader == null)
        { _foreignTPalletLoader = new LoaderOfTPallet().ready(myBhv().pulloutTPallet(_selectedList), _selector); }
        return _foreignTPalletLoader;
    }

    protected LoaderOfTTrsymbol _foreignTTrsymbolLoader;
    public LoaderOfTTrsymbol pulloutTTrsymbol() {
        if (_foreignTTrsymbolLoader == null)
        { _foreignTTrsymbolLoader = new LoaderOfTTrsymbol().ready(myBhv().pulloutTTrsymbol(_selectedList), _selector); }
        return _foreignTTrsymbolLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCenterSymbol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

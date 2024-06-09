package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_PALLET as TABLE. <br>
 * <pre>
 * [primary key]
 *     PALLET_ID
 *
 * [column]
 *     PALLET_ID, CENTER_ID, CLIENT_ID, STOCK_ID, TRPALLET_ID, DUMMY_PALLET_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PALLET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, T_STOCK, T_TRPALLET
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     mCenter, mClient, tStock, tTrpallet
 *
 * [referrer property]
 *     tCenterSymbolList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPallet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPallet> _selectedList;
    protected BehaviorSelector _selector;
    protected TPalletBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPallet ready(List<TPallet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPalletBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPalletBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TCenterSymbol> _referrerTCenterSymbolList;

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by PALLET_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">tPalletBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPalletList</span>, <span style="color: #553000">palletLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">palletLoader</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">symbolCB</span>.setupSelect...
     *         <span style="color: #553000">symbolCB</span>.query().set...
     *         <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">symbolLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    symbolLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPallet tPallet : <span style="color: #553000">tPalletList</span>) {
     *     ... = tPallet.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPalletId_InScope(pkList);
     * cb.query().addOrderBy_PalletId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCenterSymbol> loadTCenterSymbolList(ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        myBhv().loadTCenterSymbolList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCenterSymbolList = refLs);
        return hd -> hd.handle(new LoaderOfTCenterSymbol().ready(_referrerTCenterSymbolList, _selector));
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

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    protected LoaderOfTTrpallet _foreignTTrpalletLoader;
    public LoaderOfTTrpallet pulloutTTrpallet() {
        if (_foreignTTrpalletLoader == null)
        { _foreignTTrpalletLoader = new LoaderOfTTrpallet().ready(myBhv().pulloutTTrpallet(_selectedList), _selector); }
        return _foreignTTrpalletLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPallet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

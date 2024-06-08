package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRPALLET as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRPALLET_ID
 *
 * [column]
 *     TRPALLET_ID, PALLET_NO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, MANUFACTURE_DATE, BATARTICLESIGN, STOCK_TYPE_CD, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_PALLET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tPalletList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrpallet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpallet> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpalletBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpallet ready(List<TTrpallet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpalletBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpalletBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPallet> _referrerTPalletList;

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by TRPALLET_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">tTrpalletBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrpalletList</span>, <span style="color: #553000">trpalletLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpalletLoader</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">palletCB</span>.setupSelect...
     *         <span style="color: #553000">palletCB</span>.query().set...
     *         <span style="color: #553000">palletCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">palletLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    palletLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrpallet tTrpallet : <span style="color: #553000">tTrpalletList</span>) {
     *     ... = tTrpallet.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrpalletId_InScope(pkList);
     * cb.query().addOrderBy_TrpalletId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPallet> loadTPalletList(ConditionBeanSetupper<TPalletCB> refCBLambda) {
        myBhv().loadTPalletList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPalletList = refLs);
        return hd -> hd.handle(new LoaderOfTPallet().ready(_referrerTPalletList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpallet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

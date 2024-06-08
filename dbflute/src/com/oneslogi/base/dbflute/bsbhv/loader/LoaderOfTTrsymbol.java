package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRSYMBOL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSYMBOL_ID
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, PRODUCT_CD, ITEMCD, PRODUCT_CD_CASE, PRODUCT_CD_IN, LOT3, DESIGNCD_IN, DESIGNCD_CASE, LOT4, LOT1, LOT2, SYMBOLLINENO, OWNERCD, STOCK_TYPE_CD, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, DAMAGEFLG, RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, RCVLINENO, SENDRCVKEY, MAKERCASENO, SYMBOLSTS, SYMBOLADDFLG, PRINTEDFLG, SYMBOLSNDDATE, SYMBOLPASTDATE, SYMBOLPALLETONDATE, RECEIVEDATE, PALLET_ID, BASE_PALLET_ID, PARENTPALLETUPDDATE, PRINTINGDATE, LOCATION_ID, RESTQTY, RECEIVEDQTY, DISTRIBUTIONCD, TRANSPORTCD, ORDERNO, RCV_PALLET_ID, SYMBOLFACTORYCD, SYMBOLITEMCD, SYMBOLSKU, SYMBOLRECEIVECD, SYMBOLPRODUCTMARK, SYMBOLORDERNO, SYMBOLPRINTERNO, SYMBOLMAKENO, SYMBOLLOT4, SYMBOLMAKETIME, SYMBOLCIRCULATIONID, SYMBOLRCVKEY, SYMBOLLOT3, QRData, TREXAMRESULT_ID, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, DATETIME, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, MIXEDFLG, SHIPPEDFLG, CASECREATETYPE, CREATEDATETIME, InitNum, ParentCaseCd, TR_PICKLIST_ID, PicklistGNo, RecombDatetime, ReprintedFlg, TraceSts, CLIENT_ID, BATJPRODUCTIONYM, COMETODATE, RCVPALLETNO, TAXPALLETNO, SHTYPECD, CENTER_ID, RESTCTN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tCenterSymbolList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrsymbol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsymbol> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsymbolBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsymbol ready(List<TTrsymbol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsymbolBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsymbolBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TCenterSymbol> _referrerTCenterSymbolList;

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrsymbolList</span>, <span style="color: #553000">trsymbolLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trsymbolLoader</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">symbolCB</span>.setupSelect...
     *         <span style="color: #553000">symbolCB</span>.query().set...
     *         <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">symbolLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    symbolLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrsymbol tTrsymbol : <span style="color: #553000">tTrsymbolList</span>) {
     *     ... = tTrsymbol.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsymbolId_InScope(pkList);
     * cb.query().addOrderBy_TrsymbolId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsymbol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of P_PRINT_REQUEST as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_CD, REPORT_NM, REPORT_LAYOUT_NM, PRINTER_GROUP_ID, PRINTER_GROUP_NM, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_STATUS, FIRST_PRINT_DT, LATEST_PRINT_DT, PRINTED_COUNT, PRINTED_FLG, QUEUE_ADD_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByPrintStatus), P_PRINT_REQUEST_DATA(AsOne)
 *
 * [referrer table]
 *     P_PRINT_QUEUE, P_PRINT_REQUEST_BINARY, P_PRINT_REQUEST_HIST, P_PRINT_REQUEST_DATA
 *
 * [foreign property]
 *     bClassDtlByPrintStatus, bClassDtlBySheetCollate, bClassDtlByPrintedFlg, bClassDtlByPrintDataType, pPrintRequestDataAsOne
 *
 * [referrer property]
 *     pPrintQueueList, pPrintRequestBinaryList, pPrintRequestHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrintRequest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintRequest> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintRequestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintRequest ready(List<PPrintRequest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintRequestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintRequestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PPrintQueue> _referrerPPrintQueueList;

    /**
     * Load referrer of PPrintQueueList by the set-upper of referrer. <br>
     * P_PRINT_QUEUE by PRINT_REQUEST_ID, named 'PPrintQueueList'.
     * <pre>
     * <span style="color: #0000C0">pPrintRequestBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrintRequestList</span>, <span style="color: #553000">requestLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">requestLoader</span>.<span style="color: #CC4747">loadPPrintQueueList</span>(<span style="color: #553000">queueCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">queueCB</span>.setupSelect...
     *         <span style="color: #553000">queueCB</span>.query().set...
     *         <span style="color: #553000">queueCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">queueLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    queueLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrintRequest pPrintRequest : <span style="color: #553000">pPrintRequestList</span>) {
     *     ... = pPrintRequest.<span style="color: #CC4747">getPPrintQueueList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrintRequestId_InScope(pkList);
     * cb.query().addOrderBy_PrintRequestId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPPrintQueue> loadPPrintQueueList(ConditionBeanSetupper<PPrintQueueCB> refCBLambda) {
        myBhv().loadPPrintQueueList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPPrintQueueList = refLs);
        return hd -> hd.handle(new LoaderOfPPrintQueue().ready(_referrerPPrintQueueList, _selector));
    }

    protected List<PPrintRequestBinary> _referrerPPrintRequestBinaryList;

    /**
     * Load referrer of PPrintRequestBinaryList by the set-upper of referrer. <br>
     * P_PRINT_REQUEST_BINARY by PRINT_REQUEST_ID, named 'PPrintRequestBinaryList'.
     * <pre>
     * <span style="color: #0000C0">pPrintRequestBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrintRequestList</span>, <span style="color: #553000">requestLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">requestLoader</span>.<span style="color: #CC4747">loadPPrintRequestBinaryList</span>(<span style="color: #553000">binaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">binaryCB</span>.setupSelect...
     *         <span style="color: #553000">binaryCB</span>.query().set...
     *         <span style="color: #553000">binaryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">binaryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    binaryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrintRequest pPrintRequest : <span style="color: #553000">pPrintRequestList</span>) {
     *     ... = pPrintRequest.<span style="color: #CC4747">getPPrintRequestBinaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrintRequestId_InScope(pkList);
     * cb.query().addOrderBy_PrintRequestId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPPrintRequestBinary> loadPPrintRequestBinaryList(ConditionBeanSetupper<PPrintRequestBinaryCB> refCBLambda) {
        myBhv().loadPPrintRequestBinaryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPPrintRequestBinaryList = refLs);
        return hd -> hd.handle(new LoaderOfPPrintRequestBinary().ready(_referrerPPrintRequestBinaryList, _selector));
    }

    protected List<PPrintRequestHist> _referrerPPrintRequestHistList;

    /**
     * Load referrer of PPrintRequestHistList by the set-upper of referrer. <br>
     * P_PRINT_REQUEST_HIST by PRINT_REQUEST_ID, named 'PPrintRequestHistList'.
     * <pre>
     * <span style="color: #0000C0">pPrintRequestBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">pPrintRequestList</span>, <span style="color: #553000">requestLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">requestLoader</span>.<span style="color: #CC4747">loadPPrintRequestHistList</span>(<span style="color: #553000">histCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">histCB</span>.setupSelect...
     *         <span style="color: #553000">histCB</span>.query().set...
     *         <span style="color: #553000">histCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">histLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    histLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (PPrintRequest pPrintRequest : <span style="color: #553000">pPrintRequestList</span>) {
     *     ... = pPrintRequest.<span style="color: #CC4747">getPPrintRequestHistList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrintRequestId_InScope(pkList);
     * cb.query().addOrderBy_PrintRequestId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPPrintRequestHist> loadPPrintRequestHistList(ConditionBeanSetupper<PPrintRequestHistCB> refCBLambda) {
        myBhv().loadPPrintRequestHistList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPPrintRequestHistList = refLs);
        return hd -> hd.handle(new LoaderOfPPrintRequestHist().ready(_referrerPPrintRequestHistList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByPrintStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintStatus() {
        if (_foreignBClassDtlByPrintStatusLoader == null)
        { _foreignBClassDtlByPrintStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintStatus(_selectedList), _selector); }
        return _foreignBClassDtlByPrintStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySheetCollateLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySheetCollate() {
        if (_foreignBClassDtlBySheetCollateLoader == null)
        { _foreignBClassDtlBySheetCollateLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySheetCollate(_selectedList), _selector); }
        return _foreignBClassDtlBySheetCollateLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPrintedFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintedFlg() {
        if (_foreignBClassDtlByPrintedFlgLoader == null)
        { _foreignBClassDtlByPrintedFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintedFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPrintedFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPrintDataTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintDataType() {
        if (_foreignBClassDtlByPrintDataTypeLoader == null)
        { _foreignBClassDtlByPrintDataTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintDataType(_selectedList), _selector); }
        return _foreignBClassDtlByPrintDataTypeLoader;
    }

    protected LoaderOfPPrintRequestData _foreignPPrintRequestDataAsOneLoader;
    public LoaderOfPPrintRequestData pulloutPPrintRequestDataAsOne() {
        if (_foreignPPrintRequestDataAsOneLoader == null)
        { _foreignPPrintRequestDataAsOneLoader = new LoaderOfPPrintRequestData().ready(myBhv().pulloutPPrintRequestDataAsOne(_selectedList), _selector); }
        return _foreignPPrintRequestDataAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrintRequest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_IMPORT_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPORT_TYPE_ID
 *
 * [column]
 *     IMPORT_TYPE_ID, CLIENT_ID, IMPORT_TYPE_CD, IMPORT_TYPE_NM, EDI_ID, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DUPLICATE_COLUMN_NM, RCV_ID_COLUMN_NM, ROW_NO_COLUMN_NM, GIFT_STATEMENT_TYPE, GIFT_STATEMENT_DETAIL, O_KEEPING_DAYS, STATEMENT_TITLE, STATEMENT_URL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_EDI, B_CLASS_DTL(ByGiftStatementType)
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B, T_EC_ORDER_H
 *
 * [foreign property]
 *     mClient, mEdi, bClassDtlByGiftStatementType, bClassDtlByLineFeedCd, bClassDtlByUploadTableNm
 *
 * [referrer property]
 *     mImportTypeBList, tEcOrderHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMImportType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MImportType> _selectedList;
    protected BehaviorSelector _selector;
    protected MImportTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMImportType ready(List<MImportType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MImportTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MImportTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MImportTypeB> _referrerMImportTypeBList;

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mImportTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MImportType mImportType : <span style="color: #553000">mImportTypeList</span>) {
     *     ... = mImportType.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportTypeB> loadMImportTypeBList(ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        myBhv().loadMImportTypeBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeBList = refLs);
        return hd -> hd.handle(new LoaderOfMImportTypeB().ready(_referrerMImportTypeBList, _selector));
    }

    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mImportTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MImportType mImportType : <span style="color: #553000">mImportTypeList</span>) {
     *     ... = mImportType.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderH> loadTEcOrderHList(ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        myBhv().loadTEcOrderHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderHList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderH().ready(_referrerTEcOrderHList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMEdi _foreignMEdiLoader;
    public LoaderOfMEdi pulloutMEdi() {
        if (_foreignMEdiLoader == null)
        { _foreignMEdiLoader = new LoaderOfMEdi().ready(myBhv().pulloutMEdi(_selectedList), _selector); }
        return _foreignMEdiLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByGiftStatementTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByGiftStatementType() {
        if (_foreignBClassDtlByGiftStatementTypeLoader == null)
        { _foreignBClassDtlByGiftStatementTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByGiftStatementType(_selectedList), _selector); }
        return _foreignBClassDtlByGiftStatementTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLineFeedCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLineFeedCd() {
        if (_foreignBClassDtlByLineFeedCdLoader == null)
        { _foreignBClassDtlByLineFeedCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLineFeedCd(_selectedList), _selector); }
        return _foreignBClassDtlByLineFeedCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUploadTableNmLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUploadTableNm() {
        if (_foreignBClassDtlByUploadTableNmLoader == null)
        { _foreignBClassDtlByUploadTableNmLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUploadTableNm(_selectedList), _selector); }
        return _foreignBClassDtlByUploadTableNmLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MImportType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

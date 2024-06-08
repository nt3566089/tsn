package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSREPLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSREPLAN_ID
 *
 * [column]
 *     TRSREPLAN_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, PARTFLG, ACTFLG, STS, PRIORITIES, COMPANYCD, RCVSCHDATE, RECEIVEDATE, LOGISTICSCD, WAREHOUSECD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, ACCEPTKEY, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, SYHN_KBN, CGGDID, CONFIRMED_FLG, SUFFER_USAGE_FLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSREPLAN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrsreplan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsreplan> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsreplanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsreplan ready(List<TTrsreplan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsreplanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsreplanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsreplan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSO as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOID
 *
 * [column]
 *     SOID, SOKEY, OWNERSONO, PREOWNERSONO, SOTYPE, PARTFLG, STS, COMPANYCD, ORDERKEY, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, CUSTOMER_CD, RMANO, ORDERDATE, SHIPSCHDATE, SHIPDATE, DELIVSCHDATE, DELIVDATE, CARRYSCHDATE, CARRYOUTDATE, TRANSPORTPRIORITY, SHIPTOCD, SHIPTOSUB, DELIVNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONENO, FAX1, EMAIL, REFNAME, AREACD, ALLOCGROUP, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARCD, CARRIERSEQ, ITEMCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PICKING_INST_ID, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOID
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
public class LoaderOfTTrso {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrso> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrso ready(List<TTrso> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrso> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRPALLETDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRPALLETDETAIL_ID
 *
 * [column]
 *     TRPALLETDETAIL_ID, CENTER_ID, CLIENT_ID, PALLET_DETAIL_KEY, INOUT_TYPE, TRPALLET_ID, BASE_PALLET_NO, DIV_PALLET_NO, WORK_TYPE, WORK_KEY, REGISTRATION_DATE, WORK_DATE, PRODUCT_ID, PRODUCT_CD, DESIGN_FLG, LIMIT_DATE, FIRM_CARRY_NO, BAT_ARTICLE_SIGN, MOVE_B_LLOCATION_ID, MOVE_B_LOCATION_CD, MOVE_A_LOCATION_ID, MOVE_A_LOCATION_CD, INST_NUM, REST_QTY_CASE, REST_QTY_BOWL, REST_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETDETAIL_ID
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
public class LoaderOfTTrpalletdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrpalletdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrpalletdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrpalletdetail ready(List<TTrpalletdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrpalletdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrpalletdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrpalletdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

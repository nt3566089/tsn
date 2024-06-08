package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_PRODUCT_SHAPE_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_SHAPE_INPUT_ID
 *
 * [column]
 *     PRODUCT_SHAPE_INPUT_ID, CLIENT_CD, PRODUCT_CD, SHAPE_CD, UNIT_NUM, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SHAPE_INPUT_ID
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
public class LoaderOfWProductShapeInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WProductShapeInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WProductShapeInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWProductShapeInput ready(List<WProductShapeInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WProductShapeInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WProductShapeInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WProductShapeInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

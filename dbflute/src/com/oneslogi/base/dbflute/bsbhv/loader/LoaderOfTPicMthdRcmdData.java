package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_PIC_MTHD_RCMD_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     PIC_MTHD_RCMD_DATA_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_DATA_ID, PICKING_H_ID, PIC_MTHD_RCMD_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_DATA_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PIC_MTHD_RCMD, T_PICKING_H
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPicMthdRcmd, tPickingH
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPicMthdRcmdData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPicMthdRcmdData> _selectedList;
    protected BehaviorSelector _selector;
    protected TPicMthdRcmdDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPicMthdRcmdData ready(List<TPicMthdRcmdData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPicMthdRcmdDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPicMthdRcmdDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTPicMthdRcmd _foreignTPicMthdRcmdLoader;
    public LoaderOfTPicMthdRcmd pulloutTPicMthdRcmd() {
        if (_foreignTPicMthdRcmdLoader == null)
        { _foreignTPicMthdRcmdLoader = new LoaderOfTPicMthdRcmd().ready(myBhv().pulloutTPicMthdRcmd(_selectedList), _selector); }
        return _foreignTPicMthdRcmdLoader;
    }

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPicMthdRcmdData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

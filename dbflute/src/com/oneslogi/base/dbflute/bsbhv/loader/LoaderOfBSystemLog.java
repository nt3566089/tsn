package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_SYSTEM_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     SYSTEM_LOG_ID
 *
 * [column]
 *     SYSTEM_LOG_ID, SYSTEM_LOG_PROCESS_ID, SYSTEM_LOG_TYPE, SYSTEM_LOG_STATUS, CLASS_CD, METHOD_CD, PROCESS_INFO, PROCESS_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SYSTEM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(BySystemLogType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlBySystemLogType, bClassDtlBySystemLogStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBSystemLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BSystemLog> _selectedList;
    protected BehaviorSelector _selector;
    protected BSystemLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBSystemLog ready(List<BSystemLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BSystemLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BSystemLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlBySystemLogTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySystemLogType() {
        if (_foreignBClassDtlBySystemLogTypeLoader == null)
        { _foreignBClassDtlBySystemLogTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySystemLogType(_selectedList), _selector); }
        return _foreignBClassDtlBySystemLogTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySystemLogStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySystemLogStatus() {
        if (_foreignBClassDtlBySystemLogStatusLoader == null)
        { _foreignBClassDtlBySystemLogStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySystemLogStatus(_selectedList), _selector); }
        return _foreignBClassDtlBySystemLogStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BSystemLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

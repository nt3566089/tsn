package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_LOG_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOG_DTL_ID
 *
 * [column]
 *     LOG_DTL_ID, LOG_ID, LOG_DTL_TYPE, LOG_DTL_STATUS, LOG_DTL_SECTION_ID, LOG_DTL_SECTION_NM, PROCESS_INFO, PROCESS_DT, MESSAGE_REPLACE_STRING1, MESSAGE_REPLACE_STRING2, MESSAGE_REPLACE_STRING3, MESSAGE_REPLACE_STRING4, MESSAGE_REPLACE_STRING5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_LOG, B_CLASS_DTL(ByLogDtlType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bLog, bClassDtlByLogDtlType, bClassDtlByLogDtlStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBLogDtl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BLogDtl> _selectedList;
    protected BehaviorSelector _selector;
    protected BLogDtlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBLogDtl ready(List<BLogDtl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BLogDtlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BLogDtlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBLog _foreignBLogLoader;
    public LoaderOfBLog pulloutBLog() {
        if (_foreignBLogLoader == null)
        { _foreignBLogLoader = new LoaderOfBLog().ready(myBhv().pulloutBLog(_selectedList), _selector); }
        return _foreignBLogLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLogDtlTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLogDtlType() {
        if (_foreignBClassDtlByLogDtlTypeLoader == null)
        { _foreignBClassDtlByLogDtlTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLogDtlType(_selectedList), _selector); }
        return _foreignBClassDtlByLogDtlTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLogDtlStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLogDtlStatus() {
        if (_foreignBClassDtlByLogDtlStatusLoader == null)
        { _foreignBClassDtlByLogDtlStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLogDtlStatus(_selectedList), _selector); }
        return _foreignBClassDtlByLogDtlStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BLogDtl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

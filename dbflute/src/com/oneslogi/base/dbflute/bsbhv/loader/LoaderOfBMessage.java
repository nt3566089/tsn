package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_MESSAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MESSAGE_ID
 *
 * [column]
 *     MESSAGE_ID, MESSAGE_CD, MESSAGE_NM, MESSAGE_ABBR, MESSAGE_TYPE, SYSTEM_TYPE, CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MESSAGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CULTURE, B_CLASS_DTL(ByMessageType), M_HT_MESSAGE(AsOne)
 *
 * [referrer table]
 *     M_HT_MESSAGE
 *
 * [foreign property]
 *     bCulture, bClassDtlByMessageType, bClassDtlBySystemType, mHtMessageAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBMessage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BMessage> _selectedList;
    protected BehaviorSelector _selector;
    protected BMessageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBMessage ready(List<BMessage> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BMessageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BMessageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMessageTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMessageType() {
        if (_foreignBClassDtlByMessageTypeLoader == null)
        { _foreignBClassDtlByMessageTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMessageType(_selectedList), _selector); }
        return _foreignBClassDtlByMessageTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySystemTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySystemType() {
        if (_foreignBClassDtlBySystemTypeLoader == null)
        { _foreignBClassDtlBySystemTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySystemType(_selectedList), _selector); }
        return _foreignBClassDtlBySystemTypeLoader;
    }

    protected LoaderOfMHtMessage _foreignMHtMessageAsOneLoader;
    public LoaderOfMHtMessage pulloutMHtMessageAsOne() {
        if (_foreignMHtMessageAsOneLoader == null)
        { _foreignMHtMessageAsOneLoader = new LoaderOfMHtMessage().ready(myBhv().pulloutMHtMessageAsOne(_selectedList), _selector); }
        return _foreignMHtMessageAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BMessage> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

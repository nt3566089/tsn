package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_NUMBERING_CENTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     NUMBERING_CENTER_ID
 *
 * [column]
 *     NUMBERING_CENTER_ID, CENTER_ID, BIZ_CD, BIZ_NM, LENGTH, FIXED_VALUE, FIXED_DT_FORMAT, PRESENT_NUMBER, INC_NUMBER, MIN_NUMBER, MAX_NUMBER, CHECK_DIGIT, CASH_COUNT, USER_EDITABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NUMBERING_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByUserEditable)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, bClassDtlByUserEditable, bClassDtlByCheckDigit
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMNumberingCenter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MNumberingCenter> _selectedList;
    protected BehaviorSelector _selector;
    protected MNumberingCenterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMNumberingCenter ready(List<MNumberingCenter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MNumberingCenterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MNumberingCenterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUserEditableLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUserEditable() {
        if (_foreignBClassDtlByUserEditableLoader == null)
        { _foreignBClassDtlByUserEditableLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUserEditable(_selectedList), _selector); }
        return _foreignBClassDtlByUserEditableLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCheckDigitLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCheckDigit() {
        if (_foreignBClassDtlByCheckDigitLoader == null)
        { _foreignBClassDtlByCheckDigitLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCheckDigit(_selectedList), _selector); }
        return _foreignBClassDtlByCheckDigitLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MNumberingCenter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

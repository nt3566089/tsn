package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_NUMBERING as TABLE. <br>
 * <pre>
 * [primary key]
 *     NUMBERING_ID
 *
 * [column]
 *     NUMBERING_ID, BIZ_CD, BIZ_NM, LENGTH, FIXED_VALUE, FIXED_DT_FORMAT, PRESENT_NUMBER, INC_NUMBER, MIN_NUMBER, MAX_NUMBER, CHECK_DIGIT, SYSTEM_TYPE, CASH_COUNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NUMBERING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByCheckDigit)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlByCheckDigit
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBNumbering {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BNumbering> _selectedList;
    protected BehaviorSelector _selector;
    protected BNumberingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBNumbering ready(List<BNumbering> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BNumberingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BNumberingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByCheckDigitLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCheckDigit() {
        if (_foreignBClassDtlByCheckDigitLoader == null)
        { _foreignBClassDtlByCheckDigitLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCheckDigit(_selectedList), _selector); }
        return _foreignBClassDtlByCheckDigitLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BNumbering> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

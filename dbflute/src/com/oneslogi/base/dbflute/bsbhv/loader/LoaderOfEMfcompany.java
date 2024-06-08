package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_MFCOMPANY as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFCOMPANY_ID
 *
 * [column]
 *     MFCOMPANY_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZORGNCD, ZZORGNID, ORGNMKJF, JTONFNF, ONFNHA, JTONFNH, ZZORGNAM, JTONANF, ONANHA, JTONANH, ANWHNM, IOORID, ORGPSNO, ADVCD, COUNC, ORGADR1, ORGTEL, ORTL2, ORGFAX, ZZHORGCD, ZZBASECD, CSADMAG, TAXOCD, UPTAXID, STATCID, STLNDID, ZZWHMGID, TSCPNM, DEPCD, CNLID, OTRNK, ORATTID1, ORATTID2, ORATTID3, ATTID1, ATTID2, ATTID3, ORATTID4, BSDID, RPBCD, FAUORGCD, AUORGCD, CSTCTCD, BIZARCD, FWCTCD, RDVDID, ZZABLYMD, BPTNID, SNKHG, TXCANSFG, CSNPT, TBSOCSTM, ODTSCD, LNARCD, SASASID, CMLRASID, CSOID, UPMN, CHNGYD, UPDTM, UPDIS, UPBMN, BCHNGYD, BUPDTM, UPOBMN, OBCHNGYD, OBUPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDUSRID, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFCOMPANY_ID
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
public class LoaderOfEMfcompany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EMfcompany> _selectedList;
    protected BehaviorSelector _selector;
    protected EMfcompanyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEMfcompany ready(List<EMfcompany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EMfcompanyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EMfcompanyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EMfcompany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

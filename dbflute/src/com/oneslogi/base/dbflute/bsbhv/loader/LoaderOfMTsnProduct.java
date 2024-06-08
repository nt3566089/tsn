package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_TSN_PRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TSN_PRODUCT_ID
 *
 * [column]
 *     TSN_PRODUCT_ID, IMPORT_FLG, ZZMATNR, BRFNFL, BRFNHF, BRANFL, BRANHF, SOBRFNFL, SOBRFNHF, BRKNAME, CGGDID, ZZDEVCID, USID, CGRID, CBCCCVCE, SFCBQA, CTNUM, CBNUM, PATCBQA, ZZSEFFID, ZZABLYMD, CRSPYMD, SEYMD, DPBNYD, SOBGNYMD, EXSLYMD, AUBRID, FWBRID, BRCRID, PABRCD, AUBRCD, ZZMATNRA, MRAUCD, ZZSOMIUM, ZZREGPRCA, TFPR, MGRTA, MGRTOK, TLNPRU, HANUMWT, CNSCVCT, CGTAXCCT, NTXQART, LTXQART, ADVTAXRT, CTYTAXRT, PRFPRT, NOTAX, BRKD, FMLYCD, PRGRCD, NCTNCLS, TARCLS, PDPKSPCD, FLTID, KSUBCDID, KSUBCD, CTBCDID, CTBCD, CBBCDID, CBBCD, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, CBSZL, CBSZW, CBSZH, CBCC, CBWT, BSCDT, BSCDK, BSCDC, BSCDQ, BSCDH, SPAGCDT, SPAGCDK, SPAGCDC, SPAGCDQ, SPAGCDH, RBSCD1, RBSCD2, RBSCD3, RBSCD4, RBSCD5, USSBCD1, USSBCD2, USSBCD3, USSBCD4, USSBCD5, SPLCPCD, MAKERCD, LAND1, CGCLSDID, GNLOTRNK, MROTRNK, COID, BRWKID, SHUNID, DSTKBN, REOMATNR, DSPECKB, SGMID, MAKILENG, MAKIDIA, GDMSRP, GDSLU, GDPRU, EXIMA, EXIMB, EXIMC, EXIMD, EXIME, EXIMF, EXIMG, EXIMH, EXIMI, EXIMJ, EXIMK, EXIML, EXIMM, EXIMN, EXIMO, EXIMP, UPMN, CHNGYD, UPDTM, UPDIS, UPBMN, BCHNGYD, BUPDTM, UPOBMN, OBCHNGYD, OBUPDTM, AUBRCHFG, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDUSRID, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TSN_PRODUCT_ID
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
public class LoaderOfMTsnProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MTsnProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MTsnProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMTsnProduct ready(List<MTsnProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MTsnProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MTsnProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MTsnProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

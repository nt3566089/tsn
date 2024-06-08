package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of E_TSN_PRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETsnProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETsnProductDbm _instance = new ETsnProductDbm();
    private ETsnProductDbm() {}
    public static ETsnProductDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getTsnProductId(), (et, vl) -> ((ETsnProduct)et).setTsnProductId(ctl(vl)), "tsnProductId");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getReceiveCd(), (et, vl) -> ((ETsnProduct)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getReceiveRowId(), (et, vl) -> ((ETsnProduct)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getImportFlg(), (et, vl) -> ((ETsnProduct)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getErrorFlg(), (et, vl) -> ((ETsnProduct)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getErrorMessageCd(), (et, vl) -> ((ETsnProduct)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzmatnr(), (et, vl) -> ((ETsnProduct)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrfnfl(), (et, vl) -> ((ETsnProduct)et).setBrfnfl((String)vl), "brfnfl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrfnhf(), (et, vl) -> ((ETsnProduct)et).setBrfnhf((String)vl), "brfnhf");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBranfl(), (et, vl) -> ((ETsnProduct)et).setBranfl((String)vl), "branfl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBranhf(), (et, vl) -> ((ETsnProduct)et).setBranhf((String)vl), "branhf");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSobrfnfl(), (et, vl) -> ((ETsnProduct)et).setSobrfnfl((String)vl), "sobrfnfl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSobrfnhf(), (et, vl) -> ((ETsnProduct)et).setSobrfnhf((String)vl), "sobrfnhf");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrkname(), (et, vl) -> ((ETsnProduct)et).setBrkname((String)vl), "brkname");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCggdid(), (et, vl) -> ((ETsnProduct)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzdevcid(), (et, vl) -> ((ETsnProduct)et).setZzdevcid((String)vl), "zzdevcid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUsid(), (et, vl) -> ((ETsnProduct)et).setUsid((String)vl), "usid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCgrid(), (et, vl) -> ((ETsnProduct)et).setCgrid((String)vl), "cgrid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbcccvce(), (et, vl) -> ((ETsnProduct)et).setCbcccvce((String)vl), "cbcccvce");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSfcbqa(), (et, vl) -> ((ETsnProduct)et).setSfcbqa((String)vl), "sfcbqa");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtnum(), (et, vl) -> ((ETsnProduct)et).setCtnum((String)vl), "ctnum");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbnum(), (et, vl) -> ((ETsnProduct)et).setCbnum((String)vl), "cbnum");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getPatcbqa(), (et, vl) -> ((ETsnProduct)et).setPatcbqa((String)vl), "patcbqa");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzseffid(), (et, vl) -> ((ETsnProduct)et).setZzseffid((String)vl), "zzseffid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzablymd(), (et, vl) -> ((ETsnProduct)et).setZzablymd((String)vl), "zzablymd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCrspymd(), (et, vl) -> ((ETsnProduct)et).setCrspymd((String)vl), "crspymd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSeymd(), (et, vl) -> ((ETsnProduct)et).setSeymd((String)vl), "seymd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getDpbnyd(), (et, vl) -> ((ETsnProduct)et).setDpbnyd((String)vl), "dpbnyd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSobgnymd(), (et, vl) -> ((ETsnProduct)et).setSobgnymd((String)vl), "sobgnymd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getExslymd(), (et, vl) -> ((ETsnProduct)et).setExslymd((String)vl), "exslymd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAubrid(), (et, vl) -> ((ETsnProduct)et).setAubrid((String)vl), "aubrid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getFwbrid(), (et, vl) -> ((ETsnProduct)et).setFwbrid((String)vl), "fwbrid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrcrid(), (et, vl) -> ((ETsnProduct)et).setBrcrid((String)vl), "brcrid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getPabrcd(), (et, vl) -> ((ETsnProduct)et).setPabrcd((String)vl), "pabrcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAubrcd(), (et, vl) -> ((ETsnProduct)et).setAubrcd((String)vl), "aubrcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzmatnra(), (et, vl) -> ((ETsnProduct)et).setZzmatnra((String)vl), "zzmatnra");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMraucd(), (et, vl) -> ((ETsnProduct)et).setMraucd((String)vl), "mraucd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzsomium(), (et, vl) -> ((ETsnProduct)et).setZzsomium((String)vl), "zzsomium");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzregprca(), (et, vl) -> ((ETsnProduct)et).setZzregprca((String)vl), "zzregprca");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getTfpr(), (et, vl) -> ((ETsnProduct)et).setTfpr((String)vl), "tfpr");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMgrta(), (et, vl) -> ((ETsnProduct)et).setMgrta((String)vl), "mgrta");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMgrtok(), (et, vl) -> ((ETsnProduct)et).setMgrtok((String)vl), "mgrtok");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getTlnpru(), (et, vl) -> ((ETsnProduct)et).setTlnpru((String)vl), "tlnpru");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getHanumwt(), (et, vl) -> ((ETsnProduct)et).setHanumwt((String)vl), "hanumwt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCnscvct(), (et, vl) -> ((ETsnProduct)et).setCnscvct((String)vl), "cnscvct");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCgtaxcct(), (et, vl) -> ((ETsnProduct)et).setCgtaxcct((String)vl), "cgtaxcct");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getNtxqart(), (et, vl) -> ((ETsnProduct)et).setNtxqart((String)vl), "ntxqart");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getLtxqart(), (et, vl) -> ((ETsnProduct)et).setLtxqart((String)vl), "ltxqart");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAdvtaxrt(), (et, vl) -> ((ETsnProduct)et).setAdvtaxrt((String)vl), "advtaxrt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtytaxrt(), (et, vl) -> ((ETsnProduct)et).setCtytaxrt((String)vl), "ctytaxrt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getPrfprt(), (et, vl) -> ((ETsnProduct)et).setPrfprt((String)vl), "prfprt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getNotax(), (et, vl) -> ((ETsnProduct)et).setNotax((String)vl), "notax");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrkd(), (et, vl) -> ((ETsnProduct)et).setBrkd((String)vl), "brkd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getFmlycd(), (et, vl) -> ((ETsnProduct)et).setFmlycd((String)vl), "fmlycd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getPrgrcd(), (et, vl) -> ((ETsnProduct)et).setPrgrcd((String)vl), "prgrcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getNctncls(), (et, vl) -> ((ETsnProduct)et).setNctncls((String)vl), "nctncls");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getTarcls(), (et, vl) -> ((ETsnProduct)et).setTarcls((String)vl), "tarcls");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getPdpkspcd(), (et, vl) -> ((ETsnProduct)et).setPdpkspcd((String)vl), "pdpkspcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getFltid(), (et, vl) -> ((ETsnProduct)et).setFltid((String)vl), "fltid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getKsubcdid(), (et, vl) -> ((ETsnProduct)et).setKsubcdid((String)vl), "ksubcdid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getKsubcd(), (et, vl) -> ((ETsnProduct)et).setKsubcd((String)vl), "ksubcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtbcdid(), (et, vl) -> ((ETsnProduct)et).setCtbcdid((String)vl), "ctbcdid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtbcd(), (et, vl) -> ((ETsnProduct)et).setCtbcd((String)vl), "ctbcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbbcdid(), (et, vl) -> ((ETsnProduct)et).setCbbcdid((String)vl), "cbbcdid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbbcd(), (et, vl) -> ((ETsnProduct)et).setCbbcd((String)vl), "cbbcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtfm(), (et, vl) -> ((ETsnProduct)et).setCtfm((String)vl), "ctfm");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtszl(), (et, vl) -> ((ETsnProduct)et).setCtszl((String)vl), "ctszl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtszw(), (et, vl) -> ((ETsnProduct)et).setCtszw((String)vl), "ctszw");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtszh(), (et, vl) -> ((ETsnProduct)et).setCtszh((String)vl), "ctszh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtcc(), (et, vl) -> ((ETsnProduct)et).setCtcc((String)vl), "ctcc");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCtweight(), (et, vl) -> ((ETsnProduct)et).setCtweight((String)vl), "ctweight");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbszl(), (et, vl) -> ((ETsnProduct)et).setCbszl((String)vl), "cbszl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbszw(), (et, vl) -> ((ETsnProduct)et).setCbszw((String)vl), "cbszw");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbszh(), (et, vl) -> ((ETsnProduct)et).setCbszh((String)vl), "cbszh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbcc(), (et, vl) -> ((ETsnProduct)et).setCbcc((String)vl), "cbcc");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCbwt(), (et, vl) -> ((ETsnProduct)et).setCbwt((String)vl), "cbwt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBscdt(), (et, vl) -> ((ETsnProduct)et).setBscdt((String)vl), "bscdt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBscdk(), (et, vl) -> ((ETsnProduct)et).setBscdk((String)vl), "bscdk");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBscdc(), (et, vl) -> ((ETsnProduct)et).setBscdc((String)vl), "bscdc");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBscdq(), (et, vl) -> ((ETsnProduct)et).setBscdq((String)vl), "bscdq");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBscdh(), (et, vl) -> ((ETsnProduct)et).setBscdh((String)vl), "bscdh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSpagcdt(), (et, vl) -> ((ETsnProduct)et).setSpagcdt((String)vl), "spagcdt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSpagcdk(), (et, vl) -> ((ETsnProduct)et).setSpagcdk((String)vl), "spagcdk");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSpagcdc(), (et, vl) -> ((ETsnProduct)et).setSpagcdc((String)vl), "spagcdc");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSpagcdq(), (et, vl) -> ((ETsnProduct)et).setSpagcdq((String)vl), "spagcdq");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSpagcdh(), (et, vl) -> ((ETsnProduct)et).setSpagcdh((String)vl), "spagcdh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRbscd1(), (et, vl) -> ((ETsnProduct)et).setRbscd1((String)vl), "rbscd1");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRbscd2(), (et, vl) -> ((ETsnProduct)et).setRbscd2((String)vl), "rbscd2");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRbscd3(), (et, vl) -> ((ETsnProduct)et).setRbscd3((String)vl), "rbscd3");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRbscd4(), (et, vl) -> ((ETsnProduct)et).setRbscd4((String)vl), "rbscd4");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRbscd5(), (et, vl) -> ((ETsnProduct)et).setRbscd5((String)vl), "rbscd5");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUssbcd1(), (et, vl) -> ((ETsnProduct)et).setUssbcd1((String)vl), "ussbcd1");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUssbcd2(), (et, vl) -> ((ETsnProduct)et).setUssbcd2((String)vl), "ussbcd2");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUssbcd3(), (et, vl) -> ((ETsnProduct)et).setUssbcd3((String)vl), "ussbcd3");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUssbcd4(), (et, vl) -> ((ETsnProduct)et).setUssbcd4((String)vl), "ussbcd4");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUssbcd5(), (et, vl) -> ((ETsnProduct)et).setUssbcd5((String)vl), "ussbcd5");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSplcpcd(), (et, vl) -> ((ETsnProduct)et).setSplcpcd((String)vl), "splcpcd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMakercd(), (et, vl) -> ((ETsnProduct)et).setMakercd((String)vl), "makercd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getLand1(), (et, vl) -> ((ETsnProduct)et).setLand1((String)vl), "land1");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCgclsdid(), (et, vl) -> ((ETsnProduct)et).setCgclsdid((String)vl), "cgclsdid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getGnlotrnk(), (et, vl) -> ((ETsnProduct)et).setGnlotrnk((String)vl), "gnlotrnk");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMrotrnk(), (et, vl) -> ((ETsnProduct)et).setMrotrnk((String)vl), "mrotrnk");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getCoid(), (et, vl) -> ((ETsnProduct)et).setCoid((String)vl), "coid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBrwkid(), (et, vl) -> ((ETsnProduct)et).setBrwkid((String)vl), "brwkid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getShunid(), (et, vl) -> ((ETsnProduct)et).setShunid((String)vl), "shunid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getDstkbn(), (et, vl) -> ((ETsnProduct)et).setDstkbn((String)vl), "dstkbn");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getReomatnr(), (et, vl) -> ((ETsnProduct)et).setReomatnr((String)vl), "reomatnr");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getDspeckb(), (et, vl) -> ((ETsnProduct)et).setDspeckb((String)vl), "dspeckb");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getSgmid(), (et, vl) -> ((ETsnProduct)et).setSgmid((String)vl), "sgmid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMakileng(), (et, vl) -> ((ETsnProduct)et).setMakileng((String)vl), "makileng");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getMakidia(), (et, vl) -> ((ETsnProduct)et).setMakidia((String)vl), "makidia");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getGdmsrp(), (et, vl) -> ((ETsnProduct)et).setGdmsrp((String)vl), "gdmsrp");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getGdslu(), (et, vl) -> ((ETsnProduct)et).setGdslu((String)vl), "gdslu");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getGdpru(), (et, vl) -> ((ETsnProduct)et).setGdpru((String)vl), "gdpru");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getExima(), (et, vl) -> ((ETsnProduct)et).setExima((String)vl), "exima");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximb(), (et, vl) -> ((ETsnProduct)et).setEximb((String)vl), "eximb");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximc(), (et, vl) -> ((ETsnProduct)et).setEximc((String)vl), "eximc");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximd(), (et, vl) -> ((ETsnProduct)et).setEximd((String)vl), "eximd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getExime(), (et, vl) -> ((ETsnProduct)et).setExime((String)vl), "exime");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximf(), (et, vl) -> ((ETsnProduct)et).setEximf((String)vl), "eximf");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximg(), (et, vl) -> ((ETsnProduct)et).setEximg((String)vl), "eximg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximh(), (et, vl) -> ((ETsnProduct)et).setEximh((String)vl), "eximh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximi(), (et, vl) -> ((ETsnProduct)et).setEximi((String)vl), "eximi");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximj(), (et, vl) -> ((ETsnProduct)et).setEximj((String)vl), "eximj");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximk(), (et, vl) -> ((ETsnProduct)et).setEximk((String)vl), "eximk");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximl(), (et, vl) -> ((ETsnProduct)et).setEximl((String)vl), "eximl");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximm(), (et, vl) -> ((ETsnProduct)et).setEximm((String)vl), "eximm");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximn(), (et, vl) -> ((ETsnProduct)et).setEximn((String)vl), "eximn");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximo(), (et, vl) -> ((ETsnProduct)et).setEximo((String)vl), "eximo");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getEximp(), (et, vl) -> ((ETsnProduct)et).setEximp((String)vl), "eximp");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpmn(), (et, vl) -> ((ETsnProduct)et).setUpmn((String)vl), "upmn");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getChngyd(), (et, vl) -> ((ETsnProduct)et).setChngyd((String)vl), "chngyd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdtm(), (et, vl) -> ((ETsnProduct)et).setUpdtm((String)vl), "updtm");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdis(), (et, vl) -> ((ETsnProduct)et).setUpdis((String)vl), "updis");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpbmn(), (et, vl) -> ((ETsnProduct)et).setUpbmn((String)vl), "upbmn");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBchngyd(), (et, vl) -> ((ETsnProduct)et).setBchngyd((String)vl), "bchngyd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getBupdtm(), (et, vl) -> ((ETsnProduct)et).setBupdtm((String)vl), "bupdtm");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpobmn(), (et, vl) -> ((ETsnProduct)et).setUpobmn((String)vl), "upobmn");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getObchngyd(), (et, vl) -> ((ETsnProduct)et).setObchngyd((String)vl), "obchngyd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getObupdtm(), (et, vl) -> ((ETsnProduct)et).setObupdtm((String)vl), "obupdtm");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAubrchfg(), (et, vl) -> ((ETsnProduct)et).setAubrchfg((String)vl), "aubrchfg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZzfrdateh(), (et, vl) -> ((ETsnProduct)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getZztodateh(), (et, vl) -> ((ETsnProduct)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getRcdupdps(), (et, vl) -> ((ETsnProduct)et).setRcdupdps((String)vl), "rcdupdps");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdusrid(), (et, vl) -> ((ETsnProduct)et).setUpdusrid((String)vl), "updusrid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdpocd(), (et, vl) -> ((ETsnProduct)et).setUpdpocd((String)vl), "updpocd");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getOtcmpfg(), (et, vl) -> ((ETsnProduct)et).setOtcmpfg((String)vl), "otcmpfg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getTmcmpfg(), (et, vl) -> ((ETsnProduct)et).setTmcmpfg((String)vl), "tmcmpfg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getStmid(), (et, vl) -> ((ETsnProduct)et).setStmid((String)vl), "stmid");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getDelFlg(), (et, vl) -> ((ETsnProduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getVersionNo(), (et, vl) -> ((ETsnProduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getControlNo(), (et, vl) -> ((ETsnProduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAddDt(), (et, vl) -> ((ETsnProduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAddUser(), (et, vl) -> ((ETsnProduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getAddProcess(), (et, vl) -> ((ETsnProduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdDt(), (et, vl) -> ((ETsnProduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdUser(), (et, vl) -> ((ETsnProduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETsnProduct)et).getUpdProcess(), (et, vl) -> ((ETsnProduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TSN_PRODUCT";
    protected final String _tableDispName = "E_TSN_PRODUCT";
    protected final String _tablePropertyName = "ETsnProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TSN_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTsnProductId = cci("TSN_PRODUCT_ID", "TSN_PRODUCT_ID", null, null, Long.class, "tsnProductId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrfnfl = cci("BRFNFL", "BRFNFL", null, null, String.class, "brfnfl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrfnhf = cci("BRFNHF", "BRFNHF", null, null, String.class, "brfnhf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBranfl = cci("BRANFL", "BRANFL", null, null, String.class, "branfl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBranhf = cci("BRANHF", "BRANHF", null, null, String.class, "branhf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSobrfnfl = cci("SOBRFNFL", "SOBRFNFL", null, null, String.class, "sobrfnfl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSobrfnhf = cci("SOBRFNHF", "SOBRFNHF", null, null, String.class, "sobrfnhf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrkname = cci("BRKNAME", "BRKNAME", null, null, String.class, "brkname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzdevcid = cci("ZZDEVCID", "ZZDEVCID", null, null, String.class, "zzdevcid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsid = cci("USID", "USID", null, null, String.class, "usid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCgrid = cci("CGRID", "CGRID", null, null, String.class, "cgrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbcccvce = cci("CBCCCVCE", "CBCCCVCE", null, null, String.class, "cbcccvce", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSfcbqa = cci("SFCBQA", "SFCBQA", null, null, String.class, "sfcbqa", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtnum = cci("CTNUM", "CTNUM", null, null, String.class, "ctnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbnum = cci("CBNUM", "CBNUM", null, null, String.class, "cbnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPatcbqa = cci("PATCBQA", "PATCBQA", null, null, String.class, "patcbqa", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzseffid = cci("ZZSEFFID", "ZZSEFFID", null, null, String.class, "zzseffid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzablymd = cci("ZZABLYMD", "ZZABLYMD", null, null, String.class, "zzablymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCrspymd = cci("CRSPYMD", "CRSPYMD", null, null, String.class, "crspymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeymd = cci("SEYMD", "SEYMD", null, null, String.class, "seymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpbnyd = cci("DPBNYD", "DPBNYD", null, null, String.class, "dpbnyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSobgnymd = cci("SOBGNYMD", "SOBGNYMD", null, null, String.class, "sobgnymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExslymd = cci("EXSLYMD", "EXSLYMD", null, null, String.class, "exslymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAubrid = cci("AUBRID", "AUBRID", null, null, String.class, "aubrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwbrid = cci("FWBRID", "FWBRID", null, null, String.class, "fwbrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrcrid = cci("BRCRID", "BRCRID", null, null, String.class, "brcrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPabrcd = cci("PABRCD", "PABRCD", null, null, String.class, "pabrcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAubrcd = cci("AUBRCD", "AUBRCD", null, null, String.class, "aubrcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnra = cci("ZZMATNRA", "ZZMATNRA", null, null, String.class, "zzmatnra", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMraucd = cci("MRAUCD", "MRAUCD", null, null, String.class, "mraucd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzsomium = cci("ZZSOMIUM", "ZZSOMIUM", null, null, String.class, "zzsomium", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzregprca = cci("ZZREGPRCA", "ZZREGPRCA", null, null, String.class, "zzregprca", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTfpr = cci("TFPR", "TFPR", null, null, String.class, "tfpr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMgrta = cci("MGRTA", "MGRTA", null, null, String.class, "mgrta", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMgrtok = cci("MGRTOK", "MGRTOK", null, null, String.class, "mgrtok", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTlnpru = cci("TLNPRU", "TLNPRU", null, null, String.class, "tlnpru", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHanumwt = cci("HANUMWT", "HANUMWT", null, null, String.class, "hanumwt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCnscvct = cci("CNSCVCT", "CNSCVCT", null, null, String.class, "cnscvct", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCgtaxcct = cci("CGTAXCCT", "CGTAXCCT", null, null, String.class, "cgtaxcct", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNtxqart = cci("NTXQART", "NTXQART", null, null, String.class, "ntxqart", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLtxqart = cci("LTXQART", "LTXQART", null, null, String.class, "ltxqart", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdvtaxrt = cci("ADVTAXRT", "ADVTAXRT", null, null, String.class, "advtaxrt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtytaxrt = cci("CTYTAXRT", "CTYTAXRT", null, null, String.class, "ctytaxrt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrfprt = cci("PRFPRT", "PRFPRT", null, null, String.class, "prfprt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotax = cci("NOTAX", "NOTAX", null, null, String.class, "notax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrkd = cci("BRKD", "BRKD", null, null, String.class, "brkd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFmlycd = cci("FMLYCD", "FMLYCD", null, null, String.class, "fmlycd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrgrcd = cci("PRGRCD", "PRGRCD", null, null, String.class, "prgrcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNctncls = cci("NCTNCLS", "NCTNCLS", null, null, String.class, "nctncls", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTarcls = cci("TARCLS", "TARCLS", null, null, String.class, "tarcls", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPdpkspcd = cci("PDPKSPCD", "PDPKSPCD", null, null, String.class, "pdpkspcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFltid = cci("FLTID", "FLTID", null, null, String.class, "fltid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKsubcdid = cci("KSUBCDID", "KSUBCDID", null, null, String.class, "ksubcdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKsubcd = cci("KSUBCD", "KSUBCD", null, null, String.class, "ksubcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtbcdid = cci("CTBCDID", "CTBCDID", null, null, String.class, "ctbcdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtbcd = cci("CTBCD", "CTBCD", null, null, String.class, "ctbcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbbcdid = cci("CBBCDID", "CBBCDID", null, null, String.class, "cbbcdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbbcd = cci("CBBCD", "CBBCD", null, null, String.class, "cbbcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtfm = cci("CTFM", "CTFM", null, null, String.class, "ctfm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszl = cci("CTSZL", "CTSZL", null, null, String.class, "ctszl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszw = cci("CTSZW", "CTSZW", null, null, String.class, "ctszw", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszh = cci("CTSZH", "CTSZH", null, null, String.class, "ctszh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtcc = cci("CTCC", "CTCC", null, null, String.class, "ctcc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtweight = cci("CTWEIGHT", "CTWEIGHT", null, null, String.class, "ctweight", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbszl = cci("CBSZL", "CBSZL", null, null, String.class, "cbszl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbszw = cci("CBSZW", "CBSZW", null, null, String.class, "cbszw", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbszh = cci("CBSZH", "CBSZH", null, null, String.class, "cbszh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbcc = cci("CBCC", "CBCC", null, null, String.class, "cbcc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbwt = cci("CBWT", "CBWT", null, null, String.class, "cbwt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBscdt = cci("BSCDT", "BSCDT", null, null, String.class, "bscdt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBscdk = cci("BSCDK", "BSCDK", null, null, String.class, "bscdk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBscdc = cci("BSCDC", "BSCDC", null, null, String.class, "bscdc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBscdq = cci("BSCDQ", "BSCDQ", null, null, String.class, "bscdq", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBscdh = cci("BSCDH", "BSCDH", null, null, String.class, "bscdh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpagcdt = cci("SPAGCDT", "SPAGCDT", null, null, String.class, "spagcdt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpagcdk = cci("SPAGCDK", "SPAGCDK", null, null, String.class, "spagcdk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpagcdc = cci("SPAGCDC", "SPAGCDC", null, null, String.class, "spagcdc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpagcdq = cci("SPAGCDQ", "SPAGCDQ", null, null, String.class, "spagcdq", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpagcdh = cci("SPAGCDH", "SPAGCDH", null, null, String.class, "spagcdh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRbscd1 = cci("RBSCD1", "RBSCD1", null, null, String.class, "rbscd1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRbscd2 = cci("RBSCD2", "RBSCD2", null, null, String.class, "rbscd2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRbscd3 = cci("RBSCD3", "RBSCD3", null, null, String.class, "rbscd3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRbscd4 = cci("RBSCD4", "RBSCD4", null, null, String.class, "rbscd4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRbscd5 = cci("RBSCD5", "RBSCD5", null, null, String.class, "rbscd5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUssbcd1 = cci("USSBCD1", "USSBCD1", null, null, String.class, "ussbcd1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUssbcd2 = cci("USSBCD2", "USSBCD2", null, null, String.class, "ussbcd2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUssbcd3 = cci("USSBCD3", "USSBCD3", null, null, String.class, "ussbcd3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUssbcd4 = cci("USSBCD4", "USSBCD4", null, null, String.class, "ussbcd4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUssbcd5 = cci("USSBCD5", "USSBCD5", null, null, String.class, "ussbcd5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplcpcd = cci("SPLCPCD", "SPLCPCD", null, null, String.class, "splcpcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercd = cci("MAKERCD", "MAKERCD", null, null, String.class, "makercd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLand1 = cci("LAND1", "LAND1", null, null, String.class, "land1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCgclsdid = cci("CGCLSDID", "CGCLSDID", null, null, String.class, "cgclsdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGnlotrnk = cci("GNLOTRNK", "GNLOTRNK", null, null, String.class, "gnlotrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMrotrnk = cci("MROTRNK", "MROTRNK", null, null, String.class, "mrotrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCoid = cci("COID", "COID", null, null, String.class, "coid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrwkid = cci("BRWKID", "BRWKID", null, null, String.class, "brwkid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShunid = cci("SHUNID", "SHUNID", null, null, String.class, "shunid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDstkbn = cci("DSTKBN", "DSTKBN", null, null, String.class, "dstkbn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReomatnr = cci("REOMATNR", "REOMATNR", null, null, String.class, "reomatnr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDspeckb = cci("DSPECKB", "DSPECKB", null, null, String.class, "dspeckb", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSgmid = cci("SGMID", "SGMID", null, null, String.class, "sgmid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakileng = cci("MAKILENG", "MAKILENG", null, null, String.class, "makileng", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakidia = cci("MAKIDIA", "MAKIDIA", null, null, String.class, "makidia", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGdmsrp = cci("GDMSRP", "GDMSRP", null, null, String.class, "gdmsrp", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGdslu = cci("GDSLU", "GDSLU", null, null, String.class, "gdslu", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGdpru = cci("GDPRU", "GDPRU", null, null, String.class, "gdpru", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExima = cci("EXIMA", "EXIMA", null, null, String.class, "exima", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximb = cci("EXIMB", "EXIMB", null, null, String.class, "eximb", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximc = cci("EXIMC", "EXIMC", null, null, String.class, "eximc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximd = cci("EXIMD", "EXIMD", null, null, String.class, "eximd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExime = cci("EXIME", "EXIME", null, null, String.class, "exime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximf = cci("EXIMF", "EXIMF", null, null, String.class, "eximf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximg = cci("EXIMG", "EXIMG", null, null, String.class, "eximg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximh = cci("EXIMH", "EXIMH", null, null, String.class, "eximh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximi = cci("EXIMI", "EXIMI", null, null, String.class, "eximi", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximj = cci("EXIMJ", "EXIMJ", null, null, String.class, "eximj", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximk = cci("EXIMK", "EXIMK", null, null, String.class, "eximk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximl = cci("EXIML", "EXIML", null, null, String.class, "eximl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximm = cci("EXIMM", "EXIMM", null, null, String.class, "eximm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximn = cci("EXIMN", "EXIMN", null, null, String.class, "eximn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximo = cci("EXIMO", "EXIMO", null, null, String.class, "eximo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEximp = cci("EXIMP", "EXIMP", null, null, String.class, "eximp", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpmn = cci("UPMN", "UPMN", null, null, String.class, "upmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChngyd = cci("CHNGYD", "CHNGYD", null, null, String.class, "chngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdtm = cci("UPDTM", "UPDTM", null, null, String.class, "updtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdis = cci("UPDIS", "UPDIS", null, null, String.class, "updis", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpbmn = cci("UPBMN", "UPBMN", null, null, String.class, "upbmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBchngyd = cci("BCHNGYD", "BCHNGYD", null, null, String.class, "bchngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBupdtm = cci("BUPDTM", "BUPDTM", null, null, String.class, "bupdtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpobmn = cci("UPOBMN", "UPOBMN", null, null, String.class, "upobmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObchngyd = cci("OBCHNGYD", "OBCHNGYD", null, null, String.class, "obchngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObupdtm = cci("OBUPDTM", "OBUPDTM", null, null, String.class, "obupdtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAubrchfg = cci("AUBRCHFG", "AUBRCHFG", null, null, String.class, "aubrchfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcdupdps = cci("RCDUPDPS", "RCDUPDPS", null, null, String.class, "rcdupdps", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdusrid = cci("UPDUSRID", "UPDUSRID", null, null, String.class, "updusrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdpocd = cci("UPDPOCD", "UPDPOCD", null, null, String.class, "updpocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtcmpfg = cci("OTCMPFG", "OTCMPFG", null, null, String.class, "otcmpfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTmcmpfg = cci("TMCMPFG", "TMCMPFG", null, null, String.class, "tmcmpfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStmid = cci("STMID", "STMID", null, null, String.class, "stmid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsnProductId() { return _columnTsnProductId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * ZZMATNR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * BRFNFL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrfnfl() { return _columnBrfnfl; }
    /**
     * BRFNHF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrfnhf() { return _columnBrfnhf; }
    /**
     * BRANFL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBranfl() { return _columnBranfl; }
    /**
     * BRANHF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBranhf() { return _columnBranhf; }
    /**
     * SOBRFNFL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSobrfnfl() { return _columnSobrfnfl; }
    /**
     * SOBRFNHF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSobrfnhf() { return _columnSobrfnhf; }
    /**
     * BRKNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrkname() { return _columnBrkname; }
    /**
     * CGGDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * ZZDEVCID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzdevcid() { return _columnZzdevcid; }
    /**
     * USID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsid() { return _columnUsid; }
    /**
     * CGRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCgrid() { return _columnCgrid; }
    /**
     * CBCCCVCE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbcccvce() { return _columnCbcccvce; }
    /**
     * SFCBQA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSfcbqa() { return _columnSfcbqa; }
    /**
     * CTNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtnum() { return _columnCtnum; }
    /**
     * CBNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbnum() { return _columnCbnum; }
    /**
     * PATCBQA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPatcbqa() { return _columnPatcbqa; }
    /**
     * ZZSEFFID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzseffid() { return _columnZzseffid; }
    /**
     * ZZABLYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzablymd() { return _columnZzablymd; }
    /**
     * CRSPYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCrspymd() { return _columnCrspymd; }
    /**
     * SEYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeymd() { return _columnSeymd; }
    /**
     * DPBNYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpbnyd() { return _columnDpbnyd; }
    /**
     * SOBGNYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSobgnymd() { return _columnSobgnymd; }
    /**
     * EXSLYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExslymd() { return _columnExslymd; }
    /**
     * AUBRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAubrid() { return _columnAubrid; }
    /**
     * FWBRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwbrid() { return _columnFwbrid; }
    /**
     * BRCRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrcrid() { return _columnBrcrid; }
    /**
     * PABRCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPabrcd() { return _columnPabrcd; }
    /**
     * AUBRCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAubrcd() { return _columnAubrcd; }
    /**
     * ZZMATNRA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnra() { return _columnZzmatnra; }
    /**
     * MRAUCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMraucd() { return _columnMraucd; }
    /**
     * ZZSOMIUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzsomium() { return _columnZzsomium; }
    /**
     * ZZREGPRCA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzregprca() { return _columnZzregprca; }
    /**
     * TFPR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTfpr() { return _columnTfpr; }
    /**
     * MGRTA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMgrta() { return _columnMgrta; }
    /**
     * MGRTOK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMgrtok() { return _columnMgrtok; }
    /**
     * TLNPRU: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTlnpru() { return _columnTlnpru; }
    /**
     * HANUMWT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHanumwt() { return _columnHanumwt; }
    /**
     * CNSCVCT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCnscvct() { return _columnCnscvct; }
    /**
     * CGTAXCCT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCgtaxcct() { return _columnCgtaxcct; }
    /**
     * NTXQART: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNtxqart() { return _columnNtxqart; }
    /**
     * LTXQART: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLtxqart() { return _columnLtxqart; }
    /**
     * ADVTAXRT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdvtaxrt() { return _columnAdvtaxrt; }
    /**
     * CTYTAXRT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtytaxrt() { return _columnCtytaxrt; }
    /**
     * PRFPRT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrfprt() { return _columnPrfprt; }
    /**
     * NOTAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotax() { return _columnNotax; }
    /**
     * BRKD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrkd() { return _columnBrkd; }
    /**
     * FMLYCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFmlycd() { return _columnFmlycd; }
    /**
     * PRGRCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrgrcd() { return _columnPrgrcd; }
    /**
     * NCTNCLS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNctncls() { return _columnNctncls; }
    /**
     * TARCLS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTarcls() { return _columnTarcls; }
    /**
     * PDPKSPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPdpkspcd() { return _columnPdpkspcd; }
    /**
     * FLTID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFltid() { return _columnFltid; }
    /**
     * KSUBCDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKsubcdid() { return _columnKsubcdid; }
    /**
     * KSUBCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKsubcd() { return _columnKsubcd; }
    /**
     * CTBCDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtbcdid() { return _columnCtbcdid; }
    /**
     * CTBCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtbcd() { return _columnCtbcd; }
    /**
     * CBBCDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbbcdid() { return _columnCbbcdid; }
    /**
     * CBBCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbbcd() { return _columnCbbcd; }
    /**
     * CTFM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtfm() { return _columnCtfm; }
    /**
     * CTSZL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszl() { return _columnCtszl; }
    /**
     * CTSZW: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszw() { return _columnCtszw; }
    /**
     * CTSZH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszh() { return _columnCtszh; }
    /**
     * CTCC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtcc() { return _columnCtcc; }
    /**
     * CTWEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtweight() { return _columnCtweight; }
    /**
     * CBSZL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbszl() { return _columnCbszl; }
    /**
     * CBSZW: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbszw() { return _columnCbszw; }
    /**
     * CBSZH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbszh() { return _columnCbszh; }
    /**
     * CBCC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbcc() { return _columnCbcc; }
    /**
     * CBWT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbwt() { return _columnCbwt; }
    /**
     * BSCDT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBscdt() { return _columnBscdt; }
    /**
     * BSCDK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBscdk() { return _columnBscdk; }
    /**
     * BSCDC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBscdc() { return _columnBscdc; }
    /**
     * BSCDQ: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBscdq() { return _columnBscdq; }
    /**
     * BSCDH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBscdh() { return _columnBscdh; }
    /**
     * SPAGCDT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpagcdt() { return _columnSpagcdt; }
    /**
     * SPAGCDK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpagcdk() { return _columnSpagcdk; }
    /**
     * SPAGCDC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpagcdc() { return _columnSpagcdc; }
    /**
     * SPAGCDQ: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpagcdq() { return _columnSpagcdq; }
    /**
     * SPAGCDH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpagcdh() { return _columnSpagcdh; }
    /**
     * RBSCD1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRbscd1() { return _columnRbscd1; }
    /**
     * RBSCD2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRbscd2() { return _columnRbscd2; }
    /**
     * RBSCD3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRbscd3() { return _columnRbscd3; }
    /**
     * RBSCD4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRbscd4() { return _columnRbscd4; }
    /**
     * RBSCD5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRbscd5() { return _columnRbscd5; }
    /**
     * USSBCD1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUssbcd1() { return _columnUssbcd1; }
    /**
     * USSBCD2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUssbcd2() { return _columnUssbcd2; }
    /**
     * USSBCD3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUssbcd3() { return _columnUssbcd3; }
    /**
     * USSBCD4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUssbcd4() { return _columnUssbcd4; }
    /**
     * USSBCD5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUssbcd5() { return _columnUssbcd5; }
    /**
     * SPLCPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplcpcd() { return _columnSplcpcd; }
    /**
     * MAKERCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercd() { return _columnMakercd; }
    /**
     * LAND1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLand1() { return _columnLand1; }
    /**
     * CGCLSDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCgclsdid() { return _columnCgclsdid; }
    /**
     * GNLOTRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGnlotrnk() { return _columnGnlotrnk; }
    /**
     * MROTRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMrotrnk() { return _columnMrotrnk; }
    /**
     * COID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCoid() { return _columnCoid; }
    /**
     * BRWKID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrwkid() { return _columnBrwkid; }
    /**
     * SHUNID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShunid() { return _columnShunid; }
    /**
     * DSTKBN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDstkbn() { return _columnDstkbn; }
    /**
     * REOMATNR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReomatnr() { return _columnReomatnr; }
    /**
     * DSPECKB: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDspeckb() { return _columnDspeckb; }
    /**
     * SGMID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSgmid() { return _columnSgmid; }
    /**
     * MAKILENG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakileng() { return _columnMakileng; }
    /**
     * MAKIDIA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakidia() { return _columnMakidia; }
    /**
     * GDMSRP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGdmsrp() { return _columnGdmsrp; }
    /**
     * GDSLU: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGdslu() { return _columnGdslu; }
    /**
     * GDPRU: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGdpru() { return _columnGdpru; }
    /**
     * EXIMA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExima() { return _columnExima; }
    /**
     * EXIMB: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximb() { return _columnEximb; }
    /**
     * EXIMC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximc() { return _columnEximc; }
    /**
     * EXIMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximd() { return _columnEximd; }
    /**
     * EXIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExime() { return _columnExime; }
    /**
     * EXIMF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximf() { return _columnEximf; }
    /**
     * EXIMG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximg() { return _columnEximg; }
    /**
     * EXIMH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximh() { return _columnEximh; }
    /**
     * EXIMI: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximi() { return _columnEximi; }
    /**
     * EXIMJ: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximj() { return _columnEximj; }
    /**
     * EXIMK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximk() { return _columnEximk; }
    /**
     * EXIML: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximl() { return _columnEximl; }
    /**
     * EXIMM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximm() { return _columnEximm; }
    /**
     * EXIMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximn() { return _columnEximn; }
    /**
     * EXIMO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximo() { return _columnEximo; }
    /**
     * EXIMP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEximp() { return _columnEximp; }
    /**
     * UPMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpmn() { return _columnUpmn; }
    /**
     * CHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChngyd() { return _columnChngyd; }
    /**
     * UPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdtm() { return _columnUpdtm; }
    /**
     * UPDIS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdis() { return _columnUpdis; }
    /**
     * UPBMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpbmn() { return _columnUpbmn; }
    /**
     * BCHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBchngyd() { return _columnBchngyd; }
    /**
     * BUPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBupdtm() { return _columnBupdtm; }
    /**
     * UPOBMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpobmn() { return _columnUpobmn; }
    /**
     * OBCHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObchngyd() { return _columnObchngyd; }
    /**
     * OBUPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObupdtm() { return _columnObupdtm; }
    /**
     * AUBRCHFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAubrchfg() { return _columnAubrchfg; }
    /**
     * ZZFRDATEH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * RCDUPDPS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcdupdps() { return _columnRcdupdps; }
    /**
     * UPDUSRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdusrid() { return _columnUpdusrid; }
    /**
     * UPDPOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdpocd() { return _columnUpdpocd; }
    /**
     * OTCMPFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtcmpfg() { return _columnOtcmpfg; }
    /**
     * TMCMPFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTmcmpfg() { return _columnTmcmpfg; }
    /**
     * STMID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStmid() { return _columnStmid; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTsnProductId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnZzmatnr());
        ls.add(columnBrfnfl());
        ls.add(columnBrfnhf());
        ls.add(columnBranfl());
        ls.add(columnBranhf());
        ls.add(columnSobrfnfl());
        ls.add(columnSobrfnhf());
        ls.add(columnBrkname());
        ls.add(columnCggdid());
        ls.add(columnZzdevcid());
        ls.add(columnUsid());
        ls.add(columnCgrid());
        ls.add(columnCbcccvce());
        ls.add(columnSfcbqa());
        ls.add(columnCtnum());
        ls.add(columnCbnum());
        ls.add(columnPatcbqa());
        ls.add(columnZzseffid());
        ls.add(columnZzablymd());
        ls.add(columnCrspymd());
        ls.add(columnSeymd());
        ls.add(columnDpbnyd());
        ls.add(columnSobgnymd());
        ls.add(columnExslymd());
        ls.add(columnAubrid());
        ls.add(columnFwbrid());
        ls.add(columnBrcrid());
        ls.add(columnPabrcd());
        ls.add(columnAubrcd());
        ls.add(columnZzmatnra());
        ls.add(columnMraucd());
        ls.add(columnZzsomium());
        ls.add(columnZzregprca());
        ls.add(columnTfpr());
        ls.add(columnMgrta());
        ls.add(columnMgrtok());
        ls.add(columnTlnpru());
        ls.add(columnHanumwt());
        ls.add(columnCnscvct());
        ls.add(columnCgtaxcct());
        ls.add(columnNtxqart());
        ls.add(columnLtxqart());
        ls.add(columnAdvtaxrt());
        ls.add(columnCtytaxrt());
        ls.add(columnPrfprt());
        ls.add(columnNotax());
        ls.add(columnBrkd());
        ls.add(columnFmlycd());
        ls.add(columnPrgrcd());
        ls.add(columnNctncls());
        ls.add(columnTarcls());
        ls.add(columnPdpkspcd());
        ls.add(columnFltid());
        ls.add(columnKsubcdid());
        ls.add(columnKsubcd());
        ls.add(columnCtbcdid());
        ls.add(columnCtbcd());
        ls.add(columnCbbcdid());
        ls.add(columnCbbcd());
        ls.add(columnCtfm());
        ls.add(columnCtszl());
        ls.add(columnCtszw());
        ls.add(columnCtszh());
        ls.add(columnCtcc());
        ls.add(columnCtweight());
        ls.add(columnCbszl());
        ls.add(columnCbszw());
        ls.add(columnCbszh());
        ls.add(columnCbcc());
        ls.add(columnCbwt());
        ls.add(columnBscdt());
        ls.add(columnBscdk());
        ls.add(columnBscdc());
        ls.add(columnBscdq());
        ls.add(columnBscdh());
        ls.add(columnSpagcdt());
        ls.add(columnSpagcdk());
        ls.add(columnSpagcdc());
        ls.add(columnSpagcdq());
        ls.add(columnSpagcdh());
        ls.add(columnRbscd1());
        ls.add(columnRbscd2());
        ls.add(columnRbscd3());
        ls.add(columnRbscd4());
        ls.add(columnRbscd5());
        ls.add(columnUssbcd1());
        ls.add(columnUssbcd2());
        ls.add(columnUssbcd3());
        ls.add(columnUssbcd4());
        ls.add(columnUssbcd5());
        ls.add(columnSplcpcd());
        ls.add(columnMakercd());
        ls.add(columnLand1());
        ls.add(columnCgclsdid());
        ls.add(columnGnlotrnk());
        ls.add(columnMrotrnk());
        ls.add(columnCoid());
        ls.add(columnBrwkid());
        ls.add(columnShunid());
        ls.add(columnDstkbn());
        ls.add(columnReomatnr());
        ls.add(columnDspeckb());
        ls.add(columnSgmid());
        ls.add(columnMakileng());
        ls.add(columnMakidia());
        ls.add(columnGdmsrp());
        ls.add(columnGdslu());
        ls.add(columnGdpru());
        ls.add(columnExima());
        ls.add(columnEximb());
        ls.add(columnEximc());
        ls.add(columnEximd());
        ls.add(columnExime());
        ls.add(columnEximf());
        ls.add(columnEximg());
        ls.add(columnEximh());
        ls.add(columnEximi());
        ls.add(columnEximj());
        ls.add(columnEximk());
        ls.add(columnEximl());
        ls.add(columnEximm());
        ls.add(columnEximn());
        ls.add(columnEximo());
        ls.add(columnEximp());
        ls.add(columnUpmn());
        ls.add(columnChngyd());
        ls.add(columnUpdtm());
        ls.add(columnUpdis());
        ls.add(columnUpbmn());
        ls.add(columnBchngyd());
        ls.add(columnBupdtm());
        ls.add(columnUpobmn());
        ls.add(columnObchngyd());
        ls.add(columnObupdtm());
        ls.add(columnAubrchfg());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnRcdupdps());
        ls.add(columnUpdusrid());
        ls.add(columnUpdpocd());
        ls.add(columnOtcmpfg());
        ls.add(columnTmcmpfg());
        ls.add(columnStmid());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTsnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETsnProduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETsnProductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETsnProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETsnProduct> getEntityType() { return ETsnProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETsnProduct newEntity() { return new ETsnProduct(); }
    public ETsnProduct newMyEntity() { return new ETsnProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETsnProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETsnProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_TSN_PRODUCT as TABLE. <br>
 * TSN銘柄マスタ
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tsnProductId = entity.getTsnProductId();
 * String importFlg = entity.getImportFlg();
 * String zzmatnr = entity.getZzmatnr();
 * String brfnfl = entity.getBrfnfl();
 * String brfnhf = entity.getBrfnhf();
 * String branfl = entity.getBranfl();
 * String branhf = entity.getBranhf();
 * String sobrfnfl = entity.getSobrfnfl();
 * String sobrfnhf = entity.getSobrfnhf();
 * String brkname = entity.getBrkname();
 * String cggdid = entity.getCggdid();
 * Long zzdevcid = entity.getZzdevcid();
 * String usid = entity.getUsid();
 * String cgrid = entity.getCgrid();
 * java.math.BigDecimal cbcccvce = entity.getCbcccvce();
 * java.math.BigDecimal sfcbqa = entity.getSfcbqa();
 * java.math.BigDecimal ctnum = entity.getCtnum();
 * java.math.BigDecimal cbnum = entity.getCbnum();
 * java.math.BigDecimal patcbqa = entity.getPatcbqa();
 * String zzseffid = entity.getZzseffid();
 * String zzablymd = entity.getZzablymd();
 * String crspymd = entity.getCrspymd();
 * String seymd = entity.getSeymd();
 * String dpbnyd = entity.getDpbnyd();
 * String sobgnymd = entity.getSobgnymd();
 * String exslymd = entity.getExslymd();
 * String aubrid = entity.getAubrid();
 * String fwbrid = entity.getFwbrid();
 * String brcrid = entity.getBrcrid();
 * String pabrcd = entity.getPabrcd();
 * String aubrcd = entity.getAubrcd();
 * String zzmatnra = entity.getZzmatnra();
 * String mraucd = entity.getMraucd();
 * Long zzsomium = entity.getZzsomium();
 * Long zzregprca = entity.getZzregprca();
 * Long tfpr = entity.getTfpr();
 * java.math.BigDecimal mgrta = entity.getMgrta();
 * java.math.BigDecimal mgrtok = entity.getMgrtok();
 * java.math.BigDecimal tlnpru = entity.getTlnpru();
 * java.math.BigDecimal hanumwt = entity.getHanumwt();
 * java.math.BigDecimal cnscvct = entity.getCnscvct();
 * java.math.BigDecimal cgtaxcct = entity.getCgtaxcct();
 * java.math.BigDecimal ntxqart = entity.getNtxqart();
 * java.math.BigDecimal ltxqart = entity.getLtxqart();
 * java.math.BigDecimal advtaxrt = entity.getAdvtaxrt();
 * java.math.BigDecimal ctytaxrt = entity.getCtytaxrt();
 * java.math.BigDecimal prfprt = entity.getPrfprt();
 * java.math.BigDecimal notax = entity.getNotax();
 * Long brkd = entity.getBrkd();
 * String fmlycd = entity.getFmlycd();
 * String prgrcd = entity.getPrgrcd();
 * java.math.BigDecimal nctncls = entity.getNctncls();
 * java.math.BigDecimal tarcls = entity.getTarcls();
 * String pdpkspcd = entity.getPdpkspcd();
 * String fltid = entity.getFltid();
 * String ksubcdid = entity.getKsubcdid();
 * String ksubcd = entity.getKsubcd();
 * String ctbcdid = entity.getCtbcdid();
 * String ctbcd = entity.getCtbcd();
 * String cbbcdid = entity.getCbbcdid();
 * String cbbcd = entity.getCbbcd();
 * String ctfm = entity.getCtfm();
 * Long ctszl = entity.getCtszl();
 * Long ctszw = entity.getCtszw();
 * Long ctszh = entity.getCtszh();
 * Long ctcc = entity.getCtcc();
 * java.math.BigDecimal ctweight = entity.getCtweight();
 * Long cbszl = entity.getCbszl();
 * Long cbszw = entity.getCbszw();
 * Long cbszh = entity.getCbszh();
 * Long cbcc = entity.getCbcc();
 * Long cbwt = entity.getCbwt();
 * String bscdt = entity.getBscdt();
 * String bscdk = entity.getBscdk();
 * String bscdc = entity.getBscdc();
 * String bscdq = entity.getBscdq();
 * String bscdh = entity.getBscdh();
 * String spagcdt = entity.getSpagcdt();
 * String spagcdk = entity.getSpagcdk();
 * String spagcdc = entity.getSpagcdc();
 * String spagcdq = entity.getSpagcdq();
 * String spagcdh = entity.getSpagcdh();
 * String rbscd1 = entity.getRbscd1();
 * String rbscd2 = entity.getRbscd2();
 * String rbscd3 = entity.getRbscd3();
 * String rbscd4 = entity.getRbscd4();
 * String rbscd5 = entity.getRbscd5();
 * String ussbcd1 = entity.getUssbcd1();
 * String ussbcd2 = entity.getUssbcd2();
 * String ussbcd3 = entity.getUssbcd3();
 * String ussbcd4 = entity.getUssbcd4();
 * String ussbcd5 = entity.getUssbcd5();
 * String splcpcd = entity.getSplcpcd();
 * String makercd = entity.getMakercd();
 * String land1 = entity.getLand1();
 * String cgclsdid = entity.getCgclsdid();
 * Long gnlotrnk = entity.getGnlotrnk();
 * Long mrotrnk = entity.getMrotrnk();
 * String coid = entity.getCoid();
 * String brwkid = entity.getBrwkid();
 * String shunid = entity.getShunid();
 * String dstkbn = entity.getDstkbn();
 * Long reomatnr = entity.getReomatnr();
 * String dspeckb = entity.getDspeckb();
 * String sgmid = entity.getSgmid();
 * String makileng = entity.getMakileng();
 * String makidia = entity.getMakidia();
 * Long gdmsrp = entity.getGdmsrp();
 * java.math.BigDecimal gdslu = entity.getGdslu();
 * java.math.BigDecimal gdpru = entity.getGdpru();
 * String exima = entity.getExima();
 * java.math.BigDecimal eximb = entity.getEximb();
 * java.math.BigDecimal eximc = entity.getEximc();
 * java.math.BigDecimal eximd = entity.getEximd();
 * String exime = entity.getExime();
 * String eximf = entity.getEximf();
 * String eximg = entity.getEximg();
 * String eximh = entity.getEximh();
 * String eximi = entity.getEximi();
 * String eximj = entity.getEximj();
 * String eximk = entity.getEximk();
 * String eximl = entity.getEximl();
 * String eximm = entity.getEximm();
 * String eximn = entity.getEximn();
 * String eximo = entity.getEximo();
 * String eximp = entity.getEximp();
 * Long upmn = entity.getUpmn();
 * String chngyd = entity.getChngyd();
 * String updtm = entity.getUpdtm();
 * Long updis = entity.getUpdis();
 * Long upbmn = entity.getUpbmn();
 * String bchngyd = entity.getBchngyd();
 * Long bupdtm = entity.getBupdtm();
 * Long upobmn = entity.getUpobmn();
 * String obchngyd = entity.getObchngyd();
 * Long obupdtm = entity.getObupdtm();
 * String aubrchfg = entity.getAubrchfg();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String rcdupdps = entity.getRcdupdps();
 * Long updusrid = entity.getUpdusrid();
 * String updpocd = entity.getUpdpocd();
 * java.math.BigDecimal otcmpfg = entity.getOtcmpfg();
 * java.math.BigDecimal tmcmpfg = entity.getTmcmpfg();
 * String stmid = entity.getStmid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTsnProductId(tsnProductId);
 * entity.setImportFlg(importFlg);
 * entity.setZzmatnr(zzmatnr);
 * entity.setBrfnfl(brfnfl);
 * entity.setBrfnhf(brfnhf);
 * entity.setBranfl(branfl);
 * entity.setBranhf(branhf);
 * entity.setSobrfnfl(sobrfnfl);
 * entity.setSobrfnhf(sobrfnhf);
 * entity.setBrkname(brkname);
 * entity.setCggdid(cggdid);
 * entity.setZzdevcid(zzdevcid);
 * entity.setUsid(usid);
 * entity.setCgrid(cgrid);
 * entity.setCbcccvce(cbcccvce);
 * entity.setSfcbqa(sfcbqa);
 * entity.setCtnum(ctnum);
 * entity.setCbnum(cbnum);
 * entity.setPatcbqa(patcbqa);
 * entity.setZzseffid(zzseffid);
 * entity.setZzablymd(zzablymd);
 * entity.setCrspymd(crspymd);
 * entity.setSeymd(seymd);
 * entity.setDpbnyd(dpbnyd);
 * entity.setSobgnymd(sobgnymd);
 * entity.setExslymd(exslymd);
 * entity.setAubrid(aubrid);
 * entity.setFwbrid(fwbrid);
 * entity.setBrcrid(brcrid);
 * entity.setPabrcd(pabrcd);
 * entity.setAubrcd(aubrcd);
 * entity.setZzmatnra(zzmatnra);
 * entity.setMraucd(mraucd);
 * entity.setZzsomium(zzsomium);
 * entity.setZzregprca(zzregprca);
 * entity.setTfpr(tfpr);
 * entity.setMgrta(mgrta);
 * entity.setMgrtok(mgrtok);
 * entity.setTlnpru(tlnpru);
 * entity.setHanumwt(hanumwt);
 * entity.setCnscvct(cnscvct);
 * entity.setCgtaxcct(cgtaxcct);
 * entity.setNtxqart(ntxqart);
 * entity.setLtxqart(ltxqart);
 * entity.setAdvtaxrt(advtaxrt);
 * entity.setCtytaxrt(ctytaxrt);
 * entity.setPrfprt(prfprt);
 * entity.setNotax(notax);
 * entity.setBrkd(brkd);
 * entity.setFmlycd(fmlycd);
 * entity.setPrgrcd(prgrcd);
 * entity.setNctncls(nctncls);
 * entity.setTarcls(tarcls);
 * entity.setPdpkspcd(pdpkspcd);
 * entity.setFltid(fltid);
 * entity.setKsubcdid(ksubcdid);
 * entity.setKsubcd(ksubcd);
 * entity.setCtbcdid(ctbcdid);
 * entity.setCtbcd(ctbcd);
 * entity.setCbbcdid(cbbcdid);
 * entity.setCbbcd(cbbcd);
 * entity.setCtfm(ctfm);
 * entity.setCtszl(ctszl);
 * entity.setCtszw(ctszw);
 * entity.setCtszh(ctszh);
 * entity.setCtcc(ctcc);
 * entity.setCtweight(ctweight);
 * entity.setCbszl(cbszl);
 * entity.setCbszw(cbszw);
 * entity.setCbszh(cbszh);
 * entity.setCbcc(cbcc);
 * entity.setCbwt(cbwt);
 * entity.setBscdt(bscdt);
 * entity.setBscdk(bscdk);
 * entity.setBscdc(bscdc);
 * entity.setBscdq(bscdq);
 * entity.setBscdh(bscdh);
 * entity.setSpagcdt(spagcdt);
 * entity.setSpagcdk(spagcdk);
 * entity.setSpagcdc(spagcdc);
 * entity.setSpagcdq(spagcdq);
 * entity.setSpagcdh(spagcdh);
 * entity.setRbscd1(rbscd1);
 * entity.setRbscd2(rbscd2);
 * entity.setRbscd3(rbscd3);
 * entity.setRbscd4(rbscd4);
 * entity.setRbscd5(rbscd5);
 * entity.setUssbcd1(ussbcd1);
 * entity.setUssbcd2(ussbcd2);
 * entity.setUssbcd3(ussbcd3);
 * entity.setUssbcd4(ussbcd4);
 * entity.setUssbcd5(ussbcd5);
 * entity.setSplcpcd(splcpcd);
 * entity.setMakercd(makercd);
 * entity.setLand1(land1);
 * entity.setCgclsdid(cgclsdid);
 * entity.setGnlotrnk(gnlotrnk);
 * entity.setMrotrnk(mrotrnk);
 * entity.setCoid(coid);
 * entity.setBrwkid(brwkid);
 * entity.setShunid(shunid);
 * entity.setDstkbn(dstkbn);
 * entity.setReomatnr(reomatnr);
 * entity.setDspeckb(dspeckb);
 * entity.setSgmid(sgmid);
 * entity.setMakileng(makileng);
 * entity.setMakidia(makidia);
 * entity.setGdmsrp(gdmsrp);
 * entity.setGdslu(gdslu);
 * entity.setGdpru(gdpru);
 * entity.setExima(exima);
 * entity.setEximb(eximb);
 * entity.setEximc(eximc);
 * entity.setEximd(eximd);
 * entity.setExime(exime);
 * entity.setEximf(eximf);
 * entity.setEximg(eximg);
 * entity.setEximh(eximh);
 * entity.setEximi(eximi);
 * entity.setEximj(eximj);
 * entity.setEximk(eximk);
 * entity.setEximl(eximl);
 * entity.setEximm(eximm);
 * entity.setEximn(eximn);
 * entity.setEximo(eximo);
 * entity.setEximp(eximp);
 * entity.setUpmn(upmn);
 * entity.setChngyd(chngyd);
 * entity.setUpdtm(updtm);
 * entity.setUpdis(updis);
 * entity.setUpbmn(upbmn);
 * entity.setBchngyd(bchngyd);
 * entity.setBupdtm(bupdtm);
 * entity.setUpobmn(upobmn);
 * entity.setObchngyd(obchngyd);
 * entity.setObupdtm(obupdtm);
 * entity.setAubrchfg(aubrchfg);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setRcdupdps(rcdupdps);
 * entity.setUpdusrid(updusrid);
 * entity.setUpdpocd(updpocd);
 * entity.setOtcmpfg(otcmpfg);
 * entity.setTmcmpfg(tmcmpfg);
 * entity.setStmid(stmid);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMTsnProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tsnProductId;

    /** IMPORT_FLG: {NotNull, char(1), default=[(0)]} */
    protected String _importFlg;

    /** ZZMATNR: {varchar(30)} */
    protected String _zzmatnr;

    /** BRFNFL: {varchar(255)} */
    protected String _brfnfl;

    /** BRFNHF: {varchar(60)} */
    protected String _brfnhf;

    /** BRANFL: {varchar(255)} */
    protected String _branfl;

    /** BRANHF: {varchar(60)} */
    protected String _branhf;

    /** SOBRFNFL: {varchar(255)} */
    protected String _sobrfnfl;

    /** SOBRFNHF: {varchar(60)} */
    protected String _sobrfnhf;

    /** BRKNAME: {varchar(255)} */
    protected String _brkname;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** ZZDEVCID: {bigint(19)} */
    protected Long _zzdevcid;

    /** USID: {varchar(30)} */
    protected String _usid;

    /** CGRID: {varchar(30)} */
    protected String _cgrid;

    /** CBCCCVCE: {decimal(16, 6)} */
    protected java.math.BigDecimal _cbcccvce;

    /** SFCBQA: {decimal(16, 6)} */
    protected java.math.BigDecimal _sfcbqa;

    /** CTNUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _ctnum;

    /** CBNUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _cbnum;

    /** PATCBQA: {decimal(16, 6)} */
    protected java.math.BigDecimal _patcbqa;

    /** ZZSEFFID: {varchar(30)} */
    protected String _zzseffid;

    /** ZZABLYMD: {varchar(8)} */
    protected String _zzablymd;

    /** CRSPYMD: {varchar(8)} */
    protected String _crspymd;

    /** SEYMD: {varchar(8)} */
    protected String _seymd;

    /** DPBNYD: {varchar(8)} */
    protected String _dpbnyd;

    /** SOBGNYMD: {varchar(8)} */
    protected String _sobgnymd;

    /** EXSLYMD: {varchar(8)} */
    protected String _exslymd;

    /** AUBRID: {varchar(30)} */
    protected String _aubrid;

    /** FWBRID: {varchar(30)} */
    protected String _fwbrid;

    /** BRCRID: {varchar(30)} */
    protected String _brcrid;

    /** PABRCD: {varchar(60)} */
    protected String _pabrcd;

    /** AUBRCD: {varchar(60)} */
    protected String _aubrcd;

    /** ZZMATNRA: {varchar(60)} */
    protected String _zzmatnra;

    /** MRAUCD: {varchar(60)} */
    protected String _mraucd;

    /** ZZSOMIUM: {bigint(19)} */
    protected Long _zzsomium;

    /** ZZREGPRCA: {bigint(19)} */
    protected Long _zzregprca;

    /** TFPR: {bigint(19)} */
    protected Long _tfpr;

    /** MGRTA: {decimal(16, 6)} */
    protected java.math.BigDecimal _mgrta;

    /** MGRTOK: {decimal(16, 6)} */
    protected java.math.BigDecimal _mgrtok;

    /** TLNPRU: {decimal(16, 6)} */
    protected java.math.BigDecimal _tlnpru;

    /** HANUMWT: {decimal(16, 6)} */
    protected java.math.BigDecimal _hanumwt;

    /** CNSCVCT: {decimal(16, 6)} */
    protected java.math.BigDecimal _cnscvct;

    /** CGTAXCCT: {decimal(16, 6)} */
    protected java.math.BigDecimal _cgtaxcct;

    /** NTXQART: {decimal(16, 6)} */
    protected java.math.BigDecimal _ntxqart;

    /** LTXQART: {decimal(16, 6)} */
    protected java.math.BigDecimal _ltxqart;

    /** ADVTAXRT: {decimal(16, 6)} */
    protected java.math.BigDecimal _advtaxrt;

    /** CTYTAXRT: {decimal(16, 6)} */
    protected java.math.BigDecimal _ctytaxrt;

    /** PRFPRT: {decimal(16, 6)} */
    protected java.math.BigDecimal _prfprt;

    /** NOTAX: {decimal(16, 6)} */
    protected java.math.BigDecimal _notax;

    /** BRKD: {bigint(19)} */
    protected Long _brkd;

    /** FMLYCD: {varchar(30)} */
    protected String _fmlycd;

    /** PRGRCD: {varchar(30)} */
    protected String _prgrcd;

    /** NCTNCLS: {decimal(16, 6)} */
    protected java.math.BigDecimal _nctncls;

    /** TARCLS: {decimal(16, 6)} */
    protected java.math.BigDecimal _tarcls;

    /** PDPKSPCD: {varchar(30)} */
    protected String _pdpkspcd;

    /** FLTID: {varchar(30)} */
    protected String _fltid;

    /** KSUBCDID: {varchar(30)} */
    protected String _ksubcdid;

    /** KSUBCD: {varchar(30)} */
    protected String _ksubcd;

    /** CTBCDID: {varchar(30)} */
    protected String _ctbcdid;

    /** CTBCD: {varchar(30)} */
    protected String _ctbcd;

    /** CBBCDID: {varchar(30)} */
    protected String _cbbcdid;

    /** CBBCD: {varchar(30)} */
    protected String _cbbcd;

    /** CTFM: {varchar(30)} */
    protected String _ctfm;

    /** CTSZL: {bigint(19)} */
    protected Long _ctszl;

    /** CTSZW: {bigint(19)} */
    protected Long _ctszw;

    /** CTSZH: {bigint(19)} */
    protected Long _ctszh;

    /** CTCC: {bigint(19)} */
    protected Long _ctcc;

    /** CTWEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _ctweight;

    /** CBSZL: {bigint(19)} */
    protected Long _cbszl;

    /** CBSZW: {bigint(19)} */
    protected Long _cbszw;

    /** CBSZH: {bigint(19)} */
    protected Long _cbszh;

    /** CBCC: {bigint(19)} */
    protected Long _cbcc;

    /** CBWT: {bigint(19)} */
    protected Long _cbwt;

    /** BSCDT: {varchar(30)} */
    protected String _bscdt;

    /** BSCDK: {varchar(30)} */
    protected String _bscdk;

    /** BSCDC: {varchar(30)} */
    protected String _bscdc;

    /** BSCDQ: {varchar(30)} */
    protected String _bscdq;

    /** BSCDH: {varchar(30)} */
    protected String _bscdh;

    /** SPAGCDT: {varchar(30)} */
    protected String _spagcdt;

    /** SPAGCDK: {varchar(30)} */
    protected String _spagcdk;

    /** SPAGCDC: {varchar(30)} */
    protected String _spagcdc;

    /** SPAGCDQ: {varchar(30)} */
    protected String _spagcdq;

    /** SPAGCDH: {varchar(30)} */
    protected String _spagcdh;

    /** RBSCD1: {varchar(30)} */
    protected String _rbscd1;

    /** RBSCD2: {varchar(30)} */
    protected String _rbscd2;

    /** RBSCD3: {varchar(30)} */
    protected String _rbscd3;

    /** RBSCD4: {varchar(30)} */
    protected String _rbscd4;

    /** RBSCD5: {varchar(30)} */
    protected String _rbscd5;

    /** USSBCD1: {varchar(30)} */
    protected String _ussbcd1;

    /** USSBCD2: {varchar(30)} */
    protected String _ussbcd2;

    /** USSBCD3: {varchar(30)} */
    protected String _ussbcd3;

    /** USSBCD4: {varchar(30)} */
    protected String _ussbcd4;

    /** USSBCD5: {varchar(30)} */
    protected String _ussbcd5;

    /** SPLCPCD: {varchar(30)} */
    protected String _splcpcd;

    /** MAKERCD: {varchar(60)} */
    protected String _makercd;

    /** LAND1: {varchar(60)} */
    protected String _land1;

    /** CGCLSDID: {varchar(30)} */
    protected String _cgclsdid;

    /** GNLOTRNK: {bigint(19)} */
    protected Long _gnlotrnk;

    /** MROTRNK: {bigint(19)} */
    protected Long _mrotrnk;

    /** COID: {varchar(30)} */
    protected String _coid;

    /** BRWKID: {varchar(30)} */
    protected String _brwkid;

    /** SHUNID: {varchar(30)} */
    protected String _shunid;

    /** DSTKBN: {varchar(30)} */
    protected String _dstkbn;

    /** REOMATNR: {bigint(19)} */
    protected Long _reomatnr;

    /** DSPECKB: {varchar(30)} */
    protected String _dspeckb;

    /** SGMID: {varchar(30)} */
    protected String _sgmid;

    /** MAKILENG: {varchar(60)} */
    protected String _makileng;

    /** MAKIDIA: {varchar(60)} */
    protected String _makidia;

    /** GDMSRP: {bigint(19)} */
    protected Long _gdmsrp;

    /** GDSLU: {decimal(16, 6)} */
    protected java.math.BigDecimal _gdslu;

    /** GDPRU: {decimal(16, 6)} */
    protected java.math.BigDecimal _gdpru;

    /** EXIMA: {varchar(30)} */
    protected String _exima;

    /** EXIMB: {decimal(16, 6)} */
    protected java.math.BigDecimal _eximb;

    /** EXIMC: {decimal(16, 6)} */
    protected java.math.BigDecimal _eximc;

    /** EXIMD: {decimal(16, 6)} */
    protected java.math.BigDecimal _eximd;

    /** EXIME: {varchar(60)} */
    protected String _exime;

    /** EXIMF: {varchar(60)} */
    protected String _eximf;

    /** EXIMG: {varchar(60)} */
    protected String _eximg;

    /** EXIMH: {varchar(60)} */
    protected String _eximh;

    /** EXIMI: {varchar(60)} */
    protected String _eximi;

    /** EXIMJ: {varchar(60)} */
    protected String _eximj;

    /** EXIMK: {varchar(60)} */
    protected String _eximk;

    /** EXIML: {varchar(60)} */
    protected String _eximl;

    /** EXIMM: {varchar(60)} */
    protected String _eximm;

    /** EXIMN: {varchar(60)} */
    protected String _eximn;

    /** EXIMO: {varchar(60)} */
    protected String _eximo;

    /** EXIMP: {varchar(60)} */
    protected String _eximp;

    /** UPMN: {bigint(19)} */
    protected Long _upmn;

    /** CHNGYD: {varchar(8)} */
    protected String _chngyd;

    /** UPDTM: {varchar(30)} */
    protected String _updtm;

    /** UPDIS: {bigint(19)} */
    protected Long _updis;

    /** UPBMN: {bigint(19)} */
    protected Long _upbmn;

    /** BCHNGYD: {varchar(8)} */
    protected String _bchngyd;

    /** BUPDTM: {bigint(19)} */
    protected Long _bupdtm;

    /** UPOBMN: {bigint(19)} */
    protected Long _upobmn;

    /** OBCHNGYD: {varchar(8)} */
    protected String _obchngyd;

    /** OBUPDTM: {bigint(19)} */
    protected Long _obupdtm;

    /** AUBRCHFG: {varchar(30)} */
    protected String _aubrchfg;

    /** ZZFRDATEH: {varchar(8)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    protected String _zztodateh;

    /** RCDUPDPS: {varchar(30)} */
    protected String _rcdupdps;

    /** UPDUSRID: {bigint(19)} */
    protected Long _updusrid;

    /** UPDPOCD: {varchar(30)} */
    protected String _updpocd;

    /** OTCMPFG: {decimal(16, 6)} */
    protected java.math.BigDecimal _otcmpfg;

    /** TMCMPFG: {decimal(16, 6)} */
    protected java.math.BigDecimal _tmcmpfg;

    /** STMID: {varchar(30)} */
    protected String _stmid;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_TSN_PRODUCT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tsnProductId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMTsnProduct) {
            BsMTsnProduct other = (BsMTsnProduct)obj;
            if (!xSV(_tsnProductId, other._tsnProductId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tsnProductId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tsnProductId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_brfnfl));
        sb.append(dm).append(xfND(_brfnhf));
        sb.append(dm).append(xfND(_branfl));
        sb.append(dm).append(xfND(_branhf));
        sb.append(dm).append(xfND(_sobrfnfl));
        sb.append(dm).append(xfND(_sobrfnhf));
        sb.append(dm).append(xfND(_brkname));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_zzdevcid));
        sb.append(dm).append(xfND(_usid));
        sb.append(dm).append(xfND(_cgrid));
        sb.append(dm).append(xfND(_cbcccvce));
        sb.append(dm).append(xfND(_sfcbqa));
        sb.append(dm).append(xfND(_ctnum));
        sb.append(dm).append(xfND(_cbnum));
        sb.append(dm).append(xfND(_patcbqa));
        sb.append(dm).append(xfND(_zzseffid));
        sb.append(dm).append(xfND(_zzablymd));
        sb.append(dm).append(xfND(_crspymd));
        sb.append(dm).append(xfND(_seymd));
        sb.append(dm).append(xfND(_dpbnyd));
        sb.append(dm).append(xfND(_sobgnymd));
        sb.append(dm).append(xfND(_exslymd));
        sb.append(dm).append(xfND(_aubrid));
        sb.append(dm).append(xfND(_fwbrid));
        sb.append(dm).append(xfND(_brcrid));
        sb.append(dm).append(xfND(_pabrcd));
        sb.append(dm).append(xfND(_aubrcd));
        sb.append(dm).append(xfND(_zzmatnra));
        sb.append(dm).append(xfND(_mraucd));
        sb.append(dm).append(xfND(_zzsomium));
        sb.append(dm).append(xfND(_zzregprca));
        sb.append(dm).append(xfND(_tfpr));
        sb.append(dm).append(xfND(_mgrta));
        sb.append(dm).append(xfND(_mgrtok));
        sb.append(dm).append(xfND(_tlnpru));
        sb.append(dm).append(xfND(_hanumwt));
        sb.append(dm).append(xfND(_cnscvct));
        sb.append(dm).append(xfND(_cgtaxcct));
        sb.append(dm).append(xfND(_ntxqart));
        sb.append(dm).append(xfND(_ltxqart));
        sb.append(dm).append(xfND(_advtaxrt));
        sb.append(dm).append(xfND(_ctytaxrt));
        sb.append(dm).append(xfND(_prfprt));
        sb.append(dm).append(xfND(_notax));
        sb.append(dm).append(xfND(_brkd));
        sb.append(dm).append(xfND(_fmlycd));
        sb.append(dm).append(xfND(_prgrcd));
        sb.append(dm).append(xfND(_nctncls));
        sb.append(dm).append(xfND(_tarcls));
        sb.append(dm).append(xfND(_pdpkspcd));
        sb.append(dm).append(xfND(_fltid));
        sb.append(dm).append(xfND(_ksubcdid));
        sb.append(dm).append(xfND(_ksubcd));
        sb.append(dm).append(xfND(_ctbcdid));
        sb.append(dm).append(xfND(_ctbcd));
        sb.append(dm).append(xfND(_cbbcdid));
        sb.append(dm).append(xfND(_cbbcd));
        sb.append(dm).append(xfND(_ctfm));
        sb.append(dm).append(xfND(_ctszl));
        sb.append(dm).append(xfND(_ctszw));
        sb.append(dm).append(xfND(_ctszh));
        sb.append(dm).append(xfND(_ctcc));
        sb.append(dm).append(xfND(_ctweight));
        sb.append(dm).append(xfND(_cbszl));
        sb.append(dm).append(xfND(_cbszw));
        sb.append(dm).append(xfND(_cbszh));
        sb.append(dm).append(xfND(_cbcc));
        sb.append(dm).append(xfND(_cbwt));
        sb.append(dm).append(xfND(_bscdt));
        sb.append(dm).append(xfND(_bscdk));
        sb.append(dm).append(xfND(_bscdc));
        sb.append(dm).append(xfND(_bscdq));
        sb.append(dm).append(xfND(_bscdh));
        sb.append(dm).append(xfND(_spagcdt));
        sb.append(dm).append(xfND(_spagcdk));
        sb.append(dm).append(xfND(_spagcdc));
        sb.append(dm).append(xfND(_spagcdq));
        sb.append(dm).append(xfND(_spagcdh));
        sb.append(dm).append(xfND(_rbscd1));
        sb.append(dm).append(xfND(_rbscd2));
        sb.append(dm).append(xfND(_rbscd3));
        sb.append(dm).append(xfND(_rbscd4));
        sb.append(dm).append(xfND(_rbscd5));
        sb.append(dm).append(xfND(_ussbcd1));
        sb.append(dm).append(xfND(_ussbcd2));
        sb.append(dm).append(xfND(_ussbcd3));
        sb.append(dm).append(xfND(_ussbcd4));
        sb.append(dm).append(xfND(_ussbcd5));
        sb.append(dm).append(xfND(_splcpcd));
        sb.append(dm).append(xfND(_makercd));
        sb.append(dm).append(xfND(_land1));
        sb.append(dm).append(xfND(_cgclsdid));
        sb.append(dm).append(xfND(_gnlotrnk));
        sb.append(dm).append(xfND(_mrotrnk));
        sb.append(dm).append(xfND(_coid));
        sb.append(dm).append(xfND(_brwkid));
        sb.append(dm).append(xfND(_shunid));
        sb.append(dm).append(xfND(_dstkbn));
        sb.append(dm).append(xfND(_reomatnr));
        sb.append(dm).append(xfND(_dspeckb));
        sb.append(dm).append(xfND(_sgmid));
        sb.append(dm).append(xfND(_makileng));
        sb.append(dm).append(xfND(_makidia));
        sb.append(dm).append(xfND(_gdmsrp));
        sb.append(dm).append(xfND(_gdslu));
        sb.append(dm).append(xfND(_gdpru));
        sb.append(dm).append(xfND(_exima));
        sb.append(dm).append(xfND(_eximb));
        sb.append(dm).append(xfND(_eximc));
        sb.append(dm).append(xfND(_eximd));
        sb.append(dm).append(xfND(_exime));
        sb.append(dm).append(xfND(_eximf));
        sb.append(dm).append(xfND(_eximg));
        sb.append(dm).append(xfND(_eximh));
        sb.append(dm).append(xfND(_eximi));
        sb.append(dm).append(xfND(_eximj));
        sb.append(dm).append(xfND(_eximk));
        sb.append(dm).append(xfND(_eximl));
        sb.append(dm).append(xfND(_eximm));
        sb.append(dm).append(xfND(_eximn));
        sb.append(dm).append(xfND(_eximo));
        sb.append(dm).append(xfND(_eximp));
        sb.append(dm).append(xfND(_upmn));
        sb.append(dm).append(xfND(_chngyd));
        sb.append(dm).append(xfND(_updtm));
        sb.append(dm).append(xfND(_updis));
        sb.append(dm).append(xfND(_upbmn));
        sb.append(dm).append(xfND(_bchngyd));
        sb.append(dm).append(xfND(_bupdtm));
        sb.append(dm).append(xfND(_upobmn));
        sb.append(dm).append(xfND(_obchngyd));
        sb.append(dm).append(xfND(_obupdtm));
        sb.append(dm).append(xfND(_aubrchfg));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_rcdupdps));
        sb.append(dm).append(xfND(_updusrid));
        sb.append(dm).append(xfND(_updpocd));
        sb.append(dm).append(xfND(_otcmpfg));
        sb.append(dm).append(xfND(_tmcmpfg));
        sb.append(dm).append(xfND(_stmid));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public MTsnProduct clone() {
        return (MTsnProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN銘柄マスタID
     * @return The value of the column 'TSN_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTsnProductId() {
        checkSpecifiedProperty("tsnProductId");
        return _tsnProductId;
    }

    /**
     * [set] TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN銘柄マスタID
     * @param tsnProductId The value of the column 'TSN_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTsnProductId(Long tsnProductId) {
        registerModifiedProperty("tsnProductId");
        _tsnProductId = tsnProductId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'BRFNFL'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrfnfl() {
        checkSpecifiedProperty("brfnfl");
        return convertEmptyToNull(_brfnfl);
    }

    /**
     * [set] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @param brfnfl The value of the column 'BRFNFL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrfnfl(String brfnfl) {
        registerModifiedProperty("brfnfl");
        _brfnfl = brfnfl;
    }

    /**
     * [get] BRFNHF: {varchar(60)} <br>
     * 銘柄名正称(半角)
     * @return The value of the column 'BRFNHF'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrfnhf() {
        checkSpecifiedProperty("brfnhf");
        return convertEmptyToNull(_brfnhf);
    }

    /**
     * [set] BRFNHF: {varchar(60)} <br>
     * 銘柄名正称(半角)
     * @param brfnhf The value of the column 'BRFNHF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrfnhf(String brfnhf) {
        registerModifiedProperty("brfnhf");
        _brfnhf = brfnhf;
    }

    /**
     * [get] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @return The value of the column 'BRANFL'. (NullAllowed even if selected: for no constraint)
     */
    public String getBranfl() {
        checkSpecifiedProperty("branfl");
        return convertEmptyToNull(_branfl);
    }

    /**
     * [set] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @param branfl The value of the column 'BRANFL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBranfl(String branfl) {
        registerModifiedProperty("branfl");
        _branfl = branfl;
    }

    /**
     * [get] BRANHF: {varchar(60)} <br>
     * 銘柄名略称(半角)
     * @return The value of the column 'BRANHF'. (NullAllowed even if selected: for no constraint)
     */
    public String getBranhf() {
        checkSpecifiedProperty("branhf");
        return convertEmptyToNull(_branhf);
    }

    /**
     * [set] BRANHF: {varchar(60)} <br>
     * 銘柄名略称(半角)
     * @param branhf The value of the column 'BRANHF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBranhf(String branhf) {
        registerModifiedProperty("branhf");
        _branhf = branhf;
    }

    /**
     * [get] SOBRFNFL: {varchar(255)} <br>
     * 受注用銘柄名称（全角）
     * @return The value of the column 'SOBRFNFL'. (NullAllowed even if selected: for no constraint)
     */
    public String getSobrfnfl() {
        checkSpecifiedProperty("sobrfnfl");
        return convertEmptyToNull(_sobrfnfl);
    }

    /**
     * [set] SOBRFNFL: {varchar(255)} <br>
     * 受注用銘柄名称（全角）
     * @param sobrfnfl The value of the column 'SOBRFNFL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSobrfnfl(String sobrfnfl) {
        registerModifiedProperty("sobrfnfl");
        _sobrfnfl = sobrfnfl;
    }

    /**
     * [get] SOBRFNHF: {varchar(60)} <br>
     * 受注用銘柄名称（半角）
     * @return The value of the column 'SOBRFNHF'. (NullAllowed even if selected: for no constraint)
     */
    public String getSobrfnhf() {
        checkSpecifiedProperty("sobrfnhf");
        return convertEmptyToNull(_sobrfnhf);
    }

    /**
     * [set] SOBRFNHF: {varchar(60)} <br>
     * 受注用銘柄名称（半角）
     * @param sobrfnhf The value of the column 'SOBRFNHF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSobrfnhf(String sobrfnhf) {
        registerModifiedProperty("sobrfnhf");
        _sobrfnhf = sobrfnhf;
    }

    /**
     * [get] BRKNAME: {varchar(255)} <br>
     * 銘柄名英字
     * @return The value of the column 'BRKNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrkname() {
        checkSpecifiedProperty("brkname");
        return convertEmptyToNull(_brkname);
    }

    /**
     * [set] BRKNAME: {varchar(255)} <br>
     * 銘柄名英字
     * @param brkname The value of the column 'BRKNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrkname(String brkname) {
        registerModifiedProperty("brkname");
        _brkname = brkname;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] ZZDEVCID: {bigint(19)} <br>
     * 装置本数
     * @return The value of the column 'ZZDEVCID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZzdevcid() {
        checkSpecifiedProperty("zzdevcid");
        return _zzdevcid;
    }

    /**
     * [set] ZZDEVCID: {bigint(19)} <br>
     * 装置本数
     * @param zzdevcid The value of the column 'ZZDEVCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzdevcid(Long zzdevcid) {
        registerModifiedProperty("zzdevcid");
        _zzdevcid = zzdevcid;
    }

    /**
     * [get] USID: {varchar(30)} <br>
     * 使用区分
     * @return The value of the column 'USID'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsid() {
        checkSpecifiedProperty("usid");
        return convertEmptyToNull(_usid);
    }

    /**
     * [set] USID: {varchar(30)} <br>
     * 使用区分
     * @param usid The value of the column 'USID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsid(String usid) {
        registerModifiedProperty("usid");
        _usid = usid;
    }

    /**
     * [get] CGRID: {varchar(30)} <br>
     * たばこ区分
     * @return The value of the column 'CGRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCgrid() {
        checkSpecifiedProperty("cgrid");
        return convertEmptyToNull(_cgrid);
    }

    /**
     * [set] CGRID: {varchar(30)} <br>
     * たばこ区分
     * @param cgrid The value of the column 'CGRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCgrid(String cgrid) {
        registerModifiedProperty("cgrid");
        _cgrid = cgrid;
    }

    /**
     * [get] CBCCCVCE: {decimal(16, 6)} <br>
     * 段ボール容積換算係数
     * @return The value of the column 'CBCCCVCE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCbcccvce() {
        checkSpecifiedProperty("cbcccvce");
        return _cbcccvce;
    }

    /**
     * [set] CBCCCVCE: {decimal(16, 6)} <br>
     * 段ボール容積換算係数
     * @param cbcccvce The value of the column 'CBCCCVCE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbcccvce(java.math.BigDecimal cbcccvce) {
        registerModifiedProperty("cbcccvce");
        _cbcccvce = cbcccvce;
    }

    /**
     * [get] SFCBQA: {decimal(16, 6)} <br>
     * 1面当段ボール数
     * @return The value of the column 'SFCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSfcbqa() {
        checkSpecifiedProperty("sfcbqa");
        return _sfcbqa;
    }

    /**
     * [set] SFCBQA: {decimal(16, 6)} <br>
     * 1面当段ボール数
     * @param sfcbqa The value of the column 'SFCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSfcbqa(java.math.BigDecimal sfcbqa) {
        registerModifiedProperty("sfcbqa");
        _sfcbqa = sfcbqa;
    }

    /**
     * [get] CTNUM: {decimal(16, 6)} <br>
     * 1カートン当個数
     * @return The value of the column 'CTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCtnum() {
        checkSpecifiedProperty("ctnum");
        return _ctnum;
    }

    /**
     * [set] CTNUM: {decimal(16, 6)} <br>
     * 1カートン当個数
     * @param ctnum The value of the column 'CTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtnum(java.math.BigDecimal ctnum) {
        registerModifiedProperty("ctnum");
        _ctnum = ctnum;
    }

    /**
     * [get] CBNUM: {decimal(16, 6)} <br>
     * 1段ボール当個数
     * @return The value of the column 'CBNUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCbnum() {
        checkSpecifiedProperty("cbnum");
        return _cbnum;
    }

    /**
     * [set] CBNUM: {decimal(16, 6)} <br>
     * 1段ボール当個数
     * @param cbnum The value of the column 'CBNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbnum(java.math.BigDecimal cbnum) {
        registerModifiedProperty("cbnum");
        _cbnum = cbnum;
    }

    /**
     * [get] PATCBQA: {decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @return The value of the column 'PATCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPatcbqa() {
        checkSpecifiedProperty("patcbqa");
        return _patcbqa;
    }

    /**
     * [set] PATCBQA: {decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @param patcbqa The value of the column 'PATCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPatcbqa(java.math.BigDecimal patcbqa) {
        registerModifiedProperty("patcbqa");
        _patcbqa = patcbqa;
    }

    /**
     * [get] ZZSEFFID: {varchar(30)} <br>
     * 売り尽し区分
     * @return The value of the column 'ZZSEFFID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzseffid() {
        checkSpecifiedProperty("zzseffid");
        return convertEmptyToNull(_zzseffid);
    }

    /**
     * [set] ZZSEFFID: {varchar(30)} <br>
     * 売り尽し区分
     * @param zzseffid The value of the column 'ZZSEFFID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzseffid(String zzseffid) {
        registerModifiedProperty("zzseffid");
        _zzseffid = zzseffid;
    }

    /**
     * [get] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzablymd() {
        checkSpecifiedProperty("zzablymd");
        return convertEmptyToNull(_zzablymd);
    }

    /**
     * [set] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzablymd(String zzablymd) {
        registerModifiedProperty("zzablymd");
        _zzablymd = zzablymd;
    }

    /**
     * [get] CRSPYMD: {varchar(8)} <br>
     * 取扱中止年月日
     * @return The value of the column 'CRSPYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCrspymd() {
        checkSpecifiedProperty("crspymd");
        return convertEmptyToNull(_crspymd);
    }

    /**
     * [set] CRSPYMD: {varchar(8)} <br>
     * 取扱中止年月日
     * @param crspymd The value of the column 'CRSPYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCrspymd(String crspymd) {
        registerModifiedProperty("crspymd");
        _crspymd = crspymd;
    }

    /**
     * [get] SEYMD: {varchar(8)} <br>
     * 発売年月日
     * @return The value of the column 'SEYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeymd() {
        checkSpecifiedProperty("seymd");
        return convertEmptyToNull(_seymd);
    }

    /**
     * [set] SEYMD: {varchar(8)} <br>
     * 発売年月日
     * @param seymd The value of the column 'SEYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeymd(String seymd) {
        registerModifiedProperty("seymd");
        _seymd = seymd;
    }

    /**
     * [get] DPBNYD: {varchar(8)} <br>
     * 表示開始年月日
     * @return The value of the column 'DPBNYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpbnyd() {
        checkSpecifiedProperty("dpbnyd");
        return convertEmptyToNull(_dpbnyd);
    }

    /**
     * [set] DPBNYD: {varchar(8)} <br>
     * 表示開始年月日
     * @param dpbnyd The value of the column 'DPBNYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpbnyd(String dpbnyd) {
        registerModifiedProperty("dpbnyd");
        _dpbnyd = dpbnyd;
    }

    /**
     * [get] SOBGNYMD: {varchar(8)} <br>
     * 受注開始年月日
     * @return The value of the column 'SOBGNYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSobgnymd() {
        checkSpecifiedProperty("sobgnymd");
        return convertEmptyToNull(_sobgnymd);
    }

    /**
     * [set] SOBGNYMD: {varchar(8)} <br>
     * 受注開始年月日
     * @param sobgnymd The value of the column 'SOBGNYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSobgnymd(String sobgnymd) {
        registerModifiedProperty("sobgnymd");
        _sobgnymd = sobgnymd;
    }

    /**
     * [get] EXSLYMD: {varchar(8)} <br>
     * 拡販年月日
     * @return The value of the column 'EXSLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getExslymd() {
        checkSpecifiedProperty("exslymd");
        return convertEmptyToNull(_exslymd);
    }

    /**
     * [set] EXSLYMD: {varchar(8)} <br>
     * 拡販年月日
     * @param exslymd The value of the column 'EXSLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExslymd(String exslymd) {
        registerModifiedProperty("exslymd");
        _exslymd = exslymd;
    }

    /**
     * [get] AUBRID: {varchar(30)} <br>
     * 集計銘柄区分
     * @return The value of the column 'AUBRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getAubrid() {
        checkSpecifiedProperty("aubrid");
        return convertEmptyToNull(_aubrid);
    }

    /**
     * [set] AUBRID: {varchar(30)} <br>
     * 集計銘柄区分
     * @param aubrid The value of the column 'AUBRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAubrid(String aubrid) {
        registerModifiedProperty("aubrid");
        _aubrid = aubrid;
    }

    /**
     * [get] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'FWBRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getFwbrid() {
        checkSpecifiedProperty("fwbrid");
        return convertEmptyToNull(_fwbrid);
    }

    /**
     * [set] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @param fwbrid The value of the column 'FWBRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwbrid(String fwbrid) {
        registerModifiedProperty("fwbrid");
        _fwbrid = fwbrid;
    }

    /**
     * [get] BRCRID: {varchar(30)} <br>
     * 銘柄取扱区分
     * @return The value of the column 'BRCRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrcrid() {
        checkSpecifiedProperty("brcrid");
        return convertEmptyToNull(_brcrid);
    }

    /**
     * [set] BRCRID: {varchar(30)} <br>
     * 銘柄取扱区分
     * @param brcrid The value of the column 'BRCRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrcrid(String brcrid) {
        registerModifiedProperty("brcrid");
        _brcrid = brcrid;
    }

    /**
     * [get] PABRCD: {varchar(60)} <br>
     * 親銘柄コード
     * @return The value of the column 'PABRCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPabrcd() {
        checkSpecifiedProperty("pabrcd");
        return convertEmptyToNull(_pabrcd);
    }

    /**
     * [set] PABRCD: {varchar(60)} <br>
     * 親銘柄コード
     * @param pabrcd The value of the column 'PABRCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPabrcd(String pabrcd) {
        registerModifiedProperty("pabrcd");
        _pabrcd = pabrcd;
    }

    /**
     * [get] AUBRCD: {varchar(60)} <br>
     * 庫内作業集約コード
     * @return The value of the column 'AUBRCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAubrcd() {
        checkSpecifiedProperty("aubrcd");
        return convertEmptyToNull(_aubrcd);
    }

    /**
     * [set] AUBRCD: {varchar(60)} <br>
     * 庫内作業集約コード
     * @param aubrcd The value of the column 'AUBRCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAubrcd(String aubrcd) {
        registerModifiedProperty("aubrcd");
        _aubrcd = aubrcd;
    }

    /**
     * [get] ZZMATNRA: {varchar(60)} <br>
     * 出納用銘柄コード
     * @return The value of the column 'ZZMATNRA'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnra() {
        checkSpecifiedProperty("zzmatnra");
        return convertEmptyToNull(_zzmatnra);
    }

    /**
     * [set] ZZMATNRA: {varchar(60)} <br>
     * 出納用銘柄コード
     * @param zzmatnra The value of the column 'ZZMATNRA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnra(String zzmatnra) {
        registerModifiedProperty("zzmatnra");
        _zzmatnra = zzmatnra;
    }

    /**
     * [get] MRAUCD: {varchar(60)} <br>
     * 月報用集計コード
     * @return The value of the column 'MRAUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMraucd() {
        checkSpecifiedProperty("mraucd");
        return convertEmptyToNull(_mraucd);
    }

    /**
     * [set] MRAUCD: {varchar(60)} <br>
     * 月報用集計コード
     * @param mraucd The value of the column 'MRAUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMraucd(String mraucd) {
        registerModifiedProperty("mraucd");
        _mraucd = mraucd;
    }

    /**
     * [get] ZZSOMIUM: {bigint(19)} <br>
     * 最小受注単位
     * @return The value of the column 'ZZSOMIUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZzsomium() {
        checkSpecifiedProperty("zzsomium");
        return _zzsomium;
    }

    /**
     * [set] ZZSOMIUM: {bigint(19)} <br>
     * 最小受注単位
     * @param zzsomium The value of the column 'ZZSOMIUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzsomium(Long zzsomium) {
        registerModifiedProperty("zzsomium");
        _zzsomium = zzsomium;
    }

    /**
     * [get] ZZREGPRCA: {bigint(19)} <br>
     * 定価
     * @return The value of the column 'ZZREGPRCA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZzregprca() {
        checkSpecifiedProperty("zzregprca");
        return _zzregprca;
    }

    /**
     * [set] ZZREGPRCA: {bigint(19)} <br>
     * 定価
     * @param zzregprca The value of the column 'ZZREGPRCA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzregprca(Long zzregprca) {
        registerModifiedProperty("zzregprca");
        _zzregprca = zzregprca;
    }

    /**
     * [get] TFPR: {bigint(19)} <br>
     * 振替価格
     * @return The value of the column 'TFPR'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTfpr() {
        checkSpecifiedProperty("tfpr");
        return _tfpr;
    }

    /**
     * [set] TFPR: {bigint(19)} <br>
     * 振替価格
     * @param tfpr The value of the column 'TFPR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTfpr(Long tfpr) {
        registerModifiedProperty("tfpr");
        _tfpr = tfpr;
    }

    /**
     * [get] MGRTA: {decimal(16, 6)} <br>
     * マージン率(全国)
     * @return The value of the column 'MGRTA'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMgrta() {
        checkSpecifiedProperty("mgrta");
        return _mgrta;
    }

    /**
     * [set] MGRTA: {decimal(16, 6)} <br>
     * マージン率(全国)
     * @param mgrta The value of the column 'MGRTA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMgrta(java.math.BigDecimal mgrta) {
        registerModifiedProperty("mgrta");
        _mgrta = mgrta;
    }

    /**
     * [get] MGRTOK: {decimal(16, 6)} <br>
     * マージン率(沖縄)
     * @return The value of the column 'MGRTOK'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMgrtok() {
        checkSpecifiedProperty("mgrtok");
        return _mgrtok;
    }

    /**
     * [set] MGRTOK: {decimal(16, 6)} <br>
     * マージン率(沖縄)
     * @param mgrtok The value of the column 'MGRTOK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMgrtok(java.math.BigDecimal mgrtok) {
        registerModifiedProperty("mgrtok");
        _mgrtok = mgrtok;
    }

    /**
     * [get] TLNPRU: {decimal(16, 6)} <br>
     * 千本当仕入価格(TSN)
     * @return The value of the column 'TLNPRU'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTlnpru() {
        checkSpecifiedProperty("tlnpru");
        return _tlnpru;
    }

    /**
     * [set] TLNPRU: {decimal(16, 6)} <br>
     * 千本当仕入価格(TSN)
     * @param tlnpru The value of the column 'TLNPRU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTlnpru(java.math.BigDecimal tlnpru) {
        registerModifiedProperty("tlnpru");
        _tlnpru = tlnpru;
    }

    /**
     * [get] HANUMWT: {decimal(16, 6)} <br>
     * 端数有り個装重量
     * @return The value of the column 'HANUMWT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getHanumwt() {
        checkSpecifiedProperty("hanumwt");
        return _hanumwt;
    }

    /**
     * [set] HANUMWT: {decimal(16, 6)} <br>
     * 端数有り個装重量
     * @param hanumwt The value of the column 'HANUMWT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHanumwt(java.math.BigDecimal hanumwt) {
        registerModifiedProperty("hanumwt");
        _hanumwt = hanumwt;
    }

    /**
     * [get] CNSCVCT: {decimal(16, 6)} <br>
     * 消費税換算本数
     * @return The value of the column 'CNSCVCT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCnscvct() {
        checkSpecifiedProperty("cnscvct");
        return _cnscvct;
    }

    /**
     * [set] CNSCVCT: {decimal(16, 6)} <br>
     * 消費税換算本数
     * @param cnscvct The value of the column 'CNSCVCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCnscvct(java.math.BigDecimal cnscvct) {
        registerModifiedProperty("cnscvct");
        _cnscvct = cnscvct;
    }

    /**
     * [get] CGTAXCCT: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @return The value of the column 'CGTAXCCT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCgtaxcct() {
        checkSpecifiedProperty("cgtaxcct");
        return _cgtaxcct;
    }

    /**
     * [set] CGTAXCCT: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @param cgtaxcct The value of the column 'CGTAXCCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCgtaxcct(java.math.BigDecimal cgtaxcct) {
        registerModifiedProperty("cgtaxcct");
        _cgtaxcct = cgtaxcct;
    }

    /**
     * [get] NTXQART: {decimal(16, 6)} <br>
     * 国税従量税率
     * @return The value of the column 'NTXQART'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNtxqart() {
        checkSpecifiedProperty("ntxqart");
        return _ntxqart;
    }

    /**
     * [set] NTXQART: {decimal(16, 6)} <br>
     * 国税従量税率
     * @param ntxqart The value of the column 'NTXQART'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNtxqart(java.math.BigDecimal ntxqart) {
        registerModifiedProperty("ntxqart");
        _ntxqart = ntxqart;
    }

    /**
     * [get] LTXQART: {decimal(16, 6)} <br>
     * 地方税従量税率
     * @return The value of the column 'LTXQART'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLtxqart() {
        checkSpecifiedProperty("ltxqart");
        return _ltxqart;
    }

    /**
     * [set] LTXQART: {decimal(16, 6)} <br>
     * 地方税従量税率
     * @param ltxqart The value of the column 'LTXQART'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLtxqart(java.math.BigDecimal ltxqart) {
        registerModifiedProperty("ltxqart");
        _ltxqart = ltxqart;
    }

    /**
     * [get] ADVTAXRT: {decimal(16, 6)} <br>
     * 都道府県税率
     * @return The value of the column 'ADVTAXRT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAdvtaxrt() {
        checkSpecifiedProperty("advtaxrt");
        return _advtaxrt;
    }

    /**
     * [set] ADVTAXRT: {decimal(16, 6)} <br>
     * 都道府県税率
     * @param advtaxrt The value of the column 'ADVTAXRT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdvtaxrt(java.math.BigDecimal advtaxrt) {
        registerModifiedProperty("advtaxrt");
        _advtaxrt = advtaxrt;
    }

    /**
     * [get] CTYTAXRT: {decimal(16, 6)} <br>
     * 市町村税率
     * @return The value of the column 'CTYTAXRT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCtytaxrt() {
        checkSpecifiedProperty("ctytaxrt");
        return _ctytaxrt;
    }

    /**
     * [set] CTYTAXRT: {decimal(16, 6)} <br>
     * 市町村税率
     * @param ctytaxrt The value of the column 'CTYTAXRT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtytaxrt(java.math.BigDecimal ctytaxrt) {
        registerModifiedProperty("ctytaxrt");
        _ctytaxrt = ctytaxrt;
    }

    /**
     * [get] PRFPRT: {decimal(16, 6)} <br>
     * 利益額(千本当)
     * @return The value of the column 'PRFPRT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrfprt() {
        checkSpecifiedProperty("prfprt");
        return _prfprt;
    }

    /**
     * [set] PRFPRT: {decimal(16, 6)} <br>
     * 利益額(千本当)
     * @param prfprt The value of the column 'PRFPRT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrfprt(java.math.BigDecimal prfprt) {
        registerModifiedProperty("prfprt");
        _prfprt = prfprt;
    }

    /**
     * [get] NOTAX: {decimal(16, 6)} <br>
     * 1本当税額
     * @return The value of the column 'NOTAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNotax() {
        checkSpecifiedProperty("notax");
        return _notax;
    }

    /**
     * [set] NOTAX: {decimal(16, 6)} <br>
     * 1本当税額
     * @param notax The value of the column 'NOTAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotax(java.math.BigDecimal notax) {
        registerModifiedProperty("notax");
        _notax = notax;
    }

    /**
     * [get] BRKD: {bigint(19)} <br>
     * 銘柄種類
     * @return The value of the column 'BRKD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBrkd() {
        checkSpecifiedProperty("brkd");
        return _brkd;
    }

    /**
     * [set] BRKD: {bigint(19)} <br>
     * 銘柄種類
     * @param brkd The value of the column 'BRKD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrkd(Long brkd) {
        registerModifiedProperty("brkd");
        _brkd = brkd;
    }

    /**
     * [get] FMLYCD: {varchar(30)} <br>
     * ファミリー・コード
     * @return The value of the column 'FMLYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFmlycd() {
        checkSpecifiedProperty("fmlycd");
        return convertEmptyToNull(_fmlycd);
    }

    /**
     * [set] FMLYCD: {varchar(30)} <br>
     * ファミリー・コード
     * @param fmlycd The value of the column 'FMLYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFmlycd(String fmlycd) {
        registerModifiedProperty("fmlycd");
        _fmlycd = fmlycd;
    }

    /**
     * [get] PRGRCD: {varchar(30)} <br>
     * 価格群コード
     * @return The value of the column 'PRGRCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrgrcd() {
        checkSpecifiedProperty("prgrcd");
        return convertEmptyToNull(_prgrcd);
    }

    /**
     * [set] PRGRCD: {varchar(30)} <br>
     * 価格群コード
     * @param prgrcd The value of the column 'PRGRCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrgrcd(String prgrcd) {
        registerModifiedProperty("prgrcd");
        _prgrcd = prgrcd;
    }

    /**
     * [get] NCTNCLS: {decimal(16, 6)} <br>
     * ニコチン値
     * @return The value of the column 'NCTNCLS'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNctncls() {
        checkSpecifiedProperty("nctncls");
        return _nctncls;
    }

    /**
     * [set] NCTNCLS: {decimal(16, 6)} <br>
     * ニコチン値
     * @param nctncls The value of the column 'NCTNCLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNctncls(java.math.BigDecimal nctncls) {
        registerModifiedProperty("nctncls");
        _nctncls = nctncls;
    }

    /**
     * [get] TARCLS: {decimal(16, 6)} <br>
     * タール値
     * @return The value of the column 'TARCLS'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTarcls() {
        checkSpecifiedProperty("tarcls");
        return _tarcls;
    }

    /**
     * [set] TARCLS: {decimal(16, 6)} <br>
     * タール値
     * @param tarcls The value of the column 'TARCLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTarcls(java.math.BigDecimal tarcls) {
        registerModifiedProperty("tarcls");
        _tarcls = tarcls;
    }

    /**
     * [get] PDPKSPCD: {varchar(30)} <br>
     * 製品包装形態
     * @return The value of the column 'PDPKSPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPdpkspcd() {
        checkSpecifiedProperty("pdpkspcd");
        return convertEmptyToNull(_pdpkspcd);
    }

    /**
     * [set] PDPKSPCD: {varchar(30)} <br>
     * 製品包装形態
     * @param pdpkspcd The value of the column 'PDPKSPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPdpkspcd(String pdpkspcd) {
        registerModifiedProperty("pdpkspcd");
        _pdpkspcd = pdpkspcd;
    }

    /**
     * [get] FLTID: {varchar(30)} <br>
     * フィルター区分
     * @return The value of the column 'FLTID'. (NullAllowed even if selected: for no constraint)
     */
    public String getFltid() {
        checkSpecifiedProperty("fltid");
        return convertEmptyToNull(_fltid);
    }

    /**
     * [set] FLTID: {varchar(30)} <br>
     * フィルター区分
     * @param fltid The value of the column 'FLTID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFltid(String fltid) {
        registerModifiedProperty("fltid");
        _fltid = fltid;
    }

    /**
     * [get] KSUBCDID: {varchar(30)} <br>
     * 個装バーコード区分
     * @return The value of the column 'KSUBCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getKsubcdid() {
        checkSpecifiedProperty("ksubcdid");
        return convertEmptyToNull(_ksubcdid);
    }

    /**
     * [set] KSUBCDID: {varchar(30)} <br>
     * 個装バーコード区分
     * @param ksubcdid The value of the column 'KSUBCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKsubcdid(String ksubcdid) {
        registerModifiedProperty("ksubcdid");
        _ksubcdid = ksubcdid;
    }

    /**
     * [get] KSUBCD: {varchar(30)} <br>
     * 個装バーコード
     * @return The value of the column 'KSUBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKsubcd() {
        checkSpecifiedProperty("ksubcd");
        return convertEmptyToNull(_ksubcd);
    }

    /**
     * [set] KSUBCD: {varchar(30)} <br>
     * 個装バーコード
     * @param ksubcd The value of the column 'KSUBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKsubcd(String ksubcd) {
        registerModifiedProperty("ksubcd");
        _ksubcd = ksubcd;
    }

    /**
     * [get] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'CTBCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtbcdid() {
        checkSpecifiedProperty("ctbcdid");
        return convertEmptyToNull(_ctbcdid);
    }

    /**
     * [set] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @param ctbcdid The value of the column 'CTBCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtbcdid(String ctbcdid) {
        registerModifiedProperty("ctbcdid");
        _ctbcdid = ctbcdid;
    }

    /**
     * [get] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'CTBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtbcd() {
        checkSpecifiedProperty("ctbcd");
        return convertEmptyToNull(_ctbcd);
    }

    /**
     * [set] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @param ctbcd The value of the column 'CTBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtbcd(String ctbcd) {
        registerModifiedProperty("ctbcd");
        _ctbcd = ctbcd;
    }

    /**
     * [get] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'CBBCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCbbcdid() {
        checkSpecifiedProperty("cbbcdid");
        return convertEmptyToNull(_cbbcdid);
    }

    /**
     * [set] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param cbbcdid The value of the column 'CBBCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbbcdid(String cbbcdid) {
        registerModifiedProperty("cbbcdid");
        _cbbcdid = cbbcdid;
    }

    /**
     * [get] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CBBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCbbcd() {
        checkSpecifiedProperty("cbbcd");
        return convertEmptyToNull(_cbbcd);
    }

    /**
     * [set] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param cbbcd The value of the column 'CBBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbbcd(String cbbcd) {
        registerModifiedProperty("cbbcd");
        _cbbcd = cbbcd;
    }

    /**
     * [get] CTFM: {varchar(30)} <br>
     * カートン形状
     * @return The value of the column 'CTFM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtfm() {
        checkSpecifiedProperty("ctfm");
        return convertEmptyToNull(_ctfm);
    }

    /**
     * [set] CTFM: {varchar(30)} <br>
     * カートン形状
     * @param ctfm The value of the column 'CTFM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtfm(String ctfm) {
        registerModifiedProperty("ctfm");
        _ctfm = ctfm;
    }

    /**
     * [get] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @return The value of the column 'CTSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszl() {
        checkSpecifiedProperty("ctszl");
        return _ctszl;
    }

    /**
     * [set] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @param ctszl The value of the column 'CTSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszl(Long ctszl) {
        registerModifiedProperty("ctszl");
        _ctszl = ctszl;
    }

    /**
     * [get] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @return The value of the column 'CTSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszw() {
        checkSpecifiedProperty("ctszw");
        return _ctszw;
    }

    /**
     * [set] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @param ctszw The value of the column 'CTSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszw(Long ctszw) {
        registerModifiedProperty("ctszw");
        _ctszw = ctszw;
    }

    /**
     * [get] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @return The value of the column 'CTSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszh() {
        checkSpecifiedProperty("ctszh");
        return _ctszh;
    }

    /**
     * [set] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @param ctszh The value of the column 'CTSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszh(Long ctszh) {
        registerModifiedProperty("ctszh");
        _ctszh = ctszh;
    }

    /**
     * [get] CTCC: {bigint(19)} <br>
     * カートン容積
     * @return The value of the column 'CTCC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtcc() {
        checkSpecifiedProperty("ctcc");
        return _ctcc;
    }

    /**
     * [set] CTCC: {bigint(19)} <br>
     * カートン容積
     * @param ctcc The value of the column 'CTCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtcc(Long ctcc) {
        registerModifiedProperty("ctcc");
        _ctcc = ctcc;
    }

    /**
     * [get] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @return The value of the column 'CTWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCtweight() {
        checkSpecifiedProperty("ctweight");
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtweight(java.math.BigDecimal ctweight) {
        registerModifiedProperty("ctweight");
        _ctweight = ctweight;
    }

    /**
     * [get] CBSZL: {bigint(19)} <br>
     * 段ボール（外寸）L
     * @return The value of the column 'CBSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbszl() {
        checkSpecifiedProperty("cbszl");
        return _cbszl;
    }

    /**
     * [set] CBSZL: {bigint(19)} <br>
     * 段ボール（外寸）L
     * @param cbszl The value of the column 'CBSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbszl(Long cbszl) {
        registerModifiedProperty("cbszl");
        _cbszl = cbszl;
    }

    /**
     * [get] CBSZW: {bigint(19)} <br>
     * 段ボール（外寸）W
     * @return The value of the column 'CBSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbszw() {
        checkSpecifiedProperty("cbszw");
        return _cbszw;
    }

    /**
     * [set] CBSZW: {bigint(19)} <br>
     * 段ボール（外寸）W
     * @param cbszw The value of the column 'CBSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbszw(Long cbszw) {
        registerModifiedProperty("cbszw");
        _cbszw = cbszw;
    }

    /**
     * [get] CBSZH: {bigint(19)} <br>
     * 段ボール（外寸）H
     * @return The value of the column 'CBSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbszh() {
        checkSpecifiedProperty("cbszh");
        return _cbszh;
    }

    /**
     * [set] CBSZH: {bigint(19)} <br>
     * 段ボール（外寸）H
     * @param cbszh The value of the column 'CBSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbszh(Long cbszh) {
        registerModifiedProperty("cbszh");
        _cbszh = cbszh;
    }

    /**
     * [get] CBCC: {bigint(19)} <br>
     * 段ボール容積
     * @return The value of the column 'CBCC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbcc() {
        checkSpecifiedProperty("cbcc");
        return _cbcc;
    }

    /**
     * [set] CBCC: {bigint(19)} <br>
     * 段ボール容積
     * @param cbcc The value of the column 'CBCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbcc(Long cbcc) {
        registerModifiedProperty("cbcc");
        _cbcc = cbcc;
    }

    /**
     * [get] CBWT: {bigint(19)} <br>
     * 段ボール（外寸）重量(g)
     * @return The value of the column 'CBWT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbwt() {
        checkSpecifiedProperty("cbwt");
        return _cbwt;
    }

    /**
     * [set] CBWT: {bigint(19)} <br>
     * 段ボール（外寸）重量(g)
     * @param cbwt The value of the column 'CBWT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbwt(Long cbwt) {
        registerModifiedProperty("cbwt");
        _cbwt = cbwt;
    }

    /**
     * [get] BSCDT: {varchar(30)} <br>
     * 仕入基地コード(1)
     * @return The value of the column 'BSCDT'. (NullAllowed even if selected: for no constraint)
     */
    public String getBscdt() {
        checkSpecifiedProperty("bscdt");
        return convertEmptyToNull(_bscdt);
    }

    /**
     * [set] BSCDT: {varchar(30)} <br>
     * 仕入基地コード(1)
     * @param bscdt The value of the column 'BSCDT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBscdt(String bscdt) {
        registerModifiedProperty("bscdt");
        _bscdt = bscdt;
    }

    /**
     * [get] BSCDK: {varchar(30)} <br>
     * 仕入基地コード(2)
     * @return The value of the column 'BSCDK'. (NullAllowed even if selected: for no constraint)
     */
    public String getBscdk() {
        checkSpecifiedProperty("bscdk");
        return convertEmptyToNull(_bscdk);
    }

    /**
     * [set] BSCDK: {varchar(30)} <br>
     * 仕入基地コード(2)
     * @param bscdk The value of the column 'BSCDK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBscdk(String bscdk) {
        registerModifiedProperty("bscdk");
        _bscdk = bscdk;
    }

    /**
     * [get] BSCDC: {varchar(30)} <br>
     * 仕入基地コード(3)
     * @return The value of the column 'BSCDC'. (NullAllowed even if selected: for no constraint)
     */
    public String getBscdc() {
        checkSpecifiedProperty("bscdc");
        return convertEmptyToNull(_bscdc);
    }

    /**
     * [set] BSCDC: {varchar(30)} <br>
     * 仕入基地コード(3)
     * @param bscdc The value of the column 'BSCDC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBscdc(String bscdc) {
        registerModifiedProperty("bscdc");
        _bscdc = bscdc;
    }

    /**
     * [get] BSCDQ: {varchar(30)} <br>
     * 仕入基地コード(4)
     * @return The value of the column 'BSCDQ'. (NullAllowed even if selected: for no constraint)
     */
    public String getBscdq() {
        checkSpecifiedProperty("bscdq");
        return convertEmptyToNull(_bscdq);
    }

    /**
     * [set] BSCDQ: {varchar(30)} <br>
     * 仕入基地コード(4)
     * @param bscdq The value of the column 'BSCDQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBscdq(String bscdq) {
        registerModifiedProperty("bscdq");
        _bscdq = bscdq;
    }

    /**
     * [get] BSCDH: {varchar(30)} <br>
     * 仕入基地コード(5)
     * @return The value of the column 'BSCDH'. (NullAllowed even if selected: for no constraint)
     */
    public String getBscdh() {
        checkSpecifiedProperty("bscdh");
        return convertEmptyToNull(_bscdh);
    }

    /**
     * [set] BSCDH: {varchar(30)} <br>
     * 仕入基地コード(5)
     * @param bscdh The value of the column 'BSCDH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBscdh(String bscdh) {
        registerModifiedProperty("bscdh");
        _bscdh = bscdh;
    }

    /**
     * [get] SPAGCDT: {varchar(30)} <br>
     * 特販業者コード(1)
     * @return The value of the column 'SPAGCDT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpagcdt() {
        checkSpecifiedProperty("spagcdt");
        return convertEmptyToNull(_spagcdt);
    }

    /**
     * [set] SPAGCDT: {varchar(30)} <br>
     * 特販業者コード(1)
     * @param spagcdt The value of the column 'SPAGCDT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpagcdt(String spagcdt) {
        registerModifiedProperty("spagcdt");
        _spagcdt = spagcdt;
    }

    /**
     * [get] SPAGCDK: {varchar(30)} <br>
     * 特販業者コード(2)
     * @return The value of the column 'SPAGCDK'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpagcdk() {
        checkSpecifiedProperty("spagcdk");
        return convertEmptyToNull(_spagcdk);
    }

    /**
     * [set] SPAGCDK: {varchar(30)} <br>
     * 特販業者コード(2)
     * @param spagcdk The value of the column 'SPAGCDK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpagcdk(String spagcdk) {
        registerModifiedProperty("spagcdk");
        _spagcdk = spagcdk;
    }

    /**
     * [get] SPAGCDC: {varchar(30)} <br>
     * 特販業者コード(3)
     * @return The value of the column 'SPAGCDC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpagcdc() {
        checkSpecifiedProperty("spagcdc");
        return convertEmptyToNull(_spagcdc);
    }

    /**
     * [set] SPAGCDC: {varchar(30)} <br>
     * 特販業者コード(3)
     * @param spagcdc The value of the column 'SPAGCDC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpagcdc(String spagcdc) {
        registerModifiedProperty("spagcdc");
        _spagcdc = spagcdc;
    }

    /**
     * [get] SPAGCDQ: {varchar(30)} <br>
     * 特販業者コード(4)
     * @return The value of the column 'SPAGCDQ'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpagcdq() {
        checkSpecifiedProperty("spagcdq");
        return convertEmptyToNull(_spagcdq);
    }

    /**
     * [set] SPAGCDQ: {varchar(30)} <br>
     * 特販業者コード(4)
     * @param spagcdq The value of the column 'SPAGCDQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpagcdq(String spagcdq) {
        registerModifiedProperty("spagcdq");
        _spagcdq = spagcdq;
    }

    /**
     * [get] SPAGCDH: {varchar(30)} <br>
     * 特販業者コード(5)
     * @return The value of the column 'SPAGCDH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpagcdh() {
        checkSpecifiedProperty("spagcdh");
        return convertEmptyToNull(_spagcdh);
    }

    /**
     * [set] SPAGCDH: {varchar(30)} <br>
     * 特販業者コード(5)
     * @param spagcdh The value of the column 'SPAGCDH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpagcdh(String spagcdh) {
        registerModifiedProperty("spagcdh");
        _spagcdh = spagcdh;
    }

    /**
     * [get] RBSCD1: {varchar(30)} <br>
     * 返品基地コード(1)
     * @return The value of the column 'RBSCD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getRbscd1() {
        checkSpecifiedProperty("rbscd1");
        return convertEmptyToNull(_rbscd1);
    }

    /**
     * [set] RBSCD1: {varchar(30)} <br>
     * 返品基地コード(1)
     * @param rbscd1 The value of the column 'RBSCD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRbscd1(String rbscd1) {
        registerModifiedProperty("rbscd1");
        _rbscd1 = rbscd1;
    }

    /**
     * [get] RBSCD2: {varchar(30)} <br>
     * 返品基地コード(2)
     * @return The value of the column 'RBSCD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getRbscd2() {
        checkSpecifiedProperty("rbscd2");
        return convertEmptyToNull(_rbscd2);
    }

    /**
     * [set] RBSCD2: {varchar(30)} <br>
     * 返品基地コード(2)
     * @param rbscd2 The value of the column 'RBSCD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRbscd2(String rbscd2) {
        registerModifiedProperty("rbscd2");
        _rbscd2 = rbscd2;
    }

    /**
     * [get] RBSCD3: {varchar(30)} <br>
     * 返品基地コード(3)
     * @return The value of the column 'RBSCD3'. (NullAllowed even if selected: for no constraint)
     */
    public String getRbscd3() {
        checkSpecifiedProperty("rbscd3");
        return convertEmptyToNull(_rbscd3);
    }

    /**
     * [set] RBSCD3: {varchar(30)} <br>
     * 返品基地コード(3)
     * @param rbscd3 The value of the column 'RBSCD3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRbscd3(String rbscd3) {
        registerModifiedProperty("rbscd3");
        _rbscd3 = rbscd3;
    }

    /**
     * [get] RBSCD4: {varchar(30)} <br>
     * 返品基地コード(4)
     * @return The value of the column 'RBSCD4'. (NullAllowed even if selected: for no constraint)
     */
    public String getRbscd4() {
        checkSpecifiedProperty("rbscd4");
        return convertEmptyToNull(_rbscd4);
    }

    /**
     * [set] RBSCD4: {varchar(30)} <br>
     * 返品基地コード(4)
     * @param rbscd4 The value of the column 'RBSCD4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRbscd4(String rbscd4) {
        registerModifiedProperty("rbscd4");
        _rbscd4 = rbscd4;
    }

    /**
     * [get] RBSCD5: {varchar(30)} <br>
     * 返品基地コード(5)
     * @return The value of the column 'RBSCD5'. (NullAllowed even if selected: for no constraint)
     */
    public String getRbscd5() {
        checkSpecifiedProperty("rbscd5");
        return convertEmptyToNull(_rbscd5);
    }

    /**
     * [set] RBSCD5: {varchar(30)} <br>
     * 返品基地コード(5)
     * @param rbscd5 The value of the column 'RBSCD5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRbscd5(String rbscd5) {
        registerModifiedProperty("rbscd5");
        _rbscd5 = rbscd5;
    }

    /**
     * [get] USSBCD1: {varchar(30)} <br>
     * 不適品返送先コード(1)
     * @return The value of the column 'USSBCD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUssbcd1() {
        checkSpecifiedProperty("ussbcd1");
        return convertEmptyToNull(_ussbcd1);
    }

    /**
     * [set] USSBCD1: {varchar(30)} <br>
     * 不適品返送先コード(1)
     * @param ussbcd1 The value of the column 'USSBCD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUssbcd1(String ussbcd1) {
        registerModifiedProperty("ussbcd1");
        _ussbcd1 = ussbcd1;
    }

    /**
     * [get] USSBCD2: {varchar(30)} <br>
     * 不適品返送先コード(2)
     * @return The value of the column 'USSBCD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUssbcd2() {
        checkSpecifiedProperty("ussbcd2");
        return convertEmptyToNull(_ussbcd2);
    }

    /**
     * [set] USSBCD2: {varchar(30)} <br>
     * 不適品返送先コード(2)
     * @param ussbcd2 The value of the column 'USSBCD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUssbcd2(String ussbcd2) {
        registerModifiedProperty("ussbcd2");
        _ussbcd2 = ussbcd2;
    }

    /**
     * [get] USSBCD3: {varchar(30)} <br>
     * 不適品返送先コード(3)
     * @return The value of the column 'USSBCD3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUssbcd3() {
        checkSpecifiedProperty("ussbcd3");
        return convertEmptyToNull(_ussbcd3);
    }

    /**
     * [set] USSBCD3: {varchar(30)} <br>
     * 不適品返送先コード(3)
     * @param ussbcd3 The value of the column 'USSBCD3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUssbcd3(String ussbcd3) {
        registerModifiedProperty("ussbcd3");
        _ussbcd3 = ussbcd3;
    }

    /**
     * [get] USSBCD4: {varchar(30)} <br>
     * 不適品返送先コード(4)
     * @return The value of the column 'USSBCD4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUssbcd4() {
        checkSpecifiedProperty("ussbcd4");
        return convertEmptyToNull(_ussbcd4);
    }

    /**
     * [set] USSBCD4: {varchar(30)} <br>
     * 不適品返送先コード(4)
     * @param ussbcd4 The value of the column 'USSBCD4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUssbcd4(String ussbcd4) {
        registerModifiedProperty("ussbcd4");
        _ussbcd4 = ussbcd4;
    }

    /**
     * [get] USSBCD5: {varchar(30)} <br>
     * 不適品返送先コード(5)
     * @return The value of the column 'USSBCD5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUssbcd5() {
        checkSpecifiedProperty("ussbcd5");
        return convertEmptyToNull(_ussbcd5);
    }

    /**
     * [set] USSBCD5: {varchar(30)} <br>
     * 不適品返送先コード(5)
     * @param ussbcd5 The value of the column 'USSBCD5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUssbcd5(String ussbcd5) {
        registerModifiedProperty("ussbcd5");
        _ussbcd5 = ussbcd5;
    }

    /**
     * [get] SPLCPCD: {varchar(30)} <br>
     * 供給会社コード
     * @return The value of the column 'SPLCPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplcpcd() {
        checkSpecifiedProperty("splcpcd");
        return convertEmptyToNull(_splcpcd);
    }

    /**
     * [set] SPLCPCD: {varchar(30)} <br>
     * 供給会社コード
     * @param splcpcd The value of the column 'SPLCPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplcpcd(String splcpcd) {
        registerModifiedProperty("splcpcd");
        _splcpcd = splcpcd;
    }

    /**
     * [get] MAKERCD: {varchar(60)} <br>
     * メーカーコード
     * @return The value of the column 'MAKERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakercd() {
        checkSpecifiedProperty("makercd");
        return convertEmptyToNull(_makercd);
    }

    /**
     * [set] MAKERCD: {varchar(60)} <br>
     * メーカーコード
     * @param makercd The value of the column 'MAKERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakercd(String makercd) {
        registerModifiedProperty("makercd");
        _makercd = makercd;
    }

    /**
     * [get] LAND1: {varchar(60)} <br>
     * 国コード
     * @return The value of the column 'LAND1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLand1() {
        checkSpecifiedProperty("land1");
        return convertEmptyToNull(_land1);
    }

    /**
     * [set] LAND1: {varchar(60)} <br>
     * 国コード
     * @param land1 The value of the column 'LAND1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLand1(String land1) {
        registerModifiedProperty("land1");
        _land1 = land1;
    }

    /**
     * [get] CGCLSDID: {varchar(30)} <br>
     * 請求締日区分
     * @return The value of the column 'CGCLSDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCgclsdid() {
        checkSpecifiedProperty("cgclsdid");
        return convertEmptyToNull(_cgclsdid);
    }

    /**
     * [set] CGCLSDID: {varchar(30)} <br>
     * 請求締日区分
     * @param cgclsdid The value of the column 'CGCLSDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCgclsdid(String cgclsdid) {
        registerModifiedProperty("cgclsdid");
        _cgclsdid = cgclsdid;
    }

    /**
     * [get] GNLOTRNK: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'GNLOTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGnlotrnk() {
        checkSpecifiedProperty("gnlotrnk");
        return _gnlotrnk;
    }

    /**
     * [set] GNLOTRNK: {bigint(19)} <br>
     * 一般出力順
     * @param gnlotrnk The value of the column 'GNLOTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGnlotrnk(Long gnlotrnk) {
        registerModifiedProperty("gnlotrnk");
        _gnlotrnk = gnlotrnk;
    }

    /**
     * [get] MROTRNK: {bigint(19)} <br>
     * 月報出力順
     * @return The value of the column 'MROTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMrotrnk() {
        checkSpecifiedProperty("mrotrnk");
        return _mrotrnk;
    }

    /**
     * [set] MROTRNK: {bigint(19)} <br>
     * 月報出力順
     * @param mrotrnk The value of the column 'MROTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMrotrnk(Long mrotrnk) {
        registerModifiedProperty("mrotrnk");
        _mrotrnk = mrotrnk;
    }

    /**
     * [get] COID: {varchar(30)} <br>
     * コンサイメント区分
     * @return The value of the column 'COID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCoid() {
        checkSpecifiedProperty("coid");
        return convertEmptyToNull(_coid);
    }

    /**
     * [set] COID: {varchar(30)} <br>
     * コンサイメント区分
     * @param coid The value of the column 'COID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCoid(String coid) {
        registerModifiedProperty("coid");
        _coid = coid;
    }

    /**
     * [get] BRWKID: {varchar(30)} <br>
     * 銘柄周知区分
     * @return The value of the column 'BRWKID'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrwkid() {
        checkSpecifiedProperty("brwkid");
        return convertEmptyToNull(_brwkid);
    }

    /**
     * [set] BRWKID: {varchar(30)} <br>
     * 銘柄周知区分
     * @param brwkid The value of the column 'BRWKID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrwkid(String brwkid) {
        registerModifiedProperty("brwkid");
        _brwkid = brwkid;
    }

    /**
     * [get] SHUNID: {varchar(30)} <br>
     * 輸送単位区分
     * @return The value of the column 'SHUNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShunid() {
        checkSpecifiedProperty("shunid");
        return convertEmptyToNull(_shunid);
    }

    /**
     * [set] SHUNID: {varchar(30)} <br>
     * 輸送単位区分
     * @param shunid The value of the column 'SHUNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShunid(String shunid) {
        registerModifiedProperty("shunid");
        _shunid = shunid;
    }

    /**
     * [get] DSTKBN: {varchar(30)} <br>
     * 流通加工区分
     * @return The value of the column 'DSTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDstkbn() {
        checkSpecifiedProperty("dstkbn");
        return convertEmptyToNull(_dstkbn);
    }

    /**
     * [set] DSTKBN: {varchar(30)} <br>
     * 流通加工区分
     * @param dstkbn The value of the column 'DSTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDstkbn(String dstkbn) {
        registerModifiedProperty("dstkbn");
        _dstkbn = dstkbn;
    }

    /**
     * [get] REOMATNR: {bigint(19)} <br>
     * 返品用親銘柄コード
     * @return The value of the column 'REOMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReomatnr() {
        checkSpecifiedProperty("reomatnr");
        return _reomatnr;
    }

    /**
     * [set] REOMATNR: {bigint(19)} <br>
     * 返品用親銘柄コード
     * @param reomatnr The value of the column 'REOMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReomatnr(Long reomatnr) {
        registerModifiedProperty("reomatnr");
        _reomatnr = reomatnr;
    }

    /**
     * [get] DSPECKB: {varchar(30)} <br>
     * D-spec区分
     * @return The value of the column 'DSPECKB'. (NullAllowed even if selected: for no constraint)
     */
    public String getDspeckb() {
        checkSpecifiedProperty("dspeckb");
        return convertEmptyToNull(_dspeckb);
    }

    /**
     * [set] DSPECKB: {varchar(30)} <br>
     * D-spec区分
     * @param dspeckb The value of the column 'DSPECKB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDspeckb(String dspeckb) {
        registerModifiedProperty("dspeckb");
        _dspeckb = dspeckb;
    }

    /**
     * [get] SGMID: {varchar(30)} <br>
     * セグメント区分
     * @return The value of the column 'SGMID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSgmid() {
        checkSpecifiedProperty("sgmid");
        return convertEmptyToNull(_sgmid);
    }

    /**
     * [set] SGMID: {varchar(30)} <br>
     * セグメント区分
     * @param sgmid The value of the column 'SGMID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSgmid(String sgmid) {
        registerModifiedProperty("sgmid");
        _sgmid = sgmid;
    }

    /**
     * [get] MAKILENG: {varchar(60)} <br>
     * 巻長
     * @return The value of the column 'MAKILENG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakileng() {
        checkSpecifiedProperty("makileng");
        return convertEmptyToNull(_makileng);
    }

    /**
     * [set] MAKILENG: {varchar(60)} <br>
     * 巻長
     * @param makileng The value of the column 'MAKILENG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakileng(String makileng) {
        registerModifiedProperty("makileng");
        _makileng = makileng;
    }

    /**
     * [get] MAKIDIA: {varchar(60)} <br>
     * 巻直径
     * @return The value of the column 'MAKIDIA'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakidia() {
        checkSpecifiedProperty("makidia");
        return convertEmptyToNull(_makidia);
    }

    /**
     * [set] MAKIDIA: {varchar(60)} <br>
     * 巻直径
     * @param makidia The value of the column 'MAKIDIA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakidia(String makidia) {
        registerModifiedProperty("makidia");
        _makidia = makidia;
    }

    /**
     * [get] GDMSRP: {bigint(19)} <br>
     * 希望小売価格
     * @return The value of the column 'GDMSRP'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGdmsrp() {
        checkSpecifiedProperty("gdmsrp");
        return _gdmsrp;
    }

    /**
     * [set] GDMSRP: {bigint(19)} <br>
     * 希望小売価格
     * @param gdmsrp The value of the column 'GDMSRP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGdmsrp(Long gdmsrp) {
        registerModifiedProperty("gdmsrp");
        _gdmsrp = gdmsrp;
    }

    /**
     * [get] GDSLU: {decimal(16, 6)} <br>
     * 商品販売単価
     * @return The value of the column 'GDSLU'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGdslu() {
        checkSpecifiedProperty("gdslu");
        return _gdslu;
    }

    /**
     * [set] GDSLU: {decimal(16, 6)} <br>
     * 商品販売単価
     * @param gdslu The value of the column 'GDSLU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGdslu(java.math.BigDecimal gdslu) {
        registerModifiedProperty("gdslu");
        _gdslu = gdslu;
    }

    /**
     * [get] GDPRU: {decimal(16, 6)} <br>
     * 商品仕入単価
     * @return The value of the column 'GDPRU'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGdpru() {
        checkSpecifiedProperty("gdpru");
        return _gdpru;
    }

    /**
     * [set] GDPRU: {decimal(16, 6)} <br>
     * 商品仕入単価
     * @param gdpru The value of the column 'GDPRU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGdpru(java.math.BigDecimal gdpru) {
        registerModifiedProperty("gdpru");
        _gdpru = gdpru;
    }

    /**
     * [get] EXIMA: {varchar(30)} <br>
     * 加熱式たばこ
     * @return The value of the column 'EXIMA'. (NullAllowed even if selected: for no constraint)
     */
    public String getExima() {
        checkSpecifiedProperty("exima");
        return convertEmptyToNull(_exima);
    }

    /**
     * [set] EXIMA: {varchar(30)} <br>
     * 加熱式たばこ
     * @param exima The value of the column 'EXIMA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExima(String exima) {
        registerModifiedProperty("exima");
        _exima = exima;
    }

    /**
     * [get] EXIMB: {decimal(16, 6)} <br>
     * Ploomカプセル換算本数
     * @return The value of the column 'EXIMB'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getEximb() {
        checkSpecifiedProperty("eximb");
        return _eximb;
    }

    /**
     * [set] EXIMB: {decimal(16, 6)} <br>
     * Ploomカプセル換算本数
     * @param eximb The value of the column 'EXIMB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximb(java.math.BigDecimal eximb) {
        registerModifiedProperty("eximb");
        _eximb = eximb;
    }

    /**
     * [get] EXIMC: {decimal(16, 6)} <br>
     * 加熱式たばこ取引換算本数
     * @return The value of the column 'EXIMC'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getEximc() {
        checkSpecifiedProperty("eximc");
        return _eximc;
    }

    /**
     * [set] EXIMC: {decimal(16, 6)} <br>
     * 加熱式たばこ取引換算本数
     * @param eximc The value of the column 'EXIMC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximc(java.math.BigDecimal eximc) {
        registerModifiedProperty("eximc");
        _eximc = eximc;
    }

    /**
     * [get] EXIMD: {decimal(16, 6)} <br>
     * フィルタ等を除く重量
     * @return The value of the column 'EXIMD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getEximd() {
        checkSpecifiedProperty("eximd");
        return _eximd;
    }

    /**
     * [set] EXIMD: {decimal(16, 6)} <br>
     * フィルタ等を除く重量
     * @param eximd The value of the column 'EXIMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximd(java.math.BigDecimal eximd) {
        registerModifiedProperty("eximd");
        _eximd = eximd;
    }

    /**
     * [get] EXIME: {varchar(60)} <br>
     * 拡張項目E
     * @return The value of the column 'EXIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getExime() {
        checkSpecifiedProperty("exime");
        return convertEmptyToNull(_exime);
    }

    /**
     * [set] EXIME: {varchar(60)} <br>
     * 拡張項目E
     * @param exime The value of the column 'EXIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExime(String exime) {
        registerModifiedProperty("exime");
        _exime = exime;
    }

    /**
     * [get] EXIMF: {varchar(60)} <br>
     * 拡張項目F
     * @return The value of the column 'EXIMF'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximf() {
        checkSpecifiedProperty("eximf");
        return convertEmptyToNull(_eximf);
    }

    /**
     * [set] EXIMF: {varchar(60)} <br>
     * 拡張項目F
     * @param eximf The value of the column 'EXIMF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximf(String eximf) {
        registerModifiedProperty("eximf");
        _eximf = eximf;
    }

    /**
     * [get] EXIMG: {varchar(60)} <br>
     * 拡張項目G
     * @return The value of the column 'EXIMG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximg() {
        checkSpecifiedProperty("eximg");
        return convertEmptyToNull(_eximg);
    }

    /**
     * [set] EXIMG: {varchar(60)} <br>
     * 拡張項目G
     * @param eximg The value of the column 'EXIMG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximg(String eximg) {
        registerModifiedProperty("eximg");
        _eximg = eximg;
    }

    /**
     * [get] EXIMH: {varchar(60)} <br>
     * 拡張項目H
     * @return The value of the column 'EXIMH'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximh() {
        checkSpecifiedProperty("eximh");
        return convertEmptyToNull(_eximh);
    }

    /**
     * [set] EXIMH: {varchar(60)} <br>
     * 拡張項目H
     * @param eximh The value of the column 'EXIMH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximh(String eximh) {
        registerModifiedProperty("eximh");
        _eximh = eximh;
    }

    /**
     * [get] EXIMI: {varchar(60)} <br>
     * 拡張項目I
     * @return The value of the column 'EXIMI'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximi() {
        checkSpecifiedProperty("eximi");
        return convertEmptyToNull(_eximi);
    }

    /**
     * [set] EXIMI: {varchar(60)} <br>
     * 拡張項目I
     * @param eximi The value of the column 'EXIMI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximi(String eximi) {
        registerModifiedProperty("eximi");
        _eximi = eximi;
    }

    /**
     * [get] EXIMJ: {varchar(60)} <br>
     * 拡張項目J
     * @return The value of the column 'EXIMJ'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximj() {
        checkSpecifiedProperty("eximj");
        return convertEmptyToNull(_eximj);
    }

    /**
     * [set] EXIMJ: {varchar(60)} <br>
     * 拡張項目J
     * @param eximj The value of the column 'EXIMJ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximj(String eximj) {
        registerModifiedProperty("eximj");
        _eximj = eximj;
    }

    /**
     * [get] EXIMK: {varchar(60)} <br>
     * 拡張項目K
     * @return The value of the column 'EXIMK'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximk() {
        checkSpecifiedProperty("eximk");
        return convertEmptyToNull(_eximk);
    }

    /**
     * [set] EXIMK: {varchar(60)} <br>
     * 拡張項目K
     * @param eximk The value of the column 'EXIMK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximk(String eximk) {
        registerModifiedProperty("eximk");
        _eximk = eximk;
    }

    /**
     * [get] EXIML: {varchar(60)} <br>
     * 拡張項目L
     * @return The value of the column 'EXIML'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximl() {
        checkSpecifiedProperty("eximl");
        return convertEmptyToNull(_eximl);
    }

    /**
     * [set] EXIML: {varchar(60)} <br>
     * 拡張項目L
     * @param eximl The value of the column 'EXIML'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximl(String eximl) {
        registerModifiedProperty("eximl");
        _eximl = eximl;
    }

    /**
     * [get] EXIMM: {varchar(60)} <br>
     * 拡張項目M
     * @return The value of the column 'EXIMM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximm() {
        checkSpecifiedProperty("eximm");
        return convertEmptyToNull(_eximm);
    }

    /**
     * [set] EXIMM: {varchar(60)} <br>
     * 拡張項目M
     * @param eximm The value of the column 'EXIMM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximm(String eximm) {
        registerModifiedProperty("eximm");
        _eximm = eximm;
    }

    /**
     * [get] EXIMN: {varchar(60)} <br>
     * 拡張項目N
     * @return The value of the column 'EXIMN'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximn() {
        checkSpecifiedProperty("eximn");
        return convertEmptyToNull(_eximn);
    }

    /**
     * [set] EXIMN: {varchar(60)} <br>
     * 拡張項目N
     * @param eximn The value of the column 'EXIMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximn(String eximn) {
        registerModifiedProperty("eximn");
        _eximn = eximn;
    }

    /**
     * [get] EXIMO: {varchar(60)} <br>
     * 拡張項目O
     * @return The value of the column 'EXIMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximo() {
        checkSpecifiedProperty("eximo");
        return convertEmptyToNull(_eximo);
    }

    /**
     * [set] EXIMO: {varchar(60)} <br>
     * 拡張項目O
     * @param eximo The value of the column 'EXIMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximo(String eximo) {
        registerModifiedProperty("eximo");
        _eximo = eximo;
    }

    /**
     * [get] EXIMP: {varchar(60)} <br>
     * 拡張項目P
     * @return The value of the column 'EXIMP'. (NullAllowed even if selected: for no constraint)
     */
    public String getEximp() {
        checkSpecifiedProperty("eximp");
        return convertEmptyToNull(_eximp);
    }

    /**
     * [set] EXIMP: {varchar(60)} <br>
     * 拡張項目P
     * @param eximp The value of the column 'EXIMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEximp(String eximp) {
        registerModifiedProperty("eximp");
        _eximp = eximp;
    }

    /**
     * [get] UPMN: {bigint(19)} <br>
     * 更新者
     * @return The value of the column 'UPMN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUpmn() {
        checkSpecifiedProperty("upmn");
        return _upmn;
    }

    /**
     * [set] UPMN: {bigint(19)} <br>
     * 更新者
     * @param upmn The value of the column 'UPMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpmn(Long upmn) {
        registerModifiedProperty("upmn");
        _upmn = upmn;
    }

    /**
     * [get] CHNGYD: {varchar(8)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getChngyd() {
        checkSpecifiedProperty("chngyd");
        return convertEmptyToNull(_chngyd);
    }

    /**
     * [set] CHNGYD: {varchar(8)} <br>
     * 更新年月日
     * @param chngyd The value of the column 'CHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChngyd(String chngyd) {
        registerModifiedProperty("chngyd");
        _chngyd = chngyd;
    }

    /**
     * [get] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @return The value of the column 'UPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdtm() {
        checkSpecifiedProperty("updtm");
        return convertEmptyToNull(_updtm);
    }

    /**
     * [set] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @param updtm The value of the column 'UPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdtm(String updtm) {
        registerModifiedProperty("updtm");
        _updtm = updtm;
    }

    /**
     * [get] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @return The value of the column 'UPDIS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUpdis() {
        checkSpecifiedProperty("updis");
        return _updis;
    }

    /**
     * [set] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @param updis The value of the column 'UPDIS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdis(Long updis) {
        registerModifiedProperty("updis");
        _updis = updis;
    }

    /**
     * [get] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @return The value of the column 'UPBMN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUpbmn() {
        checkSpecifiedProperty("upbmn");
        return _upbmn;
    }

    /**
     * [set] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @param upbmn The value of the column 'UPBMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpbmn(Long upbmn) {
        registerModifiedProperty("upbmn");
        _upbmn = upbmn;
    }

    /**
     * [get] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @return The value of the column 'BCHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBchngyd() {
        checkSpecifiedProperty("bchngyd");
        return convertEmptyToNull(_bchngyd);
    }

    /**
     * [set] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @param bchngyd The value of the column 'BCHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBchngyd(String bchngyd) {
        registerModifiedProperty("bchngyd");
        _bchngyd = bchngyd;
    }

    /**
     * [get] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @return The value of the column 'BUPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBupdtm() {
        checkSpecifiedProperty("bupdtm");
        return _bupdtm;
    }

    /**
     * [set] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @param bupdtm The value of the column 'BUPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBupdtm(Long bupdtm) {
        registerModifiedProperty("bupdtm");
        _bupdtm = bupdtm;
    }

    /**
     * [get] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @return The value of the column 'UPOBMN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUpobmn() {
        checkSpecifiedProperty("upobmn");
        return _upobmn;
    }

    /**
     * [set] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @param upobmn The value of the column 'UPOBMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpobmn(Long upobmn) {
        registerModifiedProperty("upobmn");
        _upobmn = upobmn;
    }

    /**
     * [get] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @return The value of the column 'OBCHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getObchngyd() {
        checkSpecifiedProperty("obchngyd");
        return convertEmptyToNull(_obchngyd);
    }

    /**
     * [set] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @param obchngyd The value of the column 'OBCHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setObchngyd(String obchngyd) {
        registerModifiedProperty("obchngyd");
        _obchngyd = obchngyd;
    }

    /**
     * [get] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @return The value of the column 'OBUPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getObupdtm() {
        checkSpecifiedProperty("obupdtm");
        return _obupdtm;
    }

    /**
     * [set] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @param obupdtm The value of the column 'OBUPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setObupdtm(Long obupdtm) {
        registerModifiedProperty("obupdtm");
        _obupdtm = obupdtm;
    }

    /**
     * [get] AUBRCHFG: {varchar(30)} <br>
     * 集計銘柄変更区分
     * @return The value of the column 'AUBRCHFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAubrchfg() {
        checkSpecifiedProperty("aubrchfg");
        return convertEmptyToNull(_aubrchfg);
    }

    /**
     * [set] AUBRCHFG: {varchar(30)} <br>
     * 集計銘柄変更区分
     * @param aubrchfg The value of the column 'AUBRCHFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAubrchfg(String aubrchfg) {
        registerModifiedProperty("aubrchfg");
        _aubrchfg = aubrchfg;
    }

    /**
     * [get] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzfrdateh() {
        checkSpecifiedProperty("zzfrdateh");
        return convertEmptyToNull(_zzfrdateh);
    }

    /**
     * [set] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzfrdateh(String zzfrdateh) {
        registerModifiedProperty("zzfrdateh");
        _zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZztodateh() {
        checkSpecifiedProperty("zztodateh");
        return convertEmptyToNull(_zztodateh);
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZztodateh(String zztodateh) {
        registerModifiedProperty("zztodateh");
        _zztodateh = zztodateh;
    }

    /**
     * [get] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcdupdps() {
        checkSpecifiedProperty("rcdupdps");
        return convertEmptyToNull(_rcdupdps);
    }

    /**
     * [set] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcdupdps(String rcdupdps) {
        registerModifiedProperty("rcdupdps");
        _rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @return The value of the column 'UPDUSRID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUpdusrid() {
        checkSpecifiedProperty("updusrid");
        return _updusrid;
    }

    /**
     * [set] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @param updusrid The value of the column 'UPDUSRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdusrid(Long updusrid) {
        registerModifiedProperty("updusrid");
        _updusrid = updusrid;
    }

    /**
     * [get] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @return The value of the column 'UPDPOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdpocd() {
        checkSpecifiedProperty("updpocd");
        return convertEmptyToNull(_updpocd);
    }

    /**
     * [set] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @param updpocd The value of the column 'UPDPOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdpocd(String updpocd) {
        registerModifiedProperty("updpocd");
        _updpocd = updpocd;
    }

    /**
     * [get] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOtcmpfg() {
        checkSpecifiedProperty("otcmpfg");
        return _otcmpfg;
    }

    /**
     * [set] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtcmpfg(java.math.BigDecimal otcmpfg) {
        registerModifiedProperty("otcmpfg");
        _otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTmcmpfg() {
        checkSpecifiedProperty("tmcmpfg");
        return _tmcmpfg;
    }

    /**
     * [set] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTmcmpfg(java.math.BigDecimal tmcmpfg) {
        registerModifiedProperty("tmcmpfg");
        _tmcmpfg = tmcmpfg;
    }

    /**
     * [get] STMID: {varchar(30)} <br>
     * システム区分
     * @return The value of the column 'STMID'. (NullAllowed even if selected: for no constraint)
     */
    public String getStmid() {
        checkSpecifiedProperty("stmid");
        return convertEmptyToNull(_stmid);
    }

    /**
     * [set] STMID: {varchar(30)} <br>
     * システム区分
     * @param stmid The value of the column 'STMID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStmid(String stmid) {
        registerModifiedProperty("stmid");
        _stmid = stmid;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}

package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of M_TSN_PRODUCT as TABLE. <br>
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
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMTsnProductDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tsnProductId;

    /** IMPORT_FLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _importFlg;

    /** ZZMATNR: {varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** BRFNFL: {varchar(255)} */
    @JsonKey
    protected String _brfnfl;

    /** BRFNHF: {varchar(60)} */
    @JsonKey
    protected String _brfnhf;

    /** BRANFL: {varchar(255)} */
    @JsonKey
    protected String _branfl;

    /** BRANHF: {varchar(60)} */
    @JsonKey
    protected String _branhf;

    /** SOBRFNFL: {varchar(255)} */
    @JsonKey
    protected String _sobrfnfl;

    /** SOBRFNHF: {varchar(60)} */
    @JsonKey
    protected String _sobrfnhf;

    /** BRKNAME: {varchar(255)} */
    @JsonKey
    protected String _brkname;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** ZZDEVCID: {bigint(19)} */
    @JsonKey
    protected Long _zzdevcid;

    /** USID: {varchar(30)} */
    @JsonKey
    protected String _usid;

    /** CGRID: {varchar(30)} */
    @JsonKey
    protected String _cgrid;

    /** CBCCCVCE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _cbcccvce;

    /** SFCBQA: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sfcbqa;

    /** CTNUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ctnum;

    /** CBNUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _cbnum;

    /** PATCBQA: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _patcbqa;

    /** ZZSEFFID: {varchar(30)} */
    @JsonKey
    protected String _zzseffid;

    /** ZZABLYMD: {varchar(8)} */
    @JsonKey
    protected String _zzablymd;

    /** CRSPYMD: {varchar(8)} */
    @JsonKey
    protected String _crspymd;

    /** SEYMD: {varchar(8)} */
    @JsonKey
    protected String _seymd;

    /** DPBNYD: {varchar(8)} */
    @JsonKey
    protected String _dpbnyd;

    /** SOBGNYMD: {varchar(8)} */
    @JsonKey
    protected String _sobgnymd;

    /** EXSLYMD: {varchar(8)} */
    @JsonKey
    protected String _exslymd;

    /** AUBRID: {varchar(30)} */
    @JsonKey
    protected String _aubrid;

    /** FWBRID: {varchar(30)} */
    @JsonKey
    protected String _fwbrid;

    /** BRCRID: {varchar(30)} */
    @JsonKey
    protected String _brcrid;

    /** PABRCD: {varchar(60)} */
    @JsonKey
    protected String _pabrcd;

    /** AUBRCD: {varchar(60)} */
    @JsonKey
    protected String _aubrcd;

    /** ZZMATNRA: {varchar(60)} */
    @JsonKey
    protected String _zzmatnra;

    /** MRAUCD: {varchar(60)} */
    @JsonKey
    protected String _mraucd;

    /** ZZSOMIUM: {bigint(19)} */
    @JsonKey
    protected Long _zzsomium;

    /** ZZREGPRCA: {bigint(19)} */
    @JsonKey
    protected Long _zzregprca;

    /** TFPR: {bigint(19)} */
    @JsonKey
    protected Long _tfpr;

    /** MGRTA: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _mgrta;

    /** MGRTOK: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _mgrtok;

    /** TLNPRU: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tlnpru;

    /** HANUMWT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _hanumwt;

    /** CNSCVCT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _cnscvct;

    /** CGTAXCCT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _cgtaxcct;

    /** NTXQART: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ntxqart;

    /** LTXQART: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ltxqart;

    /** ADVTAXRT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _advtaxrt;

    /** CTYTAXRT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ctytaxrt;

    /** PRFPRT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _prfprt;

    /** NOTAX: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _notax;

    /** BRKD: {bigint(19)} */
    @JsonKey
    protected Long _brkd;

    /** FMLYCD: {varchar(30)} */
    @JsonKey
    protected String _fmlycd;

    /** PRGRCD: {varchar(30)} */
    @JsonKey
    protected String _prgrcd;

    /** NCTNCLS: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _nctncls;

    /** TARCLS: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tarcls;

    /** PDPKSPCD: {varchar(30)} */
    @JsonKey
    protected String _pdpkspcd;

    /** FLTID: {varchar(30)} */
    @JsonKey
    protected String _fltid;

    /** KSUBCDID: {varchar(30)} */
    @JsonKey
    protected String _ksubcdid;

    /** KSUBCD: {varchar(30)} */
    @JsonKey
    protected String _ksubcd;

    /** CTBCDID: {varchar(30)} */
    @JsonKey
    protected String _ctbcdid;

    /** CTBCD: {varchar(30)} */
    @JsonKey
    protected String _ctbcd;

    /** CBBCDID: {varchar(30)} */
    @JsonKey
    protected String _cbbcdid;

    /** CBBCD: {varchar(30)} */
    @JsonKey
    protected String _cbbcd;

    /** CTFM: {varchar(30)} */
    @JsonKey
    protected String _ctfm;

    /** CTSZL: {bigint(19)} */
    @JsonKey
    protected Long _ctszl;

    /** CTSZW: {bigint(19)} */
    @JsonKey
    protected Long _ctszw;

    /** CTSZH: {bigint(19)} */
    @JsonKey
    protected Long _ctszh;

    /** CTCC: {bigint(19)} */
    @JsonKey
    protected Long _ctcc;

    /** CTWEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ctweight;

    /** CBSZL: {bigint(19)} */
    @JsonKey
    protected Long _cbszl;

    /** CBSZW: {bigint(19)} */
    @JsonKey
    protected Long _cbszw;

    /** CBSZH: {bigint(19)} */
    @JsonKey
    protected Long _cbszh;

    /** CBCC: {bigint(19)} */
    @JsonKey
    protected Long _cbcc;

    /** CBWT: {bigint(19)} */
    @JsonKey
    protected Long _cbwt;

    /** BSCDT: {varchar(30)} */
    @JsonKey
    protected String _bscdt;

    /** BSCDK: {varchar(30)} */
    @JsonKey
    protected String _bscdk;

    /** BSCDC: {varchar(30)} */
    @JsonKey
    protected String _bscdc;

    /** BSCDQ: {varchar(30)} */
    @JsonKey
    protected String _bscdq;

    /** BSCDH: {varchar(30)} */
    @JsonKey
    protected String _bscdh;

    /** SPAGCDT: {varchar(30)} */
    @JsonKey
    protected String _spagcdt;

    /** SPAGCDK: {varchar(30)} */
    @JsonKey
    protected String _spagcdk;

    /** SPAGCDC: {varchar(30)} */
    @JsonKey
    protected String _spagcdc;

    /** SPAGCDQ: {varchar(30)} */
    @JsonKey
    protected String _spagcdq;

    /** SPAGCDH: {varchar(30)} */
    @JsonKey
    protected String _spagcdh;

    /** RBSCD1: {varchar(30)} */
    @JsonKey
    protected String _rbscd1;

    /** RBSCD2: {varchar(30)} */
    @JsonKey
    protected String _rbscd2;

    /** RBSCD3: {varchar(30)} */
    @JsonKey
    protected String _rbscd3;

    /** RBSCD4: {varchar(30)} */
    @JsonKey
    protected String _rbscd4;

    /** RBSCD5: {varchar(30)} */
    @JsonKey
    protected String _rbscd5;

    /** USSBCD1: {varchar(30)} */
    @JsonKey
    protected String _ussbcd1;

    /** USSBCD2: {varchar(30)} */
    @JsonKey
    protected String _ussbcd2;

    /** USSBCD3: {varchar(30)} */
    @JsonKey
    protected String _ussbcd3;

    /** USSBCD4: {varchar(30)} */
    @JsonKey
    protected String _ussbcd4;

    /** USSBCD5: {varchar(30)} */
    @JsonKey
    protected String _ussbcd5;

    /** SPLCPCD: {varchar(30)} */
    @JsonKey
    protected String _splcpcd;

    /** MAKERCD: {varchar(60)} */
    @JsonKey
    protected String _makercd;

    /** LAND1: {varchar(60)} */
    @JsonKey
    protected String _land1;

    /** CGCLSDID: {varchar(30)} */
    @JsonKey
    protected String _cgclsdid;

    /** GNLOTRNK: {bigint(19)} */
    @JsonKey
    protected Long _gnlotrnk;

    /** MROTRNK: {bigint(19)} */
    @JsonKey
    protected Long _mrotrnk;

    /** COID: {varchar(30)} */
    @JsonKey
    protected String _coid;

    /** BRWKID: {varchar(30)} */
    @JsonKey
    protected String _brwkid;

    /** SHUNID: {varchar(30)} */
    @JsonKey
    protected String _shunid;

    /** DSTKBN: {varchar(30)} */
    @JsonKey
    protected String _dstkbn;

    /** REOMATNR: {bigint(19)} */
    @JsonKey
    protected Long _reomatnr;

    /** DSPECKB: {varchar(30)} */
    @JsonKey
    protected String _dspeckb;

    /** SGMID: {varchar(30)} */
    @JsonKey
    protected String _sgmid;

    /** MAKILENG: {varchar(60)} */
    @JsonKey
    protected String _makileng;

    /** MAKIDIA: {varchar(60)} */
    @JsonKey
    protected String _makidia;

    /** GDMSRP: {bigint(19)} */
    @JsonKey
    protected Long _gdmsrp;

    /** GDSLU: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _gdslu;

    /** GDPRU: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _gdpru;

    /** EXIMA: {varchar(30)} */
    @JsonKey
    protected String _exima;

    /** EXIMB: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _eximb;

    /** EXIMC: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _eximc;

    /** EXIMD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _eximd;

    /** EXIME: {varchar(60)} */
    @JsonKey
    protected String _exime;

    /** EXIMF: {varchar(60)} */
    @JsonKey
    protected String _eximf;

    /** EXIMG: {varchar(60)} */
    @JsonKey
    protected String _eximg;

    /** EXIMH: {varchar(60)} */
    @JsonKey
    protected String _eximh;

    /** EXIMI: {varchar(60)} */
    @JsonKey
    protected String _eximi;

    /** EXIMJ: {varchar(60)} */
    @JsonKey
    protected String _eximj;

    /** EXIMK: {varchar(60)} */
    @JsonKey
    protected String _eximk;

    /** EXIML: {varchar(60)} */
    @JsonKey
    protected String _eximl;

    /** EXIMM: {varchar(60)} */
    @JsonKey
    protected String _eximm;

    /** EXIMN: {varchar(60)} */
    @JsonKey
    protected String _eximn;

    /** EXIMO: {varchar(60)} */
    @JsonKey
    protected String _eximo;

    /** EXIMP: {varchar(60)} */
    @JsonKey
    protected String _eximp;

    /** UPMN: {bigint(19)} */
    @JsonKey
    protected Long _upmn;

    /** CHNGYD: {varchar(8)} */
    @JsonKey
    protected String _chngyd;

    /** UPDTM: {varchar(30)} */
    @JsonKey
    protected String _updtm;

    /** UPDIS: {bigint(19)} */
    @JsonKey
    protected Long _updis;

    /** UPBMN: {bigint(19)} */
    @JsonKey
    protected Long _upbmn;

    /** BCHNGYD: {varchar(8)} */
    @JsonKey
    protected String _bchngyd;

    /** BUPDTM: {bigint(19)} */
    @JsonKey
    protected Long _bupdtm;

    /** UPOBMN: {bigint(19)} */
    @JsonKey
    protected Long _upobmn;

    /** OBCHNGYD: {varchar(8)} */
    @JsonKey
    protected String _obchngyd;

    /** OBUPDTM: {bigint(19)} */
    @JsonKey
    protected Long _obupdtm;

    /** AUBRCHFG: {varchar(30)} */
    @JsonKey
    protected String _aubrchfg;

    /** ZZFRDATEH: {varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** RCDUPDPS: {varchar(30)} */
    @JsonKey
    protected String _rcdupdps;

    /** UPDUSRID: {bigint(19)} */
    @JsonKey
    protected Long _updusrid;

    /** UPDPOCD: {varchar(30)} */
    @JsonKey
    protected String _updpocd;

    /** OTCMPFG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _otcmpfg;

    /** TMCMPFG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tmcmpfg;

    /** STMID: {varchar(30)} */
    @JsonKey
    protected String _stmid;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMTsnProductDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMTsnProductDto)) { return false; }
        final BsMTsnProductDto otherEntity = (BsMTsnProductDto)other;
        if (!helpComparingValue(getTsnProductId(), otherEntity.getTsnProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_TSN_PRODUCT");
        result = xCH(result, getTsnProductId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getTsnProductId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getBrfnfl());
        sb.append(c).append(getBrfnhf());
        sb.append(c).append(getBranfl());
        sb.append(c).append(getBranhf());
        sb.append(c).append(getSobrfnfl());
        sb.append(c).append(getSobrfnhf());
        sb.append(c).append(getBrkname());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getZzdevcid());
        sb.append(c).append(getUsid());
        sb.append(c).append(getCgrid());
        sb.append(c).append(getCbcccvce());
        sb.append(c).append(getSfcbqa());
        sb.append(c).append(getCtnum());
        sb.append(c).append(getCbnum());
        sb.append(c).append(getPatcbqa());
        sb.append(c).append(getZzseffid());
        sb.append(c).append(getZzablymd());
        sb.append(c).append(getCrspymd());
        sb.append(c).append(getSeymd());
        sb.append(c).append(getDpbnyd());
        sb.append(c).append(getSobgnymd());
        sb.append(c).append(getExslymd());
        sb.append(c).append(getAubrid());
        sb.append(c).append(getFwbrid());
        sb.append(c).append(getBrcrid());
        sb.append(c).append(getPabrcd());
        sb.append(c).append(getAubrcd());
        sb.append(c).append(getZzmatnra());
        sb.append(c).append(getMraucd());
        sb.append(c).append(getZzsomium());
        sb.append(c).append(getZzregprca());
        sb.append(c).append(getTfpr());
        sb.append(c).append(getMgrta());
        sb.append(c).append(getMgrtok());
        sb.append(c).append(getTlnpru());
        sb.append(c).append(getHanumwt());
        sb.append(c).append(getCnscvct());
        sb.append(c).append(getCgtaxcct());
        sb.append(c).append(getNtxqart());
        sb.append(c).append(getLtxqart());
        sb.append(c).append(getAdvtaxrt());
        sb.append(c).append(getCtytaxrt());
        sb.append(c).append(getPrfprt());
        sb.append(c).append(getNotax());
        sb.append(c).append(getBrkd());
        sb.append(c).append(getFmlycd());
        sb.append(c).append(getPrgrcd());
        sb.append(c).append(getNctncls());
        sb.append(c).append(getTarcls());
        sb.append(c).append(getPdpkspcd());
        sb.append(c).append(getFltid());
        sb.append(c).append(getKsubcdid());
        sb.append(c).append(getKsubcd());
        sb.append(c).append(getCtbcdid());
        sb.append(c).append(getCtbcd());
        sb.append(c).append(getCbbcdid());
        sb.append(c).append(getCbbcd());
        sb.append(c).append(getCtfm());
        sb.append(c).append(getCtszl());
        sb.append(c).append(getCtszw());
        sb.append(c).append(getCtszh());
        sb.append(c).append(getCtcc());
        sb.append(c).append(getCtweight());
        sb.append(c).append(getCbszl());
        sb.append(c).append(getCbszw());
        sb.append(c).append(getCbszh());
        sb.append(c).append(getCbcc());
        sb.append(c).append(getCbwt());
        sb.append(c).append(getBscdt());
        sb.append(c).append(getBscdk());
        sb.append(c).append(getBscdc());
        sb.append(c).append(getBscdq());
        sb.append(c).append(getBscdh());
        sb.append(c).append(getSpagcdt());
        sb.append(c).append(getSpagcdk());
        sb.append(c).append(getSpagcdc());
        sb.append(c).append(getSpagcdq());
        sb.append(c).append(getSpagcdh());
        sb.append(c).append(getRbscd1());
        sb.append(c).append(getRbscd2());
        sb.append(c).append(getRbscd3());
        sb.append(c).append(getRbscd4());
        sb.append(c).append(getRbscd5());
        sb.append(c).append(getUssbcd1());
        sb.append(c).append(getUssbcd2());
        sb.append(c).append(getUssbcd3());
        sb.append(c).append(getUssbcd4());
        sb.append(c).append(getUssbcd5());
        sb.append(c).append(getSplcpcd());
        sb.append(c).append(getMakercd());
        sb.append(c).append(getLand1());
        sb.append(c).append(getCgclsdid());
        sb.append(c).append(getGnlotrnk());
        sb.append(c).append(getMrotrnk());
        sb.append(c).append(getCoid());
        sb.append(c).append(getBrwkid());
        sb.append(c).append(getShunid());
        sb.append(c).append(getDstkbn());
        sb.append(c).append(getReomatnr());
        sb.append(c).append(getDspeckb());
        sb.append(c).append(getSgmid());
        sb.append(c).append(getMakileng());
        sb.append(c).append(getMakidia());
        sb.append(c).append(getGdmsrp());
        sb.append(c).append(getGdslu());
        sb.append(c).append(getGdpru());
        sb.append(c).append(getExima());
        sb.append(c).append(getEximb());
        sb.append(c).append(getEximc());
        sb.append(c).append(getEximd());
        sb.append(c).append(getExime());
        sb.append(c).append(getEximf());
        sb.append(c).append(getEximg());
        sb.append(c).append(getEximh());
        sb.append(c).append(getEximi());
        sb.append(c).append(getEximj());
        sb.append(c).append(getEximk());
        sb.append(c).append(getEximl());
        sb.append(c).append(getEximm());
        sb.append(c).append(getEximn());
        sb.append(c).append(getEximo());
        sb.append(c).append(getEximp());
        sb.append(c).append(getUpmn());
        sb.append(c).append(getChngyd());
        sb.append(c).append(getUpdtm());
        sb.append(c).append(getUpdis());
        sb.append(c).append(getUpbmn());
        sb.append(c).append(getBchngyd());
        sb.append(c).append(getBupdtm());
        sb.append(c).append(getUpobmn());
        sb.append(c).append(getObchngyd());
        sb.append(c).append(getObupdtm());
        sb.append(c).append(getAubrchfg());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getRcdupdps());
        sb.append(c).append(getUpdusrid());
        sb.append(c).append(getUpdpocd());
        sb.append(c).append(getOtcmpfg());
        sb.append(c).append(getTmcmpfg());
        sb.append(c).append(getStmid());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN銘柄マスタID
     * @return The value of the column 'TSN_PRODUCT_ID'. (NullAllowed)
     */
    public Long getTsnProductId() {
        return _tsnProductId;
    }

    /**
     * [set] TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSN銘柄マスタID
     * @param tsnProductId The value of the column 'TSN_PRODUCT_ID'. (NullAllowed)
     */
    public void setTsnProductId(Long tsnProductId) {
        __modifiedProperties.add("tsnProductId");
        this._tsnProductId = tsnProductId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'BRFNFL'. (NullAllowed)
     */
    public String getBrfnfl() {
        return _brfnfl;
    }

    /**
     * [set] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @param brfnfl The value of the column 'BRFNFL'. (NullAllowed)
     */
    public void setBrfnfl(String brfnfl) {
        __modifiedProperties.add("brfnfl");
        this._brfnfl = brfnfl;
    }

    /**
     * [get] BRFNHF: {varchar(60)} <br>
     * 銘柄名正称(半角)
     * @return The value of the column 'BRFNHF'. (NullAllowed)
     */
    public String getBrfnhf() {
        return _brfnhf;
    }

    /**
     * [set] BRFNHF: {varchar(60)} <br>
     * 銘柄名正称(半角)
     * @param brfnhf The value of the column 'BRFNHF'. (NullAllowed)
     */
    public void setBrfnhf(String brfnhf) {
        __modifiedProperties.add("brfnhf");
        this._brfnhf = brfnhf;
    }

    /**
     * [get] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @return The value of the column 'BRANFL'. (NullAllowed)
     */
    public String getBranfl() {
        return _branfl;
    }

    /**
     * [set] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @param branfl The value of the column 'BRANFL'. (NullAllowed)
     */
    public void setBranfl(String branfl) {
        __modifiedProperties.add("branfl");
        this._branfl = branfl;
    }

    /**
     * [get] BRANHF: {varchar(60)} <br>
     * 銘柄名略称(半角)
     * @return The value of the column 'BRANHF'. (NullAllowed)
     */
    public String getBranhf() {
        return _branhf;
    }

    /**
     * [set] BRANHF: {varchar(60)} <br>
     * 銘柄名略称(半角)
     * @param branhf The value of the column 'BRANHF'. (NullAllowed)
     */
    public void setBranhf(String branhf) {
        __modifiedProperties.add("branhf");
        this._branhf = branhf;
    }

    /**
     * [get] SOBRFNFL: {varchar(255)} <br>
     * 受注用銘柄名称（全角）
     * @return The value of the column 'SOBRFNFL'. (NullAllowed)
     */
    public String getSobrfnfl() {
        return _sobrfnfl;
    }

    /**
     * [set] SOBRFNFL: {varchar(255)} <br>
     * 受注用銘柄名称（全角）
     * @param sobrfnfl The value of the column 'SOBRFNFL'. (NullAllowed)
     */
    public void setSobrfnfl(String sobrfnfl) {
        __modifiedProperties.add("sobrfnfl");
        this._sobrfnfl = sobrfnfl;
    }

    /**
     * [get] SOBRFNHF: {varchar(60)} <br>
     * 受注用銘柄名称（半角）
     * @return The value of the column 'SOBRFNHF'. (NullAllowed)
     */
    public String getSobrfnhf() {
        return _sobrfnhf;
    }

    /**
     * [set] SOBRFNHF: {varchar(60)} <br>
     * 受注用銘柄名称（半角）
     * @param sobrfnhf The value of the column 'SOBRFNHF'. (NullAllowed)
     */
    public void setSobrfnhf(String sobrfnhf) {
        __modifiedProperties.add("sobrfnhf");
        this._sobrfnhf = sobrfnhf;
    }

    /**
     * [get] BRKNAME: {varchar(255)} <br>
     * 銘柄名英字
     * @return The value of the column 'BRKNAME'. (NullAllowed)
     */
    public String getBrkname() {
        return _brkname;
    }

    /**
     * [set] BRKNAME: {varchar(255)} <br>
     * 銘柄名英字
     * @param brkname The value of the column 'BRKNAME'. (NullAllowed)
     */
    public void setBrkname(String brkname) {
        __modifiedProperties.add("brkname");
        this._brkname = brkname;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] ZZDEVCID: {bigint(19)} <br>
     * 装置本数
     * @return The value of the column 'ZZDEVCID'. (NullAllowed)
     */
    public Long getZzdevcid() {
        return _zzdevcid;
    }

    /**
     * [set] ZZDEVCID: {bigint(19)} <br>
     * 装置本数
     * @param zzdevcid The value of the column 'ZZDEVCID'. (NullAllowed)
     */
    public void setZzdevcid(Long zzdevcid) {
        __modifiedProperties.add("zzdevcid");
        this._zzdevcid = zzdevcid;
    }

    /**
     * [get] USID: {varchar(30)} <br>
     * 使用区分
     * @return The value of the column 'USID'. (NullAllowed)
     */
    public String getUsid() {
        return _usid;
    }

    /**
     * [set] USID: {varchar(30)} <br>
     * 使用区分
     * @param usid The value of the column 'USID'. (NullAllowed)
     */
    public void setUsid(String usid) {
        __modifiedProperties.add("usid");
        this._usid = usid;
    }

    /**
     * [get] CGRID: {varchar(30)} <br>
     * たばこ区分
     * @return The value of the column 'CGRID'. (NullAllowed)
     */
    public String getCgrid() {
        return _cgrid;
    }

    /**
     * [set] CGRID: {varchar(30)} <br>
     * たばこ区分
     * @param cgrid The value of the column 'CGRID'. (NullAllowed)
     */
    public void setCgrid(String cgrid) {
        __modifiedProperties.add("cgrid");
        this._cgrid = cgrid;
    }

    /**
     * [get] CBCCCVCE: {decimal(16, 6)} <br>
     * 段ボール容積換算係数
     * @return The value of the column 'CBCCCVCE'. (NullAllowed)
     */
    public java.math.BigDecimal getCbcccvce() {
        return _cbcccvce;
    }

    /**
     * [set] CBCCCVCE: {decimal(16, 6)} <br>
     * 段ボール容積換算係数
     * @param cbcccvce The value of the column 'CBCCCVCE'. (NullAllowed)
     */
    public void setCbcccvce(java.math.BigDecimal cbcccvce) {
        __modifiedProperties.add("cbcccvce");
        this._cbcccvce = cbcccvce;
    }

    /**
     * [get] SFCBQA: {decimal(16, 6)} <br>
     * 1面当段ボール数
     * @return The value of the column 'SFCBQA'. (NullAllowed)
     */
    public java.math.BigDecimal getSfcbqa() {
        return _sfcbqa;
    }

    /**
     * [set] SFCBQA: {decimal(16, 6)} <br>
     * 1面当段ボール数
     * @param sfcbqa The value of the column 'SFCBQA'. (NullAllowed)
     */
    public void setSfcbqa(java.math.BigDecimal sfcbqa) {
        __modifiedProperties.add("sfcbqa");
        this._sfcbqa = sfcbqa;
    }

    /**
     * [get] CTNUM: {decimal(16, 6)} <br>
     * 1カートン当個数
     * @return The value of the column 'CTNUM'. (NullAllowed)
     */
    public java.math.BigDecimal getCtnum() {
        return _ctnum;
    }

    /**
     * [set] CTNUM: {decimal(16, 6)} <br>
     * 1カートン当個数
     * @param ctnum The value of the column 'CTNUM'. (NullAllowed)
     */
    public void setCtnum(java.math.BigDecimal ctnum) {
        __modifiedProperties.add("ctnum");
        this._ctnum = ctnum;
    }

    /**
     * [get] CBNUM: {decimal(16, 6)} <br>
     * 1段ボール当個数
     * @return The value of the column 'CBNUM'. (NullAllowed)
     */
    public java.math.BigDecimal getCbnum() {
        return _cbnum;
    }

    /**
     * [set] CBNUM: {decimal(16, 6)} <br>
     * 1段ボール当個数
     * @param cbnum The value of the column 'CBNUM'. (NullAllowed)
     */
    public void setCbnum(java.math.BigDecimal cbnum) {
        __modifiedProperties.add("cbnum");
        this._cbnum = cbnum;
    }

    /**
     * [get] PATCBQA: {decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @return The value of the column 'PATCBQA'. (NullAllowed)
     */
    public java.math.BigDecimal getPatcbqa() {
        return _patcbqa;
    }

    /**
     * [set] PATCBQA: {decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @param patcbqa The value of the column 'PATCBQA'. (NullAllowed)
     */
    public void setPatcbqa(java.math.BigDecimal patcbqa) {
        __modifiedProperties.add("patcbqa");
        this._patcbqa = patcbqa;
    }

    /**
     * [get] ZZSEFFID: {varchar(30)} <br>
     * 売り尽し区分
     * @return The value of the column 'ZZSEFFID'. (NullAllowed)
     */
    public String getZzseffid() {
        return _zzseffid;
    }

    /**
     * [set] ZZSEFFID: {varchar(30)} <br>
     * 売り尽し区分
     * @param zzseffid The value of the column 'ZZSEFFID'. (NullAllowed)
     */
    public void setZzseffid(String zzseffid) {
        __modifiedProperties.add("zzseffid");
        this._zzseffid = zzseffid;
    }

    /**
     * [get] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public String getZzablymd() {
        return _zzablymd;
    }

    /**
     * [set] ZZABLYMD: {varchar(8)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed)
     */
    public void setZzablymd(String zzablymd) {
        __modifiedProperties.add("zzablymd");
        this._zzablymd = zzablymd;
    }

    /**
     * [get] CRSPYMD: {varchar(8)} <br>
     * 取扱中止年月日
     * @return The value of the column 'CRSPYMD'. (NullAllowed)
     */
    public String getCrspymd() {
        return _crspymd;
    }

    /**
     * [set] CRSPYMD: {varchar(8)} <br>
     * 取扱中止年月日
     * @param crspymd The value of the column 'CRSPYMD'. (NullAllowed)
     */
    public void setCrspymd(String crspymd) {
        __modifiedProperties.add("crspymd");
        this._crspymd = crspymd;
    }

    /**
     * [get] SEYMD: {varchar(8)} <br>
     * 発売年月日
     * @return The value of the column 'SEYMD'. (NullAllowed)
     */
    public String getSeymd() {
        return _seymd;
    }

    /**
     * [set] SEYMD: {varchar(8)} <br>
     * 発売年月日
     * @param seymd The value of the column 'SEYMD'. (NullAllowed)
     */
    public void setSeymd(String seymd) {
        __modifiedProperties.add("seymd");
        this._seymd = seymd;
    }

    /**
     * [get] DPBNYD: {varchar(8)} <br>
     * 表示開始年月日
     * @return The value of the column 'DPBNYD'. (NullAllowed)
     */
    public String getDpbnyd() {
        return _dpbnyd;
    }

    /**
     * [set] DPBNYD: {varchar(8)} <br>
     * 表示開始年月日
     * @param dpbnyd The value of the column 'DPBNYD'. (NullAllowed)
     */
    public void setDpbnyd(String dpbnyd) {
        __modifiedProperties.add("dpbnyd");
        this._dpbnyd = dpbnyd;
    }

    /**
     * [get] SOBGNYMD: {varchar(8)} <br>
     * 受注開始年月日
     * @return The value of the column 'SOBGNYMD'. (NullAllowed)
     */
    public String getSobgnymd() {
        return _sobgnymd;
    }

    /**
     * [set] SOBGNYMD: {varchar(8)} <br>
     * 受注開始年月日
     * @param sobgnymd The value of the column 'SOBGNYMD'. (NullAllowed)
     */
    public void setSobgnymd(String sobgnymd) {
        __modifiedProperties.add("sobgnymd");
        this._sobgnymd = sobgnymd;
    }

    /**
     * [get] EXSLYMD: {varchar(8)} <br>
     * 拡販年月日
     * @return The value of the column 'EXSLYMD'. (NullAllowed)
     */
    public String getExslymd() {
        return _exslymd;
    }

    /**
     * [set] EXSLYMD: {varchar(8)} <br>
     * 拡販年月日
     * @param exslymd The value of the column 'EXSLYMD'. (NullAllowed)
     */
    public void setExslymd(String exslymd) {
        __modifiedProperties.add("exslymd");
        this._exslymd = exslymd;
    }

    /**
     * [get] AUBRID: {varchar(30)} <br>
     * 集計銘柄区分
     * @return The value of the column 'AUBRID'. (NullAllowed)
     */
    public String getAubrid() {
        return _aubrid;
    }

    /**
     * [set] AUBRID: {varchar(30)} <br>
     * 集計銘柄区分
     * @param aubrid The value of the column 'AUBRID'. (NullAllowed)
     */
    public void setAubrid(String aubrid) {
        __modifiedProperties.add("aubrid");
        this._aubrid = aubrid;
    }

    /**
     * [get] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'FWBRID'. (NullAllowed)
     */
    public String getFwbrid() {
        return _fwbrid;
    }

    /**
     * [set] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @param fwbrid The value of the column 'FWBRID'. (NullAllowed)
     */
    public void setFwbrid(String fwbrid) {
        __modifiedProperties.add("fwbrid");
        this._fwbrid = fwbrid;
    }

    /**
     * [get] BRCRID: {varchar(30)} <br>
     * 銘柄取扱区分
     * @return The value of the column 'BRCRID'. (NullAllowed)
     */
    public String getBrcrid() {
        return _brcrid;
    }

    /**
     * [set] BRCRID: {varchar(30)} <br>
     * 銘柄取扱区分
     * @param brcrid The value of the column 'BRCRID'. (NullAllowed)
     */
    public void setBrcrid(String brcrid) {
        __modifiedProperties.add("brcrid");
        this._brcrid = brcrid;
    }

    /**
     * [get] PABRCD: {varchar(60)} <br>
     * 親銘柄コード
     * @return The value of the column 'PABRCD'. (NullAllowed)
     */
    public String getPabrcd() {
        return _pabrcd;
    }

    /**
     * [set] PABRCD: {varchar(60)} <br>
     * 親銘柄コード
     * @param pabrcd The value of the column 'PABRCD'. (NullAllowed)
     */
    public void setPabrcd(String pabrcd) {
        __modifiedProperties.add("pabrcd");
        this._pabrcd = pabrcd;
    }

    /**
     * [get] AUBRCD: {varchar(60)} <br>
     * 庫内作業集約コード
     * @return The value of the column 'AUBRCD'. (NullAllowed)
     */
    public String getAubrcd() {
        return _aubrcd;
    }

    /**
     * [set] AUBRCD: {varchar(60)} <br>
     * 庫内作業集約コード
     * @param aubrcd The value of the column 'AUBRCD'. (NullAllowed)
     */
    public void setAubrcd(String aubrcd) {
        __modifiedProperties.add("aubrcd");
        this._aubrcd = aubrcd;
    }

    /**
     * [get] ZZMATNRA: {varchar(60)} <br>
     * 出納用銘柄コード
     * @return The value of the column 'ZZMATNRA'. (NullAllowed)
     */
    public String getZzmatnra() {
        return _zzmatnra;
    }

    /**
     * [set] ZZMATNRA: {varchar(60)} <br>
     * 出納用銘柄コード
     * @param zzmatnra The value of the column 'ZZMATNRA'. (NullAllowed)
     */
    public void setZzmatnra(String zzmatnra) {
        __modifiedProperties.add("zzmatnra");
        this._zzmatnra = zzmatnra;
    }

    /**
     * [get] MRAUCD: {varchar(60)} <br>
     * 月報用集計コード
     * @return The value of the column 'MRAUCD'. (NullAllowed)
     */
    public String getMraucd() {
        return _mraucd;
    }

    /**
     * [set] MRAUCD: {varchar(60)} <br>
     * 月報用集計コード
     * @param mraucd The value of the column 'MRAUCD'. (NullAllowed)
     */
    public void setMraucd(String mraucd) {
        __modifiedProperties.add("mraucd");
        this._mraucd = mraucd;
    }

    /**
     * [get] ZZSOMIUM: {bigint(19)} <br>
     * 最小受注単位
     * @return The value of the column 'ZZSOMIUM'. (NullAllowed)
     */
    public Long getZzsomium() {
        return _zzsomium;
    }

    /**
     * [set] ZZSOMIUM: {bigint(19)} <br>
     * 最小受注単位
     * @param zzsomium The value of the column 'ZZSOMIUM'. (NullAllowed)
     */
    public void setZzsomium(Long zzsomium) {
        __modifiedProperties.add("zzsomium");
        this._zzsomium = zzsomium;
    }

    /**
     * [get] ZZREGPRCA: {bigint(19)} <br>
     * 定価
     * @return The value of the column 'ZZREGPRCA'. (NullAllowed)
     */
    public Long getZzregprca() {
        return _zzregprca;
    }

    /**
     * [set] ZZREGPRCA: {bigint(19)} <br>
     * 定価
     * @param zzregprca The value of the column 'ZZREGPRCA'. (NullAllowed)
     */
    public void setZzregprca(Long zzregprca) {
        __modifiedProperties.add("zzregprca");
        this._zzregprca = zzregprca;
    }

    /**
     * [get] TFPR: {bigint(19)} <br>
     * 振替価格
     * @return The value of the column 'TFPR'. (NullAllowed)
     */
    public Long getTfpr() {
        return _tfpr;
    }

    /**
     * [set] TFPR: {bigint(19)} <br>
     * 振替価格
     * @param tfpr The value of the column 'TFPR'. (NullAllowed)
     */
    public void setTfpr(Long tfpr) {
        __modifiedProperties.add("tfpr");
        this._tfpr = tfpr;
    }

    /**
     * [get] MGRTA: {decimal(16, 6)} <br>
     * マージン率(全国)
     * @return The value of the column 'MGRTA'. (NullAllowed)
     */
    public java.math.BigDecimal getMgrta() {
        return _mgrta;
    }

    /**
     * [set] MGRTA: {decimal(16, 6)} <br>
     * マージン率(全国)
     * @param mgrta The value of the column 'MGRTA'. (NullAllowed)
     */
    public void setMgrta(java.math.BigDecimal mgrta) {
        __modifiedProperties.add("mgrta");
        this._mgrta = mgrta;
    }

    /**
     * [get] MGRTOK: {decimal(16, 6)} <br>
     * マージン率(沖縄)
     * @return The value of the column 'MGRTOK'. (NullAllowed)
     */
    public java.math.BigDecimal getMgrtok() {
        return _mgrtok;
    }

    /**
     * [set] MGRTOK: {decimal(16, 6)} <br>
     * マージン率(沖縄)
     * @param mgrtok The value of the column 'MGRTOK'. (NullAllowed)
     */
    public void setMgrtok(java.math.BigDecimal mgrtok) {
        __modifiedProperties.add("mgrtok");
        this._mgrtok = mgrtok;
    }

    /**
     * [get] TLNPRU: {decimal(16, 6)} <br>
     * 千本当仕入価格(TSN)
     * @return The value of the column 'TLNPRU'. (NullAllowed)
     */
    public java.math.BigDecimal getTlnpru() {
        return _tlnpru;
    }

    /**
     * [set] TLNPRU: {decimal(16, 6)} <br>
     * 千本当仕入価格(TSN)
     * @param tlnpru The value of the column 'TLNPRU'. (NullAllowed)
     */
    public void setTlnpru(java.math.BigDecimal tlnpru) {
        __modifiedProperties.add("tlnpru");
        this._tlnpru = tlnpru;
    }

    /**
     * [get] HANUMWT: {decimal(16, 6)} <br>
     * 端数有り個装重量
     * @return The value of the column 'HANUMWT'. (NullAllowed)
     */
    public java.math.BigDecimal getHanumwt() {
        return _hanumwt;
    }

    /**
     * [set] HANUMWT: {decimal(16, 6)} <br>
     * 端数有り個装重量
     * @param hanumwt The value of the column 'HANUMWT'. (NullAllowed)
     */
    public void setHanumwt(java.math.BigDecimal hanumwt) {
        __modifiedProperties.add("hanumwt");
        this._hanumwt = hanumwt;
    }

    /**
     * [get] CNSCVCT: {decimal(16, 6)} <br>
     * 消費税換算本数
     * @return The value of the column 'CNSCVCT'. (NullAllowed)
     */
    public java.math.BigDecimal getCnscvct() {
        return _cnscvct;
    }

    /**
     * [set] CNSCVCT: {decimal(16, 6)} <br>
     * 消費税換算本数
     * @param cnscvct The value of the column 'CNSCVCT'. (NullAllowed)
     */
    public void setCnscvct(java.math.BigDecimal cnscvct) {
        __modifiedProperties.add("cnscvct");
        this._cnscvct = cnscvct;
    }

    /**
     * [get] CGTAXCCT: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @return The value of the column 'CGTAXCCT'. (NullAllowed)
     */
    public java.math.BigDecimal getCgtaxcct() {
        return _cgtaxcct;
    }

    /**
     * [set] CGTAXCCT: {decimal(16, 6)} <br>
     * たばこ税換算本数
     * @param cgtaxcct The value of the column 'CGTAXCCT'. (NullAllowed)
     */
    public void setCgtaxcct(java.math.BigDecimal cgtaxcct) {
        __modifiedProperties.add("cgtaxcct");
        this._cgtaxcct = cgtaxcct;
    }

    /**
     * [get] NTXQART: {decimal(16, 6)} <br>
     * 国税従量税率
     * @return The value of the column 'NTXQART'. (NullAllowed)
     */
    public java.math.BigDecimal getNtxqart() {
        return _ntxqart;
    }

    /**
     * [set] NTXQART: {decimal(16, 6)} <br>
     * 国税従量税率
     * @param ntxqart The value of the column 'NTXQART'. (NullAllowed)
     */
    public void setNtxqart(java.math.BigDecimal ntxqart) {
        __modifiedProperties.add("ntxqart");
        this._ntxqart = ntxqart;
    }

    /**
     * [get] LTXQART: {decimal(16, 6)} <br>
     * 地方税従量税率
     * @return The value of the column 'LTXQART'. (NullAllowed)
     */
    public java.math.BigDecimal getLtxqart() {
        return _ltxqart;
    }

    /**
     * [set] LTXQART: {decimal(16, 6)} <br>
     * 地方税従量税率
     * @param ltxqart The value of the column 'LTXQART'. (NullAllowed)
     */
    public void setLtxqart(java.math.BigDecimal ltxqart) {
        __modifiedProperties.add("ltxqart");
        this._ltxqart = ltxqart;
    }

    /**
     * [get] ADVTAXRT: {decimal(16, 6)} <br>
     * 都道府県税率
     * @return The value of the column 'ADVTAXRT'. (NullAllowed)
     */
    public java.math.BigDecimal getAdvtaxrt() {
        return _advtaxrt;
    }

    /**
     * [set] ADVTAXRT: {decimal(16, 6)} <br>
     * 都道府県税率
     * @param advtaxrt The value of the column 'ADVTAXRT'. (NullAllowed)
     */
    public void setAdvtaxrt(java.math.BigDecimal advtaxrt) {
        __modifiedProperties.add("advtaxrt");
        this._advtaxrt = advtaxrt;
    }

    /**
     * [get] CTYTAXRT: {decimal(16, 6)} <br>
     * 市町村税率
     * @return The value of the column 'CTYTAXRT'. (NullAllowed)
     */
    public java.math.BigDecimal getCtytaxrt() {
        return _ctytaxrt;
    }

    /**
     * [set] CTYTAXRT: {decimal(16, 6)} <br>
     * 市町村税率
     * @param ctytaxrt The value of the column 'CTYTAXRT'. (NullAllowed)
     */
    public void setCtytaxrt(java.math.BigDecimal ctytaxrt) {
        __modifiedProperties.add("ctytaxrt");
        this._ctytaxrt = ctytaxrt;
    }

    /**
     * [get] PRFPRT: {decimal(16, 6)} <br>
     * 利益額(千本当)
     * @return The value of the column 'PRFPRT'. (NullAllowed)
     */
    public java.math.BigDecimal getPrfprt() {
        return _prfprt;
    }

    /**
     * [set] PRFPRT: {decimal(16, 6)} <br>
     * 利益額(千本当)
     * @param prfprt The value of the column 'PRFPRT'. (NullAllowed)
     */
    public void setPrfprt(java.math.BigDecimal prfprt) {
        __modifiedProperties.add("prfprt");
        this._prfprt = prfprt;
    }

    /**
     * [get] NOTAX: {decimal(16, 6)} <br>
     * 1本当税額
     * @return The value of the column 'NOTAX'. (NullAllowed)
     */
    public java.math.BigDecimal getNotax() {
        return _notax;
    }

    /**
     * [set] NOTAX: {decimal(16, 6)} <br>
     * 1本当税額
     * @param notax The value of the column 'NOTAX'. (NullAllowed)
     */
    public void setNotax(java.math.BigDecimal notax) {
        __modifiedProperties.add("notax");
        this._notax = notax;
    }

    /**
     * [get] BRKD: {bigint(19)} <br>
     * 銘柄種類
     * @return The value of the column 'BRKD'. (NullAllowed)
     */
    public Long getBrkd() {
        return _brkd;
    }

    /**
     * [set] BRKD: {bigint(19)} <br>
     * 銘柄種類
     * @param brkd The value of the column 'BRKD'. (NullAllowed)
     */
    public void setBrkd(Long brkd) {
        __modifiedProperties.add("brkd");
        this._brkd = brkd;
    }

    /**
     * [get] FMLYCD: {varchar(30)} <br>
     * ファミリー・コード
     * @return The value of the column 'FMLYCD'. (NullAllowed)
     */
    public String getFmlycd() {
        return _fmlycd;
    }

    /**
     * [set] FMLYCD: {varchar(30)} <br>
     * ファミリー・コード
     * @param fmlycd The value of the column 'FMLYCD'. (NullAllowed)
     */
    public void setFmlycd(String fmlycd) {
        __modifiedProperties.add("fmlycd");
        this._fmlycd = fmlycd;
    }

    /**
     * [get] PRGRCD: {varchar(30)} <br>
     * 価格群コード
     * @return The value of the column 'PRGRCD'. (NullAllowed)
     */
    public String getPrgrcd() {
        return _prgrcd;
    }

    /**
     * [set] PRGRCD: {varchar(30)} <br>
     * 価格群コード
     * @param prgrcd The value of the column 'PRGRCD'. (NullAllowed)
     */
    public void setPrgrcd(String prgrcd) {
        __modifiedProperties.add("prgrcd");
        this._prgrcd = prgrcd;
    }

    /**
     * [get] NCTNCLS: {decimal(16, 6)} <br>
     * ニコチン値
     * @return The value of the column 'NCTNCLS'. (NullAllowed)
     */
    public java.math.BigDecimal getNctncls() {
        return _nctncls;
    }

    /**
     * [set] NCTNCLS: {decimal(16, 6)} <br>
     * ニコチン値
     * @param nctncls The value of the column 'NCTNCLS'. (NullAllowed)
     */
    public void setNctncls(java.math.BigDecimal nctncls) {
        __modifiedProperties.add("nctncls");
        this._nctncls = nctncls;
    }

    /**
     * [get] TARCLS: {decimal(16, 6)} <br>
     * タール値
     * @return The value of the column 'TARCLS'. (NullAllowed)
     */
    public java.math.BigDecimal getTarcls() {
        return _tarcls;
    }

    /**
     * [set] TARCLS: {decimal(16, 6)} <br>
     * タール値
     * @param tarcls The value of the column 'TARCLS'. (NullAllowed)
     */
    public void setTarcls(java.math.BigDecimal tarcls) {
        __modifiedProperties.add("tarcls");
        this._tarcls = tarcls;
    }

    /**
     * [get] PDPKSPCD: {varchar(30)} <br>
     * 製品包装形態
     * @return The value of the column 'PDPKSPCD'. (NullAllowed)
     */
    public String getPdpkspcd() {
        return _pdpkspcd;
    }

    /**
     * [set] PDPKSPCD: {varchar(30)} <br>
     * 製品包装形態
     * @param pdpkspcd The value of the column 'PDPKSPCD'. (NullAllowed)
     */
    public void setPdpkspcd(String pdpkspcd) {
        __modifiedProperties.add("pdpkspcd");
        this._pdpkspcd = pdpkspcd;
    }

    /**
     * [get] FLTID: {varchar(30)} <br>
     * フィルター区分
     * @return The value of the column 'FLTID'. (NullAllowed)
     */
    public String getFltid() {
        return _fltid;
    }

    /**
     * [set] FLTID: {varchar(30)} <br>
     * フィルター区分
     * @param fltid The value of the column 'FLTID'. (NullAllowed)
     */
    public void setFltid(String fltid) {
        __modifiedProperties.add("fltid");
        this._fltid = fltid;
    }

    /**
     * [get] KSUBCDID: {varchar(30)} <br>
     * 個装バーコード区分
     * @return The value of the column 'KSUBCDID'. (NullAllowed)
     */
    public String getKsubcdid() {
        return _ksubcdid;
    }

    /**
     * [set] KSUBCDID: {varchar(30)} <br>
     * 個装バーコード区分
     * @param ksubcdid The value of the column 'KSUBCDID'. (NullAllowed)
     */
    public void setKsubcdid(String ksubcdid) {
        __modifiedProperties.add("ksubcdid");
        this._ksubcdid = ksubcdid;
    }

    /**
     * [get] KSUBCD: {varchar(30)} <br>
     * 個装バーコード
     * @return The value of the column 'KSUBCD'. (NullAllowed)
     */
    public String getKsubcd() {
        return _ksubcd;
    }

    /**
     * [set] KSUBCD: {varchar(30)} <br>
     * 個装バーコード
     * @param ksubcd The value of the column 'KSUBCD'. (NullAllowed)
     */
    public void setKsubcd(String ksubcd) {
        __modifiedProperties.add("ksubcd");
        this._ksubcd = ksubcd;
    }

    /**
     * [get] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'CTBCDID'. (NullAllowed)
     */
    public String getCtbcdid() {
        return _ctbcdid;
    }

    /**
     * [set] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @param ctbcdid The value of the column 'CTBCDID'. (NullAllowed)
     */
    public void setCtbcdid(String ctbcdid) {
        __modifiedProperties.add("ctbcdid");
        this._ctbcdid = ctbcdid;
    }

    /**
     * [get] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'CTBCD'. (NullAllowed)
     */
    public String getCtbcd() {
        return _ctbcd;
    }

    /**
     * [set] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @param ctbcd The value of the column 'CTBCD'. (NullAllowed)
     */
    public void setCtbcd(String ctbcd) {
        __modifiedProperties.add("ctbcd");
        this._ctbcd = ctbcd;
    }

    /**
     * [get] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'CBBCDID'. (NullAllowed)
     */
    public String getCbbcdid() {
        return _cbbcdid;
    }

    /**
     * [set] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param cbbcdid The value of the column 'CBBCDID'. (NullAllowed)
     */
    public void setCbbcdid(String cbbcdid) {
        __modifiedProperties.add("cbbcdid");
        this._cbbcdid = cbbcdid;
    }

    /**
     * [get] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CBBCD'. (NullAllowed)
     */
    public String getCbbcd() {
        return _cbbcd;
    }

    /**
     * [set] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param cbbcd The value of the column 'CBBCD'. (NullAllowed)
     */
    public void setCbbcd(String cbbcd) {
        __modifiedProperties.add("cbbcd");
        this._cbbcd = cbbcd;
    }

    /**
     * [get] CTFM: {varchar(30)} <br>
     * カートン形状
     * @return The value of the column 'CTFM'. (NullAllowed)
     */
    public String getCtfm() {
        return _ctfm;
    }

    /**
     * [set] CTFM: {varchar(30)} <br>
     * カートン形状
     * @param ctfm The value of the column 'CTFM'. (NullAllowed)
     */
    public void setCtfm(String ctfm) {
        __modifiedProperties.add("ctfm");
        this._ctfm = ctfm;
    }

    /**
     * [get] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @return The value of the column 'CTSZL'. (NullAllowed)
     */
    public Long getCtszl() {
        return _ctszl;
    }

    /**
     * [set] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @param ctszl The value of the column 'CTSZL'. (NullAllowed)
     */
    public void setCtszl(Long ctszl) {
        __modifiedProperties.add("ctszl");
        this._ctszl = ctszl;
    }

    /**
     * [get] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @return The value of the column 'CTSZW'. (NullAllowed)
     */
    public Long getCtszw() {
        return _ctszw;
    }

    /**
     * [set] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @param ctszw The value of the column 'CTSZW'. (NullAllowed)
     */
    public void setCtszw(Long ctszw) {
        __modifiedProperties.add("ctszw");
        this._ctszw = ctszw;
    }

    /**
     * [get] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @return The value of the column 'CTSZH'. (NullAllowed)
     */
    public Long getCtszh() {
        return _ctszh;
    }

    /**
     * [set] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @param ctszh The value of the column 'CTSZH'. (NullAllowed)
     */
    public void setCtszh(Long ctszh) {
        __modifiedProperties.add("ctszh");
        this._ctszh = ctszh;
    }

    /**
     * [get] CTCC: {bigint(19)} <br>
     * カートン容積
     * @return The value of the column 'CTCC'. (NullAllowed)
     */
    public Long getCtcc() {
        return _ctcc;
    }

    /**
     * [set] CTCC: {bigint(19)} <br>
     * カートン容積
     * @param ctcc The value of the column 'CTCC'. (NullAllowed)
     */
    public void setCtcc(Long ctcc) {
        __modifiedProperties.add("ctcc");
        this._ctcc = ctcc;
    }

    /**
     * [get] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @return The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getCtweight() {
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public void setCtweight(java.math.BigDecimal ctweight) {
        __modifiedProperties.add("ctweight");
        this._ctweight = ctweight;
    }

    /**
     * [get] CBSZL: {bigint(19)} <br>
     * 段ボール（外寸）L
     * @return The value of the column 'CBSZL'. (NullAllowed)
     */
    public Long getCbszl() {
        return _cbszl;
    }

    /**
     * [set] CBSZL: {bigint(19)} <br>
     * 段ボール（外寸）L
     * @param cbszl The value of the column 'CBSZL'. (NullAllowed)
     */
    public void setCbszl(Long cbszl) {
        __modifiedProperties.add("cbszl");
        this._cbszl = cbszl;
    }

    /**
     * [get] CBSZW: {bigint(19)} <br>
     * 段ボール（外寸）W
     * @return The value of the column 'CBSZW'. (NullAllowed)
     */
    public Long getCbszw() {
        return _cbszw;
    }

    /**
     * [set] CBSZW: {bigint(19)} <br>
     * 段ボール（外寸）W
     * @param cbszw The value of the column 'CBSZW'. (NullAllowed)
     */
    public void setCbszw(Long cbszw) {
        __modifiedProperties.add("cbszw");
        this._cbszw = cbszw;
    }

    /**
     * [get] CBSZH: {bigint(19)} <br>
     * 段ボール（外寸）H
     * @return The value of the column 'CBSZH'. (NullAllowed)
     */
    public Long getCbszh() {
        return _cbszh;
    }

    /**
     * [set] CBSZH: {bigint(19)} <br>
     * 段ボール（外寸）H
     * @param cbszh The value of the column 'CBSZH'. (NullAllowed)
     */
    public void setCbszh(Long cbszh) {
        __modifiedProperties.add("cbszh");
        this._cbszh = cbszh;
    }

    /**
     * [get] CBCC: {bigint(19)} <br>
     * 段ボール容積
     * @return The value of the column 'CBCC'. (NullAllowed)
     */
    public Long getCbcc() {
        return _cbcc;
    }

    /**
     * [set] CBCC: {bigint(19)} <br>
     * 段ボール容積
     * @param cbcc The value of the column 'CBCC'. (NullAllowed)
     */
    public void setCbcc(Long cbcc) {
        __modifiedProperties.add("cbcc");
        this._cbcc = cbcc;
    }

    /**
     * [get] CBWT: {bigint(19)} <br>
     * 段ボール（外寸）重量(g)
     * @return The value of the column 'CBWT'. (NullAllowed)
     */
    public Long getCbwt() {
        return _cbwt;
    }

    /**
     * [set] CBWT: {bigint(19)} <br>
     * 段ボール（外寸）重量(g)
     * @param cbwt The value of the column 'CBWT'. (NullAllowed)
     */
    public void setCbwt(Long cbwt) {
        __modifiedProperties.add("cbwt");
        this._cbwt = cbwt;
    }

    /**
     * [get] BSCDT: {varchar(30)} <br>
     * 仕入基地コード(1)
     * @return The value of the column 'BSCDT'. (NullAllowed)
     */
    public String getBscdt() {
        return _bscdt;
    }

    /**
     * [set] BSCDT: {varchar(30)} <br>
     * 仕入基地コード(1)
     * @param bscdt The value of the column 'BSCDT'. (NullAllowed)
     */
    public void setBscdt(String bscdt) {
        __modifiedProperties.add("bscdt");
        this._bscdt = bscdt;
    }

    /**
     * [get] BSCDK: {varchar(30)} <br>
     * 仕入基地コード(2)
     * @return The value of the column 'BSCDK'. (NullAllowed)
     */
    public String getBscdk() {
        return _bscdk;
    }

    /**
     * [set] BSCDK: {varchar(30)} <br>
     * 仕入基地コード(2)
     * @param bscdk The value of the column 'BSCDK'. (NullAllowed)
     */
    public void setBscdk(String bscdk) {
        __modifiedProperties.add("bscdk");
        this._bscdk = bscdk;
    }

    /**
     * [get] BSCDC: {varchar(30)} <br>
     * 仕入基地コード(3)
     * @return The value of the column 'BSCDC'. (NullAllowed)
     */
    public String getBscdc() {
        return _bscdc;
    }

    /**
     * [set] BSCDC: {varchar(30)} <br>
     * 仕入基地コード(3)
     * @param bscdc The value of the column 'BSCDC'. (NullAllowed)
     */
    public void setBscdc(String bscdc) {
        __modifiedProperties.add("bscdc");
        this._bscdc = bscdc;
    }

    /**
     * [get] BSCDQ: {varchar(30)} <br>
     * 仕入基地コード(4)
     * @return The value of the column 'BSCDQ'. (NullAllowed)
     */
    public String getBscdq() {
        return _bscdq;
    }

    /**
     * [set] BSCDQ: {varchar(30)} <br>
     * 仕入基地コード(4)
     * @param bscdq The value of the column 'BSCDQ'. (NullAllowed)
     */
    public void setBscdq(String bscdq) {
        __modifiedProperties.add("bscdq");
        this._bscdq = bscdq;
    }

    /**
     * [get] BSCDH: {varchar(30)} <br>
     * 仕入基地コード(5)
     * @return The value of the column 'BSCDH'. (NullAllowed)
     */
    public String getBscdh() {
        return _bscdh;
    }

    /**
     * [set] BSCDH: {varchar(30)} <br>
     * 仕入基地コード(5)
     * @param bscdh The value of the column 'BSCDH'. (NullAllowed)
     */
    public void setBscdh(String bscdh) {
        __modifiedProperties.add("bscdh");
        this._bscdh = bscdh;
    }

    /**
     * [get] SPAGCDT: {varchar(30)} <br>
     * 特販業者コード(1)
     * @return The value of the column 'SPAGCDT'. (NullAllowed)
     */
    public String getSpagcdt() {
        return _spagcdt;
    }

    /**
     * [set] SPAGCDT: {varchar(30)} <br>
     * 特販業者コード(1)
     * @param spagcdt The value of the column 'SPAGCDT'. (NullAllowed)
     */
    public void setSpagcdt(String spagcdt) {
        __modifiedProperties.add("spagcdt");
        this._spagcdt = spagcdt;
    }

    /**
     * [get] SPAGCDK: {varchar(30)} <br>
     * 特販業者コード(2)
     * @return The value of the column 'SPAGCDK'. (NullAllowed)
     */
    public String getSpagcdk() {
        return _spagcdk;
    }

    /**
     * [set] SPAGCDK: {varchar(30)} <br>
     * 特販業者コード(2)
     * @param spagcdk The value of the column 'SPAGCDK'. (NullAllowed)
     */
    public void setSpagcdk(String spagcdk) {
        __modifiedProperties.add("spagcdk");
        this._spagcdk = spagcdk;
    }

    /**
     * [get] SPAGCDC: {varchar(30)} <br>
     * 特販業者コード(3)
     * @return The value of the column 'SPAGCDC'. (NullAllowed)
     */
    public String getSpagcdc() {
        return _spagcdc;
    }

    /**
     * [set] SPAGCDC: {varchar(30)} <br>
     * 特販業者コード(3)
     * @param spagcdc The value of the column 'SPAGCDC'. (NullAllowed)
     */
    public void setSpagcdc(String spagcdc) {
        __modifiedProperties.add("spagcdc");
        this._spagcdc = spagcdc;
    }

    /**
     * [get] SPAGCDQ: {varchar(30)} <br>
     * 特販業者コード(4)
     * @return The value of the column 'SPAGCDQ'. (NullAllowed)
     */
    public String getSpagcdq() {
        return _spagcdq;
    }

    /**
     * [set] SPAGCDQ: {varchar(30)} <br>
     * 特販業者コード(4)
     * @param spagcdq The value of the column 'SPAGCDQ'. (NullAllowed)
     */
    public void setSpagcdq(String spagcdq) {
        __modifiedProperties.add("spagcdq");
        this._spagcdq = spagcdq;
    }

    /**
     * [get] SPAGCDH: {varchar(30)} <br>
     * 特販業者コード(5)
     * @return The value of the column 'SPAGCDH'. (NullAllowed)
     */
    public String getSpagcdh() {
        return _spagcdh;
    }

    /**
     * [set] SPAGCDH: {varchar(30)} <br>
     * 特販業者コード(5)
     * @param spagcdh The value of the column 'SPAGCDH'. (NullAllowed)
     */
    public void setSpagcdh(String spagcdh) {
        __modifiedProperties.add("spagcdh");
        this._spagcdh = spagcdh;
    }

    /**
     * [get] RBSCD1: {varchar(30)} <br>
     * 返品基地コード(1)
     * @return The value of the column 'RBSCD1'. (NullAllowed)
     */
    public String getRbscd1() {
        return _rbscd1;
    }

    /**
     * [set] RBSCD1: {varchar(30)} <br>
     * 返品基地コード(1)
     * @param rbscd1 The value of the column 'RBSCD1'. (NullAllowed)
     */
    public void setRbscd1(String rbscd1) {
        __modifiedProperties.add("rbscd1");
        this._rbscd1 = rbscd1;
    }

    /**
     * [get] RBSCD2: {varchar(30)} <br>
     * 返品基地コード(2)
     * @return The value of the column 'RBSCD2'. (NullAllowed)
     */
    public String getRbscd2() {
        return _rbscd2;
    }

    /**
     * [set] RBSCD2: {varchar(30)} <br>
     * 返品基地コード(2)
     * @param rbscd2 The value of the column 'RBSCD2'. (NullAllowed)
     */
    public void setRbscd2(String rbscd2) {
        __modifiedProperties.add("rbscd2");
        this._rbscd2 = rbscd2;
    }

    /**
     * [get] RBSCD3: {varchar(30)} <br>
     * 返品基地コード(3)
     * @return The value of the column 'RBSCD3'. (NullAllowed)
     */
    public String getRbscd3() {
        return _rbscd3;
    }

    /**
     * [set] RBSCD3: {varchar(30)} <br>
     * 返品基地コード(3)
     * @param rbscd3 The value of the column 'RBSCD3'. (NullAllowed)
     */
    public void setRbscd3(String rbscd3) {
        __modifiedProperties.add("rbscd3");
        this._rbscd3 = rbscd3;
    }

    /**
     * [get] RBSCD4: {varchar(30)} <br>
     * 返品基地コード(4)
     * @return The value of the column 'RBSCD4'. (NullAllowed)
     */
    public String getRbscd4() {
        return _rbscd4;
    }

    /**
     * [set] RBSCD4: {varchar(30)} <br>
     * 返品基地コード(4)
     * @param rbscd4 The value of the column 'RBSCD4'. (NullAllowed)
     */
    public void setRbscd4(String rbscd4) {
        __modifiedProperties.add("rbscd4");
        this._rbscd4 = rbscd4;
    }

    /**
     * [get] RBSCD5: {varchar(30)} <br>
     * 返品基地コード(5)
     * @return The value of the column 'RBSCD5'. (NullAllowed)
     */
    public String getRbscd5() {
        return _rbscd5;
    }

    /**
     * [set] RBSCD5: {varchar(30)} <br>
     * 返品基地コード(5)
     * @param rbscd5 The value of the column 'RBSCD5'. (NullAllowed)
     */
    public void setRbscd5(String rbscd5) {
        __modifiedProperties.add("rbscd5");
        this._rbscd5 = rbscd5;
    }

    /**
     * [get] USSBCD1: {varchar(30)} <br>
     * 不適品返送先コード(1)
     * @return The value of the column 'USSBCD1'. (NullAllowed)
     */
    public String getUssbcd1() {
        return _ussbcd1;
    }

    /**
     * [set] USSBCD1: {varchar(30)} <br>
     * 不適品返送先コード(1)
     * @param ussbcd1 The value of the column 'USSBCD1'. (NullAllowed)
     */
    public void setUssbcd1(String ussbcd1) {
        __modifiedProperties.add("ussbcd1");
        this._ussbcd1 = ussbcd1;
    }

    /**
     * [get] USSBCD2: {varchar(30)} <br>
     * 不適品返送先コード(2)
     * @return The value of the column 'USSBCD2'. (NullAllowed)
     */
    public String getUssbcd2() {
        return _ussbcd2;
    }

    /**
     * [set] USSBCD2: {varchar(30)} <br>
     * 不適品返送先コード(2)
     * @param ussbcd2 The value of the column 'USSBCD2'. (NullAllowed)
     */
    public void setUssbcd2(String ussbcd2) {
        __modifiedProperties.add("ussbcd2");
        this._ussbcd2 = ussbcd2;
    }

    /**
     * [get] USSBCD3: {varchar(30)} <br>
     * 不適品返送先コード(3)
     * @return The value of the column 'USSBCD3'. (NullAllowed)
     */
    public String getUssbcd3() {
        return _ussbcd3;
    }

    /**
     * [set] USSBCD3: {varchar(30)} <br>
     * 不適品返送先コード(3)
     * @param ussbcd3 The value of the column 'USSBCD3'. (NullAllowed)
     */
    public void setUssbcd3(String ussbcd3) {
        __modifiedProperties.add("ussbcd3");
        this._ussbcd3 = ussbcd3;
    }

    /**
     * [get] USSBCD4: {varchar(30)} <br>
     * 不適品返送先コード(4)
     * @return The value of the column 'USSBCD4'. (NullAllowed)
     */
    public String getUssbcd4() {
        return _ussbcd4;
    }

    /**
     * [set] USSBCD4: {varchar(30)} <br>
     * 不適品返送先コード(4)
     * @param ussbcd4 The value of the column 'USSBCD4'. (NullAllowed)
     */
    public void setUssbcd4(String ussbcd4) {
        __modifiedProperties.add("ussbcd4");
        this._ussbcd4 = ussbcd4;
    }

    /**
     * [get] USSBCD5: {varchar(30)} <br>
     * 不適品返送先コード(5)
     * @return The value of the column 'USSBCD5'. (NullAllowed)
     */
    public String getUssbcd5() {
        return _ussbcd5;
    }

    /**
     * [set] USSBCD5: {varchar(30)} <br>
     * 不適品返送先コード(5)
     * @param ussbcd5 The value of the column 'USSBCD5'. (NullAllowed)
     */
    public void setUssbcd5(String ussbcd5) {
        __modifiedProperties.add("ussbcd5");
        this._ussbcd5 = ussbcd5;
    }

    /**
     * [get] SPLCPCD: {varchar(30)} <br>
     * 供給会社コード
     * @return The value of the column 'SPLCPCD'. (NullAllowed)
     */
    public String getSplcpcd() {
        return _splcpcd;
    }

    /**
     * [set] SPLCPCD: {varchar(30)} <br>
     * 供給会社コード
     * @param splcpcd The value of the column 'SPLCPCD'. (NullAllowed)
     */
    public void setSplcpcd(String splcpcd) {
        __modifiedProperties.add("splcpcd");
        this._splcpcd = splcpcd;
    }

    /**
     * [get] MAKERCD: {varchar(60)} <br>
     * メーカーコード
     * @return The value of the column 'MAKERCD'. (NullAllowed)
     */
    public String getMakercd() {
        return _makercd;
    }

    /**
     * [set] MAKERCD: {varchar(60)} <br>
     * メーカーコード
     * @param makercd The value of the column 'MAKERCD'. (NullAllowed)
     */
    public void setMakercd(String makercd) {
        __modifiedProperties.add("makercd");
        this._makercd = makercd;
    }

    /**
     * [get] LAND1: {varchar(60)} <br>
     * 国コード
     * @return The value of the column 'LAND1'. (NullAllowed)
     */
    public String getLand1() {
        return _land1;
    }

    /**
     * [set] LAND1: {varchar(60)} <br>
     * 国コード
     * @param land1 The value of the column 'LAND1'. (NullAllowed)
     */
    public void setLand1(String land1) {
        __modifiedProperties.add("land1");
        this._land1 = land1;
    }

    /**
     * [get] CGCLSDID: {varchar(30)} <br>
     * 請求締日区分
     * @return The value of the column 'CGCLSDID'. (NullAllowed)
     */
    public String getCgclsdid() {
        return _cgclsdid;
    }

    /**
     * [set] CGCLSDID: {varchar(30)} <br>
     * 請求締日区分
     * @param cgclsdid The value of the column 'CGCLSDID'. (NullAllowed)
     */
    public void setCgclsdid(String cgclsdid) {
        __modifiedProperties.add("cgclsdid");
        this._cgclsdid = cgclsdid;
    }

    /**
     * [get] GNLOTRNK: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'GNLOTRNK'. (NullAllowed)
     */
    public Long getGnlotrnk() {
        return _gnlotrnk;
    }

    /**
     * [set] GNLOTRNK: {bigint(19)} <br>
     * 一般出力順
     * @param gnlotrnk The value of the column 'GNLOTRNK'. (NullAllowed)
     */
    public void setGnlotrnk(Long gnlotrnk) {
        __modifiedProperties.add("gnlotrnk");
        this._gnlotrnk = gnlotrnk;
    }

    /**
     * [get] MROTRNK: {bigint(19)} <br>
     * 月報出力順
     * @return The value of the column 'MROTRNK'. (NullAllowed)
     */
    public Long getMrotrnk() {
        return _mrotrnk;
    }

    /**
     * [set] MROTRNK: {bigint(19)} <br>
     * 月報出力順
     * @param mrotrnk The value of the column 'MROTRNK'. (NullAllowed)
     */
    public void setMrotrnk(Long mrotrnk) {
        __modifiedProperties.add("mrotrnk");
        this._mrotrnk = mrotrnk;
    }

    /**
     * [get] COID: {varchar(30)} <br>
     * コンサイメント区分
     * @return The value of the column 'COID'. (NullAllowed)
     */
    public String getCoid() {
        return _coid;
    }

    /**
     * [set] COID: {varchar(30)} <br>
     * コンサイメント区分
     * @param coid The value of the column 'COID'. (NullAllowed)
     */
    public void setCoid(String coid) {
        __modifiedProperties.add("coid");
        this._coid = coid;
    }

    /**
     * [get] BRWKID: {varchar(30)} <br>
     * 銘柄周知区分
     * @return The value of the column 'BRWKID'. (NullAllowed)
     */
    public String getBrwkid() {
        return _brwkid;
    }

    /**
     * [set] BRWKID: {varchar(30)} <br>
     * 銘柄周知区分
     * @param brwkid The value of the column 'BRWKID'. (NullAllowed)
     */
    public void setBrwkid(String brwkid) {
        __modifiedProperties.add("brwkid");
        this._brwkid = brwkid;
    }

    /**
     * [get] SHUNID: {varchar(30)} <br>
     * 輸送単位区分
     * @return The value of the column 'SHUNID'. (NullAllowed)
     */
    public String getShunid() {
        return _shunid;
    }

    /**
     * [set] SHUNID: {varchar(30)} <br>
     * 輸送単位区分
     * @param shunid The value of the column 'SHUNID'. (NullAllowed)
     */
    public void setShunid(String shunid) {
        __modifiedProperties.add("shunid");
        this._shunid = shunid;
    }

    /**
     * [get] DSTKBN: {varchar(30)} <br>
     * 流通加工区分
     * @return The value of the column 'DSTKBN'. (NullAllowed)
     */
    public String getDstkbn() {
        return _dstkbn;
    }

    /**
     * [set] DSTKBN: {varchar(30)} <br>
     * 流通加工区分
     * @param dstkbn The value of the column 'DSTKBN'. (NullAllowed)
     */
    public void setDstkbn(String dstkbn) {
        __modifiedProperties.add("dstkbn");
        this._dstkbn = dstkbn;
    }

    /**
     * [get] REOMATNR: {bigint(19)} <br>
     * 返品用親銘柄コード
     * @return The value of the column 'REOMATNR'. (NullAllowed)
     */
    public Long getReomatnr() {
        return _reomatnr;
    }

    /**
     * [set] REOMATNR: {bigint(19)} <br>
     * 返品用親銘柄コード
     * @param reomatnr The value of the column 'REOMATNR'. (NullAllowed)
     */
    public void setReomatnr(Long reomatnr) {
        __modifiedProperties.add("reomatnr");
        this._reomatnr = reomatnr;
    }

    /**
     * [get] DSPECKB: {varchar(30)} <br>
     * D-spec区分
     * @return The value of the column 'DSPECKB'. (NullAllowed)
     */
    public String getDspeckb() {
        return _dspeckb;
    }

    /**
     * [set] DSPECKB: {varchar(30)} <br>
     * D-spec区分
     * @param dspeckb The value of the column 'DSPECKB'. (NullAllowed)
     */
    public void setDspeckb(String dspeckb) {
        __modifiedProperties.add("dspeckb");
        this._dspeckb = dspeckb;
    }

    /**
     * [get] SGMID: {varchar(30)} <br>
     * セグメント区分
     * @return The value of the column 'SGMID'. (NullAllowed)
     */
    public String getSgmid() {
        return _sgmid;
    }

    /**
     * [set] SGMID: {varchar(30)} <br>
     * セグメント区分
     * @param sgmid The value of the column 'SGMID'. (NullAllowed)
     */
    public void setSgmid(String sgmid) {
        __modifiedProperties.add("sgmid");
        this._sgmid = sgmid;
    }

    /**
     * [get] MAKILENG: {varchar(60)} <br>
     * 巻長
     * @return The value of the column 'MAKILENG'. (NullAllowed)
     */
    public String getMakileng() {
        return _makileng;
    }

    /**
     * [set] MAKILENG: {varchar(60)} <br>
     * 巻長
     * @param makileng The value of the column 'MAKILENG'. (NullAllowed)
     */
    public void setMakileng(String makileng) {
        __modifiedProperties.add("makileng");
        this._makileng = makileng;
    }

    /**
     * [get] MAKIDIA: {varchar(60)} <br>
     * 巻直径
     * @return The value of the column 'MAKIDIA'. (NullAllowed)
     */
    public String getMakidia() {
        return _makidia;
    }

    /**
     * [set] MAKIDIA: {varchar(60)} <br>
     * 巻直径
     * @param makidia The value of the column 'MAKIDIA'. (NullAllowed)
     */
    public void setMakidia(String makidia) {
        __modifiedProperties.add("makidia");
        this._makidia = makidia;
    }

    /**
     * [get] GDMSRP: {bigint(19)} <br>
     * 希望小売価格
     * @return The value of the column 'GDMSRP'. (NullAllowed)
     */
    public Long getGdmsrp() {
        return _gdmsrp;
    }

    /**
     * [set] GDMSRP: {bigint(19)} <br>
     * 希望小売価格
     * @param gdmsrp The value of the column 'GDMSRP'. (NullAllowed)
     */
    public void setGdmsrp(Long gdmsrp) {
        __modifiedProperties.add("gdmsrp");
        this._gdmsrp = gdmsrp;
    }

    /**
     * [get] GDSLU: {decimal(16, 6)} <br>
     * 商品販売単価
     * @return The value of the column 'GDSLU'. (NullAllowed)
     */
    public java.math.BigDecimal getGdslu() {
        return _gdslu;
    }

    /**
     * [set] GDSLU: {decimal(16, 6)} <br>
     * 商品販売単価
     * @param gdslu The value of the column 'GDSLU'. (NullAllowed)
     */
    public void setGdslu(java.math.BigDecimal gdslu) {
        __modifiedProperties.add("gdslu");
        this._gdslu = gdslu;
    }

    /**
     * [get] GDPRU: {decimal(16, 6)} <br>
     * 商品仕入単価
     * @return The value of the column 'GDPRU'. (NullAllowed)
     */
    public java.math.BigDecimal getGdpru() {
        return _gdpru;
    }

    /**
     * [set] GDPRU: {decimal(16, 6)} <br>
     * 商品仕入単価
     * @param gdpru The value of the column 'GDPRU'. (NullAllowed)
     */
    public void setGdpru(java.math.BigDecimal gdpru) {
        __modifiedProperties.add("gdpru");
        this._gdpru = gdpru;
    }

    /**
     * [get] EXIMA: {varchar(30)} <br>
     * 加熱式たばこ
     * @return The value of the column 'EXIMA'. (NullAllowed)
     */
    public String getExima() {
        return _exima;
    }

    /**
     * [set] EXIMA: {varchar(30)} <br>
     * 加熱式たばこ
     * @param exima The value of the column 'EXIMA'. (NullAllowed)
     */
    public void setExima(String exima) {
        __modifiedProperties.add("exima");
        this._exima = exima;
    }

    /**
     * [get] EXIMB: {decimal(16, 6)} <br>
     * Ploomカプセル換算本数
     * @return The value of the column 'EXIMB'. (NullAllowed)
     */
    public java.math.BigDecimal getEximb() {
        return _eximb;
    }

    /**
     * [set] EXIMB: {decimal(16, 6)} <br>
     * Ploomカプセル換算本数
     * @param eximb The value of the column 'EXIMB'. (NullAllowed)
     */
    public void setEximb(java.math.BigDecimal eximb) {
        __modifiedProperties.add("eximb");
        this._eximb = eximb;
    }

    /**
     * [get] EXIMC: {decimal(16, 6)} <br>
     * 加熱式たばこ取引換算本数
     * @return The value of the column 'EXIMC'. (NullAllowed)
     */
    public java.math.BigDecimal getEximc() {
        return _eximc;
    }

    /**
     * [set] EXIMC: {decimal(16, 6)} <br>
     * 加熱式たばこ取引換算本数
     * @param eximc The value of the column 'EXIMC'. (NullAllowed)
     */
    public void setEximc(java.math.BigDecimal eximc) {
        __modifiedProperties.add("eximc");
        this._eximc = eximc;
    }

    /**
     * [get] EXIMD: {decimal(16, 6)} <br>
     * フィルタ等を除く重量
     * @return The value of the column 'EXIMD'. (NullAllowed)
     */
    public java.math.BigDecimal getEximd() {
        return _eximd;
    }

    /**
     * [set] EXIMD: {decimal(16, 6)} <br>
     * フィルタ等を除く重量
     * @param eximd The value of the column 'EXIMD'. (NullAllowed)
     */
    public void setEximd(java.math.BigDecimal eximd) {
        __modifiedProperties.add("eximd");
        this._eximd = eximd;
    }

    /**
     * [get] EXIME: {varchar(60)} <br>
     * 拡張項目E
     * @return The value of the column 'EXIME'. (NullAllowed)
     */
    public String getExime() {
        return _exime;
    }

    /**
     * [set] EXIME: {varchar(60)} <br>
     * 拡張項目E
     * @param exime The value of the column 'EXIME'. (NullAllowed)
     */
    public void setExime(String exime) {
        __modifiedProperties.add("exime");
        this._exime = exime;
    }

    /**
     * [get] EXIMF: {varchar(60)} <br>
     * 拡張項目F
     * @return The value of the column 'EXIMF'. (NullAllowed)
     */
    public String getEximf() {
        return _eximf;
    }

    /**
     * [set] EXIMF: {varchar(60)} <br>
     * 拡張項目F
     * @param eximf The value of the column 'EXIMF'. (NullAllowed)
     */
    public void setEximf(String eximf) {
        __modifiedProperties.add("eximf");
        this._eximf = eximf;
    }

    /**
     * [get] EXIMG: {varchar(60)} <br>
     * 拡張項目G
     * @return The value of the column 'EXIMG'. (NullAllowed)
     */
    public String getEximg() {
        return _eximg;
    }

    /**
     * [set] EXIMG: {varchar(60)} <br>
     * 拡張項目G
     * @param eximg The value of the column 'EXIMG'. (NullAllowed)
     */
    public void setEximg(String eximg) {
        __modifiedProperties.add("eximg");
        this._eximg = eximg;
    }

    /**
     * [get] EXIMH: {varchar(60)} <br>
     * 拡張項目H
     * @return The value of the column 'EXIMH'. (NullAllowed)
     */
    public String getEximh() {
        return _eximh;
    }

    /**
     * [set] EXIMH: {varchar(60)} <br>
     * 拡張項目H
     * @param eximh The value of the column 'EXIMH'. (NullAllowed)
     */
    public void setEximh(String eximh) {
        __modifiedProperties.add("eximh");
        this._eximh = eximh;
    }

    /**
     * [get] EXIMI: {varchar(60)} <br>
     * 拡張項目I
     * @return The value of the column 'EXIMI'. (NullAllowed)
     */
    public String getEximi() {
        return _eximi;
    }

    /**
     * [set] EXIMI: {varchar(60)} <br>
     * 拡張項目I
     * @param eximi The value of the column 'EXIMI'. (NullAllowed)
     */
    public void setEximi(String eximi) {
        __modifiedProperties.add("eximi");
        this._eximi = eximi;
    }

    /**
     * [get] EXIMJ: {varchar(60)} <br>
     * 拡張項目J
     * @return The value of the column 'EXIMJ'. (NullAllowed)
     */
    public String getEximj() {
        return _eximj;
    }

    /**
     * [set] EXIMJ: {varchar(60)} <br>
     * 拡張項目J
     * @param eximj The value of the column 'EXIMJ'. (NullAllowed)
     */
    public void setEximj(String eximj) {
        __modifiedProperties.add("eximj");
        this._eximj = eximj;
    }

    /**
     * [get] EXIMK: {varchar(60)} <br>
     * 拡張項目K
     * @return The value of the column 'EXIMK'. (NullAllowed)
     */
    public String getEximk() {
        return _eximk;
    }

    /**
     * [set] EXIMK: {varchar(60)} <br>
     * 拡張項目K
     * @param eximk The value of the column 'EXIMK'. (NullAllowed)
     */
    public void setEximk(String eximk) {
        __modifiedProperties.add("eximk");
        this._eximk = eximk;
    }

    /**
     * [get] EXIML: {varchar(60)} <br>
     * 拡張項目L
     * @return The value of the column 'EXIML'. (NullAllowed)
     */
    public String getEximl() {
        return _eximl;
    }

    /**
     * [set] EXIML: {varchar(60)} <br>
     * 拡張項目L
     * @param eximl The value of the column 'EXIML'. (NullAllowed)
     */
    public void setEximl(String eximl) {
        __modifiedProperties.add("eximl");
        this._eximl = eximl;
    }

    /**
     * [get] EXIMM: {varchar(60)} <br>
     * 拡張項目M
     * @return The value of the column 'EXIMM'. (NullAllowed)
     */
    public String getEximm() {
        return _eximm;
    }

    /**
     * [set] EXIMM: {varchar(60)} <br>
     * 拡張項目M
     * @param eximm The value of the column 'EXIMM'. (NullAllowed)
     */
    public void setEximm(String eximm) {
        __modifiedProperties.add("eximm");
        this._eximm = eximm;
    }

    /**
     * [get] EXIMN: {varchar(60)} <br>
     * 拡張項目N
     * @return The value of the column 'EXIMN'. (NullAllowed)
     */
    public String getEximn() {
        return _eximn;
    }

    /**
     * [set] EXIMN: {varchar(60)} <br>
     * 拡張項目N
     * @param eximn The value of the column 'EXIMN'. (NullAllowed)
     */
    public void setEximn(String eximn) {
        __modifiedProperties.add("eximn");
        this._eximn = eximn;
    }

    /**
     * [get] EXIMO: {varchar(60)} <br>
     * 拡張項目O
     * @return The value of the column 'EXIMO'. (NullAllowed)
     */
    public String getEximo() {
        return _eximo;
    }

    /**
     * [set] EXIMO: {varchar(60)} <br>
     * 拡張項目O
     * @param eximo The value of the column 'EXIMO'. (NullAllowed)
     */
    public void setEximo(String eximo) {
        __modifiedProperties.add("eximo");
        this._eximo = eximo;
    }

    /**
     * [get] EXIMP: {varchar(60)} <br>
     * 拡張項目P
     * @return The value of the column 'EXIMP'. (NullAllowed)
     */
    public String getEximp() {
        return _eximp;
    }

    /**
     * [set] EXIMP: {varchar(60)} <br>
     * 拡張項目P
     * @param eximp The value of the column 'EXIMP'. (NullAllowed)
     */
    public void setEximp(String eximp) {
        __modifiedProperties.add("eximp");
        this._eximp = eximp;
    }

    /**
     * [get] UPMN: {bigint(19)} <br>
     * 更新者
     * @return The value of the column 'UPMN'. (NullAllowed)
     */
    public Long getUpmn() {
        return _upmn;
    }

    /**
     * [set] UPMN: {bigint(19)} <br>
     * 更新者
     * @param upmn The value of the column 'UPMN'. (NullAllowed)
     */
    public void setUpmn(Long upmn) {
        __modifiedProperties.add("upmn");
        this._upmn = upmn;
    }

    /**
     * [get] CHNGYD: {varchar(8)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (NullAllowed)
     */
    public String getChngyd() {
        return _chngyd;
    }

    /**
     * [set] CHNGYD: {varchar(8)} <br>
     * 更新年月日
     * @param chngyd The value of the column 'CHNGYD'. (NullAllowed)
     */
    public void setChngyd(String chngyd) {
        __modifiedProperties.add("chngyd");
        this._chngyd = chngyd;
    }

    /**
     * [get] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @return The value of the column 'UPDTM'. (NullAllowed)
     */
    public String getUpdtm() {
        return _updtm;
    }

    /**
     * [set] UPDTM: {varchar(30)} <br>
     * 更新時刻
     * @param updtm The value of the column 'UPDTM'. (NullAllowed)
     */
    public void setUpdtm(String updtm) {
        __modifiedProperties.add("updtm");
        this._updtm = updtm;
    }

    /**
     * [get] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @return The value of the column 'UPDIS'. (NullAllowed)
     */
    public Long getUpdis() {
        return _updis;
    }

    /**
     * [set] UPDIS: {bigint(19)} <br>
     * 更新画面ID
     * @param updis The value of the column 'UPDIS'. (NullAllowed)
     */
    public void setUpdis(Long updis) {
        __modifiedProperties.add("updis");
        this._updis = updis;
    }

    /**
     * [get] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @return The value of the column 'UPBMN'. (NullAllowed)
     */
    public Long getUpbmn() {
        return _upbmn;
    }

    /**
     * [set] UPBMN: {bigint(19)} <br>
     * バッチ更新者
     * @param upbmn The value of the column 'UPBMN'. (NullAllowed)
     */
    public void setUpbmn(Long upbmn) {
        __modifiedProperties.add("upbmn");
        this._upbmn = upbmn;
    }

    /**
     * [get] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @return The value of the column 'BCHNGYD'. (NullAllowed)
     */
    public String getBchngyd() {
        return _bchngyd;
    }

    /**
     * [set] BCHNGYD: {varchar(8)} <br>
     * バッチ更新年月日
     * @param bchngyd The value of the column 'BCHNGYD'. (NullAllowed)
     */
    public void setBchngyd(String bchngyd) {
        __modifiedProperties.add("bchngyd");
        this._bchngyd = bchngyd;
    }

    /**
     * [get] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @return The value of the column 'BUPDTM'. (NullAllowed)
     */
    public Long getBupdtm() {
        return _bupdtm;
    }

    /**
     * [set] BUPDTM: {bigint(19)} <br>
     * バッチ更新時刻
     * @param bupdtm The value of the column 'BUPDTM'. (NullAllowed)
     */
    public void setBupdtm(Long bupdtm) {
        __modifiedProperties.add("bupdtm");
        this._bupdtm = bupdtm;
    }

    /**
     * [get] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @return The value of the column 'UPOBMN'. (NullAllowed)
     */
    public Long getUpobmn() {
        return _upobmn;
    }

    /**
     * [set] UPOBMN: {bigint(19)} <br>
     * オンラインバッチ更新者
     * @param upobmn The value of the column 'UPOBMN'. (NullAllowed)
     */
    public void setUpobmn(Long upobmn) {
        __modifiedProperties.add("upobmn");
        this._upobmn = upobmn;
    }

    /**
     * [get] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @return The value of the column 'OBCHNGYD'. (NullAllowed)
     */
    public String getObchngyd() {
        return _obchngyd;
    }

    /**
     * [set] OBCHNGYD: {varchar(8)} <br>
     * オンラインバッチ更新年月日
     * @param obchngyd The value of the column 'OBCHNGYD'. (NullAllowed)
     */
    public void setObchngyd(String obchngyd) {
        __modifiedProperties.add("obchngyd");
        this._obchngyd = obchngyd;
    }

    /**
     * [get] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @return The value of the column 'OBUPDTM'. (NullAllowed)
     */
    public Long getObupdtm() {
        return _obupdtm;
    }

    /**
     * [set] OBUPDTM: {bigint(19)} <br>
     * オンラインバッチ更新時刻
     * @param obupdtm The value of the column 'OBUPDTM'. (NullAllowed)
     */
    public void setObupdtm(Long obupdtm) {
        __modifiedProperties.add("obupdtm");
        this._obupdtm = obupdtm;
    }

    /**
     * [get] AUBRCHFG: {varchar(30)} <br>
     * 集計銘柄変更区分
     * @return The value of the column 'AUBRCHFG'. (NullAllowed)
     */
    public String getAubrchfg() {
        return _aubrchfg;
    }

    /**
     * [set] AUBRCHFG: {varchar(30)} <br>
     * 集計銘柄変更区分
     * @param aubrchfg The value of the column 'AUBRCHFG'. (NullAllowed)
     */
    public void setAubrchfg(String aubrchfg) {
        __modifiedProperties.add("aubrchfg");
        this._aubrchfg = aubrchfg;
    }

    /**
     * [get] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public String getZzfrdateh() {
        return _zzfrdateh;
    }

    /**
     * [set] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public void setZzfrdateh(String zzfrdateh) {
        __modifiedProperties.add("zzfrdateh");
        this._zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public String getZztodateh() {
        return _zztodateh;
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public void setZztodateh(String zztodateh) {
        __modifiedProperties.add("zztodateh");
        this._zztodateh = zztodateh;
    }

    /**
     * [get] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public String getRcdupdps() {
        return _rcdupdps;
    }

    /**
     * [set] RCDUPDPS: {varchar(30)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (NullAllowed)
     */
    public void setRcdupdps(String rcdupdps) {
        __modifiedProperties.add("rcdupdps");
        this._rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @return The value of the column 'UPDUSRID'. (NullAllowed)
     */
    public Long getUpdusrid() {
        return _updusrid;
    }

    /**
     * [set] UPDUSRID: {bigint(19)} <br>
     * レコード更新ユーザＩＤ
     * @param updusrid The value of the column 'UPDUSRID'. (NullAllowed)
     */
    public void setUpdusrid(Long updusrid) {
        __modifiedProperties.add("updusrid");
        this._updusrid = updusrid;
    }

    /**
     * [get] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @return The value of the column 'UPDPOCD'. (NullAllowed)
     */
    public String getUpdpocd() {
        return _updpocd;
    }

    /**
     * [set] UPDPOCD: {varchar(30)} <br>
     * レコード更新部署コード
     * @param updpocd The value of the column 'UPDPOCD'. (NullAllowed)
     */
    public void setUpdpocd(String updpocd) {
        __modifiedProperties.add("updpocd");
        this._updpocd = updpocd;
    }

    /**
     * [get] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public java.math.BigDecimal getOtcmpfg() {
        return _otcmpfg;
    }

    /**
     * [set] OTCMPFG: {decimal(16, 6)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed)
     */
    public void setOtcmpfg(java.math.BigDecimal otcmpfg) {
        __modifiedProperties.add("otcmpfg");
        this._otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public java.math.BigDecimal getTmcmpfg() {
        return _tmcmpfg;
    }

    /**
     * [set] TMCMPFG: {decimal(16, 6)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed)
     */
    public void setTmcmpfg(java.math.BigDecimal tmcmpfg) {
        __modifiedProperties.add("tmcmpfg");
        this._tmcmpfg = tmcmpfg;
    }

    /**
     * [get] STMID: {varchar(30)} <br>
     * システム区分
     * @return The value of the column 'STMID'. (NullAllowed)
     */
    public String getStmid() {
        return _stmid;
    }

    /**
     * [set] STMID: {varchar(30)} <br>
     * システム区分
     * @param stmid The value of the column 'STMID'. (NullAllowed)
     */
    public void setStmid(String stmid) {
        __modifiedProperties.add("stmid");
        this._stmid = stmid;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}

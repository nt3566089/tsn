package com.oneslogi.base.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of E_TSN_PRODUCT as TABLE. <br>
 * ＴＳＮ銘柄マスタ受信テーブル
 * <pre>
 * [primary-key]
 *     TSN_PRODUCT_ID
 *
 * [column]
 *     TSN_PRODUCT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZMATNR, BRFNFL, BRFNHF, BRANFL, BRANHF, SOBRFNFL, SOBRFNHF, BRKNAME, CGGDID, ZZDEVCID, USID, CGRID, CBCCCVCE, SFCBQA, CTNUM, CBNUM, PATCBQA, ZZSEFFID, ZZABLYMD, CRSPYMD, SEYMD, DPBNYD, SOBGNYMD, EXSLYMD, AUBRID, FWBRID, BRCRID, PABRCD, AUBRCD, ZZMATNRA, MRAUCD, ZZSOMIUM, ZZREGPRCA, TFPR, MGRTA, MGRTOK, TLNPRU, HANUMWT, CNSCVCT, CGTAXCCT, NTXQART, LTXQART, ADVTAXRT, CTYTAXRT, PRFPRT, NOTAX, BRKD, FMLYCD, PRGRCD, NCTNCLS, TARCLS, PDPKSPCD, FLTID, KSUBCDID, KSUBCD, CTBCDID, CTBCD, CBBCDID, CBBCD, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, CBSZL, CBSZW, CBSZH, CBCC, CBWT, BSCDT, BSCDK, BSCDC, BSCDQ, BSCDH, SPAGCDT, SPAGCDK, SPAGCDC, SPAGCDQ, SPAGCDH, RBSCD1, RBSCD2, RBSCD3, RBSCD4, RBSCD5, USSBCD1, USSBCD2, USSBCD3, USSBCD4, USSBCD5, SPLCPCD, MAKERCD, LAND1, CGCLSDID, GNLOTRNK, MROTRNK, COID, BRWKID, SHUNID, DSTKBN, REOMATNR, DSPECKB, SGMID, MAKILENG, MAKIDIA, GDMSRP, GDSLU, GDPRU, EXIMA, EXIMB, EXIMC, EXIMD, EXIME, EXIMF, EXIMG, EXIMH, EXIMI, EXIMJ, EXIMK, EXIML, EXIMM, EXIMN, EXIMO, EXIMP, UPMN, CHNGYD, UPDTM, UPDIS, UPBMN, BCHNGYD, BUPDTM, UPOBMN, OBCHNGYD, OBUPDTM, AUBRCHFG, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDUSRID, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsETsnProductDtoMapper implements DtoMapper<ETsnProduct, ETsnProductDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETsnProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsETsnProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public ETsnProductDto mappingToDto(ETsnProduct entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETsnProductDto dto = new ETsnProductDto();
        dto.setTsnProductId(entity.getTsnProductId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setBrfnfl(entity.getBrfnfl());
        dto.setBrfnhf(entity.getBrfnhf());
        dto.setBranfl(entity.getBranfl());
        dto.setBranhf(entity.getBranhf());
        dto.setSobrfnfl(entity.getSobrfnfl());
        dto.setSobrfnhf(entity.getSobrfnhf());
        dto.setBrkname(entity.getBrkname());
        dto.setCggdid(entity.getCggdid());
        dto.setZzdevcid(entity.getZzdevcid());
        dto.setUsid(entity.getUsid());
        dto.setCgrid(entity.getCgrid());
        dto.setCbcccvce(entity.getCbcccvce());
        dto.setSfcbqa(entity.getSfcbqa());
        dto.setCtnum(entity.getCtnum());
        dto.setCbnum(entity.getCbnum());
        dto.setPatcbqa(entity.getPatcbqa());
        dto.setZzseffid(entity.getZzseffid());
        dto.setZzablymd(entity.getZzablymd());
        dto.setCrspymd(entity.getCrspymd());
        dto.setSeymd(entity.getSeymd());
        dto.setDpbnyd(entity.getDpbnyd());
        dto.setSobgnymd(entity.getSobgnymd());
        dto.setExslymd(entity.getExslymd());
        dto.setAubrid(entity.getAubrid());
        dto.setFwbrid(entity.getFwbrid());
        dto.setBrcrid(entity.getBrcrid());
        dto.setPabrcd(entity.getPabrcd());
        dto.setAubrcd(entity.getAubrcd());
        dto.setZzmatnra(entity.getZzmatnra());
        dto.setMraucd(entity.getMraucd());
        dto.setZzsomium(entity.getZzsomium());
        dto.setZzregprca(entity.getZzregprca());
        dto.setTfpr(entity.getTfpr());
        dto.setMgrta(entity.getMgrta());
        dto.setMgrtok(entity.getMgrtok());
        dto.setTlnpru(entity.getTlnpru());
        dto.setHanumwt(entity.getHanumwt());
        dto.setCnscvct(entity.getCnscvct());
        dto.setCgtaxcct(entity.getCgtaxcct());
        dto.setNtxqart(entity.getNtxqart());
        dto.setLtxqart(entity.getLtxqart());
        dto.setAdvtaxrt(entity.getAdvtaxrt());
        dto.setCtytaxrt(entity.getCtytaxrt());
        dto.setPrfprt(entity.getPrfprt());
        dto.setNotax(entity.getNotax());
        dto.setBrkd(entity.getBrkd());
        dto.setFmlycd(entity.getFmlycd());
        dto.setPrgrcd(entity.getPrgrcd());
        dto.setNctncls(entity.getNctncls());
        dto.setTarcls(entity.getTarcls());
        dto.setPdpkspcd(entity.getPdpkspcd());
        dto.setFltid(entity.getFltid());
        dto.setKsubcdid(entity.getKsubcdid());
        dto.setKsubcd(entity.getKsubcd());
        dto.setCtbcdid(entity.getCtbcdid());
        dto.setCtbcd(entity.getCtbcd());
        dto.setCbbcdid(entity.getCbbcdid());
        dto.setCbbcd(entity.getCbbcd());
        dto.setCtfm(entity.getCtfm());
        dto.setCtszl(entity.getCtszl());
        dto.setCtszw(entity.getCtszw());
        dto.setCtszh(entity.getCtszh());
        dto.setCtcc(entity.getCtcc());
        dto.setCtweight(entity.getCtweight());
        dto.setCbszl(entity.getCbszl());
        dto.setCbszw(entity.getCbszw());
        dto.setCbszh(entity.getCbszh());
        dto.setCbcc(entity.getCbcc());
        dto.setCbwt(entity.getCbwt());
        dto.setBscdt(entity.getBscdt());
        dto.setBscdk(entity.getBscdk());
        dto.setBscdc(entity.getBscdc());
        dto.setBscdq(entity.getBscdq());
        dto.setBscdh(entity.getBscdh());
        dto.setSpagcdt(entity.getSpagcdt());
        dto.setSpagcdk(entity.getSpagcdk());
        dto.setSpagcdc(entity.getSpagcdc());
        dto.setSpagcdq(entity.getSpagcdq());
        dto.setSpagcdh(entity.getSpagcdh());
        dto.setRbscd1(entity.getRbscd1());
        dto.setRbscd2(entity.getRbscd2());
        dto.setRbscd3(entity.getRbscd3());
        dto.setRbscd4(entity.getRbscd4());
        dto.setRbscd5(entity.getRbscd5());
        dto.setUssbcd1(entity.getUssbcd1());
        dto.setUssbcd2(entity.getUssbcd2());
        dto.setUssbcd3(entity.getUssbcd3());
        dto.setUssbcd4(entity.getUssbcd4());
        dto.setUssbcd5(entity.getUssbcd5());
        dto.setSplcpcd(entity.getSplcpcd());
        dto.setMakercd(entity.getMakercd());
        dto.setLand1(entity.getLand1());
        dto.setCgclsdid(entity.getCgclsdid());
        dto.setGnlotrnk(entity.getGnlotrnk());
        dto.setMrotrnk(entity.getMrotrnk());
        dto.setCoid(entity.getCoid());
        dto.setBrwkid(entity.getBrwkid());
        dto.setShunid(entity.getShunid());
        dto.setDstkbn(entity.getDstkbn());
        dto.setReomatnr(entity.getReomatnr());
        dto.setDspeckb(entity.getDspeckb());
        dto.setSgmid(entity.getSgmid());
        dto.setMakileng(entity.getMakileng());
        dto.setMakidia(entity.getMakidia());
        dto.setGdmsrp(entity.getGdmsrp());
        dto.setGdslu(entity.getGdslu());
        dto.setGdpru(entity.getGdpru());
        dto.setExima(entity.getExima());
        dto.setEximb(entity.getEximb());
        dto.setEximc(entity.getEximc());
        dto.setEximd(entity.getEximd());
        dto.setExime(entity.getExime());
        dto.setEximf(entity.getEximf());
        dto.setEximg(entity.getEximg());
        dto.setEximh(entity.getEximh());
        dto.setEximi(entity.getEximi());
        dto.setEximj(entity.getEximj());
        dto.setEximk(entity.getEximk());
        dto.setEximl(entity.getEximl());
        dto.setEximm(entity.getEximm());
        dto.setEximn(entity.getEximn());
        dto.setEximo(entity.getEximo());
        dto.setEximp(entity.getEximp());
        dto.setUpmn(entity.getUpmn());
        dto.setChngyd(entity.getChngyd());
        dto.setUpdtm(entity.getUpdtm());
        dto.setUpdis(entity.getUpdis());
        dto.setUpbmn(entity.getUpbmn());
        dto.setBchngyd(entity.getBchngyd());
        dto.setBupdtm(entity.getBupdtm());
        dto.setUpobmn(entity.getUpobmn());
        dto.setObchngyd(entity.getObchngyd());
        dto.setObupdtm(entity.getObupdtm());
        dto.setAubrchfg(entity.getAubrchfg());
        dto.setZzfrdateh(entity.getZzfrdateh());
        dto.setZztodateh(entity.getZztodateh());
        dto.setRcdupdps(entity.getRcdupdps());
        dto.setUpdusrid(entity.getUpdusrid());
        dto.setUpdpocd(entity.getUpdpocd());
        dto.setOtcmpfg(entity.getOtcmpfg());
        dto.setTmcmpfg(entity.getTmcmpfg());
        dto.setStmid(entity.getStmid());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ETsnProductDto> mappingToDtoList(List<ETsnProduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ETsnProductDto> dtoList = new ArrayList<ETsnProductDto>();
        for (ETsnProduct entity : entityList) {
            ETsnProductDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public ETsnProduct mappingToEntity(ETsnProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETsnProduct entity = new ETsnProduct();
        if (needsMapping(dto, dto.getTsnProductId(), "tsnProductId")) {
            entity.setTsnProductId(dto.getTsnProductId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getBrfnfl(), "brfnfl")) {
            entity.setBrfnfl(dto.getBrfnfl());
        }
        if (needsMapping(dto, dto.getBrfnhf(), "brfnhf")) {
            entity.setBrfnhf(dto.getBrfnhf());
        }
        if (needsMapping(dto, dto.getBranfl(), "branfl")) {
            entity.setBranfl(dto.getBranfl());
        }
        if (needsMapping(dto, dto.getBranhf(), "branhf")) {
            entity.setBranhf(dto.getBranhf());
        }
        if (needsMapping(dto, dto.getSobrfnfl(), "sobrfnfl")) {
            entity.setSobrfnfl(dto.getSobrfnfl());
        }
        if (needsMapping(dto, dto.getSobrfnhf(), "sobrfnhf")) {
            entity.setSobrfnhf(dto.getSobrfnhf());
        }
        if (needsMapping(dto, dto.getBrkname(), "brkname")) {
            entity.setBrkname(dto.getBrkname());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getZzdevcid(), "zzdevcid")) {
            entity.setZzdevcid(dto.getZzdevcid());
        }
        if (needsMapping(dto, dto.getUsid(), "usid")) {
            entity.setUsid(dto.getUsid());
        }
        if (needsMapping(dto, dto.getCgrid(), "cgrid")) {
            entity.setCgrid(dto.getCgrid());
        }
        if (needsMapping(dto, dto.getCbcccvce(), "cbcccvce")) {
            entity.setCbcccvce(dto.getCbcccvce());
        }
        if (needsMapping(dto, dto.getSfcbqa(), "sfcbqa")) {
            entity.setSfcbqa(dto.getSfcbqa());
        }
        if (needsMapping(dto, dto.getCtnum(), "ctnum")) {
            entity.setCtnum(dto.getCtnum());
        }
        if (needsMapping(dto, dto.getCbnum(), "cbnum")) {
            entity.setCbnum(dto.getCbnum());
        }
        if (needsMapping(dto, dto.getPatcbqa(), "patcbqa")) {
            entity.setPatcbqa(dto.getPatcbqa());
        }
        if (needsMapping(dto, dto.getZzseffid(), "zzseffid")) {
            entity.setZzseffid(dto.getZzseffid());
        }
        if (needsMapping(dto, dto.getZzablymd(), "zzablymd")) {
            entity.setZzablymd(dto.getZzablymd());
        }
        if (needsMapping(dto, dto.getCrspymd(), "crspymd")) {
            entity.setCrspymd(dto.getCrspymd());
        }
        if (needsMapping(dto, dto.getSeymd(), "seymd")) {
            entity.setSeymd(dto.getSeymd());
        }
        if (needsMapping(dto, dto.getDpbnyd(), "dpbnyd")) {
            entity.setDpbnyd(dto.getDpbnyd());
        }
        if (needsMapping(dto, dto.getSobgnymd(), "sobgnymd")) {
            entity.setSobgnymd(dto.getSobgnymd());
        }
        if (needsMapping(dto, dto.getExslymd(), "exslymd")) {
            entity.setExslymd(dto.getExslymd());
        }
        if (needsMapping(dto, dto.getAubrid(), "aubrid")) {
            entity.setAubrid(dto.getAubrid());
        }
        if (needsMapping(dto, dto.getFwbrid(), "fwbrid")) {
            entity.setFwbrid(dto.getFwbrid());
        }
        if (needsMapping(dto, dto.getBrcrid(), "brcrid")) {
            entity.setBrcrid(dto.getBrcrid());
        }
        if (needsMapping(dto, dto.getPabrcd(), "pabrcd")) {
            entity.setPabrcd(dto.getPabrcd());
        }
        if (needsMapping(dto, dto.getAubrcd(), "aubrcd")) {
            entity.setAubrcd(dto.getAubrcd());
        }
        if (needsMapping(dto, dto.getZzmatnra(), "zzmatnra")) {
            entity.setZzmatnra(dto.getZzmatnra());
        }
        if (needsMapping(dto, dto.getMraucd(), "mraucd")) {
            entity.setMraucd(dto.getMraucd());
        }
        if (needsMapping(dto, dto.getZzsomium(), "zzsomium")) {
            entity.setZzsomium(dto.getZzsomium());
        }
        if (needsMapping(dto, dto.getZzregprca(), "zzregprca")) {
            entity.setZzregprca(dto.getZzregprca());
        }
        if (needsMapping(dto, dto.getTfpr(), "tfpr")) {
            entity.setTfpr(dto.getTfpr());
        }
        if (needsMapping(dto, dto.getMgrta(), "mgrta")) {
            entity.setMgrta(dto.getMgrta());
        }
        if (needsMapping(dto, dto.getMgrtok(), "mgrtok")) {
            entity.setMgrtok(dto.getMgrtok());
        }
        if (needsMapping(dto, dto.getTlnpru(), "tlnpru")) {
            entity.setTlnpru(dto.getTlnpru());
        }
        if (needsMapping(dto, dto.getHanumwt(), "hanumwt")) {
            entity.setHanumwt(dto.getHanumwt());
        }
        if (needsMapping(dto, dto.getCnscvct(), "cnscvct")) {
            entity.setCnscvct(dto.getCnscvct());
        }
        if (needsMapping(dto, dto.getCgtaxcct(), "cgtaxcct")) {
            entity.setCgtaxcct(dto.getCgtaxcct());
        }
        if (needsMapping(dto, dto.getNtxqart(), "ntxqart")) {
            entity.setNtxqart(dto.getNtxqart());
        }
        if (needsMapping(dto, dto.getLtxqart(), "ltxqart")) {
            entity.setLtxqart(dto.getLtxqart());
        }
        if (needsMapping(dto, dto.getAdvtaxrt(), "advtaxrt")) {
            entity.setAdvtaxrt(dto.getAdvtaxrt());
        }
        if (needsMapping(dto, dto.getCtytaxrt(), "ctytaxrt")) {
            entity.setCtytaxrt(dto.getCtytaxrt());
        }
        if (needsMapping(dto, dto.getPrfprt(), "prfprt")) {
            entity.setPrfprt(dto.getPrfprt());
        }
        if (needsMapping(dto, dto.getNotax(), "notax")) {
            entity.setNotax(dto.getNotax());
        }
        if (needsMapping(dto, dto.getBrkd(), "brkd")) {
            entity.setBrkd(dto.getBrkd());
        }
        if (needsMapping(dto, dto.getFmlycd(), "fmlycd")) {
            entity.setFmlycd(dto.getFmlycd());
        }
        if (needsMapping(dto, dto.getPrgrcd(), "prgrcd")) {
            entity.setPrgrcd(dto.getPrgrcd());
        }
        if (needsMapping(dto, dto.getNctncls(), "nctncls")) {
            entity.setNctncls(dto.getNctncls());
        }
        if (needsMapping(dto, dto.getTarcls(), "tarcls")) {
            entity.setTarcls(dto.getTarcls());
        }
        if (needsMapping(dto, dto.getPdpkspcd(), "pdpkspcd")) {
            entity.setPdpkspcd(dto.getPdpkspcd());
        }
        if (needsMapping(dto, dto.getFltid(), "fltid")) {
            entity.setFltid(dto.getFltid());
        }
        if (needsMapping(dto, dto.getKsubcdid(), "ksubcdid")) {
            entity.setKsubcdid(dto.getKsubcdid());
        }
        if (needsMapping(dto, dto.getKsubcd(), "ksubcd")) {
            entity.setKsubcd(dto.getKsubcd());
        }
        if (needsMapping(dto, dto.getCtbcdid(), "ctbcdid")) {
            entity.setCtbcdid(dto.getCtbcdid());
        }
        if (needsMapping(dto, dto.getCtbcd(), "ctbcd")) {
            entity.setCtbcd(dto.getCtbcd());
        }
        if (needsMapping(dto, dto.getCbbcdid(), "cbbcdid")) {
            entity.setCbbcdid(dto.getCbbcdid());
        }
        if (needsMapping(dto, dto.getCbbcd(), "cbbcd")) {
            entity.setCbbcd(dto.getCbbcd());
        }
        if (needsMapping(dto, dto.getCtfm(), "ctfm")) {
            entity.setCtfm(dto.getCtfm());
        }
        if (needsMapping(dto, dto.getCtszl(), "ctszl")) {
            entity.setCtszl(dto.getCtszl());
        }
        if (needsMapping(dto, dto.getCtszw(), "ctszw")) {
            entity.setCtszw(dto.getCtszw());
        }
        if (needsMapping(dto, dto.getCtszh(), "ctszh")) {
            entity.setCtszh(dto.getCtszh());
        }
        if (needsMapping(dto, dto.getCtcc(), "ctcc")) {
            entity.setCtcc(dto.getCtcc());
        }
        if (needsMapping(dto, dto.getCtweight(), "ctweight")) {
            entity.setCtweight(dto.getCtweight());
        }
        if (needsMapping(dto, dto.getCbszl(), "cbszl")) {
            entity.setCbszl(dto.getCbszl());
        }
        if (needsMapping(dto, dto.getCbszw(), "cbszw")) {
            entity.setCbszw(dto.getCbszw());
        }
        if (needsMapping(dto, dto.getCbszh(), "cbszh")) {
            entity.setCbszh(dto.getCbszh());
        }
        if (needsMapping(dto, dto.getCbcc(), "cbcc")) {
            entity.setCbcc(dto.getCbcc());
        }
        if (needsMapping(dto, dto.getCbwt(), "cbwt")) {
            entity.setCbwt(dto.getCbwt());
        }
        if (needsMapping(dto, dto.getBscdt(), "bscdt")) {
            entity.setBscdt(dto.getBscdt());
        }
        if (needsMapping(dto, dto.getBscdk(), "bscdk")) {
            entity.setBscdk(dto.getBscdk());
        }
        if (needsMapping(dto, dto.getBscdc(), "bscdc")) {
            entity.setBscdc(dto.getBscdc());
        }
        if (needsMapping(dto, dto.getBscdq(), "bscdq")) {
            entity.setBscdq(dto.getBscdq());
        }
        if (needsMapping(dto, dto.getBscdh(), "bscdh")) {
            entity.setBscdh(dto.getBscdh());
        }
        if (needsMapping(dto, dto.getSpagcdt(), "spagcdt")) {
            entity.setSpagcdt(dto.getSpagcdt());
        }
        if (needsMapping(dto, dto.getSpagcdk(), "spagcdk")) {
            entity.setSpagcdk(dto.getSpagcdk());
        }
        if (needsMapping(dto, dto.getSpagcdc(), "spagcdc")) {
            entity.setSpagcdc(dto.getSpagcdc());
        }
        if (needsMapping(dto, dto.getSpagcdq(), "spagcdq")) {
            entity.setSpagcdq(dto.getSpagcdq());
        }
        if (needsMapping(dto, dto.getSpagcdh(), "spagcdh")) {
            entity.setSpagcdh(dto.getSpagcdh());
        }
        if (needsMapping(dto, dto.getRbscd1(), "rbscd1")) {
            entity.setRbscd1(dto.getRbscd1());
        }
        if (needsMapping(dto, dto.getRbscd2(), "rbscd2")) {
            entity.setRbscd2(dto.getRbscd2());
        }
        if (needsMapping(dto, dto.getRbscd3(), "rbscd3")) {
            entity.setRbscd3(dto.getRbscd3());
        }
        if (needsMapping(dto, dto.getRbscd4(), "rbscd4")) {
            entity.setRbscd4(dto.getRbscd4());
        }
        if (needsMapping(dto, dto.getRbscd5(), "rbscd5")) {
            entity.setRbscd5(dto.getRbscd5());
        }
        if (needsMapping(dto, dto.getUssbcd1(), "ussbcd1")) {
            entity.setUssbcd1(dto.getUssbcd1());
        }
        if (needsMapping(dto, dto.getUssbcd2(), "ussbcd2")) {
            entity.setUssbcd2(dto.getUssbcd2());
        }
        if (needsMapping(dto, dto.getUssbcd3(), "ussbcd3")) {
            entity.setUssbcd3(dto.getUssbcd3());
        }
        if (needsMapping(dto, dto.getUssbcd4(), "ussbcd4")) {
            entity.setUssbcd4(dto.getUssbcd4());
        }
        if (needsMapping(dto, dto.getUssbcd5(), "ussbcd5")) {
            entity.setUssbcd5(dto.getUssbcd5());
        }
        if (needsMapping(dto, dto.getSplcpcd(), "splcpcd")) {
            entity.setSplcpcd(dto.getSplcpcd());
        }
        if (needsMapping(dto, dto.getMakercd(), "makercd")) {
            entity.setMakercd(dto.getMakercd());
        }
        if (needsMapping(dto, dto.getLand1(), "land1")) {
            entity.setLand1(dto.getLand1());
        }
        if (needsMapping(dto, dto.getCgclsdid(), "cgclsdid")) {
            entity.setCgclsdid(dto.getCgclsdid());
        }
        if (needsMapping(dto, dto.getGnlotrnk(), "gnlotrnk")) {
            entity.setGnlotrnk(dto.getGnlotrnk());
        }
        if (needsMapping(dto, dto.getMrotrnk(), "mrotrnk")) {
            entity.setMrotrnk(dto.getMrotrnk());
        }
        if (needsMapping(dto, dto.getCoid(), "coid")) {
            entity.setCoid(dto.getCoid());
        }
        if (needsMapping(dto, dto.getBrwkid(), "brwkid")) {
            entity.setBrwkid(dto.getBrwkid());
        }
        if (needsMapping(dto, dto.getShunid(), "shunid")) {
            entity.setShunid(dto.getShunid());
        }
        if (needsMapping(dto, dto.getDstkbn(), "dstkbn")) {
            entity.setDstkbn(dto.getDstkbn());
        }
        if (needsMapping(dto, dto.getReomatnr(), "reomatnr")) {
            entity.setReomatnr(dto.getReomatnr());
        }
        if (needsMapping(dto, dto.getDspeckb(), "dspeckb")) {
            entity.setDspeckb(dto.getDspeckb());
        }
        if (needsMapping(dto, dto.getSgmid(), "sgmid")) {
            entity.setSgmid(dto.getSgmid());
        }
        if (needsMapping(dto, dto.getMakileng(), "makileng")) {
            entity.setMakileng(dto.getMakileng());
        }
        if (needsMapping(dto, dto.getMakidia(), "makidia")) {
            entity.setMakidia(dto.getMakidia());
        }
        if (needsMapping(dto, dto.getGdmsrp(), "gdmsrp")) {
            entity.setGdmsrp(dto.getGdmsrp());
        }
        if (needsMapping(dto, dto.getGdslu(), "gdslu")) {
            entity.setGdslu(dto.getGdslu());
        }
        if (needsMapping(dto, dto.getGdpru(), "gdpru")) {
            entity.setGdpru(dto.getGdpru());
        }
        if (needsMapping(dto, dto.getExima(), "exima")) {
            entity.setExima(dto.getExima());
        }
        if (needsMapping(dto, dto.getEximb(), "eximb")) {
            entity.setEximb(dto.getEximb());
        }
        if (needsMapping(dto, dto.getEximc(), "eximc")) {
            entity.setEximc(dto.getEximc());
        }
        if (needsMapping(dto, dto.getEximd(), "eximd")) {
            entity.setEximd(dto.getEximd());
        }
        if (needsMapping(dto, dto.getExime(), "exime")) {
            entity.setExime(dto.getExime());
        }
        if (needsMapping(dto, dto.getEximf(), "eximf")) {
            entity.setEximf(dto.getEximf());
        }
        if (needsMapping(dto, dto.getEximg(), "eximg")) {
            entity.setEximg(dto.getEximg());
        }
        if (needsMapping(dto, dto.getEximh(), "eximh")) {
            entity.setEximh(dto.getEximh());
        }
        if (needsMapping(dto, dto.getEximi(), "eximi")) {
            entity.setEximi(dto.getEximi());
        }
        if (needsMapping(dto, dto.getEximj(), "eximj")) {
            entity.setEximj(dto.getEximj());
        }
        if (needsMapping(dto, dto.getEximk(), "eximk")) {
            entity.setEximk(dto.getEximk());
        }
        if (needsMapping(dto, dto.getEximl(), "eximl")) {
            entity.setEximl(dto.getEximl());
        }
        if (needsMapping(dto, dto.getEximm(), "eximm")) {
            entity.setEximm(dto.getEximm());
        }
        if (needsMapping(dto, dto.getEximn(), "eximn")) {
            entity.setEximn(dto.getEximn());
        }
        if (needsMapping(dto, dto.getEximo(), "eximo")) {
            entity.setEximo(dto.getEximo());
        }
        if (needsMapping(dto, dto.getEximp(), "eximp")) {
            entity.setEximp(dto.getEximp());
        }
        if (needsMapping(dto, dto.getUpmn(), "upmn")) {
            entity.setUpmn(dto.getUpmn());
        }
        if (needsMapping(dto, dto.getChngyd(), "chngyd")) {
            entity.setChngyd(dto.getChngyd());
        }
        if (needsMapping(dto, dto.getUpdtm(), "updtm")) {
            entity.setUpdtm(dto.getUpdtm());
        }
        if (needsMapping(dto, dto.getUpdis(), "updis")) {
            entity.setUpdis(dto.getUpdis());
        }
        if (needsMapping(dto, dto.getUpbmn(), "upbmn")) {
            entity.setUpbmn(dto.getUpbmn());
        }
        if (needsMapping(dto, dto.getBchngyd(), "bchngyd")) {
            entity.setBchngyd(dto.getBchngyd());
        }
        if (needsMapping(dto, dto.getBupdtm(), "bupdtm")) {
            entity.setBupdtm(dto.getBupdtm());
        }
        if (needsMapping(dto, dto.getUpobmn(), "upobmn")) {
            entity.setUpobmn(dto.getUpobmn());
        }
        if (needsMapping(dto, dto.getObchngyd(), "obchngyd")) {
            entity.setObchngyd(dto.getObchngyd());
        }
        if (needsMapping(dto, dto.getObupdtm(), "obupdtm")) {
            entity.setObupdtm(dto.getObupdtm());
        }
        if (needsMapping(dto, dto.getAubrchfg(), "aubrchfg")) {
            entity.setAubrchfg(dto.getAubrchfg());
        }
        if (needsMapping(dto, dto.getZzfrdateh(), "zzfrdateh")) {
            entity.setZzfrdateh(dto.getZzfrdateh());
        }
        if (needsMapping(dto, dto.getZztodateh(), "zztodateh")) {
            entity.setZztodateh(dto.getZztodateh());
        }
        if (needsMapping(dto, dto.getRcdupdps(), "rcdupdps")) {
            entity.setRcdupdps(dto.getRcdupdps());
        }
        if (needsMapping(dto, dto.getUpdusrid(), "updusrid")) {
            entity.setUpdusrid(dto.getUpdusrid());
        }
        if (needsMapping(dto, dto.getUpdpocd(), "updpocd")) {
            entity.setUpdpocd(dto.getUpdpocd());
        }
        if (needsMapping(dto, dto.getOtcmpfg(), "otcmpfg")) {
            entity.setOtcmpfg(dto.getOtcmpfg());
        }
        if (needsMapping(dto, dto.getTmcmpfg(), "tmcmpfg")) {
            entity.setTmcmpfg(dto.getTmcmpfg());
        }
        if (needsMapping(dto, dto.getStmid(), "stmid")) {
            entity.setStmid(dto.getStmid());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, false);
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(ETsnProductDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<ETsnProduct> mappingToEntityList(List<ETsnProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ETsnProduct> entityList = new ArrayList<ETsnProduct>();
        for (ETsnProductDto dto : dtoList) {
            ETsnProduct entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public ETsnProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ETsnProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ETsnProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ETsnProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ETsnProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (ETsnProductDtoMapper)this;
    }
}

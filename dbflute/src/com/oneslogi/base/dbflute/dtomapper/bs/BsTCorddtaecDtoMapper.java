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
 * The DTO mapper of T_CORDDTAEC as TABLE. <br>
 * さしずデータ(取替用）
 * <pre>
 * [primary-key]
 *     ORDER_CHANGE_ID
 *
 * [column]
 *     ORDER_CHANGE_ID, ORDER_H_ID, SRWHCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, HPYNID, IPYNID, SRDED, SRPSTNID, SRYMD, SROPRTCNT, SRLINCD, SRRNK, DLVSNM, DLVDTLSNM, SSCD, SSNM, HDVID, DTLSNM, ZZMATNR, SLQACB, SLQACT, SLQANUM, LINBLK, LOCNO, LOCID, DLVPRTRNK, SRDLVYMD, SRHPYNID, SRIPYNID, SRSRLINCD, SRSRRNK, SRDLVSNM, SRDLVDTLSNM, SRDLVPRTRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, TTSROPRTCNT, BXMTRID, SPPLYMD, SLPTYP, SEQNO, OTORGCD, ORDORGCD, RLYBSCD, DLVRNK, LMPDLVNO, DIVMTD, SLEDIV, HVRTRSN, HVRTINOTYMD, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, SLPOTYMD, CMPCD, STSCD, STGVAL, SLPNO, TTTOPDEDRNK, CORDRCVCNT, ORDDVFG, LBCBQA, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, IKEIINCLDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_CHANGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_CORDHDR
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tCordhdr
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTCorddtaecDtoMapper implements DtoMapper<TCorddtaec, TCorddtaecDto>, Serializable {

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
    protected boolean _suppressTCordhdr;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCorddtaecDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTCorddtaecDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TCorddtaecDto mappingToDto(TCorddtaec entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TCorddtaecDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCorddtaecDto dto = new TCorddtaecDto();
        dto.setOrderChangeId(entity.getOrderChangeId());
        dto.setOrderHId(entity.getOrderHId());
        dto.setSrwhcd(entity.getSrwhcd());
        dto.setDpcd(entity.getDpcd());
        dto.setZzordymd(entity.getZzordymd());
        dto.setOrdgr(entity.getOrdgr());
        dto.setDlvymd(entity.getDlvymd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setScddlvymd(entity.getScddlvymd());
        dto.setScdded(entity.getScdded());
        dto.setScdpstnid(entity.getScdpstnid());
        dto.setHpynid(entity.getHpynid());
        dto.setIpynid(entity.getIpynid());
        dto.setSrded(entity.getSrded());
        dto.setSrpstnid(entity.getSrpstnid());
        dto.setSrymd(entity.getSrymd());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setSrlincd(entity.getSrlincd());
        dto.setSrrnk(entity.getSrrnk());
        dto.setDlvsnm(entity.getDlvsnm());
        dto.setDlvdtlsnm(entity.getDlvdtlsnm());
        dto.setSscd(entity.getSscd());
        dto.setSsnm(entity.getSsnm());
        dto.setHdvid(entity.getHdvid());
        dto.setDtlsnm(entity.getDtlsnm());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setSlqacb(entity.getSlqacb());
        dto.setSlqact(entity.getSlqact());
        dto.setSlqanum(entity.getSlqanum());
        dto.setLinblk(entity.getLinblk());
        dto.setLocno(entity.getLocno());
        dto.setLocid(entity.getLocid());
        dto.setDlvprtrnk(entity.getDlvprtrnk());
        dto.setSrdlvymd(entity.getSrdlvymd());
        dto.setSrhpynid(entity.getSrhpynid());
        dto.setSripynid(entity.getSripynid());
        dto.setSrsrlincd(entity.getSrsrlincd());
        dto.setSrsrrnk(entity.getSrsrrnk());
        dto.setSrdlvsnm(entity.getSrdlvsnm());
        dto.setSrdlvdtlsnm(entity.getSrdlvdtlsnm());
        dto.setSrdlvprtrnk(entity.getSrdlvprtrnk());
        dto.setBrtyp(entity.getBrtyp());
        dto.setBoxno(entity.getBoxno());
        dto.setBoxnocnsnm(entity.getBoxnocnsnm());
        dto.setBoxtyp(entity.getBoxtyp());
        dto.setMgboxdid(entity.getMgboxdid());
        dto.setDmdid(entity.getDmdid());
        dto.setTtboxqa(entity.getTtboxqa());
        dto.setBoxctqata(entity.getBoxctqata());
        dto.setBoxctqaapsrplc(entity.getBoxctqaapsrplc());
        dto.setTtsroprtcnt(entity.getTtsroprtcnt());
        dto.setBxmtrid(entity.getBxmtrid());
        dto.setSpplymd(entity.getSpplymd());
        dto.setSlptyp(entity.getSlptyp());
        dto.setSeqno(entity.getSeqno());
        dto.setOtorgcd(entity.getOtorgcd());
        dto.setOrdorgcd(entity.getOrdorgcd());
        dto.setRlybscd(entity.getRlybscd());
        dto.setDlvrnk(entity.getDlvrnk());
        dto.setLmpdlvno(entity.getLmpdlvno());
        dto.setDivmtd(entity.getDivmtd());
        dto.setSlediv(entity.getSlediv());
        dto.setHvrtrsn(entity.getHvrtrsn());
        dto.setHvrtinotymd(entity.getHvrtinotymd());
        dto.setCngprtslpno(entity.getCngprtslpno());
        dto.setTrnsctndiv(entity.getTrnsctndiv());
        dto.setEosordaftflg(entity.getEosordaftflg());
        dto.setEosslpno(entity.getEosslpno());
        dto.setHdrdbxdiv(entity.getHdrdbxdiv());
        dto.setInotrfsldiv(entity.getInotrfsldiv());
        dto.setBxmntrfsldiv(entity.getBxmntrfsldiv());
        dto.setSlpmrgtmg(entity.getSlpmrgtmg());
        dto.setSlpotymd(entity.getSlpotymd());
        dto.setCmpcd(entity.getCmpcd());
        dto.setStscd(entity.getStscd());
        dto.setStgval(entity.getStgval());
        dto.setSlpno(entity.getSlpno());
        dto.setTttopdedrnk(entity.getTttopdedrnk());
        dto.setCordrcvcnt(entity.getCordrcvcnt());
        dto.setOrddvfg(entity.getOrddvfg());
        dto.setLbcbqa(entity.getLbcbqa());
        dto.setDrclstlbcbid(entity.getDrclstlbcbid());
        dto.setLbboxno(entity.getLbboxno());
        dto.setLbttboxqa(entity.getLbttboxqa());
        dto.setIkeiincldflg(entity.getIkeiincldflg());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTCordhdr && entity.getTCordhdr() != null) {
            TCordhdr relationEntity = entity.getTCordhdr();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TCordhdrDto relationDto = (TCordhdrDto)cachedDto;
                dto.setTCordhdr(relationDto);
                if (reverseReference) {
                    relationDto.getTCorddtaecList().add(dto);
                }
            } else {
                TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCorddtaecList();
                TCordhdrDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTCordhdr(relationDto);
                if (reverseReference) {
                    relationDto.getTCorddtaecList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTCordhdr());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TCorddtaecDto> mappingToDtoList(List<TCorddtaec> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TCorddtaecDto> dtoList = new ArrayList<TCorddtaecDto>();
        for (TCorddtaec entity : entityList) {
            TCorddtaecDto dto = mappingToDto(entity);
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
    public TCorddtaec mappingToEntity(TCorddtaecDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TCorddtaec)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCorddtaec entity = new TCorddtaec();
        if (needsMapping(dto, dto.getOrderChangeId(), "orderChangeId")) {
            entity.setOrderChangeId(dto.getOrderChangeId());
        }
        if (needsMapping(dto, dto.getOrderHId(), "orderHId")) {
            entity.setOrderHId(dto.getOrderHId());
        }
        if (needsMapping(dto, dto.getSrwhcd(), "srwhcd")) {
            entity.setSrwhcd(dto.getSrwhcd());
        }
        if (needsMapping(dto, dto.getDpcd(), "dpcd")) {
            entity.setDpcd(dto.getDpcd());
        }
        if (needsMapping(dto, dto.getZzordymd(), "zzordymd")) {
            entity.setZzordymd(dto.getZzordymd());
        }
        if (needsMapping(dto, dto.getOrdgr(), "ordgr")) {
            entity.setOrdgr(dto.getOrdgr());
        }
        if (needsMapping(dto, dto.getDlvymd(), "dlvymd")) {
            entity.setDlvymd(dto.getDlvymd());
        }
        if (needsMapping(dto, dto.getDed(), "ded")) {
            entity.setDed(dto.getDed());
        }
        if (needsMapping(dto, dto.getPstnid(), "pstnid")) {
            entity.setPstnid(dto.getPstnid());
        }
        if (needsMapping(dto, dto.getScddlvymd(), "scddlvymd")) {
            entity.setScddlvymd(dto.getScddlvymd());
        }
        if (needsMapping(dto, dto.getScdded(), "scdded")) {
            entity.setScdded(dto.getScdded());
        }
        if (needsMapping(dto, dto.getScdpstnid(), "scdpstnid")) {
            entity.setScdpstnid(dto.getScdpstnid());
        }
        if (needsMapping(dto, dto.getHpynid(), "hpynid")) {
            entity.setHpynid(dto.getHpynid());
        }
        if (needsMapping(dto, dto.getIpynid(), "ipynid")) {
            entity.setIpynid(dto.getIpynid());
        }
        if (needsMapping(dto, dto.getSrded(), "srded")) {
            entity.setSrded(dto.getSrded());
        }
        if (needsMapping(dto, dto.getSrpstnid(), "srpstnid")) {
            entity.setSrpstnid(dto.getSrpstnid());
        }
        if (needsMapping(dto, dto.getSrymd(), "srymd")) {
            entity.setSrymd(dto.getSrymd());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getSrlincd(), "srlincd")) {
            entity.setSrlincd(dto.getSrlincd());
        }
        if (needsMapping(dto, dto.getSrrnk(), "srrnk")) {
            entity.setSrrnk(dto.getSrrnk());
        }
        if (needsMapping(dto, dto.getDlvsnm(), "dlvsnm")) {
            entity.setDlvsnm(dto.getDlvsnm());
        }
        if (needsMapping(dto, dto.getDlvdtlsnm(), "dlvdtlsnm")) {
            entity.setDlvdtlsnm(dto.getDlvdtlsnm());
        }
        if (needsMapping(dto, dto.getSscd(), "sscd")) {
            entity.setSscd(dto.getSscd());
        }
        if (needsMapping(dto, dto.getSsnm(), "ssnm")) {
            entity.setSsnm(dto.getSsnm());
        }
        if (needsMapping(dto, dto.getHdvid(), "hdvid")) {
            entity.setHdvid(dto.getHdvid());
        }
        if (needsMapping(dto, dto.getDtlsnm(), "dtlsnm")) {
            entity.setDtlsnm(dto.getDtlsnm());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getSlqacb(), "slqacb")) {
            entity.setSlqacb(dto.getSlqacb());
        }
        if (needsMapping(dto, dto.getSlqact(), "slqact")) {
            entity.setSlqact(dto.getSlqact());
        }
        if (needsMapping(dto, dto.getSlqanum(), "slqanum")) {
            entity.setSlqanum(dto.getSlqanum());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getLocno(), "locno")) {
            entity.setLocno(dto.getLocno());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getDlvprtrnk(), "dlvprtrnk")) {
            entity.setDlvprtrnk(dto.getDlvprtrnk());
        }
        if (needsMapping(dto, dto.getSrdlvymd(), "srdlvymd")) {
            entity.setSrdlvymd(dto.getSrdlvymd());
        }
        if (needsMapping(dto, dto.getSrhpynid(), "srhpynid")) {
            entity.setSrhpynid(dto.getSrhpynid());
        }
        if (needsMapping(dto, dto.getSripynid(), "sripynid")) {
            entity.setSripynid(dto.getSripynid());
        }
        if (needsMapping(dto, dto.getSrsrlincd(), "srsrlincd")) {
            entity.setSrsrlincd(dto.getSrsrlincd());
        }
        if (needsMapping(dto, dto.getSrsrrnk(), "srsrrnk")) {
            entity.setSrsrrnk(dto.getSrsrrnk());
        }
        if (needsMapping(dto, dto.getSrdlvsnm(), "srdlvsnm")) {
            entity.setSrdlvsnm(dto.getSrdlvsnm());
        }
        if (needsMapping(dto, dto.getSrdlvdtlsnm(), "srdlvdtlsnm")) {
            entity.setSrdlvdtlsnm(dto.getSrdlvdtlsnm());
        }
        if (needsMapping(dto, dto.getSrdlvprtrnk(), "srdlvprtrnk")) {
            entity.setSrdlvprtrnk(dto.getSrdlvprtrnk());
        }
        if (needsMapping(dto, dto.getBrtyp(), "brtyp")) {
            entity.setBrtyp(dto.getBrtyp());
        }
        if (needsMapping(dto, dto.getBoxno(), "boxno")) {
            entity.setBoxno(dto.getBoxno());
        }
        if (needsMapping(dto, dto.getBoxnocnsnm(), "boxnocnsnm")) {
            entity.setBoxnocnsnm(dto.getBoxnocnsnm());
        }
        if (needsMapping(dto, dto.getBoxtyp(), "boxtyp")) {
            entity.setBoxtyp(dto.getBoxtyp());
        }
        if (needsMapping(dto, dto.getMgboxdid(), "mgboxdid")) {
            entity.setMgboxdid(dto.getMgboxdid());
        }
        if (needsMapping(dto, dto.getDmdid(), "dmdid")) {
            entity.setDmdid(dto.getDmdid());
        }
        if (needsMapping(dto, dto.getTtboxqa(), "ttboxqa")) {
            entity.setTtboxqa(dto.getTtboxqa());
        }
        if (needsMapping(dto, dto.getBoxctqata(), "boxctqata")) {
            entity.setBoxctqata(dto.getBoxctqata());
        }
        if (needsMapping(dto, dto.getBoxctqaapsrplc(), "boxctqaapsrplc")) {
            entity.setBoxctqaapsrplc(dto.getBoxctqaapsrplc());
        }
        if (needsMapping(dto, dto.getTtsroprtcnt(), "ttsroprtcnt")) {
            entity.setTtsroprtcnt(dto.getTtsroprtcnt());
        }
        if (needsMapping(dto, dto.getBxmtrid(), "bxmtrid")) {
            entity.setBxmtrid(dto.getBxmtrid());
        }
        if (needsMapping(dto, dto.getSpplymd(), "spplymd")) {
            entity.setSpplymd(dto.getSpplymd());
        }
        if (needsMapping(dto, dto.getSlptyp(), "slptyp")) {
            entity.setSlptyp(dto.getSlptyp());
        }
        if (needsMapping(dto, dto.getSeqno(), "seqno")) {
            entity.setSeqno(dto.getSeqno());
        }
        if (needsMapping(dto, dto.getOtorgcd(), "otorgcd")) {
            entity.setOtorgcd(dto.getOtorgcd());
        }
        if (needsMapping(dto, dto.getOrdorgcd(), "ordorgcd")) {
            entity.setOrdorgcd(dto.getOrdorgcd());
        }
        if (needsMapping(dto, dto.getRlybscd(), "rlybscd")) {
            entity.setRlybscd(dto.getRlybscd());
        }
        if (needsMapping(dto, dto.getDlvrnk(), "dlvrnk")) {
            entity.setDlvrnk(dto.getDlvrnk());
        }
        if (needsMapping(dto, dto.getLmpdlvno(), "lmpdlvno")) {
            entity.setLmpdlvno(dto.getLmpdlvno());
        }
        if (needsMapping(dto, dto.getDivmtd(), "divmtd")) {
            entity.setDivmtd(dto.getDivmtd());
        }
        if (needsMapping(dto, dto.getSlediv(), "slediv")) {
            entity.setSlediv(dto.getSlediv());
        }
        if (needsMapping(dto, dto.getHvrtrsn(), "hvrtrsn")) {
            entity.setHvrtrsn(dto.getHvrtrsn());
        }
        if (needsMapping(dto, dto.getHvrtinotymd(), "hvrtinotymd")) {
            entity.setHvrtinotymd(dto.getHvrtinotymd());
        }
        if (needsMapping(dto, dto.getCngprtslpno(), "cngprtslpno")) {
            entity.setCngprtslpno(dto.getCngprtslpno());
        }
        if (needsMapping(dto, dto.getTrnsctndiv(), "trnsctndiv")) {
            entity.setTrnsctndiv(dto.getTrnsctndiv());
        }
        if (needsMapping(dto, dto.getEosordaftflg(), "eosordaftflg")) {
            entity.setEosordaftflg(dto.getEosordaftflg());
        }
        if (needsMapping(dto, dto.getEosslpno(), "eosslpno")) {
            entity.setEosslpno(dto.getEosslpno());
        }
        if (needsMapping(dto, dto.getHdrdbxdiv(), "hdrdbxdiv")) {
            entity.setHdrdbxdiv(dto.getHdrdbxdiv());
        }
        if (needsMapping(dto, dto.getInotrfsldiv(), "inotrfsldiv")) {
            entity.setInotrfsldiv(dto.getInotrfsldiv());
        }
        if (needsMapping(dto, dto.getBxmntrfsldiv(), "bxmntrfsldiv")) {
            entity.setBxmntrfsldiv(dto.getBxmntrfsldiv());
        }
        if (needsMapping(dto, dto.getSlpmrgtmg(), "slpmrgtmg")) {
            entity.setSlpmrgtmg(dto.getSlpmrgtmg());
        }
        if (needsMapping(dto, dto.getSlpotymd(), "slpotymd")) {
            entity.setSlpotymd(dto.getSlpotymd());
        }
        if (needsMapping(dto, dto.getCmpcd(), "cmpcd")) {
            entity.setCmpcd(dto.getCmpcd());
        }
        if (needsMapping(dto, dto.getStscd(), "stscd")) {
            entity.setStscd(dto.getStscd());
        }
        if (needsMapping(dto, dto.getStgval(), "stgval")) {
            entity.setStgval(dto.getStgval());
        }
        if (needsMapping(dto, dto.getSlpno(), "slpno")) {
            entity.setSlpno(dto.getSlpno());
        }
        if (needsMapping(dto, dto.getTttopdedrnk(), "tttopdedrnk")) {
            entity.setTttopdedrnk(dto.getTttopdedrnk());
        }
        if (needsMapping(dto, dto.getCordrcvcnt(), "cordrcvcnt")) {
            entity.setCordrcvcnt(dto.getCordrcvcnt());
        }
        if (needsMapping(dto, dto.getOrddvfg(), "orddvfg")) {
            entity.setOrddvfg(dto.getOrddvfg());
        }
        if (needsMapping(dto, dto.getLbcbqa(), "lbcbqa")) {
            entity.setLbcbqa(dto.getLbcbqa());
        }
        if (needsMapping(dto, dto.getDrclstlbcbid(), "drclstlbcbid")) {
            entity.setDrclstlbcbid(dto.getDrclstlbcbid());
        }
        if (needsMapping(dto, dto.getLbboxno(), "lbboxno")) {
            entity.setLbboxno(dto.getLbboxno());
        }
        if (needsMapping(dto, dto.getLbttboxqa(), "lbttboxqa")) {
            entity.setLbttboxqa(dto.getLbttboxqa());
        }
        if (needsMapping(dto, dto.getIkeiincldflg(), "ikeiincldflg")) {
            entity.setIkeiincldflg(dto.getIkeiincldflg());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTCordhdr && dto.getTCordhdr() != null) {
            TCordhdrDto relationDto = dto.getTCordhdr();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TCordhdr relationEntity = (TCordhdr)cachedEntity;
                entity.setTCordhdr(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCorddtaecList().add(entity);
                }
            } else {
                TCordhdrDtoMapper mapper = new TCordhdrDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCorddtaecList();
                TCordhdr relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTCordhdr(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCorddtaecList().add(entity);
                }
                if (instanceCache && entity.getTCordhdr().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTCordhdr());
                }
            }
        };
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
    protected boolean needsMapping(TCorddtaecDto dto, Object value, String propName) {
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
    public List<TCorddtaec> mappingToEntityList(List<TCorddtaecDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TCorddtaec> entityList = new ArrayList<TCorddtaec>();
        for (TCorddtaecDto dto : dtoList) {
            TCorddtaec entity = mappingToEntity(dto);
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
    public void suppressTCordhdr() {
        _suppressTCordhdr = true;
    }
    protected void doSuppressAll() { // internal
        suppressTCordhdr();
    }
    protected void doSuppressClear() { // internal
        _suppressTCordhdr = false;
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
    public TCorddtaecDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TCorddtaecDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TCorddtaecDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TCorddtaecDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TCorddtaecDtoMapper reverseReference() {
        setReverseReference(true);
        return (TCorddtaecDtoMapper)this;
    }
}

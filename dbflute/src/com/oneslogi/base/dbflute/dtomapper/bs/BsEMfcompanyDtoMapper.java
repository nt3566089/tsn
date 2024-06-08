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
 * The DTO mapper of E_MFCOMPANY as TABLE. <br>
 * 組織マスタ受信テーブル
 * <pre>
 * [primary-key]
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
public abstract class BsEMfcompanyDtoMapper implements DtoMapper<EMfcompany, EMfcompanyDto>, Serializable {

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
    public BsEMfcompanyDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEMfcompanyDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EMfcompanyDto mappingToDto(EMfcompany entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMfcompanyDto dto = new EMfcompanyDto();
        dto.setMfcompanyId(entity.getMfcompanyId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setZzorgncd(entity.getZzorgncd());
        dto.setZzorgnid(entity.getZzorgnid());
        dto.setOrgnmkjf(entity.getOrgnmkjf());
        dto.setJtonfnf(entity.getJtonfnf());
        dto.setOnfnha(entity.getOnfnha());
        dto.setJtonfnh(entity.getJtonfnh());
        dto.setZzorgnam(entity.getZzorgnam());
        dto.setJtonanf(entity.getJtonanf());
        dto.setOnanha(entity.getOnanha());
        dto.setJtonanh(entity.getJtonanh());
        dto.setAnwhnm(entity.getAnwhnm());
        dto.setIoorid(entity.getIoorid());
        dto.setOrgpsno(entity.getOrgpsno());
        dto.setAdvcd(entity.getAdvcd());
        dto.setCounc(entity.getCounc());
        dto.setOrgadr1(entity.getOrgadr1());
        dto.setOrgtel(entity.getOrgtel());
        dto.setOrtl2(entity.getOrtl2());
        dto.setOrgfax(entity.getOrgfax());
        dto.setZzhorgcd(entity.getZzhorgcd());
        dto.setZzbasecd(entity.getZzbasecd());
        dto.setCsadmag(entity.getCsadmag());
        dto.setTaxocd(entity.getTaxocd());
        dto.setUptaxid(entity.getUptaxid());
        dto.setStatcid(entity.getStatcid());
        dto.setStlndid(entity.getStlndid());
        dto.setZzwhmgid(entity.getZzwhmgid());
        dto.setTscpnm(entity.getTscpnm());
        dto.setDepcd(entity.getDepcd());
        dto.setCnlid(entity.getCnlid());
        dto.setOtrnk(entity.getOtrnk());
        dto.setOrattid1(entity.getOrattid1());
        dto.setOrattid2(entity.getOrattid2());
        dto.setOrattid3(entity.getOrattid3());
        dto.setAttid1(entity.getAttid1());
        dto.setAttid2(entity.getAttid2());
        dto.setAttid3(entity.getAttid3());
        dto.setOrattid4(entity.getOrattid4());
        dto.setBsdid(entity.getBsdid());
        dto.setRpbcd(entity.getRpbcd());
        dto.setFauorgcd(entity.getFauorgcd());
        dto.setAuorgcd(entity.getAuorgcd());
        dto.setCstctcd(entity.getCstctcd());
        dto.setBizarcd(entity.getBizarcd());
        dto.setFwctcd(entity.getFwctcd());
        dto.setRdvdid(entity.getRdvdid());
        dto.setZzablymd(entity.getZzablymd());
        dto.setBptnid(entity.getBptnid());
        dto.setSnkhg(entity.getSnkhg());
        dto.setTxcansfg(entity.getTxcansfg());
        dto.setCsnpt(entity.getCsnpt());
        dto.setTbsocstm(entity.getTbsocstm());
        dto.setOdtscd(entity.getOdtscd());
        dto.setLnarcd(entity.getLnarcd());
        dto.setSasasid(entity.getSasasid());
        dto.setCmlrasid(entity.getCmlrasid());
        dto.setCsoid(entity.getCsoid());
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
    public List<EMfcompanyDto> mappingToDtoList(List<EMfcompany> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EMfcompanyDto> dtoList = new ArrayList<EMfcompanyDto>();
        for (EMfcompany entity : entityList) {
            EMfcompanyDto dto = mappingToDto(entity);
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
    public EMfcompany mappingToEntity(EMfcompanyDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMfcompany entity = new EMfcompany();
        if (needsMapping(dto, dto.getMfcompanyId(), "mfcompanyId")) {
            entity.setMfcompanyId(dto.getMfcompanyId());
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
        if (needsMapping(dto, dto.getZzorgncd(), "zzorgncd")) {
            entity.setZzorgncd(dto.getZzorgncd());
        }
        if (needsMapping(dto, dto.getZzorgnid(), "zzorgnid")) {
            entity.setZzorgnid(dto.getZzorgnid());
        }
        if (needsMapping(dto, dto.getOrgnmkjf(), "orgnmkjf")) {
            entity.setOrgnmkjf(dto.getOrgnmkjf());
        }
        if (needsMapping(dto, dto.getJtonfnf(), "jtonfnf")) {
            entity.setJtonfnf(dto.getJtonfnf());
        }
        if (needsMapping(dto, dto.getOnfnha(), "onfnha")) {
            entity.setOnfnha(dto.getOnfnha());
        }
        if (needsMapping(dto, dto.getJtonfnh(), "jtonfnh")) {
            entity.setJtonfnh(dto.getJtonfnh());
        }
        if (needsMapping(dto, dto.getZzorgnam(), "zzorgnam")) {
            entity.setZzorgnam(dto.getZzorgnam());
        }
        if (needsMapping(dto, dto.getJtonanf(), "jtonanf")) {
            entity.setJtonanf(dto.getJtonanf());
        }
        if (needsMapping(dto, dto.getOnanha(), "onanha")) {
            entity.setOnanha(dto.getOnanha());
        }
        if (needsMapping(dto, dto.getJtonanh(), "jtonanh")) {
            entity.setJtonanh(dto.getJtonanh());
        }
        if (needsMapping(dto, dto.getAnwhnm(), "anwhnm")) {
            entity.setAnwhnm(dto.getAnwhnm());
        }
        if (needsMapping(dto, dto.getIoorid(), "ioorid")) {
            entity.setIoorid(dto.getIoorid());
        }
        if (needsMapping(dto, dto.getOrgpsno(), "orgpsno")) {
            entity.setOrgpsno(dto.getOrgpsno());
        }
        if (needsMapping(dto, dto.getAdvcd(), "advcd")) {
            entity.setAdvcd(dto.getAdvcd());
        }
        if (needsMapping(dto, dto.getCounc(), "counc")) {
            entity.setCounc(dto.getCounc());
        }
        if (needsMapping(dto, dto.getOrgadr1(), "orgadr1")) {
            entity.setOrgadr1(dto.getOrgadr1());
        }
        if (needsMapping(dto, dto.getOrgtel(), "orgtel")) {
            entity.setOrgtel(dto.getOrgtel());
        }
        if (needsMapping(dto, dto.getOrtl2(), "ortl2")) {
            entity.setOrtl2(dto.getOrtl2());
        }
        if (needsMapping(dto, dto.getOrgfax(), "orgfax")) {
            entity.setOrgfax(dto.getOrgfax());
        }
        if (needsMapping(dto, dto.getZzhorgcd(), "zzhorgcd")) {
            entity.setZzhorgcd(dto.getZzhorgcd());
        }
        if (needsMapping(dto, dto.getZzbasecd(), "zzbasecd")) {
            entity.setZzbasecd(dto.getZzbasecd());
        }
        if (needsMapping(dto, dto.getCsadmag(), "csadmag")) {
            entity.setCsadmag(dto.getCsadmag());
        }
        if (needsMapping(dto, dto.getTaxocd(), "taxocd")) {
            entity.setTaxocd(dto.getTaxocd());
        }
        if (needsMapping(dto, dto.getUptaxid(), "uptaxid")) {
            entity.setUptaxid(dto.getUptaxid());
        }
        if (needsMapping(dto, dto.getStatcid(), "statcid")) {
            entity.setStatcid(dto.getStatcid());
        }
        if (needsMapping(dto, dto.getStlndid(), "stlndid")) {
            entity.setStlndid(dto.getStlndid());
        }
        if (needsMapping(dto, dto.getZzwhmgid(), "zzwhmgid")) {
            entity.setZzwhmgid(dto.getZzwhmgid());
        }
        if (needsMapping(dto, dto.getTscpnm(), "tscpnm")) {
            entity.setTscpnm(dto.getTscpnm());
        }
        if (needsMapping(dto, dto.getDepcd(), "depcd")) {
            entity.setDepcd(dto.getDepcd());
        }
        if (needsMapping(dto, dto.getCnlid(), "cnlid")) {
            entity.setCnlid(dto.getCnlid());
        }
        if (needsMapping(dto, dto.getOtrnk(), "otrnk")) {
            entity.setOtrnk(dto.getOtrnk());
        }
        if (needsMapping(dto, dto.getOrattid1(), "orattid1")) {
            entity.setOrattid1(dto.getOrattid1());
        }
        if (needsMapping(dto, dto.getOrattid2(), "orattid2")) {
            entity.setOrattid2(dto.getOrattid2());
        }
        if (needsMapping(dto, dto.getOrattid3(), "orattid3")) {
            entity.setOrattid3(dto.getOrattid3());
        }
        if (needsMapping(dto, dto.getAttid1(), "attid1")) {
            entity.setAttid1(dto.getAttid1());
        }
        if (needsMapping(dto, dto.getAttid2(), "attid2")) {
            entity.setAttid2(dto.getAttid2());
        }
        if (needsMapping(dto, dto.getAttid3(), "attid3")) {
            entity.setAttid3(dto.getAttid3());
        }
        if (needsMapping(dto, dto.getOrattid4(), "orattid4")) {
            entity.setOrattid4(dto.getOrattid4());
        }
        if (needsMapping(dto, dto.getBsdid(), "bsdid")) {
            entity.setBsdid(dto.getBsdid());
        }
        if (needsMapping(dto, dto.getRpbcd(), "rpbcd")) {
            entity.setRpbcd(dto.getRpbcd());
        }
        if (needsMapping(dto, dto.getFauorgcd(), "fauorgcd")) {
            entity.setFauorgcd(dto.getFauorgcd());
        }
        if (needsMapping(dto, dto.getAuorgcd(), "auorgcd")) {
            entity.setAuorgcd(dto.getAuorgcd());
        }
        if (needsMapping(dto, dto.getCstctcd(), "cstctcd")) {
            entity.setCstctcd(dto.getCstctcd());
        }
        if (needsMapping(dto, dto.getBizarcd(), "bizarcd")) {
            entity.setBizarcd(dto.getBizarcd());
        }
        if (needsMapping(dto, dto.getFwctcd(), "fwctcd")) {
            entity.setFwctcd(dto.getFwctcd());
        }
        if (needsMapping(dto, dto.getRdvdid(), "rdvdid")) {
            entity.setRdvdid(dto.getRdvdid());
        }
        if (needsMapping(dto, dto.getZzablymd(), "zzablymd")) {
            entity.setZzablymd(dto.getZzablymd());
        }
        if (needsMapping(dto, dto.getBptnid(), "bptnid")) {
            entity.setBptnid(dto.getBptnid());
        }
        if (needsMapping(dto, dto.getSnkhg(), "snkhg")) {
            entity.setSnkhg(dto.getSnkhg());
        }
        if (needsMapping(dto, dto.getTxcansfg(), "txcansfg")) {
            entity.setTxcansfg(dto.getTxcansfg());
        }
        if (needsMapping(dto, dto.getCsnpt(), "csnpt")) {
            entity.setCsnpt(dto.getCsnpt());
        }
        if (needsMapping(dto, dto.getTbsocstm(), "tbsocstm")) {
            entity.setTbsocstm(dto.getTbsocstm());
        }
        if (needsMapping(dto, dto.getOdtscd(), "odtscd")) {
            entity.setOdtscd(dto.getOdtscd());
        }
        if (needsMapping(dto, dto.getLnarcd(), "lnarcd")) {
            entity.setLnarcd(dto.getLnarcd());
        }
        if (needsMapping(dto, dto.getSasasid(), "sasasid")) {
            entity.setSasasid(dto.getSasasid());
        }
        if (needsMapping(dto, dto.getCmlrasid(), "cmlrasid")) {
            entity.setCmlrasid(dto.getCmlrasid());
        }
        if (needsMapping(dto, dto.getCsoid(), "csoid")) {
            entity.setCsoid(dto.getCsoid());
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
    protected boolean needsMapping(EMfcompanyDto dto, Object value, String propName) {
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
    public List<EMfcompany> mappingToEntityList(List<EMfcompanyDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EMfcompany> entityList = new ArrayList<EMfcompany>();
        for (EMfcompanyDto dto : dtoList) {
            EMfcompany entity = mappingToEntity(dto);
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
    public EMfcompanyDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EMfcompanyDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EMfcompanyDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EMfcompanyDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EMfcompanyDtoMapper reverseReference() {
        setReverseReference(true);
        return (EMfcompanyDtoMapper)this;
    }
}

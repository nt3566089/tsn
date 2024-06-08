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
 * The DTO mapper of M_BOX as TABLE. <br>
 * 荷材マスタ
 * <pre>
 * [primary-key]
 *     BOX_ID
 *
 * [column]
 *     BOX_ID, CENTER_ID, BOX_CD, BOX_NM, LENGTH, WIDTH, HEIGHT, VOLUME, VOLUME_RATE, PERMIT_VOLUME, PERMIT_WEIGHT, BOX_TYPE, BXOSZL, BXOSZW, BXOSZH, BXWEIGHT, bxcpy, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_BOX_GRP, M_BOX_GRP_DTL, M_CARRIER_BOX, M_PARAM, T_PACKING_H, W_HT_SHIPPING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign-property]
 *     mCenter, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBoxGrpList, mBoxGrpDtlList, mCarrierBoxList, mParamList, tPackingHList, wHtShippingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMBoxDtoMapper implements DtoMapper<MBox, MBoxDto>, Serializable {

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
    protected boolean _suppressMCenter;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMBoxGrpList;
    protected boolean _suppressMBoxGrpDtlList;
    protected boolean _suppressMCarrierBoxList;
    protected boolean _suppressMParamList;
    protected boolean _suppressTPackingHList;
    protected boolean _suppressWHtShippingList;
    protected boolean _suppressWSglRowShipInspHList;
    protected boolean _suppressWShippingInterruptList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMBoxDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMBoxDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MBoxDto mappingToDto(MBox entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MBoxDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MBoxDto dto = new MBoxDto();
        dto.setBoxId(entity.getBoxId());
        dto.setCenterId(entity.getCenterId());
        dto.setBoxCd(entity.getBoxCd());
        dto.setBoxNm(entity.getBoxNm());
        dto.setLength(entity.getLength());
        dto.setWidth(entity.getWidth());
        dto.setHeight(entity.getHeight());
        dto.setVolume(entity.getVolume());
        dto.setVolumeRate(entity.getVolumeRate());
        dto.setPermitVolume(entity.getPermitVolume());
        dto.setPermitWeight(entity.getPermitWeight());
        dto.setBoxType(entity.getBoxType());
        dto.setBxoszl(entity.getBxoszl());
        dto.setBxoszw(entity.getBxoszw());
        dto.setBxoszh(entity.getBxoszh());
        dto.setBxweight(entity.getBxweight());
        dto.setBxcpy(entity.getBxcpy());
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
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMBoxList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBoxList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMBoxList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMBoxGrpList && !entity.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MBoxGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxGrpList());
            dto.setMBoxGrpList(relationDtoList);
            if (reverseReference) {
                for (MBoxGrpDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressMBoxGrpDtlList && !entity.getMBoxGrpDtlList().isEmpty()) {
            MBoxGrpDtlDtoMapper mapper = new MBoxGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MBoxGrpDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getMBoxGrpDtlList());
            dto.setMBoxGrpDtlList(relationDtoList);
            if (reverseReference) {
                for (MBoxGrpDtlDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressMCarrierBoxList && !entity.getMCarrierBoxList().isEmpty()) {
            MCarrierBoxDtoMapper mapper = new MCarrierBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MCarrierBoxDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierBoxList());
            dto.setMCarrierBoxList(relationDtoList);
            if (reverseReference) {
                for (MCarrierBoxDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressMParamList && !entity.getMParamList().isEmpty()) {
            MParamDtoMapper mapper = new MParamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MParamDto> relationDtoList = mapper.mappingToDtoList(entity.getMParamList());
            dto.setMParamList(relationDtoList);
            if (reverseReference) {
                for (MParamDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressWHtShippingList && !entity.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WHtShippingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingList());
            dto.setWHtShippingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !entity.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WSglRowShipInspHDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspHList());
            dto.setWSglRowShipInspHList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspHDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !entity.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WShippingInterruptDto> relationDtoList = mapper.mappingToDtoList(entity.getWShippingInterruptList());
            dto.setWShippingInterruptList(relationDtoList);
            if (reverseReference) {
                for (WShippingInterruptDto relationDto : relationDtoList) {
                    relationDto.setMBox(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MBoxDto> mappingToDtoList(List<MBox> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MBoxDto> dtoList = new ArrayList<MBoxDto>();
        for (MBox entity : entityList) {
            MBoxDto dto = mappingToDto(entity);
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
    public MBox mappingToEntity(MBoxDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MBox)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MBox entity = new MBox();
        if (needsMapping(dto, dto.getBoxId(), "boxId")) {
            entity.setBoxId(dto.getBoxId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getBoxCd(), "boxCd")) {
            entity.setBoxCd(dto.getBoxCd());
        }
        if (needsMapping(dto, dto.getBoxNm(), "boxNm")) {
            entity.setBoxNm(dto.getBoxNm());
        }
        if (needsMapping(dto, dto.getLength(), "length")) {
            entity.setLength(dto.getLength());
        }
        if (needsMapping(dto, dto.getWidth(), "width")) {
            entity.setWidth(dto.getWidth());
        }
        if (needsMapping(dto, dto.getHeight(), "height")) {
            entity.setHeight(dto.getHeight());
        }
        if (needsMapping(dto, dto.getVolume(), "volume")) {
            entity.setVolume(dto.getVolume());
        }
        if (needsMapping(dto, dto.getVolumeRate(), "volumeRate")) {
            entity.setVolumeRate(dto.getVolumeRate());
        }
        if (needsMapping(dto, dto.getPermitVolume(), "permitVolume")) {
            entity.setPermitVolume(dto.getPermitVolume());
        }
        if (needsMapping(dto, dto.getPermitWeight(), "permitWeight")) {
            entity.setPermitWeight(dto.getPermitWeight());
        }
        if (needsMapping(dto, dto.getBoxType(), "boxType")) {
            entity.setBoxType(dto.getBoxType());
        }
        if (needsMapping(dto, dto.getBxoszl(), "bxoszl")) {
            entity.setBxoszl(dto.getBxoszl());
        }
        if (needsMapping(dto, dto.getBxoszw(), "bxoszw")) {
            entity.setBxoszw(dto.getBxoszw());
        }
        if (needsMapping(dto, dto.getBxoszh(), "bxoszh")) {
            entity.setBxoszh(dto.getBxoszh());
        }
        if (needsMapping(dto, dto.getBxweight(), "bxweight")) {
            entity.setBxweight(dto.getBxweight());
        }
        if (needsMapping(dto, dto.getBxcpy(), "bxcpy")) {
            entity.setBxcpy(dto.getBxcpy());
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
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMBoxList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMBoxList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMBoxList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMBoxGrpList && !dto.getMBoxGrpList().isEmpty()) {
            MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MBoxGrp> relationEntityList = mapper.mappingToEntityList(dto.getMBoxGrpList());
            entity.setMBoxGrpList(relationEntityList);
            if (reverseReference) {
                for (MBoxGrp relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressMBoxGrpDtlList && !dto.getMBoxGrpDtlList().isEmpty()) {
            MBoxGrpDtlDtoMapper mapper = new MBoxGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MBoxGrpDtl> relationEntityList = mapper.mappingToEntityList(dto.getMBoxGrpDtlList());
            entity.setMBoxGrpDtlList(relationEntityList);
            if (reverseReference) {
                for (MBoxGrpDtl relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressMCarrierBoxList && !dto.getMCarrierBoxList().isEmpty()) {
            MCarrierBoxDtoMapper mapper = new MCarrierBoxDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MCarrierBox> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierBoxList());
            entity.setMCarrierBoxList(relationEntityList);
            if (reverseReference) {
                for (MCarrierBox relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressMParamList && !dto.getMParamList().isEmpty()) {
            MParamDtoMapper mapper = new MParamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<MParam> relationEntityList = mapper.mappingToEntityList(dto.getMParamList());
            entity.setMParamList(relationEntityList);
            if (reverseReference) {
                for (MParam relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressWHtShippingList && !dto.getWHtShippingList().isEmpty()) {
            WHtShippingDtoMapper mapper = new WHtShippingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WHtShipping> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingList());
            entity.setWHtShippingList(relationEntityList);
            if (reverseReference) {
                for (WHtShipping relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspHList && !dto.getWSglRowShipInspHList().isEmpty()) {
            WSglRowShipInspHDtoMapper mapper = new WSglRowShipInspHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WSglRowShipInspH> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspHList());
            entity.setWSglRowShipInspHList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspH relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
                }
            }
        };
        if (!_suppressWShippingInterruptList && !dto.getWShippingInterruptList().isEmpty()) {
            WShippingInterruptDtoMapper mapper = new WShippingInterruptDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMBox();
            List<WShippingInterrupt> relationEntityList = mapper.mappingToEntityList(dto.getWShippingInterruptList());
            entity.setWShippingInterruptList(relationEntityList);
            if (reverseReference) {
                for (WShippingInterrupt relationEntity : relationEntityList) {
                    relationEntity.setMBox(entity);
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
    protected boolean needsMapping(MBoxDto dto, Object value, String propName) {
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
    public List<MBox> mappingToEntityList(List<MBoxDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MBox> entityList = new ArrayList<MBox>();
        for (MBoxDto dto : dtoList) {
            MBox entity = mappingToEntity(dto);
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
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMBoxGrpList() {
        _suppressMBoxGrpList = true;
    }
    public void suppressMBoxGrpDtlList() {
        _suppressMBoxGrpDtlList = true;
    }
    public void suppressMCarrierBoxList() {
        _suppressMCarrierBoxList = true;
    }
    public void suppressMParamList() {
        _suppressMParamList = true;
    }
    public void suppressTPackingHList() {
        _suppressTPackingHList = true;
    }
    public void suppressWHtShippingList() {
        _suppressWHtShippingList = true;
    }
    public void suppressWSglRowShipInspHList() {
        _suppressWSglRowShipInspHList = true;
    }
    public void suppressWShippingInterruptList() {
        _suppressWShippingInterruptList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressBClassDtlByDelFlg();
        suppressMBoxGrpList();
        suppressMBoxGrpDtlList();
        suppressMCarrierBoxList();
        suppressMParamList();
        suppressTPackingHList();
        suppressWHtShippingList();
        suppressWSglRowShipInspHList();
        suppressWShippingInterruptList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMBoxGrpList = false;
        _suppressMBoxGrpDtlList = false;
        _suppressMCarrierBoxList = false;
        _suppressMParamList = false;
        _suppressTPackingHList = false;
        _suppressWHtShippingList = false;
        _suppressWSglRowShipInspHList = false;
        _suppressWShippingInterruptList = false;
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
    public MBoxDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MBoxDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MBoxDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MBoxDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MBoxDtoMapper reverseReference() {
        setReverseReference(true);
        return (MBoxDtoMapper)this;
    }
}

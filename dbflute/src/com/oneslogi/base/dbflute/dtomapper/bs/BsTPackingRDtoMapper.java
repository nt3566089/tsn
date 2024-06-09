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
 * The DTO mapper of T_PACKING_R as TABLE. <br>
 * 梱包帳票
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, STW_OUT_FLG, STW_OUT_USER_ID, STW_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, TAG_DL_URL, INSPECTION_OUT_FLG, INSPECTION_OUT_USER_ID, INSPECTION_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_USER, T_PACKING_H, B_CLASS_DTL(ByStwOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUserByInspectionOutUserId, tPackingH, bUserByStwOutUserId, bUserByTagOutUserId, bClassDtlByStwOutFlg, bClassDtlByTagOutFlg, bClassDtlByInspectionOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPackingRDtoMapper implements DtoMapper<TPackingR, TPackingRDto>, Serializable {

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
    protected boolean _suppressBUserByInspectionOutUserId;
    protected boolean _suppressTPackingH;
    protected boolean _suppressBUserByStwOutUserId;
    protected boolean _suppressBUserByTagOutUserId;
    protected boolean _suppressBClassDtlByStwOutFlg;
    protected boolean _suppressBClassDtlByTagOutFlg;
    protected boolean _suppressBClassDtlByInspectionOutFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackingRDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTPackingRDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TPackingRDto mappingToDto(TPackingR entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TPackingRDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPackingRDto dto = new TPackingRDto();
        dto.setPackingHId(entity.getPackingHId());
        dto.setStwOutFlg(entity.getStwOutFlg());
        dto.setStwOutUserId(entity.getStwOutUserId());
        dto.setStwOutDt(entity.getStwOutDt());
        dto.setTagOutFlg(entity.getTagOutFlg());
        dto.setTagOutUserId(entity.getTagOutUserId());
        dto.setTagOutDt(entity.getTagOutDt());
        dto.setTagDlUrl(entity.getTagDlUrl());
        dto.setInspectionOutFlg(entity.getInspectionOutFlg());
        dto.setInspectionOutUserId(entity.getInspectionOutUserId());
        dto.setInspectionOutDt(entity.getInspectionOutDt());
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
        if (!_suppressBUserByInspectionOutUserId && entity.getBUserByInspectionOutUserId() != null) {
            BUser relationEntity = entity.getBUserByInspectionOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByInspectionOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByInspectionOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByInspectionOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByInspectionOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByInspectionOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByInspectionOutUserId());
                }
            }
        };
        if (!_suppressTPackingH && entity.getTPackingH() != null) {
            TPackingH relationEntity = entity.getTPackingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPackingHDto relationDto = (TPackingHDto)cachedDto;
                dto.setTPackingH(relationDto);
                if (reverseReference) {
                    relationDto.setTPackingRAsOne(dto);
                }
            } else {
                TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRAsOne();
                TPackingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPackingH(relationDto);
                if (reverseReference) {
                    relationDto.setTPackingRAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPackingH());
                }
            }
        };
        if (!_suppressBUserByStwOutUserId && entity.getBUserByStwOutUserId() != null) {
            BUser relationEntity = entity.getBUserByStwOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByStwOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByStwOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByStwOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByStwOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByStwOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByStwOutUserId());
                }
            }
        };
        if (!_suppressBUserByTagOutUserId && entity.getBUserByTagOutUserId() != null) {
            BUser relationEntity = entity.getBUserByTagOutUserId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByTagOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByTagOutUserIdList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByTagOutUserIdList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByTagOutUserId(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingRByTagOutUserIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByTagOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByStwOutFlg && entity.getBClassDtlByStwOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStwOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStwOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStwOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStwOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTagOutFlg && entity.getBClassDtlByTagOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTagOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTagOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTagOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTagOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspectionOutFlg && entity.getBClassDtlByInspectionOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInspectionOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInspectionOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInspectionOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInspectionOutFlg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TPackingRDto> mappingToDtoList(List<TPackingR> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TPackingRDto> dtoList = new ArrayList<TPackingRDto>();
        for (TPackingR entity : entityList) {
            TPackingRDto dto = mappingToDto(entity);
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
    public TPackingR mappingToEntity(TPackingRDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TPackingR)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPackingR entity = new TPackingR();
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
        }
        if (needsMapping(dto, dto.getStwOutFlg(), "stwOutFlg")) {
            entity.setStwOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getStwOutFlg()));
        }
        if (needsMapping(dto, dto.getStwOutUserId(), "stwOutUserId")) {
            entity.setStwOutUserId(dto.getStwOutUserId());
        }
        if (needsMapping(dto, dto.getStwOutDt(), "stwOutDt")) {
            entity.setStwOutDt(dto.getStwOutDt());
        }
        if (needsMapping(dto, dto.getTagOutFlg(), "tagOutFlg")) {
            entity.setTagOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getTagOutFlg()));
        }
        if (needsMapping(dto, dto.getTagOutUserId(), "tagOutUserId")) {
            entity.setTagOutUserId(dto.getTagOutUserId());
        }
        if (needsMapping(dto, dto.getTagOutDt(), "tagOutDt")) {
            entity.setTagOutDt(dto.getTagOutDt());
        }
        if (needsMapping(dto, dto.getTagDlUrl(), "tagDlUrl")) {
            entity.setTagDlUrl(dto.getTagDlUrl());
        }
        if (needsMapping(dto, dto.getInspectionOutFlg(), "inspectionOutFlg")) {
            entity.setInspectionOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getInspectionOutFlg()));
        }
        if (needsMapping(dto, dto.getInspectionOutUserId(), "inspectionOutUserId")) {
            entity.setInspectionOutUserId(dto.getInspectionOutUserId());
        }
        if (needsMapping(dto, dto.getInspectionOutDt(), "inspectionOutDt")) {
            entity.setInspectionOutDt(dto.getInspectionOutDt());
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
        if (!_suppressBUserByInspectionOutUserId && dto.getBUserByInspectionOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByInspectionOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByInspectionOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByInspectionOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByInspectionOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByInspectionOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByInspectionOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByInspectionOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByInspectionOutUserId());
                }
            }
        };
        if (!_suppressTPackingH && dto.getTPackingH() != null) {
            TPackingHDto relationDto = dto.getTPackingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPackingH relationEntity = (TPackingH)cachedEntity;
                entity.setTPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPackingRAsOne(entity);
                }
            } else {
                TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRAsOne();
                TPackingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPackingRAsOne(entity);
                }
                if (instanceCache && entity.getTPackingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPackingH());
                }
            }
        };
        if (!_suppressBUserByStwOutUserId && dto.getBUserByStwOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByStwOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByStwOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByStwOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByStwOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByStwOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByStwOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByStwOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByStwOutUserId());
                }
            }
        };
        if (!_suppressBUserByTagOutUserId && dto.getBUserByTagOutUserId() != null) {
            BUserDto relationDto = dto.getBUserByTagOutUserId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByTagOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByTagOutUserIdList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingRByTagOutUserIdList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByTagOutUserId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingRByTagOutUserIdList().add(entity);
                }
                if (instanceCache && entity.getBUserByTagOutUserId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByTagOutUserId());
                }
            }
        };
        if (!_suppressBClassDtlByStwOutFlg && dto.getBClassDtlByStwOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStwOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStwOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStwOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStwOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStwOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTagOutFlg && dto.getBClassDtlByTagOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTagOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTagOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTagOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTagOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTagOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspectionOutFlg && dto.getBClassDtlByInspectionOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInspectionOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInspectionOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInspectionOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInspectionOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInspectionOutFlg());
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
    protected boolean needsMapping(TPackingRDto dto, Object value, String propName) {
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
    public List<TPackingR> mappingToEntityList(List<TPackingRDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TPackingR> entityList = new ArrayList<TPackingR>();
        for (TPackingRDto dto : dtoList) {
            TPackingR entity = mappingToEntity(dto);
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
    public void suppressBUserByInspectionOutUserId() {
        _suppressBUserByInspectionOutUserId = true;
    }
    public void suppressTPackingH() {
        _suppressTPackingH = true;
    }
    public void suppressBUserByStwOutUserId() {
        _suppressBUserByStwOutUserId = true;
    }
    public void suppressBUserByTagOutUserId() {
        _suppressBUserByTagOutUserId = true;
    }
    public void suppressBClassDtlByStwOutFlg() {
        _suppressBClassDtlByStwOutFlg = true;
    }
    public void suppressBClassDtlByTagOutFlg() {
        _suppressBClassDtlByTagOutFlg = true;
    }
    public void suppressBClassDtlByInspectionOutFlg() {
        _suppressBClassDtlByInspectionOutFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressBUserByInspectionOutUserId();
        suppressTPackingH();
        suppressBUserByStwOutUserId();
        suppressBUserByTagOutUserId();
        suppressBClassDtlByStwOutFlg();
        suppressBClassDtlByTagOutFlg();
        suppressBClassDtlByInspectionOutFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressBUserByInspectionOutUserId = false;
        _suppressTPackingH = false;
        _suppressBUserByStwOutUserId = false;
        _suppressBUserByTagOutUserId = false;
        _suppressBClassDtlByStwOutFlg = false;
        _suppressBClassDtlByTagOutFlg = false;
        _suppressBClassDtlByInspectionOutFlg = false;
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
    public TPackingRDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TPackingRDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TPackingRDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TPackingRDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TPackingRDtoMapper reverseReference() {
        setReverseReference(true);
        return (TPackingRDtoMapper)this;
    }
}

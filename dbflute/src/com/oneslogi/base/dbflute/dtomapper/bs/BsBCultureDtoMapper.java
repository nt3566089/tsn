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
 * The DTO mapper of B_CULTURE as TABLE. <br>
 * カルチャマスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, CULTURE_CD, DICT_ID, LANG_CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_CULTURE, V_DICT, B_CULTURE_ATTRIBUTE(AsOne)
 *
 * [referrer-table]
 *     B_CULTURE, B_DICT_CULTURE, B_INFO, B_MESSAGE, B_USER, M_CENTER, B_CULTURE_ATTRIBUTE
 *
 * [foreign-property]
 *     bDict, bCultureSelf, vDict, bCultureAttributeAsOne
 *
 * [referrer-property]
 *     bCultureSelfList, bDictCultureList, bInfoList, bMessageList, bUserList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBCultureDtoMapper implements DtoMapper<BCulture, BCultureDto>, Serializable {

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
    protected boolean _suppressBDict;
    protected boolean _suppressBCultureSelf;
    protected boolean _suppressVDict;
    protected boolean _suppressBCultureSelfList;
    protected boolean _suppressBCultureAttributeAsOne;
    protected boolean _suppressBDictCultureList;
    protected boolean _suppressBInfoList;
    protected boolean _suppressBMessageList;
    protected boolean _suppressBUserList;
    protected boolean _suppressMCenterList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBCultureDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBCultureDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BCultureDto mappingToDto(BCulture entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BCultureDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BCultureDto dto = new BCultureDto();
        dto.setCultureId(entity.getCultureId());
        dto.setCultureCd(entity.getCultureCd());
        dto.setDictId(entity.getDictId());
        dto.setLangCultureId(entity.getLangCultureId());
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
        if (!_suppressBDict && entity.getBDict() != null) {
            BDict relationEntity = entity.getBDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBCultureList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBCultureList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
                }
            }
        };
        if (!_suppressBCultureSelf && entity.getBCultureSelf() != null) {
            BCulture relationEntity = entity.getBCultureSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureDto relationDto = (BCultureDto)cachedDto;
                dto.setBCultureSelf(relationDto);
                if (reverseReference) {
                    relationDto.getBCultureSelfList().add(dto);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureSelfList();
                BCultureDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCultureSelf(relationDto);
                if (reverseReference) {
                    relationDto.getBCultureSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCultureSelf());
                }
            }
        };
        if (!_suppressVDict && entity.getVDict() != null) {
            VDict relationEntity = entity.getVDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VDictDto relationDto = (VDictDto)cachedDto;
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVDict());
                }
            }
        };
        if (!_suppressBCultureSelfList && !entity.getBCultureSelfList().isEmpty()) {
            BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCultureSelf();
            List<BCultureDto> relationDtoList = mapper.mappingToDtoList(entity.getBCultureSelfList());
            dto.setBCultureSelfList(relationDtoList);
            if (reverseReference) {
                for (BCultureDto relationDto : relationDtoList) {
                    relationDto.setBCultureSelf(dto);
                }
            }
        };
        if (!_suppressBCultureAttributeAsOne && entity.getBCultureAttributeAsOne() != null) {
            BCultureAttribute relationEntity = entity.getBCultureAttributeAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureAttributeDto relationDto = (BCultureAttributeDto)cachedDto;
                dto.setBCultureAttributeAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBCulture(dto);
                }
            } else {
                BCultureAttributeDtoMapper mapper = new BCultureAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCulture();
                BCultureAttributeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCultureAttributeAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBCulture(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCultureAttributeAsOne());
                }
            }
        };
        if (!_suppressBDictCultureList && !entity.getBDictCultureList().isEmpty()) {
            BDictCultureDtoMapper mapper = new BDictCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BDictCultureDto> relationDtoList = mapper.mappingToDtoList(entity.getBDictCultureList());
            dto.setBDictCultureList(relationDtoList);
            if (reverseReference) {
                for (BDictCultureDto relationDto : relationDtoList) {
                    relationDto.setBCulture(dto);
                }
            }
        };
        if (!_suppressBInfoList && !entity.getBInfoList().isEmpty()) {
            BInfoDtoMapper mapper = new BInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BInfoDto> relationDtoList = mapper.mappingToDtoList(entity.getBInfoList());
            dto.setBInfoList(relationDtoList);
            if (reverseReference) {
                for (BInfoDto relationDto : relationDtoList) {
                    relationDto.setBCulture(dto);
                }
            }
        };
        if (!_suppressBMessageList && !entity.getBMessageList().isEmpty()) {
            BMessageDtoMapper mapper = new BMessageDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BMessageDto> relationDtoList = mapper.mappingToDtoList(entity.getBMessageList());
            dto.setBMessageList(relationDtoList);
            if (reverseReference) {
                for (BMessageDto relationDto : relationDtoList) {
                    relationDto.setBCulture(dto);
                }
            }
        };
        if (!_suppressBUserList && !entity.getBUserList().isEmpty()) {
            BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BUserDto> relationDtoList = mapper.mappingToDtoList(entity.getBUserList());
            dto.setBUserList(relationDtoList);
            if (reverseReference) {
                for (BUserDto relationDto : relationDtoList) {
                    relationDto.setBCulture(dto);
                }
            }
        };
        if (!_suppressMCenterList && !entity.getMCenterList().isEmpty()) {
            MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<MCenterDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterList());
            dto.setMCenterList(relationDtoList);
            if (reverseReference) {
                for (MCenterDto relationDto : relationDtoList) {
                    relationDto.setBCulture(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BCultureDto> mappingToDtoList(List<BCulture> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BCultureDto> dtoList = new ArrayList<BCultureDto>();
        for (BCulture entity : entityList) {
            BCultureDto dto = mappingToDto(entity);
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
    public BCulture mappingToEntity(BCultureDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BCulture)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BCulture entity = new BCulture();
        if (needsMapping(dto, dto.getCultureId(), "cultureId")) {
            entity.setCultureId(dto.getCultureId());
        }
        if (needsMapping(dto, dto.getCultureCd(), "cultureCd")) {
            entity.setCultureCd(dto.getCultureCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getLangCultureId(), "langCultureId")) {
            entity.setLangCultureId(dto.getLangCultureId());
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
        if (!_suppressBDict && dto.getBDict() != null) {
            BDictDto relationDto = dto.getBDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBCultureList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBCultureList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
                }
            }
        };
        if (!_suppressBCultureSelf && dto.getBCultureSelf() != null) {
            BCultureDto relationDto = dto.getBCultureSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCulture relationEntity = (BCulture)cachedEntity;
                entity.setBCultureSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getBCultureSelfList().add(entity);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureSelfList();
                BCulture relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCultureSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getBCultureSelfList().add(entity);
                }
                if (instanceCache && entity.getBCultureSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCultureSelf());
                }
            }
        };
        if (!_suppressVDict && dto.getVDict() != null) {
            VDictDto relationDto = dto.getVDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VDict relationEntity = (VDict)cachedEntity;
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVDict());
                }
            }
        };
        if (!_suppressBCultureSelfList && !dto.getBCultureSelfList().isEmpty()) {
            BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCultureSelf();
            List<BCulture> relationEntityList = mapper.mappingToEntityList(dto.getBCultureSelfList());
            entity.setBCultureSelfList(relationEntityList);
            if (reverseReference) {
                for (BCulture relationEntity : relationEntityList) {
                    relationEntity.setBCultureSelf(entity);
                }
            }
        };
        if (!_suppressBCultureAttributeAsOne && dto.getBCultureAttributeAsOne() != null) {
            BCultureAttributeDto relationDto = dto.getBCultureAttributeAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCultureAttribute relationEntity = (BCultureAttribute)cachedEntity;
                entity.setBCultureAttributeAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCulture(entity);
                }
            } else {
                BCultureAttributeDtoMapper mapper = new BCultureAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCulture();
                BCultureAttribute relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCultureAttributeAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCulture(entity);
                }
                if (instanceCache && entity.getBCultureAttributeAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCultureAttributeAsOne());
                }
            }
        };
        if (!_suppressBDictCultureList && !dto.getBDictCultureList().isEmpty()) {
            BDictCultureDtoMapper mapper = new BDictCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BDictCulture> relationEntityList = mapper.mappingToEntityList(dto.getBDictCultureList());
            entity.setBDictCultureList(relationEntityList);
            if (reverseReference) {
                for (BDictCulture relationEntity : relationEntityList) {
                    relationEntity.setBCulture(entity);
                }
            }
        };
        if (!_suppressBInfoList && !dto.getBInfoList().isEmpty()) {
            BInfoDtoMapper mapper = new BInfoDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BInfo> relationEntityList = mapper.mappingToEntityList(dto.getBInfoList());
            entity.setBInfoList(relationEntityList);
            if (reverseReference) {
                for (BInfo relationEntity : relationEntityList) {
                    relationEntity.setBCulture(entity);
                }
            }
        };
        if (!_suppressBMessageList && !dto.getBMessageList().isEmpty()) {
            BMessageDtoMapper mapper = new BMessageDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BMessage> relationEntityList = mapper.mappingToEntityList(dto.getBMessageList());
            entity.setBMessageList(relationEntityList);
            if (reverseReference) {
                for (BMessage relationEntity : relationEntityList) {
                    relationEntity.setBCulture(entity);
                }
            }
        };
        if (!_suppressBUserList && !dto.getBUserList().isEmpty()) {
            BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<BUser> relationEntityList = mapper.mappingToEntityList(dto.getBUserList());
            entity.setBUserList(relationEntityList);
            if (reverseReference) {
                for (BUser relationEntity : relationEntityList) {
                    relationEntity.setBCulture(entity);
                }
            }
        };
        if (!_suppressMCenterList && !dto.getMCenterList().isEmpty()) {
            MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCulture();
            List<MCenter> relationEntityList = mapper.mappingToEntityList(dto.getMCenterList());
            entity.setMCenterList(relationEntityList);
            if (reverseReference) {
                for (MCenter relationEntity : relationEntityList) {
                    relationEntity.setBCulture(entity);
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
    protected boolean needsMapping(BCultureDto dto, Object value, String propName) {
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
    public List<BCulture> mappingToEntityList(List<BCultureDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BCulture> entityList = new ArrayList<BCulture>();
        for (BCultureDto dto : dtoList) {
            BCulture entity = mappingToEntity(dto);
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
    public void suppressBDict() {
        _suppressBDict = true;
    }
    public void suppressBCultureSelf() {
        _suppressBCultureSelf = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressBCultureSelfList() {
        _suppressBCultureSelfList = true;
    }
    public void suppressBCultureAttributeAsOne() {
        _suppressBCultureAttributeAsOne = true;
    }
    public void suppressBDictCultureList() {
        _suppressBDictCultureList = true;
    }
    public void suppressBInfoList() {
        _suppressBInfoList = true;
    }
    public void suppressBMessageList() {
        _suppressBMessageList = true;
    }
    public void suppressBUserList() {
        _suppressBUserList = true;
    }
    public void suppressMCenterList() {
        _suppressMCenterList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressBCultureSelf();
        suppressVDict();
        suppressBCultureSelfList();
        suppressBCultureAttributeAsOne();
        suppressBDictCultureList();
        suppressBInfoList();
        suppressBMessageList();
        suppressBUserList();
        suppressMCenterList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressBCultureSelf = false;
        _suppressVDict = false;
        _suppressBCultureSelfList = false;
        _suppressBCultureAttributeAsOne = false;
        _suppressBDictCultureList = false;
        _suppressBInfoList = false;
        _suppressBMessageList = false;
        _suppressBUserList = false;
        _suppressMCenterList = false;
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
    public BCultureDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BCultureDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BCultureDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BCultureDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BCultureDtoMapper reverseReference() {
        setReverseReference(true);
        return (BCultureDtoMapper)this;
    }
}

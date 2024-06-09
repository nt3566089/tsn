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
 * The DTO mapper of B_ITEM as TABLE. <br>
 * 項目マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, SCREEN_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, DISPLAY_REQUIRED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_SCREEN, V_DICT, V_HT_DICT, B_CLASS_DTL(ByItemType), B_ITEM_VALID(AsOne)
 *
 * [referrer-table]
 *     B_COL, B_COL_EXT_BASE, B_COL_EXT_USER, B_ITEM_ROLE, M_CENTER_ITEM, M_CLIENT_ITEM, B_ITEM_VALID
 *
 * [foreign-property]
 *     bDict, bScreen, vDict, vHtDict, bClassDtlByItemType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bClassDtlByDisplayRequired, bItemValidAsOne
 *
 * [referrer-property]
 *     bColList, bColExtBaseList, bColExtUserList, bItemRoleList, mCenterItemList, mClientItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBItemDtoMapper implements DtoMapper<BItem, BItemDto>, Serializable {

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
    protected boolean _suppressBScreen;
    protected boolean _suppressVDict;
    protected boolean _suppressVHtDict;
    protected boolean _suppressBClassDtlByItemType;
    protected boolean _suppressBClassDtlByVisible;
    protected boolean _suppressBClassDtlByEditable;
    protected boolean _suppressBClassDtlByTextAlign;
    protected boolean _suppressBClassDtlByNecessary;
    protected boolean _suppressBClassDtlByDisplayRequired;
    protected boolean _suppressBColList;
    protected boolean _suppressBColExtBaseList;
    protected boolean _suppressBColExtUserList;
    protected boolean _suppressBItemRoleList;
    protected boolean _suppressBItemValidAsOne;
    protected boolean _suppressMCenterItemList;
    protected boolean _suppressMClientItemList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBItemDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBItemDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BItemDto mappingToDto(BItem entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BItemDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BItemDto dto = new BItemDto();
        dto.setItemId(entity.getItemId());
        dto.setScreenId(entity.getScreenId());
        dto.setItemCd(entity.getItemCd());
        dto.setDictId(entity.getDictId());
        dto.setItemType(entity.getItemType());
        dto.setVisible(entity.getVisible());
        dto.setEditable(entity.getEditable());
        dto.setTextAlign(entity.getTextAlign());
        dto.setNecessary(entity.getNecessary());
        dto.setDisplayRequired(entity.getDisplayRequired());
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
                    relationDto.getBItemList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItemList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBItemList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
                }
            }
        };
        if (!_suppressBScreen && entity.getBScreen() != null) {
            BScreen relationEntity = entity.getBScreen();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BScreenDto relationDto = (BScreenDto)cachedDto;
                dto.setBScreen(relationDto);
                if (reverseReference) {
                    relationDto.getBItemList().add(dto);
                }
            } else {
                BScreenDtoMapper mapper = new BScreenDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItemList();
                BScreenDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBScreen(relationDto);
                if (reverseReference) {
                    relationDto.getBItemList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBScreen());
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
        if (!_suppressVHtDict && entity.getVHtDict() != null) {
            VHtDict relationEntity = entity.getVHtDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VHtDictDto relationDto = (VHtDictDto)cachedDto;
                dto.setVHtDict(relationDto);
                if (reverseReference) {
                }
            } else {
                VHtDictDtoMapper mapper = new VHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VHtDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVHtDict(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVHtDict());
                }
            }
        };
        if (!_suppressBClassDtlByItemType && entity.getBClassDtlByItemType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByItemType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByItemType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByItemType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByItemType());
                }
            }
        };
        if (!_suppressBClassDtlByVisible && entity.getBClassDtlByVisible() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByVisible();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByVisible(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByVisible(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByVisible());
                }
            }
        };
        if (!_suppressBClassDtlByEditable && entity.getBClassDtlByEditable() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByEditable();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByEditable(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByEditable(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByEditable());
                }
            }
        };
        if (!_suppressBClassDtlByTextAlign && entity.getBClassDtlByTextAlign() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTextAlign();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTextAlign(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTextAlign(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTextAlign());
                }
            }
        };
        if (!_suppressBClassDtlByNecessary && entity.getBClassDtlByNecessary() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByNecessary();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByNecessary(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByNecessary(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByNecessary());
                }
            }
        };
        if (!_suppressBClassDtlByDisplayRequired && entity.getBClassDtlByDisplayRequired() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDisplayRequired();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDisplayRequired(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDisplayRequired(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDisplayRequired());
                }
            }
        };
        if (!_suppressBColList && !entity.getBColList().isEmpty()) {
            BColDtoMapper mapper = new BColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BColDto> relationDtoList = mapper.mappingToDtoList(entity.getBColList());
            dto.setBColList(relationDtoList);
            if (reverseReference) {
                for (BColDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        if (!_suppressBColExtBaseList && !entity.getBColExtBaseList().isEmpty()) {
            BColExtBaseDtoMapper mapper = new BColExtBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BColExtBaseDto> relationDtoList = mapper.mappingToDtoList(entity.getBColExtBaseList());
            dto.setBColExtBaseList(relationDtoList);
            if (reverseReference) {
                for (BColExtBaseDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        if (!_suppressBColExtUserList && !entity.getBColExtUserList().isEmpty()) {
            BColExtUserDtoMapper mapper = new BColExtUserDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BColExtUserDto> relationDtoList = mapper.mappingToDtoList(entity.getBColExtUserList());
            dto.setBColExtUserList(relationDtoList);
            if (reverseReference) {
                for (BColExtUserDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        if (!_suppressBItemRoleList && !entity.getBItemRoleList().isEmpty()) {
            BItemRoleDtoMapper mapper = new BItemRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BItemRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBItemRoleList());
            dto.setBItemRoleList(relationDtoList);
            if (reverseReference) {
                for (BItemRoleDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        if (!_suppressBItemValidAsOne && entity.getBItemValidAsOne() != null) {
            BItemValid relationEntity = entity.getBItemValidAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BItemValidDto relationDto = (BItemValidDto)cachedDto;
                dto.setBItemValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBItem(dto);
                }
            } else {
                BItemValidDtoMapper mapper = new BItemValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItem();
                BItemValidDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBItemValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBItem(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBItemValidAsOne());
                }
            }
        };
        if (!_suppressMCenterItemList && !entity.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<MCenterItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterItemList());
            dto.setMCenterItemList(relationDtoList);
            if (reverseReference) {
                for (MCenterItemDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        if (!_suppressMClientItemList && !entity.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<MClientItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientItemList());
            dto.setMClientItemList(relationDtoList);
            if (reverseReference) {
                for (MClientItemDto relationDto : relationDtoList) {
                    relationDto.setBItem(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BItemDto> mappingToDtoList(List<BItem> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BItemDto> dtoList = new ArrayList<BItemDto>();
        for (BItem entity : entityList) {
            BItemDto dto = mappingToDto(entity);
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
    public BItem mappingToEntity(BItemDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BItem)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BItem entity = new BItem();
        if (needsMapping(dto, dto.getItemId(), "itemId")) {
            entity.setItemId(dto.getItemId());
        }
        if (needsMapping(dto, dto.getScreenId(), "screenId")) {
            entity.setScreenId(dto.getScreenId());
        }
        if (needsMapping(dto, dto.getItemCd(), "itemCd")) {
            entity.setItemCd(dto.getItemCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getItemType(), "itemType")) {
            entity.setItemTypeAsItemType(CDef.ItemType.codeOf(dto.getItemType()));
        }
        if (needsMapping(dto, dto.getVisible(), "visible")) {
            entity.setVisibleAsVisible(CDef.Visible.codeOf(dto.getVisible()));
        }
        if (needsMapping(dto, dto.getEditable(), "editable")) {
            entity.setEditableAsEditable(CDef.Editable.codeOf(dto.getEditable()));
        }
        if (needsMapping(dto, dto.getTextAlign(), "textAlign")) {
            entity.setTextAlignAsTextAlign(CDef.TextAlign.codeOf(dto.getTextAlign()));
        }
        if (needsMapping(dto, dto.getNecessary(), "necessary")) {
            entity.setNecessaryAsNecessary(CDef.Necessary.codeOf(dto.getNecessary()));
        }
        if (needsMapping(dto, dto.getDisplayRequired(), "displayRequired")) {
            entity.setDisplayRequiredAsDisplayRequired(CDef.DisplayRequired.codeOf(dto.getDisplayRequired()));
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
                    relationEntity.getBItemList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItemList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBItemList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
                }
            }
        };
        if (!_suppressBScreen && dto.getBScreen() != null) {
            BScreenDto relationDto = dto.getBScreen();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BScreen relationEntity = (BScreen)cachedEntity;
                entity.setBScreen(relationEntity);
                if (reverseReference) {
                    relationEntity.getBItemList().add(entity);
                }
            } else {
                BScreenDtoMapper mapper = new BScreenDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItemList();
                BScreen relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBScreen(relationEntity);
                if (reverseReference) {
                    relationEntity.getBItemList().add(entity);
                }
                if (instanceCache && entity.getBScreen().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBScreen());
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
        if (!_suppressVHtDict && dto.getVHtDict() != null) {
            VHtDictDto relationDto = dto.getVHtDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VHtDict relationEntity = (VHtDict)cachedEntity;
                entity.setVHtDict(relationEntity);
                if (reverseReference) {
                }
            } else {
                VHtDictDtoMapper mapper = new VHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VHtDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVHtDict(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVHtDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVHtDict());
                }
            }
        };
        if (!_suppressBClassDtlByItemType && dto.getBClassDtlByItemType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByItemType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByItemType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByItemType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByItemType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByItemType());
                }
            }
        };
        if (!_suppressBClassDtlByVisible && dto.getBClassDtlByVisible() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByVisible();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByVisible(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByVisible(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByVisible().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByVisible());
                }
            }
        };
        if (!_suppressBClassDtlByEditable && dto.getBClassDtlByEditable() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByEditable();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByEditable(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByEditable(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByEditable().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByEditable());
                }
            }
        };
        if (!_suppressBClassDtlByTextAlign && dto.getBClassDtlByTextAlign() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTextAlign();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTextAlign(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTextAlign(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTextAlign().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTextAlign());
                }
            }
        };
        if (!_suppressBClassDtlByNecessary && dto.getBClassDtlByNecessary() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByNecessary();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByNecessary(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByNecessary(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByNecessary().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByNecessary());
                }
            }
        };
        if (!_suppressBClassDtlByDisplayRequired && dto.getBClassDtlByDisplayRequired() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDisplayRequired();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDisplayRequired(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDisplayRequired(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDisplayRequired().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDisplayRequired());
                }
            }
        };
        if (!_suppressBColList && !dto.getBColList().isEmpty()) {
            BColDtoMapper mapper = new BColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BCol> relationEntityList = mapper.mappingToEntityList(dto.getBColList());
            entity.setBColList(relationEntityList);
            if (reverseReference) {
                for (BCol relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
                }
            }
        };
        if (!_suppressBColExtBaseList && !dto.getBColExtBaseList().isEmpty()) {
            BColExtBaseDtoMapper mapper = new BColExtBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BColExtBase> relationEntityList = mapper.mappingToEntityList(dto.getBColExtBaseList());
            entity.setBColExtBaseList(relationEntityList);
            if (reverseReference) {
                for (BColExtBase relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
                }
            }
        };
        if (!_suppressBColExtUserList && !dto.getBColExtUserList().isEmpty()) {
            BColExtUserDtoMapper mapper = new BColExtUserDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BColExtUser> relationEntityList = mapper.mappingToEntityList(dto.getBColExtUserList());
            entity.setBColExtUserList(relationEntityList);
            if (reverseReference) {
                for (BColExtUser relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
                }
            }
        };
        if (!_suppressBItemRoleList && !dto.getBItemRoleList().isEmpty()) {
            BItemRoleDtoMapper mapper = new BItemRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<BItemRole> relationEntityList = mapper.mappingToEntityList(dto.getBItemRoleList());
            entity.setBItemRoleList(relationEntityList);
            if (reverseReference) {
                for (BItemRole relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
                }
            }
        };
        if (!_suppressBItemValidAsOne && dto.getBItemValidAsOne() != null) {
            BItemValidDto relationDto = dto.getBItemValidAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BItemValid relationEntity = (BItemValid)cachedEntity;
                entity.setBItemValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBItem(entity);
                }
            } else {
                BItemValidDtoMapper mapper = new BItemValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBItem();
                BItemValid relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBItemValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBItem(entity);
                }
                if (instanceCache && entity.getBItemValidAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBItemValidAsOne());
                }
            }
        };
        if (!_suppressMCenterItemList && !dto.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<MCenterItem> relationEntityList = mapper.mappingToEntityList(dto.getMCenterItemList());
            entity.setMCenterItemList(relationEntityList);
            if (reverseReference) {
                for (MCenterItem relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
                }
            }
        };
        if (!_suppressMClientItemList && !dto.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBItem();
            List<MClientItem> relationEntityList = mapper.mappingToEntityList(dto.getMClientItemList());
            entity.setMClientItemList(relationEntityList);
            if (reverseReference) {
                for (MClientItem relationEntity : relationEntityList) {
                    relationEntity.setBItem(entity);
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
    protected boolean needsMapping(BItemDto dto, Object value, String propName) {
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
    public List<BItem> mappingToEntityList(List<BItemDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BItem> entityList = new ArrayList<BItem>();
        for (BItemDto dto : dtoList) {
            BItem entity = mappingToEntity(dto);
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
    public void suppressBScreen() {
        _suppressBScreen = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressVHtDict() {
        _suppressVHtDict = true;
    }
    public void suppressBClassDtlByItemType() {
        _suppressBClassDtlByItemType = true;
    }
    public void suppressBClassDtlByVisible() {
        _suppressBClassDtlByVisible = true;
    }
    public void suppressBClassDtlByEditable() {
        _suppressBClassDtlByEditable = true;
    }
    public void suppressBClassDtlByTextAlign() {
        _suppressBClassDtlByTextAlign = true;
    }
    public void suppressBClassDtlByNecessary() {
        _suppressBClassDtlByNecessary = true;
    }
    public void suppressBClassDtlByDisplayRequired() {
        _suppressBClassDtlByDisplayRequired = true;
    }
    public void suppressBColList() {
        _suppressBColList = true;
    }
    public void suppressBColExtBaseList() {
        _suppressBColExtBaseList = true;
    }
    public void suppressBColExtUserList() {
        _suppressBColExtUserList = true;
    }
    public void suppressBItemRoleList() {
        _suppressBItemRoleList = true;
    }
    public void suppressBItemValidAsOne() {
        _suppressBItemValidAsOne = true;
    }
    public void suppressMCenterItemList() {
        _suppressMCenterItemList = true;
    }
    public void suppressMClientItemList() {
        _suppressMClientItemList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressBScreen();
        suppressVDict();
        suppressVHtDict();
        suppressBClassDtlByItemType();
        suppressBClassDtlByVisible();
        suppressBClassDtlByEditable();
        suppressBClassDtlByTextAlign();
        suppressBClassDtlByNecessary();
        suppressBClassDtlByDisplayRequired();
        suppressBColList();
        suppressBColExtBaseList();
        suppressBColExtUserList();
        suppressBItemRoleList();
        suppressBItemValidAsOne();
        suppressMCenterItemList();
        suppressMClientItemList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressBScreen = false;
        _suppressVDict = false;
        _suppressVHtDict = false;
        _suppressBClassDtlByItemType = false;
        _suppressBClassDtlByVisible = false;
        _suppressBClassDtlByEditable = false;
        _suppressBClassDtlByTextAlign = false;
        _suppressBClassDtlByNecessary = false;
        _suppressBClassDtlByDisplayRequired = false;
        _suppressBColList = false;
        _suppressBColExtBaseList = false;
        _suppressBColExtUserList = false;
        _suppressBItemRoleList = false;
        _suppressBItemValidAsOne = false;
        _suppressMCenterItemList = false;
        _suppressMClientItemList = false;
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
    public BItemDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BItemDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BItemDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BItemDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BItemDtoMapper reverseReference() {
        setReverseReference(true);
        return (BItemDtoMapper)this;
    }
}

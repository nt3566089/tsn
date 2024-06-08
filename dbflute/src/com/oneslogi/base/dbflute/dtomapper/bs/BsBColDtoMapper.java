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
 * The DTO mapper of B_COL as TABLE. <br>
 * 列マスタ
 * <pre>
 * [primary-key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, ITEM_ID, COL_CD, DICT_ID, COL_ORDER, COL_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, COL_WIDTH, IN_COL_INDEX, IN_COL_DEFAULT_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_ITEM, V_DICT, V_HT_DICT, B_CLASS_DTL(ByColType), B_COL_VALID(AsOne)
 *
 * [referrer-table]
 *     B_COL_ROLE, M_CENTER_COL, M_CLIENT_COL, B_COL_VALID
 *
 * [foreign-property]
 *     bDict, bItem, vDict, vHtDict, bClassDtlByColType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bColValidAsOne
 *
 * [referrer-property]
 *     bColRoleList, mCenterColList, mClientColList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBColDtoMapper implements DtoMapper<BCol, BColDto>, Serializable {

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
    protected boolean _suppressBItem;
    protected boolean _suppressVDict;
    protected boolean _suppressVHtDict;
    protected boolean _suppressBClassDtlByColType;
    protected boolean _suppressBClassDtlByVisible;
    protected boolean _suppressBClassDtlByEditable;
    protected boolean _suppressBClassDtlByTextAlign;
    protected boolean _suppressBClassDtlByNecessary;
    protected boolean _suppressBColRoleList;
    protected boolean _suppressBColValidAsOne;
    protected boolean _suppressMCenterColList;
    protected boolean _suppressMClientColList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBColDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBColDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BColDto mappingToDto(BCol entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BColDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BColDto dto = new BColDto();
        dto.setColId(entity.getColId());
        dto.setItemId(entity.getItemId());
        dto.setColCd(entity.getColCd());
        dto.setDictId(entity.getDictId());
        dto.setColOrder(entity.getColOrder());
        dto.setColType(entity.getColType());
        dto.setVisible(entity.getVisible());
        dto.setEditable(entity.getEditable());
        dto.setTextAlign(entity.getTextAlign());
        dto.setNecessary(entity.getNecessary());
        dto.setColWidth(entity.getColWidth());
        dto.setInColIndex(entity.getInColIndex());
        dto.setInColDefaultValue(entity.getInColDefaultValue());
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
                    relationDto.getBColList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBColList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBColList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
                }
            }
        };
        if (!_suppressBItem && entity.getBItem() != null) {
            BItem relationEntity = entity.getBItem();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BItemDto relationDto = (BItemDto)cachedDto;
                dto.setBItem(relationDto);
                if (reverseReference) {
                    relationDto.getBColList().add(dto);
                }
            } else {
                BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBColList();
                BItemDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBItem(relationDto);
                if (reverseReference) {
                    relationDto.getBColList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBItem());
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
        if (!_suppressBClassDtlByColType && entity.getBClassDtlByColType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByColType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByColType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByColType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByColType());
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
        if (!_suppressBColRoleList && !entity.getBColRoleList().isEmpty()) {
            BColRoleDtoMapper mapper = new BColRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<BColRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBColRoleList());
            dto.setBColRoleList(relationDtoList);
            if (reverseReference) {
                for (BColRoleDto relationDto : relationDtoList) {
                    relationDto.setBCol(dto);
                }
            }
        };
        if (!_suppressBColValidAsOne && entity.getBColValidAsOne() != null) {
            BColValid relationEntity = entity.getBColValidAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BColValidDto relationDto = (BColValidDto)cachedDto;
                dto.setBColValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBCol(dto);
                }
            } else {
                BColValidDtoMapper mapper = new BColValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCol();
                BColValidDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBColValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBCol(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBColValidAsOne());
                }
            }
        };
        if (!_suppressMCenterColList && !entity.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<MCenterColDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterColList());
            dto.setMCenterColList(relationDtoList);
            if (reverseReference) {
                for (MCenterColDto relationDto : relationDtoList) {
                    relationDto.setBCol(dto);
                }
            }
        };
        if (!_suppressMClientColList && !entity.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<MClientColDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientColList());
            dto.setMClientColList(relationDtoList);
            if (reverseReference) {
                for (MClientColDto relationDto : relationDtoList) {
                    relationDto.setBCol(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BColDto> mappingToDtoList(List<BCol> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BColDto> dtoList = new ArrayList<BColDto>();
        for (BCol entity : entityList) {
            BColDto dto = mappingToDto(entity);
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
    public BCol mappingToEntity(BColDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BCol)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BCol entity = new BCol();
        if (needsMapping(dto, dto.getColId(), "colId")) {
            entity.setColId(dto.getColId());
        }
        if (needsMapping(dto, dto.getItemId(), "itemId")) {
            entity.setItemId(dto.getItemId());
        }
        if (needsMapping(dto, dto.getColCd(), "colCd")) {
            entity.setColCd(dto.getColCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getColOrder(), "colOrder")) {
            entity.setColOrder(dto.getColOrder());
        }
        if (needsMapping(dto, dto.getColType(), "colType")) {
            entity.setColTypeAsColType(CDef.ColType.codeOf(dto.getColType()));
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
        if (needsMapping(dto, dto.getColWidth(), "colWidth")) {
            entity.setColWidth(dto.getColWidth());
        }
        if (needsMapping(dto, dto.getInColIndex(), "inColIndex")) {
            entity.setInColIndex(dto.getInColIndex());
        }
        if (needsMapping(dto, dto.getInColDefaultValue(), "inColDefaultValue")) {
            entity.setInColDefaultValue(dto.getInColDefaultValue());
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
                    relationEntity.getBColList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBColList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBColList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
                }
            }
        };
        if (!_suppressBItem && dto.getBItem() != null) {
            BItemDto relationDto = dto.getBItem();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BItem relationEntity = (BItem)cachedEntity;
                entity.setBItem(relationEntity);
                if (reverseReference) {
                    relationEntity.getBColList().add(entity);
                }
            } else {
                BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBColList();
                BItem relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBItem(relationEntity);
                if (reverseReference) {
                    relationEntity.getBColList().add(entity);
                }
                if (instanceCache && entity.getBItem().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBItem());
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
        if (!_suppressBClassDtlByColType && dto.getBClassDtlByColType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByColType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByColType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByColType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByColType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByColType());
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
        if (!_suppressBColRoleList && !dto.getBColRoleList().isEmpty()) {
            BColRoleDtoMapper mapper = new BColRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<BColRole> relationEntityList = mapper.mappingToEntityList(dto.getBColRoleList());
            entity.setBColRoleList(relationEntityList);
            if (reverseReference) {
                for (BColRole relationEntity : relationEntityList) {
                    relationEntity.setBCol(entity);
                }
            }
        };
        if (!_suppressBColValidAsOne && dto.getBColValidAsOne() != null) {
            BColValidDto relationDto = dto.getBColValidAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BColValid relationEntity = (BColValid)cachedEntity;
                entity.setBColValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCol(entity);
                }
            } else {
                BColValidDtoMapper mapper = new BColValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCol();
                BColValid relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBColValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCol(entity);
                }
                if (instanceCache && entity.getBColValidAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBColValidAsOne());
                }
            }
        };
        if (!_suppressMCenterColList && !dto.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<MCenterCol> relationEntityList = mapper.mappingToEntityList(dto.getMCenterColList());
            entity.setMCenterColList(relationEntityList);
            if (reverseReference) {
                for (MCenterCol relationEntity : relationEntityList) {
                    relationEntity.setBCol(entity);
                }
            }
        };
        if (!_suppressMClientColList && !dto.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBCol();
            List<MClientCol> relationEntityList = mapper.mappingToEntityList(dto.getMClientColList());
            entity.setMClientColList(relationEntityList);
            if (reverseReference) {
                for (MClientCol relationEntity : relationEntityList) {
                    relationEntity.setBCol(entity);
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
    protected boolean needsMapping(BColDto dto, Object value, String propName) {
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
    public List<BCol> mappingToEntityList(List<BColDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BCol> entityList = new ArrayList<BCol>();
        for (BColDto dto : dtoList) {
            BCol entity = mappingToEntity(dto);
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
    public void suppressBItem() {
        _suppressBItem = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressVHtDict() {
        _suppressVHtDict = true;
    }
    public void suppressBClassDtlByColType() {
        _suppressBClassDtlByColType = true;
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
    public void suppressBColRoleList() {
        _suppressBColRoleList = true;
    }
    public void suppressBColValidAsOne() {
        _suppressBColValidAsOne = true;
    }
    public void suppressMCenterColList() {
        _suppressMCenterColList = true;
    }
    public void suppressMClientColList() {
        _suppressMClientColList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressBItem();
        suppressVDict();
        suppressVHtDict();
        suppressBClassDtlByColType();
        suppressBClassDtlByVisible();
        suppressBClassDtlByEditable();
        suppressBClassDtlByTextAlign();
        suppressBClassDtlByNecessary();
        suppressBColRoleList();
        suppressBColValidAsOne();
        suppressMCenterColList();
        suppressMClientColList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressBItem = false;
        _suppressVDict = false;
        _suppressVHtDict = false;
        _suppressBClassDtlByColType = false;
        _suppressBClassDtlByVisible = false;
        _suppressBClassDtlByEditable = false;
        _suppressBClassDtlByTextAlign = false;
        _suppressBClassDtlByNecessary = false;
        _suppressBColRoleList = false;
        _suppressBColValidAsOne = false;
        _suppressMCenterColList = false;
        _suppressMClientColList = false;
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
    public BColDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BColDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BColDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BColDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BColDtoMapper reverseReference() {
        setReverseReference(true);
        return (BColDtoMapper)this;
    }
}

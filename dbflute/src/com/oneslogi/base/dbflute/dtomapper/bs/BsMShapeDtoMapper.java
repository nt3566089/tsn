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
 * The DTO mapper of M_SHAPE as TABLE. <br>
 * 荷姿マスタ
 * <pre>
 * [primary-key]
 *     SHAPE_ID
 *
 * [column]
 *     SHAPE_ID, SHAPE_CD, SHAPE_DICT_ID, SHAPE_UNIT_DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     H_INVENTORY_B, H_STOCK, M_SHAPE_GRP_DTL, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK
 *
 * [foreign-property]
 *     bDictByShapeDictId, bDictByShapeUnitDictId, vDictByShapeDictId, vDictByShapeUnitDictId, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     hInventoryBList, hStockList, mShapeGrpDtlList, tAllocInstBList, tInventoryBList, tMoveInstBList, tPickingBList, tShippingInstBList, tStockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShapeDtoMapper implements DtoMapper<MShape, MShapeDto>, Serializable {

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
    protected boolean _suppressBDictByShapeDictId;
    protected boolean _suppressBDictByShapeUnitDictId;
    protected boolean _suppressVDictByShapeDictId;
    protected boolean _suppressVDictByShapeUnitDictId;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressHInventoryBList;
    protected boolean _suppressHStockList;
    protected boolean _suppressMShapeGrpDtlList;
    protected boolean _suppressTAllocInstBList;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTMoveInstBList;
    protected boolean _suppressTPickingBList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTStockList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShapeDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMShapeDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MShapeDto mappingToDto(MShape entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MShapeDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MShapeDto dto = new MShapeDto();
        dto.setShapeId(entity.getShapeId());
        dto.setShapeCd(entity.getShapeCd());
        dto.setShapeDictId(entity.getShapeDictId());
        dto.setShapeUnitDictId(entity.getShapeUnitDictId());
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
        if (!_suppressBDictByShapeDictId && entity.getBDictByShapeDictId() != null) {
            BDict relationEntity = entity.getBDictByShapeDictId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDictByShapeDictId(relationDto);
                if (reverseReference) {
                    relationDto.getMShapeByShapeDictIdList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMShapeByShapeDictIdList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDictByShapeDictId(relationDto);
                if (reverseReference) {
                    relationDto.getMShapeByShapeDictIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDictByShapeDictId());
                }
            }
        };
        if (!_suppressBDictByShapeUnitDictId && entity.getBDictByShapeUnitDictId() != null) {
            BDict relationEntity = entity.getBDictByShapeUnitDictId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDictByShapeUnitDictId(relationDto);
                if (reverseReference) {
                    relationDto.getMShapeByShapeUnitDictIdList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMShapeByShapeUnitDictIdList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDictByShapeUnitDictId(relationDto);
                if (reverseReference) {
                    relationDto.getMShapeByShapeUnitDictIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDictByShapeUnitDictId());
                }
            }
        };
        if (!_suppressVDictByShapeDictId && entity.getVDictByShapeDictId() != null) {
            VDict relationEntity = entity.getVDictByShapeDictId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VDictDto relationDto = (VDictDto)cachedDto;
                dto.setVDictByShapeDictId(relationDto);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVDictByShapeDictId(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVDictByShapeDictId());
                }
            }
        };
        if (!_suppressVDictByShapeUnitDictId && entity.getVDictByShapeUnitDictId() != null) {
            VDict relationEntity = entity.getVDictByShapeUnitDictId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VDictDto relationDto = (VDictDto)cachedDto;
                dto.setVDictByShapeUnitDictId(relationDto);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVDictByShapeUnitDictId(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVDictByShapeUnitDictId());
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
        if (!_suppressHInventoryBList && !entity.getHInventoryBList().isEmpty()) {
            HInventoryBDtoMapper mapper = new HInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<HInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getHInventoryBList());
            dto.setHInventoryBList(relationDtoList);
            if (reverseReference) {
                for (HInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressHStockList && !entity.getHStockList().isEmpty()) {
            HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<HStockDto> relationDtoList = mapper.mappingToDtoList(entity.getHStockList());
            dto.setHStockList(relationDtoList);
            if (reverseReference) {
                for (HStockDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressMShapeGrpDtlList && !entity.getMShapeGrpDtlList().isEmpty()) {
            MShapeGrpDtlDtoMapper mapper = new MShapeGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<MShapeGrpDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getMShapeGrpDtlList());
            dto.setMShapeGrpDtlList(relationDtoList);
            if (reverseReference) {
                for (MShapeGrpDtlDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTAllocInstBList && !entity.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TAllocInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstBList());
            dto.setTAllocInstBList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTMoveInstBList && !entity.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBList());
            dto.setTMoveInstBList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTPickingBList && !entity.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TPickingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingBList());
            dto.setTPickingBList(relationDtoList);
            if (reverseReference) {
                for (TPickingBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMShape(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MShapeDto> mappingToDtoList(List<MShape> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MShapeDto> dtoList = new ArrayList<MShapeDto>();
        for (MShape entity : entityList) {
            MShapeDto dto = mappingToDto(entity);
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
    public MShape mappingToEntity(MShapeDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MShape)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MShape entity = new MShape();
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
        }
        if (needsMapping(dto, dto.getShapeCd(), "shapeCd")) {
            entity.setShapeCd(dto.getShapeCd());
        }
        if (needsMapping(dto, dto.getShapeDictId(), "shapeDictId")) {
            entity.setShapeDictId(dto.getShapeDictId());
        }
        if (needsMapping(dto, dto.getShapeUnitDictId(), "shapeUnitDictId")) {
            entity.setShapeUnitDictId(dto.getShapeUnitDictId());
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
        if (!_suppressBDictByShapeDictId && dto.getBDictByShapeDictId() != null) {
            BDictDto relationDto = dto.getBDictByShapeDictId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDictByShapeDictId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMShapeByShapeDictIdList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMShapeByShapeDictIdList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDictByShapeDictId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMShapeByShapeDictIdList().add(entity);
                }
                if (instanceCache && entity.getBDictByShapeDictId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDictByShapeDictId());
                }
            }
        };
        if (!_suppressBDictByShapeUnitDictId && dto.getBDictByShapeUnitDictId() != null) {
            BDictDto relationDto = dto.getBDictByShapeUnitDictId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDictByShapeUnitDictId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMShapeByShapeUnitDictIdList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMShapeByShapeUnitDictIdList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDictByShapeUnitDictId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMShapeByShapeUnitDictIdList().add(entity);
                }
                if (instanceCache && entity.getBDictByShapeUnitDictId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDictByShapeUnitDictId());
                }
            }
        };
        if (!_suppressVDictByShapeDictId && dto.getVDictByShapeDictId() != null) {
            VDictDto relationDto = dto.getVDictByShapeDictId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VDict relationEntity = (VDict)cachedEntity;
                entity.setVDictByShapeDictId(relationEntity);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVDictByShapeDictId(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVDictByShapeDictId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVDictByShapeDictId());
                }
            }
        };
        if (!_suppressVDictByShapeUnitDictId && dto.getVDictByShapeUnitDictId() != null) {
            VDictDto relationDto = dto.getVDictByShapeUnitDictId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VDict relationEntity = (VDict)cachedEntity;
                entity.setVDictByShapeUnitDictId(relationEntity);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVDictByShapeUnitDictId(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVDictByShapeUnitDictId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVDictByShapeUnitDictId());
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
        if (!_suppressHInventoryBList && !dto.getHInventoryBList().isEmpty()) {
            HInventoryBDtoMapper mapper = new HInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<HInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getHInventoryBList());
            entity.setHInventoryBList(relationEntityList);
            if (reverseReference) {
                for (HInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressHStockList && !dto.getHStockList().isEmpty()) {
            HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<HStock> relationEntityList = mapper.mappingToEntityList(dto.getHStockList());
            entity.setHStockList(relationEntityList);
            if (reverseReference) {
                for (HStock relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressMShapeGrpDtlList && !dto.getMShapeGrpDtlList().isEmpty()) {
            MShapeGrpDtlDtoMapper mapper = new MShapeGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<MShapeGrpDtl> relationEntityList = mapper.mappingToEntityList(dto.getMShapeGrpDtlList());
            entity.setMShapeGrpDtlList(relationEntityList);
            if (reverseReference) {
                for (MShapeGrpDtl relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTAllocInstBList && !dto.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TAllocInstB> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstBList());
            entity.setTAllocInstBList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTMoveInstBList && !dto.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBList());
            entity.setTMoveInstBList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTPickingBList && !dto.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TPickingB> relationEntityList = mapper.mappingToEntityList(dto.getTPickingBList());
            entity.setTPickingBList(relationEntityList);
            if (reverseReference) {
                for (TPickingB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMShape();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMShape(entity);
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
    protected boolean needsMapping(MShapeDto dto, Object value, String propName) {
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
    public List<MShape> mappingToEntityList(List<MShapeDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MShape> entityList = new ArrayList<MShape>();
        for (MShapeDto dto : dtoList) {
            MShape entity = mappingToEntity(dto);
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
    public void suppressBDictByShapeDictId() {
        _suppressBDictByShapeDictId = true;
    }
    public void suppressBDictByShapeUnitDictId() {
        _suppressBDictByShapeUnitDictId = true;
    }
    public void suppressVDictByShapeDictId() {
        _suppressVDictByShapeDictId = true;
    }
    public void suppressVDictByShapeUnitDictId() {
        _suppressVDictByShapeUnitDictId = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressHInventoryBList() {
        _suppressHInventoryBList = true;
    }
    public void suppressHStockList() {
        _suppressHStockList = true;
    }
    public void suppressMShapeGrpDtlList() {
        _suppressMShapeGrpDtlList = true;
    }
    public void suppressTAllocInstBList() {
        _suppressTAllocInstBList = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTMoveInstBList() {
        _suppressTMoveInstBList = true;
    }
    public void suppressTPickingBList() {
        _suppressTPickingBList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDictByShapeDictId();
        suppressBDictByShapeUnitDictId();
        suppressVDictByShapeDictId();
        suppressVDictByShapeUnitDictId();
        suppressBClassDtlByDelFlg();
        suppressHInventoryBList();
        suppressHStockList();
        suppressMShapeGrpDtlList();
        suppressTAllocInstBList();
        suppressTInventoryBList();
        suppressTMoveInstBList();
        suppressTPickingBList();
        suppressTShippingInstBList();
        suppressTStockList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDictByShapeDictId = false;
        _suppressBDictByShapeUnitDictId = false;
        _suppressVDictByShapeDictId = false;
        _suppressVDictByShapeUnitDictId = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressHInventoryBList = false;
        _suppressHStockList = false;
        _suppressMShapeGrpDtlList = false;
        _suppressTAllocInstBList = false;
        _suppressTInventoryBList = false;
        _suppressTMoveInstBList = false;
        _suppressTPickingBList = false;
        _suppressTShippingInstBList = false;
        _suppressTStockList = false;
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
    public MShapeDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MShapeDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MShapeDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MShapeDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MShapeDtoMapper reverseReference() {
        setReverseReference(true);
        return (MShapeDtoMapper)this;
    }
}

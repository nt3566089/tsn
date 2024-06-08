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
 * The DTO mapper of B_DICT as TABLE. <br>
 * 辞書マスタ
 * <pre>
 * [primary-key]
 *     DICT_ID
 *
 * [column]
 *     DICT_ID, DICT_NM, DATA_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByDataType), B_DICT_VALID(AsOne), M_HT_DICT(AsOne)
 *
 * [referrer-table]
 *     B_ARG, B_CLASS_DTL, B_COL, B_CULTURE, B_DICT_CULTURE, B_ITEM, B_MENU, B_MENU_GRP, B_ROLE, B_ROLE_GRP, B_SCREEN, M_CENTER_CLASS_DTL, M_CENTER_COL, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_PROCESS_TYPE, M_SHAPE, M_STOCK_TYPE, P_REPORT_LAYOUT_ITEM, P_SUBREP_LAYOUT_ITEM, B_DICT_VALID, M_HT_DICT
 *
 * [foreign-property]
 *     bClassDtlByDataType, bDictValidAsOne, mHtDictAsOne
 *
 * [referrer-property]
 *     bArgList, bClassDtlList, bColList, bCultureList, bDictCultureList, bItemList, bMenuList, bMenuGrpList, bRoleList, bRoleGrpList, bScreenList, mCenterClassDtlList, mCenterColList, mCenterItemList, mCenterScreenList, mClientColList, mClientItemList, mClientScreenList, mProcessTypeList, mShapeByShapeDictIdList, mShapeByShapeUnitDictIdList, mStockTypeList, pReportLayoutItemList, pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBDictDtoMapper implements DtoMapper<BDict, BDictDto>, Serializable {

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
    protected boolean _suppressBClassDtlByDataType;
    protected boolean _suppressBArgList;
    protected boolean _suppressBClassDtlList;
    protected boolean _suppressBColList;
    protected boolean _suppressBCultureList;
    protected boolean _suppressBDictCultureList;
    protected boolean _suppressBDictValidAsOne;
    protected boolean _suppressBItemList;
    protected boolean _suppressBMenuList;
    protected boolean _suppressBMenuGrpList;
    protected boolean _suppressBRoleList;
    protected boolean _suppressBRoleGrpList;
    protected boolean _suppressBScreenList;
    protected boolean _suppressMCenterClassDtlList;
    protected boolean _suppressMCenterColList;
    protected boolean _suppressMCenterItemList;
    protected boolean _suppressMCenterScreenList;
    protected boolean _suppressMClientColList;
    protected boolean _suppressMClientItemList;
    protected boolean _suppressMClientScreenList;
    protected boolean _suppressMHtDictAsOne;
    protected boolean _suppressMProcessTypeList;
    protected boolean _suppressMShapeByShapeDictIdList;
    protected boolean _suppressMShapeByShapeUnitDictIdList;
    protected boolean _suppressMStockTypeList;
    protected boolean _suppressPReportLayoutItemList;
    protected boolean _suppressPSubrepLayoutItemList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBDictDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBDictDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BDictDto mappingToDto(BDict entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BDictDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BDictDto dto = new BDictDto();
        dto.setDictId(entity.getDictId());
        dto.setDictNm(entity.getDictNm());
        dto.setDataType(entity.getDataType());
        dto.setSystemType(entity.getSystemType());
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
        if (!_suppressBClassDtlByDataType && entity.getBClassDtlByDataType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDataType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDataType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDataType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDataType());
                }
            }
        };
        if (!_suppressBArgList && !entity.getBArgList().isEmpty()) {
            BArgDtoMapper mapper = new BArgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BArgDto> relationDtoList = mapper.mappingToDtoList(entity.getBArgList());
            dto.setBArgList(relationDtoList);
            if (reverseReference) {
                for (BArgDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBClassDtlList && !entity.getBClassDtlList().isEmpty()) {
            BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BClassDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getBClassDtlList());
            dto.setBClassDtlList(relationDtoList);
            if (reverseReference) {
                for (BClassDtlDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBColList && !entity.getBColList().isEmpty()) {
            BColDtoMapper mapper = new BColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BColDto> relationDtoList = mapper.mappingToDtoList(entity.getBColList());
            dto.setBColList(relationDtoList);
            if (reverseReference) {
                for (BColDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBCultureList && !entity.getBCultureList().isEmpty()) {
            BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BCultureDto> relationDtoList = mapper.mappingToDtoList(entity.getBCultureList());
            dto.setBCultureList(relationDtoList);
            if (reverseReference) {
                for (BCultureDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBDictCultureList && !entity.getBDictCultureList().isEmpty()) {
            BDictCultureDtoMapper mapper = new BDictCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BDictCultureDto> relationDtoList = mapper.mappingToDtoList(entity.getBDictCultureList());
            dto.setBDictCultureList(relationDtoList);
            if (reverseReference) {
                for (BDictCultureDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBDictValidAsOne && entity.getBDictValidAsOne() != null) {
            BDictValid relationEntity = entity.getBDictValidAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictValidDto relationDto = (BDictValidDto)cachedDto;
                dto.setBDictValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBDict(dto);
                }
            } else {
                BDictValidDtoMapper mapper = new BDictValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBDict();
                BDictValidDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDictValidAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBDict(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDictValidAsOne());
                }
            }
        };
        if (!_suppressBItemList && !entity.getBItemList().isEmpty()) {
            BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BItemDto> relationDtoList = mapper.mappingToDtoList(entity.getBItemList());
            dto.setBItemList(relationDtoList);
            if (reverseReference) {
                for (BItemDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBMenuList && !entity.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BMenuDto> relationDtoList = mapper.mappingToDtoList(entity.getBMenuList());
            dto.setBMenuList(relationDtoList);
            if (reverseReference) {
                for (BMenuDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBMenuGrpList && !entity.getBMenuGrpList().isEmpty()) {
            BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BMenuGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getBMenuGrpList());
            dto.setBMenuGrpList(relationDtoList);
            if (reverseReference) {
                for (BMenuGrpDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBRoleList && !entity.getBRoleList().isEmpty()) {
            BRoleDtoMapper mapper = new BRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBRoleList());
            dto.setBRoleList(relationDtoList);
            if (reverseReference) {
                for (BRoleDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBRoleGrpList && !entity.getBRoleGrpList().isEmpty()) {
            BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BRoleGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getBRoleGrpList());
            dto.setBRoleGrpList(relationDtoList);
            if (reverseReference) {
                for (BRoleGrpDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressBScreenList && !entity.getBScreenList().isEmpty()) {
            BScreenDtoMapper mapper = new BScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getBScreenList());
            dto.setBScreenList(relationDtoList);
            if (reverseReference) {
                for (BScreenDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMCenterClassDtlList && !entity.getMCenterClassDtlList().isEmpty()) {
            MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterClassDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterClassDtlList());
            dto.setMCenterClassDtlList(relationDtoList);
            if (reverseReference) {
                for (MCenterClassDtlDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMCenterColList && !entity.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterColDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterColList());
            dto.setMCenterColList(relationDtoList);
            if (reverseReference) {
                for (MCenterColDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMCenterItemList && !entity.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterItemList());
            dto.setMCenterItemList(relationDtoList);
            if (reverseReference) {
                for (MCenterItemDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMCenterScreenList && !entity.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterScreenList());
            dto.setMCenterScreenList(relationDtoList);
            if (reverseReference) {
                for (MCenterScreenDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMClientColList && !entity.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientColDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientColList());
            dto.setMClientColList(relationDtoList);
            if (reverseReference) {
                for (MClientColDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMClientItemList && !entity.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientItemDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientItemList());
            dto.setMClientItemList(relationDtoList);
            if (reverseReference) {
                for (MClientItemDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMClientScreenList && !entity.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientScreenList());
            dto.setMClientScreenList(relationDtoList);
            if (reverseReference) {
                for (MClientScreenDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMHtDictAsOne && entity.getMHtDictAsOne() != null) {
            MHtDict relationEntity = entity.getMHtDictAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MHtDictDto relationDto = (MHtDictDto)cachedDto;
                dto.setMHtDictAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBDict(dto);
                }
            } else {
                MHtDictDtoMapper mapper = new MHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBDict();
                MHtDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMHtDictAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setBDict(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMHtDictAsOne());
                }
            }
        };
        if (!_suppressMProcessTypeList && !entity.getMProcessTypeList().isEmpty()) {
            MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MProcessTypeDto> relationDtoList = mapper.mappingToDtoList(entity.getMProcessTypeList());
            dto.setMProcessTypeList(relationDtoList);
            if (reverseReference) {
                for (MProcessTypeDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressMShapeByShapeDictIdList && !entity.getMShapeByShapeDictIdList().isEmpty()) {
            MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDictByShapeDictId();
            List<MShapeDto> relationDtoList = mapper.mappingToDtoList(entity.getMShapeByShapeDictIdList());
            dto.setMShapeByShapeDictIdList(relationDtoList);
            if (reverseReference) {
                for (MShapeDto relationDto : relationDtoList) {
                    relationDto.setBDictByShapeDictId(dto);
                }
            }
        };
        if (!_suppressMShapeByShapeUnitDictIdList && !entity.getMShapeByShapeUnitDictIdList().isEmpty()) {
            MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDictByShapeUnitDictId();
            List<MShapeDto> relationDtoList = mapper.mappingToDtoList(entity.getMShapeByShapeUnitDictIdList());
            dto.setMShapeByShapeUnitDictIdList(relationDtoList);
            if (reverseReference) {
                for (MShapeDto relationDto : relationDtoList) {
                    relationDto.setBDictByShapeUnitDictId(dto);
                }
            }
        };
        if (!_suppressMStockTypeList && !entity.getMStockTypeList().isEmpty()) {
            MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MStockTypeDto> relationDtoList = mapper.mappingToDtoList(entity.getMStockTypeList());
            dto.setMStockTypeList(relationDtoList);
            if (reverseReference) {
                for (MStockTypeDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressPReportLayoutItemList && !entity.getPReportLayoutItemList().isEmpty()) {
            PReportLayoutItemDtoMapper mapper = new PReportLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<PReportLayoutItemDto> relationDtoList = mapper.mappingToDtoList(entity.getPReportLayoutItemList());
            dto.setPReportLayoutItemList(relationDtoList);
            if (reverseReference) {
                for (PReportLayoutItemDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        if (!_suppressPSubrepLayoutItemList && !entity.getPSubrepLayoutItemList().isEmpty()) {
            PSubrepLayoutItemDtoMapper mapper = new PSubrepLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<PSubrepLayoutItemDto> relationDtoList = mapper.mappingToDtoList(entity.getPSubrepLayoutItemList());
            dto.setPSubrepLayoutItemList(relationDtoList);
            if (reverseReference) {
                for (PSubrepLayoutItemDto relationDto : relationDtoList) {
                    relationDto.setBDict(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BDictDto> mappingToDtoList(List<BDict> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BDictDto> dtoList = new ArrayList<BDictDto>();
        for (BDict entity : entityList) {
            BDictDto dto = mappingToDto(entity);
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
    public BDict mappingToEntity(BDictDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BDict)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BDict entity = new BDict();
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getDictNm(), "dictNm")) {
            entity.setDictNm(dto.getDictNm());
        }
        if (needsMapping(dto, dto.getDataType(), "dataType")) {
            entity.setDataTypeAsDataType(CDef.DataType.codeOf(dto.getDataType()));
        }
        if (needsMapping(dto, dto.getSystemType(), "systemType")) {
            entity.setSystemType(dto.getSystemType());
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
        if (!_suppressBClassDtlByDataType && dto.getBClassDtlByDataType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDataType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDataType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDataType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDataType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDataType());
                }
            }
        };
        if (!_suppressBArgList && !dto.getBArgList().isEmpty()) {
            BArgDtoMapper mapper = new BArgDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BArg> relationEntityList = mapper.mappingToEntityList(dto.getBArgList());
            entity.setBArgList(relationEntityList);
            if (reverseReference) {
                for (BArg relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBClassDtlList && !dto.getBClassDtlList().isEmpty()) {
            BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BClassDtl> relationEntityList = mapper.mappingToEntityList(dto.getBClassDtlList());
            entity.setBClassDtlList(relationEntityList);
            if (reverseReference) {
                for (BClassDtl relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBColList && !dto.getBColList().isEmpty()) {
            BColDtoMapper mapper = new BColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BCol> relationEntityList = mapper.mappingToEntityList(dto.getBColList());
            entity.setBColList(relationEntityList);
            if (reverseReference) {
                for (BCol relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBCultureList && !dto.getBCultureList().isEmpty()) {
            BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BCulture> relationEntityList = mapper.mappingToEntityList(dto.getBCultureList());
            entity.setBCultureList(relationEntityList);
            if (reverseReference) {
                for (BCulture relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBDictCultureList && !dto.getBDictCultureList().isEmpty()) {
            BDictCultureDtoMapper mapper = new BDictCultureDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BDictCulture> relationEntityList = mapper.mappingToEntityList(dto.getBDictCultureList());
            entity.setBDictCultureList(relationEntityList);
            if (reverseReference) {
                for (BDictCulture relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBDictValidAsOne && dto.getBDictValidAsOne() != null) {
            BDictValidDto relationDto = dto.getBDictValidAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDictValid relationEntity = (BDictValid)cachedEntity;
                entity.setBDictValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBDict(entity);
                }
            } else {
                BDictValidDtoMapper mapper = new BDictValidDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBDict();
                BDictValid relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDictValidAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBDict(entity);
                }
                if (instanceCache && entity.getBDictValidAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDictValidAsOne());
                }
            }
        };
        if (!_suppressBItemList && !dto.getBItemList().isEmpty()) {
            BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BItem> relationEntityList = mapper.mappingToEntityList(dto.getBItemList());
            entity.setBItemList(relationEntityList);
            if (reverseReference) {
                for (BItem relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBMenuList && !dto.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BMenu> relationEntityList = mapper.mappingToEntityList(dto.getBMenuList());
            entity.setBMenuList(relationEntityList);
            if (reverseReference) {
                for (BMenu relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBMenuGrpList && !dto.getBMenuGrpList().isEmpty()) {
            BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BMenuGrp> relationEntityList = mapper.mappingToEntityList(dto.getBMenuGrpList());
            entity.setBMenuGrpList(relationEntityList);
            if (reverseReference) {
                for (BMenuGrp relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBRoleList && !dto.getBRoleList().isEmpty()) {
            BRoleDtoMapper mapper = new BRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BRole> relationEntityList = mapper.mappingToEntityList(dto.getBRoleList());
            entity.setBRoleList(relationEntityList);
            if (reverseReference) {
                for (BRole relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBRoleGrpList && !dto.getBRoleGrpList().isEmpty()) {
            BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BRoleGrp> relationEntityList = mapper.mappingToEntityList(dto.getBRoleGrpList());
            entity.setBRoleGrpList(relationEntityList);
            if (reverseReference) {
                for (BRoleGrp relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressBScreenList && !dto.getBScreenList().isEmpty()) {
            BScreenDtoMapper mapper = new BScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<BScreen> relationEntityList = mapper.mappingToEntityList(dto.getBScreenList());
            entity.setBScreenList(relationEntityList);
            if (reverseReference) {
                for (BScreen relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMCenterClassDtlList && !dto.getMCenterClassDtlList().isEmpty()) {
            MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterClassDtl> relationEntityList = mapper.mappingToEntityList(dto.getMCenterClassDtlList());
            entity.setMCenterClassDtlList(relationEntityList);
            if (reverseReference) {
                for (MCenterClassDtl relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMCenterColList && !dto.getMCenterColList().isEmpty()) {
            MCenterColDtoMapper mapper = new MCenterColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterCol> relationEntityList = mapper.mappingToEntityList(dto.getMCenterColList());
            entity.setMCenterColList(relationEntityList);
            if (reverseReference) {
                for (MCenterCol relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMCenterItemList && !dto.getMCenterItemList().isEmpty()) {
            MCenterItemDtoMapper mapper = new MCenterItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterItem> relationEntityList = mapper.mappingToEntityList(dto.getMCenterItemList());
            entity.setMCenterItemList(relationEntityList);
            if (reverseReference) {
                for (MCenterItem relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMCenterScreenList && !dto.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MCenterScreen> relationEntityList = mapper.mappingToEntityList(dto.getMCenterScreenList());
            entity.setMCenterScreenList(relationEntityList);
            if (reverseReference) {
                for (MCenterScreen relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMClientColList && !dto.getMClientColList().isEmpty()) {
            MClientColDtoMapper mapper = new MClientColDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientCol> relationEntityList = mapper.mappingToEntityList(dto.getMClientColList());
            entity.setMClientColList(relationEntityList);
            if (reverseReference) {
                for (MClientCol relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMClientItemList && !dto.getMClientItemList().isEmpty()) {
            MClientItemDtoMapper mapper = new MClientItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientItem> relationEntityList = mapper.mappingToEntityList(dto.getMClientItemList());
            entity.setMClientItemList(relationEntityList);
            if (reverseReference) {
                for (MClientItem relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMClientScreenList && !dto.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MClientScreen> relationEntityList = mapper.mappingToEntityList(dto.getMClientScreenList());
            entity.setMClientScreenList(relationEntityList);
            if (reverseReference) {
                for (MClientScreen relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMHtDictAsOne && dto.getMHtDictAsOne() != null) {
            MHtDictDto relationDto = dto.getMHtDictAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MHtDict relationEntity = (MHtDict)cachedEntity;
                entity.setMHtDictAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBDict(entity);
                }
            } else {
                MHtDictDtoMapper mapper = new MHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBDict();
                MHtDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMHtDictAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setBDict(entity);
                }
                if (instanceCache && entity.getMHtDictAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMHtDictAsOne());
                }
            }
        };
        if (!_suppressMProcessTypeList && !dto.getMProcessTypeList().isEmpty()) {
            MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MProcessType> relationEntityList = mapper.mappingToEntityList(dto.getMProcessTypeList());
            entity.setMProcessTypeList(relationEntityList);
            if (reverseReference) {
                for (MProcessType relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressMShapeByShapeDictIdList && !dto.getMShapeByShapeDictIdList().isEmpty()) {
            MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDictByShapeDictId();
            List<MShape> relationEntityList = mapper.mappingToEntityList(dto.getMShapeByShapeDictIdList());
            entity.setMShapeByShapeDictIdList(relationEntityList);
            if (reverseReference) {
                for (MShape relationEntity : relationEntityList) {
                    relationEntity.setBDictByShapeDictId(entity);
                }
            }
        };
        if (!_suppressMShapeByShapeUnitDictIdList && !dto.getMShapeByShapeUnitDictIdList().isEmpty()) {
            MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDictByShapeUnitDictId();
            List<MShape> relationEntityList = mapper.mappingToEntityList(dto.getMShapeByShapeUnitDictIdList());
            entity.setMShapeByShapeUnitDictIdList(relationEntityList);
            if (reverseReference) {
                for (MShape relationEntity : relationEntityList) {
                    relationEntity.setBDictByShapeUnitDictId(entity);
                }
            }
        };
        if (!_suppressMStockTypeList && !dto.getMStockTypeList().isEmpty()) {
            MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<MStockType> relationEntityList = mapper.mappingToEntityList(dto.getMStockTypeList());
            entity.setMStockTypeList(relationEntityList);
            if (reverseReference) {
                for (MStockType relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressPReportLayoutItemList && !dto.getPReportLayoutItemList().isEmpty()) {
            PReportLayoutItemDtoMapper mapper = new PReportLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<PReportLayoutItem> relationEntityList = mapper.mappingToEntityList(dto.getPReportLayoutItemList());
            entity.setPReportLayoutItemList(relationEntityList);
            if (reverseReference) {
                for (PReportLayoutItem relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
                }
            }
        };
        if (!_suppressPSubrepLayoutItemList && !dto.getPSubrepLayoutItemList().isEmpty()) {
            PSubrepLayoutItemDtoMapper mapper = new PSubrepLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBDict();
            List<PSubrepLayoutItem> relationEntityList = mapper.mappingToEntityList(dto.getPSubrepLayoutItemList());
            entity.setPSubrepLayoutItemList(relationEntityList);
            if (reverseReference) {
                for (PSubrepLayoutItem relationEntity : relationEntityList) {
                    relationEntity.setBDict(entity);
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
    protected boolean needsMapping(BDictDto dto, Object value, String propName) {
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
    public List<BDict> mappingToEntityList(List<BDictDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BDict> entityList = new ArrayList<BDict>();
        for (BDictDto dto : dtoList) {
            BDict entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByDataType() {
        _suppressBClassDtlByDataType = true;
    }
    public void suppressBArgList() {
        _suppressBArgList = true;
    }
    public void suppressBClassDtlList() {
        _suppressBClassDtlList = true;
    }
    public void suppressBColList() {
        _suppressBColList = true;
    }
    public void suppressBCultureList() {
        _suppressBCultureList = true;
    }
    public void suppressBDictCultureList() {
        _suppressBDictCultureList = true;
    }
    public void suppressBDictValidAsOne() {
        _suppressBDictValidAsOne = true;
    }
    public void suppressBItemList() {
        _suppressBItemList = true;
    }
    public void suppressBMenuList() {
        _suppressBMenuList = true;
    }
    public void suppressBMenuGrpList() {
        _suppressBMenuGrpList = true;
    }
    public void suppressBRoleList() {
        _suppressBRoleList = true;
    }
    public void suppressBRoleGrpList() {
        _suppressBRoleGrpList = true;
    }
    public void suppressBScreenList() {
        _suppressBScreenList = true;
    }
    public void suppressMCenterClassDtlList() {
        _suppressMCenterClassDtlList = true;
    }
    public void suppressMCenterColList() {
        _suppressMCenterColList = true;
    }
    public void suppressMCenterItemList() {
        _suppressMCenterItemList = true;
    }
    public void suppressMCenterScreenList() {
        _suppressMCenterScreenList = true;
    }
    public void suppressMClientColList() {
        _suppressMClientColList = true;
    }
    public void suppressMClientItemList() {
        _suppressMClientItemList = true;
    }
    public void suppressMClientScreenList() {
        _suppressMClientScreenList = true;
    }
    public void suppressMHtDictAsOne() {
        _suppressMHtDictAsOne = true;
    }
    public void suppressMProcessTypeList() {
        _suppressMProcessTypeList = true;
    }
    public void suppressMShapeByShapeDictIdList() {
        _suppressMShapeByShapeDictIdList = true;
    }
    public void suppressMShapeByShapeUnitDictIdList() {
        _suppressMShapeByShapeUnitDictIdList = true;
    }
    public void suppressMStockTypeList() {
        _suppressMStockTypeList = true;
    }
    public void suppressPReportLayoutItemList() {
        _suppressPReportLayoutItemList = true;
    }
    public void suppressPSubrepLayoutItemList() {
        _suppressPSubrepLayoutItemList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBClassDtlByDataType();
        suppressBArgList();
        suppressBClassDtlList();
        suppressBColList();
        suppressBCultureList();
        suppressBDictCultureList();
        suppressBDictValidAsOne();
        suppressBItemList();
        suppressBMenuList();
        suppressBMenuGrpList();
        suppressBRoleList();
        suppressBRoleGrpList();
        suppressBScreenList();
        suppressMCenterClassDtlList();
        suppressMCenterColList();
        suppressMCenterItemList();
        suppressMCenterScreenList();
        suppressMClientColList();
        suppressMClientItemList();
        suppressMClientScreenList();
        suppressMHtDictAsOne();
        suppressMProcessTypeList();
        suppressMShapeByShapeDictIdList();
        suppressMShapeByShapeUnitDictIdList();
        suppressMStockTypeList();
        suppressPReportLayoutItemList();
        suppressPSubrepLayoutItemList();
    }
    protected void doSuppressClear() { // internal
        _suppressBClassDtlByDataType = false;
        _suppressBArgList = false;
        _suppressBClassDtlList = false;
        _suppressBColList = false;
        _suppressBCultureList = false;
        _suppressBDictCultureList = false;
        _suppressBDictValidAsOne = false;
        _suppressBItemList = false;
        _suppressBMenuList = false;
        _suppressBMenuGrpList = false;
        _suppressBRoleList = false;
        _suppressBRoleGrpList = false;
        _suppressBScreenList = false;
        _suppressMCenterClassDtlList = false;
        _suppressMCenterColList = false;
        _suppressMCenterItemList = false;
        _suppressMCenterScreenList = false;
        _suppressMClientColList = false;
        _suppressMClientItemList = false;
        _suppressMClientScreenList = false;
        _suppressMHtDictAsOne = false;
        _suppressMProcessTypeList = false;
        _suppressMShapeByShapeDictIdList = false;
        _suppressMShapeByShapeUnitDictIdList = false;
        _suppressMStockTypeList = false;
        _suppressPReportLayoutItemList = false;
        _suppressPSubrepLayoutItemList = false;
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
    public BDictDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BDictDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BDictDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BDictDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BDictDtoMapper reverseReference() {
        setReverseReference(true);
        return (BDictDtoMapper)this;
    }
}

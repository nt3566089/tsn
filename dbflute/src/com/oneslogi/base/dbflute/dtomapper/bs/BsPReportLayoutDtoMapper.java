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
 * The DTO mapper of P_REPORT_LAYOUT as TABLE. <br>
 * 帳票レイアウトマスタ
 * <pre>
 * [primary-key]
 *     REPORT_LAYOUT_ID
 *
 * [column]
 *     REPORT_LAYOUT_ID, REPORT_ID, REPORT_LAYOUT_NM, REPORT_LAYOUT_DATA, UPDATABLE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, AUTO_PRINT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_REPORT, B_CLASS_DTL(ByUpdatable), P_LAYOUT_PRINT_SETTING(AsOne), P_SUBREP_LAYOUT(AsOne)
 *
 * [referrer-table]
 *     P_REPORT_LAYOUT_ITEM, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET, P_LAYOUT_PRINT_SETTING, P_SUBREP_LAYOUT
 *
 * [foreign-property]
 *     pReport, bClassDtlByUpdatable, bClassDtlByAutoPrintTargetFlg, pLayoutPrintSettingAsOne, pSubrepLayoutAsOne
 *
 * [referrer-property]
 *     pReportLayoutItemList, pUserAutoPrintSettingByReportLayoutIdList, pTerminalAutoPrintSetByReportLayoutIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPReportLayoutDtoMapper implements DtoMapper<PReportLayout, PReportLayoutDto>, Serializable {

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
    protected boolean _suppressPReport;
    protected boolean _suppressBClassDtlByUpdatable;
    protected boolean _suppressBClassDtlByAutoPrintTargetFlg;
    protected boolean _suppressPLayoutPrintSettingAsOne;
    protected boolean _suppressPReportLayoutItemList;
    protected boolean _suppressPSubrepLayoutAsOne;
    protected boolean _suppressPUserAutoPrintSettingByReportLayoutIdList;
    protected boolean _suppressPTerminalAutoPrintSetByReportLayoutIdList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPReportLayoutDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPReportLayoutDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PReportLayoutDto mappingToDto(PReportLayout entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PReportLayoutDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PReportLayoutDto dto = new PReportLayoutDto();
        dto.setReportLayoutId(entity.getReportLayoutId());
        dto.setReportId(entity.getReportId());
        dto.setReportLayoutNm(entity.getReportLayoutNm());
        dto.setReportLayoutData(entity.getReportLayoutData());
        dto.setUpdatable(entity.getUpdatable());
        dto.setAttribute1(entity.getAttribute1());
        dto.setAttribute2(entity.getAttribute2());
        dto.setAttribute3(entity.getAttribute3());
        dto.setAttribute4(entity.getAttribute4());
        dto.setAttribute5(entity.getAttribute5());
        dto.setAutoPrintTargetFlg(entity.getAutoPrintTargetFlg());
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
        if (!_suppressPReport && entity.getPReport() != null) {
            PReport relationEntity = entity.getPReport();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PReportDto relationDto = (PReportDto)cachedDto;
                dto.setPReport(relationDto);
                if (reverseReference) {
                    relationDto.getPReportLayoutList().add(dto);
                }
            } else {
                PReportDtoMapper mapper = new PReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayoutList();
                PReportDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPReport(relationDto);
                if (reverseReference) {
                    relationDto.getPReportLayoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPReport());
                }
            }
        };
        if (!_suppressBClassDtlByUpdatable && entity.getBClassDtlByUpdatable() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByUpdatable();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByUpdatable(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByUpdatable(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByUpdatable());
                }
            }
        };
        if (!_suppressBClassDtlByAutoPrintTargetFlg && entity.getBClassDtlByAutoPrintTargetFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAutoPrintTargetFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAutoPrintTargetFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAutoPrintTargetFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAutoPrintTargetFlg());
                }
            }
        };
        if (!_suppressPLayoutPrintSettingAsOne && entity.getPLayoutPrintSettingAsOne() != null) {
            PLayoutPrintSetting relationEntity = entity.getPLayoutPrintSettingAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PLayoutPrintSettingDto relationDto = (PLayoutPrintSettingDto)cachedDto;
                dto.setPLayoutPrintSettingAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPReportLayout(dto);
                }
            } else {
                PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayout();
                PLayoutPrintSettingDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPLayoutPrintSettingAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPReportLayout(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPLayoutPrintSettingAsOne());
                }
            }
        };
        if (!_suppressPReportLayoutItemList && !entity.getPReportLayoutItemList().isEmpty()) {
            PReportLayoutItemDtoMapper mapper = new PReportLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayout();
            List<PReportLayoutItemDto> relationDtoList = mapper.mappingToDtoList(entity.getPReportLayoutItemList());
            dto.setPReportLayoutItemList(relationDtoList);
            if (reverseReference) {
                for (PReportLayoutItemDto relationDto : relationDtoList) {
                    relationDto.setPReportLayout(dto);
                }
            }
        };
        if (!_suppressPSubrepLayoutAsOne && entity.getPSubrepLayoutAsOne() != null) {
            PSubrepLayout relationEntity = entity.getPSubrepLayoutAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PSubrepLayoutDto relationDto = (PSubrepLayoutDto)cachedDto;
                dto.setPSubrepLayoutAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPReportLayout(dto);
                }
            } else {
                PSubrepLayoutDtoMapper mapper = new PSubrepLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayout();
                PSubrepLayoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPSubrepLayoutAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPReportLayout(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPSubrepLayoutAsOne());
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByReportLayoutIdList && !entity.getPUserAutoPrintSettingByReportLayoutIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayoutByReportLayoutId();
            List<PUserAutoPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPUserAutoPrintSettingByReportLayoutIdList());
            dto.setPUserAutoPrintSettingByReportLayoutIdList(relationDtoList);
            if (reverseReference) {
                for (PUserAutoPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPReportLayoutByReportLayoutId(dto);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByReportLayoutIdList && !entity.getPTerminalAutoPrintSetByReportLayoutIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayoutByReportLayoutId();
            List<PTerminalAutoPrintSetDto> relationDtoList = mapper.mappingToDtoList(entity.getPTerminalAutoPrintSetByReportLayoutIdList());
            dto.setPTerminalAutoPrintSetByReportLayoutIdList(relationDtoList);
            if (reverseReference) {
                for (PTerminalAutoPrintSetDto relationDto : relationDtoList) {
                    relationDto.setPReportLayoutByReportLayoutId(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PReportLayoutDto> mappingToDtoList(List<PReportLayout> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PReportLayoutDto> dtoList = new ArrayList<PReportLayoutDto>();
        for (PReportLayout entity : entityList) {
            PReportLayoutDto dto = mappingToDto(entity);
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
    public PReportLayout mappingToEntity(PReportLayoutDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PReportLayout)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PReportLayout entity = new PReportLayout();
        if (needsMapping(dto, dto.getReportLayoutId(), "reportLayoutId")) {
            entity.setReportLayoutId(dto.getReportLayoutId());
        }
        if (needsMapping(dto, dto.getReportId(), "reportId")) {
            entity.setReportId(dto.getReportId());
        }
        if (needsMapping(dto, dto.getReportLayoutNm(), "reportLayoutNm")) {
            entity.setReportLayoutNm(dto.getReportLayoutNm());
        }
        if (needsMapping(dto, dto.getReportLayoutData(), "reportLayoutData")) {
            entity.setReportLayoutData(dto.getReportLayoutData());
        }
        if (needsMapping(dto, dto.getUpdatable(), "updatable")) {
            entity.setUpdatableAsUpdatable(CDef.Updatable.codeOf(dto.getUpdatable()));
        }
        if (needsMapping(dto, dto.getAttribute1(), "attribute1")) {
            entity.setAttribute1(dto.getAttribute1());
        }
        if (needsMapping(dto, dto.getAttribute2(), "attribute2")) {
            entity.setAttribute2(dto.getAttribute2());
        }
        if (needsMapping(dto, dto.getAttribute3(), "attribute3")) {
            entity.setAttribute3(dto.getAttribute3());
        }
        if (needsMapping(dto, dto.getAttribute4(), "attribute4")) {
            entity.setAttribute4(dto.getAttribute4());
        }
        if (needsMapping(dto, dto.getAttribute5(), "attribute5")) {
            entity.setAttribute5(dto.getAttribute5());
        }
        if (needsMapping(dto, dto.getAutoPrintTargetFlg(), "autoPrintTargetFlg")) {
            entity.setAutoPrintTargetFlgAsAutoPrintTargetFlg(CDef.AutoPrintTargetFlg.codeOf(dto.getAutoPrintTargetFlg()));
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
        if (!_suppressPReport && dto.getPReport() != null) {
            PReportDto relationDto = dto.getPReport();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PReport relationEntity = (PReport)cachedEntity;
                entity.setPReport(relationEntity);
                if (reverseReference) {
                    relationEntity.getPReportLayoutList().add(entity);
                }
            } else {
                PReportDtoMapper mapper = new PReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayoutList();
                PReport relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPReport(relationEntity);
                if (reverseReference) {
                    relationEntity.getPReportLayoutList().add(entity);
                }
                if (instanceCache && entity.getPReport().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPReport());
                }
            }
        };
        if (!_suppressBClassDtlByUpdatable && dto.getBClassDtlByUpdatable() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByUpdatable();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByUpdatable(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByUpdatable(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByUpdatable().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByUpdatable());
                }
            }
        };
        if (!_suppressBClassDtlByAutoPrintTargetFlg && dto.getBClassDtlByAutoPrintTargetFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAutoPrintTargetFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAutoPrintTargetFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAutoPrintTargetFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAutoPrintTargetFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAutoPrintTargetFlg());
                }
            }
        };
        if (!_suppressPLayoutPrintSettingAsOne && dto.getPLayoutPrintSettingAsOne() != null) {
            PLayoutPrintSettingDto relationDto = dto.getPLayoutPrintSettingAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PLayoutPrintSetting relationEntity = (PLayoutPrintSetting)cachedEntity;
                entity.setPLayoutPrintSettingAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPReportLayout(entity);
                }
            } else {
                PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayout();
                PLayoutPrintSetting relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPLayoutPrintSettingAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPReportLayout(entity);
                }
                if (instanceCache && entity.getPLayoutPrintSettingAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPLayoutPrintSettingAsOne());
                }
            }
        };
        if (!_suppressPReportLayoutItemList && !dto.getPReportLayoutItemList().isEmpty()) {
            PReportLayoutItemDtoMapper mapper = new PReportLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayout();
            List<PReportLayoutItem> relationEntityList = mapper.mappingToEntityList(dto.getPReportLayoutItemList());
            entity.setPReportLayoutItemList(relationEntityList);
            if (reverseReference) {
                for (PReportLayoutItem relationEntity : relationEntityList) {
                    relationEntity.setPReportLayout(entity);
                }
            }
        };
        if (!_suppressPSubrepLayoutAsOne && dto.getPSubrepLayoutAsOne() != null) {
            PSubrepLayoutDto relationDto = dto.getPSubrepLayoutAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PSubrepLayout relationEntity = (PSubrepLayout)cachedEntity;
                entity.setPSubrepLayoutAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPReportLayout(entity);
                }
            } else {
                PSubrepLayoutDtoMapper mapper = new PSubrepLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPReportLayout();
                PSubrepLayout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPSubrepLayoutAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPReportLayout(entity);
                }
                if (instanceCache && entity.getPSubrepLayoutAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPSubrepLayoutAsOne());
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByReportLayoutIdList && !dto.getPUserAutoPrintSettingByReportLayoutIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayoutByReportLayoutId();
            List<PUserAutoPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPUserAutoPrintSettingByReportLayoutIdList());
            entity.setPUserAutoPrintSettingByReportLayoutIdList(relationEntityList);
            if (reverseReference) {
                for (PUserAutoPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPReportLayoutByReportLayoutId(entity);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByReportLayoutIdList && !dto.getPTerminalAutoPrintSetByReportLayoutIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPReportLayoutByReportLayoutId();
            List<PTerminalAutoPrintSet> relationEntityList = mapper.mappingToEntityList(dto.getPTerminalAutoPrintSetByReportLayoutIdList());
            entity.setPTerminalAutoPrintSetByReportLayoutIdList(relationEntityList);
            if (reverseReference) {
                for (PTerminalAutoPrintSet relationEntity : relationEntityList) {
                    relationEntity.setPReportLayoutByReportLayoutId(entity);
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
    protected boolean needsMapping(PReportLayoutDto dto, Object value, String propName) {
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
    public List<PReportLayout> mappingToEntityList(List<PReportLayoutDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PReportLayout> entityList = new ArrayList<PReportLayout>();
        for (PReportLayoutDto dto : dtoList) {
            PReportLayout entity = mappingToEntity(dto);
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
    public void suppressPReport() {
        _suppressPReport = true;
    }
    public void suppressBClassDtlByUpdatable() {
        _suppressBClassDtlByUpdatable = true;
    }
    public void suppressBClassDtlByAutoPrintTargetFlg() {
        _suppressBClassDtlByAutoPrintTargetFlg = true;
    }
    public void suppressPLayoutPrintSettingAsOne() {
        _suppressPLayoutPrintSettingAsOne = true;
    }
    public void suppressPReportLayoutItemList() {
        _suppressPReportLayoutItemList = true;
    }
    public void suppressPSubrepLayoutAsOne() {
        _suppressPSubrepLayoutAsOne = true;
    }
    public void suppressPUserAutoPrintSettingByReportLayoutIdList() {
        _suppressPUserAutoPrintSettingByReportLayoutIdList = true;
    }
    public void suppressPTerminalAutoPrintSetByReportLayoutIdList() {
        _suppressPTerminalAutoPrintSetByReportLayoutIdList = true;
    }
    protected void doSuppressAll() { // internal
        suppressPReport();
        suppressBClassDtlByUpdatable();
        suppressBClassDtlByAutoPrintTargetFlg();
        suppressPLayoutPrintSettingAsOne();
        suppressPReportLayoutItemList();
        suppressPSubrepLayoutAsOne();
        suppressPUserAutoPrintSettingByReportLayoutIdList();
        suppressPTerminalAutoPrintSetByReportLayoutIdList();
    }
    protected void doSuppressClear() { // internal
        _suppressPReport = false;
        _suppressBClassDtlByUpdatable = false;
        _suppressBClassDtlByAutoPrintTargetFlg = false;
        _suppressPLayoutPrintSettingAsOne = false;
        _suppressPReportLayoutItemList = false;
        _suppressPSubrepLayoutAsOne = false;
        _suppressPUserAutoPrintSettingByReportLayoutIdList = false;
        _suppressPTerminalAutoPrintSetByReportLayoutIdList = false;
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
    public PReportLayoutDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PReportLayoutDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PReportLayoutDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PReportLayoutDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PReportLayoutDtoMapper reverseReference() {
        setReverseReference(true);
        return (PReportLayoutDtoMapper)this;
    }
}

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
 * The DTO mapper of P_PRINT_REQUEST as TABLE. <br>
 * 印刷情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_CD, REPORT_NM, REPORT_LAYOUT_NM, PRINTER_GROUP_ID, PRINTER_GROUP_NM, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_STATUS, FIRST_PRINT_DT, LATEST_PRINT_DT, PRINTED_COUNT, PRINTED_FLG, QUEUE_ADD_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByPrintStatus), P_PRINT_REQUEST_DATA(AsOne)
 *
 * [referrer-table]
 *     P_PRINT_QUEUE, P_PRINT_REQUEST_BINARY, P_PRINT_REQUEST_HIST, P_PRINT_REQUEST_DATA
 *
 * [foreign-property]
 *     bClassDtlByPrintStatus, bClassDtlBySheetCollate, bClassDtlByPrintedFlg, bClassDtlByPrintDataType, pPrintRequestDataAsOne
 *
 * [referrer-property]
 *     pPrintQueueList, pPrintRequestBinaryList, pPrintRequestHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrintRequestDtoMapper implements DtoMapper<PPrintRequest, PPrintRequestDto>, Serializable {

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
    protected boolean _suppressBClassDtlByPrintStatus;
    protected boolean _suppressBClassDtlBySheetCollate;
    protected boolean _suppressBClassDtlByPrintedFlg;
    protected boolean _suppressBClassDtlByPrintDataType;
    protected boolean _suppressPPrintQueueList;
    protected boolean _suppressPPrintRequestBinaryList;
    protected boolean _suppressPPrintRequestDataAsOne;
    protected boolean _suppressPPrintRequestHistList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintRequestDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrintRequestDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrintRequestDto mappingToDto(PPrintRequest entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrintRequestDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintRequestDto dto = new PPrintRequestDto();
        dto.setPrintRequestId(entity.getPrintRequestId());
        dto.setReportCd(entity.getReportCd());
        dto.setReportNm(entity.getReportNm());
        dto.setReportLayoutNm(entity.getReportLayoutNm());
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrinterGroupNm(entity.getPrinterGroupNm());
        dto.setPrinterNm(entity.getPrinterNm());
        dto.setTrayNm(entity.getTrayNm());
        dto.setPrintNum(entity.getPrintNum());
        dto.setDocumentPageSize(entity.getDocumentPageSize());
        dto.setSheetCollate(entity.getSheetCollate());
        dto.setPrintStatus(entity.getPrintStatus());
        dto.setFirstPrintDt(entity.getFirstPrintDt());
        dto.setLatestPrintDt(entity.getLatestPrintDt());
        dto.setPrintedCount(entity.getPrintedCount());
        dto.setPrintedFlg(entity.getPrintedFlg());
        dto.setQueueAddDt(entity.getQueueAddDt());
        dto.setPrintDataType(entity.getPrintDataType());
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
        if (!_suppressBClassDtlByPrintStatus && entity.getBClassDtlByPrintStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPrintStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPrintStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPrintStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPrintStatus());
                }
            }
        };
        if (!_suppressBClassDtlBySheetCollate && entity.getBClassDtlBySheetCollate() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySheetCollate();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySheetCollate(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySheetCollate(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySheetCollate());
                }
            }
        };
        if (!_suppressBClassDtlByPrintedFlg && entity.getBClassDtlByPrintedFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPrintedFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPrintedFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPrintedFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPrintedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPrintDataType && entity.getBClassDtlByPrintDataType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPrintDataType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPrintDataType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPrintDataType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPrintDataType());
                }
            }
        };
        if (!_suppressPPrintQueueList && !entity.getPPrintQueueList().isEmpty()) {
            PPrintQueueDtoMapper mapper = new PPrintQueueDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintQueueDto> relationDtoList = mapper.mappingToDtoList(entity.getPPrintQueueList());
            dto.setPPrintQueueList(relationDtoList);
            if (reverseReference) {
                for (PPrintQueueDto relationDto : relationDtoList) {
                    relationDto.setPPrintRequest(dto);
                }
            }
        };
        if (!_suppressPPrintRequestBinaryList && !entity.getPPrintRequestBinaryList().isEmpty()) {
            PPrintRequestBinaryDtoMapper mapper = new PPrintRequestBinaryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintRequestBinaryDto> relationDtoList = mapper.mappingToDtoList(entity.getPPrintRequestBinaryList());
            dto.setPPrintRequestBinaryList(relationDtoList);
            if (reverseReference) {
                for (PPrintRequestBinaryDto relationDto : relationDtoList) {
                    relationDto.setPPrintRequest(dto);
                }
            }
        };
        if (!_suppressPPrintRequestDataAsOne && entity.getPPrintRequestDataAsOne() != null) {
            PPrintRequestData relationEntity = entity.getPPrintRequestDataAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrintRequestDataDto relationDto = (PPrintRequestDataDto)cachedDto;
                dto.setPPrintRequestDataAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPPrintRequest(dto);
                }
            } else {
                PPrintRequestDataDtoMapper mapper = new PPrintRequestDataDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintRequest();
                PPrintRequestDataDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrintRequestDataAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setPPrintRequest(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrintRequestDataAsOne());
                }
            }
        };
        if (!_suppressPPrintRequestHistList && !entity.getPPrintRequestHistList().isEmpty()) {
            PPrintRequestHistDtoMapper mapper = new PPrintRequestHistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintRequestHistDto> relationDtoList = mapper.mappingToDtoList(entity.getPPrintRequestHistList());
            dto.setPPrintRequestHistList(relationDtoList);
            if (reverseReference) {
                for (PPrintRequestHistDto relationDto : relationDtoList) {
                    relationDto.setPPrintRequest(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrintRequestDto> mappingToDtoList(List<PPrintRequest> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrintRequestDto> dtoList = new ArrayList<PPrintRequestDto>();
        for (PPrintRequest entity : entityList) {
            PPrintRequestDto dto = mappingToDto(entity);
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
    public PPrintRequest mappingToEntity(PPrintRequestDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrintRequest)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintRequest entity = new PPrintRequest();
        if (needsMapping(dto, dto.getPrintRequestId(), "printRequestId")) {
            entity.setPrintRequestId(dto.getPrintRequestId());
        }
        if (needsMapping(dto, dto.getReportCd(), "reportCd")) {
            entity.setReportCd(dto.getReportCd());
        }
        if (needsMapping(dto, dto.getReportNm(), "reportNm")) {
            entity.setReportNm(dto.getReportNm());
        }
        if (needsMapping(dto, dto.getReportLayoutNm(), "reportLayoutNm")) {
            entity.setReportLayoutNm(dto.getReportLayoutNm());
        }
        if (needsMapping(dto, dto.getPrinterGroupId(), "printerGroupId")) {
            entity.setPrinterGroupId(dto.getPrinterGroupId());
        }
        if (needsMapping(dto, dto.getPrinterGroupNm(), "printerGroupNm")) {
            entity.setPrinterGroupNm(dto.getPrinterGroupNm());
        }
        if (needsMapping(dto, dto.getPrinterNm(), "printerNm")) {
            entity.setPrinterNm(dto.getPrinterNm());
        }
        if (needsMapping(dto, dto.getTrayNm(), "trayNm")) {
            entity.setTrayNm(dto.getTrayNm());
        }
        if (needsMapping(dto, dto.getPrintNum(), "printNum")) {
            entity.setPrintNum(dto.getPrintNum());
        }
        if (needsMapping(dto, dto.getDocumentPageSize(), "documentPageSize")) {
            entity.setDocumentPageSize(dto.getDocumentPageSize());
        }
        if (needsMapping(dto, dto.getSheetCollate(), "sheetCollate")) {
            entity.setSheetCollateAsSheetCollate(CDef.SheetCollate.codeOf(dto.getSheetCollate()));
        }
        if (needsMapping(dto, dto.getPrintStatus(), "printStatus")) {
            entity.setPrintStatusAsPrintStatus(CDef.PrintStatus.codeOf(dto.getPrintStatus()));
        }
        if (needsMapping(dto, dto.getFirstPrintDt(), "firstPrintDt")) {
            entity.setFirstPrintDt(dto.getFirstPrintDt());
        }
        if (needsMapping(dto, dto.getLatestPrintDt(), "latestPrintDt")) {
            entity.setLatestPrintDt(dto.getLatestPrintDt());
        }
        if (needsMapping(dto, dto.getPrintedCount(), "printedCount")) {
            entity.setPrintedCount(dto.getPrintedCount());
        }
        if (needsMapping(dto, dto.getPrintedFlg(), "printedFlg")) {
            entity.setPrintedFlgAsPrintedFlg(CDef.PrintedFlg.codeOf(dto.getPrintedFlg()));
        }
        if (needsMapping(dto, dto.getQueueAddDt(), "queueAddDt")) {
            entity.setQueueAddDt(dto.getQueueAddDt());
        }
        if (needsMapping(dto, dto.getPrintDataType(), "printDataType")) {
            entity.setPrintDataTypeAsPrintDataType(CDef.PrintDataType.codeOf(dto.getPrintDataType()));
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
        if (!_suppressBClassDtlByPrintStatus && dto.getBClassDtlByPrintStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPrintStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPrintStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPrintStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPrintStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPrintStatus());
                }
            }
        };
        if (!_suppressBClassDtlBySheetCollate && dto.getBClassDtlBySheetCollate() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySheetCollate();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySheetCollate(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySheetCollate(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySheetCollate().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySheetCollate());
                }
            }
        };
        if (!_suppressBClassDtlByPrintedFlg && dto.getBClassDtlByPrintedFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPrintedFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPrintedFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPrintedFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPrintedFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPrintedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPrintDataType && dto.getBClassDtlByPrintDataType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPrintDataType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPrintDataType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPrintDataType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPrintDataType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPrintDataType());
                }
            }
        };
        if (!_suppressPPrintQueueList && !dto.getPPrintQueueList().isEmpty()) {
            PPrintQueueDtoMapper mapper = new PPrintQueueDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintQueue> relationEntityList = mapper.mappingToEntityList(dto.getPPrintQueueList());
            entity.setPPrintQueueList(relationEntityList);
            if (reverseReference) {
                for (PPrintQueue relationEntity : relationEntityList) {
                    relationEntity.setPPrintRequest(entity);
                }
            }
        };
        if (!_suppressPPrintRequestBinaryList && !dto.getPPrintRequestBinaryList().isEmpty()) {
            PPrintRequestBinaryDtoMapper mapper = new PPrintRequestBinaryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintRequestBinary> relationEntityList = mapper.mappingToEntityList(dto.getPPrintRequestBinaryList());
            entity.setPPrintRequestBinaryList(relationEntityList);
            if (reverseReference) {
                for (PPrintRequestBinary relationEntity : relationEntityList) {
                    relationEntity.setPPrintRequest(entity);
                }
            }
        };
        if (!_suppressPPrintRequestDataAsOne && dto.getPPrintRequestDataAsOne() != null) {
            PPrintRequestDataDto relationDto = dto.getPPrintRequestDataAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrintRequestData relationEntity = (PPrintRequestData)cachedEntity;
                entity.setPPrintRequestDataAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPPrintRequest(entity);
                }
            } else {
                PPrintRequestDataDtoMapper mapper = new PPrintRequestDataDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintRequest();
                PPrintRequestData relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrintRequestDataAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setPPrintRequest(entity);
                }
                if (instanceCache && entity.getPPrintRequestDataAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrintRequestDataAsOne());
                }
            }
        };
        if (!_suppressPPrintRequestHistList && !dto.getPPrintRequestHistList().isEmpty()) {
            PPrintRequestHistDtoMapper mapper = new PPrintRequestHistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrintRequest();
            List<PPrintRequestHist> relationEntityList = mapper.mappingToEntityList(dto.getPPrintRequestHistList());
            entity.setPPrintRequestHistList(relationEntityList);
            if (reverseReference) {
                for (PPrintRequestHist relationEntity : relationEntityList) {
                    relationEntity.setPPrintRequest(entity);
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
    protected boolean needsMapping(PPrintRequestDto dto, Object value, String propName) {
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
    public List<PPrintRequest> mappingToEntityList(List<PPrintRequestDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrintRequest> entityList = new ArrayList<PPrintRequest>();
        for (PPrintRequestDto dto : dtoList) {
            PPrintRequest entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByPrintStatus() {
        _suppressBClassDtlByPrintStatus = true;
    }
    public void suppressBClassDtlBySheetCollate() {
        _suppressBClassDtlBySheetCollate = true;
    }
    public void suppressBClassDtlByPrintedFlg() {
        _suppressBClassDtlByPrintedFlg = true;
    }
    public void suppressBClassDtlByPrintDataType() {
        _suppressBClassDtlByPrintDataType = true;
    }
    public void suppressPPrintQueueList() {
        _suppressPPrintQueueList = true;
    }
    public void suppressPPrintRequestBinaryList() {
        _suppressPPrintRequestBinaryList = true;
    }
    public void suppressPPrintRequestDataAsOne() {
        _suppressPPrintRequestDataAsOne = true;
    }
    public void suppressPPrintRequestHistList() {
        _suppressPPrintRequestHistList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBClassDtlByPrintStatus();
        suppressBClassDtlBySheetCollate();
        suppressBClassDtlByPrintedFlg();
        suppressBClassDtlByPrintDataType();
        suppressPPrintQueueList();
        suppressPPrintRequestBinaryList();
        suppressPPrintRequestDataAsOne();
        suppressPPrintRequestHistList();
    }
    protected void doSuppressClear() { // internal
        _suppressBClassDtlByPrintStatus = false;
        _suppressBClassDtlBySheetCollate = false;
        _suppressBClassDtlByPrintedFlg = false;
        _suppressBClassDtlByPrintDataType = false;
        _suppressPPrintQueueList = false;
        _suppressPPrintRequestBinaryList = false;
        _suppressPPrintRequestDataAsOne = false;
        _suppressPPrintRequestHistList = false;
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
    public PPrintRequestDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrintRequestDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrintRequestDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrintRequestDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrintRequestDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrintRequestDtoMapper)this;
    }
}

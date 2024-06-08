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
 * The DTO mapper of M_IMPORT_TYPE as TABLE. <br>
 * 取込種別マスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_ID
 *
 * [column]
 *     IMPORT_TYPE_ID, CLIENT_ID, IMPORT_TYPE_CD, IMPORT_TYPE_NM, EDI_ID, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DUPLICATE_COLUMN_NM, RCV_ID_COLUMN_NM, ROW_NO_COLUMN_NM, GIFT_STATEMENT_TYPE, GIFT_STATEMENT_DETAIL, O_KEEPING_DAYS, STATEMENT_TITLE, STATEMENT_URL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_EDI, B_CLASS_DTL(ByGiftStatementType)
 *
 * [referrer-table]
 *     M_IMPORT_TYPE_B, T_EC_ORDER_H
 *
 * [foreign-property]
 *     mClient, mEdi, bClassDtlByGiftStatementType, bClassDtlByLineFeedCd, bClassDtlByUploadTableNm
 *
 * [referrer-property]
 *     mImportTypeBList, tEcOrderHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMImportTypeDtoMapper implements DtoMapper<MImportType, MImportTypeDto>, Serializable {

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
    protected boolean _suppressMClient;
    protected boolean _suppressMEdi;
    protected boolean _suppressBClassDtlByGiftStatementType;
    protected boolean _suppressBClassDtlByLineFeedCd;
    protected boolean _suppressBClassDtlByUploadTableNm;
    protected boolean _suppressMImportTypeBList;
    protected boolean _suppressTEcOrderHList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMImportTypeDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMImportTypeDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MImportTypeDto mappingToDto(MImportType entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MImportTypeDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MImportTypeDto dto = new MImportTypeDto();
        dto.setImportTypeId(entity.getImportTypeId());
        dto.setClientId(entity.getClientId());
        dto.setImportTypeCd(entity.getImportTypeCd());
        dto.setImportTypeNm(entity.getImportTypeNm());
        dto.setEdiId(entity.getEdiId());
        dto.setCharacterCd(entity.getCharacterCd());
        dto.setLineFeedCd(entity.getLineFeedCd());
        dto.setDelimiter(entity.getDelimiter());
        dto.setSkippingRows(entity.getSkippingRows());
        dto.setUploadTableNm(entity.getUploadTableNm());
        dto.setDuplicateColumnNm(entity.getDuplicateColumnNm());
        dto.setRcvIdColumnNm(entity.getRcvIdColumnNm());
        dto.setRowNoColumnNm(entity.getRowNoColumnNm());
        dto.setGiftStatementType(entity.getGiftStatementType());
        dto.setGiftStatementDetail(entity.getGiftStatementDetail());
        dto.setOKeepingDays(entity.getOKeepingDays());
        dto.setStatementTitle(entity.getStatementTitle());
        dto.setStatementUrl(entity.getStatementUrl());
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
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMEdi && entity.getMEdi() != null) {
            MEdi relationEntity = entity.getMEdi();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MEdiDto relationDto = (MEdiDto)cachedDto;
                dto.setMEdi(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeList().add(dto);
                }
            } else {
                MEdiDtoMapper mapper = new MEdiDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeList();
                MEdiDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMEdi(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMEdi());
                }
            }
        };
        if (!_suppressBClassDtlByGiftStatementType && entity.getBClassDtlByGiftStatementType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByGiftStatementType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByGiftStatementType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByGiftStatementType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByGiftStatementType());
                }
            }
        };
        if (!_suppressBClassDtlByLineFeedCd && entity.getBClassDtlByLineFeedCd() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLineFeedCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLineFeedCd(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLineFeedCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLineFeedCd());
                }
            }
        };
        if (!_suppressBClassDtlByUploadTableNm && entity.getBClassDtlByUploadTableNm() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByUploadTableNm();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByUploadTableNm(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByUploadTableNm(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByUploadTableNm());
                }
            }
        };
        if (!_suppressMImportTypeBList && !entity.getMImportTypeBList().isEmpty()) {
            MImportTypeBDtoMapper mapper = new MImportTypeBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportType();
            List<MImportTypeBDto> relationDtoList = mapper.mappingToDtoList(entity.getMImportTypeBList());
            dto.setMImportTypeBList(relationDtoList);
            if (reverseReference) {
                for (MImportTypeBDto relationDto : relationDtoList) {
                    relationDto.setMImportType(dto);
                }
            }
        };
        if (!_suppressTEcOrderHList && !entity.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportType();
            List<TEcOrderHDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderHList());
            dto.setTEcOrderHList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderHDto relationDto : relationDtoList) {
                    relationDto.setMImportType(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MImportTypeDto> mappingToDtoList(List<MImportType> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MImportTypeDto> dtoList = new ArrayList<MImportTypeDto>();
        for (MImportType entity : entityList) {
            MImportTypeDto dto = mappingToDto(entity);
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
    public MImportType mappingToEntity(MImportTypeDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MImportType)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MImportType entity = new MImportType();
        if (needsMapping(dto, dto.getImportTypeId(), "importTypeId")) {
            entity.setImportTypeId(dto.getImportTypeId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getImportTypeCd(), "importTypeCd")) {
            entity.setImportTypeCd(dto.getImportTypeCd());
        }
        if (needsMapping(dto, dto.getImportTypeNm(), "importTypeNm")) {
            entity.setImportTypeNm(dto.getImportTypeNm());
        }
        if (needsMapping(dto, dto.getEdiId(), "ediId")) {
            entity.setEdiId(dto.getEdiId());
        }
        if (needsMapping(dto, dto.getCharacterCd(), "characterCd")) {
            entity.setCharacterCd(dto.getCharacterCd());
        }
        if (needsMapping(dto, dto.getLineFeedCd(), "lineFeedCd")) {
            entity.setLineFeedCdAsLineFeedCd(CDef.LineFeedCd.codeOf(dto.getLineFeedCd()));
        }
        if (needsMapping(dto, dto.getDelimiter(), "delimiter")) {
            entity.setDelimiter(dto.getDelimiter());
        }
        if (needsMapping(dto, dto.getSkippingRows(), "skippingRows")) {
            entity.setSkippingRows(dto.getSkippingRows());
        }
        if (needsMapping(dto, dto.getUploadTableNm(), "uploadTableNm")) {
            entity.setUploadTableNmAsUploadTableNm(CDef.UploadTableNm.codeOf(dto.getUploadTableNm()));
        }
        if (needsMapping(dto, dto.getDuplicateColumnNm(), "duplicateColumnNm")) {
            entity.setDuplicateColumnNm(dto.getDuplicateColumnNm());
        }
        if (needsMapping(dto, dto.getRcvIdColumnNm(), "rcvIdColumnNm")) {
            entity.setRcvIdColumnNm(dto.getRcvIdColumnNm());
        }
        if (needsMapping(dto, dto.getRowNoColumnNm(), "rowNoColumnNm")) {
            entity.setRowNoColumnNm(dto.getRowNoColumnNm());
        }
        if (needsMapping(dto, dto.getGiftStatementType(), "giftStatementType")) {
            entity.setGiftStatementTypeAsGiftStatementType(CDef.GiftStatementType.codeOf(dto.getGiftStatementType()));
        }
        if (needsMapping(dto, dto.getGiftStatementDetail(), "giftStatementDetail")) {
            entity.setGiftStatementDetail(dto.getGiftStatementDetail());
        }
        if (needsMapping(dto, dto.getOKeepingDays(), "OKeepingDays")) {
            entity.setOKeepingDays(dto.getOKeepingDays());
        }
        if (needsMapping(dto, dto.getStatementTitle(), "statementTitle")) {
            entity.setStatementTitle(dto.getStatementTitle());
        }
        if (needsMapping(dto, dto.getStatementUrl(), "statementUrl")) {
            entity.setStatementUrl(dto.getStatementUrl());
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
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMEdi && dto.getMEdi() != null) {
            MEdiDto relationDto = dto.getMEdi();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MEdi relationEntity = (MEdi)cachedEntity;
                entity.setMEdi(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeList().add(entity);
                }
            } else {
                MEdiDtoMapper mapper = new MEdiDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeList();
                MEdi relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMEdi(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeList().add(entity);
                }
                if (instanceCache && entity.getMEdi().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMEdi());
                }
            }
        };
        if (!_suppressBClassDtlByGiftStatementType && dto.getBClassDtlByGiftStatementType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByGiftStatementType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByGiftStatementType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByGiftStatementType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByGiftStatementType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByGiftStatementType());
                }
            }
        };
        if (!_suppressBClassDtlByLineFeedCd && dto.getBClassDtlByLineFeedCd() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLineFeedCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLineFeedCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLineFeedCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLineFeedCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLineFeedCd());
                }
            }
        };
        if (!_suppressBClassDtlByUploadTableNm && dto.getBClassDtlByUploadTableNm() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByUploadTableNm();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByUploadTableNm(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByUploadTableNm(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByUploadTableNm().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByUploadTableNm());
                }
            }
        };
        if (!_suppressMImportTypeBList && !dto.getMImportTypeBList().isEmpty()) {
            MImportTypeBDtoMapper mapper = new MImportTypeBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportType();
            List<MImportTypeB> relationEntityList = mapper.mappingToEntityList(dto.getMImportTypeBList());
            entity.setMImportTypeBList(relationEntityList);
            if (reverseReference) {
                for (MImportTypeB relationEntity : relationEntityList) {
                    relationEntity.setMImportType(entity);
                }
            }
        };
        if (!_suppressTEcOrderHList && !dto.getTEcOrderHList().isEmpty()) {
            TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportType();
            List<TEcOrderH> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderHList());
            entity.setTEcOrderHList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderH relationEntity : relationEntityList) {
                    relationEntity.setMImportType(entity);
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
    protected boolean needsMapping(MImportTypeDto dto, Object value, String propName) {
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
    public List<MImportType> mappingToEntityList(List<MImportTypeDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MImportType> entityList = new ArrayList<MImportType>();
        for (MImportTypeDto dto : dtoList) {
            MImportType entity = mappingToEntity(dto);
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
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMEdi() {
        _suppressMEdi = true;
    }
    public void suppressBClassDtlByGiftStatementType() {
        _suppressBClassDtlByGiftStatementType = true;
    }
    public void suppressBClassDtlByLineFeedCd() {
        _suppressBClassDtlByLineFeedCd = true;
    }
    public void suppressBClassDtlByUploadTableNm() {
        _suppressBClassDtlByUploadTableNm = true;
    }
    public void suppressMImportTypeBList() {
        _suppressMImportTypeBList = true;
    }
    public void suppressTEcOrderHList() {
        _suppressTEcOrderHList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMClient();
        suppressMEdi();
        suppressBClassDtlByGiftStatementType();
        suppressBClassDtlByLineFeedCd();
        suppressBClassDtlByUploadTableNm();
        suppressMImportTypeBList();
        suppressTEcOrderHList();
    }
    protected void doSuppressClear() { // internal
        _suppressMClient = false;
        _suppressMEdi = false;
        _suppressBClassDtlByGiftStatementType = false;
        _suppressBClassDtlByLineFeedCd = false;
        _suppressBClassDtlByUploadTableNm = false;
        _suppressMImportTypeBList = false;
        _suppressTEcOrderHList = false;
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
    public MImportTypeDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MImportTypeDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MImportTypeDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MImportTypeDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MImportTypeDtoMapper reverseReference() {
        setReverseReference(true);
        return (MImportTypeDtoMapper)this;
    }
}

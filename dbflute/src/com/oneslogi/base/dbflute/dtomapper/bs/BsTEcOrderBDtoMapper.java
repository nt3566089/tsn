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
 * The DTO mapper of T_EC_ORDER_B as TABLE. <br>
 * EC受注ボディ
 * <pre>
 * [primary-key]
 *     EC_ORDER_B_ID
 *
 * [column]
 *     EC_ORDER_B_ID, EC_ORDER_H_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_OPTION, ORDER_NUM, UNIT_PRICE, UNIT_TOTAL_PRICE, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_EC_ORDER_H, B_CLASS_DTL(ByErrorFlg)
 *
 * [referrer-table]
 *     T_AMAZON_ORDER, T_RAKUTEN_ORDER, T_YAHOO_ORDER
 *
 * [foreign-property]
 *     tEcOrderH, bClassDtlByErrorFlg
 *
 * [referrer-property]
 *     tAmazonOrderList, tRakutenOrderList, tYahooOrderList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderBDtoMapper implements DtoMapper<TEcOrderB, TEcOrderBDto>, Serializable {

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
    protected boolean _suppressTEcOrderH;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressTAmazonOrderList;
    protected boolean _suppressTRakutenOrderList;
    protected boolean _suppressTYahooOrderList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTEcOrderBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TEcOrderBDto mappingToDto(TEcOrderB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TEcOrderBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderBDto dto = new TEcOrderBDto();
        dto.setEcOrderBId(entity.getEcOrderBId());
        dto.setEcOrderHId(entity.getEcOrderHId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductOption(entity.getProductOption());
        dto.setOrderNum(entity.getOrderNum());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setUnitTotalPrice(entity.getUnitTotalPrice());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
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
        if (!_suppressTEcOrderH && entity.getTEcOrderH() != null) {
            TEcOrderH relationEntity = entity.getTEcOrderH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TEcOrderHDto relationDto = (TEcOrderHDto)cachedDto;
                dto.setTEcOrderH(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderBList().add(dto);
                }
            } else {
                TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderBList();
                TEcOrderHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderH(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTEcOrderH());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && entity.getBClassDtlByErrorFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByErrorFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressTAmazonOrderList && !entity.getTAmazonOrderList().isEmpty()) {
            TAmazonOrderDtoMapper mapper = new TAmazonOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TAmazonOrderDto> relationDtoList = mapper.mappingToDtoList(entity.getTAmazonOrderList());
            dto.setTAmazonOrderList(relationDtoList);
            if (reverseReference) {
                for (TAmazonOrderDto relationDto : relationDtoList) {
                    relationDto.setTEcOrderB(dto);
                }
            }
        };
        if (!_suppressTRakutenOrderList && !entity.getTRakutenOrderList().isEmpty()) {
            TRakutenOrderDtoMapper mapper = new TRakutenOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TRakutenOrderDto> relationDtoList = mapper.mappingToDtoList(entity.getTRakutenOrderList());
            dto.setTRakutenOrderList(relationDtoList);
            if (reverseReference) {
                for (TRakutenOrderDto relationDto : relationDtoList) {
                    relationDto.setTEcOrderB(dto);
                }
            }
        };
        if (!_suppressTYahooOrderList && !entity.getTYahooOrderList().isEmpty()) {
            TYahooOrderDtoMapper mapper = new TYahooOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TYahooOrderDto> relationDtoList = mapper.mappingToDtoList(entity.getTYahooOrderList());
            dto.setTYahooOrderList(relationDtoList);
            if (reverseReference) {
                for (TYahooOrderDto relationDto : relationDtoList) {
                    relationDto.setTEcOrderB(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TEcOrderBDto> mappingToDtoList(List<TEcOrderB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TEcOrderBDto> dtoList = new ArrayList<TEcOrderBDto>();
        for (TEcOrderB entity : entityList) {
            TEcOrderBDto dto = mappingToDto(entity);
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
    public TEcOrderB mappingToEntity(TEcOrderBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TEcOrderB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderB entity = new TEcOrderB();
        if (needsMapping(dto, dto.getEcOrderBId(), "ecOrderBId")) {
            entity.setEcOrderBId(dto.getEcOrderBId());
        }
        if (needsMapping(dto, dto.getEcOrderHId(), "ecOrderHId")) {
            entity.setEcOrderHId(dto.getEcOrderHId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getProductOption(), "productOption")) {
            entity.setProductOption(dto.getProductOption());
        }
        if (needsMapping(dto, dto.getOrderNum(), "orderNum")) {
            entity.setOrderNum(dto.getOrderNum());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getUnitTotalPrice(), "unitTotalPrice")) {
            entity.setUnitTotalPrice(dto.getUnitTotalPrice());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
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
        if (!_suppressTEcOrderH && dto.getTEcOrderH() != null) {
            TEcOrderHDto relationDto = dto.getTEcOrderH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TEcOrderH relationEntity = (TEcOrderH)cachedEntity;
                entity.setTEcOrderH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderBList().add(entity);
                }
            } else {
                TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderBList();
                TEcOrderH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderBList().add(entity);
                }
                if (instanceCache && entity.getTEcOrderH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTEcOrderH());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && dto.getBClassDtlByErrorFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByErrorFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByErrorFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressTAmazonOrderList && !dto.getTAmazonOrderList().isEmpty()) {
            TAmazonOrderDtoMapper mapper = new TAmazonOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TAmazonOrder> relationEntityList = mapper.mappingToEntityList(dto.getTAmazonOrderList());
            entity.setTAmazonOrderList(relationEntityList);
            if (reverseReference) {
                for (TAmazonOrder relationEntity : relationEntityList) {
                    relationEntity.setTEcOrderB(entity);
                }
            }
        };
        if (!_suppressTRakutenOrderList && !dto.getTRakutenOrderList().isEmpty()) {
            TRakutenOrderDtoMapper mapper = new TRakutenOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TRakutenOrder> relationEntityList = mapper.mappingToEntityList(dto.getTRakutenOrderList());
            entity.setTRakutenOrderList(relationEntityList);
            if (reverseReference) {
                for (TRakutenOrder relationEntity : relationEntityList) {
                    relationEntity.setTEcOrderB(entity);
                }
            }
        };
        if (!_suppressTYahooOrderList && !dto.getTYahooOrderList().isEmpty()) {
            TYahooOrderDtoMapper mapper = new TYahooOrderDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderB();
            List<TYahooOrder> relationEntityList = mapper.mappingToEntityList(dto.getTYahooOrderList());
            entity.setTYahooOrderList(relationEntityList);
            if (reverseReference) {
                for (TYahooOrder relationEntity : relationEntityList) {
                    relationEntity.setTEcOrderB(entity);
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
    protected boolean needsMapping(TEcOrderBDto dto, Object value, String propName) {
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
    public List<TEcOrderB> mappingToEntityList(List<TEcOrderBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TEcOrderB> entityList = new ArrayList<TEcOrderB>();
        for (TEcOrderBDto dto : dtoList) {
            TEcOrderB entity = mappingToEntity(dto);
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
    public void suppressTEcOrderH() {
        _suppressTEcOrderH = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressTAmazonOrderList() {
        _suppressTAmazonOrderList = true;
    }
    public void suppressTRakutenOrderList() {
        _suppressTRakutenOrderList = true;
    }
    public void suppressTYahooOrderList() {
        _suppressTYahooOrderList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTEcOrderH();
        suppressBClassDtlByErrorFlg();
        suppressTAmazonOrderList();
        suppressTRakutenOrderList();
        suppressTYahooOrderList();
    }
    protected void doSuppressClear() { // internal
        _suppressTEcOrderH = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressTAmazonOrderList = false;
        _suppressTRakutenOrderList = false;
        _suppressTYahooOrderList = false;
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
    public TEcOrderBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TEcOrderBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TEcOrderBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TEcOrderBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TEcOrderBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TEcOrderBDtoMapper)this;
    }
}

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
 * The DTO mapper of T_EC_ORDER_R as TABLE. <br>
 * EC受注帳票
 * <pre>
 * [primary-key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, STATEMENT_OUT_FLG, STATEMENT_OUT_USER_ID, STATEMENT_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_USER, T_EC_ORDER_H, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUser, tEcOrderH, bClassDtlByInvoiceCreateFlg, bClassDtlByStatementOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderRDtoMapper implements DtoMapper<TEcOrderR, TEcOrderRDto>, Serializable {

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
    protected boolean _suppressBUser;
    protected boolean _suppressTEcOrderH;
    protected boolean _suppressBClassDtlByInvoiceCreateFlg;
    protected boolean _suppressBClassDtlByStatementOutFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderRDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTEcOrderRDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TEcOrderRDto mappingToDto(TEcOrderR entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TEcOrderRDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderRDto dto = new TEcOrderRDto();
        dto.setEcOrderHId(entity.getEcOrderHId());
        dto.setStatementOutFlg(entity.getStatementOutFlg());
        dto.setStatementOutUserId(entity.getStatementOutUserId());
        dto.setStatementOutDt(entity.getStatementOutDt());
        dto.setInvoiceCreateFlg(entity.getInvoiceCreateFlg());
        dto.setInvoiceCreateDt(entity.getInvoiceCreateDt());
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
        if (!_suppressBUser && entity.getBUser() != null) {
            BUser relationEntity = entity.getBUser();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUser(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderRList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderRList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUser(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderRList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUser());
                }
            }
        };
        if (!_suppressTEcOrderH && entity.getTEcOrderH() != null) {
            TEcOrderH relationEntity = entity.getTEcOrderH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TEcOrderHDto relationDto = (TEcOrderHDto)cachedDto;
                dto.setTEcOrderH(relationDto);
                if (reverseReference) {
                    relationDto.setTEcOrderRAsOne(dto);
                }
            } else {
                TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderRAsOne();
                TEcOrderHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderH(relationDto);
                if (reverseReference) {
                    relationDto.setTEcOrderRAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTEcOrderH());
                }
            }
        };
        if (!_suppressBClassDtlByInvoiceCreateFlg && entity.getBClassDtlByInvoiceCreateFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInvoiceCreateFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInvoiceCreateFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInvoiceCreateFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInvoiceCreateFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStatementOutFlg && entity.getBClassDtlByStatementOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStatementOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStatementOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStatementOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStatementOutFlg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TEcOrderRDto> mappingToDtoList(List<TEcOrderR> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TEcOrderRDto> dtoList = new ArrayList<TEcOrderRDto>();
        for (TEcOrderR entity : entityList) {
            TEcOrderRDto dto = mappingToDto(entity);
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
    public TEcOrderR mappingToEntity(TEcOrderRDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TEcOrderR)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderR entity = new TEcOrderR();
        if (needsMapping(dto, dto.getEcOrderHId(), "ecOrderHId")) {
            entity.setEcOrderHId(dto.getEcOrderHId());
        }
        if (needsMapping(dto, dto.getStatementOutFlg(), "statementOutFlg")) {
            entity.setStatementOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getStatementOutFlg()));
        }
        if (needsMapping(dto, dto.getStatementOutUserId(), "statementOutUserId")) {
            entity.setStatementOutUserId(dto.getStatementOutUserId());
        }
        if (needsMapping(dto, dto.getStatementOutDt(), "statementOutDt")) {
            entity.setStatementOutDt(dto.getStatementOutDt());
        }
        if (needsMapping(dto, dto.getInvoiceCreateFlg(), "invoiceCreateFlg")) {
            entity.setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.codeOf(dto.getInvoiceCreateFlg()));
        }
        if (needsMapping(dto, dto.getInvoiceCreateDt(), "invoiceCreateDt")) {
            entity.setInvoiceCreateDt(dto.getInvoiceCreateDt());
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
        if (!_suppressBUser && dto.getBUser() != null) {
            BUserDto relationDto = dto.getBUser();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderRList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderRList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderRList().add(entity);
                }
                if (instanceCache && entity.getBUser().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUser());
                }
            }
        };
        if (!_suppressTEcOrderH && dto.getTEcOrderH() != null) {
            TEcOrderHDto relationDto = dto.getTEcOrderH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TEcOrderH relationEntity = (TEcOrderH)cachedEntity;
                entity.setTEcOrderH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTEcOrderRAsOne(entity);
                }
            } else {
                TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderRAsOne();
                TEcOrderH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTEcOrderRAsOne(entity);
                }
                if (instanceCache && entity.getTEcOrderH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTEcOrderH());
                }
            }
        };
        if (!_suppressBClassDtlByInvoiceCreateFlg && dto.getBClassDtlByInvoiceCreateFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInvoiceCreateFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInvoiceCreateFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInvoiceCreateFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInvoiceCreateFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInvoiceCreateFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStatementOutFlg && dto.getBClassDtlByStatementOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStatementOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStatementOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStatementOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStatementOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStatementOutFlg());
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
    protected boolean needsMapping(TEcOrderRDto dto, Object value, String propName) {
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
    public List<TEcOrderR> mappingToEntityList(List<TEcOrderRDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TEcOrderR> entityList = new ArrayList<TEcOrderR>();
        for (TEcOrderRDto dto : dtoList) {
            TEcOrderR entity = mappingToEntity(dto);
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
    public void suppressBUser() {
        _suppressBUser = true;
    }
    public void suppressTEcOrderH() {
        _suppressTEcOrderH = true;
    }
    public void suppressBClassDtlByInvoiceCreateFlg() {
        _suppressBClassDtlByInvoiceCreateFlg = true;
    }
    public void suppressBClassDtlByStatementOutFlg() {
        _suppressBClassDtlByStatementOutFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressBUser();
        suppressTEcOrderH();
        suppressBClassDtlByInvoiceCreateFlg();
        suppressBClassDtlByStatementOutFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressBUser = false;
        _suppressTEcOrderH = false;
        _suppressBClassDtlByInvoiceCreateFlg = false;
        _suppressBClassDtlByStatementOutFlg = false;
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
    public TEcOrderRDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TEcOrderRDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TEcOrderRDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TEcOrderRDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TEcOrderRDtoMapper reverseReference() {
        setReverseReference(true);
        return (TEcOrderRDtoMapper)this;
    }
}

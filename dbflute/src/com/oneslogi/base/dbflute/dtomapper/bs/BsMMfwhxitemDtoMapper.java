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
 * The DTO mapper of M_MFWHxITEM as TABLE. <br>
 * 拠点別銘柄制御マスタ
 * <pre>
 * [primary-key]
 *     MFWH_ITEM_ID
 *
 * [column]
 *     MFWH_ITEM_ID, CLIENT_ID, CENTER_ID, PRODUCT_CD, SLOTLOCNAME, PICKLOCNAME, PHYSICALTYPE, PHYSICALCYCLE, PHYSICALGROUP, PHYSICALDATE, REORDERTYPE, REORDERINTERVAL, REORDERPOINT, REORDERQTY, REORDERLEADTIME, REORDERLASTDAY, SUPPLIERCD, REPLENISHPOINT, MAXQTY, CAUSELOC, SHIPPINGTYPE, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, PROCESSWORKINGKEY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, SERIALFLG, FULLPALLETFLG, PLSLOTLOCNAME, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWH_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT, M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mProduct, mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMMfwhxitemDtoMapper implements DtoMapper<MMfwhxitem, MMfwhxitemDto>, Serializable {

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
    protected boolean _suppressMProduct;
    protected boolean _suppressMClient;
    protected boolean _suppressMCenter;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMMfwhxitemDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMMfwhxitemDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MMfwhxitemDto mappingToDto(MMfwhxitem entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MMfwhxitemDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MMfwhxitemDto dto = new MMfwhxitemDto();
        dto.setMfwhItemId(entity.getMfwhItemId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProductCd(entity.getProductCd());
        dto.setSlotlocname(entity.getSlotlocname());
        dto.setPicklocname(entity.getPicklocname());
        dto.setPhysicaltype(entity.getPhysicaltype());
        dto.setPhysicalcycle(entity.getPhysicalcycle());
        dto.setPhysicalgroup(entity.getPhysicalgroup());
        dto.setPhysicaldate(entity.getPhysicaldate());
        dto.setReordertype(entity.getReordertype());
        dto.setReorderinterval(entity.getReorderinterval());
        dto.setReorderpoint(entity.getReorderpoint());
        dto.setReorderqty(entity.getReorderqty());
        dto.setReorderleadtime(entity.getReorderleadtime());
        dto.setReorderlastday(entity.getReorderlastday());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setReplenishpoint(entity.getReplenishpoint());
        dto.setMaxqty(entity.getMaxqty());
        dto.setCauseloc(entity.getCauseloc());
        dto.setShippingtype(entity.getShippingtype());
        dto.setSlotpolicykey(entity.getSlotpolicykey());
        dto.setInworkingkey(entity.getInworkingkey());
        dto.setOutworkingkey(entity.getOutworkingkey());
        dto.setProcessworkingkey(entity.getProcessworkingkey());
        dto.setUseruse1(entity.getUseruse1());
        dto.setUseruse2(entity.getUseruse2());
        dto.setUseruse3(entity.getUseruse3());
        dto.setUseruse4(entity.getUseruse4());
        dto.setUseruse5(entity.getUseruse5());
        dto.setSerialflg(entity.getSerialflg());
        dto.setFullpalletflg(entity.getFullpalletflg());
        dto.setPlslotlocname(entity.getPlslotlocname());
        dto.setProductId(entity.getProductId());
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
        if (!_suppressMProduct && entity.getMProduct() != null) {
            MProduct relationEntity = entity.getMProduct();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMMfwhxitemList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MMfwhxitemDto> mappingToDtoList(List<MMfwhxitem> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MMfwhxitemDto> dtoList = new ArrayList<MMfwhxitemDto>();
        for (MMfwhxitem entity : entityList) {
            MMfwhxitemDto dto = mappingToDto(entity);
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
    public MMfwhxitem mappingToEntity(MMfwhxitemDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MMfwhxitem)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MMfwhxitem entity = new MMfwhxitem();
        if (needsMapping(dto, dto.getMfwhItemId(), "mfwhItemId")) {
            entity.setMfwhItemId(dto.getMfwhItemId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getSlotlocname(), "slotlocname")) {
            entity.setSlotlocname(dto.getSlotlocname());
        }
        if (needsMapping(dto, dto.getPicklocname(), "picklocname")) {
            entity.setPicklocname(dto.getPicklocname());
        }
        if (needsMapping(dto, dto.getPhysicaltype(), "physicaltype")) {
            entity.setPhysicaltype(dto.getPhysicaltype());
        }
        if (needsMapping(dto, dto.getPhysicalcycle(), "physicalcycle")) {
            entity.setPhysicalcycle(dto.getPhysicalcycle());
        }
        if (needsMapping(dto, dto.getPhysicalgroup(), "physicalgroup")) {
            entity.setPhysicalgroup(dto.getPhysicalgroup());
        }
        if (needsMapping(dto, dto.getPhysicaldate(), "physicaldate")) {
            entity.setPhysicaldate(dto.getPhysicaldate());
        }
        if (needsMapping(dto, dto.getReordertype(), "reordertype")) {
            entity.setReordertype(dto.getReordertype());
        }
        if (needsMapping(dto, dto.getReorderinterval(), "reorderinterval")) {
            entity.setReorderinterval(dto.getReorderinterval());
        }
        if (needsMapping(dto, dto.getReorderpoint(), "reorderpoint")) {
            entity.setReorderpoint(dto.getReorderpoint());
        }
        if (needsMapping(dto, dto.getReorderqty(), "reorderqty")) {
            entity.setReorderqty(dto.getReorderqty());
        }
        if (needsMapping(dto, dto.getReorderleadtime(), "reorderleadtime")) {
            entity.setReorderleadtime(dto.getReorderleadtime());
        }
        if (needsMapping(dto, dto.getReorderlastday(), "reorderlastday")) {
            entity.setReorderlastday(dto.getReorderlastday());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getReplenishpoint(), "replenishpoint")) {
            entity.setReplenishpoint(dto.getReplenishpoint());
        }
        if (needsMapping(dto, dto.getMaxqty(), "maxqty")) {
            entity.setMaxqty(dto.getMaxqty());
        }
        if (needsMapping(dto, dto.getCauseloc(), "causeloc")) {
            entity.setCauseloc(dto.getCauseloc());
        }
        if (needsMapping(dto, dto.getShippingtype(), "shippingtype")) {
            entity.setShippingtype(dto.getShippingtype());
        }
        if (needsMapping(dto, dto.getSlotpolicykey(), "slotpolicykey")) {
            entity.setSlotpolicykey(dto.getSlotpolicykey());
        }
        if (needsMapping(dto, dto.getInworkingkey(), "inworkingkey")) {
            entity.setInworkingkey(dto.getInworkingkey());
        }
        if (needsMapping(dto, dto.getOutworkingkey(), "outworkingkey")) {
            entity.setOutworkingkey(dto.getOutworkingkey());
        }
        if (needsMapping(dto, dto.getProcessworkingkey(), "processworkingkey")) {
            entity.setProcessworkingkey(dto.getProcessworkingkey());
        }
        if (needsMapping(dto, dto.getUseruse1(), "useruse1")) {
            entity.setUseruse1(dto.getUseruse1());
        }
        if (needsMapping(dto, dto.getUseruse2(), "useruse2")) {
            entity.setUseruse2(dto.getUseruse2());
        }
        if (needsMapping(dto, dto.getUseruse3(), "useruse3")) {
            entity.setUseruse3(dto.getUseruse3());
        }
        if (needsMapping(dto, dto.getUseruse4(), "useruse4")) {
            entity.setUseruse4(dto.getUseruse4());
        }
        if (needsMapping(dto, dto.getUseruse5(), "useruse5")) {
            entity.setUseruse5(dto.getUseruse5());
        }
        if (needsMapping(dto, dto.getSerialflg(), "serialflg")) {
            entity.setSerialflg(dto.getSerialflg());
        }
        if (needsMapping(dto, dto.getFullpalletflg(), "fullpalletflg")) {
            entity.setFullpalletflg(dto.getFullpalletflg());
        }
        if (needsMapping(dto, dto.getPlslotlocname(), "plslotlocname")) {
            entity.setPlslotlocname(dto.getPlslotlocname());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
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
        if (!_suppressMProduct && dto.getMProduct() != null) {
            MProductDto relationDto = dto.getMProduct();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMMfwhxitemList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMMfwhxitemList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
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
    protected boolean needsMapping(MMfwhxitemDto dto, Object value, String propName) {
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
    public List<MMfwhxitem> mappingToEntityList(List<MMfwhxitemDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MMfwhxitem> entityList = new ArrayList<MMfwhxitem>();
        for (MMfwhxitemDto dto : dtoList) {
            MMfwhxitem entity = mappingToEntity(dto);
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
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProduct();
        suppressMClient();
        suppressMCenter();
    }
    protected void doSuppressClear() { // internal
        _suppressMProduct = false;
        _suppressMClient = false;
        _suppressMCenter = false;
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
    public MMfwhxitemDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MMfwhxitemDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MMfwhxitemDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MMfwhxitemDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MMfwhxitemDtoMapper reverseReference() {
        setReverseReference(true);
        return (MMfwhxitemDtoMapper)this;
    }
}

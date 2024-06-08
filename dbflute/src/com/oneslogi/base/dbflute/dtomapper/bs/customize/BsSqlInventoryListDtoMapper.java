package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlInventoryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_ID, CLIENT_ID, USERNUM1, INVENTORY_INST_KBN, PRODUCT_ID, INV_EXPECT_NUM, INVENTORY_NUM, STORING_SYSTEM_STOCK_NUM, SORT_SYSTEM_STOCK_NUM, SORTED_SYSTEM_INVENTORY, REMOTE_ISLAND_SYSTEM_INVENTORY, GOOD_ITEM_SYSTEM_STOCK_NUM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryListDtoMapper implements DtoMapper<SqlInventoryList, SqlInventoryListDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlInventoryListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlInventoryListDto mappingToDto(SqlInventoryList entity) {
        if (entity == null) {
            return null;
        }
        SqlInventoryListDto dto = new SqlInventoryListDto();
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setUsernum1(entity.getUsernum1());
        dto.setInventoryInstKbn(entity.getInventoryInstKbn());
        dto.setProductId(entity.getProductId());
        dto.setInvExpectNum(entity.getInvExpectNum());
        dto.setInventoryNum(entity.getInventoryNum());
        dto.setStoringSystemStockNum(entity.getStoringSystemStockNum());
        dto.setSortSystemStockNum(entity.getSortSystemStockNum());
        dto.setSortedSystemInventory(entity.getSortedSystemInventory());
        dto.setRemoteIslandSystemInventory(entity.getRemoteIslandSystemInventory());
        dto.setGoodItemSystemStockNum(entity.getGoodItemSystemStockNum());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlInventoryListDto> mappingToDtoList(List<SqlInventoryList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlInventoryListDto> dtoList = new ArrayList<SqlInventoryListDto>();
        for (SqlInventoryList entity : entityList) {
            SqlInventoryListDto dto = mappingToDto(entity);
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
    public SqlInventoryList mappingToEntity(SqlInventoryListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlInventoryList entity = new SqlInventoryList();
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getUsernum1(), "usernum1")) {
            entity.setUsernum1(dto.getUsernum1());
        }
        if (needsMapping(dto, dto.getInventoryInstKbn(), "inventoryInstKbn")) {
            entity.setInventoryInstKbn(dto.getInventoryInstKbn());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getInvExpectNum(), "invExpectNum")) {
            entity.setInvExpectNum(dto.getInvExpectNum());
        }
        if (needsMapping(dto, dto.getInventoryNum(), "inventoryNum")) {
            entity.setInventoryNum(dto.getInventoryNum());
        }
        if (needsMapping(dto, dto.getStoringSystemStockNum(), "storingSystemStockNum")) {
            entity.setStoringSystemStockNum(dto.getStoringSystemStockNum());
        }
        if (needsMapping(dto, dto.getSortSystemStockNum(), "sortSystemStockNum")) {
            entity.setSortSystemStockNum(dto.getSortSystemStockNum());
        }
        if (needsMapping(dto, dto.getSortedSystemInventory(), "sortedSystemInventory")) {
            entity.setSortedSystemInventory(dto.getSortedSystemInventory());
        }
        if (needsMapping(dto, dto.getRemoteIslandSystemInventory(), "remoteIslandSystemInventory")) {
            entity.setRemoteIslandSystemInventory(dto.getRemoteIslandSystemInventory());
        }
        if (needsMapping(dto, dto.getGoodItemSystemStockNum(), "goodItemSystemStockNum")) {
            entity.setGoodItemSystemStockNum(dto.getGoodItemSystemStockNum());
        }
        reflectDerivedProperty(entity, dto, false);
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
    protected boolean needsMapping(SqlInventoryListDto dto, Object value, String propName) {
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
    public List<SqlInventoryList> mappingToEntityList(List<SqlInventoryListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlInventoryList> entityList = new ArrayList<SqlInventoryList>();
        for (SqlInventoryListDto dto : dtoList) {
            SqlInventoryList entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
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
    public SqlInventoryListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlInventoryListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlInventoryListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlInventoryListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlInventoryListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlInventoryListDtoMapper)this;
    }
}

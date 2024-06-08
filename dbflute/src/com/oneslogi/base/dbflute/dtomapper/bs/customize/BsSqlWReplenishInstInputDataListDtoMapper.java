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
 * The DTO mapper of SqlWReplenishInstInputDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLEXLNS_NO, SCH_DATE, SUPPLIER_CD, RCV_DATE, SHIP_CD, ITEM_CD, MANUFACTURE_DATE, DESIGN_CD, QTY, FLEX_UPD_USER_CD, REPLENISH_INST_INPUT_ID, VERSION_NO, OTHERCD1, OTHERCD2
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlWReplenishInstInputDataListDtoMapper implements DtoMapper<SqlWReplenishInstInputDataList, SqlWReplenishInstInputDataListDto>, Serializable {

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
    public BsSqlWReplenishInstInputDataListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlWReplenishInstInputDataListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlWReplenishInstInputDataListDto mappingToDto(SqlWReplenishInstInputDataList entity) {
        if (entity == null) {
            return null;
        }
        SqlWReplenishInstInputDataListDto dto = new SqlWReplenishInstInputDataListDto();
        dto.setFlexlnsNo(entity.getFlexlnsNo());
        dto.setSchDate(entity.getSchDate());
        dto.setSupplierCd(entity.getSupplierCd());
        dto.setRcvDate(entity.getRcvDate());
        dto.setShipCd(entity.getShipCd());
        dto.setItemCd(entity.getItemCd());
        dto.setManufactureDate(entity.getManufactureDate());
        dto.setDesignCd(entity.getDesignCd());
        dto.setQty(entity.getQty());
        dto.setFlexUpdUserCd(entity.getFlexUpdUserCd());
        dto.setReplenishInstInputId(entity.getReplenishInstInputId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setOthercd1(entity.getOthercd1());
        dto.setOthercd2(entity.getOthercd2());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlWReplenishInstInputDataListDto> mappingToDtoList(List<SqlWReplenishInstInputDataList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlWReplenishInstInputDataListDto> dtoList = new ArrayList<SqlWReplenishInstInputDataListDto>();
        for (SqlWReplenishInstInputDataList entity : entityList) {
            SqlWReplenishInstInputDataListDto dto = mappingToDto(entity);
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
    public SqlWReplenishInstInputDataList mappingToEntity(SqlWReplenishInstInputDataListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlWReplenishInstInputDataList entity = new SqlWReplenishInstInputDataList();
        if (needsMapping(dto, dto.getFlexlnsNo(), "flexlnsNo")) {
            entity.setFlexlnsNo(dto.getFlexlnsNo());
        }
        if (needsMapping(dto, dto.getSchDate(), "schDate")) {
            entity.setSchDate(dto.getSchDate());
        }
        if (needsMapping(dto, dto.getSupplierCd(), "supplierCd")) {
            entity.setSupplierCd(dto.getSupplierCd());
        }
        if (needsMapping(dto, dto.getRcvDate(), "rcvDate")) {
            entity.setRcvDate(dto.getRcvDate());
        }
        if (needsMapping(dto, dto.getShipCd(), "shipCd")) {
            entity.setShipCd(dto.getShipCd());
        }
        if (needsMapping(dto, dto.getItemCd(), "itemCd")) {
            entity.setItemCd(dto.getItemCd());
        }
        if (needsMapping(dto, dto.getManufactureDate(), "manufactureDate")) {
            entity.setManufactureDate(dto.getManufactureDate());
        }
        if (needsMapping(dto, dto.getDesignCd(), "designCd")) {
            entity.setDesignCd(dto.getDesignCd());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
        }
        if (needsMapping(dto, dto.getFlexUpdUserCd(), "flexUpdUserCd")) {
            entity.setFlexUpdUserCd(dto.getFlexUpdUserCd());
        }
        if (needsMapping(dto, dto.getReplenishInstInputId(), "replenishInstInputId")) {
            entity.setReplenishInstInputId(dto.getReplenishInstInputId());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getOthercd1(), "othercd1")) {
            entity.setOthercd1(dto.getOthercd1());
        }
        if (needsMapping(dto, dto.getOthercd2(), "othercd2")) {
            entity.setOthercd2(dto.getOthercd2());
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
    protected boolean needsMapping(SqlWReplenishInstInputDataListDto dto, Object value, String propName) {
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
    public List<SqlWReplenishInstInputDataList> mappingToEntityList(List<SqlWReplenishInstInputDataListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlWReplenishInstInputDataList> entityList = new ArrayList<SqlWReplenishInstInputDataList>();
        for (SqlWReplenishInstInputDataListDto dto : dtoList) {
            SqlWReplenishInstInputDataList entity = mappingToEntity(dto);
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
    public SqlWReplenishInstInputDataListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlWReplenishInstInputDataListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlWReplenishInstInputDataListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlWReplenishInstInputDataListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlWReplenishInstInputDataListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlWReplenishInstInputDataListDtoMapper)this;
    }
}

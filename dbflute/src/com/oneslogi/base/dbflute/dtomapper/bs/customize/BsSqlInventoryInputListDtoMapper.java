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
 * The DTO mapper of SqlInventoryInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, VERSION_NO, INVENTORY_INST_KBN, LOCATION_GRP, CGGDID, INSTRUCTION_KEY, INVENTORY_DT, ADD_DT, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, JAN_CD, PRODUCT_NM, FIRM_TRANSPORT_CD, UNIT_NUM_BREAKDOWN, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_BEFORE_BREAKDOWN, INVENTORY_NUM, INVENTORY_NUM_OLD, INVENTORY_ITEMS, DIFFERENCE_NUM, DIFFERENCE_ITEMS, NO_SHIPPING_FLG, UPD_DT, CENTER_CD, CENTER_NM, P_QTY, UNIT1, UNIT2, USERNUM4, INVENTORY_PARCENT, INVENTORY_INPUT_FLG
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
public abstract class BsSqlInventoryInputListDtoMapper implements DtoMapper<SqlInventoryInputList, SqlInventoryInputListDto>, Serializable {

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
    public BsSqlInventoryInputListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlInventoryInputListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlInventoryInputListDto mappingToDto(SqlInventoryInputList entity) {
        if (entity == null) {
            return null;
        }
        SqlInventoryInputListDto dto = new SqlInventoryInputListDto();
        dto.setInventoryBId(entity.getInventoryBId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setInventoryInstKbn(entity.getInventoryInstKbn());
        dto.setLocationGrp(entity.getLocationGrp());
        dto.setCggdid(entity.getCggdid());
        dto.setInstructionKey(entity.getInstructionKey());
        dto.setInventoryDt(entity.getInventoryDt());
        dto.setAddDt(entity.getAddDt());
        dto.setLineBlock(entity.getLineBlock());
        dto.setDirectionalPiston(entity.getDirectionalPiston());
        dto.setSortingOrder(entity.getSortingOrder());
        dto.setSortingNumTimes(entity.getSortingNumTimes());
        dto.setLocationCd(entity.getLocationCd());
        dto.setProductCd(entity.getProductCd());
        dto.setJanCd(entity.getJanCd());
        dto.setProductNm(entity.getProductNm());
        dto.setFirmTransportCd(entity.getFirmTransportCd());
        dto.setUnitNumBreakdown(entity.getUnitNumBreakdown());
        dto.setChargeNum(entity.getChargeNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setMoveNum(entity.getMoveNum());
        dto.setInventoryBeforeBreakdown(entity.getInventoryBeforeBreakdown());
        dto.setInventoryNum(entity.getInventoryNum());
        dto.setInventoryNumOld(entity.getInventoryNumOld());
        dto.setInventoryItems(entity.getInventoryItems());
        dto.setDifferenceNum(entity.getDifferenceNum());
        dto.setDifferenceItems(entity.getDifferenceItems());
        dto.setNoShippingFlg(entity.getNoShippingFlg());
        dto.setUpdDt(entity.getUpdDt());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setPQty(entity.getPQty());
        dto.setUnit1(entity.getUnit1());
        dto.setUnit2(entity.getUnit2());
        dto.setUsernum4(entity.getUsernum4());
        dto.setInventoryParcent(entity.getInventoryParcent());
        dto.setInventoryInputFlg(entity.getInventoryInputFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlInventoryInputListDto> mappingToDtoList(List<SqlInventoryInputList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlInventoryInputListDto> dtoList = new ArrayList<SqlInventoryInputListDto>();
        for (SqlInventoryInputList entity : entityList) {
            SqlInventoryInputListDto dto = mappingToDto(entity);
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
    public SqlInventoryInputList mappingToEntity(SqlInventoryInputListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlInventoryInputList entity = new SqlInventoryInputList();
        if (needsMapping(dto, dto.getInventoryBId(), "inventoryBId")) {
            entity.setInventoryBId(dto.getInventoryBId());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getInventoryInstKbn(), "inventoryInstKbn")) {
            entity.setInventoryInstKbn(dto.getInventoryInstKbn());
        }
        if (needsMapping(dto, dto.getLocationGrp(), "locationGrp")) {
            entity.setLocationGrp(dto.getLocationGrp());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getInstructionKey(), "instructionKey")) {
            entity.setInstructionKey(dto.getInstructionKey());
        }
        if (needsMapping(dto, dto.getInventoryDt(), "inventoryDt")) {
            entity.setInventoryDt(dto.getInventoryDt());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt")) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getDirectionalPiston(), "directionalPiston")) {
            entity.setDirectionalPiston(dto.getDirectionalPiston());
        }
        if (needsMapping(dto, dto.getSortingOrder(), "sortingOrder")) {
            entity.setSortingOrder(dto.getSortingOrder());
        }
        if (needsMapping(dto, dto.getSortingNumTimes(), "sortingNumTimes")) {
            entity.setSortingNumTimes(dto.getSortingNumTimes());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getFirmTransportCd(), "firmTransportCd")) {
            entity.setFirmTransportCd(dto.getFirmTransportCd());
        }
        if (needsMapping(dto, dto.getUnitNumBreakdown(), "unitNumBreakdown")) {
            entity.setUnitNumBreakdown(dto.getUnitNumBreakdown());
        }
        if (needsMapping(dto, dto.getChargeNum(), "chargeNum")) {
            entity.setChargeNum(dto.getChargeNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getMoveNum(), "moveNum")) {
            entity.setMoveNum(dto.getMoveNum());
        }
        if (needsMapping(dto, dto.getInventoryBeforeBreakdown(), "inventoryBeforeBreakdown")) {
            entity.setInventoryBeforeBreakdown(dto.getInventoryBeforeBreakdown());
        }
        if (needsMapping(dto, dto.getInventoryNum(), "inventoryNum")) {
            entity.setInventoryNum(dto.getInventoryNum());
        }
        if (needsMapping(dto, dto.getInventoryNumOld(), "inventoryNumOld")) {
            entity.setInventoryNumOld(dto.getInventoryNumOld());
        }
        if (needsMapping(dto, dto.getInventoryItems(), "inventoryItems")) {
            entity.setInventoryItems(dto.getInventoryItems());
        }
        if (needsMapping(dto, dto.getDifferenceNum(), "differenceNum")) {
            entity.setDifferenceNum(dto.getDifferenceNum());
        }
        if (needsMapping(dto, dto.getDifferenceItems(), "differenceItems")) {
            entity.setDifferenceItems(dto.getDifferenceItems());
        }
        if (needsMapping(dto, dto.getNoShippingFlg(), "noShippingFlg")) {
            entity.setNoShippingFlg(dto.getNoShippingFlg());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getPQty(), "PQty")) {
            entity.setPQty(dto.getPQty());
        }
        if (needsMapping(dto, dto.getUnit1(), "unit1")) {
            entity.setUnit1(dto.getUnit1());
        }
        if (needsMapping(dto, dto.getUnit2(), "unit2")) {
            entity.setUnit2(dto.getUnit2());
        }
        if (needsMapping(dto, dto.getUsernum4(), "usernum4")) {
            entity.setUsernum4(dto.getUsernum4());
        }
        if (needsMapping(dto, dto.getInventoryParcent(), "inventoryParcent")) {
            entity.setInventoryParcent(dto.getInventoryParcent());
        }
        if (needsMapping(dto, dto.getInventoryInputFlg(), "inventoryInputFlg")) {
            entity.setInventoryInputFlg(dto.getInventoryInputFlg());
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
    protected boolean needsMapping(SqlInventoryInputListDto dto, Object value, String propName) {
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
    public List<SqlInventoryInputList> mappingToEntityList(List<SqlInventoryInputListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlInventoryInputList> entityList = new ArrayList<SqlInventoryInputList>();
        for (SqlInventoryInputListDto dto : dtoList) {
            SqlInventoryInputList entity = mappingToEntity(dto);
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
    public SqlInventoryInputListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlInventoryInputListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlInventoryInputListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlInventoryInputListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlInventoryInputListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlInventoryInputListDtoMapper)this;
    }
}

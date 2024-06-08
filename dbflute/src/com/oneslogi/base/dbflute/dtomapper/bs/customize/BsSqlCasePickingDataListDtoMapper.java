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
 * The DTO mapper of SqlCasePickingDataList. <br>
 * <pre>
 * [primary-key]
 *     product_id
 *
 * [column]
 *     center_id, case_picking_no, stock_id, product_cd, product_nm, jan_cd, location_cd, location_nm, sum_picking_num, picking_work_no, warehouse_nm, client_cd, client_nm, center_cd, center_nm, warehouse_cd, work_dt, picking_batch_no, zone_picking_order, zone_cd, zone_nm, location_picking_order, limit_dt, lot, store_label_no, store_dt, client_id, stock_type_cd, stock_type_nm, product_id
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
public abstract class BsSqlCasePickingDataListDtoMapper implements DtoMapper<SqlCasePickingDataList, SqlCasePickingDataListDto>, Serializable {

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
    public BsSqlCasePickingDataListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlCasePickingDataListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlCasePickingDataListDto mappingToDto(SqlCasePickingDataList entity) {
        if (entity == null) {
            return null;
        }
        SqlCasePickingDataListDto dto = new SqlCasePickingDataListDto();
        dto.setCenterId(entity.getCenterId());
        dto.setCasePickingNo(entity.getCasePickingNo());
        dto.setStockId(entity.getStockId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setJanCd(entity.getJanCd());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocationNm(entity.getLocationNm());
        dto.setSumPickingNum(entity.getSumPickingNum());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setWarehouseNm(entity.getWarehouseNm());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setWorkDt(entity.getWorkDt());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setZonePickingOrder(entity.getZonePickingOrder());
        dto.setZoneCd(entity.getZoneCd());
        dto.setZoneNm(entity.getZoneNm());
        dto.setLocationPickingOrder(entity.getLocationPickingOrder());
        dto.setLimitDt(entity.getLimitDt());
        dto.setLot(entity.getLot());
        dto.setStoreLabelNo(entity.getStoreLabelNo());
        dto.setStoreDt(entity.getStoreDt());
        dto.setClientId(entity.getClientId());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setStockTypeNm(entity.getStockTypeNm());
        dto.setProductId(entity.getProductId());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlCasePickingDataListDto> mappingToDtoList(List<SqlCasePickingDataList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlCasePickingDataListDto> dtoList = new ArrayList<SqlCasePickingDataListDto>();
        for (SqlCasePickingDataList entity : entityList) {
            SqlCasePickingDataListDto dto = mappingToDto(entity);
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
    public SqlCasePickingDataList mappingToEntity(SqlCasePickingDataListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlCasePickingDataList entity = new SqlCasePickingDataList();
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCasePickingNo(), "casePickingNo")) {
            entity.setCasePickingNo(dto.getCasePickingNo());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getSumPickingNum(), "sumPickingNum")) {
            entity.setSumPickingNum(dto.getSumPickingNum());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getWarehouseNm(), "warehouseNm")) {
            entity.setWarehouseNm(dto.getWarehouseNm());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
        }
        if (needsMapping(dto, dto.getZonePickingOrder(), "zonePickingOrder")) {
            entity.setZonePickingOrder(dto.getZonePickingOrder());
        }
        if (needsMapping(dto, dto.getZoneCd(), "zoneCd")) {
            entity.setZoneCd(dto.getZoneCd());
        }
        if (needsMapping(dto, dto.getZoneNm(), "zoneNm")) {
            entity.setZoneNm(dto.getZoneNm());
        }
        if (needsMapping(dto, dto.getLocationPickingOrder(), "locationPickingOrder")) {
            entity.setLocationPickingOrder(dto.getLocationPickingOrder());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getStoreLabelNo(), "storeLabelNo")) {
            entity.setStoreLabelNo(dto.getStoreLabelNo());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getStockTypeNm(), "stockTypeNm")) {
            entity.setStockTypeNm(dto.getStockTypeNm());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
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
    protected boolean needsMapping(SqlCasePickingDataListDto dto, Object value, String propName) {
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
    public List<SqlCasePickingDataList> mappingToEntityList(List<SqlCasePickingDataListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlCasePickingDataList> entityList = new ArrayList<SqlCasePickingDataList>();
        for (SqlCasePickingDataListDto dto : dtoList) {
            SqlCasePickingDataList entity = mappingToEntity(dto);
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
    public SqlCasePickingDataListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlCasePickingDataListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlCasePickingDataListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlCasePickingDataListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlCasePickingDataListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlCasePickingDataListDtoMapper)this;
    }
}

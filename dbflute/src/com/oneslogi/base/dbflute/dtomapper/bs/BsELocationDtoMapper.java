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
 * The DTO mapper of E_LOCATION as TABLE. <br>
 * ロケーションマスタ受信
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, LOCATION_CD, LOCATION_NM, WAREHOUSE_CD, ZONE_CD, LOCATION_TYPE, PICKING_LOCATION_FLG, ALLOC_NG_FLG, PICKING_ORDER, ALLOC_ORDER, CLIENT_CD, REPLENISH_PRODUCT_CD, REPLENISH_STOCK_TYPE_CD, REPLENISH_DEPOSIT_CD, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_CD, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
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
public abstract class BsELocationDtoMapper implements DtoMapper<ELocation, ELocationDto>, Serializable {

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
    public BsELocationDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsELocationDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ELocationDto mappingToDto(ELocation entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ELocationDto dto = new ELocationDto();
        dto.setLocationId(entity.getLocationId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setCenterCd(entity.getCenterCd());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocationNm(entity.getLocationNm());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setZoneCd(entity.getZoneCd());
        dto.setLocationType(entity.getLocationType());
        dto.setPickingLocationFlg(entity.getPickingLocationFlg());
        dto.setAllocNgFlg(entity.getAllocNgFlg());
        dto.setPickingOrder(entity.getPickingOrder());
        dto.setAllocOrder(entity.getAllocOrder());
        dto.setClientCd(entity.getClientCd());
        dto.setReplenishProductCd(entity.getReplenishProductCd());
        dto.setReplenishStockTypeCd(entity.getReplenishStockTypeCd());
        dto.setReplenishDepositCd(entity.getReplenishDepositCd());
        dto.setReplenishPNum(entity.getReplenishPNum());
        dto.setReplenishPProductShapeCd(entity.getReplenishPProductShapeCd());
        dto.setMaxStoreNum(entity.getMaxStoreNum());
        dto.setMaxStoreProductShapeCd(entity.getMaxStoreProductShapeCd());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ELocationDto> mappingToDtoList(List<ELocation> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ELocationDto> dtoList = new ArrayList<ELocationDto>();
        for (ELocation entity : entityList) {
            ELocationDto dto = mappingToDto(entity);
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
    public ELocation mappingToEntity(ELocationDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ELocation entity = new ELocation();
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getZoneCd(), "zoneCd")) {
            entity.setZoneCd(dto.getZoneCd());
        }
        if (needsMapping(dto, dto.getLocationType(), "locationType")) {
            entity.setLocationType(dto.getLocationType());
        }
        if (needsMapping(dto, dto.getPickingLocationFlg(), "pickingLocationFlg")) {
            entity.setPickingLocationFlg(dto.getPickingLocationFlg());
        }
        if (needsMapping(dto, dto.getAllocNgFlg(), "allocNgFlg")) {
            entity.setAllocNgFlg(dto.getAllocNgFlg());
        }
        if (needsMapping(dto, dto.getPickingOrder(), "pickingOrder")) {
            entity.setPickingOrder(dto.getPickingOrder());
        }
        if (needsMapping(dto, dto.getAllocOrder(), "allocOrder")) {
            entity.setAllocOrder(dto.getAllocOrder());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getReplenishProductCd(), "replenishProductCd")) {
            entity.setReplenishProductCd(dto.getReplenishProductCd());
        }
        if (needsMapping(dto, dto.getReplenishStockTypeCd(), "replenishStockTypeCd")) {
            entity.setReplenishStockTypeCd(dto.getReplenishStockTypeCd());
        }
        if (needsMapping(dto, dto.getReplenishDepositCd(), "replenishDepositCd")) {
            entity.setReplenishDepositCd(dto.getReplenishDepositCd());
        }
        if (needsMapping(dto, dto.getReplenishPNum(), "replenishPNum")) {
            entity.setReplenishPNum(dto.getReplenishPNum());
        }
        if (needsMapping(dto, dto.getReplenishPProductShapeCd(), "replenishPProductShapeCd")) {
            entity.setReplenishPProductShapeCd(dto.getReplenishPProductShapeCd());
        }
        if (needsMapping(dto, dto.getMaxStoreNum(), "maxStoreNum")) {
            entity.setMaxStoreNum(dto.getMaxStoreNum());
        }
        if (needsMapping(dto, dto.getMaxStoreProductShapeCd(), "maxStoreProductShapeCd")) {
            entity.setMaxStoreProductShapeCd(dto.getMaxStoreProductShapeCd());
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
    protected boolean needsMapping(ELocationDto dto, Object value, String propName) {
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
    public List<ELocation> mappingToEntityList(List<ELocationDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ELocation> entityList = new ArrayList<ELocation>();
        for (ELocationDto dto : dtoList) {
            ELocation entity = mappingToEntity(dto);
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
    public ELocationDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ELocationDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ELocationDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ELocationDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ELocationDtoMapper reverseReference() {
        setReverseReference(true);
        return (ELocationDtoMapper)this;
    }
}

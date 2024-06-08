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
 * The DTO mapper of E_SHIPPING_INST_DATA as TABLE. <br>
 * 出荷指図情報受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_DATA_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INSTRUCTIONS_DATE, OWNER_DIRECT_NO, SALES_TYPE, SHIPTO_CODE, PRODUCT_CD, EXPECT_QTY, UNIT_PRICE, PLAN_PRICE_TOTAL, PLAN_NAME, PLANPOST, PLAN_ADRESS1, PLAN_ADRESS2, PLAN_PRODUCT_NAME, WAREHOUSE_PLANT, WAREHOUSE_PLANT_NAME, ORDER_DATE, DELIVERY_DATE, PURCHASE_NO, ORDER_NUMBER, ITEM_LINE_NO, SKU_CODE, CARDBOARD, CARTON, TOTAL_QTY, NOTE, RESERVE2, RESERVE3, RESERVE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_ID
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
public abstract class BsEShippingInstDataDtoMapper implements DtoMapper<EShippingInstData, EShippingInstDataDto>, Serializable {

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
    public BsEShippingInstDataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEShippingInstDataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EShippingInstDataDto mappingToDto(EShippingInstData entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingInstDataDto dto = new EShippingInstDataDto();
        dto.setShippingInstDataId(entity.getShippingInstDataId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setInstructionsDate(entity.getInstructionsDate());
        dto.setOwnerDirectNo(entity.getOwnerDirectNo());
        dto.setSalesType(entity.getSalesType());
        dto.setShiptoCode(entity.getShiptoCode());
        dto.setProductCd(entity.getProductCd());
        dto.setExpectQty(entity.getExpectQty());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setPlanPriceTotal(entity.getPlanPriceTotal());
        dto.setPlanName(entity.getPlanName());
        dto.setPlanpost(entity.getPlanpost());
        dto.setPlanAdress1(entity.getPlanAdress1());
        dto.setPlanAdress2(entity.getPlanAdress2());
        dto.setPlanProductName(entity.getPlanProductName());
        dto.setWarehousePlant(entity.getWarehousePlant());
        dto.setWarehousePlantName(entity.getWarehousePlantName());
        dto.setOrderDate(entity.getOrderDate());
        dto.setDeliveryDate(entity.getDeliveryDate());
        dto.setPurchaseNo(entity.getPurchaseNo());
        dto.setOrderNumber(entity.getOrderNumber());
        dto.setItemLineNo(entity.getItemLineNo());
        dto.setSkuCode(entity.getSkuCode());
        dto.setCardboard(entity.getCardboard());
        dto.setCarton(entity.getCarton());
        dto.setTotalQty(entity.getTotalQty());
        dto.setNote(entity.getNote());
        dto.setReserve2(entity.getReserve2());
        dto.setReserve3(entity.getReserve3());
        dto.setReserve(entity.getReserve());
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
    public List<EShippingInstDataDto> mappingToDtoList(List<EShippingInstData> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EShippingInstDataDto> dtoList = new ArrayList<EShippingInstDataDto>();
        for (EShippingInstData entity : entityList) {
            EShippingInstDataDto dto = mappingToDto(entity);
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
    public EShippingInstData mappingToEntity(EShippingInstDataDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingInstData entity = new EShippingInstData();
        if (needsMapping(dto, dto.getShippingInstDataId(), "shippingInstDataId")) {
            entity.setShippingInstDataId(dto.getShippingInstDataId());
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
        if (needsMapping(dto, dto.getInstructionsDate(), "instructionsDate")) {
            entity.setInstructionsDate(dto.getInstructionsDate());
        }
        if (needsMapping(dto, dto.getOwnerDirectNo(), "ownerDirectNo")) {
            entity.setOwnerDirectNo(dto.getOwnerDirectNo());
        }
        if (needsMapping(dto, dto.getSalesType(), "salesType")) {
            entity.setSalesType(dto.getSalesType());
        }
        if (needsMapping(dto, dto.getShiptoCode(), "shiptoCode")) {
            entity.setShiptoCode(dto.getShiptoCode());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getExpectQty(), "expectQty")) {
            entity.setExpectQty(dto.getExpectQty());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getPlanPriceTotal(), "planPriceTotal")) {
            entity.setPlanPriceTotal(dto.getPlanPriceTotal());
        }
        if (needsMapping(dto, dto.getPlanName(), "planName")) {
            entity.setPlanName(dto.getPlanName());
        }
        if (needsMapping(dto, dto.getPlanpost(), "planpost")) {
            entity.setPlanpost(dto.getPlanpost());
        }
        if (needsMapping(dto, dto.getPlanAdress1(), "planAdress1")) {
            entity.setPlanAdress1(dto.getPlanAdress1());
        }
        if (needsMapping(dto, dto.getPlanAdress2(), "planAdress2")) {
            entity.setPlanAdress2(dto.getPlanAdress2());
        }
        if (needsMapping(dto, dto.getPlanProductName(), "planProductName")) {
            entity.setPlanProductName(dto.getPlanProductName());
        }
        if (needsMapping(dto, dto.getWarehousePlant(), "warehousePlant")) {
            entity.setWarehousePlant(dto.getWarehousePlant());
        }
        if (needsMapping(dto, dto.getWarehousePlantName(), "warehousePlantName")) {
            entity.setWarehousePlantName(dto.getWarehousePlantName());
        }
        if (needsMapping(dto, dto.getOrderDate(), "orderDate")) {
            entity.setOrderDate(dto.getOrderDate());
        }
        if (needsMapping(dto, dto.getDeliveryDate(), "deliveryDate")) {
            entity.setDeliveryDate(dto.getDeliveryDate());
        }
        if (needsMapping(dto, dto.getPurchaseNo(), "purchaseNo")) {
            entity.setPurchaseNo(dto.getPurchaseNo());
        }
        if (needsMapping(dto, dto.getOrderNumber(), "orderNumber")) {
            entity.setOrderNumber(dto.getOrderNumber());
        }
        if (needsMapping(dto, dto.getItemLineNo(), "itemLineNo")) {
            entity.setItemLineNo(dto.getItemLineNo());
        }
        if (needsMapping(dto, dto.getSkuCode(), "skuCode")) {
            entity.setSkuCode(dto.getSkuCode());
        }
        if (needsMapping(dto, dto.getCardboard(), "cardboard")) {
            entity.setCardboard(dto.getCardboard());
        }
        if (needsMapping(dto, dto.getCarton(), "carton")) {
            entity.setCarton(dto.getCarton());
        }
        if (needsMapping(dto, dto.getTotalQty(), "totalQty")) {
            entity.setTotalQty(dto.getTotalQty());
        }
        if (needsMapping(dto, dto.getNote(), "note")) {
            entity.setNote(dto.getNote());
        }
        if (needsMapping(dto, dto.getReserve2(), "reserve2")) {
            entity.setReserve2(dto.getReserve2());
        }
        if (needsMapping(dto, dto.getReserve3(), "reserve3")) {
            entity.setReserve3(dto.getReserve3());
        }
        if (needsMapping(dto, dto.getReserve(), "reserve")) {
            entity.setReserve(dto.getReserve());
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
    protected boolean needsMapping(EShippingInstDataDto dto, Object value, String propName) {
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
    public List<EShippingInstData> mappingToEntityList(List<EShippingInstDataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EShippingInstData> entityList = new ArrayList<EShippingInstData>();
        for (EShippingInstDataDto dto : dtoList) {
            EShippingInstData entity = mappingToEntity(dto);
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
    public EShippingInstDataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EShippingInstDataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EShippingInstDataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EShippingInstDataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EShippingInstDataDtoMapper reverseReference() {
        setReverseReference(true);
        return (EShippingInstDataDtoMapper)this;
    }
}

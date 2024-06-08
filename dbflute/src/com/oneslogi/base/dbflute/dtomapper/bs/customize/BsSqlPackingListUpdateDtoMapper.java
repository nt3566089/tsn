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
 * The DTO mapper of SqlPackingListUpdate. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PACKING_H_ID, CENTER_ID, CENTER_CD, CENTER_NM, CLIENT_ID, CLIENT_CD, CLIENT_NM, BOX_CD, BOX_NM, PRODUCT_CD, JAN_CD, PRODUCT_NM, PRODUCT_ID, PRODUCT_ABBR, PACKING_NUM_SUM, DELIV_DT, DELIV_TZ, DELIV_ZIP_CD, DELIV_TEL_NO, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_CUSTOMER_NM, VERSION_NO, PROCESS_TYPE_ID, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, PICKING_NUM_SUM, UPD_DT, COUNT
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
public abstract class BsSqlPackingListUpdateDtoMapper implements DtoMapper<SqlPackingListUpdate, SqlPackingListUpdateDto>, Serializable {

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
    public BsSqlPackingListUpdateDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPackingListUpdateDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPackingListUpdateDto mappingToDto(SqlPackingListUpdate entity) {
        if (entity == null) {
            return null;
        }
        SqlPackingListUpdateDto dto = new SqlPackingListUpdateDto();
        dto.setPackingHId(entity.getPackingHId());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setBoxCd(entity.getBoxCd());
        dto.setBoxNm(entity.getBoxNm());
        dto.setProductCd(entity.getProductCd());
        dto.setJanCd(entity.getJanCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductId(entity.getProductId());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setPackingNumSum(entity.getPackingNumSum());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setVersionNo(entity.getVersionNo());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setAllocInstHId(entity.getAllocInstHId());
        dto.setPickingHId(entity.getPickingHId());
        dto.setShippingPackingNo(entity.getShippingPackingNo());
        dto.setCarrierTraceNum(entity.getCarrierTraceNum());
        dto.setPickingNumSum(entity.getPickingNumSum());
        dto.setUpdDt(entity.getUpdDt());
        dto.setCount(entity.getCount());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPackingListUpdateDto> mappingToDtoList(List<SqlPackingListUpdate> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPackingListUpdateDto> dtoList = new ArrayList<SqlPackingListUpdateDto>();
        for (SqlPackingListUpdate entity : entityList) {
            SqlPackingListUpdateDto dto = mappingToDto(entity);
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
    public SqlPackingListUpdate mappingToEntity(SqlPackingListUpdateDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPackingListUpdate entity = new SqlPackingListUpdate();
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getBoxCd(), "boxCd")) {
            entity.setBoxCd(dto.getBoxCd());
        }
        if (needsMapping(dto, dto.getBoxNm(), "boxNm")) {
            entity.setBoxNm(dto.getBoxNm());
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
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getPackingNumSum(), "packingNumSum")) {
            entity.setPackingNumSum(dto.getPackingNumSum());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getDelivAddress1(), "delivAddress1")) {
            entity.setDelivAddress1(dto.getDelivAddress1());
        }
        if (needsMapping(dto, dto.getDelivAddress2(), "delivAddress2")) {
            entity.setDelivAddress2(dto.getDelivAddress2());
        }
        if (needsMapping(dto, dto.getDelivAddress3(), "delivAddress3")) {
            entity.setDelivAddress3(dto.getDelivAddress3());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getAllocInstHId(), "allocInstHId")) {
            entity.setAllocInstHId(dto.getAllocInstHId());
        }
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getShippingPackingNo(), "shippingPackingNo")) {
            entity.setShippingPackingNo(dto.getShippingPackingNo());
        }
        if (needsMapping(dto, dto.getCarrierTraceNum(), "carrierTraceNum")) {
            entity.setCarrierTraceNum(dto.getCarrierTraceNum());
        }
        if (needsMapping(dto, dto.getPickingNumSum(), "pickingNumSum")) {
            entity.setPickingNumSum(dto.getPickingNumSum());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getCount(), "count")) {
            entity.setCount(dto.getCount());
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
    protected boolean needsMapping(SqlPackingListUpdateDto dto, Object value, String propName) {
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
    public List<SqlPackingListUpdate> mappingToEntityList(List<SqlPackingListUpdateDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPackingListUpdate> entityList = new ArrayList<SqlPackingListUpdate>();
        for (SqlPackingListUpdateDto dto : dtoList) {
            SqlPackingListUpdate entity = mappingToEntity(dto);
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
    public SqlPackingListUpdateDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPackingListUpdateDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPackingListUpdateDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPackingListUpdateDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPackingListUpdateDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPackingListUpdateDtoMapper)this;
    }
}

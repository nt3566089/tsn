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
 * The DTO mapper of SqlPackingSlipListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CLIENT_ADDRESS1, CLIENT_ADDRESS2, CLIENT_ADDRESS3, CLIENT_TEL_NO, SHIPPING_DT, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_NM, BILL_ADDRESS1, BILL_ADDRESS2, BILL_ADDRESS3, BILL_TEL_NO, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, PRODUCT_CD, PRODUCT_NM, ALLOC_NUM
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
public abstract class BsSqlPackingSlipListPrintDtoMapper implements DtoMapper<SqlPackingSlipListPrint, SqlPackingSlipListPrintDto>, Serializable {

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
    public BsSqlPackingSlipListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPackingSlipListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPackingSlipListPrintDto mappingToDto(SqlPackingSlipListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlPackingSlipListPrintDto dto = new SqlPackingSlipListPrintDto();
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setClientAddress1(entity.getClientAddress1());
        dto.setClientAddress2(entity.getClientAddress2());
        dto.setClientAddress3(entity.getClientAddress3());
        dto.setClientTelNo(entity.getClientTelNo());
        dto.setShippingDt(entity.getShippingDt());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setBillAddress1(entity.getBillAddress1());
        dto.setBillAddress2(entity.getBillAddress2());
        dto.setBillAddress3(entity.getBillAddress3());
        dto.setBillTelNo(entity.getBillTelNo());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setAllocNum(entity.getAllocNum());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPackingSlipListPrintDto> mappingToDtoList(List<SqlPackingSlipListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPackingSlipListPrintDto> dtoList = new ArrayList<SqlPackingSlipListPrintDto>();
        for (SqlPackingSlipListPrint entity : entityList) {
            SqlPackingSlipListPrintDto dto = mappingToDto(entity);
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
    public SqlPackingSlipListPrint mappingToEntity(SqlPackingSlipListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPackingSlipListPrint entity = new SqlPackingSlipListPrint();
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getClientAddress1(), "clientAddress1")) {
            entity.setClientAddress1(dto.getClientAddress1());
        }
        if (needsMapping(dto, dto.getClientAddress2(), "clientAddress2")) {
            entity.setClientAddress2(dto.getClientAddress2());
        }
        if (needsMapping(dto, dto.getClientAddress3(), "clientAddress3")) {
            entity.setClientAddress3(dto.getClientAddress3());
        }
        if (needsMapping(dto, dto.getClientTelNo(), "clientTelNo")) {
            entity.setClientTelNo(dto.getClientTelNo());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getBillAddress1(), "billAddress1")) {
            entity.setBillAddress1(dto.getBillAddress1());
        }
        if (needsMapping(dto, dto.getBillAddress2(), "billAddress2")) {
            entity.setBillAddress2(dto.getBillAddress2());
        }
        if (needsMapping(dto, dto.getBillAddress3(), "billAddress3")) {
            entity.setBillAddress3(dto.getBillAddress3());
        }
        if (needsMapping(dto, dto.getBillTelNo(), "billTelNo")) {
            entity.setBillTelNo(dto.getBillTelNo());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
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
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
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
    protected boolean needsMapping(SqlPackingSlipListPrintDto dto, Object value, String propName) {
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
    public List<SqlPackingSlipListPrint> mappingToEntityList(List<SqlPackingSlipListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPackingSlipListPrint> entityList = new ArrayList<SqlPackingSlipListPrint>();
        for (SqlPackingSlipListPrintDto dto : dtoList) {
            SqlPackingSlipListPrint entity = mappingToEntity(dto);
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
    public SqlPackingSlipListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPackingSlipListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPackingSlipListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPackingSlipListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPackingSlipListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPackingSlipListPrintDtoMapper)this;
    }
}

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
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlBillOfLadingPrintSelect. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PICKING_H_ID, BOL_NO, PICKING_WORK_NO, SHIPPING_DT, CARRIER_CD, CARRIER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ZIP_CD, CARRIER_TRACE_NUM, BOL_OUT_FLG, BOL_OUT_NM, BOL_OUT_DT, USER_NM
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
public abstract class BsSqlBillOfLadingPrintSelectDtoMapper implements DtoMapper<SqlBillOfLadingPrintSelect, SqlBillOfLadingPrintSelectDto>, Serializable {

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
    public BsSqlBillOfLadingPrintSelectDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlBillOfLadingPrintSelectDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlBillOfLadingPrintSelectDto mappingToDto(SqlBillOfLadingPrintSelect entity) {
        if (entity == null) {
            return null;
        }
        SqlBillOfLadingPrintSelectDto dto = new SqlBillOfLadingPrintSelectDto();
        dto.setPickingHId(entity.getPickingHId());
        dto.setBolNo(entity.getBolNo());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setShippingDt(entity.getShippingDt());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDelivCustomerCd(entity.getDelivCustomerCd());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setCarrierTraceNum(entity.getCarrierTraceNum());
        dto.setBolOutFlg(entity.getBolOutFlg());
        dto.setBolOutNm(entity.getBolOutNm());
        dto.setBolOutDt(entity.getBolOutDt());
        dto.setUserNm(entity.getUserNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlBillOfLadingPrintSelectDto> mappingToDtoList(List<SqlBillOfLadingPrintSelect> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlBillOfLadingPrintSelectDto> dtoList = new ArrayList<SqlBillOfLadingPrintSelectDto>();
        for (SqlBillOfLadingPrintSelect entity : entityList) {
            SqlBillOfLadingPrintSelectDto dto = mappingToDto(entity);
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
    public SqlBillOfLadingPrintSelect mappingToEntity(SqlBillOfLadingPrintSelectDto dto) {
        if (dto == null) {
            return null;
        }
        SqlBillOfLadingPrintSelect entity = new SqlBillOfLadingPrintSelect();
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getBolNo(), "bolNo")) {
            entity.setBolNo(dto.getBolNo());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerCd(), "delivCustomerCd")) {
            entity.setDelivCustomerCd(dto.getDelivCustomerCd());
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
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
        }
        if (needsMapping(dto, dto.getCarrierTraceNum(), "carrierTraceNum")) {
            entity.setCarrierTraceNum(dto.getCarrierTraceNum());
        }
        if (needsMapping(dto, dto.getBolOutFlg(), "bolOutFlg")) {
            entity.setBolOutFlgAsBolOutFlg(CDef.BolOutFlg.codeOf(dto.getBolOutFlg()));
        }
        if (needsMapping(dto, dto.getBolOutNm(), "bolOutNm")) {
            entity.setBolOutNm(dto.getBolOutNm());
        }
        if (needsMapping(dto, dto.getBolOutDt(), "bolOutDt")) {
            entity.setBolOutDt(dto.getBolOutDt());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
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
    protected boolean needsMapping(SqlBillOfLadingPrintSelectDto dto, Object value, String propName) {
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
    public List<SqlBillOfLadingPrintSelect> mappingToEntityList(List<SqlBillOfLadingPrintSelectDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlBillOfLadingPrintSelect> entityList = new ArrayList<SqlBillOfLadingPrintSelect>();
        for (SqlBillOfLadingPrintSelectDto dto : dtoList) {
            SqlBillOfLadingPrintSelect entity = mappingToEntity(dto);
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
    public SqlBillOfLadingPrintSelectDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlBillOfLadingPrintSelectDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlBillOfLadingPrintSelectDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlBillOfLadingPrintSelectDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlBillOfLadingPrintSelectDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlBillOfLadingPrintSelectDtoMapper)this;
    }
}

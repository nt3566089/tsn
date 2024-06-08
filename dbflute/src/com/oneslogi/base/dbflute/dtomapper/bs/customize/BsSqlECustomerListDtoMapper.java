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
 * The DTO mapper of SqlECustomerList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CUSTOMER_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, ALLOC_ORDER, SHIPPING_STOP_FLG, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, CENTER_CD, DELIVERY_COURSE_CD, DELIVERY_ORDER, DELIVERY_READTIME, MESSAGE_NM, CLIENT_ID, CLIENT_NM, MZ_ZIP_ID, ZIP_ADDRESS1, ZIP_ADDRESS2, ZIP_ADDRESS3, CENTER_ID, CENTER_NM, DELIVERY_COURSE_NM, DELIVERY_COURSE_ID, MDC_VERSION_NO, MCU_CUSTOMER_ID, MCU_VERSION_NO
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
public abstract class BsSqlECustomerListDtoMapper implements DtoMapper<SqlECustomerList, SqlECustomerListDto>, Serializable {

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
    public BsSqlECustomerListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlECustomerListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlECustomerListDto mappingToDto(SqlECustomerList entity) {
        if (entity == null) {
            return null;
        }
        SqlECustomerListDto dto = new SqlECustomerListDto();
        dto.setCustomerId(entity.getCustomerId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setClientCd(entity.getClientCd());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setVendorFlg(entity.getVendorFlg());
        dto.setDeliveryFlg(entity.getDeliveryFlg());
        dto.setOnetimeFlg(entity.getOnetimeFlg());
        dto.setDepositFlg(entity.getDepositFlg());
        dto.setZipCd(entity.getZipCd());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setTelNo(entity.getTelNo());
        dto.setAllocOrder(entity.getAllocOrder());
        dto.setShippingStopFlg(entity.getShippingStopFlg());
        dto.setLotReverseFlg(entity.getLotReverseFlg());
        dto.setLimitDtReverseFlg(entity.getLimitDtReverseFlg());
        dto.setCenterCd(entity.getCenterCd());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryOrder(entity.getDeliveryOrder());
        dto.setDeliveryReadtime(entity.getDeliveryReadtime());
        dto.setMessageNm(entity.getMessageNm());
        dto.setClientId(entity.getClientId());
        dto.setClientNm(entity.getClientNm());
        dto.setMzZipId(entity.getMzZipId());
        dto.setZipAddress1(entity.getZipAddress1());
        dto.setZipAddress2(entity.getZipAddress2());
        dto.setZipAddress3(entity.getZipAddress3());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterNm(entity.getCenterNm());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setMdcVersionNo(entity.getMdcVersionNo());
        dto.setMcuCustomerId(entity.getMcuCustomerId());
        dto.setMcuVersionNo(entity.getMcuVersionNo());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlECustomerListDto> mappingToDtoList(List<SqlECustomerList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlECustomerListDto> dtoList = new ArrayList<SqlECustomerListDto>();
        for (SqlECustomerList entity : entityList) {
            SqlECustomerListDto dto = mappingToDto(entity);
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
    public SqlECustomerList mappingToEntity(SqlECustomerListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlECustomerList entity = new SqlECustomerList();
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
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
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getVendorFlg(), "vendorFlg")) {
            entity.setVendorFlg(dto.getVendorFlg());
        }
        if (needsMapping(dto, dto.getDeliveryFlg(), "deliveryFlg")) {
            entity.setDeliveryFlg(dto.getDeliveryFlg());
        }
        if (needsMapping(dto, dto.getOnetimeFlg(), "onetimeFlg")) {
            entity.setOnetimeFlg(dto.getOnetimeFlg());
        }
        if (needsMapping(dto, dto.getDepositFlg(), "depositFlg")) {
            entity.setDepositFlg(dto.getDepositFlg());
        }
        if (needsMapping(dto, dto.getZipCd(), "zipCd")) {
            entity.setZipCd(dto.getZipCd());
        }
        if (needsMapping(dto, dto.getAddress1(), "address1")) {
            entity.setAddress1(dto.getAddress1());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAddress3(), "address3")) {
            entity.setAddress3(dto.getAddress3());
        }
        if (needsMapping(dto, dto.getTelNo(), "telNo")) {
            entity.setTelNo(dto.getTelNo());
        }
        if (needsMapping(dto, dto.getAllocOrder(), "allocOrder")) {
            entity.setAllocOrder(dto.getAllocOrder());
        }
        if (needsMapping(dto, dto.getShippingStopFlg(), "shippingStopFlg")) {
            entity.setShippingStopFlg(dto.getShippingStopFlg());
        }
        if (needsMapping(dto, dto.getLotReverseFlg(), "lotReverseFlg")) {
            entity.setLotReverseFlg(dto.getLotReverseFlg());
        }
        if (needsMapping(dto, dto.getLimitDtReverseFlg(), "limitDtReverseFlg")) {
            entity.setLimitDtReverseFlg(dto.getLimitDtReverseFlg());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryOrder(), "deliveryOrder")) {
            entity.setDeliveryOrder(dto.getDeliveryOrder());
        }
        if (needsMapping(dto, dto.getDeliveryReadtime(), "deliveryReadtime")) {
            entity.setDeliveryReadtime(dto.getDeliveryReadtime());
        }
        if (needsMapping(dto, dto.getMessageNm(), "messageNm")) {
            entity.setMessageNm(dto.getMessageNm());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getMzZipId(), "mzZipId")) {
            entity.setMzZipId(dto.getMzZipId());
        }
        if (needsMapping(dto, dto.getZipAddress1(), "zipAddress1")) {
            entity.setZipAddress1(dto.getZipAddress1());
        }
        if (needsMapping(dto, dto.getZipAddress2(), "zipAddress2")) {
            entity.setZipAddress2(dto.getZipAddress2());
        }
        if (needsMapping(dto, dto.getZipAddress3(), "zipAddress3")) {
            entity.setZipAddress3(dto.getZipAddress3());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getMdcVersionNo(), "mdcVersionNo")) {
            entity.setMdcVersionNo(dto.getMdcVersionNo());
        }
        if (needsMapping(dto, dto.getMcuCustomerId(), "mcuCustomerId")) {
            entity.setMcuCustomerId(dto.getMcuCustomerId());
        }
        if (needsMapping(dto, dto.getMcuVersionNo(), "mcuVersionNo")) {
            entity.setMcuVersionNo(dto.getMcuVersionNo());
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
    protected boolean needsMapping(SqlECustomerListDto dto, Object value, String propName) {
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
    public List<SqlECustomerList> mappingToEntityList(List<SqlECustomerListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlECustomerList> entityList = new ArrayList<SqlECustomerList>();
        for (SqlECustomerListDto dto : dtoList) {
            SqlECustomerList entity = mappingToEntity(dto);
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
    public SqlECustomerListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlECustomerListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlECustomerListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlECustomerListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlECustomerListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlECustomerListDtoMapper)this;
    }
}

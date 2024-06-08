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
 * The DTO mapper of SqlReceiveDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     receive_plan_h_id, receive_plan_b_id, receive_status, product_id, product_cd, plan_lot, plan_limit_dt, plan_location_cd, plan_store_label_no, plan_num, store_record_h_id, store_record_b_id, lot, limit_dt, store_dt, store_num, store_location_cd, product_nm, product_abbr, jan_cd, receive_status_nm, receive_plan_dt, plan_client_receive_no, receive_slip_no, line_no, center_id, client_id, plan_supplier_cd, store_supplier_cd
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
public abstract class BsSqlReceiveDataListDtoMapper implements DtoMapper<SqlReceiveDataList, SqlReceiveDataListDto>, Serializable {

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
    public BsSqlReceiveDataListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlReceiveDataListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlReceiveDataListDto mappingToDto(SqlReceiveDataList entity) {
        if (entity == null) {
            return null;
        }
        SqlReceiveDataListDto dto = new SqlReceiveDataListDto();
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setReceiveStatus(entity.getReceiveStatus());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setPlanLot(entity.getPlanLot());
        dto.setPlanLimitDt(entity.getPlanLimitDt());
        dto.setPlanLocationCd(entity.getPlanLocationCd());
        dto.setPlanStoreLabelNo(entity.getPlanStoreLabelNo());
        dto.setPlanNum(entity.getPlanNum());
        dto.setStoreRecordHId(entity.getStoreRecordHId());
        dto.setStoreRecordBId(entity.getStoreRecordBId());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setStoreDt(entity.getStoreDt());
        dto.setStoreNum(entity.getStoreNum());
        dto.setStoreLocationCd(entity.getStoreLocationCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setJanCd(entity.getJanCd());
        dto.setReceiveStatusNm(entity.getReceiveStatusNm());
        dto.setReceivePlanDt(entity.getReceivePlanDt());
        dto.setPlanClientReceiveNo(entity.getPlanClientReceiveNo());
        dto.setReceiveSlipNo(entity.getReceiveSlipNo());
        dto.setLineNo(entity.getLineNo());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setPlanSupplierCd(entity.getPlanSupplierCd());
        dto.setStoreSupplierCd(entity.getStoreSupplierCd());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlReceiveDataListDto> mappingToDtoList(List<SqlReceiveDataList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlReceiveDataListDto> dtoList = new ArrayList<SqlReceiveDataListDto>();
        for (SqlReceiveDataList entity : entityList) {
            SqlReceiveDataListDto dto = mappingToDto(entity);
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
    public SqlReceiveDataList mappingToEntity(SqlReceiveDataListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlReceiveDataList entity = new SqlReceiveDataList();
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
        }
        if (needsMapping(dto, dto.getReceiveStatus(), "receiveStatus")) {
            entity.setReceiveStatus(dto.getReceiveStatus());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getPlanLot(), "planLot")) {
            entity.setPlanLot(dto.getPlanLot());
        }
        if (needsMapping(dto, dto.getPlanLimitDt(), "planLimitDt")) {
            entity.setPlanLimitDt(dto.getPlanLimitDt());
        }
        if (needsMapping(dto, dto.getPlanLocationCd(), "planLocationCd")) {
            entity.setPlanLocationCd(dto.getPlanLocationCd());
        }
        if (needsMapping(dto, dto.getPlanStoreLabelNo(), "planStoreLabelNo")) {
            entity.setPlanStoreLabelNo(dto.getPlanStoreLabelNo());
        }
        if (needsMapping(dto, dto.getPlanNum(), "planNum")) {
            entity.setPlanNum(dto.getPlanNum());
        }
        if (needsMapping(dto, dto.getStoreRecordHId(), "storeRecordHId")) {
            entity.setStoreRecordHId(dto.getStoreRecordHId());
        }
        if (needsMapping(dto, dto.getStoreRecordBId(), "storeRecordBId")) {
            entity.setStoreRecordBId(dto.getStoreRecordBId());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getStoreNum(), "storeNum")) {
            entity.setStoreNum(dto.getStoreNum());
        }
        if (needsMapping(dto, dto.getStoreLocationCd(), "storeLocationCd")) {
            entity.setStoreLocationCd(dto.getStoreLocationCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getReceiveStatusNm(), "receiveStatusNm")) {
            entity.setReceiveStatusNm(dto.getReceiveStatusNm());
        }
        if (needsMapping(dto, dto.getReceivePlanDt(), "receivePlanDt")) {
            entity.setReceivePlanDt(dto.getReceivePlanDt());
        }
        if (needsMapping(dto, dto.getPlanClientReceiveNo(), "planClientReceiveNo")) {
            entity.setPlanClientReceiveNo(dto.getPlanClientReceiveNo());
        }
        if (needsMapping(dto, dto.getReceiveSlipNo(), "receiveSlipNo")) {
            entity.setReceiveSlipNo(dto.getReceiveSlipNo());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getPlanSupplierCd(), "planSupplierCd")) {
            entity.setPlanSupplierCd(dto.getPlanSupplierCd());
        }
        if (needsMapping(dto, dto.getStoreSupplierCd(), "storeSupplierCd")) {
            entity.setStoreSupplierCd(dto.getStoreSupplierCd());
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
    protected boolean needsMapping(SqlReceiveDataListDto dto, Object value, String propName) {
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
    public List<SqlReceiveDataList> mappingToEntityList(List<SqlReceiveDataListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlReceiveDataList> entityList = new ArrayList<SqlReceiveDataList>();
        for (SqlReceiveDataListDto dto : dtoList) {
            SqlReceiveDataList entity = mappingToEntity(dto);
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
    public SqlReceiveDataListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlReceiveDataListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlReceiveDataListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlReceiveDataListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlReceiveDataListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlReceiveDataListDtoMapper)this;
    }
}

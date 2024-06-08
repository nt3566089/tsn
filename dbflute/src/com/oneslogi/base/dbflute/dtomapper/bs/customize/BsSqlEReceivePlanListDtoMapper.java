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
 * The DTO mapper of SqlEReceivePlanList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, RECEIVE_PLAN_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, VERSION_NO, CONTROL_NO, CUSTOMER_NM, CUSTOMER_ABBR, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, PROCESS_TYPE_NM, STOCK_TYPE_CD, STOCK_TYPE_NM, PLAN_DEPOSIT_CD, PLAN_DEPOSIT_NM, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, MESSAGE_NM, LOCATION_ID, LCS_WAREHOUSE_CD, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3
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
public abstract class BsSqlEReceivePlanListDtoMapper implements DtoMapper<SqlEReceivePlanList, SqlEReceivePlanListDto>, Serializable {

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
    public BsSqlEReceivePlanListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlEReceivePlanListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlEReceivePlanListDto mappingToDto(SqlEReceivePlanList entity) {
        if (entity == null) {
            return null;
        }
        SqlEReceivePlanListDto dto = new SqlEReceivePlanListDto();
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceivePlanId(entity.getReceivePlanId());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setClientCd(entity.getClientCd());
        dto.setCenterCd(entity.getCenterCd());
        dto.setPlanClientReceiveNo(entity.getPlanClientReceiveNo());
        dto.setPlanSupplierCd(entity.getPlanSupplierCd());
        dto.setVersionNo(entity.getVersionNo());
        dto.setControlNo(entity.getControlNo());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setReceivePlanDt(entity.getReceivePlanDt());
        dto.setProcessTypeCd(entity.getProcessTypeCd());
        dto.setProcessTypeNm(entity.getProcessTypeNm());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setStockTypeNm(entity.getStockTypeNm());
        dto.setPlanDepositCd(entity.getPlanDepositCd());
        dto.setPlanDepositNm(entity.getPlanDepositNm());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setJanCd(entity.getJanCd());
        dto.setLotManagFlg(entity.getLotManagFlg());
        dto.setLimitDtManagFlg(entity.getLimitDtManagFlg());
        dto.setPlanNum(entity.getPlanNum());
        dto.setPlanWarehouseCd(entity.getPlanWarehouseCd());
        dto.setPlanLocationCd(entity.getPlanLocationCd());
        dto.setPlanLot(entity.getPlanLot());
        dto.setPlanLimitDt(entity.getPlanLimitDt());
        dto.setPlanClientOrderNo(entity.getPlanClientOrderNo());
        dto.setMessageNm(entity.getMessageNm());
        dto.setLocationId(entity.getLocationId());
        dto.setLcsWarehouseCd(entity.getLcsWarehouseCd());
        dto.setSpareStr1(entity.getSpareStr1());
        dto.setSpareStr2(entity.getSpareStr2());
        dto.setSpareStr3(entity.getSpareStr3());
        dto.setSpareNum1(entity.getSpareNum1());
        dto.setSpareNum2(entity.getSpareNum2());
        dto.setSpareNum3(entity.getSpareNum3());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlEReceivePlanListDto> mappingToDtoList(List<SqlEReceivePlanList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlEReceivePlanListDto> dtoList = new ArrayList<SqlEReceivePlanListDto>();
        for (SqlEReceivePlanList entity : entityList) {
            SqlEReceivePlanListDto dto = mappingToDto(entity);
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
    public SqlEReceivePlanList mappingToEntity(SqlEReceivePlanListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlEReceivePlanList entity = new SqlEReceivePlanList();
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceivePlanId(), "receivePlanId")) {
            entity.setReceivePlanId(dto.getReceivePlanId());
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
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getPlanClientReceiveNo(), "planClientReceiveNo")) {
            entity.setPlanClientReceiveNo(dto.getPlanClientReceiveNo());
        }
        if (needsMapping(dto, dto.getPlanSupplierCd(), "planSupplierCd")) {
            entity.setPlanSupplierCd(dto.getPlanSupplierCd());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo")) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getReceivePlanDt(), "receivePlanDt")) {
            entity.setReceivePlanDt(dto.getReceivePlanDt());
        }
        if (needsMapping(dto, dto.getProcessTypeCd(), "processTypeCd")) {
            entity.setProcessTypeCd(dto.getProcessTypeCd());
        }
        if (needsMapping(dto, dto.getProcessTypeNm(), "processTypeNm")) {
            entity.setProcessTypeNm(dto.getProcessTypeNm());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getStockTypeNm(), "stockTypeNm")) {
            entity.setStockTypeNm(dto.getStockTypeNm());
        }
        if (needsMapping(dto, dto.getPlanDepositCd(), "planDepositCd")) {
            entity.setPlanDepositCd(dto.getPlanDepositCd());
        }
        if (needsMapping(dto, dto.getPlanDepositNm(), "planDepositNm")) {
            entity.setPlanDepositNm(dto.getPlanDepositNm());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
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
        if (needsMapping(dto, dto.getLotManagFlg(), "lotManagFlg")) {
            entity.setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.codeOf(dto.getLotManagFlg()));
        }
        if (needsMapping(dto, dto.getLimitDtManagFlg(), "limitDtManagFlg")) {
            entity.setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.codeOf(dto.getLimitDtManagFlg()));
        }
        if (needsMapping(dto, dto.getPlanNum(), "planNum")) {
            entity.setPlanNum(dto.getPlanNum());
        }
        if (needsMapping(dto, dto.getPlanWarehouseCd(), "planWarehouseCd")) {
            entity.setPlanWarehouseCd(dto.getPlanWarehouseCd());
        }
        if (needsMapping(dto, dto.getPlanLocationCd(), "planLocationCd")) {
            entity.setPlanLocationCd(dto.getPlanLocationCd());
        }
        if (needsMapping(dto, dto.getPlanLot(), "planLot")) {
            entity.setPlanLot(dto.getPlanLot());
        }
        if (needsMapping(dto, dto.getPlanLimitDt(), "planLimitDt")) {
            entity.setPlanLimitDt(dto.getPlanLimitDt());
        }
        if (needsMapping(dto, dto.getPlanClientOrderNo(), "planClientOrderNo")) {
            entity.setPlanClientOrderNo(dto.getPlanClientOrderNo());
        }
        if (needsMapping(dto, dto.getMessageNm(), "messageNm")) {
            entity.setMessageNm(dto.getMessageNm());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLcsWarehouseCd(), "lcsWarehouseCd")) {
            entity.setLcsWarehouseCd(dto.getLcsWarehouseCd());
        }
        if (needsMapping(dto, dto.getSpareStr1(), "spareStr1")) {
            entity.setSpareStr1(dto.getSpareStr1());
        }
        if (needsMapping(dto, dto.getSpareStr2(), "spareStr2")) {
            entity.setSpareStr2(dto.getSpareStr2());
        }
        if (needsMapping(dto, dto.getSpareStr3(), "spareStr3")) {
            entity.setSpareStr3(dto.getSpareStr3());
        }
        if (needsMapping(dto, dto.getSpareNum1(), "spareNum1")) {
            entity.setSpareNum1(dto.getSpareNum1());
        }
        if (needsMapping(dto, dto.getSpareNum2(), "spareNum2")) {
            entity.setSpareNum2(dto.getSpareNum2());
        }
        if (needsMapping(dto, dto.getSpareNum3(), "spareNum3")) {
            entity.setSpareNum3(dto.getSpareNum3());
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
    protected boolean needsMapping(SqlEReceivePlanListDto dto, Object value, String propName) {
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
    public List<SqlEReceivePlanList> mappingToEntityList(List<SqlEReceivePlanListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlEReceivePlanList> entityList = new ArrayList<SqlEReceivePlanList>();
        for (SqlEReceivePlanListDto dto : dtoList) {
            SqlEReceivePlanList entity = mappingToEntity(dto);
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
    public SqlEReceivePlanListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlEReceivePlanListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlEReceivePlanListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlEReceivePlanListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlEReceivePlanListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlEReceivePlanListDtoMapper)this;
    }
}

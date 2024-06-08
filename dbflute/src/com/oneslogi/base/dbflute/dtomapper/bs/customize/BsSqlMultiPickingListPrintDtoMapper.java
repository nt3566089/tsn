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
 * The DTO mapper of SqlMultiPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, WAREHOUSE_CD, WAREHOUSE_NM, EMERGENCY_FLG, PICKING_GROUP_NO, WORK_DT, CART_NO, LOCATION_CD, LOCATION_NM, PRODUCT_CD, PRODUCT_NM, JANCD, LOT, LIMT_DT, STORE_LABEL_NO, STORE_DT, BACKET_COL_NUM, BACKET_ROW_NUM, SUM_PICKING_NUM, PACKING_NUM_1_1, PACKING_NUM_1_2, PACKING_NUM_1_3, PACKING_NUM_1_4, PACKING_NUM_1_5, PACKING_NUM_1_6, PACKING_NUM_2_1, PACKING_NUM_2_2, PACKING_NUM_2_3, PACKING_NUM_2_4, PACKING_NUM_2_5, PACKING_NUM_2_6, PACKING_NUM_3_1, PACKING_NUM_3_2, PACKING_NUM_3_3, PACKING_NUM_3_4, PACKING_NUM_3_5, PACKING_NUM_3_6, PACKING_NUM_4_1, PACKING_NUM_4_2, PACKING_NUM_4_3, PACKING_NUM_4_4, PACKING_NUM_4_5, PACKING_NUM_4_6, PACKING_NUM_5_1, PACKING_NUM_5_2, PACKING_NUM_5_3, PACKING_NUM_5_4, PACKING_NUM_5_5, PACKING_NUM_5_6, PACKING_NUM_6_1, PACKING_NUM_6_2, PACKING_NUM_6_3, PACKING_NUM_6_4, PACKING_NUM_6_5, PACKING_NUM_6_6, MLT_OUT_FLG
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
public abstract class BsSqlMultiPickingListPrintDtoMapper implements DtoMapper<SqlMultiPickingListPrint, SqlMultiPickingListPrintDto>, Serializable {

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
    public BsSqlMultiPickingListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlMultiPickingListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlMultiPickingListPrintDto mappingToDto(SqlMultiPickingListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlMultiPickingListPrintDto dto = new SqlMultiPickingListPrintDto();
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setWarehouseNm(entity.getWarehouseNm());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setPickingGroupNo(entity.getPickingGroupNo());
        dto.setWorkDt(entity.getWorkDt());
        dto.setCartNo(entity.getCartNo());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocationNm(entity.getLocationNm());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setJancd(entity.getJancd());
        dto.setLot(entity.getLot());
        dto.setLimtDt(entity.getLimtDt());
        dto.setStoreLabelNo(entity.getStoreLabelNo());
        dto.setStoreDt(entity.getStoreDt());
        dto.setBacketColNum(entity.getBacketColNum());
        dto.setBacketRowNum(entity.getBacketRowNum());
        dto.setSumPickingNum(entity.getSumPickingNum());
        dto.setPackingNum11(entity.getPackingNum11());
        dto.setPackingNum12(entity.getPackingNum12());
        dto.setPackingNum13(entity.getPackingNum13());
        dto.setPackingNum14(entity.getPackingNum14());
        dto.setPackingNum15(entity.getPackingNum15());
        dto.setPackingNum16(entity.getPackingNum16());
        dto.setPackingNum21(entity.getPackingNum21());
        dto.setPackingNum22(entity.getPackingNum22());
        dto.setPackingNum23(entity.getPackingNum23());
        dto.setPackingNum24(entity.getPackingNum24());
        dto.setPackingNum25(entity.getPackingNum25());
        dto.setPackingNum26(entity.getPackingNum26());
        dto.setPackingNum31(entity.getPackingNum31());
        dto.setPackingNum32(entity.getPackingNum32());
        dto.setPackingNum33(entity.getPackingNum33());
        dto.setPackingNum34(entity.getPackingNum34());
        dto.setPackingNum35(entity.getPackingNum35());
        dto.setPackingNum36(entity.getPackingNum36());
        dto.setPackingNum41(entity.getPackingNum41());
        dto.setPackingNum42(entity.getPackingNum42());
        dto.setPackingNum43(entity.getPackingNum43());
        dto.setPackingNum44(entity.getPackingNum44());
        dto.setPackingNum45(entity.getPackingNum45());
        dto.setPackingNum46(entity.getPackingNum46());
        dto.setPackingNum51(entity.getPackingNum51());
        dto.setPackingNum52(entity.getPackingNum52());
        dto.setPackingNum53(entity.getPackingNum53());
        dto.setPackingNum54(entity.getPackingNum54());
        dto.setPackingNum55(entity.getPackingNum55());
        dto.setPackingNum56(entity.getPackingNum56());
        dto.setPackingNum61(entity.getPackingNum61());
        dto.setPackingNum62(entity.getPackingNum62());
        dto.setPackingNum63(entity.getPackingNum63());
        dto.setPackingNum64(entity.getPackingNum64());
        dto.setPackingNum65(entity.getPackingNum65());
        dto.setPackingNum66(entity.getPackingNum66());
        dto.setMltOutFlg(entity.getMltOutFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlMultiPickingListPrintDto> mappingToDtoList(List<SqlMultiPickingListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlMultiPickingListPrintDto> dtoList = new ArrayList<SqlMultiPickingListPrintDto>();
        for (SqlMultiPickingListPrint entity : entityList) {
            SqlMultiPickingListPrintDto dto = mappingToDto(entity);
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
    public SqlMultiPickingListPrint mappingToEntity(SqlMultiPickingListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlMultiPickingListPrint entity = new SqlMultiPickingListPrint();
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getWarehouseNm(), "warehouseNm")) {
            entity.setWarehouseNm(dto.getWarehouseNm());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getPickingGroupNo(), "pickingGroupNo")) {
            entity.setPickingGroupNo(dto.getPickingGroupNo());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getCartNo(), "cartNo")) {
            entity.setCartNo(dto.getCartNo());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getJancd(), "jancd")) {
            entity.setJancd(dto.getJancd());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimtDt(), "limtDt")) {
            entity.setLimtDt(dto.getLimtDt());
        }
        if (needsMapping(dto, dto.getStoreLabelNo(), "storeLabelNo")) {
            entity.setStoreLabelNo(dto.getStoreLabelNo());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getBacketColNum(), "backetColNum")) {
            entity.setBacketColNum(dto.getBacketColNum());
        }
        if (needsMapping(dto, dto.getBacketRowNum(), "backetRowNum")) {
            entity.setBacketRowNum(dto.getBacketRowNum());
        }
        if (needsMapping(dto, dto.getSumPickingNum(), "sumPickingNum")) {
            entity.setSumPickingNum(dto.getSumPickingNum());
        }
        if (needsMapping(dto, dto.getPackingNum11(), "packingNum11")) {
            entity.setPackingNum11(dto.getPackingNum11());
        }
        if (needsMapping(dto, dto.getPackingNum12(), "packingNum12")) {
            entity.setPackingNum12(dto.getPackingNum12());
        }
        if (needsMapping(dto, dto.getPackingNum13(), "packingNum13")) {
            entity.setPackingNum13(dto.getPackingNum13());
        }
        if (needsMapping(dto, dto.getPackingNum14(), "packingNum14")) {
            entity.setPackingNum14(dto.getPackingNum14());
        }
        if (needsMapping(dto, dto.getPackingNum15(), "packingNum15")) {
            entity.setPackingNum15(dto.getPackingNum15());
        }
        if (needsMapping(dto, dto.getPackingNum16(), "packingNum16")) {
            entity.setPackingNum16(dto.getPackingNum16());
        }
        if (needsMapping(dto, dto.getPackingNum21(), "packingNum21")) {
            entity.setPackingNum21(dto.getPackingNum21());
        }
        if (needsMapping(dto, dto.getPackingNum22(), "packingNum22")) {
            entity.setPackingNum22(dto.getPackingNum22());
        }
        if (needsMapping(dto, dto.getPackingNum23(), "packingNum23")) {
            entity.setPackingNum23(dto.getPackingNum23());
        }
        if (needsMapping(dto, dto.getPackingNum24(), "packingNum24")) {
            entity.setPackingNum24(dto.getPackingNum24());
        }
        if (needsMapping(dto, dto.getPackingNum25(), "packingNum25")) {
            entity.setPackingNum25(dto.getPackingNum25());
        }
        if (needsMapping(dto, dto.getPackingNum26(), "packingNum26")) {
            entity.setPackingNum26(dto.getPackingNum26());
        }
        if (needsMapping(dto, dto.getPackingNum31(), "packingNum31")) {
            entity.setPackingNum31(dto.getPackingNum31());
        }
        if (needsMapping(dto, dto.getPackingNum32(), "packingNum32")) {
            entity.setPackingNum32(dto.getPackingNum32());
        }
        if (needsMapping(dto, dto.getPackingNum33(), "packingNum33")) {
            entity.setPackingNum33(dto.getPackingNum33());
        }
        if (needsMapping(dto, dto.getPackingNum34(), "packingNum34")) {
            entity.setPackingNum34(dto.getPackingNum34());
        }
        if (needsMapping(dto, dto.getPackingNum35(), "packingNum35")) {
            entity.setPackingNum35(dto.getPackingNum35());
        }
        if (needsMapping(dto, dto.getPackingNum36(), "packingNum36")) {
            entity.setPackingNum36(dto.getPackingNum36());
        }
        if (needsMapping(dto, dto.getPackingNum41(), "packingNum41")) {
            entity.setPackingNum41(dto.getPackingNum41());
        }
        if (needsMapping(dto, dto.getPackingNum42(), "packingNum42")) {
            entity.setPackingNum42(dto.getPackingNum42());
        }
        if (needsMapping(dto, dto.getPackingNum43(), "packingNum43")) {
            entity.setPackingNum43(dto.getPackingNum43());
        }
        if (needsMapping(dto, dto.getPackingNum44(), "packingNum44")) {
            entity.setPackingNum44(dto.getPackingNum44());
        }
        if (needsMapping(dto, dto.getPackingNum45(), "packingNum45")) {
            entity.setPackingNum45(dto.getPackingNum45());
        }
        if (needsMapping(dto, dto.getPackingNum46(), "packingNum46")) {
            entity.setPackingNum46(dto.getPackingNum46());
        }
        if (needsMapping(dto, dto.getPackingNum51(), "packingNum51")) {
            entity.setPackingNum51(dto.getPackingNum51());
        }
        if (needsMapping(dto, dto.getPackingNum52(), "packingNum52")) {
            entity.setPackingNum52(dto.getPackingNum52());
        }
        if (needsMapping(dto, dto.getPackingNum53(), "packingNum53")) {
            entity.setPackingNum53(dto.getPackingNum53());
        }
        if (needsMapping(dto, dto.getPackingNum54(), "packingNum54")) {
            entity.setPackingNum54(dto.getPackingNum54());
        }
        if (needsMapping(dto, dto.getPackingNum55(), "packingNum55")) {
            entity.setPackingNum55(dto.getPackingNum55());
        }
        if (needsMapping(dto, dto.getPackingNum56(), "packingNum56")) {
            entity.setPackingNum56(dto.getPackingNum56());
        }
        if (needsMapping(dto, dto.getPackingNum61(), "packingNum61")) {
            entity.setPackingNum61(dto.getPackingNum61());
        }
        if (needsMapping(dto, dto.getPackingNum62(), "packingNum62")) {
            entity.setPackingNum62(dto.getPackingNum62());
        }
        if (needsMapping(dto, dto.getPackingNum63(), "packingNum63")) {
            entity.setPackingNum63(dto.getPackingNum63());
        }
        if (needsMapping(dto, dto.getPackingNum64(), "packingNum64")) {
            entity.setPackingNum64(dto.getPackingNum64());
        }
        if (needsMapping(dto, dto.getPackingNum65(), "packingNum65")) {
            entity.setPackingNum65(dto.getPackingNum65());
        }
        if (needsMapping(dto, dto.getPackingNum66(), "packingNum66")) {
            entity.setPackingNum66(dto.getPackingNum66());
        }
        if (needsMapping(dto, dto.getMltOutFlg(), "mltOutFlg")) {
            entity.setMltOutFlgAsListOutFlg(CDef.ListOutFlg.codeOf(dto.getMltOutFlg()));
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
    protected boolean needsMapping(SqlMultiPickingListPrintDto dto, Object value, String propName) {
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
    public List<SqlMultiPickingListPrint> mappingToEntityList(List<SqlMultiPickingListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlMultiPickingListPrint> entityList = new ArrayList<SqlMultiPickingListPrint>();
        for (SqlMultiPickingListPrintDto dto : dtoList) {
            SqlMultiPickingListPrint entity = mappingToEntity(dto);
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
    public SqlMultiPickingListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlMultiPickingListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlMultiPickingListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlMultiPickingListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlMultiPickingListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlMultiPickingListPrintDtoMapper)this;
    }
}

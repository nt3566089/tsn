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
 * The DTO mapper of SqlCardboardMoveHistoryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSYMBOL_ID, RECEIVE_PLAN_H_ID, SYMBOL_MAKE_NO, DAMAGE_FLG_CD, DAMAGE_FLG, LOCATION_CD, LOC_GROUP_CD, LOC_GROUP, DESTINATION_CD, DESTINATION_NM, RECEIVE_DATE, SHIP_DATE, SYMBOL_ITEM_CD, PRODUCT_NM, LOT1, SYMBOL_LOT4, SYMBOL_LOT3_CD, SYMBOL_LOT3, SYMBOL_PRINTER_NO, SYMBOL_PRODUCT_MARK, STOCK_TYPE_CD, OTHERLOT1, CASE_ITF_NO, CASE_BARCODE_VALIANT, CASE_LOT4, CASE_CENTER_NO, CASE_PACK_NO, CASE_PACK_TIME, FROM_ADDRESS1, CARRIER_NAME, CARRIER_WB_NO, CARRIER_NO, CARRIER_S_NAME, OPEN_FLG_CD, OPEN_FLG, MAKER_CASE_NO, RESTQTY_BOWL, RESTQTY_CARTON, UNIT1, UNIT2, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
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
public abstract class BsSqlCardboardMoveHistoryListDtoMapper implements DtoMapper<SqlCardboardMoveHistoryList, SqlCardboardMoveHistoryListDto>, Serializable {

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
    public BsSqlCardboardMoveHistoryListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlCardboardMoveHistoryListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlCardboardMoveHistoryListDto mappingToDto(SqlCardboardMoveHistoryList entity) {
        if (entity == null) {
            return null;
        }
        SqlCardboardMoveHistoryListDto dto = new SqlCardboardMoveHistoryListDto();
        dto.setTrsymbolId(entity.getTrsymbolId());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setSymbolMakeNo(entity.getSymbolMakeNo());
        dto.setDamageFlgCd(entity.getDamageFlgCd());
        dto.setDamageFlg(entity.getDamageFlg());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocGroupCd(entity.getLocGroupCd());
        dto.setLocGroup(entity.getLocGroup());
        dto.setDestinationCd(entity.getDestinationCd());
        dto.setDestinationNm(entity.getDestinationNm());
        dto.setReceiveDate(entity.getReceiveDate());
        dto.setShipDate(entity.getShipDate());
        dto.setSymbolItemCd(entity.getSymbolItemCd());
        dto.setProductNm(entity.getProductNm());
        dto.setLot1(entity.getLot1());
        dto.setSymbolLot4(entity.getSymbolLot4());
        dto.setSymbolLot3Cd(entity.getSymbolLot3Cd());
        dto.setSymbolLot3(entity.getSymbolLot3());
        dto.setSymbolPrinterNo(entity.getSymbolPrinterNo());
        dto.setSymbolProductMark(entity.getSymbolProductMark());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setCaseItfNo(entity.getCaseItfNo());
        dto.setCaseBarcodeValiant(entity.getCaseBarcodeValiant());
        dto.setCaseLot4(entity.getCaseLot4());
        dto.setCaseCenterNo(entity.getCaseCenterNo());
        dto.setCasePackNo(entity.getCasePackNo());
        dto.setCasePackTime(entity.getCasePackTime());
        dto.setFromAddress1(entity.getFromAddress1());
        dto.setCarrierName(entity.getCarrierName());
        dto.setCarrierWbNo(entity.getCarrierWbNo());
        dto.setCarrierNo(entity.getCarrierNo());
        dto.setCarrierSName(entity.getCarrierSName());
        dto.setOpenFlgCd(entity.getOpenFlgCd());
        dto.setOpenFlg(entity.getOpenFlg());
        dto.setMakerCaseNo(entity.getMakerCaseNo());
        dto.setRestqtyBowl(entity.getRestqtyBowl());
        dto.setRestqtyCarton(entity.getRestqtyCarton());
        dto.setUnit1(entity.getUnit1());
        dto.setUnit2(entity.getUnit2());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlCardboardMoveHistoryListDto> mappingToDtoList(List<SqlCardboardMoveHistoryList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlCardboardMoveHistoryListDto> dtoList = new ArrayList<SqlCardboardMoveHistoryListDto>();
        for (SqlCardboardMoveHistoryList entity : entityList) {
            SqlCardboardMoveHistoryListDto dto = mappingToDto(entity);
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
    public SqlCardboardMoveHistoryList mappingToEntity(SqlCardboardMoveHistoryListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlCardboardMoveHistoryList entity = new SqlCardboardMoveHistoryList();
        if (needsMapping(dto, dto.getTrsymbolId(), "trsymbolId")) {
            entity.setTrsymbolId(dto.getTrsymbolId());
        }
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getSymbolMakeNo(), "symbolMakeNo")) {
            entity.setSymbolMakeNo(dto.getSymbolMakeNo());
        }
        if (needsMapping(dto, dto.getDamageFlgCd(), "damageFlgCd")) {
            entity.setDamageFlgCd(dto.getDamageFlgCd());
        }
        if (needsMapping(dto, dto.getDamageFlg(), "damageFlg")) {
            entity.setDamageFlg(dto.getDamageFlg());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocGroupCd(), "locGroupCd")) {
            entity.setLocGroupCd(dto.getLocGroupCd());
        }
        if (needsMapping(dto, dto.getLocGroup(), "locGroup")) {
            entity.setLocGroup(dto.getLocGroup());
        }
        if (needsMapping(dto, dto.getDestinationCd(), "destinationCd")) {
            entity.setDestinationCd(dto.getDestinationCd());
        }
        if (needsMapping(dto, dto.getDestinationNm(), "destinationNm")) {
            entity.setDestinationNm(dto.getDestinationNm());
        }
        if (needsMapping(dto, dto.getReceiveDate(), "receiveDate")) {
            entity.setReceiveDate(dto.getReceiveDate());
        }
        if (needsMapping(dto, dto.getShipDate(), "shipDate")) {
            entity.setShipDate(dto.getShipDate());
        }
        if (needsMapping(dto, dto.getSymbolItemCd(), "symbolItemCd")) {
            entity.setSymbolItemCd(dto.getSymbolItemCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getSymbolLot4(), "symbolLot4")) {
            entity.setSymbolLot4(dto.getSymbolLot4());
        }
        if (needsMapping(dto, dto.getSymbolLot3Cd(), "symbolLot3Cd")) {
            entity.setSymbolLot3Cd(dto.getSymbolLot3Cd());
        }
        if (needsMapping(dto, dto.getSymbolLot3(), "symbolLot3")) {
            entity.setSymbolLot3(dto.getSymbolLot3());
        }
        if (needsMapping(dto, dto.getSymbolPrinterNo(), "symbolPrinterNo")) {
            entity.setSymbolPrinterNo(dto.getSymbolPrinterNo());
        }
        if (needsMapping(dto, dto.getSymbolProductMark(), "symbolProductMark")) {
            entity.setSymbolProductMark(dto.getSymbolProductMark());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getCaseItfNo(), "caseItfNo")) {
            entity.setCaseItfNo(dto.getCaseItfNo());
        }
        if (needsMapping(dto, dto.getCaseBarcodeValiant(), "caseBarcodeValiant")) {
            entity.setCaseBarcodeValiant(dto.getCaseBarcodeValiant());
        }
        if (needsMapping(dto, dto.getCaseLot4(), "caseLot4")) {
            entity.setCaseLot4(dto.getCaseLot4());
        }
        if (needsMapping(dto, dto.getCaseCenterNo(), "caseCenterNo")) {
            entity.setCaseCenterNo(dto.getCaseCenterNo());
        }
        if (needsMapping(dto, dto.getCasePackNo(), "casePackNo")) {
            entity.setCasePackNo(dto.getCasePackNo());
        }
        if (needsMapping(dto, dto.getCasePackTime(), "casePackTime")) {
            entity.setCasePackTime(dto.getCasePackTime());
        }
        if (needsMapping(dto, dto.getFromAddress1(), "fromAddress1")) {
            entity.setFromAddress1(dto.getFromAddress1());
        }
        if (needsMapping(dto, dto.getCarrierName(), "carrierName")) {
            entity.setCarrierName(dto.getCarrierName());
        }
        if (needsMapping(dto, dto.getCarrierWbNo(), "carrierWbNo")) {
            entity.setCarrierWbNo(dto.getCarrierWbNo());
        }
        if (needsMapping(dto, dto.getCarrierNo(), "carrierNo")) {
            entity.setCarrierNo(dto.getCarrierNo());
        }
        if (needsMapping(dto, dto.getCarrierSName(), "carrierSName")) {
            entity.setCarrierSName(dto.getCarrierSName());
        }
        if (needsMapping(dto, dto.getOpenFlgCd(), "openFlgCd")) {
            entity.setOpenFlgCd(dto.getOpenFlgCd());
        }
        if (needsMapping(dto, dto.getOpenFlg(), "openFlg")) {
            entity.setOpenFlg(dto.getOpenFlg());
        }
        if (needsMapping(dto, dto.getMakerCaseNo(), "makerCaseNo")) {
            entity.setMakerCaseNo(dto.getMakerCaseNo());
        }
        if (needsMapping(dto, dto.getRestqtyBowl(), "restqtyBowl")) {
            entity.setRestqtyBowl(dto.getRestqtyBowl());
        }
        if (needsMapping(dto, dto.getRestqtyCarton(), "restqtyCarton")) {
            entity.setRestqtyCarton(dto.getRestqtyCarton());
        }
        if (needsMapping(dto, dto.getUnit1(), "unit1")) {
            entity.setUnit1(dto.getUnit1());
        }
        if (needsMapping(dto, dto.getUnit2(), "unit2")) {
            entity.setUnit2(dto.getUnit2());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
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
    protected boolean needsMapping(SqlCardboardMoveHistoryListDto dto, Object value, String propName) {
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
    public List<SqlCardboardMoveHistoryList> mappingToEntityList(List<SqlCardboardMoveHistoryListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlCardboardMoveHistoryList> entityList = new ArrayList<SqlCardboardMoveHistoryList>();
        for (SqlCardboardMoveHistoryListDto dto : dtoList) {
            SqlCardboardMoveHistoryList entity = mappingToEntity(dto);
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
    public SqlCardboardMoveHistoryListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlCardboardMoveHistoryListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlCardboardMoveHistoryListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlCardboardMoveHistoryListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlCardboardMoveHistoryListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlCardboardMoveHistoryListDtoMapper)this;
    }
}

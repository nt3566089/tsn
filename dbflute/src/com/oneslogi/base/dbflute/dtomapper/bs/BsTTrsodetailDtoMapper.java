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
 * The DTO mapper of T_TRSODETAIL as TABLE. <br>
 * 出庫予定明細
 * <pre>
 * [primary-key]
 *     SODETAILID
 *
 * [column]
 *     SODETAILID, SOID, SOLINENO, ORDERLINENO, OWNERORDERLINENO, CUSTORDERLINENO, ORIGINALPOLINENO, PRODUCT_ID, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, STOCK_TYPE_CD, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, XDOCKQTY1, ALLOCQTY1, PICKEDQTY1, SORTEDQTY1, INSPECTEDQTY1, SHIPPEDQTY1, ADJUSTQTY1, PRICE1, PRICE2, PRICE3, NOTES, LOTRESERVEFLG, PICKQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SODETAILID
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
public abstract class BsTTrsodetailDtoMapper implements DtoMapper<TTrsodetail, TTrsodetailDto>, Serializable {

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
    public BsTTrsodetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsodetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsodetailDto mappingToDto(TTrsodetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsodetailDto dto = new TTrsodetailDto();
        dto.setSodetailid(entity.getSodetailid());
        dto.setSoid(entity.getSoid());
        dto.setSolineno(entity.getSolineno());
        dto.setOrderlineno(entity.getOrderlineno());
        dto.setOwnerorderlineno(entity.getOwnerorderlineno());
        dto.setCustorderlineno(entity.getCustorderlineno());
        dto.setOriginalpolineno(entity.getOriginalpolineno());
        dto.setProductId(entity.getProductId());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot5(entity.getLot5());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setOtherlot2(entity.getOtherlot2());
        dto.setOtherlot3(entity.getOtherlot3());
        dto.setOtherlot4(entity.getOtherlot4());
        dto.setOtherlot5(entity.getOtherlot5());
        dto.setDamageflg(entity.getDamageflg());
        dto.setNoshippingflg(entity.getNoshippingflg());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setCustomsreleaseflg(entity.getCustomsreleaseflg());
        dto.setTaxflg(entity.getTaxflg());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setXdockqty1(entity.getXdockqty1());
        dto.setAllocqty1(entity.getAllocqty1());
        dto.setPickedqty1(entity.getPickedqty1());
        dto.setSortedqty1(entity.getSortedqty1());
        dto.setInspectedqty1(entity.getInspectedqty1());
        dto.setShippedqty1(entity.getShippedqty1());
        dto.setAdjustqty1(entity.getAdjustqty1());
        dto.setPrice1(entity.getPrice1());
        dto.setPrice2(entity.getPrice2());
        dto.setPrice3(entity.getPrice3());
        dto.setNotes(entity.getNotes());
        dto.setLotreserveflg(entity.getLotreserveflg());
        dto.setPickqtyerrorflg(entity.getPickqtyerrorflg());
        dto.setLogicflg1(entity.getLogicflg1());
        dto.setLogicflg2(entity.getLogicflg2());
        dto.setLogicflg3(entity.getLogicflg3());
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
    public List<TTrsodetailDto> mappingToDtoList(List<TTrsodetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsodetailDto> dtoList = new ArrayList<TTrsodetailDto>();
        for (TTrsodetail entity : entityList) {
            TTrsodetailDto dto = mappingToDto(entity);
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
    public TTrsodetail mappingToEntity(TTrsodetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsodetail entity = new TTrsodetail();
        if (needsMapping(dto, dto.getSodetailid(), "sodetailid")) {
            entity.setSodetailid(dto.getSodetailid());
        }
        if (needsMapping(dto, dto.getSoid(), "soid")) {
            entity.setSoid(dto.getSoid());
        }
        if (needsMapping(dto, dto.getSolineno(), "solineno")) {
            entity.setSolineno(dto.getSolineno());
        }
        if (needsMapping(dto, dto.getOrderlineno(), "orderlineno")) {
            entity.setOrderlineno(dto.getOrderlineno());
        }
        if (needsMapping(dto, dto.getOwnerorderlineno(), "ownerorderlineno")) {
            entity.setOwnerorderlineno(dto.getOwnerorderlineno());
        }
        if (needsMapping(dto, dto.getCustorderlineno(), "custorderlineno")) {
            entity.setCustorderlineno(dto.getCustorderlineno());
        }
        if (needsMapping(dto, dto.getOriginalpolineno(), "originalpolineno")) {
            entity.setOriginalpolineno(dto.getOriginalpolineno());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getIfitemcd(), "ifitemcd")) {
            entity.setIfitemcd(dto.getIfitemcd());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot5(), "lot5")) {
            entity.setLot5(dto.getLot5());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getOtherlot2(), "otherlot2")) {
            entity.setOtherlot2(dto.getOtherlot2());
        }
        if (needsMapping(dto, dto.getOtherlot3(), "otherlot3")) {
            entity.setOtherlot3(dto.getOtherlot3());
        }
        if (needsMapping(dto, dto.getOtherlot4(), "otherlot4")) {
            entity.setOtherlot4(dto.getOtherlot4());
        }
        if (needsMapping(dto, dto.getOtherlot5(), "otherlot5")) {
            entity.setOtherlot5(dto.getOtherlot5());
        }
        if (needsMapping(dto, dto.getDamageflg(), "damageflg")) {
            entity.setDamageflg(dto.getDamageflg());
        }
        if (needsMapping(dto, dto.getNoshippingflg(), "noshippingflg")) {
            entity.setNoshippingflg(dto.getNoshippingflg());
        }
        if (needsMapping(dto, dto.getForeigncargoflg(), "foreigncargoflg")) {
            entity.setForeigncargoflg(dto.getForeigncargoflg());
        }
        if (needsMapping(dto, dto.getCustomsreleaseflg(), "customsreleaseflg")) {
            entity.setCustomsreleaseflg(dto.getCustomsreleaseflg());
        }
        if (needsMapping(dto, dto.getTaxflg(), "taxflg")) {
            entity.setTaxflg(dto.getTaxflg());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getXdockqty1(), "xdockqty1")) {
            entity.setXdockqty1(dto.getXdockqty1());
        }
        if (needsMapping(dto, dto.getAllocqty1(), "allocqty1")) {
            entity.setAllocqty1(dto.getAllocqty1());
        }
        if (needsMapping(dto, dto.getPickedqty1(), "pickedqty1")) {
            entity.setPickedqty1(dto.getPickedqty1());
        }
        if (needsMapping(dto, dto.getSortedqty1(), "sortedqty1")) {
            entity.setSortedqty1(dto.getSortedqty1());
        }
        if (needsMapping(dto, dto.getInspectedqty1(), "inspectedqty1")) {
            entity.setInspectedqty1(dto.getInspectedqty1());
        }
        if (needsMapping(dto, dto.getShippedqty1(), "shippedqty1")) {
            entity.setShippedqty1(dto.getShippedqty1());
        }
        if (needsMapping(dto, dto.getAdjustqty1(), "adjustqty1")) {
            entity.setAdjustqty1(dto.getAdjustqty1());
        }
        if (needsMapping(dto, dto.getPrice1(), "price1")) {
            entity.setPrice1(dto.getPrice1());
        }
        if (needsMapping(dto, dto.getPrice2(), "price2")) {
            entity.setPrice2(dto.getPrice2());
        }
        if (needsMapping(dto, dto.getPrice3(), "price3")) {
            entity.setPrice3(dto.getPrice3());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getLotreserveflg(), "lotreserveflg")) {
            entity.setLotreserveflg(dto.getLotreserveflg());
        }
        if (needsMapping(dto, dto.getPickqtyerrorflg(), "pickqtyerrorflg")) {
            entity.setPickqtyerrorflg(dto.getPickqtyerrorflg());
        }
        if (needsMapping(dto, dto.getLogicflg1(), "logicflg1")) {
            entity.setLogicflg1(dto.getLogicflg1());
        }
        if (needsMapping(dto, dto.getLogicflg2(), "logicflg2")) {
            entity.setLogicflg2(dto.getLogicflg2());
        }
        if (needsMapping(dto, dto.getLogicflg3(), "logicflg3")) {
            entity.setLogicflg3(dto.getLogicflg3());
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
    protected boolean needsMapping(TTrsodetailDto dto, Object value, String propName) {
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
    public List<TTrsodetail> mappingToEntityList(List<TTrsodetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrsodetail> entityList = new ArrayList<TTrsodetail>();
        for (TTrsodetailDto dto : dtoList) {
            TTrsodetail entity = mappingToEntity(dto);
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
    public TTrsodetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsodetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsodetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsodetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsodetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsodetailDtoMapper)this;
    }
}

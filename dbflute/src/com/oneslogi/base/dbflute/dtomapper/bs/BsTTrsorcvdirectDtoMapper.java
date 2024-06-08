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
 * The DTO mapper of T_TRSORCVDIRECT as TABLE. <br>
 * 入庫/出庫依頼書印刷
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SoRcvDirectKey, InstructionsDate, OwnerDirectNo, SalesType, SalesTypeCd, ShipToCode, OriginalPONo, PRODUCT_ID, ExpectQty, PlanPrice, PlanPriceTotal, PlanName, PlanPost, PlanAddress1, PlanAddress2, PlanItemName, WareHousePlant, WareHousePlantName, WareHouseName, OrderDate, DeliveryDate, PurchaseNumber, OrderNumber, ItemLineNo, SkuCode, CardBoard, CarTon, TotalExpectQty, TotalCardBoardQty, TotalCarTonQty, Note, Reserve2, Reserve3, Reserve, CenterId, ClientId, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
public abstract class BsTTrsorcvdirectDtoMapper implements DtoMapper<TTrsorcvdirect, TTrsorcvdirectDto>, Serializable {

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
    public BsTTrsorcvdirectDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsorcvdirectDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsorcvdirectDto mappingToDto(TTrsorcvdirect entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsorcvdirectDto dto = new TTrsorcvdirectDto();
        dto.setSojtlineid(entity.getSojtlineid());
        dto.setSorcvdirectkey(entity.getSorcvdirectkey());
        dto.setInstructionsdate(entity.getInstructionsdate());
        dto.setOwnerdirectno(entity.getOwnerdirectno());
        dto.setSalestype(entity.getSalestype());
        dto.setSalestypecd(entity.getSalestypecd());
        dto.setShiptocode(entity.getShiptocode());
        dto.setOriginalpono(entity.getOriginalpono());
        dto.setProductId(entity.getProductId());
        dto.setExpectqty(entity.getExpectqty());
        dto.setPlanprice(entity.getPlanprice());
        dto.setPlanpricetotal(entity.getPlanpricetotal());
        dto.setPlanname(entity.getPlanname());
        dto.setPlanpost(entity.getPlanpost());
        dto.setPlanaddress1(entity.getPlanaddress1());
        dto.setPlanaddress2(entity.getPlanaddress2());
        dto.setPlanitemname(entity.getPlanitemname());
        dto.setWarehouseplant(entity.getWarehouseplant());
        dto.setWarehouseplantname(entity.getWarehouseplantname());
        dto.setWarehousename(entity.getWarehousename());
        dto.setOrderdate(entity.getOrderdate());
        dto.setDeliverydate(entity.getDeliverydate());
        dto.setPurchasenumber(entity.getPurchasenumber());
        dto.setOrdernumber(entity.getOrdernumber());
        dto.setItemlineno(entity.getItemlineno());
        dto.setSkucode(entity.getSkucode());
        dto.setCardboard(entity.getCardboard());
        dto.setCarton(entity.getCarton());
        dto.setTotalexpectqty(entity.getTotalexpectqty());
        dto.setTotalcardboardqty(entity.getTotalcardboardqty());
        dto.setTotalcartonqty(entity.getTotalcartonqty());
        dto.setNote(entity.getNote());
        dto.setReserve2(entity.getReserve2());
        dto.setReserve3(entity.getReserve3());
        dto.setReserve(entity.getReserve());
        dto.setCenterid(entity.getCenterid());
        dto.setClientid(entity.getClientid());
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
    public List<TTrsorcvdirectDto> mappingToDtoList(List<TTrsorcvdirect> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsorcvdirectDto> dtoList = new ArrayList<TTrsorcvdirectDto>();
        for (TTrsorcvdirect entity : entityList) {
            TTrsorcvdirectDto dto = mappingToDto(entity);
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
    public TTrsorcvdirect mappingToEntity(TTrsorcvdirectDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsorcvdirect entity = new TTrsorcvdirect();
        if (needsMapping(dto, dto.getSojtlineid(), "sojtlineid")) {
            entity.setSojtlineid(dto.getSojtlineid());
        }
        if (needsMapping(dto, dto.getSorcvdirectkey(), "sorcvdirectkey")) {
            entity.setSorcvdirectkey(dto.getSorcvdirectkey());
        }
        if (needsMapping(dto, dto.getInstructionsdate(), "instructionsdate")) {
            entity.setInstructionsdate(dto.getInstructionsdate());
        }
        if (needsMapping(dto, dto.getOwnerdirectno(), "ownerdirectno")) {
            entity.setOwnerdirectno(dto.getOwnerdirectno());
        }
        if (needsMapping(dto, dto.getSalestype(), "salestype")) {
            entity.setSalestype(dto.getSalestype());
        }
        if (needsMapping(dto, dto.getSalestypecd(), "salestypecd")) {
            entity.setSalestypecd(dto.getSalestypecd());
        }
        if (needsMapping(dto, dto.getShiptocode(), "shiptocode")) {
            entity.setShiptocode(dto.getShiptocode());
        }
        if (needsMapping(dto, dto.getOriginalpono(), "originalpono")) {
            entity.setOriginalpono(dto.getOriginalpono());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getExpectqty(), "expectqty")) {
            entity.setExpectqty(dto.getExpectqty());
        }
        if (needsMapping(dto, dto.getPlanprice(), "planprice")) {
            entity.setPlanprice(dto.getPlanprice());
        }
        if (needsMapping(dto, dto.getPlanpricetotal(), "planpricetotal")) {
            entity.setPlanpricetotal(dto.getPlanpricetotal());
        }
        if (needsMapping(dto, dto.getPlanname(), "planname")) {
            entity.setPlanname(dto.getPlanname());
        }
        if (needsMapping(dto, dto.getPlanpost(), "planpost")) {
            entity.setPlanpost(dto.getPlanpost());
        }
        if (needsMapping(dto, dto.getPlanaddress1(), "planaddress1")) {
            entity.setPlanaddress1(dto.getPlanaddress1());
        }
        if (needsMapping(dto, dto.getPlanaddress2(), "planaddress2")) {
            entity.setPlanaddress2(dto.getPlanaddress2());
        }
        if (needsMapping(dto, dto.getPlanitemname(), "planitemname")) {
            entity.setPlanitemname(dto.getPlanitemname());
        }
        if (needsMapping(dto, dto.getWarehouseplant(), "warehouseplant")) {
            entity.setWarehouseplant(dto.getWarehouseplant());
        }
        if (needsMapping(dto, dto.getWarehouseplantname(), "warehouseplantname")) {
            entity.setWarehouseplantname(dto.getWarehouseplantname());
        }
        if (needsMapping(dto, dto.getWarehousename(), "warehousename")) {
            entity.setWarehousename(dto.getWarehousename());
        }
        if (needsMapping(dto, dto.getOrderdate(), "orderdate")) {
            entity.setOrderdate(dto.getOrderdate());
        }
        if (needsMapping(dto, dto.getDeliverydate(), "deliverydate")) {
            entity.setDeliverydate(dto.getDeliverydate());
        }
        if (needsMapping(dto, dto.getPurchasenumber(), "purchasenumber")) {
            entity.setPurchasenumber(dto.getPurchasenumber());
        }
        if (needsMapping(dto, dto.getOrdernumber(), "ordernumber")) {
            entity.setOrdernumber(dto.getOrdernumber());
        }
        if (needsMapping(dto, dto.getItemlineno(), "itemlineno")) {
            entity.setItemlineno(dto.getItemlineno());
        }
        if (needsMapping(dto, dto.getSkucode(), "skucode")) {
            entity.setSkucode(dto.getSkucode());
        }
        if (needsMapping(dto, dto.getCardboard(), "cardboard")) {
            entity.setCardboard(dto.getCardboard());
        }
        if (needsMapping(dto, dto.getCarton(), "carton")) {
            entity.setCarton(dto.getCarton());
        }
        if (needsMapping(dto, dto.getTotalexpectqty(), "totalexpectqty")) {
            entity.setTotalexpectqty(dto.getTotalexpectqty());
        }
        if (needsMapping(dto, dto.getTotalcardboardqty(), "totalcardboardqty")) {
            entity.setTotalcardboardqty(dto.getTotalcardboardqty());
        }
        if (needsMapping(dto, dto.getTotalcartonqty(), "totalcartonqty")) {
            entity.setTotalcartonqty(dto.getTotalcartonqty());
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
        if (needsMapping(dto, dto.getCenterid(), "centerid")) {
            entity.setCenterid(dto.getCenterid());
        }
        if (needsMapping(dto, dto.getClientid(), "clientid")) {
            entity.setClientid(dto.getClientid());
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
    protected boolean needsMapping(TTrsorcvdirectDto dto, Object value, String propName) {
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
    public List<TTrsorcvdirect> mappingToEntityList(List<TTrsorcvdirectDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrsorcvdirect> entityList = new ArrayList<TTrsorcvdirect>();
        for (TTrsorcvdirectDto dto : dtoList) {
            TTrsorcvdirect entity = mappingToEntity(dto);
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
    public TTrsorcvdirectDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsorcvdirectDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsorcvdirectDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsorcvdirectDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsorcvdirectDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsorcvdirectDtoMapper)this;
    }
}

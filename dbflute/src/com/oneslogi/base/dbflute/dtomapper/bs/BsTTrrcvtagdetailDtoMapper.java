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
 * The DTO mapper of T_TRRCVTAGDETAIL as TABLE. <br>
 * 入庫受入指示明細
 * <pre>
 * [primary-key]
 *     TRRCVTAGDETAIL_ID
 *
 * [column]
 *     TRRCVTAGDETAIL_ID, RCVTAGKEY, ACCEPTKEY, ACCEPTLINENO, RCVKEY, RCVLINENO, STS, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOGISTICSCD, WAREHOUSECD, SLOTFLG, TOLOCCD, LOCCD, LOTKEY, TAGCD, ODDSFLG, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, LOADQTY1, LOADQTY2, LOADQTY3, LABELPRINTEDFLG, NOTES, SOKEY, SOLINENO, TRIGGERTYPE, PROSPECTFLG, PROSPECTUPDATEFLG, SLOTTYPE, SLOTTEDUSERCD, XDOCKORDERKEY, PICKKEY, FULLPALLETKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVTAGDETAIL_ID
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
public abstract class BsTTrrcvtagdetailDtoMapper implements DtoMapper<TTrrcvtagdetail, TTrrcvtagdetailDto>, Serializable {

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
    public BsTTrrcvtagdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrrcvtagdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrrcvtagdetailDto mappingToDto(TTrrcvtagdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcvtagdetailDto dto = new TTrrcvtagdetailDto();
        dto.setTrrcvtagdetailId(entity.getTrrcvtagdetailId());
        dto.setRcvtagkey(entity.getRcvtagkey());
        dto.setAcceptkey(entity.getAcceptkey());
        dto.setAcceptlineno(entity.getAcceptlineno());
        dto.setRcvkey(entity.getRcvkey());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setSts(entity.getSts());
        dto.setOwnercd(entity.getOwnercd());
        dto.setItemadmin(entity.getItemadmin());
        dto.setProductCd(entity.getProductCd());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot5(entity.getLot5());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setOtherlot2(entity.getOtherlot2());
        dto.setOtherlot3(entity.getOtherlot3());
        dto.setOtherlot4(entity.getOtherlot4());
        dto.setOtherlot5(entity.getOtherlot5());
        dto.setDamageflg(entity.getDamageflg());
        dto.setNoshippingflg(entity.getNoshippingflg());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setCustomsreleaseflg(entity.getCustomsreleaseflg());
        dto.setTaxflg(entity.getTaxflg());
        dto.setLogisticscd(entity.getLogisticscd());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setSlotflg(entity.getSlotflg());
        dto.setToloccd(entity.getToloccd());
        dto.setLoccd(entity.getLoccd());
        dto.setLotkey(entity.getLotkey());
        dto.setTagcd(entity.getTagcd());
        dto.setOddsflg(entity.getOddsflg());
        dto.setInstructqty1(entity.getInstructqty1());
        dto.setInstructqty2(entity.getInstructqty2());
        dto.setInstructqty3(entity.getInstructqty3());
        dto.setLoadqty1(entity.getLoadqty1());
        dto.setLoadqty2(entity.getLoadqty2());
        dto.setLoadqty3(entity.getLoadqty3());
        dto.setLabelprintedflg(entity.getLabelprintedflg());
        dto.setNotes(entity.getNotes());
        dto.setSokey(entity.getSokey());
        dto.setSolineno(entity.getSolineno());
        dto.setTriggertype(entity.getTriggertype());
        dto.setProspectflg(entity.getProspectflg());
        dto.setProspectupdateflg(entity.getProspectupdateflg());
        dto.setSlottype(entity.getSlottype());
        dto.setSlottedusercd(entity.getSlottedusercd());
        dto.setXdockorderkey(entity.getXdockorderkey());
        dto.setPickkey(entity.getPickkey());
        dto.setFullpalletkey(entity.getFullpalletkey());
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
    public List<TTrrcvtagdetailDto> mappingToDtoList(List<TTrrcvtagdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrrcvtagdetailDto> dtoList = new ArrayList<TTrrcvtagdetailDto>();
        for (TTrrcvtagdetail entity : entityList) {
            TTrrcvtagdetailDto dto = mappingToDto(entity);
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
    public TTrrcvtagdetail mappingToEntity(TTrrcvtagdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcvtagdetail entity = new TTrrcvtagdetail();
        if (needsMapping(dto, dto.getTrrcvtagdetailId(), "trrcvtagdetailId")) {
            entity.setTrrcvtagdetailId(dto.getTrrcvtagdetailId());
        }
        if (needsMapping(dto, dto.getRcvtagkey(), "rcvtagkey")) {
            entity.setRcvtagkey(dto.getRcvtagkey());
        }
        if (needsMapping(dto, dto.getAcceptkey(), "acceptkey")) {
            entity.setAcceptkey(dto.getAcceptkey());
        }
        if (needsMapping(dto, dto.getAcceptlineno(), "acceptlineno")) {
            entity.setAcceptlineno(dto.getAcceptlineno());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getSts(), "sts")) {
            entity.setSts(dto.getSts());
        }
        if (needsMapping(dto, dto.getOwnercd(), "ownercd")) {
            entity.setOwnercd(dto.getOwnercd());
        }
        if (needsMapping(dto, dto.getItemadmin(), "itemadmin")) {
            entity.setItemadmin(dto.getItemadmin());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
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
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
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
        if (needsMapping(dto, dto.getLogisticscd(), "logisticscd")) {
            entity.setLogisticscd(dto.getLogisticscd());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getSlotflg(), "slotflg")) {
            entity.setSlotflg(dto.getSlotflg());
        }
        if (needsMapping(dto, dto.getToloccd(), "toloccd")) {
            entity.setToloccd(dto.getToloccd());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getLotkey(), "lotkey")) {
            entity.setLotkey(dto.getLotkey());
        }
        if (needsMapping(dto, dto.getTagcd(), "tagcd")) {
            entity.setTagcd(dto.getTagcd());
        }
        if (needsMapping(dto, dto.getOddsflg(), "oddsflg")) {
            entity.setOddsflg(dto.getOddsflg());
        }
        if (needsMapping(dto, dto.getInstructqty1(), "instructqty1")) {
            entity.setInstructqty1(dto.getInstructqty1());
        }
        if (needsMapping(dto, dto.getInstructqty2(), "instructqty2")) {
            entity.setInstructqty2(dto.getInstructqty2());
        }
        if (needsMapping(dto, dto.getInstructqty3(), "instructqty3")) {
            entity.setInstructqty3(dto.getInstructqty3());
        }
        if (needsMapping(dto, dto.getLoadqty1(), "loadqty1")) {
            entity.setLoadqty1(dto.getLoadqty1());
        }
        if (needsMapping(dto, dto.getLoadqty2(), "loadqty2")) {
            entity.setLoadqty2(dto.getLoadqty2());
        }
        if (needsMapping(dto, dto.getLoadqty3(), "loadqty3")) {
            entity.setLoadqty3(dto.getLoadqty3());
        }
        if (needsMapping(dto, dto.getLabelprintedflg(), "labelprintedflg")) {
            entity.setLabelprintedflg(dto.getLabelprintedflg());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getSokey(), "sokey")) {
            entity.setSokey(dto.getSokey());
        }
        if (needsMapping(dto, dto.getSolineno(), "solineno")) {
            entity.setSolineno(dto.getSolineno());
        }
        if (needsMapping(dto, dto.getTriggertype(), "triggertype")) {
            entity.setTriggertype(dto.getTriggertype());
        }
        if (needsMapping(dto, dto.getProspectflg(), "prospectflg")) {
            entity.setProspectflg(dto.getProspectflg());
        }
        if (needsMapping(dto, dto.getProspectupdateflg(), "prospectupdateflg")) {
            entity.setProspectupdateflg(dto.getProspectupdateflg());
        }
        if (needsMapping(dto, dto.getSlottype(), "slottype")) {
            entity.setSlottype(dto.getSlottype());
        }
        if (needsMapping(dto, dto.getSlottedusercd(), "slottedusercd")) {
            entity.setSlottedusercd(dto.getSlottedusercd());
        }
        if (needsMapping(dto, dto.getXdockorderkey(), "xdockorderkey")) {
            entity.setXdockorderkey(dto.getXdockorderkey());
        }
        if (needsMapping(dto, dto.getPickkey(), "pickkey")) {
            entity.setPickkey(dto.getPickkey());
        }
        if (needsMapping(dto, dto.getFullpalletkey(), "fullpalletkey")) {
            entity.setFullpalletkey(dto.getFullpalletkey());
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
    protected boolean needsMapping(TTrrcvtagdetailDto dto, Object value, String propName) {
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
    public List<TTrrcvtagdetail> mappingToEntityList(List<TTrrcvtagdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrrcvtagdetail> entityList = new ArrayList<TTrrcvtagdetail>();
        for (TTrrcvtagdetailDto dto : dtoList) {
            TTrrcvtagdetail entity = mappingToEntity(dto);
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
    public TTrrcvtagdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrrcvtagdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrrcvtagdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrrcvtagdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrrcvtagdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrrcvtagdetailDtoMapper)this;
    }
}

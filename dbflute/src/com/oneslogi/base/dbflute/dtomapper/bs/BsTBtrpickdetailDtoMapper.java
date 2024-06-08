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
 * The DTO mapper of T_BTRPICKDETAIL as TABLE. <br>
 * ピッキング指示明細
 * <pre>
 * [primary-key]
 *     PICKING_INST_DETAIL_ID
 *
 * [column]
 *     PICKING_INST_DETAIL_ID, PICKING_INST_ID, PICKBATCHLINENO, SOID, SODETAILID, STS, PRODUCT_ID, IF_PRODUCT_ID, LOT_ID, LOCATION_ID, LOCGROUP, LOCTYPE, PICKTYPE, ALLOCTYPE, TAGCD, ACTUALTAGCD, FROM_LOCATION_ID, FROMTAGCD, TO_LOCATION_ID, TOTAGCD, EXPECTQTY1, PICKEDQTY1, PALLETTYPE, SORTEDQTY1, SHIPPEDQTY1, RCVKEY, RCVLINENO, PICKUSERCD, LOTRESERVEFLG, LABELPRINTEDFLG, ALLOCSTYLETYPE, FULLPALLETKEY, PICKINGUNIT, WORKALLOCATEID, WORKALLOCATENAME, ALERTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
public abstract class BsTBtrpickdetailDtoMapper implements DtoMapper<TBtrpickdetail, TBtrpickdetailDto>, Serializable {

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
    public BsTBtrpickdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTBtrpickdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TBtrpickdetailDto mappingToDto(TBtrpickdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBtrpickdetailDto dto = new TBtrpickdetailDto();
        dto.setPickingInstDetailId(entity.getPickingInstDetailId());
        dto.setPickingInstId(entity.getPickingInstId());
        dto.setPickbatchlineno(entity.getPickbatchlineno());
        dto.setSoid(entity.getSoid());
        dto.setSodetailid(entity.getSodetailid());
        dto.setSts(entity.getSts());
        dto.setProductId(entity.getProductId());
        dto.setIfProductId(entity.getIfProductId());
        dto.setLotId(entity.getLotId());
        dto.setLocationId(entity.getLocationId());
        dto.setLocgroup(entity.getLocgroup());
        dto.setLoctype(entity.getLoctype());
        dto.setPicktype(entity.getPicktype());
        dto.setAlloctype(entity.getAlloctype());
        dto.setTagcd(entity.getTagcd());
        dto.setActualtagcd(entity.getActualtagcd());
        dto.setFromLocationId(entity.getFromLocationId());
        dto.setFromtagcd(entity.getFromtagcd());
        dto.setToLocationId(entity.getToLocationId());
        dto.setTotagcd(entity.getTotagcd());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setPickedqty1(entity.getPickedqty1());
        dto.setPallettype(entity.getPallettype());
        dto.setSortedqty1(entity.getSortedqty1());
        dto.setShippedqty1(entity.getShippedqty1());
        dto.setRcvkey(entity.getRcvkey());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setPickusercd(entity.getPickusercd());
        dto.setLotreserveflg(entity.getLotreserveflg());
        dto.setLabelprintedflg(entity.getLabelprintedflg());
        dto.setAllocstyletype(entity.getAllocstyletype());
        dto.setFullpalletkey(entity.getFullpalletkey());
        dto.setPickingunit(entity.getPickingunit());
        dto.setWorkallocateid(entity.getWorkallocateid());
        dto.setWorkallocatename(entity.getWorkallocatename());
        dto.setAlertflg(entity.getAlertflg());
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
    public List<TBtrpickdetailDto> mappingToDtoList(List<TBtrpickdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TBtrpickdetailDto> dtoList = new ArrayList<TBtrpickdetailDto>();
        for (TBtrpickdetail entity : entityList) {
            TBtrpickdetailDto dto = mappingToDto(entity);
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
    public TBtrpickdetail mappingToEntity(TBtrpickdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TBtrpickdetail entity = new TBtrpickdetail();
        if (needsMapping(dto, dto.getPickingInstDetailId(), "pickingInstDetailId")) {
            entity.setPickingInstDetailId(dto.getPickingInstDetailId());
        }
        if (needsMapping(dto, dto.getPickingInstId(), "pickingInstId")) {
            entity.setPickingInstId(dto.getPickingInstId());
        }
        if (needsMapping(dto, dto.getPickbatchlineno(), "pickbatchlineno")) {
            entity.setPickbatchlineno(dto.getPickbatchlineno());
        }
        if (needsMapping(dto, dto.getSoid(), "soid")) {
            entity.setSoid(dto.getSoid());
        }
        if (needsMapping(dto, dto.getSodetailid(), "sodetailid")) {
            entity.setSodetailid(dto.getSodetailid());
        }
        if (needsMapping(dto, dto.getSts(), "sts")) {
            entity.setSts(dto.getSts());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getIfProductId(), "ifProductId")) {
            entity.setIfProductId(dto.getIfProductId());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLocgroup(), "locgroup")) {
            entity.setLocgroup(dto.getLocgroup());
        }
        if (needsMapping(dto, dto.getLoctype(), "loctype")) {
            entity.setLoctype(dto.getLoctype());
        }
        if (needsMapping(dto, dto.getPicktype(), "picktype")) {
            entity.setPicktype(dto.getPicktype());
        }
        if (needsMapping(dto, dto.getAlloctype(), "alloctype")) {
            entity.setAlloctype(dto.getAlloctype());
        }
        if (needsMapping(dto, dto.getTagcd(), "tagcd")) {
            entity.setTagcd(dto.getTagcd());
        }
        if (needsMapping(dto, dto.getActualtagcd(), "actualtagcd")) {
            entity.setActualtagcd(dto.getActualtagcd());
        }
        if (needsMapping(dto, dto.getFromLocationId(), "fromLocationId")) {
            entity.setFromLocationId(dto.getFromLocationId());
        }
        if (needsMapping(dto, dto.getFromtagcd(), "fromtagcd")) {
            entity.setFromtagcd(dto.getFromtagcd());
        }
        if (needsMapping(dto, dto.getToLocationId(), "toLocationId")) {
            entity.setToLocationId(dto.getToLocationId());
        }
        if (needsMapping(dto, dto.getTotagcd(), "totagcd")) {
            entity.setTotagcd(dto.getTotagcd());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getPickedqty1(), "pickedqty1")) {
            entity.setPickedqty1(dto.getPickedqty1());
        }
        if (needsMapping(dto, dto.getPallettype(), "pallettype")) {
            entity.setPallettype(dto.getPallettype());
        }
        if (needsMapping(dto, dto.getSortedqty1(), "sortedqty1")) {
            entity.setSortedqty1(dto.getSortedqty1());
        }
        if (needsMapping(dto, dto.getShippedqty1(), "shippedqty1")) {
            entity.setShippedqty1(dto.getShippedqty1());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getPickusercd(), "pickusercd")) {
            entity.setPickusercd(dto.getPickusercd());
        }
        if (needsMapping(dto, dto.getLotreserveflg(), "lotreserveflg")) {
            entity.setLotreserveflg(dto.getLotreserveflg());
        }
        if (needsMapping(dto, dto.getLabelprintedflg(), "labelprintedflg")) {
            entity.setLabelprintedflg(dto.getLabelprintedflg());
        }
        if (needsMapping(dto, dto.getAllocstyletype(), "allocstyletype")) {
            entity.setAllocstyletype(dto.getAllocstyletype());
        }
        if (needsMapping(dto, dto.getFullpalletkey(), "fullpalletkey")) {
            entity.setFullpalletkey(dto.getFullpalletkey());
        }
        if (needsMapping(dto, dto.getPickingunit(), "pickingunit")) {
            entity.setPickingunit(dto.getPickingunit());
        }
        if (needsMapping(dto, dto.getWorkallocateid(), "workallocateid")) {
            entity.setWorkallocateid(dto.getWorkallocateid());
        }
        if (needsMapping(dto, dto.getWorkallocatename(), "workallocatename")) {
            entity.setWorkallocatename(dto.getWorkallocatename());
        }
        if (needsMapping(dto, dto.getAlertflg(), "alertflg")) {
            entity.setAlertflg(dto.getAlertflg());
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
    protected boolean needsMapping(TBtrpickdetailDto dto, Object value, String propName) {
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
    public List<TBtrpickdetail> mappingToEntityList(List<TBtrpickdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TBtrpickdetail> entityList = new ArrayList<TBtrpickdetail>();
        for (TBtrpickdetailDto dto : dtoList) {
            TBtrpickdetail entity = mappingToEntity(dto);
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
    public TBtrpickdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TBtrpickdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TBtrpickdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TBtrpickdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TBtrpickdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TBtrpickdetailDtoMapper)this;
    }
}

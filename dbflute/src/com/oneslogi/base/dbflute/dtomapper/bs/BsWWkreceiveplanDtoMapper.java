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
 * The DTO mapper of W_WKRECEIVEPLAN as TABLE. <br>
 * 格納先予定リスト情報
 * <pre>
 * [primary-key]
 *     W_WKRECEIVEPLAN_ID
 *
 * [column]
 *     W_WKRECEIVEPLAN_ID, PRINTKEY, LINE_NO, RECEIVE_PLAN_H_ID, RCVLINENO, WAREHOUSECD, WAREHOUSE_SNAME, SLOTLOCNAME, RCVSCHDATE, RECEIVE_LOT4, RECEIVE_LOT3, LOCATION_CD, CASEQTY_CAPACITY, FLOOR, FROMFAX, FROMPHONE, SUPPLIERRCVNO, PRODUCT_CD, ITEMNAME, ZONE, EXPECTQTY, RCVPAL, RCVCASE, LOT1, LOT4, LOT3, QTYCASE, QTYBOWL, QTYPAL, INOUTKBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkreceiveplanDtoMapper implements DtoMapper<WWkreceiveplan, WWkreceiveplanDto>, Serializable {

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
    public BsWWkreceiveplanDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWWkreceiveplanDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WWkreceiveplanDto mappingToDto(WWkreceiveplan entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkreceiveplanDto dto = new WWkreceiveplanDto();
        dto.setWWkreceiveplanId(entity.getWWkreceiveplanId());
        dto.setPrintkey(entity.getPrintkey());
        dto.setLineNo(entity.getLineNo());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setWarehouseSname(entity.getWarehouseSname());
        dto.setSlotlocname(entity.getSlotlocname());
        dto.setRcvschdate(entity.getRcvschdate());
        dto.setReceiveLot4(entity.getReceiveLot4());
        dto.setReceiveLot3(entity.getReceiveLot3());
        dto.setLocationCd(entity.getLocationCd());
        dto.setCaseqtyCapacity(entity.getCaseqtyCapacity());
        dto.setFloor(entity.getFloor());
        dto.setFromfax(entity.getFromfax());
        dto.setFromphone(entity.getFromphone());
        dto.setSupplierrcvno(entity.getSupplierrcvno());
        dto.setProductCd(entity.getProductCd());
        dto.setItemname(entity.getItemname());
        dto.setZone(entity.getZone());
        dto.setExpectqty(entity.getExpectqty());
        dto.setRcvpal(entity.getRcvpal());
        dto.setRcvcase(entity.getRcvcase());
        dto.setLot1(entity.getLot1());
        dto.setLot4(entity.getLot4());
        dto.setLot3(entity.getLot3());
        dto.setQtycase(entity.getQtycase());
        dto.setQtybowl(entity.getQtybowl());
        dto.setQtypal(entity.getQtypal());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setItemOrderby(entity.getItemOrderby());
        dto.setPrintpageno(entity.getPrintpageno());
        dto.setSeqsortkey(entity.getSeqsortkey());
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
    public List<WWkreceiveplanDto> mappingToDtoList(List<WWkreceiveplan> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WWkreceiveplanDto> dtoList = new ArrayList<WWkreceiveplanDto>();
        for (WWkreceiveplan entity : entityList) {
            WWkreceiveplanDto dto = mappingToDto(entity);
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
    public WWkreceiveplan mappingToEntity(WWkreceiveplanDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkreceiveplan entity = new WWkreceiveplan();
        if (needsMapping(dto, dto.getWWkreceiveplanId(), "WWkreceiveplanId")) {
            entity.setWWkreceiveplanId(dto.getWWkreceiveplanId());
        }
        if (needsMapping(dto, dto.getPrintkey(), "printkey")) {
            entity.setPrintkey(dto.getPrintkey());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getWarehouseSname(), "warehouseSname")) {
            entity.setWarehouseSname(dto.getWarehouseSname());
        }
        if (needsMapping(dto, dto.getSlotlocname(), "slotlocname")) {
            entity.setSlotlocname(dto.getSlotlocname());
        }
        if (needsMapping(dto, dto.getRcvschdate(), "rcvschdate")) {
            entity.setRcvschdate(dto.getRcvschdate());
        }
        if (needsMapping(dto, dto.getReceiveLot4(), "receiveLot4")) {
            entity.setReceiveLot4(dto.getReceiveLot4());
        }
        if (needsMapping(dto, dto.getReceiveLot3(), "receiveLot3")) {
            entity.setReceiveLot3(dto.getReceiveLot3());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getCaseqtyCapacity(), "caseqtyCapacity")) {
            entity.setCaseqtyCapacity(dto.getCaseqtyCapacity());
        }
        if (needsMapping(dto, dto.getFloor(), "floor")) {
            entity.setFloor(dto.getFloor());
        }
        if (needsMapping(dto, dto.getFromfax(), "fromfax")) {
            entity.setFromfax(dto.getFromfax());
        }
        if (needsMapping(dto, dto.getFromphone(), "fromphone")) {
            entity.setFromphone(dto.getFromphone());
        }
        if (needsMapping(dto, dto.getSupplierrcvno(), "supplierrcvno")) {
            entity.setSupplierrcvno(dto.getSupplierrcvno());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemname(), "itemname")) {
            entity.setItemname(dto.getItemname());
        }
        if (needsMapping(dto, dto.getZone(), "zone")) {
            entity.setZone(dto.getZone());
        }
        if (needsMapping(dto, dto.getExpectqty(), "expectqty")) {
            entity.setExpectqty(dto.getExpectqty());
        }
        if (needsMapping(dto, dto.getRcvpal(), "rcvpal")) {
            entity.setRcvpal(dto.getRcvpal());
        }
        if (needsMapping(dto, dto.getRcvcase(), "rcvcase")) {
            entity.setRcvcase(dto.getRcvcase());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getQtycase(), "qtycase")) {
            entity.setQtycase(dto.getQtycase());
        }
        if (needsMapping(dto, dto.getQtybowl(), "qtybowl")) {
            entity.setQtybowl(dto.getQtybowl());
        }
        if (needsMapping(dto, dto.getQtypal(), "qtypal")) {
            entity.setQtypal(dto.getQtypal());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getItemOrderby(), "itemOrderby")) {
            entity.setItemOrderby(dto.getItemOrderby());
        }
        if (needsMapping(dto, dto.getPrintpageno(), "printpageno")) {
            entity.setPrintpageno(dto.getPrintpageno());
        }
        if (needsMapping(dto, dto.getSeqsortkey(), "seqsortkey")) {
            entity.setSeqsortkey(dto.getSeqsortkey());
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
    protected boolean needsMapping(WWkreceiveplanDto dto, Object value, String propName) {
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
    public List<WWkreceiveplan> mappingToEntityList(List<WWkreceiveplanDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WWkreceiveplan> entityList = new ArrayList<WWkreceiveplan>();
        for (WWkreceiveplanDto dto : dtoList) {
            WWkreceiveplan entity = mappingToEntity(dto);
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
    public WWkreceiveplanDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WWkreceiveplanDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WWkreceiveplanDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WWkreceiveplanDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WWkreceiveplanDtoMapper reverseReference() {
        setReverseReference(true);
        return (WWkreceiveplanDtoMapper)this;
    }
}

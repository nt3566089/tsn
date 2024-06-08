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
 * The DTO mapper of T_TRRCVEXTEND as TABLE. <br>
 * 入庫予定拡張情報
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, SBWAREHOUSECD, IINO, RCVSCHDATE, CARRIERNO, WAREHOUSECD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, LOT2, EXPECTQTY1, FROMFAX, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, FROMREFNAME, CARRIERNAME, CUSTORDERNO, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, BATNO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_TRRCV
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrrcv
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrrcvextendDtoMapper implements DtoMapper<TTrrcvextend, TTrrcvextendDto>, Serializable {

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
    protected boolean _suppressTTrrcv;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvextendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrrcvextendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrrcvextendDto mappingToDto(TTrrcvextend entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrrcvextendDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcvextendDto dto = new TTrrcvextendDto();
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setSbwarehousecd(entity.getSbwarehousecd());
        dto.setIino(entity.getIino());
        dto.setRcvschdate(entity.getRcvschdate());
        dto.setCarrierno(entity.getCarrierno());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setProductCd(entity.getProductCd());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setFromfax(entity.getFromfax());
        dto.setCarriersname(entity.getCarriersname());
        dto.setCarrierwbno(entity.getCarrierwbno());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setFromrefname(entity.getFromrefname());
        dto.setCarriername(entity.getCarriername());
        dto.setCustorderno(entity.getCustorderno());
        dto.setArrivalportdate(entity.getArrivalportdate());
        dto.setShipname(entity.getShipname());
        dto.setBatdelino(entity.getBatdelino());
        dto.setBatdelidetailno(entity.getBatdelidetailno());
        dto.setBatwarehousecd(entity.getBatwarehousecd());
        dto.setBatkeepwarehousecd(entity.getBatkeepwarehousecd());
        dto.setBatpartnernorcv(entity.getBatpartnernorcv());
        dto.setBatpartnernosnd(entity.getBatpartnernosnd());
        dto.setBatdelidetailnum(entity.getBatdelidetailnum());
        dto.setBatno(entity.getBatno());
        dto.setVaExtdata1(entity.getVaExtdata1());
        dto.setVaExtdata2(entity.getVaExtdata2());
        dto.setVaExtdata3(entity.getVaExtdata3());
        dto.setNvExtdata1(entity.getNvExtdata1());
        dto.setNvExtdata2(entity.getNvExtdata2());
        dto.setNvExtdata3(entity.getNvExtdata3());
        dto.setNmExtdata1(entity.getNmExtdata1());
        dto.setNmExtdata2(entity.getNmExtdata2());
        dto.setNmExtdata3(entity.getNmExtdata3());
        dto.setDtExtdata1(entity.getDtExtdata1());
        dto.setDtExtdata2(entity.getDtExtdata2());
        dto.setDtExtdata3(entity.getDtExtdata3());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTTrrcv && entity.getTTrrcv() != null) {
            TTrrcv relationEntity = entity.getTTrrcv();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrrcvDto relationDto = (TTrrcvDto)cachedDto;
                dto.setTTrrcv(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcvextendAsOne(dto);
                }
            } else {
                TTrrcvDtoMapper mapper = new TTrrcvDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcvextendAsOne();
                TTrrcvDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrrcv(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcvextendAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrrcv());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrrcvextendDto> mappingToDtoList(List<TTrrcvextend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrrcvextendDto> dtoList = new ArrayList<TTrrcvextendDto>();
        for (TTrrcvextend entity : entityList) {
            TTrrcvextendDto dto = mappingToDto(entity);
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
    public TTrrcvextend mappingToEntity(TTrrcvextendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrrcvextend)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcvextend entity = new TTrrcvextend();
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getSbwarehousecd(), "sbwarehousecd")) {
            entity.setSbwarehousecd(dto.getSbwarehousecd());
        }
        if (needsMapping(dto, dto.getIino(), "iino")) {
            entity.setIino(dto.getIino());
        }
        if (needsMapping(dto, dto.getRcvschdate(), "rcvschdate")) {
            entity.setRcvschdate(dto.getRcvschdate());
        }
        if (needsMapping(dto, dto.getCarrierno(), "carrierno")) {
            entity.setCarrierno(dto.getCarrierno());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getFromfax(), "fromfax")) {
            entity.setFromfax(dto.getFromfax());
        }
        if (needsMapping(dto, dto.getCarriersname(), "carriersname")) {
            entity.setCarriersname(dto.getCarriersname());
        }
        if (needsMapping(dto, dto.getCarrierwbno(), "carrierwbno")) {
            entity.setCarrierwbno(dto.getCarrierwbno());
        }
        if (needsMapping(dto, dto.getForeigncargoflg(), "foreigncargoflg")) {
            entity.setForeigncargoflg(dto.getForeigncargoflg());
        }
        if (needsMapping(dto, dto.getFromrefname(), "fromrefname")) {
            entity.setFromrefname(dto.getFromrefname());
        }
        if (needsMapping(dto, dto.getCarriername(), "carriername")) {
            entity.setCarriername(dto.getCarriername());
        }
        if (needsMapping(dto, dto.getCustorderno(), "custorderno")) {
            entity.setCustorderno(dto.getCustorderno());
        }
        if (needsMapping(dto, dto.getArrivalportdate(), "arrivalportdate")) {
            entity.setArrivalportdate(dto.getArrivalportdate());
        }
        if (needsMapping(dto, dto.getShipname(), "shipname")) {
            entity.setShipname(dto.getShipname());
        }
        if (needsMapping(dto, dto.getBatdelino(), "batdelino")) {
            entity.setBatdelino(dto.getBatdelino());
        }
        if (needsMapping(dto, dto.getBatdelidetailno(), "batdelidetailno")) {
            entity.setBatdelidetailno(dto.getBatdelidetailno());
        }
        if (needsMapping(dto, dto.getBatwarehousecd(), "batwarehousecd")) {
            entity.setBatwarehousecd(dto.getBatwarehousecd());
        }
        if (needsMapping(dto, dto.getBatkeepwarehousecd(), "batkeepwarehousecd")) {
            entity.setBatkeepwarehousecd(dto.getBatkeepwarehousecd());
        }
        if (needsMapping(dto, dto.getBatpartnernorcv(), "batpartnernorcv")) {
            entity.setBatpartnernorcv(dto.getBatpartnernorcv());
        }
        if (needsMapping(dto, dto.getBatpartnernosnd(), "batpartnernosnd")) {
            entity.setBatpartnernosnd(dto.getBatpartnernosnd());
        }
        if (needsMapping(dto, dto.getBatdelidetailnum(), "batdelidetailnum")) {
            entity.setBatdelidetailnum(dto.getBatdelidetailnum());
        }
        if (needsMapping(dto, dto.getBatno(), "batno")) {
            entity.setBatno(dto.getBatno());
        }
        if (needsMapping(dto, dto.getVaExtdata1(), "vaExtdata1")) {
            entity.setVaExtdata1(dto.getVaExtdata1());
        }
        if (needsMapping(dto, dto.getVaExtdata2(), "vaExtdata2")) {
            entity.setVaExtdata2(dto.getVaExtdata2());
        }
        if (needsMapping(dto, dto.getVaExtdata3(), "vaExtdata3")) {
            entity.setVaExtdata3(dto.getVaExtdata3());
        }
        if (needsMapping(dto, dto.getNvExtdata1(), "nvExtdata1")) {
            entity.setNvExtdata1(dto.getNvExtdata1());
        }
        if (needsMapping(dto, dto.getNvExtdata2(), "nvExtdata2")) {
            entity.setNvExtdata2(dto.getNvExtdata2());
        }
        if (needsMapping(dto, dto.getNvExtdata3(), "nvExtdata3")) {
            entity.setNvExtdata3(dto.getNvExtdata3());
        }
        if (needsMapping(dto, dto.getNmExtdata1(), "nmExtdata1")) {
            entity.setNmExtdata1(dto.getNmExtdata1());
        }
        if (needsMapping(dto, dto.getNmExtdata2(), "nmExtdata2")) {
            entity.setNmExtdata2(dto.getNmExtdata2());
        }
        if (needsMapping(dto, dto.getNmExtdata3(), "nmExtdata3")) {
            entity.setNmExtdata3(dto.getNmExtdata3());
        }
        if (needsMapping(dto, dto.getDtExtdata1(), "dtExtdata1")) {
            entity.setDtExtdata1(dto.getDtExtdata1());
        }
        if (needsMapping(dto, dto.getDtExtdata2(), "dtExtdata2")) {
            entity.setDtExtdata2(dto.getDtExtdata2());
        }
        if (needsMapping(dto, dto.getDtExtdata3(), "dtExtdata3")) {
            entity.setDtExtdata3(dto.getDtExtdata3());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTTrrcv && dto.getTTrrcv() != null) {
            TTrrcvDto relationDto = dto.getTTrrcv();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrrcv relationEntity = (TTrrcv)cachedEntity;
                entity.setTTrrcv(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcvextendAsOne(entity);
                }
            } else {
                TTrrcvDtoMapper mapper = new TTrrcvDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcvextendAsOne();
                TTrrcv relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrrcv(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcvextendAsOne(entity);
                }
                if (instanceCache && entity.getTTrrcv().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrrcv());
                }
            }
        };
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
    protected boolean needsMapping(TTrrcvextendDto dto, Object value, String propName) {
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
    public List<TTrrcvextend> mappingToEntityList(List<TTrrcvextendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrrcvextend> entityList = new ArrayList<TTrrcvextend>();
        for (TTrrcvextendDto dto : dtoList) {
            TTrrcvextend entity = mappingToEntity(dto);
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
    public void suppressTTrrcv() {
        _suppressTTrrcv = true;
    }
    protected void doSuppressAll() { // internal
        suppressTTrrcv();
    }
    protected void doSuppressClear() { // internal
        _suppressTTrrcv = false;
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
    public TTrrcvextendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrrcvextendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrrcvextendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrrcvextendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrrcvextendDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrrcvextendDtoMapper)this;
    }
}

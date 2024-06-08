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
 * The DTO mapper of T_TRPALLET as TABLE. <br>
 * パレットはり紙情報
 * <pre>
 * [primary-key]
 *     TRPALLET_ID
 *
 * [column]
 *     TRPALLET_ID, PALLET_NO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, MANUFACTURE_DATE, BATARTICLESIGN, STOCK_TYPE_CD, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_PALLET
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tPalletList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrpalletDtoMapper implements DtoMapper<TTrpallet, TTrpalletDto>, Serializable {

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
    protected boolean _suppressTPalletList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpalletDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrpalletDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrpalletDto mappingToDto(TTrpallet entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrpalletDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpalletDto dto = new TTrpalletDto();
        dto.setTrpalletId(entity.getTrpalletId());
        dto.setPalletNo(entity.getPalletNo());
        dto.setLotId(entity.getLotId());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setPrintedflg(entity.getPrintedflg());
        dto.setPrintingdate(entity.getPrintingdate());
        dto.setFirmcarryno(entity.getFirmcarryno());
        dto.setTransportno(entity.getTransportno());
        dto.setSourcecd(entity.getSourcecd());
        dto.setSchdate(entity.getSchdate());
        dto.setReceivecd(entity.getReceivecd());
        dto.setRcvdate(entity.getRcvdate());
        dto.setReceivedate(entity.getReceivedate());
        dto.setLocationId(entity.getLocationId());
        dto.setProductCd(entity.getProductCd());
        dto.setLot3(entity.getLot3());
        dto.setManufactureDate(entity.getManufactureDate());
        dto.setBatarticlesign(entity.getBatarticlesign());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setReceiveqtycase(entity.getReceiveqtycase());
        dto.setReceiveqtybowl(entity.getReceiveqtybowl());
        dto.setReceiveqty(entity.getReceiveqty());
        dto.setRestqtycase(entity.getRestqtycase());
        dto.setRestqtybowl(entity.getRestqtybowl());
        dto.setRestqty(entity.getRestqty());
        dto.setAllocqty1(entity.getAllocqty1());
        dto.setFullpalletflg(entity.getFullpalletflg());
        dto.setPalletsts(entity.getPalletsts());
        dto.setPluralproductionkbn(entity.getPluralproductionkbn());
        dto.setPalletcuttingkbn(entity.getPalletcuttingkbn());
        dto.setRcvpalletno(entity.getRcvpalletno());
        dto.setPalletaddflg(entity.getPalletaddflg());
        dto.setAcceptusercd(entity.getAcceptusercd());
        dto.setAcceptdate(entity.getAcceptdate());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
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
        if (!_suppressTPalletList && !entity.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrpallet();
            List<TPalletDto> relationDtoList = mapper.mappingToDtoList(entity.getTPalletList());
            dto.setTPalletList(relationDtoList);
            if (reverseReference) {
                for (TPalletDto relationDto : relationDtoList) {
                    relationDto.setTTrpallet(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrpalletDto> mappingToDtoList(List<TTrpallet> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrpalletDto> dtoList = new ArrayList<TTrpalletDto>();
        for (TTrpallet entity : entityList) {
            TTrpalletDto dto = mappingToDto(entity);
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
    public TTrpallet mappingToEntity(TTrpalletDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrpallet)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpallet entity = new TTrpallet();
        if (needsMapping(dto, dto.getTrpalletId(), "trpalletId")) {
            entity.setTrpalletId(dto.getTrpalletId());
        }
        if (needsMapping(dto, dto.getPalletNo(), "palletNo")) {
            entity.setPalletNo(dto.getPalletNo());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getPrintedflg(), "printedflg")) {
            entity.setPrintedflg(dto.getPrintedflg());
        }
        if (needsMapping(dto, dto.getPrintingdate(), "printingdate")) {
            entity.setPrintingdate(dto.getPrintingdate());
        }
        if (needsMapping(dto, dto.getFirmcarryno(), "firmcarryno")) {
            entity.setFirmcarryno(dto.getFirmcarryno());
        }
        if (needsMapping(dto, dto.getTransportno(), "transportno")) {
            entity.setTransportno(dto.getTransportno());
        }
        if (needsMapping(dto, dto.getSourcecd(), "sourcecd")) {
            entity.setSourcecd(dto.getSourcecd());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getReceivecd(), "receivecd")) {
            entity.setReceivecd(dto.getReceivecd());
        }
        if (needsMapping(dto, dto.getRcvdate(), "rcvdate")) {
            entity.setRcvdate(dto.getRcvdate());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getManufactureDate(), "manufactureDate")) {
            entity.setManufactureDate(dto.getManufactureDate());
        }
        if (needsMapping(dto, dto.getBatarticlesign(), "batarticlesign")) {
            entity.setBatarticlesign(dto.getBatarticlesign());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getReceiveqtycase(), "receiveqtycase")) {
            entity.setReceiveqtycase(dto.getReceiveqtycase());
        }
        if (needsMapping(dto, dto.getReceiveqtybowl(), "receiveqtybowl")) {
            entity.setReceiveqtybowl(dto.getReceiveqtybowl());
        }
        if (needsMapping(dto, dto.getReceiveqty(), "receiveqty")) {
            entity.setReceiveqty(dto.getReceiveqty());
        }
        if (needsMapping(dto, dto.getRestqtycase(), "restqtycase")) {
            entity.setRestqtycase(dto.getRestqtycase());
        }
        if (needsMapping(dto, dto.getRestqtybowl(), "restqtybowl")) {
            entity.setRestqtybowl(dto.getRestqtybowl());
        }
        if (needsMapping(dto, dto.getRestqty(), "restqty")) {
            entity.setRestqty(dto.getRestqty());
        }
        if (needsMapping(dto, dto.getAllocqty1(), "allocqty1")) {
            entity.setAllocqty1(dto.getAllocqty1());
        }
        if (needsMapping(dto, dto.getFullpalletflg(), "fullpalletflg")) {
            entity.setFullpalletflg(dto.getFullpalletflg());
        }
        if (needsMapping(dto, dto.getPalletsts(), "palletsts")) {
            entity.setPalletsts(dto.getPalletsts());
        }
        if (needsMapping(dto, dto.getPluralproductionkbn(), "pluralproductionkbn")) {
            entity.setPluralproductionkbn(dto.getPluralproductionkbn());
        }
        if (needsMapping(dto, dto.getPalletcuttingkbn(), "palletcuttingkbn")) {
            entity.setPalletcuttingkbn(dto.getPalletcuttingkbn());
        }
        if (needsMapping(dto, dto.getRcvpalletno(), "rcvpalletno")) {
            entity.setRcvpalletno(dto.getRcvpalletno());
        }
        if (needsMapping(dto, dto.getPalletaddflg(), "palletaddflg")) {
            entity.setPalletaddflg(dto.getPalletaddflg());
        }
        if (needsMapping(dto, dto.getAcceptusercd(), "acceptusercd")) {
            entity.setAcceptusercd(dto.getAcceptusercd());
        }
        if (needsMapping(dto, dto.getAcceptdate(), "acceptdate")) {
            entity.setAcceptdate(dto.getAcceptdate());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
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
        if (!_suppressTPalletList && !dto.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrpallet();
            List<TPallet> relationEntityList = mapper.mappingToEntityList(dto.getTPalletList());
            entity.setTPalletList(relationEntityList);
            if (reverseReference) {
                for (TPallet relationEntity : relationEntityList) {
                    relationEntity.setTTrpallet(entity);
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
    protected boolean needsMapping(TTrpalletDto dto, Object value, String propName) {
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
    public List<TTrpallet> mappingToEntityList(List<TTrpalletDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrpallet> entityList = new ArrayList<TTrpallet>();
        for (TTrpalletDto dto : dtoList) {
            TTrpallet entity = mappingToEntity(dto);
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
    public void suppressTPalletList() {
        _suppressTPalletList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTPalletList();
    }
    protected void doSuppressClear() { // internal
        _suppressTPalletList = false;
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
    public TTrpalletDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrpalletDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrpalletDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrpalletDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrpalletDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrpalletDtoMapper)this;
    }
}

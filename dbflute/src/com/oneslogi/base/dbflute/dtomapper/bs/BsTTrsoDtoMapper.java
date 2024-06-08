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
 * The DTO mapper of T_TRSO as TABLE. <br>
 * 出庫予定
 * <pre>
 * [primary-key]
 *     SOID
 *
 * [column]
 *     SOID, SOKEY, OWNERSONO, PREOWNERSONO, SOTYPE, PARTFLG, STS, COMPANYCD, ORDERKEY, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, CUSTOMER_CD, RMANO, ORDERDATE, SHIPSCHDATE, SHIPDATE, DELIVSCHDATE, DELIVDATE, CARRYSCHDATE, CARRYOUTDATE, TRANSPORTPRIORITY, SHIPTOCD, SHIPTOSUB, DELIVNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONENO, FAX1, EMAIL, REFNAME, AREACD, ALLOCGROUP, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARCD, CARRIERSEQ, ITEMCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PICKING_INST_ID, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOID
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
public abstract class BsTTrsoDtoMapper implements DtoMapper<TTrso, TTrsoDto>, Serializable {

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
    public BsTTrsoDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsoDto mappingToDto(TTrso entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsoDto dto = new TTrsoDto();
        dto.setSoid(entity.getSoid());
        dto.setSokey(entity.getSokey());
        dto.setOwnersono(entity.getOwnersono());
        dto.setPreownersono(entity.getPreownersono());
        dto.setSotype(entity.getSotype());
        dto.setPartflg(entity.getPartflg());
        dto.setSts(entity.getSts());
        dto.setCompanycd(entity.getCompanycd());
        dto.setOrderkey(entity.getOrderkey());
        dto.setOwnerorderno(entity.getOwnerorderno());
        dto.setOrdertype(entity.getOrdertype());
        dto.setCustorderno(entity.getCustorderno());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setRmano(entity.getRmano());
        dto.setOrderdate(entity.getOrderdate());
        dto.setShipschdate(entity.getShipschdate());
        dto.setShipdate(entity.getShipdate());
        dto.setDelivschdate(entity.getDelivschdate());
        dto.setDelivdate(entity.getDelivdate());
        dto.setCarryschdate(entity.getCarryschdate());
        dto.setCarryoutdate(entity.getCarryoutdate());
        dto.setTransportpriority(entity.getTransportpriority());
        dto.setShiptocd(entity.getShiptocd());
        dto.setShiptosub(entity.getShiptosub());
        dto.setDelivname(entity.getDelivname());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setPostno(entity.getPostno());
        dto.setCountrycd(entity.getCountrycd());
        dto.setPortcd(entity.getPortcd());
        dto.setDistrictcd(entity.getDistrictcd());
        dto.setPhoneno(entity.getPhoneno());
        dto.setFax1(entity.getFax1());
        dto.setEmail(entity.getEmail());
        dto.setRefname(entity.getRefname());
        dto.setAreacd(entity.getAreacd());
        dto.setAllocgroup(entity.getAllocgroup());
        dto.setCarriercd(entity.getCarriercd());
        dto.setCarriername(entity.getCarriername());
        dto.setCarrierwbno(entity.getCarrierwbno());
        dto.setDeliverycd(entity.getDeliverycd());
        dto.setCarrierno(entity.getCarrierno());
        dto.setCarriersname(entity.getCarriersname());
        dto.setCarcd(entity.getCarcd());
        dto.setCarrierseq(entity.getCarrierseq());
        dto.setItemcd(entity.getItemcd());
        dto.setNotes(entity.getNotes());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setOtherrefno2(entity.getOtherrefno2());
        dto.setOtherrefno3(entity.getOtherrefno3());
        dto.setPickingInstId(entity.getPickingInstId());
        dto.setExeckey(entity.getExeckey());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
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
    public List<TTrsoDto> mappingToDtoList(List<TTrso> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsoDto> dtoList = new ArrayList<TTrsoDto>();
        for (TTrso entity : entityList) {
            TTrsoDto dto = mappingToDto(entity);
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
    public TTrso mappingToEntity(TTrsoDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrso entity = new TTrso();
        if (needsMapping(dto, dto.getSoid(), "soid")) {
            entity.setSoid(dto.getSoid());
        }
        if (needsMapping(dto, dto.getSokey(), "sokey")) {
            entity.setSokey(dto.getSokey());
        }
        if (needsMapping(dto, dto.getOwnersono(), "ownersono")) {
            entity.setOwnersono(dto.getOwnersono());
        }
        if (needsMapping(dto, dto.getPreownersono(), "preownersono")) {
            entity.setPreownersono(dto.getPreownersono());
        }
        if (needsMapping(dto, dto.getSotype(), "sotype")) {
            entity.setSotype(dto.getSotype());
        }
        if (needsMapping(dto, dto.getPartflg(), "partflg")) {
            entity.setPartflg(dto.getPartflg());
        }
        if (needsMapping(dto, dto.getSts(), "sts")) {
            entity.setSts(dto.getSts());
        }
        if (needsMapping(dto, dto.getCompanycd(), "companycd")) {
            entity.setCompanycd(dto.getCompanycd());
        }
        if (needsMapping(dto, dto.getOrderkey(), "orderkey")) {
            entity.setOrderkey(dto.getOrderkey());
        }
        if (needsMapping(dto, dto.getOwnerorderno(), "ownerorderno")) {
            entity.setOwnerorderno(dto.getOwnerorderno());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getCustorderno(), "custorderno")) {
            entity.setCustorderno(dto.getCustorderno());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getOrderdate(), "orderdate")) {
            entity.setOrderdate(dto.getOrderdate());
        }
        if (needsMapping(dto, dto.getShipschdate(), "shipschdate")) {
            entity.setShipschdate(dto.getShipschdate());
        }
        if (needsMapping(dto, dto.getShipdate(), "shipdate")) {
            entity.setShipdate(dto.getShipdate());
        }
        if (needsMapping(dto, dto.getDelivschdate(), "delivschdate")) {
            entity.setDelivschdate(dto.getDelivschdate());
        }
        if (needsMapping(dto, dto.getDelivdate(), "delivdate")) {
            entity.setDelivdate(dto.getDelivdate());
        }
        if (needsMapping(dto, dto.getCarryschdate(), "carryschdate")) {
            entity.setCarryschdate(dto.getCarryschdate());
        }
        if (needsMapping(dto, dto.getCarryoutdate(), "carryoutdate")) {
            entity.setCarryoutdate(dto.getCarryoutdate());
        }
        if (needsMapping(dto, dto.getTransportpriority(), "transportpriority")) {
            entity.setTransportpriority(dto.getTransportpriority());
        }
        if (needsMapping(dto, dto.getShiptocd(), "shiptocd")) {
            entity.setShiptocd(dto.getShiptocd());
        }
        if (needsMapping(dto, dto.getShiptosub(), "shiptosub")) {
            entity.setShiptosub(dto.getShiptosub());
        }
        if (needsMapping(dto, dto.getDelivname(), "delivname")) {
            entity.setDelivname(dto.getDelivname());
        }
        if (needsMapping(dto, dto.getAddress1(), "address1")) {
            entity.setAddress1(dto.getAddress1());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAddress3(), "address3")) {
            entity.setAddress3(dto.getAddress3());
        }
        if (needsMapping(dto, dto.getPostno(), "postno")) {
            entity.setPostno(dto.getPostno());
        }
        if (needsMapping(dto, dto.getCountrycd(), "countrycd")) {
            entity.setCountrycd(dto.getCountrycd());
        }
        if (needsMapping(dto, dto.getPortcd(), "portcd")) {
            entity.setPortcd(dto.getPortcd());
        }
        if (needsMapping(dto, dto.getDistrictcd(), "districtcd")) {
            entity.setDistrictcd(dto.getDistrictcd());
        }
        if (needsMapping(dto, dto.getPhoneno(), "phoneno")) {
            entity.setPhoneno(dto.getPhoneno());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getEmail(), "email")) {
            entity.setEmail(dto.getEmail());
        }
        if (needsMapping(dto, dto.getRefname(), "refname")) {
            entity.setRefname(dto.getRefname());
        }
        if (needsMapping(dto, dto.getAreacd(), "areacd")) {
            entity.setAreacd(dto.getAreacd());
        }
        if (needsMapping(dto, dto.getAllocgroup(), "allocgroup")) {
            entity.setAllocgroup(dto.getAllocgroup());
        }
        if (needsMapping(dto, dto.getCarriercd(), "carriercd")) {
            entity.setCarriercd(dto.getCarriercd());
        }
        if (needsMapping(dto, dto.getCarriername(), "carriername")) {
            entity.setCarriername(dto.getCarriername());
        }
        if (needsMapping(dto, dto.getCarrierwbno(), "carrierwbno")) {
            entity.setCarrierwbno(dto.getCarrierwbno());
        }
        if (needsMapping(dto, dto.getDeliverycd(), "deliverycd")) {
            entity.setDeliverycd(dto.getDeliverycd());
        }
        if (needsMapping(dto, dto.getCarrierno(), "carrierno")) {
            entity.setCarrierno(dto.getCarrierno());
        }
        if (needsMapping(dto, dto.getCarriersname(), "carriersname")) {
            entity.setCarriersname(dto.getCarriersname());
        }
        if (needsMapping(dto, dto.getCarcd(), "carcd")) {
            entity.setCarcd(dto.getCarcd());
        }
        if (needsMapping(dto, dto.getCarrierseq(), "carrierseq")) {
            entity.setCarrierseq(dto.getCarrierseq());
        }
        if (needsMapping(dto, dto.getItemcd(), "itemcd")) {
            entity.setItemcd(dto.getItemcd());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
        }
        if (needsMapping(dto, dto.getOtherrefno2(), "otherrefno2")) {
            entity.setOtherrefno2(dto.getOtherrefno2());
        }
        if (needsMapping(dto, dto.getOtherrefno3(), "otherrefno3")) {
            entity.setOtherrefno3(dto.getOtherrefno3());
        }
        if (needsMapping(dto, dto.getPickingInstId(), "pickingInstId")) {
            entity.setPickingInstId(dto.getPickingInstId());
        }
        if (needsMapping(dto, dto.getExeckey(), "execkey")) {
            entity.setExeckey(dto.getExeckey());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
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
    protected boolean needsMapping(TTrsoDto dto, Object value, String propName) {
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
    public List<TTrso> mappingToEntityList(List<TTrsoDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrso> entityList = new ArrayList<TTrso>();
        for (TTrsoDto dto : dtoList) {
            TTrso entity = mappingToEntity(dto);
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
    public TTrsoDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsoDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsoDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsoDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsoDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsoDtoMapper)this;
    }
}

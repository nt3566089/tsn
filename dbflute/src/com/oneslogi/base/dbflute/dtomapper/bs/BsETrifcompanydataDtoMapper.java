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
 * The DTO mapper of E_TRIFCOMPANYDATA as TABLE. <br>
 * IF組織
 * <pre>
 * [primary-key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, COMPANYCD, ITEMADMIN, COMPANYGROUP, ACTFLG, NAME, SNAME, ANAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONE1, PHONE2, FAX1, FAX2, REFNAME, EMAIL, URL, TYPEOWNER, TYPECUSTOMER, TYPESHIPTO, TYPESUPPLIER, TYPEWAREHOUSE, TYPECARRIER, TYPEETC, OWNORANOTHERFLG, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, TRANSPORTPRIORITY, PURCHASETYPE, CALENDARCD, OWNERCUSTOMERCD, OWNERSUPPLIERCD, OWNERREFFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsETrifcompanydataDtoMapper implements DtoMapper<ETrifcompanydata, ETrifcompanydataDto>, Serializable {

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
    public BsETrifcompanydataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsETrifcompanydataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ETrifcompanydataDto mappingToDto(ETrifcompanydata entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrifcompanydataDto dto = new ETrifcompanydataDto();
        dto.setIfdatakey(entity.getIfdatakey());
        dto.setSegname(entity.getSegname());
        dto.setRefno(entity.getRefno());
        dto.setCompanycd(entity.getCompanycd());
        dto.setItemadmin(entity.getItemadmin());
        dto.setCompanygroup(entity.getCompanygroup());
        dto.setActflg(entity.getActflg());
        dto.setName(entity.getName());
        dto.setSname(entity.getSname());
        dto.setAname(entity.getAname());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setPostno(entity.getPostno());
        dto.setCountrycd(entity.getCountrycd());
        dto.setPortcd(entity.getPortcd());
        dto.setDistrictcd(entity.getDistrictcd());
        dto.setPhone1(entity.getPhone1());
        dto.setPhone2(entity.getPhone2());
        dto.setFax1(entity.getFax1());
        dto.setFax2(entity.getFax2());
        dto.setRefname(entity.getRefname());
        dto.setEmail(entity.getEmail());
        dto.setUrl(entity.getUrl());
        dto.setTypeowner(entity.getTypeowner());
        dto.setTypecustomer(entity.getTypecustomer());
        dto.setTypeshipto(entity.getTypeshipto());
        dto.setTypesupplier(entity.getTypesupplier());
        dto.setTypewarehouse(entity.getTypewarehouse());
        dto.setTypecarrier(entity.getTypecarrier());
        dto.setTypeetc(entity.getTypeetc());
        dto.setOwnoranotherflg(entity.getOwnoranotherflg());
        dto.setNotes(entity.getNotes());
        dto.setFUser1(entity.getFUser1());
        dto.setFUser2(entity.getFUser2());
        dto.setFUser3(entity.getFUser3());
        dto.setFUser4(entity.getFUser4());
        dto.setFUser5(entity.getFUser5());
        dto.setTransportpriority(entity.getTransportpriority());
        dto.setPurchasetype(entity.getPurchasetype());
        dto.setCalendarcd(entity.getCalendarcd());
        dto.setOwnercustomercd(entity.getOwnercustomercd());
        dto.setOwnersuppliercd(entity.getOwnersuppliercd());
        dto.setOwnerrefflg(entity.getOwnerrefflg());
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
    public List<ETrifcompanydataDto> mappingToDtoList(List<ETrifcompanydata> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ETrifcompanydataDto> dtoList = new ArrayList<ETrifcompanydataDto>();
        for (ETrifcompanydata entity : entityList) {
            ETrifcompanydataDto dto = mappingToDto(entity);
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
    public ETrifcompanydata mappingToEntity(ETrifcompanydataDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrifcompanydata entity = new ETrifcompanydata();
        if (needsMapping(dto, dto.getIfdatakey(), "ifdatakey")) {
            entity.setIfdatakey(dto.getIfdatakey());
        }
        if (needsMapping(dto, dto.getSegname(), "segname")) {
            entity.setSegname(dto.getSegname());
        }
        if (needsMapping(dto, dto.getRefno(), "refno")) {
            entity.setRefno(dto.getRefno());
        }
        if (needsMapping(dto, dto.getCompanycd(), "companycd")) {
            entity.setCompanycd(dto.getCompanycd());
        }
        if (needsMapping(dto, dto.getItemadmin(), "itemadmin")) {
            entity.setItemadmin(dto.getItemadmin());
        }
        if (needsMapping(dto, dto.getCompanygroup(), "companygroup")) {
            entity.setCompanygroup(dto.getCompanygroup());
        }
        if (needsMapping(dto, dto.getActflg(), "actflg")) {
            entity.setActflg(dto.getActflg());
        }
        if (needsMapping(dto, dto.getName(), "name")) {
            entity.setName(dto.getName());
        }
        if (needsMapping(dto, dto.getSname(), "sname")) {
            entity.setSname(dto.getSname());
        }
        if (needsMapping(dto, dto.getAname(), "aname")) {
            entity.setAname(dto.getAname());
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
        if (needsMapping(dto, dto.getPhone1(), "phone1")) {
            entity.setPhone1(dto.getPhone1());
        }
        if (needsMapping(dto, dto.getPhone2(), "phone2")) {
            entity.setPhone2(dto.getPhone2());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getFax2(), "fax2")) {
            entity.setFax2(dto.getFax2());
        }
        if (needsMapping(dto, dto.getRefname(), "refname")) {
            entity.setRefname(dto.getRefname());
        }
        if (needsMapping(dto, dto.getEmail(), "email")) {
            entity.setEmail(dto.getEmail());
        }
        if (needsMapping(dto, dto.getUrl(), "url")) {
            entity.setUrl(dto.getUrl());
        }
        if (needsMapping(dto, dto.getTypeowner(), "typeowner")) {
            entity.setTypeowner(dto.getTypeowner());
        }
        if (needsMapping(dto, dto.getTypecustomer(), "typecustomer")) {
            entity.setTypecustomer(dto.getTypecustomer());
        }
        if (needsMapping(dto, dto.getTypeshipto(), "typeshipto")) {
            entity.setTypeshipto(dto.getTypeshipto());
        }
        if (needsMapping(dto, dto.getTypesupplier(), "typesupplier")) {
            entity.setTypesupplier(dto.getTypesupplier());
        }
        if (needsMapping(dto, dto.getTypewarehouse(), "typewarehouse")) {
            entity.setTypewarehouse(dto.getTypewarehouse());
        }
        if (needsMapping(dto, dto.getTypecarrier(), "typecarrier")) {
            entity.setTypecarrier(dto.getTypecarrier());
        }
        if (needsMapping(dto, dto.getTypeetc(), "typeetc")) {
            entity.setTypeetc(dto.getTypeetc());
        }
        if (needsMapping(dto, dto.getOwnoranotherflg(), "ownoranotherflg")) {
            entity.setOwnoranotherflg(dto.getOwnoranotherflg());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getFUser1(), "FUser1")) {
            entity.setFUser1(dto.getFUser1());
        }
        if (needsMapping(dto, dto.getFUser2(), "FUser2")) {
            entity.setFUser2(dto.getFUser2());
        }
        if (needsMapping(dto, dto.getFUser3(), "FUser3")) {
            entity.setFUser3(dto.getFUser3());
        }
        if (needsMapping(dto, dto.getFUser4(), "FUser4")) {
            entity.setFUser4(dto.getFUser4());
        }
        if (needsMapping(dto, dto.getFUser5(), "FUser5")) {
            entity.setFUser5(dto.getFUser5());
        }
        if (needsMapping(dto, dto.getTransportpriority(), "transportpriority")) {
            entity.setTransportpriority(dto.getTransportpriority());
        }
        if (needsMapping(dto, dto.getPurchasetype(), "purchasetype")) {
            entity.setPurchasetype(dto.getPurchasetype());
        }
        if (needsMapping(dto, dto.getCalendarcd(), "calendarcd")) {
            entity.setCalendarcd(dto.getCalendarcd());
        }
        if (needsMapping(dto, dto.getOwnercustomercd(), "ownercustomercd")) {
            entity.setOwnercustomercd(dto.getOwnercustomercd());
        }
        if (needsMapping(dto, dto.getOwnersuppliercd(), "ownersuppliercd")) {
            entity.setOwnersuppliercd(dto.getOwnersuppliercd());
        }
        if (needsMapping(dto, dto.getOwnerrefflg(), "ownerrefflg")) {
            entity.setOwnerrefflg(dto.getOwnerrefflg());
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
    protected boolean needsMapping(ETrifcompanydataDto dto, Object value, String propName) {
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
    public List<ETrifcompanydata> mappingToEntityList(List<ETrifcompanydataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ETrifcompanydata> entityList = new ArrayList<ETrifcompanydata>();
        for (ETrifcompanydataDto dto : dtoList) {
            ETrifcompanydata entity = mappingToEntity(dto);
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
    public ETrifcompanydataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ETrifcompanydataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ETrifcompanydataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ETrifcompanydataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ETrifcompanydataDtoMapper reverseReference() {
        setReverseReference(true);
        return (ETrifcompanydataDtoMapper)this;
    }
}

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
 * The DTO mapper of E_USER as TABLE. <br>
 * ユーザ情報受信テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_LOGIN_INFO_ID
 *
 * [column]
 *     RECEIVE_LOGIN_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, COMMON_AUTH_ID, EMPLOYEE_NO, ID_TYPE, ENROLLMENT_STATUS, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, MAIL_ADDRESS, ADMIN_FLG, COMPANY_UNIT_CD, BIZ_SYSTEM_CD, BIZ_SYSTEM_NM, USER_ROLE_CD, USER_ROLE_NM, PLAN_COMPANY_CD, WMS_COMPANY_CD, DLV_ROOT_COMPANY_CD, SVF_COMPANY_CD, KB_COMPANY_CD, ORDER_LOGIN_COMPANY_CD, ORDER_OFFICE_COMPANY_CD, ORDER_SMARTEDIT_COMPANY_CD, SUPANDDEM_TAX_COMPANY_CD, VALID_FRDATEH, VALID_TODATEH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_LOGIN_INFO_ID
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
public abstract class BsEUserDtoMapper implements DtoMapper<EUser, EUserDto>, Serializable {

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
    public BsEUserDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEUserDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EUserDto mappingToDto(EUser entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EUserDto dto = new EUserDto();
        dto.setReceiveLoginInfoId(entity.getReceiveLoginInfoId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setCommonAuthId(entity.getCommonAuthId());
        dto.setEmployeeNo(entity.getEmployeeNo());
        dto.setIdType(entity.getIdType());
        dto.setEnrollmentStatus(entity.getEnrollmentStatus());
        dto.setLastName(entity.getLastName());
        dto.setFirstName(entity.getFirstName());
        dto.setLastNameKana(entity.getLastNameKana());
        dto.setFirstNameKana(entity.getFirstNameKana());
        dto.setMailAddress(entity.getMailAddress());
        dto.setAdminFlg(entity.getAdminFlg());
        dto.setCompanyUnitCd(entity.getCompanyUnitCd());
        dto.setBizSystemCd(entity.getBizSystemCd());
        dto.setBizSystemNm(entity.getBizSystemNm());
        dto.setUserRoleCd(entity.getUserRoleCd());
        dto.setUserRoleNm(entity.getUserRoleNm());
        dto.setPlanCompanyCd(entity.getPlanCompanyCd());
        dto.setWmsCompanyCd(entity.getWmsCompanyCd());
        dto.setDlvRootCompanyCd(entity.getDlvRootCompanyCd());
        dto.setSvfCompanyCd(entity.getSvfCompanyCd());
        dto.setKbCompanyCd(entity.getKbCompanyCd());
        dto.setOrderLoginCompanyCd(entity.getOrderLoginCompanyCd());
        dto.setOrderOfficeCompanyCd(entity.getOrderOfficeCompanyCd());
        dto.setOrderSmarteditCompanyCd(entity.getOrderSmarteditCompanyCd());
        dto.setSupanddemTaxCompanyCd(entity.getSupanddemTaxCompanyCd());
        dto.setValidFrdateh(entity.getValidFrdateh());
        dto.setValidTodateh(entity.getValidTodateh());
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
    public List<EUserDto> mappingToDtoList(List<EUser> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EUserDto> dtoList = new ArrayList<EUserDto>();
        for (EUser entity : entityList) {
            EUserDto dto = mappingToDto(entity);
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
    public EUser mappingToEntity(EUserDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EUser entity = new EUser();
        if (needsMapping(dto, dto.getReceiveLoginInfoId(), "receiveLoginInfoId")) {
            entity.setReceiveLoginInfoId(dto.getReceiveLoginInfoId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getCommonAuthId(), "commonAuthId")) {
            entity.setCommonAuthId(dto.getCommonAuthId());
        }
        if (needsMapping(dto, dto.getEmployeeNo(), "employeeNo")) {
            entity.setEmployeeNo(dto.getEmployeeNo());
        }
        if (needsMapping(dto, dto.getIdType(), "idType")) {
            entity.setIdType(dto.getIdType());
        }
        if (needsMapping(dto, dto.getEnrollmentStatus(), "enrollmentStatus")) {
            entity.setEnrollmentStatus(dto.getEnrollmentStatus());
        }
        if (needsMapping(dto, dto.getLastName(), "lastName")) {
            entity.setLastName(dto.getLastName());
        }
        if (needsMapping(dto, dto.getFirstName(), "firstName")) {
            entity.setFirstName(dto.getFirstName());
        }
        if (needsMapping(dto, dto.getLastNameKana(), "lastNameKana")) {
            entity.setLastNameKana(dto.getLastNameKana());
        }
        if (needsMapping(dto, dto.getFirstNameKana(), "firstNameKana")) {
            entity.setFirstNameKana(dto.getFirstNameKana());
        }
        if (needsMapping(dto, dto.getMailAddress(), "mailAddress")) {
            entity.setMailAddress(dto.getMailAddress());
        }
        if (needsMapping(dto, dto.getAdminFlg(), "adminFlg")) {
            entity.setAdminFlg(dto.getAdminFlg());
        }
        if (needsMapping(dto, dto.getCompanyUnitCd(), "companyUnitCd")) {
            entity.setCompanyUnitCd(dto.getCompanyUnitCd());
        }
        if (needsMapping(dto, dto.getBizSystemCd(), "bizSystemCd")) {
            entity.setBizSystemCd(dto.getBizSystemCd());
        }
        if (needsMapping(dto, dto.getBizSystemNm(), "bizSystemNm")) {
            entity.setBizSystemNm(dto.getBizSystemNm());
        }
        if (needsMapping(dto, dto.getUserRoleCd(), "userRoleCd")) {
            entity.setUserRoleCd(dto.getUserRoleCd());
        }
        if (needsMapping(dto, dto.getUserRoleNm(), "userRoleNm")) {
            entity.setUserRoleNm(dto.getUserRoleNm());
        }
        if (needsMapping(dto, dto.getPlanCompanyCd(), "planCompanyCd")) {
            entity.setPlanCompanyCd(dto.getPlanCompanyCd());
        }
        if (needsMapping(dto, dto.getWmsCompanyCd(), "wmsCompanyCd")) {
            entity.setWmsCompanyCd(dto.getWmsCompanyCd());
        }
        if (needsMapping(dto, dto.getDlvRootCompanyCd(), "dlvRootCompanyCd")) {
            entity.setDlvRootCompanyCd(dto.getDlvRootCompanyCd());
        }
        if (needsMapping(dto, dto.getSvfCompanyCd(), "svfCompanyCd")) {
            entity.setSvfCompanyCd(dto.getSvfCompanyCd());
        }
        if (needsMapping(dto, dto.getKbCompanyCd(), "kbCompanyCd")) {
            entity.setKbCompanyCd(dto.getKbCompanyCd());
        }
        if (needsMapping(dto, dto.getOrderLoginCompanyCd(), "orderLoginCompanyCd")) {
            entity.setOrderLoginCompanyCd(dto.getOrderLoginCompanyCd());
        }
        if (needsMapping(dto, dto.getOrderOfficeCompanyCd(), "orderOfficeCompanyCd")) {
            entity.setOrderOfficeCompanyCd(dto.getOrderOfficeCompanyCd());
        }
        if (needsMapping(dto, dto.getOrderSmarteditCompanyCd(), "orderSmarteditCompanyCd")) {
            entity.setOrderSmarteditCompanyCd(dto.getOrderSmarteditCompanyCd());
        }
        if (needsMapping(dto, dto.getSupanddemTaxCompanyCd(), "supanddemTaxCompanyCd")) {
            entity.setSupanddemTaxCompanyCd(dto.getSupanddemTaxCompanyCd());
        }
        if (needsMapping(dto, dto.getValidFrdateh(), "validFrdateh")) {
            entity.setValidFrdateh(dto.getValidFrdateh());
        }
        if (needsMapping(dto, dto.getValidTodateh(), "validTodateh")) {
            entity.setValidTodateh(dto.getValidTodateh());
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
    protected boolean needsMapping(EUserDto dto, Object value, String propName) {
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
    public List<EUser> mappingToEntityList(List<EUserDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EUser> entityList = new ArrayList<EUser>();
        for (EUserDto dto : dtoList) {
            EUser entity = mappingToEntity(dto);
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
    public EUserDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EUserDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EUserDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EUserDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EUserDtoMapper reverseReference() {
        setReverseReference(true);
        return (EUserDtoMapper)this;
    }
}

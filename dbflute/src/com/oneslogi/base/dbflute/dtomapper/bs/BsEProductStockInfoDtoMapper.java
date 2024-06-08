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
 * The DTO mapper of E_PRODUCT_STOCK_INFO as TABLE. <br>
 * 製品在庫情報送信テーブル
 * <pre>
 * [primary-key]
 *     E_PRODUCT_STOCK_INFO_ID
 *
 * [column]
 *     E_PRODUCT_STOCK_INFO_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_ID, CLIENT_ID, SEQ, IN_OUT_KBN, CENTER_CD, CENTER_NM, EXECUTE_DATE, PRODUCT_CD, PRODUCT_NM, STOCK_LOCATION, STOCK_LOCATION_NM, MANUFACTURE_DATE, DESIGN_KBN, LOCATION_CD, TRANSPORT_CD, FIRM_CARRY_NO, SOURCE_CD, SOURCE_NM, SCH_DATE, RCV_DATE, P_TDAY_TOTAL_DIFF_QTY, P_QTY, P_INVENTORY_NUM, P_YDAY_TOTAL_DIFF_QTY, P_TDAY_DIFF_QTY, SL_YDAY_TOTAL_DIFF_QTY, SL_TDAY_DIFF_QTY, QTY, INVENTORY_NUM, USER_USE4, LOT_ATRB1_TITLE, USER_NUM4, USER_NUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_PRODUCT_STOCK_INFO_ID
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
public abstract class BsEProductStockInfoDtoMapper implements DtoMapper<EProductStockInfo, EProductStockInfoDto>, Serializable {

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
    public BsEProductStockInfoDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEProductStockInfoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EProductStockInfoDto mappingToDto(EProductStockInfo entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EProductStockInfoDto dto = new EProductStockInfoDto();
        dto.setEProductStockInfoId(entity.getEProductStockInfoId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setSeq(entity.getSeq());
        dto.setInOutKbn(entity.getInOutKbn());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setExecuteDate(entity.getExecuteDate());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setStockLocation(entity.getStockLocation());
        dto.setStockLocationNm(entity.getStockLocationNm());
        dto.setManufactureDate(entity.getManufactureDate());
        dto.setDesignKbn(entity.getDesignKbn());
        dto.setLocationCd(entity.getLocationCd());
        dto.setTransportCd(entity.getTransportCd());
        dto.setFirmCarryNo(entity.getFirmCarryNo());
        dto.setSourceCd(entity.getSourceCd());
        dto.setSourceNm(entity.getSourceNm());
        dto.setSchDate(entity.getSchDate());
        dto.setRcvDate(entity.getRcvDate());
        dto.setPTdayTotalDiffQty(entity.getPTdayTotalDiffQty());
        dto.setPQty(entity.getPQty());
        dto.setPInventoryNum(entity.getPInventoryNum());
        dto.setPYdayTotalDiffQty(entity.getPYdayTotalDiffQty());
        dto.setPTdayDiffQty(entity.getPTdayDiffQty());
        dto.setSlYdayTotalDiffQty(entity.getSlYdayTotalDiffQty());
        dto.setSlTdayDiffQty(entity.getSlTdayDiffQty());
        dto.setQty(entity.getQty());
        dto.setInventoryNum(entity.getInventoryNum());
        dto.setUserUse4(entity.getUserUse4());
        dto.setLotAtrb1Title(entity.getLotAtrb1Title());
        dto.setUserNum4(entity.getUserNum4());
        dto.setUserNum3(entity.getUserNum3());
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
    public List<EProductStockInfoDto> mappingToDtoList(List<EProductStockInfo> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EProductStockInfoDto> dtoList = new ArrayList<EProductStockInfoDto>();
        for (EProductStockInfo entity : entityList) {
            EProductStockInfoDto dto = mappingToDto(entity);
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
    public EProductStockInfo mappingToEntity(EProductStockInfoDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EProductStockInfo entity = new EProductStockInfo();
        if (needsMapping(dto, dto.getEProductStockInfoId(), "EProductStockInfoId")) {
            entity.setEProductStockInfoId(dto.getEProductStockInfoId());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendRowId(), "sendRowId")) {
            entity.setSendRowId(dto.getSendRowId());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getSeq(), "seq")) {
            entity.setSeq(dto.getSeq());
        }
        if (needsMapping(dto, dto.getInOutKbn(), "inOutKbn")) {
            entity.setInOutKbn(dto.getInOutKbn());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getExecuteDate(), "executeDate")) {
            entity.setExecuteDate(dto.getExecuteDate());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getStockLocation(), "stockLocation")) {
            entity.setStockLocation(dto.getStockLocation());
        }
        if (needsMapping(dto, dto.getStockLocationNm(), "stockLocationNm")) {
            entity.setStockLocationNm(dto.getStockLocationNm());
        }
        if (needsMapping(dto, dto.getManufactureDate(), "manufactureDate")) {
            entity.setManufactureDate(dto.getManufactureDate());
        }
        if (needsMapping(dto, dto.getDesignKbn(), "designKbn")) {
            entity.setDesignKbn(dto.getDesignKbn());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getTransportCd(), "transportCd")) {
            entity.setTransportCd(dto.getTransportCd());
        }
        if (needsMapping(dto, dto.getFirmCarryNo(), "firmCarryNo")) {
            entity.setFirmCarryNo(dto.getFirmCarryNo());
        }
        if (needsMapping(dto, dto.getSourceCd(), "sourceCd")) {
            entity.setSourceCd(dto.getSourceCd());
        }
        if (needsMapping(dto, dto.getSourceNm(), "sourceNm")) {
            entity.setSourceNm(dto.getSourceNm());
        }
        if (needsMapping(dto, dto.getSchDate(), "schDate")) {
            entity.setSchDate(dto.getSchDate());
        }
        if (needsMapping(dto, dto.getRcvDate(), "rcvDate")) {
            entity.setRcvDate(dto.getRcvDate());
        }
        if (needsMapping(dto, dto.getPTdayTotalDiffQty(), "PTdayTotalDiffQty")) {
            entity.setPTdayTotalDiffQty(dto.getPTdayTotalDiffQty());
        }
        if (needsMapping(dto, dto.getPQty(), "PQty")) {
            entity.setPQty(dto.getPQty());
        }
        if (needsMapping(dto, dto.getPInventoryNum(), "PInventoryNum")) {
            entity.setPInventoryNum(dto.getPInventoryNum());
        }
        if (needsMapping(dto, dto.getPYdayTotalDiffQty(), "PYdayTotalDiffQty")) {
            entity.setPYdayTotalDiffQty(dto.getPYdayTotalDiffQty());
        }
        if (needsMapping(dto, dto.getPTdayDiffQty(), "PTdayDiffQty")) {
            entity.setPTdayDiffQty(dto.getPTdayDiffQty());
        }
        if (needsMapping(dto, dto.getSlYdayTotalDiffQty(), "slYdayTotalDiffQty")) {
            entity.setSlYdayTotalDiffQty(dto.getSlYdayTotalDiffQty());
        }
        if (needsMapping(dto, dto.getSlTdayDiffQty(), "slTdayDiffQty")) {
            entity.setSlTdayDiffQty(dto.getSlTdayDiffQty());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
        }
        if (needsMapping(dto, dto.getInventoryNum(), "inventoryNum")) {
            entity.setInventoryNum(dto.getInventoryNum());
        }
        if (needsMapping(dto, dto.getUserUse4(), "userUse4")) {
            entity.setUserUse4(dto.getUserUse4());
        }
        if (needsMapping(dto, dto.getLotAtrb1Title(), "lotAtrb1Title")) {
            entity.setLotAtrb1Title(dto.getLotAtrb1Title());
        }
        if (needsMapping(dto, dto.getUserNum4(), "userNum4")) {
            entity.setUserNum4(dto.getUserNum4());
        }
        if (needsMapping(dto, dto.getUserNum3(), "userNum3")) {
            entity.setUserNum3(dto.getUserNum3());
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
    protected boolean needsMapping(EProductStockInfoDto dto, Object value, String propName) {
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
    public List<EProductStockInfo> mappingToEntityList(List<EProductStockInfoDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EProductStockInfo> entityList = new ArrayList<EProductStockInfo>();
        for (EProductStockInfoDto dto : dtoList) {
            EProductStockInfo entity = mappingToEntity(dto);
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
    public EProductStockInfoDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EProductStockInfoDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EProductStockInfoDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EProductStockInfoDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EProductStockInfoDtoMapper reverseReference() {
        setReverseReference(true);
        return (EProductStockInfoDtoMapper)this;
    }
}

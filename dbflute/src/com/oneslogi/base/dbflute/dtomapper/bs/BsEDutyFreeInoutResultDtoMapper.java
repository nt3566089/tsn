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
 * The DTO mapper of E_DUTY_FREE_INOUT_RESULT as TABLE. <br>
 * 国内免税入出庫実績送信テーブル
 * <pre>
 * [primary-key]
 *     DUTY_FREE_INOUT_RESULT_ID
 *
 * [column]
 *     DUTY_FREE_INOUT_RESULT_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, SYMBOL_FACTORY_CD, SYMBOL_ITEM_CD, SYMBOL_SKU, SYMBOL_RECEIVE_CD, SYMBOL_PRODUCT_MARK, SYMBOL_ORDERNO, SYMBOL_PRINTERNO, SYMBOL_MAKENO, SYMBOL_LOT4, SYMBOL_MAKETIME, SYMBOL_CIRCULATION_ID, TRANSPORT_CD, PALLET_ID, INIT_NUM, CREATE_DATETIME, SORTING_DATETIME, TRACE_TYPE, LINE_BLOCK, ASSORT_ED_UNIT, ASSORT_ED_INDEX, OPERATION_CODE, CASE_IN_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, DIST_WAREHOUSE_CD, SYMBOL_RCV_KEY, ITEM_CD, DESIGN_CD, RESESRVE_AREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DUTY_FREE_INOUT_RESULT_ID
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
public abstract class BsEDutyFreeInoutResultDtoMapper implements DtoMapper<EDutyFreeInoutResult, EDutyFreeInoutResultDto>, Serializable {

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
    public BsEDutyFreeInoutResultDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEDutyFreeInoutResultDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EDutyFreeInoutResultDto mappingToDto(EDutyFreeInoutResult entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EDutyFreeInoutResultDto dto = new EDutyFreeInoutResultDto();
        dto.setDutyFreeInoutResultId(entity.getDutyFreeInoutResultId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setSymbolPosKey(entity.getSymbolPosKey());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setSymbolFactoryCd(entity.getSymbolFactoryCd());
        dto.setSymbolItemCd(entity.getSymbolItemCd());
        dto.setSymbolSku(entity.getSymbolSku());
        dto.setSymbolReceiveCd(entity.getSymbolReceiveCd());
        dto.setSymbolProductMark(entity.getSymbolProductMark());
        dto.setSymbolOrderno(entity.getSymbolOrderno());
        dto.setSymbolPrinterno(entity.getSymbolPrinterno());
        dto.setSymbolMakeno(entity.getSymbolMakeno());
        dto.setSymbolLot4(entity.getSymbolLot4());
        dto.setSymbolMaketime(entity.getSymbolMaketime());
        dto.setSymbolCirculationId(entity.getSymbolCirculationId());
        dto.setTransportCd(entity.getTransportCd());
        dto.setPalletId(entity.getPalletId());
        dto.setInitNum(entity.getInitNum());
        dto.setCreateDatetime(entity.getCreateDatetime());
        dto.setSortingDatetime(entity.getSortingDatetime());
        dto.setTraceType(entity.getTraceType());
        dto.setLineBlock(entity.getLineBlock());
        dto.setAssortEdUnit(entity.getAssortEdUnit());
        dto.setAssortEdIndex(entity.getAssortEdIndex());
        dto.setOperationCode(entity.getOperationCode());
        dto.setCaseInNum(entity.getCaseInNum());
        dto.setAssortNum(entity.getAssortNum());
        dto.setAssortDifNum(entity.getAssortDifNum());
        dto.setDirectionCd(entity.getDirectionCd());
        dto.setPistonType(entity.getPistonType());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setDirectionNum(entity.getDirectionNum());
        dto.setDistWarehouseCd(entity.getDistWarehouseCd());
        dto.setSymbolRcvKey(entity.getSymbolRcvKey());
        dto.setItemCd(entity.getItemCd());
        dto.setDesignCd(entity.getDesignCd());
        dto.setResesrveArea(entity.getResesrveArea());
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
    public List<EDutyFreeInoutResultDto> mappingToDtoList(List<EDutyFreeInoutResult> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EDutyFreeInoutResultDto> dtoList = new ArrayList<EDutyFreeInoutResultDto>();
        for (EDutyFreeInoutResult entity : entityList) {
            EDutyFreeInoutResultDto dto = mappingToDto(entity);
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
    public EDutyFreeInoutResult mappingToEntity(EDutyFreeInoutResultDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EDutyFreeInoutResult entity = new EDutyFreeInoutResult();
        if (needsMapping(dto, dto.getDutyFreeInoutResultId(), "dutyFreeInoutResultId")) {
            entity.setDutyFreeInoutResultId(dto.getDutyFreeInoutResultId());
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
        if (needsMapping(dto, dto.getSymbolPosKey(), "symbolPosKey")) {
            entity.setSymbolPosKey(dto.getSymbolPosKey());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getSymbolFactoryCd(), "symbolFactoryCd")) {
            entity.setSymbolFactoryCd(dto.getSymbolFactoryCd());
        }
        if (needsMapping(dto, dto.getSymbolItemCd(), "symbolItemCd")) {
            entity.setSymbolItemCd(dto.getSymbolItemCd());
        }
        if (needsMapping(dto, dto.getSymbolSku(), "symbolSku")) {
            entity.setSymbolSku(dto.getSymbolSku());
        }
        if (needsMapping(dto, dto.getSymbolReceiveCd(), "symbolReceiveCd")) {
            entity.setSymbolReceiveCd(dto.getSymbolReceiveCd());
        }
        if (needsMapping(dto, dto.getSymbolProductMark(), "symbolProductMark")) {
            entity.setSymbolProductMark(dto.getSymbolProductMark());
        }
        if (needsMapping(dto, dto.getSymbolOrderno(), "symbolOrderno")) {
            entity.setSymbolOrderno(dto.getSymbolOrderno());
        }
        if (needsMapping(dto, dto.getSymbolPrinterno(), "symbolPrinterno")) {
            entity.setSymbolPrinterno(dto.getSymbolPrinterno());
        }
        if (needsMapping(dto, dto.getSymbolMakeno(), "symbolMakeno")) {
            entity.setSymbolMakeno(dto.getSymbolMakeno());
        }
        if (needsMapping(dto, dto.getSymbolLot4(), "symbolLot4")) {
            entity.setSymbolLot4(dto.getSymbolLot4());
        }
        if (needsMapping(dto, dto.getSymbolMaketime(), "symbolMaketime")) {
            entity.setSymbolMaketime(dto.getSymbolMaketime());
        }
        if (needsMapping(dto, dto.getSymbolCirculationId(), "symbolCirculationId")) {
            entity.setSymbolCirculationId(dto.getSymbolCirculationId());
        }
        if (needsMapping(dto, dto.getTransportCd(), "transportCd")) {
            entity.setTransportCd(dto.getTransportCd());
        }
        if (needsMapping(dto, dto.getPalletId(), "palletId")) {
            entity.setPalletId(dto.getPalletId());
        }
        if (needsMapping(dto, dto.getInitNum(), "initNum")) {
            entity.setInitNum(dto.getInitNum());
        }
        if (needsMapping(dto, dto.getCreateDatetime(), "createDatetime")) {
            entity.setCreateDatetime(dto.getCreateDatetime());
        }
        if (needsMapping(dto, dto.getSortingDatetime(), "sortingDatetime")) {
            entity.setSortingDatetime(dto.getSortingDatetime());
        }
        if (needsMapping(dto, dto.getTraceType(), "traceType")) {
            entity.setTraceType(dto.getTraceType());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getAssortEdUnit(), "assortEdUnit")) {
            entity.setAssortEdUnit(dto.getAssortEdUnit());
        }
        if (needsMapping(dto, dto.getAssortEdIndex(), "assortEdIndex")) {
            entity.setAssortEdIndex(dto.getAssortEdIndex());
        }
        if (needsMapping(dto, dto.getOperationCode(), "operationCode")) {
            entity.setOperationCode(dto.getOperationCode());
        }
        if (needsMapping(dto, dto.getCaseInNum(), "caseInNum")) {
            entity.setCaseInNum(dto.getCaseInNum());
        }
        if (needsMapping(dto, dto.getAssortNum(), "assortNum")) {
            entity.setAssortNum(dto.getAssortNum());
        }
        if (needsMapping(dto, dto.getAssortDifNum(), "assortDifNum")) {
            entity.setAssortDifNum(dto.getAssortDifNum());
        }
        if (needsMapping(dto, dto.getDirectionCd(), "directionCd")) {
            entity.setDirectionCd(dto.getDirectionCd());
        }
        if (needsMapping(dto, dto.getPistonType(), "pistonType")) {
            entity.setPistonType(dto.getPistonType());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getDirectionNum(), "directionNum")) {
            entity.setDirectionNum(dto.getDirectionNum());
        }
        if (needsMapping(dto, dto.getDistWarehouseCd(), "distWarehouseCd")) {
            entity.setDistWarehouseCd(dto.getDistWarehouseCd());
        }
        if (needsMapping(dto, dto.getSymbolRcvKey(), "symbolRcvKey")) {
            entity.setSymbolRcvKey(dto.getSymbolRcvKey());
        }
        if (needsMapping(dto, dto.getItemCd(), "itemCd")) {
            entity.setItemCd(dto.getItemCd());
        }
        if (needsMapping(dto, dto.getDesignCd(), "designCd")) {
            entity.setDesignCd(dto.getDesignCd());
        }
        if (needsMapping(dto, dto.getResesrveArea(), "resesrveArea")) {
            entity.setResesrveArea(dto.getResesrveArea());
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
    protected boolean needsMapping(EDutyFreeInoutResultDto dto, Object value, String propName) {
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
    public List<EDutyFreeInoutResult> mappingToEntityList(List<EDutyFreeInoutResultDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EDutyFreeInoutResult> entityList = new ArrayList<EDutyFreeInoutResult>();
        for (EDutyFreeInoutResultDto dto : dtoList) {
            EDutyFreeInoutResult entity = mappingToEntity(dto);
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
    public EDutyFreeInoutResultDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EDutyFreeInoutResultDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EDutyFreeInoutResultDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EDutyFreeInoutResultDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EDutyFreeInoutResultDtoMapper reverseReference() {
        setReverseReference(true);
        return (EDutyFreeInoutResultDtoMapper)this;
    }
}

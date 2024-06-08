package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlTTrallinvList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, EXECUTEDATE, INOUTKBN, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, YDAYTLEQULYTMPLOCINV, YDAYTLEQULYAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, TDAYEQYTMPLOCINV, TDAYEQYAUTOINV, CAPITEMFLG, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsSqlTTrallinvListDtoMapper implements DtoMapper<SqlTTrallinvList, SqlTTrallinvListDto>, Serializable {

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
    public BsSqlTTrallinvListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlTTrallinvListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlTTrallinvListDto mappingToDto(SqlTTrallinvList entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        SqlTTrallinvListDto dto = new SqlTTrallinvListDto();
        dto.setTrallinvId(entity.getTrallinvId());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setExecutedate(entity.getExecutedate());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setSysinvtotalinv(entity.getSysinvtotalinv());
        dto.setSysinvkeeplocinv(entity.getSysinvkeeplocinv());
        dto.setSysinvreceivelocinv(entity.getSysinvreceivelocinv());
        dto.setSysinvdamageitem(entity.getSysinvdamageitem());
        dto.setSysinvclssifylocinv(entity.getSysinvclssifylocinv());
        dto.setSysinvtmplocinv(entity.getSysinvtmplocinv());
        dto.setSysinvautoinv(entity.getSysinvautoinv());
        dto.setInvesttotalinv(entity.getInvesttotalinv());
        dto.setInvestkeeplocinv(entity.getInvestkeeplocinv());
        dto.setInvestreceivelocinv(entity.getInvestreceivelocinv());
        dto.setInvestdamageitem(entity.getInvestdamageitem());
        dto.setInvestclssifylocinv(entity.getInvestclssifylocinv());
        dto.setInvesttmplocinv(entity.getInvesttmplocinv());
        dto.setInvestautoinv(entity.getInvestautoinv());
        dto.setYdaytlequlytotalinv(entity.getYdaytlequlytotalinv());
        dto.setYdaytlequlykeeplocinv(entity.getYdaytlequlykeeplocinv());
        dto.setYdaytlequlyreceivelocinv(entity.getYdaytlequlyreceivelocinv());
        dto.setYdaytlequlydamageitem(entity.getYdaytlequlydamageitem());
        dto.setYdaytlequlyclssifylocinv(entity.getYdaytlequlyclssifylocinv());
        dto.setYdaytlequlytmplocinv(entity.getYdaytlequlytmplocinv());
        dto.setYdaytlequlyautoinv(entity.getYdaytlequlyautoinv());
        dto.setTdayeqytotalinv(entity.getTdayeqytotalinv());
        dto.setTdayeqykeeplocinv(entity.getTdayeqykeeplocinv());
        dto.setTdayeqyreceivelocinv(entity.getTdayeqyreceivelocinv());
        dto.setTdayeqydamageitem(entity.getTdayeqydamageitem());
        dto.setTdayeqyclssifylocinv(entity.getTdayeqyclssifylocinv());
        dto.setTdayeqytmplocinv(entity.getTdayeqytmplocinv());
        dto.setTdayeqyautoinv(entity.getTdayeqyautoinv());
        dto.setCapitemflg(entity.getCapitemflg());
        dto.setProductId(entity.getProductId());
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
    public List<SqlTTrallinvListDto> mappingToDtoList(List<SqlTTrallinvList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlTTrallinvListDto> dtoList = new ArrayList<SqlTTrallinvListDto>();
        for (SqlTTrallinvList entity : entityList) {
            SqlTTrallinvListDto dto = mappingToDto(entity);
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
    public SqlTTrallinvList mappingToEntity(SqlTTrallinvListDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        SqlTTrallinvList entity = new SqlTTrallinvList();
        if (needsMapping(dto, dto.getTrallinvId(), "trallinvId")) {
            entity.setTrallinvId(dto.getTrallinvId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getExecutedate(), "executedate")) {
            entity.setExecutedate(dto.getExecutedate());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getSysinvtotalinv(), "sysinvtotalinv")) {
            entity.setSysinvtotalinv(dto.getSysinvtotalinv());
        }
        if (needsMapping(dto, dto.getSysinvkeeplocinv(), "sysinvkeeplocinv")) {
            entity.setSysinvkeeplocinv(dto.getSysinvkeeplocinv());
        }
        if (needsMapping(dto, dto.getSysinvreceivelocinv(), "sysinvreceivelocinv")) {
            entity.setSysinvreceivelocinv(dto.getSysinvreceivelocinv());
        }
        if (needsMapping(dto, dto.getSysinvdamageitem(), "sysinvdamageitem")) {
            entity.setSysinvdamageitem(dto.getSysinvdamageitem());
        }
        if (needsMapping(dto, dto.getSysinvclssifylocinv(), "sysinvclssifylocinv")) {
            entity.setSysinvclssifylocinv(dto.getSysinvclssifylocinv());
        }
        if (needsMapping(dto, dto.getSysinvtmplocinv(), "sysinvtmplocinv")) {
            entity.setSysinvtmplocinv(dto.getSysinvtmplocinv());
        }
        if (needsMapping(dto, dto.getSysinvautoinv(), "sysinvautoinv")) {
            entity.setSysinvautoinv(dto.getSysinvautoinv());
        }
        if (needsMapping(dto, dto.getInvesttotalinv(), "investtotalinv")) {
            entity.setInvesttotalinv(dto.getInvesttotalinv());
        }
        if (needsMapping(dto, dto.getInvestkeeplocinv(), "investkeeplocinv")) {
            entity.setInvestkeeplocinv(dto.getInvestkeeplocinv());
        }
        if (needsMapping(dto, dto.getInvestreceivelocinv(), "investreceivelocinv")) {
            entity.setInvestreceivelocinv(dto.getInvestreceivelocinv());
        }
        if (needsMapping(dto, dto.getInvestdamageitem(), "investdamageitem")) {
            entity.setInvestdamageitem(dto.getInvestdamageitem());
        }
        if (needsMapping(dto, dto.getInvestclssifylocinv(), "investclssifylocinv")) {
            entity.setInvestclssifylocinv(dto.getInvestclssifylocinv());
        }
        if (needsMapping(dto, dto.getInvesttmplocinv(), "investtmplocinv")) {
            entity.setInvesttmplocinv(dto.getInvesttmplocinv());
        }
        if (needsMapping(dto, dto.getInvestautoinv(), "investautoinv")) {
            entity.setInvestautoinv(dto.getInvestautoinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlytotalinv(), "ydaytlequlytotalinv")) {
            entity.setYdaytlequlytotalinv(dto.getYdaytlequlytotalinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlykeeplocinv(), "ydaytlequlykeeplocinv")) {
            entity.setYdaytlequlykeeplocinv(dto.getYdaytlequlykeeplocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlyreceivelocinv(), "ydaytlequlyreceivelocinv")) {
            entity.setYdaytlequlyreceivelocinv(dto.getYdaytlequlyreceivelocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlydamageitem(), "ydaytlequlydamageitem")) {
            entity.setYdaytlequlydamageitem(dto.getYdaytlequlydamageitem());
        }
        if (needsMapping(dto, dto.getYdaytlequlyclssifylocinv(), "ydaytlequlyclssifylocinv")) {
            entity.setYdaytlequlyclssifylocinv(dto.getYdaytlequlyclssifylocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlytmplocinv(), "ydaytlequlytmplocinv")) {
            entity.setYdaytlequlytmplocinv(dto.getYdaytlequlytmplocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlyautoinv(), "ydaytlequlyautoinv")) {
            entity.setYdaytlequlyautoinv(dto.getYdaytlequlyautoinv());
        }
        if (needsMapping(dto, dto.getTdayeqytotalinv(), "tdayeqytotalinv")) {
            entity.setTdayeqytotalinv(dto.getTdayeqytotalinv());
        }
        if (needsMapping(dto, dto.getTdayeqykeeplocinv(), "tdayeqykeeplocinv")) {
            entity.setTdayeqykeeplocinv(dto.getTdayeqykeeplocinv());
        }
        if (needsMapping(dto, dto.getTdayeqyreceivelocinv(), "tdayeqyreceivelocinv")) {
            entity.setTdayeqyreceivelocinv(dto.getTdayeqyreceivelocinv());
        }
        if (needsMapping(dto, dto.getTdayeqydamageitem(), "tdayeqydamageitem")) {
            entity.setTdayeqydamageitem(dto.getTdayeqydamageitem());
        }
        if (needsMapping(dto, dto.getTdayeqyclssifylocinv(), "tdayeqyclssifylocinv")) {
            entity.setTdayeqyclssifylocinv(dto.getTdayeqyclssifylocinv());
        }
        if (needsMapping(dto, dto.getTdayeqytmplocinv(), "tdayeqytmplocinv")) {
            entity.setTdayeqytmplocinv(dto.getTdayeqytmplocinv());
        }
        if (needsMapping(dto, dto.getTdayeqyautoinv(), "tdayeqyautoinv")) {
            entity.setTdayeqyautoinv(dto.getTdayeqyautoinv());
        }
        if (needsMapping(dto, dto.getCapitemflg(), "capitemflg")) {
            entity.setCapitemflg(dto.getCapitemflg());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
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
    protected boolean needsMapping(SqlTTrallinvListDto dto, Object value, String propName) {
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
    public List<SqlTTrallinvList> mappingToEntityList(List<SqlTTrallinvListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlTTrallinvList> entityList = new ArrayList<SqlTTrallinvList>();
        for (SqlTTrallinvListDto dto : dtoList) {
            SqlTTrallinvList entity = mappingToEntity(dto);
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
    public SqlTTrallinvListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlTTrallinvListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlTTrallinvListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlTTrallinvListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlTTrallinvListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlTTrallinvListDtoMapper)this;
    }
}

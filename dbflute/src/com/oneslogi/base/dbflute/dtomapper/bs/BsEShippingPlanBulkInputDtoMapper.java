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
 * The DTO mapper of E_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * さしず受信テーブル
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEDDER_FLG, ZZORGNCD, DPCD, ORDGR, RMANO, SSCD, SLPTYP, SLPNO, SEQNO, ZZORDYMD, ZZWAYMD1, OTORGCD, ORDORGCD, RLYBSCD, DED, PSTNID, DLVRNK, LMPDLVNO, DIVMTD, HDVID, NAME1, ZREGPRCA, ZREGPRCC, ZZSALTAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, LOGISTICSCD, SLEDIV, HVRTRSN, ZZVBELNB, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, ZZBLOTDT, CGGDID, MATNR, KWMENG, MVGR1, MVGR4, KZWI3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
public abstract class BsEShippingPlanBulkInputDtoMapper implements DtoMapper<EShippingPlanBulkInput, EShippingPlanBulkInputDto>, Serializable {

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
    public BsEShippingPlanBulkInputDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEShippingPlanBulkInputDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EShippingPlanBulkInputDto mappingToDto(EShippingPlanBulkInput entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingPlanBulkInputDto dto = new EShippingPlanBulkInputDto();
        dto.setBondedShippingPlanBulkInputId(entity.getBondedShippingPlanBulkInputId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setHedderFlg(entity.getHedderFlg());
        dto.setZzorgncd(entity.getZzorgncd());
        dto.setDpcd(entity.getDpcd());
        dto.setOrdgr(entity.getOrdgr());
        dto.setRmano(entity.getRmano());
        dto.setSscd(entity.getSscd());
        dto.setSlptyp(entity.getSlptyp());
        dto.setSlpno(entity.getSlpno());
        dto.setSeqno(entity.getSeqno());
        dto.setZzordymd(entity.getZzordymd());
        dto.setZzwaymd1(entity.getZzwaymd1());
        dto.setOtorgcd(entity.getOtorgcd());
        dto.setOrdorgcd(entity.getOrdorgcd());
        dto.setRlybscd(entity.getRlybscd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setDlvrnk(entity.getDlvrnk());
        dto.setLmpdlvno(entity.getLmpdlvno());
        dto.setDivmtd(entity.getDivmtd());
        dto.setHdvid(entity.getHdvid());
        dto.setName1(entity.getName1());
        dto.setZregprca(entity.getZregprca());
        dto.setZregprcc(entity.getZregprcc());
        dto.setZzsaltax(entity.getZzsaltax());
        dto.setZzgodfpc(entity.getZzgodfpc());
        dto.setZzgodspc(entity.getZzgodspc());
        dto.setZzgodctx(entity.getZzgodctx());
        dto.setLogisticscd(entity.getLogisticscd());
        dto.setSlediv(entity.getSlediv());
        dto.setHvrtrsn(entity.getHvrtrsn());
        dto.setZzvbelnb(entity.getZzvbelnb());
        dto.setCngprtslpno(entity.getCngprtslpno());
        dto.setTrnsctndiv(entity.getTrnsctndiv());
        dto.setEosordaftflg(entity.getEosordaftflg());
        dto.setEosslpno(entity.getEosslpno());
        dto.setHdrdbxdiv(entity.getHdrdbxdiv());
        dto.setInotrfsldiv(entity.getInotrfsldiv());
        dto.setBxmntrfsldiv(entity.getBxmntrfsldiv());
        dto.setSlpmrgtmg(entity.getSlpmrgtmg());
        dto.setZzblotdt(entity.getZzblotdt());
        dto.setCggdid(entity.getCggdid());
        dto.setMatnr(entity.getMatnr());
        dto.setKwmeng(entity.getKwmeng());
        dto.setMvgr1(entity.getMvgr1());
        dto.setMvgr4(entity.getMvgr4());
        dto.setKzwi3(entity.getKzwi3());
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
    public List<EShippingPlanBulkInputDto> mappingToDtoList(List<EShippingPlanBulkInput> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EShippingPlanBulkInputDto> dtoList = new ArrayList<EShippingPlanBulkInputDto>();
        for (EShippingPlanBulkInput entity : entityList) {
            EShippingPlanBulkInputDto dto = mappingToDto(entity);
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
    public EShippingPlanBulkInput mappingToEntity(EShippingPlanBulkInputDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EShippingPlanBulkInput entity = new EShippingPlanBulkInput();
        if (needsMapping(dto, dto.getBondedShippingPlanBulkInputId(), "bondedShippingPlanBulkInputId")) {
            entity.setBondedShippingPlanBulkInputId(dto.getBondedShippingPlanBulkInputId());
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
        if (needsMapping(dto, dto.getHedderFlg(), "hedderFlg")) {
            entity.setHedderFlg(dto.getHedderFlg());
        }
        if (needsMapping(dto, dto.getZzorgncd(), "zzorgncd")) {
            entity.setZzorgncd(dto.getZzorgncd());
        }
        if (needsMapping(dto, dto.getDpcd(), "dpcd")) {
            entity.setDpcd(dto.getDpcd());
        }
        if (needsMapping(dto, dto.getOrdgr(), "ordgr")) {
            entity.setOrdgr(dto.getOrdgr());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getSscd(), "sscd")) {
            entity.setSscd(dto.getSscd());
        }
        if (needsMapping(dto, dto.getSlptyp(), "slptyp")) {
            entity.setSlptyp(dto.getSlptyp());
        }
        if (needsMapping(dto, dto.getSlpno(), "slpno")) {
            entity.setSlpno(dto.getSlpno());
        }
        if (needsMapping(dto, dto.getSeqno(), "seqno")) {
            entity.setSeqno(dto.getSeqno());
        }
        if (needsMapping(dto, dto.getZzordymd(), "zzordymd")) {
            entity.setZzordymd(dto.getZzordymd());
        }
        if (needsMapping(dto, dto.getZzwaymd1(), "zzwaymd1")) {
            entity.setZzwaymd1(dto.getZzwaymd1());
        }
        if (needsMapping(dto, dto.getOtorgcd(), "otorgcd")) {
            entity.setOtorgcd(dto.getOtorgcd());
        }
        if (needsMapping(dto, dto.getOrdorgcd(), "ordorgcd")) {
            entity.setOrdorgcd(dto.getOrdorgcd());
        }
        if (needsMapping(dto, dto.getRlybscd(), "rlybscd")) {
            entity.setRlybscd(dto.getRlybscd());
        }
        if (needsMapping(dto, dto.getDed(), "ded")) {
            entity.setDed(dto.getDed());
        }
        if (needsMapping(dto, dto.getPstnid(), "pstnid")) {
            entity.setPstnid(dto.getPstnid());
        }
        if (needsMapping(dto, dto.getDlvrnk(), "dlvrnk")) {
            entity.setDlvrnk(dto.getDlvrnk());
        }
        if (needsMapping(dto, dto.getLmpdlvno(), "lmpdlvno")) {
            entity.setLmpdlvno(dto.getLmpdlvno());
        }
        if (needsMapping(dto, dto.getDivmtd(), "divmtd")) {
            entity.setDivmtd(dto.getDivmtd());
        }
        if (needsMapping(dto, dto.getHdvid(), "hdvid")) {
            entity.setHdvid(dto.getHdvid());
        }
        if (needsMapping(dto, dto.getName1(), "name1")) {
            entity.setName1(dto.getName1());
        }
        if (needsMapping(dto, dto.getZregprca(), "zregprca")) {
            entity.setZregprca(dto.getZregprca());
        }
        if (needsMapping(dto, dto.getZregprcc(), "zregprcc")) {
            entity.setZregprcc(dto.getZregprcc());
        }
        if (needsMapping(dto, dto.getZzsaltax(), "zzsaltax")) {
            entity.setZzsaltax(dto.getZzsaltax());
        }
        if (needsMapping(dto, dto.getZzgodfpc(), "zzgodfpc")) {
            entity.setZzgodfpc(dto.getZzgodfpc());
        }
        if (needsMapping(dto, dto.getZzgodspc(), "zzgodspc")) {
            entity.setZzgodspc(dto.getZzgodspc());
        }
        if (needsMapping(dto, dto.getZzgodctx(), "zzgodctx")) {
            entity.setZzgodctx(dto.getZzgodctx());
        }
        if (needsMapping(dto, dto.getLogisticscd(), "logisticscd")) {
            entity.setLogisticscd(dto.getLogisticscd());
        }
        if (needsMapping(dto, dto.getSlediv(), "slediv")) {
            entity.setSlediv(dto.getSlediv());
        }
        if (needsMapping(dto, dto.getHvrtrsn(), "hvrtrsn")) {
            entity.setHvrtrsn(dto.getHvrtrsn());
        }
        if (needsMapping(dto, dto.getZzvbelnb(), "zzvbelnb")) {
            entity.setZzvbelnb(dto.getZzvbelnb());
        }
        if (needsMapping(dto, dto.getCngprtslpno(), "cngprtslpno")) {
            entity.setCngprtslpno(dto.getCngprtslpno());
        }
        if (needsMapping(dto, dto.getTrnsctndiv(), "trnsctndiv")) {
            entity.setTrnsctndiv(dto.getTrnsctndiv());
        }
        if (needsMapping(dto, dto.getEosordaftflg(), "eosordaftflg")) {
            entity.setEosordaftflg(dto.getEosordaftflg());
        }
        if (needsMapping(dto, dto.getEosslpno(), "eosslpno")) {
            entity.setEosslpno(dto.getEosslpno());
        }
        if (needsMapping(dto, dto.getHdrdbxdiv(), "hdrdbxdiv")) {
            entity.setHdrdbxdiv(dto.getHdrdbxdiv());
        }
        if (needsMapping(dto, dto.getInotrfsldiv(), "inotrfsldiv")) {
            entity.setInotrfsldiv(dto.getInotrfsldiv());
        }
        if (needsMapping(dto, dto.getBxmntrfsldiv(), "bxmntrfsldiv")) {
            entity.setBxmntrfsldiv(dto.getBxmntrfsldiv());
        }
        if (needsMapping(dto, dto.getSlpmrgtmg(), "slpmrgtmg")) {
            entity.setSlpmrgtmg(dto.getSlpmrgtmg());
        }
        if (needsMapping(dto, dto.getZzblotdt(), "zzblotdt")) {
            entity.setZzblotdt(dto.getZzblotdt());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getMatnr(), "matnr")) {
            entity.setMatnr(dto.getMatnr());
        }
        if (needsMapping(dto, dto.getKwmeng(), "kwmeng")) {
            entity.setKwmeng(dto.getKwmeng());
        }
        if (needsMapping(dto, dto.getMvgr1(), "mvgr1")) {
            entity.setMvgr1(dto.getMvgr1());
        }
        if (needsMapping(dto, dto.getMvgr4(), "mvgr4")) {
            entity.setMvgr4(dto.getMvgr4());
        }
        if (needsMapping(dto, dto.getKzwi3(), "kzwi3")) {
            entity.setKzwi3(dto.getKzwi3());
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
    protected boolean needsMapping(EShippingPlanBulkInputDto dto, Object value, String propName) {
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
    public List<EShippingPlanBulkInput> mappingToEntityList(List<EShippingPlanBulkInputDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EShippingPlanBulkInput> entityList = new ArrayList<EShippingPlanBulkInput>();
        for (EShippingPlanBulkInputDto dto : dtoList) {
            EShippingPlanBulkInput entity = mappingToEntity(dto);
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
    public EShippingPlanBulkInputDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EShippingPlanBulkInputDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EShippingPlanBulkInputDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EShippingPlanBulkInputDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EShippingPlanBulkInputDtoMapper reverseReference() {
        setReverseReference(true);
        return (EShippingPlanBulkInputDtoMapper)this;
    }
}

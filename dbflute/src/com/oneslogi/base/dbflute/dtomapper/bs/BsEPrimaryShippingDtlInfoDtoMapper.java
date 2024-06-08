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
 * The DTO mapper of E_PRIMARY_SHIPPING_DTL_INFO as TABLE. <br>
 * 一次輸送詳細情報受信テーブル
 * <pre>
 * [primary-key]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
 *
 * [column]
 *     PRIMARY_SHIPPING_DTL_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZBUKRS, ZZSNDYMD, RCDID, ZZREFENO, BNWHCD, HDRID, DTLNO, SPNDDA, PDLGTM, ZZSENDNO, PRCSORG, EKGRP, SPCD, SPSKPLCD, RCCD, RCSKPLCD, ZZRCVYMD, ZZSHTYPE, AGCD, ZZCBXQTY, ZZPLTQTY, ZZTPLQTY, ZZSHPCLS, ZZREFE01, ZZREFE02, ZZREFE03, ZZREFE04, ZZREFE05, ZZREFE06, ZZREFE07, ZZREFE08, ZZREFE09, ZZREFE10, DTLQA, ZZREFENO2, OPRTNO, BLOCKNM, ZZMATNR, LOTNO, QUANTY, GRPCSD, SFPOQA, DSSKPLCD, MFINF, SFTHDES, CNFATCL, LASTGR, SFLASTDES, SHNO, PLTNO, TRADELIVNO, BATJMFYM, SFFIL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
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
public abstract class BsEPrimaryShippingDtlInfoDtoMapper implements DtoMapper<EPrimaryShippingDtlInfo, EPrimaryShippingDtlInfoDto>, Serializable {

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
    public BsEPrimaryShippingDtlInfoDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEPrimaryShippingDtlInfoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EPrimaryShippingDtlInfoDto mappingToDto(EPrimaryShippingDtlInfo entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EPrimaryShippingDtlInfoDto dto = new EPrimaryShippingDtlInfoDto();
        dto.setPrimaryShippingDtlInfoId(entity.getPrimaryShippingDtlInfoId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setZzbukrs(entity.getZzbukrs());
        dto.setZzsndymd(entity.getZzsndymd());
        dto.setRcdid(entity.getRcdid());
        dto.setZzrefeno(entity.getZzrefeno());
        dto.setBnwhcd(entity.getBnwhcd());
        dto.setHdrid(entity.getHdrid());
        dto.setDtlno(entity.getDtlno());
        dto.setSpndda(entity.getSpndda());
        dto.setPdlgtm(entity.getPdlgtm());
        dto.setZzsendno(entity.getZzsendno());
        dto.setPrcsorg(entity.getPrcsorg());
        dto.setEkgrp(entity.getEkgrp());
        dto.setSpcd(entity.getSpcd());
        dto.setSpskplcd(entity.getSpskplcd());
        dto.setRccd(entity.getRccd());
        dto.setRcskplcd(entity.getRcskplcd());
        dto.setZzrcvymd(entity.getZzrcvymd());
        dto.setZzshtype(entity.getZzshtype());
        dto.setAgcd(entity.getAgcd());
        dto.setZzcbxqty(entity.getZzcbxqty());
        dto.setZzpltqty(entity.getZzpltqty());
        dto.setZztplqty(entity.getZztplqty());
        dto.setZzshpcls(entity.getZzshpcls());
        dto.setZzrefe01(entity.getZzrefe01());
        dto.setZzrefe02(entity.getZzrefe02());
        dto.setZzrefe03(entity.getZzrefe03());
        dto.setZzrefe04(entity.getZzrefe04());
        dto.setZzrefe05(entity.getZzrefe05());
        dto.setZzrefe06(entity.getZzrefe06());
        dto.setZzrefe07(entity.getZzrefe07());
        dto.setZzrefe08(entity.getZzrefe08());
        dto.setZzrefe09(entity.getZzrefe09());
        dto.setZzrefe10(entity.getZzrefe10());
        dto.setDtlqa(entity.getDtlqa());
        dto.setZzrefeno2(entity.getZzrefeno2());
        dto.setOprtno(entity.getOprtno());
        dto.setBlocknm(entity.getBlocknm());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setLotno(entity.getLotno());
        dto.setQuanty(entity.getQuanty());
        dto.setGrpcsd(entity.getGrpcsd());
        dto.setSfpoqa(entity.getSfpoqa());
        dto.setDsskplcd(entity.getDsskplcd());
        dto.setMfinf(entity.getMfinf());
        dto.setSfthdes(entity.getSfthdes());
        dto.setCnfatcl(entity.getCnfatcl());
        dto.setLastgr(entity.getLastgr());
        dto.setSflastdes(entity.getSflastdes());
        dto.setShno(entity.getShno());
        dto.setPltno(entity.getPltno());
        dto.setTradelivno(entity.getTradelivno());
        dto.setBatjmfym(entity.getBatjmfym());
        dto.setSffil(entity.getSffil());
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
    public List<EPrimaryShippingDtlInfoDto> mappingToDtoList(List<EPrimaryShippingDtlInfo> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EPrimaryShippingDtlInfoDto> dtoList = new ArrayList<EPrimaryShippingDtlInfoDto>();
        for (EPrimaryShippingDtlInfo entity : entityList) {
            EPrimaryShippingDtlInfoDto dto = mappingToDto(entity);
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
    public EPrimaryShippingDtlInfo mappingToEntity(EPrimaryShippingDtlInfoDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EPrimaryShippingDtlInfo entity = new EPrimaryShippingDtlInfo();
        if (needsMapping(dto, dto.getPrimaryShippingDtlInfoId(), "primaryShippingDtlInfoId")) {
            entity.setPrimaryShippingDtlInfoId(dto.getPrimaryShippingDtlInfoId());
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
        if (needsMapping(dto, dto.getZzbukrs(), "zzbukrs")) {
            entity.setZzbukrs(dto.getZzbukrs());
        }
        if (needsMapping(dto, dto.getZzsndymd(), "zzsndymd")) {
            entity.setZzsndymd(dto.getZzsndymd());
        }
        if (needsMapping(dto, dto.getRcdid(), "rcdid")) {
            entity.setRcdid(dto.getRcdid());
        }
        if (needsMapping(dto, dto.getZzrefeno(), "zzrefeno")) {
            entity.setZzrefeno(dto.getZzrefeno());
        }
        if (needsMapping(dto, dto.getBnwhcd(), "bnwhcd")) {
            entity.setBnwhcd(dto.getBnwhcd());
        }
        if (needsMapping(dto, dto.getHdrid(), "hdrid")) {
            entity.setHdrid(dto.getHdrid());
        }
        if (needsMapping(dto, dto.getDtlno(), "dtlno")) {
            entity.setDtlno(dto.getDtlno());
        }
        if (needsMapping(dto, dto.getSpndda(), "spndda")) {
            entity.setSpndda(dto.getSpndda());
        }
        if (needsMapping(dto, dto.getPdlgtm(), "pdlgtm")) {
            entity.setPdlgtm(dto.getPdlgtm());
        }
        if (needsMapping(dto, dto.getZzsendno(), "zzsendno")) {
            entity.setZzsendno(dto.getZzsendno());
        }
        if (needsMapping(dto, dto.getPrcsorg(), "prcsorg")) {
            entity.setPrcsorg(dto.getPrcsorg());
        }
        if (needsMapping(dto, dto.getEkgrp(), "ekgrp")) {
            entity.setEkgrp(dto.getEkgrp());
        }
        if (needsMapping(dto, dto.getSpcd(), "spcd")) {
            entity.setSpcd(dto.getSpcd());
        }
        if (needsMapping(dto, dto.getSpskplcd(), "spskplcd")) {
            entity.setSpskplcd(dto.getSpskplcd());
        }
        if (needsMapping(dto, dto.getRccd(), "rccd")) {
            entity.setRccd(dto.getRccd());
        }
        if (needsMapping(dto, dto.getRcskplcd(), "rcskplcd")) {
            entity.setRcskplcd(dto.getRcskplcd());
        }
        if (needsMapping(dto, dto.getZzrcvymd(), "zzrcvymd")) {
            entity.setZzrcvymd(dto.getZzrcvymd());
        }
        if (needsMapping(dto, dto.getZzshtype(), "zzshtype")) {
            entity.setZzshtype(dto.getZzshtype());
        }
        if (needsMapping(dto, dto.getAgcd(), "agcd")) {
            entity.setAgcd(dto.getAgcd());
        }
        if (needsMapping(dto, dto.getZzcbxqty(), "zzcbxqty")) {
            entity.setZzcbxqty(dto.getZzcbxqty());
        }
        if (needsMapping(dto, dto.getZzpltqty(), "zzpltqty")) {
            entity.setZzpltqty(dto.getZzpltqty());
        }
        if (needsMapping(dto, dto.getZztplqty(), "zztplqty")) {
            entity.setZztplqty(dto.getZztplqty());
        }
        if (needsMapping(dto, dto.getZzshpcls(), "zzshpcls")) {
            entity.setZzshpcls(dto.getZzshpcls());
        }
        if (needsMapping(dto, dto.getZzrefe01(), "zzrefe01")) {
            entity.setZzrefe01(dto.getZzrefe01());
        }
        if (needsMapping(dto, dto.getZzrefe02(), "zzrefe02")) {
            entity.setZzrefe02(dto.getZzrefe02());
        }
        if (needsMapping(dto, dto.getZzrefe03(), "zzrefe03")) {
            entity.setZzrefe03(dto.getZzrefe03());
        }
        if (needsMapping(dto, dto.getZzrefe04(), "zzrefe04")) {
            entity.setZzrefe04(dto.getZzrefe04());
        }
        if (needsMapping(dto, dto.getZzrefe05(), "zzrefe05")) {
            entity.setZzrefe05(dto.getZzrefe05());
        }
        if (needsMapping(dto, dto.getZzrefe06(), "zzrefe06")) {
            entity.setZzrefe06(dto.getZzrefe06());
        }
        if (needsMapping(dto, dto.getZzrefe07(), "zzrefe07")) {
            entity.setZzrefe07(dto.getZzrefe07());
        }
        if (needsMapping(dto, dto.getZzrefe08(), "zzrefe08")) {
            entity.setZzrefe08(dto.getZzrefe08());
        }
        if (needsMapping(dto, dto.getZzrefe09(), "zzrefe09")) {
            entity.setZzrefe09(dto.getZzrefe09());
        }
        if (needsMapping(dto, dto.getZzrefe10(), "zzrefe10")) {
            entity.setZzrefe10(dto.getZzrefe10());
        }
        if (needsMapping(dto, dto.getDtlqa(), "dtlqa")) {
            entity.setDtlqa(dto.getDtlqa());
        }
        if (needsMapping(dto, dto.getZzrefeno2(), "zzrefeno2")) {
            entity.setZzrefeno2(dto.getZzrefeno2());
        }
        if (needsMapping(dto, dto.getOprtno(), "oprtno")) {
            entity.setOprtno(dto.getOprtno());
        }
        if (needsMapping(dto, dto.getBlocknm(), "blocknm")) {
            entity.setBlocknm(dto.getBlocknm());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getLotno(), "lotno")) {
            entity.setLotno(dto.getLotno());
        }
        if (needsMapping(dto, dto.getQuanty(), "quanty")) {
            entity.setQuanty(dto.getQuanty());
        }
        if (needsMapping(dto, dto.getGrpcsd(), "grpcsd")) {
            entity.setGrpcsd(dto.getGrpcsd());
        }
        if (needsMapping(dto, dto.getSfpoqa(), "sfpoqa")) {
            entity.setSfpoqa(dto.getSfpoqa());
        }
        if (needsMapping(dto, dto.getDsskplcd(), "dsskplcd")) {
            entity.setDsskplcd(dto.getDsskplcd());
        }
        if (needsMapping(dto, dto.getMfinf(), "mfinf")) {
            entity.setMfinf(dto.getMfinf());
        }
        if (needsMapping(dto, dto.getSfthdes(), "sfthdes")) {
            entity.setSfthdes(dto.getSfthdes());
        }
        if (needsMapping(dto, dto.getCnfatcl(), "cnfatcl")) {
            entity.setCnfatcl(dto.getCnfatcl());
        }
        if (needsMapping(dto, dto.getLastgr(), "lastgr")) {
            entity.setLastgr(dto.getLastgr());
        }
        if (needsMapping(dto, dto.getSflastdes(), "sflastdes")) {
            entity.setSflastdes(dto.getSflastdes());
        }
        if (needsMapping(dto, dto.getShno(), "shno")) {
            entity.setShno(dto.getShno());
        }
        if (needsMapping(dto, dto.getPltno(), "pltno")) {
            entity.setPltno(dto.getPltno());
        }
        if (needsMapping(dto, dto.getTradelivno(), "tradelivno")) {
            entity.setTradelivno(dto.getTradelivno());
        }
        if (needsMapping(dto, dto.getBatjmfym(), "batjmfym")) {
            entity.setBatjmfym(dto.getBatjmfym());
        }
        if (needsMapping(dto, dto.getSffil(), "sffil")) {
            entity.setSffil(dto.getSffil());
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
    protected boolean needsMapping(EPrimaryShippingDtlInfoDto dto, Object value, String propName) {
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
    public List<EPrimaryShippingDtlInfo> mappingToEntityList(List<EPrimaryShippingDtlInfoDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EPrimaryShippingDtlInfo> entityList = new ArrayList<EPrimaryShippingDtlInfo>();
        for (EPrimaryShippingDtlInfoDto dto : dtoList) {
            EPrimaryShippingDtlInfo entity = mappingToEntity(dto);
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
    public EPrimaryShippingDtlInfoDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EPrimaryShippingDtlInfoDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EPrimaryShippingDtlInfoDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EPrimaryShippingDtlInfoDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EPrimaryShippingDtlInfoDtoMapper reverseReference() {
        setReverseReference(true);
        return (EPrimaryShippingDtlInfoDtoMapper)this;
    }
}

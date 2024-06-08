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
 * The DTO mapper of T_TRRCV as TABLE. <br>
 * 入庫予定
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, ITEMCD, PARTFLG, RECEIVE_STS, PRIORITIES, COMPANYCD, RECEIVEDATE, LOGISTICSCD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, TRACCEPT_ID, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, TERMINAL_CD, WAREHOUSE_CD, FC_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_RECEIVE_PLAN_H, T_TRRCVEXTEND(AsOne)
 *
 * [referrer-table]
 *     T_TRRCVDETAIL, T_TRRCVEXTEND
 *
 * [foreign-property]
 *     tReceivePlanH, tTrrcvextendAsOne
 *
 * [referrer-property]
 *     tTrrcvdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrrcvDtoMapper implements DtoMapper<TTrrcv, TTrrcvDto>, Serializable {

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
    protected boolean _suppressTReceivePlanH;
    protected boolean _suppressTTrrcvdetailList;
    protected boolean _suppressTTrrcvextendAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrrcvDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrrcvDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrrcvDto mappingToDto(TTrrcv entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrrcvDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcvDto dto = new TTrrcvDto();
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setPrekey(entity.getPrekey());
        dto.setTemplateflg(entity.getTemplateflg());
        dto.setRcvinspectflg(entity.getRcvinspectflg());
        dto.setSupplierrcvno(entity.getSupplierrcvno());
        dto.setRmano(entity.getRmano());
        dto.setRcvtype(entity.getRcvtype());
        dto.setItemcd(entity.getItemcd());
        dto.setPartflg(entity.getPartflg());
        dto.setReceiveSts(entity.getReceiveSts());
        dto.setPriorities(entity.getPriorities());
        dto.setCompanycd(entity.getCompanycd());
        dto.setReceivedate(entity.getReceivedate());
        dto.setLogisticscd(entity.getLogisticscd());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setSuppliername(entity.getSuppliername());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setPostno(entity.getPostno());
        dto.setCountrycd(entity.getCountrycd());
        dto.setPortcd(entity.getPortcd());
        dto.setDistrictcd(entity.getDistrictcd());
        dto.setSupplierphone(entity.getSupplierphone());
        dto.setFax1(entity.getFax1());
        dto.setEmail(entity.getEmail());
        dto.setRefname(entity.getRefname());
        dto.setFromcd(entity.getFromcd());
        dto.setFromsub(entity.getFromsub());
        dto.setFromname(entity.getFromname());
        dto.setFromaddress1(entity.getFromaddress1());
        dto.setFromaddress2(entity.getFromaddress2());
        dto.setFromaddress3(entity.getFromaddress3());
        dto.setFrompostno(entity.getFrompostno());
        dto.setFromcountrycd(entity.getFromcountrycd());
        dto.setFromportcd(entity.getFromportcd());
        dto.setFromdistrictcd(entity.getFromdistrictcd());
        dto.setFromphone(entity.getFromphone());
        dto.setFromfax(entity.getFromfax());
        dto.setFromemail(entity.getFromemail());
        dto.setFromrefname(entity.getFromrefname());
        dto.setCarriercd(entity.getCarriercd());
        dto.setCarriername(entity.getCarriername());
        dto.setCarrierwbno(entity.getCarrierwbno());
        dto.setDeliverycd(entity.getDeliverycd());
        dto.setCarrierno(entity.getCarrierno());
        dto.setCarriersname(entity.getCarriersname());
        dto.setCarrierseq(entity.getCarrierseq());
        dto.setExpectedtime(entity.getExpectedtime());
        dto.setNotes(entity.getNotes());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setOtherrefno2(entity.getOtherrefno2());
        dto.setOtherrefno3(entity.getOtherrefno3());
        dto.setAllocgroup(entity.getAllocgroup());
        dto.setTracceptId(entity.getTracceptId());
        dto.setAcceptusercd(entity.getAcceptusercd());
        dto.setInspectedusercd(entity.getInspectedusercd());
        dto.setReceivedusercd(entity.getReceivedusercd());
        dto.setMovekey(entity.getMovekey());
        dto.setAssykey(entity.getAssykey());
        dto.setProducekey(entity.getProducekey());
        dto.setTerminalCd(entity.getTerminalCd());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setFcFlg(entity.getFcFlg());
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
        if (!_suppressTReceivePlanH && entity.getTReceivePlanH() != null) {
            TReceivePlanH relationEntity = entity.getTReceivePlanH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanHDto relationDto = (TReceivePlanHDto)cachedDto;
                dto.setTReceivePlanH(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcvAsOne(dto);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcvAsOne();
                TReceivePlanHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanH(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcvAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanH());
                }
            }
        };
        if (!_suppressTTrrcvdetailList && !entity.getTTrrcvdetailList().isEmpty()) {
            TTrrcvdetailDtoMapper mapper = new TTrrcvdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrrcv();
            List<TTrrcvdetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrrcvdetailList());
            dto.setTTrrcvdetailList(relationDtoList);
            if (reverseReference) {
                for (TTrrcvdetailDto relationDto : relationDtoList) {
                    relationDto.setTTrrcv(dto);
                }
            }
        };
        if (!_suppressTTrrcvextendAsOne && entity.getTTrrcvextendAsOne() != null) {
            TTrrcvextend relationEntity = entity.getTTrrcvextendAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrrcvextendDto relationDto = (TTrrcvextendDto)cachedDto;
                dto.setTTrrcvextendAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcv(dto);
                }
            } else {
                TTrrcvextendDtoMapper mapper = new TTrrcvextendDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcv();
                TTrrcvextendDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrrcvextendAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTTrrcv(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrrcvextendAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrrcvDto> mappingToDtoList(List<TTrrcv> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrrcvDto> dtoList = new ArrayList<TTrrcvDto>();
        for (TTrrcv entity : entityList) {
            TTrrcvDto dto = mappingToDto(entity);
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
    public TTrrcv mappingToEntity(TTrrcvDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrrcv)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrrcv entity = new TTrrcv();
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getPrekey(), "prekey")) {
            entity.setPrekey(dto.getPrekey());
        }
        if (needsMapping(dto, dto.getTemplateflg(), "templateflg")) {
            entity.setTemplateflg(dto.getTemplateflg());
        }
        if (needsMapping(dto, dto.getRcvinspectflg(), "rcvinspectflg")) {
            entity.setRcvinspectflg(dto.getRcvinspectflg());
        }
        if (needsMapping(dto, dto.getSupplierrcvno(), "supplierrcvno")) {
            entity.setSupplierrcvno(dto.getSupplierrcvno());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getRcvtype(), "rcvtype")) {
            entity.setRcvtype(dto.getRcvtype());
        }
        if (needsMapping(dto, dto.getItemcd(), "itemcd")) {
            entity.setItemcd(dto.getItemcd());
        }
        if (needsMapping(dto, dto.getPartflg(), "partflg")) {
            entity.setPartflg(dto.getPartflg());
        }
        if (needsMapping(dto, dto.getReceiveSts(), "receiveSts")) {
            entity.setReceiveSts(dto.getReceiveSts());
        }
        if (needsMapping(dto, dto.getPriorities(), "priorities")) {
            entity.setPriorities(dto.getPriorities());
        }
        if (needsMapping(dto, dto.getCompanycd(), "companycd")) {
            entity.setCompanycd(dto.getCompanycd());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getLogisticscd(), "logisticscd")) {
            entity.setLogisticscd(dto.getLogisticscd());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getSuppliername(), "suppliername")) {
            entity.setSuppliername(dto.getSuppliername());
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
        if (needsMapping(dto, dto.getSupplierphone(), "supplierphone")) {
            entity.setSupplierphone(dto.getSupplierphone());
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
        if (needsMapping(dto, dto.getFromcd(), "fromcd")) {
            entity.setFromcd(dto.getFromcd());
        }
        if (needsMapping(dto, dto.getFromsub(), "fromsub")) {
            entity.setFromsub(dto.getFromsub());
        }
        if (needsMapping(dto, dto.getFromname(), "fromname")) {
            entity.setFromname(dto.getFromname());
        }
        if (needsMapping(dto, dto.getFromaddress1(), "fromaddress1")) {
            entity.setFromaddress1(dto.getFromaddress1());
        }
        if (needsMapping(dto, dto.getFromaddress2(), "fromaddress2")) {
            entity.setFromaddress2(dto.getFromaddress2());
        }
        if (needsMapping(dto, dto.getFromaddress3(), "fromaddress3")) {
            entity.setFromaddress3(dto.getFromaddress3());
        }
        if (needsMapping(dto, dto.getFrompostno(), "frompostno")) {
            entity.setFrompostno(dto.getFrompostno());
        }
        if (needsMapping(dto, dto.getFromcountrycd(), "fromcountrycd")) {
            entity.setFromcountrycd(dto.getFromcountrycd());
        }
        if (needsMapping(dto, dto.getFromportcd(), "fromportcd")) {
            entity.setFromportcd(dto.getFromportcd());
        }
        if (needsMapping(dto, dto.getFromdistrictcd(), "fromdistrictcd")) {
            entity.setFromdistrictcd(dto.getFromdistrictcd());
        }
        if (needsMapping(dto, dto.getFromphone(), "fromphone")) {
            entity.setFromphone(dto.getFromphone());
        }
        if (needsMapping(dto, dto.getFromfax(), "fromfax")) {
            entity.setFromfax(dto.getFromfax());
        }
        if (needsMapping(dto, dto.getFromemail(), "fromemail")) {
            entity.setFromemail(dto.getFromemail());
        }
        if (needsMapping(dto, dto.getFromrefname(), "fromrefname")) {
            entity.setFromrefname(dto.getFromrefname());
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
        if (needsMapping(dto, dto.getCarrierseq(), "carrierseq")) {
            entity.setCarrierseq(dto.getCarrierseq());
        }
        if (needsMapping(dto, dto.getExpectedtime(), "expectedtime")) {
            entity.setExpectedtime(dto.getExpectedtime());
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
        if (needsMapping(dto, dto.getAllocgroup(), "allocgroup")) {
            entity.setAllocgroup(dto.getAllocgroup());
        }
        if (needsMapping(dto, dto.getTracceptId(), "tracceptId")) {
            entity.setTracceptId(dto.getTracceptId());
        }
        if (needsMapping(dto, dto.getAcceptusercd(), "acceptusercd")) {
            entity.setAcceptusercd(dto.getAcceptusercd());
        }
        if (needsMapping(dto, dto.getInspectedusercd(), "inspectedusercd")) {
            entity.setInspectedusercd(dto.getInspectedusercd());
        }
        if (needsMapping(dto, dto.getReceivedusercd(), "receivedusercd")) {
            entity.setReceivedusercd(dto.getReceivedusercd());
        }
        if (needsMapping(dto, dto.getMovekey(), "movekey")) {
            entity.setMovekey(dto.getMovekey());
        }
        if (needsMapping(dto, dto.getAssykey(), "assykey")) {
            entity.setAssykey(dto.getAssykey());
        }
        if (needsMapping(dto, dto.getProducekey(), "producekey")) {
            entity.setProducekey(dto.getProducekey());
        }
        if (needsMapping(dto, dto.getTerminalCd(), "terminalCd")) {
            entity.setTerminalCd(dto.getTerminalCd());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getFcFlg(), "fcFlg")) {
            entity.setFcFlg(dto.getFcFlg());
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
        if (!_suppressTReceivePlanH && dto.getTReceivePlanH() != null) {
            TReceivePlanHDto relationDto = dto.getTReceivePlanH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanH relationEntity = (TReceivePlanH)cachedEntity;
                entity.setTReceivePlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcvAsOne(entity);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcvAsOne();
                TReceivePlanH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcvAsOne(entity);
                }
                if (instanceCache && entity.getTReceivePlanH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanH());
                }
            }
        };
        if (!_suppressTTrrcvdetailList && !dto.getTTrrcvdetailList().isEmpty()) {
            TTrrcvdetailDtoMapper mapper = new TTrrcvdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrrcv();
            List<TTrrcvdetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrrcvdetailList());
            entity.setTTrrcvdetailList(relationEntityList);
            if (reverseReference) {
                for (TTrrcvdetail relationEntity : relationEntityList) {
                    relationEntity.setTTrrcv(entity);
                }
            }
        };
        if (!_suppressTTrrcvextendAsOne && dto.getTTrrcvextendAsOne() != null) {
            TTrrcvextendDto relationDto = dto.getTTrrcvextendAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrrcvextend relationEntity = (TTrrcvextend)cachedEntity;
                entity.setTTrrcvextendAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcv(entity);
                }
            } else {
                TTrrcvextendDtoMapper mapper = new TTrrcvextendDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrrcv();
                TTrrcvextend relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrrcvextendAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTTrrcv(entity);
                }
                if (instanceCache && entity.getTTrrcvextendAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrrcvextendAsOne());
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
    protected boolean needsMapping(TTrrcvDto dto, Object value, String propName) {
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
    public List<TTrrcv> mappingToEntityList(List<TTrrcvDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrrcv> entityList = new ArrayList<TTrrcv>();
        for (TTrrcvDto dto : dtoList) {
            TTrrcv entity = mappingToEntity(dto);
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
    public void suppressTReceivePlanH() {
        _suppressTReceivePlanH = true;
    }
    public void suppressTTrrcvdetailList() {
        _suppressTTrrcvdetailList = true;
    }
    public void suppressTTrrcvextendAsOne() {
        _suppressTTrrcvextendAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressTReceivePlanH();
        suppressTTrrcvdetailList();
        suppressTTrrcvextendAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressTReceivePlanH = false;
        _suppressTTrrcvdetailList = false;
        _suppressTTrrcvextendAsOne = false;
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
    public TTrrcvDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrrcvDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrrcvDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrrcvDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrrcvDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrrcvDtoMapper)this;
    }
}

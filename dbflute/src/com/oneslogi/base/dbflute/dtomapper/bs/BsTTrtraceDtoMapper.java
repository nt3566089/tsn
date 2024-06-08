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
 * The DTO mapper of T_TRTRACE as TABLE. <br>
 * 製品追跡情報
 * <pre>
 * [primary-key]
 *     TRTRACE_ID
 *
 * [column]
 *     TRTRACE_ID, TRACEKEY, SNDRCVDATETIME, WAREHOUSECD, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, PRODUCT_CD, ITEMCD_IN, ITEMCD_WH, DESIGNCD_CASE, DESIGNCD_IN, DESIGNCD_WH, SOURCECASECD, SENDFLG, FROMFLG, SUPPLIERRCVNO, MIXEDFLG, SYMBOLPASTDATE, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, MAKERCASENO, LENDFLG, CASEINNUMCALC, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, OTHERREFNO2, ORDERTYPE, LIMITDATENOW, CASECREATETYPE, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, LOCGROUP, LOCCD, SHIPDATE, SHIPTOCD, EXAMSTS, TOKUHANCD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, RESERVEAREA, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, DT_EXTDATA2, PALLET_NO, PICK_LIST_KEY, FRONT_BACK_CASE_CD, CENTER_ID, CLIENT_ID, TRANSPORT_PRIORITY, USE_TYPE, OUTPUT_ORDER, FACTORY_ORDER, WAREHOUSE_ORDER, LINEBLOCK_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrtraceDtoMapper implements DtoMapper<TTrtrace, TTrtraceDto>, Serializable {

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
    protected boolean _suppressMCenter;
    protected boolean _suppressMClient;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrtraceDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrtraceDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrtraceDto mappingToDto(TTrtrace entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrtraceDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrtraceDto dto = new TTrtraceDto();
        dto.setTrtraceId(entity.getTrtraceId());
        dto.setTracekey(entity.getTracekey());
        dto.setSndrcvdatetime(entity.getSndrcvdatetime());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setFactorycd(entity.getFactorycd());
        dto.setItemcdCase(entity.getItemcdCase());
        dto.setSkucd(entity.getSkucd());
        dto.setDestinationcd(entity.getDestinationcd());
        dto.setManufacturecd(entity.getManufacturecd());
        dto.setOrderno(entity.getOrderno());
        dto.setMachineno(entity.getMachineno());
        dto.setCreateno(entity.getCreateno());
        dto.setLimitdate(entity.getLimitdate());
        dto.setDatetime(entity.getDatetime());
        dto.setDistributioncd(entity.getDistributioncd());
        dto.setTransportcd(entity.getTransportcd());
        dto.setPalletid(entity.getPalletid());
        dto.setInitnum(entity.getInitnum());
        dto.setCreatedatetime(entity.getCreatedatetime());
        dto.setAssortdatetime(entity.getAssortdatetime());
        dto.setTracetype(entity.getTracetype());
        dto.setLineblock(entity.getLineblock());
        dto.setAssortedunit(entity.getAssortedunit());
        dto.setAssortedindex(entity.getAssortedindex());
        dto.setOperationcode(entity.getOperationcode());
        dto.setCaseinnum(entity.getCaseinnum());
        dto.setAssortnum(entity.getAssortnum());
        dto.setAssortdifnum(entity.getAssortdifnum());
        dto.setDirectioncd(entity.getDirectioncd());
        dto.setPistontype(entity.getPistontype());
        dto.setCustomercd(entity.getCustomercd());
        dto.setDirectionnum(entity.getDirectionnum());
        dto.setDistwarehousecd(entity.getDistwarehousecd());
        dto.setRcvkey(entity.getRcvkey());
        dto.setProductCd(entity.getProductCd());
        dto.setItemcdIn(entity.getItemcdIn());
        dto.setItemcdWh(entity.getItemcdWh());
        dto.setDesigncdCase(entity.getDesigncdCase());
        dto.setDesigncdIn(entity.getDesigncdIn());
        dto.setDesigncdWh(entity.getDesigncdWh());
        dto.setSourcecasecd(entity.getSourcecasecd());
        dto.setSendflg(entity.getSendflg());
        dto.setFromflg(entity.getFromflg());
        dto.setSupplierrcvno(entity.getSupplierrcvno());
        dto.setMixedflg(entity.getMixedflg());
        dto.setSymbolpastdate(entity.getSymbolpastdate());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setMakercaseno(entity.getMakercaseno());
        dto.setLendflg(entity.getLendflg());
        dto.setCaseinnumcalc(entity.getCaseinnumcalc());
        dto.setCaseitfno(entity.getCaseitfno());
        dto.setCasebarcodevaliant(entity.getCasebarcodevaliant());
        dto.setCaselot4(entity.getCaselot4());
        dto.setCasecenterno(entity.getCasecenterno());
        dto.setCasepackno(entity.getCasepackno());
        dto.setCasepacktime(entity.getCasepacktime());
        dto.setCasebarcode(entity.getCasebarcode());
        dto.setOtherrefno2(entity.getOtherrefno2());
        dto.setOrdertype(entity.getOrdertype());
        dto.setLimitdatenow(entity.getLimitdatenow());
        dto.setCasecreatetype(entity.getCasecreatetype());
        dto.setReceivedate(entity.getReceivedate());
        dto.setArrivalportdate(entity.getArrivalportdate());
        dto.setShipname(entity.getShipname());
        dto.setLocgroup(entity.getLocgroup());
        dto.setLoccd(entity.getLoccd());
        dto.setShipdate(entity.getShipdate());
        dto.setShiptocd(entity.getShiptocd());
        dto.setExamsts(entity.getExamsts());
        dto.setTokuhancd(entity.getTokuhancd());
        dto.setSenderLocation(entity.getSenderLocation());
        dto.setReceiverLocation(entity.getReceiverLocation());
        dto.setShipmentId(entity.getShipmentId());
        dto.setShipmentDate(entity.getShipmentDate());
        dto.setNumberOfPallets(entity.getNumberOfPallets());
        dto.setCarrierno(entity.getCarrierno());
        dto.setTkhnorderno(entity.getTkhnorderno());
        dto.setSrccd(entity.getSrccd());
        dto.setBlno(entity.getBlno());
        dto.setInvoiceno(entity.getInvoiceno());
        dto.setSscc(entity.getSscc());
        dto.setCaseno(entity.getCaseno());
        dto.setInvNum(entity.getInvNum());
        dto.setSortNum(entity.getSortNum());
        dto.setAdoptNum(entity.getAdoptNum());
        dto.setReservearea(entity.getReservearea());
        dto.setVaExtdata1(entity.getVaExtdata1());
        dto.setVaExtdata2(entity.getVaExtdata2());
        dto.setVaExtdata3(entity.getVaExtdata3());
        dto.setDtExtdata2(entity.getDtExtdata2());
        dto.setPalletNo(entity.getPalletNo());
        dto.setPickListKey(entity.getPickListKey());
        dto.setFrontBackCaseCd(entity.getFrontBackCaseCd());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setTransportPriority(entity.getTransportPriority());
        dto.setUseType(entity.getUseType());
        dto.setOutputOrder(entity.getOutputOrder());
        dto.setFactoryOrder(entity.getFactoryOrder());
        dto.setWarehouseOrder(entity.getWarehouseOrder());
        dto.setLineblockOrder(entity.getLineblockOrder());
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
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrtraceList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrtraceList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrtraceList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrtraceList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrtraceList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrtraceList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrtraceDto> mappingToDtoList(List<TTrtrace> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrtraceDto> dtoList = new ArrayList<TTrtraceDto>();
        for (TTrtrace entity : entityList) {
            TTrtraceDto dto = mappingToDto(entity);
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
    public TTrtrace mappingToEntity(TTrtraceDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrtrace)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrtrace entity = new TTrtrace();
        if (needsMapping(dto, dto.getTrtraceId(), "trtraceId")) {
            entity.setTrtraceId(dto.getTrtraceId());
        }
        if (needsMapping(dto, dto.getTracekey(), "tracekey")) {
            entity.setTracekey(dto.getTracekey());
        }
        if (needsMapping(dto, dto.getSndrcvdatetime(), "sndrcvdatetime")) {
            entity.setSndrcvdatetime(dto.getSndrcvdatetime());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getFactorycd(), "factorycd")) {
            entity.setFactorycd(dto.getFactorycd());
        }
        if (needsMapping(dto, dto.getItemcdCase(), "itemcdCase")) {
            entity.setItemcdCase(dto.getItemcdCase());
        }
        if (needsMapping(dto, dto.getSkucd(), "skucd")) {
            entity.setSkucd(dto.getSkucd());
        }
        if (needsMapping(dto, dto.getDestinationcd(), "destinationcd")) {
            entity.setDestinationcd(dto.getDestinationcd());
        }
        if (needsMapping(dto, dto.getManufacturecd(), "manufacturecd")) {
            entity.setManufacturecd(dto.getManufacturecd());
        }
        if (needsMapping(dto, dto.getOrderno(), "orderno")) {
            entity.setOrderno(dto.getOrderno());
        }
        if (needsMapping(dto, dto.getMachineno(), "machineno")) {
            entity.setMachineno(dto.getMachineno());
        }
        if (needsMapping(dto, dto.getCreateno(), "createno")) {
            entity.setCreateno(dto.getCreateno());
        }
        if (needsMapping(dto, dto.getLimitdate(), "limitdate")) {
            entity.setLimitdate(dto.getLimitdate());
        }
        if (needsMapping(dto, dto.getDatetime(), "datetime")) {
            entity.setDatetime(dto.getDatetime());
        }
        if (needsMapping(dto, dto.getDistributioncd(), "distributioncd")) {
            entity.setDistributioncd(dto.getDistributioncd());
        }
        if (needsMapping(dto, dto.getTransportcd(), "transportcd")) {
            entity.setTransportcd(dto.getTransportcd());
        }
        if (needsMapping(dto, dto.getPalletid(), "palletid")) {
            entity.setPalletid(dto.getPalletid());
        }
        if (needsMapping(dto, dto.getInitnum(), "initnum")) {
            entity.setInitnum(dto.getInitnum());
        }
        if (needsMapping(dto, dto.getCreatedatetime(), "createdatetime")) {
            entity.setCreatedatetime(dto.getCreatedatetime());
        }
        if (needsMapping(dto, dto.getAssortdatetime(), "assortdatetime")) {
            entity.setAssortdatetime(dto.getAssortdatetime());
        }
        if (needsMapping(dto, dto.getTracetype(), "tracetype")) {
            entity.setTracetype(dto.getTracetype());
        }
        if (needsMapping(dto, dto.getLineblock(), "lineblock")) {
            entity.setLineblock(dto.getLineblock());
        }
        if (needsMapping(dto, dto.getAssortedunit(), "assortedunit")) {
            entity.setAssortedunit(dto.getAssortedunit());
        }
        if (needsMapping(dto, dto.getAssortedindex(), "assortedindex")) {
            entity.setAssortedindex(dto.getAssortedindex());
        }
        if (needsMapping(dto, dto.getOperationcode(), "operationcode")) {
            entity.setOperationcode(dto.getOperationcode());
        }
        if (needsMapping(dto, dto.getCaseinnum(), "caseinnum")) {
            entity.setCaseinnum(dto.getCaseinnum());
        }
        if (needsMapping(dto, dto.getAssortnum(), "assortnum")) {
            entity.setAssortnum(dto.getAssortnum());
        }
        if (needsMapping(dto, dto.getAssortdifnum(), "assortdifnum")) {
            entity.setAssortdifnum(dto.getAssortdifnum());
        }
        if (needsMapping(dto, dto.getDirectioncd(), "directioncd")) {
            entity.setDirectioncd(dto.getDirectioncd());
        }
        if (needsMapping(dto, dto.getPistontype(), "pistontype")) {
            entity.setPistontype(dto.getPistontype());
        }
        if (needsMapping(dto, dto.getCustomercd(), "customercd")) {
            entity.setCustomercd(dto.getCustomercd());
        }
        if (needsMapping(dto, dto.getDirectionnum(), "directionnum")) {
            entity.setDirectionnum(dto.getDirectionnum());
        }
        if (needsMapping(dto, dto.getDistwarehousecd(), "distwarehousecd")) {
            entity.setDistwarehousecd(dto.getDistwarehousecd());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemcdIn(), "itemcdIn")) {
            entity.setItemcdIn(dto.getItemcdIn());
        }
        if (needsMapping(dto, dto.getItemcdWh(), "itemcdWh")) {
            entity.setItemcdWh(dto.getItemcdWh());
        }
        if (needsMapping(dto, dto.getDesigncdCase(), "designcdCase")) {
            entity.setDesigncdCase(dto.getDesigncdCase());
        }
        if (needsMapping(dto, dto.getDesigncdIn(), "designcdIn")) {
            entity.setDesigncdIn(dto.getDesigncdIn());
        }
        if (needsMapping(dto, dto.getDesigncdWh(), "designcdWh")) {
            entity.setDesigncdWh(dto.getDesigncdWh());
        }
        if (needsMapping(dto, dto.getSourcecasecd(), "sourcecasecd")) {
            entity.setSourcecasecd(dto.getSourcecasecd());
        }
        if (needsMapping(dto, dto.getSendflg(), "sendflg")) {
            entity.setSendflg(dto.getSendflg());
        }
        if (needsMapping(dto, dto.getFromflg(), "fromflg")) {
            entity.setFromflg(dto.getFromflg());
        }
        if (needsMapping(dto, dto.getSupplierrcvno(), "supplierrcvno")) {
            entity.setSupplierrcvno(dto.getSupplierrcvno());
        }
        if (needsMapping(dto, dto.getMixedflg(), "mixedflg")) {
            entity.setMixedflg(dto.getMixedflg());
        }
        if (needsMapping(dto, dto.getSymbolpastdate(), "symbolpastdate")) {
            entity.setSymbolpastdate(dto.getSymbolpastdate());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getMakercaseno(), "makercaseno")) {
            entity.setMakercaseno(dto.getMakercaseno());
        }
        if (needsMapping(dto, dto.getLendflg(), "lendflg")) {
            entity.setLendflg(dto.getLendflg());
        }
        if (needsMapping(dto, dto.getCaseinnumcalc(), "caseinnumcalc")) {
            entity.setCaseinnumcalc(dto.getCaseinnumcalc());
        }
        if (needsMapping(dto, dto.getCaseitfno(), "caseitfno")) {
            entity.setCaseitfno(dto.getCaseitfno());
        }
        if (needsMapping(dto, dto.getCasebarcodevaliant(), "casebarcodevaliant")) {
            entity.setCasebarcodevaliant(dto.getCasebarcodevaliant());
        }
        if (needsMapping(dto, dto.getCaselot4(), "caselot4")) {
            entity.setCaselot4(dto.getCaselot4());
        }
        if (needsMapping(dto, dto.getCasecenterno(), "casecenterno")) {
            entity.setCasecenterno(dto.getCasecenterno());
        }
        if (needsMapping(dto, dto.getCasepackno(), "casepackno")) {
            entity.setCasepackno(dto.getCasepackno());
        }
        if (needsMapping(dto, dto.getCasepacktime(), "casepacktime")) {
            entity.setCasepacktime(dto.getCasepacktime());
        }
        if (needsMapping(dto, dto.getCasebarcode(), "casebarcode")) {
            entity.setCasebarcode(dto.getCasebarcode());
        }
        if (needsMapping(dto, dto.getOtherrefno2(), "otherrefno2")) {
            entity.setOtherrefno2(dto.getOtherrefno2());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getLimitdatenow(), "limitdatenow")) {
            entity.setLimitdatenow(dto.getLimitdatenow());
        }
        if (needsMapping(dto, dto.getCasecreatetype(), "casecreatetype")) {
            entity.setCasecreatetype(dto.getCasecreatetype());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getArrivalportdate(), "arrivalportdate")) {
            entity.setArrivalportdate(dto.getArrivalportdate());
        }
        if (needsMapping(dto, dto.getShipname(), "shipname")) {
            entity.setShipname(dto.getShipname());
        }
        if (needsMapping(dto, dto.getLocgroup(), "locgroup")) {
            entity.setLocgroup(dto.getLocgroup());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getShipdate(), "shipdate")) {
            entity.setShipdate(dto.getShipdate());
        }
        if (needsMapping(dto, dto.getShiptocd(), "shiptocd")) {
            entity.setShiptocd(dto.getShiptocd());
        }
        if (needsMapping(dto, dto.getExamsts(), "examsts")) {
            entity.setExamsts(dto.getExamsts());
        }
        if (needsMapping(dto, dto.getTokuhancd(), "tokuhancd")) {
            entity.setTokuhancd(dto.getTokuhancd());
        }
        if (needsMapping(dto, dto.getSenderLocation(), "senderLocation")) {
            entity.setSenderLocation(dto.getSenderLocation());
        }
        if (needsMapping(dto, dto.getReceiverLocation(), "receiverLocation")) {
            entity.setReceiverLocation(dto.getReceiverLocation());
        }
        if (needsMapping(dto, dto.getShipmentId(), "shipmentId")) {
            entity.setShipmentId(dto.getShipmentId());
        }
        if (needsMapping(dto, dto.getShipmentDate(), "shipmentDate")) {
            entity.setShipmentDate(dto.getShipmentDate());
        }
        if (needsMapping(dto, dto.getNumberOfPallets(), "numberOfPallets")) {
            entity.setNumberOfPallets(dto.getNumberOfPallets());
        }
        if (needsMapping(dto, dto.getCarrierno(), "carrierno")) {
            entity.setCarrierno(dto.getCarrierno());
        }
        if (needsMapping(dto, dto.getTkhnorderno(), "tkhnorderno")) {
            entity.setTkhnorderno(dto.getTkhnorderno());
        }
        if (needsMapping(dto, dto.getSrccd(), "srccd")) {
            entity.setSrccd(dto.getSrccd());
        }
        if (needsMapping(dto, dto.getBlno(), "blno")) {
            entity.setBlno(dto.getBlno());
        }
        if (needsMapping(dto, dto.getInvoiceno(), "invoiceno")) {
            entity.setInvoiceno(dto.getInvoiceno());
        }
        if (needsMapping(dto, dto.getSscc(), "sscc")) {
            entity.setSscc(dto.getSscc());
        }
        if (needsMapping(dto, dto.getCaseno(), "caseno")) {
            entity.setCaseno(dto.getCaseno());
        }
        if (needsMapping(dto, dto.getInvNum(), "invNum")) {
            entity.setInvNum(dto.getInvNum());
        }
        if (needsMapping(dto, dto.getSortNum(), "sortNum")) {
            entity.setSortNum(dto.getSortNum());
        }
        if (needsMapping(dto, dto.getAdoptNum(), "adoptNum")) {
            entity.setAdoptNum(dto.getAdoptNum());
        }
        if (needsMapping(dto, dto.getReservearea(), "reservearea")) {
            entity.setReservearea(dto.getReservearea());
        }
        if (needsMapping(dto, dto.getVaExtdata1(), "vaExtdata1")) {
            entity.setVaExtdata1(dto.getVaExtdata1());
        }
        if (needsMapping(dto, dto.getVaExtdata2(), "vaExtdata2")) {
            entity.setVaExtdata2(dto.getVaExtdata2());
        }
        if (needsMapping(dto, dto.getVaExtdata3(), "vaExtdata3")) {
            entity.setVaExtdata3(dto.getVaExtdata3());
        }
        if (needsMapping(dto, dto.getDtExtdata2(), "dtExtdata2")) {
            entity.setDtExtdata2(dto.getDtExtdata2());
        }
        if (needsMapping(dto, dto.getPalletNo(), "palletNo")) {
            entity.setPalletNo(dto.getPalletNo());
        }
        if (needsMapping(dto, dto.getPickListKey(), "pickListKey")) {
            entity.setPickListKey(dto.getPickListKey());
        }
        if (needsMapping(dto, dto.getFrontBackCaseCd(), "frontBackCaseCd")) {
            entity.setFrontBackCaseCd(dto.getFrontBackCaseCd());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getTransportPriority(), "transportPriority")) {
            entity.setTransportPriority(dto.getTransportPriority());
        }
        if (needsMapping(dto, dto.getUseType(), "useType")) {
            entity.setUseType(dto.getUseType());
        }
        if (needsMapping(dto, dto.getOutputOrder(), "outputOrder")) {
            entity.setOutputOrder(dto.getOutputOrder());
        }
        if (needsMapping(dto, dto.getFactoryOrder(), "factoryOrder")) {
            entity.setFactoryOrder(dto.getFactoryOrder());
        }
        if (needsMapping(dto, dto.getWarehouseOrder(), "warehouseOrder")) {
            entity.setWarehouseOrder(dto.getWarehouseOrder());
        }
        if (needsMapping(dto, dto.getLineblockOrder(), "lineblockOrder")) {
            entity.setLineblockOrder(dto.getLineblockOrder());
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
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrtraceList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrtraceList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrtraceList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrtraceList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrtraceList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrtraceList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
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
    protected boolean needsMapping(TTrtraceDto dto, Object value, String propName) {
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
    public List<TTrtrace> mappingToEntityList(List<TTrtraceDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrtrace> entityList = new ArrayList<TTrtrace>();
        for (TTrtraceDto dto : dtoList) {
            TTrtrace entity = mappingToEntity(dto);
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
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMClient();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMClient = false;
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
    public TTrtraceDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrtraceDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrtraceDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrtraceDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrtraceDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrtraceDtoMapper)this;
    }
}

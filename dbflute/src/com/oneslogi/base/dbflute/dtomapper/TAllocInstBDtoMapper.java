package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TAllocInstBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTAllocInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;

/**
 * The DTO mapper of T_ALLOC_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstBDtoMapper extends BsTAllocInstBDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TAllocInstBDtoMapper() {
	}

	public TAllocInstBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TAllocInstBDto mappingToDto(TAllocInstB input) {
		TAllocInstBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCenterId(input.getCenterId());
			output.setClientId(input.getClientId());
			output.setJanCd(input.getJanCd());
			output.setProductId(input.getProductId());
			output.setProductCd(input.getProductCd());
			output.setProductNm(input.getProductNm());
			output.setProductAbbr(input.getProductAbbr());
			output.setInstNum(input.getInstNum());
			output.setSpgQtyOns(input.getSpgQtyOns());
			output.setSpgQtyRemain(input.getSpgQtyRemain());
			output.setBoxId(input.getBoxId());
			output.setShippingPackingNo(input.getShippingPackingNo());
			output.setNetWeight(input.getNetWeight());
			output.setGrossWeight(input.getGrossWeight());
			output.setSupplyCustomerCd(input.getSupplyCustomerCd());
			output.setSupplyCustomerNm(input.getSupplyCustomerNm());
			output.setCarrierCd(input.getCarrierCd());
			output.setDeliveryCourseCd(input.getDeliveryCourseCd());
			output.setDeliveryCourseNm(input.getDeliveryCourseNm());
			output.setPickingWorkNo(input.getPickingWorkNo());
			output.setAllocInstHId(input.getAllocInstHId());
			output.setShpCheckDisplay(input.getShpCheckDisplay());
		}

		return output;
	}

	@Override
	public TAllocInstB mappingToEntity(TAllocInstBDto input) {
		TAllocInstB output = super.mappingToEntity(input);

		if (output != null) {
			output.setCenterId(input.getCenterId());
			output.setClientId(input.getClientId());
			output.setJanCd(input.getJanCd());
			output.setProductId(input.getProductId());
			output.setProductCd(input.getProductCd());
			output.setProductNm(input.getProductNm());
			output.setProductAbbr(input.getProductAbbr());
			output.setInstNum(input.getInstNum());
			output.setSpgQtyOns(input.getSpgQtyOns());
			output.setSpgQtyRemain(input.getSpgQtyRemain());
			output.setBoxId(input.getBoxId());
			output.setShippingPackingNo(input.getShippingPackingNo());
			output.setNetWeight(input.getNetWeight());
			output.setGrossWeight(input.getGrossWeight());
			output.setSupplyCustomerCd(input.getSupplyCustomerCd());
			output.setSupplyCustomerNm(input.getSupplyCustomerNm());
			output.setCarrierCd(input.getCarrierCd());
			output.setDeliveryCourseCd(input.getDeliveryCourseCd());
			output.setDeliveryCourseNm(input.getDeliveryCourseNm());
			output.setPickingWorkNo(input.getPickingWorkNo());
			output.setAllocInstHId(input.getAllocInstHId());
			output.setShpCheckDisplay(input.getShpCheckDisplay());
		}

		return output;
	}
}

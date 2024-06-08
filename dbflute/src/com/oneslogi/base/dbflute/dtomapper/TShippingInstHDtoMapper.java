package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;

/**
 * The DTO mapper of T_SHIPPING_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstHDtoMapper extends BsTShippingInstHDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TShippingInstHDtoMapper() {
	}

	public TShippingInstHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TShippingInstHDto mappingToDto(TShippingInstH input) {
		TShippingInstHDto output = super.mappingToDto(input);

		if (output != null) {
			output.setShippingDtFrom(input.getShippingDtFrom());//出荷日(From)
			output.setShippingDtTo(input.getShippingDtTo());//出荷日(To)
			output.setNoAllcDisplayFlg(input.getNoAllcDisplayFlg());//未出荷全件
			output.setCarrierCd(input.getCarrierCd());//運送業者
			output.setTakingShippingFlg(input.getTakingShippingFlg());//出荷日/作業日
			output.setHeadMessageNm(input.getHeadMessageNm());//エラーメッセージ
			output.setCustomerCd(input.getCustomerCd());//納品先CD
			output.setDtFrom(input.getDtFrom());//日付(From)
			output.setDtTo(input.getDtTo());//日付(To)
			output.setProductCd(input.getProductCd());//商品CD
			output.setStockOutFlg(input.getStockOutFlg());//欠品フラグ
			output.setPickingWorkNo(input.getPickingWorkNo());//出庫作業No.
			output.setProcessTypeCd(input.getProductCd());//処理区分CD
			output.setCustomerNm(input.getCustomerNm());//納品先名称
			output.setDeliveryCourseNm(input.getDeliveryCourseNm());//配送コース名称
			output.setWorkDtFrom(input.getWorkDtFrom());//作業日(From)
			output.setWorkDtTo(input.getWorkDtTo());//作業日(To)
			output.setPickingWorkMessageFlg(input.getPickingWorkMessageFlg());
			output.setCancelDisplay(input.getCancelDisplay());
		}

		return output;
	}

	@Override
	public TShippingInstH mappingToEntity(TShippingInstHDto input) {
		TShippingInstH output = super.mappingToEntity(input);

		if (output != null) {
			output.setShippingDtFrom(input.getShippingDtFrom());//出荷日(From)
			output.setShippingDtTo(input.getShippingDtTo());//出荷日(To)
			output.setNoAllcDisplayFlg(input.getNoAllcDisplayFlg());//未出荷全件
			output.setCarrierCd(input.getCarrierCd());//運送業者
			output.setTakingShippingFlg(input.getTakingShippingFlg());//出荷日/作業日
			output.setHeadMessageNm(input.getHeadMessageNm());//エラーメッセージ
			output.setCustomerCd(input.getCustomerCd());//納品先CD
			output.setDtFrom(input.getDtFrom());//日付(From)
			output.setDtTo(input.getDtTo());//日付(To)
			output.setProductCd(input.getProductCd());//商品CD
			output.setStockOutFlg(input.getStockOutFlg());//欠品フラグ
			output.setPickingWorkNo(input.getPickingWorkNo());//出庫作業No.
			output.setProcessTypeCd(input.getProductCd());//処理区分CD
			output.setCustomerNm(input.getCustomerNm());//納品先名称
			output.setDeliveryCourseNm(input.getDeliveryCourseNm());//配送コース名称
			output.setWorkDtFrom(input.getWorkDtFrom());//作業日(From)
			output.setWorkDtTo(input.getWorkDtTo());//作業日(To)
			output.setPickingWorkMessageFlg(input.getPickingWorkMessageFlg());
			output.setCancelDisplay(input.getCancelDisplay());
		}

		return output;
	}
}

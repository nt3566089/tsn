package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;

/**
 * The DTO mapper of T_RECEIVE_PLAN_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanHDtoMapper extends BsTReceivePlanHDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TReceivePlanHDtoMapper() {
	}

	public TReceivePlanHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TReceivePlanHDto mappingToDto(TReceivePlanH input) {
		TReceivePlanHDto output = super.mappingToDto(input);

		if (output != null) {
			output.setReceivePlanDtFrom(input.getReceivePlanDtFrom());
			output.setReceivePlanDtTo(input.getReceivePlanDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
			output.setClientReceiveNo(input.getClientReceiveNo());
			output.setPrintCondition(input.getPrintCondition());
			output.setRowCount(input.getRowCount());
			output.setLastUpdDt(input.getLastUpdDt());
			output.setFirstStoreDt(input.getFirstStoreDt());
			output.setLastStoreDt(input.getLastStoreDt());
			output.setSumPlanNum(input.getSumPlanNum());
			output.setSumStoreNum(input.getSumStoreNum());
			output.setSumPlanCount(input.getSumPlanCount());
			output.setMessageNm(input.getMessageNm());
			output.setProductCd(input.getProductCd());
			output.setPlanWarehouseCd(input.getPlanWarehouseCd());
			output.setClientOrderNo(input.getClientOrderNo());
			output.setStoreClientOrderNo(input.getStoreClientOrderNo());
			output.setStoreClientReceiveNo(input.getStoreClientReceiveNo());
			output.setMaxCustomerCd(input.getMaxCustomerCd());
			output.setMaxCustomerNm(input.getMaxCustomerNm());
			output.setMaxCustomerAbbr(input.getMaxCustomerAbbr());
			output.setMaxClientReceiveNo(input.getMaxClientReceiveNo());
			output.setMaxProcessTypeCd(input.getMaxProcessTypeCd());
			output.setMaxProcessTypeNm(input.getMaxProcessTypeNm());
			output.setOldReceiveSlipNo(input.getOldReceiveSlipNo());
			output.setReceiveSlipNoTemp(input.getReceiveSlipNoTemp());
			// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi Start
			output.setMaxStockTypeCd(input.getMaxStockTypeCd());
			output.setMaxStockTypeNm(input.getMaxStockTypeNm());
			// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi End
			output.setDeleteDisplay(input.getDeleteDisplay());
		}

		return output;
	}

	@Override
	public TReceivePlanH mappingToEntity(TReceivePlanHDto input) {
		TReceivePlanH output = super.mappingToEntity(input);

		if (output != null) {
			output.setReceivePlanDtFrom(input.getReceivePlanDtFrom());
			output.setReceivePlanDtTo(input.getReceivePlanDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
			output.setClientReceiveNo(input.getClientReceiveNo());
			output.setPrintCondition(input.getPrintCondition());
			output.setRowCount(input.getRowCount());
			output.setLastUpdDt(input.getLastUpdDt());
			output.setFirstStoreDt(input.getFirstStoreDt());
			output.setLastStoreDt(input.getLastStoreDt());
			output.setSumPlanNum(input.getSumPlanNum());
			output.setSumStoreNum(input.getSumStoreNum());
			output.setSumPlanCount(input.getSumPlanCount());
			output.setMessageNm(input.getMessageNm());
			output.setProductCd(input.getProductCd());
			output.setPlanWarehouseCd(input.getPlanWarehouseCd());
			output.setClientOrderNo(input.getClientOrderNo());
			output.setStoreClientOrderNo(input.getStoreClientOrderNo());
			output.setStoreClientReceiveNo(input.getStoreClientReceiveNo());
			output.setMaxCustomerCd(input.getMaxCustomerCd());
			output.setMaxCustomerNm(input.getMaxCustomerNm());
			output.setMaxCustomerAbbr(input.getMaxCustomerAbbr());
			output.setMaxClientReceiveNo(input.getMaxClientReceiveNo());
			output.setMaxProcessTypeCd(input.getMaxProcessTypeCd());
			output.setMaxProcessTypeNm(input.getMaxProcessTypeNm());
			output.setOldReceiveSlipNo(input.getOldReceiveSlipNo());
			output.setReceiveSlipNoTemp(input.getReceiveSlipNoTemp());
			// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi Start
			output.setMaxStockTypeCd(input.getMaxStockTypeCd());
			output.setMaxStockTypeNm(input.getMaxStockTypeNm());
			// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi End
			output.setDeleteDisplay(input.getDeleteDisplay());
		}

		return output;
	}
}

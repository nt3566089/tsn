package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;

/**
 * The DTO mapper of T_RECEIVE_PLAN_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBDtoMapper extends BsTReceivePlanBDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TReceivePlanBDtoMapper() {
    }

    public TReceivePlanBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public TReceivePlanBDto mappingToDto(TReceivePlanB input) {
		TReceivePlanBDto output = super.mappingToDto(input);

		if (output != null) {

			output.setMessageNm(input.getMessageNm());
			output.setUserNm(input.getUserNm());
			// [Ver3.0] unit of measure対応 2017.11.20 駱 Del
			output.setUnitNum(input.getUnitNum());
			output.setReceivePlanDtFrom(input.getReceivePlanDtFrom());
			output.setReceivePlanDtTo(input.getReceivePlanDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
			output.setPrintCondition(input.getPrintCondition());
			output.setRowCount(input.getRowCount());
			output.setFirstStoreDt(input.getFirstStoreDt());
			output.setLastStoreDt(input.getLastStoreDt());
			output.setSumPlanNum(input.getSumPlanNum());
			output.setPreceNum(input.getPreceNum());
			// [Ver3.0] unit of measure対応 2017.11.20 駱 Del
			output.setReceiveStatus(input.getReceiveStatus());
			output.setStrReceiveDeliveryStatus(input.getStrReceiveDeliveryStatus());
			output.setMaxStoreLabelNo(input.getMaxStoreLabelNo());
			output.setLastAddDt(input.getLastAddDt());
			output.setLastHtStoreInspectionDt(input.getLastHtStoreInspectionDt());
			output.setLastStoreFlgNm(input.getLastStoreFlgNm());
			output.setMaxLocationNm(input.getMaxLocationNm());
			output.setMaxUnitNum(input.getMaxUnitNum());
			output.setMaxStockTypeCd(input.getMaxStockTypeCd());
			output.setMaxStockTypeNm(input.getMaxStockTypeNm());
			output.setMaxclientOrderNo(input.getMaxclientOrderNo());
			output.setMaxClientReceiveNo(input.getMaxClientReceiveNo());
			output.setMaxLot(input.getMaxLot());
			output.setMaxLimitDt(input.getMaxLimitDt());
			output.setMaxCustomerCd(input.getMaxCustomerCd());
			output.setMaxCustomerNm(input.getMaxCustomerNm());
			output.setMaxCustomerAbbr(input.getMaxCustomerAbbr());
			output.setMaxPlanDepositCd(input.getMaxPlanDepositCd());
			output.setMaxPlanDepositNm(input.getMaxPlanDepositNm());
			output.setReceiveStatusTemp(input.getReceiveStatusTemp());
		}

		return output;
	}

	@Override
	public TReceivePlanB mappingToEntity(TReceivePlanBDto input) {
		TReceivePlanB output = super.mappingToEntity(input);

		if (output != null) {

			output.setMessageNm(input.getMessageNm());
			output.setUserNm(input.getUserNm());
			// [Ver3.0] unit of measure対応 2017.11.20 駱 Del
			output.setUnitNum(input.getUnitNum());
			output.setReceivePlanDtFrom(input.getReceivePlanDtFrom());
			output.setReceivePlanDtTo(input.getReceivePlanDtTo());
			output.setStoreDtFrom(input.getStoreDtFrom());
			output.setStoreDtTo(input.getStoreDtTo());
			output.setPrintCondition(input.getPrintCondition());
			output.setRowCount(input.getRowCount());
			output.setFirstStoreDt(input.getFirstStoreDt());
			output.setLastStoreDt(input.getLastStoreDt());
			output.setSumPlanNum(input.getSumPlanNum());
			output.setSumStoreNum(input.getSumStoreNum());
			output.setPreceNum(input.getPreceNum());
			// [Ver3.0] unit of measure対応 2017.11.20 駱 Del
			output.setReceiveStatus(input.getReceiveStatus());
			output.setStrReceiveDeliveryStatus(input.getStrReceiveDeliveryStatus());
			output.setMaxStoreLabelNo(input.getMaxStoreLabelNo());
			output.setLastAddDt(input.getLastAddDt());
			output.setLastHtStoreInspectionDt(input.getLastHtStoreInspectionDt());
			output.setLastStoreFlgNm(input.getLastStoreFlgNm());
			output.setMaxLocationNm(input.getMaxLocationNm());
			output.setMaxUnitNum(input.getMaxUnitNum());
			output.setMaxStockTypeCd(input.getMaxStockTypeCd());
			output.setMaxStockTypeNm(input.getMaxStockTypeNm());
			output.setMaxclientOrderNo(input.getMaxclientOrderNo());
			output.setMaxClientReceiveNo(input.getMaxClientReceiveNo());
			output.setMaxLot(input.getMaxLot());
			output.setMaxLimitDt(input.getMaxLimitDt());
			output.setMaxCustomerCd(input.getMaxCustomerCd());
			output.setMaxCustomerNm(input.getMaxCustomerNm());
			output.setMaxCustomerAbbr(input.getMaxCustomerAbbr());
			output.setMaxPlanDepositCd(input.getMaxPlanDepositCd());
			output.setMaxPlanDepositNm(input.getMaxPlanDepositNm());
			output.setReceiveStatusTemp(input.getReceiveStatusTemp());
		}
		return output;
	}
}

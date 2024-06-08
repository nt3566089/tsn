package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;

/**
 * The DTO mapper of T_SHIPPING_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBDtoMapper extends BsTShippingInstBDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TShippingInstBDtoMapper() {
	}

	public TShippingInstBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TShippingInstBDto mappingToDto(TShippingInstB input) {
		TShippingInstBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setBodyMessageNm(input.getBodyMessageNm());
			output.setInvoiceCreateFlg(input.getInvoiceCreateFlg());
			output.setStwOutFlg(input.getStwOutFlg());
			output.setTpbLocationNm(input.getTpbLocationNm());
			output.setTpbPickingNum(input.getTpbPickingNum());
			output.setTpbLot(input.getTpbLot());
			output.setTpbLimitDt(input.getTpbLimitDt());
			output.setTpbStoreLabelNo(input.getTpbStoreLabelNo());
			output.setChargeNum(input.getChargeNum());
			output.setStoreNoFlg(input.getStoreNoFlg());
			output.setLotManagFlg(input.getLotManagFlg());
			output.setLimitDtManagFlg(input.getLimitDtManagFlg());
			output.setOldPickingNum(input.getOldPickingNum());
			output.setStockOutNum(input.getStockOutNum());
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu Start
			output.setProductUnit(input.getProductUnit());
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu End
		}

		return output;
	}

	@Override
	public TShippingInstB mappingToEntity(TShippingInstBDto input) {
		TShippingInstB output = super.mappingToEntity(input);

		if (output != null) {
			output.setBodyMessageNm(input.getBodyMessageNm());
			output.setInvoiceCreateFlg(input.getInvoiceCreateFlg());
			output.setStwOutFlg(input.getStwOutFlg());
			output.setTpbLocationNm(input.getTpbLocationNm());
			output.setTpbPickingNum(input.getTpbPickingNum());
			output.setTpbLot(input.getTpbLot());
			output.setTpbLimitDt(input.getTpbLimitDt());
			output.setTpbStoreLabelNo(input.getTpbStoreLabelNo());
			output.setChargeNum(input.getChargeNum());
			output.setStoreNoFlg(input.getStoreNoFlg());
			output.setLotManagFlg(input.getLotManagFlg());
			output.setLimitDtManagFlg(input.getLimitDtManagFlg());
			output.setOldPickingNum(input.getOldPickingNum());
			output.setStockOutNum(input.getStockOutNum());
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu Start
			output.setProductUnit(input.getProductUnit());
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu End
		}

		return output;
	}
}

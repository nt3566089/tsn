package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TStockInoutDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTStockInoutDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStockInout;

/**
 * The DTO mapper of T_STOCK_INOUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockInoutDtoMapper extends BsTStockInoutDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TStockInoutDtoMapper() {
    }

    public TStockInoutDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TStockInoutDto mappingToDto(TStockInout input) {
		TStockInoutDto output = super.mappingToDto(input);

		if (output != null) {
			output.setProcessDtFrom(input.getProcessDtFrom());
			output.setProcessDtTo(input.getProcessDtTo());
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setProductCd(input.getProductCd());
			output.setProductNm(input.getProductNm());
			output.setCenterCd(input.getCenterCd());
			output.setLot(input.getLot());
			output.setJanCd(input.getJanCd());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
		}

		return output;
	}

	@Override
	public TStockInout mappingToEntity(TStockInoutDto input) {
		TStockInout output = super.mappingToEntity(input);

		if (output != null) {
			output.setProcessDtFrom(input.getProcessDtFrom());
			output.setProcessDtTo(input.getProcessDtTo());
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setProductCd(input.getProductCd());
			output.setProductNm(input.getProductNm());
			output.setCenterCd(input.getCenterCd());
			output.setLot(input.getLot());
			output.setJanCd(input.getJanCd());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
		}

		return output;
	}
}

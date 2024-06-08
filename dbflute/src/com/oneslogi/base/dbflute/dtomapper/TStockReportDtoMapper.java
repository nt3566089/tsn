package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TStockReportDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTStockReportDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStockReport;

/**
 * The DTO mapper of t_stock_report.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockReportDtoMapper extends BsTStockReportDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TStockReportDtoMapper() {
    }

    public TStockReportDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }


	@Override
	public TStockReportDto mappingToDto(TStockReport input) {
		TStockReportDto output = super.mappingToDto(input);

		if (output != null) {
			output.setClassDtlId(input.getClassDtlId());
			output.setClassDtlCd(input.getClassDtlCd());
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
			output.setLimitDtNum(input.getLimitDtNum());
			output.setDtAddLdn(input.getDtAddLdn());
			output.setChargeNumDisplay(input.getChargeNumDisplay());
			output.setDisplay(input.getDisplay());
			output.setStockdisplayfld(input.getStockdisplayfld());
			output.setShippingLimitDt(input.getShippingLimitDt());
		}

		return output;
	}

	@Override
	public TStockReport mappingToEntity(TStockReportDto input) {
		TStockReport output = super.mappingToEntity(input);

		if (output != null) {
			output.setClassDtlId(input.getClassDtlId());
			output.setClassDtlCd(input.getClassDtlCd());
			output.setLocationCdFrom(input.getLocationCdFrom());
			output.setLocationCdTo(input.getLocationCdTo());
			output.setLimitDtFrom(input.getLimitDtFrom());
			output.setLimitDtTo(input.getLimitDtTo());
			output.setLimitDtNum(input.getLimitDtNum());
			output.setDtAddLdn(input.getDtAddLdn());
			output.setChargeNumDisplay(input.getChargeNumDisplay());
			output.setDisplay(input.getDisplay());
			output.setStockdisplayfld(input.getStockdisplayfld());
			output.setShippingLimitDt(input.getShippingLimitDt());
		}

		return output;
	}



}

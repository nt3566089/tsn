package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStock;

/**
 * The DTO mapper of T_STOCK.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockDtoMapper extends BsTStockDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TStockDtoMapper() {
	}

	public TStockDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TStockDto mappingToDto(TStock input) {
		TStockDto output = super.mappingToDto(input);

		if (output != null) {
			output.setDataTime(input.getDataTime());
			output.setChargeNumDisplay(input.getChargeNumDisplay());
			output.setDisplay(input.getDisplay());
			output.setStockdisplayfld(input.getStockdisplayfld());
			output.setDtAddLdn(input.getDtAddLdn());
			output.setMaxProductId(input.getMaxProductId());
			output.setMaxSharpId(input.getMaxSharpId());
			output.setSumChargeNum(input.getSumChargeNum());
			output.setProcessTypeCd(input.getProcessTypeCd());
			output.setInstComment(input.getInstComment());
			output.setChargeNum_A(input.getChargeNum_A());
			output.setAdjNum(input.getAdjNum());
			output.setRowCount(input.getRowCount());
			output.setCaseChargeNum(input.getCaseChargeNum());
			output.setPieceChargeNum(input.getPieceChargeNum());
			output.setCaseAllocNum(input.getCaseAllocNum());
			output.setPieceAllocNum(input.getPieceAllocNum());
			output.setCaseMoveNum(input.getCaseMoveNum());
			output.setPieceMoveNum(input.getPieceMoveNum());
			output.setCaseTransitNum(input.getCaseTransitNum());
			output.setPieceTransitNum(input.getPieceTransitNum());
			output.setCasePreChargeNum(input.getCasePreChargeNum());
			output.setPiecePreChargeNum(input.getPiecePreChargeNum());
			output.setCaseAftChargeNum(input.getCaseAftChargeNum());
			output.setPieceAftChargeNum(input.getPieceAftChargeNum());
			output.setCaseAdjNum(input.getCaseAdjNum());
			output.setPieceAdjNum(input.getPieceAdjNum());
			output.setCaseSumChargeNum(input.getCaseSumChargeNum());
			output.setPieceSumChargeNum(input.getPieceSumChargeNum());
			// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi Start
			if (!input.getMCenterList().isEmpty()) {
				MCenterDtoMapper mapper1 = new MCenterDtoMapper();
				output.setMCenterList(mapper1.mappingToDtoList(input.getMCenterList()));
			}
			output.setReceivePlanDt(input.getReceivePlanDt());
			output.setReceivePlanNum(input.getReceivePlanNum());
			output.setStockNumDisplay(input.getStockNumDisplay());
			output.setStockNum(input.getStockNum());
			output.setCaseStockNum(input.getCaseStockNum());
			output.setPieceStockNum(input.getPieceStockNum());
			output.setExpiredStockNum(input.getExpiredStockNum());
			output.setFixedPointDisplay(input.getFixedPointDisplay());
			// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi End
			output.setTransitDisplay(input.getTransitDisplay());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
			output.setUnitNumBreakdown(input.getUnitNumBreakdown());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

		}

		return output;
	}

	@Override
	public TStock mappingToEntity(TStockDto input) {
		TStock output = super.mappingToEntity(input);

		if (output != null) {
			output.setDataTime(input.getDataTime());
			output.setChargeNumDisplay(input.getChargeNumDisplay());
			output.setDisplay(input.getDisplay());
			output.setStockdisplayfld(input.getStockdisplayfld());
			output.setDtAddLdn(input.getDtAddLdn());
			output.setMaxProductId(input.getMaxProductId());
			output.setMaxSharpId(input.getMaxSharpId());
			output.setSumChargeNum(input.getSumChargeNum());
			output.setProcessTypeCd(input.getProcessTypeCd());
			output.setInstComment(input.getInstComment());
			output.setChargeNum_A(input.getChargeNum_A());
			output.setAdjNum(input.getAdjNum());
			output.setRowCount(input.getRowCount());
			output.setCaseChargeNum(input.getCaseChargeNum());
			output.setPieceChargeNum(input.getPieceChargeNum());
			output.setCaseAllocNum(input.getCaseAllocNum());
			output.setPieceAllocNum(input.getPieceAllocNum());
			output.setCaseMoveNum(input.getCaseMoveNum());
			output.setPieceMoveNum(input.getPieceMoveNum());
			output.setCaseTransitNum(input.getCaseTransitNum());
			output.setPieceTransitNum(input.getPieceTransitNum());
			output.setCasePreChargeNum(input.getCasePreChargeNum());
			output.setPiecePreChargeNum(input.getPiecePreChargeNum());
			output.setCaseAftChargeNum(input.getCaseAftChargeNum());
			output.setPieceAftChargeNum(input.getPieceAftChargeNum());
			output.setCaseAdjNum(input.getCaseAdjNum());
			output.setPieceAdjNum(input.getPieceAdjNum());
			output.setCaseSumChargeNum(input.getCaseSumChargeNum());
			output.setPieceSumChargeNum(input.getPieceSumChargeNum());
			// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi Start
			if (!input.getMCenterList().isEmpty()) {
				MCenterDtoMapper mapper1 = new MCenterDtoMapper();
				output.setMCenterList(mapper1.mappingToEntityList(input.getMCenterList()));
			}
			output.setReceivePlanDt(input.getReceivePlanDt());
			output.setReceivePlanNum(input.getReceivePlanNum());
			output.setStockNumDisplay(input.getStockNumDisplay());
			output.setStockNum(input.getStockNum());
			output.setCaseStockNum(input.getCaseStockNum());
			output.setPieceStockNum(input.getPieceStockNum());
			output.setExpiredStockNum(input.getExpiredStockNum());
			output.setFixedPointDisplay(input.getFixedPointDisplay());
			// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi End
			output.setTransitDisplay(input.getTransitDisplay());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
			output.setUnitNumBreakdown(input.getUnitNumBreakdown());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End
		}

		return output;
	}
}

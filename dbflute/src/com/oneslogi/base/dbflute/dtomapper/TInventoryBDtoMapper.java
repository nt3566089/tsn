package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTInventoryBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TInventoryB;

/**
 * The DTO mapper of T_INVENTORY_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBDtoMapper extends BsTInventoryBDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TInventoryBDtoMapper() {
    }

    public TInventoryBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

	@Override
	public TInventoryBDto mappingToDto(TInventoryB input) {
		TInventoryBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setNumDiff(input.getNumDiff());
			output.setNumDiffSort(input.getNumDiffSort());
			output.setPlusMinusType(input.getPlusMinusType());
			output.setInventoryNumSum(input.getInventoryNumSum());
			output.setChargeNumSum(input.getChargeNumSum());
			output.setInventoryCaseNum(input.getInventoryCaseNum());
			output.setChargeCaseNum(input.getChargeCaseNum());
			output.setProductSort(input.getProductSort());
			output.setInventoryPieceNum(input.getInventoryPieceNum());
			output.setInventoryCaseNum(input.getInventoryCaseNum());
			output.setInventoryBeforePieceNum(input.getInventoryBeforePieceNum());
			output.setInventoryBeforeCaseNum(input.getInventoryBeforeCaseNum());
			output.setCaseQty(input.getCaseQty());
			output.setCaseQtyB(input.getCaseQtyB());
			output.setCaseQtyN(input.getCaseQtyN());
			output.setPieceQty(input.getPieceQty());
			output.setPieceQtyB(input.getPieceQtyB());
			output.setPieceQtyN(input.getPieceQtyN());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.24 honma Add Start
			output.setProductUnit(input.getProductUnit());
			output.setUnitNumBreakdown(input.getUnitNumBreakdown());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.24 honma Add End
			output.setDiffQty(input.getDiffQty());
			output.setAdjQty(input.getAdjQty());
			output.setOldInventoryNum(input.getOldInventoryNum());
			output.setInventroyParcent(input.getInventroyParcent());
			output.setSumAdjQty(input.getSumAdjQty());
			output.setSumDiffQty(input.getSumDiffQty());
			output.setstockAdjustFlgShow(input.getstockAdjustFlgShow());
			output.setInputDt(input.getInputDt());
			output.setHistAddUser(input.getHistAddUser());
			output.setFromLocationCd(input.getFromLocationCd());
			output.setToLocationCd(input.getToLocationCd());
			output.setZoneCd(input.getZoneCd());
			output.setUnmatch(input.getUnmatch());
			output.setStockTakingInput(input.getStockTakingInput());

		}

		return output;
	}

	@Override
	public TInventoryB mappingToEntity(TInventoryBDto input) {
		TInventoryB output = super.mappingToEntity(input);

		if (output != null) {
			output.setNumDiff(input.getNumDiff());
			output.setNumDiffSort(input.getNumDiffSort());
			output.setPlusMinusType(input.getPlusMinusType());
			output.setInventoryNumSum(input.getInventoryNumSum());
			output.setChargeNumSum(input.getChargeNumSum());
			output.setInventoryCaseNum(input.getInventoryCaseNum());
			output.setChargeCaseNum(input.getChargeCaseNum());
			output.setProductSort(input.getProductSort());
			output.setInventoryPieceNum(input.getInventoryPieceNum());
			output.setInventoryCaseNum(input.getInventoryCaseNum());
			output.setInventoryBeforePieceNum(input.getInventoryBeforePieceNum());
			output.setInventoryBeforeCaseNum(input.getInventoryBeforeCaseNum());
			output.setCaseQty(input.getCaseQty());
			output.setCaseQtyB(input.getCaseQtyB());
			output.setCaseQtyN(input.getCaseQtyN());
			output.setPieceQty(input.getPieceQty());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.24 honma Add Start
			output.setProductUnit(input.getProductUnit());
			output.setUnitNumBreakdown(input.getUnitNumBreakdown());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.24 honma Add End
			output.setDiffQty(input.getDiffQty());
			output.setAdjQty(input.getAdjQty());
			output.setOldInventoryNum(input.getOldInventoryNum());
			output.setInventroyParcent(input.getInventroyParcent());
			output.setSumAdjQty(input.getSumAdjQty());
			output.setSumDiffQty(input.getSumDiffQty());
			output.setstockAdjustFlgShow(input.getstockAdjustFlgShow());
			output.setInputDt(input.getInputDt());
			output.setHistAddUser(input.getHistAddUser());
			output.setFromLocationCd(input.getFromLocationCd());
			output.setToLocationCd(input.getToLocationCd());
			output.setZoneCd(input.getZoneCd());
			output.setUnmatch(input.getUnmatch());
			output.setStockTakingInput(input.getStockTakingInput());
		}

		return output;
	}
}

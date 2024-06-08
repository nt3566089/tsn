package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TInventoryInpHistDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTInventoryInpHistDtoMapper;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;

/**
 * The DTO mapper of T_INVENTORY_INP_HIST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInpHistDtoMapper extends BsTInventoryInpHistDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TInventoryInpHistDtoMapper() {
    }

    public TInventoryInpHistDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    // [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
    @Override
	public TInventoryInpHistDto mappingToDto(TInventoryInpHist input) {
    	TInventoryInpHistDto output = super.mappingToDto(input);

		if (output != null) {
			output.setShapeUnitNum(input.getShapeUnitNum());

		}

		return output;
	}

	@Override
	public TInventoryInpHist mappingToEntity(TInventoryInpHistDto input) {
		TInventoryInpHist output = super.mappingToEntity(input);

		if (output != null) {
			output.setShapeUnitNum(input.getShapeUnitNum());
		}

		return output;
	}
	// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End

}

package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;

/**
 * The DTO mapper of T_INVENTORY_INST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstDtoMapper extends BsTInventoryInstDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TInventoryInstDtoMapper() {
    }

    public TInventoryInstDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public TInventoryInstDto mappingToDto(TInventoryInst input) {
    	TInventoryInstDto output = super.mappingToDto(input);

		if (output != null) {
			output.setPieceQty(input.getPieceQty());
			output.setCaseQty(input.getCaseQty());
			output.setInventoryLocationProduct(input.getInventoryLocationProduct());
			output.setStockTakingInput(input.getStockTakingInput());
			output.setUnmatch(input.getUnmatch());
			output.setFromLocationNm(input.getFromLocationNm());
			output.setToLocationNm(input.getToLocationNm());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC START
			output.setRegistDt((input.getRegistDt()));
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC END
		}

		return output;
    }

	@Override
	public TInventoryInst mappingToEntity(TInventoryInstDto input) {
		TInventoryInst output = super.mappingToEntity(input);

		if (output != null) {
			output.setPieceQty(input.getPieceQty());
			output.setCaseQty(input.getCaseQty());
			output.setInventoryLocationProduct(input.getInventoryLocationProduct());
			output.setStockTakingInput(input.getStockTakingInput());
			output.setUnmatch(input.getUnmatch());
			output.setFromLocationNm(input.getFromLocationNm());
			output.setToLocationNm(input.getToLocationNm());
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC START
			output.setRegistDt((input.getRegistDt()));
			//LSC担当分機能対応のため、下記項目を追加 2024/05/08 ADD BY LSC END
		}

		return output;
	}
}

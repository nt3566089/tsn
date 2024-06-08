package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTAllocInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;

/**
 * The DTO mapper of T_ALLOC_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstHDtoMapper extends BsTAllocInstHDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public TAllocInstHDtoMapper() {
	}

	public TAllocInstHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public TAllocInstHDto mappingToDto(TAllocInstH input) {
		TAllocInstHDto output = super.mappingToDto(input);

		if (output != null) {
			output.setIsChanged(input.isIsChanged());
			output.setShippingDtFrom(input.getShippingDtFrom());
			output.setShippingDtTo(input.getShippingDtTo());
			output.setWorkDtFrom(input.getWorkDtFrom());
			output.setWorkDtTo(input.getWorkDtTo());
			output.setClientShippingNo(input.getClientShippingNo());
			output.setPackingCount(input.getPackingCount());
			output.setPickingBatchNo(input.getPickingBatchNo());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
			output.setCod(input.getCod());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End			
		}

		return output;
	}

	@Override
	public TAllocInstH mappingToEntity(TAllocInstHDto input) {
		TAllocInstH output = super.mappingToEntity(input);

		if (output != null) {
			output.setIsChanged(input.isIsChanged());
			output.setShippingDtFrom(input.getShippingDtFrom());
			output.setShippingDtTo(input.getShippingDtTo());
			output.setWorkDtFrom(input.getWorkDtFrom());
			output.setWorkDtTo(input.getWorkDtTo());
			output.setClientShippingNo(input.getClientShippingNo());
			output.setPackingCount(input.getPackingCount());
			output.setPickingBatchNo(input.getPickingBatchNo());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
			output.setCod(input.getCod());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End
		}

		return output;
	}
}

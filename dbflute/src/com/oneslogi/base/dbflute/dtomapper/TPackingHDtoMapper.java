package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TPackingHDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTPackingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPackingH;

/**
 * The DTO mapper of t_packing_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHDtoMapper extends BsTPackingHDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TPackingHDtoMapper() {
    }

    public TPackingHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
    @Override
	public TPackingHDto mappingToDto(TPackingH input) {
    	TPackingHDto output = super.mappingToDto(input);

		if (output != null) {
			output.setPrintCondition(input.getPrintCondition());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  Start
			output.setPickingBatchNo(input.getPickingBatchNo());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  End
		}

		return output;
	}

	@Override
	public TPackingH mappingToEntity(TPackingHDto input) {
		TPackingH output = super.mappingToEntity(input);

		if (output != null) {
			output.setPrintCondition(input.getPrintCondition());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  Start
			output.setPickingBatchNo(input.getPickingBatchNo());
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  End
		}

		return output;
	}
}

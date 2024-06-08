package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.TPackingBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsTPackingBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPackingB;

/**
 * The DTO mapper of t_packing_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingBDtoMapper extends BsTPackingBDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public TPackingBDtoMapper() {
    }

    public TPackingBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }

    @Override
	public TPackingBDto mappingToDto(TPackingB input) {
    	TPackingBDto output = super.mappingToDto(input);

		if (output != null) {
			output.setProductCd(input.getProductCd());
			output.setBoxId(input.getBoxId());
			output.setBoxCd(input.getBoxCd());
		}

		return output;
	}

	@Override
	public TPackingB mappingToEntity(TPackingBDto input) {
		TPackingB output = super.mappingToEntity(input);

		if (output != null) {
			output.setProductCd(input.getProductCd());
			output.setBoxId(input.getBoxId());
			output.setBoxCd(input.getBoxCd());
		}

		return output;
	}
}

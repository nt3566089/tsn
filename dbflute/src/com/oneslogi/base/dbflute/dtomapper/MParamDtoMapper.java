package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMParamDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;

/**
 * The DTO mapper of m_param.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MParamDtoMapper extends BsMParamDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public MParamDtoMapper() {
	}

	public MParamDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public MParamDto mappingToDto(MParam input) {
		MParamDto output = super.mappingToDto(input);

		if (output != null) {

			output.setAllocSortKey1(input.getAllocSortKey1());
			output.setAllocSortKey2(input.getAllocSortKey2());
			output.setAllocSortKey3(input.getAllocSortKey3());
			output.setAllocSortKey4(input.getAllocSortKey4());
			output.setAllocSortKey5(input.getAllocSortKey5());
			output.setAllocSortKey6(input.getAllocSortKey6());
			output.setAllocSortKey7(input.getAllocSortKey7());
			output.setAllocSortKey8(input.getAllocSortKey8());
		}

		return output;
	}

	@Override
	public MParam mappingToEntity(MParamDto input) {
		MParam output = super.mappingToEntity(input);

		if (output != null) {

			output.setAllocSortKey1(input.getAllocSortKey1());
			output.setAllocSortKey2(input.getAllocSortKey2());
			output.setAllocSortKey3(input.getAllocSortKey3());
			output.setAllocSortKey4(input.getAllocSortKey4());
			output.setAllocSortKey5(input.getAllocSortKey5());
			output.setAllocSortKey6(input.getAllocSortKey6());
			output.setAllocSortKey7(input.getAllocSortKey7());
			output.setAllocSortKey8(input.getAllocSortKey8());
		}
		return output;
	}
}

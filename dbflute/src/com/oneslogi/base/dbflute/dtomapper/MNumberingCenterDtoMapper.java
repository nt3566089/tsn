package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MNumberingCenterDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMNumberingCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;

/**
 * The DTO mapper of M_NUMBERING_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MNumberingCenterDtoMapper extends BsMNumberingCenterDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public MNumberingCenterDtoMapper() {
	}

	public MNumberingCenterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	/* (非 Javadoc)
	 * @see com.oneslogi.base.dbflute.dtomapper.bs.BsMNumberingCenterDtoMapper#mappingToDto(com.oneslogi.base.dbflute.exentity.MNumberingCenter)
	 */
	@Override
	public MNumberingCenterDto mappingToDto(MNumberingCenter input) {
		MNumberingCenterDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCashUseCount(input.getCashUseCount());
		}

		return output;
	}

	/* (非 Javadoc)
	 * @see com.oneslogi.base.dbflute.dtomapper.bs.BsMNumberingCenterDtoMapper#mappingToEntity(com.oneslogi.base.dbflute.dto.MNumberingCenterDto)
	 */
	@Override
	public MNumberingCenter mappingToEntity(MNumberingCenterDto input) {
		MNumberingCenter output = super.mappingToEntity(input);

		if (output != null) {
			output.setCashUseCount(input.getCashUseCount());
		}

		return output;
	}
}

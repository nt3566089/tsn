package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BNumberingDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBNumberingDtoMapper;
import com.oneslogi.base.dbflute.exentity.BNumbering;

/**
 * The DTO mapper of B_NUMBERING.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BNumberingDtoMapper extends BsBNumberingDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public BNumberingDtoMapper() {
	}

	public BNumberingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	/* (非 Javadoc)
	 * @see com.oneslogi.base.dbflute.dtomapper.bs.BsBNumberingDtoMapper#mappingToDto(com.oneslogi.base.dbflute.exentity.BNumbering)
	 */
	@Override
	public BNumberingDto mappingToDto(BNumbering input) {
		BNumberingDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCashUseCount(input.getCashUseCount());
		}

		return output;
	}

	/* (非 Javadoc)
	 * @see com.oneslogi.base.dbflute.dtomapper.bs.BsBNumberingDtoMapper#mappingToEntity(com.oneslogi.base.dbflute.dto.BNumberingDto)
	 */
	@Override
	public BNumbering mappingToEntity(BNumberingDto input) {
		BNumbering output = super.mappingToEntity(input);

		if (output != null) {
			output.setCashUseCount(input.getCashUseCount());
		}

		return output;
	}
}

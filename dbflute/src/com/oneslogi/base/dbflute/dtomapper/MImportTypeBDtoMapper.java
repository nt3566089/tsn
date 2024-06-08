package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MImportTypeBDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMImportTypeBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MImportTypeB;

/**
 * The DTO mapper of m_import_type_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBDtoMapper extends BsMImportTypeBDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public MImportTypeBDtoMapper() {
	}

	public MImportTypeBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public MImportTypeBDto mappingToDto(MImportTypeB input) {
		MImportTypeBDto output = super.mappingToDto(input);

		if (output != null) {

			output.setCopyHColumnNm(input.getCopyHColumnNm());
			output.setCopyBColumnNm(input.getCopyBColumnNm());
		}

		return output;
	}

	@Override
	public MImportTypeB mappingToEntity(MImportTypeBDto input) {
		MImportTypeB output = super.mappingToEntity(input);

		if (output != null) {

			output.setCopyHColumnNm(input.getCopyHColumnNm());
			output.setCopyBColumnNm(input.getCopyBColumnNm());
		}
		return output;
	}
}

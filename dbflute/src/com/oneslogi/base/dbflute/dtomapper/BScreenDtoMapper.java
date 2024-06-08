package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BScreenDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBScreenDtoMapper;
import com.oneslogi.base.dbflute.exentity.BScreen;

/**
 * The DTO mapper of B_SCREEN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BScreenDtoMapper extends BsBScreenDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public BScreenDtoMapper() {
	}

	public BScreenDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public BScreenDto mappingToDto(BScreen input) {
		BScreenDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setCenterOrClientScreenNm(input.getCenterOrClientScreenNm());
			output.setCenterOrClientScreenVisible(input.getCenterOrClientScreenVisible());
			output.setCenterOrClientScreenId(input.getCenterOrClientScreenId());
			output.setSystemTypeNm(input.getSystemTypeNm());
			output.setVisible(input.getVisible());
		}

		return output;
	}

	@Override
	public BScreen mappingToEntity(BScreenDto input) {
		BScreen output = super.mappingToEntity(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setCenterOrClientScreenNm(input.getCenterOrClientScreenNm());
			output.setCenterOrClientScreenVisible(input.getCenterOrClientScreenVisible());
			output.setCenterOrClientScreenId(input.getCenterOrClientScreenId());
			output.setSystemTypeNm(input.getSystemTypeNm());
			output.setVisible(input.getVisible());
		}
		return output;
	}
}

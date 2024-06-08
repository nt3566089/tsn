package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BItemDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBItemDtoMapper;
import com.oneslogi.base.dbflute.exentity.BItem;

/**
 * The DTO mapper of B_ITEM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BItemDtoMapper extends BsBItemDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public BItemDtoMapper() {
	}

	public BItemDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public BItemDto mappingToDto(BItem input) {
		BItemDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setItemListCd(input.getItemListCd());
			output.setScreenItemId(input.getScreenItemId());
			output.setScreenItemNm(input.getScreenItemNm());
			output.setScreenItemVisible(input.getScreenItemVisible());
			output.setScreenItemEditable(input.getScreenItemEditable());
			output.setScreenItemNecessary(input.getScreenItemNecessary());
			output.setRoleItemVisible(input.getRoleItemVisible());
			output.setRoleItemEditable(input.getRoleItemEditable());
			output.setCenterOrClientItemId(input.getCenterOrClientItemId());
		}

		return output;
	}

	@Override
	public BItem mappingToEntity(BItemDto input) {
		BItem output = super.mappingToEntity(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setItemListCd(input.getItemListCd());
			output.setScreenItemId(input.getScreenItemId());
			output.setScreenItemNm(input.getScreenItemNm());
			output.setScreenItemVisible(input.getScreenItemVisible());
			output.setScreenItemEditable(input.getScreenItemEditable());
			output.setScreenItemNecessary(input.getScreenItemNecessary());
			output.setRoleItemVisible(input.getRoleItemVisible());
			output.setRoleItemEditable(input.getRoleItemEditable());
			output.setCenterOrClientItemId(input.getCenterOrClientItemId());
		}
		return output;
	}
}

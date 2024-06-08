package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.BColDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsBColDtoMapper;
import com.oneslogi.base.dbflute.exentity.BCol;

/**
 * The DTO mapper of B_COL.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BColDtoMapper extends BsBColDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public BColDtoMapper() {
	}

	public BColDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public BColDto mappingToDto(BCol input) {
		BColDto output = super.mappingToDto(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setItemListCd(input.getItemListCd());
			output.setDictName(input.getDictName());
			output.setVisibleName(input.getVisibleName());
			output.setEditableName(input.getEditableName());
			output.setRoleColVisible(input.getRoleColVisible());
			output.setRoleColEditable(input.getRoleColEditable());
			output.setNecessaryName(input.getNecessaryName());
			output.setScreenColId(input.getScreenColId());
			output.setScreenColNm(input.getScreenColNm());
			output.setScreenColVisible(input.getScreenColVisible());
			output.setScreenColEditable(input.getScreenColEditable());
			output.setScreenColNecessary(input.getScreenColNecessary());
			output.setCenterOrClientColId(input.getCenterOrClientColId());
			output.setInvoiceCreateFlgNm(input.getInvoiceCreateFlgNm());
			output.setEmergencyFlgNm(input.getEmergencyFlgNm());
		}

		return output;
	}

	@Override
	public BCol mappingToEntity(BColDto input) {
		BCol output = super.mappingToEntity(input);

		if (output != null) {
			output.setCenterClientCls(input.getCenterClientCls());
			output.setCenterOrClientCd(input.getCenterOrClientCd());
			output.setCenterOrClientId(input.getCenterOrClientId());
			output.setScreenListCd(input.getScreenListCd());
			output.setItemListCd(input.getItemListCd());
			output.setDictName(input.getDictName());
			output.setVisibleName(input.getVisibleName());
			output.setEditableName(input.getEditableName());
			output.setRoleColVisible(input.getRoleColVisible());
			output.setRoleColEditable(input.getRoleColEditable());
			output.setNecessaryName(input.getNecessaryName());
			output.setScreenColId(input.getScreenColId());
			output.setScreenColNm(input.getScreenColNm());
			output.setScreenColVisible(input.getScreenColVisible());
			output.setScreenColEditable(input.getScreenColEditable());
			output.setScreenColNecessary(input.getScreenColNecessary());
			output.setCenterOrClientColId(input.getCenterOrClientColId());
			output.setInvoiceCreateFlgNm(input.getInvoiceCreateFlgNm());
			output.setEmergencyFlgNm(input.getEmergencyFlgNm());
		}
		return output;
	}
}

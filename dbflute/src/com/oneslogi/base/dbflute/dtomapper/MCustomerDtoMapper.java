package com.oneslogi.base.dbflute.dtomapper;

import java.util.Map;

import org.dbflute.Entity;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.bs.BsMCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCustomer;

/**
 * The DTO mapper of M_CUSTOMER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerDtoMapper extends BsMCustomerDtoMapper {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	public MCustomerDtoMapper() {
	}

	public MCustomerDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
		super(relationDtoMap, relationEntityMap);
	}

	@Override
	public MCustomerDto mappingToDto(MCustomer input) {
		MCustomerDto output = super.mappingToDto(input);

		if (output != null) {
			output.setLineNo(input.getLineNo());
			output.setDeliveryCourseCd(input.getDeliveryCourseCd());
			output.setClientCustomerCd(input.getClientCustomerCd());
			output.setCenterCd(input.getCenterCd());
			output.setCenterNm(input.getCenterNm());
			output.setClientId(input.getClientId());
			output.setDeliveryOrder(input.getDeliveryOrder());
			output.setDeliveryReadTime(input.getDeliveryReadTime());
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
			output.setDepositCheckBox(input.getDepositCheckBox());
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
		}

		return output;
	}

	@Override
	public MCustomer mappingToEntity(MCustomerDto input) {
		MCustomer output = super.mappingToEntity(input);

		if (output != null) {
			output.setLineNo(input.getLineNo());
			output.setDeliveryCourseCd(input.getDeliveryCourseCd());
			output.setClientCustomerCd(input.getClientCustomerCd());
			output.setCenterCd(input.getCenterCd());
			output.setCenterNm(input.getCenterNm());
			output.setClientId(input.getClientId());
			output.setDeliveryOrder(input.getDeliveryOrder());
			output.setDeliveryReadTime(input.getDeliveryReadTime());
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
			output.setDepositCheckBox(input.getDepositCheckBox());
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
		}

		return output;
	}
}

package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.dto.master.CustomerListDto;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 預託先データ取得用リソースクラス
 */
@Path("/common/depositCustomer")
public class DepositCustomerResource extends AbstractWmsResource {

	@Inject
	private CustomerLogic customerLogic;

	@GET
	@Path("/keyValueList")
	public CustomerListDto keyValueList(@QueryParam("clientCd") String clientCd) {

		CustomerListDto customerListDto = new CustomerListDto();

		if (clientCd == null) {
			return customerListDto;
		}

		MClient conditionEntity = new MClient();
		conditionEntity.setClientCd(clientCd);

		List<MCustomer> entityList = customerLogic.getDepositListByClientCd(conditionEntity);

		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		List<MCustomerDto> dtoList = mapper.mappingToDtoList(entityList);

		for (MCustomerDto dto : dtoList) {
			CustomerListDto.CustomerData data = new CustomerListDto.CustomerData();
			data.mCustomer = dto;
			customerListDto.data.add(data);
		}

		return customerListDto;
	}

	// [#3154][#3156] 預託公開用のメソッド追加 2017.12.12 kawana Start

	/**
	 * <h2>預託ドロップダウン用リストの取得(ユーザ権限による制限あり).</h2>
	 * <pre>
	 * 引数の荷主CDに紐づく預託のリストを取得し返却する。
	 * ログインユーザが扱える預託のみを対象とし、
	 * 扱えない預託は返却するリストには含めない。
	 *
	 * </pre>
	 *
	 * @param clientCd 荷主CD
	 * @return 預託のリスト(ユーザ権限による制限あり)
	 */
	@GET
	@Path("/keyValueListLimitUser")
	public CustomerListDto keyValueListLimitUser(@QueryParam("clientCd") String clientCd) {


		CustomerListDto customerListDto = new CustomerListDto();

		if (clientCd == null) {
			return customerListDto;
		}

		MClient conditionEntity = new MClient();
		conditionEntity.setClientCd(clientCd);

		List<MCustomer> entityList = customerLogic.getDepositListByClientCdLimitUser(conditionEntity);

		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		List<MCustomerDto> dtoList = mapper.mappingToDtoList(entityList);

		for (MCustomerDto dto : dtoList) {
			CustomerListDto.CustomerData data = new CustomerListDto.CustomerData();
			data.mCustomer = dto;
			customerListDto.data.add(data);
		}

		return customerListDto;
	}

	// [#3154][#3156] 預託公開用のメソッド追加 2017.12.12 kawana End

}

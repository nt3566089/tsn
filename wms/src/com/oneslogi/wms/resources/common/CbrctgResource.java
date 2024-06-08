package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlMCbrctgDropDownListPmb;
import com.oneslogi.base.dbflute.exbhv.MCbrctgBhv;
import com.oneslogi.base.dbflute.exentity.customize.SqlMCbrctgDropDownList;
import com.oneslogi.wms.dto.common.CbrctgDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/cbrctg")
public class CbrctgResource extends AbstractWmsResource {

	@Inject
	private MCbrctgBhv mCbrctgBhv;


	@GET
	@Path("/keyValueList")
	public CbrctgDto getKeyValueList(
			@QueryParam("centerCd") final String centerCd,
			@QueryParam("clientCd") final String clientCd
	) {

		if (centerCd == null || clientCd == null) {
			return new CbrctgDto();
		}

		String path = MCbrctgBhv.PATH_selectSqlMCbrctgDropDownList;

		// 引数設定
		BsSqlMCbrctgDropDownListPmb pmb = new BsSqlMCbrctgDropDownListPmb();

		// 引数の値を設定
		pmb.setCenterCd(centerCd);
		pmb.setClientCd(clientCd);

		// 検索実行
		Class<SqlMCbrctgDropDownList> entityType = SqlMCbrctgDropDownList.class;
		ListResultBean<SqlMCbrctgDropDownList> entityList = mCbrctgBhv.outsideSql().selectList(path, pmb, entityType);

		//ドロップダウン用のdtoへ変換する
		CbrctgDto dto = new CbrctgDto();
		for (SqlMCbrctgDropDownList entity : entityList) {
			CbrctgDto.DropDownListData data = new CbrctgDto.DropDownListData();

			// TODO:確認 数値になっている
			data.brctg = entity.getBrctg().toString();
			data.brctgnm = entity.getBrctgnm();

			dto.data.add(data);
		}

		return dto;
	}

}
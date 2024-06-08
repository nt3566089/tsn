package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MClinCB;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.wms.dto.common.LineDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/lineCd")
public class LineCdResource extends AbstractWmsResource {

	@Inject
	private MClinBhv mClinBhv;


	@GET
	@Path("/keyValueList")
	public LineDto getKeyValueList(@QueryParam("centerCd") final String centerCd	) {

		if (centerCd == null) {
			return new LineDto();
		}

		MClinCB cb = mClinBhv.newMyConditionBean();

		// 抽出項目
		cb.specify().columnLincd();

		// 抽出条件
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);

		// ソート条件
		cb.query().addOrderBy_Lincd_Asc();

		// 一覧検索
		List<MClin> entityList = mClinBhv.selectList(cb);


		//ドロップダウン用のdtoへ変換する
		LineDto dto = new LineDto();

		for (MClin entity : entityList) {
			// インスタンス生成
			LineDto.DropDownListData row = new LineDto.DropDownListData();

			// 項目マッピング
			row.lin = entity.getLincd();

			// リストに追加
			dto.data.add(row);
		}

		return dto;
	}

}
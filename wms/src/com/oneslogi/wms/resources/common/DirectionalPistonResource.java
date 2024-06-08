package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TTrdirectrestCB;
import com.oneslogi.base.dbflute.exbhv.TTrdirectrestBhv;
import com.oneslogi.base.dbflute.exentity.TTrdirectrest;
import com.oneslogi.wms.dto.common.DirectionalPistonDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/directrestDirectionPiston")
public class DirectionalPistonResource extends AbstractWmsResource {

	@Inject
	private TTrdirectrestBhv tTrdirectrestBhv;

	@GET
	@Path("/keyValueList")
	public DirectionalPistonDto getKeyValueList() {
		TTrdirectrestCB cb = new TTrdirectrestCB();

		// 抽出項目
		cb.specify().columnSotedunit();
		cb.specify().columnPistontype();

		// ソート条件
		cb.query().addOrderBy_Sotedunit_Asc();
		// 一覧検索
		List<TTrdirectrest> entityList = tTrdirectrestBhv.selectList(cb);

		//ドロップダウン用のdtoへ変換する
		DirectionalPistonDto dto = new DirectionalPistonDto();

		for (TTrdirectrest entity : entityList) {
			// インスタンス生成
			DirectionalPistonDto.DropDownListData row = new DirectionalPistonDto.DropDownListData();

			// 項目マッピング
			row.sotedUnit = entity.getSotedunit();
			row.pistonType = entity.getPistontype();

			// リストに追加
			dto.data.add(row);
		}
		return dto;
	}

}
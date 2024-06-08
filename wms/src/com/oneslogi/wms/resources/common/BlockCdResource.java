package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MCblkCB;
import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.wms.dto.common.BlockDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/blockCd")
public class BlockCdResource extends AbstractWmsResource {

	@Inject
	private MCblkBhv mCblkBhv;

	@GET
	@Path("/keyValueList")
	public BlockDto getKeyValueList(
			@QueryParam("centerCd") final String centerCd	) {

		MCblkCB cb = mCblkBhv.newMyConditionBean();

		// 抽出項目
		cb.specify().columnBlkcd();

		// 抽出条件
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);

		// ソート条件
		cb.query().addOrderBy_Blkcd_Asc();

		// 一覧検索
		List<MCblk> entityList = mCblkBhv.selectList(cb);


		//ドロップダウン用のdtoへ変換する
		BlockDto dto = new BlockDto();

		for (MCblk entity : entityList) {
			// インスタンス生成
			BlockDto.DropDownListData row = new BlockDto.DropDownListData();

			// 項目マッピング
			row.blkcd = entity.getBlkcd();

			// リストに追加
			dto.data.add(row);
		}

		return dto;


	}

}
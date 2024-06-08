package com.oneslogi.wms.resources.master;


import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MShapeGrpDto;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtoMapper;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.wms.dto.master.ShapeGroupMasterListDto;
import com.oneslogi.wms.logic.master.ShapeGroupMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷姿グループメンテナンスマスタ画面のリソースクラス。
 */
@Path("/master/ShapeGroupMasterList")
public class ShapeGroupMasterListResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}
	// ===== 使用ロジッククラス =====
	@Inject
	private ShapeGroupMasterSelectLogic ShapeGroupMasterSelectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ShapeGroupMasterListDto 荷姿グループメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public ShapeGroupMasterListDto init() {
		return new ShapeGroupMasterListDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・荷姿グループメンテナンスマスタDTOをキーに荷姿グループメンテナンスマスタデータ取り出し
	 * </pre>
	 * @param ShapeGroupMasterListDto 荷姿グループメンテナンスマスタ画面用DTO
	 * @return ShapeGroupMasterListDto 荷姿グループメンテナンスマスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ShapeGroupMasterListDto search(ShapeGroupMasterListDto ShapeGroupMasterListDto) throws IOException {
		// Entity変換
		MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper();
		MShapeGrp mShapeGrp = mapper.mappingToEntity(ShapeGroupMasterListDto.data.head);
		// 検索
		PagingResultBean<MShapeGrp> page = ShapeGroupMasterSelectLogic.select(mShapeGrp, ShapeGroupMasterListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MShapeGrpDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		ShapeGroupMasterListDto.data.shapeGroupMasterList = list;

		return ShapeGroupMasterListDto;
	}
}

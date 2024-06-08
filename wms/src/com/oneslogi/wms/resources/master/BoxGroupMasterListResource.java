package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MBoxGrpDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxGrpDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.wms.dto.master.BoxGroupMasterListDto;
import com.oneslogi.wms.logic.master.BoxGroupMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷材グループメンテナンスマスタ画面のリソースクラス。
 */
@Path("/master/boxGroupMasterList")
public class BoxGroupMasterListResource extends AbstractWmsResource {

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
	private BoxGroupMasterSelectLogic boxGroupMasterSelectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return boxGroupMasterListDto 荷材グループメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public BoxGroupMasterListDto init() {
		return new BoxGroupMasterListDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・荷材グループメンテナンスマスタDTOをキーに荷材グループメンテナンスマスタデータ取り出し
	 * </pre>
	 * @param boxgroupMasterListDto 荷材グループメンテナンスマスタ画面用DTO
	 * @return boxgroupMasterListDto 荷材グループメンテナンスマスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public BoxGroupMasterListDto search(BoxGroupMasterListDto boxgroupMasterListDto) throws IOException {
		// Entity変換
		MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper();
		MBoxGrp mBoxGrp = mapper.mappingToEntity(boxgroupMasterListDto.data.head);
		// 検索
		PagingResultBean<MBoxGrp> page = boxGroupMasterSelectLogic.select(mBoxGrp, boxgroupMasterListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MBoxGrpDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		boxgroupMasterListDto.data.boxGroupMasterList = list;

		return boxgroupMasterListDto;
	}
}

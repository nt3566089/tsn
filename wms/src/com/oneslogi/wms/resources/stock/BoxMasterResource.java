package com.oneslogi.wms.resources.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlBoxMasterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.customize.SqlBoxMaster;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.stock.BoxMasterDto;
import com.oneslogi.wms.dto.stock.BoxMasterDto.BoxMasterLogicSearchConditionDto;
import com.oneslogi.wms.logic.stock.BoxMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;


/**
 * 梱包箱情報マスタメンテナンス画面のリソースクラス。
 */
@Path("/stock/boxMasterList")
public class BoxMasterResource extends AbstractWmsResource {
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
		 * 一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 梱包箱情報マスタ登録異常
		 */
		protected static final int BOX_MASTER_INSERT_FAILED = 3;
		/**
		 * 梱包箱情報マスタ更新異常
		 */
		protected static final int BOX_MASTER_UPDATE_FAILED = 4;
		/**
		 * 梱包箱情報マスタデータチェック異常
		 */
		protected static final int BOX_MASTER_CHECK_FAILED = 6;
		/**
		 * 梱包箱情報マスタデータチェック異常
		 */
		protected static final int BOX_MASTER_REGISTER_ERROR = 7;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private BoxMasterSelectLogic boxMasterSelectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return BoxMasterDto 梱包箱情報マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public BoxMasterDto init() {
		BoxMasterDto dto = new BoxMasterDto();

		return dto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・梱包箱情報マスタDTOをキーに梱包箱情報マスタデータ取り出し
	 * </pre>
	 * @param dto 梱包箱情報マスタ画面用DTO
	 * @return BoxMasterDto 梱包箱情報マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public BoxMasterDto search(BoxMasterDto dto) {

		BoxMasterLogicSearchConditionDto cond = dto.data.searchCondition;

		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		boxMasterSelectLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.NOT_FOUND_DATA));
		//エラー有の場合は終了
		if(getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlBoxMaster> sqlBoxMasterList = boxMasterSelectLogic.getBoxMasterListSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////
		SqlBoxMasterDtoMapper sqlBoxMasterMapper = new SqlBoxMasterDtoMapper();
		dto.data.resultList = sqlBoxMasterMapper.mappingToDtoList(sqlBoxMasterList);

		return dto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param boxMasterDto 荷材マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(BoxMasterDto dto) {
		// Entity変換 DBテーブルのDTO表→DBテーブルの行
//		SqlBoxMasterDtoMapper mapper = new SqlBoxMasterDtoMapper();
//		List<SqlBoxMaster> sqlBoxMasterList = mapper.mappingToEntityList(dto.data.resultList);

		// チェック処理
//		List<MBox> mBoxList = null;
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}


	/**
	 * <h2>梱包箱情報マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに梱包箱情報マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param boxMasterDto 梱包箱情報マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

	@POST
	@Path("/register")
	public StatusDto register(BoxMasterDto dto) {

		// Entity変換 DBテーブルのDTO表→DBテーブルの行   <既存行>
		SqlBoxMasterDtoMapper mapper = new SqlBoxMasterDtoMapper();
		List<SqlBoxMaster> sqlBoxMasterResultList = mapper.mappingToEntityList(dto.data.resultList);


		// inputCheckAndMapping
		List<MBox> mBoxList = new ArrayList<MBox>();
		boxMasterSelectLogic.inputCheckAndMapping(sqlBoxMasterResultList , mBoxList,errRetSts(StatusCode.BOX_MASTER_CHECK_FAILED));


		if (0 < getErrorManager().size()) {
			return null;
		}


		// MBox	登録 or 更新


		boxMasterSelectLogic.registerMain(mBoxList,errRetSts(StatusCode.BOX_MASTER_REGISTER_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);


		// 結果の設定
		return null;
	}
}
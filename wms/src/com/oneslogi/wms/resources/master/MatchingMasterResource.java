package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MMatchingDto;
import com.oneslogi.base.dbflute.dtomapper.MMatchingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.MatchingMasterDto;
import com.oneslogi.wms.logic.common.MatchingLogic;
import com.oneslogi.wms.logic.master.MatchingMasterSelectLogic;
import com.oneslogi.wms.logic.master.MatchingMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * マッチングマスタメンテナンス画面のリソースクラス。
 */
@Path("/master/matchingMaster")
public class MatchingMasterResource extends AbstractWmsResource {

	// ===== 定数定義 =====

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
		protected static final int SEARCH_FAILED = 2;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 3;
		/**
		 * マッチングマスタ登録異常
		 */
		protected static final int REGISTER_FAILED = 4;
		/**
		 * 必須項目入力なし
		 */
		protected static final int NOT_INPUT = 5;
		/**
		 * マッチングCD重複
		 */
		protected static final int DUPLICATE_DATA = 6;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	MatchingMasterSelectLogic selectLogic;
	@Inject
	MatchingMasterUpdateLogic updateLogic;
	@Inject
	MatchingLogic matchingLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return mMatchDto マッチングマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public MatchingMasterDto init() {

		// 画面用DTO作成
		MatchingMasterDto matchingMasterDto = new MatchingMasterDto();

		return matchingMasterDto;
	}

	/**
	 * <h2>マッチングマスタメンテナンスデータ取得。</h2>
	 * @param inputDto マッチングマスタメンテナンス画面用DTO
	 * @return MatchMasterDto マッチングマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public MatchingMasterDto search(MatchingMasterDto inputDto) {

		// Entity変換
		MMatchingDtoMapper mapper = new MMatchingDtoMapper();
		MMatching matching = mapper.mappingToEntity(inputDto.data.search);
		//		2016.02.19 Pan ページング ※3 Start
		// マッチングマスタ取得用
		List<MMatching> selectList = selectLogic.select(matching, inputDto.paging, errRetSts(StatusCode.SEARCH_FAILED));

		//		List<MMatching> selectList = selectLogic.select(matching, errRetSts(StatusCode.SEARCH_FAILED));
		//		2016.02.19 Pan ページング ※3 End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Entity-Dto変換処理
		List<MMatchingDto> list = mapper.mappingToDtoList(selectList);

		//検索結果詰込処理
		inputDto.data.list = list;

		return inputDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param inputDto マッチングマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(MatchingMasterDto inputDto) {

		// Entity変換
		MMatchingDtoMapper mapper = new MMatchingDtoMapper();
		List<MMatching> list = mapper.mappingToEntityList(inputDto.data.list);

		// エラーチェック
		check(list, errRetSts(StatusCode.INPUT_CHECK));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;

	}

	/**
	 * <h2>マッチングマスタ登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param inputDto マッチングマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(MatchingMasterDto inputDto) {
		// Entity変換
		MMatchingDtoMapper mapper = new MMatchingDtoMapper();
		List<MMatching> list = mapper.mappingToEntityList(inputDto.data.list);

		check(list, errRetSts(StatusCode.INPUT_CHECK));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 登録実行
		updateLogic.update(list, errRetSts(StatusCode.REGISTER_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・マッチング種別、マッチングキーワードの重複チェック(組合せ)
	 * </pre>
	 * @param matchingList 登録リスト
	 * @return true:エラーなし false:エラー
	 */
	protected boolean check(List<MMatching> matchingList, ErrorStatus errSts) {

		boolean result = true;

		for (int i = 0; i < matchingList.size(); i++) {
			MMatching matching = matchingList.get(i);
			if (CU.isNullOrEmpty(matching.getMatchingType()) || CU.isNullOrEmpty(matching.getMatchingKeyword())) {
				// 入力なし - エラーを登録
				this.getErrorManager().add(errRetSts(errSts, StatusCode.NOT_INPUT, i),
						WmsMessageConst.NECESSARY_ITEM_NOT_INPUT_ERROR);
				result = false;
				continue;
			}

			MMatching checkEntity = matchingLogic.getUkEntity(matching);

			if (matching.getMatchingId() == null) {
				// 登録

				if (checkEntity != null) {
					// 重複 - エラーを登録
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA Start
					//this.getErrorManager().add(errRetSts(errSts, StatusCode.DUPLICATE_DATA, i), WmsMessageConst.MATCHING_DUPLICATE_ERROR);
					this.getErrorManager().add(errRetSts(errSts, StatusCode.DUPLICATE_DATA, i),
							WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA End
					result = false;
				}
			} else {
				// [#6811][OSS] 致命的エラー発生 nullチェックを追加 2019.11.11 Ono Start
				// 更新
				if (checkEntity != null) {
					// [#6811][OSS] 致命的エラー発生 nullチェックを追加 2019.11.11 Ono End
					if (checkEntity.getMatchingId().longValue() != matching.getMatchingId().longValue()) {
						// 取得したIDと自身のIDが異なる(別IDで登録あり)

						// 重複 - エラーを登録
						// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA Start
						//this.getErrorManager().add(errRetSts(errSts, StatusCode.DUPLICATE_DATA, i), WmsMessageConst.MATCHING_DUPLICATE_ERROR);
						this.getErrorManager().add(errRetSts(errSts, StatusCode.DUPLICATE_DATA, i),
								WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA End
						result = false;
					}
				}
			}
		}

		return result;
	}
}

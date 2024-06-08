package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.BDictCultureDto;
import com.oneslogi.base.dbflute.dtomapper.BDictCultureDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MHtDictCultureDtoMapper;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MHtDictCulture;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.HTDictCultureMasterDto;
import com.oneslogi.wms.logic.master.HTDictCultureMasterInsertLogic;
import com.oneslogi.wms.logic.master.HTDictCultureMasterSelectLogic;

/**
 *  HT辞書カルチャマスタメンテナンスResourceクラス
 */
@Path("/master/HTdictCultureMaster")
public class HTDictCultureMasterResource extends AbstractResource {

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
		protected static final int SELECT_FAILED = 2;
		/**
		 * HT辞書カルチャマスタ登録異常
		 */
		protected static final int INSERT_FAILED = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private HTDictCultureMasterSelectLogic htdictCultureMasterSelectLogic;
	@Inject
	private HTDictCultureMasterInsertLogic htdictCultureMasterInsertLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return HTDictCultureMasterDto  HT辞書カルチャマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public HTDictCultureMasterDto init() {

		// 画面用DTO作成
		HTDictCultureMasterDto htDictCultureMasterDto = new HTDictCultureMasterDto();

		return htDictCultureMasterDto;
	}

	/**
	 * <h2>HT辞書カルチャマスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・データベースにHT辞書カルチャマスタメンテナンスデータを取得する
	 * </pre>
	 * @param  htDictCultureMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return HtDictCultureMasterDto HT辞書マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public HTDictCultureMasterDto search(HTDictCultureMasterDto htDictCultureMasterDto) {

		// エンティティ編集
		MHtDictCultureDtoMapper mapper = new MHtDictCultureDtoMapper();
		MHtDictCulture mHtDictCulture = mapper.mappingToEntity(htDictCultureMasterDto.data.head);

		// ============ HT辞書マスタメンテナンスデータ取得 =============

		// HT辞書マスタメンテナンスデータ取得メソッドを呼出し
		List<BDictCulture> bDictCultureList = htdictCultureMasterSelectLogic.select(mHtDictCulture, htDictCultureMasterDto.paging, errRetSts(StatusCode.SELECT_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}

		//変更前データ設定処理
		for (BDictCulture dictCulture : bDictCultureList) {

			if (dictCulture.getMHtDictCultureAsOne() == null) {
				dictCulture.setMHtDictCultureAsOne(new MHtDictCulture());
			}
			MHtDictCulture mhtdictculture = dictCulture.getMHtDictCultureAsOne();
			mhtdictculture.setOldDictNm(mhtdictculture.getDictNm());
		}

		//検索結果詰込処理

		List<BDictCultureDto> list = new BDictCultureDtoMapper().mappingToDtoList(bDictCultureList);
		htDictCultureMasterDto.data.body = list;
		return htDictCultureMasterDto;
	}

	/**
	 * <h2>入力チェック（登録）。</h2>
	 * <pre>
	 * 登録データの入力チェックを行う。
	 * エラーチェックを行い、エラーがない場合は、
	 * 通常の登録確認メッセージを設定する。
	 *
	 * </pre>
	 * @param htDictCultureMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(HTDictCultureMasterDto htDictCultureMasterDto, ErrorStatus errSts) {

		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>HT辞書カルチャマスタ登録。</h2>
	 * <pre>
	 * HT辞書カルチャマスタにデータを登録する。
	 * 完了メッセージを設定する。
	 *
	 * </pre>
	 * @param htDictCultureMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(HTDictCultureMasterDto htdictCultureMasterDto) {

		// エンティティ編集
		BDictCultureDtoMapper mapper = new BDictCultureDtoMapper();
		List<BDictCulture> bdictculture = mapper.mappingToEntityList(htdictCultureMasterDto.data.body);

		// =========== HT辞書カルチャマスタ登録 ==============

		// HT辞書カルチャマスタ登録メソッド呼び出し
		htdictCultureMasterInsertLogic.update(bdictculture, errRetSts(StatusCode.INSERT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ===== 完了メッセージをエラー管理クラスに登録 =====

		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}

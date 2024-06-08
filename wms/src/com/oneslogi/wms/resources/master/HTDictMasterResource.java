package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.BDictDto;
import com.oneslogi.base.dbflute.dtomapper.BDictDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MHtDictDtoMapper;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.MHtDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.HTDictMasterDto;
import com.oneslogi.wms.logic.master.HTDictMasterInsertLogic;
import com.oneslogi.wms.logic.master.HTDictMasterSelectLogic;

/**
 * HT辞書マスタ一覧のリソースクラス
 */
@Path("/master/HTdictMaster")
public class HTDictMasterResource extends AbstractResource {

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
		protected static final int HTDICT_MASTER_SELECT_FAILED = 2;
		/**
		 * HT辞書マスタ登録異常
		 */
		protected static final int HTDICT_MASTER_INSERT_FAILED = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private HTDictMasterSelectLogic  htdictMasterSelectLogic ;
	@Inject
	private HTDictMasterInsertLogic  htdictMasterInsertLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return HTDictMasterDto HT辞書マスタ一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public HTDictMasterDto init() {

		// 画面用DTO作成
		HTDictMasterDto htdictMasterDto = new HTDictMasterDto();

		return htdictMasterDto;
	}

	/**
	 * <h2>HT辞書マスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・データベースからHT辞書マスタメンテナンスデータを取得する
	 * </pre>
	 * @param  htdictMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return HTDictMasterDto HT辞書マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public HTDictMasterDto search(HTDictMasterDto htdictMasterDto) {

		// エンティティ編集
		MHtDictDtoMapper mapper = new MHtDictDtoMapper();
		MHtDict mhtDict = mapper.mappingToEntity(htdictMasterDto.data.head);
		//HT辞書マスタメンテナンスデータ取得.HT辞書マスタメンテナンスデータ取得メソッドを呼出し
		List<BDict> bDictList = htdictMasterSelectLogic.select(mhtDict, htdictMasterDto.paging, errRetSts(StatusCode.HTDICT_MASTER_SELECT_FAILED));

		//HT辞書名変更前データ設定処理
				for (BDict dict : bDictList) {

					if (dict.getMHtDictAsOne() == null) {
						dict.setMHtDictAsOne(new MHtDict());
					}
					MHtDict mhtdict = dict.getMHtDictAsOne();
					mhtdict.setOldDictNm(mhtdict.getDictNm());
				}


		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null ;
		}

		List<BDictDto> list = new BDictDtoMapper().mappingToDtoList(bDictList);
		htdictMasterDto.data.body = list;
		return htdictMasterDto;

	}

	/**
	 * <h2>入力チェック（登録）。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * ・通常の登録確認メッセージを設定する
	 *
	 * </pre>
	 * @param htdictMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(HTDictMasterDto htdictMasterDto,ErrorStatus errSts) {

		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>HT辞書マスタ登録。</h2>
	 * <pre>
	 * HT辞書マスタにデータを登録する。
	 * 完了メッセージを設定する。
	 *
	 * </pre>
	 * @param htdictMasterDto HT辞書マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(HTDictMasterDto htdictMasterDto) {

		// エンティティ編集
		BDictDtoMapper mapper = new BDictDtoMapper();
		List<BDict> bDictList = mapper.mappingToEntityList(htdictMasterDto.data.body);

		// =========== HT辞書マスタ登録 ==============

		// HT辞書マスタ登録メソッド呼び出し

		htdictMasterInsertLogic.insert(bDictList, errRetSts(StatusCode.HTDICT_MASTER_INSERT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		// ===== 完了メッセージをエラー管理クラスに登録 =====
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}

package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.BMessageDto;
import com.oneslogi.base.dbflute.dtomapper.BMessageDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MHtMessageDtoMapper;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.MHtMessage;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.HTMessageMasterDto;
import com.oneslogi.wms.logic.master.HTMessageMasterInsertLogic;
import com.oneslogi.wms.logic.master.HTMessageMasterSelectLogic;

/**
 * HTメッセージマスタメンテナンス
 */
@Path("/wms/master/HTmessageMaster")
public class HTMessageMasterResource extends AbstractResource {

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
		 * HTメッセージマスタ更新異常
		 */
		protected static final int UPDATE_FAILED = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private HTMessageMasterSelectLogic htmessageMasterSelectLogic;
	@Inject
	private HTMessageMasterInsertLogic htmessageMasterInsertLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @param htmessageMasterDto HTメッセージマスタ一覧画面用DTO
	 * @return HTMessageMasterDto  HTメッセージマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public HTMessageMasterDto init(HTMessageMasterDto htmessageMasterDto) throws IOException {
		return new HTMessageMasterDto();
	}

	/**
	 * <h2>HTメッセージマスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * データベースからHTメッセージマスタデータを取得する
	 * </pre>
	 * @param htmessageMasterDto HTメッセージマスタメンテナンス画面用DTO
	 * @return HTMessageMasterDto HTメッセージマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public HTMessageMasterDto search(HTMessageMasterDto htmessageMasterDto) {

		// ===== Entity変換 =====
		// メッセージマスタメンテナンス画面ヘッダ情報
		MHtMessageDtoMapper mapper = new MHtMessageDtoMapper();
		MHtMessage mHtMessage = mapper.mappingToEntity(htmessageMasterDto.data.head);

		// 画面マスタメンテナンスデータ取得.画面マスタメンテナンスデータ取得メソッドを呼出し
		List<BMessage> bmessageList = htmessageMasterSelectLogic.select(mHtMessage, htmessageMasterDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 変更前データ設定処理
		for (BMessage bmessage : bmessageList) {

			if (bmessage.getMHtMessageAsOne() == null) {
				bmessage.setMHtMessageAsOne(new MHtMessage());
			}
			MHtMessage mhtmessage = bmessage.getMHtMessageAsOne();
			mhtmessage.setOldMessageNm(mhtmessage.getMessageNm());

		}
		// ===== Entity-Dto変換処理 =====
		List<BMessageDto> body = new BMessageDtoMapper().mappingToDtoList(bmessageList);

		htmessageMasterDto.data.body = body;

		return htmessageMasterDto;
	}

	/**
	 * <h2>入力チェック</h2>
	 * <pre>
	 * データのチェックを行う
	 * エラーがない場合は、通常の登録確認メッセージを設定する
	 *
	 * </pre>
	 * @param htmessageMasterDto HTメッセージマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(HTMessageMasterDto htmessageMasterDto, ErrorStatus errSts) {

		// 確認メッセージをエラー管理クラスに登録
		this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>HTメッセージマスタ登録 。</h2>
	 * <pre>
	 *・HTメッセージマスタにデータを登録する。
	 *・完了メッセージを設定する。
	 * </pre>
	 * @param htmessageMasterDto HTメッセージマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(HTMessageMasterDto htmessageMasterDto) {
		// ===== Entity変換 =====
		// HTメッセージマスタメンテナンス画面明細情報
		BMessageDtoMapper mapper = new BMessageDtoMapper();
		List<BMessage> bmessageList = mapper.mappingToEntityList(htmessageMasterDto.data.body);

		// HTメッセージマスタ登録メソッド呼び出し

		htmessageMasterInsertLogic.update(bmessageList, errRetSts(StatusCode.UPDATE_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ===== 完了メッセージをエラー管理クラスに登録 =====

		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
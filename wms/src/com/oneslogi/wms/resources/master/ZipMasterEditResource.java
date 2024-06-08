package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dbflute.dtomapper.MZipDtoMapper;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ZipMasterDto;
import com.oneslogi.wms.dto.master.ZipMasterEditDto;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.ZipMasterInsertLogic;
import com.oneslogi.wms.logic.master.ZipMasterSelectLogic;
import com.oneslogi.wms.logic.master.ZipMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 郵便番号マスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/zipMasterEdit")
public class ZipMasterEditResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int INSERT_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int UPDATE_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 郵便番号コードで重複異常
		 */
		protected static final int CUSTOMER_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 配送コースコードで未存在異常
		 */
		protected static final int DELIVERY_COURSE_CODE_NOT_FOUND_ERROR = 3;
		/**
		 * 郵便番号登録異常
		 */
		protected static final int CUSTOMER_MASTER_INSERT_FAILED = 4;
		/**
		 * 郵便番号更新異常
		 */
		protected static final int CUSTOMER_MASTER_UPDATE_FAILED = 5;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 6;
		/**
		 * 郵便番号コードで存在異常
		 */
		protected static final int ZIP_CODE_NOT_FOUND_ERROR = 7;
		/**
		 * 在庫データで存在エラー
		 */
		protected static final int STOCK_DATA_FOUND_ERROR = 8;
		protected static final int CENTER_MASTER_NOT_FOUND_ERR = 9;
		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Add honma Start
		/**
		 * 住所未入力
		 */
		protected static final int ADDRESS_NO_INPUT = 10;
		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Add honma End

		/**
		 * 郵便番号CDで重複エラー
		 */
		protected static final int ZIP_CODE_DUPLICATE = 2;
		/**
		 * 登録異常
		 */
		protected static final int ZIP_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int ZIP_MASTER_UPDATE_FAILED = 5;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipMasterSelectLogic zipMasterSelectLogic;
	@Inject
	private ZipLogic zipLogic;

	@Inject
	private ZipMasterInsertLogic zipMasterInsertLogic;
	@Inject
	private ZipMasterUpdateLogic zipMasterUpdateLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZipMasterEditDto 郵便番号マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ZipMasterEditDto initNew() {
		return new ZipMasterEditDto();
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZipMasterEditDto 郵便番号マスタメンテナンス(編集)画面用DTO
	 * @param mZipCd  郵便番号CD
	 */
	@GET
	@Path("/initUpdate")
	public ZipMasterEditDto initUpdate(@QueryParam("zipCd") String mZipCd) {

		ZipMasterEditDto zipMasterEditDto = new ZipMasterEditDto();

		// 郵便番号IDを条件に設定して検索実行
		MZip condition = new MZip();
		condition.setZipCd(mZipCd);
		MZip zip = zipMasterSelectLogic.selectById(condition, errRetSts(StatusCode.CUSTOMER_CODE_DUPLICATE_ERROR));

		if (getErrorManager().size() > 0) {
			// エラーあり
			return zipMasterEditDto;
		}

		// ===== 画面用DTO作成 =====
		MZipDtoMapper mapper = new MZipDtoMapper();
		MZipDto zipDto = mapper.mappingToDto(zip);

		zipMasterEditDto.data.head = zipDto;

		return zipMasterEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・郵便番号CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ZipMasterDto zipMasterDto, ErrorStatus errSts) {

		// 郵便番号CD重複チェック
		this.setupInputCheck(zipMasterDto,errRetSts(StatusCode.INPUT_CHECK));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>郵便番号CD重複チェック。</h2>
	 * <pre>
	 * ・郵便番号CD重複チェックを行う。
	 * ・エラーがない場合は、データベースに郵便番号マスタを更新し、完了メッセージを設定する
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(ZipMasterDto zipMasterDto, ErrorStatus errSts) {

		// Entity変換
		MZipDtoMapper mapper = new MZipDtoMapper();
		MZip mZip = mapper.mappingToEntity(zipMasterDto.data.head);

		// 郵便番号IDがNULLの場合、郵便番号CD重複チェック処理を行う
		if (mZip.getZipId() == null ) {
			// 登録の場合
			zipLogic.checkZipCdInsert(mZip, errRetSts(errSts,StatusCode.ZIP_CODE_DUPLICATE));
		} else {
			// 修正の場合
			zipLogic.checkZipCdUpdate(mZip, errRetSts(StatusCode.ZIP_CODE_DUPLICATE));
		}
		//[#7146]チケット#356で対応で実装した必須チェックをコメントアウト 2020.02.04 ono Start
//		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Add honma Start
//		// 都道府県、市区町村、町域いずれか必須チェック
//		String delivAddr = new StringBuilder()
//				.append(CU.nullToStr(mZip.getAddress1()))
//				.append(CU.nullToStr(mZip.getAddress2()))
//				.append(CU.nullToStr(mZip.getAddress3()))
//				.toString();
//
//		if (delivAddr.length() < 1) {
//			// 都道府県、市区町村、町域いずれか必須
//			getErrorManager().add(errRetSts(errSts, StatusCode.ADDRESS_NO_INPUT), WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
//		}
//		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Add honma End
		//[#7146]チケット#356で対応で実装した必須チェックをコメントアウト 2020.02.04 ono End

		return null;
	}

	/**
	 * <h2>郵便番号マスタ登録。</h2>
	 * <pre>
	 * データの登録処理。
	 * エラーがない場合は、データベースに郵便番号マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタ画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ZipMasterEditDto zipMasterDto, ErrorStatus errSts) {

		// 郵便番号マスタ登録
		// エンティティ変換
		MZipDtoMapper mapper = new MZipDtoMapper();
		MZip mZip = mapper.mappingToEntity(zipMasterDto.data.head);

		// チェックエラーの場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 郵便番号IDがNULLの場合、郵便番号マスタ登録処理を行う
		if (mZip.getZipId() == null) {

			// 郵便番号マスタ登録
			zipMasterInsertLogic.insert(mZip, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));

		// 郵便番号IDがNULL以外の場合、郵便番号マスタ更新処理を行う
		} else {

			// 郵便番号マスタ更新
			zipMasterUpdateLogic.update(mZip, errRetSts(StatusCode.ZIP_MASTER_UPDATE_FAILED));
		}

		// チェックエラーの場合
		if (0 < getErrorManager().size()) {
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}

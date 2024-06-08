package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dbflute.dtomapper.MZipDtoMapper;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ZipMasterDto;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.ZipMasterInsertLogic;
import com.oneslogi.wms.logic.master.ZipMasterSelectLogic;
import com.oneslogi.wms.logic.master.ZipMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 郵便番号マスタメンテナンス画面のリソースクラス。
 */
@Path("/master/zipMaster")
public class ZipMasterResource extends AbstractWmsResource{

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
		 * 郵便番号CDで重複エラー
		 */
		protected static final int ZIP_CODE_DUPLICATE = 2;
		/**
		 * 郵便番号マスタメンテナンスデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int ZIP_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int ZIP_MASTER_UPDATE_FAILED = 5;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 6;
		//
		/**
		 * 検索条件未入力異常
		 */
		protected static final int ZIP_MASTER_CAN_NOT_SELECT_NOT_INPUT_ERROR = 7;

		//
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipMasterSelectLogic zipMasterSelectLogic;
	@Inject
	private ZipMasterInsertLogic zipMasterInsertLogic;
	@Inject
	private ZipMasterUpdateLogic zipMasterUpdateLogic;
	@Inject
	private ZipLogic zipLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public ZipMasterDto init() {
		ZipMasterDto zipMasterDto = new ZipMasterDto();
		return zipMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・データベースに郵便番号マスタメンテナンスデータを取得する
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 * @return ZipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public ZipMasterDto search(ZipMasterDto zipMasterDto) throws IOException {

		ZipMasterDto zipDto = new ZipMasterDto();

		// Entity変換
		MZipDtoMapper mapper = new MZipDtoMapper();
		MZip mZip = mapper.mappingToEntity(zipMasterDto.data.head);

        // [SK2-050] 「検索条件を入力して検索してください。」のエラーにするように修正する。2014.12.15 KI Start
		if(mZip.getZipCd() == null && mZip.getAddress1() == null && mZip.getAddress2() == null){
			// 確認表示
			getErrorManager().add(this.errRetSts(StatusCode.ZIP_MASTER_CAN_NOT_SELECT_NOT_INPUT_ERROR), WmsMessageConst.ZIP_MASTER_CANNOT_SELECT_NOT_INPUT_ERROR);
			return null;
		}
		// [SK2-050] 「検索条件を入力して検索してください。」のエラーにするように修正する。2014.12.15 KI End

		List<MZip> ziplist = zipMasterSelectLogic.select(mZip, zipMasterDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MZipDto> list = mapper.mappingToDtoList(ziplist);

		//検索結果詰込処理
		zipDto.data.body = list;
		zipDto.paging = zipMasterDto.paging;

		return zipDto;
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
		List<MZip> list = mapper.mappingToEntityList(zipMasterDto.data.body);

		int rowIndex = -1;
		// 郵便番号マスタリストのデータ件数分繰返
		for (MZip mZip : list) {
			rowIndex++;

			// 郵便番号IDがNULLの場合、郵便番号CD重複チェック処理を行う
			if (mZip.getZipId() == null ) {
				// 登録の場合
				zipLogic.checkZipCdInsert(mZip, errRetSts(errSts,StatusCode.ZIP_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合
				zipLogic.checkZipCdUpdate(mZip, errRetSts(StatusCode.ZIP_CODE_DUPLICATE, rowIndex));
			}
		}
		return null;
	}

	/**
	 * <h2>郵便番号マスタ登録。</h2>
	 * <pre>
	 * 郵便番号CD重複チェックを行う。
	 * 郵便番号マスタ登録。
	 * 郵便番号マスタ更新。
	 * エラーがない場合は、データベースに郵便番号マスタを登録と更新し、完了メッセージを設定する。
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタメンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ZipMasterDto zipMasterDto, ErrorStatus errSts) {

		// 郵便番号マスタ登録
		// エンティティ変換
		MZipDtoMapper mapper = new MZipDtoMapper();
		List<MZip> list = mapper.mappingToEntityList(zipMasterDto.data.body);

		// チェックエラーの場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		List<MZip> insertList = new ArrayList<>();

		List<MZip> updateList = new ArrayList<>();

		// 郵便番号マスタリストのデータ件数分繰返
		for (MZip mZip : list) {

			// 郵便番号IDがNULLの場合、郵便番号マスタ登録処理を行う
			if (mZip.getZipId() == null) {
				insertList.add(mZip);
				// 郵便番号マスタ登録
//				zipMasterInsertLogic.insert(mZip, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));

			// 郵便番号IDがNULL以外の場合、郵便番号マスタ更新処理を行う
			}else {
				updateList.add(mZip);
				// 郵便番号マスタ更新
//				zipMasterUpdateLogic.update(mZip, errRetSts(StatusCode.ZIP_MASTER_UPDATE_FAILED));
			}
		}

		if (!insertList.isEmpty()){
			zipMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()){
			zipMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.ZIP_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// チェックエラーの場合
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-151]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-151]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}
}

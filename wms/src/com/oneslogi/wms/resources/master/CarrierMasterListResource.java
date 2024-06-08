package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.wms.dto.master.MCarrierMasterListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.CarrierMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 運送業者マスタメンテナンス（一覧）。
 */
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//@Path("/master/carrierMaster")
@Path("/master/carrierMasterList")
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
public class CarrierMasterListResource extends AbstractWmsResource {

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
		 * 運送業者CDで重複エラー
		 */
		protected static final int CARRIER_CODE_DUPLICATE = 2;
		/**
		 * 運送業者マスタメンテナンスデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int CARRIER_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CARRIER_MASTER_UPDATE_FAILED = 5;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierMasterSelectLogic carrierMasterSelectLogic;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//	@Inject
//	private CarrierMasterInsertLogic carrierMasterInsertLogic;
//	@Inject
//	private CarrierMasterUpdateLogic carrierMasterUpdateLogic;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
	@Inject
	private CenterLogic centerLogic;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//	@Inject
//	private CarrierLogic carrierLogic;

//	/**
//	 * 登録または更新データ組立の結果
//	 */
//	private enum ResultSetupData {
//		ALL_OK,
//		ERROR,
//	}
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return MCarrierMasterListDto 運送業者マスタ画面用DTO
	 */

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//	@GET
//	@Path("/init")
//	public MCarrierMasterDto init() {
//		return new MCarrierMasterDto();
//	}
	@GET
	@Path("/init")
	public MCarrierMasterListDto init() {
		return new MCarrierMasterListDto();
	}
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End


	/**
	 * <h2>運送業者マスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・運送業者マスタDTOをキーに運送業者マスタデータ取り出し
	 * </pre>
	 * @param mCarrierMasterListDto 運送業者マスタ画面用DTO
	 * @return MCarrierMasterListDto 運送業者マスタ画面用DTO
	 */
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//	@GET
//	@Path("/search")
//	public MCarrierMasterDto search(MCarrierMasterDto mCarrierMasterDto) throws IOException {
//		MCarrierMasterDto mCarrierDto = new MCarrierMasterDto();
		@GET
		@Path("/search")
		public MCarrierMasterListDto search(MCarrierMasterListDto mCarrierMasterListDto) throws IOException {
			MCarrierMasterListDto mCarrierDto = new MCarrierMasterListDto();
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		// Entity変換
		MCarrierDtoMapper mapper = new MCarrierDtoMapper();
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//		MCarrier mCarrier = mapper.mappingToEntity(mCarrierMasterDto.data.head);
		MCarrier mCarrier = mapper.mappingToEntity(mCarrierMasterListDto.data.head);
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

		//センタID取得
		String centerCd = mCarrier.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		mCarrier.setCenterId(mCenter.getCenterId());

		// [#361] ページング処理追加 2016.12.13 kawana Start
		// 検索
		PagingResultBean<MCarrier> page = carrierMasterSelectLogic.select(mCarrier, mCarrierMasterListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// [#361] ページング処理追加 2016.12.13 kawana End
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MCarrierDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		mCarrierDto.data.body = list;
		// [#361] ページング処理追加 2016.12.13 kawana Start
		mCarrierDto.paging = mCarrierMasterListDto.paging;
		// [#361] ページング処理追加 2016.12.13 kawana End

		return mCarrierDto;
	}

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・運送業者CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param mCarrierMasterListDto 運送業者マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

//	@POST
//	@Path("/inputCheck")
//	public StatusDto inputCheck(MCarrierMasterDto mCarrierMasterDto,ErrorStatus errSts) {
//
//		// Entity変換
//		MCarrierDtoMapper mapper = new MCarrierDtoMapper();
//		List<MCarrier> carrierList = mapper.mappingToEntityList(mCarrierMasterDto.data.body);
//		MCarrier mCarrier = mapper.mappingToEntity(mCarrierMasterDto.data.head);
//		ResultSetupData resultStatus = setupInputCheck(mCarrier,carrierList,errRetSts(StatusCode.INPUT_CHECK));
//
//		switch (resultStatus) {
//		case ERROR:
//			return null;
//		case ALL_OK:
//			// 通常の確認メッセージを設定
//			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
//			break;
//		}
//
//		return null;
//	}

	/**
	 * <h2>運送業者マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに運送業者マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param mCarrierMasterListDto 運送業者マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
//	@POST
//	@Path("/register")
//	public StatusDto register(MCarrierMasterDto mCarrierMasterDto,ErrorStatus errSts) {
//	// Entity変換
//		MCarrierDtoMapper mapper = new MCarrierDtoMapper();
//		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//		List<MCarrier> carrierList = mapper.mappingToEntityList(mCarrierMasterDto.data.body);
//		MCarrier mCarrier = mapper.mappingToEntity(mCarrierMasterDto.data.head);
//		MCenter mCenter = mCarrier.getMCenter();
//
//		ResultSetupData resultStatus = setupInputCheck(mCarrier,carrierList,errRetSts(StatusCode.INPUT_CHECK));
//
//		// 結果判定
//		if (resultStatus == ResultSetupData.ERROR) {
//			return null;
//		}
//
//		mCenter = centerLogic.getUkEntity(mCenter);
//		if (getErrorManager().size() > 0) {
//			return null;
//		}
//
//		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
//		List<MCarrier> insertList = new ArrayList<>();
//
//		List<MCarrier> updateList = new ArrayList<>();
//
//		for (MCarrier mcarrier : carrierList) {
//			// センタID取得
//			mcarrier.setCenterId(mCenter.getCenterId());
//
//			if (mcarrier.getCarrierId() == null) {
//				// 登録
//				insertList.add(mcarrier);
////				carrierMasterInsertLogic.insert(mcarrier, errRetSts(StatusCode.CARRIER_MASTER_INSERT_FAILED));
//			} else {
//				// 修正
//				updateList.add(mcarrier);
////				carrierMasterUpdateLogic.update(mcarrier, errRetSts(StatusCode.CARRIER_MASTER_UPDATE_FAILED));
//			}
//		}
//
//		if (!insertList.isEmpty()){
//			carrierMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.CARRIER_MASTER_INSERT_FAILED));
//		}
//
//		if (!updateList.isEmpty()){
//			carrierMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.CARRIER_MASTER_INSERT_FAILED));
//		}
//		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End
//
//		// 結果判定
//		if (0 < getErrorManager().size()) {
//			return null;
//		}
//		//[ON推-品向-148]「正常に更新されました。」に修正 2014.11.26 衛 Start
//		// 完了メッセージの設定
//		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
//		//[ON推-品向-148]「正常に更新されました。」に修正 2014.11.26 衛 End
//		return null;
//	}

	/**
	 * <h2>運送業者CD重複チェック。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・運送業者CD重複チェック
	 * </pre>
	 * @param mCarrierList 運送業者マスタ画面List
	 * @return ResultSetupData 結果
	 */
//	protected ResultSetupData setupInputCheck(MCarrier Carrier,List<MCarrier> mCarrierList, ErrorStatus errSts) {
//		// 登録されていないセンタがあるか
//		int rowIndex = -1;
//		// チェック処理
//		for (MCarrier mCarrier : mCarrierList) {
//			rowIndex++;
//			//センタID取得
//			String centerCd = Carrier.getMCenter().getCenterCd();
//			MCenter mCenter = new MCenter();
//			mCenter.setCenterCd(centerCd);
//			mCenter = centerLogic.getUkEntity(mCenter);
//
//			// エラー有りの場合は終了
//			if (getErrorManager().size() > 0) {
//				return null;
//			}
//			mCarrier.setCenterId(mCenter.getCenterId());
//			// 運送業者CD重複チェック
//			if (mCarrier.getCarrierId() == null) {
//				// 登録の場合
//				carrierLogic.checkCarrierCdInsert(mCarrier, errRetSts(errSts,StatusCode.CARRIER_CODE_DUPLICATE, rowIndex));
//			}
//		}
//
//		// 結果の設定
//		ResultSetupData resultStatus;
//		if (0 < getErrorManager().size()) {
//			resultStatus = ResultSetupData.ERROR;
//		} else {
//			resultStatus = ResultSetupData.ALL_OK;
//		}
//
//		return resultStatus;
//	}
}

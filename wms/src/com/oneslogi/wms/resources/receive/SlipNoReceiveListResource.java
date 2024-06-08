package com.oneslogi.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.exception.ReportOverSafetySizeException;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ReceivePlanListPrintDto;
import com.oneslogi.wms.dto.receive.SlipNoReceiveListDto;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.receive.ProductLabelPrintLogic;
import com.oneslogi.wms.logic.receive.ReceiveListToSlipSelectLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanDeleteLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanErrorCheckLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 伝票別入荷一覧画面のリソースクラス。
 */
@Path("/receive/SlipNoReceiveList")
public class SlipNoReceiveListResource extends AbstractWmsResource {

	private static final String REPORT_CD = "ReceivePlanList";

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
	private static final String REPORT_CD1 = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
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
		 * 伝票別入荷一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 削除データのチェック異常
		 */
		protected static final int CHECK_DELETE_FAILED = 3;
		/**
		 * エラーデータのチェック異常
		 */
		protected static final int CHECK_ERROR_DATA_FAILED = 4;
		/**
		 * 入荷状態チェック異常
		 */
		protected static final int CHECK_RECEIVE_STATUS_FAILED = 5;
		/**
		 * 入荷実績削除異常
		 */
		protected static final int STORE_RECORD_DELETE_FAILED = 6;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_FAILED = 7;
		// コントロールNoでデータベースから取得方法に変更 2016.3.15 nayzaw Start
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 8;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 9;
		// コントロールNoでデータベースから取得方法に変更 2016.3.15 nayzaw End
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
		/**
		 * 更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 10;
		/**
		 * 商品ラベル異常
		 */
		protected static final int PRODUCT_LABEL_FAILED = 11;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
	}

	// ===== メンバ変数 =====
	/**
	 * 入荷予定リストチェックの結果
	 */
	protected enum ResultSetupPrintData {
		ALL_OK,
		ERROR,
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveListToSlipSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
	@Inject
	private PrintLogic printLogic;
	@Inject
	private ParamLogic paramLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
	@Inject
	private ReceiveStatusCheckLogic receiveStatusCheckLogic;
	@Inject
	private ReceivePlanDeleteLogic receivePlanDeleteLogic;
	@Inject
	private ReceivePlanErrorCheckLogic receivePlanErrorCheckLogic;
	@Inject
	private ReportLogic reportLogic;
	// コントロールNoでDBから取得する方法に変更 2016.3.15 nayzaw Start
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	// コントロールNoでDBから取得する方法に変更 2016.3.15 nayzaw End
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
	@Inject
	private ProductLabelPrintLogic productLabelPrintLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return SlipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 */
	@GET
	@Path("/initSearch")
	public SlipNoReceiveListDto initSearch() {
		SlipNoReceiveListDto slipNoReceiveListDto = new SlipNoReceiveListDto();

		// 発行帳票を指定
		slipNoReceiveListDto.data.test.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
		slipNoReceiveListDto.data.test2.printBasicData.reportId = reportLogic.getReportId(REPORT_CD1);
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
		// [C-NIS-0006] 入荷予定日のデフォルト制御追加 2015.07.03 hayashi Start
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		// 入荷予定日From
		slipNoReceiveListDto.data.dtFromDefFlg = getPropertyIntValue(WmsPropertyConst.SLIP_NO_RECEIVE_LIST_DT_FROM_DEF_FLG);
		// 入荷予定日To
		slipNoReceiveListDto.data.dtToDefFlg = getPropertyIntValue(WmsPropertyConst.SLIP_NO_RECEIVE_LIST_DT_TO_DEF_FLG);
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		// [C-NIS-0006] 入荷予定日のデフォルト制御追加 2015.07.03 hayashi End
		return slipNoReceiveListDto;
	}

	/**
	 * <h2>伝票別入荷一覧データ取得</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、伝票別入荷一覧データ取得
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return SlipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public SlipNoReceiveListDto search(SlipNoReceiveListDto slipNoReceiveListDto) {

		SlipNoReceiveListDto resultSlipNoReceiveListDto = new SlipNoReceiveListDto();

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(slipNoReceiveListDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		header.setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = header.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		header.setCenterId(mCenter.getCenterId());

		TStoreRecordB body = new TStoreRecordB();
		body.setStoreDtFrom(header.getStoreDtFrom());
		body.setStoreDtTo(header.getStoreDtTo());

		//伝票別入荷一覧データ取得用
		PagingResultBean<TReceivePlanH> page = selectLogic.select(header, body, slipNoReceiveListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			//getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		// 進捗率計算用
//		SlipNoReceiveListDto.ProgressData progressData = new SlipNoReceiveListDto.ProgressData();
//
//		// [ON推-品向-927] ページングなしに変更したため進捗率計算用の全件検索は不要 2015.08.05 kawana Start
//		List<TReceivePlanH> progressDataList;
//		if (slipNoReceiveListDto.paging.pageSize < 1) {
//			// ページングなし
//			progressDataList = page;
//		} else {
//			// ページングあり
//
//			// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
//			// 進捗用に全件取得
//			progressDataList = selectLogic.selectForProgress(header, body, errRetSts(StatusCode.NOT_FOUND_DATA));
//			//エラーが存在する場合
//			if (getErrorManager().size() > 0) {
//				return null;
//			}
//		}
//		// [ON推-品向-927] ページングなしに変更したため進捗率計算用の全件検索は不要 2015.08.05 kawana End

//		//進捗率計算
//		for (TReceivePlanH h : progressDataList) {
//			// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End
//
//			//[SK2-031] 出庫指示一覧画面と不一致。2014.12.11 KI Start
//			if (h.isReceiveStatus$90()) {
//				continue;
//			}
//			progressData.allCount += h.getSumPlanCount();
//			if (h.isReceiveStatus$01()) {
//				progressData.nonReceiveCount += h.getSumPlanCount();
//			} else if (h.isReceiveStatus$02()) {
//				progressData.receivingCount += h.getSumPlanCount();
//			} else if (h.isReceiveStatus$03()) {
//				progressData.storedCount += h.getSumPlanCount();
//			//[SK2-031] 出庫指示一覧画面と不一致。2014.12.11 KI End
//			}
//		}
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

		// Dto変換処理
		TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper();
		List<TReceivePlanHDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultSlipNoReceiveListDto.paging = slipNoReceiveListDto.paging;
		resultSlipNoReceiveListDto.data.list = list;
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		resultSlipNoReceiveListDto.data.progress = progressData;
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start

		return resultSlipNoReceiveListDto;
	}

	/**
	 * <h2>入力チェック（入荷予定リスト）</h2>
	 * <pre>
	 * ・入荷予定リスト発行データのチェックを行う
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckReportPrint")
	public StatusDto inputCheckReportPrint(SlipNoReceiveListDto slipNoReceiveListDto) {

		//入荷予定リスト発行チェックメソッドを呼出し
		reportPrintCheck(slipNoReceiveListDto);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return null;
	}

	/**
	 * <h2>入荷予定リスト発行</h2>
	 * <pre>
	 * ・入荷予定リスト発行チェックを行う
	 * ・エラーがない場合は、入荷予定リスト発行画面へ遷移
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@GET
	@Path("/reportPrint")
	public StatusDto reportPrint(SlipNoReceiveListDto slipNoReceiveListDto) {

		//入荷予定リスト発行チェックメソッドを呼出し
		reportPrintCheck(slipNoReceiveListDto);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return null;

	}

	/**
	 * <h2>入荷予定リスト発行チェック</h2>
	 * <pre>
	 * ・入荷予定データを取得
	 * ・以下のチェックを行う
	 * ・ 削除データのチェック
	 * ・ エラーデータのチェック
	 *
	 * ・戻り値を下記のように設定する
	 * ・チェックエラー : 削除データのチェック異常、エラーデータのチェック異常
	 * ・チェック正常 : 正常
	 * </pre>
	 * @param slipNoReceiveListDto 入荷予定ヘッダリスト
	 * @return ResultSetupPrintData 処理結果
	 */
	@GET
	@Path("/reportPrintCheck")
	public ResultSetupPrintData reportPrintCheck(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		for(TReceivePlanH head : list){
			//削除フラグ="1"の場合
			if (head.isDelFlg$1()) {
				getErrorManager().add(errRetSts(StatusCode.CHECK_DELETE_FAILED), WmsMessageConst.DELETED_DATA_CANNOT_OUTPUT_ERROR);
				return ResultSetupPrintData.ERROR;
			}
			//エラーフラグ="1"の場合
			if (head.isErrorFlg$1()) {
				getErrorManager().add(errRetSts(StatusCode.CHECK_ERROR_DATA_FAILED), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
				return ResultSetupPrintData.ERROR;
			}
		}

		return ResultSetupPrintData.ALL_OK;
	}

	/**
	 * <h2>入力チェック（入荷予定削除）</h2>
	 * <pre>
	 * ・入荷状態チェックを行う
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・ 通常の登録確認メッセージ
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckDelete")
	public StatusDto inputCheckDelete(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		//入荷状態チェック.入荷削除メソッドを呼出し
		receiveStatusCheckLogic.receivePlanDelete(list, null, null, errRetSts(StatusCode.CHECK_RECEIVE_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}

		return null;

	}

	/**
	 * <h2>入荷予定削除</h2>
	 * <pre>
	 * ・入荷状態チェックを行う
	 * ・エラーがない場合は、データベースに入荷予定データを削除し、完了メッセージを設定する
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/delete")
	public StatusDto delete(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		//入荷状態チェック.入荷削除メソッドを呼出し
		receiveStatusCheckLogic.receivePlanDelete(list, null, null, errRetSts(StatusCode.CHECK_RECEIVE_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		for (TReceivePlanH h : list) {
			//入荷予定削除.入荷予定削除メソッドを呼出し
			receivePlanDeleteLogic.delete(h, errRetSts(StatusCode.STORE_RECORD_DELETE_FAILED));

			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理終了
				return null;
			}
		}

		// 確認表示
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>入力チェック（エラーチェック）</h2>
	 * <pre>
	 * ・入荷状態チェックを行う
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・ 通常の登録確認メッセージ
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckErrorCheck")
	public StatusDto inputCheckErrorCheck(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		//入荷状態チェック.入荷エラーチェックメソッドを呼出し
		receiveStatusCheckLogic.receiveErrorCheck(list, null, null, errRetSts(StatusCode.CHECK_RECEIVE_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.ERROR_CHECK_EXECUTE_CONFIRMATION);
		}

		return null;

	}

	/**
	 * <h2>エラーチェック</h2>
	 * <pre>
	 * ・入荷状態チェックを行う
	 * ・エラーがない場合は、エラーチェックを実施し、完了メッセージを設定する
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/errorCheck")
	public StatusDto errorCheck(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		//入荷状態チェック.入荷エラーチェックメソッドを呼出し
		receiveStatusCheckLogic.receiveErrorCheck(list, null, null, errRetSts(StatusCode.CHECK_RECEIVE_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNoでDBから取得方法に変更 2016.3.15 nayzaw Start
		// コントロールNo取得
		Long controlNo = numberingCenterLogic.getControlNo();

		// 対象になる入荷予定ヘッダデータにコントロールNoを設定してDB更新
		int updateCnt = updateControlNoLogic.updateTReceivePlanH(list, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if(updateCnt != list.size()){
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR),WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		//入荷エラーチェック.入荷エラーチェックメソッドを呼出し
		Boolean errorData = receivePlanErrorCheckLogic.check(controlNo, null, errRetSts(StatusCode.ERROR_CHECK_FAILED));

		//コントロールNo.のクリア処理
		for (TReceivePlanH planH : list) {
			planH.setControlNo(controlNo);
		}

		controlNo = null;
		// 出荷指示ヘッダのデータに更新したコントロールNoをクリア
		// 画面で選択した行数と更新件数合ってるかチェック処理 追加 2016.4.22 nayzaw Start
		updateCnt = updateControlNoLogic.updateTReceivePlanH(list, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		if(updateCnt != list.size()){
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR),WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		// 画面で選択した行数と更新件数合ってるかチェック処理 追加 2016.4.22 nayzaw End
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// エラーチェックの結果判定
		if(errorData == null){
			//処理終了
			return null;
		}
		if(errorData.booleanValue()){
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.ERROR_CHECK_ERROR),WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		}
		else{
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		}

		// コントロールNoでDBから取得方法に変更 2016.3.15 nayzaw End
		return null;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
	/**
	 * <h2>入力チェック（商品ラベル）</h2>
	 * <pre>
	 * ・商品ラベル発行データのチェックを行う
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckProductLabel")
	public StatusDto inputCheckProductLabel(SlipNoReceiveListDto slipNoReceiveListDto) {

		//商品ラベル発行チェックメソッドを呼出し
		productLabelCheck(slipNoReceiveListDto);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return null;
	}

	/**
	 * <h2>・商品ラベル発行</h2>
	 * <pre>
	 * ・商品ラベル発行チェックを行う
	 * ・エラーがない場合は、・商品ラベル発行画面へ遷移
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@GET
	@Path("/productLabel")
	public StatusDto productLabel(SlipNoReceiveListDto slipNoReceiveListDto) {

		//商品ラベル発行チェックメソッドを呼出し
		productLabelCheck(slipNoReceiveListDto);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return null;

	}

	/**
	 * <h2>商品ラベル発行チェック</h2>
	 * <pre>
	 * ・商品ラベルデータを取得
	 * ・以下のチェックを行う
	 * ・ 削除データのチェック
	 * ・ エラーデータのチェック
	 *
	 * ・戻り値を下記のように設定する
	 * ・チェックエラー : 削除データのチェック異常、エラーデータのチェック異常
	 * ・チェック正常 : 正常
	 * </pre>
	 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
	 * @return ResultSetupPrintData 処理結果
	 */
	@GET
	@Path("/productLabelCheck")
	public ResultSetupPrintData productLabelCheck(SlipNoReceiveListDto slipNoReceiveListDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final List<TReceivePlanH> list = headerMapper.mappingToEntityList(slipNoReceiveListDto.data.list);

		for (TReceivePlanH head : list) {

			//削除フラグ="1"の場合
			if (head.isDelFlg$1()) {
				getErrorManager().add(errRetSts(StatusCode.CHECK_DELETE_FAILED), WmsMessageConst.DELETED_DATA_CANNOT_OUTPUT_ERROR);
				return ResultSetupPrintData.ERROR;
			}
			//エラーフラグ="1"の場合
			if (head.isErrorFlg$1()) {
				getErrorManager().add(errRetSts(StatusCode.CHECK_ERROR_DATA_FAILED), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
				return ResultSetupPrintData.ERROR;
			}
			//入荷ステータスが「03：入荷済」以外のデータがあった場合
			if (!head.isReceiveStatus$03()){
				getErrorManager().add(errRetSts(StatusCode.PRODUCT_LABEL_FAILED), WmsMessageConst.PRODUCT_LABEL_CANNOT_OUTPUT_NOT_RECEIVE_COMPLETED_ERROR);
				return ResultSetupPrintData.ERROR;
			}
		}

		return ResultSetupPrintData.ALL_OK;
	}

	/**
	 * <h2>商品ラベル発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、商品ラベル帳票データ更新を取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに商品ラベル帳票データ更新を更新する
	 * </pre>
	 * @param dtoList 商品ラベル発行画面用DTO
	 * @return receivePlanListPrintDto 処理結果DTO
	 */
	@GET
	@Path("/productLabelPrint")
	public ReceivePlanListPrintDto productLabelPrint(final List<ReceivePlanListPrintDto> dtoList) throws Exception {


		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//荷主センタ変更対応 201７.02.24 sja Start
		MCenter mcenetr = new MCenter();
		//荷主センタ変更対応 201７.02.24 sja End

		for (ReceivePlanListPrintDto dto : dtoList) {
			// 発行帳票を指定
			dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD1);
			// Entity変換
			TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
			TReceivePlanB entity = mapper.mappingToEntity(dto.data.search);

			// コントロールNo更新
			TReceivePlanR update = new TReceivePlanR();

			TReceivePlanH header = new TReceivePlanH();

			TReceivePlanB body = new TReceivePlanB();

			TReceivePlanR report = new TReceivePlanR();

			//エンティティ編集
			update.setControlNo(controlNo);

			//センタID取得
			String centerCd = entity.getTReceivePlanH().getMCenter().getCenterCd();

			MCenter mCenter = new MCenter();

			mCenter.setCenterCd(centerCd);

			mCenter = centerLogic.getUkEntity(mCenter);

			header.setCenterId(mCenter.getCenterId());

			//荷主センタ変更対応 201７.02.24 sja Start
			mcenetr = mCenter;
			//荷主センタ変更対応 201７.02.24 sja End


			//荷主ID取得
			String clientCd = entity.getTReceivePlanH().getMClient().getClientCd();

			MClient mClient = new MClient();

			mClient.setClientCd(clientCd);

			mClient = clientLogic.getUkEntity(mClient);

			header.setClientId(mClient.getClientId());

			//入荷予定ヘッダID
			header.setReceivePlanHId(entity.getTReceivePlanH().getReceivePlanHId());

			// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
			productLabelPrintLogic.updateControlNo(update, header, body, report, errRetSts(StatusCode.UPDATE_EXCEPTION));
		}

		// 商品ラベル帳票(検索用)
		TReceivePlanR tReceivePlanR = new TReceivePlanR();
		tReceivePlanR.setControlNo(controlNo);

		// 商品ラベル発行データ取得メソッドを呼出し
		//荷主センタ変更対応 201７.02.24 sja Start
//		List<TStoreRecordB> tStoreRecordBList = productLabelPrintLogic.select(tReceivePlanR,errRetSts(StatusCode.NOT_FOUND_DATA));
		List<TStoreRecordB> tStoreRecordBList = productLabelPrintLogic.select(tReceivePlanR,mcenetr, errRetSts(StatusCode.NOT_FOUND_DATA));
		//荷主センタ変更対応 201７.02.24 sja End


		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		// JSON通信のためにSimpleDTO変換
		TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordBDto> selectDto = mapper.mappingToDtoList(tStoreRecordBList);

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (selectDto.get(0).getTStoreRecordH().getClientId() != null && selectDto.get(0).getTStoreRecordH().getCenterId() != null) {
			mClientCenter.setClientId(selectDto.get(0).getTStoreRecordH().getClientId());
			mClientCenter.setCenterId(selectDto.get(0).getTStoreRecordH().getCenterId());
		} else {
			mClientCenter.setClientId(dtoList.get(0).data.search.getTReceivePlanH().getClientId());
			mClientCenter.setCenterId(dtoList.get(0).data.search.getTReceivePlanH().getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		if (tStoreRecordBList == null) {
			return null;
		}

		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MParamDtoMapper mParamDtoMapper = new MParamDtoMapper();
		MParamDto mParamDto = mParamDtoMapper.mappingToDto(mParam);

		// 帳票出力データ取得処理
		List<ProductLabelDto> dataList = new ArrayList<ProductLabelDto>();

		for (TStoreRecordB tStoreRecordB : tStoreRecordBList) {

			ProductLabelDto redto = new ProductLabelDto();

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start

			// 商品ラベル情報取得
			MProductDto mProductDto = mProductDtoMapper.mappingToDto(tStoreRecordB.chaseTReceivePlanB().chaseMProduct());
			redto = productLabelLogic.getProductLabelDto(mProductDto, mParamDto);
			redto.cultureId = getCultureId();

			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
			// 出力枚数取得
			long outCnt = productLabelLogic.getOutNum(tStoreRecordB.chaseTReceivePlanB().getProductId(), tStoreRecordB.getStoreNum(), mParamDto);
			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End

			for (int i = 1; i <= outCnt; i++) {
				dataList.add(redto);
			}

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
		}

		// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana Start

		// 発行件数 上限チェック
		final int allowQueryCountToReport = getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT);
		if (allowQueryCountToReport < dataList.size()) {

			// 件数上限エラー
			throw new ReportOverSafetySizeException("The report size is over the specified safety size.", allowQueryCountToReport);
		}

		// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana End

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// 商品ラベル帳票を発行する
		dtoList.get(0).printBasicData.outputData = json.format(dataList);
		printLogic.print(dtoList.get(0));

		ReceivePlanListPrintDto receivePlanListPrintDto = new ReceivePlanListPrintDto();
		receivePlanListPrintDto.output = dtoList.get(0).output;

		TReceivePlanR tr = new TReceivePlanR();
		//商品ラベル帳票更新
		tr.setControlNo(null);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		productLabelPrintLogic.updateRplOutFlg(tr, tReceivePlanR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS),
				WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return receivePlanListPrintDto;
	}
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End

}

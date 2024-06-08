package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.dto.shipping.SingleRowShippingInspectDto;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic.ResultInspected;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 単行出荷検品画面のリソースクラス
 */
@Path("/shipping/singleRowShippingInspect")
public class SingleRowShippingInspectResource extends AbstractWmsResource {

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
		 * 単行出荷検品データ取得異常
		 */
		protected static final int SHIPPING_INSPECT_SELECT_FAILED = 2;
		/**
		 * 荷材ID更新異常
		 */
		protected static final int BOX_ID_UPDATE_FAILED = 3;
		/**
		 * 検品処理異常
		 */
		protected static final int INSPECTED_FAILED = 4;
	}

	// ===== 使用ロジッククラス =====

	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;
	@Inject
	private MessageLogic messageLogic;

	// ===== 内部使用 列挙型 =====

	private enum ProcessType {
		/** 検索処理 */
		SELECT,
		/** 検品処理 */
		INSPECTED
	}

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return SingleRowShippingInspectDto 単行出荷検品画面用DTO
	 */
	@GET
	@Path("/init")
	public SingleRowShippingInspectDto init() {

		return new SingleRowShippingInspectDto();
	}

	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start

	/**
	 * <h2>単行出荷検品の検品中データ取得。</h2>
	 * <pre>
	 * 画面で入力したユーザの検品中データを取得する。
	 * </pre>
	 * @param singleRowShippingInspectDto 単行出荷検品画面用DTO
	 * @return SingleRowShippingInspectDto 単行出荷検品画面用DTO
	 */
	@GET
	@Path("/selectWorkingData")
	public SingleRowShippingInspectDto selectWorkingData(SingleRowShippingInspectDto singleRowShippingInspectDto) throws IOException {

		// Entity変換
		final WSglRowShipInspH searchCondition = new WSglRowShipInspHDtoMapper().mappingToEntity(singleRowShippingInspectDto.data.search);

		// 検品中データ検索
		WSglRowShipInspB workingData = singleRowShippingInspectLogic.selectWorkingData(searchCondition, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		if (workingData == null) {
			// 検品中データなし

			singleRowShippingInspectDto.data.inspData = null;
			return singleRowShippingInspectDto;
		}

		if (workingData.getInspectedNum() != null && 0 < workingData.getInspectedNum().longValue()) {
			// 検品済数が1以上 ==> 警告を表示

			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_EXISTS_INSPECTED_PRODUCT_WARN);
		}

		// 画面用Dtoに検品データを設定
		setInspectDataToReturnDto(singleRowShippingInspectDto, searchCondition, workingData, ProcessType.SELECT, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		return singleRowShippingInspectDto;
	}

	/**
	 * <h2>単行出荷検品の作業指示数を取得。</h2>
	 * <pre>
	 * 画面で入力された検索条件で、作業指示数を取得する。
	 *
	 * 既に検品中の場合は作業指示数は取得せずに検品中データを取得して返す。
	 * </pre>
	 * @param singleRowShippingInspectDto 単行出荷検品画面用DTO
	 * @return SingleRowShippingInspectDto 単行出荷検品画面用DTO
	 */
	@GET
	@Path("/selectInstNum")
	public SingleRowShippingInspectDto selectInstNum(SingleRowShippingInspectDto singleRowShippingInspectDto) throws IOException {

		// Entity変換
		final WSglRowShipInspH searchCondition = new WSglRowShipInspHDtoMapper().mappingToEntity(singleRowShippingInspectDto.data.search);

		// 作業指示数を検索
		Set<Long> workInstNunSet = singleRowShippingInspectLogic.selectWorkInstNumSet(searchCondition, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 結果の設定
		singleRowShippingInspectDto.data.instNumList = workInstNunSet;

		return singleRowShippingInspectDto;
	}

	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End

	/**
	 * 検品ユーザの検品済伝票数を取得
	 */
	private int getUserInspSlipNum(final long userId, List<WSglRowShipInspB> inspectDataList) {

		int userInspSlipNum = 0;
		for (WSglRowShipInspB wInspB : inspectDataList) {

			if (wInspB.getUserId() == null) {
				// 未検品
				continue;
			}

			if (wInspB.getUserId().longValue() == userId) {
				// 検品ユーザ一致

				if (wInspB.isInspectionFlg$1()) {
					// 検品済

					userInspSlipNum++;
				}
			}
		}

		return userInspSlipNum;
	}

	/**
	 * <h2>検品データを取得.</h2>
	 * <pre>
	 * 指定された検索条件、指示数の検品データを取得する。
	 * </pre>
	 * @param singleRowShippingInspectDto 単行出荷検品画面用DTO
	 * @return SingleRowShippingInspectDto 単行出荷検品画面用DTO
	 */
	@GET
	@Path("/selectInspectionData")
	public SingleRowShippingInspectDto selectInspectionData(SingleRowShippingInspectDto singleRowShippingInspectDto) throws IOException {

		// Entity変換
		final WSglRowShipInspH searchCondition = new WSglRowShipInspHDtoMapper().mappingToEntity(singleRowShippingInspectDto.data.search);

		// 検品対象データを取得
		WSglRowShipInspB inspectData = singleRowShippingInspectLogic.selectInspectData(searchCondition, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 納品先停止が含まれていないかチェック
		if (singleRowShippingInspectLogic.existsShippingStopCustomer(inspectData.getWSglRowShipInspH())) {

			// 警告を表示
			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_EXISTS_SHIPPING_STOP_CUSTOMER_WARN);
		}

		// 画面用Dtoに検品データを設定
		setInspectDataToReturnDto(singleRowShippingInspectDto, searchCondition, inspectData, ProcessType.SELECT, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		return singleRowShippingInspectDto;
	}

	/**
	 * 画面用Dtoに検品データを設定する
	 */
	private void setInspectDataToReturnDto(SingleRowShippingInspectDto returnDto, final WSglRowShipInspH searchCondition, WSglRowShipInspB inspectData, ProcessType processType, ErrorStatus errSts) {

		// 検品データリスト検索
		List<WSglRowShipInspB> inspectDataList = singleRowShippingInspectLogic.selectWorkingList(inspectData.getSglRowShipInspHId(), errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 結果の設定
		WSglRowShipInspBDtoMapper mapper = new WSglRowShipInspBDtoMapper();
		returnDto.data.instNumList = null;
		returnDto.data.inspData = mapper.mappingToDto(inspectData);
		returnDto.data.list = mapper.mappingToDtoList(inspectDataList);
		returnDto.data.userInspSlipNum = getUserInspSlipNum(searchCondition.getUserId(), inspectDataList);

		switch (processType) {
		case SELECT:
			// 検索処理

			// デフォルト荷材設定
			MBox defaultBox = singleRowShippingInspectLogic.selectDefaultBox(inspectData.getWSglRowShipInspH(), inspectData);
			if (defaultBox != null) {
				returnDto.data.defaultBox = new MBoxDtoMapper().mappingToDto(defaultBox);
			}

			// 出庫作業メッセージ設定
			if (!CU.isNullOrEmpty(inspectData.getPickingWorkMessage())) {

				returnDto.data.pickingWorkMessage = messageLogic.getMessageNm(
						WmsMessageConst.PICKING_WORK_MESSAGE_INFORMATION,
						inspectData.getPickingWorkMessage(),
						inspectData.getTPickingH().getPickingWorkNo());
			}
			break;
		case INSPECTED:
			// 検品処理
			break;
		}
	}

	/**
	 * <h2>荷材IDの更新.</h2>
	 * <pre>
	 * 単行出荷検品ワークの荷材IDを更新する。
	 * </pre>
	 * @param singleRowShippingInspectDto 単行出荷検品画面用DTO
	 * @return StatusDto 結果DTO
	 */
	@POST
	@Path("/updateBoxId")
	public StatusDto updateBoxId(SingleRowShippingInspectDto singleRowShippingInspectDto) throws IOException {

		// Entity変換
		final WSglRowShipInspB inspData = new WSglRowShipInspBDtoMapper().mappingToEntity(singleRowShippingInspectDto.data.inspData);

		// 荷材IDの更新
		singleRowShippingInspectLogic.updateBoxId(inspData.getWSglRowShipInspH(), errRetSts(StatusCode.BOX_ID_UPDATE_FAILED));

		return null;
	}

	/**
	 * <h2>検品処理.</h2>
	 * <pre>
	 * 検品処理をする。
	 * </pre>
	 * @param singleRowShippingInspectDto 単行出荷検品画面用DTO
	 * @return SingleRowShippingInspectDto 単行出荷検品画面用DTO
	 */
	@POST
	@Path("/inspected")
	@WorkLogStartEnd("SingleRowShippingInspect")
	public SingleRowShippingInspectDto inspected(SingleRowShippingInspectDto singleRowShippingInspectDto) throws IOException {

		// Entity変換
		final WSglRowShipInspBDtoMapper inspDataMapper = new WSglRowShipInspBDtoMapper();
		WSglRowShipInspB inspectData = inspDataMapper.mappingToEntity(singleRowShippingInspectDto.data.inspData);
		final WSglRowShipInspH searchCondition = new WSglRowShipInspHDtoMapper().mappingToEntity(singleRowShippingInspectDto.data.search);

		final long userId = searchCondition.getUserId();
		inspectData.setUserId(userId);

		// 検品処理
		ResultInspected result = singleRowShippingInspectLogic.inspected(inspectData.getWSglRowShipInspH(), inspectData, errRetSts(StatusCode.INSPECTED_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 対象データなし
		if (result.isNoData) {
			// 同一指示数の別データを検索する

			// 検索前に選択した荷材IDを退避
			long boxId = singleRowShippingInspectDto.data.inspData.getWSglRowShipInspH().getBoxId();
			// 検索前に入力したJANCDを退避
			String inputJanCd = inspectData.getInputJanCd();

			// 検品中の作業指示数を検索条件に設定
			singleRowShippingInspectDto.data.search.setWorkInstNum(inspectData.getWSglRowShipInspH().getWorkInstNum());

			selectInspectionData(singleRowShippingInspectDto);
			if (0 < getErrorManager().size()) {

				singleRowShippingInspectDto.data.noNextData = true;
				singleRowShippingInspectDto.data.isInspectedSlip = false;
				return singleRowShippingInspectDto;
			}

			if (singleRowShippingInspectDto.data.inspData.getWSglRowShipInspH().getBoxId() == null) {
				// 検索後のデータが荷材ID未設定

				// 荷材ID設定
				singleRowShippingInspectDto.data.inspData.getWSglRowShipInspH().setBoxId(boxId);
				updateBoxId(singleRowShippingInspectDto);
				if (0 < getErrorManager().size()) {
					return null;
				}
			}

			inspectData = inspDataMapper.mappingToEntity(singleRowShippingInspectDto.data.inspData);
			inspectData.setUserId(userId);
			inspectData.setInputJanCd(inputJanCd);

			// 検品処理
			result = singleRowShippingInspectLogic.inspected(inspectData.getWSglRowShipInspH(), inspectData, errRetSts(StatusCode.INSPECTED_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (result.isNoData) {
				// 新しいデータも更新された ⇒ エラー

				getErrorManager().add(errRetSts(StatusCode.INSPECTED_FAILED), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				singleRowShippingInspectDto.data.noNextData = true;
				singleRowShippingInspectDto.data.isInspectedSlip = false;
				return singleRowShippingInspectDto;
			}
		}

		if (!CU.isNullOrEmpty(result.pickingWorkMessage)) {
			// 出庫作業メッセージあり

			singleRowShippingInspectDto.data.pickingWorkMessage = messageLogic.getMessageNm(WmsMessageConst.PICKING_WORK_MESSAGE_INFORMATION, result.pickingWorkMessage, result.pickingWorkNo);
		}

		if (result.failedPrint) {
			// 帳票発行エラー

			// 警告を表示
			String printErrorMessage = messageLogic.getMessageNm(result.failedPrintMessageCd, result.failedPrintPrintReplaceStrings);
			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.PROCESS_COMPLETE_FAILED_PRINT_WARN, printErrorMessage);
		}

		if (result.isInspectedSlip) {
			// 1伝票の検品完了

			// ユーザCD
			setWorkLogUserCd(searchCondition.getUserCd());
			//トレース項目
			setWorkLogTraceItem(result.pickingWorkNo);
			// 数量項目
			setWorkLogQty(inspectData.getWSglRowShipInspH().getWorkInstNum());
		} else {

			// 作業ログの登録をスキップ
			skipWorkLogEnd();
		}

		// 1伝票の検品完了を設定
		singleRowShippingInspectDto.data.isInspectedSlip = result.isInspectedSlip;

		if (result.remainSlipNum < 1) {
			// 検品完了

			singleRowShippingInspectDto.data.noNextData = true;

			// 完了メッセージ表示
			if (getWarnManager().size() == 0) {
				getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
			}
			return singleRowShippingInspectDto;
		}

		// 次の検品対象データを取得
		WSglRowShipInspB nextInspectData = singleRowShippingInspectLogic.selectNextData(inspectData.getSglRowShipInspHId(), userId, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		if (nextInspectData == null) {
			// 他の人が検品中

			singleRowShippingInspectDto.data.noNextData = true;

			// 完了メッセージ表示
			if (getWarnManager().size() == 0) {
				getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
			}
			return singleRowShippingInspectDto;
		}

		// 画面用Dtoに検品データを設定
		setInspectDataToReturnDto(singleRowShippingInspectDto, searchCondition, nextInspectData, ProcessType.INSPECTED, errRetSts(StatusCode.INSPECTED_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		singleRowShippingInspectDto.data.noNextData = false;
		return singleRowShippingInspectDto;
	}
}

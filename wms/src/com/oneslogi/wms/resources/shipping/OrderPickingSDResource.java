package com.oneslogi.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.customize.SqlOrderPickingDataListDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlOrderPickingDataListDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlOrderPickingDataList;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.report.OrderPickingListDto;
import com.oneslogi.wms.dto.shipping.OrderPickingSDDto;
import com.oneslogi.wms.logic.shipping.OrderPickingCheckLogic;
import com.oneslogi.wms.logic.shipping.OrderPickingSelectLogic;
import com.oneslogi.wms.logic.shipping.OrderPickingUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * オーダーピッキング画面（スマートデバイス用）のリソースクラス。
 */
@Path("/shipping/orderPickingSD")
public class OrderPickingSDResource extends AbstractWmsResource {

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
		 * ピッキングデータ取得異常
		 */
		protected static final int PICKING_DATA_SELECT_FAILED = 2;
		/**
		 * ピッキングデータ自動振り分け異常
		 */
		protected static final int AUTO_SORT_PICKING_FAILED = 3;
		/**
		 * チェック異常
		 */
		protected static final int CHECK_FAILED = 4;
		/**
		 * ステータス更新異常
		 */
		protected static final int UPDATE_STATUS_FAILED = 5;
		/**
		 * 出庫フラグの更新異常
		 */
		protected static final int UPDATE_PICKING_FLG_FAILED = 6;
		/**
		 * ピッキング解除異常
		 */
		protected static final int PICKING_CLEAR_FAILED = 7;
	}

	// ===== 使用ロジッククラス =====

	@Inject
	private OrderPickingSelectLogic selectLogic;
	@Inject
	private OrderPickingCheckLogic checkLogic;
	@Inject
	private OrderPickingUpdateLogic updateLogic;

	// ===== enum =====

	/** 自動振分処理区分 */
	private enum AutoSortMode {
		/** チェックのみ */
		CHECK,
		/** 処理実行 */
		EXECUTE
	}

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/init")
	public OrderPickingSDDto init() {

		// 画面用DTO作成
		OrderPickingSDDto orderPickingSDDto = new OrderPickingSDDto();

		return orderPickingSDDto;
	}

	/**
	 * <h2>指示一覧の検索。</h2>
	 * <pre>
	 * ・データベースにオーダーピッキングリスト発行データ(指示一覧)を取得する
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/search")
	public OrderPickingSDDto search(OrderPickingSDDto orderPickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(orderPickingSDDto.data.head);

		// ===== 検索条件作成 =====

		OrderPickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキングリスト指示一覧データ取得 =====

		List<OrderPickingListDto> pickingDataList = selectLogic.selectPickingHeadDataList(searchCondition, orderPickingSDDto.paging, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 検索結果の設定 =====

		orderPickingSDDto.data.headList = pickingDataList;

		return orderPickingSDDto;
	}

	/**
	 * <h2>指示明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにオーダーピッキングリスト発行データ(指示明細一覧)を取得する
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/searchDetail")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("OrderPickingSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public OrderPickingSDDto searchDetail(OrderPickingSDDto orderPickingSDDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// ===== ピッキングリスト明細一覧データ取得 =====

		List<SqlOrderPickingDataList> pickingDataList = searchCommon(orderPickingSDDto);
		if (pickingDataList == null) {
			return null;
		}

		setWorkLogTraceItem(orderPickingSDDto.data.head.getPickingWorkNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ===== 検索結果の設定 =====

		// [#1942] ページング不正を修正 2017.06.20 kawana Start
		orderPickingSDDto.data.list = new SqlOrderPickingDataListDtoMapper().mappingToDtoList(pickingDataList);
		// [#1942] ページング不正を修正 2017.06.20 kawana End

		return orderPickingSDDto;
	}

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	/**
	 * <h2>指示明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにオーダーピッキングリスト発行データ(指示明細一覧)を取得する
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/reSearchDetail")
	public OrderPickingSDDto reSearchDetail(OrderPickingSDDto orderPickingSDDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// ===== ピッキングリスト明細一覧データ取得 =====

		List<SqlOrderPickingDataList> pickingDataList = searchCommon(orderPickingSDDto);
		if (pickingDataList == null) {
			return null;
		}
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [Ver3.1][#5487] SDピッキングからピッキングする際同一梱包No.のデータが複数ある場合各内訳、商品単位を取得する 2018.11.05 matsumoto Start
		if (orderPickingSDDto.data.isAutoFlg) {
			// 自動ピッキングの場合

			SqlOrderPickingDataList orderPickingListDetailList = pickingDataList.get(0);

			final long centerId = orderPickingListDetailList.getCenterId();
			final long clientId = orderPickingListDetailList.getClientId();
			final String shippingPackingNo = orderPickingListDetailList.getShippingPackingNo();
			final long stockId = orderPickingListDetailList.getStockId();

			// 1件目の明細データを設定
			SqlOrderPickingDataList selectData = selectLogic.selectPickingDataDetail(centerId, clientId, shippingPackingNo, stockId, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 検索結果の設定 =====
			pickingDataList.remove(0);
			pickingDataList.add(0, selectData);
		}
		// [Ver3.1][#5487] SDピッキングからピッキングする際同一梱包No.のデータが複数ある場合各内訳、商品単位を取得する 2018.11.05 matsumoto End

		// [#1942] ページング不正を修正 2017.06.20 kawana Start
		orderPickingSDDto.data.list = new SqlOrderPickingDataListDtoMapper().mappingToDtoList(pickingDataList);
		// [#1942] ページング不正を修正 2017.06.20 kawana End

		return orderPickingSDDto;
	}

	/**
	 * <h2>ピッキングリスト明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにオーダーピッキングリスト発行データ(指示明細一覧)を取得する
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return pickingDataList ピッキングリスト明細一覧
	 */
	public List<SqlOrderPickingDataList> searchCommon(OrderPickingSDDto orderPickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(orderPickingSDDto.data.head);

		// ===== 検索条件作成 =====

		OrderPickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキングリスト明細一覧データ取得 =====

		List<SqlOrderPickingDataList> pickingDataList = selectLogic.selectPickingDataList(searchCondition, orderPickingSDDto.paging, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		} else {
			return pickingDataList;
		}
	}
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * 検索条件の生成
	 */
	private OrderPickingSelectLogic.SelectCondition createSearchCondition(TPickingH head, ErrorStatus errSts) {

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();

		OrderPickingSelectLogic.SelectCondition condition = new OrderPickingSelectLogic.SelectCondition(centerId);

		// 荷主ID
		condition.setClientId(clientId);

		// 作業日/出荷日区分
		if (CU.nullToStr(head.getTakingShippingFlg()).equals("1")) {
			// 出荷日

			condition.setShippingDtFrom(head.getDtFrom());
			condition.setShippingDtTo(head.getDtTo());
		} else {
			// 作業日

			condition.setWorkDtFrom(head.getDtFrom());
			condition.setWorkDtTo(head.getDtTo());
		}

		condition.setPickingBatchNo(head.getPickingBatchNo());
		condition.setPickingWorkNoSuffix(head.getPickingWorkNo());
		condition.setShippingPackingNoSuffix(head.getShippingPackingNo());
		condition.setSupplyCustomerCdPrefix(head.chaseTAllocInstH().getSupplyCustomerCd());
		if (CU.nullToStr(head.getEmergencyFlg()).equals("1")) {
			// 全件
			condition.setEmergencyFlg("1");
		}
		condition.setStockOutFlg(head.getNoStockOutFlg());
		condition.setDeliveryCourseCdPrefix(head.getDeliveryCourseCd());
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana Start
		condition.setUpdUserCd(head.getUpdUser());
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana End
		return condition;
	}

	/**
	 * <h2>ピッキング画面から遷移前のの自動振分処理チェック。</h2>
	 * <pre>
	 * ・作業データの存在チェック
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@POST
	@Path("/checkAutoSortPicking")
	public OrderPickingSDDto checkAutoSortPicking(OrderPickingSDDto orderPickingSDDto) {

		orderPickingSDDto = autoSortPicking(orderPickingSDDto, AutoSortMode.CHECK);
		return orderPickingSDDto;
	}

	/**
	 * <h2>ピッキング画面から遷移した時の自動振り分け処理。</h2>
	 * <pre>
	 * ・データベースにオーダーピッキングリスト発行データを取得する
	 * ・梱包計算無の場合
	 *   出庫作業No.の存在チェック
	 *   梱包ヘッダ.梱包ステータスの更新(30:ピッキング中)、出庫ヘッダ.出庫ステータスの更新(30:ピッキング中)、出荷指示ヘッダ.出荷ステータスの更新(30:ピッキング中)
	 * ・梱包計算有の場合は出荷梱包No.の存在チェック
	 *   出荷梱包No.の存在チェック
	 *   梱包ヘッダ.梱包ステータスの更新(30:ピッキング中)、出庫ヘッダ.出庫ステータスの更新(30:ピッキング中)、出荷指示ヘッダ.出荷ステータスの更新(30:ピッキング中)
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return OrderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 */
	@POST
	@Path("/autoSortPicking")
	public OrderPickingSDDto autoSortPicking(OrderPickingSDDto orderPickingSDDto) {

		orderPickingSDDto = autoSortPicking(orderPickingSDDto, AutoSortMode.EXECUTE);
		return orderPickingSDDto;
	}

	/**
	 * 自動振分データ設定処理
	 */
	private OrderPickingSDDto autoSortPicking(OrderPickingSDDto orderPickingSDDto, AutoSortMode mode) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(orderPickingSDDto.data.head);

		// ===== 検索条件作成 =====

		OrderPickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキングリストデータ取得 =====

		List<SqlOrderPickingDataList> pickingDataList = selectLogic.selectPickingDataList(searchCondition, new PagingDto.PagingData(), errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		final long centerId = searchCondition.getCenterId();
		final long clientId = searchCondition.getClientId();

		// ===== 出荷梱包No.単位にデータをまとめる =====

		Map<String, List<SqlOrderPickingDataList>> pickingDataMap = new LinkedHashMap<String, List<SqlOrderPickingDataList>>();
		for (SqlOrderPickingDataList dto : pickingDataList) {

			// 出荷梱包No.をキーにする
			String key = dto.getShippingPackingNo();

			if (!pickingDataMap.containsKey(key)) {
				List<SqlOrderPickingDataList> dtoList = new ArrayList<SqlOrderPickingDataList>();
				dtoList.add(dto);
				pickingDataMap.put(key, dtoList);
			} else {
				pickingDataMap.get(key).add(dto);
			}
		}

		// ===== 対象のデータ(エラーチェックが正常のデータ)を決定 =====

		String targetShippingPackingNo = null;
		List<SqlOrderPickingDataList> targetDataList = null;
		for (Map.Entry<String, List<SqlOrderPickingDataList>> entry : pickingDataMap.entrySet()) {
			String shippingPackingNo = entry.getKey();

			// データチェック
			boolean noError = checkLogic.checkPickingStart(centerId, clientId, shippingPackingNo);
			if (noError) {
				// エラー無、今回の対象とする
				targetShippingPackingNo = shippingPackingNo;
				targetDataList = entry.getValue();
				break;
			}
		}

		if (targetShippingPackingNo == null) {
			// 対象なし
			getErrorManager().add(errRetSts(StatusCode.AUTO_SORT_PICKING_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		if (mode == AutoSortMode.EXECUTE) {

			// ===== 対象データのステータスの更新 =====

			// ピッキング開始へステータス更新
			updateLogic.updatePickingStart(centerId, clientId, targetShippingPackingNo, errRetSts(StatusCode.UPDATE_STATUS_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// [#1942] ページング不正を修正 2017.06.26 kawana Start

			// ===== 1件目明細データの取得 =====

			// 最初の1件目は明細データを設定
			SqlOrderPickingDataList detailData = selectLogic.selectPickingDataDetail(centerId, clientId, targetShippingPackingNo, targetDataList.get(0).getStockId(),
					errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}
			targetDataList.remove(0);
			targetDataList.add(0, detailData);

			// [#1942] ページング不正を修正 2017.06.26 kawana End
		}

		// ===== 返信用データの設定 =====

		// [#1942] ページング不正を修正 2017.06.20 kawana Start
		orderPickingSDDto.data.list = new SqlOrderPickingDataListDtoMapper().mappingToDtoList(targetDataList);
		orderPickingSDDto.paging.allRecordCount = targetDataList.size();
		orderPickingSDDto.paging.allPageCount = 1;
		orderPickingSDDto.paging.isExistPrePage = false;
		orderPickingSDDto.paging.isExistNextPage = false;
		// [#1942] ページング不正を修正 2017.06.20 kawana End
		orderPickingSDDto.data.head.setPickingBatchNo(targetDataList.get(0).getPickingBatchNo());
		orderPickingSDDto.data.head.setPickingWorkNo(targetDataList.get(0).getPickingWorkNo());
		orderPickingSDDto.data.head.setShippingPackingNo(targetShippingPackingNo);

		return orderPickingSDDto;
	}

	/**
	 * <h2>オーダーピッキング開始。</h2>
	 * <pre>
	 * データのチェックを行いエラーがない場合は、ステータスをピッキング中に更新する
	 *
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/startOrderPicking")
	public OrderPickingSDDto startOrderPicking(OrderPickingSDDto orderPickingSDDto) {

		// オーダーピッキングリスト発行データ取得
		List<SqlOrderPickingDataListDto> orderPickingListDto = orderPickingSDDto.data.list;
		SqlOrderPickingDataListDto orderPickingListDetailDto = orderPickingListDto.get(0);

		final long centerId = orderPickingListDetailDto.getCenterId();
		final long clientId = orderPickingListDetailDto.getClientId();
		final String shippingPackingNo = orderPickingListDetailDto.getShippingPackingNo();
		final long stockId = orderPickingListDetailDto.getStockId();

		// 出荷梱包No.関連チェック
		if (!checkLogic.checkPickingStart(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ピッキング開始へステータス更新
		updateLogic.updatePickingStart(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.UPDATE_STATUS_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ピッキングデータ再取得(対象1件のみ)
		SqlOrderPickingDataList selectData = selectLogic.selectPickingDataDetail(centerId, clientId, shippingPackingNo, stockId, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#1942] ページング不正を修正 2017.06.20 kawana Start

		// 返信用DTO作成

		OrderPickingSDDto resultDto = new OrderPickingSDDto();
		resultDto.data.list = new ArrayList<SqlOrderPickingDataListDto>();
		resultDto.data.list.add(new SqlOrderPickingDataListDtoMapper().mappingToDto(selectData));

		// [#1942] ページング不正を修正 2017.06.20 kawana End

		return resultDto;
	}

	/**
	 * <h2>出荷梱包No.の存在チェック。</h2>
	 * <pre>
	 * 出荷梱包No.の存在チェックを行う。
	 *
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/checkExistShippingPackingNo")
	public StatusDto checkExistShippingPackingNo(OrderPickingSDDto orderPickingSDDto) {

		// オーダーピッキングリスト発行データ取得
		List<SqlOrderPickingDataListDto> orderPickingListDto = orderPickingSDDto.data.list;
		SqlOrderPickingDataListDto orderPickingListDetailDto = orderPickingListDto.get(0);

		final long centerId = orderPickingListDetailDto.getCenterId();
		final long clientId = orderPickingListDetailDto.getClientId();

		final String shippingPackingNo = orderPickingListDetailDto.getShippingPackingNo();

		// 出荷梱包No.存在チェック
		if (!checkLogic.checkExistShippingPackingNo(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}

		return null;
	}

	/**
	 * <h2>ピッキング完了処理。</h2>
	 * <pre>
	 * 次の処理を実行する。
	 * ・梱包ボディ.出庫フラグの更新(1:出庫済)
	 * ・各種ステータスの更新
	 * ・検品ラベルの自動発行
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 * @throws Exception
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogMergeEnd("OrderPickingSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(OrderPickingSDDto orderPickingSDDto) throws Exception {

		// オーダーピッキングリスト発行データ取得
		List<SqlOrderPickingDataListDto> orderPickingListDto = orderPickingSDDto.data.list;
		SqlOrderPickingDataListDto orderPickingListDetailDto = orderPickingListDto.get(0);

		final long centerId = orderPickingListDetailDto.getCenterId();
		final long clientId = orderPickingListDetailDto.getClientId();
		final String shippingPackingNo = orderPickingListDetailDto.getShippingPackingNo();
		final long stockId = orderPickingListDetailDto.getStockId();

		// 出荷梱包No.による出庫フラグ、ステータスの更新
		updateLogic.updatePickingFlg(centerId, clientId, shippingPackingNo, stockId, errRetSts(StatusCode.UPDATE_PICKING_FLG_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 画面に入庫数の合計
		BigDecimal PickingNumSumUsedByLog = WCC.ZERO;
		for (SqlOrderPickingDataListDto body : orderPickingListDto) {
			PickingNumSumUsedByLog = (WCC.add(CU.nullToZero(PickingNumSumUsedByLog), body.getPickingNum()));
		}
		// 総数量
		setWorkLogQty(PickingNumSumUsedByLog);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}

	/**
	 * <h2>ピッキング解除チェック処理。</h2>
	 * <pre>
	 * ピッキング解除可能かをチェックし、可能であれば確認メッセージを設定する
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/checkPickingClear")
	public StatusDto checkPickingClear(OrderPickingSDDto orderPickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(orderPickingSDDto.data.head);

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();

		// 出荷梱包No.
		final String shippingPackingNo = head.getShippingPackingNo();

		// ===== ピッキング解除チェック =====

		if (!checkLogic.checkPickingCancel(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 確認メッセージ設定 =====

		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>ピッキング解除処理。</h2>
	 * <pre>
	 * ピッキング解除可能かをチェックし、可能であれば次の処理を行う。
	 * ・梱包ボディ.出庫フラグの更新(0:未出庫)
	 * ・各種ステータスの更新
	 * </pre>
	 * @param orderPickingSDDto オーダーピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/pickingClear")
	public StatusDto pickingClear(OrderPickingSDDto orderPickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(orderPickingSDDto.data.head);

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();

		// 出荷梱包No.
		final String shippingPackingNo = head.getShippingPackingNo();

		// ===== ピッキング解除チェック =====

		if (!checkLogic.checkPickingCancel(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキング解除 =====

		updateLogic.clearPickingFlg(centerId, clientId, shippingPackingNo, errRetSts(StatusCode.PICKING_CLEAR_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージ設定 =====

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return null;
	}
}

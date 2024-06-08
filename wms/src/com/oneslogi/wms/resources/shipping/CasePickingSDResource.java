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

import com.oneslogi.base.dbflute.dto.customize.SqlCasePickingDataListDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlCasePickingDataListDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlCasePickingNoListDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingNoList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.shipping.CasePickingSDDto;
import com.oneslogi.wms.logic.shipping.CasePickingCheckLogic;
import com.oneslogi.wms.logic.shipping.CasePickingSelectLogic;
import com.oneslogi.wms.logic.shipping.CasePickingUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ケースピッキング画面（スマートデバイス用）のリソースクラス。
 */
@Path("/shipping/casePickingSD")
public class CasePickingSDResource extends AbstractWmsResource {

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
		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start
		/**
		 * ケースピッキングNo.設定異常
		 */
		protected static final int UPDATE_CASE_PICKING_NO_FAILED = 8;
		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End
	}

	// ===== 使用ロジッククラス =====

	@Inject
	private CasePickingSelectLogic selectLogic;
	@Inject
	private CasePickingCheckLogic checkLogic;
	@Inject
	private CasePickingUpdateLogic updateLogic;

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
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/init")
	public CasePickingSDDto init() {

		// 画面用DTO作成
		CasePickingSDDto casePickingSDDto = new CasePickingSDDto();

		return casePickingSDDto;
	}

	/**
	 * <h2>指示一覧の検索。</h2>
	 * <pre>
	 * ・データベースにケースピッキングリスト発行データを取得する
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/search")
	public CasePickingSDDto search(CasePickingSDDto casePickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(casePickingSDDto.data.head);

		// ===== 検索条件作成 =====

		CasePickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start

		// ===== ケースピッキングNo.設定 =====

		updateLogic.updateAllCasePickingNo(searchCondition, errRetSts(StatusCode.UPDATE_CASE_PICKING_NO_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End

		// ===== ピッキングリスト指示一覧データ取得 =====

		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana Start
		List<SqlCasePickingNoList> pickingDataList = selectLogic.selectPickingHeadDataList(searchCondition, casePickingSDDto.paging, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 検索結果の設定 =====

		casePickingSDDto.data.headList = new SqlCasePickingNoListDtoMapper().mappingToDtoList(pickingDataList);
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

		return casePickingSDDto;
	}

	/**
	 * <h2>指示明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにケースピッキングリスト発行データを取得する
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/searchDetail")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("CasePickingSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public CasePickingSDDto searchDetail(CasePickingSDDto casePickingSDDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// ===== ピッキングリスト明細一覧データ取得 =====

		List<SqlCasePickingDataList> pickingDataList = searchCommon(casePickingSDDto);
		if (pickingDataList == null) {
			return null;
		}

		setWorkLogTraceItem(casePickingSDDto.data.head.getCasePickingNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ===== 検索結果の設定 =====

		casePickingSDDto.data.list = new SqlCasePickingDataListDtoMapper().mappingToDtoList(pickingDataList);
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

		return casePickingSDDto;
	}

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	/**
	 * <h2>指示明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにケースピッキングリスト発行データを取得する
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@GET
	@Path("/reSearchDetail")
	public CasePickingSDDto reSearchDetail(CasePickingSDDto casePickingSDDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// ===== ピッキングリスト明細一覧データ取得 =====

		List<SqlCasePickingDataList> pickingDataList = searchCommon(casePickingSDDto);
		if (pickingDataList == null) {
			return null;
		}
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ===== 検索結果の設定 =====

		casePickingSDDto.data.list = new SqlCasePickingDataListDtoMapper().mappingToDtoList(pickingDataList);
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

		return casePickingSDDto;
	}

	/**
	 * <h2>ピッキングリスト明細一覧の検索。</h2>
	 * <pre>
	 * ・データベースにケースピッキングリスト発行データを取得する
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return pickingDataList ピッキングリスト明細一覧
	 */
	public List<SqlCasePickingDataList> searchCommon(CasePickingSDDto casePickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(casePickingSDDto.data.head);

		// ===== 検索条件作成 =====

		CasePickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキングリスト明細一覧データ取得 =====
		List<SqlCasePickingDataList> pickingDataList = selectLogic.selectPickingDataList(searchCondition, casePickingSDDto.paging, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
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
	private CasePickingSelectLogic.SelectCondition createSearchCondition(TPickingH head, ErrorStatus errSts) {

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();

		CasePickingSelectLogic.SelectCondition condition = new CasePickingSelectLogic.SelectCondition(centerId);

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
		condition.setCasePickingNo(head.getCasePickingNo());
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
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@POST
	@Path("/checkAutoSortPicking")
	public CasePickingSDDto checkAutoSortPicking(CasePickingSDDto casePickingSDDto) {

		casePickingSDDto = autoSortPicking(casePickingSDDto, AutoSortMode.CHECK);
		return casePickingSDDto;
	}

	/**
	 * <h2>ピッキング画面から遷移した時の自動振り分け処理。</h2>
	 * <pre>
	 * ・データベースにケースピッキングリスト発行データを取得する
	 * ・ケースピッキングNo.の存在チェック
	 * ・梱包ヘッダ.梱包ステータスの更新(30:ピッキング中)
	 * ・
	 *   出庫ヘッダ.出庫ステータスの更新(30:ピッキング中)、出荷指示ヘッダ.出荷ステータスの更新(30:ピッキング中)
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return CasePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 */
	@POST
	@Path("/autoSortPicking")
	public CasePickingSDDto autoSortPicking(CasePickingSDDto casePickingSDDto) {

		casePickingSDDto = autoSortPicking(casePickingSDDto, AutoSortMode.EXECUTE);
		return casePickingSDDto;
	}

	/**
	 * 自動振分データ設定処理
	 */
	private CasePickingSDDto autoSortPicking(CasePickingSDDto casePickingSDDto, AutoSortMode mode) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(casePickingSDDto.data.head);

		// ===== 検索条件作成 =====

		CasePickingSelectLogic.SelectCondition searchCondition = createSearchCondition(head, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start

		// ===== ケースピッキングNo.設定 =====

		updateLogic.updateAllCasePickingNo(searchCondition, errRetSts(StatusCode.UPDATE_CASE_PICKING_NO_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End

		// ===== ピッキングリストデータ取得 =====

		List<SqlCasePickingDataList> pickingDataList = selectLogic.selectPickingDataList(searchCondition, new PagingData(), errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ケースピッキングNo.単位にデータをまとめる =====

		Map<String, List<SqlCasePickingDataList>> casePickingNoMap = new LinkedHashMap<String, List<SqlCasePickingDataList>>();
		for (SqlCasePickingDataList dto : pickingDataList) {
			String casePickingNo = dto.getCasePickingNo();

			if (!casePickingNoMap.containsKey(casePickingNo)) {
				List<SqlCasePickingDataList> dtoList = new ArrayList<SqlCasePickingDataList>();
				dtoList.add(dto);
				casePickingNoMap.put(casePickingNo, dtoList);
			} else {
				casePickingNoMap.get(casePickingNo).add(dto);
			}
		}

		// ===== 対象のデータ(エラーチェックが正常のデータ)を決定 =====

		final long centerId = searchCondition.getCenterId();
		final long clientId = searchCondition.getClientId();

		String targetCasePickingNo = null;
		List<SqlCasePickingDataList> targetDataList = null;
		for (Map.Entry<String, List<SqlCasePickingDataList>> entry : casePickingNoMap.entrySet()) {
			String casePickingNo = entry.getKey();

			// ケースピッキングNo.のデータチェック
			boolean noError = checkLogic.checkCasePickingStart(centerId, clientId, casePickingNo);
			if (noError) {
				// エラー無、今回の対象とする
				targetCasePickingNo = casePickingNo;
				targetDataList = entry.getValue();
				break;
			}
		}

		if (targetCasePickingNo == null) {
			// 対象なし
			getErrorManager().add(errRetSts(StatusCode.AUTO_SORT_PICKING_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		if (mode == AutoSortMode.EXECUTE) {

			// ===== 対象データのステータスの更新 =====

			// ピッキング開始へステータス更新
			updateLogic.updatePickingStart(centerId, clientId, targetCasePickingNo, errRetSts(StatusCode.UPDATE_STATUS_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// [#1942] ページング不正を修正 2017.06.26 kawana Start

			// ===== 1件目明細データの取得 =====

			// 最初の1件目は明細データを設定
			SqlCasePickingDataList detailData = selectLogic.selectPickingDataDetail(centerId, clientId, targetCasePickingNo, targetDataList.get(0).getStockId(),
					errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}
			targetDataList.remove(0);
			targetDataList.add(0, detailData);

			// [#1942] ページング不正を修正 2017.06.26 kawana End
		}

		// ===== 返信用データの設定 =====

		casePickingSDDto.data.head.setCasePickingNo(targetCasePickingNo);
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana Start
		casePickingSDDto.data.list = new SqlCasePickingDataListDtoMapper().mappingToDtoList(targetDataList);
		casePickingSDDto.paging.allRecordCount = targetDataList.size();
		casePickingSDDto.paging.allPageCount = 1;
		casePickingSDDto.paging.isExistPrePage = false;
		casePickingSDDto.paging.isExistNextPage = false;
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

		return casePickingSDDto;
	}

	/**
	 * <h2>ケースピッキング開始。</h2>
	 * <pre>
	 * 次のチェックを行いエラーがない場合は、ステータスをピッキング中に更新する
	 * ・ケースピッキングNo.の存在チェック
	 *
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/startCasePicking")
	public CasePickingSDDto startCasePicking(CasePickingSDDto casePickingSDDto) {

		// ケースピッキングリスト発行データ取得
		List<SqlCasePickingDataListDto> casePickingListDto = casePickingSDDto.data.list;
		SqlCasePickingDataListDto casePickingListDetailDto = casePickingListDto.get(0);

		final long centerId = casePickingListDetailDto.getCenterId();
		final long clientId = casePickingListDetailDto.getClientId();
		// ケースピッキングNo.
		final String casePickingNo = casePickingListDetailDto.getCasePickingNo();
		final long stockId = casePickingListDetailDto.getStockId();

		// ケースピッキングNoの関連チェック
		if (!checkLogic.checkCasePickingStart(centerId, clientId, casePickingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ピッキング開始へステータス更新
		updateLogic.updatePickingStart(centerId, clientId, casePickingNo, errRetSts(StatusCode.UPDATE_STATUS_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ピッキングデータ再取得(対象1件のみ)
		SqlCasePickingDataList selectData = selectLogic.selectPickingDataDetail(centerId, clientId, casePickingNo, stockId, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana Start

		// 返信用DTO作成

		CasePickingSDDto resultDto = new CasePickingSDDto();
		resultDto.data.list = new ArrayList<SqlCasePickingDataListDto>();
		resultDto.data.list.add(new SqlCasePickingDataListDtoMapper().mappingToDto(selectData));

		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

		return resultDto;
	}

	/**
	 * <h2>ケースピッキングNo.の存在チェック。</h2>
	 * <pre>
	 * ・ケースピッキングNo.の存在チェック
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/checkExistCasePickingNo")
	public StatusDto checkExistCasePickingNo(CasePickingSDDto casePickingSDDto) {

		// ケースピッキングリスト発行データ取得
		List<SqlCasePickingDataListDto> casePickingListDto = casePickingSDDto.data.list;
		SqlCasePickingDataListDto casePickingListDetailDto = casePickingListDto.get(0);

		final long centerId = casePickingListDetailDto.getCenterId();
		final long clientId = casePickingListDetailDto.getClientId();
		// ケースピッキングNo.
		final String casePickingNo = casePickingListDetailDto.getCasePickingNo();

		// ケースピッキングNo.存在チェック
		if (!checkLogic.checkExistCasePickingNo(centerId, clientId, casePickingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}

		return null;
	}

	/**
	 * <h2>ステータス更新処理。</h2>
	 * <pre>
	 * ・ケースピッキングNo.の存在チェック
	 * ・梱包ボディ.出庫/検品フラグの更新
	 *   出庫フラグの更新(1:出庫済)、検品フラグの更新(1:検品済)
	 * ・全てピッキング済の場合は、梱包/出庫/出荷ステータスの更新
	 *   梱包ヘッダ.梱包ステータスの更新(50:出荷検品済)、出庫ヘッダ.出庫ステータスの更新(50:出荷検品済)、出荷指示ヘッダ.出荷ステータスの更新(50:出荷検品済)
	 * ・一部ピッキング済の場合は、各種ステータスの更新
	 *   梱包ヘッダ.梱包ステータスの更新(50:出荷検品済)、出庫ヘッダ.出庫ステータスの更新(40:出荷検品中)、出荷指示ヘッダ.出荷ステータスの更新(40:出荷検品中)
	 * ・荷札の自動発行
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogMergeEnd("CasePickingSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(CasePickingSDDto casePickingSDDto) {

		// ケースピッキングリスト発行データ取得
		List<SqlCasePickingDataListDto> casePickingListDto = casePickingSDDto.data.list;
		SqlCasePickingDataListDto casePickingListDetailDto = casePickingListDto.get(0);

		final long centerId = casePickingListDetailDto.getCenterId();
		final long clientId = casePickingListDetailDto.getClientId();
		// ケースピッキングNo.
		final String casePickingNo = casePickingListDetailDto.getCasePickingNo();
		final long stockId = casePickingListDetailDto.getStockId();

		// ケースピッキングNo.存在チェック
		if (!checkLogic.checkExistCasePickingNo(centerId, clientId, casePickingNo, errRetSts(StatusCode.UPDATE_PICKING_FLG_FAILED))) {
			return null;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 画面に入庫数の合計
		BigDecimal pickingNumSumUsedByLog = WCC.ZERO;
		for (SqlCasePickingDataListDto body : casePickingListDto) {
			pickingNumSumUsedByLog = WCC.add(pickingNumSumUsedByLog, body.getSumPickingNum());
		}
		// 総数量
		setWorkLogQty(pickingNumSumUsedByLog);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ケースピッキングNo.による出庫フラグ/検品フラグ、ステータス更新
		updateLogic.updatePickingFlg(centerId, clientId, casePickingNo, stockId, errRetSts(StatusCode.UPDATE_PICKING_FLG_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}

	/**
	 * <h2>ピッキング解除チェック処理。</h2>
	 * <pre>
	 * ピッキング解除可能かをチェックし、可能であれば確認メッセージを設定する
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/checkPickingClear")
	public StatusDto checkPickingClear(CasePickingSDDto casePickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(casePickingSDDto.data.head);

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();

		// ケースピッキングNo.
		final String casePickingNo = head.getCasePickingNo();

		// ===== ピッキング解除チェック =====

		if (!checkLogic.checkPickingCancel(centerId, clientId, casePickingNo, errRetSts(StatusCode.CHECK_FAILED))) {
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
	 * ・梱包ボディ.検品フラグの更新(0:未検品)
	 * ・各種ステータスの更新
	 * </pre>
	 * @param casePickingSDDto ケースピッキング画面用（スマートデバイス用）DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/pickingClear")
	public StatusDto pickingClear(CasePickingSDDto casePickingSDDto) {

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH head = headerMapper.mappingToEntity(casePickingSDDto.data.head);

		final long centerId = head.getCenterId();
		final long clientId = head.getClientId();
		// ケースピッキングNo.
		final String casePickingNo = head.getCasePickingNo();

		// ===== ピッキング解除チェック =====

		if (!checkLogic.checkPickingCancel(centerId, clientId, casePickingNo, errRetSts(StatusCode.CHECK_FAILED))) {
			return null;
		}
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== ピッキング・検品解除 =====

		updateLogic.clearPickingFlg(centerId, clientId, casePickingNo, errRetSts(StatusCode.PICKING_CLEAR_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return null;
	}
}

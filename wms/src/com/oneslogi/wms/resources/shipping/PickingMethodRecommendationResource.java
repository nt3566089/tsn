package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCartCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.dtomapper.TPicMthdRcmdDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdCartBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmd;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.PickingMethodRecommendationDto;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.PickingMethodRecommendationCallLogic;
import com.oneslogi.wms.logic.shipping.PickingMethodRecommendationSelectLogic;
import com.oneslogi.wms.logic.shipping.PickingNoUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ピッキング提案画面のリソースクラス。
 */
@Path("/shipping/PickingMethodRecommendation")
public class PickingMethodRecommendationResource extends AbstractWmsResource {

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
		 * ピッキング提案データ取得異常
		 */
		protected static final int SELECT_DATA_FAILED = 2;
		/**
		 * ピッキング再提案異常
		 */
		protected static final int RECOMMANDATION_FAILED = 3;
		/**
		 * ピッキングリストデータチェック異常
		 */
		protected static final int CHECK_PRINT_DATA_FAILED = 4;
		/**
		 * マルチピッキングリスト台車No設定異常
		 */
		protected static final int UPDATE_CART_NO_FAILED = 5;
		/**
		 * ピッキングリスト発行異常
		 */
		protected static final int PICKING_LIST_PRINT_FAILED = 6;
	}

	// ===== 使用テーブル =====

	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPicMthdRcmdBhv tPicMthdRcmdBhv;
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;
	@Inject
	private TPicMthdRcmdCartBhv tPicMthdRcmdCartBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private PickingMethodRecommendationCallLogic pickingMethodRecommendationCallLogic;
	@Inject
	private PickingMethodRecommendationSelectLogic selectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PickingNoUpdateLogic pickingNoUpdateLogic;
	@Inject
	private PickingListPrintSelectLogic pickingListPrintSelectLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private PickingListPrintLogic pickingListPrintLogic;

	// ===== 列挙型 =====

	/** 提案ピッキング方法 */
	private enum RcmdPickingCls {

		/** オーダーピッキング */
		ORDER_PICKING("1"),
		/** トータルピッキング＋摘み取り */
		TOTAL_PICKING_AND_PICKING("2"),
		/** トータルピッキング＋種蒔き */
		TOTAL_PICKING_AND_SEEDING("3"),
		/** マルチピッキング */
		MULTI_PICKING("4"),
		/** 単行ピッキング */
		SINGLE_ROW_PICKING("5"),
		/** ケースピッキング */
		CASE_PICKING("6");

		private static final Map<String, RcmdPickingCls> _codeValueMap = new HashMap<String, RcmdPickingCls>();
		static {
			for (RcmdPickingCls value : values()) {
				_codeValueMap.put(value.code().toLowerCase(), value);
			}
		}
		private String _code;

		private RcmdPickingCls(String code) {
			_code = code;
		}

		public String code() {
			return _code;
		}

		public static RcmdPickingCls codeOf(String code) {
			if (code == null) {
				return null;
			}
			return _codeValueMap.get(code.toLowerCase());
		}

		@Override
		public String toString() {
			return code();
		}
	}

	/**
	 * <h2>初期処理</h2>
	 * @return PickingMethodRecommendationDto ピッキング提案画面用DTO
	 */
	@GET
	@Path("/initial")
	public PickingMethodRecommendationDto initial() {
		return new PickingMethodRecommendationDto();
	}

	/**
	 * <h2>ピッキング提案データ取得</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 画面で入力されたCDを元にIDを取得し、ピッキング提案データ取得
	 * </pre>
	 * @param PickingMethodRecommendationDto ピッキング提案画面用DTO
	 * @return PickingMethodRecommendationDto ピッキング提案画面用DTO
	 */
	@GET
	@Path("/search")
	public PickingMethodRecommendationDto search(PickingMethodRecommendationDto pickingMethodRecommendationDto) {

		// Entity変換
		TPicMthdRcmd header = new TPicMthdRcmdDtoMapper().mappingToEntity(pickingMethodRecommendationDto.data.search);

		// 使用フラグチェック
		checkUseFlg(header.getCenterId(), header.getClientId(), errRetSts(StatusCode.SELECT_DATA_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 検索実行
		List<TPicMthdRcmd> selectList = selectLogic.select(header, errRetSts(StatusCode.SELECT_DATA_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 検索結果をDtoに変換
		pickingMethodRecommendationDto.data.list = new TPicMthdRcmdDtoMapper().mappingToDtoList(selectList);

		return pickingMethodRecommendationDto;
	}

	/**
	 * <h2>ピッキング再提案処理前チェック。</h2>
	 * <pre>
	 * ピッキング再提案を行う前のチェック処理。
	 * </pre>
	 * @param PickingMethodRecommendationDto ピッキング提案画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkRecommendationAgain")
	public PickingMethodRecommendationDto checkRecommendationAgain(PickingMethodRecommendationDto pickingMethodRecommendationDto) {

		TPicMthdRcmd header = new TPicMthdRcmdDtoMapper().mappingToEntity(pickingMethodRecommendationDto.data.search);

		// 使用フラグチェック
		checkUseFlg(header.getCenterId(), header.getClientId(), errRetSts(StatusCode.RECOMMANDATION_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 確認メッセージの設定
		if (0 < selectLogic.selectCount(header)) {
			// 提案データあり(削除)
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PICKING_METHOD_RECOMMENDATION_CALL_WITH_DELETE_CONFIRM);
		} else {
			// 提案データなし
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PICKING_METHOD_RECOMMENDATION_CALL_CONFIRM);
		}

		return null;
	}

	/**
	 * <h2>ピッキング再提案処理。</h2>
	 * <pre>
	 * ピッキング提案APIを使用してピッキングの再提案をする。
	 *
	 * 出庫指示済の伝票を対象にピッキングの提案を行い提案結果を上書きする。
	 *
	 * </pre>
	 * @param PickingMethodRecommendationDto ピッキング提案画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws IOException
	 */
	@POST
	@Path("/recommendationAgain")
	public PickingMethodRecommendationDto recommendationAgain(PickingMethodRecommendationDto pickingMethodRecommendationDto) throws IOException {

		TPicMthdRcmd header = new TPicMthdRcmdDtoMapper().mappingToEntity(pickingMethodRecommendationDto.data.search);

		pickingMethodRecommendationCallLogic.startLog();
		pickingMethodRecommendationCallLogic.call(header.getCenterId(), header.getClientId(), errRetSts(StatusCode.RECOMMANDATION_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}
		pickingMethodRecommendationCallLogic.endSuccessLog();

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>ピッキングリスト発行処理前チェック。<h2>
	 * <pre>
	 * ピッキングリスト発行を行う前の出荷ステータス、1次ピッキングリスト出力フラグチェック処理。
	 * </pre>
	 * @param pickingMethodRecommendationDto ピッキング提案画面用DTO
	 * @return PickingMethodRecommendationDto 処理結果DTO
	 */
	@POST
	@Path("/checkBeforePrint")
	public PickingMethodRecommendationDto checkBeforePrint(PickingMethodRecommendationDto pickingMethodRecommendationDto) {

		// Entity変換
		TPicMthdRcmdDtoMapper headerMapper = new TPicMthdRcmdDtoMapper();
		List<TPicMthdRcmd> tPicMthdRcmdList = headerMapper.mappingToEntityList(pickingMethodRecommendationDto.data.list);

		if (tPicMthdRcmdList.isEmpty()) {
			return null;
		}

		final long picMthdRcmdId = tPicMthdRcmdList.get(0).getPicMthdRcmdId();

		// ピッキングリスト発行チェック
		selectLogic.checkPrint(picMthdRcmdId, errRetSts(StatusCode.CHECK_PRINT_DATA_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		return null;
	}

	/**
	 * <h2>ピッキングリスト発行。<h2>
	 * <pre>
	 * ピッキングリスト発行を行う。
	 * </pre>
	 * @param pickingMethodRecommendationDto ピッキング提案画面用DTO
	 * @return PickingMethodRecommendationDto 処理結果DTO
	 */
	@POST
	@Path("/print")
	public PickingMethodRecommendationDto print(PickingMethodRecommendationDto pickingMethodRecommendationDto) throws Exception {

		// Entity変換
		TPicMthdRcmdDtoMapper headerMapper = new TPicMthdRcmdDtoMapper();
		List<TPicMthdRcmd> tPicMthdRcmdList = headerMapper.mappingToEntityList(pickingMethodRecommendationDto.data.list);

		if (tPicMthdRcmdList.isEmpty()) {
			return null;
		}

		final String reportCd = pickingMethodRecommendationDto.data.reportCd;

		// 帳票が2次ピッキングリストか
		boolean is2ndList = is2ndList(reportCd);

		final TPicMthdRcmd tPicMthdRcmd = tPicMthdRcmdList.get(0);
		final long picMthdRcmdId = tPicMthdRcmd.getPicMthdRcmdId();

		if (!is2ndList) {
			// 1次ピッキングリスト または ケースピッキングリストの場合

			// ピッキングリスト発行チェック
			selectLogic.checkPrint(picMthdRcmdId, errRetSts(StatusCode.CHECK_PRINT_DATA_FAILED));
			if (0 < getErrorManager().size()) {

				return null;
			}
		}

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====

		RcmdPickingCls rcmdPickingCls = RcmdPickingCls.codeOf(tPicMthdRcmd.getRcmdPickingCls());

		List<TPicMthdRcmdData> picMthdRcmdDataList = selectLogic.selectTPicMthdRcmdData(picMthdRcmdId, errRetSts(StatusCode.SELECT_DATA_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		List<Long> pickingHIdList = new ArrayList<>();

		for (TPicMthdRcmdData tPicMthdRcmdData : picMthdRcmdDataList) {
			long pickingHId = tPicMthdRcmdData.getPickingHId();
			pickingHIdList.add(pickingHId);
		}

		// ===== 出庫帳票の更新(コントロールNo.設定) =====

		TPickingR tPickingRControlNo = new TPickingR(); //出庫帳票(更新用)
		tPickingRControlNo.setControlNo(controlNo);

		TPickingRCB tPickingRCB = tPickingRBhv.newMyConditionBean();
		tPickingRCB.query().setPickingHId_InScope(pickingHIdList);
		tPickingRBhv.queryUpdate(tPickingRControlNo, tPickingRCB);

		// ===== 帳票の発行 =====

		if (rcmdPickingCls == RcmdPickingCls.MULTI_PICKING && !is2ndList) {
			// マルチピッキングリスト発行

			// ピッキング提案台車に従って台車No.を設定
			pickingNoUpdateLogic.updateNoRecommendedMultiPickingList(picMthdRcmdId, errRetSts(StatusCode.UPDATE_CART_NO_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		PickingListPrintLogic.PickingListCls printCls = PickingListPrintLogic.PickingListCls.reportCdOf(reportCd);

		MClientCenter mcc = new MClientCenter();
		mcc.setCenterId(tPicMthdRcmd.getCenterId());
		mcc.setClientId(tPicMthdRcmd.getClientId());
		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);

		// ピッキングリスト発行
		pickingListPrintLogic.print(tPickingRControlNo, printCls, pickingMethodRecommendationDto, mParam, errRetSts(StatusCode.PICKING_LIST_PRINT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		//発行済のピッキング提案テーブルを物理削除する

		if (doDeletePicMthdRcmd(rcmdPickingCls, is2ndList, mParam)) {

			//ピッキング提案カート削除
			TPicMthdRcmdCartCB cartCB = tPicMthdRcmdCartBhv.newMyConditionBean();
			cartCB.query().setPicMthdRcmdId_Equal(picMthdRcmdId);
			tPicMthdRcmdCartBhv.queryDelete(cartCB);

			//ピッキング提案データ削除
			TPicMthdRcmdDataCB dataCB = tPicMthdRcmdDataBhv.newMyConditionBean();
			dataCB.query().setPicMthdRcmdId_Equal(picMthdRcmdId);
			tPicMthdRcmdDataBhv.queryDelete(dataCB);

			//ピッキング提案削除
			tPicMthdRcmdBhv.delete(tPicMthdRcmd);
		}

		// コントロールNoクリア
		pickingListPrintSelectLogic.clearControlNo(tPickingRControlNo.getControlNo());

		// 完了メッセージ表示
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingMethodRecommendationDto;
	}

	/**
	 * <h2>レポートIDを取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @param pickingListPrintDto レポートDTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/getReportId")
	public PickingMethodRecommendationDto getReportId(final PickingMethodRecommendationDto pickingMethodRecommendationDto) {

		pickingMethodRecommendationDto.data.listReportId.clear();
		pickingMethodRecommendationDto.data.listReportCd.clear();

		long clientId = pickingMethodRecommendationDto.data.list.get(0).getClientId();
		long centerId = pickingMethodRecommendationDto.data.list.get(0).getCenterId();
		MParam mParam = paramLogic.getMParam(clientId, centerId);

		RcmdPickingCls rcmdPickingCls = RcmdPickingCls.codeOf(pickingMethodRecommendationDto.data.list.get(0).getRcmdPickingCls());

		switch (rcmdPickingCls) {
		case ORDER_PICKING:
			// オーダーピッキングリスト
			pickingMethodRecommendationDto.data.listReportCd.add("OrderPickingList");
			break;
		case TOTAL_PICKING_AND_PICKING:
			// トータルピッキング＋摘み取り
			pickingMethodRecommendationDto.data.listReportCd.add("TotalPickingList");
			pickingMethodRecommendationDto.data.listReportCd.add("PLPickingList");
			break;
		case TOTAL_PICKING_AND_SEEDING:
			// トータルピッキング＋種蒔き
			pickingMethodRecommendationDto.data.listReportCd.add("TotalPickingList");
			pickingMethodRecommendationDto.data.listReportCd.add("SLPickingList");
			break;
		case MULTI_PICKING:
			// マルチピッキング
			pickingMethodRecommendationDto.data.listReportCd.add("MultiPickingList");
			if (mParam.isPicMthdRcmdMltPlOut$1()) {
				// 摘み取りリストも出力
				pickingMethodRecommendationDto.data.listReportCd.add("PLPickingList");
			}
			break;
		case SINGLE_ROW_PICKING:
			// 単行ピッキング
			pickingMethodRecommendationDto.data.listReportCd.add("SingleRowPickingList");
			if (mParam.isPicMthdRcmdSplSlOut$1()) {
				// 種蒔きリストも出力
				pickingMethodRecommendationDto.data.listReportCd.add("SLPickingList");
			}
			break;
		case CASE_PICKING:
			// ケースピッキング
			pickingMethodRecommendationDto.data.listReportCd.add("CasePickingList");
			break;
		}

		// 帳票IDを設定
		boolean isFirst = true;
		for (String reportCd : pickingMethodRecommendationDto.data.listReportCd) {

			long reportId = reportLogic.getReportId(reportCd);
			pickingMethodRecommendationDto.data.listReportId.add(reportId);

			if (isFirst) {
				pickingMethodRecommendationDto.printBasicData.reportId = reportId;
				isFirst = false;
			}
		}

		return pickingMethodRecommendationDto;
	}

	/**
	 * 2次ピッキングリストかの判定
	 */
	private boolean is2ndList(String reportCd) {

		switch (reportCd) {
		case "PLPickingList":
		case "SLPickingList":
			return true;
		}

		return false;
	}

	/**
	 * ピッキング提案テーブルの削除判定
	 */
	private boolean doDeletePicMthdRcmd(RcmdPickingCls rcmdPickingCls, boolean is2ndList, MParam mParam) {

		switch (rcmdPickingCls) {
		case ORDER_PICKING:
		case CASE_PICKING:
			return true;
		case TOTAL_PICKING_AND_PICKING:
		case TOTAL_PICKING_AND_SEEDING:
			if (is2ndList) {
				return true;
			} else {
				return false;
			}
		case MULTI_PICKING:
			if (mParam.isPicMthdRcmdMltPlOut$1()) {
				// 摘み取りリストも出力

				if (is2ndList) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		case SINGLE_ROW_PICKING:
			if (mParam.isPicMthdRcmdSplSlOut$1()) {
				// 種蒔きリストも出力

				if (is2ndList) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}

		return true;
	}

	/**
	 * ピッキング提案使用フラグチェック
	 */
	private void checkUseFlg(long centerId, long clientId, ErrorStatus errSts) {

		MParam param = paramLogic.getMParam(clientId, centerId);

		if (!param.isPicMthdRcmdFlg$1()) {
			// ピッキング提案未使用

			getErrorManager().add(errSts, WmsMessageConst.PMR_NOT_USE_ERROR);
		}
	}
}

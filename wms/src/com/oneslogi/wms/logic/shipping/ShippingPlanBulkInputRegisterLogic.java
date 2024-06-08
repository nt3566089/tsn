package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.EShippingInstCB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstSpareDtoMapper;
import com.oneslogi.base.dbflute.exbhv.EShippingInstBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TShippingInstSpare;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingPlanBulkInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputSelectLogic.SelectCls;
import com.oneslogi.wms.resources.shipping.ShippingPlanBulkInputResource.ResultSetupRegisterData;

/**
 *出荷指示登録処理ロジッククラス
 */
public class ShippingPlanBulkInputRegisterLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma start

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
		 * 処理区分マスタ存在異常
		 */
		protected static final int PROCESS_TYPE_NOT_FOUND = 4;
		/**
		 * 出荷指示データ登録異常
		 */
		protected static final int SHIPPING_PLAN_INSERT_FAILED = 8;
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 21;
		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 22;
		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End
	}

	// ===== 使用テーブル =====

	@Inject
	private EShippingInstBhv eShippingInstBhv;
	// 出荷指示ボディをバッチで全件登録方法に更新 2016.05.23 nayzaw Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// 出荷指示ボディをバッチで全件登録方法に更新 2016.05.23 nayzaw End
	@Inject
	private MLocationBhv mLocationBhv;

	// [#2253]予備項目対応 2017.08.18 sampei Start
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End


	// ===== 使用ロジッククラス =====

	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	@Inject
	private ShippingPlanBulkInputCheckStatusLogic shippingPlanBulkInputCheckStatusLogic;
	// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add Start
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
	// 取込みチェックNGの伝票セット
	Set<SlipKey> errorSlipKeySet = new HashSet<SlipKey>();
	// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add End
	@Inject
	private ShippingPlanBulkInputSelectLogic shippingPlanBulkInputSelectLogic;

	// ===== enum =====

	/** ログ書込 */
	public enum OutputLog {
		/** ログ書込有 */
		TRUE,
		/** ログ書込無 */
		FALSE,
	}

	// ===== 内部変数 =====

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 */
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod Start
	public void startLog(String receiveCd, String centerCd, String clientCd) {
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod End

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.SHIPPING_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性１設定(センタCD)
		getDatabaseLogger().setAttribute1(centerCd);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// [#169] メッセージの重複を削除 2016.12.05 kawana Start
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_INFORMATION, receiveCd, centerCd, clientCd);
		// [#169] メッセージの重複を削除 2016.12.05 kawana End
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	/**
	 * <h2>ログ追加（エラー情報）</h2>
	 * <pre>
	 * 運用ログのエラーチェック情報出力処理
	 * エラーチェック情報を運用ログに出力する
	 * </pre>
	 * @param processInfo 処理情報
	 * @param replaceValue 差し替え文字列
	 */
	public void addErrorCheckLogDtl(String processInfo, String... replaceValue) {

		if (outputLog == OutputLog.TRUE) {
			// ログ追加（エラー情報）
			shippingPlanBulkInputCheckStatusLogic.addErrorCheckLogDtl(processInfo, replaceValue);
		}
	}

	/**
	 * <h2>ログ終了(正常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endSuccessLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（正常終了)
			getDatabaseLogger().endSuccessLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>ログ終了(異常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endFailureLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（異常終了)
			getDatabaseLogger().endFailureLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>一括登録.</h2>
	 * @param eShippingInstList 一括登録
	 */
	public void batchInsertEShippingInst(List<EShippingInst> eShippingInstList) {
		eShippingInstBhv.batchInsert(eShippingInstList);
	}

	/**
	 * <h2>出荷指示登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに出荷指示データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod Start
	public StatusDto register(ShippingPlanBulkInputDto shippingPlanBulkInputDto, String centerCd, String clientCd, ErrorStatus errSts) {
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod End

		ResultSetupRegisterData resultStatus = shippingPlanBulkInputCheckStatusLogic.CheckStatus(shippingPlanBulkInputDto, errRetSts(StatusCode.SHIPPING_PLAN_INSERT_FAILED), 1);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingLogic.getControlNo();

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();

		//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応 2016.04.22 DSW Start
		List<TShippingInstBDto> shippingPlan = new ArrayList<>();
		for (int i =0; i<shippingPlanBulkInputDto.data.shippingPlan.size();i++) {
			if ("1".equals(shippingPlanBulkInputDto.data.shippingPlan.get(i).getErrorFlg())) {
				continue;
			}
			shippingPlan.add(shippingPlanBulkInputDto.data.shippingPlan.get(i));
		}

		//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応 2016.04.22 DSW End
		// 出荷指示ヘッダ
		TShippingInstH tShippingInstH = new TShippingInstH();

		// 出荷指示ボディ
		TShippingInstB tShippingInstB = new TShippingInstB();

		// 出荷指示ボディリスト(temp用)
		List<TShippingInstB> tmpListtShippingInstB = new ArrayList<TShippingInstB>();

		// 出荷指示ボディリスト(バッチ登録用)
		List<TShippingInstB> lstTShippingInstB = new ArrayList<TShippingInstB>();

		int headerCount = 0;

		// 顧客出荷指示Ｎｏ．
		String strClientShippingNo = "";
		String customerCd = "";
		String delivPlanDt = "";
		String emergencyFlg = "";
		String processTypeCd = "";

		// 結果判定
		if (getErrorManager().size() > 0) {

			// 処理中止
			return null;
		}

		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
		boolean isError = false;
		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End

		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add Start
		//受信CD
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end

		//データがマスタに存在しないかをチェックして該当データを削除する。
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
		boolean checkResult = this.checkRemoveNotExistsDataForRegister(shippingPlan, centerCd, clientCd, receiveCd);
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end

		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add Start
		if ("0".equals(shippingPlanBulkInputDto.data.head.getErrorProcessMet())) {//エラー処理方法が「0：全て取込まない」の場合
			if (resultStatus.equals(ResultSetupRegisterData.INFO_WARN) || checkResult) {//エラーありの場合
				getWarnManager().clear();
				getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				return null;
			}
		}
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add End

		for (int row = 0; row < shippingPlan.size(); row++) {
			TShippingInstBDto tShippingInstBDto = shippingPlan.get(row);

			// 出荷指示ヘッダをエンティティに変換
			TShippingInstH shippingInstH = tShippingInstHDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstH());

			// 出荷指示ボディをエンティティに変換
			TShippingInstB shippingInstB = tShippingInstBDtoMapper.mappingToEntity(tShippingInstBDto);
			//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応(不要なソースを削除) 2016.04.22 DSW
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
			String currentDelivPlanDt = "";
			if (!CU.isNullOrEmpty(shippingInstH.getDelivPlanDt())) {
				currentDelivPlanDt = shippingInstH.getDelivPlanDt();
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End

			if (!(strClientShippingNo.equals(shippingInstH.getClientShippingNo()) && customerCd.equals(shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd())
					// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
					&& delivPlanDt.equals(currentDelivPlanDt) && emergencyFlg.equals(shippingInstH.getEmergencyFlg())
					// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End
					&& processTypeCd.equals(shippingInstH.getMProcessType().getProcessTypeCd()))) {

				// 最初の行以外の場合、出荷指示登録
				if (row != 0) {

					// WMS出荷伝票Noを登録する直前に採番
					tShippingInstH.setShippingSlipNo(numberingLogic.getNumbering(tShippingInstH.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

					// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start

					// 出荷指示ヘッダ登録
					tShippingInstHBhv.insert(tShippingInstH);
					Long hId = tShippingInstH.getShippingInstHId();
					long lineNo = 1l;
					for (TShippingInstB tmpTShippingInstB : tmpListtShippingInstB) {
						tmpTShippingInstB.setShippingInstHId(hId);
						tmpTShippingInstB.setControlNo(tShippingInstH.getControlNo());
						tmpTShippingInstB.setLineNo(lineNo);
						lineNo++;

						lstTShippingInstB.add(tmpTShippingInstB);
					}
					// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

					// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
					// 出荷指示ヘッダID設定
					for (int rowId = row - tmpListtShippingInstB.size(); rowId <= row - 1; rowId++) {
						shippingPlanBulkInputDto.data.shippingPlan.get(rowId).getTShippingInstH().setShippingInstHId(tShippingInstH.getShippingInstHId());
					}
					// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

					// コントロールNoでエラーチェック対応方法に修正した為1行ずつエラーチェック処理を削除  2016.4.21 nayzaw Start

					// 結果判定
					if (getErrorManager().size() > 0) {

						// 処理中止
						return null;
					}

					tShippingInstH = new TShippingInstH();
					tmpListtShippingInstB = new ArrayList<TShippingInstB>();
				}
				tShippingInstH.setClientId(shippingInstH.getClientId());
				tShippingInstH.setCenterId(shippingInstH.getCenterId());
				tShippingInstH.setEmergencyFlg(shippingInstH.getEmergencyFlg());
				tShippingInstH.setClientShippingNo(shippingInstH.getClientShippingNo());
				tShippingInstH.setSupplyCustomerCd(shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd());
				tShippingInstH.setProcessTypeId(shippingInstH.getProcessTypeId());
				tShippingInstH.setDelivPlanDt(shippingInstH.getDelivPlanDt() == null ? "" : shippingInstH.getDelivPlanDt().replaceAll("/", ""));
				tShippingInstH.setWorkDt(shippingInstH.getWorkDt() == null ? "" : shippingInstH.getWorkDt().replaceAll("/", ""));
				tShippingInstH.setShippingDt(shippingInstH.getShippingDt() == null ? "" : shippingInstH.getShippingDt().replaceAll("/", ""));
				tShippingInstH.setDeliveryCourseCd(shippingInstH.getMDeliveryCourse().getDeliveryCourseCd());
				tShippingInstH.setDelivDt(shippingInstH.getDelivDt() == null ? "" : shippingInstH.getDelivDt().replaceAll("/", ""));
				tShippingInstH.setDelivTz(shippingInstH.getDelivTz());
				tShippingInstH.setShippingStatus(shippingInstH.getShippingStatus());
				tShippingInstH.setErrorFlg(shippingInstH.getErrorFlg());
				tShippingInstH.setInputType(shippingInstH.getInputType());
				tShippingInstH.setDelivCustomerCd(shippingInstH.getDelivCustomerCd());
				// [#458] ファイルの届先情報が登録されない不具合を修正 2016.12.14 kawana Start
				tShippingInstH.setDelivCustomerNm(shippingInstH.getDelivCustomerNm());
				tShippingInstH.setDelivZipCd(shippingInstH.getDelivZipCd());
				tShippingInstH.setDelivTelNo(shippingInstH.getDelivTelNo());
				tShippingInstH.setDelivAddress1(shippingInstH.getDelivAddress1());
				tShippingInstH.setDelivAddress2(shippingInstH.getDelivAddress2());
				tShippingInstH.setDelivAddress3(shippingInstH.getDelivAddress3());
				tShippingInstH.setDelivAddressSupply(shippingInstH.getDelivAddressSupply());
				// [#458] ファイルの届先情報が登録されない不具合を修正 2016.12.14 kawana End
				// [EC-CT1-148] 出庫作業メッセージを追加 2015.03.27 kawana Start
				tShippingInstH.setPickingWorkMessage(shippingInstH.getPickingWorkMessage());
				// [EC-CT1-148] 出庫作業メッセージを追加 2015.03.27 kawana End
				// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start
				tShippingInstH.setControlNo(controlNo);
				// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End
				headerCount++;

				tShippingInstB.setProductCd(shippingInstB.getMProduct().getProductCd());
				tShippingInstB.setDepositCd(shippingInstB.getDepositCd());
				tShippingInstB.setStockTypeCd(shippingInstB.getStockTypeCd());
				tShippingInstB.setInstNum(shippingInstB.getInstNum());
				tShippingInstB.setLot(shippingInstB.getLot());
				tShippingInstB.setLimitDt(shippingInstB.getLimitDt() == null ? "" : shippingInstB.getLimitDt().replaceAll("/", ""));
				tShippingInstB.setLocationCd(shippingInstB.getLocationCd());
				tShippingInstB.setLocationId(shippingInstB.getLocationId());
				tShippingInstB.setWarehouseId(shippingInstB.getWarehouseId());
				tShippingInstB.setWarehouseCd(shippingInstB.getWarehouseCd());

				tmpListtShippingInstB.add(tShippingInstB);

				tShippingInstB = new TShippingInstB();
			} else {
				tShippingInstB.setProductCd(shippingInstB.getMProduct().getProductCd());
				tShippingInstB.setDepositCd(shippingInstB.getDepositCd());
				tShippingInstB.setStockTypeCd(shippingInstB.getStockTypeCd());
				tShippingInstB.setInstNum(shippingInstB.getInstNum());
				tShippingInstB.setLot(shippingInstB.getLot());
				tShippingInstB.setLimitDt(shippingInstB.getLimitDt() == null ? "" : shippingInstB.getLimitDt().replaceAll("/", ""));
				tShippingInstB.setLocationCd(shippingInstB.getLocationCd());
				tShippingInstB.setLocationId(shippingInstB.getLocationId());
				tShippingInstB.setWarehouseId(shippingInstB.getWarehouseId());
				tShippingInstB.setWarehouseCd(shippingInstB.getWarehouseCd());

				tmpListtShippingInstB.add(tShippingInstB);

				tShippingInstB = new TShippingInstB();
			}

			strClientShippingNo = shippingInstH.getClientShippingNo();
			customerCd = shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd();
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
			delivPlanDt = currentDelivPlanDt;
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End
			emergencyFlg = shippingInstH.getEmergencyFlg();
			processTypeCd = shippingInstH.getMProcessType().getProcessTypeCd();
			//			// 最終行の場合、出荷指示登録
			if (row == shippingPlan.size() - 1) {
				// WMS出荷伝票Noを登録する直前に採番
				tShippingInstH.setShippingSlipNo(numberingLogic.getNumbering(tShippingInstH.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

				// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start
				// 出荷指示ヘッダ登録
				tShippingInstHBhv.insert(tShippingInstH);
				Long hId = tShippingInstH.getShippingInstHId();
				long lineNo = 1l;
				for (TShippingInstB tmpTShippingInstB : tmpListtShippingInstB) {
					tmpTShippingInstB.setShippingInstHId(hId);
					tmpTShippingInstB.setControlNo(tShippingInstH.getControlNo());
					tmpTShippingInstB.setLineNo(lineNo);
					lineNo++;

					lstTShippingInstB.add(tmpTShippingInstB);
				}
				// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

				// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
				// 出荷指示ヘッダID設定
				for (int rowId = row - tmpListtShippingInstB.size() + 1; rowId <= row; rowId++) {
					shippingPlanBulkInputDto.data.shippingPlan.get(rowId).getTShippingInstH().setShippingInstHId(tShippingInstH.getShippingInstHId());
				}
			}
		}
		// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start
		// 出荷指示ボディ登録
		tShippingInstBBhv.batchInsert(lstTShippingInstB);
		// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start

		// エラーチェック処理呼び出す
		boolean rowError = shippingInstErrorCheckLogic.check(controlNo, null, errRetSts(StatusCode.SHIPPING_PLAN_INSERT_FAILED));

		if (rowError) {
			isError = true;
		}

		Long oldControlNo = controlNo;
		controlNo = null;
		// 出荷指示ヘッダのコントロールNoクリア
		int headerUpdateCount = updateControlNoLogic.updateTShippingInstHeader(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// 出荷指示ボディのコントロールNoクリア
		int bodyUpdateCount = updateControlNoLogic.updateTShippingInstBody(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (headerUpdateCount != headerCount || bodyUpdateCount != shippingPlan.size()) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End

		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Add Start
		EShippingInstCB esicb = new EShippingInstCB();
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
		esicb.query().setReceiveCd_Equal(shippingPlanBulkInputDto.data.receiveCd);
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end
		List<EShippingInst> dataList = eShippingInstBhv.selectList(esicb);
		Iterator<EShippingInst> iterator = dataList.iterator();

		//エラーがない伝票別レコードを取得して、取込みフラグを設定
		while (iterator.hasNext()) {
			EShippingInst eShippingInst = iterator.next();

			// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
			if (this.errorSlipKeySet.contains(getSlipKey(eShippingInst))) {
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
				//リストからエラーのあったデータを削除する
				iterator.remove();
			} else {
				eShippingInst.setImportFlg("1");
			}
		}
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Add End
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Mod Start
		eShippingInstBhv.batchUpdate(dataList);
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Mod End

		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
		if (isError) {
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		} else {
			//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応 2016.04.22 DSW Start
			if (!shippingPlan.isEmpty() && shippingPlan.size()>0) {
				switch (resultStatus) {
				case INFO_WARN:
					getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
					break;
				default:
					getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
					break;
				}
			} else {
				getWarnManager().clear();
				getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			}
			//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応 2016.04.22 DSW End
			// 完了メッセージの設定
			// [ON推-品向-134] 更新時のメッセージを統一(不要なソースを削除) 2014.11.26 KI Start
		}
		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End

		return null;
	}

	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add Start
	/**
	 * <h2>登録時点にデータがマスタに存在しないかをチェックして該当データを削除。</h2>
	 * <pre>
	 * 処理区分CD、預託CD、在庫区分CDなどがマスタに存在するかどうかをチェック。
	 * チェックNGの場合、出荷指示受信テーブルの更新（エラーフラグ、エラーメッセージCD）を行って、
	 * 該当データをリストから削除する。
	 * </pre>
	 * @param list 出荷指示ボディDTO LIST
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param receiveCd 受信CD
	 * @return boolean エラーがある場合に、true。以外の場合、false。
	 */
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
	public boolean checkRemoveNotExistsDataForRegister(List<TShippingInstBDto> list, String centerCd, String clientCd, String receiveCd) {
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();

		boolean hasError = false;
		boolean errFlg = false;
		//エラーフラグ
		String errorFlg = "1";
		//エラーメッセージCD
		String errorMessageCd = "";

		//緊急フラグ Map
		Map<String, String> emergencyFlgMap = centerClassLogic.getClassMapByCd("EMERGENCY_FLG");
		//処理区分CD List
		List<MProcessType> mProcessTypeList = processTypeLogic.getMProcessType("0", "1", "0");
		Map<String, String> delivTzMap = centerClassLogic.getClassMapByCd("DELIV_TZ");
		//在庫区分 List
		List<MStockType> stockTypeList = stockTypeLogic.getEntityList();

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);
		long centerId = mCenter.getCenterId();

		//預託CD List
		List<MCustomer> mCustomerList = customerLogic.getDepositListByClientCd(mClient);

		MWarehouseCB mWarehouseCB = new MWarehouseCB();
		mWarehouseCB.setupSelect_MCenter();
		mWarehouseCB.specify().columnWarehouseCd();
		mWarehouseCB.query().queryMCenter().setCenterId_Equal(centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId());
		//倉庫情報 List
		List<MWarehouse> mWarehouseList = warehouseLogic.getEntityList(mWarehouseCB);

		MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
		mLocationCB.specify().columnLocationCd();
		mLocationCB.query().setCenterId_Equal(centerId);
		//ロケーション情報 List
		List<MLocation> mLocationList = mLocationBhv.selectList(mLocationCB);

		//受信行IDのリスト
		List<Long> receiveRowIdList = new ArrayList<Long>();

		//受信行IDリストの取得
		EShippingInstCB eShippingInstCB = new EShippingInstCB();
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
		eShippingInstCB.query().setReceiveCd_Equal(receiveCd);
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end
		eShippingInstCB.query().addOrderBy_ReceiveRowId_Asc();
		List<EShippingInst> eShippingInstList = eShippingInstBhv.selectList(eShippingInstCB);

		for (EShippingInst data : eShippingInstList) {

			if ("0".equals(data.getErrorFlg())) {
				receiveRowIdList.add(data.getReceiveRowId());
			}else {
				//1伝票にエラー有りのデータを削除リストに保存

				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
				SlipKey slipKey = getSlipKey(data);

				if (!this.errorSlipKeySet.contains(slipKey)) {
					this.errorSlipKeySet.add(slipKey);
				}
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
			}
		}

		//受信行ID
		Long receiveRowId = 0L;
		Iterator<TShippingInstBDto> iterator = list.iterator();
		int row = 0;

		while (iterator.hasNext()) {

			TShippingInstBDto tShippingInstBDto = iterator.next();
			// 出荷指示ヘッダをエンティティに変換
			TShippingInstH shippingInstH = tShippingInstHDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstH());
			receiveRowId = receiveRowIdList.get(row);

			errFlg = false;

			//緊急フラグ
			String emergencyFlg = tShippingInstBDto.getTShippingInstH().getEmergencyFlg();
			if (!errFlg && !emergencyFlgMap.containsKey(emergencyFlg)) {
				errorMessageCd = WmsMessageConst.EMERGENCY_FLAG_NOT_FOUND_ERROR;
				errFlg = true;
			}

			//処理区分CD
			String processTypeId = tShippingInstBDto.getTShippingInstH().getMProcessType().getProcessTypeCd();
			if (!errFlg) {
				boolean notFoundProcess = true;
				for (MProcessType mProcessType : mProcessTypeList) {
					if (processTypeId.equals(mProcessType.getProcessTypeCd())) {
						notFoundProcess = false;
						break;
					}
				}
				if (notFoundProcess) {
					errorMessageCd = WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			//納品時間帯
			String delivTz = tShippingInstBDto.getTShippingInstH().getDelivTz();
			if (!errFlg && !CU.isNullOrEmpty(delivTz) && !delivTzMap.containsKey(delivTz)) {
				errorMessageCd = WmsMessageConst.DELIV_TZ_NOT_FOUND_ERROR;
				errFlg = true;
			}

			//預託CD
			String depositCd = tShippingInstBDto.getDepositCd();
			if (!errFlg) {
				errFlg = true;
				for (MCustomer mCustomer : mCustomerList) {
					if (depositCd.equals(mCustomer.getCustomerCd())) {
						errFlg = false;
						break;
					}
				}
				if (errFlg) {
					errorMessageCd = WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR;
				}
			}

			//在庫区分CD
			String stockTypeCd = tShippingInstBDto.getStockTypeCd();
			if (!errFlg && !CU.isNullOrEmpty(stockTypeCd)) {
				errFlg = true;
				for (MStockType mStockType : stockTypeList) {
					if (stockTypeCd.equals(mStockType.getStockTypeCd())) {
						errFlg = false;
						break;
					}
				}
				if (errFlg) {
					errorMessageCd = WmsMessageConst.STOCK_TYPE_CD_NOT_FOUND_ERROR;
				}
			}

			//指定倉庫CD
			String warehouseCd = tShippingInstBDto.getWarehouseCd();
			if (!errFlg && !CU.isNullOrEmpty(warehouseCd)) {
				errFlg = true;
				for (MWarehouse warehouse : mWarehouseList) {
					if (warehouseCd.equals(warehouse.getWarehouseCd())) {
						errFlg = false;
						break;
					}
				}
				if (errFlg) {
					// [#6746][v3.1] メッセージ不正の修正 「予定倉庫」 ⇒ 「指定倉庫」2019.10.30 kawana Start
					errorMessageCd = WmsMessageConst.WAREHOUSE_CD_NOT_FOUND_ERROR;
					// [#6746][v3.1] メッセージ不正の修正 「予定倉庫」 ⇒ 「指定倉庫」2019.10.30 kawana End
				}
			}

			//指定ロケーションCD
			String locationCd = tShippingInstBDto.getLocationCd();
			if (!errFlg && !CU.isNullOrEmpty(locationCd)) {
				errFlg = true;
				for (MLocation mLocation : mLocationList) {
					if (locationCd.equals(mLocation.getLocationCd())) {
						errFlg = false;
						break;
					}
				}
				if (errFlg) {
					errorMessageCd = WmsMessageConst.LOCATION_CD_NOT_FOUND_ERROR;
				}
			}

			if (errFlg) {

				hasError = true;

				//出荷指示受信テーブルの更新（エラーフラグ、エラーメッセージCD）
				EShippingInstCB cb = new EShippingInstCB();
				// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
				cb.query().setReceiveCd_Equal(receiveCd);
				// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end
				cb.query().setReceiveRowId_Equal(receiveRowId);

				EShippingInst eShippingInst = eShippingInstBhv.selectEntity(cb);
				eShippingInst.setErrorFlg(errorFlg);
				eShippingInst.setErrorMessageCd(errorMessageCd);
				eShippingInstBhv.update(eShippingInst);

				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
				// エラー内容ログ書込開始
				addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eShippingInst.getReceiveRowId()), errorMessageCd);
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
				SlipKey slipKey = getSlipKey(shippingInstH);

				if (!this.errorSlipKeySet.contains(slipKey)) {
					this.errorSlipKeySet.add(slipKey);
				}
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End

				//チェックNGのデータをリストから削除する
				iterator.remove();
			}

			row ++;
		}

		//1伝票内でエラーがある場合に、その伝票はエラーとして、関連データを全て削除。
		iterator = list.iterator();
		while (iterator.hasNext()) {
			TShippingInstBDto tShippingInstBDto = iterator.next();
			// 出荷指示ヘッダをエンティティに変換
			TShippingInstH shippingInstH = tShippingInstHDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstH());

			// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
			if (this.errorSlipKeySet.contains(getSlipKey(shippingInstH))) {
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
				//1伝票分のデータをリストから削除する
				iterator.remove();
			}
		}


		return hasError;

	}
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Add End

	/**
	 * <h2>出荷指示一括取込用登録対象取込出荷予定データリスト取得</h2>
	 * <pre>
	 * 取込出荷予定データリスト全件検索を行い、
	 * 登録時点にエラーありのデータをチェックして削除。
	 * </pre>
	 * @param receiveCd 受信ID
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return List<TShippingInstBDto> 登録対象データリスト
	 */
	public List<TShippingInstBDto> selectAndCheckRemoveDataForRegisterList(String receiveCd, String centerCd, String clientCd) {

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();

		// 取込出荷予定データリスト全件検索
		List<TShippingInstBDto> shippingInstList = shippingPlanBulkInputSelectLogic.selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, SelectCls.ALL);

		//受信行IDのリスト
		List<Long> receiveRowIdList = new ArrayList<Long>();

		//受信行IDリストの取得
		EShippingInstCB eShippingInstCB = new EShippingInstCB();
		eShippingInstCB.query().setReceiveCd_Equal(receiveCd);
		eShippingInstCB.query().addOrderBy_ReceiveRowId_Asc();
		List<EShippingInst> eShippingInstList = eShippingInstBhv.selectList(eShippingInstCB);

		for (EShippingInst data : eShippingInstList) {

			if ("0".equals(data.getErrorFlg())) {
				receiveRowIdList.add(data.getReceiveRowId());
			} else {
				//1伝票にエラー有りのデータを削除リストに保存

				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
				SlipKey slipKey = getSlipKey(data);

				if (!this.errorSlipKeySet.contains(slipKey)) {
					this.errorSlipKeySet.add(slipKey);
				}
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
			}
		}

		Iterator<TShippingInstBDto> iterator = shippingInstList.iterator();

		//1伝票内でエラーがある場合に、その伝票はエラーとして、関連データを全て削除。
		while (iterator.hasNext()) {
			TShippingInstBDto tShippingInstBDto = iterator.next();
			// 出荷指示ヘッダをエンティティに変換
			TShippingInstH shippingInstH = tShippingInstHDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstH());

			// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
			if (this.errorSlipKeySet.contains(getSlipKey(shippingInstH))) {
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
				//1伝票分のデータをリストから削除する
				iterator.remove();
			}
		}

		return shippingInstList;
	}

	/**
	 * <h2>出荷指示一括取込用登録データの組み立て。</h2>
	 * <pre>
	 * 一括取込されたCDを元にIDを取得し、データに設定する
	 * </pre>
	 * @param tShippingInstBDtoList 取込出荷指示登録データリスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param errSts エラーステータス
	 * @return 組み立て後の取込出荷指示登録データリスト
	 */
	public List<TShippingInstBDto> setupRegisterData(List<TShippingInstBDto> tShippingInstBDtoList, String centerCd, String clientCd, ErrorStatus errSts) {

		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();
		// 出荷指示ボディをエンティティに変換
		List<TShippingInstB> tShippingInstBList = tShippingInstBDtoMapper.mappingToEntityList(tShippingInstBDtoList);

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		int rowIndex = -1;
		for (TShippingInstB tShippingInstB : tShippingInstBList) {
			rowIndex++;
			// 処理区分IDを取得
			MProcessType mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd());
			mProcessType = processTypeLogic.getUkEntity(mProcessType, errRetSts(errSts, StatusCode.PROCESS_TYPE_NOT_FOUND, rowIndex));
			if (mProcessType != null) {
				tShippingInstB.getTShippingInstH().setProcessTypeId(mProcessType.getProcessTypeId());
			}

			// エンティティの編集
			tShippingInstB.getTShippingInstH().setCenterId(centerId);
			tShippingInstB.getTShippingInstH().setClientId(clientId);
			tShippingInstB.getTShippingInstH().setInputType_$10();
			// 出荷ステータスをエラーにする
			tShippingInstB.getTShippingInstH().setShippingStatus_$10();
			// エラーフラグをエラーにする
			tShippingInstB.getTShippingInstH().setErrorFlg_$0();
		}

		// Dto変換処理
		List<TShippingInstBDto> bodyList = tShippingInstBDtoMapper.mappingToDtoList(tShippingInstBList);

		return bodyList;
	}

	/**
	 * <h2>出荷指示一括取込用出荷指示登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに出荷指示データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod Start
	public StatusDto register(String receiveCd, String centerCd, String clientCd, ErrorStatus errSts) {
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod End

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		// 登録対象データの取得
		List<TShippingInstBDto> insertShippingPlanList = selectAndCheckRemoveDataForRegisterList(receiveCd, centerCd, clientCd);
		if (insertShippingPlanList.size() < 1) {
			getErrorManager().add(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			if (outputLog == OutputLog.TRUE) {
				// ログ書込

				getDatabaseLogger().addErrorLogDtl(WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				getDatabaseLogger().endLogDtl();
				endFailureLog();
			}
			return null;
		}

		// 登録データの組み立て
		insertShippingPlanList = setupRegisterData(insertShippingPlanList, centerCd, clientCd, errRetSts(StatusCode.SHIPPING_PLAN_INSERT_FAILED));

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingLogic.getControlNo();

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();

		// 出荷指示ヘッダ
		TShippingInstH tShippingInstH = new TShippingInstH();

		// 出荷指示ボディ
		TShippingInstB tShippingInstB = new TShippingInstB();

		// 出荷指示ボディリスト(temp用)
		List<TShippingInstB> tmpListtShippingInstB = new ArrayList<TShippingInstB>();

		// 出荷指示ボディリスト(バッチ登録用)
		List<TShippingInstB> lstTShippingInstB = new ArrayList<TShippingInstB>();

		// [#2253]予備項目対応 2017.08.18 sampei Start
		TShippingInstSpareDtoMapper tShippingInstSpareDtoMapper = new TShippingInstSpareDtoMapper();
		TShippingInstSpare tShippingInstSpare = new TShippingInstSpare();
		List<TShippingInstSpare> lstTShippingInstSpare = new ArrayList<TShippingInstSpare>();
		// [#2253]予備項目対応 2017.08.18 sampei End

		int headerCount = 0;

		// 顧客出荷指示Ｎｏ．
		String strClientShippingNo = "";
		String customerCd = "";
		String delivPlanDt = "";
		String emergencyFlg = "";
		String processTypeCd = "";

		// 結果判定
		if (getErrorManager().size() > 0) {

			// 処理中止
			return null;
		}

		for (int row = 0; row < insertShippingPlanList.size(); row++) {
			TShippingInstBDto tShippingInstBDto = insertShippingPlanList.get(row);

			// 出荷指示ヘッダをエンティティに変換
			TShippingInstH shippingInstH = tShippingInstHDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstH());

			// 出荷指示ボディをエンティティに変換
			TShippingInstB shippingInstB = tShippingInstBDtoMapper.mappingToEntity(tShippingInstBDto);
			//[ＯＮ推_品向_1124] 出荷指示をもう一度取込むとアベンドすることの対応(不要なソースを削除) 2016.04.22 DSW

			// [#2253]予備項目対応 2017.08.18 sampei Start
			TShippingInstSpare shippingInstSpare = tShippingInstSpareDtoMapper.mappingToEntity(tShippingInstBDto.getTShippingInstSpareAsOne());
			// [#2253]予備項目対応 2017.08.18 sampei End

			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
			String currentDelivPlanDt = "";
			if (!CU.isNullOrEmpty(shippingInstH.getDelivPlanDt())) {
				currentDelivPlanDt = shippingInstH.getDelivPlanDt();
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End

			if (!(strClientShippingNo.equals(shippingInstH.getClientShippingNo()) && customerCd.equals(shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd())
					// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
					&& delivPlanDt.equals(currentDelivPlanDt) && emergencyFlg.equals(shippingInstH.getEmergencyFlg())
					// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End
					&& processTypeCd.equals(shippingInstH.getMProcessType().getProcessTypeCd()))) {

				// 最初の行以外の場合、出荷指示登録
				if (row != 0) {

					// WMS出荷伝票Noを登録する直前に採番
					tShippingInstH.setShippingSlipNo(numberingLogic.getNumbering(tShippingInstH.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

					// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start

					// 出荷指示ヘッダ登録
					tShippingInstHBhv.insert(tShippingInstH);
					Long hId = tShippingInstH.getShippingInstHId();
					long lineNo = 1l;
					for (TShippingInstB tmpTShippingInstB : tmpListtShippingInstB) {
						tmpTShippingInstB.setShippingInstHId(hId);
						tmpTShippingInstB.setControlNo(tShippingInstH.getControlNo());
						tmpTShippingInstB.setLineNo(lineNo);
						lineNo++;

						lstTShippingInstB.add(tmpTShippingInstB);
					}
					// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

					// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
					// 出荷指示ヘッダID設定
					for (int rowId = row - tmpListtShippingInstB.size(); rowId <= row - 1; rowId++) {
						insertShippingPlanList.get(rowId).getTShippingInstH().setShippingInstHId(tShippingInstH.getShippingInstHId());
					}
					// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

					// コントロールNoでエラーチェック対応方法に修正した為1行ずつエラーチェック処理を削除  2016.4.21 nayzaw Start

					// 結果判定
					if (getErrorManager().size() > 0) {

						// 処理中止
						return null;
					}

					tShippingInstH = new TShippingInstH();
					tmpListtShippingInstB = new ArrayList<TShippingInstB>();
				}
				tShippingInstH.setClientId(shippingInstH.getClientId());
				tShippingInstH.setCenterId(shippingInstH.getCenterId());
				tShippingInstH.setEmergencyFlg(shippingInstH.getEmergencyFlg());
				tShippingInstH.setClientShippingNo(shippingInstH.getClientShippingNo());
				tShippingInstH.setSupplyCustomerCd(shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd());
				tShippingInstH.setProcessTypeId(shippingInstH.getProcessTypeId());
				tShippingInstH.setDelivPlanDt(shippingInstH.getDelivPlanDt() == null ? "" : shippingInstH.getDelivPlanDt().replaceAll("/", ""));
				tShippingInstH.setWorkDt(shippingInstH.getWorkDt() == null ? "" : shippingInstH.getWorkDt().replaceAll("/", ""));
				tShippingInstH.setShippingDt(shippingInstH.getShippingDt() == null ? "" : shippingInstH.getShippingDt().replaceAll("/", ""));
				tShippingInstH.setDeliveryCourseCd(shippingInstH.getMDeliveryCourse().getDeliveryCourseCd());
				tShippingInstH.setDelivDt(shippingInstH.getDelivDt() == null ? "" : shippingInstH.getDelivDt().replaceAll("/", ""));
				tShippingInstH.setDelivTz(shippingInstH.getDelivTz());
				tShippingInstH.setShippingStatus(shippingInstH.getShippingStatus());
				tShippingInstH.setErrorFlg(shippingInstH.getErrorFlg());
				tShippingInstH.setInputType(shippingInstH.getInputType());
				tShippingInstH.setDelivCustomerCd(shippingInstH.getDelivCustomerCd());
				// [#458] ファイルの届先情報が登録されない不具合を修正 2016.12.14 kawana Start
				tShippingInstH.setDelivCustomerNm(shippingInstH.getDelivCustomerNm());
				tShippingInstH.setDelivZipCd(shippingInstH.getDelivZipCd());
				tShippingInstH.setDelivTelNo(shippingInstH.getDelivTelNo());
				tShippingInstH.setDelivAddress1(shippingInstH.getDelivAddress1());
				tShippingInstH.setDelivAddress2(shippingInstH.getDelivAddress2());
				tShippingInstH.setDelivAddress3(shippingInstH.getDelivAddress3());
				tShippingInstH.setDelivAddressSupply(shippingInstH.getDelivAddressSupply());
				// [#458] ファイルの届先情報が登録されない不具合を修正 2016.12.14 kawana End
				// [EC-CT1-148] 出庫作業メッセージを追加 2015.03.27 kawana Start
				tShippingInstH.setPickingWorkMessage(shippingInstH.getPickingWorkMessage());
				// [EC-CT1-148] 出庫作業メッセージを追加 2015.03.27 kawana End
				// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start
				tShippingInstH.setControlNo(controlNo);
				// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End

				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
				tShippingInstB.setUnitPrice(shippingInstB.getUnitPrice());
				tShippingInstH.setTotalPrice(shippingInstH.getTotalPrice());
				tShippingInstH.setTotalTax(shippingInstH.getTotalTax());
				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

				headerCount++;

				tShippingInstB.setProductCd(shippingInstB.getMProduct().getProductCd());
				tShippingInstB.setDepositCd(shippingInstB.getDepositCd());
				tShippingInstB.setStockTypeCd(shippingInstB.getStockTypeCd());
				tShippingInstB.setInstNum(shippingInstB.getInstNum());
				tShippingInstB.setLot(shippingInstB.getLot());
				tShippingInstB.setLimitDt(shippingInstB.getLimitDt() == null ? "" : shippingInstB.getLimitDt().replaceAll("/", ""));
				tShippingInstB.setLocationCd(shippingInstB.getLocationCd());
				tShippingInstB.setLocationId(shippingInstB.getLocationId());
				tShippingInstB.setWarehouseId(shippingInstB.getWarehouseId());
				tShippingInstB.setWarehouseCd(shippingInstB.getWarehouseCd());

				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
				tShippingInstB.setUnitPrice(shippingInstB.getUnitPrice());
				tShippingInstB.setPrice(shippingInstB.getPrice());
				tShippingInstB.setTax(shippingInstB.getTax());
				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

				// [#2253]予備項目対応 2017.08.18 sampei Start
				tShippingInstB.setTShippingInstSpareAsOne(shippingInstSpare);
				// [#2253]予備項目対応 2017.08.18 sampei End

				tmpListtShippingInstB.add(tShippingInstB);

				tShippingInstB = new TShippingInstB();
			} else {
				tShippingInstB.setProductCd(shippingInstB.getMProduct().getProductCd());
				tShippingInstB.setDepositCd(shippingInstB.getDepositCd());
				tShippingInstB.setStockTypeCd(shippingInstB.getStockTypeCd());
				tShippingInstB.setInstNum(shippingInstB.getInstNum());
				tShippingInstB.setLot(shippingInstB.getLot());
				tShippingInstB.setLimitDt(shippingInstB.getLimitDt() == null ? "" : shippingInstB.getLimitDt().replaceAll("/", ""));
				tShippingInstB.setLocationCd(shippingInstB.getLocationCd());
				tShippingInstB.setLocationId(shippingInstB.getLocationId());
				tShippingInstB.setWarehouseId(shippingInstB.getWarehouseId());
				tShippingInstB.setWarehouseCd(shippingInstB.getWarehouseCd());

				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
				tShippingInstB.setUnitPrice(shippingInstB.getUnitPrice());
				tShippingInstB.setPrice(shippingInstB.getPrice());
				tShippingInstB.setTax(shippingInstB.getTax());
				// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

				// [#2253]予備項目対応 2017.08.18 sampei Start
				tShippingInstB.setTShippingInstSpareAsOne(shippingInstSpare);
				// [#2253]予備項目対応 2017.08.18 sampei End

				tmpListtShippingInstB.add(tShippingInstB);

				tShippingInstB = new TShippingInstB();
			}

			strClientShippingNo = shippingInstH.getClientShippingNo();
			customerCd = shippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd();
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana Start
			delivPlanDt = currentDelivPlanDt;
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.10 kawana End
			emergencyFlg = shippingInstH.getEmergencyFlg();
			processTypeCd = shippingInstH.getMProcessType().getProcessTypeCd();
			//			// 最終行の場合、出荷指示登録
			if (row == insertShippingPlanList.size() - 1) {
				// WMS出荷伝票Noを登録する直前に採番
				tShippingInstH.setShippingSlipNo(numberingLogic.getNumbering(tShippingInstH.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

				// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start
				// 出荷指示ヘッダ登録
				tShippingInstHBhv.insert(tShippingInstH);
				Long hId = tShippingInstH.getShippingInstHId();
				long lineNo = 1l;
				for (TShippingInstB tmpTShippingInstB : tmpListtShippingInstB) {
					tmpTShippingInstB.setShippingInstHId(hId);
					tmpTShippingInstB.setControlNo(tShippingInstH.getControlNo());
					tmpTShippingInstB.setLineNo(lineNo);
					lineNo++;

					lstTShippingInstB.add(tmpTShippingInstB);
				}
				// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

				// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
				// 出荷指示ヘッダID設定
				for (int rowId = row - tmpListtShippingInstB.size() + 1; rowId <= row; rowId++) {
					insertShippingPlanList.get(rowId).getTShippingInstH().setShippingInstHId(tShippingInstH.getShippingInstHId());
				}
			}
		}

		// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw Start
		// 出荷指示ボディ登録
		tShippingInstBBhv.batchInsert(lstTShippingInstB);
		// 出荷指示ボディデータ登録をバッチで全件登録方法に更新 2016.05.23 nayzaw End

		// [#2253]予備項目対応 2017.08.18 sampei Start
		for(TShippingInstB tShippingInstBForSpare : lstTShippingInstB){

			TShippingInstBCB cb = new TShippingInstBBhv().newConditionBean();
			cb.query().setShippingInstHId_Equal(tShippingInstBForSpare.getShippingInstHId());
			cb.query().setLineNo_Equal(tShippingInstBForSpare.getLineNo());
			TShippingInstB resultBody = tShippingInstBBhv.selectEntity(cb);

			tShippingInstSpare.setShippingInstBId(resultBody.getShippingInstBId());
			tShippingInstSpare.setSpareStr1(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareStr1());
			tShippingInstSpare.setSpareStr2(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareStr2());
			tShippingInstSpare.setSpareStr3(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareStr3());

			if(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum1() !=  null){
				tShippingInstSpare.setSpareNum1(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum1());
			}

			if(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum2() !=  null){
				tShippingInstSpare.setSpareNum2(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum2());
			}

			if(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum3() !=  null){
				tShippingInstSpare.setSpareNum3(tShippingInstBForSpare.getTShippingInstSpareAsOne().getSpareNum3());
			}

			lstTShippingInstSpare.add(tShippingInstSpare);
			tShippingInstSpare = new TShippingInstSpare();
		}
		tShippingInstSpareBhv.batchInsert(lstTShippingInstSpare);
		// [#2253]予備項目対応 2017.08.18 sampei End


		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw Start

		// エラーチェック処理呼び出す
		boolean isError = shippingInstErrorCheckLogic.check(controlNo, null, errRetSts(StatusCode.SHIPPING_PLAN_INSERT_FAILED));

		Long oldControlNo = controlNo;
		controlNo = null;
		// 出荷指示ヘッダのコントロールNoクリア
		int headerUpdateCount = updateControlNoLogic.updateTShippingInstHeader(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// 出荷指示ボディのコントロールNoクリア
		int bodyUpdateCount = updateControlNoLogic.updateTShippingInstBody(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (headerUpdateCount != headerCount || bodyUpdateCount != insertShippingPlanList.size()) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// コントロールNoでエラーチェック処理を行う方法に修正 2016.04.21 nayzaw End

		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Add Start
		EShippingInstCB esicb = new EShippingInstCB();
		esicb.query().setReceiveCd_Equal(receiveCd);
		List<EShippingInst> dataList = eShippingInstBhv.selectList(esicb);
		Iterator<EShippingInst> iterator = dataList.iterator();

		//エラーがない伝票別レコードを取得して、取込みフラグを設定
		while (iterator.hasNext()) {
			EShippingInst eShippingInst = iterator.next();

			// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start
			if (this.errorSlipKeySet.contains(getSlipKey(eShippingInst))) {
				// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
				//リストからエラーのあったデータを削除する
				iterator.remove();
			} else {
				eShippingInst.setImportFlg("1");
			}
		}
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Add End
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Mod Start
		eShippingInstBhv.batchUpdate(dataList);
		//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.07 chou Mod End


		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
		if (isError) {
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		}
		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End

		if (outputLog == OutputLog.TRUE) {
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
			// ログ書込
			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_SHIPPING_PLAN_INFORMATION, String.valueOf(headerCount), String.valueOf(insertShippingPlanList.size()));
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
			getDatabaseLogger().endLogDtl();
		}

		return null;
	}

	/**
	 * ログの書込み有無を取得します。
	 * @return ログの書込み有無
	 */
	public OutputLog getOutputLog() {
		return outputLog;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma end

	// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana Start

	/**
	 * 伝票キーの取得
	 */
	private SlipKey getSlipKey(EShippingInst eShippingInst) {

		return new SlipKey(eShippingInst.getClientShippingNo(), eShippingInst.getSupplyCustomerCd());
	}

	/**
	 * 伝票キーの取得
	 */
	private SlipKey getSlipKey(TShippingInstH tShippingInstH) {

		return new SlipKey(tShippingInstH.getClientShippingNo(), tShippingInstH.getMCustomerBySupplyCustomerId().getCustomerCd());
	}

	/**
	 * 伝票キー
	 */
	private static class SlipKey {

		/** 顧客出荷指示No. */
		private String clientShippingNo;
		/** 納品先CD */
		private String supplyCustomerCd;

		public SlipKey(String clientShippingNo, String supplyCustomerCd) {
			this.clientShippingNo = clientShippingNo;
			this.supplyCustomerCd = supplyCustomerCd;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clientShippingNo == null) ? 0 : clientShippingNo.hashCode());
			result = prime * result + ((supplyCustomerCd == null) ? 0 : supplyCustomerCd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SlipKey other = (SlipKey) obj;
			if (clientShippingNo == null) {
				if (other.clientShippingNo != null)
					return false;
			} else if (!clientShippingNo.equals(other.clientShippingNo))
				return false;
			if (supplyCustomerCd == null) {
				if (other.supplyCustomerCd != null)
					return false;
			} else if (!supplyCustomerCd.equals(other.supplyCustomerCd))
				return false;
			return true;
		}
	}

	// [#5779][v3.1] 緊急フラグが異なる場合に別伝票と扱われてエラー行があっても登録されてしまう問題を修正 2018.12.19 kawana End
}
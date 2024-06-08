package com.oneslogi.ht.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import net.arnx.jsonic.JSON;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreInsertLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;

/**
 * 検品格納再開Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStore")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStore/reopenProcess")
public class ReceiveInspecStoreResource extends HandyResourceBase {

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
	// private static final String REPORT_CD = "ProductLabel";
	private static final String PRODUCT_REPORT_CD = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になった変数STORE_REPORT_CDを削除) 2018.04.27 kawana Delete
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;
	@Inject
	private ReceiveInspecStoreCheckLogic checkLogic;
	@Inject
	private ReceiveInspecStoreDeleteLogic deleteLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、入荷検品格納(JAN入力)画面に遷移します。
	 * @param reopenKey JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String reopenKey) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		ReceiveInspecStoreResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic, selectLogic);

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		String labelKbn = reopenKey.split(",")[0];
		String htWorkNo = reopenKey.split(",")[1];

		//伝票No.の初期化
		tReceivePlanBDto.getTReceivePlanH().setReceiveSlipNo(htWorkNo);
		//ラベル区分の初期化
		dto.setLabelKbn(labelKbn);

		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//伝票Noの削除チェックを行う
		if (!ReceiveInspecStoreResource.checkExistSlipNo(this, util, checkLogic, deleteLogic)) {
			return;
		}

		//Jan入力画面を表示
		ReceiveInspecStoreJanResource.display(this, util);
	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, ReceiveInspecStoreSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//入荷検品格納情報の初期化
		ReceiveInspecStoreDto dto = new ReceiveInspecStoreDto();
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		//センタ情報の初期化
		tReceivePlanBDto.getTReceivePlanH().setCenterId(loginInfo.getCenterId());
		//荷主情報の初期化
		tReceivePlanBDto.getTReceivePlanH().setClientId(loginInfo.getClientId());

		//MACアドレスの初期化
		dto.setMacAddress(util.getMacAddress(ses));
		//パラメータマスタ情報の取得
		MParam mParam = selectLogic.getMParam(loginInfo.getClientId(), loginInfo.getCenterId());
		if (mParam != null) {
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			// パラメータマスタ
			MParamDtoMapper mPatamDtoMapper = new MParamDtoMapper();
			dto.setMParamDto(mPatamDtoMapper.mappingToDto(mParam));
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		}
		ses.setAttribute("ReceiveInspecStoreDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param deleteLogic    入荷検品ワーク削除ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ReceiveInspecStoreDeleteLogic deleteLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		WHtReceiveInspection wHtReceiveInspection = new WHtReceiveInspection();
		wHtReceiveInspection.setHtWorkNo(dto.getTReceivePlanBDto().getTReceivePlanH().getReceiveSlipNo());
		wHtReceiveInspection.setMacAddress(dto.getMacAddress());

		//入荷検品ワークテーブルをクリア
		deleteLogic.clearWHtReceiveInspection(wHtReceiveInspection);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("ReceiveInspecStoreDto");
	}

	/**
	 * <h2>検品格納データを登録する</h2>
	 * @param resource       呼び出すResourceクラス
	 * @param userLogic      ユーザロジック
	 * @param selectLogic    入荷検品格納データ取得ロジック
	 * @param insertLogic    入荷検品格納データ登録ロジック
	 * @throws Exception
	 */
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 Start
	public static void register(HandyResourceBase resource, HandyCommonUtil util, UserLogic userLogic, ReceiveInspecStoreSelectLogic selectLogic, ReceiveInspecStoreInsertLogic insertLogic,
			AutoPrintLogic autoPrintLogic, ReportLogic reportLogic, StoreLabelPrintLogic storeLabelPrintLogic, ProductLabelLogic productLabelLogic) throws Exception {
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 End
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		TStoreRecordBDtoMapper tStoreRecordDtoMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> lstTStoreRecordB = tStoreRecordDtoMapper.mappingToEntityList(dto.getLstTStoreRecordBDto());

		final long centerId = tReceivePlanBDto.getTReceivePlanH().getCenterId();

		// 入荷検品ワークの登録
		WHtReceiveInspection wHtReceiveInspection = new WHtReceiveInspection();

		wHtReceiveInspection.setMacAddress(dto.getMacAddress());
		wHtReceiveInspection.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());
		wHtReceiveInspection.setCenterId(centerId);
		wHtReceiveInspection.setProductId(tReceivePlanBDto.getProductId());
		wHtReceiveInspection.setJanCd(tReceivePlanBDto.getMProduct().getJanCd());
		wHtReceiveInspection.setProductCd(tReceivePlanBDto.getProductCd());
		wHtReceiveInspection.setProductNm(tReceivePlanBDto.getMProduct().getProductNm());
		wHtReceiveInspection.setStockTypeId(tReceivePlanBDto.getTReceivePlanH().getStockTypeId());
		wHtReceiveInspection.setStkClsNm(tReceivePlanBDto.getTReceivePlanH().getMStockType().getVDict().getDictNm());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		wHtReceiveInspection.setPieceQtyRcvOrd(tReceivePlanBDto.getPlanNum());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		wHtReceiveInspection.setPieceQtyRcv(dto.getStoreNum());
		wHtReceiveInspection.setRcvLocId(tReceivePlanBDto.getPlanLocationId());
		wHtReceiveInspection.setRcvLocCd(tReceivePlanBDto.getPlanLocationCd());
		wHtReceiveInspection.setRcvLocNm(tReceivePlanBDto.getMLocation().getLocationNm());
		wHtReceiveInspection.setHtWorkNo(tReceivePlanBDto.getTReceivePlanH().getReceiveSlipNo());
		wHtReceiveInspection.setOnsNum(tReceivePlanBDto.getPlanStoreLabelNo());
		wHtReceiveInspection.setLot(tReceivePlanBDto.getPlanLot());
		wHtReceiveInspection.setLimitDt(tReceivePlanBDto.getPlanLimitDt());
		wHtReceiveInspection.setLabelSelect(dto.getLabelKbn());
		wHtReceiveInspection.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		wHtReceiveInspection.setWorkEndDt(AccessContext.getAccessTimestampOnThread());

		insertLogic.insertWHtReceiveInspection(wHtReceiveInspection);

		// 入荷実績登録.入荷実績登録メソッドを呼出し
		insertLogic.insert(lstTStoreRecordB.get(0).getTStoreRecordH(), lstTStoreRecordB, new ErrorStatus());

		// 結果判定
		if (resource.getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start

		if ("2".equals(dto.getMParamDto().getResultAfterProductLabel()) || "3".equals(dto.getMParamDto().getResultAfterProductLabel())) {
			// 商品ラベル発行

			if ("1".equals(dto.getMParamDto().getResultAfterProductTarget())) {
				// 入庫ラベル自動発行

				for (TStoreRecordB tStoreRecordB : lstTStoreRecordB) {

					String storeLabelNo = tStoreRecordB.getStoreLabelNo();
					if (storeLabelNo == null) {
						// 0入庫の場合 (在庫更新しないので入荷実績登録.入荷実績登録メソッドで入庫ラベルNo.が設定されない)
						continue;
					}

					storeLabelPrintLogic.autoPrintUnprintOnly(centerId, storeLabelNo, new ErrorStatus());
					if (0 < resource.getErrorManager().size()) {
						return;
					}
				}
				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
			}
			if ("2".equals(dto.getMParamDto().getResultAfterProductTarget())) {
				// 商品ラベル自動発行

				// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
				printProductLabel(resource, util, tReceivePlanBDto, dto, reportLogic, autoPrintLogic, productLabelLogic);
				// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
			}

			// [#3353] 商品ラベル発行エラー後の処理で致命的エラー発生 2018.01.19 kawana Start
			if (0 < resource.getErrorManager().size()) {
				return;
			}
			// [#3353] 商品ラベル発行エラー後の処理で致命的エラー発生 2018.01.19 kawana End
		}

		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 Start
		// 実績入力後商品ラベル出力の判定　2:HTで実績入力後のみ出力,3：出力する
		// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		//		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
		//		if (pReportLayout !=  null) {
		//			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		//			if ("2".equals(dto.getMParamDto().getResultAfterProductLabel()) || "3".equals(dto.getMParamDto().getResultAfterProductLabel())){
		//
		//				// 出力内容
		//				MProductDto mProductDto = tReceivePlanBDto.getMProduct();
		//				List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();
		//
		//				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
		//				// 出力枚数取得
		//				long outCnt = WmsProductLabelUtil.getOutNum(dto.getTReceivePlanBDto().getUnitNum(), dto.storeNum, dto.getMParamDto());
		//				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End
		//
		//				ProductLabelDto redto = new ProductLabelDto();
		//
		//				// 商品ラベル情報取得
		//				redto = WmsProductLabelUtil.getProductLabelDto(mProductDto, dto.getMParamDto());
		//				redto.cultureId = util.getCultureId();
		//
		//				for(int i = 0 ; i < outCnt ; i++ ){
		//					retList.add(redto);
		//				}
		//
		//				// ※※ 自動発行のため発行枚数の上限チェックはしない
		//
		//				// 帳票発行処理
		//				JSON json = new JSON();
		//				json.setSuppressNull(true);
		//
		//				AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(REPORT_CD);
		//				// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		////				//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		////				PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
		//				// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		//				autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
		//				//印刷内容
		//				autoPrintParamDto.printBasicData.outputData = json.format(retList);
		//
		//				AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);
		//
		//				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana Start
		//				if (!result.isSuccess()) {
		//					// 商品ラベル発行失敗
		//
		//					resource.getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_LABEL_PRINT_ERROR);
		//					return;
		//				}
		//				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana End
		//			}
		//			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		//		}
		// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 End
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

		// ==== 登録後、商品単位で予定数を再取得する ====
		// 商品情報の取得
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//ON推-品向-1005 センタ間移動の場合処理追加 2015/11/26 NayZaw Start
		TReceivePlanB tReceivePlanB;
		if (tReceivePlanH.getCenterTransitFlg().equals("1")) {
			tReceivePlanB = selectLogic.selectReceivePlanData(tReceivePlanH, mProduct, bUser, tReceivePlanBDto.getPlanLot(), tReceivePlanBDto.getPlanLimitDt());
		} else {
			tReceivePlanB = selectLogic.selectReceivePlanData(tReceivePlanH, mProduct, bUser);
		}
		//ON推-品向-1005 センタ間移動の場合処理追加 2015/11/26 NayZaw End

		TReceivePlanBDtoMapper tReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
		TReceivePlanBDto planBDto = tReceivePlanBDtoMapper.mappingToDto(tReceivePlanB);
		planBDto.setPlanLocationCd("");
		planBDto.setPlanLocationId(null);
		planBDto.setPlanLot("");
		planBDto.setPlanLimitDt("");
		planBDto.setPlanStoreLabelNo("");

		dto.setTReceivePlanBDto(planBDto);
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//数量入力画面を表示
		ReceiveInspecStoreQtyResource.load(resource, util);
	}

	/**
	 * <h2>伝票Noが入荷予定に存在することをチェックする</h2>
	 * <pre>
	 * ・データ存在しない場合
	 *   1.排他メッセージの表示
	 *   2.入荷検品ワークテーブルのクリア
	 *   3.ラベル選択画面に遷移
	 * ・データ存在する場合、処理を継続
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param checkLogic     業務ロジック
	 * @param deleteLogic    業務ロジック
	 * @return true:伝票No存在;false:伝票No存在しない
	 * @throws Exception
	 */
	public static boolean checkExistSlipNo(HandyResourceBase resource, HandyCommonUtil util,
			ReceiveInspecStoreCheckLogic checkLogic, ReceiveInspecStoreDeleteLogic deleteLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		// 伝票No存在チェック
		tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH, "1");
		if (tReceivePlanH == null) {
			//存在しない場合はラベル選択画面に遷移
			ses.setAttribute("ReceiveInspecStoreDto", dto);

			//機能単位セッションを再構造
			ReceiveInspecStoreResource.removeSession(resource, util, deleteLogic);

			ErrorManager errorManager = resource.getErrorManager();
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ReceiveInspecStoreLabel/load");
			errorManager.clear();

			return false;
		}
		return true;
	}

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	/**
	 * <h2>商品ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに商品ラベル発行データを取得する
	 * </pre>
	 * @param printDto 商品ラベル発行画面用DTO
	 * @return productLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	public static void printProductLabel(HandyResourceBase resource, HandyCommonUtil util, TReceivePlanBDto tReceivePlanBDto, ReceiveInspecStoreDto dto,
			ReportLogic reportLogic, AutoPrintLogic autoPrintLogic, ProductLabelLogic productLabelLogic) throws Exception {
		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(PRODUCT_REPORT_CD), "1");
		if (pReportLayout != null) {
			// 出力内容
			MProductDto mProductDto = tReceivePlanBDto.getMProduct();
			List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start

			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
			// 出力枚数取得
			long outCnt = productLabelLogic.getOutNum(tReceivePlanBDto.getProductId(), dto.storeNum, dto.getMParamDto());
			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End

			ProductLabelDto redto = new ProductLabelDto();

			// 商品ラベル情報取得
			redto = productLabelLogic.getProductLabelDto(mProductDto, dto.getMParamDto());
			redto.cultureId = util.getCultureId();

			// [#3673][Ver3.0] [HT]入荷検品格納 - 商品ラベル自動発行出力枚数不正 2018.02.08 honma Mod Start
			for (int i = 0; i < outCnt; i++) {
				retList.add(redto);
			}
			// [#3673][Ver3.0] [HT]入荷検品格納 - 商品ラベル自動発行出力枚数不正 2018.02.08 honma Mod End

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

			// ※※ 自動発行のため発行枚数の上限チェックはしない

			// 帳票発行処理
			JSON json = new JSON();
			json.setSuppressNull(true);

			AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(PRODUCT_REPORT_CD);
			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
			//			//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
			//			PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
			autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
			//印刷内容
			autoPrintParamDto.printBasicData.outputData = json.format(retList);

			AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);

			// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana Start
			if (!result.isSuccess()) {
				// 商品ラベル発行失敗

				resource.getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_LABEL_PRINT_ERROR);
				return;
			}
		}
	}

	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になったメソッドprintStoreLabelを削除) 2018.04.27 kawana Delete

	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
}

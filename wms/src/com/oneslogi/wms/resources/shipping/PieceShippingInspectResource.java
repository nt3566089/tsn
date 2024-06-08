package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.dto.TAllocInstBDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TAllocInstBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingSlipListPrint;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.PackingSlipListDto;
import com.oneslogi.wms.dto.shipping.PieceShippingInspectDto;
import com.oneslogi.wms.dto.shipping.TagLabelPrintParamDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PackingInsertLogic;
import com.oneslogi.wms.logic.shipping.PackingSlipListPrintLogic;
import com.oneslogi.wms.logic.shipping.PieceShippingInspectClearLogic;
import com.oneslogi.wms.logic.shipping.PieceShippingInspectLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.logic.shipping.ShippingInspectAutoPrintLogic;
import com.oneslogi.wms.logic.shipping.ShippingInterruptLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

@Path("/shipping/pieceShippingInspect")
public class PieceShippingInspectResource extends AbstractWmsResource {
	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
	private static final String REPORT_CD = "PackingSlipList";
	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

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
		 * 出荷検品データ取得異常
		 */
		protected static final int SHIPPING_INSPECT_SELECT_FAILED = 2;
		/**
		 * 出荷検品中断データ取得異常
		 */
		protected static final int SHIPPING_INTERRUPT_SELECT_FAILED = 3;
		/**
		 * 出荷指示ボディ0件
		 */
		protected static final int SHIPPING_INSPECT_BODY_ZERO = 4;
		/**
		 * 出荷検品中断データ0件
		 */
		protected static final int SHIPPING_INTERRUPT_ZERO = 5;
		/**
		 * 出荷指示データ更新異常
		 */
		protected static final int SHIPPING_INSPECT_UPDATE_FAILED = 6;
		/**
		 * 出庫データ更新異常
		 */
		protected static final int PICKING_UPDATE_FAILED = 7;
		/**
		 * 梱包データ登録異常
		 */
		protected static final int PACKING_UPDATE_FAILED = 8;
		/**
		 * 出荷検品中断データ登録異常
		 */
		protected static final int SHIPPING_INTERRUPT_INSERT_FAILED = 9;
		/**
		 * 出荷検品中断データ削除異常
		 */
		protected static final int SHIPPING_INTERRUPT_DELETE_FAILED = 10;
		/**
		 * クリア削除異常
		 */
		protected static final int CLEAR_DELETE_FAILED = 11;
		/**
		 * 箱データ登録異常
		 */
		protected static final int PACKING_INSERT_FAILED = 12;
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
		/**
		 *一部欠品異常
		 */
		protected static final int INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR = 13;
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 14;
		/**
		 * 梱包帳票更新異常
		 */
		protected static final int T_PACKING_R_UPDATE_FAILED = 15;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
		/**
		 * 荷札発行異常
		 */
		protected static final int TAG_LABEL_PRINT_FAILED = 16;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		/**
		 * Packing Slipデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 17;

		/**
		 * 出庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 18;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private PieceShippingInspectLogic pieceShippingInspectLogic;
	@Inject
	private PackingInsertLogic packingInsertLogic;
	@Inject
	private PieceShippingInspectClearLogic pieceShippingInspectClearLogic;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ShippingInterruptLogic shippingInterruptLogic;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;

	//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
	@Inject
	private ParamLogic paramLogic;
	// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
	//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja Start
	@Inject
	private MBoxBhv mBoxBhv;
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja End

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private PackingSlipListPrintLogic packingSlipListPrintLogic;
	// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto Start
	@Inject
	private ShippingInspectAutoPrintLogic shippingInspectAutoPrintLogic;
	// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto End

	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return PieceShippingInspectDto 出荷検品画面用DTO
	 */
	@GET
	@Path("/init")
	public PieceShippingInspectDto init() {
		return new PieceShippingInspectDto();
	}

	/**
	 * <h2>出荷検品データ取得。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 画面で入力されたCDを元にIDを取得し、出荷検品データを取得する
	 * </pre>
	 * @param pieceShippingInspectDto 出荷検品画面用DTO
	 * @return PieceShippingInspectDto 出荷検品画面用DTO
	 */
	@GET
	@Path("/select")
	public PieceShippingInspectDto select(PieceShippingInspectDto pieceShippingInspectDto) throws IOException {
		// ===== 出荷検品画面用DTO =====
		PieceShippingInspectDto shippingDto = new PieceShippingInspectDto();

		// ===== マスタ検索で必要なIDの取得 =====
		// ===== センタID(センタマスタをpieceShippingInspectDto．センタCDで検索) =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(pieceShippingInspectDto.data.search.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		final long centerId = mCenter.getCenterId();
		// ===== ClientID(センタマスタをpieceShippingInspectDto．ClientCDで検索) =====
		MClient mClient = new MClient();
		mClient.setClientCd(pieceShippingInspectDto.data.search.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		final long clientId = mClient.getClientId();
		//[C-CWMS-0051]梱包計算対応  2015/11/16 NayZaw Start

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		TPickingH tPickingH = new TPickingH();
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		TPackingH tPackingH = new TPackingH();
		String inputNo = pieceShippingInspectDto.data.search.getPickingWorkNo();
		List<TPackingB> lstPackingB = null;

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		boolean isPickingWorkNo = commonLogic.isPickingWorkNo(centerId, inputNo);
		boolean isShippingPackingNo = commonLogic.isShippingPackingNo(centerId, inputNo);

		if (isPickingWorkNo) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== ロケを引当禁止、商品出荷停止と取引先出荷停止のチェック =====
			// 登録データの組み立てのチェックデータ編集

			tPickingHCB.query().setCenterId_Equal(centerId);
			tPickingHCB.query().setClientId_Equal(clientId);
			tPickingHCB.query().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// 出庫ヘッダ

			tPickingH = tPickingHBhv.selectEntity(tPickingHCB);
			if (tPickingH == null) {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

			//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add Start
			if(tPickingH.isSglRowPicFlg$1()){
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SINGLE_ROW_PICKING_TARGET_ERROR);
			}
			//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add End

			//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
			TShippingInstBCB tsib = tShippingInstBBhv.newMyConditionBean();
			tsib.setupSelect_TShippingInstH();
			tsib.setupSelect_TAllocInstB();
			//商品マスタ
			tsib.setupSelect_MProduct();
			//荷主マスタ
			tsib.setupSelect_TShippingInstH().withMClient();
			//センタマスタ
			tsib.setupSelect_TShippingInstH().withMCenter();

			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());

			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
			//荷主ID（Client_ID）
			tsib.query().queryTShippingInstH().setClientId_Equal(clientId);
			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setClientId_Equal(clientId);
			//センタID（Center_ID）
			tsib.query().queryTShippingInstH().setCenterId_Equal(centerId);
			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setCenterId_Equal(centerId);
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
			ListResultBean<TShippingInstB> tsb = tShippingInstBBhv.selectList(tsib);
			if (tsb.size() > 0) {
				for (TShippingInstB tib : tsb) {
					if (tib.getMProduct().getShippingStopFlg().equals("1")) {
						if (WCC.isPositive(tib.getTAllocInstB().getAllocNum())) {
							this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
							return null;
						}
					}
				}
			}
			//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (isShippingPackingNo) {

			//出荷梱包No.で検品する場合、梱包ヘッダテーブルに存在チェック

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			tPackingHCB.setupSelect_TPickingH();
			tPackingHCB.query().setCenterId_Equal(centerId);
			tPackingHCB.query().setClientId_Equal(clientId);
			tPackingHCB.query().setShippingPackingNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());

			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);

			if (tPackingH == null) {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

			//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add Start
			tPickingH = tPackingH.getTPickingH();
			if(tPickingH.isSglRowPicFlg$1()){
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SINGLE_ROW_PICKING_TARGET_ERROR);
			}
			//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add End

			// [#2356] 梱包荷材グループ未設定で作成したデータで致命的エラー対応 2017.08.25 ase start
			if (tPackingH.getBoxId() != null) {
				// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
				// デフォルト荷材
				MBoxCB cb = mBoxBhv.newMyConditionBean();
				cb.query().setCenterId_Equal(centerId);
				cb.query().setBoxId_Equal(tPackingH.getBoxId());
				shippingDto.data.defaultBox = new MBoxDtoMapper().mappingToDto(mBoxBhv.selectEntityWithDeletedCheck(cb));
				// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
			}
			// [#2356] 梱包荷材グループ未設定で作成したデータで致命的エラー対応 2017.08.25 ase end

			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.query().setPackingHId_Equal(tPackingH.getPackingHId());

			List<TPackingB> tPackingBList = tPackingBBhv.selectList(tPackingBCB);
			for (TPackingB pB : tPackingBList) {
				TPackingBCB tpbCB = tPackingBBhv.newMyConditionBean();
				tpbCB.setupSelect_TPickingB();
				tpbCB.setupSelect_TAllocInstB();
				tpbCB.setupSelect_TPickingB().withTShippingInstB();
				tpbCB.setupSelect_TPickingB().withTShippingInstB().withMProduct();
				tpbCB.setupSelect_TPackingH();
				tpbCB.setupSelect_TPackingH().withMClient();
				tpbCB.setupSelect_TPackingH().withMCenter();
				tpbCB.query().setPackingBId_Equal(pB.getPackingBId());
				lstPackingB = tPackingBBhv.selectList(tpbCB);
				if (lstPackingB.size() > 0) {
					for (TPackingB tPB : lstPackingB) {
						if (tPB.getTPickingB().getTShippingInstB().getMProduct().getShippingStopFlg().equals("1")) {
							if (WCC.isPositive(tPB.getTAllocInstB().getAllocNum())) {
								this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
								return null;
							}
						}
					}
				}
			}
		}
		else {
			//出庫作業No.と出荷梱包No.以外場合、エラー表示
			this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//[C-CWMS-0051]梱包計算対応  2015/11/16 NayZaw End

		// 引当指示ヘッダ
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		tAllocInstHCB.query().setCenterId_Equal(centerId);
		tAllocInstHCB.query().setClientId_Equal(clientId);
		//[C-CWMS-0051]梱包計算対応  NayZaw  2015/11/17 Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (commonLogic.isPickingWorkNo(centerId, inputNo)) {
			//出庫作業No.で検品する場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			tAllocInstHCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, inputNo)) {
			//出荷梱包No.で検品する場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			tAllocInstHCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());
		}
		//[C-CWMS-0051]梱包計算対応  NayZaw  2015/11/17 End
		TAllocInstH tAllocInstH = new TAllocInstH();
		// 引当指示ヘッダ
		tAllocInstH = tAllocInstHBhv.selectEntity(tAllocInstHCB);
		if (tAllocInstH == null) {
			this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 取引先出荷停止のチェック =====
		// 20141103 Start
		MCustomer mCustomer = new MCustomer();
		mCustomer = mCustomerBhv.selectByPKValue(tAllocInstH.getSupplyCustomerId());
		if (mCustomer == null) {
			this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return null;
		}
		if (mCustomer.isShippingStopFlg$1()) {
			this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return null;
		}
		// 20141103 End

		//[C-CWMS-0051]梱包計算対応  2015/11/18 NayZaw Start

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (isPickingWorkNo) {
			//出庫作業No.で検品する場合、引当指示ボディテーブルから引当指示ヘッダIDで取得

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// 引当指示ヘッダ
			TAllocInstBCB tAllocInstBCB = tAllocInstBBhv.newMyConditionBean();
			tAllocInstBCB.query().setAllocInstHId_Equal(tAllocInstH.getAllocInstHId());
			List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			// 引当指示ボディリスト
			tAllocInstBList = tAllocInstBBhv.selectList(tAllocInstBCB);
			if (tAllocInstBList.size() == 0) {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
			for (TAllocInstB tAllocInstB : tAllocInstBList) {
				// ===== 商品出荷停止のチェック =====
				// 20141103 Start
				MProduct mProduct = new MProduct();
				mProduct = mProductBhv.selectByPKValue(tAllocInstB.getProductId());
				if (mProduct == null) {
					this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
					return null;
				}
				//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
				//if (mProduct.isShippingStopFlg$1()){
				//	this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				//	return null;
				//}
				//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End
				// 20141103 End

				// ===== 引当禁止のチェック =====
				// 20141003  追加 [ON推-CT3-068対応] Start
				// [Ver3.1][#5117] ロケ引当禁止チェック削除 2018.09.10 matsumoto Del
				// 20141003  追加 [ON推-CT3-068対応] End
				// 20141003  追加 [ON推-CT3-068対応] Start
				// 20141003  追加 [ON推-CT3-068対応] End
				// 20141003  削除 [ON推-CT3-068対応] Start
				//TStockInout tStockInout = new TStockInout();
				//tStockInout = tStockInoutBhv.selectEntity(tStockInoutCB);
				//if (tStockInout != null){
				//	if ( mLocationBhv.selectByPKValue(tStockBhv.selectByPKValue(tStockInout.getStockId()).getLocationId()).isAllocNgFlg$1()){
				//		this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
				//		return null;
				//	}
				//}
				// 20141003  削除 [ON推-CT3-068対応] End
				// 20141003  追加 [ON推-CT3-068対応] Start
				// 20141003  追加 [ON推-CT3-068対応] End
			}
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (isShippingPackingNo) {
			//出荷梱包No.で検品する場合、「出荷梱包No.→梱包ヘッダID→(梱包ボディID)→引当指示ボディID」方法で取得

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//梱包ボディリストのデータ存在確認
			if (lstPackingB.size() > 0) {
				for (TPackingB tPB : lstPackingB) {
					MProduct mProduct = new MProduct();
					mProduct = mProductBhv.selectByPKValue(tPB.getTAllocInstB().getProductId());
					if (mProduct == null) {
						this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
						return null;
					}
					// [Ver3.1][#5117] ロケ引当禁止チェック削除 2018.09.10 matsumoto Del
					// 20141003  追加 [ON推-CT3-068対応] End
					// 20141003  追加 [ON推-CT3-068対応] Start
				}
			}
			//梱包ボディリストのデータ存在しない場合エラー
			else {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
		}
		//[C-CWMS-0051]梱包計算対応  2015/11/18 NayZaw End

		// ===== 出荷検品データの取得 =====
		// エンティティ編集(出庫ヘッダ)
		tPickingH = new TPickingH();
		tPickingH.setCenterId(centerId);
		tPickingH.setClientId(clientId);
		tPickingH.setPickingWorkNo(pieceShippingInspectDto.data.search.getPickingWorkNo());
		// エンティティ編集(引当指示ヘッダ)
		tAllocInstH = new TAllocInstH();
		tAllocInstH.setCenterId(centerId);
		tAllocInstH.setClientId(clientId);

		// =====下記パラメータを設定して出荷検品データ取得.出荷検品データ取得メソッドを呼出し =====
		// 20141022  修正 [ON推-CT2-432対応] Start
		//List<TAllocInstB> page = pieceShippingInspectLogic.select( tAllocInstH, tPickingH, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));
		Boolean[] isFromInterrupt = new Boolean[] { pieceShippingInspectDto.data.search.isIsFromInterrupt() };
		List<TAllocInstB> page = pieceShippingInspectLogic.select(tAllocInstH, tPickingH, isFromInterrupt, errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		shippingDto.data.search.setIsFromInterrupt(isFromInterrupt[0]);
		// 20141022  修正 [ON推-CT2-432対応] End

		// 20141027  追加 [ON推-品質-新ｿﾘ-012対応] Start
		if (page.size() > 0) {

			List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
			TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
			tShippingInstHCB.query().setAllocInstHId_Equal(page.get(0).getAllocInstHId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
			//荷主ID（Client_ID）
			tShippingInstHCB.query().setClientId_Equal(clientId);
			//センタID（Center_ID）
			tShippingInstHCB.query().setCenterId_Equal(centerId);
			// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto Start
			tShippingInstHCB.query().addOrderBy_ShippingSlipNo_Asc();
			// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto End
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
			tShippingInstHList = tShippingInstHBhv.selectList(tShippingInstHCB);
			// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto Start
			LinkedHashSet<String> pickingWorkMessageList = new LinkedHashSet<>();

				for (TShippingInstH tshippingInstH : tShippingInstHList) {
					if (!CU.isNullOrEmpty(tshippingInstH.getPickingWorkMessage())){
						// 出庫作業メッセージが存在する場合
						pickingWorkMessageList.add(tshippingInstH.getPickingWorkMessage());
					}
				}

			shippingDto.data.search.setPickingWorkMessageSet(pickingWorkMessageList);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			shippingDto.data.search.setIsPackingNo(commonLogic.isShippingPackingNo(centerId, page.get(0).getPickingWorkNo()));
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto End
		}
		// 20141027  追加 [ON推-品質-新ｿﾘ-012対応] End

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja Start
		// パラメータマスタの荷材スキップとデフォルト荷材の取得処理を追加
		MClientCenter mc = new MClientCenter();
		mc.setClientId(clientId);
		mc.setCenterId(centerId);
		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mc);

		// 荷材選択スキップ 0：スキップしない、1：スキップする
		shippingDto.data.isBoxSelectSkip = mp.getBoxSelectSkip();

		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_MDeliveryCourse().withMCarrier().withMCommonCarrier();
		tShippingInstHCB.query().setAllocInstHId_Equal(tAllocInstH.getAllocInstHId());

		List<TShippingInstH> tShippingInstHList = tShippingInstHBhv.selectList(tShippingInstHCB);
		if (tShippingInstHList.size() > 0) {
			if (tShippingInstHList.get(0).getMDeliveryCourse() != null &&
				tShippingInstHList.get(0).getMDeliveryCourse().getMCarrier() != null &&
				tShippingInstHList.get(0).getMDeliveryCourse().getMCarrier().getMCommonCarrier() != null){
				// Bill of Lading出力対象フラグ
				shippingDto.data.bolOutputTargetFlg=tShippingInstHList.get(0).getMDeliveryCourse().getMCarrier()
						                         .getMCommonCarrier().getBolOutputTargetFlg();
			}
			else
			{
				shippingDto.data.bolOutputTargetFlg="0";
			}

		}
		// キャリアEDIシステム連携フラグ
		shippingDto.data.cesIntegationFlg = mp.getCesIntegrationFlg();
		// 納品明細書自動発行フラグ
		shippingDto.data.packingSlipAutoOutputFlg = mp.getPackingSlipAutoOutputFlg();
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (isPickingWorkNo) {
			//出庫作業No.で検品する場合
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// デフォルト荷材
			if (mp.getDefaultBoxId() != null) {
				MBoxCB cb = mBoxBhv.newMyConditionBean();
				cb.query().setCenterId_Equal(centerId);
				cb.query().setBoxId_Equal(mp.getDefaultBoxId());
				shippingDto.data.defaultBox = new MBoxDtoMapper().mappingToDto(mBoxBhv.selectEntityWithDeletedCheck(cb));
			}
		}
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja End

		// [Ver3.1][#5117]荷札自動発行ロジック変更に伴い荷札出力フラグの条件文削除 2018.09.19 matsumoto Del

		// ===== 出荷検品画面用DTOデータセット =====
		shippingDto.data.list = new TAllocInstBDtoMapper().mappingToDtoList(page);
		return shippingDto;
	}

	/**
	 * <h2>検品中断。</h2>
	 * <pre>
	 * 検品中断の組み立てを行う
	 * エラーがない場合は、データベースの出荷データを更新し、完了メッセージを設定する
	 * 更新データに次の値を設定する
	 * ・出荷ステータス
	 * ・出庫ステータス
	 *
	 * </pre>
	 * @param pieceShippingInspectDto 出荷検品画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/shippingInterrupt")
	public StatusDto shippingInterrupt(PieceShippingInspectDto pieceShippingInspectDto) throws IOException {

		//[C-CWMS-0051]梱包計算対応(出荷検品No．と出荷梱包No．で処理分ける）  2015/12/2 NayZaw Start

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

		String inputNo = pieceShippingInspectDto.data.search.getPickingWorkNo();
		TPickingH tPickingH = new TPickingH();
		TPackingH tPackingH = new TPackingH();
		TAllocInstH tAllocInstH = null;

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = pieceShippingInspectDto.data.search.getMCenter().getCenterId();

		boolean isPickingWorkNo = commonLogic.isPickingWorkNo(centerId, inputNo);
		boolean isShippingPackingNo = commonLogic.isShippingPackingNo(centerId, inputNo);

		if (isPickingWorkNo) {
			//出庫作業No.場合、出庫ヘッダを使用する

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== 登録データ組み立て =====
			// エンティティ編集(出庫ヘッダ)
			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
			// [EC-CT1-187] 出荷ステータスのチェックを追加 2015.04.03 kawana Start
			tPickingHCB.setupSelect_TAllocInstH();
			// [EC-CT1-187] 出荷ステータスのチェックを追加 2015.04.03 kawana End
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tPickingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPickingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPickingHCB.query().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End

			// 出庫ヘッダ
			tPickingH = tPickingHBhv.selectEntity(tPickingHCB);

			// 20141117 [ON推-CT4-224対応] Start
			if (tPickingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}
			// 20141117 [ON推-CT4-224対応] End
			// [EC-CT1-187] 出荷ステータスのチェックを追加 2015.04.03 kawana Start
			tAllocInstH = tPickingH.getTAllocInstH();

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (isShippingPackingNo) {
			//出荷梱包No.場合、梱包ヘッダを使用する

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== 登録データ組み立て =====
			// エンティティ編集(出庫ヘッダ)
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();

			tPackingHCB.setupSelect_TAllocInstH();
			// [EC-CT1-187] 出荷ステータスのチェックを追加 2015.04.03 kawana End
			tPackingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPackingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());

			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);

			if (tPackingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}

			tAllocInstH = tPackingH.getTAllocInstH();
		}

		if (tAllocInstH != null) {

			// 出荷指示ヘッダを取得
			tAllocInstHBhv.loadTShippingInstHList(tAllocInstH, new ConditionBeanSetupper<TShippingInstHCB>() {
				@Override
				public void setup(TShippingInstHCB instHCb) {
				}
			});

			// 出荷ステータスチェック
			for (TShippingInstH instH : tAllocInstH.getTShippingInstHList()) {
				if (!instH.isShippingStatus$40()) {
					// 検品中以外はエラー

					// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
					this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
					// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
					return null;
				}
			}
		}
		// [EC-CT1-187] 出荷ステータスのチェックを追加 2015.04.03 kawana End

		// [#3274] WAS連携対応 2018.01.12 kawana Start
		// 作業ユーザCD
		String updUserCd = pieceShippingInspectDto.data.search.getUserCd();
		// [#3274] WAS連携対応 2018.01.12 kawana End

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (isPickingWorkNo) {
			//出庫作業No.場合、出庫ヘッダを使用する

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// [#3274] WAS連携対応 2018.01.12 kawana Start
			tPickingH.setUpdUser(updUserCd);
			// [#3274] WAS連携対応 2018.01.12 kawana End
			// 検品ステータス(nullを設定)
			tPickingH.setPickingStatus(null);

			// ===== エンティティ編集 =====
			List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			List<TPickingH> tPickingHList = new ArrayList<TPickingH>();
			for (TAllocInstBDto tAllocInstBDto : pieceShippingInspectDto.data.list) {
				// 出庫ヘッダリスト
				// 荷主/センタ/担当者CD/出庫作業No./検品ステータス(nullを設定)
				tPickingHList.add(tPickingH);
				// 引当指示ボディリスト
				// 指示数/ 検品済数/ 検品残数/ 商品Id/ 商品コード/ 個口番号/ 荷材ID/ 単重量(グロス)/ 総重量(グロス)
				tAllocInstBList.add(new TAllocInstBDtoMapper().mappingToEntity(tAllocInstBDto));
			}

			// ===== 検品中断処理 =====
			// ===== 下記パラメータを設定して検品中断処理.検品中断メソッドを呼出し =====
			shippingInterruptLogic.insert(tAllocInstBList, tPickingHList, errRetSts(StatusCode.SHIPPING_INTERRUPT_INSERT_FAILED));
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (isShippingPackingNo) {
			//出荷梱包No.場合、梱包ヘッダを使用する

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// [#3274] WAS連携対応 2018.01.12 kawana Start
			tPackingH.setUpdUser(updUserCd);
			// [#3274] WAS連携対応 2018.01.12 kawana End
			// 検品ステータス(nullを設定)
			tPackingH.setPackingStatus(null);

			// ======エンティティ編集==========
			List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			List<TPackingH> tPackingHList = new ArrayList<TPackingH>();

			for (TAllocInstBDto tAllocInstBDto : pieceShippingInspectDto.data.list) {
				// 出庫ヘッダリスト
				// 荷主/センタ/担当者CD/出庫作業No./検品ステータス(nullを設定)
				tPackingHList.add(tPackingH);
				// 引当指示ボディリスト
				// 指示数/ 検品済数/ 検品残数/ 商品Id/ 商品コード/ 個口番号/ 荷材ID/ 単重量(グロス)/ 総重量(グロス)
				tAllocInstBList.add(new TAllocInstBDtoMapper().mappingToEntity(tAllocInstBDto));
			}

			// ===== 検品中断処理 =====
			// ===== 下記パラメータを設定して検品中断処理.検品中断メソッドを呼出し =====
			shippingInterruptLogic.insertWithPackingNo(tAllocInstBList, tPackingHList, errRetSts(StatusCode.SHIPPING_INTERRUPT_INSERT_FAILED));
		}

		//[C-CWMS-0051]梱包計算対応(出荷検品No．と出荷梱包No．で処理分ける）  2015/12/2 NayZaw End

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INTERRUPT_INSPECT_COMPLETE_INFORMATION);

		return null;
	}

	/**
	 * <h2>箱登録。</h2>
	 * <pre>
	 * 箱登録の組み立てを行う
	 * エラーがない場合は、データベースに梱包データを登録し、完了メッセージを設定する
	 * 更新データに次の値を設定する
	 * ・出荷ステータス
	 * ・出庫ステータス
	 *
	 * </pre>
	 * @param pieceShippingInspectDto 出荷検品画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/packingInsert")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("PieceShippingInspect")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
	//public StatusDto packingInsert(PieceShippingInspectDto pieceShippingInspectDto) throws IOException {
	public PieceShippingInspectDto packingInsert(PieceShippingInspectDto pieceShippingInspectDto) throws IOException {
	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
		// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/07 NayZaw Start

		String inputNo = pieceShippingInspectDto.data.search.getPickingWorkNo();
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		final long centerId = pieceShippingInspectDto.data.search.getMCenter().getCenterId();
		// 固定値取得
		boolean isPickingWorkNo = commonLogic.isPickingWorkNo(centerId, inputNo);
		boolean isShippingPackingNo = commonLogic.isShippingPackingNo(centerId, inputNo);

		// [#3274] WAS連携対応 2018.01.12 kawana Start

		// 作業ユーザCD
		String updUserCd = pieceShippingInspectDto.data.search.getUserCd();
		setWorkLogUserCd(updUserCd);

		// [#3274] WAS連携対応 2018.01.12 kawana End

		if (isPickingWorkNo) {
			//出庫作業No.で検品する場合の処理

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== ロケを引当禁止、商品出荷停止と取引先出荷停止のチェック =====
			// 登録データの組み立てのチェックデータ編集
			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tPickingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPickingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPickingHCB.query().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End
			// 出庫ヘッダ
			TPickingH tPickingH = new TPickingH();
			tPickingH = tPickingHBhv.selectEntity(tPickingHCB);
			if (tPickingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				// 20141117 [ON推-CT4-224対応] Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// 20141117 [ON推-CT4-224対応] End
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}
			// 引当指示ヘッダ
			//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI Start
			TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tAllocInstHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tAllocInstHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tAllocInstHCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End
			TAllocInstH tAllocInstH = new TAllocInstH();
			// 引当指示ヘッダ
			tAllocInstH = tAllocInstHBhv.selectEntity(tAllocInstHCB);

			// [EC-CT1-143] 出荷ステータスのチェックを追加 2015.03.26 kawana Start
			if (tAllocInstH != null) {

				// 出荷指示ヘッダを取得
				tAllocInstHBhv.loadTShippingInstHList(tAllocInstH, new ConditionBeanSetupper<TShippingInstHCB>() {
					@Override
					public void setup(TShippingInstHCB instHCb) {
					}
				});

				// 出荷ステータスチェック
				for (TShippingInstH instH : tAllocInstH.getTShippingInstHList()) {
					if (!instH.isShippingStatus$40()) {
						// 検品中以外はエラー

						// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
						this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
						// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
						return null;
					}
				}
			}
			// [EC-CT1-143] 出荷ステータスのチェックを追加 2015.03.26 kawana End

			// ===== 取引先出荷停止のチェック =====
			mCustomerBhv.selectByPKValue(tAllocInstH.getSupplyCustomerId());
			//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI End

			// 引当指示ヘッダ
			TAllocInstBCB tAllocInstBCB = tAllocInstBBhv.newMyConditionBean();
			tAllocInstBCB.query().setAllocInstHId_Equal(tAllocInstH.getAllocInstHId());
			List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			// 引当指示ボディリスト
			tAllocInstBList = tAllocInstBBhv.selectList(tAllocInstBCB);
			if (tAllocInstBList.size() == 0) {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
			for (TAllocInstB tAllocInstB : tAllocInstBList) {
				// ===== 商品出荷停止のチェック =====
				// 20141103 Start
				//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI Start
				//MProduct mProduct = new MProduct();
				//mProduct = mProductBhv.selectByPKValue(tAllocInstB.getProductId());

				//if (mProduct == null){
				//	this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				//	return null;
				//}
				//if (mProduct.isShippingStopFlg$1()){
				//	this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				//	return null;
				//}
				//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI End
				// 20141103 End

				// ===== 引当禁止のチェック =====
				// 20141003  追加 [ON推-CT3-089対応] Start
				List<TStockInout> stockInoutList = new ArrayList<TStockInout>();
				// 20141003  追加 [ON推-CT3-089対応] End
				TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
				tStockInoutCB.query().setAllocInstBId_Equal(tAllocInstB.getAllocInstBId());
				// 20141003  追加 [ON推-CT3-089対応] Start
				stockInoutList = tStockInoutBhv.selectList(tStockInoutCB);
				// 20141003  追加 [ON推-CT3-089対応] End
				// 20141003  削除 [ON推-CT3-089対応] Start
				//TStockInout tStockInout = new TStockInout();
				//tStockInout = tStockInoutBhv.selectEntity(tStockInoutCB);
				//if (tStockInout != null){
				//	if ( mLocationBhv.selectByPKValue(tStockBhv.selectByPKValue(tStockInout.getStockId()).getLocationId()).isAllocNgFlg$1()){
				//		this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
				//		return null;
				//	}
				//}
				// 20141003  削除 [ON推-CT3-089対応] End
				// 20141003  追加 [ON推-CT3-089対応] Start
				if (stockInoutList.size() > 0) {
					for (TStockInout tStockInout : stockInoutList) {
						if (tStockInout != null) {
							// 20141103 Start
							//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI Start
							//MLocation mLocation = new MLocation();
							//mLocation = mLocationBhv.selectByPKValue(tStockBhv.selectByPKValue(tStockInout.getStockId()).getLocationId());
							//if (mLocation == null){
							//	this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
							//	return null;
							//}
							//if ( mLocation.isAllocNgFlg$1()){
							//	this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
							//	return null;
							//}
							//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.26 KI End
							// 20141103 End
						}
					}
				}
				// 20141003  追加 [ON推-CT3-089対応] End
			}

			// ===== 登録データ組み立て =====
			// 箱登録データの組み立てエンティティ編集
			tPickingHCB = tPickingHBhv.newMyConditionBean();
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tPickingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPickingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPickingHCB.query().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End

			// 出庫ヘッダ
			tPickingH = new TPickingH();
			tPickingH = tPickingHBhv.selectEntity(tPickingHCB);
			// [#3274] WAS連携対応 2018.01.12 kawana Start
			tPickingH.setUpdUser(updUserCd);
			// [#3274] WAS連携対応 2018.01.12 kawana End

			// 梱包ボディリスト
			List<TPackingB> tPackingBList = new ArrayList<TPackingB>();

			// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana

			for(TAllocInstBDto tAllocInstBDto: pieceShippingInspectDto.data.list){
				// 梱包ボディ
				TPackingB tPackingB = new TPackingB();
				// 商品CD
				tPackingB.setProductCd(tAllocInstBDto.getProductCd());
				// 梱包数 = 検品済数
				tPackingB.setPackingNum(tAllocInstBDto.getSpgQtyOns());
				// 荷材ID
				tPackingB.setBoxId(tAllocInstBDto.getBoxId().toString());
				// 個口番号
				tPackingB.setBoxCd(tAllocInstBDto.getShippingPackingNo().toString());
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
				tPackingB.setWeight(tAllocInstBDto.getGrossWeight());
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
				tPackingBList.add(tPackingB);

				// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana
			}

			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			// 総数量
			BigDecimal spgQtyOnsUsedByLog = WCC.ZERO;
			// 画面に検品済数の合計
			for (TAllocInstBDto tAllocInstBDto : pieceShippingInspectDto.data.list) {
				// 梱包数 = 検品済数
				spgQtyOnsUsedByLog = WCC.add(spgQtyOnsUsedByLog, tAllocInstBDto.getSpgQtyOns());
			}
			setWorkLogQty(spgQtyOnsUsedByLog);
			//トレース項目
			setWorkLogTraceItem(inputNo);
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			// ===== 箱登録処理 =====
			// ===== 下記パラメータを設定して箱登録.箱登録メソッドを呼出し =====

			// ===== ASC =====
			Collections.sort(tPackingBList, new Comparator<TPackingB>() {
				public int compare(TPackingB arg0, TPackingB arg1) {
					return arg0.getBoxCd().compareTo(arg1.getBoxCd());
				};
			});

			// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引数削除 2018.02.07 kawana Start
			packingInsertLogic.insert(tPickingH, tPackingBList, errRetSts(StatusCode.PACKING_INSERT_FAILED));
			// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引数削除 2018.02.07 kawana End
			if (0 < getErrorManager().size()) {
				return null;
			}

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (isShippingPackingNo) {
			//出荷梱包No.で検品する場合の処理

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== ロケを引当禁止、商品出荷停止と取引先出荷停止のチェック =====
			// 登録データの組み立てのチェックデータ編集
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();

			tPackingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPackingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());

			// 梱包ヘッダ
			TPackingH tPackingH = new TPackingH();
			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);
			if (tPackingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}

			// 引当指示ヘッダ

			TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();

			tAllocInstHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tAllocInstHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tAllocInstHCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());

			TAllocInstH tAllocInstH = new TAllocInstH();
			// 引当指示ヘッダ
			tAllocInstH = tAllocInstHBhv.selectEntity(tAllocInstHCB);

			if (tAllocInstH != null) {

				// 出荷指示ヘッダを取得
				tAllocInstHBhv.loadTShippingInstHList(tAllocInstH, new ConditionBeanSetupper<TShippingInstHCB>() {
					@Override
					public void setup(TShippingInstHCB instHCb) {
					}
				});

				// 出荷ステータスチェック
				for (TShippingInstH instH : tAllocInstH.getTShippingInstHList()) {
					if (!instH.isShippingStatus$40()) {
						// 検品中以外はエラー

						// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
						this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
						// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
						return null;
					}
				}
			}
			// ===== 取引先出荷停止のチェック =====
			mCustomerBhv.selectByPKValue(tAllocInstH.getSupplyCustomerId());

			// 引当指示ヘッダ
			TAllocInstBCB tAllocInstBCB = tAllocInstBBhv.newMyConditionBean();
			tAllocInstBCB.query().setAllocInstHId_Equal(tAllocInstH.getAllocInstHId());
			List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			// 引当指示ボディリスト
			tAllocInstBList = tAllocInstBBhv.selectList(tAllocInstBCB);
			if (tAllocInstBList.size() == 0) {
				this.getErrorManager().add(this.errRetSts(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
			for (TAllocInstB tAllocInstB : tAllocInstBList) {

				// ===== 引当禁止のチェック =====
				// 20141003  追加 [ON推-CT3-089対応] Start
				List<TStockInout> stockInoutList = new ArrayList<TStockInout>();
				// 20141003  追加 [ON推-CT3-089対応] End
				TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
				tStockInoutCB.query().setAllocInstBId_Equal(tAllocInstB.getAllocInstBId());
				// 20141003  追加 [ON推-CT3-089対応] Start
				stockInoutList = tStockInoutBhv.selectList(tStockInoutCB);

				if (stockInoutList.size() > 0) {
					for (TStockInout tStockInout : stockInoutList) {
						if (tStockInout != null) {

						}
					}
				}
			}
			// ===== 登録データ組み立て =====
			// 箱登録データの組み立てエンティティ編集
			tPackingHCB = tPackingHBhv.newMyConditionBean();
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tPackingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPackingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End

			// 梱包ヘッダ
			tPackingH = new TPackingH();
			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);
			// [#3274] WAS連携対応 2018.01.12 kawana Start
			tPackingH.setUpdUser(updUserCd);
			// [#3274] WAS連携対応 2018.01.12 kawana End

//			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.07 sja Start
//			// 荷材ID
//			tPackingH.setBoxId(pieceShippingInspectDto.data.defaultBox.getBoxId());
//			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.07 sja End

			// 梱包ボディリスト
			List<TPackingB> tPackingBList = new ArrayList<TPackingB>();
			// 引当指示ヘッダリスト
			List<TAllocInstH> tAllocInstHList = new ArrayList<TAllocInstH>();
			for (TAllocInstBDto tAllocInstBDto : pieceShippingInspectDto.data.list) {
				// 梱包ボディ
				TPackingB tPackingB = new TPackingB();
				// 商品CD
				tPackingB.setProductCd(tAllocInstBDto.getProductCd());
				// 梱包数 = 検品済数
				tPackingB.setPackingNum(tAllocInstBDto.getSpgQtyOns());
				// 荷材ID
				//	tPackingB.setBoxId(tAllocInstBDto.getBoxId().toString());
				// 個口番号
				//	tPackingB.setBoxCd(tAllocInstBDto.getShippingPackingNo().toString());

				tPackingBList.add(tPackingB);

				// 引当指示ヘッダリスト
				tAllocInstH = new TAllocInstH();
				// 引当指示ヘッダID
				tAllocInstH.setAllocInstHId(tAllocInstBDto.getAllocInstHId());
				tAllocInstH.setIsChanged(false);
				tAllocInstHList.add(tAllocInstH);
			}

			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			// 総数量
			BigDecimal spgQtyOnsUsedByLog = WCC.ZERO;
			// 画面に検品済数の合計
			for (TAllocInstBDto tAllocInstBDto : pieceShippingInspectDto.data.list) {
				// 梱包数 = 検品済数
				spgQtyOnsUsedByLog = WCC.add(spgQtyOnsUsedByLog, tAllocInstBDto.getSpgQtyOns());
			}
			setWorkLogQty(spgQtyOnsUsedByLog);
			//トレース項目
			setWorkLogTraceItem(inputNo);
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			tPackingH.setTPackingBList(tPackingBList);

			packingInsertLogic.insertByPackingNo(tPackingH, errRetSts(StatusCode.PACKING_INSERT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/07 NayZaw End

		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		// 荷主ID
		Long clientId = pieceShippingInspectDto.data.search.getMClient().getClientId();
		// パラメータマスタの納品明細書自動発行フラグとキャリアEDIシステム連携フラグの取得処理
		MClientCenter mc = new MClientCenter();
		mc.setClientId(clientId);
		mc.setCenterId(centerId);
		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mc);
		// キャリアEDIシステム連携フラグ
		String cesIntegationFlg = mp.getCesIntegrationFlg();

		String zplData="";

		// パラメータマスタ.キャリアEDIシステム連携フラグが'1'(連携する)場合
		if ("1".equals(cesIntegationFlg)) {
			// 全ての出荷検品完了時、キャリアへ出荷データを受け渡すために以下のウェブサービスをコールする。

			// ===== コントロールNo.設定 =====
			zplData = pieceShippingInspectLogic.getWebService(centerId, clientId,inputNo, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

			if (0 < getErrorManager().size()) {
				return null;
			}
		}
		PieceShippingInspectDto rtnDto = new PieceShippingInspectDto();
		rtnDto.data.zplData =zplData;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

		// 完了メッセージの設定
		// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe Start
		if (getWarnManager().size() == 0) {
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
			return rtnDto;
		}
		// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe End
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		//return null;
		return rtnDto;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
	}

	/**
	 * <h2>クリア削除。</h2>
	 * <pre>
	 * クリア削除の組み立てを行う
	 * エラーがない場合は、データベースの出荷データを更新し、完了メッセージを設定する
	 * 更新データに次の値を設定する
	 * ・出荷ステータス
	 * ・出庫ステータス又は梱包ステータス
	 *
	 * </pre>
	 * @param pieceShippingInspectDto 出荷検品画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/pieceShippingInspectClear")
	public StatusDto pieceShippingInspectClear(PieceShippingInspectDto pieceShippingInspectDto) throws IOException {

		// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/03 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		// 出庫ヘッダ
		TPickingH tPickingH = new TPickingH();

		final long centerId = pieceShippingInspectDto.data.search.getMCenter().getCenterId();
		final String inputNo = pieceShippingInspectDto.data.search.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, inputNo)) {
			//出庫作業No．で検品する場合、

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== 登録データ組み立て =====
			// 登録データの組み立てのチェックデータ編集
			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			tPickingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPickingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPickingHCB.query().setPickingWorkNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End

			tPickingH = tPickingHBhv.selectEntity(tPickingHCB);

			// 20141117 [ON推-CT4-224対応] Start
			if (tPickingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}
			// 20141117 [ON推-CT4-224対応] End

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, inputNo)) {
			//出荷梱包No.で検品する場合、

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// ===== 登録データ組み立て =====
			// 登録データの組み立てのチェックデータ編集
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.query().setCenterId_Equal(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPackingHCB.query().setClientId_Equal(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(pieceShippingInspectDto.data.search.getPickingWorkNo());
			// 梱包ヘッダ
			TPackingH tPackingH = new TPackingH();
			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);

			if (tPackingH == null) {
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana Start
				this.getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_INSPECT_SELECT_FAILED), WmsMessageConst.SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR);
				// [#7379][OSS] 出荷検品時の他ユーザ変更のエラーメッセージを変更 2020.05.08 kawana End
				return null;
			}
			// 梱包No.で検品する場合、出庫ヘッダ(tPickingH)にデータが無いためpieceShippingInspectClearLogic.delete() メソッドの引数用として必要なデータだけtPickingH設定する。
			tPickingH.setCenterId(pieceShippingInspectDto.data.search.getMCenter().getCenterId());
			tPickingH.setClientId(pieceShippingInspectDto.data.search.getMClient().getClientId());
			tPickingH.setPickingWorkNo(pieceShippingInspectDto.data.search.getPickingWorkNo());
		}
		// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/03 NayZaw End

		// 引当指示ヘッダ
		TAllocInstH tAllocInstH = new TAllocInstH();
		// 引当指示ヘッダID
		tAllocInstH.setAllocInstHId(pieceShippingInspectDto.data.list.get(0).getAllocInstHId());

		// ===== クリア削除処理 =====
		// ===== 下記パラメータを設定して出荷検品クリア処理.クリア処理メソッドを呼出し  =====
		pieceShippingInspectClearLogic.delete(tAllocInstH, tPickingH, errRetSts(StatusCode.CLEAR_DELETE_FAILED));

		// 完了メッセージの設定
		// 20141009  追加 [ON推-CT2-430対応] Start
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSPECT_RESULT_CLEAR_COMPLETED_INFORMATION);
		// 20141009  追加 [ON推-CT2-430対応] End

		return null;
	}

	//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
	/**
	 * <h2>荷姿入数の取得。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 荷主ID、センタID、商品IDで、入数（ピース荷姿入数、ケース荷姿入数）を取得する
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param productId 商品ID
	 * @return PieceShippingInspectDto 出荷検品画面用DTO
	 */
	@GET
	@Path("/getUnitNum")
	public PieceShippingInspectDto getUnitNum(@QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId, @QueryParam("productId") Long productId) {

		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL

		Long unitNumP = 0L;//ピース荷姿入数
		Long unitNumC = 0L;//ケース荷姿入数

		MClientCenter mc = new MClientCenter();
		mc.setClientId(clientId);
		mc.setCenterId(centerId);

		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mc);

		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
		MProductShape searchCondition = new MProductShape();
		searchCondition.setProductId(productId);

		if (mp != null) {
			// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
		}

		PieceShippingInspectDto dto = new PieceShippingInspectDto();
		dto.data.unitNumP = unitNumP;
		dto.data.unitNumC = unitNumC;

		return dto;
	}

	//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start

	/**
	 * <h2>荷札自動印刷。</h2>
	 * <pre>
	 * 荷札発行ロジックを使用し、荷札を自動印刷する。
	 * </pre>
	 * @param tagLabelPrintParamDto 荷札発行用パラメータDTO
	 * @return 発行処理を通した荷札発行用パラメータDTO
	 */
	@POST
	@Path("/printAutoTagLabel")
	public TagLabelPrintParamDto printAutoTagLabel(final TagLabelPrintParamDto tagLabelPrintParamDto) {

		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final long clientId = tagLabelPrintParamDto.data.clientId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;
		final boolean isShippingPackingNo = tagLabelPrintParamDto.data.isShippingPackingNo;

		// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto Start
		// パラメータマスタ取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto End

		if (isShippingPackingNo) {
			// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto Start
			// 出荷梱包No.単位の検品
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.query().setCenterId_Equal(centerId);
			tPackingHCB.query().setClientId_Equal(clientId);
			tPackingHCB.query().setShippingPackingNo_Equal(targetNo);

			List<TPackingH> packingHList = tPackingHBhv.selectList(tPackingHCB);

			// ===== 印刷実行 =====
			shippingInspectAutoPrintLogic.printPiecePackingH(packingHList, mParam, errRetSts(StatusCode.TAG_LABEL_PRINT_FAILED));
			// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto End
			if (0 < getErrorManager().size()) {
				return null;
			}


		} else {
			// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto Start
			// 出庫作業No.の検品
			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
			tPickingHCB.query().setCenterId_Equal(centerId);
			tPickingHCB.query().setClientId_Equal(clientId);
			tPickingHCB.query().setPickingWorkNo_Equal(targetNo);

			List<TPickingH> pickingHList = tPickingHBhv.selectList(tPickingHCB);

			// ===== 印刷実行 =====
			shippingInspectAutoPrintLogic.printPiecePickingH(pickingHList, mParam, errRetSts(StatusCode.TAG_LABEL_PRINT_FAILED));
			// [Ver3.1][#5117]荷札発行時使用ロジック変更 2018.09.12 matsumoto End

			if (0 < getErrorManager().size()) {
				return null;
			}

		}

		return tagLabelPrintParamDto;
	}
	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End

	// 米国出荷ドキュメント追加対応 2017.01.16 HAN Start
	/**
	 * <h2>Packing Slip。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 * ・Bill of Lading出力フラグ
	 * </pre>
	 * @param dto Packing Slip画面用DTO
	 * @return packingSlipListPrintDto 処理結果DTO
	 */

	@GET
	@Path("/printPackingSlip")
	public TagLabelPrintParamDto printPackingSlip(final TagLabelPrintParamDto tagLabelPrintParamDto) throws Exception {

		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final long clientId = tagLabelPrintParamDto.data.clientId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;
		final boolean isShippingPackingNo = tagLabelPrintParamDto.data.isShippingPackingNo;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo更新
		TPickingR update = new TPickingR();

		TAllocInstH tAllocInstH = new TAllocInstH();

		TPickingH tPickingH = new TPickingH();

		TPickingR tPickingR = new TPickingR();

		TShippingInstH tShippingInstH = new TShippingInstH();

        //エンティティ編集
        update.setControlNo(controlNo);

		tPickingH.setCenterId(centerId);

		tPickingH.setClientId(clientId);

		if (isShippingPackingNo) {
			// 出荷梱包No.単位の検品
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.setupSelect_TPickingH();
			tPackingHCB.query().setCenterId_Equal(centerId);
			tPackingHCB.query().setClientId_Equal(clientId);
			tPackingHCB.query().setShippingPackingNo_Equal(targetNo);

			// 梱包ヘッダ
			TPackingH tPackingH = tPackingHBhv.selectEntity(tPackingHCB);

			if (tPackingH == null) {
				return null;
			}
        	 //出庫作業No.
            tPickingH.setPickingWorkNo(tPackingH.getTPickingH().getPickingWorkNo());
        }
        else {
        	// 出庫作業No.の検品
        	 //出庫作業No.
            tPickingH.setPickingWorkNo(targetNo);
        }

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
        packingSlipListPrintLogic.updateControlNo(update, tPickingH, tAllocInstH, tPickingR, tShippingInstH, errRetSts(StatusCode.UPDATE_EXCEPTION));

        if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

        //出庫帳票(検索用)
        tPickingR.setControlNo(update.getControlNo());

        //Packing Slipデータ取得メソッドを呼出し
        ListResultBean<SqlPackingSlipListPrint> tPickingHList = packingSlipListPrintLogic.select(null,update, errRetSts(StatusCode.NOT_FOUND_DATA));

        if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

        // 帳票出力データ取得処理
        List<PackingSlipListDto> dataList = new ArrayList<PackingSlipListDto>();

        for (SqlPackingSlipListPrint head: tPickingHList) {
        	PackingSlipListDto redto = new PackingSlipListDto();

    	    redto.cultureId = getCultureId();
    	    // ヘッダ部
    	    //帳票CD
    	    redto.reportCd = REPORT_CD;

    		//荷主
    	    redto.clientCd = head.getClientCd();

    		//荷主名称
    	    redto.clientNm = head.getClientNm();

    		//荷主センタ住所１
    	    redto.clientAddress1 = head.getClientAddress1();

    		//荷主センタ住所２
    	    redto.clientAddress2 = head.getClientAddress2();

    		//荷主センタ住所３
    	    redto.clientAddress3 = head.getClientAddress3();

    		//荷主電話番号
    	    redto.clientTelNo = head.getClientTelNo();

    		//出荷日
    	    redto.shippingDt = head.getShippingDt();

    		//オーダーNo
    	    redto.clientShippingNo = head.getClientShippingNo();

    		//請求先名称
    	    redto.supplyCustomerNm = head.getSupplyCustomerNm();

    		//請求先住所１
    	    redto.billAddress1 = head.getBillAddress1();

    		//請求先住所２
    	    redto.billAddress2 = head.getBillAddress2();

    		//請求先住所３
    	    redto.billAddress3 = head.getBillAddress3();

    		//請求先電話番号
    	    redto.billTelNo = head.getBillTelNo();

    		//出荷先名称
    	    redto.delivCustomerNm = head.getDelivCustomerNm();

    		//請求先住所１
    	    redto.delivAddress1 = head.getDelivAddress1();

    		//出荷先住所２
    	    redto.delivAddress2 = head.getDelivAddress2();

    		//出荷先住所３
    	    redto.delivAddress3 = head.getDelivAddress3();

    		//出荷先電話番号
    	    redto.delivTelNo = head.getDelivTelNo();

    		//商品コード
    	    redto.productCd = head.getProductCd();

    		//商品名称
    	    redto.productNm = head.getProductNm();

    		//数量
    	    redto.allocNum = head.getAllocNum();

			dataList.add(redto);
		}

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(REPORT_CD);

		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD), "1");
		// 自動印刷対象がnullの場合
		if (pReportLayout == null) {
			pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD), "0");
		}

		autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
		autoPrintParamDto.printBasicData.caltureId=getCultureId();
		//印刷内容
		autoPrintParamDto.printBasicData.outputData = json.format(dataList);
		//梱包帳票を発行する
	    autoPrintLogic.print(autoPrintParamDto);

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//出庫帳票更新
		update.setControlNo(null);
        // 納品明細書出力フラグ
		update.setPackingOutFlg_$1();
		// 納品明細書出力者ID
		update.setPackingOutUserId(this.getUserId());
        // 納品明細書出力日時
		update.setPackingOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		packingSlipListPrintLogic.updatePrOutFlg(update, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return tagLabelPrintParamDto;
	}
	// 米国出荷ドキュメント追加対応 2017.01.16 HAN End
}

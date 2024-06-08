package com.oneslogi.wms.logic.shipping;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.ListResultBean;

import com.hitachitransport.CarrierEDIWebServiceSoapStub;
import com.hitachitransport.ShipmentRequestHeader;
import com.hitachitransport.ShipmentRequestPackage;
import com.hitachitransport.ShipmentRequestProduct;
import com.hitachitransport.ShipmentResponse;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfWShippingInterrupt;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShipmentRequestHeaderPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShipmentRequestProductPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingInspectPmb;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestHeader;
import com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestPackage;
import com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestProduct;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingInspect;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.enums.print.OutputFileType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.print.logic.PdfFileSaveLogic;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 出荷検品データ取得クラス
 */
public class PieceShippingInspectLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	//  StartキャリアEDIシステム(CES)連携対応 2017.01.09 HAN
	@Inject
	private PdfFileSaveLogic pdfFileSaveLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	// キャリアEDIシステム(CES)連携対応 2017.01.09 HAN End
	// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana Start
	@Inject
	private ProductLogic productLogic;
	// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana End

	// ===== 使用テーブル =====
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	// [Ver3.0] unit of measure対応 2017.11.20 ライ DEL
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana
	//[C-CWMS-0051] 1センタに対して商品荷姿マスタにデータが複数ある為、使用している荷姿IDで対応 2015.12.21 NayZaw Start
	@Inject
	private MParamBhv mParamBhv;
	//[C-CWMS-0051] 1センタに対して商品荷姿マスタにデータが複数ある為、使用している荷姿IDで対応 2015.12.21 NayZaw End
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0] unit of measure対応 2017.11.20 ライ END
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End
	// キャリアEDIシステム(CES)連携対応 2017.01.09 HAN Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private ClientCenterLogic clientCenterLogic;

	/** 自動発行区分 */
	private enum AutoPrint {
		TRUE,
		FALSE
	}

	/** 印刷データ種別 */
	private enum PrintDataType {
		DATA,
		PDF
	}
	// キャリアEDIシステム(CES)連携対応 2017.01.09 HAN End

	/**
	 * <h2>出荷検品データを取得する。</h2>
	 * <pre>
	 * 出荷検品・出庫作業No.と出荷検品・出荷梱包No.の採番固定値取得を行って、
	 * 採番固定値より、出庫作業No.か出荷梱包No.かを判断する。
	 *
	 * 出荷検品中断を検索し、対象のデータが存在する場合、
	 * 取得したデータを引当指示ボディデータに設定し、出荷検品中断テーブルを削除する。
	 * 出庫作業No.で検品する場合、
	 * 【出荷ステータス更新クラス.出荷検品開始】、【出荷状態チェッククラス.出荷検品再開】を行う。
	 * 出荷梱包No.で検品する場合、
	 * 【出荷状態チェッククラス.出荷検品再開(出荷梱包No.で検品時)】、【出荷ステータス更新クラス.出荷検品開始(出荷梱包No.で検品時)】を行う。
	 *
	 * 出荷検品中断にデータが存在しない場合、外出しSQLを使用し出荷検品対象を取得する。
	 * 取得したデータを引当指示ボディデータに設定する。
	 * 出庫作業No.で検品する場合、
	 * 【出荷ステータス更新クラス.出荷検品開始】、【出荷状態チェッククラス.出荷検品再開】を行う。
	 * 出荷梱包No.で検品する場合、
	 * 【出荷状態チェッククラス.出荷検品再開(出荷梱包No.で検品時)】、【出荷ステータス更新クラス.出荷検品開始(出荷梱包No.で検品時)】を行う。
	 *
	 * 検品対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 *【出荷状態チェッククラス.出荷検品再開】
	 * ・{@link ShipStatusCheckLogic#inspectRestart(List, List, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品再開メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新クラス.出荷検品開始】
	 * ・{@link ShipStatusUpdateLogic#inspectStart(List,com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始ステータス更新メソッド}を呼び出す。
	 *
	 *【出荷状態チェッククラス.出荷検品再開(出荷梱包No.で検品時)】
	 * ・{@link ShipStatusCheckLogic#packingInspectRestart(List, List, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品(出荷梱包No)再開メソッド}を呼び出す。
	 *
	 *【出荷ステータス更新クラス.出荷検品開始(出荷梱包No.で検品時)】
	 * ・{@link ShipStatusUpdateLogic#inspectStart(List,com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始ステータス更新(出荷梱包Noで検品場合)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：センタID・荷主ID
	 * @param tPickingH 出庫ヘッダ：センタID・荷主ID・出庫作業No.
	 * @param isFromInterrupt 出荷検品中断かどうか
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TAllocInstB> 引当指示ボディリスト
	 */
	public List<TAllocInstB> select(TAllocInstH tAllocInstH,
			TPickingH tPickingH,
			Boolean[] isFromInterrupt,
			ErrorStatus errSts) {

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

		// ===== 引当指示ボディリスト =====
		List<TAllocInstB> result = new ArrayList<TAllocInstB>();

		// ===== 検品中断データ取得 =====

		List<WShippingInterrupt> wShippingInterruptList = null;
		// 出荷検品中断テーブル
		WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
		wShippingInterruptCB.checkInvalidQuery();
		// 20141103(不要処理削除)

		// 商品マスタ
		wShippingInterruptCB.setupSelect_MProduct();

		//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正 2016/1/13 chou 削除

		// 引当指示ヘッダ.荷主ID
		wShippingInterruptCB.query().setClientId_Equal(tAllocInstH.getClientId());
		// 引当指示ヘッダ.センタID
		wShippingInterruptCB.query().setCenterId_Equal(tAllocInstH.getCenterId());
		// 出庫ヘッダ.出庫作業No.
		wShippingInterruptCB.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		// 梱包中断データ取得
		wShippingInterruptList = wShippingInterruptBhv.selectList(wShippingInterruptCB);

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = tAllocInstH.getCenterId();
		final String targetNo = tPickingH.getPickingWorkNo();

		boolean isPickingWorkNo = commonLogic.isPickingWorkNo(centerId, targetNo);
		boolean isShippingPackingNo = commonLogic.isShippingPackingNo(centerId, targetNo);

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

		// ===== 検品中断データが存在する場合 =====
		if (wShippingInterruptList.size() != 0) {
			// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			wShippingInterruptBhv.load(wShippingInterruptList, new ReferrerLoaderHandler<LoaderOfWShippingInterrupt>() {
				@Override
				public void handle(LoaderOfWShippingInterrupt loader) {
					loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
						@Override
						public void setup(MProductShapeCB subCB) {
							subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
							subCB.query().setDelFlg_Equal_$0();
							subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						}
					});
				}
			});
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			Map<Long, String> decimalExistFlgMap = new HashMap<>();
			Map<Long, String> minimumUnitMap = new HashMap<>();
			Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
			Map<Long, List<String>> parentUnitMap = new HashMap<>();
			// [Ver3.0] unit of measure対応 2017.11.20 ライ Start

			for (WShippingInterrupt interrupt : wShippingInterruptList) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, interrupt.getMProduct());
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

				// ===== 検索結果をリターンの引当指示ボディリストにセット =====
				TAllocInstB tAllocInstB = new TAllocInstB();
				// 荷主ID
				tAllocInstB.setClientId(interrupt.getClientId());
				// センタID
				tAllocInstB.setCenterId(interrupt.getCenterId());
				// 出庫作業No.
				tAllocInstB.setPickingWorkNo(tPickingH.getPickingWorkNo());
				// 引当指示ヘッダID
				tAllocInstB.setAllocInstHId(interrupt.getAllocInstHId());
				// 担当者CD
				tAllocInstB.setUpdUser(interrupt.getUserCd());
				// 20141103(不要処理削除)
				TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
				tAllocInstHCB.setupSelect_MDeliveryCourse();
				tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrier();
				tAllocInstHCB.query().setAllocInstHId_Equal(interrupt.getAllocInstHId());
				TAllocInstH tAllocInstHTemp = tAllocInstHBhv.selectEntity(tAllocInstHCB);
				// 納品先CD
				tAllocInstB.setSupplyCustomerCd(tAllocInstHTemp.getSupplyCustomerCd());
				// 納品先名称
				tAllocInstB.setSupplyCustomerNm(tAllocInstHTemp.getSupplyCustomerNm());
				// 配送コースCD
				tAllocInstB.setDeliveryCourseCd(tAllocInstHTemp.chaseMDeliveryCourse().getDeliveryCourseCd());
				// 配送コース名称
				tAllocInstB.setDeliveryCourseNm(tAllocInstHTemp.chaseMDeliveryCourse().getDeliveryCourseNm());
				// 運送業者CD
				tAllocInstB.setCarrierCd(tAllocInstHTemp.chaseMDeliveryCourse().chaseMCarrier().getCarrierCd());
				// 20141103 End
				// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana Start
				// 運送業者名称
				tAllocInstB.setCarrierNm(tAllocInstHTemp.chaseMDeliveryCourse().chaseMCarrier().getCarrierNm());
				// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana End

				// 商品ID
				tAllocInstB.setProductId(interrupt.getProductId());
				// JANCD
				tAllocInstB.setJanCd(interrupt.getMProduct().getJanCd());
				// 商品CD
				tAllocInstB.setProductCd(interrupt.getMProduct().getProductCd());
				// 商品名称
				tAllocInstB.setProductNm(interrupt.getMProduct().getProductNm());
				// 商品略称
				tAllocInstB.setProductAbbr(interrupt.getMProduct().getProductAbbr());
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				//商品单位
				tAllocInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, interrupt.getMProduct()));
				// 入数内訳
				tAllocInstB.setUnitNumBreakdownP(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, interrupt.getMProduct()));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				// 指示数 --> 総検品数
				// 20141011 SJA_ZHU 修正 [ON推-CT2-342対応] Start
				tAllocInstB.setInstNum(interrupt.getInstNum());
				// 20141011 SJA_ZHU 修正 [ON推-CT2-342対応] End
				// 検品済数 --> 検品済総数
				tAllocInstB.setSpgQtyOns(interrupt.getSpgQtyOns());
				// 検品残数
				tAllocInstB.setSpgQtyRemain(interrupt.getSpgQtyRemain());
				// 個口番号
				// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] Start
				tAllocInstB.setShippingPackingNo(interrupt.getPieceNo());
				// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] End
				// 荷材ID
				tAllocInstB.setBoxId(interrupt.getBoxId());
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				tAllocInstB.setMProduct(interrupt.getMProduct());
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				// [横並-076] Long→BigDecimalを変更 2014.12.03 kei Start

				//出荷検品中断テーブルで無い項目為商品毎に商品荷姿マスタから「商品重量(g)」と「総重量(g)」を取得  2015/09/25 Nay Zaw UPDATE Start

				//[C-CWMS-0051] 梱包計算対応後、MProductShapeが1行より多くなる為、Listに変更 2015.12.17 NayZaw Start

				MParamCB mParamCB = mParamBhv.newMyConditionBean();
				mParamCB.query().queryMClientCenter().setClientId_Equal(tPickingH.getClientId());
				mParamCB.query().queryMClientCenter().setCenterId_Equal(tPickingH.getCenterId());

				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou Start
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou End

				MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
				mProductShapeCB.query().setProductId_Equal(interrupt.getProductId());
				// [#4655][v3.0] ピース荷姿取得不正を修正 2018.05.25 kawana Start
				mProductShapeCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				// [#4655][v3.0] ピース荷姿取得不正を修正 2018.05.25 kawana End
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				List<MProductShape> lstMProductShape = mProductShapeBhv.selectList(mProductShapeCB) ;
//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou Start
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				if(lstMProductShape == null || lstMProductShape.size() == 0){
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou End
					// 対象データなし
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return null;
				}
				MProductShape mProductShape = lstMProductShape.get(0);
				//[C-CWMS-0051] 梱包計算対応後、MProductShapeが1行より多くなる為、Listに変更 2015.12.17 NayZaw End
				// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana Start
				// 商品重量(g)・総重量(g)
				if(productLogic.existDecimal(interrupt.getProductId())) {
					// 小数を含む商品

					tAllocInstB.setNetWeight(WCC.ZERO);
					tAllocInstB.setGrossWeight(WCC.ZERO);
				} else {
					// 小数を含まない商品

					// 商品重量(g)
					tAllocInstB.setNetWeight(mProductShape.getNetWeight());
					// [ON推-品向-1011] 出荷検品再開で致命的エラー 2015.11.11 kawana Start
					if (mProductShape.getNetWeight() != null) {
						// 総重量(g)
						tAllocInstB.setGrossWeight(WCC.multiply(mProductShape.getNetWeight(), interrupt.getInstNum()));
					}
					// [ON推-品向-1011] 出荷検品再開で致命的エラー 2015.11.11 kawana End
				}
				// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana End
				// [横並-076] Long→BigDecimalを変更 2014.12.03 kei End

				//出荷検品中断テーブルで無い項目為商品毎に商品荷姿マスタから「商品重量(g)」と「総重量(g)」を取得  2015/09/25 Nay Zaw UPDATE End

				// 商品入数
//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou Start
				tAllocInstB.setUnitNum(mProductShape.getUnitNum());
//[C-CWMS-0049]商品荷姿マスタの荷姿入数の取得方法修正  2016/1/13 chou Start
				//未検品のみ表示
				// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] Start
				if(interrupt.getPieceNo() == null){
				// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] End
					tAllocInstB.setShpCheckDisplay(0l);
				}else{
					tAllocInstB.setShpCheckDisplay(1l);
				}
				result.add(tAllocInstB);
			};

			// 20141022 SJA_ZHU 追加 [ON推-CT2-432対応] Start
			if (!isFromInterrupt[0]) {
				isFromInterrupt[0] = true;
				return result;
			}
			// 20141022 SJA_ZHU 追加 [ON推-CT2-432対応] End

			// [#375][2.1.0-CT-072] ケースのみの出荷データを出荷検品すると致命的エラー 2016.12.02 kawana Start

			// ===== データ存在チェック =====
			if (result.size() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return result;
			}

			// [#375][2.1.0-CT-072] ケースのみの出荷データを出荷検品すると致命的エラー 2016.12.02 kawana End

			// ===== 出荷検品中断テーブルの削除実行 =====
			wShippingInterruptBhv.batchDelete(wShippingInterruptList);

			//[C-CWMS-0051]梱包計算対応(出荷検品No．と出荷梱包No．で処理分ける）  2015/12/3 NayZaw Start

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

			if (isPickingWorkNo) {
				// 出庫作業No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				//====== 出庫作業No．で検品する場合 =============
				// ===== 下記パラメータを設定して、出荷状態チェッククラス.出荷検品再開メソッドを呼出し =====
				TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
				tPickingHCB.query().setCenterId_Equal(tAllocInstH.getCenterId());
				tPickingHCB.query().setClientId_Equal(tAllocInstH.getClientId());
				tPickingHCB.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
				List<TPickingH> tPickingHList = tPickingHBhv.selectList(tPickingHCB);
				if (tPickingHList.size() > 0) {
					shipStatusCheckLogic.inspectRestart(null, null, tPickingHList, null, errSts);
					// ===== エラーの場合、処理終了 =====
					if (this.getErrorManager().get().size() > 0) {
						return result;
					}
					// ===== 出荷検品開始状態更新 =====
					// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品開始メソッドを呼出し =====
					shipStatusUpdateLogic.inspectStart(tPickingHList, errSts);
				}
				// 20141010 SJA_ZHU 追加 [ON推-CT2-432対応] (不要処理削除)

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			} else if (isShippingPackingNo) {
				// 出荷梱包No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				//====== 出荷梱包No．で検品する場合 =============
				// ===== 下記パラメータを設定して、梱包状態チェッククラス.出荷検品再開メソッドを呼出し =====
				TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
				tPackingHCB.query().setCenterId_Equal(tAllocInstH.getCenterId());
				tPackingHCB.query().setClientId_Equal(tAllocInstH.getClientId());
				tPackingHCB.query().setShippingPackingNo_Equal(tPickingH.getPickingWorkNo());
				List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);
				if (tPackingHList.size() > 0) {
					shipStatusCheckLogic.packingInspectRestart(null, null, tPackingHList, null, errSts);
					// ===== エラーの場合、処理終了 =====
					if (this.getErrorManager().get().size() > 0) {
						return result;
					}
					// ===== 出荷検品開始状態更新 =====
					// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品開始メソッドを呼出し =====
					shipStatusUpdateLogic.packingInspectStart(tPackingHList, errSts);
				}
			}
			//[C-CWMS-0051]梱包計算対応(出荷検品No．と出荷梱包No．で処理分ける）  2015/12/3 NayZaw End

		} else {
			// ===== 検品中断データが存在しない場合 =====

			// [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana Start
			String path = MProductBhv.PATH_selectSqlShippingInspect;
			// 検索条件の設定
			SqlShippingInspectPmb pmb = new SqlShippingInspectPmb();
			pmb.setCenterId(tAllocInstH.getCenterId());
			pmb.setClientId(tAllocInstH.getClientId());

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			if (isPickingWorkNo) {
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
				pmb.setPickingWorkNo(tPickingH.getPickingWorkNo());
			} else {
				pmb.setPackingNo(tPickingH.getPickingWorkNo());
			}
			// [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana End

			// 検索実行
			Class<SqlShippingInspect> entityType = SqlShippingInspect.class;
			//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/07 Start
			ListResultBean<SqlShippingInspect> resultList = selectList(mProductBhv, path, pmb, entityType);
			//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/07 End

			// ===== 取得したデータが存在場合 =====
			if (resultList.size() != 0) {
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				List<MProduct> mProductList = new ArrayList<MProduct>();
				for (SqlShippingInspect sqlReuslt : resultList) {
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					if (sqlReuslt.prepareDomain() != null) {
						mProductList.add(sqlReuslt.prepareDomain());
					}
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				}

				// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
				mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
					public void setup(MProductShapeCB cb) {
						cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
						cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						cb.query().setDelFlg_Equal_$0();
					}
				});

				Map<Long, String> decimalExistFlgMap = new HashMap<>();
				Map<Long, String> minimumUnitMap = new HashMap<>();
				Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
				Map<Long, List<String>> parentUnitMap = new HashMap<>();
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				// ===== 検索結果をリターンの引当指示ボディリストにセット =====
				for (SqlShippingInspect sqlReuslt : resultList) {

					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
					WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, sqlReuslt.prepareDomain());
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

					// ===== 検索結果をリターンの引当指示ボディリストにセット =====
					TAllocInstB tAllocInstB = new TAllocInstB();
					// 荷主ID
					tAllocInstB.setClientId(sqlReuslt.getClientId());
					// センタID
					tAllocInstB.setCenterId(sqlReuslt.getCenterId());
					// 出庫日
					tAllocInstB.setAddDt(sqlReuslt.getAddDt());
					// 納品先CD
					tAllocInstB.setSupplyCustomerCd(sqlReuslt.getSupplyCustomerCd());
					// 納品先名称
					tAllocInstB.setSupplyCustomerNm(sqlReuslt.getSupplyCustomerNm());
					// 配送コースCD
					tAllocInstB.setDeliveryCourseCd(sqlReuslt.getDeliveryCourseCd());
					// 配送コース名称
					tAllocInstB.setDeliveryCourseNm(sqlReuslt.getDeliveryCourseNm());
					// 運送業者CD
					tAllocInstB.setCarrierCd(sqlReuslt.getCarrierCd());
					// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana Start
					// 運送業者名称
					tAllocInstB.setCarrierNm(sqlReuslt.getCarrierNm());
					// [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana End
					// 指示数
					tAllocInstB.setInstNum(sqlReuslt.getSumInstNum());
					// 検品済数 --> 検品済総数
					tAllocInstB.setSpgQtyOns(WCC.ZERO);
					// 検品残数
					tAllocInstB.setSpgQtyRemain(sqlReuslt.getSumInstNum());
					// 商品ID
					tAllocInstB.setProductId(sqlReuslt.getProductId());
					// JANCD
					tAllocInstB.setJanCd(sqlReuslt.getJanCd());
					// 商品CD
					tAllocInstB.setProductCd(sqlReuslt.getProductCd());
					// 商品名称
					tAllocInstB.setProductNm(sqlReuslt.getProductNm());
					// 商品略称
					tAllocInstB.setProductAbbr(sqlReuslt.getProductAbbr());
					// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					//商品单位
					tAllocInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, sqlReuslt.prepareDomain()));
					// 入数内訳
					tAllocInstB.setUnitNumBreakdownP(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, sqlReuslt.prepareDomain()));
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
					tAllocInstB.setMProduct(sqlReuslt.prepareDomain());
					// [Ver3.0] unit of measure対応 2017.11.20 ライ END
					// [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana Start
					// 商品入数
					tAllocInstB.setUnitNum(sqlReuslt.getUnitNum());
					// [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana End
					// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana Start
					// 商品重量(g)・総重量(g)
					if (productLogic.existDecimal(sqlReuslt.getProductId())) {
						// 小数を含む商品

						tAllocInstB.setNetWeight(WCC.ZERO);
						tAllocInstB.setGrossWeight(WCC.ZERO);
					} else {
						// 小数を含まない

						tAllocInstB.setNetWeight(sqlReuslt.getSumNetWeight());
						tAllocInstB.setGrossWeight(sqlReuslt.getSumGrossWeight());
					}
					// [#4655][v3.0] 小数有り商品の重量は0とする 2018.05.25 kawana End
					// 出庫作業No.
					tAllocInstB.setPickingWorkNo(tPickingH.getPickingWorkNo());
					// 引当指示ヘッダID
					tAllocInstB.setAllocInstHId(sqlReuslt.getAllocInstHId());
					//未検品のみ表示
					tAllocInstB.setShpCheckDisplay(0l);
					// ===== 検索結果をリターンの引当指示ボディリストにセット =====
					result.add(tAllocInstB);
				}
			}

			// [#375][2.1.0-CT-072] ケースのみの出荷データを出荷検品すると致命的エラー 2016.12.02 kawana Start

			// ===== データ存在チェック =====
			if (result.size() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return result;
			}

			// [#375][2.1.0-CT-072] ケースのみの出荷データを出荷検品すると致命的エラー 2016.12.02 kawana End

			// ===== 出荷状態チェック =====
			// ===== 下記パラメータを設定して、出荷状態チェッククラス.出荷検品開始メソッドを呼出し

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			if (isPickingWorkNo) {
				// ===== 出庫作業No.で検品する場合の処理

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start

				TPackingHCB packingHCb = tPackingHBhv.newMyConditionBean();
				packingHCb.setupSelect_TPickingH();
				packingHCb.checkInvalidQuery();
				packingHCb.query().queryTPickingH().setCenterId_Equal(tAllocInstH.getCenterId());
				packingHCb.query().queryTPickingH().setClientId_Equal(tAllocInstH.getClientId());
				packingHCb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
				packingHCb.query().setMixedFlg_Equal_$1();
				List<TPackingH> packingHList = tPackingHBhv.selectList(packingHCb);

				shipStatusCheckLogic.inspectStart(packingHList, errSts);
				// ===== エラーの場合、処理終了 =====
				if (this.getErrorManager().get().size() > 0) {
					return result;
				}

				// ===== 出荷検品開始状態更新 =====
				// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品開始メソッドを呼出し =====
				shipStatusUpdateLogic.packingInspectStart(packingHList, errSts);

				// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			} else if (isShippingPackingNo) {
				//=====  出荷梱包No.で検品する場合の処理

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
				tPackingHCB.query().setCenterId_Equal(tAllocInstH.getCenterId());
				tPackingHCB.query().setClientId_Equal(tAllocInstH.getClientId());
				tPackingHCB.query().setShippingPackingNo_Equal(tPickingH.getPickingWorkNo());
				List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);

				shipStatusCheckLogic.packingInspectStart(null, null, tPackingHList, null, errSts);

				// ===== エラーの場合、処理終了 =====
				if (this.getErrorManager().get().size() > 0) {
					return result;
				}
				// ===== 出荷検品開始状態更新 =====
				// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品開始メソッドを呼出し =====
				shipStatusUpdateLogic.packingInspectStart(tPackingHList, errSts);
			}
		}

		// [#375][2.1.0-CT-072] ケースのみの出荷データを出荷検品すると致命的エラー(データ存在チェックを移動)(ここから削除) 2016.12.02 kawana

		return result;
	}

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 * 出庫帳票のコントロールNo.を更新する。
	 * 出庫帳票を更新する。
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void tPickingRUpdate(TPickingR update, TPickingH tPickingH, ErrorStatus errSts) {

		// ===== 出庫帳票更新 =====
		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());

		// 出庫帳票の更新
		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>梱包帳票を更新する。</h2>
	 * <pre>
	 * 梱包帳票のコントロールNo.を更新する。
	 * 梱包帳票を更新する。
	 *
	 * </pre>
	 * @param update 梱包帳票(更新用)
	 * @param tPackingH 梱包ヘッダ：荷主ID・センタID・出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void tPackingRUpdate(TPackingR update, TPackingH tPackingH, ErrorStatus errSts) {

		// ===== 梱包帳票更新 =====
		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setClientId_Equal(tPackingH.getClientId());
		cb.query().queryTPackingH().setCenterId_Equal(tPackingH.getCenterId());
		cb.query().queryTPackingH().setShippingPackingNo_Equal(tPackingH.getShippingPackingNo());

		// 梱包帳票の更新
		tPackingRBhv.queryUpdate(update, cb);
	}

	/**
	 * コントロールNoのクリア
	 * @param report 出庫帳票(検索用)：コントロールNo.
	 */
	public void clearControlNo(TPickingR report) {

		// ===== 出庫帳票更新 =====
		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// 更新項目作成
		TPickingR update = new TPickingR();
		update.setControlNo(null);

		// 出庫帳票更新
		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * コントロールNoのクリア
	 * @param report 梱包帳票(検索用)：コントロールNo.
	 */
	public void clearControlNo(TPackingR report) {

		// ===== 梱包帳票更新 =====
		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// 更新項目作成
		TPackingR update = new TPackingR();
		update.setControlNo(null);

		// 梱包帳票更新
		tPackingRBhv.queryUpdate(update, cb);
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End

	// キャリアEDIシステム(CES)連携対応 2017.01.09 HAN Start
	/**
	 * POST通信の実行
	 * @param webApiUrl 接続URL
	 * @param errSts エラー時に設定するステータス
	 * @return 受信データ(XMLオブジェクト)
	 */
	public String getWebService(Long centerId, Long clientId,
			String workNo, ErrorStatus errSts) {

		//Object responseObj = null;
		String zpl ="";
		ResourceBundle apiSettingBundle = null;

		try {
			apiSettingBundle = ResourceBundle.getBundle("PrintService");
		} catch (Exception e) {
			// ファイル未存在の場合もあるのでエラー時は何もしない
			apiSettingBundle = null;
		}

		// URLの取得
		String webApiUrl = apiSettingBundle.getString("service_url");

		try {

			URL url = new URL(webApiUrl);

			List<String> shippingPackingNoLst = new ArrayList<String>();

			// ShipmentRequestHeaderデータを取得する
			ShipmentRequestHeader shipmentRequestHeader = getShipmentRequestHeader(centerId, clientId, workNo, errSts);
			// ShipmentRequestProductデータを取得する
			ShipmentRequestProduct shipmentRequestProduct = getShipmentRequestProduct(centerId, clientId, workNo, errSts);
			// ShipmentRequestPackageデータを取得する
			ShipmentRequestPackage shipmentRequestPackage = getShipmentRequestPackage(centerId, clientId, workNo, shippingPackingNoLst, errSts);

			try{

				// ウェブサービスを設定する
				CarrierEDIWebServiceSoapStub stub = new CarrierEDIWebServiceSoapStub(url,null);

				ShipmentResponse shipmentResponse = stub.shipmentRequestMain(shipmentRequestHeader, shipmentRequestProduct, shipmentRequestPackage);

				// 出荷梱包No.
				String shippingPackingNo = null;
				// 貨物追跡No
				String trackingNo=null;
				// 成功の場合
				if ("0".equals(shipmentResponse.getERROR_CODE())) {
					for (int i = 0; i < shipmentResponse.getDOC_TYPE().length; i++) {
						// 'ZPLラベルプリンタ(FedEx/UPS)
						if ("01".equals(shipmentResponse.getDOC_TYPE()[i]) || "02".equals(shipmentResponse.getDOC_TYPE()[i])) {

							String ZPLString = new String(Base64.decodeBase64(shipmentResponse.getDOC_DATA()[i]), StandardCharsets.UTF_8);
							zpl =zpl + ZPLString;
						}
						else if ("03".equals(shipmentResponse.getDOC_TYPE()[i]) || "04".equals(shipmentResponse.getDOC_TYPE()[i])) {
							// PDFファイルプリンタ
							PrintPDF(shipmentResponse.getDOC_DATA()[i], shipmentResponse.getDOC_TYPE()[i], AutoPrint.TRUE, errSts);
						}
						// 'ZPLラベルプリンタ(FedEx/UPS)
						if ("01".equals(shipmentResponse.getDOC_TYPE()[i]) || "02".equals(shipmentResponse.getDOC_TYPE()[i])) {

							// 貨物追跡No.
							trackingNo = shipmentResponse.getTRACKING_NO()[i];
							// 出荷梱包No.
							shippingPackingNo = shippingPackingNoLst.get(i);
							TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
							tPackingHCB.query().setCenterId_Equal(centerId);
							tPackingHCB.query().setClientId_Equal(clientId);
							tPackingHCB.query().setShippingPackingNo_Equal(shippingPackingNo);
							List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);
							// データがあり場合
							if (tPackingHList.size() > 0) {
								for (TPackingH tPackingH : tPackingHList) {
									// 貨物追跡No.を設定する
									tPackingH.setCarrierTraceNum(trackingNo);
									// 梱包ヘッダ.貨物追跡No.を更新する
									tPackingHBhv.update(tPackingH);
								}
							}
						}else if ("03".equals(shipmentResponse.getDOC_TYPE()[i])){

							// 貨物追跡No.
							trackingNo = shipmentResponse.getTRACKING_NO()[0];

							for(String shippingPkNo : shippingPackingNoLst){
								TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
								tPackingHCB.query().setCenterId_Equal(centerId);
								tPackingHCB.query().setClientId_Equal(clientId);
								tPackingHCB.query().setShippingPackingNo_Equal(shippingPkNo);
								List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);
								// データがあり場合
								if (tPackingHList.size() > 0) {
									for (TPackingH tPackingH : tPackingHList) {
										// 貨物追跡No.を設定する
										tPackingH.setCarrierTraceNum(trackingNo);
										// 梱包ヘッダ.貨物追跡No.を更新する
										tPackingHBhv.update(tPackingH);
									}
								}
							}

						}else if ("04".equals(shipmentResponse.getDOC_TYPE()[i]) || "05".equals(shipmentResponse.getDOC_TYPE()[i])) {
							if (shippingPackingNoLst.size() == shipmentResponse.getTRACKING_NO().length ){
								// 貨物追跡No.
								trackingNo = shipmentResponse.getTRACKING_NO()[i];
								// 出荷梱包No.
								shippingPackingNo = shippingPackingNoLst.get(i);
								TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
								tPackingHCB.query().setCenterId_Equal(centerId);
								tPackingHCB.query().setClientId_Equal(clientId);
								tPackingHCB.query().setShippingPackingNo_Equal(shippingPackingNo);
								List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);
								// データがあり場合
								if (tPackingHList.size() > 0) {
									for (TPackingH tPackingH : tPackingHList) {
										// 貨物追跡No.を設定する
										tPackingH.setCarrierTraceNum(trackingNo);
										// 梱包ヘッダ.貨物追跡No.を更新する
										tPackingHBhv.update(tPackingH);
									}
								}
							}
							else {
								// 貨物追跡No.
								trackingNo = shipmentResponse.getTRACKING_NO()[i];
								if (i < shippingPackingNoLst.size()){
									// 出荷梱包No.
									shippingPackingNo = shippingPackingNoLst.get(i);
								} else {
									// 出荷梱包No.
									shippingPackingNo = shippingPackingNoLst.get(shippingPackingNoLst.size()-1);
								}

								TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
								tPackingHCB.query().setCenterId_Equal(centerId);
								tPackingHCB.query().setClientId_Equal(clientId);
								tPackingHCB.query().setShippingPackingNo_Equal(shippingPackingNo);
								List<TPackingH> tPackingHList = tPackingHBhv.selectList(tPackingHCB);
								// データがあり場合
								if (tPackingHList.size() > 0) {
									for (TPackingH tPackingH : tPackingHList) {
										// 貨物追跡No.を設定する
										tPackingH.setCarrierTraceNum(trackingNo);
										// 梱包ヘッダ.貨物追跡No.を更新する
										tPackingHBhv.update(tPackingH);
									}
								}
							}

						}

					}
				}
				else
				{
					this.getErrorManager().add(errSts, shipmentResponse.getERROR_MSG());
					return null;
				}

	        } catch(Exception e){
	            e.printStackTrace();
	           // this.getErrorManager().throwException(new IllegalStateException());
	            this.getErrorManager().add(errSts, e.getMessage());
	            return null;
	        }

		} catch (Exception e) {
			this.getErrorManager().add(errSts, e.getMessage());
			return null;
		}

		return zpl;
	}

	/**
	 * ShipmentRequestHeaderデータ取得
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param workNo 出荷梱包No.または出庫作業No.
	 * @param errSts エラー時に設定するステータス
	 * @return　ShipmentRequestHeaderデータ
	 */
	private ShipmentRequestHeader getShipmentRequestHeader(Long centerId, Long clientId, String workNo, ErrorStatus errSts) {

		ShipmentRequestHeader shipmentRequestHeader = new ShipmentRequestHeader();

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShipmentRequestHeader;
		// 検索条件
		SqlShipmentRequestHeaderPmb pmb = new SqlShipmentRequestHeaderPmb();
		// センタID
		pmb.setCenterId(centerId);
		// 荷主ID
		pmb.setClientId(clientId);
		// 出荷梱包No.または出庫作業No.
		pmb.setPickingWorkNo(workNo);

		// 検索実行
		Class<SqlShipmentRequestHeader> entityType = SqlShipmentRequestHeader.class;
		List<SqlShipmentRequestHeader> result = super.selectList(tShippingInstHBhv, path, pmb, entityType);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//システム稼働日の取得
		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);
		String systemDt = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();

		// Client Code
		shipmentRequestHeader.setCLIENT_CD(StringUtils.defaultString(result.get(0).getClientCd()));
		// Center Code
		shipmentRequestHeader.setCNTR_CD(StringUtils.defaultString(result.get(0).getCenterCd()));
		// Warehouse Code
		shipmentRequestHeader.setWH_CD(StringUtils.defaultString(result.get(0).getWarehouseId()));
		// Account Number
		shipmentRequestHeader.setACCOUNT_NO(StringUtils.defaultString(""));
		// Shipping Date
		shipmentRequestHeader.setSHIP_DT(StringUtils.defaultString(systemDt));
		// Company Code
		shipmentRequestHeader.setCOMP_CD(StringUtils.defaultString(result.get(0).getCompCd()));
		// Carrier Code
		shipmentRequestHeader.setCARR_CD(StringUtils.defaultString(""));
		// Service Type Code
		shipmentRequestHeader.setSERVICE_TYPE(StringUtils.defaultString(result.get(0).getDeliveryCourseCd()));
		// WMS Work Number
		shipmentRequestHeader.setWMS_WORK_NO(StringUtils.defaultString(result.get(0).getPickingWorkNo()));
		// Order Number
		shipmentRequestHeader.setORDER_NO(StringUtils.defaultString(result.get(0).getShippingSlipNo()));
		// Customer PO Number
		shipmentRequestHeader.setPO_NO(StringUtils.defaultString(result.get(0).getClientShippingNo()));
		// Ship to Code1
		shipmentRequestHeader.setSHP_TO_CD1(StringUtils.defaultString(result.get(0).getDelivCumistomerCd()));
		// Ship to Name1
		shipmentRequestHeader.setSHP_TO_NM1(StringUtils.defaultString(result.get(0).getDelivCustomerNm()));
		// Ship to Name2
		shipmentRequestHeader.setSHP_TO_NM2(StringUtils.defaultString(result.get(0).getDelivAddressSupply(),"_"));
		// Ship to Address1
		shipmentRequestHeader.setSHP_TO_ADDR1(StringUtils.defaultString(result.get(0).getDelivAddress1()));
		// Ship to Address2
		shipmentRequestHeader.setSHP_TO_ADDR2(StringUtils.defaultString(result.get(0).getDelivAddress2()));
		// Ship to Address3
		shipmentRequestHeader.setSHP_TO_ADDR3(StringUtils.defaultString(result.get(0).getDelivAddress3()));
		// Ship to Address4
		shipmentRequestHeader.setSHP_TO_ADDR4(StringUtils.defaultString(""));
		// Ship to City
		shipmentRequestHeader.setSHP_TO_CITY(StringUtils.defaultString(result.get(0).getShpToCity()));
		// Ship to State
		shipmentRequestHeader.setSHP_TO_STATE(StringUtils.defaultString(result.get(0).getShpToState()));
		// Ship to Zip Code
		shipmentRequestHeader.setSHP_TO_ZIP_CD(StringUtils.defaultString(result.get(0).getDelivZipCd()));
		// Ship to Country Code
		shipmentRequestHeader.setSHP_TO_COUNTRY_CD(StringUtils.defaultString(result.get(0).getPublicCd()));
		// Ship to Tel Number
		shipmentRequestHeader.setSHP_TO_TEL_NUM(StringUtils.defaultString(result.get(0).getDelivTelNo()));
		// Ship to Fax Number
		shipmentRequestHeader.setSHP_TO_FAX_NUM(StringUtils.defaultString(""));
		// Payment Term Code (Bill To)
		shipmentRequestHeader.setBILL_PAYMENT_TERM(StringUtils.defaultString(result.get(0).getPaymentTerm()));
		// Collect Account# (Bill To)
		shipmentRequestHeader.setBILL_COL_ACCOUNT_NO(StringUtils.defaultString(result.get(0).getCollectAccountNoBillTo()));
		// Collect Zip Code (Bill To)
		shipmentRequestHeader.setBILL_COL_ZIP_CD(StringUtils.defaultString(result.get(0).getCollectZipCdBillTo()));
		// Collect Country Code (Bill To)
		shipmentRequestHeader.setBILL_COL_COUNTRY_CD(StringUtils.defaultString(result.get(0).getCollectCountryCdBillTo()));
		// Payment Term Code (Taxes To)
		shipmentRequestHeader.setTAX_PAYMENT_TERM(StringUtils.defaultString(result.get(0).getPaymentTermCdTaxesTo()));
		// Collect Account# (Taxes To)
		shipmentRequestHeader.setTAX_COL_ACCOUNT_NO(StringUtils.defaultString(result.get(0).getCollectAccountNoTaxesTo()));
		// Collect Zip Code (Taxes To)
		shipmentRequestHeader.setTAX_COL_ZIP_CD(StringUtils.defaultString(result.get(0).getCollectZipCdTaxesTo()));
		// Collect Country Code (Taxes To)
		shipmentRequestHeader.setTAX_COL_COUNTRY_CD(StringUtils.defaultString(result.get(0).getCollectCountryCdTaxesTo()));
		// COD Payment Term Code
		shipmentRequestHeader.setCOD_PAYMENT_TERM(StringUtils.defaultString(result.get(0).getCodPaymentTermCd()));
		// COD Amount
		//なし場合
		if (result.get(0).getCodAmount() == null) {
			shipmentRequestHeader.setCOD_AMOUNT(0);
		}
		else {
			shipmentRequestHeader.setCOD_AMOUNT(result.get(0).getCodAmount().doubleValue());
		}

		// COD Fee Payer
		shipmentRequestHeader.setCOD_FEE_PAYER(StringUtils.defaultString(result.get(0).getCodFeePayer()));
		// COD Fund Type
		shipmentRequestHeader.setCOD_FUND_TYPE(StringUtils.defaultString(""));
		// SED Method
		shipmentRequestHeader.setSED_METHOD(StringUtils.defaultString(""));
		// ITN/FTSR Number
		shipmentRequestHeader.setITN_FTSR_NO(StringUtils.defaultString(""));
		// Terms of Sales
		shipmentRequestHeader.setTERMS_OF_SALES(StringUtils.defaultString(result.get(0).getTermsOfSales()));
		// Handling Unit Type
		shipmentRequestHeader.setHANDLING_UNIT_TYPE(StringUtils.defaultString(""));
		// Number of Handling Units
		shipmentRequestHeader.setNUM_OF_HANDLING_UNITS(0);
		// Decl. Value
		shipmentRequestHeader.setDECL_VALUE(0D);
		// Emergency Phone Number
		shipmentRequestHeader.setEMERGENCY_PHONE_NO(StringUtils.defaultString(""));
		// Special Instructions
		shipmentRequestHeader.setSPECIAL_INSTRUCTION(StringUtils.defaultString(""));
		// Broker Name
		shipmentRequestHeader.setBROKER_NAME(StringUtils.defaultString(result.get(0).getBrokerName()));
		// Broker Phone#
		shipmentRequestHeader.setBROKER_PHONE(StringUtils.defaultString(result.get(0).getBrokerPhoneNo()));
		// Broker Fax#
		shipmentRequestHeader.setBROKER_FAX(StringUtils.defaultString(result.get(0).getBrokerFaxNo()));
		// Saturday Delivery Flag
		if (result.get(0).getSatDeliveryFlg() == "1") {shipmentRequestHeader.setSAT_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setSAT_DELIVERY_FLG("N");}
		// Residential Delivery Flag
		if (result.get(0).getResidentialDeliveryFlg() == "1") {shipmentRequestHeader.setRES_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setRES_DELIVERY_FLG("N");}
		// Collect On Delivery Flag
		if (result.get(0).getCodFlg() == "1") {shipmentRequestHeader.setCOD_FLG("Y");} else {shipmentRequestHeader.setCOD_FLG("N");}
		// Signature Required Flag
		if (result.get(0).getSignatureRequiredFlg() == "1") {shipmentRequestHeader.setSIGN_REQUIRED_FLG("Y");} else {shipmentRequestHeader.setSIGN_REQUIRED_FLG("N");}
		// Signature Release Flag
		if (result.get(0).getSignatureReleaseFlg() == "1") {shipmentRequestHeader.setSIGN_RELEASE_FLG("Y");} else {shipmentRequestHeader.setSIGN_RELEASE_FLG("N");}
		// Call Before Delivery Flag
		if (result.get(0).getCallBeforeDeliveryFlg() == "1") {shipmentRequestHeader.setCALL_BEF_FLG("Y");} else {shipmentRequestHeader.setCALL_BEF_FLG("N");}
		// Freezable Protection Flag
		if (result.get(0).getFreezableProtectionFlg() == "1") {shipmentRequestHeader.setFREEZABLE_FLG("Y");} else {shipmentRequestHeader.setFREEZABLE_FLG("N");}
		// Guaranteed Plus Flag
		if (result.get(0).getGuaranteedPlusFlg() == "1") {shipmentRequestHeader.setGUARANTEED_FLG("Y");} else {shipmentRequestHeader.setGUARANTEED_FLG("N");}
		// Residential Pickup Flag
		if (result.get(0).getResidentialPickupFlg() == "1") {shipmentRequestHeader.setRES_PICK_FLG("Y");} else {shipmentRequestHeader.setRES_PICK_FLG("N");}
		// Do Not Stack Pallets Flag
		if (result.get(0).getDoNotStackStackFlg() == "1") {shipmentRequestHeader.setNO_STACK_FLG("Y");} else {shipmentRequestHeader.setNO_STACK_FLG("N");}
		// Limited Access Delivery Flag
		if (result.get(0).getLimitedAccessDeliveryFlg() == "1") {shipmentRequestHeader.setLMT_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setLMT_DELIVERY_FLG("N");}
		// Limited Access Pickup Flag
		if (result.get(0).getLimitedAccessPickupFlg() == "1") {shipmentRequestHeader.setLMT_PICK_FLG("Y");} else {shipmentRequestHeader.setLMT_PICK_FLG("N");}
		// Over-Sized/Extreme Length Flag
		if (result.get(0).getOverSizedFlg() == "1") {shipmentRequestHeader.setOVER_SIZED_FLG("Y");} else {shipmentRequestHeader.setOVER_SIZED_FLG("N");}
		// Poison Flag
		if (result.get(0).getPoisonFlg() == "1") {shipmentRequestHeader.setPOISON_FLG("Y");} else {shipmentRequestHeader.setPOISON_FLG("N");}
		// Food Flag
		if (result.get(0).getFoogFlg() == "1") {shipmentRequestHeader.setFOOD_FLG("Y");} else {shipmentRequestHeader.setFOOD_FLG("N");}
		// Liftgate at delivery Flag (Prepaid)
		if (result.get(0).getLiftgateDeliveryPrepaidFlg() == "1") {shipmentRequestHeader.setPPD_LIFT_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setPPD_LIFT_DELIVERY_FLG("N");}
		// Liftgate at delivery Flag (Collect)
		if (result.get(0).getLiftgateDeliveryCollectFlg() == "1") {shipmentRequestHeader.setCOL_LIFT_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setCOL_LIFT_DELIVERY_FLG("N");}
		// Liftgate at pickup Flag (Prepaid)
		if (result.get(0).getLiftgatePickupPrepaidFlg() == "1") {shipmentRequestHeader.setPPD_LIFT_PICK_FLG("Y");} else {shipmentRequestHeader.setPPD_LIFT_PICK_FLG("N");}
		// Liftgate at pickup Flag (Collect)
		if (result.get(0).getLiftgatePickupCollectFlg() == "1") {shipmentRequestHeader.setCOL_LIFT_PICK_FLG("Y");} else {shipmentRequestHeader.setCOL_LIFT_PICK_FLG("N");}
		// Inside Delivery Flag (Prepaid)
		if (result.get(0).getInsideDeliveryPrepaidFlg() == "1") {shipmentRequestHeader.setPPD_INSIDE_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setPPD_INSIDE_DELIVERY_FLG("N");}
		// Inside Delivery Flag (Collect)
		if (result.get(0).getInsideDeliveryCollectFlg() == "1") {shipmentRequestHeader.setCOL_INSIDE_DELIVERY_FLG("Y");} else {shipmentRequestHeader.setCOL_INSIDE_DELIVERY_FLG("N");}
		// Inside Pickup Flag (Prepaid)
		if (result.get(0).getInsidePickupPrepaidFlg() == "1") {shipmentRequestHeader.setPPD_INSIDE_PICK_FLG("Y");} else {shipmentRequestHeader.setPPD_INSIDE_PICK_FLG("N");}
		// Inside Pickup Flag (Collect)
		if (result.get(0).getInsidePickupCollectFlg() == "1") {shipmentRequestHeader.setCOL_INSIDE_PICK_FLG("Y");} else {shipmentRequestHeader.setCOL_INSIDE_PICK_FLG("N");}

		// Ship From Contact Name
		shipmentRequestHeader.setSHP_FROM_CONTACT_NM(StringUtils.defaultString(""));
		// Request User ID
		shipmentRequestHeader.setREQUEST_USER_ID(StringUtils.defaultString(""));
		// Tracking No
		shipmentRequestHeader.setTRACKING_NO(StringUtils.defaultString(""));
		// Input Class
		shipmentRequestHeader.setINPUT_CLS("0");

		return shipmentRequestHeader;
	}

	/**
	 * ShipmentRequestProductデータ取得
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param workNo 出荷梱包No.または出庫作業No.
	 * @return ShipmentRequestProductデータ
	 */
	private ShipmentRequestProduct getShipmentRequestProduct(Long centerId, Long clientId, String workNo, ErrorStatus errSts) {
		ShipmentRequestProduct shipmentRequestProduct = new ShipmentRequestProduct();
		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShipmentRequestProduct;
		// 検索条件
		SqlShipmentRequestProductPmb pmb = new SqlShipmentRequestProductPmb();
		// センタID
		pmb.setCenterId(centerId);
		// 荷主ID
		pmb.setClientId(clientId);
		// 出荷梱包No.または出庫作業No.
		pmb.setPickingWorkNo(workNo);

		// 検索実行
		Class<SqlShipmentRequestProduct> entityType = SqlShipmentRequestProduct.class;
		List<SqlShipmentRequestProduct> result = super.selectList(tShippingInstHBhv, path, pmb, entityType);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//システム稼働日の取得
		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);
		String systemDt = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();

		// Client Code
		String[] CLIENT_CD = new String[1];
		CLIENT_CD[0] =result.get(0).getClientCd();
		shipmentRequestProduct.setCLIENT_CD(CLIENT_CD);
		// Center Code
		String[] CNTR_CD = new String[1];
		CNTR_CD[0] =result.get(0).getCenterCd();
		shipmentRequestProduct.setCNTR_CD(CNTR_CD);
		// Warehouse Code
		String[] WH_CD  = new String[1];
		WH_CD[0]=result.get(0).getWarehouseId().toString();
		shipmentRequestProduct.setWH_CD(WH_CD);
		// Account Number
		String[] ACCOUNT_NO  = new String[1];
		ACCOUNT_NO[0] = StringUtils.defaultString("");
		shipmentRequestProduct.setACCOUNT_NO(ACCOUNT_NO);
		// Shipping Date
		String[] SHIP_DT = new String[1];
		SHIP_DT[0] = systemDt;
		shipmentRequestProduct.setSHIP_DT(SHIP_DT);
		String[] PRODUCT_NO = new String[result.size()];
		String[] PRODUCT_DESC = new String[result.size()];
		String[] COUNTRY_OF_ORIGIN= new String[result.size()];
		double[] UNIT_VALUE = new double[result.size()];
		double[] PRODUCT_QTY = new double[result.size()];
		String[] HARMONIZED_CD = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			// Product Number
			PRODUCT_NO[i] =StringUtils.defaultString(result.get(i).getProductCd());
			// Product Description
			PRODUCT_DESC[i] = StringUtils.defaultString(result.get(i).getProductAbbr());
			// Country of Origin
			COUNTRY_OF_ORIGIN[i] = StringUtils.defaultString(result.get(i).getCounntryOfOrigin());
			// Unit Value
			// nullの場合
			if (result.get(i).getUnitVal() == null) {
				UNIT_VALUE[i] = 0d;
			}
			else
			{
				UNIT_VALUE[i] = result.get(i).getUnitVal().doubleValue();
			}

			// Product Qty
			// nullの場合
			if (result.get(i).getUnitVal() == null) {
				PRODUCT_QTY[i] = 0d;
			}
			else {
				PRODUCT_QTY[i] = result.get(i).getPackingNum().doubleValue();
			}

			// Harmonized Code
			HARMONIZED_CD[i] = StringUtils.defaultString(result.get(i).getHtsCd());
		}
		// Product Number
		shipmentRequestProduct.setPRODUCT_NO(PRODUCT_NO);
		// Product Description
		shipmentRequestProduct.setPRODUCT_DESC(PRODUCT_DESC);
		// Country of Origin
		shipmentRequestProduct.setCOUNTRY_OF_ORIGIN(COUNTRY_OF_ORIGIN);
		// Unit Value
		shipmentRequestProduct.setUNIT_VALUE(UNIT_VALUE);

		// Product Qty
		shipmentRequestProduct.setPRODUCT_QTY(PRODUCT_QTY);

		// Harmonized Code
		shipmentRequestProduct.setHARMONIZED_CD(HARMONIZED_CD);
		return shipmentRequestProduct;
	}

	/**
	 * ShipmentRequestPackageデータ取得
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param workNo 出荷梱包No.または出庫作業No.
	 * @return ShipmentRequestPackageデータ
	 */
	private ShipmentRequestPackage getShipmentRequestPackage(Long centerId, Long clientId, String workNo, List<String> shippingPackingNoLst, ErrorStatus errSts) {
		ShipmentRequestPackage shipmentRequestPackage = new ShipmentRequestPackage();
		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShipmentRequestPackage;
		// 検索条件
		SqlShipmentRequestProductPmb pmb = new SqlShipmentRequestProductPmb();
		// センタID
		pmb.setCenterId(centerId);
		// 荷主ID
		pmb.setClientId(clientId);
		// 出荷梱包No.または出庫作業No.
		pmb.setPickingWorkNo(workNo);

		// 検索実行
		Class<SqlShipmentRequestPackage> entityType = SqlShipmentRequestPackage.class;
		List<SqlShipmentRequestPackage> result = super.selectList(tShippingInstHBhv, path, pmb, entityType);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ====== システム稼働日を取得 ======
		//システム稼働日の取得
		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);
		String systemDt = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();

		// Client Code
		String[] CLIENT_CD = new String[1];
		CLIENT_CD[0] =result.get(0).getClientCd();
		shipmentRequestPackage.setCLIENT_CD(CLIENT_CD);
		// Center Code
		String[] CNTR_CD = new String[1];
		CNTR_CD[0] =result.get(0).getCenterCd();
		shipmentRequestPackage.setCNTR_CD(CNTR_CD);
		// Warehouse Code
		String[] WH_CD  = new String[1];
		WH_CD[0]=result.get(0).getWarehouseId();
		shipmentRequestPackage.setWH_CD(WH_CD);
		// Account Number
		String[] ACCOUNT_NO  = new String[1];
		ACCOUNT_NO[0] = StringUtils.defaultString("");
		shipmentRequestPackage.setACCOUNT_NO(ACCOUNT_NO);
		// Shipping Date
		String[] SHIP_DT = new String[1];
		SHIP_DT[0] = systemDt;
		shipmentRequestPackage.setSHIP_DT(SHIP_DT);

		String[] PACK_TYPE = new String[result.size()];
        double[] PACK_QTY = new double[result.size()];
        java.lang.String[] PACK_DESC = new String[result.size()];
        double[] PACK_WGT = new double[result.size()];
        double[] PACK_LENGTH = new double[result.size()];
        double[] PACK_WITH = new double[result.size()];
        double[] PACK_HEIGHT = new double[result.size()];
        java.lang.String[] HARMAT_FLG = new String[result.size()];
        java.lang.String[] NMFC_CD = new String[result.size()];
        java.lang.String[] FREIGHT_CLS = new String[result.size()];
        java.lang.String[] REFERENCE1 = new String[result.size()];
        java.lang.String[] REFERENCE2 = new String[result.size()];
        double[] DECL_VALUE = new double[result.size()];

		for (int i = 0; i < result.size(); i++) {
			// Package Type
			PACK_TYPE[i] = StringUtils.defaultString(result.get(i).getCompCd());
			// Package Qty
			PACK_QTY[i] = 1d;
			// Package Description
			PACK_DESC[i] = StringUtils.defaultString(result.get(i).getProductAbbr());
			// Package Weight (LBS)
			if (result.get(i).getGrossWeight() == null) {
				PACK_WGT[i] = 0d;
			}
			else {
				PACK_WGT[i] = result.get(i).getGrossWeight().doubleValue();
			}

			// Package Length (Inch)
			if (result.get(i).getLength() == null) {
				PACK_LENGTH[i] = 0d;
			}
			else {
				PACK_LENGTH[i] = result.get(i).getLength().doubleValue();
			}

			// Package Width (Inch)
			if (result.get(i).getWidth() == null) {
				PACK_WITH[i] = 0d;
			}
			else {
				PACK_WITH[i] = result.get(i).getWidth().doubleValue();
			}

			// Package Height (Inch)
			if (result.get(i).getHeight() == null) {
				PACK_HEIGHT[i] = 0d;
			}
			else {
				PACK_HEIGHT[i] = result.get(i).getHeight().doubleValue();
			}

			// HarMat Flag
			HARMAT_FLG[i] = "N";
			// NMFC Code
			NMFC_CD[i] = StringUtils.defaultString(result.get(i).getNmfcCode());
			// Freight Class
			FREIGHT_CLS[i] = StringUtils.defaultString(result.get(i).getFreightCls());
			// Reference1
			REFERENCE1[i] = StringUtils.defaultString(result.get(i).getClientShippingNo());
			// Reference2
			REFERENCE2[i] = StringUtils.defaultString("");
			// Declared Value (USD)
			DECL_VALUE[i] = 0d;

			shippingPackingNoLst.add(result.get(i).getShippingPackingNo());

		}
		// Package Type
		shipmentRequestPackage.setPACK_TYPE(PACK_TYPE);
		// Package Qty
		shipmentRequestPackage.setPACK_QTY(PACK_QTY);
		// Package Description
		shipmentRequestPackage.setPACK_DESC(PACK_DESC);
		// Package Weight (LBS)
		shipmentRequestPackage.setPACK_WGT(PACK_WGT);
		// Package Length (Inch)
		shipmentRequestPackage.setPACK_LENGTH(PACK_LENGTH);
		// Package Width (Inch)
		shipmentRequestPackage.setPACK_WITH(PACK_WITH);
        // Package Height (Inch)
        shipmentRequestPackage.setPACK_HEIGHT(PACK_HEIGHT);
		// HarMat Flag
		shipmentRequestPackage.setHARMAT_FLG(HARMAT_FLG);
		// NMFC Code
		shipmentRequestPackage.setNMFC_CD(NMFC_CD);
		// Freight Class
		shipmentRequestPackage.setFREIGHT_CLS(FREIGHT_CLS);
		// Reference1
		shipmentRequestPackage.setREFERENCE1(REFERENCE1);
		// Reference2
		shipmentRequestPackage.setREFERENCE2(REFERENCE2);
		// Declared Value (USD)
		shipmentRequestPackage.setDECL_VALUE(DECL_VALUE);

		return shipmentRequestPackage;
	}


	/**
	 * PDFファイルプリンタ
	 * @param strLabelImage
	 * @param DocType 帳票タイプ
	 * @param autoPrint 自動発行区分
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TRUE/FALSE
	 */
	private boolean PrintPDF(String strLabelImage, String DocType, AutoPrint autoPrint, ErrorStatus errSts) {

		File pdfFile = null;
		List<File> pdfFileList = new ArrayList<File>();
		String reportCd = "";
		try {
			// Conway Shipping Label
			if ("03".equals(DocType)) {
				reportCd = "ConwayShippingLabel";

			}
			// Conwa Bill of Lading
			else if ("04".equals(DocType)) {
				reportCd = "ConwaBillofLading";
			}

			byte[] pdfBytes = org.apache.ws.commons.util.Base64.decode(strLabelImage);
			PrintParamDto printParamDto = new PrintParamDto();

			printParamDto.printBasicData.reportCd = reportCd;
			pdfFile = pdfFileSaveLogic.save(pdfBytes);
			pdfFileList.add(pdfFile);

			switch (autoPrint) {
			case TRUE:
				excecAutoPrint(reportCd, pdfFileList, PrintDataType.PDF, errSts);
				break;
			case FALSE:
				excecPrint(printParamDto, pdfFileList, PrintDataType.PDF, errSts);
				break;

			}
			if (0 < getErrorManager().size()) {
				return false;
			}
			return true;
		} catch (Exception e) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

	}

	/**
	 * 帳票発行実行 (画面経由)
	 */
	@SuppressWarnings("unchecked")
	private void excecPrint(PrintParamDto printParamDto, List<?> data, PrintDataType dataType, ErrorStatus errSts) {

		switch (dataType) {
		case DATA:
			JSON json = new JSON();
			json.setSuppressNull(true);
			printParamDto.printBasicData.outputData = json.format(data);
			break;
		case PDF:
			printParamDto.printBasicData.addOutputFileList(OutputFileType.ProtectPdf, ((List<File>) data));
			break;
		}

		try {
			printLogic.print(printParamDto);
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 帳票発行実行 (自動印刷)
	 */
	@SuppressWarnings("unchecked")
	private void excecAutoPrint(String reportCd, List<?> data, PrintDataType dataType, ErrorStatus errSts) {

		//帳票発行処理
		try {
			AutoPrintAddQueueResult result = null;
			switch (dataType) {
			case DATA:
				JSON json = new JSON();
				json.setSuppressNull(true);
				result = autoPrintLogic.print(reportCd, json.format(data));
				break;
			case PDF:
				result = autoPrintLogic.printProtectPdf(reportCd, ((List<File>) data));
				break;
			}

			if (result.isError()) {
				// エラー登録
				getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
				return;
			}
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}
	}

	// キャリアEDIシステム(CES)連携対応 2017.01.09 HAN End
}

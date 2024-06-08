package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTMoveInstB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.StockSetInstListDto;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * セット解除指示書データ取得ロジッククラス
 */
public class StockSetReleaseListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	// ===== 使用ロジック =====
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End

	/**
	 * <h2>セット解除指示データを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫移動指示ボディからデータを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 *
	 * セット品構成マスタと在庫に紐づく、セット解除指示書のデータを設定する。
	 * </pre>
	 *
	 * @param tMoveInstR 在庫移動指示帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<StockSetInstListDto>セット解除指示書発行データ取得のリスト
	 */
	public List<StockSetInstListDto> select(TMoveInstR tMoveInstR, ErrorStatus errSts) {

		List<TMoveInstB> tMoveInstBList = null;
		// ===== セット解除指示書データ取得 =====
		TMoveInstBCB tMoveInstBCb = tMoveInstBBhv.newMyConditionBean();
		tMoveInstBCb.setupSelect_TMoveInstH();
		tMoveInstBCb.setupSelect_TMoveInstH().withTMoveInstRAsOne();
		tMoveInstBCb.setupSelect_TMoveInstH().withMClient();
		tMoveInstBCb.setupSelect_TMoveInstH().withMCenter();
		tMoveInstBCb.setupSelect_MWarehouse();
		tMoveInstBCb.setupSelect_MProduct();
		tMoveInstBCb.setupSelect_MCustomerByDepositId();
		tMoveInstBCb.setupSelect_MStockType();
		tMoveInstBCb.setupSelect_MStockType().withVDict(getCultureId());
		tMoveInstBCb.setupSelect_MLocation();
		tMoveInstBCb.setupSelect_TLot();
		tMoveInstBCb.setupSelect_TStoreNo();

		// 検索条件の設定
		tMoveInstBCb.query().queryTMoveInstH().queryTMoveInstRAsOne().setControlNo_Equal(tMoveInstR.getControlNo());

		// ソート条件
		tMoveInstBCb.query().queryTMoveInstH().queryTMoveInstRAsOne().addOrderBy_InstOutFlg_Asc();
		tMoveInstBCb.query().queryTMoveInstH().queryMClient().addOrderBy_ClientCd_Asc();
		tMoveInstBCb.query().queryTMoveInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		tMoveInstBCb.query().queryTMoveInstH().addOrderBy_MoveSlipNo_Asc();
		tMoveInstBCb.query().addOrderBy_InoutType_Desc();
		tMoveInstBCb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		tMoveInstBCb.query().addOrderBy_DepositCd_Asc();
		tMoveInstBCb.query().addOrderBy_StockTypeCd_Asc();
		tMoveInstBCb.query().queryMLocation().addOrderBy_PickingOrder_Asc();
		tMoveInstBCb.query().queryMLocation().addOrderBy_LocationCd_Asc();
		tMoveInstBCb.query().addOrderBy_Lot_Asc();
		tMoveInstBCb.query().addOrderBy_LimitDt_Asc();
		tMoveInstBCb.query().addOrderBy_StoreLabelNo_Asc();

		// 検索実行
		tMoveInstBList = selectListToReport(tMoveInstBBhv, tMoveInstBCb);
        // ===== ０件チェック =====
		if (tMoveInstBList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
		// 構成品の商品荷姿リスト取得
		tMoveInstBBhv.load(tMoveInstBList, new ReferrerLoaderHandler<LoaderOfTMoveInstB>() {
			@Override
			public void handle(LoaderOfTMoveInstB loader) {
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

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End

		// ===== リターンのセット解除指示書発行データ取得のリスト編集 =====

		List<StockSetInstListDto> result = new ArrayList<StockSetInstListDto>();
		List<TMoveInstB> bodyList = new ArrayList<TMoveInstB>();
		TMoveInstB head = new TMoveInstB();
		String moveSlipNo = null;
		boolean isFirst = true;
		for (TMoveInstB body : tMoveInstBList) {
			TMoveInstH tMoveInstH = body.getTMoveInstH();

			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, body.getMProduct());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End

			// 1件目
			if (isFirst) {
				moveSlipNo = body.getTMoveInstH().getMoveSlipNo();
				isFirst = false;
			}

			// WMS在庫移動伝票No.に変更あり
			if (!moveSlipNo.equals(tMoveInstH.getMoveSlipNo())) {
				// 前行までの範囲でセット組指示書発行データを設定
				// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod Start
				setDataList(result, head, bodyList, minimumUnitMap, errSts);
				// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod End

				// 初期化
				bodyList.clear();
				moveSlipNo = body.getTMoveInstH().getMoveSlipNo();
			}

			if (body.isInoutType$1()) {
				// セット解除指示書のヘッダを設定
				head = body;
			} else {
				// セット解除指示書の明細データリストを設定
				bodyList.add(body);
			}
		}
		// 最後のWMS在庫移動伝票No.のセット解除指示書発行データを設定
		// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod Start
		setDataList(result, head, bodyList, minimumUnitMap, errSts);
		// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod End

		return getStockSetInstList(result);
	}

	// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod Start
	/**
	 * WMS在庫移動伝票No.のセット解除指示書発行データを設定編集
	 * @param stockSetInstListDto セット解除指示書発行データリスト
	 * @param head セット解除指示書のヘッダ
	 * @param bodyList セット解除指示書の明細データリスト
	 * @param minimumUnitMap 構成品最小荷姿単位Map
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<StockSetInstListDto> セット解除指示書発行データリスト
	 */
	private void setDataList(List<StockSetInstListDto> stockSetInstListDto, TMoveInstB head, List<TMoveInstB> bodyList, Map<Long, String> minimumUnitMap, ErrorStatus errSts) {
	// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Mod End

		for (TMoveInstB body : bodyList) {
			StockSetInstListDto dataDto = new StockSetInstListDto();

			// ===== 構成数取得 =====
			// セット品構成マスタで検索
			MSetStructure mSetStructure = new MSetStructure();
			mSetStructure.setProductId(body.chaseMProduct().getProductId());
			mSetStructure = getMSetStructure(mSetStructure, head.chaseMProduct().getProductId());

			// ===== 在庫の引当可能数取得 =====
			// 在庫で検索
			TStock tStock = new TStock();
			TLot tLot = new TLot();
			TStoreNo tStoreNo = new TStoreNo();
			tStock.setClientId(head.chaseTMoveInstH().getClientId());
			tStock.setWarehouseId(body.getWarehouseId());
			tStock.setProductId(body.getProductId());
			tStock.setDepositId(body.getDepositId());
			tStock.setStockTypeId(body.getStockTypeId());
			tStock.setLocationId(body.getLocationId());
			tStoreNo.setStoreDt(body.getStoreDt());
			tStoreNo.setStoreLabelNo(body.getStoreLabelNo());
			tLot.setLot(body.getLot());
			tLot.setLimitDt(body.getLimitDt());
			// 在庫の引当可能数取得
			BigDecimal chargeNum = getTStock(tStock, tLot, tStoreNo);

			// ===== セット組指示書発行データ編集 =====
			// ヘッダ設定
			dataDto.setMoveSlipNo(CU.nullToStr(head.chaseTMoveInstH().getMoveSlipNo()));
			dataDto.setCenterCd(CU.nullToStr(head.chaseTMoveInstH().chaseMCenter().getCenterCd()));
			dataDto.setCenterNm(CU.nullToStr(head.chaseTMoveInstH().chaseMCenter().getCenterNm()));
			dataDto.setClientCd(CU.nullToStr(head.chaseTMoveInstH().chaseMClient().getClientCd()));
			dataDto.setClientNm(CU.nullToStr(head.chaseTMoveInstH().chaseMClient().getClientNm()));
			dataDto.setWarehouseCd(CU.nullToStr(head.chaseMWarehouse().getWarehouseCd()));
			dataDto.setWarehouseNm(CU.nullToStr(head.chaseMWarehouse().getWarehouseNm()));
			dataDto.setProductCdH(CU.nullToStr(head.chaseMProduct().getProductCd()));
			dataDto.setProductNmH(CU.nullToStr(head.chaseMProduct().getProductNm()));
			dataDto.setDepositCdH(CU.nullToStr(head.chaseMCustomerByDepositId().getCustomerCd()));
			dataDto.setDepositNmH(CU.nullToStr(head.chaseMCustomerByDepositId().getCustomerNm()));
			dataDto.setStockTypeCdH(CU.nullToStr(head.chaseMStockType().getStockTypeCd()));
			dataDto.setStockTypeNmH(CU.nullToStr(head.chaseMStockType().chaseVDict().getDictNm()));
			dataDto.setLocationCdH(CU.nullToStr(head.chaseMLocation().getLocationCd()));
			dataDto.setLocationNmH(CU.nullToStr(head.chaseMLocation().getLocationNm()));
			dataDto.setInstNumH(CU.nullToZero(head.getInstNum()));
			dataDto.setLotH(CU.nullToStr(head.getLot()));
			dataDto.setLimitDtH(CU.nullToStr(head.getLimitDt()));
			dataDto.setStoreDtH(CU.nullToStr(head.getStoreDt()));

			// 明細設定
			dataDto.setProductCd(CU.nullToStr(body.chaseMProduct().getProductCd()));
			dataDto.setProductNm(CU.nullToStr(body.chaseMProduct().getProductNm()));
			dataDto.setDepositCd(CU.nullToStr(body.chaseMCustomerByDepositId().getCustomerCd()));
			dataDto.setDepositNm(CU.nullToStr(body.chaseMCustomerByDepositId().getCustomerNm()));
			if (mSetStructure == null) {
				dataDto.setUnitNum(0l);
			} else {
				dataDto.setUnitNum(CU.nullToZero(mSetStructure.getUnitNum()));
			}
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
			// JAN
			dataDto.setJanCd(CU.nullToStr(body.chaseMProduct().getJanCd()));
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			dataDto.setStockTypeCd(CU.nullToStr(body.chaseMStockType().getStockTypeCd()));
			dataDto.setStockTypeNm(CU.nullToStr(body.chaseMStockType().chaseVDict().getDictNm()));
			dataDto.setPickingOrder(CU.nullToZero(body.chaseMLocation().getPickingOrder()));
			dataDto.setLocationCd(CU.nullToStr(body.chaseMLocation().getLocationCd()));
			dataDto.setLocationNm(CU.nullToStr(body.chaseMLocation().getLocationNm()));
			dataDto.setInstNum(CU.nullToZero(body.getInstNum()));
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
			dataDto.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, body.chaseMProduct()));
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End
			dataDto.setLot(CU.nullToStr(body.getLot()));
			dataDto.setLimitDt(CU.nullToStr(body.getLimitDt()));
			dataDto.setStoreDt(CU.nullToStr(body.getStoreDt()));
			dataDto.setStoreLabelNo(CU.nullToStr(body.getStoreLabelNo()));
			dataDto.setChargeNum(chargeNum);

			// 発行フラグ
			dataDto.printFlg = CU.nullOrEmptyToZero(head.chaseTMoveInstH().chaseTMoveInstRAsOne().getInstOutFlg());

			stockSetInstListDto.add(dataDto);
		}
}

	/**
	 * <h2>セット品構成マスタの情報を取得する。</h2>
	 * <pre>
	 * 引数をキーにセット品構成マスタの情報を取得する。
	 * </pre>
	 * @param mSetStructure セット品構成マスタ：商品ID
	 * @param productId 親商品ID
	 * @return MSetStructure セット品構成マスタ
	 */
	public MSetStructure getMSetStructure(MSetStructure mSetStructure, Long productId) {

		// セット品構成マスタ情報の取得
		MSetStructureCB cb = mSetStructureBhv.newConditionBean();
		cb.setupSelect_MSetParent();

		// 検索条件の設定
		cb.query().setProductId_Equal(mSetStructure.getProductId());
		cb.query().queryMSetParent().setProductId_Equal(productId);;

		List<MSetStructure> lstMSetStructure = mSetStructureBhv.selectList(cb);

		if (lstMSetStructure.size() > 0) {
			return lstMSetStructure.get(0);
		} else {
			return null;
		}
	}

	/**
	 * <h2>在庫の引当可能数を取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫の引当可能数を合計して返す。
	 * </pre>
	 * @param tStock 在庫：荷主ID・倉庫ID・商品ID・預託ID・在庫区分ID・ロケーションID
	 * @param tLot ロット：ロット・期限日
	 * @param tStoreNo 入庫No.：入庫日・入庫レベルNo.
	 * @return Long 引当可能数の合計
	 */
	public BigDecimal getTStock(TStock tStock, TLot tLot, TStoreNo tStoreNo) {
		BigDecimal chargeNum = WCC.ZERO;

		// 在庫情報の取得
		TStockCB cb = tStockBhv.newConditionBean();
		cb.setupSelect_TLot();
		cb.setupSelect_TStoreNo();

		// 検索条件の設定
		cb.query().setClientId_Equal(tStock.getClientId());
		cb.query().setWarehouseId_Equal(tStock.getWarehouseId());
		cb.query().setProductId_Equal(tStock.getProductId());
		cb.query().setDepositId_Equal(tStock.getDepositId());
		cb.query().setStockTypeId_Equal(tStock.getStockTypeId());
		cb.query().setLocationId_Equal(tStock.getLocationId());
		cb.query().queryTLot().setLot_Equal(tLot.getLot());
		cb.query().queryTLot().setLimitDt_Equal(tLot.getLimitDt());
		cb.query().queryTStoreNo().setStoreDt_Equal(tStoreNo.getStoreDt());
		cb.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		List<TStock> lstTStock = tStockBhv.selectList(cb);
		if (lstTStock.size() > 0) {
			for (TStock data : lstTStock) {
				chargeNum = WCC.add(chargeNum, data.getChargeNum());
			}
		}

		return chargeNum;
	}

	/**
	 * ターンのセット解除指示書発行データリストのソート編集
	 * @param stockSetInstListDto セット解除指示書発行データリスト
	 * @return List<StockSetInstListDto> セット解除指示書発行データリスト
	 */
	private List<StockSetInstListDto> getStockSetInstList(List<StockSetInstListDto> stockSetInstListDto) {
		Collections.sort(stockSetInstListDto, new Comparator<StockSetInstListDto>() {
			public int compare(StockSetInstListDto arg0, StockSetInstListDto arg1) {
				if (arg0.printFlg.compareTo(arg1.printFlg) == 0) {
					if (arg0.getClientCd().compareTo(arg1.getClientCd()) == 0) {
						if (arg0.getProductCdH().compareTo(arg1.getProductCdH()) == 0) {
							if (arg0.getDepositCdH().compareTo(arg1.getDepositCdH()) == 0) {
								if (arg0.getStockTypeCdH().compareTo(arg1.getStockTypeCdH()) == 0) {
									if (arg0.getWarehouseCd().compareTo(arg1.getWarehouseCd()) == 0) {
										if (arg0.getLocationCdH().compareTo(arg1.getLocationCdH()) == 0) {
											if (arg0.getStoreDtH().compareTo(arg1.getStoreDtH()) == 0) {
												return arg0.getMoveSlipNo().compareTo(arg1.getMoveSlipNo());
											} else {
												return arg0.getStoreDtH().compareTo(arg1.getStoreDtH());
											}
										} else {
											return arg0.getLocationCdH().compareTo(arg1.getLocationCdH());
										}
									} else {
										return arg0.getWarehouseCd().compareTo(arg1.getWarehouseCd());
									}
								} else {
									return arg0.getStockTypeCdH().compareTo(arg1.getStockTypeCdH());
								}
							} else {
								return arg0.getDepositCdH().compareTo(arg1.getDepositCdH());
							}
						} else {
							return arg0.getProductCdH().compareTo(arg1.getProductCdH());
						}
					} else {
						return arg0.getClientCd().compareTo(arg1.getClientCd());
					}
				} else {
					return arg0.printFlg.compareTo(arg1.printFlg);
				}
			}
		});
		return stockSetInstListDto;
	}

	/**
	 * <h2>在庫移動指示帳票を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し在庫移動指示帳票を更新する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param update 在庫移動指示帳票(更新用)：全項目
	 * @param tMoveInstH 在庫移動指示ヘッダ：荷主ID・センタID
	 * @param tMoveInstB 在庫移動指示ボディ：商品ID・預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・ロット・
	 *                                       期限日(From)・期限日(To)・入庫日(From)・入庫日(To)
	 * @param report 在庫移動指示帳票：発行条件
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TMoveInstR update, TMoveInstH tMoveInstH,final TMoveInstB tMoveInstB, TMoveInstR report, ErrorStatus errStatus) {

		List<TMoveInstR> result = null;

		// ===== セット解除指示書データ取得 =====
		TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
		cb.setupSelect_TMoveInstH();

		// 検索条件
		cb.query().queryTMoveInstH().existsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB subCB) {
				// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
				MLocation mLocationExentity = new MLocation();
				mLocationExentity.setLocationCdFrom(tMoveInstB.getLocationCdFrom());
				mLocationExentity.setLocationCdTo(tMoveInstB.getLocationCdTo());
				// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End
				// [ON推-品向-1036] ステータスが完了のデータも発行可能にする修正 2015.12.16 koyama Start
//				subCB.query().setMoveInstStatus_Equal_$01();
				// [ON推-品向-1036] ステータスが完了のデータも発行可能にする修正 2015.12.16 koyama Start
				subCB.query().setProductId_Equal(tMoveInstB.getProductId());
				subCB.query().setDepositId_Equal(tMoveInstB.getDepositId());
				subCB.query().setStockTypeId_Equal(tMoveInstB.getStockTypeId());
				// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
				subCB.query().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocationExentity) == null ? "" :locationLogic.getMinLocationCd(mLocationExentity).getLocationCdFrom());
				subCB.query().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocationExentity) == null ? "" :locationLogic.getMaxLocationCd(mLocationExentity).getLocationCdTo());
				// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End
				subCB.query().setLot_Equal(tMoveInstB.getLot());
				subCB.query().setLimitDt_GreaterEqual(tMoveInstB.getLimitDtFrom());
				subCB.query().setLimitDt_LessEqual(tMoveInstB.getLimitDtTo());
				subCB.query().setStoreDt_GreaterEqual(tMoveInstB.getStoreDtFrom());
				subCB.query().setStoreDt_LessEqual(tMoveInstB.getStoreDtTo());
				subCB.query().setInoutType_Equal_$1();

				setDelFlg(subCB);
			}
		});

		cb.query().queryTMoveInstH().setClientId_Equal(tMoveInstH.getClientId());
		cb.query().queryTMoveInstH().setCenterId_Equal(tMoveInstH.getCenterId());
		cb.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$31.code());
		// [ON推-品向-1036] ステータスが完了のデータも発行可能にする修正 2015.12.16 koyama Start
//		cb.query().queryTMoveInstH().setMoveInstStatus_Equal_$01();
		// [ON推-品向-1036] ステータスが完了のデータも発行可能にする修正 2015.12.16 koyama End
		// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama Start
		cb.query().setInstOutFlg_Equal(report.getInstOutFlg());
		// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama End

		// ===== 在庫移動指示帳票の更新 =====
		tMoveInstRBhv.queryUpdate(update, cb);

		// ===== データ存在チェック =====
		result = tMoveInstRBhv.selectList(cb);

		if (result.size() == 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
	}

	/**
	 * <h2>在庫移動指示帳票を更新する(在庫移動指示ヘッダID)。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し在庫移動指示帳票を更新する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param update 在庫移動指示帳票(更新用)：全項目
	 * @param tMoveInstHList 在庫移動指示ヘッダリスト：在庫移動指示ヘッダID
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNoById(TMoveInstR update, List<TMoveInstH> tMoveInstHList, ErrorStatus errStatus) {

		// 在庫移動指示ヘッダIDのlist作成
		List<Long> tMoveInstHIdList = new ArrayList<Long>();
		for (TMoveInstH tMoveInstH : tMoveInstHList) {
			tMoveInstHIdList.add(tMoveInstH.getMoveInstHId());
		}

		List<TMoveInstR> result = null;
		// ===== セット解除指示書データ取得 =====
		TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
		cb.setupSelect_TMoveInstH();

		// 検索条件
		cb.query().setMoveInstHId_InScope(tMoveInstHIdList);

		// ===== 在庫移動指示帳票の更新 =====
		tMoveInstRBhv.queryUpdate(update, cb);

		// ===== データ存在チェック =====
		result = tMoveInstRBhv.selectList(cb);

		if (result.size() == 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
	}

	/**
	 * <h2>在庫移動指示帳票を更新する。</h2>
	 * <pre>
	 * 引数をキーに在庫移動指示帳票のデータを更新する。
	 * </pre>
	 * @param update 在庫移動指示帳票(更新用)：全項目
	 * @param report 在庫移動指示帳票(検索用)：コントロールNo.
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateOutFlg(TMoveInstR update, TMoveInstR report, ErrorStatus errStatus) {

		// ===== 在庫移動指示帳票データ更新 =====
		// 更新条件
		TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// ===== 在庫移動指示帳票の更新実行 =====
		tMoveInstRBhv.queryUpdate(update, cb);
	}

	/***
	 * <h2>親商品存在チェックを行う。</h2>
	 * <pre>
	 * 親商品より、セット品構成マスタにデータを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param parentId 親ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true：存在する、false：存在しない
	 */
	public boolean parentIdCheck(Long parentId, ErrorStatus errSts) {
		// ===== 構成品を検索 =====
		MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_MProduct();
		cb.setupSelect_MSetParent();
		cb.setupSelect_MSetParent().withMProduct();

		// ===== 検索条件 =====
		cb.query().queryMSetParent().setProductId_Equal(parentId);

		// ===== 検索実行 =====
		List<MSetStructure> result = mSetStructureBhv.selectList(cb);
		if(result.size() == 0){
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}
		return true;
	}

}
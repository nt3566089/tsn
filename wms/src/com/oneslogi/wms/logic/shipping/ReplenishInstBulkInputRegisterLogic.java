package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TTrflexibilityCB;
import com.oneslogi.base.dbflute.cbean.TTrflexibilitydetailCB;
import com.oneslogi.base.dbflute.cbean.TTrflexibilityinstructCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilityBhv;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilitydetailBhv;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilityinstructBhv;
import com.oneslogi.base.dbflute.exbhv.WReplenishInstInputBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TTrflexibility;
import com.oneslogi.base.dbflute.exentity.TTrflexibilitydetail;
import com.oneslogi.base.dbflute.exentity.TTrflexibilityinstruct;
import com.oneslogi.base.dbflute.exentity.WReplenishInstInput;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.NumberingLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *融通指示一括取込ワーク登録処理ロジッククラス
 */
public class ReplenishInstBulkInputRegisterLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/**
	 * ステータス
	 */
	protected static final Long STS_500 = 500L;
	/**
	 * ステータス
	 */
	protected static final Long STS_150 = 150L;
	/**
	 * 指示変更フラグ
	 */
	protected static final String VA_EXTDATA_0 = "0";
	/**
	 * 輸送番号
	 */
	protected static final String TRANS_PORT_CD_YUZ = "YUZ";
	/**
	 * 融通山出しリストNo.
	 */
	protected static final String FLEXPICKLIST_NO_0 = "0";
	
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
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 22;
	}

	// ===== 使用テーブル =====

	@Inject
	private WReplenishInstInputBhv wReplenishInstInputBhv;
	@Inject
	private TTrflexibilityinstructBhv trflexibilityinstructBhv;;
	@Inject
	private TTrflexibilitydetailBhv trflexibilitydetailBhv;
	@Inject
	private TTrflexibilityBhv trflexibilityBhv;
	@Inject
	private MProductBhv mProductBhv;


	// ===== 使用ロジッククラス =====

	@Inject
	private ReplenishInstBulkInputSelectLogic selectLogic;
	@Inject
	private NumberingLogic numberingLogic;

	// ===== enum =====

	// ===== 内部変数 =====


	/**
	 * <h2>一括登録.</h2>
	 * @param eShippingInstList 一括登録
	 */
	public void batchInsertWReplenishInstInput(List<WReplenishInstInput> dataList) {
		wReplenishInstInputBhv.batchInsert(dataList);
	}

	/**
	 * <h2>出荷指示一括取込用出荷指示登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに出荷指示データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param mCenter センタCD
	 * @param mClient 荷主CD
	 * @param processedList 
	 * @param registerList 
	 * @param flexibitylineNo 
	 * @param flexibleTransportInfoId2 
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	public StatusDto register(List<WReplenishInstInput> dataList, String receiveCd, MCenter mCenter, MClient mClient, List<TTrflexibilityinstruct> registerList, List<WReplenishInstInput> processedList, BigDecimal flexibitylineNo, Long flexibleTransportInfoId, ErrorStatus errSts) {

		// 採番マスタから融通指示番号を取得する
		String number = "";
		number = numberingLogic.getNumbering(WmsNumberingConst.FLEXINSTRUCT_NO);
		
		for (WReplenishInstInput wReplenishInstInput : dataList) {
			TTrflexibilityinstruct entity = new TTrflexibilityinstruct();
			
			// 融通指示番号
			entity.setFlexinstructno(new BigDecimal(number));
			// 融通指示行番号
			entity.setFlexinslineno(wReplenishInstInput.getLineNo());
			// 指示No.
			entity.setFlexinsno(wReplenishInstInput.getFlexlnsNo());
			// 発送予定日
			entity.setSchdate(wReplenishInstInput.getSchDate());
			// 発送元CD
			entity.setSuppliercd(wReplenishInstInput.getSupplierCd());
			// 受入予定日
			entity.setRcvdate(wReplenishInstInput.getRcvDate());
			// 発送先CD
			entity.setShipcd(wReplenishInstInput.getShipCd());
			// 銘柄CD
			entity.setProductCd(wReplenishInstInput.getItemCd());
			// 製造年月日
			entity.setManufacturedate(wReplenishInstInput.getManufactureDate());
			// デザイン区分
			entity.setDesigncd(wReplenishInstInput.getDesignCd());
			// 数量（個数）
			entity.setQty(wReplenishInstInput.getQty());
			// 画面更新者
			entity.setFlexupduser(wReplenishInstInput.getFlexUpdUserCd());
			// 融通指示登録ステータス
			entity.setFlexinstructsts(CDef.Flexinstructsts.$1.code());
			// 融通No.
			entity.setFlexibityno(wReplenishInstInput.getFlexibityno()!=null?new BigDecimal(wReplenishInstInput.getFlexibityno()):null);
			// 輸送番号
			entity.setTransportcd(wReplenishInstInput.getTransportcd());
			
			// で作成した ENTITY を 変数.融通指示一括登録情報登録リスト に追加(add)する
			registerList.add(entity);
			
			// 融通指示一括取込ワークENTITY を生成し、値を設定する
			WReplenishInstInput updateInput = new WReplenishInstInput();
			// 融通指示一括取込ワークID
			updateInput.setReplenishInstInputId(wReplenishInstInput.getReplenishInstInputId());
			// 処理済フラグ
			updateInput.setWorkFlg(CDef.WorkFlg.$1.code());
			// バージョンNo.
			updateInput.setVersionNo(wReplenishInstInput.getVersionNo());
			
			// で作成した ENTITY を 変数.融通指示一括取込ワーク処理済リスト に追加(add)する
			processedList.add(updateInput);
		}
		
		// 融通指示一括登録情報登録処理
		trflexibilityinstructBhv.batchInsert(registerList);
		
		List<TTrflexibilityinstruct> tTrflexibilityinstructDataList = selectLogic.selectTTrflexibilityinstructDataList(new BigDecimal(number));
		
		if (tTrflexibilityinstructDataList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		
		for (int i = 0; i < tTrflexibilityinstructDataList.size(); i++) {
			// 前データ
			TTrflexibilityinstruct previousEntity = new TTrflexibilityinstruct();
			
			if (i > 0) {
				previousEntity = tTrflexibilityinstructDataList.get(i-1);
			}

			TTrflexibilityinstruct entity = tTrflexibilityinstructDataList.get(i);
			// 融通No.
			String flexibityno = "";
			// 前データの指示No. != 指示No. の場合
			if (!entity.getFlexinsno().equals(previousEntity.getFlexinsno())) {
				// 融通No. != NULL の場合
				if (entity.getFlexibityno() != null) {
					List<TTrflexibility> tTrflexibilityDataList = selectLogic.selectTTrflexibilityDataList(entity.getFlexibityno());
					if(tTrflexibilityDataList.size() > 0 && 
							tTrflexibilityDataList.get(0).getSts().compareTo(STS_500) > 0) {
						getErrorManager().add(errSts, WmsMessageConst.CANNOT_CHANGE_ALREADY_SEND_DATA_ERROR);
						return null;
					}
					
					// 融通指示番号 で 融通指示一括登録情報 を検索する
					TTrflexibilityinstructCB tTrflexibilityinstructCB = trflexibilityinstructBhv.newConditionBean();
					tTrflexibilityinstructCB.query().setFlexinstructno_Equal(new BigDecimal(number));
					tTrflexibilityinstructCB.query().setDelFlg_Equal_$0();
					tTrflexibilityinstructCB.query().addOrderBy_Flexinsno_Asc();
					
					List<TTrflexibilityinstruct> list = trflexibilityinstructBhv.selectList(tTrflexibilityinstructCB);
					
					for (TTrflexibilityinstruct structEntity : list) {
						Integer num = 0;
//						Integer num = XXXXX.FX_TSN_WAREHOUSEHTQTY(structEntity.getSuppliercd(), structEntity.getFlexibityno()
//								 structEntity.getItemcd(), structEntity.getManufacturedate(), structEntity.getDesigncd());
						// 数量（個数） < 融通山出し実績数量
						if (Integer.parseInt(structEntity.getQty()) < num) {
							getErrorManager().add(errSts, WmsMessageConst.QTY_SMALLER_THAN_REPLENISH_STOCK_TRANSFER_QTY_ERROR);
							return null;
						}
					
					}
					
					// 変数の初期化を行う
					// 融通輸送明細情報削除リスト
					List<TTrflexibilitydetail> delList = new ArrayList<TTrflexibilitydetail>();
					
					// 融通No.で融通輸送明細情報を検索する
					TTrflexibilitydetailCB trflexibilitydetailCB = trflexibilitydetailBhv.newConditionBean();
					trflexibilitydetailCB.query().queryTTrflexibility().setFlexibityno_Equal(entity.getFlexibityno());
					trflexibilitydetailCB.query().setDelFlg_Equal_$0();
					List<TTrflexibilitydetail> trflexibilitydetailList = trflexibilitydetailBhv.selectList(trflexibilitydetailCB);
					for (TTrflexibilitydetail tTrflexibilitydetail : trflexibilitydetailList) {
						TTrflexibilitydetail detail = new TTrflexibilitydetail();
						// 融通輸送明細情報ID
						detail.setFlexibleTransportDetailInfoId(tTrflexibilitydetail.getFlexibleTransportDetailInfoId());
						// 削除フラグ
						detail.setDelFlg_$1();
						// バージョンNo.
						detail.setVersionNo(tTrflexibilitydetail.getVersionNo());
						
						// で作成した ENTITY を 変数.融通輸送明細情報削除リスト に追加(add)する
						delList.add(detail);
					}
					
					// 変数.融通輸送明細情報削除リスト のデータで、融通輸送明細情報 を更新する
					trflexibilitydetailBhv.batchUpdate(delList);
					
					// 融通輸送情報を検索する
					TTrflexibilityCB tTrflexibilityCB = trflexibilityBhv.newConditionBean();
					tTrflexibilityCB.query().setFlexibityno_Equal(entity.getFlexibityno());
					tTrflexibilityCB.query().setDelFlg_Equal_$0();
					List<TTrflexibility> trflexibilitieList = trflexibilityBhv.selectList(tTrflexibilityCB);
					
					if (trflexibilitieList.size() > 0) {
						TTrflexibility tTrflexibility = trflexibilitieList.get(0);
						
						// 融通輸送情報ENTITY を生成し、値を設定する
						TTrflexibility bility = new TTrflexibility();
						// 融通輸送情報ID
						bility.setFlexibleTransportInfoId(tTrflexibility.getFlexibleTransportInfoId());
						// 輸送番号
						String transportCd = entity.getTransportcd();
						if (!CU.isNullOrEmpty(entity.getTransportcd())) {
							transportCd = entity.getTransportcd().length()>3?entity.getTransportcd().substring(0,3):entity.getTransportcd();
						}
						if (TRANS_PORT_CD_YUZ.equals(transportCd)) {
							bility.setTransportcd(" ");
							// ステータス
							bility.setSts(STS_150);
						}else {
							bility.setTransportcd(tTrflexibility.getTransportcd());
							// ステータス
							bility.setSts(STS_500);
						}
						// バージョンNo.
						bility.setVersionNo(tTrflexibility.getVersionNo());
						
						trflexibilityBhv.update(bility);
						
						// ワーク融通輸送情報ID
						flexibleTransportInfoId = tTrflexibility.getFlexibleTransportInfoId();
					}
				}else {
					// 採番マスタから融通No.を取得する。
					flexibityno = numberingLogic.getNumbering(WmsNumberingConst.FLEXIBITY_NO);
					
					// 融通輸送情報を登録する
					TTrflexibility bility = new TTrflexibility();
					// 発送元CD
					bility.setSuppliercd(entity.getSuppliercd());
					// 発送先CD
					bility.setShipcd(entity.getShipcd());
					// 発送予定日
					bility.setSchdate(entity.getSchdate());
					// 融通No.
					bility.setFlexibityno(new BigDecimal(flexibityno));
					// 輸送番号
					bility.setTransportcd(CU.isNullOrEmpty(entity.getTransportcd())?" ":entity.getTransportcd());
					// 受入予定日
					bility.setRcvdate(entity.getRcvdate());
					// 荷主CD
					bility.setClientId(mClient.getClientId());
					// 削除フラグ
					bility.setDelFlg_$0();
					// ステータス
					bility.setSts(STS_150);
					// 指示登録日時
					bility.setInstractdatetime(new Timestamp(System.currentTimeMillis()));
					// 指示変更フラグ
					bility.setVaExtdata1(VA_EXTDATA_0);
					
					trflexibilityBhv.insert(bility);
					
					// ワーク融通輸送情報ID
					flexibleTransportInfoId = bility.getFlexibleTransportInfoId();
				}
			}else if (entity.getFlexibityno() != null && previousEntity.getFlexibityno() != null &&
					entity.getFlexibityno().compareTo(previousEntity.getFlexibityno()) == 0) {
				flexibitylineNo = flexibitylineNo.add(WCC.ONE);
			}else if (entity.getFlexibityno() != null && previousEntity.getFlexibityno() != null &&
					entity.getFlexibityno().compareTo(previousEntity.getFlexibityno()) != 0) {
				flexibitylineNo = WCC.ONE;
			}
			
			// 銘柄マスタを検索する
			MProductCB mProductCB = mProductBhv.newConditionBean();
			mProductCB.query().setClientId_Equal(mClient.getClientId());
			mProductCB.query().setProductCd_Equal(entity.getProductCd());
			mProductCB.query().setDelFlg_Equal_$0();
			List<MProduct> productList= mProductBhv.selectList(mProductCB);
			if (productList.size() > 0) {
				MProduct mProduct = productList.get(0);
				
				// 融通輸送明細情報を登録する
				TTrflexibilitydetail trflexibilitydetail = new TTrflexibilitydetail();
				// 融通輸送情報ID
				trflexibilitydetail.setFlexibleTransportInfoId(flexibleTransportInfoId);;
				// 融通行No.
				trflexibilitydetail.setFlexibitylineno(flexibitylineNo);
				// 削除フラグ
				trflexibilitydetail.setDelFlg_$0();
				// 銘柄CD
				trflexibilitydetail.setProductId(mProduct.getProductId());
				// 通常異型品区分
				trflexibilitydetail.setStddifflg(WCC.ZERO);
				// 融通山出しリストNo.
				trflexibilitydetail.setFlexpicklistno(FLEXPICKLIST_NO_0);
				// 印刷済フラグ
				trflexibilitydetail.setPrintedflg(CDef.PrintedFlg.$0.code());
				// 山出し指示キー
				// 製造年月日
				trflexibilitydetail.setManufacturedate(entity.getManufacturedate());
				// デザイン区分
				trflexibilitydetail.setDesigncd(entity.getDesigncd());
				BigDecimal qtyCase = WCC.ZERO;
				BigDecimal qtyBowl = WCC.ZERO;
				
				if (mProduct.getUnit1().compareTo(WCC.ZERO) != 0 && mProduct.getUnit2().compareTo(WCC.ZERO) != 0) {
					qtyCase = new BigDecimal(CU.nullOrEmptyToZero(entity.getQty())).divide(mProduct.getUnit1().divide(mProduct.getUnit2()), RoundingMode.DOWN);
					qtyBowl = new BigDecimal(entity.getQty()).remainder(
							(mProduct.getUnit1().multiply(mProduct.getUnit2())).divide(mProduct.getUnit2(), RoundingMode.DOWN));
				}
				// 数量（ケース）
				trflexibilitydetail.setQtycase(qtyCase);
				// 数量（カートン）
				trflexibilitydetail.setQtybowl(qtyBowl);
				// 実績数量（ケース）
				trflexibilitydetail.setHtqtycase(WCC.ZERO);
				// 実績数量（カートン）
				trflexibilitydetail.setHtqtybowl(WCC.ZERO);
				// 画面更新者
				trflexibilitydetail.setNvExtdata1(entity.getFlexupduser());
				
				trflexibilitydetailBhv.insert(trflexibilitydetail);
				
				// 変数.融通指示一括取込ワーク処理済リスト のデータで、融通指示一括取込ワーク を更新する
				wReplenishInstInputBhv.batchUpdate(processedList);
			}
			
		}

		return null;
	}

}
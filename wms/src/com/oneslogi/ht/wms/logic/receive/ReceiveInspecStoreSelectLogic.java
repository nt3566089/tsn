package com.oneslogi.ht.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveInspectionCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveInspectionBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
//
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷検品・格納関連データ取得ロジッククラス
 */
public class ReceiveInspecStoreSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* パラメータマスタ         */
	@Inject
	private MParamBhv mParamBhv;
	/* ロケーションマスタ         */
	@Inject
	private MLocationBhv mLocationBhv;
	/* 入荷検品ワーク     */
	@Inject
	private WHtReceiveInspectionBhv wHtReceiveInspectionBhv;
	/* 入庫実績ボディ     */
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	/* 入荷予定ボディ     */
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	// [Ver3.0] unit of measure対応 2017.12.01 王 Del

	/**
	 * <h2>パラメータマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にパラメータマスタデータを取得し、取得した１件目のデータを返す。
	 * データが取得できなかった場合はNULLを返す。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return MParam パラメータマスタ
	 */
	public MParam getMParam(Long clientId, Long centerId) {

		//パラメータ情報の取得
		MParamCB mParamCB = mParamBhv.newMyConditionBean();
		mParamCB.setupSelect_MClientCenter();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		List<MParam> lstMParam = mParamBhv.selectList(mParamCB);

		if (lstMParam.size() > 0) {
			return lstMParam.get(0);
		} else {
			// 0: 管理しない
			return null;
		}
	}

	/**
	 * <h2>ロケーションマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にロケーションマスタデータを取得し、取得した１件目のデータを返す。
	 * データが取得できなかった場合はNULLを返す。
	 * </pre>
	 * @param mLocation ロケーションタマスタ：センタID・ロケーションCD
	 * @return MLocation ロケーションタマスタ
	 */
	public MLocation getMLocation(MLocation mLocation) {
		//パラメータ情報の取得
		MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
		mLocationCB.setupSelect_MZone();
		mLocationCB.query().setCenterId_Equal(mLocation.getCenterId());
		mLocationCB.query().setLocationCd_Equal(mLocation.getLocationCd());

		List<MLocation> lstMLocation = mLocationBhv.selectList(mLocationCB);

		if (lstMLocation.size() > 0) {
			return lstMLocation.get(0);
		} else {
			return null;
		}
	}

	/**
	 * <h2>入荷検品ワークデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷検品ワークからデータを取得する。
	 * 取得したデータを商品、ロット、期限日単位でまとめ、
	 * 入荷検収バラ数（検品数の合計）、実績入庫数（商品、ロット、期限日単位の入庫数の合計）、
	 * 入荷検収個数（商品単位の入庫数の合計）を算出し設定する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：MACアドレス
	 * @return List<WHtReceiveInspection> 入荷検品ワークリスト
	 */
	public List<WHtReceiveInspection> selectList(WHtReceiveInspection wHtReceiveInspection) {
		// 入荷検品ワークテーブルのデータ取得
		WHtReceiveInspectionCB wHtReceiveInspectionCB = wHtReceiveInspectionBhv.newMyConditionBean();
		wHtReceiveInspectionCB.setupSelect_MProduct();
		wHtReceiveInspectionCB.setupSelect_TLot();
		wHtReceiveInspectionCB.setupSelect_MLocation();
		wHtReceiveInspectionCB.query().setMacAddress_Equal(wHtReceiveInspection.getMacAddress());

		wHtReceiveInspectionCB.query().addOrderBy_HtWorkNo_Asc();
		wHtReceiveInspectionCB.query().addOrderBy_ProductId_Asc();
		wHtReceiveInspectionCB.query().addOrderBy_Lot_Asc();
		wHtReceiveInspectionCB.query().addOrderBy_LimitDt_Asc();

		List<WHtReceiveInspection> lstWHtReceiveInspection = wHtReceiveInspectionBhv.selectList(wHtReceiveInspectionCB);

		if (lstWHtReceiveInspection.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtReceiveInspection;
		}


		List<WHtReceiveInspection> aryWHtReceiveInspection = new ArrayList<WHtReceiveInspection>();
		WHtReceiveInspection temp = lstWHtReceiveInspection.get(0);
		BigDecimal lngSumPieceQtyRcv = temp.getPieceQtyRcv();

		WHtReceiveInspection wReceive = new WHtReceiveInspection();
		wReceive.setCenterId(temp.getCenterId());;
		wReceive.setClientId(temp.getClientId());
		wReceive.setHtWorkNo(temp.getHtWorkNo());
		wReceive.setMacAddress(temp.getMacAddress());
		for (int i = 1; i < lstWHtReceiveInspection.size(); i++) {
			WHtReceiveInspection tempNext = lstWHtReceiveInspection.get(i);
			if (temp.getProductId().equals(tempNext.getProductId()) &&
					CU.equals(temp.getLot(), tempNext.getLot()) &&
					CU.equals(temp.getLimitDt(), tempNext.getLimitDt())) {
				lngSumPieceQtyRcv = WCC.add(lngSumPieceQtyRcv, tempNext.getPieceQtyRcv());
			} else {
				// 検品数の合計
				temp.setPieceQtyRcv(lngSumPieceQtyRcv);
				// 商品、ロット、期限日単位の検品済数の合計
				temp.setStoreNum(selectStoreNum(temp));
				// 商品単位の検品済数の合計
				wReceive.setProductId(temp.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.01 王 Del
				aryWHtReceiveInspection.add(temp);
				temp = tempNext;
				lngSumPieceQtyRcv = temp.getPieceQtyRcv();
			}
		}
		// 検品数の合計
		temp.setPieceQtyRcv(lngSumPieceQtyRcv);
		// 検品済数の合計
		temp.setStoreNum(selectStoreNum(temp));
		// 商品単位の検品済数の合計
		wReceive.setProductId(temp.getProductId());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del

		aryWHtReceiveInspection.add(temp);

		return aryWHtReceiveInspection;
	}

	/**
	 * <h2>入庫実績ボディデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ボディのデータを取得する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：ＨＴ作業ＮＯ・商品ID・ロット・期限日・荷主ID・センタID
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> selectStoreRecord(WHtReceiveInspection wHtReceiveInspection) {
		// 入庫実績データの取得
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
		cb.setupSelect_TStoreRecordH().withTReceivePlanH();
		cb.setupSelect_TReceivePlanB();

		cb.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveInspection.getHtWorkNo());
		cb.query().queryTReceivePlanB().setProductId_Equal(wHtReceiveInspection.getProductId());
		cb.query().setLot_Equal(wHtReceiveInspection.getLot());
		cb.query().setLimitDt_Equal(wHtReceiveInspection.getLimitDt());
		cb.query().queryTStoreRecordH().setCenterId_Equal(wHtReceiveInspection.getCenterId());
		cb.query().queryTStoreRecordH().setClientId_Equal(wHtReceiveInspection.getClientId());

		cb.query().addOrderBy_ReceivePlanBId_Asc();

		List<TStoreRecordB> lstTStoreRecordBCB = tStoreRecordBBhv.selectList(cb);

		return lstTStoreRecordBCB;
	}

	/**
	 * <h2>入庫数の合計を取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ボディのデータを取得し、
	 * 入庫数の合計を算出する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：ＨＴ作業ＮＯ・商品ID・ロット・期限日・荷主ID・センタID
	 * @return BigDecimal 入庫数の合計
	 */
	public BigDecimal selectStoreNum(WHtReceiveInspection wHtReceiveInspection) {
		// 入庫実績データの取得
		List<TStoreRecordB> lstTStoreRecordBCB = selectStoreRecord(wHtReceiveInspection);

		// 入庫数の合計
		BigDecimal storeNum = WCC.ZERO;
		for (TStoreRecordB temp : lstTStoreRecordBCB) {
			storeNum = WCC.add(storeNum, temp.getStoreNum());
		}
		return storeNum;
	}

	/**
	 * <h2>入庫数の合計を取得する（MACアドレス単位）。</h2>
	 * <pre>
	 * 引数を条件に入荷検品ワークテーブルのデータ取得し、
	 * 入庫数の合計を算出する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：MACアドレス・ＨＴ作業ＮＯ・商品ID
	 * @return Long 入庫数の合計
	 */
	public BigDecimal getMyStoreNum(WHtReceiveInspection wHtReceiveInspection) {
		// 入荷検品ワークテーブルのデータ取得
		WHtReceiveInspectionCB wHtReceiveInspectionCB = wHtReceiveInspectionBhv.newMyConditionBean();
		wHtReceiveInspectionCB.query().setMacAddress_Equal(wHtReceiveInspection.getMacAddress());
		wHtReceiveInspectionCB.query().setHtWorkNo_Equal(wHtReceiveInspection.getHtWorkNo());
		wHtReceiveInspectionCB.query().setProductId_Equal(wHtReceiveInspection.getProductId());

		List<WHtReceiveInspection> lstWHtReceiveInspection = wHtReceiveInspectionBhv.selectList(wHtReceiveInspectionCB);

		// 入庫数の合計
		BigDecimal lngSumPieceQtyRcv = WCC.ZERO;
		for (WHtReceiveInspection temp : lstWHtReceiveInspection) {
			lngSumPieceQtyRcv = WCC.add(lngSumPieceQtyRcv, temp.getPieceQtyRcv());
		}
		return lngSumPieceQtyRcv;
	}
	/**
	 * <h2>入庫実績ヘッダデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ヘッダデータを取得する。
	 * </pre>
	 * @param tStoreRecordH 入庫実績ヘッダ：入荷予定ヘッダID
	 * @return TStoreRecordH 入庫実績ヘッダ
	 */
	public TStoreRecordH selectStoreRecordeH(TStoreRecordH tStoreRecordH) {
		// 入庫実績データの取得
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
		cb.setupSelect_TStoreRecordH().withTReceivePlanH();

		cb.query().queryTStoreRecordH().setReceivePlanHId_Equal(tStoreRecordH.getReceivePlanHId());

		List<TStoreRecordB> lstTStoreRecordB = tStoreRecordBBhv.selectList(cb);

		if (lstTStoreRecordB.size() == 0) {
			return null;
		}

		return lstTStoreRecordB.get(0).getTStoreRecordH();
	}

	/**
	 * <h2>入荷予定情報を取得する。</h2>
	 * <pre>
	 * 引数を条件に入荷予定関連データ及び入庫実績ボディの入庫数合計を取得する。
	 * 商品荷姿マスタからケース入数を取得し、入荷予定ボディデータに設定する。
	 *
	 *  検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.・センタ間移動フラグ
	 * @param mProduct 商品マスタ：JANCD・商品CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @return List<TReceivePlanB> 入荷予定ボディリスト
	 */
	public List<TReceivePlanB> selectReceivePlanListData(TReceivePlanH tReceivePlanH, final MProduct mProduct, BUser bUser) {

		// 入荷予定情報の取得
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();

		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMClient();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCenter();
		if (bUser != null) {
			tReceivePlanBCB.setupSelect_TReceivePlanH().withMStockType().withVDict(bUser.getCultureId());
		}
		tReceivePlanBCB.setupSelect_MProduct();

		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(tReceivePlanH.getCenterId());
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(tReceivePlanH.getClientId());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());

		if (mProduct != null) {
			tReceivePlanBCB.orScopeQuery(new OrQuery<TReceivePlanBCB>() {
				public void query(TReceivePlanBCB orCB) {
					orCB.query().queryMProduct().setJanCd_Equal(mProduct.getJanCd());
					orCB.query().queryMProduct().setProductCd_Equal(mProduct.getJanCd());
					orCB.query().queryMProduct().setProductCd_Equal(mProduct.getProductCd());
				}
			});
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 Start
/*
	        // ===== 商品荷姿マスタの商品ID最大値 =====
			tReceivePlanBCB.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
				public void query(MProductShapeCB subCB) {
					subCB.specify().columnUnitNum();
					setDelFlg(subCB);
				}
	        }, TReceivePlanB.TRPB_maxUnitNum);
*/
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 End
		}
		//入庫実績ボディの入庫数の合計値を抽出
		tReceivePlanBCB.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {
				subCB.specify().columnStoreNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_sumStoreNum, op -> op.coalesce(0));

		//ON推-品向-1005 センタ間移動の場合LINE_NOの順番で取得 2015/11/26 NayZaw Start
		if(tReceivePlanH.getCenterTransitFlg()!=null){
			if(tReceivePlanH.getCenterTransitFlg().equals("1")){
				tReceivePlanBCB.query().addOrderBy_LineNo_Asc();
			}else{
				tReceivePlanBCB.query().addOrderBy_ReceiveStatus_Asc();
				tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();
			}
		}else{
			tReceivePlanBCB.query().addOrderBy_ReceiveStatus_Asc();
			tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();
		}
		//ON推-品向-1005 センタ間移動の場合LINE_NOの順番で取得 2015/11/26 NayZaw End

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		if (lstTReceivePlanB.size() == 0) {
			// 該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.27 王 Del

		return lstTReceivePlanB;
	}

	//	ON推-品向-1005 センタ間移動の場合、ロート・期限日設定している商品を設定通りのみ取得為追加処理 2015/11/26 NayZaw Start

	/**
	 * <h2>入荷予定情報を取得する。</h2>
	 * <pre>
	 * 引数を条件に入荷予定関連データ及び入庫実績ボディの入庫数合計を取得する。
	 * 商品荷姿マスタからケース入数を取得し、入荷予定ボディデータに設定する。
	 *
	 *  検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.
	 * @param mProduct 商品マスタ：JANCD・商品CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @param planLot 予定ロット
	 * @param planLimitDt 予定期限日
	 * @return List<TReceivePlanB> 入荷予定ボディリスト
	 */
	public List<TReceivePlanB> selectReceivePlanListData(TReceivePlanH tReceivePlanH, final MProduct mProduct, BUser bUser,String planLot,String planLimitDt) {

		// 入荷予定情報の取得
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();

		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMClient();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCenter();
		if (bUser != null) {
			tReceivePlanBCB.setupSelect_TReceivePlanH().withMStockType().withVDict(bUser.getCultureId());
		}
		tReceivePlanBCB.setupSelect_MProduct();

		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(tReceivePlanH.getCenterId());
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(tReceivePlanH.getClientId());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());
		tReceivePlanBCB.query().setPlanLot_Equal(planLot);
		tReceivePlanBCB.query().setPlanLimitDt_Equal(planLimitDt);

		if (mProduct != null) {
			tReceivePlanBCB.orScopeQuery(new OrQuery<TReceivePlanBCB>() {
				public void query(TReceivePlanBCB orCB) {
					orCB.query().queryMProduct().setJanCd_Equal(mProduct.getJanCd());
					orCB.query().queryMProduct().setProductCd_Equal(mProduct.getJanCd());
					orCB.query().queryMProduct().setProductCd_Equal(mProduct.getProductCd());
				}
			});
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 Start
/*
	        // ===== 商品荷姿マスタの商品ID最大値 =====
			tReceivePlanBCB.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
				public void query(MProductShapeCB subCB) {
					subCB.specify().columnUnitNum();
					setDelFlg(subCB);
				}
	        }, TReceivePlanB.TRPB_maxUnitNum);
*/
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 End
		}
		//入庫実績ボディの入庫数の合計値を抽出
		tReceivePlanBCB.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {
				subCB.specify().columnStoreNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_sumStoreNum, op -> op.coalesce(0));

		tReceivePlanBCB.query().addOrderBy_ReceiveStatus_Asc();
		tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		if (lstTReceivePlanB.size() == 0) {
			// 該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return null;
			// [Ver3.0] unit of measure対応 2017.11.27 王 Del
		}
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 追加 End

		return lstTReceivePlanB;
	}
	//	ON推-品向-1005  センタ間移動の場合、ロート・期限日設定している商品を設定通りのみ取得為追加処理 2015/11/26 NayZaw End
	/**
	 * <h2>予定数合計を取得する。</h2>
	 * <pre>
	 * 予定数合計、入庫数合計、入庫バラ数（残数）を算出する。
	 * 取得したデータの１件目（戻り値）に各算出結果と入荷ステータスの最小値を設定する。
	 *
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.・センタ間移動フラグ
	 * @param mProduct 商品マスタ：JANCD・商品CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @return TReceivePlanB 入荷予定ボディ
	 */
	public TReceivePlanB selectReceivePlanData(TReceivePlanH tReceivePlanH, final MProduct mProduct, BUser bUser) {

        //予定データの取得
		List<TReceivePlanB> lstTReceivePlanB = selectReceivePlanListData(tReceivePlanH, mProduct, bUser);
		if (lstTReceivePlanB == null) {
			return null;
		}

        //予定数の合計
		BigDecimal lngSumPlanNum = WCC.ZERO;
		BigDecimal lngLeftPlanNum = WCC.ZERO;
		BigDecimal lngSumStoreNum = WCC.ZERO;
		TReceivePlanB tReceivePlanBSum = lstTReceivePlanB.get(0);
		for (TReceivePlanB tReceivePlanB : lstTReceivePlanB) {
			lngSumPlanNum = WCC.add(lngSumPlanNum, tReceivePlanB.getPlanNum());
			lngSumStoreNum = WCC.add(lngSumStoreNum, tReceivePlanB.getSumStoreNum());
		}

		// 過入荷場合、０を設定する
		if (WCC.isPositive(WCC.subtract(lngSumPlanNum, lngSumStoreNum))) {
			lngLeftPlanNum = WCC.subtract(lngSumPlanNum, lngSumStoreNum);
		}
		tReceivePlanBSum.setPlanNum(lngSumPlanNum);
		tReceivePlanBSum.setSumStoreNum(lngSumStoreNum);
		tReceivePlanBSum.setPreceNum(lngLeftPlanNum);
		//ON推-品向-1005 入荷検品・格納(数量)画面の予定数に使用する為追加した項目 2015/11/26 NayZaw Start
		tReceivePlanBSum.setTotalPreceNum(lngLeftPlanNum);
		//ON推-品向-1005 入荷検品・格納(数量)画面の予定数に使用する為追加した項目 2015/11/26 NayZaw Start
		// ====入力したJAN/商品コードのステータスが最小ステータスの取得 ====
		tReceivePlanBSum.setReceiveStatus(lstTReceivePlanB.get(0).getReceiveStatus());

		return tReceivePlanBSum;
	}

	//	ON推-品向-1005  センタ間移動の場合、ロート・期限日設定している商品を設定通りのみ取得為追加処理 2015/11/26 NayZaw Start
	/**
	 * <h2>予定数合計を取得する。</h2>
	 * <pre>
	 * 予定数合計、入庫数合計、入庫バラ数（残数）を算出する。
	 * 取得したデータの１件目（戻り値）に各算出結果と入荷ステータスの最小値を設定する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.
	 * @param mProduct 商品マスタ：JANCD・商品CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @param planLot 予定ロット
	 * @param planLimitDt 予定期限日
	 * @return TReceivePlanB 入荷予定ボディ
	 */
	public TReceivePlanB selectReceivePlanData(TReceivePlanH tReceivePlanH, final MProduct mProduct, BUser bUser,String planLot,String planLimitDt) {

        //予定データの取得
		List<TReceivePlanB> lstTReceivePlanB = selectReceivePlanListData(tReceivePlanH, mProduct, bUser,planLot,planLimitDt);
		if (lstTReceivePlanB == null) {
			return null;
		}

        //予定数の合計
		BigDecimal lngSumPlanNum = WCC.ZERO;
		BigDecimal lngLeftPlanNum = WCC.ZERO;
		BigDecimal lngSumStoreNum = WCC.ZERO;
		TReceivePlanB tReceivePlanBSum = lstTReceivePlanB.get(0);
		for (TReceivePlanB tReceivePlanB : lstTReceivePlanB) {
			lngSumPlanNum = WCC.add(lngSumPlanNum, tReceivePlanB.getPlanNum());
			lngSumStoreNum = WCC.add(lngSumStoreNum, tReceivePlanB.getSumStoreNum());
		}

		// 過入荷場合、０を設定する
		if (WCC.isPositive(WCC.subtract(lngSumPlanNum, lngSumStoreNum))) {
			lngLeftPlanNum = WCC.subtract(lngSumPlanNum, lngSumStoreNum);
		}
		tReceivePlanBSum.setPlanNum(lngSumPlanNum);
		tReceivePlanBSum.setSumStoreNum(lngSumStoreNum);
		TReceivePlanB tempPlanB=selectReceivePlanData(tReceivePlanH, mProduct, bUser);
		tReceivePlanBSum.setPreceNum(lngLeftPlanNum);
		tReceivePlanBSum.setTotalPreceNum(tempPlanB.getTotalPreceNum());
		// ====入力したJAN/商品コードのステータスが最小ステータスの取得 ====
		tReceivePlanBSum.setReceiveStatus(lstTReceivePlanB.get(0).getReceiveStatus());

		return tReceivePlanBSum;
	}
	//	ON推-品向-1005  センタ間移動の場合、ロート・期限日設定している商品を設定通りのみ取得為追加処理 2015/11/26 NayZaw End

	/**
	 * <h2>予定数合計を取得する。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ボディデータを取得し、
	 * 予定数合計を計算して返却する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.・センタ間移動フラグ
	 * @return TReceivePlanB 入荷予定ボディの予定数の合計
	 */
	public BigDecimal getReceivePlanNum(TReceivePlanH tReceivePlanH) {

        //予定データの取得
		List<TReceivePlanB> lstTReceivePlanB = selectReceivePlanListData(tReceivePlanH, null, null);
		if (lstTReceivePlanB == null) {
			return WCC.ZERO;
		}

        //予定数の合計
		BigDecimal lngSumPlanNum = WCC.ZERO;
		TReceivePlanB tReceivePlanBSum = lstTReceivePlanB.get(0);
		for (TReceivePlanB tReceivePlanB : lstTReceivePlanB) {
			lngSumPlanNum = WCC.add(lngSumPlanNum, tReceivePlanB.getPlanNum());
		}
		tReceivePlanBSum.setPlanNum(lngSumPlanNum);

		return lngSumPlanNum;
	}
}
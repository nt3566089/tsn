package com.oneslogi.ht.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveNoPlanInspCB;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
//
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 予定無し入荷関連データ取得ロジッククラス
 */
public class ReceiveNoPlanInspectionSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* パラメータマスタ         */
	@Inject
	private MParamBhv mParamBhv;
	/* 取引先マスタ     */
	@Inject
	private MCustomerBhv mCustomerBhv;
	/* 在庫区分マスタ     */
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	/* 処理区分マスタ     */
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;
	/* 入庫実績ボディ     */
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	/* 入荷検品ワーク     */
	@Inject
	private WHtReceiveNoPlanInspBhv wHtReceiveNoPlanInspecBhv;
	/* 入荷予定ボディ     */
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	/**
	 * <h2>パラメータマスタの情報を取得する。</h2>
	 * <pre>
	 * 引数を条件にパラメータマスタデータを取得し、取得した１件目のデータを返す。
	 *
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
	 * <h2>処理区分名称を取得する。</h2>
	 * <pre>
	 * 引数を条件に処理区分マスタデータを取得し、取得した１件目のデータを返す。
	 *
	 * データが取得できなかった場合はNULLを返す。
	 * </pre>
	 * @param mProcessType 処理区分マスタ：処理区分CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getProcessTypeNm(BUser bUser, MProcessType mProcessType) {
		//処理区分マスタテーブルのデータ取得
		MProcessTypeCB mProcessTypeCB = mProcessTypeBhv.newMyConditionBean();
		mProcessTypeCB.setupSelect_VDict(bUser.getCultureId());
		mProcessTypeCB.query().setProcessTypeCd_Equal(mProcessType.getProcessTypeCd());

		List<MProcessType> lstMProcessType = mProcessTypeBhv.selectList(mProcessTypeCB);

		if (lstMProcessType.size() != 0) {
			return lstMProcessType.get(0);
		}else{
			return null;
		}
	}

	/**
	 * <h2>在庫区分データを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫区分マスタデータを取得し、取得した１件目のデータを返す。
	 *
	 * データが取得できなかった場合はNULLを返す。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getStockTypeNm(BUser bUser, MStockType mStockType) {
		//在庫区分マスタテーブルのデータ取得
		MStockTypeCB mStockTypeCB = mStockTypeBhv.newMyConditionBean();
		mStockTypeCB.setupSelect_VDict(bUser.getCultureId());
		mStockTypeCB.query().setStockTypeCd_Equal(mStockType.getStockTypeCd());

		List<MStockType> lstMStockType = mStockTypeBhv.selectList(mStockTypeCB);

		if (lstMStockType.size() != 0) {
			return lstMStockType.get(0);
		}else{
			return null;
		}
	}

	/**
	 * <h2>取引先マスタ(預託)リストを取得する。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタから預託データを検索し、結果を返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @return List<MCustomer> 取引先マスタリスト
	 */
	public List<MCustomer> selectDepositList(MClient mClient) {

		//取引先マスタテーブルのデータ取得
		MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
		mCustomerCB.query().setDepositFlg_Equal_$1();
		mCustomerCB.query().setClientId_Equal(mClient.getClientId());

		mCustomerCB.query().addOrderBy_CustomerCd_Asc();

		List<MCustomer> lstMCustomer = mCustomerBhv.selectList(mCustomerCB);

		if (lstMCustomer.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMCustomer;
		}

		return lstMCustomer;
	}

	/**
	 * <h2>処理区分データを取得する。</h2>
	 * <pre>
	 * 引数を条件に処理区分マスタから入荷対象データを検索し、結果を返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザマスタ：カルチャID
	 * @return List<MProcessType> 処理区分マスタリスト
	 */
	public List<MProcessType> selectProcessList(BUser bUser) {
		//処理区分マスタテーブルのデータ取得
		MProcessTypeCB mProcessTypeCB = mProcessTypeBhv.newMyConditionBean();
		mProcessTypeCB.query().setReceiveFlg_Equal_$1();
		mProcessTypeCB.setupSelect_VDict(bUser.getCultureId());
		mProcessTypeCB.query().addOrderBy_ProcessTypeCd_Asc();

		List<MProcessType> lstMProcessType = mProcessTypeBhv.selectList(mProcessTypeCB);

		if (lstMProcessType.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMProcessType;
		}

		return lstMProcessType;
	}

	/**
	 * <h2>在庫区分データを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫区分マスタからデータを検索し、結果を返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザマスタ：カルチャID
	 * @return List<MStockType> 在庫区分マスタリスト
	 */
	public List<MStockType> selectStockList(BUser bUser) {
		//在庫区分マスタテーブルのデータ取得
		MStockTypeCB mStockTypeCB = mStockTypeBhv.newMyConditionBean();
		mStockTypeCB.setupSelect_VDict(bUser.getCultureId());

		mStockTypeCB.query().addOrderBy_StockTypeCd_Asc();

		List<MStockType> lstMStockType = mStockTypeBhv.selectList(mStockTypeCB);

		if (lstMStockType.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMStockType;
		}

		return lstMStockType;
	}

	/**
	 * <h2>取引先マスタ(仕入先)データを取得する。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタから仕入先データを検索し、結果を返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClientDto 荷主マスタ：荷主ID
	 * @return List<MCustomer> 取引先マスタリスト
	 */
	public List<MCustomer> selectSupplierList(MClientDto mClientDto) {

		//取引先マスタテーブルのデータ取得
		MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
		mCustomerCB.query().setVendorFlg_Equal_$1();
		mCustomerCB.query().setClientId_Equal(mClientDto.getClientId());

		mCustomerCB.query().addOrderBy_CustomerCd_Asc();

		List<MCustomer> lstMCustomer = mCustomerBhv.selectList(mCustomerCB);

		if (lstMCustomer.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMCustomer;
		}

		return lstMCustomer;
	}

	/**
	 * <h2>予定無し入荷ワークを取得する。</h2>
	 * <pre>
	 * 引数をキーに予定無し入荷ワークからデータを取得する。
	 * 商品単位で入荷検収バラ数の合計、入庫数の合計を算出し、取得したデータに設定する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：MACアドレス
	 * @return List<WHtReceiveNoPlanInsp> 予定無し入荷ワーク
	 */
	public List<WHtReceiveNoPlanInsp> selectList(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {
		// 入荷検品ワークテーブルのデータ取得
		WHtReceiveNoPlanInspCB wHtReceiveNoPlanInspecCB = wHtReceiveNoPlanInspecBhv.newMyConditionBean();
		wHtReceiveNoPlanInspecCB.setupSelect_MProduct();
		wHtReceiveNoPlanInspecCB.setupSelect_TLot();
		wHtReceiveNoPlanInspecCB.setupSelect_MLocation();
		wHtReceiveNoPlanInspecCB.query().setMacAddress_Equal(wHtReceiveNoPlanInspec.getMacAddress());

		wHtReceiveNoPlanInspecCB.query().addOrderBy_HtWorkNo_Asc();
		wHtReceiveNoPlanInspecCB.query().addOrderBy_ProductId_Asc();
		wHtReceiveNoPlanInspecCB.query().addOrderBy_Lot_Asc();
		wHtReceiveNoPlanInspecCB.query().addOrderBy_LimitDt_Asc();

		List<WHtReceiveNoPlanInsp> lstWHtReceiveNoPlanInsp = wHtReceiveNoPlanInspecBhv.selectList(wHtReceiveNoPlanInspecCB);

		if (lstWHtReceiveNoPlanInsp.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtReceiveNoPlanInsp;
		}


		List<WHtReceiveNoPlanInsp> aryWHtReceiveNoPlanInsp = new ArrayList<WHtReceiveNoPlanInsp>();
		WHtReceiveNoPlanInsp temp = lstWHtReceiveNoPlanInsp.get(0);
		BigDecimal lngSumPieceQtyRcv = temp.getPieceQtyRcv();

		WHtReceiveNoPlanInsp wReceive = new WHtReceiveNoPlanInsp();
		wReceive.setCenterId(temp.getCenterId());;
		wReceive.setClientId(temp.getClientId());
		wReceive.setHtWorkNo(temp.getHtWorkNo());
		wReceive.setMacAddress(temp.getMacAddress());
		for (int i = 1; i < lstWHtReceiveNoPlanInsp.size(); i++) {
			WHtReceiveNoPlanInsp tempNext = lstWHtReceiveNoPlanInsp.get(i);
			if (temp.getProductId().equals(tempNext.getProductId()) &&
					CU.equals(temp.getLot(), tempNext.getLot()) &&
					CU.equals(temp.getLimitDt(), tempNext.getLimitDt())) {
				lngSumPieceQtyRcv = WCC.add(lngSumPieceQtyRcv, tempNext.getPieceQtyRcv());
			} else {
				// 検品数の合計
				temp.setPieceQtyRcv(lngSumPieceQtyRcv);
				// 商品単位の検品済数の合計
				wReceive.setProductId(temp.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.01 王 Del
				aryWHtReceiveNoPlanInsp.add(temp);
				temp = tempNext;
				lngSumPieceQtyRcv = temp.getPieceQtyRcv();
			}
		}
		// 検品数の合計
		temp.setPieceQtyRcv(lngSumPieceQtyRcv);
		// 商品単位の検品済数の合計
		wReceive.setProductId(temp.getProductId());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del

		aryWHtReceiveNoPlanInsp.add(temp);

		return aryWHtReceiveNoPlanInsp;
	}

	/**
	 * <h2>入庫実績ボディを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ボディからデータを検索し、結果を返却する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：ＨＴ作業ＮＯ・商品ID・ロット・期限日・センタID・荷主ID
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> selectStoreRecord(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {
		// 入庫実績データの取得
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
		cb.setupSelect_TStoreRecordH().withTReceivePlanH();
		cb.setupSelect_TReceivePlanB();

		cb.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveNoPlanInspec.getHtWorkNo());
		cb.query().queryTReceivePlanB().setProductId_Equal(wHtReceiveNoPlanInspec.getProductId());
		cb.query().setLot_Equal(wHtReceiveNoPlanInspec.getLot());
		cb.query().setLimitDt_Equal(wHtReceiveNoPlanInspec.getLimitDt());
		cb.query().queryTStoreRecordH().setCenterId_Equal(wHtReceiveNoPlanInspec.getCenterId());
		cb.query().queryTStoreRecordH().setClientId_Equal(wHtReceiveNoPlanInspec.getClientId());

		cb.query().addOrderBy_ReceivePlanBId_Asc();

		List<TStoreRecordB> lstTStoreRecordBCB = tStoreRecordBBhv.selectList(cb);

		return lstTStoreRecordBCB;
	}

	/**
	 * <h2>入庫数の合計を取得する。</h2>
	 * <pre>
	 * 入庫実績データを取得し、入庫数の合計を算出する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：ＨＴ作業ＮＯ・商品ID・ロット・期限日・センタID・荷主ID
	 * @return Long 入庫数合計（検品済数）
	 */
	public BigDecimal selectStoreNum(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {
		// 入庫実績データの取得
		List<TStoreRecordB> lstTStoreRecordBCB = selectStoreRecord(wHtReceiveNoPlanInspec);

		// 入庫数の合計
		BigDecimal storeNum = WCC.ZERO;
		for (TStoreRecordB temp : lstTStoreRecordBCB) {
			storeNum = WCC.add(storeNum, temp.getStoreNum());
		}
		return storeNum;
	}

	/**
	 * <h2>入庫実績ヘッダを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ヘッダからデータを検索し、結果を返却する。
	 * データが取得できなかった場合はNULLを返す。
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
	 * <h2>入荷予定ボディを取得する。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ボディからデータを検索し、結果を返却する。
	 * </pre>
	 * @param tReceivePlanH  入荷予定ヘッダ：入荷予定ヘッダID
	 * @return List<TReceivePlanB> 入荷予定ボディリスト
	 */
	public List<TReceivePlanB> selectReceivePlanB(TReceivePlanH tReceivePlanH) {
		// 入荷予定データの取得
		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
		cb.setupSelect_TReceivePlanH();

		cb.query().queryTReceivePlanH().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());
		cb.query().addOrderBy_LineNo_Desc();

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(cb);

		return lstTReceivePlanB;
	}

}
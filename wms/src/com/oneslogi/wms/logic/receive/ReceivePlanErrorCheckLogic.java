package com.oneslogi.wms.logic.receive;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlReceivePlanBulkMasterDataPmb;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceivePlanBulkMasterData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷エラーチェックロジッククラス
 */
public class ReceivePlanErrorCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;

	@Inject
	private MProductBhv mProductBhv;

	@Inject
	private MWarehouseBhv mWarehouseBhv;

	@Inject
	private MCustomerBhv mCustomerBhv;

	@Inject
	private MLocationBhv mLocationBhv;

	// コントロールNoで取得してチェック又は入荷予定ヘッダIDで取得してチェックを決める処理追加 2016.4.4 Nay Zaw Start
	/**
	 * <h2>入荷エラーのチェックを行う。</h2>
	 * <pre>
	 * 引数のコントロールNoがnullでない場合、
	 * コントロールNoをキーに入荷予定データを取得し【入荷エラーチェック】を行う。
	 * コントロールNoがnullの場合、
	 * 引数の入荷予定ヘッダIDをキーに入荷予定データを取得し【入荷エラーチェック】を行う。
	 * チェック結果で入荷予定ヘッダと入荷予定ボディのエラー情報を更新する。
	 *
	 * 【入荷エラーチェック】
	 * ・予定仕入先CDの存在チェック
	 * ・予定預託CDの存在チェック
	 * ・商品CDの存在チェック
	 * ・ロケーションCD存在チェック
	 * ・倉庫CD存在チェック
	 * ・倉庫CDとロケーションCDの整合チェック
	 * ・明細エラー有無チェック
	 * </pre>
	 * @param controlNo コントロールNo
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true：エラーなし、false：エラーあり
	 */
	public boolean check(Long controlNo, Long receivePlanHId, ErrorStatus errSts){
		if(controlNo != null){
			return checkByControlNo(controlNo, errSts);
		}else{
			return checkByReceiePlanHId(receivePlanHId, errSts);
		}
	}
	// コントロールNoで取得してチェック又は入荷予定ヘッダIDで取得してチェックを決める処理追加 2016.4.4 Nay Zaw End

	// コントロールNoでデータベースから取得する方法に変更 2016.3.14 nayzaw Start
	// マスタ存在チェックを各マスタに結合しコントロールNoで取得方法に変更 2016.05.27 nayzaw Start
	/**
	 * <h2>入荷エラーチェック。</h2>
	 * <pre>
	 * コントロールNoをキーにデータベースから入荷予定データを取得し、次のチェックを行う。
	 * ・入荷予定ボディチェック
	 * ・入荷予定ヘッダチェック
	 *
	 * 【データ取得テーブル】
	 * ・入荷予定ボディ
	 * ・入荷予定ヘッダ
	 * ・商品マスタ
	 * ・倉庫マスタ
	 * ・ロケーションマスタ
	 * ・ゾーンマスタ
	 * ・取引先マスタ
	 *
	 * </pre>
	 * @param controlNo コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private boolean checkByControlNo(Long controlNo,ErrorStatus errSts){

		List<TReceivePlanB> tReceivePlanBList = null;
		//前行のヘッダId保存
		Long hId = 0l;
		int err = 0;
		boolean errBodyFlg = false;
		boolean errHeaderFlg = false;
		boolean sameHeaderFlg = false;
		boolean errorDataFlg = false;
		boolean errorFlg = false;

		// ================== 入荷予定ボディ取得 =======================
		TReceivePlanBCB tReceivePlanBCB =tReceivePlanBBhv.newMyConditionBean();
		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.query().queryTReceivePlanH().setControlNo_Equal(controlNo);
		tReceivePlanBCB.query().queryTReceivePlanH().addOrderBy_ReceivePlanHId_Asc();
		tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();
		tReceivePlanBList = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		// ================  マスタデータ取得  ========================
		String path = TReceivePlanBBhv.PATH_selectSqlReceivePlanBulkMasterData;
		// 検索条件の設定
		SqlReceivePlanBulkMasterDataPmb pmb = new SqlReceivePlanBulkMasterDataPmb();
		pmb.setControlNo(controlNo);

		Class<SqlReceivePlanBulkMasterData> entityType = SqlReceivePlanBulkMasterData.class;
		List<SqlReceivePlanBulkMasterData> resultList = selectList(tReceivePlanBBhv,path,pmb,entityType);

        int row = -1;
        // マスタデータ存在チェック
		for(TReceivePlanB planB : tReceivePlanBList){

			row++;
			// 入荷予定ヘッダデータ取得
			TReceivePlanH planH = planB.getTReceivePlanH();

			SqlReceivePlanBulkMasterData result = resultList.get(row);
			if(!(hId == null && planH.getReceivePlanHId() == null)){
				//前行のヘッダIdと当行のヘッダIdがnull以外の場合

				if(!CU.isNotNullAndEquals(hId, planH.getReceivePlanHId())){
					//前行のヘッダIdと違う場合

					err = 0;
					errorDataFlg = false;
					sameHeaderFlg = false;
					hId=planH.getReceivePlanHId();
					errHeaderFlg = true; // 初期化 エラー無
					errBodyFlg = true; // 初期化 エラー無

					// ============ 入荷予定ヘッダチェック ==============
					if(planH.getPlanSupplierCd() != null){
						if(result.getSupplyCustomerId() != null && result.getSupplyVendorFlg().equals("1")){
							planH.setPlanSupplierId(result.getSupplyCustomerId());
							errHeaderFlg = true; //エラー無
						} else {
							// 取引先マスタ検索結果件数＝0の場合

							// エラーメッセージをエラー管理クラスに登録
							// エンティティ編集
							planH.setErrorFlg_$1();
							planH.setReceiveStatus_$99();
							// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
							//planH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
							planH.setErrorMessageCd(WmsMessageConst.SUPPLIER_CD_NOT_FOUND_ERROR);
							// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
							// [#7412][v3.1][OSS] 預託未登録のエラーメッセージ変更 2020/04/23 KAI MOD START
							errHeaderFlg = false; //エラー存在
						}
					}

					if(errHeaderFlg == true){
						//エラー存在しない場合

						//入荷予定ヘッダ.予定預託CDがnull以外の場合、取引先マスタ情報取得(予定預託CDチェック用)
						if(planH.getPlanDepositCd() != null){

							if(result.getDepositCustomerId() != null && result.getDepositFlg().equals("1")){
								planH.setPlanDepositId(result.getDepositCustomerId());
								errHeaderFlg = true;  // エラー無
							} else {
								//検索結果件数＝0の場合

								// エラーメッセージをエラー管理クラスに登録
								// エンティティ編集
								planH.setErrorFlg_$1();
								planH.setReceiveStatus_$99();
								// [#7348][v3.1][OSS] 預託未登録のエラーメッセージ変更 2020/04/23 KAI MOD START
								//planH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
								// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
								//planH.setErrorMessageCd(WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
								planH.setErrorMessageCd(WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
								// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
								// [#7348][v3.1][OSS] 預託未登録のエラーメッセージ変更 2020/04/23 KAI MOD END
								errHeaderFlg = false;  // エラー存在
							}
						}
					}
				}
				else{
					// 前行のヘッダIdと同じ場合
					sameHeaderFlg = true;
				}
			}
			// ===== 入荷予定ボディチェック =====
			// ===== 商品マスタ情報取得 =====

			if(result.getProductId() != null){
				planB.setProductId(result.getProductId());
				errBodyFlg = true; // エラー無

				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
				if (result.getDecimalExistFlg().equals(CDef.DecimalExistFlg.$0.code())) {
					//小数有無フラグが無の場合
					if (errBodyFlg == true && !checkExcelCellInput("^\\d+$", WCC.stripTrailingZeros(planB.getPlanNum()))) {
						// 小数0桁以内
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				} else {
					//小数有無フラグが有の場合
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod Start
					if (errBodyFlg == true && !checkExcelCellInput("^[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", WCC.stripTrailingZeros(planB.getPlanNum()))) {
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod End
						// 小数3桁以内
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				}
				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End
			}
			else{
				// エラーメッセージをエラー管理クラスに登録
				// エンティティ編集
				planB.setErrorFlg_$1();
				planB.setReceiveStatus_$99();
				planB.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				errBodyFlg = false; // エラー存在
				err++;
			}

			//変数.入荷予定ボディリスト.予定倉庫CDがnull以外の場合、倉庫マスタ情報取得
			if(errBodyFlg == true){
				// 入荷予定ボディにエラー無の場合
				//  倉庫CDもロケーションCDもある場合
				if(!CU.isNullOrEmpty(planB.getPlanWarehouseCd()) && !CU.isNullOrEmpty(planB.getPlanLocationCd())){

					if(CU.isNotNullAndEquals(result.getMwWarehouseId(), result.getLocZoneWarehouseId())){
						planB.setPlanLocationId(result.getLocationId());
						planB.setPlanWarehouseId(result.getMwWarehouseId());
						errBodyFlg = true; // エラー無
					} else {
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				}
				// 倉庫CDがある、ロケーションCDが無い場合
				else if(!CU.isNullOrEmpty(planB.getPlanWarehouseCd()) && CU.isNullOrEmpty(planB.getPlanLocationCd())){
					if(result.getMwWarehouseId() != null){
						planB.setPlanLocationId(null);
						planB.setPlanWarehouseId(result.getMwWarehouseId());
						errBodyFlg = true; // エラー無
					} else {
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				}

				// ロケーションCDがある、倉庫CDが無い場合
				else if(!CU.isNullOrEmpty(planB.getPlanLocationCd()) && CU.isNullOrEmpty(planB.getPlanWarehouseCd())){
					if(result.getLocationId() != null){
						planB.setPlanLocationId(result.getLocationId());
						planB.setPlanWarehouseId(result.getLocZoneWarehouseId());
						errBodyFlg = true; // エラー無
					} else {
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				}

				// ロケーションCDも倉庫CDも無い場合
				else if(CU.isNullOrEmpty(planB.getPlanLocationCd()) && CU.isNullOrEmpty(planB.getPlanWarehouseCd())){
					planB.setPlanLocationId(null);
					planB.setPlanWarehouseId(null);
					errBodyFlg = true; // エラー無
				}
			}

			if(errHeaderFlg == false && errBodyFlg == true ){
				// ヘッダにエラーあり && ボディにエラー無 の場合、
				planB.setErrorFlg_$1();
				planB.setReceiveStatus_$99();
				planB.setErrorMessageCd(planH.getErrorMessageCd());
			}

			if(errHeaderFlg == true && errBodyFlg == true ){
				// ヘッダもボディもエラー無の場合、
				planB.setErrorFlg_$0();
				planB.setReceiveStatus_$01();
				planB.setErrorMessageCd(null);
			}

			//入荷予定ボディの更新実行
			tReceivePlanBBhv.update(planB);
			if(sameHeaderFlg){
				// 前行とヘッダId同じ場合、
				if(err > 0 && errorDataFlg == false){
					// ボディにエラーあり && 当ヘッダIdで前にエラーが無かった場合、エラー情報設定

					// エンティティ編集
					planH.setErrorFlg_$1();
					planH.setReceiveStatus_$99();
					planH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
					errBodyFlg = false;
					errorDataFlg = true;
					tReceivePlanHBhv.update(planH);
				}
			}else{
				// 前行と違うヘッダIDの場合、
				if(err == 0 && errHeaderFlg == true){
					// ボディもヘッダもエラー無場合、
					// エンティティ編集
					planH.setErrorFlg_$0();
					planH.setReceiveStatus_$01();
					planH.setErrorMessageCd(null);
					errorDataFlg = false;
				}
				if(err != 0 && errHeaderFlg == true){
					// ボディにエラー存在場合、
					// エンティティ編集
					planH.setErrorFlg_$1();
					planH.setReceiveStatus_$99();
					planH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
					errBodyFlg = false;
					errorDataFlg = true;
				}
				//入荷予定ヘッダの更新実行
				tReceivePlanHBhv.update(planH);
			}
			if(errHeaderFlg == false || errBodyFlg == false){
				errorFlg = true;
			}
		}
		return errorFlg;
	}
	// マスタ存在チェックを各マスタに結合しコントロールNoで取得方法に変更 2016.05.27 nayzaw End

	// 入荷予定ヘッダIDで取得してエラーチェック処理追加 2016.4.4 NayZaw Start
	/**
	 * <h2>入荷エラーチェック。</h2>
	 * <pre>
	 * 入荷予定ヘッダIDをキーにデータベースから入荷予定データを取得し、次のチェックを行う。
	 * ・入荷予定ボディチェック
	 * ・入荷予定ヘッダチェック
	 *
	 * 【データ取得テーブル】
	 * ・入荷予定ボディ
	 * ・入荷予定ヘッダ
	 * ・商品マスタ
	 * ・倉庫マスタ
	 * ・ロケーションマスタ
	 * ・ゾーンマスタ
	 * ・取引先マスタ
	 *
	 * </pre>
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private boolean checkByReceiePlanHId(Long receivePlanHId, ErrorStatus errSts){

		boolean errorFlg = false;
		boolean errHeaderFlg = true;
		boolean errBodyFlg = false;
		int err = 0;
		List<TReceivePlanB> tReceivePlanBList = null;

		// 入荷予定データ取得
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.query().setReceivePlanHId_Equal(receivePlanHId);
		tReceivePlanBList = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		//入荷予定ヘッダデータ取得
		TReceivePlanH planH = null;
		if(tReceivePlanBList!=null){
			planH = tReceivePlanBList.get(0).getTReceivePlanH();
		}

		// ============ 入荷予定ヘッダチェック ==============
		// 取引先マスタ情報取得
		if(planH.getPlanSupplierCd() != null){
			MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();

			//荷主ID（Client_ID）
			mCustomerCB.query().setClientId_Equal(planH.getClientId());
			mCustomerCB.query().setCustomerCd_Equal(planH.getPlanSupplierCd());
			mCustomerCB.query().setVendorFlg_Equal_$1();
			// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw Start
			List<MCustomer> lstMCustomer = mCustomerBhv.selectList(mCustomerCB);

			int count = 0;
			if(lstMCustomer != null){
				count = lstMCustomer.size();
			}
			// 取引先マスタ検索結果件数＝0の場合
			if(count == 0){
				// エラーメッセージをエラー管理クラスに登録
				// エンティティ編集
				planH.setErrorFlg_$1();
				planH.setReceiveStatus_$99();
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//planH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				planH.setErrorMessageCd(WmsMessageConst.SUPPLIER_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				errHeaderFlg = false; //エラー存在
			}

			// 取引先マスタ検索結果件数>0の場合
			if (count > 0 ) {
				// エンティティ編集
				long planSupplierId = lstMCustomer.get(0).getCustomerId();
				planH.setPlanSupplierId(planSupplierId);
				errHeaderFlg = true; //エラー無
			}
		}
		// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw End
		if(errHeaderFlg == true){
			//エラー存在しない場合

			//入荷予定ヘッダ.予定預託CDがnull以外の場合、取引先マスタ情報取得(予定預託CDチェック用)
			if(planH.getPlanDepositCd() != null){
				// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw Start
				// 取引先マスタ情報取得
				MCustomerCB customerCB = mCustomerBhv.newMyConditionBean();

				// [1.1.4-CT-021] 別荷主の預託IDが設定されてしまう問題を修正 2016.05.16 kawana Start
				customerCB.query().setClientId_Equal(planH.getClientId());
				// [1.1.4-CT-021] 別荷主の預託IDが設定されてしまう問題を修正 2016.05.16 kawana End
				customerCB.query().setCustomerCd_Equal(planH.getPlanDepositCd());
				customerCB.query().setDepositFlg_Equal_$1();

				List<MCustomer> lstMCustomerDep =mCustomerBhv.selectList(customerCB);

				int mCustomercount = 0;
				if(lstMCustomerDep != null){
					mCustomercount = lstMCustomerDep.size();
				}
				//検索結果件数＝0の場合
				if(mCustomercount == 0){
					// エラーメッセージをエラー管理クラスに登録

					// エンティティ編集
					planH.setErrorFlg_$1();
					planH.setReceiveStatus_$99();
					// [#7348][v3.1][OSS] 預託未登録のエラーメッセージ変更 2020/04/23 KAI MOD START
					//planH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
					// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
					//planH.setErrorMessageCd(WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
					planH.setErrorMessageCd(WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
					// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
					// [#7348][v3.1][OSS] 預託未登録のエラーメッセージ変更 2020/04/23 KAI MOD END
					errHeaderFlg = false;  // エラー存在
				}
				//検索結果件数>0の場合
				if(mCustomercount > 0){
					long customerId = lstMCustomerDep.get(0).getCustomerId();
					planH.setPlanDepositId(customerId);
					errHeaderFlg = true;  // エラー無
				}
				// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw End
			}
		}

		// ===== 入荷予定ボディチェック =====
		for(TReceivePlanB planB : tReceivePlanBList){

			// ===== 商品マスタ情報取得 =====
			MProductCB mProductCB = mProductBhv.newMyConditionBean();
			mProductCB.query().setClientId_Equal(planH.getClientId());
			mProductCB.query().setProductCd_Equal(planB.getProductCd());
			// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw Start
			List<MProduct> lstMProduct = mProductBhv.selectList(mProductCB);

			int mProductCount = 0;
			if(lstMProduct != null ){
				mProductCount = lstMProduct.size();
				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
				// 商品荷姿マスタ
				mProductBhv.loadMProductShapeList(lstMProduct, new ConditionBeanSetupper<MProductShapeCB>(){
					public void setup(MProductShapeCB subCB){
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						subCB.query().setDelFlg_Equal_$0();
					}
				});
				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End
			}
			//検索結果件数＝0の場合
			if (mProductCount == 0) {
				// エラーメッセージをエラー管理クラスに登録
				// エンティティ編集
				planB.setErrorFlg_$1();
				planB.setReceiveStatus_$99();
				planB.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				errBodyFlg = false; // エラー存在
				err++;
			}

			//検索結果件数>0の場合
			if(mProductCount > 0){
				long productId = lstMProduct.get(0).getProductId();
				planB.setProductId(productId);
				errBodyFlg = true; // エラー無

				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
				String decimalExistFlg = lstMProduct.get(0).getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
				if (decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
					//小数有無フラグが無の場合
					if (errBodyFlg == true && !checkExcelCellInput("^\\d+$", WCC.stripTrailingZeros(planB.getPlanNum()))) {
						// 小数0桁以内
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				} else {
					//小数有無フラグが有の場合
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod Start
					if (errBodyFlg == true && !checkExcelCellInput("^[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", WCC.stripTrailingZeros(planB.getPlanNum()))) {
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod End
						// 小数3桁以内
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}
				}
				// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End
			}
			// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw End
			// ===== 入荷予定データ取得 =====

			MWarehouseCB mWarehouseCB = mWarehouseBhv.newMyConditionBean();

			// ===== 倉庫マスタ情報取得 =====

			MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();

			//変数.入荷予定ボディリスト.予定倉庫CDがnull以外の場合、倉庫マスタ情報取得
			if(errBodyFlg == true){
				// 入荷予定ボディにエラー無の場合

				if(planB.getPlanWarehouseCd() != null){
					mWarehouseCB.query().setCenterId_Equal(planH.getCenterId());
					mWarehouseCB.query().setWarehouseCd_Equal(planB.getPlanWarehouseCd());
					// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw Start
					List<MWarehouse> lstMWareHouse = mWarehouseBhv.selectList(mWarehouseCB);

					int count1 = 0;
					if(lstMWareHouse != null){
						count1 = lstMWareHouse.size();
					}
					//検索結果件数＝0の場合
					if(count1 == 0){
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}

					//検索結果件数>0の場合
					if(count1 > 0){
						long planWarehouseId = lstMWareHouse.get(0).getWarehouseId();
						planB.setPlanWarehouseId(planWarehouseId);
						errBodyFlg = true; // エラー無
					}
					// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw End
				}
			}
			if(errBodyFlg == true){
				// 入荷予定ボディにエラーが無い場合
				//変数.入荷予定ボディリスト.予定ロケーションCDがnull以外の場合
				if(planB.getPlanLocationCd() != null){
					//ロケーションマスタ情報取得
					mLocationCB.query().setCenterId_Equal(planH.getCenterId());
					mLocationCB.query().setLocationCd_Equal(planB.getPlanLocationCd());
					if(planB.getPlanWarehouseCd() !=  null){
						mLocationCB.setupSelect_MZone();
						mLocationCB.query().queryMZone().setWarehouseId_Equal(planB.getPlanWarehouseId());
					}
					// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw Start
					List<MLocation> lstMLocation = mLocationBhv.selectList(mLocationCB);
					int count2 = 0;
					if(lstMLocation!=null){
						count2 = lstMLocation.size();
					}
					//検索結果件数＝0の場合
					if(count2 == 0){
						// エラーメッセージをエラー管理クラスに登録
						// エンティティ編集
						planB.setErrorFlg_$1();
						planB.setReceiveStatus_$99();
						planB.setErrorMessageCd(WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
						errBodyFlg = false; // エラー存在
						err++;
					}

					//検索結果件数>0の場合
					if(count2 > 0){
						long locationId = lstMLocation.get(0).getLocationId();
						planB.setPlanLocationId(locationId);
						errBodyFlg = true; // エラー無
					}
					// DB からデータ取得数回してる為1回で取得するように修正 2016.4.7 nayzaw End
				}
			}
			if(errHeaderFlg == false && errBodyFlg == true ){
				// ヘッダにエラーあり && ボディにエラー無 の場合、
				planB.setErrorFlg_$1();
				planB.setReceiveStatus_$99();
				planB.setErrorMessageCd(planH.getErrorMessageCd());
			}

			if(errHeaderFlg == true && errBodyFlg == true ){
				// ヘッダもボディもエラー無の場合、
				planB.setErrorFlg_$0();
				planB.setReceiveStatus_$01();
				planB.setErrorMessageCd(null);
			}
			//入荷予定ボディの更新実行
			tReceivePlanBBhv.update(planB);
		}

		if(err == 0 && errHeaderFlg == true){
			// ボディもヘッダもエラー無場合、
			// エンティティ編集
			planH.setErrorFlg_$0();
			planH.setReceiveStatus_$01();
			planH.setErrorMessageCd(null);

		}
		if(err != 0 && errHeaderFlg == true){
			// ボディにエラー存在場合、
			// エンティティ編集
			planH.setErrorFlg_$1();
			planH.setReceiveStatus_$99();
			planH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
			errBodyFlg = false;

		}
		//入荷予定ヘッダの更新実行
		tReceivePlanHBhv.update(planH);
		if(errHeaderFlg == false || errBodyFlg == false){
			errorFlg = true;
		}
		return errorFlg;
	}
	// 入荷予定ヘッダIDで取得してエラーチェック処理追加 2016.4.4 NayZaw End

	// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 * */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	// [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End

}

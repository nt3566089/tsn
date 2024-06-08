package com.oneslogi.wms.logic.shipping;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingPlanBulkMasterDataPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingPlanBulkMasterData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.ZipLogic;

/**
 * 出荷エラーチェックロジッククラス
 */
public class ShippingInstErrorCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	@Inject
	private MProductBhv mProductBhv;

	@Inject
	private MCustomerBhv mCustomerBhv;

	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;

	@Inject
	private MCarrierBhv mCarrierBhv;

	// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

	// [C-CWMS-0052] 配送コース設定変更 2015.11.19 koyama Start
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	// [C-CWMS-0052] 配送コース設定変更 2015.11.19 koyama End

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start

	// ===== 使用ロジック =====

	// [EC-CT1-191] 郵便番号チェックを共通ロジックで行うように変更 2015.04.09 kawana Start
	@Inject
	private ZipLogic zipLogic;
	// [EC-CT1-191] 郵便番号チェックを共通ロジックで行うように変更 2015.04.09 kawana End
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End

	// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana Start

	// ===== enum =====

	private enum CheckMZip {
		TRUE,
		FALSE
	}

	// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana End

	/**
	 * <h2>出荷エラーのチェックを行う。</h2>
	 * <pre>
	 * コントロールNo.がnullでない場合、
	 * コントロールNoを条件に出荷指示を取得し、各マスタの存在チェックを行う。
	 *
	 * コントロールNoがnullの場合、
	 * 出荷指示ヘッダIDを条件に出荷指示を取得し、各マスタの存在チェックを行う。
	 * </pre>
	 * @param controlNo コントロールNo
	 * @param shippingInstHId 出荷指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean 出荷エラーある/なし
	 */
	public boolean check(Long controlNo,Long shippingInstHId,ErrorStatus errSts){
		if(controlNo!=null){
			return checkByControlNo(controlNo,errSts);
		}
		else{
			return checkByShippingInstHId(shippingInstHId,errSts);
		}
	}
	/**
	 * <h2>出荷エラーチェック。</h2>
	 * <pre>
	 * 更新データに次の値を設定する。
	 * ・エラーフラグ
	 * ・ステータス
	 * ・エラーメッセージID
	 *
	 * 上記 設定後、下記テーブルにデータを更新する。
	 * ・出荷指示ボディ
	 * ・出荷指示ヘッダ
	 *
	 * </pre>
	 * @param controlNo         コントロールNo
	 * @param errSts            エラー時に設定するエラーステータス
	 */
	private boolean checkByControlNo(Long controlNo,ErrorStatus errSts){

		List<TShippingInstB> tShippingInstBList = null;
		boolean hFlg = false;
		boolean bFlg = false;
		boolean errorFlg = false;
		int count = 0;
		Long hId = 0l;
		boolean sameHeaderFlg = false;
		boolean errorDataFlg = false;


		// 結合してマスタデータ取得方法に更新 2016.05.16 nayzaw Start

		// ===== 出荷指示ボディ、出荷指示ヘッダ情報取得 =====

		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		tShippingInstBCB.setupSelect_TShippingInstH();
		tShippingInstBCB.query().queryTShippingInstH().setControlNo_Equal(controlNo);
		tShippingInstBCB.query().queryTShippingInstH().addOrderBy_ShippingInstHId_Asc();
		tShippingInstBCB.query().addOrderBy_ShippingInstBId_Asc();
		tShippingInstBList = tShippingInstBBhv.selectList(tShippingInstBCB);

		// 外出しSQLでマスタデータ取得
		String path = TShippingInstBBhv.PATH_selectSqlShippingPlanBulkMasterData;
		// 検索条件の設定
		SqlShippingPlanBulkMasterDataPmb pmb = new SqlShippingPlanBulkMasterDataPmb();
		pmb.setControlNo(controlNo);

		Class<SqlShippingPlanBulkMasterData> entityType = SqlShippingPlanBulkMasterData.class;
		// [#976] 1万件を超えるデータの一括取込でエラー発生 2017.03.14 kawana Start
		List<SqlShippingPlanBulkMasterData> resultList = tShippingInstBBhv.outsideSql().selectList(path, pmb, entityType);
		// [#976] 1万件を超えるデータの一括取込でエラー発生 2017.03.14 kawana End

		int row = -1;
		for(TShippingInstB tShippingInstB : tShippingInstBList){

			row++;
			//出荷指示ヘッダ取得
			TShippingInstH tShippingInstH = tShippingInstB.getTShippingInstH();

			SqlShippingPlanBulkMasterData result = resultList.get(row);

			// 外出SQLと実データのIDチェックを追加 2017.07.12 kawana Start

			long outSqlHeaderId = result.getShippingInstHId();
			long outSqlBodyId = result.getShippingInstBId();

			if (outSqlHeaderId != tShippingInstH.getShippingInstHId().longValue()) {
				// 入荷ヘッダIDチェック(念の為)

				getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return false;
			}

			if (outSqlBodyId != tShippingInstB.getShippingInstBId().longValue()) {
				// 入荷ボディIDチェック(念の為)

				getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return false;
			}

			// 外出SQLと実データのIDチェックを追加 2017.07.12 kawana End

			//出荷指示ヘッダID null チェック
			if(!(hId == null && tShippingInstH.getShippingInstHId() == null)){
				// 出荷指示ヘッダIDが前回チェックしたヘッダIDと同じかチェック

				if(!CU.isNotNullAndEquals(hId, tShippingInstH.getShippingInstHId())){
					// 前回チェックした出荷指示ヘッダIDと違う場合、出荷指示ヘッダエラーチェック
					// ===== 出荷指示ヘッダチェック =====

					// [EC-CT1-005] EC受注用に届先チェックを追加 2015.02.09 kawana Start
					// ===== 取引先マスタ(納品先)情報取得 =====

					count = 0;
					errorDataFlg = false;
					sameHeaderFlg=false;
					hFlg = false; // 初期化 ヘッダデータエラー無
					bFlg = false; // 初期化 ボディデータエラー無
					hId=tShippingInstH.getShippingInstHId();

					String supplyCustomerCd = tShippingInstH.getSupplyCustomerCd();
					String delivCustomerCd = tShippingInstH.getDelivCustomerCd();
					// 取引先マスタのチェックと設定
					// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama Start

					if (CU.isNullOrEmpty(supplyCustomerCd) && !CU.isNullOrEmpty(delivCustomerCd)) {
						// 納品先CDがNULLの場合、届先CDをコピー
						supplyCustomerCd = delivCustomerCd;
					}
					// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama End
					if (CU.isNullOrEmpty(supplyCustomerCd)) {

						// 納品先CDの設定なし
						// エラーを設定
						tShippingInstH.setErrorFlg_$1();
						tShippingInstH.setShippingStatus_$99();
						// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
						//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
						tShippingInstH.setErrorMessageCd(WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
						// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END

						hFlg = true;
					}else{
						if(result.getSupplyCustomerId() == null || !result.getSupplyDeliveryFlg().equals("1")){
							// エラーを設定
							tShippingInstH.setErrorFlg_$1();
							tShippingInstH.setShippingStatus_$99();
							// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
							//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
							tShippingInstH.setErrorMessageCd(WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
							// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
							hFlg = true;
						}else{
							// 納品先IDを設定
							tShippingInstH.setSupplyCustomerId(result.getSupplyCustomerId());

							// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama Start
							// 納品先CDを設定
							tShippingInstH.setSupplyCustomerCd(supplyCustomerCd);
							// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama End

							// 納品先名称を設定(未設定の場合のみ)
							if (CU.isNullOrEmpty(tShippingInstH.getSupplyCustomerNm())) {
								tShippingInstH.setSupplyCustomerNm(result.getSupplyCustomerNm());
							}

							// 移動先(納品先)センタを取得
							if(result.getMcenterCenterId() != null){
								// センタ間移動

								// ===== 移動元センタと移動先センタが異なっているかを確認 =====
								if (CU.isNotNullAndEquals(result.getMcenterCenterId(), tShippingInstH.getCenterId())) {
									// 移動元と移動先が同じためエラーを設定

									tShippingInstH.setErrorFlg_$1();
									tShippingInstH.setShippingStatus_$99();
									tShippingInstH.setErrorMessageCd(WmsMessageConst.SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
									hFlg = true;
								}
								if(result.getClientCenterId() == null || result.getMcustomerCcCustomerId() == null){
									// 移動元センタの取引先登録なしのためエラーを設定

									tShippingInstH.setErrorFlg_$1();
									tShippingInstH.setShippingStatus_$99();
									tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
									hFlg = true;
								}
							}
						}
					}
					// ===== 取引先マスタ(届先)情報取得 =====

					// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana Start

					boolean isErrCustomer = false;

					// [C-CWMS-0052] 届先入力追加に伴い、届先CD設定を変更 2015.12.01 koyama Start
					if (CU.isNullOrEmpty(delivCustomerCd) && !CU.isNullOrEmpty(supplyCustomerCd)) {
						// 届先CDがNULLの場合、納品先CDをコピー
						delivCustomerCd = supplyCustomerCd;

						// ※※※ エラー管理クラスに登録したくないためエラーステータスはnul
						isErrCustomer = isErrDelivCustomerWithSetHeader(delivCustomerCd, tShippingInstH, null);
						// [C-CWMS-0052] 届先入力追加に伴い、届先CD設定を変更 2015.12.01 koyama End
					} else {

						isErrCustomer = isErrDelivCustomerWithSetHeader(result, tShippingInstH);
					}

					if (isErrCustomer) {
						hFlg = true;
					}

					// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana End

					if (hFlg == false) {


						// [#7012][OSS] 代入判定用変数の追加
						boolean isSetDeliveryCourseId = false;

						// ===== 配送コースマスタ情報取得 =====
						if(CU.isNullOrEmpty(tShippingInstH.getDeliveryCourseCd()) && tShippingInstH.getDelivCustomerId() != null){

							// [#7012][OSS] センタ取引先マスタの配送コースIDを代入する処理を追加 2020.01.24 tsuboi Start
							if(result.getDelivCourseIdByCustomer() != null) {
								tShippingInstH.setDeliveryCourseId(result.getDelivCourseIdByCustomer());
								isSetDeliveryCourseId = true;
							}
							// [#7012][OSS] センタ取引先マスタの配送コースIDを代入する処理を追加 2020.01.24 tsuboi End

							if(result.getDelivCourseCdByCustomer() != null){
								tShippingInstH.setDeliveryCourseCd(result.getDelivCourseCdByCustomer());
							}
						}

						if (!CU.isNullOrEmpty(tShippingInstH.getDeliveryCourseCd())) {
							// [#7012][OSS] 配送コースIDの判定を追加
							if(!isSetDeliveryCourseId) {
//								//変数.エラーフラグはTrueの場合、配送コースマスタ情報取得
//								// [ON推-品向-424]1回目のエラーチェックボタン押下ではエラーが解消されなかった。2014.12.09 KI Start
//								//検索結果件数＝0の場合
								if(result.getDeliveryCourseId() == null){
									// エンティティ編集
									tShippingInstH.setErrorFlg_$1();
									tShippingInstH.setShippingStatus_$99();
									tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
									hFlg = true;
								} else {
									// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
									// 配送コースIDをトランザクションに設定
									tShippingInstH.setDeliveryCourseId(result.getDeliveryCourseId());
									tShippingInstH.setDeliveryCourseNm(result.getDeliveryCourseNm());
									// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

//									// 運送業者マスタ検索結果件数＝0の場合
//									if (mCarriercount == 0) {
									if(result.getMcarrierCarrierCd() == null || result.getMcarrierDelFlg().equals("1")){
										// エンティティ編集
										tShippingInstH.setErrorFlg_$1();
										tShippingInstH.setShippingStatus_$99();
										tShippingInstH.setErrorMessageCd(WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
										hFlg = true;
									}else{
										tShippingInstB.getTShippingInstH().setCarrierCd(result.getMcarrierCarrierCd());
									}
								}
							}
						} else {
							// エンティティ編集
							tShippingInstH.setErrorFlg_$1();
							tShippingInstH.setShippingStatus_$99();
							// [#7012][OSS] エラーメッセージを修正 2020.01.24 tsuboi Start
							tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_CD_NOT_INPUT_ERROR);
							// [#7012][OSS] エラーメッセージを修正 2020.01.24 tsuboi End
							hFlg = true;
						}
					}
					// [ON推-品向-424]1回目のエラーチェックボタン押下ではエラーが解消されなかった。2014.12.09 KI End
				}

				else{
					// 前のデータとHId同じ場合
					sameHeaderFlg=true;
				}
			}

			// ============出荷指示ボディチェック====================

			//[新ｿﾘ-067] 預託のチェックを入れます。 2014.12.06 KI Start
//			// 取引先マスタ検索結果件数＝0の場合
			if(result.getDepositCustomerId() == null || !result.getDepositDepositFlg().equals("1")){
				// エンティティ編集
				tShippingInstH.setErrorFlg_$1();
				tShippingInstH.setShippingStatus_$99();
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//tShippingInstH.setErrorMessageCd(WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				tShippingInstH.setErrorMessageCd(WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				hFlg = true;
			}else{

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			// 預託マスタがあった場合、IDを設定する。
				tShippingInstB.setDepositId(result.getDepositCustomerId());
			}
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

			//[新ｿﾘ-067] 預託のチェックを入れます。 2014.12.06 KI End

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			// 在庫区分マスタチェック
			// ===== 在庫区分マスタ情報取得 =====

			// 在庫区分マスタに登録が無い場合
			if (result.getStockTypeId() == null) {
				// エンティティ編集
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(WmsMessageConst.STOCK_TYPE_NOT_FOUND_ERROR);
				count++;
				bFlg = true;
			} else {

				tShippingInstB.setStockTypeId(result.getStockTypeId());

				// エンティティ編集
				if (bFlg == false) {
					tShippingInstB.setErrorFlg_$0();
					tShippingInstB.setErrorMessageCd(null);
				}
			}
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

			// ===== 商品マスタ情報取得 =====

			// 商品マスタに商品の登録がない場合
			if (result.getMproductProductId() == null) {
				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana End
				// エンティティ編集
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				count++;
				bFlg = true;
				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana Start
			} else {

				tShippingInstB.setProductId(result.getMproductProductId());
				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana End

				// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
				if (result.getMsDecimalExistFlg().equals(CDef.DecimalExistFlg.$0.code())) {
					//小数有無フラグが無の場合
					if (!checkExcelCellInput("^\\d+$", WCC.stripTrailingZeros(tShippingInstB.getInstNum()))) {
						// 小数0桁以内
						// エンティティ編集
						tShippingInstB.setErrorFlg_$1();
						tShippingInstB.setErrorMessageCd(WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_ERROR);
						count++;
						bFlg = true;
					}
				} else {
					//小数有無フラグが有の場合
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod Start
					if (!checkExcelCellInput("^[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", WCC.stripTrailingZeros(tShippingInstB.getInstNum()))) {
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod End
						// 小数3桁以内
						// エンティティ編集
						tShippingInstB.setErrorFlg_$1();
						tShippingInstB.setErrorMessageCd(WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR);
						count++;
						bFlg = true;
					}
				}
				// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add End

				// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
				// エンティティ編集
				if (bFlg == false) {
					tShippingInstB.setErrorFlg_$0();
					tShippingInstB.setErrorMessageCd(null);
					//					bFlg = true;
				}
				// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]
			}
			// 倉庫、ロケーション存在チェック追加 2016.5.19 nayzaw Start

			// 倉庫存在チェック
			if(!CU.isNullOrEmpty(tShippingInstB.getWarehouseCd())){
				if(result.getMwWarehouseId() == null){
					// エンティティ編集
					tShippingInstB.setErrorFlg_$1();
					tShippingInstB.setErrorMessageCd(WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
					count++;
					bFlg = true;
				}
				else{
					tShippingInstB.setWarehouseId(result.getMwWarehouseId());
				}
			}

			// ロケーション存在チェック
			if(!CU.isNullOrEmpty(tShippingInstB.getLocationCd())){
				if(result.getMlLocationId() == null){
					// エンティティ編集
					tShippingInstB.setErrorFlg_$1();
					tShippingInstB.setErrorMessageCd((WmsMessageConst.LOCATION_NOT_FOUND_ERROR));
					count++;
					bFlg = true;
				}
				else{
					tShippingInstB.setLocationId(result.getMlLocationId());
					if(result.getMzMwWarehouseId() != null){
						tShippingInstB.setWarehouseId(result.getMzMwWarehouseId());
						tShippingInstB.setWarehouseCd(result.getMzMwWarehouseCd() );
					}
				}
			}else{
				tShippingInstB.setLocationId(null);
				tShippingInstB.setLocationCd(null);
			}

			// 倉庫、ロケーション存在チェック追加 2016.5.19 nayzaw End

			// 結合してマスタデータ取得方法に更新 2016.05.16 nayzaw End

			if (hFlg == true && bFlg == false) {
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(tShippingInstH.getErrorMessageCd());
			}

			if (hFlg == false && bFlg == false) {
				tShippingInstB.setErrorFlg_$0();
				tShippingInstB.setErrorMessageCd(null);
			}

			//出荷指示ボディの更新実行
			tShippingInstBBhv.update(tShippingInstB);

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			bFlg = false;
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

			if(sameHeaderFlg){
				// 前行のデータとヘッダID同じ場合、
				if(count > 0 && errorDataFlg==false){

					//前行にエラーが無い、当行のボディにエラーが存在する場合、ヘッダデータを更新する
					// エンティティ編集
					tShippingInstH.setErrorFlg_$1();
					tShippingInstH.setShippingStatus_$99();
					tShippingInstH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
					bFlg = true;
					errorDataFlg = true;
					// 出荷指示ヘッダ更新
					tShippingInstHBhv.update(tShippingInstH);
				}
			}
			else{
				if (count == 0 && hFlg == false) {
					// エンティティ編集
					tShippingInstH.setErrorFlg_$0();
					tShippingInstH.setShippingStatus_$10();
					tShippingInstH.setErrorMessageCd(null);
					errorDataFlg = false;
				}
				if (count != 0 && hFlg == false) {
					// エンティティ編集
					tShippingInstH.setErrorFlg_$1();
					tShippingInstH.setShippingStatus_$99();
					tShippingInstH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
					bFlg = true;
					errorDataFlg = true;
				}
				// 出荷指示ヘッダ更新
				tShippingInstHBhv.update(tShippingInstH);
			}
			if (hFlg == true || bFlg == true) {
				errorFlg = true;
				// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更（getWarnManager().addを削除） 2014.12.09 kawana
			}
		}
		return errorFlg;
	}

	/**
	 * <h2>出荷エラーチェック。</h2>
	 * <pre>
	 * 更新データに次の値を設定する。
	 * ・エラーフラグ
	 * ・ステータス
	 * ・エラーメッセージID
	 *
	 * 上記 設定後、下記テーブルにデータを更新する。
	 * ・出荷指示ボディ
	 * ・出荷指示ヘッダ
	 *
	 * </pre>
	 * @param shippingInstHId   出荷指示ヘッダID
	 * @param errSts            エラー時に設定するエラーステータス
	 */
	private boolean checkByShippingInstHId(Long shippingInstHId,ErrorStatus errSts){
		boolean hFlg = false;
		boolean bFlg = false;
		int count = 0;
		boolean errorFlg = false;

		List<TShippingInstB> tShippingInstBList = null;
		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		tShippingInstBCB.setupSelect_TShippingInstH();
		tShippingInstBCB.query().queryTShippingInstH().setShippingInstHId_Equal(shippingInstHId);
		tShippingInstBList = tShippingInstBBhv.selectList(tShippingInstBCB);
		TShippingInstH tShippingInstH=null;
		if(tShippingInstBList != null){
			tShippingInstH = tShippingInstBList.get(0).getTShippingInstH();
		}

		// ===== 出荷指示ヘッダチェック =====

		// [EC-CT1-005] EC受注用に届先チェックを追加 2015.02.09 kawana Start
		// ===== 取引先マスタ(納品先)情報取得 =====

		MCustomer mCustomer = null;
		String supplyCustomerCd = tShippingInstH.getSupplyCustomerCd();
		String delivCustomerCd = tShippingInstH.getDelivCustomerCd();

		// 取引先マスタのチェックと設定
		// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama Start
		if (CU.isNullOrEmpty(supplyCustomerCd) && !CU.isNullOrEmpty(delivCustomerCd)) {
			// 納品先CDがNULLの場合、届先CDをコピー
			supplyCustomerCd = delivCustomerCd;
		}
		// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama End
		if (CU.isNullOrEmpty(supplyCustomerCd)) {
			// 納品先CDの設定なし

			// エラーを設定
			tShippingInstH.setErrorFlg_$1();
			tShippingInstH.setShippingStatus_$99();
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			tShippingInstH.setErrorMessageCd(WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//			header.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
			hFlg = true;
		}else {

			MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
			mCustomerCB.checkInvalidQuery();

			// [ON推-品向-413] 荷主ID条件抜け修正 2014.12.06 koseki Start
			mCustomerCB.query().setClientId_Equal(tShippingInstH.getClientId());
			// [ON推-品向-413] 荷主ID条件抜け修正 2014.12.06 koseki End
			mCustomerCB.query().setCustomerCd_Equal(supplyCustomerCd);
			mCustomerCB.query().setDeliveryFlg_Equal_$1();

			mCustomer = mCustomerBhv.selectEntity(mCustomerCB);

			if (mCustomer == null) {
				// 取引先マスタ登録なし

				// エラーを設定
				tShippingInstH.setErrorFlg_$1();
				tShippingInstH.setShippingStatus_$99();
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				tShippingInstH.setErrorMessageCd(WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//				header.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				getErrorManager().add(errSts, WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
				hFlg = true;
			} else {

				// 納品先IDを設定
				tShippingInstH.setSupplyCustomerId(mCustomer.getCustomerId());

				// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama Start
				// 納品先CDを設定
				tShippingInstH.setSupplyCustomerCd(supplyCustomerCd);
				// [C-CWMS-0052] 届先入力追加に伴い、納品先CD設定を変更 2015.12.01 koyama End

				// 納品先名称を設定(未設定の場合のみ)
				if (CU.isNullOrEmpty(tShippingInstH.getSupplyCustomerNm())) {
					tShippingInstH.setSupplyCustomerNm(mCustomer.getCustomerNm());
				}

				// [C-CWMS-0039] センタ間移動機能を追加 2015.10.23 kawana Start
				// センタ間移動の判定
				MCustomer customerCondition = new MCustomer();
				customerCondition.setClientId(tShippingInstH.getClientId());
				customerCondition.setCustomerId(tShippingInstH.getSupplyCustomerId());

				// 移動先(納品先)センタを取得
				MCenter supplyCenter = customerLogic.getCenter(customerCondition);
				if (supplyCenter != null) {
					// センタ間移動

					// ===== 移動元センタと移動先センタが異なっているかを確認 =====
					if (CU.isNotNullAndEquals(supplyCenter.getCenterId(), tShippingInstH.getCenterId())) {
						// 移動元と移動先が同じためエラーを設定

						tShippingInstH.setErrorFlg_$1();
						tShippingInstH.setShippingStatus_$99();
						tShippingInstH.setErrorMessageCd(WmsMessageConst.SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
//						header.setErrorMessageCd(WmsMessageConst.SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
						getErrorManager().add(errSts, WmsMessageConst.SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
						hFlg = true;
					}

					// ===== 移動元センタの取引先登録チェック =====
					MClientCenter clientCenterCondition = new MClientCenter();
					clientCenterCondition.setClientId(tShippingInstH.getClientId());
					clientCenterCondition.setCenterId(tShippingInstH.getCenterId());
					MClientCenter clientCenter = clientCenterLogic.getUkEntityWithCustomer(clientCenterCondition);

					if (clientCenter == null || clientCenter.getMCustomer() == null) {
						// 移動元センタの取引先登録なしのためエラーを設定

						tShippingInstH.setErrorFlg_$1();
						tShippingInstH.setShippingStatus_$99();
						tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
//						header.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
						getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
						hFlg = true;
					}
				}
				// [C-CWMS-0039] センタ間移動機能を追加 2015.10.23 kawana End
			}
		}
		// ===== 取引先マスタ(届先)情報取得 =====

		// [C-CWMS-0052] 届先入力追加に伴い、届先CD設定を変更 2015.12.01 koyama Start
		if (CU.isNullOrEmpty(delivCustomerCd) && !CU.isNullOrEmpty(supplyCustomerCd)) {
			// 届先CDがNULLの場合、納品先CDをコピー
			delivCustomerCd = supplyCustomerCd;
		}
		// [C-CWMS-0052] 届先入力追加に伴い、届先CD設定を変更 2015.12.01 koyama End

		// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana Start

		// 届先エラーチェックと出荷指示ヘッダの届先情報設定
		boolean isErrDelivCustomer = isErrDelivCustomerWithSetHeader(delivCustomerCd, tShippingInstH, errSts);
		if (isErrDelivCustomer) {
			hFlg = true;
		}

		// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana End

		if (hFlg == false) {

			// ===== 配送コースマスタ情報取得 =====

			MDeliveryCourseCB mDeliveryCourseCB = mDeliveryCourseBhv.newMyConditionBean();
			// [C-CWMS-0052] 配送コース設定変更 2015.11.19 koyama Start
			if (CU.isNullOrEmpty(tShippingInstH.getDeliveryCourseCd()) && tShippingInstH.getDelivCustomerId() != null) {
				mDeliveryCourseCB.query().setCenterId_Equal(tShippingInstH.getCenterId());
				MCustomer mDeliveryCustomer = new MCustomer();
				mDeliveryCustomer.setCustomerId(tShippingInstH.getDelivCustomerId());
				MDeliveryCourse deliveryCourse = deliveryCourseLogic.getDeliveryCourseByCustomerId(mDeliveryCustomer, tShippingInstH.getCenterId());
				if (deliveryCourse != null) {
					// 取引先マスタに配送コース登録あり
					tShippingInstH.setDeliveryCourseCd(deliveryCourse.getDeliveryCourseCd());
				}
			}
			// [C-CWMS-0052] 配送コース設定変更 2015.11.19 koyama End
			if (!CU.isNullOrEmpty(tShippingInstH.getDeliveryCourseCd())) {
				//変数.エラーフラグはTrueの場合、配送コースマスタ情報取得
				mDeliveryCourseCB.query().setCenterId_Equal(tShippingInstH.getCenterId());
				mDeliveryCourseCB.query().setDeliveryCourseCd_Equal(tShippingInstH.getDeliveryCourseCd());
				// [ON推-品向-424]1回目のエラーチェックボタン押下ではエラーが解消されなかった。2014.12.09 KI Start
				MDeliveryCourse mdc = mDeliveryCourseBhv.selectEntity(mDeliveryCourseCB);
				//検索結果件数＝0の場合
				if (mdc == null) {
					// エンティティ編集
					tShippingInstH.setErrorFlg_$1();
					tShippingInstH.setShippingStatus_$99();
					tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
					// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
					// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//					header.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
					// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
					getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
					// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
					hFlg = true;
				} else {

					// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
					// 配送コースIDをトランザクションに設定
					tShippingInstH.setDeliveryCourseId(mdc.getDeliveryCourseId());
					// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

					// 運送業者マスタ情報取得
					MCarrierCB mCarrierCB = mCarrierBhv.newMyConditionBean();
					mCarrierCB.query().setCenterId_Equal(tShippingInstH.getCenterId());
					mCarrierCB.query().setCarrierId_Equal(mdc.getCarrierId());
					mCarrierCB.query().setDelFlg_Equal_$0();

					int mCarriercount = mCarrierBhv.selectCount(mCarrierCB);

					// 運送業者マスタ検索結果件数＝0の場合
					if (mCarriercount == 0) {
						// エンティティ編集
						tShippingInstH.setErrorFlg_$1();
						tShippingInstH.setShippingStatus_$99();
						tShippingInstH.setErrorMessageCd(WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
						// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//						header.setErrorMessageCd(WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
						// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
						getErrorManager().add(errSts, WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
						// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
						hFlg = true;
					}
				}
			} else {
				// エンティティ編集
				tShippingInstH.setErrorFlg_$1();
				tShippingInstH.setShippingStatus_$99();
				tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//				header.setErrorMessageCd(WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
				hFlg = true;
				//				errorFlg = true;
				//				getWarnManager().add(warnRetSts(errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			}
		}
		// [ON推-品向-424]1回目のエラーチェックボタン押下ではエラーが解消されなかった。2014.12.09 KI End

		// ===== 出荷指示ボディチェック =====

		for (TShippingInstB tShippingInstB : tShippingInstBList) {

			//[新ｿﾘ-067] 預託のチェックを入れます。 2014.12.06 KI Start
			MCustomerCB mCustomerCB_DE = mCustomerBhv.newMyConditionBean();
			mCustomerCB_DE.query().setClientId_Equal(tShippingInstH.getClientId());
			mCustomerCB_DE.query().setCustomerCd_Equal(tShippingInstB.getDepositCd());
			mCustomerCB_DE.query().setDepositFlg_Equal_$1();
			int mCustomercount_DE = mCustomerBhv.selectCount(mCustomerCB_DE);

			// 取引先マスタ検索結果件数＝0の場合
			if (mCustomercount_DE == 0) {
				// エンティティ編集
				tShippingInstH.setErrorFlg_$1();
				tShippingInstH.setShippingStatus_$99();
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//tShippingInstH.setErrorMessageCd(WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				tShippingInstH.setErrorMessageCd(WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//				header.setErrorMessageCd(WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
				hFlg = true;
				//				errorFlg = true;
				//				getWarnManager().add(warnRetSts(errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			}

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			// 預託マスタがあった場合、IDを設定する。
			if (mCustomercount_DE > 0) {
				MCustomer mCustomerDeposit = mCustomerBhv.selectEntity(mCustomerCB_DE);
				tShippingInstB.setDepositId(mCustomerDeposit.getCustomerId());
			}
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

			//[新ｿﾘ-067] 預託のチェックを入れます。 2014.12.06 KI End

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			// 在庫区分マスタチェック
			// ===== 在庫区分マスタ情報取得 =====
			MStockTypeCB mStockTypeCB = mStockTypeBhv.newConditionBean();
			mStockTypeCB.query().setStockTypeCd_Equal(tShippingInstB.getStockTypeCd());
			MStockType mStockType = mStockTypeBhv.selectEntity(mStockTypeCB);

			// 在庫区分マスタに登録が無い場合
			if (mStockType == null) {
				// エンティティ編集
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(WmsMessageConst.STOCK_TYPE_NOT_FOUND_ERROR);
				count++;
				bFlg = true;
			} else {

				tShippingInstB.setStockTypeId(mStockType.getStockTypeId());

				// エンティティ編集
				if (bFlg == false) {
					tShippingInstB.setErrorFlg_$0();
					tShippingInstB.setErrorMessageCd(null);
				}
			}
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]

			// ===== 商品マスタ情報取得 =====
			MProductCB mProductCB = mProductBhv.newMyConditionBean();

			// [ON推-品向-413] 荷主ID条件抜け修正 2014.12.06 koseki Start
			mProductCB.query().setClientId_Equal(tShippingInstH.getClientId());
			// [ON推-品向-413] 荷主ID条件抜け修正 2014.12.06 koseki End
			mProductCB.query().setProductCd_Equal(tShippingInstB.getProductCd());

			// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana Start
			MProduct mProduct = mProductBhv.selectEntity(mProductCB);

			// 商品マスタに商品の登録がない場合
			if (mProduct == null) {
				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana End
				// エンティティ編集
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				count++;
				bFlg = true;
				//				errorFlg = true;
				//				getWarnManager().add(warnRetSts(errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);

				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana Start
			} else {

				tShippingInstB.setProductId(mProduct.getProductId());
				// [ON推-品向-435] エラーチェックで正常になっても商品情報が表示されない問題を解消 2014.12.12 kawana End

				// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
				// 商品荷姿マスタ
				mProductBhv.loadMProductShapeList(mProduct, new ConditionBeanSetupper<MProductShapeCB>(){
					public void setup(MProductShapeCB subCB){
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						subCB.query().setDelFlg_Equal_$0();
					}
				});

				String decimalExistFlg = mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
				if (decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
					//小数有無フラグが無の場合
					if (!checkExcelCellInput("^\\d+$", WCC.stripTrailingZeros(tShippingInstB.getInstNum()))) {
						// 小数0桁以内
						// エンティティ編集
						tShippingInstB.setErrorFlg_$1();
						tShippingInstB.setErrorMessageCd(WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_ERROR);
						count++;
						bFlg = true;
					}
				} else {
					//小数有無フラグが有の場合
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod Start
					if (!checkExcelCellInput("^[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", WCC.stripTrailingZeros(tShippingInstB.getInstNum()))) {
					// [#3971][Ver3.0] 小数桁数チェック処理不正 2018.03.08 honma Mod End
						// 小数3桁以内
						// エンティティ編集
						tShippingInstB.setErrorFlg_$1();
						tShippingInstB.setErrorMessageCd(WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR);
						count++;
						bFlg = true;
					}
				}
				// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add End

				// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
				// エンティティ編集
				if (bFlg == false) {
					tShippingInstB.setErrorFlg_$0();
					tShippingInstB.setErrorMessageCd(null);
					//					bFlg = true;
				}
				// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]
			}

			if (hFlg == true && bFlg == false) {
				tShippingInstB.setErrorFlg_$1();
				tShippingInstB.setErrorMessageCd(tShippingInstH.getErrorMessageCd());
			}

			if (hFlg == false && bFlg == false) {
				tShippingInstB.setErrorFlg_$0();
				tShippingInstB.setErrorMessageCd(null);
			}

			//出荷指示ボディの更新実行
			tShippingInstBBhv.update(tShippingInstB);

			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [S]
			bFlg = false;
			// [C-EC-0008] EC受注データ取込時の為、チェック内容追加・変更 yokosuka [E]
		}

		if (count == 0 && hFlg == false) {
			// エンティティ編集
			tShippingInstH.setErrorFlg_$0();
			tShippingInstH.setShippingStatus_$10();
			tShippingInstH.setErrorMessageCd(null);
		}
		if (count != 0 && hFlg == false) {
			// エンティティ編集
			tShippingInstH.setErrorFlg_$1();
			tShippingInstH.setShippingStatus_$99();
			tShippingInstH.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
//			header.setErrorMessageCd(WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
			getErrorManager().add(errSts, WmsMessageConst.DETAIL_LINE_FOUND_ERROR);
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
			bFlg = true;
			//			errorFlg = true;
			//			getWarnManager().add(warnRetSts(errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		}

		if (hFlg == true || bFlg == true) {
			errorFlg = true;
			// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更（getWarnManager().addを削除） 2014.12.09 kawana
		}

		// 出荷指示ヘッダ更新
		tShippingInstHBhv.update(tShippingInstH);

		return errorFlg;
	}

	// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana Start

	/**
	 * <h2>届先のチェックと出荷指示ヘッダの届先情報設定.</h2>
	 *
	 * @param sqlData 外出SQLで取得したデータ
	 * @param tShippingInstH 出荷指示ヘッダ(届先情報の設定先)
	 *
	 * @return true : 届先にエラーあり  false : 届先にエラーなし
	 */
	private boolean isErrDelivCustomerWithSetHeader(SqlShippingPlanBulkMasterData sqlData, TShippingInstH tShippingInstH) {

		MCustomer delivCustomer = null;

		if (sqlData.getDeliveryCustomerId() != null && sqlData.getDeliveryDeliveryFlg().equals("1")) {

			delivCustomer = new MCustomer();
			delivCustomer.setCustomerId(sqlData.getDeliveryCustomerId());
			delivCustomer.setCustomerCd(sqlData.getDeliveryCustomerCd());
			delivCustomer.setCustomerNm(sqlData.getDeliveryCustomerNm());
			delivCustomer.setTelNo(sqlData.getDeliveryTelNo());
			delivCustomer.setZipCd(sqlData.getDeliveryZipCd());
			delivCustomer.setAddress1(sqlData.getDeliveryAddress1());
			delivCustomer.setAddress2(sqlData.getDeliveryAddress2());
			delivCustomer.setAddress3(sqlData.getDeliveryAddress3());
			delivCustomer.setOnetimeFlg(sqlData.getDeliveryOnetimeFlg());
		}

		// 届先エラーチェックと出荷指示ヘッダの届先情報設定
		// ※※※ エラー管理クラスに登録したくないためエラーステータスはnul
		boolean isErr = isErrDelivCustomerWithSetHeader(delivCustomer, tShippingInstH, CheckMZip.FALSE, null);

		if (isErr) {
			return true;
		}

		if (!delivCustomer.isOnetimeFlg$1()) {

			// ===== 郵便番号チェック =====
			int zipCdExistsCheckFlg = getPropertyIntValue(WmsPropertyConst.ZIP_CD_EXISTS_CHECK_FLG);
			if (zipCdExistsCheckFlg == 1) {
				if (sqlData.getMzipZipId() == null) {
					// エンティティ編集
					tShippingInstH.setErrorFlg_$1();
					tShippingInstH.setShippingStatus_$99();
					tShippingInstH.setErrorMessageCd(WmsMessageConst.POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR);
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * <h2>届先のチェックと出荷指示ヘッダの届先情報設定.</h2>
	 *
	 * @param delivCustomerCd 届先CD
	 * @param tShippingInstH 出荷指示ヘッダ(届先情報の設定先)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true : 届先にエラーあり  false : 届先にエラーなし
	 */
	private boolean isErrDelivCustomerWithSetHeader(String delivCustomerCd, TShippingInstH tShippingInstH, ErrorStatus errSts) {

		if (CU.isNullOrEmpty(delivCustomerCd)) {
			// 届先CDの設定なし

			// エラーを設定
			tShippingInstH.setErrorFlg_$1();
			tShippingInstH.setShippingStatus_$99();
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana Start
			//			header.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			// [EC-CT1-192] 出荷実績入力にエラーチェックを追加 2015.04.09 kawana End
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
			return true;
		}

		// 取引先マスタ(届先)を取得
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(tShippingInstH.getClientId());
		cb.query().setCustomerCd_Equal(delivCustomerCd);
		cb.query().setDeliveryFlg_Equal_$1();

		MCustomer delivCustomer = mCustomerBhv.selectEntity(cb);

		return isErrDelivCustomerWithSetHeader(delivCustomer, tShippingInstH, CheckMZip.TRUE, errSts);
	}

	/**
	 * <h2>届先のチェックと出荷指示ヘッダの届先情報設定.</h2>
	 *
	 * @param delivCustomer 届先の取引先マスタ
	 * @param tShippingInstH 出荷指示ヘッダ(届先情報の設定先)
	 * @param checkMZip 郵便番号マスタ存在チェックをするか
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return true : 届先にエラーあり  false : 届先にエラーなし
	 */
	private boolean isErrDelivCustomerWithSetHeader(MCustomer delivCustomer, TShippingInstH tShippingInstH, CheckMZip checkMZip, ErrorStatus errSts) {

		if (delivCustomer == null) {
			// 取引先マスタ登録なし

			// エラーを設定
			tShippingInstH.setErrorFlg_$1();
			tShippingInstH.setShippingStatus_$99();
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//tShippingInstH.setErrorMessageCd(WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			//// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
			//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			//// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
			tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			return true;
		}

		// 届先IDを設定
		tShippingInstH.setDelivCustomerId(delivCustomer.getCustomerId());
		// [#1140] ワンタイムの場合、届先CDがセットされない問題を修正 2017.03.06 kawana Start
		// 届先CDを設定
		tShippingInstH.setDelivCustomerCd(delivCustomer.getCustomerCd());
		// [#1140] ワンタイムの場合、届先CDがセットされない問題を修正 2017.03.06 kawana End

		// [C-CWMS-0052] 届先情報からワンタイムを判定に変更 2015.12.08 koyama Start
		if (!delivCustomer.isOnetimeFlg$1()) {
			// 通常の届先の場合(ワンタイム以外)

			// [#1140] ワンタイムの場合、届先CDがセットされない問題を修正(setの場所をここから移動) 2017.03.06 kawana

			// 届先名称を設定(未設定の場合のみ)
			if (CU.isNullOrEmpty(tShippingInstH.getDelivCustomerNm())) {
				tShippingInstH.setDelivCustomerNm(delivCustomer.getCustomerNm());
			}

			// 届先郵便番号を設定(郵便番号 または 住所1 が未設定の場合のみ)
			if (CU.isNullOrEmpty(tShippingInstH.getDelivZipCd()) ||
					CU.isNullOrEmpty(tShippingInstH.getDelivAddress1())) {

				tShippingInstH.setDelivZipCd(delivCustomer.getZipCd());
			}

			// 届先電話番号を設定(未設定の場合のみ)
			if (CU.isNullOrEmpty(tShippingInstH.getDelivTelNo())) {
				tShippingInstH.setDelivTelNo(delivCustomer.getTelNo());
			}

			// 届先住所を設定(住所1が未設定の場合のみ)
			if (CU.isNullOrEmpty(tShippingInstH.getDelivAddress1())) {

				tShippingInstH.setDelivAddress1(delivCustomer.getAddress1());
				tShippingInstH.setDelivAddress2(delivCustomer.getAddress2());
				tShippingInstH.setDelivAddress3(delivCustomer.getAddress3());
			}

			// ===== 郵便番号チェック =====

			if (checkMZip == CheckMZip.TRUE) {

				// [品質-102-029] 郵便番号が未設定の場合もエラーに修正 2015.04.08 kawana Start
				// [EC-CT1-191] 郵便番号チェックを共通ロジックで行うように変更 2015.04.09 kawana Start
				MZip mZipEntity = new MZip();
				mZipEntity.setZipCd(tShippingInstH.getDelivZipCd());
				boolean isErr = zipLogic.checkZipCd(mZipEntity);
				if (isErr) {
					// エラーを設定

					tShippingInstH.setErrorFlg_$1();
					tShippingInstH.setShippingStatus_$99();
					tShippingInstH.setErrorMessageCd(WmsMessageConst.POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR);
					// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
					getErrorManager().add(errSts, WmsMessageConst.POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR);
					// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
					return true;
				}
				// [EC-CT1-191] 郵便番号チェックを共通ロジックで行うように変更 2015.04.09 kawana End
				// [品質-102-029] 郵便番号が未設定の場合もエラーに修正 2015.04.08 kawana End
			}
		} else {
			// ワンタイムの場合、届先住所必須

			String onetimeDelivAddr = new StringBuilder()
					.append(CU.nullToStr(tShippingInstH.getDelivAddress1()))
					.append(CU.nullToStr(tShippingInstH.getDelivAddress2()))
					.append(CU.nullToStr(tShippingInstH.getDelivAddress3()))
					.append(CU.nullToStr(tShippingInstH.getDelivAddressSupply()))
					.toString();

			if (onetimeDelivAddr.length() < 1) {
				// エラーを設定

				tShippingInstH.setErrorFlg_$1();
				tShippingInstH.setShippingStatus_$99();
				tShippingInstH.setErrorMessageCd(WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw Start
				getErrorManager().add(errSts, WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
				// 出荷指示ヘッダ引数を削除した為エラーマネージャに追加 2016.3.9 nayzaw End
				return true;
			}

		}
		// [C-CWMS-0052] 届先情報からワンタイムを判定に変更 2015.12.08 koyama End
		return false;
	}

	// [#380][2.1.0-CT-075] 届先チェックメソッドの抽出 2016.12.06 kawana End
	// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean
	 * */
	public boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	// [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add End
}

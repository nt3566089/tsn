package com.oneslogi.wms.logic.stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoRCB;
import com.oneslogi.base.dbflute.cbean.WStockInputCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoRBhv;
import com.oneslogi.base.dbflute.exbhv.WStockInputBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WStockInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.master.ProductMasterSelectLogic;
import com.oneslogi.wms.util.WCU;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 在庫データ取込サブロジッククラス
 */
public class StockInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	// [Ver3.0] unit of measure対応 2017.12.26 NING Del
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TLotBhv tLotBhv;
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private WStockInputBhv wStockInputBhv;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	@Inject
	private TStoreNoRBhv tStoreNoRBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	// [Ver3.0] unit of measure対応 2017.12.26 NING Del
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private StockAdjustUpdateLogic stockAdjustUpdateLogic;
	@Inject
	private ProductMasterSelectLogic productMasterSelectLogic;

	/**
	 * <h2>在庫取込ワークテーブルを登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを在庫取込ワークテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWStockInput 在庫取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WStockInput> lstWStockInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWStockInput, errSts);
	}

	/**
	 * <h2>在庫取込ワークテーブルを登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを在庫取込ワークテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWStockInput 在庫取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WStockInput> lstWStockInput, ErrorStatus errSts) {
		wStockInputBhv.batchInsert(lstWStockInput);
	}

	/**
	 * <h2>在庫取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、在庫取込ワークを事前に削除する（コミットあり）。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>在庫取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、在庫取込ワークを事前に削除する。
	 * 削除異常発生の場合、削除例外エラーをエラー情報として管理する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「在庫取込ワーク」テーブルを全件削除する
		try {
			WStockInputCB wStockInputCB = wStockInputBhv.newConditionBean();
			wStockInputBhv.varyingQueryDelete(wStockInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wStockInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>在庫データを移行する（コミットあり）。</h2>
	 * <pre>
	 * 在庫系テーブルに更新処理を行う。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWStockInput 在庫取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception 例外処理
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WStockInput> lstWStockInput, ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWStockInput, errSts);
	}

	/**
	 * <h2>在庫データを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、
	 * 【在庫調整.在庫調整(+)】処理を実行する。
	 * エラーが存在する場合、返すエラー内容とエラー有を在庫取込ワーク.エラー内容とエラーフラグに更新する。
	 * エラーがない場合、処理済を在庫取込ワーク.処理済フラグに更新する。
	 *
	 * 【在庫調整.在庫調整(+)】
	 * ・{@link StockAdjustUpdateLogic#update(MProcessType, TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整(+)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWStockInput 在庫取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception 例外処理
	 */
	public void register(DataInputDto dataInputDto, List<WStockInput> lstWStockInput, ErrorStatus errSts) throws Exception {

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// 在庫区分マスタマップ取得
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

		for (WStockInput wStockInput : lstWStockInput) {
			TMoveInstH tMoveInstH = new TMoveInstH();
			TMoveInstB tMoveInstB = new TMoveInstB();

			getErrorManager().clear();

			// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
			// 取込データのチェック処理を行う
			checkRegister(wStockInput, tMoveInstH, tMoveInstB, stockTypeMap, errSts);
			// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wStockInput, getErrorManager());
				wStockInputBhv.update(wStockInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// 在庫調整処理を行う
			stockAdjustUpdateLogic.update(tMoveInstH.getMProcessType(), tMoveInstH, tMoveInstB, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wStockInput, getErrorManager());
				wStockInputBhv.update(wStockInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wStockInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wStockInputBhv.update(wStockInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>在庫取込データのチェック処理を行う。</h2>
	 * <pre>
	 * 取込データを取得し、次のチェックを行う。
	 * ・荷主CD存在チェック
	 * ・センタCDの存在チェック
	 * ・倉庫CDの存在チェック
	 * ・商品CDの存在チェック
	 * ・期限日管理品が期限日未入力チェック
	 * ・期限日非管理品が期限日入力チェック
	 * ・ロット管理品がロット未入力チェック
	 * ・ロット非管理品がロット入力チェック
	 * ・商品荷姿マスタ存在チェック
	 * ・パラメータマスタ存在チェック
	 * ・荷主センタマスタ存在チェック
	 * ・在庫区分CDの存在チェック
	 * ・ロケーションマスタCDの存在チェック
	 * ・仕入先CDの存在チェック
	 * ・処理区分が24:調整(+)でないかチェック
	 * ・期限日の日付チェック
	 * ・指示数チェック
	 *
	 * CDより各マスタテーブルのIDを取得し、在庫移動指示ヘッダ、在庫移動指示ボディに設定する。
	 * WMS在庫移動伝票No.を採番後、在庫移動指示ヘッダに設定する。
	 * </pre>
	 * @param wStockInput 在庫取込ワーク：全項目
	 * @param tMoveInstH  在庫移動指示ヘッダ：荷主ID・センタID・指示日
	 * @param tMoveInstB  在庫移動指示ボディ
	 * @param stockTypeMap 在庫区分マスタマップ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WStockInput wStockInput, TMoveInstH tMoveInstH, TMoveInstB tMoveInstB, Map<String, String> stockTypeMap, ErrorStatus errSts) {

		wStockInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wStockInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// 荷主CD
		if (CU.isNullOrEmpty(wStockInput.getClientCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getClientCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wStockInput.getClientCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = wStockInput.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		} else {
			tMoveInstH.setClientId(mClient.getClientId());
		}

		// センタCD
		if (CU.isNullOrEmpty(wStockInput.getCenterCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getCenterCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wStockInput.getCenterCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = wStockInput.getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
		} else {
			tMoveInstH.setCenterId(mCenter.getCenterId());
		}

		// 倉庫CD
		if (CU.isNullOrEmpty(wStockInput.getWarehouseCd())) {
			getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getWarehouseCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wStockInput.getWarehouseCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		if (mCenter != null) {
			// ===== 倉庫Cd取得と倉庫ID設定 =====
			String warehouseCd = wStockInput.getWarehouseCd();
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			if (mWarehouse == null) {
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
			} else {
				tMoveInstB.setWarehouseCd(warehouseCd);
				tMoveInstB.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}
		// [Ver3.0] unit of measure対応 2017.12.27 NING Start
		// 小数有無フラグ
		boolean decimalExistFlg = false;
		// 商品が存在フラグ
		boolean productExisted = false;
		// 商品CD
		if (CU.isNullOrEmpty(wStockInput.getProductCd())) {
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR);
		} else {
			if (!checkExcelCellInput("^[!-~]*$", wStockInput.getProductCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", wStockInput.getProductCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR, "30");
			}
		}

		// [Ver3.0] unit of measure対応 2017.12.27 NING End
		// ===== 商品Cd取得と商品ID設定 =====
		MProduct mProduct = null;
		if (mClient != null) {
			String productCd = wStockInput.getProductCd();
			mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(productCd);
			mProduct = productLogic.getUkEntity(mProduct);
			if (mProduct == null) {
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			} else {
				// [Ver3.0] unit of measure対応 2017.12.27 NING Start
				// 商品が存在
				productExisted = true;
				// 小数有
				if (mProduct.getMShapeGrp().getDecimalExistFlg().equals("1")) {
					decimalExistFlg = true;
				}
				// [Ver3.0] unit of measure対応 2017.12.27 NING End
				tMoveInstB.setProductCd(productCd);
				tMoveInstB.setProductId(mProduct.getProductId());

				// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//				// ===== 商品荷姿ID設定 =====
//				List<MProductShape> lstMProductShape = new ArrayList<MProductShape>();
//				MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
//				mProductShapeCB.setupSelect_MShape();
//				mProductShapeCB.query().setProductId_Equal(mProduct.getProductId());
//				lstMProductShape = mProductShapeBhv.selectList(mProductShapeCB);
//				if (lstMProductShape.size() != 0) {
//					MProductShape mProductShape = lstMProductShape.get(0);
//					tMoveInstB.setShapeCd(mProductShape.getMShape().getShapeCd());
//					tMoveInstB.setShapeId(mProductShape.getShapeId());
//				}

				// ===== 商品荷姿ID設定 =====
				if (mCenter != null) {
					OptionalEntity<MClientCenter> optMClientCenter = mClientCenterBhv.selectByUniqueOf(
							mClient.getClientId(), mCenter.getCenterId());

					if (optMClientCenter.isPresent()) {
						// [Ver3.0] unit of measure対応 2017.12.21 NING Del
						// [Ver3.0] unit of measure対応 2017.12.21 NING Start
						// 商品に紐付く在庫管理単位の最小荷姿存在チェック
						List<MProduct> mProductList = productMasterSelectLogic.selectProductByCd(productCd, mClient.getClientCd());
						boolean shapeGrpDtlExisted = false;
						for (Iterator<MProduct> iterator = mProductList.iterator(); iterator.hasNext();) {
							MProduct mProduct2 = iterator.next();
							// 在庫管理単位の最小荷姿存在
							if (mProduct2.getMShapeGrp().getMShapeGrpDtlList() != null
									&& mProduct2.getMShapeGrp().getMShapeGrpDtlList().size() > 0) {
								shapeGrpDtlExisted = true;
								break;
							}
						}
						// 在庫管理単位の最小荷姿不存在
						if (!shapeGrpDtlExisted) {
							getErrorManager().add(errSts, WmsMessageConst.UNIT_PRODUCT_SHAPE_NOT_FOUND_ERROR);
						}
						// [Ver3.0] unit of measure対応 2017.12.21 NING End
					} else {
						getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
					}

				}
				// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

			}
		}

		// ===== 在庫区分Cd取得と在庫区分ID設定 =====
		// [#3623][Ver3.0] 初期データ取込(在庫データ取込) - エラーメッセージ設定重複 2018.03.13 honma Mod End
		if (CU.isNullOrEmpty(wStockInput.getStockTypeCd())) {
			getErrorManager().add(errSts, WmsMessageConst.STOCK_TYPE_CD_NOT_INPUT_ERROR);
		} else {
			// [#3623][Ver3.0] 初期データ取込(在庫データ取込) - エラーメッセージ設定重複 2018.03.13 honma Mod Start
			// 在庫区分マスタ存在チェック
			if (!stockTypeMap.containsKey(wStockInput.getStockTypeCd())) {
				getErrorManager().add(errSts, WmsMessageConst.STOCK_TYPE_CD_NOT_FOUND_ERROR);
			} else {
				tMoveInstB.setStockTypeCd(wStockInput.getStockTypeCd());
				tMoveInstB.setStockTypeId(Long.parseLong(stockTypeMap.get(wStockInput.getStockTypeCd())));
			}
			// [#3623][Ver3.0] 初期データ取込(在庫データ取込) - エラーメッセージ設定重複 2018.03.13 honma Mod End
		}

		// ロケーションCD
		if (CU.isNullOrEmpty(wStockInput.getLocationCd())) {
			getErrorManager().add(errSts, WmsMessageConst.LOCATION_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z]*$", wStockInput.getLocationCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_CODE_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z]{1,10}$", wStockInput.getLocationCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_CODE_CHECK_INPUT_MAX_ERROR, "10");
			}
		}

		// ===== ロケーションCd取得とロケーションID設定 =====
		if (mCenter != null) {
			String locationCd = wStockInput.getLocationCd();
			MLocation mLocation = new MLocation();
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation = locationLogic.getUkEntity(mLocation);
			if (mLocation == null) {
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			} else {
				tMoveInstB.setLocationCd(locationCd);
				tMoveInstB.setLocationId(mLocation.getLocationId());
			}
		}

		// 預託CD
		if (CU.isNullOrEmpty(wStockInput.getDepositCd())) {
			getErrorManager().add(errSts, WmsMessageConst.PLAN_DEPOSIT_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getDepositCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,10}$", wStockInput.getDepositCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_CODE_CHECK_INPUT_MAX_ERROR, "10");
			}
		}

		// ===== 預託Cd取得と預託ID設定 =====
		if (mClient != null) {
			String customerCd = wStockInput.getDepositCd();
			if (!CU.isNullOrEmpty(customerCd)) {
				MCustomer mCustomerDeposit = new MCustomer();
				mCustomerDeposit.setCustomerCd(customerCd);
				mCustomerDeposit.setClientId(mClient.getClientId());
				mCustomerDeposit = customerLogic.getUkEntity(mCustomerDeposit);
				if (mCustomerDeposit == null) {
					getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				} else {
					tMoveInstB.setDepositCd(customerCd);
					tMoveInstB.setDepositId(mCustomerDeposit.getCustomerId());
				}
			}
		}

		tMoveInstH.setInputType_$20();
		tMoveInstH.setMoveInstStatus_$00();

		// ===== 処理区分マスタCd取得と処理区分マスタID設定 =====

		// [ON推-品向-909] 処理区分が空の場合は在庫調整(+)を設定 2015.07.29 kawana Start

		// 処理区分CDを設定
		String processTypeCdStr = wStockInput.getProcessTypeCd();
		CDef.ProcessTypeCd processTypeCd = null;
		boolean isProcessTypeErr = false;
		if (CU.isNullOrEmpty(processTypeCdStr)) {
			// 空の場合は在庫調整(+)を設定
			processTypeCd = CDef.ProcessTypeCd.$24;
		} else {

			// [#3623][Ver3.0] 初期データ取込(在庫データ取込) - 処理区分マスタ存在チェックABEND 2018.03.13 honma Mod Start
			if (CU.equals(CDef.ProcessTypeCd.$24.code(), processTypeCdStr)) {
				processTypeCd = CDef.ProcessTypeCd.codeOf(processTypeCdStr);
			} else {
				getErrorManager().add(errSts, WmsMessageConst.PROCESS_TYPE_CHECK_STOCK_ADJUSTMENT_PLUS_ERROR);
				isProcessTypeErr = true;
			}
			// [#3623][Ver3.0] 初期データ取込(在庫データ取込) - 処理区分マスタ存在チェックABEND 2018.03.13 honma Mod End
		}

		if (!isProcessTypeErr) {

			MProcessType processTypeCondition = new MProcessType();
			// 在庫調整(+)
			processTypeCondition.setProcessTypeCd(processTypeCd.code());
			MProcessType processType = processTypeLogic.getUkEntity(processTypeCondition);
			tMoveInstH.setProcessTypeId(processType.getProcessTypeId());
			tMoveInstH.setMProcessType(processType);
		}

		// [ON推-品向-909] 処理区分が空の場合は在庫調整(+)を設定 2015.07.29 kawana End

		// ロットCD
		if (!CU.isNullOrEmpty(wStockInput.getLotCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[ -~｡-ﾟ]*$", wStockInput.getLotCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.LOT_CD_CHECK_HALF_WIDTH_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[ -~｡-ﾟ]{1,10}$", wStockInput.getLotCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.LOT_CD_CHECK_INPUT_MAX_ERROR, "10");
			}
		}
		if (mProduct != null) {
			if(CU.equals(mProduct.getLotManagFlg(), "1")){
				if(CU.isNullOrEmpty(wStockInput.getLotCd())){
					getErrorManager().add(errSts, WmsMessageConst.LOT_NOT_INPUT_LOT_MANAGEMENT_PRODUCT_ERROR);
				}
			} else {
				if(!CU.isNullOrEmpty(wStockInput.getLotCd())){
					getErrorManager().add(errSts, WmsMessageConst.LOT_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR);
				}
			}
		}

		// 入庫ラベルNO
		if (!CU.isNullOrEmpty(wStockInput.getStoreLabelNo())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getStoreLabelNo())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.STORE_LABEL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,11}$", wStockInput.getStoreLabelNo())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.STORE_LABEL_NO_CHECK_INPUT_MAX_ERROR, "11");
			}
		}

		// 仕入先CD
		if (!CU.isNullOrEmpty(wStockInput.getSupplierCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wStockInput.getSupplierCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,10}$", wStockInput.getSupplierCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.PLAN_SUPPLIER_CD_CHECK_INPUT_MAX_ERROR);
			}
		}

		// ===== 仕入先Cd取得と仕入先ID設定 =====
		if (mClient != null) {
			String supplierCd = wStockInput.getSupplierCd();
			if (!CU.isNullOrEmpty(supplierCd)) {
				MCustomer mCustomerSupplier = new MCustomer();
				mCustomerSupplier.setCustomerCd(supplierCd);
				mCustomerSupplier.setClientId(mClient.getClientId());
				mCustomerSupplier = customerLogic.getUkEntity(mCustomerSupplier);
				if (mCustomerSupplier == null) {
					getErrorManager().add(errSts, WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
				} else {
					tMoveInstB.setSupplierCd(supplierCd);
					tMoveInstB.setSupplierId(mCustomerSupplier.getCustomerId());
				}
			}
		}

		// 期限日チェック
		if (!CU.isNullOrEmpty(wStockInput.getLimitDt())) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
				simpleDateFormat.setLenient(false);
				simpleDateFormat.parse(wStockInput.getLimitDt());
			} catch (ParseException e) {
				getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_DATE_ERROR);
			}
		}
		if (mProduct != null) {
			if(CU.equals(mProduct.getLimitDtManagFlg(), "1")){
				if(CU.isNullOrEmpty(wStockInput.getLimitDt())){
					getErrorManager().add(errSts, WmsMessageConst.LIMIT_DATE_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR);
				}
			} else {
				if(!CU.isNullOrEmpty(wStockInput.getLimitDt())){
					getErrorManager().add(errSts, WmsMessageConst.LIMIT_DATE_CANNOT_INPUT_EXCEPT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR);
				}
			}
		}

		// 指示数チェック
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (CU.isNullOrEmpty(wStockInput.getInstNum())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			getErrorManager().add(errSts, WmsMessageConst.INST_NUM_NOT_INPUT_ERROR);
		} else {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			String instNum = wStockInput.getInstNum();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", instNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.INST_NUM_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", instNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数7桁以内
				getErrorManager().add(errSts, WmsMessageConst.INST_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "7");
				// [Ver3.0] unit of measure対応 2017.12.27 NING Start
				// 商品存在
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (productExisted) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// 商品紐付く荷姿グループ.小数有無フラグが：「有」
				if (decimalExistFlg) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", instNum)) {
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
						// 小数3桁以内
						getErrorManager().add(errSts, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR);
					}
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
					if (WCC.isLessThan(instNum, WCC.toBigDecimal("0.001"))) {
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
						// 最小0.001以上
						getErrorManager().add(errSts, WmsMessageConst.INST_NUM_INPUT_REQUEST_MORE_THAN_MIN_ERROR, "0.001");
					}
				} else {
					// 小数有無フラグが：「無」
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
					if (!checkExcelCellInput("^(-)?\\d+$", instNum)) {
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
						// 小数0桁以内
						getErrorManager().add(errSts, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_ERROR);
					}
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
					if (WCC.isLessThan(instNum, WCC.ONE)) {
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
						// 最小1以上
						getErrorManager().add(errSts, WmsMessageConst.INST_NUM_INPUT_REQUEST_MORE_THAN_ONE_ERROR);
					}
				}
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
			}
			// [Ver3.0] unit of measure対応 2017.12.27 NING End
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		// 備考
		if (!CU.isNullOrEmpty(wStockInput.getStockInputComment())) {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wStockInput.getStockInputComment())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.STOCK_INPUT_COMMENT_CHECK_INPUT_MAX_ERROR, "50");
			}
		}

		if (getErrorManager().size() > 0) {
			return;
		}

		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(tMoveInstH.getClientId());
		mClientCenter.setCenterId(tMoveInstH.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		try {
			String instDt = mClientCenter.getSystemDt();
			instDt = CommonUtil.dateToString(CommonUtil.stringToDate(instDt));
			tMoveInstH.setInstDt(instDt);
		} catch (Exception e) {
			getErrorManager().throwException(e);
		}

		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(
				tMoveInstH.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
		tMoveInstH.setMoveSlipNo(moveSlipNo);

		tMoveInstH.setMoveInstComment(wStockInput.getStockInputComment());

		tMoveInstB.setInoutType_$0();
		tMoveInstB.setStoreLabelNo(wStockInput.getStoreLabelNo());

		tMoveInstB.setLot(wStockInput.getLotCd());
		tMoveInstB.setLimitDt(wStockInput.getLimitDt());

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		//tMoveInstB.setUnitNum(wStockInput.getUnitNum());
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		tMoveInstB.setInstNum(WCU.stringToBigDecimal(wStockInput.getInstNum()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
	}

	/**
	 * <h2>在庫系テーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 在庫データ移行が全削除後追記の場合、事前にデータを削除する。（コミットあり）。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>在庫系テーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 在庫データ移行が全削除後追記の場合、下記のテーブルを事前に削除する。
	 * ・以下順序で全件削除する。
	 *   01. 在庫受払
	 *   02. 在庫日報
	 *   03. 在庫
	 *   04. ロット
	 *   05. 入庫No.帳票
	 *   06. 入庫No
	 *   07. 在庫移動実績ボディ
	 *   08. 在庫移動指示帳票
	 *   09. 在庫移動指示ボディ
	 *   10. 在庫移動指示ヘッダ
	 * 削除異常発生の場合、削除例外エラーをエラー情報として管理する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		// 入出荷データの存在チェック
		checkDelete(errSts);
		if (getErrorManager().size() > 0) {
			return;
		}

		//「在庫受払」テーブルを全件削除する
		try {
			TStockInoutCB tStockInoutCB = tStockInoutBhv.newConditionBean();
			tStockInoutBhv.varyingQueryDelete(tStockInoutCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockInoutBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockInoutBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockInoutBhv.asTableDbName().toUpperCase());
			return;
		}

		//「在庫日報」テーブルを全件削除する
		try {
			TStockReportCB tStockReportCB = tStockReportBhv.newConditionBean();
			tStockReportBhv.varyingQueryDelete(tStockReportCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockReportBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockReportBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockReportBhv.asTableDbName().toUpperCase());
			return;
		}

		//「在庫」テーブルを全件削除する
		try {
			TStockCB tStockCB = tStockBhv.newConditionBean();
			tStockBhv.varyingQueryDelete(tStockCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStockBhv.asTableDbName().toUpperCase());
			return;
		}

		//「ロット」テーブルを全件削除する
		try {
			TLotCB tLotCB = tLotBhv.newConditionBean();
			tLotBhv.varyingQueryDelete(tLotCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tLotBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tLotBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tLotBhv.asTableDbName().toUpperCase());
			return;
		}
		//[エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		//「入庫No.帳票」テーブルを全件削除する
		try {
			TStoreNoRCB tStoreNoRCB = tStoreNoRBhv.newConditionBean();
			tStoreNoRBhv.varyingQueryDelete(tStoreNoRCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoRBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoRBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoRBhv.asTableDbName().toUpperCase());
			return;
		}
		//[エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		//「入庫No」テーブルを全件削除する
		try {
			TStoreNoCB tStoreNoCB = tStoreNoBhv.newConditionBean();
			tStoreNoBhv.varyingQueryDelete(tStoreNoCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tStoreNoBhv.asTableDbName().toUpperCase());
			return;
		}

		//「在庫移動実績ボディ」テーブルを全件削除する
		try {
			TMoveRecordBCB tMoveRecordBCB = tMoveRecordBBhv.newConditionBean();
			tMoveRecordBBhv.varyingQueryDelete(tMoveRecordBCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveRecordBBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveRecordBBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveRecordBBhv.asTableDbName().toUpperCase());
			return;
		}
		//[エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		//「在庫移動指示帳票」テーブルを全件削除する
		try {
			TMoveInstRCB tMoveInstRCB = tMoveInstRBhv.newConditionBean();
			tMoveInstRBhv.varyingQueryDelete(tMoveInstRCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstRBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstRBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstRBhv.asTableDbName().toUpperCase());
			return;
		}
		//[エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		//「在庫移動指示ボディ」テーブルを全件削除する
		try {
			TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newConditionBean();
			tMoveInstBBhv.varyingQueryDelete(tMoveInstBCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstBBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstBBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstBBhv.asTableDbName().toUpperCase());
			return;
		}

		//「在庫移動指示ヘッダ」テーブルを全件削除する
		try {
			TMoveInstHCB tMoveInstHCB = tMoveInstHBhv.newConditionBean();
			tMoveInstHBhv.varyingQueryDelete(tMoveInstHCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstHBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstHBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, tMoveInstHBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>在庫取込ワークテーブル全件削除前のチェック処理を行う。</h2>
	 * <pre>
	 *  在庫受払.入庫実績ボディID存在或いは在庫受払.引当指示ボディID存在する場合、
	 *  入出荷データが存在するため、移行できないエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkDelete(ErrorStatus errSts) {
		//「在庫受払」テーブルの検索
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newConditionBean();
		tStockInoutCB.orScopeQuery(new OrQuery<TStockInoutCB>() {
		    public void query(TStockInoutCB orCB) {
			    // 在庫受払.入庫実績ボディID IS NOT NULL
		        orCB.query().setStoreRecordBId_IsNotNull();
		        // 在庫受払.引当指示ボディID IS NOT NULL
		        orCB.query().setAllocInstBId_IsNotNull();
		    }
		});
		List<TStockInout> lstTStockInout = tStockInoutBhv.selectList(tStockInoutCB);
		if (lstTStockInout.size() > 0) {
			// 入出荷データが存在する為、移行できない。
			getErrorManager().add(errSts, WmsMessageConst.STOCK_INPUT_CANNOT_REGISTER_STOCK_INOUT_EXISTED_ERROR);
			return;
		}
	}
	// [Ver3.0] unit of measure対応 2017.12.27 NING Start
	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 * */
	public boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	// [Ver3.0] unit of measure対応 2017.12.27 NING End

}

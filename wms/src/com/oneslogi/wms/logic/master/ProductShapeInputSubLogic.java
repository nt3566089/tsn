package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.WProductShapeInputCB;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.WProductShapeInputBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.WProductShapeInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 商品荷姿マスタ取込サブロジッククラス
 */
public class ProductShapeInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WProductShapeInputBhv wProductShapeInputBhv;
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [Ver3.0] unit of measure対応 2017.12.26 NING Del

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductShapeMasterInsertLogic productShapeMasterInsertLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ProductShapeLogic productShapeLogic;
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	@Inject
	private ShapeGroupMasterSelectLogic shapeGroupMasterSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.21 NING End

	/**
	 * <h2>商品荷姿マスタ取込ワークテーブルに登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを商品荷姿マスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WProductShapeInput> lstWProductShapeInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWProductShapeInput, errSts);
	}

	/**
	 * <h2>商品荷姿マスタ取込ワークテーブルに登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを商品荷姿マスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WProductShapeInput> lstWProductShapeInput, ErrorStatus errSts) {
		wProductShapeInputBhv.batchInsert(lstWProductShapeInput);
	}

	/**
	 * <h2>商品荷姿マスタ取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 商品荷姿マスタ取込ワーク取込が全削除後追記の場合、事前に削除する。
	 *
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>商品荷姿マスタ取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 商品荷姿マスタ取込ワークが全削除後追記の場合、事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「商品荷姿マスタ取込ワーク」テーブルを全件削除する
		try {
			WProductShapeInputCB wProductShapeInputCB = wProductShapeInputBhv.newConditionBean();
			wProductShapeInputBhv.varyingQueryDelete(wProductShapeInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wProductShapeInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>商品荷姿マスタテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 商品荷姿マスタ移行が全削除後追記の場合、事前に削除する。
	 *
	 * </pre>
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワーク：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(List<WProductShapeInput> lstWProductShapeInput, ErrorStatus errSts) {
		delete(lstWProductShapeInput, errSts);
	}

	/**
	 * <h2>商品荷姿マスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 移行が全削除後追記の場合、パラメータマスタのピース荷姿以外のデータを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワーク：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(List<WProductShapeInput> lstWProductShapeInput, ErrorStatus errSts) {
		//「商品荷姿マスタにパラメータマスタのピース荷姿以外のデータ」テーブルを全件削除する
		try {
			List<Long> shapeIdList=new ArrayList<Long>();
			List<Long> productIdList=new ArrayList<Long>();
			for (WProductShapeInput wProductShapeInput : lstWProductShapeInput) {
				String clientCd = wProductShapeInput.getClientCd();
				MClient mClient = new MClient();
				mClient.setClientCd(clientCd);
				mClient = clientLogic.getUkEntity(mClient);
				if (mClient != null) {
					// [Ver3.0] unit of measure対応 2017.12.21 NING Del
					// [Ver3.0] unit of measure対応 2017.12.21 NING Start
					// 荷主所属すべて最小荷姿グループ詳細を取得する。
					ListResultBean<MShapeGrpDtl> shapeGrpDtlList = shapeGroupMasterSelectLogic.selectAllShapeGrpDtl(mClient.getClientCd(), wProductShapeInput.getProductCd());

					// 最小荷姿グループ詳細格納
					if (shapeGrpDtlList != null && shapeGrpDtlList.size() > 0){
						for (Iterator<MShapeGrpDtl> iterator = shapeGrpDtlList.iterator(); iterator.hasNext();) {
							MShapeGrpDtl mShapeGrpDtl = iterator.next();
							if (mShapeGrpDtl.getMProductShapeList() != null
									&& mShapeGrpDtl.getMProductShapeList().size() > 0
									&& !shapeIdList.contains(mShapeGrpDtl.getShapeGrpDtlId())){
								shapeIdList.add(mShapeGrpDtl.getShapeGrpDtlId());
								productIdList.add(mShapeGrpDtl.getMProductShapeList().get(0).getProductId());
							}
						}
					}
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
				}
			}
			MProductShapeCB mProductShapeCB = mProductShapeBhv.newConditionBean();
			if (shapeIdList.size() > 0){
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// 商品荷姿マスタ（在庫最小単位以外のデータ）を全件削除する
				mProductShapeCB.query().setShapeGrpDtlId_NotInScope(shapeIdList);
				mProductShapeCB.query().setProductId_InScope(productIdList);
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				mProductShapeBhv.queryDelete(mProductShapeCB);
			} else {
				mProductShapeBhv.varyingQueryDelete(mProductShapeCB, op -> op.allowNonQueryDelete());
			}

		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductShapeBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductShapeBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductShapeBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>商品荷姿マスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * 商品荷姿マスタ登録を呼出し、商品荷姿マスタテーブルに登録処理する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WProductShapeInput> lstWProductShapeInput,
			ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWProductShapeInput, errSts);
	}

	/**
	 * <h2>商品荷姿マスタを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、商品荷姿マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	public void register(DataInputDto dataInputDto, List<WProductShapeInput> lstWProductShapeInput,
			ErrorStatus errSts) throws Exception {

		for (WProductShapeInput wProductShapeInput : lstWProductShapeInput) {
			MProductShape mProductShape = new MProductShape();

			getErrorManager().clear();

			// 取込データのチェック処理を行う
			checkRegister(wProductShapeInput, mProductShape, lstWProductShapeInput, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wProductShapeInput, getErrorManager());
				wProductShapeInputBhv.update(wProductShapeInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// 商品荷姿マスタ登録処理を行う
			productShapeMasterInsertLogic.insert(mProductShape, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wProductShapeInput, getErrorManager());
				wProductShapeInputBhv.update(wProductShapeInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wProductShapeInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wProductShapeInputBhv.update(wProductShapeInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、次のチェックを行う。
	 *・荷主CDの存在チェック
	 *・商品CDの存在チェック
	 *・荷姿CDの存在チェック
	 *・荷姿CDの必須チェック
	 *・入数の必須チェック
	 *・入数の0以上チェック
	 *・縦(mm)の0以上チェック
	 *・横(mm)の0以上チェック
	 *・高さ(mm)の0以上チェック
	 *・容積(mm3)の0以上チェック
	 *・商品重量(g)の0以上チェック
	 *・総重量(g)の0以上チェック
	 *・商品荷姿の重複チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 引数の商品荷姿マスタに商品荷姿マスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wProductShapeInput 商品荷姿マスタ取込ワーク：全項目
	 * @param mProductShape 商品荷姿マスタ
	 * @param lstWProductShapeInput 商品荷姿マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WProductShapeInput wProductShapeInput, MProductShape mProductShape, List<WProductShapeInput> lstWProductShapeInput, ErrorStatus errSts) {

		wProductShapeInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wProductShapeInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// 荷主CD
		if (CU.isNullOrEmpty(wProductShapeInput.getClientCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
		} else {
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", wProductShapeInput.getClientCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,5}$", wProductShapeInput.getClientCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = wProductShapeInput.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		}

		// 商品CD
		if (CU.isNullOrEmpty(wProductShapeInput.getProductCd())) {
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
		} else {
			if (!checkExcelCellInput("^[!-~]*$", wProductShapeInput.getProductCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", wProductShapeInput.getProductCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR);
			}
		}

		// ===== 商品Cd取得と商品ID設定 =====
		if (mClient != null && !CU.isNullOrEmpty(wProductShapeInput.getProductCd())) {
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(wProductShapeInput.getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);
			if (mProduct == null) {
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			} else {
				mProductShape.setProductId(mProduct.getProductId());
			}
		}

		// [Ver3.0] unit of measure対応 2017.12.21 NING Del

		// 荷姿CD
		if (CU.isNullOrEmpty(wProductShapeInput.getShapeCd())) {
			getErrorManager().add(errSts, WmsMessageConst.SHAPE_CLASS_NOT_INPUT_ERROR);
		} else {
			if (!checkExcelCellInput("^[0-9a-zA-Z]*$", wProductShapeInput.getShapeCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_CLASS_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!checkExcelCellInput(".{1,30}$", wProductShapeInput.getShapeCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_CLASS_CHECK_INPUT_MAX_ERROR);
			}
		}

		// 入数
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
		if (CU.isNullOrEmpty(wProductShapeInput.getUnitNum())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_NOT_INPUT_ERROR);
		} else {
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Add Start
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getUnitNum())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_CHECK_NUMERIC_ONLY_ERROR);
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String strUnitNum = WCC.stripTrailingZeros(wProductShapeInput.getUnitNum());
				if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strUnitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数5桁以内
					getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "5");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?\\d+$", strUnitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数0桁以内
					getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_CHECK_INPUT_DECIMAL_ERROR);
					// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Add End
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
					// [Ver3.0][#3642] 最小荷姿と最小荷姿以外の場合でエラー内容を変更 2018.02.16 shimizu Start
					// [#6752][v3.1] 荷主不正で致命的エラー発生 2019.10.31 kawana Start
				} else if (wProductShapeInput.getProductCd() != null && wProductShapeInput.getShapeCd() != null && mClient != null) {
					// [#6752][v3.1] 荷主不正で致命的エラー発生 2019.10.31 kawana End
					long unitNum = Long.valueOf(strUnitNum);
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 最小荷姿取得
					MShapeGrp shapeGrp = productLogic.getProductByCd(wProductShapeInput.getProductCd(), mClient.getClientCd());
					if (!CU.isNullOrEmpty(wProductShapeInput.getShapeCd()) && shapeGrp != null
							&& shapeGrp.getMShapeGrpDtlList() != null && shapeGrp.getMShapeGrpDtlList().size() > 0
							&& wProductShapeInput.getShapeCd().equals(shapeGrp.getMShapeGrpDtlList().get(0).getMShape().getShapeCd())) {
						// 最小荷姿の入数が0ではなかった場合
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
						if(unitNum != 0) {
							// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
							getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_INPUT_REQUEST_ONLY_ZERO_ERROR);
						}
					} else {
						// 最小荷姿以外の荷姿が1よりも下回っていた場合
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
						if(unitNum < 1) {
						// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
							getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR);
						}
					}
				}
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		//[Ver3.0][#3642] 最小荷姿と最小荷姿以外の場合でエラー内容を変更 2018.02.16 shimizu End
		}
		// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		// [Ver3.0] unit of measure対応 2017.12.21 NING Start
		// [Ver3.0][#3630] 小数フラグ有無の削除 2018.02.15 shimizu Start
		// ===== 荷姿Cd取得と荷姿ID設定 =====
		if (mClient != null && !CU.isNullOrEmpty(wProductShapeInput.getShapeCd())) {

			MShapeGrp mShapeGrp = productLogic.getProductByCd(wProductShapeInput.getProductCd(), mClient.getClientCd(), wProductShapeInput.getShapeCd());
			if (mShapeGrp == null || mShapeGrp.getMShapeGrpDtlList() == null
					|| mShapeGrp.getMShapeGrpDtlList().size() == 0) {
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_GRP_DTL_NOT_FOUND_ERROR);
			} else {
				mProductShape.setMShapeGrpDtl(mShapeGrp.getMShapeGrpDtlList().get(0));
				mProductShape.setShapeGrpDtlId(mShapeGrp.getMShapeGrpDtlList().get(0).getShapeGrpDtlId());
			}
		}
		// [Ver3.0][#3630] 小数フラグ有無の削除 2018.02.15 shimizu End
		// [Ver3.0] unit of measure対応 2017.12.21 NING End

		// 縦(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getLength())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getLength())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_LENGTH_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String strLength = WCC.stripTrailingZeros(wProductShapeInput.getLength());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", strLength)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数10桁以内
					getErrorManager().add(errSts, WmsMessageConst.LENGTH_INPUT_INTEGER_LENGTH_ERROR, "10");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", strLength)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数3桁以内
					getErrorManager().add(errSts, WmsMessageConst.LENGTH_INPUT_DECIMAL_LENGTH_ERROR);
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (WCC.isNegative(strLength)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 最小0以上
					getErrorManager().add(errSts, WmsMessageConst.LENGTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
				}
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
			// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
		}

		// 横(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getWidth())) {
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getWidth())) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_WIDTH_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String width =  WCC.stripTrailingZeros(wProductShapeInput.getWidth());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_INPUT_DECIMAL_LENGTH_ERROR);
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
			// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		}

		// 高さ(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getHeight())) {
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getHeight())) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_HEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String height =  WCC.stripTrailingZeros(wProductShapeInput.getHeight());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", height)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数10桁以内
					getErrorManager().add(errSts, WmsMessageConst.HEIGHT_INPUT_INTEGER_LENGTH_ERROR, "10");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", height)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数3桁以内
					getErrorManager().add(errSts, WmsMessageConst.HEIGHT_INPUT_DECIMAL_LENGTH_ERROR);
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (WCC.isNegative(height)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 最小0以上
					getErrorManager().add(errSts, WmsMessageConst.HEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
				}
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
				// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		}

		// 容積(mm3)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getVolume())) {
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getVolume())) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_VOLUME_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String volume = WCC.stripTrailingZeros(wProductShapeInput.getVolume());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", volume)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数10桁以内
					getErrorManager().add(errSts, WmsMessageConst.SHAPE_VOLUME_INPUT_INTEGER_LENGTH_ERROR, "10");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", volume)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数3桁以内
					getErrorManager().add(errSts, WmsMessageConst.SHAPE_VOLUME_INPUT_DECIMAL_LENGTH_ERROR);
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (WCC.isNegative(volume)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// [#169] メッセージの重複を削除 2016.12.05 kawana Start
					getErrorManager().add(errSts, WmsMessageConst.SHAPE_VOLUME_CHECK_MIN_IS_ZERO_ERROR);
					// [#169] メッセージの重複を削除 2016.12.05 kawana End
				}
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
				// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		}
		// 商品重量(g)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getNetWeight())) {
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getNetWeight())) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String netWeight = WCC.stripTrailingZeros(wProductShapeInput.getNetWeight());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR);
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
			// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		}
		// 総重量(g)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductShapeInput.getGrossWeight())) {
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi Start
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", wProductShapeInput.getGrossWeight())) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.SHAPE_GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else {
				String grossWeight = WCC.stripTrailingZeros(wProductShapeInput.getGrossWeight());
				if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR);
				// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
			// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
			// [#3775][Ver3.0] 初期データ取込(商品荷姿マスタ取込) - 数値上限チェック追加 2018.03.15 honma Mod End
			}
			// [#7042][OSS] 値チェックの条件分岐を変更 2020.01.22 tsuboi End
		}

		// 取込ファイル内重複チェック(商品CD、荷姿CD)
		if (wProductShapeInput.getProductCd() != null && wProductShapeInput.getShapeCd() != null) {
			for (WProductShapeInput checkWProductShapeInput : lstWProductShapeInput) {
				if (checkWProductShapeInput.getProductCd() != null && checkWProductShapeInput.getShapeCd() != null
						// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana Start
						&& !equals(wProductShapeInput.getProductShapeInputId(), checkWProductShapeInput.getProductShapeInputId())) {
					// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana End
					if (wProductShapeInput.getProductCd().equals(checkWProductShapeInput.getProductCd())
							&& wProductShapeInput.getShapeCd().equals(checkWProductShapeInput.getShapeCd())) {
						// 取込ファイル内重複エラー
						getErrorManager().add(errSts, WmsMessageConst.PRODUCT_AND_SHAPE_CODE_DUPLICATE_ERROR);
						break;
					}
				}
			}
		}

		// 重複チェック
		if (mProductShape.getProductId() != null && mProductShape.getShapeGrpDtlId() != null) {
			productShapeLogic.checkInsert(mProductShape, errSts);
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		if (getErrorManager().size() > 0) {
			return;
		}

		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mProductShape.setUnitNum(WCU.stringToLong(wProductShapeInput.getUnitNum()));
		mProductShape.setLength(WCU.stringToBigDecimal(wProductShapeInput.getLength()));
		mProductShape.setWidth(WCU.stringToBigDecimal(wProductShapeInput.getWidth()));
		mProductShape.setHeight(WCU.stringToBigDecimal(wProductShapeInput.getHeight()));
		mProductShape.setVolume(WCU.stringToBigDecimal(wProductShapeInput.getVolume()));
		mProductShape.setNetWeight(WCU.stringToBigDecimal(wProductShapeInput.getNetWeight()));
		mProductShape.setGrossWeight(WCU.stringToBigDecimal(wProductShapeInput.getGrossWeight()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	/**
	 * 正規表現処理方法。
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING End

	// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana Start
	private boolean equals(Long l1, Long l2) {

		if (l1 == null && l2 == null) {
			return true;
		}

		return CU.isNotNullAndEquals(l1, l2);
	}
	// [#5436][v3.0] Longの比較不正を修正 2018.11.01 kawana End
}

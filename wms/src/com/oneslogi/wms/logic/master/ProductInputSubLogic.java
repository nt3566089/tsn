package com.oneslogi.wms.logic.master;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.WProductInputCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.WProductInputBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.WProductInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 商品マスタ取込サブロジッククラス
 */
public class ProductInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private WProductInputBhv wProductInputBhv;

	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	// [Ver3.0] unit of measure対応 2017.12.26 NING Del
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//	@Inject
//	private ShapeLogic shapeLogic;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ProductMasterInsertLogic productMasterInsertLogic;
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	@Inject
	private ShapeGroupMasterSelectLogic shapeGroupMasterSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.21 NING End
	// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Add Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Add End

	/**
	 * <h2>商品マスタ取込ワークテーブルに登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを商品マスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductInput 商品マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WProductInput> lstWProductInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWProductInput, errSts);
	}

	/**
	 * <h2>商品マスタ取込ワークテーブルに登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを商品マスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductInput 商品マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WProductInput> lstWProductInput, ErrorStatus errSts) {
		wProductInputBhv.batchInsert(lstWProductInput);
	}

	/**
	 * <h2>商品マスタ取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 全削除後追記の場合、商品マスタ取込ワークを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>商品マスタ取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 全削除後追記の場合、商品マスタ取込ワークを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「商品マスタ取込ワーク」テーブルを全件削除する
		try {
			WProductInputCB wProductInputCB = wProductInputBhv.newConditionBean();
			wProductInputBhv.varyingQueryDelete(wProductInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wProductInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>取込データを商品マスタに登録する（コミットあり）。</h2>
	 * <pre>
	 * 商品マスタ登録を呼出し、取込データを商品マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductInput 商品マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WProductInput> lstWProductInput, ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWProductInput, errSts);
	}

	/**
	 * <h2>取込データを商品マスタに登録する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、取込データを商品マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWProductInput 商品マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	public void register(DataInputDto dataInputDto, List<WProductInput> lstWProductInput, ErrorStatus errSts) throws Exception {

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// 商品CD重複チェック用
		Set<String> productCdSet = new HashSet<String>();
		// JANCD重複チェック用
		Set<String> janCdSet = new HashSet<String>();
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Add Start
		// ===== 各種区分値CDより区分値明細マスタマップ取得 =====
		// ロット管理フラグ
		Map<String, String> lotManagMap = centerClassLogic.getClassMapByCd("LOT_MANAG_FLG");
		// 期限日管理フラグ
		Map<String, String> limitDtManagMap = centerClassLogic.getClassMapByCd("LIMIT_DT_MANAG_FLG");
		// 期限日逆転防止フラグ
		Map<String, String> limitDtReverseMap = centerClassLogic.getClassMapByCd("LIMIT_DT_REVERSE_FLG");
		// 入庫No.マージ区分
		Map<String, String> mergeClsMap = centerClassLogic.getClassMapByCd("MERGE_CLS");
		// 出荷停止フラグ
		Map<String, String> shippingStopMap = centerClassLogic.getClassMapByCd("SHIPPING_STOP_FLG");
		// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Add End

		for (WProductInput wProductInput : lstWProductInput) {
			MProduct mProduct = new MProduct();
			MProductShape mProductShape = new MProductShape();

			getErrorManager().clear();

			// 取込データのチェック処理を行う
			// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod Start
			// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
			// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu Start
			checkRegister(wProductInput, mProduct, mProductShape, lotManagMap, limitDtManagMap, limitDtReverseMap
					, mergeClsMap, shippingStopMap, productCdSet, janCdSet, errSts);
			// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu End
			// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
			// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wProductInput, getErrorManager());
				wProductInputBhv.update(wProductInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// 商品マスタ登録処理を行う
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
			//productMasterInsertLogic.insert(mProduct, mProductShape, mProductShape.getMShape(), errSts);
			productMasterInsertLogic.insert(mProduct, mProductShape, errSts);
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wProductInput, getErrorManager());
				wProductInputBhv.update(wProductInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wProductInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wProductInputBhv.update(wProductInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、次のチェックを行う。
	 *・荷主マスタ存在チェック
	 *・パラメータマスタ存在チェック
	 *・荷主センタマスタ存在チェック
	 *・商品マスタ存在チェック
	 *・商品CD項目チェック
	 *・商品名称項目チェック
	 *・商品略称項目チェック
	 *・ロット管理フラグ項目チェック
	 *・ロット管理フラグ区分値明細マスタ存在チェック
	 *・期限日管理フラグ項目チェック
	 *・期限日管理フラグ区分値明細マスタ存在チェック
	 *・入庫No.マージ区分項目チェック
	 *・入庫No.マージ区分区分値明細マスタ存在チェック
	 *・期限日逆転防止フラグ項目チェック
	 *・期限日逆転防止フラグ区分値明細マスタ存在チェック
	 *・出荷停止フラグ項目チェック
	 *・出荷停止フラグ区分値明細マスタ存在チェック
	 *・入荷期限日数項目チェック
	 *・出荷期限日数項目チェック
	 *・縦(mm)項目チェック
	 *・横(mm)項目チェック
	 *・高さ(mm)項目チェック
	 *・容積(mm3)項目チェック
	 *・商品重量(g)項目チェック
	 *・総重量(g)項目チェック
	 *・商品CD重複チェック
	 *・JANCD重複チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 引数の商品マスタに商品マスタ取込ワーク情報を設定する。
	 * 引数の商品荷姿マスタに商品マスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wProductInput 商品マスタ取込ワーク：全項目
	 * @param mProduct 商品マスタ
	 * @param mProductShape 商品荷姿マスタ
	 * @param lotManagMap ロット管理フラグ区分値明細マスタマップ
	 * @param limitDtManagMap 期限日管理フラグ区分値明細マスタマップ
	 * @param limitDtReverseMap 期限日逆転防止フラグ区分値明細マスタマップ
	 * @param mergeClsMap 入庫No.マージ区分区分値明細マスタマップ
	 * @param shippingStopMap 出荷停止フラグ区分値明細マスタマップ
	 * @param productCdSet 取込ファイル内商品CD重複チェック用セット
	 * @param janCdSet 取込ファイル内ソースCD重複チェック用セット
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod Start
	// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
	// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu Start
	public void checkRegister(WProductInput wProductInput, MProduct mProduct, MProductShape mProductShape
			, Map<String, String> lotManagMap, Map<String, String> limitDtManagMap, Map<String, String> limitDtReverseMap
			, Map<String, String> mergeClsMap, Map<String, String> shippingStopMap, Set<String> productCdSet, Set<String> janCdSet, ErrorStatus errSts) {
	// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu End
	// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
	// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod End

		wProductInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wProductInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// 荷主CD項目チェック
		if (CU.isNullOrEmpty(wProductInput.getClientCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
		} else {
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", wProductInput.getClientCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,5}$", wProductInput.getClientCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = wProductInput.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		} else {
			mProduct.setClientId(mClient.getClientId());
		}

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// ===== 荷姿Cd取得と荷姿ID設定 =====
//		if (mClient != null && !CU.isNullOrEmpty(wProductInput.getShapeCd())) {
//			MShape mShape = new MShape();
//			mShape.setClientId(mClient.getClientId());
//			mShape.setShapeCd(wProductInput.getShapeCd());
//			mShape = shapeLogic.getPkEntityWithDeletedCheck(mShape);
//			if (mShape == null) {
//				getErrorManager().add(errSts, WmsMessageConst.SHAPE_NOT_FOUND_ERROR);
//			} else {
//				mProductShape.setShapeId(mShape.getShapeId());
//				mProductShape.setMShape(mShape);
//			}
//		}
		if (mClient != null) {

			OptionalEntity<MClientCenter> optMClientCenter = mClientCenterBhv.selectByUniqueOf(
					mClient.getClientId(), Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));

			if (!optMClientCenter.isPresent()) {
				// [Ver3.0] unit of measure対応 2017.12.21 NING Del
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
			}

		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// 項目チェック
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 商品CD
		if (CU.isNullOrEmpty(wProductInput.getProductCd())) {
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
		} else {
			if (!checkExcelCellInput("^[!-~]*$", wProductInput.getProductCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", wProductInput.getProductCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR);
			}
			if (productCdSet.contains(wProductInput.getProductCd())) {
				// 取込ファイル内重複エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CODE_DUPLICATE_ERROR);
			} else {
				// 取込ファイル内商品CD重複チェック用リストに追加
				productCdSet.add(wProductInput.getProductCd());
			}
		}
		// 商品名称
		if (CU.isNullOrEmpty(wProductInput.getProductNm())) {
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NM_NOT_INPUT_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
		} else {
			if (!checkExcelCellInput(".{1,50}$", wProductInput.getProductNm())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NM_CHECK_INPUT_MAX_ERROR);
			}
		}
		// 商品略称
		if (CU.isNullOrEmpty(wProductInput.getProductAbbr())) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_ABBR_NOT_INPUT_ERROR);
		} else {
			if (!checkExcelCellInput(".{1,35}$", wProductInput.getProductAbbr())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_ABBR_CHECK_INPUT_MAX_ERROR);
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// ソースCD
		if (!CU.isNullOrEmpty(wProductInput.getJanCd())) {
			if (!checkExcelCellInput("^[!-~]*$", wProductInput.getJanCd())) {
				// [#687] ソースCD チェック内容間違いを修正 2017.01.24 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.JAN_CD_CHECK_NUMERIC_ONLY_ERROR);
			}
			if (30 < wProductInput.getJanCd().length()) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.JAN_CD_CHECK_INPUT_MAX_ERROR);
			}
			if (janCdSet.contains(wProductInput.getJanCd())) {
				// 取込ファイル内重複エラー
				getErrorManager().add(errSts, WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
			} else {
				// 取込ファイル内JANCD重複チェック用リストに追加
				janCdSet.add(wProductInput.getJanCd());
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End
		// ロット管理フラグ
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod Start
		if (CU.isNullOrEmpty(wProductInput.getLotManagFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.LOT_MANAG_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!lotManagMap.containsKey(wProductInput.getLotManagFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.LOT_MANAG_FLG_NOT_FOUND_ERROR);
			}
		}
		// [Ver3.0][#4502] 不要なエラーチェックを削除 2018.04.27 shimizu
		// 期限日管理フラグ
		if (CU.isNullOrEmpty(wProductInput.getLimitDtManagFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_MANAG_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!limitDtManagMap.containsKey(wProductInput.getLimitDtManagFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_MANAG_FLG_NOT_FOUND_ERROR);
			}
		}
		// [Ver3.0][#4472] 入荷期限日数・出荷期限日数の不要なチェック処理を削除 2018.04.23 shimizu
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 入荷期限日数
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getReceiveLimitNum())) {
			String receiveLimitNum = wProductInput.getReceiveLimitNum();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (CU.equals(wProductInput.getLimitDtManagFlg(), "0")) {
				// 入力エラー
				getErrorManager().add(errSts, WmsMessageConst.RECEIVE_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR);
			} else if (CU.equals(wProductInput.getLimitDtManagFlg(), "1")) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", receiveLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 文字種エラー
					getErrorManager().add(errSts, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR);
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", receiveLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数5桁以内
					getErrorManager().add(errSts, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "5");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?\\d+$", receiveLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数0桁以内
					getErrorManager().add(errSts, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR);
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (Long.valueOf(receiveLimitNum).longValue() < 0) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 最小0以上
					getErrorManager().add(errSts, WmsMessageConst.RECEIVE_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
				}
			} else {}
		}
		// 出荷期限日数
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getShippingLimitNum())) {
			String shippingLimitNum = wProductInput.getShippingLimitNum();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (CU.equals(wProductInput.getLimitDtManagFlg(), "0")) {
				// 入力エラー
				getErrorManager().add(errSts, WmsMessageConst.SHIPPING_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR);
			} else if (CU.equals(wProductInput.getLimitDtManagFlg(), "1")) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", shippingLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 文字種エラー
					getErrorManager().add(errSts, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR);
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", shippingLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 整数5桁以内
					getErrorManager().add(errSts, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "5");
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (!checkExcelCellInput("^(-)?\\d+$", shippingLimitNum)) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 小数0桁以内
					getErrorManager().add(errSts, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR);
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				} else if (Long.valueOf(shippingLimitNum).longValue() < 0) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
					// 最小0以上
					getErrorManager().add(errSts, WmsMessageConst.SHIPPING_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
				}
			} else {}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End
		// 入庫No.マージ区分
		if (CU.isNullOrEmpty(wProductInput.getMergeCls())) {
			getErrorManager().add(errSts, WmsMessageConst.MERGE_CLS_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!mergeClsMap.containsKey(wProductInput.getMergeCls())) {
				getErrorManager().add(errSts, WmsMessageConst.MERGE_CLS_NOT_FOUND_ERROR);
			}
		}
		// 期限日逆転防止フラグ
		if (CU.isNullOrEmpty(wProductInput.getLimitDtReverseFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!limitDtReverseMap.containsKey(wProductInput.getLimitDtReverseFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod End
		// 期限日管理フラグ、期限日逆転防止フラグ
		if (!CU.isNullOrEmpty(wProductInput.getLimitDtManagFlg()) &&
				!CU.isNullOrEmpty(wProductInput.getLimitDtReverseFlg())) {
			if (wProductInput.getLimitDtManagFlg().equals("0") && !wProductInput.getLimitDtReverseFlg().equals("0")) {
				getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_REVERSE_FLG_CHECK_NO_MANAG_ERROR);
			}
		}
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod Start
		// 出荷停止フラグ
		if (CU.isNullOrEmpty(wProductInput.getShippingStopFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.SHIPPING_STOP_FLG_NOT_INPUT_ERROR);
		} else {
			// 出荷停止フラグ区分値明細マスタ存在チェック
			if (!shippingStopMap.containsKey(wProductInput.getShippingStopFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.SHIPPING_STOP_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3621][Ver3.0] 初期データ取込 - 商品マスタ取込異常 2018.03.13 honma Mod End
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// 定点
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getFixedPoint())) {
			String fixedPoint = wProductInput.getFixedPoint();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", fixedPoint)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.FIXED_POINT_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", fixedPoint)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数7桁以内
				getErrorManager().add(errSts, WmsMessageConst.FIXED_POINT_CHECK_INPUT_INTEGER_LENGTH_ERROR, "7");
				// [#4014][Ver3.0] 商品マスタ一括取込 - 「定点」エラーチェック不正 2018.04.09 honma Mod Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", fixedPoint)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.FIXED_POINT_CHECK_INPUT_DECIMAL_LENGTH_ERROR, "3");
				// [#4014][Ver3.0] 商品マスタ一括取込 - 「定点」エラーチェック不正 2018.04.09 honma Mod End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(fixedPoint)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.FIXED_POINT_CHECK_INPUT_MIN_ERROR);
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//		// 荷姿CD
//		if (CU.isNullOrEmpty(wProductInput.getShapeCd())) {
//			getErrorManager().add(errSts, WmsMessageConst.SHAPE_CLASS_NOT_INPUT_ERROR);
//		} else {
//			// 入数
//			if (wProductInput.getUnitNum() == null) {
//				getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_NOT_INPUT_ERROR);
//			} else {
//				if (wProductInput.getUnitNum() < 0) {
//					getErrorManager().add(errSts, WmsMessageConst.UNIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
//				}
//			}
//		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
		// [Ver3.0][#3630] 小数有無フラグに関係なく小数を許容するよう変更 2018.02.19 shimizu Start
		// 縦(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getLength())) {
			String length = wProductInput.getLength();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", length)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.LENGTH_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", length)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.LENGTH_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", length)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.LENGTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(length)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.LENGTH_CHECK_INPUT_MIN_ERROR);
			}
		}
		// 横(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getWidth())) {
			String width = wProductInput.getWidth();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(width)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.WIDTH_CHECK_INPUT_MIN_ERROR);
			}
		}
		// 高さ(mm)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getHeight())) {
			String height = wProductInput.getHeight();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", height)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.HEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", height)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.HEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", height)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.HEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(height)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.HEIGHT_CHECK_INPUT_MIN_ERROR);
			}
		}
		// 容積(mm3)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getVolume())) {
			String volume = wProductInput.getVolume();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", volume)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.VOLUME_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", volume)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.VOLUME_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", volume)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.VOLUME_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(volume)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.VOLUME_CHECK_INPUT_MIN_ERROR);
			}
		}
		// 商品重量(g)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getNetWeight())) {
			String netWeight = wProductInput.getNetWeight();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(netWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.NET_WEIGHT_CHECK_INPUT_MIN_ERROR);
			}
		}
		// 総重量(g)
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wProductInput.getGrossWeight())) {
			String grossWeight = wProductInput.getGrossWeight();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数10桁以内
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR, "10");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数3桁以内
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(grossWeight)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.GROSS_WEIGHT_CHECK_INPUT_MIN_ERROR);
			}
		}
		// [Ver3.0][#3630] 小数有無フラグに関係なく小数を許容するよう変更 2018.02.19 shimizu End
		// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End

		// 商品CDDB重複チェック
		if (!CU.isNullOrEmpty(wProductInput.getProductCd())) {
			mProduct.setProductCd(wProductInput.getProductCd());
			productLogic.checkProductCdInsert(mProduct, errSts);
		}

		// JANCDDB重複チェック
		if (!CU.isNullOrEmpty(wProductInput.getJanCd())) {
			mProduct.setJanCd(wProductInput.getJanCd());
			productLogic.checkJanCdInsert(mProduct, errSts);
		}

		if (getErrorManager().size() > 0) {
			return;
		}
		// [Ver3.0] unit of measure対応 2017.12.21 NING Start
		String shapeGrpCd = wProductInput.getShapeGrpCd();
		// 商品マスタ受信テーブル．荷姿グループCDが指定されない場合、荷主マスタと紐づく荷姿グループCDを利用する
		if (CU.isNullOrEmpty(wProductInput.getShapeGrpCd())) {
			// 既存荷主マスタ取得
			MClient existedClient = clientLogic.getEntityWithShapeGrp(mClient, errSts);
			if (existedClient == null) {
				// 荷姿グループCDが荷姿グループマスタに存在しない場合、エラーにする
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_DEFAULT_SHAPE_GROUP_NOT_INPUT_ERROR);
				return;
			}
			shapeGrpCd = existedClient.getMShapeGrp().getShapeGrpCd();
			// 商品マスタに荷姿グループID設定
			mProduct.setShapeGrpId(existedClient.getMShapeGrp().getShapeGrpId());
		}

		// 既存荷姿グループを選択する。
		MShapeGrp existedShapeGrp = shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mClient.getClientId(), shapeGrpCd);
		if (existedShapeGrp != null) {
			// 商品マスタに荷姿グループID設定
			mProduct.setShapeGrpId(existedShapeGrp.getShapeGrpId());
		} else {
			// 荷姿グループCDが荷姿グループマスタに存在しない場合、エラーにする
			getErrorManager().add(errSts, WmsMessageConst.SHAPE_GROUP_NOT_FOUND_ERROR);
			return;
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		// 在庫最小単位の荷姿グループ明細設定
		// 既存荷姿グループ詳細を選択する。
		ListResultBean<MShapeGrpDtl> existedShapeGrpDtls = shapeGroupMasterSelectLogic.selectDtlByClientCdAndProductCd(mClient.getClientCd(), shapeGrpCd);
		MShapeGrpDtl existedShapeGrpDtl = null;
		if (existedShapeGrpDtls != null && existedShapeGrpDtls.size() > 0) {
			existedShapeGrpDtl = existedShapeGrpDtls.get(0);
			// 在庫最小単位の荷姿グループ明細IDを格納する。
			mProductShape.setShapeGrpDtlId(existedShapeGrpDtl.getShapeGrpDtlId());
		}
		// [Ver3.0] unit of measure対応 2017.12.21 NING End

		mProduct.setProductNm(wProductInput.getProductNm());
		mProduct.setProductAbbr(wProductInput.getProductAbbr());
		mProduct.setLotManagFlg(wProductInput.getLotManagFlg());
		mProduct.setLimitDtManagFlg(wProductInput.getLimitDtManagFlg());
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mProduct.setReceiveLimitNum(WCU.stringToLong(wProductInput.getReceiveLimitNum()));
		mProduct.setShippingLimitNum(WCU.stringToLong(wProductInput.getShippingLimitNum()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		mProduct.setMergeCls(wProductInput.getMergeCls());
		mProduct.setLotReverseFlg(wProductInput.getLotReverseFlg());
		mProduct.setLimitDtReverseFlg(wProductInput.getLimitDtReverseFlg());
		mProduct.setShippingStopFlg(wProductInput.getShippingStopFlg());
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		// [ON推-品向-957] 定点を追加 2015.10.06 kawana Start
		mProduct.setFixedPoint(WCU.stringToBigDecimal(wProductInput.getFixedPoint()));
		// [ON推-品向-957] 定点を追加 2015.10.06 kawana End
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		//mProductShape.setUnitNum(wProductInput.getUnitNum());
		mProductShape.setUnitNum(0L);
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mProductShape.setLength(WCU.stringToBigDecimal(wProductInput.getLength()));
		mProductShape.setWidth(WCU.stringToBigDecimal(wProductInput.getWidth()));
		mProductShape.setHeight(WCU.stringToBigDecimal(wProductInput.getHeight()));
		mProductShape.setVolume(WCU.stringToBigDecimal(wProductInput.getVolume()));
		mProductShape.setNetWeight(WCU.stringToBigDecimal(wProductInput.getNetWeight()));
		mProductShape.setGrossWeight(WCU.stringToBigDecimal(wProductInput.getGrossWeight()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
	}

	/**
	 * <h2>商品マスタテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 移行が全削除後追記の場合、商品荷姿マスタと商品マスタを事前にに削除する。
	 * 商品荷姿マスタと商品マスタを削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>商品マスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 移行が全削除後追記の場合、商品荷姿マスタと商品マスタは事前にに削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		//「商品荷姿マスタ」テーブルを全件削除する
		try {
			MProductShapeCB mProductShapeCB = mProductShapeBhv.newConditionBean();
			mProductShapeBhv.varyingQueryDelete(mProductShapeCB, op -> op.allowNonQueryDelete());
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

		//「商品マスタ」テーブルを全件削除する
		try {
			MProductCB mProductCB = mProductBhv.newConditionBean();
			mProductBhv.varyingQueryDelete(mProductCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add End
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mProductBhv.asTableDbName().toUpperCase());
			return;
		}
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
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
	// [Ver3.0] unit of measure対応 2017.12.21 NING End
}

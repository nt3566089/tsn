package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WProductInputCB;
import com.oneslogi.base.dbflute.exbhv.WProductInputBhv;
import com.oneslogi.base.dbflute.exentity.WProductInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 商品マスタ取込ロジッククラス
 */
public class ProductInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WProductInputBhv wProductInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductInputSubLogic productInputSubLogic;

	/**
	 * <h2>商品マスタ取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」を取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<WProductInput> 商品マスタ取込ワークリスト
	 */
	public List<WProductInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WProductInputCB wProductInputCB = wProductInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wProductInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wProductInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wProductInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wProductInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wProductInputCB.query().addOrderBy_LineNo_Asc();

		List<WProductInput> lstWProductInput = wProductInputBhv.selectList(wProductInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWProductInput.size() == 0) {
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana End
			return null;
		}

		return lstWProductInput;
	}

	/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// 使わなくなったのでコメントアウト
//	/**
//	 * <h2>商品マスタ取込のワーク取込処理</h2>
//	 * <pre>
//	 * 取込データを商品マスタ取込ワークテーブルに登録する
//	 * ・上書きの場合、事前に削除
//	 *
//	 * 【登録テーブル】
//	 * ・商品マスタ取込ワーク
//	 * </pre>
//	 * @param dataInputDto 初期データ取込DTO
//	 * @param lstWProductInputAll 商品マスタ取込ワークリスト
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 */
//	public void registerWork(DataInputDto dataInputDto, List<WProductInput> lstWProductInputAll, ErrorStatus errSts) {
//		startLog(WmsMessageConst.PRODUCT_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
//
//		for (int i = 0; i < lstWProductInputAll.size(); i++) {
//			WProductInput wProductInput = lstWProductInputAll.get(i);
//
//			// 行Noの設定
//			wProductInput.setLineNo((long)(i + 1));
//			// エラーフラグの設定
//			if (CU.isNullOrEmpty(wProductInput.getErrorFlg())) {
//				wProductInput.setErrorFlg(CDef.ErrorFlg.$0.code());
//			}
//		}
//
//		// 上書きの場合、事前に削除
//		if (dataInputDto.isRewrite()) {
//			// 商品マスタ取込ワークテーブルの削除
//			productInputSubLogic.deleteWorkWithCommit(errSts);
//		}
//
//		// 一括コミットの場合
//		if (dataInputDto.isCommitAll()) {
//			productInputSubLogic.registerWork(dataInputDto, lstWProductInputAll, errSts);
//		}
//		// 随時コミットの場合
//		List<WProductInput> lstWProductInput = new ArrayList<WProductInput>();
//		if (dataInputDto.isCommitBlock()) {
//			for (WProductInput wProductInput : lstWProductInputAll) {
//				lstWProductInput.add(wProductInput);
//				if (dataInputDto.isOverCommitUnitNum(lstWProductInput.size())) {
//					productInputSubLogic.registerWorkWithCommit(dataInputDto, lstWProductInput, errSts);
//					lstWProductInput = new ArrayList<WProductInput>();
//				}
//			}
//			if (lstWProductInput.size() > 0) {
//				productInputSubLogic.registerWorkWithCommit(dataInputDto, lstWProductInput, errSts);
//			}
//		}
//
//		// ログ追加
//		endLog(dataInputDto);
//	}
	/* 2015/09/24 INOUE DELETE END */

	/**
	 * <h2>商品マスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、商品マスタに登録する。
	 * 上書きの場合、事前に商品マスタを削除する。
	 * 一括コミットの場合、登録後一括コミットする。
	 * 随時コミットの場合、登録の随時コミットする。
	 * 実行結果とエラーはログに書き込む。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：初期データ取込方法･コミット区分
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		startLog(WmsMessageConst.PRODUCT_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 商品マスタ取込ワークテーブルから移行データの取得
		List<WProductInput> lstWProductInputAll = selectWork(dataInputDto, errSts);
		List<WProductInput> lstWProductInput = new ArrayList<WProductInput>();

		if (getErrorManager().size() > 0) {
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
			endErrorLog();
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
			return;
		}

		dataInputDto.initProcess(lstWProductInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 在庫系テーブルの削除
			productInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
				endErrorLog();
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
				return;
			}
		}

		// 商品マスタ登録を呼出す、商品マスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			productInputSubLogic.register(dataInputDto, lstWProductInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WProductInput wProductInput : lstWProductInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWProductInput.add(wProductInput);
				if (dataInputDto.isOverCommitUnitNum(lstWProductInput.size())) {
					productInputSubLogic.registerWithCommit(dataInputDto, lstWProductInput, errSts);
					lstWProductInput = new ArrayList<WProductInput>();
				}
			}
			if (lstWProductInput.size() > 0) {
				productInputSubLogic.registerWithCommit(dataInputDto, lstWProductInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

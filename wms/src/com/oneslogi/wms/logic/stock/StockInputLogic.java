package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WStockInputCB;
import com.oneslogi.base.dbflute.exbhv.WStockInputBhv;
import com.oneslogi.base.dbflute.exentity.WStockInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 在庫データ取込ロジッククラス
 */
public class StockInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WStockInputBhv wStockInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private StockInputSubLogic stockInputSubLogic;

	/**
	 * <h2>在庫取込ワークテーブルより移行対象データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」の条件でデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象（全件、未処理のみ、エラーのみ）
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<WStockInput> 在庫取込ワークリスト
	 */
	public List<WStockInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WStockInputCB wStockInputCB = wStockInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wStockInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wStockInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wStockInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wStockInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wStockInputCB.query().addOrderBy_LineNo_Asc();

		List<WStockInput> lstWStockInput = wStockInputBhv.selectList(wStockInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWStockInput.size() == 0) {
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana End
			return null;
		}

		return lstWStockInput;
	}

	/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// 使わなくなったのでコメントアウト
//	/**
//	 * <h2>在庫データ取込のワーク取込処理</h2>
//	 * <pre>
//	 * 取込データを在庫取込ワークテーブルに登録する
//	 * ・上書きの場合、事前に削除
//	 *
//	 * 【登録テーブル】
//	 * ・在庫取込ワーク
//	 * </pre>
//	 * @param dataInputDto 初期データ取込DTO
//	 * @param lstWStockInputAll 在庫取込ワークリスト
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 */
//	public void registerWork(DataInputDto dataInputDto, List<WStockInput> lstWStockInputAll, ErrorStatus errSts) {
//		startLog(WmsMessageConst.STOCK_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
//
//		for (int i = 0; i < lstWStockInputAll.size(); i++) {
//			WStockInput wStockInput = lstWStockInputAll.get(i);
//
//			// 行Noの設定
//			wStockInput.setLineNo((long)(i + 1));
//			// エラーフラグの設定
//			if (CU.isNullOrEmpty(wStockInput.getErrorFlg())) {
//				wStockInput.setErrorFlg(CDef.ErrorFlg.$0.code());
//			}
//		}
//
//		// 上書きの場合、事前に削除
//		if (dataInputDto.isRewrite()) {
//			// 在庫取込ワークテーブルの削除
//			stockInputSubLogic.deleteWorkWithCommit(errSts);
//		}
//
//		// 一括コミットの場合
//		if (dataInputDto.isCommitAll()) {
//			stockInputSubLogic.registerWork(dataInputDto, lstWStockInputAll, errSts);
//		}
//		// 随時コミットの場合
//		List<WStockInput> lstWStockInput = new ArrayList<WStockInput>();
//		if (dataInputDto.isCommitBlock()) {
//			for (WStockInput wStockInput : lstWStockInputAll) {
//				lstWStockInput.add(wStockInput);
//				if (dataInputDto.isOverCommitUnitNum(lstWStockInput.size())) {
//					stockInputSubLogic.registerWorkWithCommit(dataInputDto, lstWStockInput, errSts);
//					lstWStockInput = new ArrayList<WStockInput>();
//				}
//			}
//			if (lstWStockInput.size() > 0) {
//				stockInputSubLogic.registerWorkWithCommit(dataInputDto, lstWStockInput, errSts);
//			}
//		}
//
//		// ログ追加
//		endLog(dataInputDto);
//	}
	/* 2015/09/24 INOUE DELETE END */

	/**
	 * <h2>在庫データ取込のデータを移行する。</h2>
	 * <pre>
	 * 在庫取込ワークテーブルより在庫系のテーブルに移行する。
	 *
	 * 上書きの場合、事前に【在庫系テーブルの削除】を処理する。
	 * 一括コミットの場合、【在庫データ移行処理（コミットなし）】を処理する。
	 * 随時コミットの場合、【在庫データ移行処理（コミットあり）】を処理する。
	 *
	 * 【在庫系テーブルの削除】
	 * ・{@link StockInputSubLogic#deleteWithCommit(com.oneslogi.base.exception.ErrorManager.ErrorStatus) 削除メソッド}を呼び出す。
	 *
	 * 【在庫データ移行処理（コミットなし）】
	 * ・{@link StockInputSubLogic#register(DataInputDto, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 登録（コミットなし）メソッド}を呼び出す。
	 *
	 * 【在庫データ移行処理（コミットあり）】
	 * ・{@link StockInputSubLogic#registerWithCommit(DataInputDto, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 登録（コミットあり）メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception 例外処理
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		startLog(WmsMessageConst.STOCK_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 在庫取込ワークテーブルから移行データの取得
		List<WStockInput> lstWStockInputAll = selectWork(dataInputDto, errSts);
		List<WStockInput> lstWStockInput = new ArrayList<WStockInput>();

		if (getErrorManager().size() > 0) {
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
			endErrorLog();
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
			return;
		}

		dataInputDto.initProcess(lstWStockInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 在庫系テーブルの削除
			stockInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
				endErrorLog();
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
				return;
			}
		}

		// 在庫調整を呼出す、在庫移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			stockInputSubLogic.register(dataInputDto, lstWStockInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WStockInput wStockInput : lstWStockInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWStockInput.add(wStockInput);
				if (dataInputDto.isOverCommitUnitNum(lstWStockInput.size())) {
					stockInputSubLogic.registerWithCommit(dataInputDto, lstWStockInput, errSts);
					lstWStockInput = new ArrayList<WStockInput>();
				}
			}
			if (lstWStockInput.size() > 0) {
				stockInputSubLogic.registerWithCommit(dataInputDto, lstWStockInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

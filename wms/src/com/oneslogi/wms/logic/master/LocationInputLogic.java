package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WLocationInputCB;
import com.oneslogi.base.dbflute.exbhv.WLocationInputBhv;
import com.oneslogi.base.dbflute.exentity.WLocationInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * ロケーションマスタ取込ロジッククラス
 */
public class LocationInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WLocationInputBhv wLocationInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private LocationInputSubLogic locationInputSubLogic;

	/**
	 * <h2>ロケーションマスタ取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」を条件で取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<WLocationInput> ロケーションマスタ取込ワークリスト
	 */
	public List<WLocationInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WLocationInputCB wLocationInputCB = wLocationInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wLocationInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wLocationInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wLocationInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wLocationInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wLocationInputCB.query().addOrderBy_LineNo_Asc();

		List<WLocationInput> lstWLocationInput = wLocationInputBhv.selectList(wLocationInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWLocationInput.size() == 0) {
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana End
			return null;
		}

		return lstWLocationInput;
	}

	/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// 使わなくなったのでコメントアウト
//	/**
//	 * <h2>ロケーションマスタ取込のワーク取込処理</h2>
//	 * <pre>
//	 * 取込データをロケーションマスタ取込ワークテーブルに登録する
//	 * ・上書きの場合、事前に削除
//	 *
//	 * 【登録テーブル】
//	 * ・ロケーションマスタ取込ワーク
//	 * </pre>
//	 * @param dataInputDto 初期データ取込DTO
//	 * @param lstWLocationInputAll ロケーションマスタ取込ワークリスト
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 */
//	public void registerWork(DataInputDto dataInputDto, List<WLocationInput> lstWLocationInputAll, ErrorStatus errSts) {
//		startLog(WmsMessageConst.LOCATION_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
//
//		for (int i = 0; i < lstWLocationInputAll.size(); i++) {
//			WLocationInput wLocationInput = lstWLocationInputAll.get(i);
//
//			// 行Noの設定
//			wLocationInput.setLineNo((long)(i + 1));
//			// エラーフラグの設定
//			if (CU.isNullOrEmpty(wLocationInput.getErrorFlg())) {
//				wLocationInput.setErrorFlg(CDef.ErrorFlg.$0.code());
//			}
//		}
//
//		// 上書きの場合、事前に削除
//		if (dataInputDto.isRewrite()) {
//			// ロケーションマスタ取込ワークテーブルの削除
//			locationInputSubLogic.deleteWorkWithCommit(errSts);
//		}
//
//		// 一括コミットの場合
//		if (dataInputDto.isCommitAll()) {
//			locationInputSubLogic.registerWork(dataInputDto, lstWLocationInputAll, errSts);
//		}
//		// 随時コミットの場合
//		List<WLocationInput> lstWLocationInput = new ArrayList<WLocationInput>();
//		if (dataInputDto.isCommitBlock()) {
//			for (WLocationInput wLocationInput : lstWLocationInputAll) {
//				lstWLocationInput.add(wLocationInput);
//				if (dataInputDto.isOverCommitUnitNum(lstWLocationInput.size())) {
//					locationInputSubLogic.registerWorkWithCommit(dataInputDto, lstWLocationInput, errSts);
//					lstWLocationInput = new ArrayList<WLocationInput>();
//				}
//			}
//			if (lstWLocationInput.size() > 0) {
//				locationInputSubLogic.registerWorkWithCommit(dataInputDto, lstWLocationInput, errSts);
//			}
//		}
//
//		// ログ追加
//		endLog(dataInputDto);
//	}
	/* 2015/09/24 INOUE DELETE END */

	/**
	 * <h2>ロケーションマスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、ロケーションマスタに登録する。
	 * 上書きの場合、事前にロケーションマスタを削除する。
	 * 一括コミットの場合、登録後一括コミットする。
	 * 随時コミットの場合、登録の随時コミットする。
	 * 実行結果とエラーはログに書き込む。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：初期データ取込方法･コミット区分
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		startLog(WmsMessageConst.LOCATION_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// ロケーションマスタ取込ワークテーブルから移行データの取得
		List<WLocationInput> lstWLocationInputAll = selectWork(dataInputDto, errSts);
		List<WLocationInput> lstWLocationInput = new ArrayList<WLocationInput>();

		if (getErrorManager().size() > 0) {
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
			endErrorLog();
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
			return;
		}

		dataInputDto.initProcess(lstWLocationInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 在庫系テーブルの削除
			locationInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
				endErrorLog();
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
				return;
			}
		}

		// ロケーションマスタ登録を呼出す、ロケーションマスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			locationInputSubLogic.register(dataInputDto, lstWLocationInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WLocationInput wLocationInput : lstWLocationInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWLocationInput.add(wLocationInput);
				if (dataInputDto.isOverCommitUnitNum(lstWLocationInput.size())) {
					locationInputSubLogic.registerWithCommit(dataInputDto, lstWLocationInput, errSts);
					lstWLocationInput = new ArrayList<WLocationInput>();
				}
			}
			if (lstWLocationInput.size() > 0) {
				locationInputSubLogic.registerWithCommit(dataInputDto, lstWLocationInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

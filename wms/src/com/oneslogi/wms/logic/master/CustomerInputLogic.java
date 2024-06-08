package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WCustomerInputCB;
import com.oneslogi.base.dbflute.exbhv.WCustomerInputBhv;
import com.oneslogi.base.dbflute.exentity.WCustomerInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 取引先マスタ取込ロジッククラス
 */
public class CustomerInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WCustomerInputBhv wCustomerInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private CustomerInputSubLogic customerInputSubLogic;

	/**
	 * <h2>取引先マスタ取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」の条件でデータを取得する。
	 * 取込対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<WCustomerInput> 取引先マスタ取込ワークリスト
	 */
	public List<WCustomerInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WCustomerInputCB wCustomerInputCB = wCustomerInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wCustomerInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wCustomerInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wCustomerInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wCustomerInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wCustomerInputCB.query().addOrderBy_LineNo_Asc();

		List<WCustomerInput> lstWCustomerInput = wCustomerInputBhv.selectList(wCustomerInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWCustomerInput.size() == 0) {
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana Start
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [ON推-品向-911] データがない場合のエラーメッセージを変更 2015.07.24 kawana End
			return null;
		}

		return lstWCustomerInput;
	}

	/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// 使わなくなったのでコメントアウト
//	/**
//	 * <h2>取引先マスタ取込のワーク取込処理</h2>
//	 * <pre>
//	 * 取込データを取引先マスタ取込ワークテーブルに登録する
//	 * ・上書きの場合、事前に削除
//	 *
//	 * 【登録テーブル】
//	 * ・取引先マスタ取込ワーク
//	 * </pre>
//	 * @param dataInputDto 初期データ取込DTO
//	 * @param lstWCustomerInputAll 取引先マスタ取込ワークリスト
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 */
//	public void registerWork(DataInputDto dataInputDto, List<WCustomerInput> lstWCustomerInputAll, ErrorStatus errSts) {
//		startLog(WmsMessageConst.CUSTOMER_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
//
//		for (int i = 0; i < lstWCustomerInputAll.size(); i++) {
//			WCustomerInput wCustomerInput = lstWCustomerInputAll.get(i);
//
//			// 行Noの設定
//			wCustomerInput.setLineNo((long)(i + 1));
//			// エラーフラグの設定
//			if (CU.isNullOrEmpty(wCustomerInput.getErrorFlg())) {
//				wCustomerInput.setErrorFlg(CDef.ErrorFlg.$0.code());
//			}
//		}
//
//		// 上書きの場合、事前に削除
//		if (dataInputDto.isRewrite()) {
//			// 取引先マスタ取込ワークテーブルの削除
//			customerInputSubLogic.deleteWorkWithCommit(errSts);
//		}
//
//		// 一括コミットの場合
//		if (dataInputDto.isCommitAll()) {
//			customerInputSubLogic.registerWork(dataInputDto, lstWCustomerInputAll, errSts);
//		}
//		// 随時コミットの場合
//		List<WCustomerInput> lstWCustomerInput = new ArrayList<WCustomerInput>();
//		if (dataInputDto.isCommitBlock()) {
//			for (WCustomerInput wCustomerInput : lstWCustomerInputAll) {
//				lstWCustomerInput.add(wCustomerInput);
//				if (dataInputDto.isOverCommitUnitNum(lstWCustomerInput.size())) {
//					customerInputSubLogic.registerWorkWithCommit(dataInputDto, lstWCustomerInput, errSts);
//					lstWCustomerInput = new ArrayList<WCustomerInput>();
//				}
//			}
//			if (lstWCustomerInput.size() > 0) {
//				customerInputSubLogic.registerWorkWithCommit(dataInputDto, lstWCustomerInput, errSts);
//			}
//		}
//
//		// ログ追加
//		endLog(dataInputDto);
//	}
	/* 2015/09/24 INOUE DELETE END */

	/**
	 * <h2>取引先マスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、取引先マスタに登録する。
	 * 上書きの場合、事前に取引先マスタを削除する。
	 * 一括コミットの場合、登録後一括コミットする。
	 * 随時コミットの場合、登録の随時コミットする。
	 * 実行結果とエラーはログに追加する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：初期データ取込方法･コミット区分
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		startLog(WmsMessageConst.CUSTOMER_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 取引先マスタ取込ワークテーブルから移行データの取得
		List<WCustomerInput> lstWCustomerInputAll = selectWork(dataInputDto, errSts);
		List<WCustomerInput> lstWCustomerInput = new ArrayList<WCustomerInput>();

		if (getErrorManager().size() > 0) {
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
			endErrorLog();
			// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
			return;
		}

		dataInputDto.initProcess(lstWCustomerInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 在庫系テーブルの削除
			customerInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start
				endErrorLog();
				// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
				return;
			}
		}

		// 取引先マスタ登録を呼出す、取引先マスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			customerInputSubLogic.register(dataInputDto, lstWCustomerInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WCustomerInput wCustomerInput : lstWCustomerInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWCustomerInput.add(wCustomerInput);
				if (dataInputDto.isOverCommitUnitNum(lstWCustomerInput.size())) {
					customerInputSubLogic.registerWithCommit(dataInputDto, lstWCustomerInput, errSts);
					lstWCustomerInput = new ArrayList<WCustomerInput>();
				}
			}
			if (lstWCustomerInput.size() > 0) {
				customerInputSubLogic.registerWithCommit(dataInputDto, lstWCustomerInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

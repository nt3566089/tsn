package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WZipInputCB;
import com.oneslogi.base.dbflute.exbhv.WZipInputBhv;
import com.oneslogi.base.dbflute.exentity.WZipInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 郵便番号マスタ取込ロジッククラス
 */
public class ZipInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WZipInputBhv wZipInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipInputSubLogic zipInputSubLogic;

	/**
	 * <h2>郵便番号マスタ取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」の条件でデータを取得する。
	 * 取込対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<WZipInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WZipInputCB wZipInputCB = wZipInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wZipInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wZipInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wZipInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wZipInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wZipInputCB.query().addOrderBy_LineNo_Asc();

		List<WZipInput> lstWZipInput = wZipInputBhv.selectList(wZipInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWZipInput.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return lstWZipInput;
	}

	/**
	 * <h2>郵便番号マスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、郵便番号マスタに登録する。
	 * 上書きの場合、事前に郵便番号マスタを削除する。
	 * 一括コミットの場合、登録後一括コミットする。
	 * 随時コミットの場合、登録の随時コミットする。
	 * 実行結果とエラーはログに追加する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：初期データ取込方法･コミット区分
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		startLog(WmsMessageConst.ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 郵便番号マスタ取込ワークテーブルから移行データの取得
		List<WZipInput> lstWZipInputAll = selectWork(dataInputDto, errSts);
		List<WZipInput> lstWZipInput = new ArrayList<WZipInput>();

		if (getErrorManager().size() > 0) {
			endErrorLog();
			return;
		}

		dataInputDto.initProcess(lstWZipInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 郵便番号マスタを全件削除
			zipInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				endErrorLog();
				return;
			}
		}

		// 郵便番号マスタ登録を呼出す、郵便番号マスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			zipInputSubLogic.register(dataInputDto, lstWZipInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WZipInput wZipInput : lstWZipInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWZipInput.add(wZipInput);
				if (dataInputDto.isOverCommitUnitNum(lstWZipInput.size())) {
					zipInputSubLogic.registerWithCommit(dataInputDto, lstWZipInput, errSts);
					lstWZipInput = new ArrayList<WZipInput>();
				}
			}
			if (lstWZipInput.size() > 0) {
				zipInputSubLogic.registerWithCommit(dataInputDto, lstWZipInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

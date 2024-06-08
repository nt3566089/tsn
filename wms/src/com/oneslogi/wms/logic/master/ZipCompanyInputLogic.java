package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WZipCompanyInputCB;
import com.oneslogi.base.dbflute.exbhv.WZipCompanyInputBhv;
import com.oneslogi.base.dbflute.exentity.WZipCompanyInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 郵便番号マスタ（大口事業所）取込ロジッククラス
 */
public class ZipCompanyInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WZipCompanyInputBhv wZipCompanyInputBhv;
	// ===== 使用ロジッククラス =====
	@Inject
	private ZipCompanyInputSubLogic zipCompanyInputSubLogic;

	/**
	 * <h2>郵便番号マスタ（大口事業所）取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」の条件でデータを取得する。
	 * 取込対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<WZipCompanyInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WZipCompanyInputCB wZipCompanyInputCB = wZipCompanyInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wZipCompanyInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wZipCompanyInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wZipCompanyInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wZipCompanyInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wZipCompanyInputCB.query().addOrderBy_LineNo_Asc();

		List<WZipCompanyInput> lstWZipCompanyInput = wZipCompanyInputBhv.selectList(wZipCompanyInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWZipCompanyInput.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return lstWZipCompanyInput;
	}

	/**
	 * <h2>郵便番号マスタ（大口事業所）取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、郵便番号マスタ（大口事業所）に登録する。
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
		startLog(WmsMessageConst.ZIP_COMPANY_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 郵便番号マスタ（大口事業所）取込ワークテーブルから移行データの取得
		List<WZipCompanyInput> lstWZipCompanyInputAll = selectWork(dataInputDto, errSts);
		List<WZipCompanyInput> lstWZipCompanyInput = new ArrayList<WZipCompanyInput>();

		if (getErrorManager().size() > 0) {
			endErrorLog();
			return;
		}

		dataInputDto.initProcess(lstWZipCompanyInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 郵便番号マスタを全件削除
			zipCompanyInputSubLogic.deleteWithCommit(errSts);
			if (getErrorManager().size() > 0) {
				endErrorLog();
				return;
			}
		}

		// 郵便番号マスタ(大口事業所)登録を呼出す、郵便番号マスタ(大口事業所)移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			zipCompanyInputSubLogic.register(dataInputDto, lstWZipCompanyInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WZipCompanyInput wZipCompanyInput : lstWZipCompanyInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWZipCompanyInput.add(wZipCompanyInput);
				if (dataInputDto.isOverCommitUnitNum(lstWZipCompanyInput.size())) {
					zipCompanyInputSubLogic.registerWithCommit(dataInputDto, lstWZipCompanyInput, errSts);
					lstWZipCompanyInput = new ArrayList<WZipCompanyInput>();
				}
			}
			if (lstWZipCompanyInput.size() > 0) {
				zipCompanyInputSubLogic.registerWithCommit(dataInputDto, lstWZipCompanyInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

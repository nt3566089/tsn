package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WCarrierZipInputCB;
import com.oneslogi.base.dbflute.exbhv.WCarrierZipInputBhv;
import com.oneslogi.base.dbflute.exentity.WCarrierZipInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 運送業者郵便番号マスタ取込ロジッククラス
 */
public class CarrierZipInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WCarrierZipInputBhv wCarrierZipInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierZipInputSubLogic carrierZipInputSubLogic;

	/**
	 * <h2>運送業者郵便番号マスタ取込ワークテーブルより移行データを取得する。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」の条件でデータを取得する。
	 * 取込対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<WCarrierZipInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WCarrierZipInputCB wCarrierZipInputCB = wCarrierZipInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wCarrierZipInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wCarrierZipInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wCarrierZipInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wCarrierZipInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wCarrierZipInputCB.query().addOrderBy_LineNo_Asc();

		List<WCarrierZipInput> lstWCarrierZipInput = wCarrierZipInputBhv.selectList(wCarrierZipInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWCarrierZipInput.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return lstWCarrierZipInput;
	}

	/**
	 * <h2>運送業者郵便番号マスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、運送業者郵便番号マスタに登録する。
	 * 全削除後追記の場合、事前に運送業者郵便番号マスタを削除する。
	 * 一括コミットの場合、登録後一括コミットする。
	 * 随時コミットの場合、登録の随時コミットする。
	 * 実行結果とエラーはログに追加する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：初期データ取込方法･コミット区分
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, ErrorStatus errSts) throws Exception {
		if(dataInputDto.data.dataInputTypeCd.equals("06")){
			startLog(WmsMessageConst.YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);
		}else if(dataInputDto.data.dataInputTypeCd.equals("07")){
			startLog(WmsMessageConst.JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);
		}
		// ヤマト着店マスタ取込ワークテーブルから移行データの取得
		List<WCarrierZipInput> lstWCarrierZipInputAll = selectWork(dataInputDto, errSts);
		List<WCarrierZipInput> lstWCarrierZipInput = new ArrayList<WCarrierZipInput>();

		if (getErrorManager().size() > 0) {
			endErrorLog();
			return;
		}

		dataInputDto.initProcess(lstWCarrierZipInputAll.size());

		// 全削除後追記の場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod Start
			// 運送業者郵便番号マスタを全件削除
			carrierZipInputSubLogic.deleteWithCommit(dataInputDto, lstWCarrierZipInputAll, errSts);
			// [#3870][Ver3.0] 初期データ取込 - 運送業者郵便番号マスタ全削除処理に削除条件を追加 2018.03.15 honma Mod End
			if (getErrorManager().size() > 0) {
				endErrorLog();
				return;
			}
		}

		// ヤマト着店マスタ登録を呼出す、ヤマト着店マスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			carrierZipInputSubLogic.register(dataInputDto, lstWCarrierZipInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WCarrierZipInput wCarrierZipInput : lstWCarrierZipInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWCarrierZipInput.add(wCarrierZipInput);
				if (dataInputDto.isOverCommitUnitNum(lstWCarrierZipInput.size())) {
					carrierZipInputSubLogic.registerWithCommit(dataInputDto, lstWCarrierZipInput, errSts);
					lstWCarrierZipInput = new ArrayList<WCarrierZipInput>();
				}
			}
			if (lstWCarrierZipInput.size() > 0) {
				carrierZipInputSubLogic.registerWithCommit(dataInputDto, lstWCarrierZipInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}

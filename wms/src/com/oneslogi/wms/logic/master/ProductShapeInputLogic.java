package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.WProductShapeInputCB;
import com.oneslogi.base.dbflute.exbhv.WProductShapeInputBhv;
import com.oneslogi.base.dbflute.exentity.WProductShapeInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.DataInputLogic;

/**
 * 商品荷姿マスタ取込ロジッククラス
 */
public class ProductShapeInputLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private WProductShapeInputBhv wProductShapeInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductShapeInputSubLogic productShapeInputSubLogic;

	/**
	 * <h2>商品荷姿マスタ取込ワークテーブルより移行データの取得処理。</h2>
	 * <pre>
	 * 取込対象「全件、未処理のみ、エラーのみ」を条件で取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO：取込対象未設定、未処理のみ、エラーのみ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<WProductShapeInput> 商品荷姿マスタ取込ワークリスト
	 */
	public List<WProductShapeInput> selectWork(DataInputDto dataInputDto, ErrorStatus errSts) {

		WProductShapeInputCB wProductShapeInputCB = wProductShapeInputBhv.newConditionBean();

		// 取込対象が未処理かつエラーなしの場合（取込対象が未設定）
		if (dataInputDto.isUnfinishedAndNonError()) {
			wProductShapeInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
			wProductShapeInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
		}
		// 取込対象が未処理のみの場合
		if (dataInputDto.isOnlyUnfinished()) {
			wProductShapeInputCB.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		}
		// 取込対象がエラーのみの場合
		if (dataInputDto.isOnlyError()) {
			wProductShapeInputCB.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
		}
		// 行No.でソート
		wProductShapeInputCB.query().addOrderBy_LineNo_Asc();

		List<WProductShapeInput> lstWProductShapeInput = wProductShapeInputBhv.selectList(wProductShapeInputCB);

		// 取得件数チェック（ゼロ件チェック）
		if (lstWProductShapeInput.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return lstWProductShapeInput;
	}


	/**
	 * <h2>商品荷姿マスタ取込のデータを移行する。</h2>
	 * <pre>
	 * 取込ワークテーブルから移行データを取得し、商品荷姿マスタに登録する。
	 * 上書きの場合、事前に商品荷姿マスタを削除する。
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
		startLog(WmsMessageConst.PRODUCT_SHAPE_INPUT_PROGRAM_NAME_REGISTER_INFORMATION);

		// 商品荷姿マスタ取込ワークテーブルから移行データの取得
		List<WProductShapeInput> lstWProductShapeInputAll = selectWork(dataInputDto, errSts);
		List<WProductShapeInput> lstWProductShapeInput = new ArrayList<WProductShapeInput>();

		if (getErrorManager().size() > 0) {
			endErrorLog();
			return;
		}

		dataInputDto.initProcess(lstWProductShapeInputAll.size());

		// 上書きの場合、事前に削除
		if (dataInputDto.isRewrite()) {
			// 在庫系テーブルの削除
			productShapeInputSubLogic.deleteWithCommit(lstWProductShapeInputAll, errSts);
			if (getErrorManager().size() > 0) {
				endErrorLog();
				return;
			}
		}

		// 商品荷姿マスタ登録を呼出す、商品荷姿マスタ移行を行う
		// 一括コミットの場合
		if (dataInputDto.isCommitAll()) {
			productShapeInputSubLogic.register(dataInputDto, lstWProductShapeInputAll, errSts);
		}
		// 随時コミットの場合
		if (dataInputDto.isCommitBlock()) {
			for (WProductShapeInput wProductShapeInput : lstWProductShapeInputAll) {
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				lstWProductShapeInput.add(wProductShapeInput);
				if (dataInputDto.isOverCommitUnitNum(lstWProductShapeInput.size())) {
					productShapeInputSubLogic.registerWithCommit(dataInputDto, lstWProductShapeInput, errSts);
					lstWProductShapeInput = new ArrayList<WProductShapeInput>();
				}
			}
			if (lstWProductShapeInput.size() > 0) {
				productShapeInputSubLogic.registerWithCommit(dataInputDto, lstWProductShapeInput, errSts);
			}
		}

		// ログ追加
		endLog(dataInputDto);
	}

}
